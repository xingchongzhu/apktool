package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import p010b.p034g.p039g.CancellationSignal;
import p010b.p034g.p039g.CancellationSignal.C0584a;
import p010b.p034g.p043k.OneShotPreDrawListener;
import p010b.p053k.C0687a;
import p010b.p053k.C0688b;

/* renamed from: androidx.fragment.app.f */
class FragmentAnim {

    /* renamed from: androidx.fragment.app.f$a */
    /* compiled from: FragmentAnim */
    class C0322a implements C0584a {

        /* renamed from: a */
        final /* synthetic */ Fragment f2360a;

        C0322a(Fragment fragment) {
            this.f2360a = fragment;
        }

        /* renamed from: a */
        public void mo2577a() {
            if (this.f2360a.mo2355E() != null) {
                View E = this.f2360a.mo2355E();
                this.f2360a.mo2398T1(null);
                E.clearAnimation();
            }
            this.f2360a.mo2404V1(null);
        }
    }

    /* renamed from: androidx.fragment.app.f$b */
    /* compiled from: FragmentAnim */
    class C0323b implements AnimationListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f2361a;

        /* renamed from: b */
        final /* synthetic */ Fragment f2362b;

        /* renamed from: c */
        final /* synthetic */ C0360g f2363c;

        /* renamed from: d */
        final /* synthetic */ CancellationSignal f2364d;

        /* renamed from: androidx.fragment.app.f$b$a */
        /* compiled from: FragmentAnim */
        class C0324a implements Runnable {
            C0324a() {
            }

            public void run() {
                if (C0323b.this.f2362b.mo2355E() != null) {
                    C0323b.this.f2362b.mo2398T1(null);
                    C0323b bVar = C0323b.this;
                    bVar.f2363c.mo2833a(bVar.f2362b, bVar.f2364d);
                }
            }
        }

        C0323b(ViewGroup viewGroup, Fragment fragment, C0360g gVar, CancellationSignal bVar) {
            this.f2361a = viewGroup;
            this.f2362b = fragment;
            this.f2363c = gVar;
            this.f2364d = bVar;
        }

        public void onAnimationEnd(Animation animation) {
            this.f2361a.post(new C0324a());
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.fragment.app.f$c */
    /* compiled from: FragmentAnim */
    class C0325c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f2366a;

        /* renamed from: b */
        final /* synthetic */ View f2367b;

        /* renamed from: c */
        final /* synthetic */ Fragment f2368c;

        /* renamed from: d */
        final /* synthetic */ C0360g f2369d;

        /* renamed from: e */
        final /* synthetic */ CancellationSignal f2370e;

        C0325c(ViewGroup viewGroup, View view, Fragment fragment, C0360g gVar, CancellationSignal bVar) {
            this.f2366a = viewGroup;
            this.f2367b = view;
            this.f2368c = fragment;
            this.f2369d = gVar;
            this.f2370e = bVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f2366a.endViewTransition(this.f2367b);
            Animator F = this.f2368c.mo2358F();
            this.f2368c.mo2404V1(null);
            if (F != null && this.f2366a.indexOfChild(this.f2367b) < 0) {
                this.f2369d.mo2833a(this.f2368c, this.f2370e);
            }
        }
    }

    /* renamed from: androidx.fragment.app.f$d */
    /* compiled from: FragmentAnim */
    static class C0326d {

        /* renamed from: a */
        public final Animation f2371a;

        /* renamed from: b */
        public final Animator f2372b;

