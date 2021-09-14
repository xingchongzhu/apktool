package p067c.google.p138c.p143k.p144b;

import java.util.Arrays;
import p067c.google.p138c.Dimension;

/* renamed from: c.a.c.k.b.j */
/* compiled from: HighLevelEncoder */
public final class C1398j {
    /* renamed from: a */
    public static int m12191a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        if (i < length) {
            char charAt = charSequence.charAt(i);
            while (m12196f(charAt) && i < length) {
                i2++;
                i++;
                if (i < length) {
                    charAt = charSequence.charAt(i);
                }
            }
        }
        return i2;
    }

    /* renamed from: b */
    public static String m12192b(String str, SymbolShapeHint lVar, Dimension bVar, Dimension bVar2) {
        int i = 0;
        C1397g[] gVarArr = {new ASCIIEncoder(), new C40Encoder(), new TextEncoder(), new X12Encoder(), new EdifactEncoder(), new Base256Encoder()};
        EncoderContext hVar = new EncoderContext(str);
        hVar.mo8620n(lVar);
        hVar.mo8618l(bVar, bVar2);
        String str2 = "\u001e\u0004";
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith(str2)) {
            hVar.mo8624r(236);
            hVar.mo8619m(2);
            hVar.f10048f += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith(str2)) {
            hVar.mo8624r(237);
            hVar.mo8619m(2);
            hVar.f10048f += 7;
        }
        while (hVar.mo8615i()) {
            gVarArr[i].mo8597a(hVar);
            if (hVar.mo8612e() >= 0) {
                i = hVar.mo8612e();
                hVar.mo8616j();
            }
        }
        int a = hVar.mo8608a();
        hVar.mo8622p();
        int a2 = hVar.mo8614g().mo8626a();
        if (!(a >= a2 || i == 0 || i == 5 || i == 4)) {
            hVar.mo8624r(254);
        }
        StringBuilder b = hVar.mo8609b();
        if (b.length() < a2) {
            b.append(129);
        }
        while (b.length() < a2) {
            b.append(m12205o(129, b.length() + 1));
        }
        return hVar.mo8609b().toString();
    }

    /* renamed from: c */
    private static int m12193c(float[] fArr, int[] iArr, int i, byte[] bArr) {
        Arrays.fill(bArr, 0);
        for (int i2 = 0; i2 < 6; i2++) {
            iArr[i2] = (int) Math.ceil((double) fArr[i2]);
            int i3 = iArr[i2];
            if (i > i3) {
                Arrays.fill(bArr, 0);
                i = i3;
            }
            if (i == i3) {
                bArr[i2] = (byte) (bArr[i2] + 1);
            }
        }
        return i;
    }

    /* renamed from: d */
    private static int m12194d(byte[] bArr) {
        int i = 0;
        for (int i2 = 0; i2 < 6; i2++) {
            i += bArr[i2];
        }
        return i;
    }

    /* renamed from: e */
    static void m12195e(char c) {
        String hexString = Integer.toHexString(c);
        StringBuilder sb = new StringBuilder();
        sb.append("0000".substring(0, 4 - hexString.length()));
        sb.append(hexString);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder("Illegal character: ");
        sb3.append(c);
        sb3.append(" (0x");
        sb3.append(sb2);
        sb3.append(')');
        throw new IllegalArgumentException(sb3.toString());
    }

    /* renamed from: f */
    static boolean m12196f(char c) {
        return c >= '0' && c <= '9';
    }

    /* renamed from: g */
    static boolean m12197g(char c) {
        return c >= 128 && c <= 255;
    }

    /* renamed from: h */
    private static boolean m12198h(char c) {
        return c == ' ' || (c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z');
    }

    /* renamed from: i */
    private static boolean m12199i(char c) {
        return c >= ' ' && c <= '^';
    }

    /* renamed from: j */
    private static boolean m12200j(char c) {
        return c == ' ' || (c >= '0' && c <= '9') || (c >= 'a' && c <= 'z');
    }

    /* renamed from: k */
    private static boolean m12201k(char c) {
        return m12203m(c) || c == ' ' || (c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z');
    }

    /* renamed from: l */
    private static boolean m12202l(char c) {
        return false;
    }

    /* renamed from: m */
    private static boolean m12203m(char c) {
        return c == 13 || c == '*' || c == '>';
    }

    /* renamed from: n */
    static int m12204n(CharSequence charSequence, int i, int i2) {
        float[] fArr;
        char c;
        CharSequence charSequence2 = charSequence;
        int i3 = i;
        if (i3 >= charSequence.length()) {
            return i2;
        }
        if (i2 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[]{1.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.25f};
            fArr[i2] = 0.0f;
        }
        int i4 = 0;
        while (true) {
            int i5 = i3 + i4;
            if (i5 == charSequence.length()) {
                byte[] bArr = new byte[6];
                int[] iArr = new int[6];
                int c2 = m12193c(fArr, iArr, Integer.MAX_VALUE, bArr);
                int d = m12194d(bArr);
                if (iArr[0] == c2) {
                    return 0;
                }
                if (d == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (d == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (d != 1 || bArr[2] <= 0) {
                    return (d != 1 || bArr[3] <= 0) ? 1 : 3;
                }
                return 2;
            }
            char charAt = charSequence2.charAt(i5);
            i4++;
            if (m12196f(charAt)) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (m12197g(charAt)) {
                fArr[0] = (float) Math.ceil((double) fArr[0]);
                fArr[0] = fArr[0] + 2.0f;
            } else {
                fArr[0] = (float) Math.ceil((double) fArr[0]);
                fArr[0] = fArr[0] + 1.0f;
            }
            if (m12198h(charAt)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (m12197g(charAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (m12200j(charAt)) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (m12197g(charAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (m12201k(charAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (m12197g(charAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (m12199i(charAt)) {
                fArr[4] = fArr[4] + 0.75f;
            } else if (m12197g(charAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            if (m12202l(charAt)) {
                c = 5;
                fArr[5] = fArr[5] + 4.0f;
            } else {
                c = 5;
                fArr[5] = fArr[5] + 1.0f;
            }
            if (i4 >= 4) {
                int[] iArr2 = new int[6];
                byte[] bArr2 = new byte[6];
                m12193c(fArr, iArr2, Integer.MAX_VALUE, bArr2);
                int d2 = m12194d(bArr2);
                if (iArr2[0] < iArr2[c] && iArr2[0] < iArr2[1] && iArr2[0] < iArr2[2] && iArr2[0] < iArr2[3] && iArr2[0] < iArr2[4]) {
                    return 0;
                }
                if (iArr2[5] >= iArr2[0] && bArr2[1] + bArr2[2] + bArr2[3] + bArr2[4] != 0) {
                    if (d2 == 1 && bArr2[4] > 0) {
                        return 4;
                    }
                    if (d2 == 1 && bArr2[2] > 0) {
                        return 2;
                    }
                    if (d2 == 1 && bArr2[3] > 0) {
                        return 3;
                    }
                    if (iArr2[1] + 1 < iArr2[0] && iArr2[1] + 1 < iArr2[5] && iArr2[1] + 1 < iArr2[4] && iArr2[1] + 1 < iArr2[2]) {
                        if (iArr2[1] < iArr2[3]) {
                            return 1;
                        }
                        if (iArr2[1] == iArr2[3]) {
                            int i6 = i3 + i4 + 1;
                            while (i6 < charSequence.length()) {
                                char charAt2 = charSequence2.charAt(i6);
                                if (!m12203m(charAt2)) {
                                    if (!m12201k(charAt2)) {
                                        break;
                                    }
                                    i6++;
                                } else {
                                    return 3;
                                }
                            }
                            return 1;
                        }
                    }
                }
            }
        }
        return 5;
    }

    /* renamed from: o */
    private static char m12205o(char c, int i) {
        int i2 = c + ((i * 149) % 253) + 1;
        if (i2 > 254) {
            i2 -= 254;
        }
        return (char) i2;
    }
}
