package p010b.p062p;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.view.View;

/* renamed from: b.p.g0 */
class ViewUtilsApi23 extends ViewUtilsApi22 {

    /* renamed from: i */
    private static boolean f5026i = true;

    ViewUtilsApi23() {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: g */
    public void mo5362g(View view, int i) {
        if (VERSION.SDK_INT == 28) {
            super.mo5362g(view, i);
        } else if (f5026i) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f5026i = false;
            }
        }
    }
}