        C0326d(Animation animation) {
            this.f2371a = animation;
            this.f2372b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        C0326d(Animator animator) {
            this.f2371a = null;
            this.f2372b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* renamed from: androidx.fragment.app.f$e */
    /* compiled from: FragmentAnim */
    static class C0327e extends AnimationSet implements Runnable {

        /* renamed from: a */
        private final ViewGroup f2373a;

        /* renamed from: b */
        private final View f2374b;

        /* renamed from: c */
        private boolean f2375c;

        /* renamed from: d */
        private boolean f2376d;

        /* renamed from: e */
        private boolean f2377e = true;

        C0327e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f2373a = viewGroup;
            this.f2374b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation) {
            this.f2377e = true;
            if (this.f2375c) {
                return !this.f2376d;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f2375c = true;
                OneShotPreDrawListener.m5506a(this.f2373a, this);
            }
            return true;
        }

        public void run() {
            if (this.f2375c || !this.f2377e) {
                this.f2373a.endViewTransition(this.f2374b);
                this.f2376d = true;
                return;
            }
            this.f2377e = false;
            this.f2373a.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f2377e = true;
            if (this.f2375c) {
                return !this.f2376d;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f2375c = true;
                OneShotPreDrawListener.m5506a(this.f2373a, this);
            }
            return true;
        }
    }

    /* renamed from: a */
    static void m2344a(Fragment fragment, C0326d dVar, C0360g gVar) {
        View view = fragment.f2135K;
        ViewGroup viewGroup = fragment.f2134J;
        viewGroup.startViewTransition(view);
        CancellationSignal bVar = new CancellationSignal();
        bVar.mo4872c(new C0322a(fragment));
        gVar.mo2834b(fragment, bVar);
        if (dVar.f2371a != null) {
            C0327e eVar = new C0327e(dVar.f2371a, viewGroup, view);
            fragment.mo2398T1(fragment.f2135K);
            eVar.setAnimationListener(new C0323b(viewGroup, fragment, gVar, bVar));
            fragment.f2135K.startAnimation(eVar);
            return;
        }
        Animator animator = dVar.f2372b;
        fragment.mo2404V1(animator);
        C0325c cVar = new C0325c(viewGroup, view, fragment, gVar, bVar);
        animator.addListener(cVar);
        animator.setTarget(fragment.f2135K);
        animator.start();
    }

    /* renamed from: b */
    private static int m2345b(Fragment fragment, boolean z, boolean z2) {
        if (z2) {
            if (z) {
                return fragment.mo2411Y();
            }
            return fragment.mo2414Z();
        } else if (z) {
            return fragment.mo2369J();
        } else {
            return fragment.mo2377M();
        }
    }

    /* renamed from: c */
    static C0326d m2346c(Context context, Fragment fragment, boolean z, boolean z2) {
        int U = fragment.mo2399U();
        int b = m2345b(fragment, z, z2);
        boolean z3 = false;
        fragment.mo2401U1(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.f2134J;
        if (viewGroup != null) {
            int i = C0688b.visible_removing_fragment_view_tag;
            if (viewGroup.getTag(i) != null) {
                fragment.f2134J.setTag(i, null);
            }
        }
        ViewGroup viewGroup2 = fragment.f2134J;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation K0 = fragment.mo2373K0(U, z, b);
        if (K0 != null) {
            return new C0326d(K0);
        }
        Animator L0 = fragment.mo2375L0(U, z, b);
        if (L0 != null) {
            return new C0326d(L0);
        }
        if (b == 0 && U != 0) {
            b = m2347d(U, z);
        }
        if (b != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(b));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, b);
                    if (loadAnimation != null) {
                        return new C0326d(loadAnimation);
                    }
                    z3 = true;
                } catch (NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z3) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, b);
                    if (loadAnimator != null) {
                        return new C0326d(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, b);
                        if (loadAnimation2 != null) {
                            return new C0326d(loadAnimation2);
                        }
                    } else {
                        throw e2;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    private static int m2347d(int i, boolean z) {
        if (i == 4097) {
            return z ? C0687a.fragment_open_enter : C0687a.fragment_open_exit;
        }
        if (i == 4099) {
            return z ? C0687a.fragment_fade_enter : C0687a.fragment_fade_exit;
        }
        if (i != 8194) {
            return -1;
        }
        return z ? C0687a.fragment_close_enter : C0687a.fragment_close_exit;
    }
}
