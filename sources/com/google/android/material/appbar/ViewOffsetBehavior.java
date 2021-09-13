package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0229c;

/* renamed from: com.google.android.material.appbar.c */
class ViewOffsetBehavior<V extends View> extends C0229c<V> {

    /* renamed from: a */
    private ViewOffsetHelper f12518a;

    /* renamed from: b */
    private int f12519b = 0;

    /* renamed from: c */
    private int f12520c = 0;

    public ViewOffsetBehavior() {
    }

    /* renamed from: E */
    public int mo15043E() {
        ViewOffsetHelper dVar = this.f12518a;
        if (dVar != null) {
            return dVar.mo15068b();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo15061F(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.mo2006I(v, i);
    }

    /* renamed from: G */
    public boolean mo15044G(int i) {
        ViewOffsetHelper dVar = this.f12518a;
        if (dVar != null) {
            return dVar.mo15071e(i);
        }
        this.f12519b = i;
        return false;
    }

    /* renamed from: l */
    public boolean mo2070l(CoordinatorLayout coordinatorLayout, V v, int i) {
        mo15061F(coordinatorLayout, v, i);
        if (this.f12518a == null) {
            this.f12518a = new ViewOffsetHelper(v);
        }
        this.f12518a.mo15069c();
        this.f12518a.mo15067a();
        int i2 = this.f12519b;
        if (i2 != 0) {
            this.f12518a.mo15071e(i2);
            this.f12519b = 0;
        }
        int i3 = this.f12520c;
        if (i3 != 0) {
            this.f12518a.mo15070d(i3);
            this.f12520c = 0;
        }
        return true;
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
