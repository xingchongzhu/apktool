package p010b.p062p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import p010b.p034g.p043k.ViewCompat;

/* renamed from: b.p.d */
public class Fade extends Visibility {

    /* renamed from: b.p.d$a */
    /* compiled from: Fade */
    class C0712a extends TransitionListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ View f5004a;

        C0712a(View view) {
            this.f5004a = view;
        }

        /* renamed from: e */
        public void mo5338e(Transition mVar) {
            C0709c0.m5913g(this.f5004a, 1.0f);
            C0709c0.m5907a(this.f5004a);
            mVar.mo5388O(this);
        }
    }

    /* renamed from: b.p.d$b */
    /* compiled from: Fade */
    private static class C0713b extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final View f5006a;

        /* renamed from: b */
        private boolean f5007b = false;

        C0713b(View view) {
            this.f5006a = view;
        }

        public void onAnimationEnd(Animator animator) {
            C0709c0.m5913g(this.f5006a, 1.0f);
            if (this.f5007b) {
                this.f5006a.setLayerType(0, null);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (ViewCompat.m5533P(this.f5006a) && this.f5006a.getLayerType() == 0) {
                this.f5007b = true;
                this.f5006a.setLayerType(2, null);
            }
        }
    }

    public Fade(int i) {
        mo5370l0(i);
    }

    /* renamed from: m0 */
    private Animator m5921m0(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C0709c0.m5913g(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C0709c0.f5002b, new float[]{f2});
        ofFloat.addListener(new C0713b(view));
        mo5395a(new C0712a(view));
        return ofFloat;
    }

    /* renamed from: n0 */
    private static float m5922n0(TransitionValues sVar, float f) {
        if (sVar == null) {
            return f;
        }
        Float f2 = (Float) sVar.f5122a.get("android:fade:transitionAlpha");
        return f2 != null ? f2.floatValue() : f;
    }

    /* renamed from: h0 */
    public Animator mo5349h0(ViewGroup viewGroup, View view, TransitionValues sVar, TransitionValues sVar2) {
        float f = 0.0f;
        float n0 = m5922n0(sVar, 0.0f);
        if (n0 != 1.0f) {
            f = n0;
        }
        return m5921m0(view, f, 1.0f);
    }

    /* renamed from: i */
    public void mo5306i(TransitionValues sVar) {
        super.mo5306i(sVar);
        sVar.f5122a.put("android:fade:transitionAlpha", Float.valueOf(C0709c0.m5909c(sVar.f5123b)));
    }

    /* renamed from: j0 */
    public Animator mo5350j0(ViewGroup viewGroup, View view, TransitionValues sVar, TransitionValues sVar2) {
        C0709c0.m5911e(view);
        return m5921m0(view, m5922n0(sVar, 1.0f), 0.0f);
    }
}
