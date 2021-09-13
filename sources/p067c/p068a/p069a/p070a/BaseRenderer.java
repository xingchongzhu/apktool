package p067c.p068a.p069a.p070a;

import java.io.IOException;
import p067c.p068a.p069a.p070a.p073c2.DecoderInputBuffer;
import p067c.p068a.p069a.p070a.p097j2.SampleStream;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.MediaClock;

/* renamed from: c.a.a.a.h0 */
public abstract class BaseRenderer implements C1227p1, C1240r1 {

    /* renamed from: a */
    private final int f7190a;

    /* renamed from: b */
    private final FormatHolder f7191b = new FormatHolder();

    /* renamed from: c */
    private RendererConfiguration f7192c;

    /* renamed from: d */
    private int f7193d;

    /* renamed from: e */
    private int f7194e;

    /* renamed from: f */
    private SampleStream f7195f;

    /* renamed from: g */
    private Format[] f7196g;

    /* renamed from: h */
    private long f7197h;

    /* renamed from: i */
    private long f7198i;

    /* renamed from: j */
    private long f7199j = Long.MIN_VALUE;

    /* renamed from: k */
    private boolean f7200k;

    /* renamed from: l */
    private boolean f7201l;

    public BaseRenderer(int i) {
        this.f7190a = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final RendererConfiguration mo6510A() {
        return (RendererConfiguration) Assertions.m10153e(this.f7192c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final FormatHolder mo6511B() {
        this.f7191b.mo7714a();
        return this.f7191b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final int mo6512C() {
        return this.f7193d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Format[] mo6513D() {
        return (Format[]) Assertions.m10153e(this.f7196g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final boolean mo6514E() {
        return mo6521i() ? this.f7200k : ((SampleStream) Assertions.m10153e(this.f7195f)).mo6900e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public abstract void mo5768F();

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo5769G(boolean z, boolean z2) throws ExoPlaybackException {
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public abstract void mo5770H(long j, boolean z) throws ExoPlaybackException;

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo5771I() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo5772J() throws ExoPlaybackException {
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public void mo5773K() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public abstract void mo6476L(Format[] u0VarArr, long j, long j2) throws ExoPlaybackException;

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public final int mo6515M(FormatHolder v0Var, DecoderInputBuffer fVar, boolean z) {
        int a = ((SampleStream) Assertions.m10153e(this.f7195f)).mo6897a(v0Var, fVar, z);
        int i = -4;
        if (a == -4) {
            if (fVar.mo5952k()) {
                this.f7199j = Long.MIN_VALUE;
                if (!this.f7200k) {
                    i = -3;
                }
                return i;
            }
            long j = fVar.f5746e + this.f7197h;
            fVar.f5746e = j;
            this.f7199j = Math.max(this.f7199j, j);
        } else if (a == -5) {
            Format u0Var = (Format) Assertions.m10153e(v0Var.f8869b);
            if (u0Var.f8818p != Long.MAX_VALUE) {
                v0Var.f8869b = u0Var.mo7668l().mo7709i0(u0Var.f8818p + this.f7197h).mo7679E();
            }
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public int mo6516N(long j) {
        return ((SampleStream) Assertions.m10153e(this.f7195f)).mo6899c(j - this.f7197h);
    }

    /* renamed from: d */
    public final void mo6517d() {
        boolean z = true;
        if (this.f7194e != 1) {
            z = false;
        }
        Assertions.m10154f(z);
        this.f7191b.mo7714a();
        this.f7194e = 0;
        this.f7195f = null;
        this.f7196g = null;
        this.f7200k = false;
        mo5768F();
    }

    /* renamed from: g */
    public final int mo6518g() {
        return this.f7190a;
    }

    public final int getState() {
        return this.f7194e;
    }

    /* renamed from: h */
    public final void mo6520h(int i) {
        this.f7193d = i;
    }

    /* renamed from: i */
    public final boolean mo6521i() {
        return this.f7199j == Long.MIN_VALUE;
    }

    /* renamed from: j */
    public final void mo6522j(RendererConfiguration s1Var, Format[] u0VarArr, SampleStream l0Var, long j, boolean z, boolean z2, long j2, long j3) throws ExoPlaybackException {
        long j4 = j;
        boolean z3 = z;
        Assertions.m10154f(this.f7194e == 0);
        this.f7192c = s1Var;
        this.f7194e = 1;
        this.f7198i = j4;
        mo5769G(z3, z2);
        mo6524o(u0VarArr, l0Var, j2, j3);
        mo5770H(j4, z3);
    }

    /* renamed from: k */
    public int mo6488k() throws ExoPlaybackException {
        return 0;
    }

    /* renamed from: m */
    public void mo5791m(int i, Object obj) throws ExoPlaybackException {
    }

    /* renamed from: n */
    public final SampleStream mo6523n() {
        return this.f7195f;
    }

    /* renamed from: o */
    public final void mo6524o(Format[] u0VarArr, SampleStream l0Var, long j, long j2) throws ExoPlaybackException {
        Assertions.m10154f(!this.f7200k);
        this.f7195f = l0Var;
        this.f7199j = j2;
        this.f7196g = u0VarArr;
        this.f7197h = j2;
        mo6476L(u0VarArr, j, j2);
    }

    /* renamed from: p */
    public final void mo6525p() {
        this.f7200k = true;
    }

    /* renamed from: q */
    public final void mo6526q() throws IOException {
        ((SampleStream) Assertions.m10153e(this.f7195f)).mo6898b();
    }

    /* renamed from: r */
    public final long mo6527r() {
        return this.f7199j;
    }

    public final void reset() {
        Assertions.m10154f(this.f7194e == 0);
        this.f7191b.mo7714a();
        mo5771I();
    }

    /* renamed from: s */
    public final void mo6529s(long j) throws ExoPlaybackException {
        this.f7200k = false;
        this.f7198i = j;
        this.f7199j = j;
        mo5770H(j, false);
    }

    public final void start() throws ExoPlaybackException {
        boolean z = true;
        if (this.f7194e != 1) {
            z = false;
        }
        Assertions.m10154f(z);
        this.f7194e = 2;
        mo5772J();
    }

    public final void stop() {
        Assertions.m10154f(this.f7194e == 2);
        this.f7194e = 1;
        mo5773K();
    }

    /* renamed from: t */
    public final boolean mo6532t() {
        return this.f7200k;
    }

    /* renamed from: u */
    public MediaClock mo5794u() {
        return null;
    }

    /* renamed from: v */
    public final C1240r1 mo6533v() {
        return this;
    }

    /* renamed from: x */
    public /* synthetic */ void mo6498x(float f, float f2) {
        Renderer.m10676a(this, f, f2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final ExoPlaybackException mo6534y(Throwable th, Format u0Var) {
        return mo6535z(th, u0Var, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final ExoPlaybackException mo6535z(Throwable th, Format u0Var, boolean z) {
        int i;
        if (u0Var != null && !this.f7201l) {
            this.f7201l = true;
            try {
                int d = RendererCapabilities.m10787d(mo6481a(u0Var));
                this.f7201l = false;
                i = d;
            } catch (ExoPlaybackException unused) {
                this.f7201l = false;
            } catch (Throwable th2) {
                this.f7201l = false;
                throw th2;
            }
            return ExoPlaybackException.m10679c(th, getName(), mo6512C(), u0Var, i, z);
        }
        i = 4;
        return ExoPlaybackException.m10679c(th, getName(), mo6512C(), u0Var, i, z);
    }
}
