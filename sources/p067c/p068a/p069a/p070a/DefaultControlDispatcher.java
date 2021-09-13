package p067c.p068a.p069a.p070a;

import p067c.p068a.p069a.p070a.Timeline.C1257c;

/* renamed from: c.a.a.a.k0 */
public class DefaultControlDispatcher implements ControlDispatcher {

    /* renamed from: a */
    private final C1257c f7696a;

    /* renamed from: b */
    private long f7697b;

    /* renamed from: c */
    private long f7698c;

    public DefaultControlDispatcher() {
        this(15000, 5000);
    }

    /* renamed from: l */
    private static void m9338l(C1155l1 l1Var, long j) {
        long W = l1Var.mo7206W() + j;
        long L = l1Var.mo7197L();
        if (L != -9223372036854775807L) {
            W = Math.min(W, L);
        }
        l1Var.mo7216k(l1Var.mo7203R(), Math.max(W, 0));
    }

    /* renamed from: a */
    public boolean mo6794a(C1155l1 l1Var, int i) {
        l1Var.mo7191A(i);
        return true;
    }

    /* renamed from: b */
    public boolean mo6795b(C1155l1 l1Var, boolean z) {
        l1Var.mo7218p(z);
        return true;
    }

    /* renamed from: c */
    public boolean mo6796c(C1155l1 l1Var) {
        if (mo6802i() && l1Var.mo6406w()) {
            m9338l(l1Var, this.f7698c);
        }
        return true;
    }

    /* renamed from: d */
    public boolean mo6797d(C1155l1 l1Var) {
        l1Var.mo7209d();
        return true;
    }

    /* renamed from: e */
    public boolean mo6798e(C1155l1 l1Var) {
        Timeline M = l1Var.mo7198M();
        if (!M.mo7743q() && !l1Var.mo7213h()) {
            int R = l1Var.mo7203R();
            M.mo7742n(R, this.f7696a);
            int l = l1Var.mo6404l();
            boolean z = this.f7696a.mo7768f() && !this.f7696a.f8965j;
            if (l != -1 && (l1Var.mo7206W() <= 3000 || z)) {
                l1Var.mo7216k(l, -9223372036854775807L);
            } else if (!z) {
                l1Var.mo7216k(R, 0);
            }
        }
        return true;
    }

    /* renamed from: f */
    public boolean mo6799f() {
        return this.f7697b > 0;
    }

    /* renamed from: g */
    public boolean mo6800g(C1155l1 l1Var) {
        Timeline M = l1Var.mo7198M();
        if (!M.mo7743q() && !l1Var.mo7213h()) {
            int R = l1Var.mo7203R();
            M.mo7742n(R, this.f7696a);
            int B = l1Var.mo6399B();
            if (B != -1) {
                l1Var.mo7216k(B, -9223372036854775807L);
            } else if (this.f7696a.mo7768f() && this.f7696a.f8966k) {
                l1Var.mo7216k(R, -9223372036854775807L);
            }
        }
        return true;
    }

    /* renamed from: h */
    public boolean mo6801h(C1155l1 l1Var) {
        if (mo6799f() && l1Var.mo6406w()) {
            m9338l(l1Var, -this.f7697b);
        }
        return true;
    }

    /* renamed from: i */
    public boolean mo6802i() {
        return this.f7698c > 0;
    }

    /* renamed from: j */
    public boolean mo6803j(C1155l1 l1Var, boolean z) {
        l1Var.mo7211f(z);
        return true;
    }

    /* renamed from: k */
    public boolean mo6804k(C1155l1 l1Var, int i, long j) {
        l1Var.mo7216k(i, j);
        return true;
    }

    @Deprecated
    /* renamed from: m */
    public void mo7033m(long j) {
        this.f7698c = j;
    }

    @Deprecated
    /* renamed from: n */
    public void mo7034n(long j) {
        this.f7697b = j;
    }

    public DefaultControlDispatcher(long j, long j2) {
        this.f7698c = j;
        this.f7697b = j2;
        this.f7696a = new C1257c();
    }
}
