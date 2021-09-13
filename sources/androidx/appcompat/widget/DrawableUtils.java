package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build.VERSION;
import androidx.core.graphics.drawable.WrappedDrawable;
import p010b.p011a.p014l.p015a.DrawableWrapper;

@SuppressLint({"RestrictedAPI"})
/* renamed from: androidx.appcompat.widget.f0 */
public class DrawableUtils {

    /* renamed from: a */
    private static final int[] f1008a = {16842912};

    /* renamed from: b */
    private static final int[] f1009b = new int[0];

    /* renamed from: c */
    public static final Rect f1010c = new Rect();

    /* renamed from: d */
    private static Class<?> f1011d;

    static {
        if (VERSION.SDK_INT >= 18) {
            try {
                f1011d = Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m1120a(Drawable drawable) {
        int i = VERSION.SDK_INT;
        if (i < 15 && (drawable instanceof InsetDrawable)) {
            return false;
        }
        if (i < 15 && (drawable instanceof GradientDrawable)) {
            return false;
        }
        if (i < 17 && (drawable instanceof LayerDrawable)) {
            return false;
        }
        if (drawable instanceof DrawableContainer) {
            ConstantState constantState = drawable.getConstantState();
            if (constantState instanceof DrawableContainerState) {
                for (Drawable a : ((DrawableContainerState) constantState).getChildren()) {
                    if (!m1120a(a)) {
                        return false;
                    }
                }
            }
        } else if (drawable instanceof WrappedDrawable) {
            return m1120a(((WrappedDrawable) drawable).mo2191b());
        } else {
            if (drawable instanceof DrawableWrapper) {
                return m1120a(((DrawableWrapper) drawable).mo4160a());
            }
            if (drawable instanceof ScaleDrawable) {
                return m1120a(((ScaleDrawable) drawable).getDrawable());
            }
        }
        return true;
    }

    /* renamed from: b */
    static void m1121b(Drawable drawable) {
        if (VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            m1122c(drawable);
        }
    }

    /* renamed from: c */
    private static void m1122c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f1008a);
        } else {
            drawable.setState(f1009b);
        }
        drawable.setState(state);
    }

    /* renamed from: d */
    public static Mode m1123d(int i, Mode mode) {
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
}
