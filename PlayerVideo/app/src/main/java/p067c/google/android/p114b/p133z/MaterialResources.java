package p067c.google.android.p114b.p133z;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.TypedValue;
import androidx.appcompat.widget.TintTypedArray;
import p010b.p011a.p012k.p013a.AppCompatResources;

/* renamed from: c.a.a.b.z.c */
public class MaterialResources {
    /* renamed from: a */
    public static ColorStateList m11600a(Context context, TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                ColorStateList c = AppCompatResources.m4142c(context, resourceId);
                if (c != null) {
                    return c;
                }
            }
        }
        if (VERSION.SDK_INT <= 15) {
            int color = typedArray.getColor(i, -1);
            if (color != -1) {
                return ColorStateList.valueOf(color);
            }
        }
        return typedArray.getColorStateList(i);
    }

    /* renamed from: b */
    public static ColorStateList m11601b(Context context, TintTypedArray x0Var, int i) {
        if (x0Var.mo1850s(i)) {
            int n = x0Var.mo1845n(i, 0);
            if (n != 0) {
                ColorStateList c = AppCompatResources.m4142c(context, n);
                if (c != null) {
                    return c;
                }
            }
        }
        if (VERSION.SDK_INT <= 15) {
            int b = x0Var.mo1833b(i, -1);
            if (b != -1) {
                return ColorStateList.valueOf(b);
            }
        }
        return x0Var.mo1834c(i);
    }

    /* renamed from: c */
    public static int m11602c(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    /* renamed from: d */
    public static Drawable m11603d(Context context, TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                Drawable d = AppCompatResources.m4143d(context, resourceId);
                if (d != null) {
                    return d;
                }
            }
        }
        return typedArray.getDrawable(i);
    }

    /* renamed from: e */
    static int m11604e(TypedArray typedArray, int i, int i2) {
        return typedArray.hasValue(i) ? i : i2;
    }

    /* renamed from: f */
    public static TextAppearance m11605f(Context context, TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                return new TextAppearance(context, resourceId);
            }
        }
        return null;
    }

    /* renamed from: g */
    public static boolean m11606g(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    /* renamed from: h */
    public static boolean m11607h(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}
