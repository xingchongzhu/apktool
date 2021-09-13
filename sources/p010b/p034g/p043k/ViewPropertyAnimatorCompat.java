package p010b.p034g.p043k;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: b.g.k.a0 */
public final class ViewPropertyAnimatorCompat {

    /* renamed from: a */
    private WeakReference<View> f4596a;

    /* renamed from: b */
    Runnable f4597b = null;

    /* renamed from: c */
    Runnable f4598c = null;

    /* renamed from: d */
    int f4599d = -1;

    /* renamed from: b.g.k.a0$a */
    /* compiled from: ViewPropertyAnimatorCompat */
    class C0614a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewPropertyAnimatorListener f4600a;

        /* renamed from: b */
        final /* synthetic */ View f4601b;

        C0614a(ViewPropertyAnimatorListener b0Var, View view) {
            this.f4600a = b0Var;
            this.f4601b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.f4600a.mo1283a(this.f4601b);
        }

        public void onAnimationEnd(Animator animator) {
            this.f4600a.mo387b(this.f4601b);
        }

        public void onAnimationStart(Animator animator) {
            this.f4600a.mo388c(this.f4601b);
        }
    }

    /* renamed from: b.g.k.a0$b */
    /* compiled from: ViewPropertyAnimatorCompat */
    class C0615b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ViewPropertyAnimatorUpdateListener f4603a;

        /* renamed from: b */
        final /* synthetic */ View f4604b;

        C0615b(ViewPropertyAnimatorUpdateListener d0Var, View view) {
            this.f4603a = d0Var;
            this.f4604b = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f4603a.mo469a(this.f4604b);
        }
    }

    /* renamed from: b.g.k.a0$c */
    /* compiled from: ViewPropertyAnimatorCompat */
    static class C0616c implements ViewPropertyAnimatorListener {

        /* renamed from: a */
        ViewPropertyAnimatorCompat f4606a;

        /* renamed from: b */
        boolean f4607b;

        C0616c(ViewPropertyAnimatorCompat a0Var) {
            this.f4606a = a0Var;
        }

        /* renamed from: a */
        public void mo1283a(View view) {
            Object tag = view.getTag(2113929216);
            ViewPropertyAnimatorListener b0Var = tag instanceof ViewPropertyAnimatorListener ? (ViewPropertyAnimatorListener) tag : null;
            if (b0Var != null) {
                b0Var.mo1283a(view);
            }
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: b */
        public void mo387b(View view) {
            int i = this.f4606a.f4599d;
            ViewPropertyAnimatorListener b0Var = null;
            if (i > -1) {
                view.setLayerType(i, null);
                this.f4606a.f4599d = -1;
            }
            if (VERSION.SDK_INT >= 16 || !this.f4607b) {
                ViewPropertyAnimatorCompat a0Var = this.f4606a;
                Runnable runnable = a0Var.f4598c;
                if (runnable != null) {
                    a0Var.f4598c = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                if (tag instanceof ViewPropertyAnimatorListener) {
                    b0Var = (ViewPropertyAnimatorListener) tag;
                }
                if (b0Var != null) {
                    b0Var.mo387b(view);
                }
                this.f4607b = true;
            }
        }

        /* renamed from: c */
        public void mo388c(View view) {
            this.f4607b = false;
            ViewPropertyAnimatorListener b0Var = null;
            if (this.f4606a.f4599d > -1) {
                view.setLayerType(2, null);
            }
            ViewPropertyAnimatorCompat a0Var = this.f4606a;
            Runnable runnable = a0Var.f4597b;
            if (runnable != null) {
                a0Var.f4597b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            if (tag instanceof ViewPropertyAnimatorListener) {
                b0Var = (ViewPropertyAnimatorListener) tag;
            }
            if (b0Var != null) {
                b0Var.mo388c(view);
            }
        }
    }

    ViewPropertyAnimatorCompat(View view) {
        this.f4596a = new WeakReference<>(view);
    }

    /* renamed from: g */
    private void m5204g(View view, ViewPropertyAnimatorListener b0Var) {
        if (b0Var != null) {
            view.animate().setListener(new C0614a(b0Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    /* renamed from: a */
    public ViewPropertyAnimatorCompat mo4958a(float f) {
        View view = (View) this.f4596a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: b */
    public void mo4959b() {
        View view = (View) this.f4596a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: c */
    public long mo4960c() {
        View view = (View) this.f4596a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    /* renamed from: d */
    public ViewPropertyAnimatorCompat mo4961d(long j) {
        View view = (View) this.f4596a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: e */
    public ViewPropertyAnimatorCompat mo4962e(Interpolator interpolator) {
        View view = (View) this.f4596a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: f */
    public ViewPropertyAnimatorCompat mo4963f(ViewPropertyAnimatorListener b0Var) {
        View view = (View) this.f4596a.get();
        if (view != null) {
            if (VERSION.SDK_INT >= 16) {
                m5204g(view, b0Var);
            } else {
                view.setTag(2113929216, b0Var);
                m5204g(view, new C0616c(this));
            }
        }
        return this;
    }

    /* renamed from: h */
    public ViewPropertyAnimatorCompat mo4964h(long j) {
        View view = (View) this.f4596a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    /* renamed from: i */
    public ViewPropertyAnimatorCompat mo4965i(ViewPropertyAnimatorUpdateListener d0Var) {
        View view = (View) this.f4596a.get();
        if (view != null && VERSION.SDK_INT >= 19) {
            C0615b bVar = null;
            if (d0Var != null) {
                bVar = new C0615b(d0Var, view);
            }
            view.animate().setUpdateListener(bVar);
        }
        return this;
    }

    /* renamed from: j */
    public void mo4966j() {
        View view = (View) this.f4596a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: k */
    public ViewPropertyAnimatorCompat mo4967k(float f) {
        View view = (View) this.f4596a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
