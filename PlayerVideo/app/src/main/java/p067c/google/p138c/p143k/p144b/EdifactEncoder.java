package p067c.google.p138c.p143k.p144b;

/* renamed from: c.a.c.k.b.f */
final class EdifactEncoder implements C1397g {
    EdifactEncoder() {
    }

    /* renamed from: b */
    private static void m12163b(char c, StringBuilder sb) {
        if (c >= ' ' && c <= '?') {
            sb.append(c);
        } else if (c < '@' || c > '^') {
            C1398j.m12195e(c);
        } else {
            sb.append((char) (c - '@'));
        }
    }

    /* renamed from: c */
    private static String m12164c(CharSequence charSequence, int i) {
        int length = charSequence.length() - i;
        if (length != 0) {
            char charAt = charSequence.charAt(i);
            char c = 0;
            char charAt2 = length >= 2 ? charSequence.charAt(i + 1) : 0;
            char charAt3 = length >= 3 ? charSequence.charAt(i + 2) : 0;
            if (length >= 4) {
                c = charSequence.charAt(i + 3);
            }
            int i2 = (charAt << 18) + (charAt2 << 12) + (charAt3 << 6) + c;
            char c2 = (char) ((i2 >> 16) & 255);
            char c3 = (char) ((i2 >> 8) & 255);
            char c4 = (char) (i2 & 255);
            StringBuilder sb = new StringBuilder(3);
            sb.append(c2);
            if (length >= 2) {
                sb.append(c3);
            }
            if (length >= 3) {
                sb.append(c4);
            }
            return sb.toString();
        }
        throw new IllegalStateException("StringBuilder must not be empty");
    }

    /* renamed from: e */
    private static void m12165e(EncoderContext hVar, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length != 0) {
                boolean z = true;
                if (length == 1) {
                    hVar.mo8622p();
                    int a = hVar.mo8614g().mo8626a() - hVar.mo8608a();
                    int f = hVar.mo8613f();
                    if (f > a) {
                        hVar.mo8623q(hVar.mo8608a() + 1);
                        a = hVar.mo8614g().mo8626a() - hVar.mo8608a();
                    }
                    if (f <= a && a <= 2) {
                        hVar.mo8621o(0);
                        return;
                    }
                }
                if (length <= 4) {
                    int i = length - 1;
                    String c = m12164c(charSequence, 0);
                    if (!(!hVar.mo8615i()) || i > 2) {
                        z = false;
                    }
                    if (i <= 2) {
                        hVar.mo8623q(hVar.mo8608a() + i);
                        if (hVar.mo8614g().mo8626a() - hVar.mo8608a() >= 3) {
                            hVar.mo8623q(hVar.mo8608a() + c.length());
                            z = false;
                        }
                    }
                    if (z) {
                        hVar.mo8617k();
                        hVar.f10048f -= i;
                    } else {
                        hVar.mo8625s(c);
                    }
                    hVar.mo8621o(0);
                    return;
                }
                throw new IllegalStateException("Count must not exceed 4");
            }
        } finally {
            hVar.mo8621o(0);
        }
    }

    /* renamed from: a */
    public void mo8597a(EncoderContext hVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!hVar.mo8615i()) {
                break;
            }
            m12163b(hVar.mo8610c(), sb);
            hVar.f10048f++;
            if (sb.length() >= 4) {
                hVar.mo8625s(m12164c(sb, 0));
                sb.delete(0, 4);
                if (C1398j.m12204n(hVar.mo8611d(), hVar.f10048f, mo8607d()) != mo8607d()) {
                    hVar.mo8621o(0);
                    break;
                }
            }
        }
        sb.append(31);
        m12165e(hVar, sb);
    }

    /* renamed from: d */
    public int mo8607d() {
        return 4;
    }
}
