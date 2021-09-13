package p067c.p068a.p138c.p145l;

import com.fasterxml.jackson.core.JsonPointer;
import java.util.Map;
import p067c.p068a.p138c.BarcodeFormat;
import p067c.p068a.p138c.EncodeHintType;
import p067c.p068a.p138c.WriterException;
import p067c.p068a.p138c.p141j.BitMatrix;

/* renamed from: c.a.c.l.f */
public final class Code39Writer extends OneDimensionalCodeWriter {
    /* renamed from: g */
    private static void m12230g(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) != 0) {
                i3 = 2;
            }
            iArr[i2] = i3;
        }
    }

    /* renamed from: h */
    private static String m12231h(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != 0) {
                if (charAt != ' ') {
                    if (charAt == '@') {
                        sb.append("%V");
                    } else if (charAt == '`') {
                        sb.append("%W");
                    } else if (!(charAt == '-' || charAt == '.')) {
                        if (charAt <= 26) {
                            sb.append('$');
                            sb.append((char) ((charAt - 1) + 65));
                        } else if (charAt < ' ') {
                            sb.append('%');
                            sb.append((char) ((charAt - 27) + 65));
                        } else if (charAt <= ',' || charAt == '/' || charAt == ':') {
                            sb.append(JsonPointer.SEPARATOR);
                            sb.append((char) ((charAt - '!') + 65));
                        } else if (charAt <= '9') {
                            sb.append((char) ((charAt - '0') + 48));
                        } else if (charAt <= '?') {
                            sb.append('%');
                            sb.append((char) ((charAt - ';') + 70));
                        } else if (charAt <= 'Z') {
                            sb.append((char) ((charAt - 'A') + 65));
                        } else if (charAt <= '_') {
                            sb.append('%');
                            sb.append((char) ((charAt - '[') + 75));
                        } else if (charAt <= 'z') {
                            sb.append('+');
                            sb.append((char) ((charAt - 'a') + 65));
                        } else if (charAt <= 127) {
                            sb.append('%');
                            sb.append((char) ((charAt - '{') + 80));
                        } else {
                            StringBuilder sb2 = new StringBuilder("Requested content contains a non-encodable character: '");
                            sb2.append(str.charAt(i));
                            sb2.append("'");
                            throw new IllegalArgumentException(sb2.toString());
                        }
                    }
                }
                sb.append(charAt);
            } else {
                sb.append("%U");
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public BitMatrix mo8526a(String str, BarcodeFormat aVar, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (aVar == BarcodeFormat.CODE_39) {
            return super.mo8526a(str, aVar, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(String.valueOf(aVar)));
    }

    /* renamed from: d */
    public boolean[] mo8634d(String str) {
        String str2;
        int length = str.length();
        String str3 = "Requested contents should be less than 80 digits long, but got ";
        if (length <= 80) {
            int i = 0;
            while (true) {
                str2 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%";
                if (i >= length) {
                    break;
                } else if (str2.indexOf(str.charAt(i)) < 0) {
                    str = m12231h(str);
                    length = str.length();
                    if (length > 80) {
                        StringBuilder sb = new StringBuilder(str3);
                        sb.append(length);
                        sb.append(" (extended full ASCII mode)");
                        throw new IllegalArgumentException(sb.toString());
                    }
                } else {
                    i++;
                }
            }
            int[] iArr = new int[9];
            boolean[] zArr = new boolean[((length * 13) + 25)];
            m12230g(148, iArr);
            int b = OneDimensionalCodeWriter.m12245b(zArr, 0, iArr, true);
            int[] iArr2 = {1};
            int b2 = b + OneDimensionalCodeWriter.m12245b(zArr, b, iArr2, false);
            for (int i2 = 0; i2 < length; i2++) {
                m12230g(Code39Reader.f10083a[str2.indexOf(str.charAt(i2))], iArr);
                int b3 = b2 + OneDimensionalCodeWriter.m12245b(zArr, b2, iArr, true);
                b2 = b3 + OneDimensionalCodeWriter.m12245b(zArr, b3, iArr2, false);
            }
            m12230g(148, iArr);
            OneDimensionalCodeWriter.m12245b(zArr, b2, iArr, true);
            return zArr;
        }
        throw new IllegalArgumentException(str3.concat(String.valueOf(length)));
    }
}
