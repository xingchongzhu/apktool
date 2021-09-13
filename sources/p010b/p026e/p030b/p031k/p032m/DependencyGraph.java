package p010b.p026e.p030b.p031k.p032m;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p010b.p026e.p030b.p031k.ConstraintAnchor;
import p010b.p026e.p030b.p031k.ConstraintWidget;
import p010b.p026e.p030b.p031k.ConstraintWidget.C0561b;
import p010b.p026e.p030b.p031k.ConstraintWidgetContainer;
import p010b.p026e.p030b.p031k.Guideline;
import p010b.p026e.p030b.p031k.HelperWidget;
import p010b.p026e.p030b.p031k.p032m.BasicMeasure.C0564a;
import p010b.p026e.p030b.p031k.p032m.BasicMeasure.C0565b;

/* renamed from: b.e.b.k.m.e */
public class DependencyGraph {

    /* renamed from: a */
    private ConstraintWidgetContainer f4281a;

    /* renamed from: b */
    private boolean f4282b = true;

    /* renamed from: c */
    private boolean f4283c = true;

    /* renamed from: d */
    private ConstraintWidgetContainer f4284d;

    /* renamed from: e */
    private ArrayList<WidgetRun> f4285e = new ArrayList<>();

    /* renamed from: f */
    private ArrayList<RunGroup> f4286f = new ArrayList<>();

    /* renamed from: g */
    private C0565b f4287g = null;

    /* renamed from: h */
    private C0564a f4288h = new C0564a();

    /* renamed from: i */
    ArrayList<RunGroup> f4289i = new ArrayList<>();

    public DependencyGraph(ConstraintWidgetContainer fVar) {
        this.f4281a = fVar;
        this.f4284d = fVar;
    }

