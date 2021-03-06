package com.tv91.p213u.p223c.p227i;

import android.os.Bundle;
import android.view.View;
import com.tv91.features.shared.ViewSupplier;
import com.tv91.model.Movie;
import com.tv91.model.Paging;
import com.tv91.model.RankType;
import com.tv91.p207q.p208a.ErrorHandler;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p213u.p223c.MoviesScreen.MoviesScreenPlayer;
import com.tv91.p213u.p223c.p224f.MovieFragment.C2674a;
import com.tv91.p213u.p223c.p229k.LoadMoviesUseCase;
import com.tv91.p213u.p223c.p229k.LoadMoviesUseCase.C2792a;
import com.tv91.p252x.Navigator;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/* renamed from: com.tv91.u.c.i.v */
public abstract class BaseMoviesFragment extends Hilt_BaseMoviesFragment {

    /* renamed from: h0 */
    LoadMoviesUseCase loadMoviesUseCase;

    /* renamed from: i0 */
    private ViewSupplier<MoviesScreenPlayer> moviesScreenPlayerViewSupplier;

    /* renamed from: j0 */
    private Navigator navigator;

    /* renamed from: k0 */
    private final List<Movie> movieList = new ArrayList();

    /* renamed from: l0 */
    private int f15442l0 = 0;

    /* renamed from: m0 */
    private boolean f15443m0 = false;

    /* renamed from: n0 */
    private boolean f15444n0 = true;

    public BaseMoviesFragment() {
    }

