package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import p010b.p011a.C0502a;
import p010b.p011a.C0511j;
import p010b.p034g.p043k.ViewCompat;
import p010b.p034g.p043k.ViewPropertyAnimatorCompat;
import p010b.p034g.p043k.ViewPropertyAnimatorListener;

/* renamed from: androidx.appcompat.widget.a */
abstract class AbsActionBarView extends ViewGroup {

    /* renamed from: a */
    protected final C0154a f912a;

    /* renamed from: b */
    protected final Context f913b;

    /* renamed from: c */
    protected ActionMenuView f914c;

    /* renamed from: d */
    protected ActionMenuPresenter f915d;

    /* renamed from: e */
    protected int f916e;

    /* renamed from: f */
    protected ViewPropertyAnimatorCompat f917f;

    /* renamed from: g */
    private boolean f918g;

    /* renamed from: h */
    private boolean f919h;

    /* renamed from: androidx.appcompat.widget.a$a */
    /* compiled from: AbsActionBarView */
    protected class C0154a implements ViewPropertyAnimatorListener {

        /* renamed from: a */
        private boolean f920a = false;

        /* renamed from: b */
        int f921b;

        protected C0154a() {
        }

        /* renamed from: a */
        public void mo1283a(View view) {
            this.f920a = true;
        }

        /* renamed from: b */
        public void mo387b(View view) {
            if (!this.f920a) {
                AbsActionBarView aVar = AbsActionBarView.this;
                aVar.f917f = null;
                AbsActionBarView.super.setVisibility(this.f921b);
            }
        }

        /* renamed from: c */
        public void mo388c(View view) {
            AbsActionBarView.super.setVisibility(0);
            this.f920a = false;
        }

        /* renamed from: d */
        public C0154a mo1284d(ViewPropertyAnimatorCompat a0Var, int i) {
            AbsActionBarView.this.f917f = a0Var;
            this.f921b = i;
            return this;
        }
    }

    AbsActionBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: d */
    protected static int m973d(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo1280c(View view, int i, int i2, int i3) {
        view.measure(MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo1281e(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: f */
    public ViewPropertyAnimatorCompat mo933f(int i, long j) {
        ViewPropertyAnimatorCompat a0Var = this.f917f;
        if (a0Var != null) {
            a0Var.mo4959b();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            ViewPropertyAnimatorCompat a = ViewCompat.m5550d(this).mo4958a(1.0f);
            a.mo4961d(j);
            a.mo4963f(this.f912a.mo1284d(a, i));
            return a;
        }
        ViewPropertyAnimatorCompat a2 = ViewCompat.m5550d(this).mo4958a(0.0f);
        a2.mo4961d(j);
        a2.mo4963f(this.f912a.mo1284d(a2, i));
        return a2;
    }

    public int getAnimatedVisibility() {
        if (this.f917f != null) {
            return this.f912a.f921b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f916e;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C0511j.f3555a, C0502a.f3280c, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C0511j.f3600j, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter cVar = this.f915d;
        if (cVar != null) {
            cVar.mo1366F(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f919h = false;
        }
        if (!this.f919h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f919h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f919h = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f918g = false;
        }
        if (!this.f918g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f918g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f918g = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            ViewPropertyAnimatorCompat a0Var = this.f917f;
            if (a0Var != null) {
                a0Var.mo4959b();
            }
            super.setVisibility(i);
        }
    }

    AbsActionBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f912a = new C0154a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C0502a.f3278a, typedValue, true) || typedValue.resourceId == 0) {
            this.f913b = context;
        } else {
            this.f913b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
