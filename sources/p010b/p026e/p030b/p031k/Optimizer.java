package p010b.p026e.p030b.p031k;

import p010b.p026e.p030b.LinearSystem;
import p010b.p026e.p030b.p031k.ConstraintWidget.C0561b;

/* renamed from: b.e.b.k.j */
public class Optimizer {

    /* renamed from: a */
    static boolean[] f4248a = new boolean[3];

    /* renamed from: a */
    static void m4851a(ConstraintWidgetContainer fVar, LinearSystem dVar, ConstraintWidget eVar) {
        eVar.f4178o = -1;
        eVar.f4180p = -1;
        C0561b bVar = fVar.f4144T[0];
        C0561b bVar2 = C0561b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.f4144T[0] == C0561b.MATCH_PARENT) {
            int i = eVar.f4133I.f4107g;
            int R = fVar.mo4691R() - eVar.f4135K.f4107g;
            ConstraintAnchor dVar2 = eVar.f4133I;
            dVar2.f4109i = dVar.mo4595q(dVar2);
            ConstraintAnchor dVar3 = eVar.f4135K;
            dVar3.f4109i = dVar.mo4595q(dVar3);
            dVar.mo4586f(eVar.f4133I.f4109i, i);
            dVar.mo4586f(eVar.f4135K.f4109i, R);
            eVar.f4178o = 2;
            eVar.mo4748y0(i, R);
        }
        if (fVar.f4144T[1] != bVar2 && eVar.f4144T[1] == C0561b.MATCH_PARENT) {
            int i2 = eVar.f4134J.f4107g;
            int v = fVar.mo4741v() - eVar.f4136L.f4107g;
            ConstraintAnchor dVar4 = eVar.f4134J;
            dVar4.f4109i = dVar.mo4595q(dVar4);
            ConstraintAnchor dVar5 = eVar.f4136L;
            dVar5.f4109i = dVar.mo4595q(dVar5);
            dVar.mo4586f(eVar.f4134J.f4109i, i2);
            dVar.mo4586f(eVar.f4136L.f4109i, v);
            if (eVar.f4161f0 > 0 || eVar.mo4689Q() == 8) {
                ConstraintAnchor dVar6 = eVar.f4137M;
                dVar6.f4109i = dVar.mo4595q(dVar6);
                dVar.mo4586f(eVar.f4137M.f4109i, eVar.f4161f0 + i2);
            }
            eVar.f4180p = 2;
            eVar.mo4688P0(i2, v);
        }
    }

    /* renamed from: b */
    public static final boolean m4852b(int i, int i2) {
        return (i & i2) == i2;
    }
}
