package p067c.p068a.p138c.p143k.p144b;

/* renamed from: c.a.c.k.b.a */
final class ASCIIEncoder implements C1397g {
    ASCIIEncoder() {
    }

    /* renamed from: b */
    private static char m12138b(char c, char c2) {
        if (C1398j.m12196f(c) && C1398j.m12196f(c2)) {
            return (char) (((c - '0') * 10) + (c2 - '0') + 130);
        }
        StringBuilder sb = new StringBuilder("not digits: ");
        sb.append(c);
        sb.append(c2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public void mo8597a(EncoderContext hVar) {
        if (C1398j.m12191a(hVar.mo8611d(), hVar.f10048f) >= 2) {
            hVar.mo8624r(m12138b(hVar.mo8611d().charAt(hVar.f10048f), hVar.mo8611d().charAt(hVar.f10048f + 1)));
            hVar.f10048f += 2;
            return;
        }
        char c = hVar.mo8610c();
        int n = C1398j.m12204n(hVar.mo8611d(), hVar.f10048f, mo8598c());
        if (n != mo8598c()) {
            if (n == 1) {
                hVar.mo8624r(230);
                hVar.mo8621o(1);
            } else if (n == 2) {
                hVar.mo8624r(239);
                hVar.mo8621o(2);
            } else if (n == 3) {
                hVar.mo8624r(238);
                hVar.mo8621o(3);
            } else if (n == 4) {
                hVar.mo8624r(240);
                hVar.mo8621o(4);
            } else if (n == 5) {
                hVar.mo8624r(231);
                hVar.mo8621o(5);
            } else {
                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(n)));
            }
        } else if (C1398j.m12197g(c)) {
            hVar.mo8624r(235);
            hVar.mo8624r((char) ((c - 128) + 1));
            hVar.f10048f++;
        } else {
            hVar.mo8624r((char) (c + 1));
            hVar.f10048f++;
        }
    }

    /* renamed from: c */
    public int mo8598c() {
        return 0;
    }
}
