package p010b.p026e.p030b.p031k.p032m;

import p010b.p026e.p030b.p031k.ConstraintAnchor;
import p010b.p026e.p030b.p031k.ConstraintWidget;
import p010b.p026e.p030b.p031k.ConstraintWidget.C0561b;

/* renamed from: b.e.b.k.m.p */
public abstract class WidgetRun implements Dependency {

    /* renamed from: a */
    public int f4341a;

    /* renamed from: b */
    ConstraintWidget f4342b;

    /* renamed from: c */
    RunGroup f4343c;

    /* renamed from: d */
    protected C0561b f4344d;

    /* renamed from: e */
    DimensionDependency f4345e = new DimensionDependency(this);

    /* renamed from: f */
    public int f4346f = 0;

    /* renamed from: g */
    boolean f4347g = false;

    /* renamed from: h */
    public DependencyNode f4348h = new DependencyNode(this);

    /* renamed from: i */
    public DependencyNode f4349i = new DependencyNode(this);

    /* renamed from: j */
    protected C0571b f4350j = C0571b.NONE;

    /* renamed from: b.e.b.k.m.p$a */
    /* compiled from: WidgetRun */
    static /* synthetic */ class C0570a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4351a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                b.e.b.k.d$b[] r0 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4351a = r0
                b.e.b.k.d$b r1 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4351a     // Catch:{ NoSuchFieldError -> 0x001d }
                b.e.b.k.d$b r1 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f4351a     // Catch:{ NoSuchFieldError -> 0x0028 }
                b.e.b.k.d$b r1 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f4351a     // Catch:{ NoSuchFieldError -> 0x0033 }
                b.e.b.k.d$b r1 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.BASELINE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f4351a     // Catch:{ NoSuchFieldError -> 0x003e }
                b.e.b.k.d$b r1 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p010b.p026e.p030b.p031k.p032m.WidgetRun.C0570a.<clinit>():void");
        }
    }

    /* renamed from: b.e.b.k.m.p$b */
    /* compiled from: WidgetRun */
    enum C0571b {
        NONE,
        START,
        END,
        CENTER
    }

    public WidgetRun(ConstraintWidget eVar) {
        this.f4342b = eVar;
    }

    /* renamed from: l */
    private void m4951l(int i, int i2) {
        int i3;
        int i4 = this.f4341a;
        if (i4 == 0) {
            this.f4345e.mo4817d(mo4836g(i2, i));
        } else if (i4 == 1) {
            this.f4345e.mo4817d(Math.min(mo4836g(this.f4345e.f4311m, i), i2));
        } else if (i4 == 2) {
            ConstraintWidget I = this.f4342b.mo4673I();
            if (I != null) {
                DimensionDependency gVar = (i == 0 ? I.f4160f : I.f4162g).f4345e;
                if (gVar.f4299j) {
                    ConstraintWidget eVar = this.f4342b;
                    this.f4345e.mo4817d(mo4836g((int) ((((float) gVar.f4296g) * (i == 0 ? eVar.f4192v : eVar.f4198y)) + 0.5f), i));
                }
            }
        } else if (i4 == 3) {
            ConstraintWidget eVar2 = this.f4342b;
            WidgetRun pVar = eVar2.f4160f;
            C0561b bVar = pVar.f4344d;
            C0561b bVar2 = C0561b.MATCH_CONSTRAINT;
            if (bVar == bVar2 && pVar.f4341a == 3) {
                VerticalWidgetRun nVar = eVar2.f4162g;
                if (nVar.f4344d == bVar2 && nVar.f4341a == 3) {
                    return;
                }
            }
            if (i == 0) {
                pVar = eVar2.f4162g;
            }
            if (pVar.f4345e.f4299j) {
                float t = eVar2.mo4737t();
                if (i == 1) {
                    i3 = (int) ((((float) pVar.f4345e.f4296g) / t) + 0.5f);
                } else {
                    i3 = (int) ((t * ((float) pVar.f4345e.f4296g)) + 0.5f);
                }
                this.f4345e.mo4817d(i3);
            }
        }
    }

    /* renamed from: a */
    public void mo4799a(Dependency dVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo4834b(DependencyNode fVar, DependencyNode fVar2, int i) {
        fVar.f4301l.add(fVar2);
        fVar.f4295f = i;
        fVar2.f4300k.add(fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo4835c(DependencyNode fVar, DependencyNode fVar2, int i, DimensionDependency gVar) {
        fVar.f4301l.add(fVar2);
        fVar.f4301l.add(this.f4345e);
        fVar.f4297h = i;
        fVar.f4298i = gVar;
        fVar2.f4300k.add(fVar);
        gVar.f4300k.add(fVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public abstract void mo4800d();

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public abstract void mo4801e();

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public abstract void mo4802f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final int mo4836g(int i, int i2) {
        int i3;
        if (i2 == 0) {
            ConstraintWidget eVar = this.f4342b;
            int i4 = eVar.f4190u;
            i3 = Math.max(eVar.f4188t, i);
            if (i4 > 0) {
                i3 = Math.min(i4, i);
            }
            if (i3 == i) {
                return i;
            }
        } else {
            ConstraintWidget eVar2 = this.f4342b;
            int i5 = eVar2.f4196x;
            int max = Math.max(eVar2.f4194w, i);
            if (i5 > 0) {
                max = Math.min(i5, i);
            }
            if (i3 == i) {
                return i;
            }
        }
        return i3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final DependencyNode mo4837h(ConstraintAnchor dVar) {
        ConstraintAnchor dVar2 = dVar.f4106f;
        DependencyNode fVar = null;
        if (dVar2 == null) {
            return null;
        }
        ConstraintWidget eVar = dVar2.f4104d;
        int i = C0570a.f4351a[dVar2.f4105e.ordinal()];
        if (i == 1) {
            fVar = eVar.f4160f.f4348h;
        } else if (i == 2) {
            fVar = eVar.f4160f.f4349i;
        } else if (i == 3) {
            fVar = eVar.f4162g.f4348h;
        } else if (i == 4) {
            fVar = eVar.f4162g.f4323k;
        } else if (i == 5) {
            fVar = eVar.f4162g.f4349i;
        }
        return fVar;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        if (r3 != 5) goto L_0x002b;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p010b.p026e.p030b.p031k.p032m.DependencyNode mo4838i(p010b.p026e.p030b.p031k.ConstraintAnchor r3, int r4) {
        /*
            r2 = this;
            b.e.b.k.d r3 = r3.f4106f
            r0 = 0
            if (r3 != 0) goto L_0x0006
            return r0
        L_0x0006:
            b.e.b.k.e r1 = r3.f4104d
            if (r4 != 0) goto L_0x000d
            b.e.b.k.m.l r4 = r1.f4160f
            goto L_0x000f
        L_0x000d:
            b.e.b.k.m.n r4 = r1.f4162g
        L_0x000f:
            b.e.b.k.d$b r3 = r3.f4105e
            int[] r1 = p010b.p026e.p030b.p031k.p032m.WidgetRun.C0570a.f4351a
            int r3 = r3.ordinal()
            r3 = r1[r3]
            r1 = 1
            if (r3 == r1) goto L_0x0029
            r1 = 2
            if (r3 == r1) goto L_0x0026
            r1 = 3
            if (r3 == r1) goto L_0x0029
            r1 = 5
            if (r3 == r1) goto L_0x0026
            goto L_0x002b
        L_0x0026:
            b.e.b.k.m.f r0 = r4.f4349i
            goto L_0x002b
        L_0x0029:
            b.e.b.k.m.f r0 = r4.f4348h
        L_0x002b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p010b.p026e.p030b.p031k.p032m.WidgetRun.mo4838i(b.e.b.k.d, int):b.e.b.k.m.f");
    }

    /* renamed from: j */
    public long mo4803j() {
        DimensionDependency gVar = this.f4345e;
        if (gVar.f4299j) {
            return (long) gVar.f4296g;
        }
        return 0;
    }

    /* renamed from: k */
    public boolean mo4839k() {
        return this.f4347g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public abstract boolean mo4804m();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo4840n(Dependency dVar, ConstraintAnchor dVar2, ConstraintAnchor dVar3, int i) {
        float f;
        DependencyNode h = mo4837h(dVar2);
        DependencyNode h2 = mo4837h(dVar3);
        if (h.f4299j && h2.f4299j) {
            int e = h.f4296g + dVar2.mo4641e();
            int e2 = h2.f4296g - dVar3.mo4641e();
            int i2 = e2 - e;
            if (!this.f4345e.f4299j && this.f4344d == C0561b.MATCH_CONSTRAINT) {
                m4951l(i, i2);
            }
            DimensionDependency gVar = this.f4345e;
            if (gVar.f4299j) {
                if (gVar.f4296g == i2) {
                    this.f4348h.mo4817d(e);
                    this.f4349i.mo4817d(e2);
                    return;
                }
                ConstraintWidget eVar = this.f4342b;
                if (i == 0) {
                    f = eVar.mo4743w();
                } else {
                    f = eVar.mo4681M();
                }
                if (h == h2) {
                    e = h.f4296g;
                    e2 = h2.f4296g;
                    f = 0.5f;
                }
                this.f4348h.mo4817d((int) (((float) e) + 0.5f + (((float) ((e2 - e) - this.f4345e.f4296g)) * f)));
                this.f4349i.mo4817d(this.f4348h.f4296g + this.f4345e.f4296g);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo4841o(Dependency dVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo4842p(Dependency dVar) {
    }
}
