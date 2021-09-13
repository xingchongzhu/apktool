package com.tv91.p213u.p223c.p229k;

import com.tv91.model.Movie;
import com.tv91.model.User;
import com.tv91.p207q.p209b.C2345e;
import com.tv91.p207q.p209b.C2346f;
import com.tv91.p207q.p209b.C2346f.C2347a;
import com.tv91.p207q.p209b.C2346f.C2348b;
import com.tv91.p207q.p209b.C2346f.C2349c;
import com.tv91.p207q.p209b.C2346f.C2350d;
import com.tv91.p207q.p209b.ObservableUseCase;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p212t.Schedulers;
import com.tv91.p253y.C3058c;
import com.tv91.p253y.C3060h;
import com.tv91.p255z.C3061b;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.u.c.k.s */
public final class LoadMovieUseCase extends ObservableUseCase<C2345e> {

    /* renamed from: i */
    private final C3061b f15524i;

    /* renamed from: j */
    private final C3060h f15525j;

    /* renamed from: k */
    private final C3058c f15526k;

    /* renamed from: l */
    private Consumer<Movie> f15527l = ObservableUseCase.m17658b();

    /* renamed from: m */
    private final C2345e f15528m = new C2787j(this);

    public LoadMovieUseCase(Schedulers bVar, C3061b bVar2, C3060h hVar, C3058c cVar) {
        super(bVar);
        this.f15524i = bVar2;
        this.f15525j = hVar;
        this.f15526k = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void mo17976s(int i, int i2) {
        C2348b bVar;
        try {
            mo17054i(new C2349c());
            mo17054i(new C2350d(mo17975q(i, i2)));
            bVar = new C2348b();
        } catch (Exception e) {
            mo17054i(new C2347a(new ErrorBundle(e)));
            bVar = new C2348b();
        } catch (Throwable th) {
            mo17054i(new C2348b());
            throw th;
        }
        mo17054i(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void mo17977u(C2346f fVar) {
        if (fVar instanceof C2349c) {
            this.f14275c.run();
        } else if (fVar instanceof C2348b) {
            this.f14276d.run();
        } else if (fVar instanceof C2350d) {
            this.f15527l.mo4887a(((C2350d) fVar).f14282a);
        } else if (fVar instanceof C2347a) {
            this.f14277e.mo4887a(((C2347a) fVar).f14281a);
        }
    }

    /* renamed from: z */
    private Movie m19511z(User user, Movie movie) throws Exception {
        Movie g = this.f15526k.mo18599g(user.f14097id, movie.f14083id);
        if (!(g != null && g.favorite) || movie.favorite) {
            return movie;
        }
        this.f15524i.mo18665i(user.f14097id, user.token, movie.f14083id);
        return movie.newBuilder().favorite(true).build();
    }

    /* renamed from: o */
    public void mo17973o(int i) {
        mo17974p(i, 1);
    }

    /* renamed from: p */
    public void mo17974p(int i, int i2) {
        mo17058m(this.f15528m);
        mo17055j(new C2786i(this, i, i2));
    }

    /* renamed from: q */
    public Movie mo17975q(int i, int i2) throws Exception {
        User e = this.f15525j.mo18615e();
        Movie n = this.f15524i.mo18670n(e, i, i2);
        if (e == null) {
            return n;
        }
        return m19511z(e, n);
    }

    /* renamed from: v */
    public LoadMovieUseCase mo17978v(Consumer<ErrorBundle> aVar) {
        this.f14277e = aVar;
        return this;
    }

    /* renamed from: w */
    public LoadMovieUseCase mo17979w(Runnable runnable) {
        this.f14276d = runnable;
        return this;
    }

    /* renamed from: x */
    public LoadMovieUseCase mo17980x(Runnable runnable) {
        this.f14275c = runnable;
        return this;
    }

    /* renamed from: y */
    public LoadMovieUseCase mo17981y(Consumer<Movie> aVar) {
        this.f15527l = aVar;
        return this;
    }
}
