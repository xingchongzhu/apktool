package p010b.p062p;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: b.p.i0 */
class ViewUtilsBase {

    /* renamed from: a */
    private static Method f5033a;

    /* renamed from: b */
    private static boolean f5034b;

    /* renamed from: c */
    private static Field f5035c;

    /* renamed from: d */
    private static boolean f5036d;

    ViewUtilsBase() {
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: b */
    private void m5970b() {
        if (!f5034b) {
            Class<View> cls = View.class;
            String str = "setFrame";
            try {
                Class cls2 = Integer.TYPE;
                Method declaredMethod = cls.getDeclaredMethod(str, new Class[]{cls2, cls2, cls2, cls2});
                f5033a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e);
            }
            f5034b = true;
        }
    }

    /* renamed from: a */
    public void mo5353a(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(C0718j.save_non_transition_alpha, null);
        }
    }

    /* renamed from: c */
    public float mo5354c(View view) {
        Float f = (Float) view.getTag(C0718j.save_non_transition_alpha);
        if (f != null) {
            return view.getAlpha() / f.floatValue();
        }
        return view.getAlpha();
    }

    /* renamed from: d */
    public void mo5355d(View view) {
        int i = C0718j.save_non_transition_alpha;
        if (view.getTag(i) == null) {
            view.setTag(i, Float.valueOf(view.getAlpha()));
        }
    }

    /* renamed from: e */
    public void mo5360e(View view, int i, int i2, int i3, int i4) {
        m5970b();
        Method method = f5033a;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    /* renamed from: f */
    public void mo5356f(View view, float f) {
        Float f2 = (Float) view.getTag(C0718j.save_non_transition_alpha);
        if (f2 != null) {
            view.setAlpha(f2.floatValue() * f);
        } else {
            view.setAlpha(f);
        }
    }

    /* renamed from: g */
    public void mo5362g(View view, int i) {
        if (!f5036d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f5035c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f5036d = true;
        }
        Field field = f5035c;
        if (field != null) {
            try {
                f5035c.setInt(view, i | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: h */
    public void mo5358h(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo5358h(view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            matrix.preConcat(matrix2);
        }
    }

    /* renamed from: i */
    public void mo5359i(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo5359i(view2, matrix);
            matrix.postTranslate((float) view2.getScrollX(), (float) view2.getScrollY());
        }
        matrix.postTranslate((float) (-view.getLeft()), (float) (-view.getTop()));
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            Matrix matrix3 = new Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
    }
}
