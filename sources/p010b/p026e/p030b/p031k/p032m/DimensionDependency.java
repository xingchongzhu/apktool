package p010b.p026e.p030b.p031k.p032m;

/* renamed from: b.e.b.k.m.g */
class DimensionDependency extends DependencyNode {

    /* renamed from: m */
    public int f4311m;

    public DimensionDependency(WidgetRun pVar) {
        super(pVar);
        if (pVar instanceof HorizontalWidgetRun) {
            this.f4294e = C0566a.HORIZONTAL_DIMENSION;
        } else {
            this.f4294e = C0566a.VERTICAL_DIMENSION;
        }
    }

    /* renamed from: d */
    public void mo4817d(int i) {
        if (!this.f4299j) {
            this.f4299j = true;
            this.f4296g = i;
            for (Dependency dVar : this.f4300k) {
                dVar.mo4799a(dVar);
            }
        }
    }
}
