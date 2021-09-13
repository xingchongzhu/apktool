package com.tv91.p213u.p223c.p225g;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.chip.ninetyonetv.R;
import com.tv91.features.authentication.AuthActivity.C2145a;
import com.tv91.features.shared.UmengObserver;
import com.tv91.features.shared.ViewSupplier;
import com.tv91.features.shared.widget.CustomDialog;
import com.tv91.model.Movie;
import com.tv91.model.Paging;
import com.tv91.p207q.p208a.ErrorHandler;
import com.tv91.p210r.ViewFavoriteBinding;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p213u.p223c.FavoriteScreen;
import com.tv91.p213u.p223c.p224f.MovieFragment.C2674a;
import com.tv91.p213u.p223c.p229k.LoadFavoriteUseCase;
import com.tv91.p213u.p223c.p229k.RemoveFavoriteUseCase;
import com.tv91.p252x.FragmentKey;
import com.tv91.p252x.Navigator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tv91.u.c.g.s */
public final class FavoriteFragment extends Hilt_FavoriteFragment {

    /* renamed from: h0 */
    LoadFavoriteUseCase f15327h0;

    /* renamed from: i0 */
    RemoveFavoriteUseCase f15328i0;

    /* renamed from: j0 */
    private final ViewSupplier<FavoriteScreen> f15329j0 = new ViewSupplier<>(this, C2687j.f15317a);

    /* renamed from: k0 */
    private Navigator f15330k0;

    /* renamed from: l0 */
    private final List<Movie> f15331l0 = new ArrayList();

    /* renamed from: m0 */
    private int f15332m0 = 0;

    /* renamed from: n0 */
    private boolean f15333n0 = false;

    /* renamed from: o0 */
    private boolean f15334o0 = true;

    /* renamed from: com.tv91.u.c.g.s$a */
    /* compiled from: FavoriteFragment */
    public static final class C2696a extends FragmentKey {
        public static final Creator<C2696a> CREATOR = new C2697a();

        /* renamed from: com.tv91.u.c.g.s$a$a */
        /* compiled from: FavoriteFragment */
        static class C2697a implements Creator<C2696a> {
            C2697a() {
            }

            /* renamed from: a */
            public C2696a createFromParcel(Parcel parcel) {
                return new C2696a(parcel);
            }

            /* renamed from: b */
            public C2696a[] newArray(int i) {
                return new C2696a[i];
            }
        }

        public C2696a() {
            super("我的收藏頁面");
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public Fragment mo16544n() {
            return new FavoriteFragment();
        }

        /* renamed from: o */
        public void mo16545o(FragmentTransaction xVar, boolean z) {
            if (z) {
                xVar.mo2944r(R.anim.enter_fade, 0);
            } else {
                xVar.mo2944r(0, R.anim.exit_to_right);
            }
        }

        /* renamed from: p */
        public void mo16546p(FragmentTransaction xVar, boolean z) {
            if (z) {
                xVar.mo2944r(R.anim.enter_from_right, 0);
            } else {
                xVar.mo2944r(0, R.anim.exit_fade);
            }
        }

        protected C2696a(Parcel parcel) {
            super(parcel);
        }
    }

    public FavoriteFragment() {
        super(R.layout.view_favorite);
    }

