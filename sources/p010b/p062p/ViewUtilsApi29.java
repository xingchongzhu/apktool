package p010b.p062p;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: b.p.h0 */
class ViewUtilsApi29 extends ViewUtilsApi23 {
    ViewUtilsApi29() {
    }

    /* renamed from: c */
    public float mo5354c(View view) {
        return view.getTransitionAlpha();
    }

    /* renamed from: e */
    public void mo5360e(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    /* renamed from: f */
    public void mo5356f(View view, float f) {
        view.setTransitionAlpha(f);
    }

    /* renamed from: g */
    public void mo5362g(View view, int i) {
        view.setTransitionVisibility(i);
    }

    /* renamed from: h */
    public void mo5358h(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    /* renamed from: i */
    public void mo5359i(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
