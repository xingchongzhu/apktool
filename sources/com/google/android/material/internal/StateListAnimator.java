package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* renamed from: com.google.android.material.internal.f */
public final class StateListAnimator {

    /* renamed from: a */
    private final ArrayList<C2049b> f13171a = new ArrayList<>();

    /* renamed from: b */
    private C2049b f13172b = null;

    /* renamed from: c */
    ValueAnimator f13173c = null;

    /* renamed from: d */
    private final AnimatorListener f13174d = new C2048a();

    /* renamed from: com.google.android.material.internal.f$a */
    /* compiled from: StateListAnimator */
    class C2048a extends AnimatorListenerAdapter {
        C2048a() {
        }

        public void onAnimationEnd(Animator animator) {
            StateListAnimator fVar = StateListAnimator.this;
            if (fVar.f13173c == animator) {
                fVar.f13173c = null;
            }
        }
    }

    /* renamed from: com.google.android.material.internal.f$b */
    /* compiled from: StateListAnimator */
    static class C2049b {

        /* renamed from: a */
        final int[] f13176a;

        /* renamed from: b */
        final ValueAnimator f13177b;

        C2049b(int[] iArr, ValueAnimator valueAnimator) {
            this.f13176a = iArr;
            this.f13177b = valueAnimator;
        }
    }

    /* renamed from: b */
    private void m16195b() {
        ValueAnimator valueAnimator = this.f13173c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f13173c = null;
        }
    }

    /* renamed from: e */
    private void m16196e(C2049b bVar) {
        ValueAnimator valueAnimator = bVar.f13177b;
        this.f13173c = valueAnimator;
        valueAnimator.start();
    }

    /* renamed from: a */
    public void mo15992a(int[] iArr, ValueAnimator valueAnimator) {
        C2049b bVar = new C2049b(iArr, valueAnimator);
        valueAnimator.addListener(this.f13174d);
        this.f13171a.add(bVar);
    }

    /* renamed from: c */
    public void mo15993c() {
        ValueAnimator valueAnimator = this.f13173c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f13173c = null;
        }
    }

    /* renamed from: d */
    public void mo15994d(int[] iArr) {
        C2049b bVar;
        int size = this.f13171a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                bVar = null;
                break;
            }
            bVar = (C2049b) this.f13171a.get(i);
            if (StateSet.stateSetMatches(bVar.f13176a, iArr)) {
                break;
            }
            i++;
        }
        C2049b bVar2 = this.f13172b;
        if (bVar != bVar2) {
            if (bVar2 != null) {
                m16195b();
            }
            this.f13172b = bVar;
            if (bVar != null) {
                m16196e(bVar);
            }
        }
    }
}
