package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p067c.p068a.p069a.p114b.p119m.AnimatorSetCompat;
import p067c.p068a.p069a.p114b.p119m.MotionTiming;

@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final MotionTiming f13598c = new MotionTiming(75, 150);

    /* renamed from: d */
    private final MotionTiming f13599d = new MotionTiming(0, 150);

    /* renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$a */
    class C2140a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f13600a;

        /* renamed from: b */
        final /* synthetic */ View f13601b;

        C2140a(boolean z, View view) {
            this.f13600a = z;
            this.f13601b = view;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f13600a) {
                this.f13601b.setVisibility(4);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f13600a) {
                this.f13601b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
    }

    /* renamed from: K */
    private void m16672K(View view, boolean z, boolean z2, List<Animator> list, List<AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        MotionTiming iVar = z ? this.f13598c : this.f13599d;
        if (z) {
            if (!z2) {
                view.setAlpha(0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f});
        }
        iVar.mo7965a(objectAnimator);
        list.add(objectAnimator);
    }

    /* renamed from: D */
    public boolean mo2058D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.mo2058D(coordinatorLayout, view, motionEvent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public AnimatorSet mo16451J(View view, View view2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        m16672K(view2, z, z2, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSetCompat.m11474a(animatorSet, arrayList);
        animatorSet.addListener(new C2140a(z, view2));
        return animatorSet;
    }

    /* renamed from: e */
    public boolean mo2063e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
