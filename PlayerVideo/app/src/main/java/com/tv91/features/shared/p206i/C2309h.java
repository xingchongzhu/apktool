package com.tv91.features.shared.p206i;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0421o;
import androidx.recyclerview.widget.RecyclerView.C0430t;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.features.shared.i.h */
/* compiled from: Scrolls */
class C2309h extends C0430t {

    /* renamed from: a */
    private final int f14003a;

    /* renamed from: b */
    private final Consumer<C2310i> f14004b;

    /* renamed from: c */
    static /* synthetic */ void m17398c(C2310i iVar) {
    }

    /* renamed from: d */
    private void m17399d(LinearLayoutManager linearLayoutManager, int i, int i2) {
        if (i2 != 0) {
            int Y = linearLayoutManager.mo3513Y();
            boolean z = true;
            if (i2 > 0) {
                int b2 = linearLayoutManager.mo3119b2();
                boolean z2 = b2 == Y && i == 0;
                if (b2 + this.f14003a < Y) {
                    z = false;
                }
                if (z2) {
                    this.f14004b.mo4887a(C2310i.AT_BOTTOM);
                } else if (z) {
                    this.f14004b.mo4887a(C2310i.REACH_BOTTOM);
                } else {
                    this.f14004b.mo4887a(C2310i.SCROLL_DOWN);
                }
            } else {
                int V1 = linearLayoutManager.mo3114V1();
                boolean z3 = V1 == 0;
                if (V1 - this.f14003a > 0) {
                    z = false;
                }
                if (z3) {
                    this.f14004b.mo4887a(C2310i.AT_TOP);
                } else if (z) {
                    this.f14004b.mo4887a(C2310i.REACH_TOP);
                } else {
                    this.f14004b.mo4887a(C2310i.SCROLL_UP);
                }
            }
        }
    }

    /* renamed from: e */
    private void m17400e(StaggeredGridLayoutManager staggeredGridLayoutManager, int i, int i2) {
        if (i2 != 0) {
            int Y = staggeredGridLayoutManager.mo3513Y();
            int t2 = staggeredGridLayoutManager.mo3681t2();
            int[] iArr = new int[t2];
            boolean z = true;
            if (i2 > 0) {
                staggeredGridLayoutManager.mo3677h2(iArr);
                int i3 = t2 - 1;
                boolean z2 = iArr[i3] == Y && i == 0;
                if (iArr[i3] + this.f14003a < Y) {
                    z = false;
                }
                if (z2) {
                    this.f14004b.mo4887a(C2310i.AT_BOTTOM);
                } else if (z) {
                    this.f14004b.mo4887a(C2310i.REACH_BOTTOM);
                } else {
                    this.f14004b.mo4887a(C2310i.SCROLL_DOWN);
                }
            } else {
                staggeredGridLayoutManager.mo3673c2(iArr);
                boolean z3 = iArr[0] == 0 && i == 0;
                if (iArr[0] - this.f14003a > 0) {
                    z = false;
                }
                if (z3) {
                    this.f14004b.mo4887a(C2310i.AT_TOP);
                } else if (z) {
                    this.f14004b.mo4887a(C2310i.REACH_TOP);
                } else {
                    this.f14004b.mo4887a(C2310i.SCROLL_UP);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo3584b(RecyclerView recyclerView, int i, int i2) {
        C0421o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (linearLayoutManager.mo3132r2() == 1) {
                m17399d(linearLayoutManager, recyclerView.getScrollState(), i2);
            } else {
                m17399d(linearLayoutManager, recyclerView.getScrollState(), i);
            }
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            if (staggeredGridLayoutManager.mo3680s2() == 1) {
                m17400e(staggeredGridLayoutManager, recyclerView.getScrollState(), i2);
            } else {
                m17400e(staggeredGridLayoutManager, recyclerView.getScrollState(), i);
            }
        }
    }

    private C2309h(int i, Consumer<C2310i> aVar) {
        this.f14003a = i;
        if (aVar == null) {
            aVar = C2303c.f13994a;
        }
        this.f14004b = aVar;
    }
}
