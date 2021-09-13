package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0232f;
import java.util.List;
import p010b.p034g.p038f.MathUtils;
import p010b.p034g.p043k.GravityCompat;
import p010b.p034g.p043k.ViewCompat;
import p010b.p034g.p043k.WindowInsetsCompat;

/* renamed from: com.google.android.material.appbar.b */
abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {

    /* renamed from: d */
    final Rect f12514d = new Rect();

    /* renamed from: e */
    final Rect f12515e = new Rect();

    /* renamed from: f */
    private int f12516f = 0;

    /* renamed from: g */
    private int f12517g;

    public HeaderScrollingViewBehavior() {
    }

    /* renamed from: N */
    private static int m15289N(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo15061F(CoordinatorLayout coordinatorLayout, View view, int i) {
        View H = mo15045H(coordinatorLayout.mo2039r(view));
        if (H != null) {
            C0232f fVar = (C0232f) view.getLayoutParams();
            Rect rect = this.f12514d;
            rect.set(coordinatorLayout.getPaddingLeft() + fVar.leftMargin, H.getBottom() + fVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - fVar.rightMargin, ((coordinatorLayout.getHeight() + H.getBottom()) - coordinatorLayout.getPaddingBottom()) - fVar.bottomMargin);
            WindowInsetsCompat lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && ViewCompat.m5594z(coordinatorLayout) && !ViewCompat.m5594z(view)) {
                rect.left += lastWindowInsets.mo4992g();
                rect.right -= lastWindowInsets.mo4993h();
            }
            Rect rect2 = this.f12515e;
            GravityCompat.m5244a(m15289N(fVar.f1922c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int I = mo15062I(H);
            view.layout(rect2.left, rect2.top - I, rect2.right, rect2.bottom - I);
            this.f12516f = rect2.top - H.getBottom();
            return;
        }
        super.mo15061F(coordinatorLayout, view, i);
        this.f12516f = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: H */
    public abstract View mo15045H(List<View> list);

    /* access modifiers changed from: 0000 */
    /* renamed from: I */
    public final int mo15062I(View view) {
        if (this.f12517g == 0) {
            return 0;
        }
        float J = mo15046J(view);
        int i = this.f12517g;
        return MathUtils.m5069b((int) (J * ((float) i)), 0, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: J */
    public abstract float mo15046J(View view);

    /* renamed from: K */
    public final int mo15063K() {
        return this.f12517g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: L */
    public int mo15047L(View view) {
        return view.getMeasuredHeight();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: M */
    public final int mo15064M() {
        return this.f12516f;
    }

    /* renamed from: O */
    public final void mo15065O(int i) {
        this.f12517g = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public boolean mo15066P() {
        return false;
    }

    /* renamed from: m */
    public boolean mo2071m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        int i5 = view.getLayoutParams().height;
        if (i5 == -1 || i5 == -2) {
            View H = mo15045H(coordinatorLayout.mo2039r(view));
            if (H != null) {
                int size = MeasureSpec.getSize(i3);
                if (size <= 0) {
                    size = coordinatorLayout.getHeight();
                } else if (ViewCompat.m5594z(H)) {
                    WindowInsetsCompat lastWindowInsets = coordinatorLayout.getLastWindowInsets();
                    if (lastWindowInsets != null) {
                        size += lastWindowInsets.mo4995i() + lastWindowInsets.mo4991f();
                    }
                }
                int L = size + mo15047L(H);
                int measuredHeight = H.getMeasuredHeight();
                if (mo15066P()) {
                    view.setTranslationY((float) (-measuredHeight));
                } else {
                    L -= measuredHeight;
                }
                coordinatorLayout.mo2007J(view, i, i2, MeasureSpec.makeMeasureSpec(L, i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
                return true;
            }
        }
        return false;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
