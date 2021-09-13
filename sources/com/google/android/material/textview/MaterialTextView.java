package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.theme.p198a.MaterialThemeOverlay;
import p067c.p068a.p069a.p114b.C1270b;
import p067c.p068a.p069a.p114b.C1297l;
import p067c.p068a.p069a.p114b.p133z.MaterialAttributes;
import p067c.p068a.p069a.p114b.p133z.MaterialResources;

public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    /* renamed from: f */
    private void m16575f(Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, C1297l.f9378W2);
        int i2 = m16578i(getContext(), obtainStyledAttributes, C1297l.f9392Y2, C1297l.f9399Z2);
        obtainStyledAttributes.recycle();
        if (i2 >= 0) {
            setLineHeight(i2);
        }
    }

    /* renamed from: g */
    private static boolean m16576g(Context context) {
        return MaterialAttributes.m11597b(context, C1270b.textAppearanceLineHeightEnabled, true);
    }

    /* renamed from: h */
    private static int m16577h(Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C1297l.f9407a3, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(C1297l.f9415b3, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: i */
    private static int m16578i(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            i = MaterialResources.m11602c(context, typedArray, iArr[i2], -1);
        }
        return i;
    }

    /* renamed from: j */
    private static boolean m16579j(Context context, Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C1297l.f9407a3, i, i2);
        int i3 = m16578i(context, obtainStyledAttributes, C1297l.f9423c3, C1297l.f9431d3);
        obtainStyledAttributes.recycle();
        if (i3 != -1) {
            return true;
        }
        return false;
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (m16576g(context)) {
            m16575f(context.getTheme(), i);
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(MaterialThemeOverlay.m16587c(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        if (m16576g(context2)) {
            Theme theme = context2.getTheme();
            if (!m16579j(context2, theme, attributeSet, i, i2)) {
                int h = m16577h(theme, attributeSet, i, i2);
                if (h != -1) {
                    m16575f(theme, h);
                }
            }
        }
    }
}
