package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView.C0421o;
import androidx.recyclerview.widget.RecyclerView.C0428r;
import androidx.recyclerview.widget.RecyclerView.C0430t;
import androidx.recyclerview.widget.RecyclerView.C0438z;
import androidx.recyclerview.widget.RecyclerView.C0438z.C0440b;

/* renamed from: androidx.recyclerview.widget.o */
public abstract class SnapHelper extends C0428r {

    /* renamed from: a */
    RecyclerView f3142a;

    /* renamed from: b */
    private Scroller f3143b;

    /* renamed from: c */
    private final C0430t f3144c = new C0476a();

    /* renamed from: androidx.recyclerview.widget.o$a */
    /* compiled from: SnapHelper */
    class C0476a extends C0430t {

        /* renamed from: a */
        boolean f3145a = false;

        C0476a() {
        }

        /* renamed from: a */
        public void mo3583a(RecyclerView recyclerView, int i) {
            super.mo3583a(recyclerView, i);
            if (i == 0 && this.f3145a) {
                this.f3145a = false;
                SnapHelper.this.mo3906k();
            }
        }

        /* renamed from: b */
        public void mo3584b(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.f3145a = true;
            }
        }
    }

    /* renamed from: f */
    private void m3935f() {
        this.f3142a.mo3197a1(this.f3144c);
        this.f3142a.setOnFlingListener(null);
    }

    /* renamed from: i */
    private void m3936i() throws IllegalStateException {
        if (this.f3142a.getOnFlingListener() == null) {
            this.f3142a.mo3254k(this.f3144c);
            this.f3142a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    /* renamed from: j */
    private boolean m3937j(C0421o oVar, int i, int i2) {
        if (!(oVar instanceof C0440b)) {
            return false;
        }
        C0438z d = mo3905d(oVar);
        if (d == null) {
            return false;
        }
        int h = mo3877h(oVar, i, i2);
        if (h == -1) {
            return false;
        }
        d.mo3655p(h);
        oVar.mo3494J1(d);
        return true;
    }

    /* renamed from: a */
    public boolean mo3579a(int i, int i2) {
        C0421o layoutManager = this.f3142a.getLayoutManager();
        boolean z = false;
        if (layoutManager == null || this.f3142a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f3142a.getMinFlingVelocity();
        if ((Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && m3937j(layoutManager, i, i2)) {
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    public void mo3904b(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f3142a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                m3935f();
            }
            this.f3142a = recyclerView;
            if (recyclerView != null) {
                m3936i();
                this.f3143b = new Scroller(this.f3142a.getContext(), new DecelerateInterpolator());
                mo3906k();
            }
        }
    }

    /* renamed from: c */
    public abstract int[] mo3874c(C0421o oVar, View view);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C0438z mo3905d(C0421o oVar) {
        return mo3875e(oVar);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: e */
    public abstract LinearSmoothScroller mo3875e(C0421o oVar);

    /* renamed from: g */
    public abstract View mo3876g(C0421o oVar);

    /* renamed from: h */
    public abstract int mo3877h(C0421o oVar, int i, int i2);

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo3906k() {
        RecyclerView recyclerView = this.f3142a;
        if (recyclerView != null) {
            C0421o layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                View g = mo3876g(layoutManager);
                if (g != null) {
                    int[] c = mo3874c(layoutManager, g);
                    if (!(c[0] == 0 && c[1] == 0)) {
                        this.f3142a.mo3260n1(c[0], c[1]);
                    }
                }
            }
        }
    }
}
