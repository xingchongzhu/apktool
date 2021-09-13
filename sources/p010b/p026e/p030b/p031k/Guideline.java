package p010b.p026e.p030b.p031k;

import p010b.p026e.p030b.LinearSystem;
import p010b.p026e.p030b.SolverVariable;
import p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b;
import p010b.p026e.p030b.p031k.ConstraintWidget.C0561b;

/* renamed from: b.e.b.k.g */
public class Guideline extends ConstraintWidget {

    /* renamed from: D0 */
    protected float f4238D0 = -1.0f;

    /* renamed from: E0 */
    protected int f4239E0 = -1;

    /* renamed from: F0 */
    protected int f4240F0 = -1;

    /* renamed from: G0 */
    private ConstraintAnchor f4241G0 = this.f4134J;

    /* renamed from: H0 */
    private int f4242H0;

    /* renamed from: I0 */
    private int f4243I0;

    /* renamed from: J0 */
    private boolean f4244J0;

    /* renamed from: b.e.b.k.g$a */
    /* compiled from: Guideline */
    static /* synthetic */ class C0562a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4245a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                b.e.b.k.d$b[] r0 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4245a = r0
                b.e.b.k.d$b r1 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4245a     // Catch:{ NoSuchFieldError -> 0x001d }
                b.e.b.k.d$b r1 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f4245a     // Catch:{ NoSuchFieldError -> 0x0028 }
                b.e.b.k.d$b r1 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f4245a     // Catch:{ NoSuchFieldError -> 0x0033 }
                b.e.b.k.d$b r1 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f4245a     // Catch:{ NoSuchFieldError -> 0x003e }
                b.e.b.k.d$b r1 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.BASELINE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f4245a     // Catch:{ NoSuchFieldError -> 0x0049 }
                b.e.b.k.d$b r1 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.CENTER     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f4245a     // Catch:{ NoSuchFieldError -> 0x0054 }
                b.e.b.k.d$b r1 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f4245a     // Catch:{ NoSuchFieldError -> 0x0060 }
                b.e.b.k.d$b r1 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f4245a     // Catch:{ NoSuchFieldError -> 0x006c }
                b.e.b.k.d$b r1 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p010b.p026e.p030b.p031k.Guideline.C0562a.<clinit>():void");
        }
    }

    public Guideline() {
        this.f4242H0 = 0;
        this.f4243I0 = 0;
        this.f4142R.clear();
        this.f4142R.add(this.f4241G0);
        int length = this.f4141Q.length;
        for (int i = 0; i < length; i++) {
            this.f4141Q[i] = this.f4241G0;
        }
    }

    /* renamed from: Z0 */
    public void mo4707Z0(LinearSystem dVar, boolean z) {
        if (mo4673I() != null) {
            int x = dVar.mo4599x(this.f4241G0);
            if (this.f4242H0 == 1) {
                mo4700V0(x);
                mo4702W0(0);
                mo4742v0(mo4673I().mo4741v());
                mo4698U0(0);
            } else {
                mo4700V0(0);
                mo4702W0(x);
                mo4698U0(mo4673I().mo4691R());
                mo4742v0(0);
            }
        }
    }

    /* renamed from: a1 */
    public ConstraintAnchor mo4776a1() {
        return this.f4241G0;
    }

    /* renamed from: b1 */
    public int mo4777b1() {
        return this.f4242H0;
    }

    /* renamed from: c1 */
    public int mo4778c1() {
        return this.f4239E0;
    }

    /* renamed from: d1 */
    public int mo4779d1() {
        return this.f4240F0;
    }

    /* renamed from: e0 */
    public boolean mo4624e0() {
        return this.f4244J0;
    }

    /* renamed from: e1 */
    public float mo4780e1() {
        return this.f4238D0;
    }

    /* renamed from: f0 */
    public boolean mo4626f0() {
        return this.f4244J0;
    }

    /* renamed from: f1 */
    public void mo4781f1(int i) {
        this.f4241G0.mo4655s(i);
        this.f4244J0 = true;
    }

    /* renamed from: g */
    public void mo4628g(LinearSystem dVar, boolean z) {
        ConstraintWidgetContainer fVar = (ConstraintWidgetContainer) mo4673I();
        if (fVar != null) {
            ConstraintAnchor m = fVar.mo4723m(C0559b.LEFT);
            ConstraintAnchor m2 = fVar.mo4723m(C0559b.RIGHT);
            ConstraintWidget eVar = this.f4145U;
            boolean z2 = true;
            boolean z3 = eVar != null && eVar.f4144T[0] == C0561b.WRAP_CONTENT;
            if (this.f4242H0 == 0) {
                m = fVar.mo4723m(C0559b.TOP);
                m2 = fVar.mo4723m(C0559b.BOTTOM);
                ConstraintWidget eVar2 = this.f4145U;
                if (eVar2 == null || eVar2.f4144T[1] != C0561b.WRAP_CONTENT) {
                    z2 = false;
                }
                z3 = z2;
            }
            if (!this.f4244J0 || !this.f4241G0.mo4649m()) {
                if (this.f4239E0 != -1) {
                    SolverVariable q = dVar.mo4595q(this.f4241G0);
                    dVar.mo4585e(q, dVar.mo4595q(m), this.f4239E0, 8);
                    if (z3) {
                        dVar.mo4588h(dVar.mo4595q(m2), q, 0, 5);
                    }
                } else if (this.f4240F0 != -1) {
                    SolverVariable q2 = dVar.mo4595q(this.f4241G0);
                    SolverVariable q3 = dVar.mo4595q(m2);
                    dVar.mo4585e(q2, q3, -this.f4240F0, 8);
                    if (z3) {
                        dVar.mo4588h(q2, dVar.mo4595q(m), 0, 5);
                        dVar.mo4588h(q3, q2, 0, 5);
                    }
                } else if (this.f4238D0 != -1.0f) {
                    dVar.mo4584d(LinearSystem.m4585s(dVar, dVar.mo4595q(this.f4241G0), dVar.mo4595q(m2), this.f4238D0));
                }
                return;
            }
            SolverVariable q4 = dVar.mo4595q(this.f4241G0);
            dVar.mo4586f(q4, this.f4241G0.mo4640d());
            if (this.f4239E0 != -1) {
                if (z3) {
                    dVar.mo4588h(dVar.mo4595q(m2), q4, 0, 5);
                }
            } else if (this.f4240F0 != -1 && z3) {
                SolverVariable q5 = dVar.mo4595q(m2);
                dVar.mo4588h(q4, dVar.mo4595q(m), 0, 5);
                dVar.mo4588h(q5, q4, 0, 5);
            }
            this.f4244J0 = false;
        }
    }

    /* renamed from: g1 */
    public void mo4782g1(int i) {
        if (i > -1) {
            this.f4238D0 = -1.0f;
            this.f4239E0 = i;
            this.f4240F0 = -1;
        }
    }

    /* renamed from: h */
    public boolean mo4630h() {
        return true;
    }

    /* renamed from: h1 */
    public void mo4783h1(int i) {
        if (i > -1) {
            this.f4238D0 = -1.0f;
            this.f4239E0 = -1;
            this.f4240F0 = i;
        }
    }

    /* renamed from: i1 */
    public void mo4784i1(float f) {
        if (f > -1.0f) {
            this.f4238D0 = f;
            this.f4239E0 = -1;
            this.f4240F0 = -1;
        }
    }

    /* renamed from: j1 */
    public void mo4785j1(int i) {
        if (this.f4242H0 != i) {
            this.f4242H0 = i;
            this.f4142R.clear();
            if (this.f4242H0 == 1) {
                this.f4241G0 = this.f4133I;
            } else {
                this.f4241G0 = this.f4134J;
            }
            this.f4142R.add(this.f4241G0);
            int length = this.f4141Q.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f4141Q[i2] = this.f4241G0;
            }
        }
    }

    /* renamed from: m */
    public ConstraintAnchor mo4723m(C0559b bVar) {
        switch (C0562a.f4245a[bVar.ordinal()]) {
            case 1:
            case 2:
                if (this.f4242H0 == 1) {
                    return this.f4241G0;
                }
                break;
            case 3:
            case 4:
                if (this.f4242H0 == 0) {
                    return this.f4241G0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(bVar.name());
    }
}
