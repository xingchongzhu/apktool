package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView.C0401a0;
import androidx.recyclerview.widget.RecyclerView.C0421o;
import androidx.recyclerview.widget.RecyclerView.C0426p;
import androidx.recyclerview.widget.RecyclerView.C0438z;
import androidx.recyclerview.widget.RecyclerView.C0438z.C0439a;

/* renamed from: androidx.recyclerview.widget.h */
public class LinearSmoothScroller extends C0438z {

    /* renamed from: i */
    protected final LinearInterpolator f3122i = new LinearInterpolator();

    /* renamed from: j */
    protected final DecelerateInterpolator f3123j = new DecelerateInterpolator();

    /* renamed from: k */
    protected PointF f3124k;

    /* renamed from: l */
    private final DisplayMetrics f3125l;

    /* renamed from: m */
    private boolean f3126m = false;

    /* renamed from: n */
    private float f3127n;

    /* renamed from: o */
    protected int f3128o = 0;

    /* renamed from: p */
    protected int f3129p = 0;

    public LinearSmoothScroller(Context context) {
        this.f3125l = context.getResources().getDisplayMetrics();
    }

    /* renamed from: A */
    private float m3807A() {
        if (!this.f3126m) {
            this.f3127n = mo3851v(this.f3125l);
            this.f3126m = true;
        }
        return this.f3127n;
    }

    /* renamed from: y */
    private int m3808y(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public int mo3846B() {
        PointF pointF = this.f3124k;
        if (pointF != null) {
            float f = pointF.y;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo3847C(C0439a aVar) {
        PointF a = mo3640a(mo3645f());
        if (a == null || (a.x == 0.0f && a.y == 0.0f)) {
            aVar.mo3659b(mo3645f());
            mo3657r();
            return;
        }
        mo3648i(a);
        this.f3124k = a;
        this.f3128o = (int) (a.x * 10000.0f);
        this.f3129p = (int) (a.y * 10000.0f);
        aVar.mo3661d((int) (((float) this.f3128o) * 1.2f), (int) (((float) this.f3129p) * 1.2f), (int) (((float) mo3853x(10000)) * 1.2f), this.f3122i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo3651l(int i, int i2, C0401a0 a0Var, C0439a aVar) {
        if (mo3642c() == 0) {
            mo3657r();
            return;
        }
        this.f3128o = m3808y(this.f3128o, i);
        int y = m3808y(this.f3129p, i2);
        this.f3129p = y;
        if (this.f3128o == 0 && y == 0) {
            mo3847C(aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo3652m() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo3653n() {
        this.f3129p = 0;
        this.f3128o = 0;
        this.f3124k = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo3654o(View view, C0401a0 a0Var, C0439a aVar) {
        int t = mo3849t(view, mo3854z());
        int u = mo3850u(view, mo3846B());
        int w = mo3852w((int) Math.sqrt((double) ((t * t) + (u * u))));
        if (w > 0) {
            aVar.mo3661d(-t, -u, w, this.f3123j);
        }
    }

    /* renamed from: s */
    public int mo3848s(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 == 0) {
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        } else if (i5 == 1) {
            return i4 - i2;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    /* renamed from: t */
    public int mo3849t(View view, int i) {
        C0421o e = mo3644e();
        if (e == null || !e.mo3126k()) {
            return 0;
        }
        C0426p pVar = (C0426p) view.getLayoutParams();
        return mo3848s(e.mo3503Q(view) - pVar.leftMargin, e.mo3507T(view) + pVar.rightMargin, e.mo3526e0(), e.mo3547o0() - e.mo3528f0(), i);
    }

    /* renamed from: u */
    public int mo3850u(View view, int i) {
        C0421o e = mo3644e();
        if (e == null || !e.mo3127l()) {
            return 0;
        }
        C0426p pVar = (C0426p) view.getLayoutParams();
        return mo3848s(e.mo3508U(view) - pVar.topMargin, e.mo3500O(view) + pVar.bottomMargin, e.mo3530g0(), e.mo3511W() - e.mo3524d0(), i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public float mo3851v(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public int mo3852w(int i) {
        double x = (double) mo3853x(i);
        Double.isNaN(x);
        return (int) Math.ceil(x / 0.3356d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public int mo3853x(int i) {
        return (int) Math.ceil((double) (((float) Math.abs(i)) * m3807A()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public int mo3854z() {
        PointF pointF = this.f3124k;
        if (pointF != null) {
            float f = pointF.x;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }
}
