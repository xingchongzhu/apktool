package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.C0401a0;
import androidx.recyclerview.widget.RecyclerView.C0421o;
import androidx.recyclerview.widget.RecyclerView.C0438z.C0439a;
import androidx.recyclerview.widget.RecyclerView.C0438z.C0440b;

/* renamed from: androidx.recyclerview.widget.k */
public class PagerSnapHelper extends SnapHelper {

    /* renamed from: d */
    private OrientationHelper f3134d;

    /* renamed from: e */
    private OrientationHelper f3135e;

    /* renamed from: androidx.recyclerview.widget.k$a */
    /* compiled from: PagerSnapHelper */
    class C0474a extends LinearSmoothScroller {
        C0474a(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        /* renamed from: o */
        public void mo3654o(View view, C0401a0 a0Var, C0439a aVar) {
            PagerSnapHelper kVar = PagerSnapHelper.this;
            int[] c = kVar.mo3874c(kVar.f3142a.getLayoutManager(), view);
            int i = c[0];
            int i2 = c[1];
            int w = mo3852w(Math.max(Math.abs(i), Math.abs(i2)));
            if (w > 0) {
                aVar.mo3661d(i, i2, w, this.f3123j);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public float mo3851v(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }

        /* access modifiers changed from: protected */
        /* renamed from: x */
        public int mo3853x(int i) {
            return Math.min(100, super.mo3853x(i));
        }
    }

    /* renamed from: l */
    private int m3877l(C0421o oVar, View view, OrientationHelper jVar) {
        return (jVar.mo3861g(view) + (jVar.mo3859e(view) / 2)) - (jVar.mo3867m() + (jVar.mo3868n() / 2));
    }

    /* renamed from: m */
    private View m3878m(C0421o oVar, OrientationHelper jVar) {
        int J = oVar.mo3493J();
        View view = null;
        if (J == 0) {
            return null;
        }
        int m = jVar.mo3867m() + (jVar.mo3868n() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < J; i2++) {
            View I = oVar.mo3492I(i2);
            int abs = Math.abs((jVar.mo3861g(I) + (jVar.mo3859e(I) / 2)) - m);
            if (abs < i) {
                view = I;
                i = abs;
            }
        }
        return view;
    }

    /* renamed from: n */
    private OrientationHelper m3879n(C0421o oVar) {
        OrientationHelper jVar = this.f3135e;
        if (jVar == null || jVar.f3131a != oVar) {
            this.f3135e = OrientationHelper.m3830a(oVar);
        }
        return this.f3135e;
    }

    /* renamed from: o */
    private OrientationHelper m3880o(C0421o oVar) {
        if (oVar.mo3127l()) {
            return m3881p(oVar);
        }
        if (oVar.mo3126k()) {
            return m3879n(oVar);
        }
        return null;
    }

    /* renamed from: p */
    private OrientationHelper m3881p(C0421o oVar) {
        OrientationHelper jVar = this.f3134d;
        if (jVar == null || jVar.f3131a != oVar) {
            this.f3134d = OrientationHelper.m3832c(oVar);
        }
        return this.f3134d;
    }

    /* renamed from: q */
    private boolean m3882q(C0421o oVar, int i, int i2) {
        boolean z = true;
        if (oVar.mo3126k()) {
            if (i <= 0) {
                z = false;
            }
            return z;
        }
        if (i2 <= 0) {
            z = false;
        }
        return z;
    }

    /* renamed from: r */
    private boolean m3883r(C0421o oVar) {
        int Y = oVar.mo3513Y();
        if (!(oVar instanceof C0440b)) {
            return false;
        }
        PointF a = ((C0440b) oVar).mo3117a(Y - 1);
        if (a == null) {
            return false;
        }
        if (a.x < 0.0f || a.y < 0.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public int[] mo3874c(C0421o oVar, View view) {
        int[] iArr = new int[2];
        if (oVar.mo3126k()) {
            iArr[0] = m3877l(oVar, view, m3879n(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.mo3127l()) {
            iArr[1] = m3877l(oVar, view, m3881p(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public LinearSmoothScroller mo3875e(C0421o oVar) {
        if (!(oVar instanceof C0440b)) {
            return null;
        }
        return new C0474a(this.f3142a.getContext());
    }

    /* renamed from: g */
    public View mo3876g(C0421o oVar) {
        if (oVar.mo3127l()) {
            return m3878m(oVar, m3881p(oVar));
        }
        if (oVar.mo3126k()) {
            return m3878m(oVar, m3879n(oVar));
        }
        return null;
    }

    /* renamed from: h */
    public int mo3877h(C0421o oVar, int i, int i2) {
        int Y = oVar.mo3513Y();
        if (Y == 0) {
            return -1;
        }
        OrientationHelper o = m3880o(oVar);
        if (o == null) {
            return -1;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int J = oVar.mo3493J();
        View view = null;
        View view2 = null;
        for (int i5 = 0; i5 < J; i5++) {
            View I = oVar.mo3492I(i5);
            if (I != null) {
                int l = m3877l(oVar, I, o);
                if (l <= 0 && l > i3) {
                    view2 = I;
                    i3 = l;
                }
                if (l >= 0 && l < i4) {
                    view = I;
                    i4 = l;
                }
            }
        }
        boolean q = m3882q(oVar, i, i2);
        if (q && view != null) {
            return oVar.mo3533h0(view);
        }
        if (!q && view2 != null) {
            return oVar.mo3533h0(view2);
        }
        if (q) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int h0 = oVar.mo3533h0(view) + (m3883r(oVar) == q ? -1 : 1);
        if (h0 < 0 || h0 >= Y) {
            return -1;
        }
        return h0;
    }
}
