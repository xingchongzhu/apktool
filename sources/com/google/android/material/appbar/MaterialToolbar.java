package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.theme.p198a.MaterialThemeOverlay;
import p010b.p034g.p043k.ViewCompat;
import p067c.p068a.p069a.p114b.C1270b;
import p067c.p068a.p069a.p114b.C1296k;
import p067c.p068a.p069a.p114b.C1297l;
import p067c.p068a.p069a.p114b.p117c0.MaterialShapeDrawable;
import p067c.p068a.p069a.p114b.p117c0.MaterialShapeUtils;

public class MaterialToolbar extends Toolbar {

    /* renamed from: R */
    private static final int f12502R = C1296k.Widget_MaterialComponents_Toolbar;

    /* renamed from: S */
    private Integer f12503S;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1270b.f9066H);
    }

    /* renamed from: O */
    private void m15275O(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            MaterialShapeDrawable gVar = new MaterialShapeDrawable();
            gVar.mo7843X(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            gVar.mo7836M(context);
            gVar.mo7842W(ViewCompat.m5588w(this));
            ViewCompat.m5579r0(this, gVar);
        }
    }

    /* renamed from: P */
    private Drawable m15276P(Drawable drawable) {
        if (drawable == null || this.f12503S == null) {
            return drawable;
        }
        Drawable r = DrawableCompat.m1859r(drawable);
        DrawableCompat.m1855n(r, this.f12503S.intValue());
        return r;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.m11337e(this);
    }

    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.m11336d(this, f);
    }

    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(m15276P(drawable));
    }

    public void setNavigationIconTint(int i) {
        this.f12503S = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        int i2 = f12502R;
        super(MaterialThemeOverlay.m16587c(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        TypedArray h = ThemeEnforcement.m16228h(context2, attributeSet, C1297l.f9447f3, i, i2, new int[0]);
        int i3 = C1297l.f9455g3;
        if (h.hasValue(i3)) {
            setNavigationIconTint(h.getColor(i3, -1));
        }
        h.recycle();
        m15275O(context2);
    }
}