    /* access modifiers changed from: private */
    /* renamed from: B2 */
    public /* synthetic */ void mo17885C2() {
        MoviesScreenPlayer aVar = (MoviesScreenPlayer) this.moviesScreenPlayerViewSupplier.mo4947a();
        this.f15443m0 = false;
        aVar.mo17644a(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: D2 */
    public /* synthetic */ void mo17886E2() {
        MoviesScreenPlayer aVar = (MoviesScreenPlayer) this.moviesScreenPlayerViewSupplier.mo4947a();
        this.f15443m0 = true;
        aVar.mo17644a(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: F2 */
    public /* synthetic */ void mo17887G2() {
        MoviesScreenPlayer aVar = (MoviesScreenPlayer) this.moviesScreenPlayerViewSupplier.mo4947a();
        this.f15443m0 = false;
        aVar.mo17644a(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: H2 */
    public /* synthetic */ void mo17888I2() {
        MoviesScreenPlayer aVar = (MoviesScreenPlayer) this.moviesScreenPlayerViewSupplier.mo4947a();
        this.f15443m0 = true;
        aVar.mo17644a(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public /* synthetic */ void mo17889K2() {
        MoviesScreenPlayer aVar = (MoviesScreenPlayer) this.moviesScreenPlayerViewSupplier.mo4947a();
        this.f15443m0 = false;
        aVar.mo17644a(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: L2 */
    public /* synthetic */ void mo17890M2() {
        MoviesScreenPlayer aVar = (MoviesScreenPlayer) this.moviesScreenPlayerViewSupplier.mo4947a();
        this.f15443m0 = true;
        aVar.mo17644a(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: N2 */
    public /* synthetic */ void mo17891O2() {
        MoviesScreenPlayer aVar = (MoviesScreenPlayer) this.moviesScreenPlayerViewSupplier.mo4947a();
        this.f15443m0 = false;
        aVar.mo17644a(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public /* synthetic */ void mo17892Q2() {
        this.navigator.mo18587d();
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public /* synthetic */ void mo17893S2(Movie movie) {
        this.navigator.mo18588e(new C2674a(movie.f14083id, movie.sourceId));
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public void m19351r2(Paging<Movie> paging) {
        this.f15444n0 = this.f15442l0 < paging.pageCount;
        this.movieList.addAll(paging.getMovies());
        ((MoviesScreenPlayer) this.moviesScreenPlayerViewSupplier.mo4947a()).mo17643T(paging.getMovies());
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public /* synthetic */ void mo17900u2(ErrorBundle cVar) {
        ((MoviesScreenPlayer) this.moviesScreenPlayerViewSupplier.mo4947a()).mo16552g0(cVar.mo17114d());
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public /* synthetic */ void mo17901w2() {
        MoviesScreenPlayer aVar = (MoviesScreenPlayer) this.moviesScreenPlayerViewSupplier.mo4947a();
        this.f15443m0 = true;
        aVar.mo17644a(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public /* synthetic */ void mo17902y2() {
        MoviesScreenPlayer aVar = (MoviesScreenPlayer) this.moviesScreenPlayerViewSupplier.mo4947a();
        this.f15443m0 = false;
        aVar.mo17644a(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: z2 */
    public /* synthetic */ void mo17884A2() {
        MoviesScreenPlayer aVar = (MoviesScreenPlayer) this.moviesScreenPlayerViewSupplier.mo4947a();
        this.f15443m0 = true;
        aVar.mo17644a(true);
    }

    /* renamed from: J0 */
    public void mo2370J0(Bundle bundle) {
        super.mo2370J0(bundle);
        this.moviesScreenPlayerViewSupplier = new ViewSupplier<>(this, mo17848Z2());
        this.navigator = Navigator.m20631b(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: T2 */
    public abstract void mo17847T2();

    /* renamed from: U2 */
    public void mo17894U2(int i, int i2) {
        if (!this.f15443m0 && this.f15444n0) {
            LoadMoviesUseCase y = this.loadMoviesUseCase.mo17982A(new C2737e(this)).mo17991z(new C2748k(this)).mo17983B(new C2746i(this)).mo17990y(new C2724a(this));
            C2792a aVar = C2792a.ACTOR;
            int i3 = this.f15442l0 + 1;
            this.f15442l0 = i3;
            y.mo17986r(aVar, i, i3, i2);
        }
    }

    /* renamed from: V2 */
    public void mo17895V2(int i, int i2) {
        if (!this.f15443m0 && this.f15444n0) {
            LoadMoviesUseCase y = this.loadMoviesUseCase.mo17982A(new C2747j(this)).mo17991z(new C2744g(this)).mo17983B(new C2746i(this)).mo17990y(new C2724a(this));
            C2792a aVar = C2792a.CATEGORY;
            int i3 = this.f15442l0 + 1;
            this.f15442l0 = i3;
            y.mo17986r(aVar, i, i3, i2);
        }
    }

    /* renamed from: W2 */
    public void mo17896W2(int i, int i2) {
        if (!this.f15443m0 && this.f15444n0) {
            LoadMoviesUseCase y = this.loadMoviesUseCase.mo17982A(new C2730c(this)).mo17991z(new C2727b(this)).mo17983B(new C2746i(this)).mo17990y(new C2724a(this));
            C2792a aVar = C2792a.CHANNEL;
            int i3 = this.f15442l0 + 1;
            this.f15442l0 = i3;
            y.mo17986r(aVar, i, i3, i2);
        }
    }

    /* renamed from: X2 */
    public void mo17897X2(RankType cVar) {
        if (!this.f15443m0 && this.movieList.isEmpty()) {
            this.loadMoviesUseCase.mo17982A(new C2745h(this)).mo17991z(new C2734d(this)).mo17983B(new C2746i(this)).mo17990y(new C2724a(this)).mo17987s(cVar);
        }
    }

    /* renamed from: Y2 */
    public void mo17898Y2(int i, int i2) {
        if (!this.f15443m0 && this.f15444n0) {
            LoadMoviesUseCase y = this.loadMoviesUseCase.mo17982A(new C2743f(this)).mo17991z(new C2751n(this)).mo17983B(new C2746i(this)).mo17990y(new C2724a(this));
            C2792a aVar = C2792a.SOURCE;
            int i3 = this.f15442l0 + 1;
            this.f15442l0 = i3;
            y.mo17986r(aVar, i, i3, i2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z2 */
    public abstract Function<View, MoviesScreenPlayer> mo17848Z2();

    /* renamed from: g1 */
    public void mo2437g1() {
        super.mo2437g1();
        ((MoviesScreenPlayer) this.moviesScreenPlayerViewSupplier.mo4947a()).mo17645b(new C2749l(this));
        ((MoviesScreenPlayer) this.moviesScreenPlayerViewSupplier.mo4947a()).mo17647e(new C2752o(this));
        ((MoviesScreenPlayer) this.moviesScreenPlayerViewSupplier.mo4947a()).mo17646c(new C2758u(this));
        if (this.movieList.isEmpty()) {
            mo17847T2();
        } else {
            ((MoviesScreenPlayer) this.moviesScreenPlayerViewSupplier.mo4947a()).mo17643T(this.movieList);
        }
    }

    /* renamed from: h1 */
    public void mo2440h1() {
        super.mo2440h1();
        this.loadMoviesUseCase.mo17051a();
    }

    /* renamed from: q2 */
    public void mo17899q2(ErrorBundle cVar) {
        ErrorHandler.m17647d(new C2750m(this)).accept(cVar);
    }

    public BaseMoviesFragment(int i) {
        super(i);
    }
}
