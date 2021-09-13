package com.google.android.material.theme.p198a;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p010b.p011a.p017n.ContextThemeWrapper;
import p067c.p068a.p069a.p114b.C1270b;

/* renamed from: com.google.android.material.theme.a.a */
public class MaterialThemeOverlay {

    /* renamed from: a */
    private static final int[] f13506a = {16842752, C1270b.f9065G};

    /* renamed from: b */
    private static final int[] f13507b = {C1270b.materialThemeOverlay};

    /* renamed from: a */
    private static int m16585a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f13506a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    /* renamed from: b */
    private static int m16586b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f13507b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: c */
    public static Context m16587c(Context context, AttributeSet attributeSet, int i, int i2) {
        int b = m16586b(context, attributeSet, i, i2);
        boolean z = (context instanceof ContextThemeWrapper) && ((ContextThemeWrapper) context).mo4204c() == b;
        if (b == 0 || z) {
            return context;
        }
        ContextThemeWrapper dVar = new ContextThemeWrapper(context, b);
        int a = m16585a(context, attributeSet);
        if (a != 0) {
            dVar.getTheme().applyStyle(a, true);
        }
        return dVar;
    }
}
