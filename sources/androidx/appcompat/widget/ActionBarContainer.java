package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import p010b.p011a.C0507f;
import p010b.p011a.C0511j;
import p010b.p034g.p043k.ViewCompat;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: a */
    private boolean f689a;

    /* renamed from: b */
    private View f690b;

    /* renamed from: c */
    private View f691c;

    /* renamed from: d */
    private View f692d;

    /* renamed from: e */
    Drawable f693e;

    /* renamed from: f */
    Drawable f694f;

    /* renamed from: g */
    Drawable f695g;

    /* renamed from: h */
    boolean f696h;

    /* renamed from: i */
    boolean f697i;

    /* renamed from: j */
    private int f698j;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ViewCompat.m5579r0(this, new ActionBarBackgroundDrawable(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0511j.f3555a);
        this.f693e = obtainStyledAttributes.getDrawable(C0511j.f3560b);
        this.f694f = obtainStyledAttributes.getDrawable(C0511j.f3570d);
        this.f698j = obtainStyledAttributes.getDimensionPixelSize(C0511j.f3600j, -1);
        boolean z = true;
        if (getId() == C0507f.f3370H) {
            this.f696h = true;
            this.f695g = obtainStyledAttributes.getDrawable(C0511j.f3565c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f696h ? !(this.f693e == null && this.f694f == null) : this.f695g != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    /* renamed from: a */
    private int m787a(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    private boolean m788b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f693e;
        if (drawable != null && drawable.isStateful()) {
            this.f693e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f694f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f694f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f695g;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f695g.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f690b;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f693e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f694f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f695g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f691c = findViewById(C0507f.f3379a);
        this.f692d = findViewById(C0507f.f3384f);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f689a || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f690b;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view == null || view.getVisibility() == 8) ? false : true;
        if (!(view == null || view.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            int measuredHeight2 = measuredHeight - view.getMeasuredHeight();
            int i5 = ((LayoutParams) view.getLayoutParams()).bottomMargin;
            view.layout(i, measuredHeight2 - i5, i3, measuredHeight - i5);
        }
        if (this.f696h) {
            Drawable drawable = this.f695g;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f693e != null) {
                if (this.f691c.getVisibility() == 0) {
                    this.f693e.setBounds(this.f691c.getLeft(), this.f691c.getTop(), this.f691c.getRight(), this.f691c.getBottom());
                } else {
                    View view2 = this.f692d;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f693e.setBounds(0, 0, 0, 0);
                    } else {
                        this.f693e.setBounds(this.f692d.getLeft(), this.f692d.getTop(), this.f692d.getRight(), this.f692d.getBottom());
                    }
                }
                z3 = true;
            }
            this.f697i = z4;
            if (z4) {
                Drawable drawable2 = this.f694f;
                if (drawable2 != null) {
                    drawable2.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                }
            }
            z2 = z3;
        }
        if (z2) {
            invalidate();
        }
    }

    public void onMeasure(int i, int i2) {
        if (this.f691c == null && MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            int i3 = this.f698j;
            if (i3 >= 0) {
                i2 = MeasureSpec.makeMeasureSpec(Math.min(i3, MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i, i2);
        if (this.f691c != null) {
            int mode = MeasureSpec.getMode(i2);
            View view = this.f690b;
            if (!(view == null || view.getVisibility() == 8 || mode == 1073741824)) {
                int i4 = !m788b(this.f691c) ? m787a(this.f691c) : !m788b(this.f692d) ? m787a(this.f692d) : 0;
                setMeasuredDimension(getMeasuredWidth(), Math.min(i4 + m787a(this.f690b), mode == Integer.MIN_VALUE ? MeasureSpec.getSize(i2) : Integer.MAX_VALUE));
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f693e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f693e);
        }
        this.f693e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f691c;
            if (view != null) {
                this.f693e.setBounds(view.getLeft(), this.f691c.getTop(), this.f691c.getRight(), this.f691c.getBottom());
            }
        }
        boolean z = true;
        if (!this.f696h ? !(this.f693e == null && this.f694f == null) : this.f695g != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2 = this.f695g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f695g);
        }
        this.f695g = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f696h) {
                Drawable drawable3 = this.f695g;
                if (drawable3 != null) {
                    drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                }
            }
        }
        if (!this.f696h ? this.f693e == null && this.f694f == null : this.f695g == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        if (VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f694f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f694f);
        }
        this.f694f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f697i) {
                Drawable drawable3 = this.f694f;
                if (drawable3 != null) {
                    drawable3.setBounds(this.f690b.getLeft(), this.f690b.getTop(), this.f690b.getRight(), this.f690b.getBottom());
                }
            }
        }
        boolean z = true;
        if (!this.f696h ? !(this.f693e == null && this.f694f == null) : this.f695g != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setTabContainer(ScrollingTabContainerView q0Var) {
        View view = this.f690b;
        if (view != null) {
            removeView(view);
        }
        this.f690b = q0Var;
        if (q0Var != null) {
            addView(q0Var);
            ViewGroup.LayoutParams layoutParams = q0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            q0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f689a = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f693e;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f694f;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f695g;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f693e && !this.f696h) || (drawable == this.f694f && this.f697i) || ((drawable == this.f695g && this.f696h) || super.verifyDrawable(drawable));
    }
}