    /* renamed from: a */
    private void m4880a(DependencyNode fVar, int i, int i2, DependencyNode fVar2, ArrayList<RunGroup> arrayList, RunGroup mVar) {
        WidgetRun pVar = fVar.f4293d;
        if (pVar.f4343c == null) {
            ConstraintWidgetContainer fVar3 = this.f4281a;
            if (pVar != fVar3.f4160f && pVar != fVar3.f4162g) {
                if (mVar == null) {
                    mVar = new RunGroup(pVar, i2);
                    arrayList.add(mVar);
                }
                pVar.f4343c = mVar;
                mVar.mo4821a(pVar);
                for (Dependency dVar : pVar.f4348h.f4300k) {
                    if (dVar instanceof DependencyNode) {
                        m4880a((DependencyNode) dVar, i, 0, fVar2, arrayList, mVar);
                    }
                }
                for (Dependency dVar2 : pVar.f4349i.f4300k) {
                    if (dVar2 instanceof DependencyNode) {
                        m4880a((DependencyNode) dVar2, i, 1, fVar2, arrayList, mVar);
                    }
                }
                if (i == 1 && (pVar instanceof VerticalWidgetRun)) {
                    for (Dependency dVar3 : ((VerticalWidgetRun) pVar).f4323k.f4300k) {
                        if (dVar3 instanceof DependencyNode) {
                            m4880a((DependencyNode) dVar3, i, 2, fVar2, arrayList, mVar);
                        }
                    }
                }
                for (DependencyNode fVar4 : pVar.f4348h.f4301l) {
                    if (fVar4 == fVar2) {
                        mVar.f4317c = true;
                    }
                    m4880a(fVar4, i, 0, fVar2, arrayList, mVar);
                }
                for (DependencyNode fVar5 : pVar.f4349i.f4301l) {
                    if (fVar5 == fVar2) {
                        mVar.f4317c = true;
                    }
                    m4880a(fVar5, i, 1, fVar2, arrayList, mVar);
                }
                if (i == 1 && (pVar instanceof VerticalWidgetRun)) {
                    for (DependencyNode a : ((VerticalWidgetRun) pVar).f4323k.f4301l) {
                        m4880a(a, i, 2, fVar2, arrayList, mVar);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private boolean m4881b(ConstraintWidgetContainer fVar) {
        int i;
        C0561b bVar;
        int i2;
        C0561b bVar2;
        ConstraintWidgetContainer fVar2 = fVar;
        Iterator it = fVar2.f4262D0.iterator();
        while (it.hasNext()) {
            ConstraintWidget eVar = (ConstraintWidget) it.next();
            C0561b[] bVarArr = eVar.f4144T;
            C0561b bVar3 = bVarArr[0];
            C0561b bVar4 = bVarArr[1];
            if (eVar.mo4689Q() == 8) {
                eVar.f4152b = true;
            } else {
                if (eVar.f4192v < 1.0f && bVar3 == C0561b.MATCH_CONSTRAINT) {
                    eVar.f4182q = 2;
                }
                if (eVar.f4198y < 1.0f && bVar4 == C0561b.MATCH_CONSTRAINT) {
                    eVar.f4184r = 2;
                }
                if (eVar.mo4737t() > 0.0f) {
                    C0561b bVar5 = C0561b.MATCH_CONSTRAINT;
                    if (bVar3 == bVar5 && (bVar4 == C0561b.WRAP_CONTENT || bVar4 == C0561b.FIXED)) {
                        eVar.f4182q = 3;
                    } else if (bVar4 == bVar5 && (bVar3 == C0561b.WRAP_CONTENT || bVar3 == C0561b.FIXED)) {
                        eVar.f4184r = 3;
                    } else if (bVar3 == bVar5 && bVar4 == bVar5) {
                        if (eVar.f4182q == 0) {
                            eVar.f4182q = 3;
                        }
                        if (eVar.f4184r == 0) {
                            eVar.f4184r = 3;
                        }
                    }
                }
                C0561b bVar6 = C0561b.MATCH_CONSTRAINT;
                if (bVar3 == bVar6 && eVar.f4182q == 1 && (eVar.f4133I.f4106f == null || eVar.f4135K.f4106f == null)) {
                    bVar3 = C0561b.WRAP_CONTENT;
                }
                C0561b bVar7 = bVar3;
                if (bVar4 == bVar6 && eVar.f4184r == 1 && (eVar.f4134J.f4106f == null || eVar.f4136L.f4106f == null)) {
                    bVar4 = C0561b.WRAP_CONTENT;
                }
                C0561b bVar8 = bVar4;
                HorizontalWidgetRun lVar = eVar.f4160f;
                lVar.f4344d = bVar7;
                int i3 = eVar.f4182q;
                lVar.f4341a = i3;
                VerticalWidgetRun nVar = eVar.f4162g;
                nVar.f4344d = bVar8;
                int i4 = eVar.f4184r;
                nVar.f4341a = i4;
                C0561b bVar9 = C0561b.MATCH_PARENT;
                if ((bVar7 == bVar9 || bVar7 == C0561b.FIXED || bVar7 == C0561b.WRAP_CONTENT) && (bVar8 == bVar9 || bVar8 == C0561b.FIXED || bVar8 == C0561b.WRAP_CONTENT)) {
                    int R = eVar.mo4691R();
                    if (bVar7 == bVar9) {
                        i = (fVar.mo4691R() - eVar.f4133I.f4107g) - eVar.f4135K.f4107g;
                        bVar = C0561b.FIXED;
                    } else {
                        i = R;
                        bVar = bVar7;
                    }
                    int v = eVar.mo4741v();
                    if (bVar8 == bVar9) {
                        i2 = (fVar.mo4741v() - eVar.f4134J.f4107g) - eVar.f4136L.f4107g;
                        bVar2 = C0561b.FIXED;
                    } else {
                        i2 = v;
                        bVar2 = bVar8;
                    }
                    m4884l(eVar, bVar, i, bVar2, i2);
                    eVar.f4160f.f4345e.mo4817d(eVar.mo4691R());
                    eVar.f4162g.f4345e.mo4817d(eVar.mo4741v());
                    eVar.f4152b = true;
                } else {
                    if (bVar7 == bVar6) {
                        C0561b bVar10 = C0561b.WRAP_CONTENT;
                        if (bVar8 == bVar10 || bVar8 == C0561b.FIXED) {
                            if (i3 == 3) {
                                if (bVar8 == bVar10) {
                                    m4884l(eVar, bVar10, 0, bVar10, 0);
                                }
                                int v2 = eVar.mo4741v();
                                int i5 = (int) ((((float) v2) * eVar.f4148X) + 0.5f);
                                C0561b bVar11 = C0561b.FIXED;
                                m4884l(eVar, bVar11, i5, bVar11, v2);
                                eVar.f4160f.f4345e.mo4817d(eVar.mo4691R());
                                eVar.f4162g.f4345e.mo4817d(eVar.mo4741v());
                                eVar.f4152b = true;
                            } else if (i3 == 1) {
                                m4884l(eVar, bVar10, 0, bVar8, 0);
                                eVar.f4160f.f4345e.f4311m = eVar.mo4691R();
                            } else if (i3 == 2) {
                                C0561b[] bVarArr2 = fVar2.f4144T;
                                C0561b bVar12 = bVarArr2[0];
                                C0561b bVar13 = C0561b.FIXED;
                                if (bVar12 == bVar13 || bVarArr2[0] == bVar9) {
                                    m4884l(eVar, bVar13, (int) ((eVar.f4192v * ((float) fVar.mo4691R())) + 0.5f), bVar8, eVar.mo4741v());
                                    eVar.f4160f.f4345e.mo4817d(eVar.mo4691R());
                                    eVar.f4162g.f4345e.mo4817d(eVar.mo4741v());
                                    eVar.f4152b = true;
                                }
                            } else {
                                ConstraintAnchor[] dVarArr = eVar.f4141Q;
                                if (dVarArr[0].f4106f == null || dVarArr[1].f4106f == null) {
                                    m4884l(eVar, bVar10, 0, bVar8, 0);
                                    eVar.f4160f.f4345e.mo4817d(eVar.mo4691R());
                                    eVar.f4162g.f4345e.mo4817d(eVar.mo4741v());
                                    eVar.f4152b = true;
                                }
                            }
                        }
                    }
                    if (bVar8 == bVar6) {
                        C0561b bVar14 = C0561b.WRAP_CONTENT;
                        if (bVar7 == bVar14 || bVar7 == C0561b.FIXED) {
                            if (i4 == 3) {
                                if (bVar7 == bVar14) {
                                    m4884l(eVar, bVar14, 0, bVar14, 0);
                                }
                                int R2 = eVar.mo4691R();
                                float f = eVar.f4148X;
                                if (eVar.mo4739u() == -1) {
                                    f = 1.0f / f;
                                }
                                int i6 = (int) ((((float) R2) * f) + 0.5f);
                                C0561b bVar15 = C0561b.FIXED;
                                m4884l(eVar, bVar15, R2, bVar15, i6);
                                eVar.f4160f.f4345e.mo4817d(eVar.mo4691R());
                                eVar.f4162g.f4345e.mo4817d(eVar.mo4741v());
                                eVar.f4152b = true;
                            } else if (i4 == 1) {
                                m4884l(eVar, bVar7, 0, bVar14, 0);
                                eVar.f4162g.f4345e.f4311m = eVar.mo4741v();
                            } else if (i4 == 2) {
                                C0561b[] bVarArr3 = fVar2.f4144T;
                                C0561b bVar16 = bVarArr3[1];
                                C0561b bVar17 = C0561b.FIXED;
                                if (bVar16 == bVar17 || bVarArr3[1] == bVar9) {
                                    ConstraintWidget eVar2 = eVar;
                                    C0561b bVar18 = bVar7;
                                    C0561b bVar19 = bVar17;
                                    m4884l(eVar2, bVar18, eVar.mo4691R(), bVar19, (int) ((eVar.f4198y * ((float) fVar.mo4741v())) + 0.5f));
                                    eVar.f4160f.f4345e.mo4817d(eVar.mo4691R());
                                    eVar.f4162g.f4345e.mo4817d(eVar.mo4741v());
                                    eVar.f4152b = true;
                                }
                            } else {
                                ConstraintAnchor[] dVarArr2 = eVar.f4141Q;
                                if (dVarArr2[2].f4106f == null || dVarArr2[3].f4106f == null) {
                                    m4884l(eVar, bVar14, 0, bVar8, 0);
                                    eVar.f4160f.f4345e.mo4817d(eVar.mo4691R());
                                    eVar.f4162g.f4345e.mo4817d(eVar.mo4741v());
                                    eVar.f4152b = true;
                                }
                            }
                        }
                    }
                    if (bVar7 == bVar6 && bVar8 == bVar6) {
                        if (i3 == 1 || i4 == 1) {
                            C0561b bVar20 = C0561b.WRAP_CONTENT;
                            m4884l(eVar, bVar20, 0, bVar20, 0);
                            eVar.f4160f.f4345e.f4311m = eVar.mo4691R();
                            eVar.f4162g.f4345e.f4311m = eVar.mo4741v();
                        } else if (i4 == 2 && i3 == 2) {
                            C0561b[] bVarArr4 = fVar2.f4144T;
                            C0561b bVar21 = bVarArr4[0];
                            C0561b bVar22 = C0561b.FIXED;
                            if ((bVar21 == bVar22 || bVarArr4[0] == bVar22) && (bVarArr4[1] == bVar22 || bVarArr4[1] == bVar22)) {
                                float f2 = eVar.f4192v;
                                m4884l(eVar, bVar22, (int) ((f2 * ((float) fVar.mo4691R())) + 0.5f), bVar22, (int) ((eVar.f4198y * ((float) fVar.mo4741v())) + 0.5f));
                                eVar.f4160f.f4345e.mo4817d(eVar.mo4691R());
                                eVar.f4162g.f4345e.mo4817d(eVar.mo4741v());
                                eVar.f4152b = true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    private int m4882e(ConstraintWidgetContainer fVar, int i) {
        int size = this.f4289i.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j = Math.max(j, ((RunGroup) this.f4289i.get(i2)).mo4822b(fVar, i));
        }
        return (int) j;
    }

    /* renamed from: i */
    private void m4883i(WidgetRun pVar, int i, ArrayList<RunGroup> arrayList) {
        for (Dependency dVar : pVar.f4348h.f4300k) {
            if (dVar instanceof DependencyNode) {
                m4880a((DependencyNode) dVar, i, 0, pVar.f4349i, arrayList, null);
            } else if (dVar instanceof WidgetRun) {
                m4880a(((WidgetRun) dVar).f4348h, i, 0, pVar.f4349i, arrayList, null);
            }
        }
        for (Dependency dVar2 : pVar.f4349i.f4300k) {
            if (dVar2 instanceof DependencyNode) {
                m4880a((DependencyNode) dVar2, i, 1, pVar.f4348h, arrayList, null);
            } else if (dVar2 instanceof WidgetRun) {
                m4880a(((WidgetRun) dVar2).f4349i, i, 1, pVar.f4348h, arrayList, null);
            }
        }
        if (i == 1) {
            for (Dependency dVar3 : ((VerticalWidgetRun) pVar).f4323k.f4300k) {
                if (dVar3 instanceof DependencyNode) {
                    m4880a((DependencyNode) dVar3, i, 2, null, arrayList, null);
                }
            }
        }
    }

    /* renamed from: l */
    private void m4884l(ConstraintWidget eVar, C0561b bVar, int i, C0561b bVar2, int i2) {
        C0564a aVar = this.f4288h;
        aVar.f4269d = bVar;
        aVar.f4270e = bVar2;
        aVar.f4271f = i;
        aVar.f4272g = i2;
        this.f4287g.mo1939a(eVar, aVar);
        eVar.mo4698U0(this.f4288h.f4273h);
        eVar.mo4742v0(this.f4288h.f4274i);
        eVar.mo4740u0(this.f4288h.f4276k);
        eVar.mo4720k0(this.f4288h.f4275j);
    }

    /* renamed from: c */
    public void mo4806c() {
        mo4807d(this.f4285e);
        this.f4289i.clear();
        RunGroup.f4315a = 0;
        m4883i(this.f4281a.f4160f, 0, this.f4289i);
        m4883i(this.f4281a.f4162g, 1, this.f4289i);
        this.f4282b = false;
    }

    /* renamed from: d */
    public void mo4807d(ArrayList<WidgetRun> arrayList) {
        arrayList.clear();
        this.f4284d.f4160f.mo4802f();
        this.f4284d.f4162g.mo4802f();
        arrayList.add(this.f4284d.f4160f);
        arrayList.add(this.f4284d.f4162g);
        Iterator it = this.f4284d.f4262D0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            ConstraintWidget eVar = (ConstraintWidget) it.next();
            if (eVar instanceof Guideline) {
                arrayList.add(new GuidelineReference(eVar));
            } else {
                if (eVar.mo4706Z()) {
                    if (eVar.f4156d == null) {
                        eVar.f4156d = new ChainRun(eVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f4156d);
                } else {
                    arrayList.add(eVar.f4160f);
                }
                if (eVar.mo4709b0()) {
                    if (eVar.f4158e == null) {
                        eVar.f4158e = new ChainRun(eVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f4158e);
                } else {
                    arrayList.add(eVar.f4162g);
                }
                if (eVar instanceof HelperWidget) {
                    arrayList.add(new HelperReferences(eVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((WidgetRun) it2.next()).mo4802f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            WidgetRun pVar = (WidgetRun) it3.next();
            if (pVar.f4342b != this.f4284d) {
                pVar.mo4800d();
            }
        }
    }

    /* renamed from: f */
    public boolean mo4808f(boolean z) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = z & true;
        if (this.f4282b || this.f4283c) {
            Iterator it = this.f4281a.f4262D0.iterator();
            while (it.hasNext()) {
                ConstraintWidget eVar = (ConstraintWidget) it.next();
                eVar.mo4721l();
                eVar.f4152b = false;
                eVar.f4160f.mo4819r();
                eVar.f4162g.mo4823q();
            }
            this.f4281a.mo4721l();
            ConstraintWidgetContainer fVar = this.f4281a;
            fVar.f4152b = false;
            fVar.f4160f.mo4819r();
            this.f4281a.f4162g.mo4823q();
            this.f4283c = false;
        }
        if (m4881b(this.f4284d)) {
            return false;
        }
        this.f4281a.mo4700V0(0);
        this.f4281a.mo4702W0(0);
        C0561b s = this.f4281a.mo4735s(0);
        C0561b s2 = this.f4281a.mo4735s(1);
        if (this.f4282b) {
            mo4806c();
        }
        int S = this.f4281a.mo4693S();
        int T = this.f4281a.mo4695T();
        this.f4281a.f4160f.f4348h.mo4817d(S);
        this.f4281a.f4162g.f4348h.mo4817d(T);
        mo4813m();
        C0561b bVar = C0561b.WRAP_CONTENT;
        if (s == bVar || s2 == bVar) {
            if (z4) {
                Iterator it2 = this.f4285e.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!((WidgetRun) it2.next()).mo4804m()) {
                            z4 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z4 && s == C0561b.WRAP_CONTENT) {
                this.f4281a.mo4750z0(C0561b.FIXED);
                ConstraintWidgetContainer fVar2 = this.f4281a;
                fVar2.mo4698U0(m4882e(fVar2, 0));
                ConstraintWidgetContainer fVar3 = this.f4281a;
                fVar3.f4160f.f4345e.mo4817d(fVar3.mo4691R());
            }
            if (z4 && s2 == C0561b.WRAP_CONTENT) {
                this.f4281a.mo4690Q0(C0561b.FIXED);
                ConstraintWidgetContainer fVar4 = this.f4281a;
                fVar4.mo4742v0(m4882e(fVar4, 1));
                ConstraintWidgetContainer fVar5 = this.f4281a;
                fVar5.f4162g.f4345e.mo4817d(fVar5.mo4741v());
            }
        }
        ConstraintWidgetContainer fVar6 = this.f4281a;
        C0561b[] bVarArr = fVar6.f4144T;
        C0561b bVar2 = bVarArr[0];
        C0561b bVar3 = C0561b.FIXED;
        if (bVar2 == bVar3 || bVarArr[0] == C0561b.MATCH_PARENT) {
            int R = fVar6.mo4691R() + S;
            this.f4281a.f4160f.f4349i.mo4817d(R);
            this.f4281a.f4160f.f4345e.mo4817d(R - S);
            mo4813m();
            ConstraintWidgetContainer fVar7 = this.f4281a;
            C0561b[] bVarArr2 = fVar7.f4144T;
            if (bVarArr2[1] == bVar3 || bVarArr2[1] == C0561b.MATCH_PARENT) {
                int v = fVar7.mo4741v() + T;
                this.f4281a.f4162g.f4349i.mo4817d(v);
                this.f4281a.f4162g.f4345e.mo4817d(v - T);
            }
            mo4813m();
            z2 = true;
        } else {
            z2 = false;
        }
        Iterator it3 = this.f4285e.iterator();
        while (it3.hasNext()) {
            WidgetRun pVar = (WidgetRun) it3.next();
            if (pVar.f4342b != this.f4281a || pVar.f4347g) {
                pVar.mo4801e();
            }
        }
        Iterator it4 = this.f4285e.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            WidgetRun pVar2 = (WidgetRun) it4.next();
            if ((z2 || pVar2.f4342b != this.f4281a) && (!pVar2.f4348h.f4299j || ((!pVar2.f4349i.f4299j && !(pVar2 instanceof GuidelineReference)) || (!pVar2.f4345e.f4299j && !(pVar2 instanceof ChainRun) && !(pVar2 instanceof GuidelineReference))))) {
                z3 = false;
            }
        }
        z3 = false;
        this.f4281a.mo4750z0(s);
        this.f4281a.mo4690Q0(s2);
        return z3;
    }

    /* renamed from: g */
    public boolean mo4809g(boolean z) {
        if (this.f4282b) {
            Iterator it = this.f4281a.f4262D0.iterator();
            while (it.hasNext()) {
                ConstraintWidget eVar = (ConstraintWidget) it.next();
                eVar.mo4721l();
                eVar.f4152b = false;
                HorizontalWidgetRun lVar = eVar.f4160f;
                lVar.f4345e.f4299j = false;
                lVar.f4347g = false;
                lVar.mo4819r();
                VerticalWidgetRun nVar = eVar.f4162g;
                nVar.f4345e.f4299j = false;
                nVar.f4347g = false;
                nVar.mo4823q();
            }
            this.f4281a.mo4721l();
            ConstraintWidgetContainer fVar = this.f4281a;
            fVar.f4152b = false;
            HorizontalWidgetRun lVar2 = fVar.f4160f;
            lVar2.f4345e.f4299j = false;
            lVar2.f4347g = false;
            lVar2.mo4819r();
            VerticalWidgetRun nVar2 = this.f4281a.f4162g;
            nVar2.f4345e.f4299j = false;
            nVar2.f4347g = false;
            nVar2.mo4823q();
            mo4806c();
        }
        if (m4881b(this.f4284d)) {
            return false;
        }
        this.f4281a.mo4700V0(0);
        this.f4281a.mo4702W0(0);
        this.f4281a.f4160f.f4348h.mo4817d(0);
        this.f4281a.f4162g.f4348h.mo4817d(0);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0143 A[EDGE_INSN: B:77:0x0143->B:62:0x0143 ?: BREAK  
EDGE_INSN: B:77:0x0143->B:62:0x0143 ?: BREAK  
EDGE_INSN: B:77:0x0143->B:62:0x0143 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0143 A[EDGE_INSN: B:77:0x0143->B:62:0x0143 ?: BREAK  
EDGE_INSN: B:77:0x0143->B:62:0x0143 ?: BREAK  , SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo4810h(boolean r10, int r11) {
        /*
            r9 = this;
            r0 = 1
            r10 = r10 & r0
            b.e.b.k.f r1 = r9.f4281a
            r2 = 0
            b.e.b.k.e$b r1 = r1.mo4735s(r2)
            b.e.b.k.f r3 = r9.f4281a
            b.e.b.k.e$b r3 = r3.mo4735s(r0)
            b.e.b.k.f r4 = r9.f4281a
            int r4 = r4.mo4693S()
            b.e.b.k.f r5 = r9.f4281a
            int r5 = r5.mo4695T()
            if (r10 == 0) goto L_0x0089
            b.e.b.k.e$b r6 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.WRAP_CONTENT
            if (r1 == r6) goto L_0x0023
            if (r3 != r6) goto L_0x0089
        L_0x0023:
            java.util.ArrayList<b.e.b.k.m.p> r6 = r9.f4285e
            java.util.Iterator r6 = r6.iterator()
        L_0x0029:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0040
            java.lang.Object r7 = r6.next()
            b.e.b.k.m.p r7 = (p010b.p026e.p030b.p031k.p032m.WidgetRun) r7
            int r8 = r7.f4346f
            if (r8 != r11) goto L_0x0029
            boolean r7 = r7.mo4804m()
            if (r7 != 0) goto L_0x0029
            r10 = 0
        L_0x0040:
            if (r11 != 0) goto L_0x0066
            if (r10 == 0) goto L_0x0089
            b.e.b.k.e$b r10 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.WRAP_CONTENT
            if (r1 != r10) goto L_0x0089
            b.e.b.k.f r10 = r9.f4281a
            b.e.b.k.e$b r6 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.FIXED
            r10.mo4750z0(r6)
            b.e.b.k.f r10 = r9.f4281a
            int r6 = r9.m4882e(r10, r2)
            r10.mo4698U0(r6)
            b.e.b.k.f r10 = r9.f4281a
            b.e.b.k.m.l r6 = r10.f4160f
            b.e.b.k.m.g r6 = r6.f4345e
            int r10 = r10.mo4691R()
            r6.mo4817d(r10)
            goto L_0x0089
        L_0x0066:
            if (r10 == 0) goto L_0x0089
            b.e.b.k.e$b r10 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.WRAP_CONTENT
            if (r3 != r10) goto L_0x0089
            b.e.b.k.f r10 = r9.f4281a
            b.e.b.k.e$b r6 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.FIXED
            r10.mo4690Q0(r6)
            b.e.b.k.f r10 = r9.f4281a
            int r6 = r9.m4882e(r10, r0)
            r10.mo4742v0(r6)
            b.e.b.k.f r10 = r9.f4281a
            b.e.b.k.m.n r6 = r10.f4162g
            b.e.b.k.m.g r6 = r6.f4345e
            int r10 = r10.mo4741v()
            r6.mo4817d(r10)
        L_0x0089:
            if (r11 != 0) goto L_0x00b4
            b.e.b.k.f r10 = r9.f4281a
            b.e.b.k.e$b[] r5 = r10.f4144T
            r6 = r5[r2]
            b.e.b.k.e$b r7 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.FIXED
            if (r6 == r7) goto L_0x009b
            r5 = r5[r2]
            b.e.b.k.e$b r6 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.MATCH_PARENT
            if (r5 != r6) goto L_0x00c5
        L_0x009b:
            int r10 = r10.mo4691R()
            int r10 = r10 + r4
            b.e.b.k.f r5 = r9.f4281a
            b.e.b.k.m.l r5 = r5.f4160f
            b.e.b.k.m.f r5 = r5.f4349i
            r5.mo4817d(r10)
            b.e.b.k.f r5 = r9.f4281a
            b.e.b.k.m.l r5 = r5.f4160f
            b.e.b.k.m.g r5 = r5.f4345e
            int r10 = r10 - r4
            r5.mo4817d(r10)
            goto L_0x00df
        L_0x00b4:
            b.e.b.k.f r10 = r9.f4281a
            b.e.b.k.e$b[] r4 = r10.f4144T
            r6 = r4[r0]
            b.e.b.k.e$b r7 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.FIXED
            if (r6 == r7) goto L_0x00c7
            r4 = r4[r0]
            b.e.b.k.e$b r6 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.MATCH_PARENT
            if (r4 != r6) goto L_0x00c5
            goto L_0x00c7
        L_0x00c5:
            r10 = 0
            goto L_0x00e0
        L_0x00c7:
            int r10 = r10.mo4741v()
            int r10 = r10 + r5
            b.e.b.k.f r4 = r9.f4281a
            b.e.b.k.m.n r4 = r4.f4162g
            b.e.b.k.m.f r4 = r4.f4349i
            r4.mo4817d(r10)
            b.e.b.k.f r4 = r9.f4281a
            b.e.b.k.m.n r4 = r4.f4162g
            b.e.b.k.m.g r4 = r4.f4345e
            int r10 = r10 - r5
            r4.mo4817d(r10)
        L_0x00df:
            r10 = 1
        L_0x00e0:
            r9.mo4813m()
            java.util.ArrayList<b.e.b.k.m.p> r4 = r9.f4285e
            java.util.Iterator r4 = r4.iterator()
        L_0x00e9:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0109
            java.lang.Object r5 = r4.next()
            b.e.b.k.m.p r5 = (p010b.p026e.p030b.p031k.p032m.WidgetRun) r5
            int r6 = r5.f4346f
            if (r6 == r11) goto L_0x00fa
            goto L_0x00e9
        L_0x00fa:
            b.e.b.k.e r6 = r5.f4342b
            b.e.b.k.f r7 = r9.f4281a
            if (r6 != r7) goto L_0x0105
            boolean r6 = r5.f4347g
            if (r6 != 0) goto L_0x0105
            goto L_0x00e9
        L_0x0105:
            r5.mo4801e()
            goto L_0x00e9
        L_0x0109:
            java.util.ArrayList<b.e.b.k.m.p> r4 = r9.f4285e
            java.util.Iterator r4 = r4.iterator()
        L_0x010f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0143
            java.lang.Object r5 = r4.next()
            b.e.b.k.m.p r5 = (p010b.p026e.p030b.p031k.p032m.WidgetRun) r5
            int r6 = r5.f4346f
            if (r6 == r11) goto L_0x0120
            goto L_0x010f
        L_0x0120:
            if (r10 != 0) goto L_0x0129
            b.e.b.k.e r6 = r5.f4342b
            b.e.b.k.f r7 = r9.f4281a
            if (r6 != r7) goto L_0x0129
            goto L_0x010f
        L_0x0129:
            b.e.b.k.m.f r6 = r5.f4348h
            boolean r6 = r6.f4299j
            if (r6 != 0) goto L_0x0131
        L_0x012f:
            r0 = 0
            goto L_0x0143
        L_0x0131:
            b.e.b.k.m.f r6 = r5.f4349i
            boolean r6 = r6.f4299j
            if (r6 != 0) goto L_0x0138
            goto L_0x012f
        L_0x0138:
            boolean r6 = r5 instanceof p010b.p026e.p030b.p031k.p032m.ChainRun
            if (r6 != 0) goto L_0x010f
            b.e.b.k.m.g r5 = r5.f4345e
            boolean r5 = r5.f4299j
            if (r5 != 0) goto L_0x010f
            goto L_0x012f
        L_0x0143:
            b.e.b.k.f r10 = r9.f4281a
            r10.mo4750z0(r1)
            b.e.b.k.f r10 = r9.f4281a
            r10.mo4690Q0(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p010b.p026e.p030b.p031k.p032m.DependencyGraph.mo4810h(boolean, int):boolean");
    }

    /* renamed from: j */
    public void mo4811j() {
        this.f4282b = true;
    }

    /* renamed from: k */
    public void mo4812k() {
        this.f4283c = true;
    }

    /* renamed from: m */
    public void mo4813m() {
        Iterator it = this.f4281a.f4262D0.iterator();
        while (it.hasNext()) {
            ConstraintWidget eVar = (ConstraintWidget) it.next();
            if (!eVar.f4152b) {
                C0561b[] bVarArr = eVar.f4144T;
                boolean z = false;
                C0561b bVar = bVarArr[0];
                C0561b bVar2 = bVarArr[1];
                int i = eVar.f4182q;
                int i2 = eVar.f4184r;
                C0561b bVar3 = C0561b.WRAP_CONTENT;
                boolean z2 = bVar == bVar3 || (bVar == C0561b.MATCH_CONSTRAINT && i == 1);
                if (bVar2 == bVar3 || (bVar2 == C0561b.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                DimensionDependency gVar = eVar.f4160f.f4345e;
                boolean z3 = gVar.f4299j;
                DimensionDependency gVar2 = eVar.f4162g.f4345e;
                boolean z4 = gVar2.f4299j;
                if (z3 && z4) {
                    C0561b bVar4 = C0561b.FIXED;
                    m4884l(eVar, bVar4, gVar.f4296g, bVar4, gVar2.f4296g);
                    eVar.f4152b = true;
                } else if (z3 && z) {
                    m4884l(eVar, C0561b.FIXED, gVar.f4296g, bVar3, gVar2.f4296g);
                    if (bVar2 == C0561b.MATCH_CONSTRAINT) {
                        eVar.f4162g.f4345e.f4311m = eVar.mo4741v();
                    } else {
                        eVar.f4162g.f4345e.mo4817d(eVar.mo4741v());
                        eVar.f4152b = true;
                    }
                } else if (z4 && z2) {
                    m4884l(eVar, bVar3, gVar.f4296g, C0561b.FIXED, gVar2.f4296g);
                    if (bVar == C0561b.MATCH_CONSTRAINT) {
                        eVar.f4160f.f4345e.f4311m = eVar.mo4691R();
                    } else {
                        eVar.f4160f.f4345e.mo4817d(eVar.mo4691R());
                        eVar.f4152b = true;
                    }
                }
                if (eVar.f4152b) {
                    DimensionDependency gVar3 = eVar.f4162g.f4324l;
                    if (gVar3 != null) {
                        gVar3.mo4817d(eVar.mo4725n());
                    }
                }
            }
        }
    }

    /* renamed from: n */
    public void mo4814n(C0565b bVar) {
        this.f4287g = bVar;
    }
}
