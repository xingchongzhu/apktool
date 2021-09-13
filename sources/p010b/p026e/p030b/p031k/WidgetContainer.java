package p010b.p026e.p030b.p031k;

import java.util.ArrayList;
import p010b.p026e.p030b.Cache;

/* renamed from: b.e.b.k.l */
public class WidgetContainer extends ConstraintWidget {

    /* renamed from: D0 */
    public ArrayList<ConstraintWidget> f4262D0 = new ArrayList<>();

    /* renamed from: a */
    public void mo4793a(ConstraintWidget eVar) {
        this.f4262D0.add(eVar);
        if (eVar.mo4673I() != null) {
            ((WidgetContainer) eVar.mo4673I()).mo4795c1(eVar);
        }
        eVar.mo4682M0(this);
    }

    /* renamed from: a1 */
    public ArrayList<ConstraintWidget> mo4794a1() {
        return this.f4262D0;
    }

    /* renamed from: b1 */
    public void mo4757b1() {
        ArrayList<ConstraintWidget> arrayList = this.f4262D0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ConstraintWidget eVar = (ConstraintWidget) this.f4262D0.get(i);
                if (eVar instanceof WidgetContainer) {
                    ((WidgetContainer) eVar).mo4757b1();
                }
            }
        }
    }

    /* renamed from: c1 */
    public void mo4795c1(ConstraintWidget eVar) {
        this.f4262D0.remove(eVar);
        eVar.mo4715h0();
    }

    /* renamed from: d1 */
    public void mo4796d1() {
        this.f4262D0.clear();
    }

    /* renamed from: h0 */
    public void mo4715h0() {
        this.f4262D0.clear();
        super.mo4715h0();
    }

    /* renamed from: j0 */
    public void mo4718j0(Cache cVar) {
        super.mo4718j0(cVar);
        int size = this.f4262D0.size();
        for (int i = 0; i < size; i++) {
            ((ConstraintWidget) this.f4262D0.get(i)).mo4718j0(cVar);
        }
    }
}
