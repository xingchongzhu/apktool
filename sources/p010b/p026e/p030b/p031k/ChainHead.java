package p010b.p026e.p030b.p031k;

import java.util.ArrayList;
import p010b.p026e.p030b.p031k.ConstraintWidget.C0561b;

/* renamed from: b.e.b.k.c */
public class ChainHead {

    /* renamed from: a */
    protected ConstraintWidget f4079a;

    /* renamed from: b */
    protected ConstraintWidget f4080b;

    /* renamed from: c */
    protected ConstraintWidget f4081c;

    /* renamed from: d */
    protected ConstraintWidget f4082d;

    /* renamed from: e */
    protected ConstraintWidget f4083e;

    /* renamed from: f */
    protected ConstraintWidget f4084f;

    /* renamed from: g */
    protected ConstraintWidget f4085g;

    /* renamed from: h */
    protected ArrayList<ConstraintWidget> f4086h;

    /* renamed from: i */
    protected int f4087i;

    /* renamed from: j */
    protected int f4088j;

    /* renamed from: k */
    protected float f4089k = 0.0f;

    /* renamed from: l */
    int f4090l;

    /* renamed from: m */
    int f4091m;

    /* renamed from: n */
    int f4092n;

    /* renamed from: o */
    boolean f4093o;

    /* renamed from: p */
    private int f4094p;

    /* renamed from: q */
    private boolean f4095q = false;

    /* renamed from: r */
    protected boolean f4096r;

    /* renamed from: s */
    protected boolean f4097s;

    /* renamed from: t */
    protected boolean f4098t;

    /* renamed from: u */
    protected boolean f4099u;

    /* renamed from: v */
    private boolean f4100v;

    public ChainHead(ConstraintWidget eVar, int i, boolean z) {
        this.f4079a = eVar;
        this.f4094p = i;
        this.f4095q = z;
    }

    /* renamed from: b */
    private void m4671b() {
        int i = this.f4094p * 2;
        ConstraintWidget eVar = this.f4079a;
        boolean z = true;
        this.f4093o = true;
        ConstraintWidget eVar2 = eVar;
        boolean z2 = false;
        while (!z2) {
            this.f4087i++;
            ConstraintWidget[] eVarArr = eVar.f4199y0;
            int i2 = this.f4094p;
            ConstraintWidget eVar3 = null;
            eVarArr[i2] = null;
            eVar.f4197x0[i2] = null;
            if (eVar.mo4689Q() != 8) {
                this.f4090l++;
                C0561b s = eVar.mo4735s(this.f4094p);
                C0561b bVar = C0561b.MATCH_CONSTRAINT;
                if (s != bVar) {
                    this.f4091m += eVar.mo4661C(this.f4094p);
                }
                int e = this.f4091m + eVar.f4141Q[i].mo4641e();
                this.f4091m = e;
                int i3 = i + 1;
                this.f4091m = e + eVar.f4141Q[i3].mo4641e();
                int e2 = this.f4092n + eVar.f4141Q[i].mo4641e();
                this.f4092n = e2;
                this.f4092n = e2 + eVar.f4141Q[i3].mo4641e();
                if (this.f4080b == null) {
                    this.f4080b = eVar;
                }
                this.f4082d = eVar;
                C0561b[] bVarArr = eVar.f4144T;
                int i4 = this.f4094p;
                if (bVarArr[i4] == bVar) {
                    int[] iArr = eVar.f4186s;
                    if (iArr[i4] == 0 || iArr[i4] == 3 || iArr[i4] == 2) {
                        this.f4088j++;
                        float[] fArr = eVar.f4195w0;
                        float f = fArr[i4];
                        if (f > 0.0f) {
                            this.f4089k += fArr[i4];
                        }
                        if (m4672c(eVar, i4)) {
                            if (f < 0.0f) {
                                this.f4096r = true;
                            } else {
                                this.f4097s = true;
                            }
                            if (this.f4086h == null) {
                                this.f4086h = new ArrayList<>();
                            }
                            this.f4086h.add(eVar);
                        }
                        if (this.f4084f == null) {
                            this.f4084f = eVar;
                        }
                        ConstraintWidget eVar4 = this.f4085g;
                        if (eVar4 != null) {
                            eVar4.f4197x0[this.f4094p] = eVar;
                        }
                        this.f4085g = eVar;
                    }
                    if (this.f4094p == 0) {
                        if (eVar.f4182q != 0) {
                            this.f4093o = false;
                        } else if (!(eVar.f4188t == 0 && eVar.f4190u == 0)) {
                            this.f4093o = false;
                        }
                    } else if (eVar.f4184r != 0) {
                        this.f4093o = false;
                    } else if (!(eVar.f4194w == 0 && eVar.f4196x == 0)) {
                        this.f4093o = false;
                    }
                    if (eVar.f4148X != 0.0f) {
                        this.f4093o = false;
                        this.f4099u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.f4199y0[this.f4094p] = eVar;
            }
            ConstraintAnchor dVar = eVar.f4141Q[i + 1].f4106f;
            if (dVar != null) {
                ConstraintWidget eVar5 = dVar.f4104d;
                ConstraintAnchor[] dVarArr = eVar5.f4141Q;
                if (dVarArr[i].f4106f != null && dVarArr[i].f4106f.f4104d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z2 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        ConstraintWidget eVar6 = this.f4080b;
        if (eVar6 != null) {
            this.f4091m -= eVar6.f4141Q[i].mo4641e();
        }
        ConstraintWidget eVar7 = this.f4082d;
        if (eVar7 != null) {
            this.f4091m -= eVar7.f4141Q[i + 1].mo4641e();
        }
        this.f4081c = eVar;
        if (this.f4094p != 0 || !this.f4095q) {
            this.f4083e = this.f4079a;
        } else {
            this.f4083e = eVar;
        }
        if (!this.f4097s || !this.f4096r) {
            z = false;
        }
        this.f4098t = z;
    }

    /* renamed from: c */
    private static boolean m4672c(ConstraintWidget eVar, int i) {
        if (eVar.mo4689Q() != 8 && eVar.f4144T[i] == C0561b.MATCH_CONSTRAINT) {
            int[] iArr = eVar.f4186s;
            if (iArr[i] == 0 || iArr[i] == 3) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo4636a() {
        if (!this.f4100v) {
            m4671b();
        }
        this.f4100v = true;
    }
}
