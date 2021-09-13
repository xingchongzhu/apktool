package p067c.p068a.p138c.p143k.p144b;

/* renamed from: c.a.c.k.b.b */
final class Base256Encoder implements C1397g {
    Base256Encoder() {
    }

    /* renamed from: c */
    private static char m12141c(char c, int i) {
        int i2 = c + ((i * 149) % 255) + 1;
        return i2 <= 255 ? (char) i2 : (char) (i2 - 256);
    }

    /* renamed from: a */
    public void mo8597a(EncoderContext hVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(0);
        while (true) {
            if (!hVar.mo8615i()) {
                break;
            }
            sb.append(hVar.mo8610c());
            hVar.f10048f++;
            if (C1398j.m12204n(hVar.mo8611d(), hVar.f10048f, mo8599b()) != mo8599b()) {
                hVar.mo8621o(0);
                break;
            }
        }
        int length = sb.length() - 1;
        int a = hVar.mo8608a() + length + 1;
        hVar.mo8623q(a);
        boolean z = hVar.mo8614g().mo8626a() - a > 0;
        if (hVar.mo8615i() || z) {
            if (length <= 249) {
                sb.setCharAt(0, (char) length);
            } else if (length <= 1555) {
                sb.setCharAt(0, (char) ((length / 250) + 249));
                sb.insert(1, (char) (length % 250));
            } else {
                throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
            }
        }
        int length2 = sb.length();
        for (int i = 0; i < length2; i++) {
            hVar.mo8624r(m12141c(sb.charAt(i), hVar.mo8608a() + 1));
        }
    }

    /* renamed from: b */
    public int mo8599b() {
        return 5;
    }
}
