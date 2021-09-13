package p010b.p026e.p030b.p031k.p032m;

import p010b.p026e.p030b.p031k.ConstraintAnchor;
import p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b;
import p010b.p026e.p030b.p031k.ConstraintWidget;
import p010b.p026e.p030b.p031k.ConstraintWidget.C0561b;
import p010b.p026e.p030b.p031k.Helper;

/* renamed from: b.e.b.k.m.n */
public class VerticalWidgetRun extends WidgetRun {

    /* renamed from: k */
    public DependencyNode f4323k;

    /* renamed from: l */
    DimensionDependency f4324l;

    /* renamed from: b.e.b.k.m.n$a */
    /* compiled from: VerticalWidgetRun */
    static /* synthetic */ class C0568a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4325a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                b.e.b.k.m.p$b[] r0 = p010b.p026e.p030b.p031k.p032m.WidgetRun.C0571b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4325a = r0
                b.e.b.k.m.p$b r1 = p010b.p026e.p030b.p031k.p032m.WidgetRun.C0571b.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4325a     // Catch:{ NoSuchFieldError -> 0x001d }
                b.e.b.k.m.p$b r1 = p010b.p026e.p030b.p031k.p032m.WidgetRun.C0571b.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f4325a     // Catch:{ NoSuchFieldError -> 0x0028 }
                b.e.b.k.m.p$b r1 = p010b.p026e.p030b.p031k.p032m.WidgetRun.C0571b.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p010b.p026e.p030b.p031k.p032m.VerticalWidgetRun.C0568a.<clinit>():void");
        }
    }

    public VerticalWidgetRun(ConstraintWidget eVar) {
        super(eVar);
        DependencyNode fVar = new DependencyNode(this);
        this.f4323k = fVar;
        this.f4324l = null;
        this.f4348h.f4294e = C0566a.TOP;
        this.f4349i.f4294e = C0566a.BOTTOM;
        fVar.f4294e = C0566a.BASELINE;
        this.f4346f = 1;
    }

    /* renamed from: a */
    public void mo4799a(Dependency dVar) {
        int i;
        float f;
        float f2;
        float f3;
        int i2 = C0568a.f4325a[this.f4350j.ordinal()];
        if (i2 == 1) {
            mo4842p(dVar);
        } else if (i2 == 2) {
            mo4841o(dVar);
        } else if (i2 == 3) {
            ConstraintWidget eVar = this.f4342b;
            mo4840n(dVar, eVar.f4134J, eVar.f4136L, 1);
            return;
        }
        DimensionDependency gVar = this.f4345e;
        if (gVar.f4292c && !gVar.f4299j && this.f4344d == C0561b.MATCH_CONSTRAINT) {
            ConstraintWidget eVar2 = this.f4342b;
            int i3 = eVar2.f4184r;
            if (i3 == 2) {
                ConstraintWidget I = eVar2.mo4673I();
                if (I != null) {
                    DimensionDependency gVar2 = I.f4162g.f4345e;
                    if (gVar2.f4299j) {
                        this.f4345e.mo4817d((int) ((((float) gVar2.f4296g) * this.f4342b.f4198y) + 0.5f));
                    }
                }
            } else if (i3 == 3 && eVar2.f4160f.f4345e.f4299j) {
                int u = eVar2.mo4739u();
                if (u == -1) {
                    ConstraintWidget eVar3 = this.f4342b;
                    f3 = (float) eVar3.f4160f.f4345e.f4296g;
                    f2 = eVar3.mo4737t();
                } else if (u == 0) {
                    ConstraintWidget eVar4 = this.f4342b;
                    f = ((float) eVar4.f4160f.f4345e.f4296g) * eVar4.mo4737t();
                    i = (int) (f + 0.5f);
                    this.f4345e.mo4817d(i);
                } else if (u != 1) {
                    i = 0;
                    this.f4345e.mo4817d(i);
                } else {
                    ConstraintWidget eVar5 = this.f4342b;
                    f3 = (float) eVar5.f4160f.f4345e.f4296g;
                    f2 = eVar5.mo4737t();
                }
                f = f3 / f2;
                i = (int) (f + 0.5f);
                this.f4345e.mo4817d(i);
            }
        }
        DependencyNode fVar = this.f4348h;
        if (fVar.f4292c) {
            DependencyNode fVar2 = this.f4349i;
            if (fVar2.f4292c && (!fVar.f4299j || !fVar2.f4299j || !this.f4345e.f4299j)) {
                if (!this.f4345e.f4299j && this.f4344d == C0561b.MATCH_CONSTRAINT) {
                    ConstraintWidget eVar6 = this.f4342b;
                    if (eVar6.f4182q == 0 && !eVar6.mo4709b0()) {
                        DependencyNode fVar3 = (DependencyNode) this.f4349i.f4301l.get(0);
                        int i4 = ((DependencyNode) this.f4348h.f4301l.get(0)).f4296g;
                        DependencyNode fVar4 = this.f4348h;
                        int i5 = i4 + fVar4.f4295f;
                        int i6 = fVar3.f4296g + this.f4349i.f4295f;
                        int i7 = i6 - i5;
                        fVar4.mo4817d(i5);
                        this.f4349i.mo4817d(i6);
                        this.f4345e.mo4817d(i7);
                        return;
                    }
                }
                if (!this.f4345e.f4299j && this.f4344d == C0561b.MATCH_CONSTRAINT && this.f4341a == 1 && this.f4348h.f4301l.size() > 0 && this.f4349i.f4301l.size() > 0) {
                    int i8 = ((DependencyNode) this.f4348h.f4301l.get(0)).f4296g + this.f4348h.f4295f;
                    int i9 = (((DependencyNode) this.f4349i.f4301l.get(0)).f4296g + this.f4349i.f4295f) - i8;
                    DimensionDependency gVar3 = this.f4345e;
                    int i10 = gVar3.f4311m;
                    if (i9 < i10) {
                        gVar3.mo4817d(i9);
                    } else {
                        gVar3.mo4817d(i10);
                    }
                }
                if (this.f4345e.f4299j && this.f4348h.f4301l.size() > 0 && this.f4349i.f4301l.size() > 0) {
                    DependencyNode fVar5 = (DependencyNode) this.f4348h.f4301l.get(0);
                    DependencyNode fVar6 = (DependencyNode) this.f4349i.f4301l.get(0);
                    int i11 = fVar5.f4296g + this.f4348h.f4295f;
                    int i12 = fVar6.f4296g + this.f4349i.f4295f;
                    float M = this.f4342b.mo4681M();
                    if (fVar5 == fVar6) {
                        i11 = fVar5.f4296g;
                        i12 = fVar6.f4296g;
                        M = 0.5f;
                    }
                    this.f4348h.mo4817d((int) (((float) i11) + 0.5f + (((float) ((i12 - i11) - this.f4345e.f4296g)) * M)));
                    this.f4349i.mo4817d(this.f4348h.f4296g + this.f4345e.f4296g);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo4800d() {
        ConstraintWidget eVar = this.f4342b;
        if (eVar.f4152b) {
            this.f4345e.mo4817d(eVar.mo4741v());
        }
        if (!this.f4345e.f4299j) {
            this.f4344d = this.f4342b.mo4685O();
            if (this.f4342b.mo4697U()) {
                this.f4324l = new BaselineDimensionDependency(this);
            }
            C0561b bVar = this.f4344d;
            if (bVar != C0561b.MATCH_CONSTRAINT) {
                if (bVar == C0561b.MATCH_PARENT) {
                    ConstraintWidget I = this.f4342b.mo4673I();
                    if (I != null && I.mo4685O() == C0561b.FIXED) {
                        int v = (I.mo4741v() - this.f4342b.f4134J.mo4641e()) - this.f4342b.f4136L.mo4641e();
                        mo4834b(this.f4348h, I.f4162g.f4348h, this.f4342b.f4134J.mo4641e());
                        mo4834b(this.f4349i, I.f4162g.f4349i, -this.f4342b.f4136L.mo4641e());
                        this.f4345e.mo4817d(v);
                        return;
                    }
                }
                if (this.f4344d == C0561b.FIXED) {
                    this.f4345e.mo4817d(this.f4342b.mo4741v());
                }
            }
        } else if (this.f4344d == C0561b.MATCH_PARENT) {
            ConstraintWidget I2 = this.f4342b.mo4673I();
            if (I2 != null && I2.mo4685O() == C0561b.FIXED) {
                mo4834b(this.f4348h, I2.f4162g.f4348h, this.f4342b.f4134J.mo4641e());
                mo4834b(this.f4349i, I2.f4162g.f4349i, -this.f4342b.f4136L.mo4641e());
                return;
            }
        }
        DimensionDependency gVar = this.f4345e;
        boolean z = gVar.f4299j;
        if (z) {
            ConstraintWidget eVar2 = this.f4342b;
            if (eVar2.f4152b) {
                ConstraintAnchor[] dVarArr = eVar2.f4141Q;
                if (dVarArr[2].f4106f == null || dVarArr[3].f4106f == null) {
                    if (dVarArr[2].f4106f != null) {
                        DependencyNode h = mo4837h(dVarArr[2]);
                        if (h != null) {
                            mo4834b(this.f4348h, h, this.f4342b.f4141Q[2].mo4641e());
                            mo4834b(this.f4349i, this.f4348h, this.f4345e.f4296g);
                            if (this.f4342b.mo4697U()) {
                                mo4834b(this.f4323k, this.f4348h, this.f4342b.mo4725n());
                            }
                        }
                    } else if (dVarArr[3].f4106f != null) {
                        DependencyNode h2 = mo4837h(dVarArr[3]);
                        if (h2 != null) {
                            mo4834b(this.f4349i, h2, -this.f4342b.f4141Q[3].mo4641e());
                            mo4834b(this.f4348h, this.f4349i, -this.f4345e.f4296g);
                        }
                        if (this.f4342b.mo4697U()) {
                            mo4834b(this.f4323k, this.f4348h, this.f4342b.mo4725n());
                        }
                    } else if (dVarArr[4].f4106f != null) {
                        DependencyNode h3 = mo4837h(dVarArr[4]);
                        if (h3 != null) {
                            mo4834b(this.f4323k, h3, 0);
                            mo4834b(this.f4348h, this.f4323k, -this.f4342b.mo4725n());
                            mo4834b(this.f4349i, this.f4348h, this.f4345e.f4296g);
                        }
                    } else if (!(eVar2 instanceof Helper) && eVar2.mo4673I() != null && this.f4342b.mo4723m(C0559b.CENTER).f4106f == null) {
                        mo4834b(this.f4348h, this.f4342b.mo4673I().f4162g.f4348h, this.f4342b.mo4695T());
                        mo4834b(this.f4349i, this.f4348h, this.f4345e.f4296g);
                        if (this.f4342b.mo4697U()) {
                            mo4834b(this.f4323k, this.f4348h, this.f4342b.mo4725n());
                        }
                    }
                }
                if (eVar2.mo4709b0()) {
                    this.f4348h.f4295f = this.f4342b.f4141Q[2].mo4641e();
                    this.f4349i.f4295f = -this.f4342b.f4141Q[3].mo4641e();
                } else {
                    DependencyNode h4 = mo4837h(this.f4342b.f4141Q[2]);
                    if (h4 != null) {
                        mo4834b(this.f4348h, h4, this.f4342b.f4141Q[2].mo4641e());
                    }
                    DependencyNode h5 = mo4837h(this.f4342b.f4141Q[3]);
                    if (h5 != null) {
                        mo4834b(this.f4349i, h5, -this.f4342b.f4141Q[3].mo4641e());
                    }
                    this.f4348h.f4291b = true;
                    this.f4349i.f4291b = true;
                }
                if (this.f4342b.mo4697U()) {
                    mo4834b(this.f4323k, this.f4348h, this.f4342b.mo4725n());
                }
            }
        }
        if (z || this.f4344d != C0561b.MATCH_CONSTRAINT) {
            gVar.mo4815b(this);
        } else {
            ConstraintWidget eVar3 = this.f4342b;
            int i = eVar3.f4184r;
            if (i == 2) {
                ConstraintWidget I3 = eVar3.mo4673I();
                if (I3 != null) {
                    DimensionDependency gVar2 = I3.f4162g.f4345e;
                    this.f4345e.f4301l.add(gVar2);
                    gVar2.f4300k.add(this.f4345e);
                    DimensionDependency gVar3 = this.f4345e;
                    gVar3.f4291b = true;
                    gVar3.f4300k.add(this.f4348h);
                    this.f4345e.f4300k.add(this.f4349i);
                }
            } else if (i == 3 && !eVar3.mo4709b0()) {
                ConstraintWidget eVar4 = this.f4342b;
                if (eVar4.f4182q != 3) {
                    DimensionDependency gVar4 = eVar4.f4160f.f4345e;
                    this.f4345e.f4301l.add(gVar4);
                    gVar4.f4300k.add(this.f4345e);
                    DimensionDependency gVar5 = this.f4345e;
                    gVar5.f4291b = true;
                    gVar5.f4300k.add(this.f4348h);
                    this.f4345e.f4300k.add(this.f4349i);
                }
            }
        }
        ConstraintWidget eVar5 = this.f4342b;
        ConstraintAnchor[] dVarArr2 = eVar5.f4141Q;
        if (dVarArr2[2].f4106f != null && dVarArr2[3].f4106f != null) {
            if (eVar5.mo4709b0()) {
                this.f4348h.f4295f = this.f4342b.f4141Q[2].mo4641e();
                this.f4349i.f4295f = -this.f4342b.f4141Q[3].mo4641e();
            } else {
                DependencyNode h6 = mo4837h(this.f4342b.f4141Q[2]);
                DependencyNode h7 = mo4837h(this.f4342b.f4141Q[3]);
                h6.mo4815b(this);
                h7.mo4815b(this);
                this.f4350j = C0571b.CENTER;
            }
            if (this.f4342b.mo4697U()) {
                mo4835c(this.f4323k, this.f4348h, 1, this.f4324l);
            }
        } else if (dVarArr2[2].f4106f != null) {
            DependencyNode h8 = mo4837h(dVarArr2[2]);
            if (h8 != null) {
                mo4834b(this.f4348h, h8, this.f4342b.f4141Q[2].mo4641e());
                mo4835c(this.f4349i, this.f4348h, 1, this.f4345e);
                if (this.f4342b.mo4697U()) {
                    mo4835c(this.f4323k, this.f4348h, 1, this.f4324l);
                }
                C0561b bVar2 = this.f4344d;
                C0561b bVar3 = C0561b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f4342b.mo4737t() > 0.0f) {
                    HorizontalWidgetRun lVar = this.f4342b.f4160f;
                    if (lVar.f4344d == bVar3) {
                        lVar.f4345e.f4300k.add(this.f4345e);
                        this.f4345e.f4301l.add(this.f4342b.f4160f.f4345e);
                        this.f4345e.f4290a = this;
                    }
                }
            }
        } else if (dVarArr2[3].f4106f != null) {
            DependencyNode h9 = mo4837h(dVarArr2[3]);
            if (h9 != null) {
                mo4834b(this.f4349i, h9, -this.f4342b.f4141Q[3].mo4641e());
                mo4835c(this.f4348h, this.f4349i, -1, this.f4345e);
                if (this.f4342b.mo4697U()) {
                    mo4835c(this.f4323k, this.f4348h, 1, this.f4324l);
                }
            }
        } else if (dVarArr2[4].f4106f != null) {
            DependencyNode h10 = mo4837h(dVarArr2[4]);
            if (h10 != null) {
                mo4834b(this.f4323k, h10, 0);
                mo4835c(this.f4348h, this.f4323k, -1, this.f4324l);
                mo4835c(this.f4349i, this.f4348h, 1, this.f4345e);
            }
        } else if (!(eVar5 instanceof Helper) && eVar5.mo4673I() != null) {
            mo4834b(this.f4348h, this.f4342b.mo4673I().f4162g.f4348h, this.f4342b.mo4695T());
            mo4835c(this.f4349i, this.f4348h, 1, this.f4345e);
            if (this.f4342b.mo4697U()) {
                mo4835c(this.f4323k, this.f4348h, 1, this.f4324l);
            }
            C0561b bVar4 = this.f4344d;
            C0561b bVar5 = C0561b.MATCH_CONSTRAINT;
            if (bVar4 == bVar5 && this.f4342b.mo4737t() > 0.0f) {
                HorizontalWidgetRun lVar2 = this.f4342b.f4160f;
                if (lVar2.f4344d == bVar5) {
                    lVar2.f4345e.f4300k.add(this.f4345e);
                    this.f4345e.f4301l.add(this.f4342b.f4160f.f4345e);
                    this.f4345e.f4290a = this;
                }
            }
        }
        if (this.f4345e.f4301l.size() == 0) {
            this.f4345e.f4292c = true;
        }
    }

    /* renamed from: e */
    public void mo4801e() {
        DependencyNode fVar = this.f4348h;
        if (fVar.f4299j) {
            this.f4342b.mo4702W0(fVar.f4296g);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo4802f() {
        this.f4343c = null;
        this.f4348h.mo4816c();
        this.f4349i.mo4816c();
        this.f4323k.mo4816c();
        this.f4345e.mo4816c();
        this.f4347g = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public boolean mo4804m() {
        if (this.f4344d != C0561b.MATCH_CONSTRAINT || this.f4342b.f4184r == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public void mo4823q() {
        this.f4347g = false;
        this.f4348h.mo4816c();
        this.f4348h.f4299j = false;
        this.f4349i.mo4816c();
        this.f4349i.f4299j = false;
        this.f4323k.mo4816c();
        this.f4323k.f4299j = false;
        this.f4345e.f4299j = false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VerticalRun ");
        sb.append(this.f4342b.mo4733r());
        return sb.toString();
    }
}
