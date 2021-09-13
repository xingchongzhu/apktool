package com.google.android.material.snackbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.material.internal.C2053k;
import com.google.android.material.theme.p198a.MaterialThemeOverlay;
import p010b.p034g.p043k.ViewCompat;
import p067c.p068a.p069a.p114b.C1270b;
import p067c.p068a.p069a.p114b.C1288d;
import p067c.p068a.p069a.p114b.C1297l;
import p067c.p068a.p069a.p114b.p126s.MaterialColors;
import p067c.p068a.p069a.p114b.p133z.MaterialResources;

/* renamed from: com.google.android.material.snackbar.d */
/* compiled from: BaseTransientBottomBar */
public class C2060d extends FrameLayout {

    /* renamed from: a */
    private static final OnTouchListener f13213a = new C2061a();

    /* renamed from: b */
    private C2059c f13214b;

    /* renamed from: c */
    private C2058b f13215c;

    /* renamed from: d */
    private int f13216d;

    /* renamed from: e */
    private final float f13217e;

    /* renamed from: f */
    private final float f13218f;

    /* renamed from: g */
    private ColorStateList f13219g;

    /* renamed from: h */
    private Mode f13220h;

    /* renamed from: com.google.android.material.snackbar.d$a */
    /* compiled from: BaseTransientBottomBar */
    static class C2061a implements OnTouchListener {
        C2061a() {
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    protected C2060d(Context context, AttributeSet attributeSet) {
        super(MaterialThemeOverlay.m16587c(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C1297l.f9424c4);
        int i = C1297l.f9480j4;
        if (obtainStyledAttributes.hasValue(i)) {
            ViewCompat.m5587v0(this, (float) obtainStyledAttributes.getDimensionPixelSize(i, 0));
        }
        this.f13216d = obtainStyledAttributes.getInt(C1297l.f9448f4, 0);
        this.f13217e = obtainStyledAttributes.getFloat(C1297l.f9456g4, 1.0f);
        setBackgroundTintList(MaterialResources.m11600a(context2, obtainStyledAttributes, C1297l.f9464h4));
        setBackgroundTintMode(C2053k.m16234e(obtainStyledAttributes.getInt(C1297l.f9472i4, -1), Mode.SRC_IN));
        this.f13218f = obtainStyledAttributes.getFloat(C1297l.f9440e4, 1.0f);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f13213a);
        setFocusable(true);
        if (getBackground() == null) {
            ViewCompat.m5579r0(this, m16246a());
        }
    }

    /* renamed from: a */
    private Drawable m16246a() {
        float dimension = getResources().getDimension(C1288d.mtrl_snackbar_background_corner_radius);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(MaterialColors.m11579g(this, C1270b.colorSurface, C1270b.colorOnSurface, getBackgroundOverlayColorAlpha()));
        if (this.f13219g == null) {
            return DrawableCompat.m1859r(gradientDrawable);
        }
        Drawable r = DrawableCompat.m1859r(gradientDrawable);
        DrawableCompat.m1856o(r, this.f13219g);
        return r;
    }

    /* access modifiers changed from: 0000 */
    public float getActionTextColorAlpha() {
        return this.f13218f;
    }

    /* access modifiers changed from: 0000 */
    public int getAnimationMode() {
        return this.f13216d;
    }

    /* access modifiers changed from: 0000 */
    public float getBackgroundOverlayColorAlpha() {
        return this.f13217e;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C2058b bVar = this.f13215c;
        if (bVar != null) {
            bVar.onViewAttachedToWindow(this);
        }
        ViewCompat.m5567l0(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2058b bVar = this.f13215c;
        if (bVar != null) {
            bVar.onViewDetachedFromWindow(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C2059c cVar = this.f13214b;
        if (cVar != null) {
            cVar.mo16032a(this, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: 0000 */
    public void setAnimationMode(int i) {
        this.f13216d = i;
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!(drawable == null || this.f13219g == null)) {
            drawable = DrawableCompat.m1859r(drawable.mutate());
            DrawableCompat.m1856o(drawable, this.f13219g);
            DrawableCompat.m1857p(drawable, this.f13220h);
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f13219g = colorStateList;
        if (getBackground() != null) {
            Drawable r = DrawableCompat.m1859r(getBackground().mutate());
            DrawableCompat.m1856o(r, colorStateList);
            DrawableCompat.m1857p(r, this.f13220h);
            if (r != getBackground()) {
                super.setBackgroundDrawable(r);
            }
        }
    }

    public void setBackgroundTintMode(Mode mode) {
        this.f13220h = mode;
        if (getBackground() != null) {
            Drawable r = DrawableCompat.m1859r(getBackground().mutate());
            DrawableCompat.m1857p(r, mode);
            if (r != getBackground()) {
                super.setBackgroundDrawable(r);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void setOnAttachStateChangeListener(C2058b bVar) {
        this.f13215c = bVar;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f13213a);
        super.setOnClickListener(onClickListener);
    }

    /* access modifiers changed from: 0000 */
    public void setOnLayoutChangeListener(C2059c cVar) {
        this.f13214b = cVar;
    }
}
