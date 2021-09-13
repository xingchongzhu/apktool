package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView.C0407d0;
import androidx.recyclerview.widget.RecyclerView.C0415l.C0418c;
import p010b.p025d.LongSparseArray;
import p010b.p025d.SimpleArrayMap;
import p010b.p034g.p042j.C0610e;
import p010b.p034g.p042j.C0611f;

/* renamed from: androidx.recyclerview.widget.q */
class ViewInfoStore {

    /* renamed from: a */
    final SimpleArrayMap<C0407d0, C0479a> f3154a = new SimpleArrayMap<>();

    /* renamed from: b */
    final LongSparseArray<C0407d0> f3155b = new LongSparseArray<>();

    /* renamed from: androidx.recyclerview.widget.q$a */
    /* compiled from: ViewInfoStore */
    static class C0479a {

        /* renamed from: a */
        static C0610e<C0479a> f3156a = new C0611f(20);

        /* renamed from: b */
        int f3157b;

        /* renamed from: c */
        C0418c f3158c;

        /* renamed from: d */
        C0418c f3159d;

        private C0479a() {
        }

        /* renamed from: a */
        static void m3977a() {
            do {
            } while (f3156a.mo4946b() != null);
        }

        /* renamed from: b */
        static C0479a m3978b() {
            C0479a aVar = (C0479a) f3156a.mo4946b();
            return aVar == null ? new C0479a() : aVar;
        }

        /* renamed from: c */
        static void m3979c(C0479a aVar) {
            aVar.f3157b = 0;
            aVar.f3158c = null;
            aVar.f3159d = null;
            f3156a.mo4945a(aVar);
        }
    }

    /* renamed from: androidx.recyclerview.widget.q$b */
    /* compiled from: ViewInfoStore */
    interface C0480b {
        /* renamed from: a */
        void mo3345a(C0407d0 d0Var);

        /* renamed from: b */
        void mo3346b(C0407d0 d0Var, C0418c cVar, C0418c cVar2);

        /* renamed from: c */
        void mo3347c(C0407d0 d0Var, C0418c cVar, C0418c cVar2);

        /* renamed from: d */
        void mo3348d(C0407d0 d0Var, C0418c cVar, C0418c cVar2);
    }

    ViewInfoStore() {
    }

    /* renamed from: l */
    private C0418c m3960l(C0407d0 d0Var, int i) {
        C0418c cVar;
        int f = this.f3154a.mo4502f(d0Var);
        if (f < 0) {
            return null;
        }
        C0479a aVar = (C0479a) this.f3154a.mo4513m(f);
        if (aVar != null) {
            int i2 = aVar.f3157b;
            if ((i2 & i) != 0) {
                int i3 = (i ^ -1) & i2;
                aVar.f3157b = i3;
                if (i == 4) {
                    cVar = aVar.f3158c;
                } else if (i == 8) {
                    cVar = aVar.f3159d;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    this.f3154a.mo4511k(f);
                    C0479a.m3979c(aVar);
                }
                return cVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3914a(C0407d0 d0Var, C0418c cVar) {
        C0479a aVar = (C0479a) this.f3154a.get(d0Var);
        if (aVar == null) {
            aVar = C0479a.m3978b();
            this.f3154a.put(d0Var, aVar);
        }
        aVar.f3157b |= 2;
        aVar.f3158c = cVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo3915b(C0407d0 d0Var) {
        C0479a aVar = (C0479a) this.f3154a.get(d0Var);
        if (aVar == null) {
            aVar = C0479a.m3978b();
            this.f3154a.put(d0Var, aVar);
        }
        aVar.f3157b |= 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo3916c(long j, C0407d0 d0Var) {
        this.f3155b.mo4421i(j, d0Var);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo3917d(C0407d0 d0Var, C0418c cVar) {
        C0479a aVar = (C0479a) this.f3154a.get(d0Var);
        if (aVar == null) {
            aVar = C0479a.m3978b();
            this.f3154a.put(d0Var, aVar);
        }
        aVar.f3159d = cVar;
        aVar.f3157b |= 8;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo3918e(C0407d0 d0Var, C0418c cVar) {
        C0479a aVar = (C0479a) this.f3154a.get(d0Var);
        if (aVar == null) {
            aVar = C0479a.m3978b();
            this.f3154a.put(d0Var, aVar);
        }
        aVar.f3158c = cVar;
        aVar.f3157b |= 4;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo3919f() {
        this.f3154a.clear();
        this.f3155b.mo4414b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public C0407d0 mo3920g(long j) {
        return (C0407d0) this.f3155b.mo4417e(j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public boolean mo3921h(C0407d0 d0Var) {
        C0479a aVar = (C0479a) this.f3154a.get(d0Var);
        if (aVar == null || (aVar.f3157b & 1) == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public boolean mo3922i(C0407d0 d0Var) {
        C0479a aVar = (C0479a) this.f3154a.get(d0Var);
        return (aVar == null || (aVar.f3157b & 4) == 0) ? false : true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo3923j() {
        C0479a.m3977a();
    }

    /* renamed from: k */
    public void mo3924k(C0407d0 d0Var) {
        mo3928p(d0Var);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public C0418c mo3925m(C0407d0 d0Var) {
        return m3960l(d0Var, 8);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public C0418c mo3926n(C0407d0 d0Var) {
        return m3960l(d0Var, 4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public void mo3927o(C0480b bVar) {
        for (int size = this.f3154a.size() - 1; size >= 0; size--) {
            C0407d0 d0Var = (C0407d0) this.f3154a.mo4508i(size);
            C0479a aVar = (C0479a) this.f3154a.mo4511k(size);
            int i = aVar.f3157b;
            if ((i & 3) == 3) {
                bVar.mo3345a(d0Var);
            } else if ((i & 1) != 0) {
                C0418c cVar = aVar.f3158c;
                if (cVar == null) {
                    bVar.mo3345a(d0Var);
                } else {
                    bVar.mo3347c(d0Var, cVar, aVar.f3159d);
                }
            } else if ((i & 14) == 14) {
                bVar.mo3346b(d0Var, aVar.f3158c, aVar.f3159d);
            } else if ((i & 12) == 12) {
                bVar.mo3348d(d0Var, aVar.f3158c, aVar.f3159d);
            } else if ((i & 4) != 0) {
                bVar.mo3347c(d0Var, aVar.f3158c, null);
            } else if ((i & 8) != 0) {
                bVar.mo3346b(d0Var, aVar.f3158c, aVar.f3159d);
            }
            C0479a.m3979c(aVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public void mo3928p(C0407d0 d0Var) {
        C0479a aVar = (C0479a) this.f3154a.get(d0Var);
        if (aVar != null) {
            aVar.f3157b &= -2;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public void mo3929q(C0407d0 d0Var) {
        int l = this.f3155b.mo4424l() - 1;
        while (true) {
            if (l < 0) {
                break;
            } else if (d0Var == this.f3155b.mo4425m(l)) {
                this.f3155b.mo4423k(l);
                break;
            } else {
                l--;
            }
        }
        C0479a aVar = (C0479a) this.f3154a.remove(d0Var);
        if (aVar != null) {
            C0479a.m3979c(aVar);
        }
    }
}
