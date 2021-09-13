package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public AnimatorSet f13577b;

    /* renamed from: com.google.android.material.transformation.ExpandableTransformationBehavior$a */
    class C2134a extends AnimatorListenerAdapter {
        C2134a() {
        }

        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.f13577b = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public boolean mo16449H(View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = this.f13577b;
        boolean z3 = animatorSet != null;
        if (z3) {
            animatorSet.cancel();
        }
        AnimatorSet J = mo16451J(view, view2, z, z3);
        this.f13577b = J;
        J.addListener(new C2134a());
        this.f13577b.start();
        if (!z2) {
            this.f13577b.end();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public abstract AnimatorSet mo16451J(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
