package p067c.p068a.p138c.p145l;

import java.util.Map;
import java.util.regex.Pattern;
import p067c.p068a.p138c.BarcodeFormat;
import p067c.p068a.p138c.EncodeHintType;
import p067c.p068a.p138c.Writer;
import p067c.p068a.p138c.WriterException;
import p067c.p068a.p138c.p141j.BitMatrix;

/* renamed from: c.a.c.l.n */
public abstract class OneDimensionalCodeWriter implements Writer {

    /* renamed from: a */
    private static final Pattern f10091a = Pattern.compile("[0-9]+");

    /* renamed from: b */
    protected static int m12245b(boolean[] zArr, int i, int[] iArr, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            int i4 = 0;
            while (i4 < i3) {
                int i5 = i + 1;
                zArr[i] = z;
                i4++;
                i = i5;
            }
            i2 += i3;
            z = !z;
        }
        return i2;
    }

    /* renamed from: c */
    protected static void m12246c(String str) {
        if (!f10091a.matcher(str).matches()) {
            throw new IllegalArgumentException("Input should only contain digits 0-9");
        }
    }

    /* renamed from: f */
    private static BitMatrix m12247f(boolean[] zArr, int i, int i2, int i3) {
        int length = zArr.length;
        int i4 = i3 + length;
        int max = Math.max(i, i4);
        int max2 = Math.max(1, i2);
        int i5 = max / i4;
        int i6 = (max - (length * i5)) / 2;
        BitMatrix bVar = new BitMatrix(max, max2);
        int i7 = 0;
        while (i7 < length) {
            if (zArr[i7]) {
                bVar.mo8574h(i6, 0, i5, max2);
            }
            i7++;
            i6 += i5;
        }
        return bVar;
    }

    /* renamed from: a */
    public BitMatrix mo8526a(String str, BarcodeFormat aVar, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (i < 0 || i2 < 0) {
            StringBuilder sb = new StringBuilder("Negative size is not allowed. Input: ");
            sb.append(i);
            sb.append('x');
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else {
            int e = mo8635e();
            if (map != null) {
                EncodeHintType cVar = EncodeHintType.MARGIN;
                if (map.containsKey(cVar)) {
                    e = Integer.parseInt(map.get(cVar).toString());
                }
            }
            return m12247f(mo8634d(str), i, i2, e);
        }
    }

    /* renamed from: d */
    public abstract boolean[] mo8634d(String str);

    /* renamed from: e */
    public int mo8635e() {
        return 10;
    }
}
