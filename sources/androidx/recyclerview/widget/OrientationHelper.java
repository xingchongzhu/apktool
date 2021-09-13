package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.C0421o;
import androidx.recyclerview.widget.RecyclerView.C0426p;

/* renamed from: androidx.recyclerview.widget.j */
public abstract class OrientationHelper {

    /* renamed from: a */
    protected final C0421o f3131a;

    /* renamed from: b */
    private int f3132b;

    /* renamed from: c */
    final Rect f3133c;

    /* renamed from: androidx.recyclerview.widget.j$a */
    /* compiled from: OrientationHelper */
    static class C0472a extends OrientationHelper {
        C0472a(C0421o oVar) {
            super(oVar, null);
        }

        /* renamed from: d */
        public int mo3858d(View view) {
            return this.f3131a.mo3507T(view) + ((C0426p) view.getLayoutParams()).rightMargin;
        }

        /* renamed from: e */
        public int mo3859e(View view) {
            C0426p pVar = (C0426p) view.getLayoutParams();
            return this.f3131a.mo3506S(view) + pVar.leftMargin + pVar.rightMargin;
        }

        /* renamed from: f */
        public int mo3860f(View view) {
            C0426p pVar = (C0426p) view.getLayoutParams();
            return this.f3131a.mo3505R(view) + pVar.topMargin + pVar.bottomMargin;
        }

        /* renamed from: g */
        public int mo3861g(View view) {
            return this.f3131a.mo3503Q(view) - ((C0426p) view.getLayoutParams()).leftMargin;
        }

        /* renamed from: h */
        public int mo3862h() {
            return this.f3131a.mo3547o0();
        }

        /* renamed from: i */
        public int mo3863i() {
            return this.f3131a.mo3547o0() - this.f3131a.mo3528f0();
        }

        /* renamed from: j */
        public int mo3864j() {
            return this.f3131a.mo3528f0();
        }

        /* renamed from: k */
        public int mo3865k() {
            return this.f3131a.mo3549p0();
        }

        /* renamed from: l */
        public int mo3866l() {
            return this.f3131a.mo3512X();
        }

        /* renamed from: m */
        public int mo3867m() {
            return this.f3131a.mo3526e0();
        }

        /* renamed from: n */
        public int mo3868n() {
            return (this.f3131a.mo3547o0() - this.f3131a.mo3526e0()) - this.f3131a.mo3528f0();
        }

        /* renamed from: p */
        public int mo3870p(View view) {
            this.f3131a.mo3545n0(view, true, this.f3133c);
            return this.f3133c.right;
        }

        /* renamed from: q */
        public int mo3871q(View view) {
            this.f3131a.mo3545n0(view, true, this.f3133c);
            return this.f3133c.left;
        }

        /* renamed from: r */
        public void mo3872r(int i) {
            this.f3131a.mo3480C0(i);
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$b */
    /* compiled from: OrientationHelper */
    static class C0473b extends OrientationHelper {
        C0473b(C0421o oVar) {
            super(oVar, null);
        }

        /* renamed from: d */
        public int mo3858d(View view) {
            return this.f3131a.mo3500O(view) + ((C0426p) view.getLayoutParams()).bottomMargin;
        }

        /* renamed from: e */
        public int mo3859e(View view) {
            C0426p pVar = (C0426p) view.getLayoutParams();
            return this.f3131a.mo3505R(view) + pVar.topMargin + pVar.bottomMargin;
        }

        /* renamed from: f */
        public int mo3860f(View view) {
            C0426p pVar = (C0426p) view.getLayoutParams();
            return this.f3131a.mo3506S(view) + pVar.leftMargin + pVar.rightMargin;
        }

        /* renamed from: g */
        public int mo3861g(View view) {
            return this.f3131a.mo3508U(view) - ((C0426p) view.getLayoutParams()).topMargin;
        }

        /* renamed from: h */
        public int mo3862h() {
            return this.f3131a.mo3511W();
        }

        /* renamed from: i */
        public int mo3863i() {
            return this.f3131a.mo3511W() - this.f3131a.mo3524d0();
        }

        /* renamed from: j */
        public int mo3864j() {
            return this.f3131a.mo3524d0();
        }

        /* renamed from: k */
        public int mo3865k() {
            return this.f3131a.mo3512X();
        }

        /* renamed from: l */
        public int mo3866l() {
            return this.f3131a.mo3549p0();
        }

        /* renamed from: m */
        public int mo3867m() {
            return this.f3131a.mo3530g0();
        }

        /* renamed from: n */
        public int mo3868n() {
            return (this.f3131a.mo3511W() - this.f3131a.mo3530g0()) - this.f3131a.mo3524d0();
        }

        /* renamed from: p */
        public int mo3870p(View view) {
            this.f3131a.mo3545n0(view, true, this.f3133c);
            return this.f3133c.bottom;
        }

        /* renamed from: q */
        public int mo3871q(View view) {
            this.f3131a.mo3545n0(view, true, this.f3133c);
            return this.f3133c.top;
        }

        /* renamed from: r */
        public void mo3872r(int i) {
            this.f3131a.mo3481D0(i);
        }
    }

    /* synthetic */ OrientationHelper(C0421o oVar, C0472a aVar) {
        this(oVar);
    }

    /* renamed from: a */
    public static OrientationHelper m3830a(C0421o oVar) {
        return new C0472a(oVar);
    }

    /* renamed from: b */
    public static OrientationHelper m3831b(C0421o oVar, int i) {
        if (i == 0) {
            return m3830a(oVar);
        }
        if (i == 1) {
            return m3832c(oVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: c */
    public static OrientationHelper m3832c(C0421o oVar) {
        return new C0473b(oVar);
    }

    /* renamed from: d */
    public abstract int mo3858d(View view);

    /* renamed from: e */
    public abstract int mo3859e(View view);

    /* renamed from: f */
    public abstract int mo3860f(View view);

    /* renamed from: g */
    public abstract int mo3861g(View view);

    /* renamed from: h */
    public abstract int mo3862h();

    /* renamed from: i */
    public abstract int mo3863i();

    /* renamed from: j */
    public abstract int mo3864j();

    /* renamed from: k */
    public abstract int mo3865k();

    /* renamed from: l */
    public abstract int mo3866l();

    /* renamed from: m */
    public abstract int mo3867m();

    /* renamed from: n */
    public abstract int mo3868n();

    /* renamed from: o */
    public int mo3869o() {
        if (Integer.MIN_VALUE == this.f3132b) {
            return 0;
        }
        return mo3868n() - this.f3132b;
    }

    /* renamed from: p */
    public abstract int mo3870p(View view);

    /* renamed from: q */
    public abstract int mo3871q(View view);

    /* renamed from: r */
    public abstract void mo3872r(int i);

    /* renamed from: s */
    public void mo3873s() {
        this.f3132b = mo3868n();
    }

    private OrientationHelper(C0421o oVar) {
        this.f3132b = Integer.MIN_VALUE;
        this.f3133c = new Rect();
        this.f3131a = oVar;
    }
}
