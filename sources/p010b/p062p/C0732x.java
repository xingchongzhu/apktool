package p010b.p062p;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.view.ViewGroup;

/* renamed from: b.p.x */
/* compiled from: ViewGroupUtils */
class C0732x {

    /* renamed from: a */
    private static boolean f5130a = true;

    /* renamed from: a */
    static ViewGroupOverlayImpl m6121a(ViewGroup viewGroup) {
        if (VERSION.SDK_INT >= 18) {
            return new ViewGroupOverlayApi18(viewGroup);
        }
        return ViewGroupOverlayApi14.m6112g(viewGroup);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    private static void m6122b(ViewGroup viewGroup, boolean z) {
        if (f5130a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f5130a = false;
            }
        }
    }

    /* renamed from: c */
    static void m6123c(ViewGroup viewGroup, boolean z) {
        int i = VERSION.SDK_INT;
        if (i >= 29) {
            viewGroup.suppressLayout(z);
        } else if (i >= 18) {
            m6122b(viewGroup, z);
        } else {
            ViewGroupUtilsApi14.m6125b(viewGroup, z);
        }
    }
}
