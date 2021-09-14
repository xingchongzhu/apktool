package p067c.google.p138c.p143k.p144b;

/* renamed from: c.a.c.k.b.n */
final class X12Encoder extends C40Encoder {
    X12Encoder() {
    }

    /* renamed from: a */
    public void mo8597a(EncoderContext hVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!hVar.mo8615i()) {
                break;
            }
            char c = hVar.mo8610c();
            hVar.f10048f++;
            mo8600c(c, sb);
            if (sb.length() % 3 == 0) {
                C40Encoder.m12146g(hVar, sb);
                if (C1398j.m12204n(hVar.mo8611d(), hVar.f10048f, mo8601e()) != mo8601e()) {
                    hVar.mo8621o(0);
                    break;
                }
            }
        }
        mo8602f(hVar, sb);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo8600c(char c, StringBuilder sb) {
        if (c == 13) {
            sb.append(0);
        } else if (c == ' ') {
            sb.append(3);
        } else if (c == '*') {
            sb.append(1);
        } else if (c == '>') {
            sb.append(2);
        } else if (c >= '0' && c <= '9') {
            sb.append((char) ((c - '0') + 4));
        } else if (c < 'A' || c > 'Z') {
            C1398j.m12195e(c);
        } else {
            sb.append((char) ((c - 'A') + 14));
        }
        return 1;
    }

    /* renamed from: e */
    public int mo8601e() {
        return 3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo8602f(EncoderContext hVar, StringBuilder sb) {
        hVar.mo8622p();
        int a = hVar.mo8614g().mo8626a() - hVar.mo8608a();
        hVar.f10048f -= sb.length();
        if (hVar.mo8613f() > 1 || a > 1 || hVar.mo8613f() != a) {
            hVar.mo8624r(254);
        }
        if (hVar.mo8612e() < 0) {
            hVar.mo8621o(0);
        }
    }
}
