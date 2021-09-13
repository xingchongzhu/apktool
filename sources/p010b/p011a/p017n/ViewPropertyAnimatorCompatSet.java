package p010b.p011a.p017n;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p010b.p034g.p043k.ViewPropertyAnimatorCompat;
import p010b.p034g.p043k.ViewPropertyAnimatorListener;
import p010b.p034g.p043k.ViewPropertyAnimatorListenerAdapter;

/* renamed from: b.a.n.h */
public class ViewPropertyAnimatorCompatSet {

    /* renamed from: a */
    final ArrayList<ViewPropertyAnimatorCompat> f3843a = new ArrayList<>();

    /* renamed from: b */
    private long f3844b = -1;

    /* renamed from: c */
    private Interpolator f3845c;

    /* renamed from: d */
    ViewPropertyAnimatorListener f3846d;

    /* renamed from: e */
    private boolean f3847e;

    /* renamed from: f */
    private final ViewPropertyAnimatorListenerAdapter f3848f = new C0531a();

    /* renamed from: b.a.n.h$a */
    /* compiled from: ViewPropertyAnimatorCompatSet */
    class C0531a extends ViewPropertyAnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f3849a = false;

        /* renamed from: b */
        private int f3850b = 0;

        C0531a() {
        }

        /* renamed from: b */
        public void mo387b(View view) {
            int i = this.f3850b + 1;
            this.f3850b = i;
            if (i == ViewPropertyAnimatorCompatSet.this.f3843a.size()) {
                ViewPropertyAnimatorListener b0Var = ViewPropertyAnimatorCompatSet.this.f3846d;
                if (b0Var != null) {
                    b0Var.mo387b(null);
                }
                mo4246d();
            }
        }

        /* renamed from: c */
        public void mo388c(View view) {
            if (!this.f3849a) {
                this.f3849a = true;
                ViewPropertyAnimatorListener b0Var = ViewPropertyAnimatorCompatSet.this.f3846d;
                if (b0Var != null) {
                    b0Var.mo388c(null);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo4246d() {
            this.f3850b = 0;
            this.f3849a = false;
            ViewPropertyAnimatorCompatSet.this.mo4239b();
        }
    }

    /* renamed from: a */
    public void mo4238a() {
        if (this.f3847e) {
            Iterator it = this.f3843a.iterator();
            while (it.hasNext()) {
                ((ViewPropertyAnimatorCompat) it.next()).mo4959b();
            }
            this.f3847e = false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo4239b() {
        this.f3847e = false;
    }

    /* renamed from: c */
    public ViewPropertyAnimatorCompatSet mo4240c(ViewPropertyAnimatorCompat a0Var) {
        if (!this.f3847e) {
            this.f3843a.add(a0Var);
        }
        return this;
    }

    /* renamed from: d */
    public ViewPropertyAnimatorCompatSet mo4241d(ViewPropertyAnimatorCompat a0Var, ViewPropertyAnimatorCompat a0Var2) {
        this.f3843a.add(a0Var);
        a0Var2.mo4964h(a0Var.mo4960c());
        this.f3843a.add(a0Var2);
        return this;
    }

    /* renamed from: e */
    public ViewPropertyAnimatorCompatSet mo4242e(long j) {
        if (!this.f3847e) {
            this.f3844b = j;
        }
        return this;
    }

    /* renamed from: f */
    public ViewPropertyAnimatorCompatSet mo4243f(Interpolator interpolator) {
        if (!this.f3847e) {
            this.f3845c = interpolator;
        }
        return this;
    }

    /* renamed from: g */
    public ViewPropertyAnimatorCompatSet mo4244g(ViewPropertyAnimatorListener b0Var) {
        if (!this.f3847e) {
            this.f3846d = b0Var;
        }
        return this;
    }

    /* renamed from: h */
    public void mo4245h() {
        if (!this.f3847e) {
            Iterator it = this.f3843a.iterator();
            while (it.hasNext()) {
                ViewPropertyAnimatorCompat a0Var = (ViewPropertyAnimatorCompat) it.next();
                long j = this.f3844b;
                if (j >= 0) {
                    a0Var.mo4961d(j);
                }
                Interpolator interpolator = this.f3845c;
                if (interpolator != null) {
                    a0Var.mo4962e(interpolator);
                }
                if (this.f3846d != null) {
                    a0Var.mo4963f(this.f3848f);
                }
                a0Var.mo4966j();
            }
            this.f3847e = true;
        }
    }
}
