package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;
import p067c.p068a.p069a.p114b.C1297l;

/* renamed from: com.google.android.material.internal.d */
public class ForegroundLinearLayout extends LinearLayoutCompat {

    /* renamed from: p */
    private Drawable f13165p;

    /* renamed from: q */
    private final Rect f13166q;

    /* renamed from: r */
    private final Rect f13167r;

    /* renamed from: s */
    private int f13168s;

    /* renamed from: t */
    protected boolean f13169t;

    /* renamed from: u */
    boolean f13170u;

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f13165p;
        if (drawable != null) {
            if (this.f13170u) {
                this.f13170u = false;
                Rect rect = this.f13166q;
                Rect rect2 = this.f13167r;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f13169t) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f13168s, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f13165p;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f13165p;
        if (drawable != null && drawable.isStateful()) {
            this.f13165p.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.f13165p;
    }

    public int getForegroundGravity() {
        return this.f13168s;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f13165p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f13170u = z | this.f13170u;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f13170u = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f13165p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f13165p);
            }
            this.f13165p = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f13168s == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i) {
        if (this.f13168s != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f13168s = i;
            if (i == 119 && this.f13165p != null) {
                this.f13165p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f13165p;
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13166q = new Rect();
        this.f13167r = new Rect();
        this.f13168s = 119;
        this.f13169t = true;
        this.f13170u = false;
        TypedArray h = ThemeEnforcement.m16228h(context, attributeSet, C1297l.f9597y1, i, 0, new int[0]);
        this.f13168s = h.getInt(C1297l.f9216A1, this.f13168s);
        Drawable drawable = h.getDrawable(C1297l.f9605z1);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f13169t = h.getBoolean(C1297l.f9224B1, true);
        h.recycle();
    }
}
