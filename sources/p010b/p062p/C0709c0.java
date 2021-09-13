package p010b.p062p;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Property;
import android.view.View;
import p010b.p034g.p043k.ViewCompat;

/* renamed from: b.p.c0 */
/* compiled from: ViewUtils */
class C0709c0 {

    /* renamed from: a */
    private static final ViewUtilsBase f5001a;

    /* renamed from: b */
    static final Property<View, Float> f5002b = new C0710a(Float.class, "translationAlpha");

    /* renamed from: c */
    static final Property<View, Rect> f5003c = new C0711b(Rect.class, "clipBounds");

    /* renamed from: b.p.c0$a */
    /* compiled from: ViewUtils */
    static class C0710a extends Property<View, Float> {
        C0710a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(C0709c0.m5909c(view));
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            C0709c0.m5913g(view, f.floatValue());
        }
    }

    /* renamed from: b.p.c0$b */
    /* compiled from: ViewUtils */
    static class C0711b extends Property<View, Rect> {
        C0711b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Rect get(View view) {
            return ViewCompat.m5584u(view);
        }

        /* renamed from: b */
        public void set(View view, Rect rect) {
            ViewCompat.m5585u0(view, rect);
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 29) {
            f5001a = new ViewUtilsApi29();
        } else if (i >= 23) {
            f5001a = new ViewUtilsApi23();
        } else if (i >= 22) {
            f5001a = new ViewUtilsApi22();
        } else if (i >= 21) {
            f5001a = new ViewUtilsApi21();
        } else if (i >= 19) {
            f5001a = new ViewUtilsApi19();
        } else {
            f5001a = new ViewUtilsBase();
        }
    }

    /* renamed from: a */
    static void m5907a(View view) {
        f5001a.mo5353a(view);
    }

    /* renamed from: b */
    static ViewOverlayImpl m5908b(View view) {
        if (VERSION.SDK_INT >= 18) {
            return new ViewOverlayApi18(view);
        }
        return ViewOverlayApi14.m6126e(view);
    }

    /* renamed from: c */
    static float m5909c(View view) {
        return f5001a.mo5354c(view);
    }

    /* renamed from: d */
    static WindowIdImpl m5910d(View view) {
        if (VERSION.SDK_INT >= 18) {
            return new WindowIdApi18(view);
        }
        return new WindowIdApi14(view.getWindowToken());
    }

    /* renamed from: e */
    static void m5911e(View view) {
        f5001a.mo5355d(view);
    }

    /* renamed from: f */
    static void m5912f(View view, int i, int i2, int i3, int i4) {
        f5001a.mo5360e(view, i, i2, i3, i4);
    }

    /* renamed from: g */
    static void m5913g(View view, float f) {
        f5001a.mo5356f(view, f);
    }

    /* renamed from: h */
    static void m5914h(View view, int i) {
        f5001a.mo5362g(view, i);
    }

    /* renamed from: i */
    static void m5915i(View view, Matrix matrix) {
        f5001a.mo5358h(view, matrix);
    }

    /* renamed from: j */
    static void m5916j(View view, Matrix matrix) {
        f5001a.mo5359i(view, matrix);
    }
}
