package p067c.p068a.p138c.p145l;

import com.fasterxml.jackson.core.JsonPointer;

/* renamed from: c.a.c.l.b */
public final class CodaBarWriter extends OneDimensionalCodeWriter {

    /* renamed from: b */
    private static final char[] f10073b;

    /* renamed from: c */
    private static final char[] f10074c = {'T', 'N', '*', 'E'};

    /* renamed from: d */
    private static final char[] f10075d = {JsonPointer.SEPARATOR, ':', '+', '.'};

    /* renamed from: e */
    private static final char f10076e;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f10073b = cArr;
        f10076e = cArr[0];
    }

    /* renamed from: d */
    public boolean[] mo8634d(String str) {
        int i;
        if (str.length() < 2) {
            StringBuilder sb = new StringBuilder();
            char c = f10076e;
            sb.append(c);
            sb.append(str);
            sb.append(c);
            str = sb.toString();
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = f10073b;
            boolean a = CodaBarReader.m12224a(cArr, upperCase);
            boolean a2 = CodaBarReader.m12224a(cArr, upperCase2);
            char[] cArr2 = f10074c;
            boolean a3 = CodaBarReader.m12224a(cArr2, upperCase);
            boolean a4 = CodaBarReader.m12224a(cArr2, upperCase2);
            String str2 = "Invalid start/end guards: ";
            if (a) {
                if (!a2) {
                    throw new IllegalArgumentException(str2.concat(str));
                }
            } else if (a3) {
                if (!a4) {
                    throw new IllegalArgumentException(str2.concat(str));
                }
            } else if (a2 || a4) {
                throw new IllegalArgumentException(str2.concat(str));
            } else {
                StringBuilder sb2 = new StringBuilder();
                char c2 = f10076e;
                sb2.append(c2);
                sb2.append(str);
                sb2.append(c2);
                str = sb2.toString();
            }
        }
        int i2 = 20;
        for (int i3 = 1; i3 < str.length() - 1; i3++) {
            if (Character.isDigit(str.charAt(i3)) || str.charAt(i3) == '-' || str.charAt(i3) == '$') {
                i2 += 9;
            } else if (CodaBarReader.m12224a(f10075d, str.charAt(i3))) {
                i2 += 10;
            } else {
                StringBuilder sb3 = new StringBuilder("Cannot encode : '");
                sb3.append(str.charAt(i3));
                sb3.append('\'');
                throw new IllegalArgumentException(sb3.toString());
            }
        }
        boolean[] zArr = new boolean[(i2 + (str.length() - 1))];
        int i4 = 0;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i5));
            if (i5 == 0 || i5 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i6 = 0;
            while (true) {
                char[] cArr3 = CodaBarReader.f10070a;
                if (i6 >= cArr3.length) {
                    i = 0;
                    break;
                } else if (upperCase3 == cArr3[i6]) {
                    i = CodaBarReader.f10071b[i6];
                    break;
                } else {
                    i6++;
                }
            }
            int i7 = 0;
            boolean z = true;
            while (true) {
                int i8 = 0;
                while (i7 < 7) {
                    zArr[i4] = z;
                    i4++;
                    if (((i >> (6 - i7)) & 1) == 0 || i8 == 1) {
                        z = !z;
                        i7++;
                    } else {
                        i8++;
                    }
                }
                break;
            }
            if (i5 < str.length() - 1) {
                zArr[i4] = false;
                i4++;
            }
        }
        return zArr;
    }
}
