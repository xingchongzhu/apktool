package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import p010b.p011a.C0511j;
import p010b.p034g.p035d.ColorUtils;

/* renamed from: androidx.appcompat.widget.s0 */
public class ThemeUtils {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f1203a = new ThreadLocal<>();

    /* renamed from: b */
    static final int[] f1204b = {-16842910};

    /* renamed from: c */
    static final int[] f1205c = {16842908};

    /* renamed from: d */
    static final int[] f1206d = {16843518};

    /* renamed from: e */
    static final int[] f1207e = {16842919};

    /* renamed from: f */
    static final int[] f1208f = {16842912};

    /* renamed from: g */
    static final int[] f1209g = {16842913};

    /* renamed from: h */
    static final int[] f1210h = {-16842919, -16842908};

    /* renamed from: i */
    static final int[] f1211i = new int[0];

    /* renamed from: j */
    private static final int[] f1212j = new int[1];

    /* renamed from: a */
    public static void m1343a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C0511j.f3681z0);
        try {
            if (!obtainStyledAttributes.hasValue(C0511j.f3461E0)) {
                StringBuilder sb = new StringBuilder();
                sb.append("View ");
                sb.append(view.getClass());
                sb.append(" is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
                Log.e("ThemeUtils", sb.toString());
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static int m1344b(Context context, int i) {
        ColorStateList e = m1347e(context, i);
        if (e != null && e.isStateful()) {
            return e.getColorForState(f1204b, e.getDefaultColor());
        }
        TypedValue f = m1348f();
        context.getTheme().resolveAttribute(16842803, f, true);
        return m1346d(context, i, f.getFloat());
    }

    /* renamed from: c */
    public static int m1345c(Context context, int i) {
        int[] iArr = f1212j;
        iArr[0] = i;
        TintTypedArray u = TintTypedArray.m1405u(context, null, iArr);
        try {
            return u.mo1833b(0, 0);
        } finally {
            u.mo1851w();
        }
    }

    /* renamed from: d */
    static int m1346d(Context context, int i, float f) {
        int c = m1345c(context, i);
        return ColorUtils.m4970d(c, Math.round(((float) Color.alpha(c)) * f));
    }

    /* renamed from: e */
    public static ColorStateList m1347e(Context context, int i) {
        int[] iArr = f1212j;
        iArr[0] = i;
        TintTypedArray u = TintTypedArray.m1405u(context, null, iArr);
        try {
            return u.mo1834c(0);
        } finally {
            u.mo1851w();
        }
    }

    /* renamed from: f */
    private static TypedValue m1348f() {
        ThreadLocal<TypedValue> threadLocal = f1203a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
