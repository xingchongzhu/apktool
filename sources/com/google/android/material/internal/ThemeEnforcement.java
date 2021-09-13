package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.TintTypedArray;
import p067c.p068a.p069a.p114b.C1270b;
import p067c.p068a.p069a.p114b.C1297l;

/* renamed from: com.google.android.material.internal.j */
public final class ThemeEnforcement {

    /* renamed from: a */
    private static final int[] f13198a = {C1270b.f9071k};

    /* renamed from: b */
    private static final int[] f13199b = {C1270b.colorPrimaryVariant};

    /* renamed from: a */
    public static void m16221a(Context context) {
        m16225e(context, f13198a, "Theme.AppCompat");
    }

    /* renamed from: b */
    private static void m16222b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1297l.f9570u6, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(C1297l.f9586w6, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(C1270b.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m16223c(context);
            }
        }
        m16221a(context);
    }

    /* renamed from: c */
    public static void m16223c(Context context) {
        m16225e(context, f13199b, "Theme.MaterialComponents");
    }

    /* renamed from: d */
    private static void m16224d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1297l.f9570u6, i, i2);
        boolean z2 = false;
        if (!obtainStyledAttributes.getBoolean(C1297l.f9594x6, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            if (obtainStyledAttributes.getResourceId(C1297l.f9578v6, -1) != -1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = m16226f(context, attributeSet, iArr, i, i2, iArr2);
        }
        obtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* renamed from: e */
    private static void m16225e(Context context, int[] iArr, String str) {
        if (!m16227g(context, iArr)) {
            StringBuilder sb = new StringBuilder();
            sb.append("The style on this component requires your app theme to be ");
            sb.append(str);
            sb.append(" (or a descendant).");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: f */
    private static boolean m16226f(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int resourceId : iArr2) {
            if (obtainStyledAttributes.getResourceId(resourceId, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: g */
    private static boolean m16227g(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: h */
    public static TypedArray m16228h(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m16222b(context, attributeSet, i, i2);
        m16224d(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* renamed from: i */
    public static TintTypedArray m16229i(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m16222b(context, attributeSet, i, i2);
        m16224d(context, attributeSet, iArr, i, i2, iArr2);
        return TintTypedArray.m1406v(context, attributeSet, iArr, i, i2);
    }
}
