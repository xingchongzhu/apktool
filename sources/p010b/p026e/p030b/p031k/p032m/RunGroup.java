package p010b.p026e.p030b.p031k.p032m;

import java.util.ArrayList;
import p010b.p026e.p030b.p031k.ConstraintWidgetContainer;

/* renamed from: b.e.b.k.m.m */
class RunGroup {

    /* renamed from: a */
    public static int f4315a;

    /* renamed from: b */
    public int f4316b = 0;

    /* renamed from: c */
    public boolean f4317c = false;

    /* renamed from: d */
    WidgetRun f4318d = null;

    /* renamed from: e */
    WidgetRun f4319e = null;

    /* renamed from: f */
    ArrayList<WidgetRun> f4320f = new ArrayList<>();

    /* renamed from: g */
    int f4321g = 0;

    /* renamed from: h */
    int f4322h;

    public RunGroup(WidgetRun pVar, int i) {
        int i2 = f4315a;
        this.f4321g = i2;
        f4315a = i2 + 1;
        this.f4318d = pVar;
        this.f4319e = pVar;
        this.f4322h = i;
    }

    /* renamed from: c */
    private long m4931c(DependencyNode fVar, long j) {
        WidgetRun pVar = fVar.f4293d;
        if (pVar instanceof HelperReferences) {
            return j;
        }
        int size = fVar.f4300k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            Dependency dVar = (Dependency) fVar.f4300k.get(i);
            if (dVar instanceof DependencyNode) {
                DependencyNode fVar2 = (DependencyNode) dVar;
                if (fVar2.f4293d != pVar) {
                    j2 = Math.min(j2, m4931c(fVar2, ((long) fVar2.f4295f) + j));
                }
            }
        }
        if (fVar == pVar.f4349i) {
            long j3 = j - pVar.mo4803j();
            j2 = Math.min(Math.min(j2, m4931c(pVar.f4348h, j3)), j3 - ((long) pVar.f4348h.f4295f));
        }
        return j2;
    }

    /* renamed from: d */
    private long m4932d(DependencyNode fVar, long j) {
        WidgetRun pVar = fVar.f4293d;
        if (pVar instanceof HelperReferences) {
            return j;
        }
        int size = fVar.f4300k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            Dependency dVar = (Dependency) fVar.f4300k.get(i);
            if (dVar instanceof DependencyNode) {
                DependencyNode fVar2 = (DependencyNode) dVar;
                if (fVar2.f4293d != pVar) {
                    j2 = Math.max(j2, m4932d(fVar2, ((long) fVar2.f4295f) + j));
                }
            }
        }
        if (fVar == pVar.f4348h) {
            long j3 = j + pVar.mo4803j();
            j2 = Math.max(Math.max(j2, m4932d(pVar.f4349i, j3)), j3 - ((long) pVar.f4349i.f4295f));
        }
        return j2;
    }

    /* renamed from: a */
    public void mo4821a(WidgetRun pVar) {
        this.f4320f.add(pVar);
        this.f4319e = pVar;
    }

    /* renamed from: b */
    public long mo4822b(ConstraintWidgetContainer fVar, int i) {
        long j;
        int i2;
        long j2;
        WidgetRun pVar = this.f4318d;
        long j3 = 0;
        if (pVar instanceof ChainRun) {
            if (((ChainRun) pVar).f4346f != i) {
                return 0;
            }
        } else if (i == 0) {
            if (!(pVar instanceof HorizontalWidgetRun)) {
                return 0;
            }
        } else if (!(pVar instanceof VerticalWidgetRun)) {
            return 0;
        }
        DependencyNode fVar2 = (i == 0 ? fVar.f4160f : fVar.f4162g).f4348h;
        DependencyNode fVar3 = (i == 0 ? fVar.f4160f : fVar.f4162g).f4349i;
        boolean contains = pVar.f4348h.f4301l.contains(fVar2);
        boolean contains2 = this.f4318d.f4349i.f4301l.contains(fVar3);
        long j4 = this.f4318d.mo4803j();
        if (!contains || !contains2) {
            if (contains) {
                DependencyNode fVar4 = this.f4318d.f4348h;
                j = Math.max(m4932d(fVar4, (long) fVar4.f4295f), ((long) this.f4318d.f4348h.f4295f) + j4);
            } else if (contains2) {
                DependencyNode fVar5 = this.f4318d.f4349i;
                j = Math.max(-m4931c(fVar5, (long) fVar5.f4295f), ((long) (-this.f4318d.f4349i.f4295f)) + j4);
            } else {
                WidgetRun pVar2 = this.f4318d;
                j2 = ((long) pVar2.f4348h.f4295f) + pVar2.mo4803j();
                i2 = this.f4318d.f4349i.f4295f;
            }
            return j;
        }
        long d = m4932d(this.f4318d.f4348h, 0);
        long c = m4931c(this.f4318d.f4349i, 0);
        long j5 = d - j4;
        WidgetRun pVar3 = this.f4318d;
        int i3 = pVar3.f4349i.f4295f;
        if (j5 >= ((long) (-i3))) {
            j5 += (long) i3;
        }
        long j6 = (-c) - j4;
        int i4 = pVar3.f4348h.f4295f;
        long j7 = j6 - ((long) i4);
        if (j7 >= ((long) i4)) {
            j7 -= (long) i4;
        }
        float o = pVar3.f4342b.mo4727o(i);
        if (o > 0.0f) {
            j3 = (long) ((((float) j7) / o) + (((float) j5) / (1.0f - o)));
        }
        float f = (float) j3;
        long j8 = ((long) ((f * o) + 0.5f)) + j4 + ((long) ((f * (1.0f - o)) + 0.5f));
        WidgetRun pVar4 = this.f4318d;
        j2 = ((long) pVar4.f4348h.f4295f) + j8;
        i2 = pVar4.f4349i.f4295f;
        j = j2 - ((long) i2);
        return j;
    }
}
