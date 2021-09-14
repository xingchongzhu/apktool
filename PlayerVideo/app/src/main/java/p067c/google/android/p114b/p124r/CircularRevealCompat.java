package p067c.google.android.p114b.p124r;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewAnimationUtils;
import p067c.google.android.p114b.p124r.CircularRevealWidget.C1304b;
import p067c.google.android.p114b.p124r.CircularRevealWidget.C1305c;
import p067c.google.android.p114b.p124r.CircularRevealWidget.C1307e;

/* renamed from: c.a.a.b.r.a */
public final class CircularRevealCompat {

    /* renamed from: c.a.a.b.r.a$a */
    /* compiled from: CircularRevealCompat */
    static class C1302a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ CircularRevealWidget f9681a;

        C1302a(CircularRevealWidget dVar) {
            this.f9681a = dVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f9681a.mo8053a();
        }

        public void onAnimationStart(Animator animator) {
            this.f9681a.mo8054b();
        }
    }

    /* renamed from: a */
    public static Animator m11559a(CircularRevealWidget dVar, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(dVar, C1305c.f9686a, C1304b.f9684a, new C1307e[]{new C1307e(f, f2, f3)});
        if (VERSION.SDK_INT < 21) {
            return ofObject;
        }
        C1307e revealInfo = dVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) dVar, (int) f, (int) f2, revealInfo.f9690c, f3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofObject, createCircularReveal});
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    /* renamed from: b */
    public static AnimatorListener m11560b(CircularRevealWidget dVar) {
        return new C1302a(dVar);
    }
}
