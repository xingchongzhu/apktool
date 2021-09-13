package com.tv91.features.shared.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.tv91.C2336p;

public final class DrawableTextView extends AppCompatTextView {

    /* renamed from: f */
    private int f14023f;

    /* renamed from: g */
    private int f14024g;

    /* renamed from: h */
    private int f14025h;

    public DrawableTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: f */
    private void m17418f(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2336p.f14166S);
            this.f14023f = obtainStyledAttributes.getDimensionPixelSize(5, -1);
            this.f14024g = obtainStyledAttributes.getDimensionPixelSize(1, -1);
            obtainStyledAttributes.recycle();
            setCompoundDrawables(getLeftDrawable(), getTopDrawable(), getRightDrawable(), getBottomDrawable());
        }
    }

    /* renamed from: g */
    private void m17419g(Drawable drawable) {
        if (drawable != null) {
            Rect rect = new Rect(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            if (this.f14023f == -1 && this.f14024g == -1) {
                drawable.setBounds(rect);
                return;
            }
            float width = (float) rect.width();
            float height = (float) rect.height();
            float f = height / width;
            int i = this.f14023f;
            if (i > 0 && width != ((float) i)) {
                width = (float) i;
                height = ((float) i) * f;
            }
            int i2 = this.f14024g;
            if (i2 > 0 && height != ((float) i2)) {
                height = (float) i2;
                width = ((float) i2) / f;
            }
            rect.right = rect.left + Math.round(width);
            rect.bottom = rect.top + Math.round(height);
            drawable.setBounds(rect);
        }
    }

    public Drawable getBottomDrawable() {
        Drawable drawable = getCompoundDrawables()[3];
        return drawable == null ? getCompoundDrawablesRelative()[3] : drawable;
    }

    public int getDrawableHeight() {
        return this.f14024g;
    }

    public int getDrawableWidth() {
        return this.f14023f;
    }

    public Drawable getLeftDrawable() {
        Drawable drawable = getCompoundDrawables()[0];
        return drawable == null ? getCompoundDrawablesRelative()[0] : drawable;
    }

    public Drawable getRightDrawable() {
        Drawable drawable = getCompoundDrawables()[2];
        return drawable == null ? getCompoundDrawablesRelative()[2] : drawable;
    }

    public Drawable getTopDrawable() {
        Drawable drawable = getCompoundDrawables()[1];
        return drawable == null ? getCompoundDrawablesRelative()[1] : drawable;
    }

    /* renamed from: h */
    public void mo16876h(int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3 = null;
        Drawable d = i == -1 ? null : ContextCompat.m1758d(getContext(), i);
        if (i2 == -1) {
            drawable = null;
        } else {
            drawable = ContextCompat.m1758d(getContext(), i2);
        }
        if (i3 == -1) {
            drawable2 = null;
        } else {
            drawable2 = ContextCompat.m1758d(getContext(), i3);
        }
        if (i4 != -1) {
            drawable3 = ContextCompat.m1758d(getContext(), i4);
        }
        setCompoundDrawables(d, drawable, drawable2, drawable3);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Drawable drawable = getCompoundDrawables()[0];
        if (drawable != null && (getGravity() & 7) == 1) {
            TextPaint paint = getPaint();
            String charSequence = getText().toString();
            if (getTransformationMethod() != null) {
                charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
            }
            int min = Math.min((int) paint.measureText(charSequence), getLayout().getWidth());
            int measuredWidth = (((((getMeasuredWidth() - min) - getPaddingEnd()) - drawable.getIntrinsicWidth()) - getCompoundDrawablePadding()) - getPaddingStart()) / 2;
            if (getLayoutDirection() == 1) {
                measuredWidth = -measuredWidth;
            }
            if (this.f14025h != measuredWidth) {
                this.f14025h = measuredWidth;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                int i3 = this.f14025h;
                drawable.setBounds(i3, 0, intrinsicWidth + i3, intrinsicHeight);
            }
        }
    }

    public void setBottomDrawable(int i) {
        mo16876h(-1, -1, -1, i);
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            drawable = DrawableCompat.m1859r(drawable).mutate();
        }
        if (drawable2 != null) {
            drawable2 = DrawableCompat.m1859r(drawable2).mutate();
        }
        if (drawable3 != null) {
            drawable3 = DrawableCompat.m1859r(drawable3).mutate();
        }
        if (drawable4 != null) {
            drawable4 = DrawableCompat.m1859r(drawable4).mutate();
        }
        m17419g(drawable);
        m17419g(drawable2);
        m17419g(drawable3);
        m17419g(drawable4);
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    public void setDrawableHeight(int i) {
        this.f14024g = i;
        requestLayout();
    }

    public void setDrawableWidth(int i) {
        this.f14023f = i;
        requestLayout();
    }

    public void setLeftDrawable(int i) {
        mo16876h(i, -1, -1, -1);
    }

    public void setRightDrawable(int i) {
        mo16876h(-1, -1, i, -1);
    }

    public void setTopDrawable(int i) {
        mo16876h(-1, i, -1, -1);
    }

    public DrawableTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m17418f(context, attributeSet);
    }

    public void setBottomDrawable(Drawable drawable) {
        setCompoundDrawables(null, null, null, drawable);
    }

    public void setLeftDrawable(Drawable drawable) {
        setCompoundDrawables(drawable, null, null, null);
    }

    public void setRightDrawable(Drawable drawable) {
        setCompoundDrawables(null, null, drawable, null);
    }

    public void setTopDrawable(Drawable drawable) {
        setCompoundDrawables(null, drawable, null, null);
    }
}
