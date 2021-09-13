package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import p010b.p034g.p043k.ViewCompat;
import p067c.p068a.p069a.p114b.C1291f;
import p067c.p068a.p069a.p114b.C1293h;
import p067c.p068a.p069a.p114b.C1297l;
import p067c.p068a.p069a.p114b.p117c0.MaterialShapeDrawable;
import p067c.p068a.p069a.p114b.p117c0.RelativeCornerSize;

/* renamed from: com.google.android.material.timepicker.b */
class RadialViewGroup extends ConstraintLayout {

    /* renamed from: x */
    private final Runnable f13561x;

    /* renamed from: y */
    private int f13562y;

    /* renamed from: z */
    private MaterialShapeDrawable f13563z;

    /* renamed from: com.google.android.material.timepicker.b$a */
    /* compiled from: RadialViewGroup */
    class C2131a implements Runnable {
        C2131a() {
        }

        public void run() {
            RadialViewGroup.this.mo16438y();
        }
    }

    public RadialViewGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: u */
    private Drawable m16627u() {
        MaterialShapeDrawable gVar = new MaterialShapeDrawable();
        this.f13563z = gVar;
        gVar.mo7841V(new RelativeCornerSize(0.5f));
        this.f13563z.mo7843X(ColorStateList.valueOf(-1));
        return this.f13563z;
    }

    /* renamed from: x */
    private static boolean m16628x(View view) {
        return "skip".equals(view.getTag());
    }

    /* renamed from: z */
    private void m16629z() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f13561x);
            handler.post(this.f13561x);
        }
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(ViewCompat.m5564k());
        }
        m16629z();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        mo16438y();
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        m16629z();
    }

    public void setBackgroundColor(int i) {
        this.f13563z.mo7843X(ColorStateList.valueOf(i));
    }

    /* renamed from: v */
    public int mo16437v() {
        return this.f13562y;
    }

    /* renamed from: w */
    public void mo16411w(int i) {
        this.f13562y = i;
        mo16438y();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo16438y() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            if (m16628x(getChildAt(i2))) {
                i++;
            }
        }
        ConstraintSet dVar = new ConstraintSet();
        dVar.mo1970g(this);
        float f = 0.0f;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int id = childAt.getId();
            int i4 = C1291f.circle_center;
            if (id != i4 && !m16628x(childAt)) {
                dVar.mo1972i(childAt.getId(), i4, this.f13562y, f);
                f += 360.0f / ((float) (childCount - i));
            }
        }
        dVar.mo1966c(this);
    }

    public RadialViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(C1293h.material_radial_view_group, this);
        ViewCompat.m5579r0(this, m16627u());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1297l.f9583w3, i, 0);
        this.f13562y = obtainStyledAttributes.getDimensionPixelSize(C1297l.f9591x3, 0);
        this.f13561x = new C2131a();
        obtainStyledAttributes.recycle();
    }
}
