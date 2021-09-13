package p067c.p068a.p069a.p070a.p100k2.p107t;

import android.text.Layout.Alignment;

/* renamed from: c.a.a.a.k2.t.g */
final class TtmlStyle {

    /* renamed from: a */
    private String f8023a;

    /* renamed from: b */
    private int f8024b;

    /* renamed from: c */
    private boolean f8025c;

    /* renamed from: d */
    private int f8026d;

    /* renamed from: e */
    private boolean f8027e;

    /* renamed from: f */
    private int f8028f = -1;

    /* renamed from: g */
    private int f8029g = -1;

    /* renamed from: h */
    private int f8030h = -1;

    /* renamed from: i */
    private int f8031i = -1;

    /* renamed from: j */
    private int f8032j = -1;

    /* renamed from: k */
    private float f8033k;

    /* renamed from: l */
    private String f8034l;

    /* renamed from: m */
    private int f8035m = -1;

    /* renamed from: n */
    private int f8036n = -1;

    /* renamed from: o */
    private Alignment f8037o;

    /* renamed from: p */
    private int f8038p = -1;

    /* renamed from: q */
    private TextEmphasis f8039q;

    /* renamed from: r */
    private float f8040r = Float.MAX_VALUE;

    /* renamed from: q */
    private TtmlStyle m9681q(TtmlStyle gVar, boolean z) {
        if (gVar != null) {
            if (!this.f8025c && gVar.f8025c) {
                mo7148v(gVar.f8024b);
            }
            if (this.f8030h == -1) {
                this.f8030h = gVar.f8030h;
            }
            if (this.f8031i == -1) {
                this.f8031i = gVar.f8031i;
            }
            if (this.f8023a == null) {
                String str = gVar.f8023a;
                if (str != null) {
                    this.f8023a = str;
                }
            }
            if (this.f8028f == -1) {
                this.f8028f = gVar.f8028f;
            }
            if (this.f8029g == -1) {
                this.f8029g = gVar.f8029g;
            }
            if (this.f8036n == -1) {
                this.f8036n = gVar.f8036n;
            }
            if (this.f8037o == null) {
                Alignment alignment = gVar.f8037o;
                if (alignment != null) {
                    this.f8037o = alignment;
                }
            }
            if (this.f8038p == -1) {
                this.f8038p = gVar.f8038p;
            }
            if (this.f8032j == -1) {
                this.f8032j = gVar.f8032j;
                this.f8033k = gVar.f8033k;
            }
            if (this.f8039q == null) {
                this.f8039q = gVar.f8039q;
            }
            if (this.f8040r == Float.MAX_VALUE) {
                this.f8040r = gVar.f8040r;
            }
            if (z && !this.f8027e && gVar.f8027e) {
                mo7146t(gVar.f8026d);
            }
            if (z && this.f8035m == -1) {
                int i = gVar.f8035m;
                if (i != -1) {
                    this.f8035m = i;
                }
            }
        }
        return this;
    }

    /* renamed from: A */
    public TtmlStyle mo7119A(boolean z) {
        this.f8031i = z ? 1 : 0;
        return this;
    }

    /* renamed from: B */
    public TtmlStyle mo7120B(boolean z) {
        this.f8028f = z ? 1 : 0;
        return this;
    }

    /* renamed from: C */
    public TtmlStyle mo7121C(int i) {
        this.f8036n = i;
        return this;
    }

    /* renamed from: D */
    public TtmlStyle mo7122D(int i) {
        this.f8035m = i;
        return this;
    }

    /* renamed from: E */
    public TtmlStyle mo7123E(float f) {
        this.f8040r = f;
        return this;
    }

    /* renamed from: F */
    public TtmlStyle mo7124F(Alignment alignment) {
        this.f8037o = alignment;
        return this;
    }

    /* renamed from: G */
    public TtmlStyle mo7125G(boolean z) {
        this.f8038p = z ? 1 : 0;
        return this;
    }

    /* renamed from: H */
    public TtmlStyle mo7126H(TextEmphasis bVar) {
        this.f8039q = bVar;
        return this;
    }

    /* renamed from: I */
    public TtmlStyle mo7127I(boolean z) {
        this.f8029g = z ? 1 : 0;
        return this;
    }

    /* renamed from: a */
    public TtmlStyle mo7128a(TtmlStyle gVar) {
        return m9681q(gVar, true);
    }

    /* renamed from: b */
    public int mo7129b() {
        if (this.f8027e) {
            return this.f8026d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    /* renamed from: c */
    public int mo7130c() {
        if (this.f8025c) {
            return this.f8024b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    /* renamed from: d */
    public String mo7131d() {
        return this.f8023a;
    }

    /* renamed from: e */
    public float mo7132e() {
        return this.f8033k;
    }

    /* renamed from: f */
    public int mo7133f() {
        return this.f8032j;
    }

    /* renamed from: g */
    public String mo7134g() {
        return this.f8034l;
    }

    /* renamed from: h */
    public int mo7135h() {
        return this.f8036n;
    }

    /* renamed from: i */
    public int mo7136i() {
        return this.f8035m;
    }

    /* renamed from: j */
    public float mo7137j() {
        return this.f8040r;
    }

    /* renamed from: k */
    public int mo7138k() {
        int i = this.f8030h;
        if (i == -1 && this.f8031i == -1) {
            return -1;
        }
        int i2 = 0;
        int i3 = i == 1 ? 1 : 0;
        if (this.f8031i == 1) {
            i2 = 2;
        }
        return i3 | i2;
    }

    /* renamed from: l */
    public Alignment mo7139l() {
        return this.f8037o;
    }

    /* renamed from: m */
    public boolean mo7140m() {
        return this.f8038p == 1;
    }

    /* renamed from: n */
    public TextEmphasis mo7141n() {
        return this.f8039q;
    }

    /* renamed from: o */
    public boolean mo7142o() {
        return this.f8027e;
    }

    /* renamed from: p */
    public boolean mo7143p() {
        return this.f8025c;
    }

    /* renamed from: r */
    public boolean mo7144r() {
        return this.f8028f == 1;
    }

    /* renamed from: s */
    public boolean mo7145s() {
        return this.f8029g == 1;
    }

    /* renamed from: t */
    public TtmlStyle mo7146t(int i) {
        this.f8026d = i;
        this.f8027e = true;
        return this;
    }

    /* renamed from: u */
    public TtmlStyle mo7147u(boolean z) {
        this.f8030h = z ? 1 : 0;
        return this;
    }

    /* renamed from: v */
    public TtmlStyle mo7148v(int i) {
        this.f8024b = i;
        this.f8025c = true;
        return this;
    }

    /* renamed from: w */
    public TtmlStyle mo7149w(String str) {
        this.f8023a = str;
        return this;
    }

    /* renamed from: x */
    public TtmlStyle mo7150x(float f) {
        this.f8033k = f;
        return this;
    }

    /* renamed from: y */
    public TtmlStyle mo7151y(int i) {
        this.f8032j = i;
        return this;
    }

    /* renamed from: z */
    public TtmlStyle mo7152z(String str) {
        this.f8034l = str;
        return this;
    }
}
