package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0229c;
import java.util.List;
import p010b.p034g.p043k.ViewCompat;
import p067c.p068a.p069a.p114b.p130w.ExpandableWidget;

@Deprecated
public abstract class ExpandableBehavior extends C0229c<View> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f13572a = 0;

    /* renamed from: com.google.android.material.transformation.ExpandableBehavior$a */
    class C2133a implements OnPreDrawListener {

        /* renamed from: a */
        final /* synthetic */ View f13573a;

        /* renamed from: b */
        final /* synthetic */ int f13574b;

        /* renamed from: c */
        final /* synthetic */ ExpandableWidget f13575c;

        C2133a(View view, int i, ExpandableWidget aVar) {
            this.f13573a = view;
            this.f13574b = i;
            this.f13575c = aVar;
        }

        public boolean onPreDraw() {
            this.f13573a.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f13572a == this.f13574b) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                ExpandableWidget aVar = this.f13575c;
                expandableBehavior.mo16449H((View) aVar, this.f13573a, aVar.mo8082a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    /* renamed from: F */
    private boolean m16639F(boolean z) {
        boolean z2 = false;
        if (z) {
            int i = this.f13572a;
            if (i == 0 || i == 2) {
                z2 = true;
            }
            return z2;
        }
        if (this.f13572a == 1) {
            z2 = true;
        }
        return z2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public ExpandableWidget mo16448G(CoordinatorLayout coordinatorLayout, View view) {
        List r = coordinatorLayout.mo2039r(view);
        int size = r.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) r.get(i);
            if (mo2063e(coordinatorLayout, view, view2)) {
                return (ExpandableWidget) view2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public abstract boolean mo16449H(View view, View view2, boolean z, boolean z2);

    /* renamed from: h */
    public boolean mo2066h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        ExpandableWidget aVar = (ExpandableWidget) view2;
        if (!m16639F(aVar.mo8082a())) {
            return false;
        }
        this.f13572a = aVar.mo8082a() ? 1 : 2;
        return mo16449H((View) aVar, view, aVar.mo8082a(), true);
    }

    /* renamed from: l */
    public boolean mo2070l(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (!ViewCompat.m5537T(view)) {
            ExpandableWidget G = mo16448G(coordinatorLayout, view);
            if (G != null && m16639F(G.mo8082a())) {
                int i2 = G.mo8082a() ? 1 : 2;
                this.f13572a = i2;
                view.getViewTreeObserver().addOnPreDrawListener(new C2133a(view, i2, G));
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
