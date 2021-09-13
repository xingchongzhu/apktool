package p010b.p062p;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: b.p.d0 */
class ViewUtilsApi19 extends ViewUtilsBase {

    /* renamed from: e */
    private static boolean f5008e = true;

    ViewUtilsApi19() {
    }

    /* renamed from: a */
    public void mo5353a(View view) {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public float mo5354c(View view) {
        if (f5008e) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f5008e = false;
            }
        }
        return view.getAlpha();
    }

    /* renamed from: d */
    public void mo5355d(View view) {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: f */
    public void mo5356f(View view, float f) {
        if (f5008e) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f5008e = false;
            }
        }
        view.setAlpha(f);
    }
}
