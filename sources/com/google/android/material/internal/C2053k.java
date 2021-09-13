package com.google.android.material.internal;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewParent;
import p010b.p034g.p043k.OnApplyWindowInsetsListener;
import p010b.p034g.p043k.ViewCompat;
import p010b.p034g.p043k.WindowInsetsCompat;

/* renamed from: com.google.android.material.internal.k */
/* compiled from: ViewUtils */
public class C2053k {

    /* renamed from: com.google.android.material.internal.k$a */
    /* compiled from: ViewUtils */
    static class C2054a implements OnApplyWindowInsetsListener {

        /* renamed from: a */
        final /* synthetic */ C2056c f13200a;

        /* renamed from: b */
        final /* synthetic */ C2057d f13201b;

        C2054a(C2056c cVar, C2057d dVar) {
            this.f13200a = cVar;
            this.f13201b = dVar;
        }

        /* renamed from: a */
        public WindowInsetsCompat mo382a(View view, WindowInsetsCompat e0Var) {
            return this.f13200a.mo15157a(view, e0Var, new C2057d(this.f13201b));
        }
    }

    /* renamed from: com.google.android.material.internal.k$b */
    /* compiled from: ViewUtils */
    static class C2055b implements OnAttachStateChangeListener {
        C2055b() {
        }

        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            ViewCompat.m5567l0(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: com.google.android.material.internal.k$c */
    /* compiled from: ViewUtils */
    public interface C2056c {
        /* renamed from: a */
        WindowInsetsCompat mo15157a(View view, WindowInsetsCompat e0Var, C2057d dVar);
    }

    /* renamed from: com.google.android.material.internal.k$d */
    /* compiled from: ViewUtils */
    public static class C2057d {

        /* renamed from: a */
        public int f13202a;

        /* renamed from: b */
        public int f13203b;

        /* renamed from: c */
        public int f13204c;

        /* renamed from: d */
        public int f13205d;

        public C2057d(int i, int i2, int i3, int i4) {
            this.f13202a = i;
            this.f13203b = i2;
            this.f13204c = i3;
            this.f13205d = i4;
        }

        public C2057d(C2057d dVar) {
            this.f13202a = dVar.f13202a;
            this.f13203b = dVar.f13203b;
            this.f13204c = dVar.f13204c;
            this.f13205d = dVar.f13205d;
        }
    }

    /* renamed from: a */
    public static void m16230a(View view, C2056c cVar) {
        ViewCompat.m5595z0(view, new C2054a(cVar, new C2057d(ViewCompat.m5526I(view), view.getPaddingTop(), ViewCompat.m5524H(view), view.getPaddingBottom())));
        m16235f(view);
    }

    /* renamed from: b */
    public static float m16231b(Context context, int i) {
        return TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    /* renamed from: c */
    public static float m16232c(View view) {
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += ViewCompat.m5588w((View) parent);
        }
        return f;
    }

    /* renamed from: d */
    public static boolean m16233d(View view) {
        return ViewCompat.m5514C(view) == 1;
    }

    /* renamed from: e */
    public static Mode m16234e(int i, Mode mode) {
        if (i == 3) {
            return Mode.SRC_OVER;
        }
        if (i == 5) {
            return Mode.SRC_IN;
        }
        if (i == 9) {
            return Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return Mode.MULTIPLY;
            case 15:
                return Mode.SCREEN;
            case 16:
                return Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: f */
    public static void m16235f(View view) {
        if (ViewCompat.m5536S(view)) {
            ViewCompat.m5567l0(view);
        } else {
            view.addOnAttachStateChangeListener(new C2055b());
        }
    }
}
