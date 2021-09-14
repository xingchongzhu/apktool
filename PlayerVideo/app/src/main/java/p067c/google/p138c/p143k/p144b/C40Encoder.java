package p067c.google.p138c.p143k.p144b;

import com.crashsdk.export.LogType;

/* renamed from: c.a.c.k.b.c */
class C40Encoder implements C1397g {
    C40Encoder() {
    }

    /* renamed from: b */
    private int m12144b(EncoderContext hVar, StringBuilder sb, StringBuilder sb2, int i) {
        int length = sb.length();
        sb.delete(length - i, length);
        hVar.f10048f--;
        int c = mo8600c(hVar.mo8610c(), sb2);
        hVar.mo8617k();
        return c;
    }

    /* renamed from: d */
    private static String m12145d(CharSequence charSequence, int i) {
        int charAt = (charSequence.charAt(i) * 1600) + (charSequence.charAt(i + 1) * '(') + charSequence.charAt(i + 2) + 1;
        return new String(new char[]{(char) (charAt / LogType.UNEXP), (char) (charAt % LogType.UNEXP)});
    }

    /* renamed from: g */
    static void m12146g(EncoderContext hVar, StringBuilder sb) {
        hVar.mo8625s(m12145d(sb, 0));
        sb.delete(0, 3);
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
            int c2 = mo8600c(c, sb);
            int a = hVar.mo8608a() + ((sb.length() / 3) << 1);
            hVar.mo8623q(a);
            int a2 = hVar.mo8614g().mo8626a() - a;
            if (hVar.mo8615i()) {
                if (sb.length() % 3 == 0 && C1398j.m12204n(hVar.mo8611d(), hVar.f10048f, mo8601e()) != mo8601e()) {
                    hVar.mo8621o(0);
                    break;
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && a2 != 2) {
                    c2 = m12144b(hVar, sb, sb2, c2);
                }
                while (sb.length() % 3 == 1 && (c2 > 3 || a2 != 1)) {
                    c2 = m12144b(hVar, sb, sb2, c2);
                }
            }
        }
        mo8602f(hVar, sb);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo8600c(char c, StringBuilder sb) {
        if (c == ' ') {
            sb.append(3);
            return 1;
        } else if (c >= '0' && c <= '9') {
            sb.append((char) ((c - '0') + 4));
            return 1;
        } else if (c >= 'A' && c <= 'Z') {
            sb.append((char) ((c - 'A') + 14));
            return 1;
        } else if (c < ' ') {
            sb.append(0);
            sb.append(c);
            return 2;
        } else if (c <= '/') {
            sb.append(1);
            sb.append((char) (c - '!'));
            return 2;
        } else if (c <= '@') {
            sb.append(1);
            sb.append((char) ((c - ':') + 15));
            return 2;
        } else if (c <= '_') {
            sb.append(1);
            sb.append((char) ((c - '[') + 22));
            return 2;
        } else if (c <= 127) {
            sb.append(2);
            sb.append((char) (c - '`'));
            return 2;
        } else {
            sb.append("\u0001\u001e");
            return mo8600c((char) (c - 128), sb) + 2;
        }
    }

    /* renamed from: e */
    public int mo8601e() {
        return 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo8602f(EncoderContext hVar, StringBuilder sb) {
        int length = sb.length() % 3;
        int a = hVar.mo8608a() + ((sb.length() / 3) << 1);
        hVar.mo8623q(a);
        int a2 = hVar.mo8614g().mo8626a() - a;
        if (length == 2) {
            sb.append(0);
            while (sb.length() >= 3) {
                m12146g(hVar, sb);
            }
            if (hVar.mo8615i()) {
                hVar.mo8624r(254);
            }
        } else if (a2 == 1 && length == 1) {
            while (sb.length() >= 3) {
                m12146g(hVar, sb);
            }
            if (hVar.mo8615i()) {
                hVar.mo8624r(254);
            }
            hVar.f10048f--;
        } else if (length == 0) {
            while (sb.length() >= 3) {
                m12146g(hVar, sb);
            }
            if (a2 > 0 || hVar.mo8615i()) {
                hVar.mo8624r(254);
            }
        } else {
            throw new IllegalStateException("Unexpected case. Please report!");
        }
        hVar.mo8621o(0);
    }
}
