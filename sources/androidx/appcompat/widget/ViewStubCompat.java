package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p010b.p011a.C0511j;

public final class ViewStubCompat extends View {

    /* renamed from: a */
    private int f907a;

    /* renamed from: b */
    private int f908b;

    /* renamed from: c */
    private WeakReference<View> f909c;

    /* renamed from: d */
    private LayoutInflater f910d;

    /* renamed from: e */
    private C0153a f911e;

    /* renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    public interface C0153a {
        /* renamed from: a */
        void mo1279a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public View mo1267a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f907a != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f910d;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f907a, viewGroup, false);
            int i = this.f908b;
            if (i != -1) {
                inflate.setId(i);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f909c = new WeakReference<>(inflate);
            C0153a aVar = this.f911e;
            if (aVar != null) {
                aVar.mo1279a(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f908b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f910d;
    }

    public int getLayoutResource() {
        return this.f907a;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f908b = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f910d = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f907a = i;
    }

    public void setOnInflateListener(C0153a aVar) {
        this.f911e = aVar;
    }

    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f909c;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            mo1267a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f907a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0511j.f3479H3, i, 0);
        this.f908b = obtainStyledAttributes.getResourceId(C0511j.f3494K3, -1);
        this.f907a = obtainStyledAttributes.getResourceId(C0511j.f3489J3, 0);
        setId(obtainStyledAttributes.getResourceId(C0511j.f3484I3, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