    /* renamed from: B2 */
    static /* synthetic */ FavoriteScreen m19121B2(View view) {
        return new FavoriteView(ViewFavoriteBinding.m17705b(view));
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public /* synthetic */ void mo17790D2() {
        this.f15330k0.mo18588e(new C2145a());
    }

    /* access modifiers changed from: private */
    /* renamed from: G2 */
    public /* synthetic */ void mo17792H2() {
        this.f15330k0.mo18587d();
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public /* synthetic */ void mo17793J2() {
        ((FavoriteScreen) this.f15329j0.mo4947a()).mo17590L();
    }

    /* access modifiers changed from: private */
    /* renamed from: K2 */
    public /* synthetic */ void mo17794L2(Movie movie) {
        this.f15330k0.mo18588e(new C2674a(movie.f14083id, movie.sourceId));
    }

    /* access modifiers changed from: private */
    /* renamed from: M2 */
    public /* synthetic */ void mo17795N2(Movie movie) {
        ((FavoriteScreen) this.f15329j0.mo4947a()).mo17591Q0(movie.name, new C2684g(this, movie));
    }

    /* access modifiers changed from: private */
    /* renamed from: O2 */
    public /* synthetic */ void mo17796P2() {
        m19131W2(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q2 */
    public /* synthetic */ void mo17797R2(Movie movie) {
        ((FavoriteScreen) this.f15329j0.mo4947a()).mo17592W(movie);
    }

    /* access modifiers changed from: private */
    /* renamed from: S2 */
    public /* synthetic */ void mo17798T2() {
        m19131W2(true);
    }

    /* renamed from: W2 */
    private void m19131W2(boolean z) {
        ((FavoriteScreen) this.f15329j0.mo4947a()).mo17593a(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public /* synthetic */ void mo17802s2(ErrorBundle cVar) {
        ((FavoriteScreen) this.f15329j0.mo4947a()).mo16552g0(cVar.mo17112b());
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public /* synthetic */ void mo17803u2(ErrorBundle cVar) {
        CustomDialog.m17424b(mo2379M1(), new C2688k(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public /* synthetic */ void mo17804w2() {
        this.f15333n0 = true;
        m19131W2(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public /* synthetic */ void mo17805y2() {
        this.f15333n0 = false;
        m19131W2(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: z2 */
    public /* synthetic */ void mo17789A2(Paging paging) {
        this.f15334o0 = this.f15332m0 < paging.pageCount;
        this.f15331l0.addAll(paging.getMovies());
        ((FavoriteScreen) this.f15329j0.mo4947a()).mo17589H1(paging.getMovies());
    }

    /* renamed from: J0 */
    public void mo2370J0(Bundle bundle) {
        super.mo2370J0(bundle);
        mo132b().mo2999a(new UmengObserver(mo18584l2().mo18581m()));
        this.f15330k0 = Navigator.m20631b(this);
    }

    /* renamed from: U2 */
    public void mo17799U2() {
        if (!this.f15333n0 && this.f15334o0) {
            LoadFavoriteUseCase u = this.f15327h0.mo17957w(new C2694q(this)).mo17956v(new C2691n(this)).mo17958x(new C2680c(this)).mo17955u(new C2679b(this));
            int i = this.f15332m0 + 1;
            this.f15332m0 = i;
            u.mo17951o(i, 40);
        }
    }

    /* renamed from: V2 */
    public void m19123E2(Movie movie) {
        this.f15328i0.mo17998w(new C2681d(this)).mo17997v(new C2683f(this)).mo17999x(new C2682e(this)).mo17996u(new C2679b(this)).mo17992o(movie);
    }

    /* renamed from: g1 */
    public void mo2437g1() {
        super.mo2437g1();
        ((FavoriteScreen) this.f15329j0.mo4947a()).mo17594b(new C2686i(this));
        ((FavoriteScreen) this.f15329j0.mo4947a()).mo17598o(new C2692o(this));
        ((FavoriteScreen) this.f15329j0.mo4947a()).mo17595c(new C2678a(this));
        ((FavoriteScreen) this.f15329j0.mo4947a()).mo17596e(new C2689l(this));
        ((FavoriteScreen) this.f15329j0.mo4947a()).mo17597n(new C2685h(this));
        if (this.f15331l0.isEmpty()) {
            mo17799U2();
        } else {
            ((FavoriteScreen) this.f15329j0.mo4947a()).mo17589H1(this.f15331l0);
        }
    }

    /* renamed from: h1 */
    public void mo2440h1() {
        super.mo2440h1();
        this.f15327h0.mo17051a();
        this.f15328i0.mo17051a();
    }

    /* renamed from: q2 */
    public void mo17801q2(ErrorBundle cVar) {
        ErrorHandler.m17647d(new C2690m(this)).mo17046c("0000001", new C2693p(this)).mo4887a(cVar);
    }
}
