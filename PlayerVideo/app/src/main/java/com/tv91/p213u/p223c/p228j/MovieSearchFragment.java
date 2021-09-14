package com.tv91.p213u.p223c.p228j;

import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.UmengObserver;
import com.tv91.features.shared.ViewSupplier;
import com.tv91.model.Movie;
import com.tv91.model.Paging;
import com.tv91.p207q.p208a.ErrorHandler;
import com.tv91.p210r.ViewMovieSearchBinding;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p213u.p223c.SearchScreen;
import com.tv91.p213u.p223c.SearchScreen.C2594a;
import com.tv91.p213u.p223c.p224f.MovieFragment.C2674a;
import com.tv91.p213u.p223c.p229k.LoadMoviesUseCase;
import com.tv91.p252x.FragmentKey;
import com.tv91.p252x.Navigator;
import com.tv91.utils.FragmentUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tv91.u.c.j.n */
public final class MovieSearchFragment extends Hilt_MovieSearchFragment {

    /* renamed from: h0 */
    LoadMoviesUseCase f15470h0;

    /* renamed from: i0 */
    private final ViewSupplier<C2594a> f15471i0 = new ViewSupplier<>(this, C2762b.f15454a);

    /* renamed from: j0 */
    private Navigator f15472j0;

    /* renamed from: k0 */
    private final List<Movie> f15473k0 = new ArrayList();

    /* renamed from: l0 */
    private int f15474l0 = 0;

    /* renamed from: m0 */
    private boolean f15475m0 = false;

    /* renamed from: n0 */
    private boolean f15476n0 = true;

    /* renamed from: o0 */
    private String f15477o0 = "";

    /* renamed from: p0 */
    private boolean f15478p0;

    /* renamed from: com.tv91.u.c.j.n$a */
    /* compiled from: MovieSearchFragment */
    public static final class C2773a extends FragmentKey {
        public static final Creator<C2773a> CREATOR = new C2774a();

        /* renamed from: com.tv91.u.c.j.n$a$a */
        /* compiled from: MovieSearchFragment */
        static class C2774a implements Creator<C2773a> {
            C2774a() {
            }

            /* renamed from: a */
            public C2773a createFromParcel(Parcel parcel) {
                return new C2773a(parcel);
            }

            /* renamed from: b */
            public C2773a[] newArray(int i) {
                return new C2773a[i];
            }
        }

        public C2773a() {
            super("搜尋頁面");
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public Fragment getFragment() {
            return new MovieSearchFragment();
        }

        /* renamed from: o */
        public void setCustomAnimations(FragmentTransaction xVar, boolean z) {
            if (z) {
                xVar.mo2944r(R.anim.enter_fade, 0);
            } else {
                xVar.mo2945s(0, R.anim.exit_to_bottom, 0, R.anim.exit_to_bottom);
            }
        }

        /* renamed from: p */
        public void mo16546p(FragmentTransaction xVar, boolean z) {
            if (z) {
                xVar.mo2944r(R.anim.enter_from_bottom, 0);
            } else {
                xVar.mo2944r(0, R.anim.exit_fade);
            }
        }

        protected C2773a(Parcel parcel) {
            super(parcel);
        }
    }

    public MovieSearchFragment() {
        super(R.layout.view_movie_search);
    }

    /* access modifiers changed from: private */
    /* renamed from: A2 */
    public /* synthetic */ void mo17919B2() {
        this.f15478p0 = false;
        mo17923I2(this.f15477o0);
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public /* synthetic */ void mo17920D2() {
        C2594a aVar = (C2594a) this.f15471i0.mo4947a();
        this.f15475m0 = true;
        aVar.mo17650a(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: E2 */
    public /* synthetic */ void mo17921F2() {
        C2594a aVar = (C2594a) this.f15471i0.mo4947a();
        this.f15475m0 = false;
        aVar.mo17650a(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: G2 */
    public /* synthetic */ void mo17922H2(Paging paging) {
        this.f15476n0 = this.f15474l0 < paging.pageCount;
        if (this.f15478p0) {
            this.f15473k0.clear();
        }
        this.f15473k0.addAll(paging.getMovies());
        ((C2594a) this.f15471i0.mo4947a()).mo17648O(paging.getMovies(), this.f15478p0);
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public /* synthetic */ void mo17925s2(ErrorBundle cVar) {
        ((C2594a) this.f15471i0.mo4947a()).mo16552g0(cVar.mo17114d());
    }

    /* renamed from: t2 */
    static /* synthetic */ C2594a m19424t2(View view) {
        return new SearchView(ViewMovieSearchBinding.m17754b(view));
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public /* synthetic */ void mo17926v2() {
        this.f15472j0.mo18587d();
    }

    /* access modifiers changed from: private */
    /* renamed from: w2 */
    public /* synthetic */ void mo17927x2(CharSequence charSequence) {
        this.f15478p0 = !FragmentUtils.m20581b(this.f15477o0, charSequence);
        String charSequence2 = charSequence.toString();
        this.f15477o0 = charSequence2;
        mo17923I2(charSequence2);
    }

    /* access modifiers changed from: private */
    /* renamed from: y2 */
    public /* synthetic */ void mo17928z2(Movie movie) {
        this.f15472j0.mo18588e(new C2674a(movie.f14083id, movie.sourceId));
    }

    /* renamed from: I2 */
    public void mo17923I2(String str) {
        if (!FragmentUtils.m20586g(str) && !this.f15475m0 && this.f15476n0) {
            if (!FragmentUtils.m20581b(this.f15477o0, str)) {
                this.f15474l0 = 0;
            }
            LoadMoviesUseCase y = this.f15470h0.mo17982A(new C2763c(this)).mo17991z(new C2769i(this)).mo17983B(new C2764d(this)).mo17990y(new C2772l(this));
            int i = this.f15474l0 + 1;
            this.f15474l0 = i;
            int i2 = SearchScreen.f15180a;
            this.f15477o0 = str;
            y.mo17984p(i, i2, str);
        }
    }

    /* renamed from: J0 */
    public void mo2370J0(Bundle bundle) {
        super.mo2370J0(bundle);
        mo132b().mo2999a(new UmengObserver(mo18584l2().getClassName()));
        this.f15472j0 = Navigator.m20631b(this);
    }

    /* renamed from: g1 */
    public void mo2437g1() {
        super.mo2437g1();
        ((C2594a) this.f15471i0.mo4947a()).mo17652d(new C2765e(this));
        ((C2594a) this.f15471i0.mo4947a()).mo17649Y1(new C2768h(this));
        ((C2594a) this.f15471i0.mo4947a()).mo17653e(new C2767g(this));
        ((C2594a) this.f15471i0.mo4947a()).mo17651c(new C2766f(this));
        if (!this.f15473k0.isEmpty() || FragmentUtils.m20586g(this.f15477o0)) {
            ((C2594a) this.f15471i0.mo4947a()).mo17648O(this.f15473k0, false);
        } else {
            mo17923I2(this.f15477o0);
        }
    }

    /* renamed from: h1 */
    public void mo2440h1() {
        super.mo2440h1();
        this.f15470h0.mo17051a();
    }

    /* renamed from: q2 */
    public void mo17924q2(ErrorBundle cVar) {
        ErrorHandler.m17647d(new C2761a(this)).mo4887a(cVar);
    }
}
