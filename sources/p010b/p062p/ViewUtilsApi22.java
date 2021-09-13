package p010b.p062p;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: b.p.f0 */
class ViewUtilsApi22 extends ViewUtilsApi21 {

    /* renamed from: h */
    private static boolean f5025h = true;

    ViewUtilsApi22() {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: e */
    public void mo5360e(View view, int i, int i2, int i3, int i4) {
        if (f5025h) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f5025h = false;
            }
        }
    }
}
