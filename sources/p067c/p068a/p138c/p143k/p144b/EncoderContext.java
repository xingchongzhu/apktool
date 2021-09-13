package p067c.p068a.p138c.p143k.p144b;

import java.nio.charset.StandardCharsets;
import p067c.p068a.p138c.Dimension;

/* renamed from: c.a.c.k.b.h */
final class EncoderContext {

    /* renamed from: a */
    private final String f10043a;

    /* renamed from: b */
    private SymbolShapeHint f10044b;

    /* renamed from: c */
    private Dimension f10045c;

    /* renamed from: d */
    private Dimension f10046d;

    /* renamed from: e */
    private final StringBuilder f10047e;

    /* renamed from: f */
    int f10048f;

    /* renamed from: g */
    private int f10049g;

    /* renamed from: h */
    private SymbolInfo f10050h;

    /* renamed from: i */
    private int f10051i;

    EncoderContext(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        int i = 0;
        while (i < length) {
            char c = (char) (bytes[i] & 255);
            if (c != '?' || str.charAt(i) == '?') {
                sb.append(c);
                i++;
            } else {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
        }
        this.f10043a = sb.toString();
        this.f10044b = SymbolShapeHint.FORCE_NONE;
        this.f10047e = new StringBuilder(str.length());
        this.f10049g = -1;
    }

    /* renamed from: h */
    private int m12169h() {
        return this.f10043a.length() - this.f10051i;
    }

    /* renamed from: a */
    public int mo8608a() {
        return this.f10047e.length();
    }

    /* renamed from: b */
    public StringBuilder mo8609b() {
        return this.f10047e;
    }

    /* renamed from: c */
    public char mo8610c() {
        return this.f10043a.charAt(this.f10048f);
    }

    /* renamed from: d */
    public String mo8611d() {
        return this.f10043a;
    }

    /* renamed from: e */
    public int mo8612e() {
        return this.f10049g;
    }

    /* renamed from: f */
    public int mo8613f() {
        return m12169h() - this.f10048f;
    }

    /* renamed from: g */
    public SymbolInfo mo8614g() {
        return this.f10050h;
    }

    /* renamed from: i */
    public boolean mo8615i() {
        return this.f10048f < m12169h();
    }

    /* renamed from: j */
    public void mo8616j() {
        this.f10049g = -1;
    }

    /* renamed from: k */
    public void mo8617k() {
        this.f10050h = null;
    }

    /* renamed from: l */
    public void mo8618l(Dimension bVar, Dimension bVar2) {
        this.f10045c = bVar;
        this.f10046d = bVar2;
    }

    /* renamed from: m */
    public void mo8619m(int i) {
        this.f10051i = i;
    }

    /* renamed from: n */
    public void mo8620n(SymbolShapeHint lVar) {
        this.f10044b = lVar;
    }

    /* renamed from: o */
    public void mo8621o(int i) {
        this.f10049g = i;
    }

    /* renamed from: p */
    public void mo8622p() {
        mo8623q(mo8608a());
    }

    /* renamed from: q */
    public void mo8623q(int i) {
        SymbolInfo kVar = this.f10050h;
        if (kVar == null || i > kVar.mo8626a()) {
            this.f10050h = SymbolInfo.m12208l(i, this.f10044b, this.f10045c, this.f10046d, true);
        }
    }

    /* renamed from: r */
    public void mo8624r(char c) {
        this.f10047e.append(c);
    }

    /* renamed from: s */
    public void mo8625s(String str) {
        this.f10047e.append(str);
    }
}
