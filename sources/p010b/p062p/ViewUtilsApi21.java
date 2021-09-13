package p010b.p062p;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* renamed from: b.p.e0 */
class ViewUtilsApi21 extends ViewUtilsApi19 {

    /* renamed from: f */
    private static boolean f5023f = true;

    /* renamed from: g */
    private static boolean f5024g = true;

    ViewUtilsApi21() {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: h */
    public void mo5358h(View view, Matrix matrix) {
        if (f5023f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f5023f = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: i */
    public void mo5359i(View view, Matrix matrix) {
        if (f5024g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f5024g = false;
            }
        }
    }
}
