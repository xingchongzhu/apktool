package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0229c;
import p067c.p068a.p069a.p114b.p119m.AnimationUtils;

public class HideBottomViewOnScrollBehavior<V extends View> extends C0229c<V> {

    /* renamed from: a */
    private int f12529a = 0;

    /* renamed from: b */
    private int f12530b = 2;

    /* renamed from: c */
    private int f12531c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ViewPropertyAnimator f12532d;

    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    class C1944a extends AnimatorListenerAdapter {
        C1944a() {
        }

        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f12532d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    /* renamed from: F */
    private void m15311F(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f12532d = v.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new C1944a());
    }

    /* renamed from: A */
    public boolean mo2055A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        return i == 2;
    }

    /* renamed from: G */
    public void mo15072G(V v, int i) {
        this.f12531c = i;
        if (this.f12530b == 1) {
            v.setTranslationY((float) (this.f12529a + i));
        }
    }

    /* renamed from: H */
    public void mo15073H(V v) {
        if (this.f12530b != 1) {
            ViewPropertyAnimator viewPropertyAnimator = this.f12532d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f12530b = 1;
            m15311F(v, this.f12529a + this.f12531c, 175, AnimationUtils.f9613c);
        }
    }

    /* renamed from: I */
    public void mo15074I(V v) {
        if (this.f12530b != 2) {
            ViewPropertyAnimator viewPropertyAnimator = this.f12532d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f12530b = 2;
            m15311F(v, 0, 225, AnimationUtils.f9614d);
        }
    }

    /* renamed from: l */
    public boolean mo2070l(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f12529a = v.getMeasuredHeight() + ((MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.mo2070l(coordinatorLayout, v, i);
    }

    /* renamed from: t */
    public void mo2078t(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            mo15073H(v);
        } else if (i2 < 0) {
            mo15074I(v);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
