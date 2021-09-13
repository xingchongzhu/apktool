package p010b.p026e.p030b.p031k.p032m;

import p010b.p026e.p030b.p031k.Barrier;
import p010b.p026e.p030b.p031k.ConstraintWidget;

/* renamed from: b.e.b.k.m.k */
class HelperReferences extends WidgetRun {
    public HelperReferences(ConstraintWidget eVar) {
        super(eVar);
    }

    /* renamed from: q */
    private void m4918q(DependencyNode fVar) {
        this.f4348h.f4300k.add(fVar);
        fVar.f4301l.add(this.f4348h);
    }

    /* renamed from: a */
    public void mo4799a(Dependency dVar) {
        Barrier aVar = (Barrier) this.f4342b;
        int e1 = aVar.mo4625e1();
        int i = 0;
        int i2 = -1;
        for (DependencyNode fVar : this.f4348h.f4301l) {
            int i3 = fVar.f4296g;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (e1 == 0 || e1 == 2) {
            this.f4348h.mo4817d(i2 + aVar.mo4627f1());
        } else {
            this.f4348h.mo4817d(i + aVar.mo4627f1());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo4800d() {
        ConstraintWidget eVar = this.f4342b;
        if (eVar instanceof Barrier) {
            this.f4348h.f4291b = true;
            Barrier aVar = (Barrier) eVar;
            int e1 = aVar.mo4625e1();
            boolean d1 = aVar.mo4623d1();
            int i = 0;
            if (e1 == 0) {
                this.f4348h.f4294e = C0566a.LEFT;
                while (i < aVar.f4247E0) {
                    ConstraintWidget eVar2 = aVar.f4246D0[i];
                    if (d1 || eVar2.mo4689Q() != 8) {
                        DependencyNode fVar = eVar2.f4160f.f4348h;
                        fVar.f4300k.add(this.f4348h);
                        this.f4348h.f4301l.add(fVar);
                    }
                    i++;
                }
                m4918q(this.f4342b.f4160f.f4348h);
                m4918q(this.f4342b.f4160f.f4349i);
            } else if (e1 == 1) {
                this.f4348h.f4294e = C0566a.RIGHT;
                while (i < aVar.f4247E0) {
                    ConstraintWidget eVar3 = aVar.f4246D0[i];
                    if (d1 || eVar3.mo4689Q() != 8) {
                        DependencyNode fVar2 = eVar3.f4160f.f4349i;
                        fVar2.f4300k.add(this.f4348h);
                        this.f4348h.f4301l.add(fVar2);
                    }
                    i++;
                }
                m4918q(this.f4342b.f4160f.f4348h);
                m4918q(this.f4342b.f4160f.f4349i);
            } else if (e1 == 2) {
                this.f4348h.f4294e = C0566a.TOP;
                while (i < aVar.f4247E0) {
                    ConstraintWidget eVar4 = aVar.f4246D0[i];
                    if (d1 || eVar4.mo4689Q() != 8) {
                        DependencyNode fVar3 = eVar4.f4162g.f4348h;
                        fVar3.f4300k.add(this.f4348h);
                        this.f4348h.f4301l.add(fVar3);
                    }
                    i++;
                }
                m4918q(this.f4342b.f4162g.f4348h);
                m4918q(this.f4342b.f4162g.f4349i);
            } else if (e1 == 3) {
                this.f4348h.f4294e = C0566a.BOTTOM;
                while (i < aVar.f4247E0) {
                    ConstraintWidget eVar5 = aVar.f4246D0[i];
                    if (d1 || eVar5.mo4689Q() != 8) {
                        DependencyNode fVar4 = eVar5.f4162g.f4349i;
                        fVar4.f4300k.add(this.f4348h);
                        this.f4348h.f4301l.add(fVar4);
                    }
                    i++;
                }
                m4918q(this.f4342b.f4162g.f4348h);
                m4918q(this.f4342b.f4162g.f4349i);
            }
        }
    }

    /* renamed from: e */
    public void mo4801e() {
        ConstraintWidget eVar = this.f4342b;
        if (eVar instanceof Barrier) {
            int e1 = ((Barrier) eVar).mo4625e1();
            if (e1 == 0 || e1 == 1) {
                this.f4342b.mo4700V0(this.f4348h.f4296g);
            } else {
                this.f4342b.mo4702W0(this.f4348h.f4296g);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo4802f() {
        this.f4343c = null;
        this.f4348h.mo4816c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public boolean mo4804m() {
        return false;
    }
}
