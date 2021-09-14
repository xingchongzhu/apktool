package p067c.google.p138c.p145l;

import java.util.Map;
import p067c.google.p138c.BarcodeFormat;
import p067c.google.p138c.EncodeHintType;
import p067c.google.p138c.WriterException;
import p067c.google.p138c.p141j.BitMatrix;

/* renamed from: c.a.c.l.l */
public final class ITFWriter extends OneDimensionalCodeWriter {

    /* renamed from: b */
    private static final int[] f10088b = {1, 1, 1, 1};

    /* renamed from: c */
    private static final int[] f10089c = {3, 1, 1};

    /* renamed from: d */
    private static final int[][] f10090d = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: a */
    public BitMatrix mo8526a(String str, BarcodeFormat aVar, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (aVar == BarcodeFormat.ITF) {
            return super.mo8526a(str, aVar, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode ITF, but got ".concat(String.valueOf(aVar)));
    }

    /* renamed from: d */
    public boolean[] mo8634d(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("The length of the input should be even");
        } else if (length <= 80) {
            OneDimensionalCodeWriter.m12246c(str);
            boolean[] zArr = new boolean[((length * 9) + 9)];
            int b = OneDimensionalCodeWriter.m12245b(zArr, 0, f10088b, true);
            for (int i = 0; i < length; i += 2) {
                int digit = Character.digit(str.charAt(i), 10);
                int digit2 = Character.digit(str.charAt(i + 1), 10);
                int[] iArr = new int[10];
                for (int i2 = 0; i2 < 5; i2++) {
                    int i3 = i2 * 2;
                    int[][] iArr2 = f10090d;
                    iArr[i3] = iArr2[digit][i2];
                    iArr[i3 + 1] = iArr2[digit2][i2];
                }
                b += OneDimensionalCodeWriter.m12245b(zArr, b, iArr, true);
            }
            OneDimensionalCodeWriter.m12245b(zArr, b, f10089c, true);
            return zArr;
        } else {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
    }
}
