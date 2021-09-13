package p010b.p026e.p030b.p031k.p032m;

import p010b.p026e.p030b.p031k.ConstraintWidget;
import p010b.p026e.p030b.p031k.Guideline;

/* renamed from: b.e.b.k.m.j */
class GuidelineReference extends WidgetRun {
    public GuidelineReference(ConstraintWidget eVar) {
        super(eVar);
        eVar.f4160f.mo4802f();
        eVar.f4162g.mo4802f();
        this.f4346f = ((Guideline) eVar).mo4777b1();
    }

    /* renamed from: q */
    private void m4912q(DependencyNode fVar) {
        this.f4348h.f4300k.add(fVar);
        fVar.f4301l.add(this.f4348h);
    }

    /* renamed from: a */
    public void mo4799a(Dependency dVar) {
        DependencyNode fVar = this.f4348h;
        if (fVar.f4292c && !fVar.f4299j) {
            this.f4348h.mo4817d((int) ((((float) ((DependencyNode) fVar.f4301l.get(0)).f4296g) * ((Guideline) this.f4342b).mo4780e1()) + 0.5f));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo4800d() {
        Guideline gVar = (Guideline) this.f4342b;
        int c1 = gVar.mo4778c1();
        int d1 = gVar.mo4779d1();
        gVar.mo4780e1();
        if (gVar.mo4777b1() == 1) {
            if (c1 != -1) {
                this.f4348h.f4301l.add(this.f4342b.f4145U.f4160f.f4348h);
                this.f4342b.f4145U.f4160f.f4348h.f4300k.add(this.f4348h);
                this.f4348h.f4295f = c1;
            } else if (d1 != -1) {
                this.f4348h.f4301l.add(this.f4342b.f4145U.f4160f.f4349i);
                this.f4342b.f4145U.f4160f.f4349i.f4300k.add(this.f4348h);
                this.f4348h.f4295f = -d1;
            } else {
                DependencyNode fVar = this.f4348h;
                fVar.f4291b = true;
                fVar.f4301l.add(this.f4342b.f4145U.f4160f.f4349i);
                this.f4342b.f4145U.f4160f.f4349i.f4300k.add(this.f4348h);
            }
            m4912q(this.f4342b.f4160f.f4348h);
            m4912q(this.f4342b.f4160f.f4349i);
            return;
        }
        if (c1 != -1) {
            this.f4348h.f4301l.add(this.f4342b.f4145U.f4162g.f4348h);
            this.f4342b.f4145U.f4162g.f4348h.f4300k.add(this.f4348h);
            this.f4348h.f4295f = c1;
        } else if (d1 != -1) {
            this.f4348h.f4301l.add(this.f4342b.f4145U.f4162g.f4349i);
            this.f4342b.f4145U.f4162g.f4349i.f4300k.add(this.f4348h);
            this.f4348h.f4295f = -d1;
        } else {
            DependencyNode fVar2 = this.f4348h;
            fVar2.f4291b = true;
            fVar2.f4301l.add(this.f4342b.f4145U.f4162g.f4349i);
            this.f4342b.f4145U.f4162g.f4349i.f4300k.add(this.f4348h);
        }
        m4912q(this.f4342b.f4162g.f4348h);
        m4912q(this.f4342b.f4162g.f4349i);
    }

    /* renamed from: e */
    public void mo4801e() {
        if (((Guideline) this.f4342b).mo4777b1() == 1) {
            this.f4342b.mo4700V0(this.f4348h.f4296g);
        } else {
            this.f4342b.mo4702W0(this.f4348h.f4296g);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo4802f() {
        this.f4348h.mo4816c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public boolean mo4804m() {
        return false;
    }
}
