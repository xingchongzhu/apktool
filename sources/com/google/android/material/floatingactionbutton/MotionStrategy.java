package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.C2025f;
import java.util.List;
import p067c.p068a.p069a.p114b.p119m.MotionSpec;

/* renamed from: com.google.android.material.floatingactionbutton.d */
interface MotionStrategy {
    /* renamed from: a */
    void mo15876a();

    /* renamed from: b */
    void mo15877b();

    /* renamed from: c */
    void mo15878c(MotionSpec hVar);

    /* renamed from: d */
    void mo15879d();

    /* renamed from: e */
    MotionSpec mo15880e();

    /* renamed from: f */
    AnimatorSet mo15881f();

    /* renamed from: g */
    List<AnimatorListener> mo15882g();

    /* renamed from: h */
    void mo15883h(C2025f fVar);

    /* renamed from: i */
    boolean mo15884i();

    void onAnimationStart(Animator animator);
}
