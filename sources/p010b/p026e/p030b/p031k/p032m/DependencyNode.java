package p010b.p026e.p030b.p031k.p032m;

import java.util.ArrayList;
import java.util.List;

/* renamed from: b.e.b.k.m.f */
public class DependencyNode implements Dependency {

    /* renamed from: a */
    public Dependency f4290a = null;

    /* renamed from: b */
    public boolean f4291b = false;

    /* renamed from: c */
    public boolean f4292c = false;

    /* renamed from: d */
    WidgetRun f4293d;

    /* renamed from: e */
    C0566a f4294e = C0566a.UNKNOWN;

    /* renamed from: f */
    int f4295f;

    /* renamed from: g */
    public int f4296g;

    /* renamed from: h */
    int f4297h = 1;

    /* renamed from: i */
    DimensionDependency f4298i = null;

    /* renamed from: j */
    public boolean f4299j = false;

    /* renamed from: k */
    List<Dependency> f4300k = new ArrayList();

    /* renamed from: l */
    List<DependencyNode> f4301l = new ArrayList();

    /* renamed from: b.e.b.k.m.f$a */
    /* compiled from: DependencyNode */
    enum C0566a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public DependencyNode(WidgetRun pVar) {
        this.f4293d = pVar;
    }

    /* renamed from: a */
    public void mo4799a(Dependency dVar) {
        for (DependencyNode fVar : this.f4301l) {
            if (!fVar.f4299j) {
                return;
            }
        }
        this.f4292c = true;
        Dependency dVar2 = this.f4290a;
        if (dVar2 != null) {
            dVar2.mo4799a(this);
        }
        if (this.f4291b) {
            this.f4293d.mo4799a(this);
            return;
        }
        DependencyNode fVar2 = null;
        int i = 0;
        for (DependencyNode fVar3 : this.f4301l) {
            if (!(fVar3 instanceof DimensionDependency)) {
                i++;
                fVar2 = fVar3;
            }
        }
        if (fVar2 != null && i == 1 && fVar2.f4299j) {
            DimensionDependency gVar = this.f4298i;
            if (gVar != null) {
                if (gVar.f4299j) {
                    this.f4295f = this.f4297h * gVar.f4296g;
                } else {
                    return;
                }
            }
            mo4817d(fVar2.f4296g + this.f4295f);
        }
        Dependency dVar3 = this.f4290a;
        if (dVar3 != null) {
            dVar3.mo4799a(this);
        }
    }

    /* renamed from: b */
    public void mo4815b(Dependency dVar) {
        this.f4300k.add(dVar);
        if (this.f4299j) {
            dVar.mo4799a(dVar);
        }
    }

    /* renamed from: c */
    public void mo4816c() {
        this.f4301l.clear();
        this.f4300k.clear();
        this.f4299j = false;
        this.f4296g = 0;
        this.f4292c = false;
        this.f4291b = false;
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

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4293d.f4342b.mo4733r());
        sb.append(":");
        sb.append(this.f4294e);
        sb.append("(");
        sb.append(this.f4299j ? Integer.valueOf(this.f4296g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f4301l.size());
        sb.append(":d=");
        sb.append(this.f4300k.size());
        sb.append(">");
        return sb.toString();
    }
}
