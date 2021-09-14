package p067c.google.p138c.p145l;

import java.util.Map;
import p067c.google.p138c.BarcodeFormat;
import p067c.google.p138c.EncodeHintType;
import p067c.google.p138c.WriterException;
import p067c.google.p138c.p141j.BitMatrix;

/* renamed from: c.a.c.l.h */
public class Code93Writer extends OneDimensionalCodeWriter {
    /* renamed from: g */
    private static int m12234g(boolean[] zArr, int i, int i2) {
        for (int i3 = 0; i3 < 9; i3++) {
            boolean z = true;
            int i4 = i + i3;
            if (((1 << (8 - i3)) & i2) == 0) {
                z = false;
            }
            zArr[i4] = z;
        }
        return 9;
    }

    /* renamed from: h */
    private static int m12235h(String str, int i) {
        int i2 = 0;
        int i3 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i2 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i3;
            i3++;
            if (i3 > i) {
                i3 = 1;
            }
        }
        return i2 % 47;
    }

    /* renamed from: i */
    static String m12236i(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length << 1);
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == 0) {
                sb.append("bU");
            } else if (charAt <= 26) {
                sb.append('a');
                sb.append((char) ((charAt + 'A') - 1));
            } else if (charAt <= 31) {
                sb.append('b');
                sb.append((char) ((charAt + 'A') - 27));
            } else if (charAt == ' ' || charAt == '$' || charAt == '%' || charAt == '+') {
                sb.append(charAt);
            } else if (charAt <= ',') {
                sb.append('c');
                sb.append((char) ((charAt + 'A') - 33));
            } else if (charAt <= '9') {
                sb.append(charAt);
            } else if (charAt == ':') {
                sb.append("cZ");
            } else if (charAt <= '?') {
                sb.append('b');
                sb.append((char) ((charAt + 'F') - 59));
            } else if (charAt == '@') {
                sb.append("bV");
            } else if (charAt <= 'Z') {
                sb.append(charAt);
            } else if (charAt <= '_') {
                sb.append('b');
                sb.append((char) ((charAt + 'K') - 91));
            } else if (charAt == '`') {
                sb.append("bW");
            } else if (charAt <= 'z') {
                sb.append('d');
                sb.append((char) ((charAt + 'A') - 97));
            } else if (charAt <= 127) {
                sb.append('b');
                sb.append((char) ((charAt + 'P') - 123));
            } else {
                StringBuilder sb2 = new StringBuilder("Requested content contains a non-encodable character: '");
                sb2.append(charAt);
                sb2.append("'");
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public BitMatrix mo8526a(String str, BarcodeFormat aVar, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (aVar == BarcodeFormat.CODE_93) {
            return super.mo8526a(str, aVar, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(String.valueOf(aVar)));
    }

    /* renamed from: d */
    public boolean[] mo8634d(String str) {
        String i = m12236i(str);
        int length = i.length();
        if (length <= 80) {
            boolean[] zArr = new boolean[(((i.length() + 2 + 2) * 9) + 1)];
            int i2 = 0;
            int g = m12234g(zArr, 0, Code93Reader.f10086c);
            while (true) {
                String str2 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*";
                if (i2 < length) {
                    g += m12234g(zArr, g, Code93Reader.f10085b[str2.indexOf(i.charAt(i2))]);
                    i2++;
                } else {
                    int h = m12235h(i, 20);
                    int[] iArr = Code93Reader.f10085b;
                    int g2 = g + m12234g(zArr, g, iArr[h]);
                    StringBuilder sb = new StringBuilder();
                    sb.append(i);
                    sb.append(str2.charAt(h));
                    int g3 = g2 + m12234g(zArr, g2, iArr[m12235h(sb.toString(), 15)]);
                    zArr[g3 + m12234g(zArr, g3, Code93Reader.f10086c)] = true;
                    return zArr;
                }
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long after converting to extended encoding, but got ".concat(String.valueOf(length)));
        }
    }
}
