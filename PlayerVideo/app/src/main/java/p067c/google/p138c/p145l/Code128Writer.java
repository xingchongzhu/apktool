package p067c.google.p138c.p145l;

import java.util.ArrayList;
import java.util.Map;
import p067c.google.p138c.BarcodeFormat;
import p067c.google.p138c.EncodeHintType;
import p067c.google.p138c.WriterException;
import p067c.google.p138c.p141j.BitMatrix;

/* renamed from: c.a.c.l.d */
public final class Code128Writer extends OneDimensionalCodeWriter {

    /* renamed from: c.a.c.l.d$a */
    /* compiled from: Code128Writer */
    private enum C1399a {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    /* renamed from: g */
    private static int m12226g(CharSequence charSequence, int i, int i2) {
        C1399a h;
        C1399a h2 = m12227h(charSequence, i);
        C1399a aVar = C1399a.ONE_DIGIT;
        if (h2 == aVar) {
            return i2 == 101 ? 101 : 100;
        }
        C1399a aVar2 = C1399a.UNCODABLE;
        if (h2 == aVar2) {
            if (i < charSequence.length()) {
                char charAt = charSequence.charAt(i);
                if (charAt < ' ' || (i2 == 101 && (charAt < '`' || (charAt >= 241 && charAt <= 244)))) {
                    return 101;
                }
            }
            return 100;
        } else if (i2 == 101 && h2 == C1399a.FNC_1) {
            return 101;
        } else {
            if (i2 == 99) {
                return 99;
            }
            if (i2 == 100) {
                C1399a aVar3 = C1399a.FNC_1;
                if (h2 == aVar3) {
                    return 100;
                }
                C1399a h3 = m12227h(charSequence, i + 2);
                if (h3 == aVar2 || h3 == aVar) {
                    return 100;
                }
                if (h3 != aVar3) {
                    int i3 = i + 4;
                    while (true) {
                        h = m12227h(charSequence, i3);
                        if (h != C1399a.TWO_DIGITS) {
                            break;
                        }
                        i3 += 2;
                    }
                    if (h == C1399a.ONE_DIGIT) {
                        return 100;
                    }
                    return 99;
                } else if (m12227h(charSequence, i + 3) == C1399a.TWO_DIGITS) {
                    return 99;
                } else {
                    return 100;
                }
            } else {
                if (h2 == C1399a.FNC_1) {
                    h2 = m12227h(charSequence, i + 1);
                }
                if (h2 == C1399a.TWO_DIGITS) {
                    return 99;
                }
                return 100;
            }
        }
    }

    /* renamed from: h */
    private static C1399a m12227h(CharSequence charSequence, int i) {
        int length = charSequence.length();
        if (i >= length) {
            return C1399a.UNCODABLE;
        }
        char charAt = charSequence.charAt(i);
        if (charAt == 241) {
            return C1399a.FNC_1;
        }
        if (charAt < '0' || charAt > '9') {
            return C1399a.UNCODABLE;
        }
        int i2 = i + 1;
        if (i2 >= length) {
            return C1399a.ONE_DIGIT;
        }
        char charAt2 = charSequence.charAt(i2);
        if (charAt2 < '0' || charAt2 > '9') {
            return C1399a.ONE_DIGIT;
        }
        return C1399a.TWO_DIGITS;
    }

    /* renamed from: a */
    public BitMatrix mo8526a(String str, BarcodeFormat aVar, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (aVar == BarcodeFormat.CODE_128) {
            return super.mo8526a(str, aVar, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(aVar)));
    }

    /* renamed from: d */
    public boolean[] mo8634d(String str) {
        int length = str.length();
        if (length <= 0 || length > 80) {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            switch (charAt) {
                case 241:
                case 242:
                case 243:
                case 244:
                    break;
                default:
                    if (charAt <= 127) {
                        break;
                    } else {
                        throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(charAt)));
                    }
            }
        }
        ArrayList<int[]> arrayList = new ArrayList<>();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        while (true) {
            int i7 = 103;
            if (i3 < length) {
                int g = m12226g(str, i3, i5);
                int i8 = 100;
                if (g == i5) {
                    switch (str.charAt(i3)) {
                        case 241:
                            i8 = 102;
                            break;
                        case 242:
                            i8 = 97;
                            break;
                        case 243:
                            i8 = 96;
                            break;
                        case 244:
                            if (i5 == 101) {
                                i8 = 101;
                                break;
                            }
                            break;
                        default:
                            if (i5 != 100) {
                                if (i5 == 101) {
                                    i8 = str.charAt(i3) - ' ';
                                    if (i8 < 0) {
                                        i8 += 96;
                                        break;
                                    }
                                } else {
                                    i8 = Integer.parseInt(str.substring(i3, i3 + 2));
                                    i3++;
                                    break;
                                }
                            } else {
                                i8 = str.charAt(i3) - ' ';
                                break;
                            }
                            break;
                    }
                    i3++;
                } else {
                    if (i5 != 0) {
                        i7 = g;
                    } else if (g == 100) {
                        i7 = 104;
                    } else if (g != 101) {
                        i7 = 105;
                    }
                    i8 = i7;
                    i5 = g;
                }
                arrayList.add(Code128Reader.f10077a[i8]);
                i4 += i8 * i6;
                if (i3 != 0) {
                    i6++;
                }
            } else {
                int i9 = i4 % 103;
                int[][] iArr = Code128Reader.f10077a;
                arrayList.add(iArr[i9]);
                arrayList.add(iArr[106]);
                int i10 = 0;
                for (int[] iArr2 : arrayList) {
                    for (int i11 : (int[]) r13.next()) {
                        i10 += i11;
                    }
                }
                boolean[] zArr = new boolean[i10];
                for (int[] b : arrayList) {
                    i += OneDimensionalCodeWriter.m12245b(zArr, i, b, true);
                }
                return zArr;
            }
        }
    }
}
