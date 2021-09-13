package com.tv91.p213u.p223c.p229k;

import com.tv91.model.Movie;
import com.tv91.p207q.p209b.C2345e;
import com.tv91.p207q.p209b.C2346f;
import com.tv91.p207q.p209b.C2346f.C2347a;
import com.tv91.p207q.p209b.C2346f.C2348b;
import com.tv91.p207q.p209b.C2346f.C2349c;
import com.tv91.p207q.p209b.C2346f.C2350d;
import com.tv91.p207q.p209b.ObservableUseCase;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p212t.Schedulers;
import com.tv91.p253y.C3060h;
import com.tv91.p255z.C3061b;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.u.c.k.u */
public final class RemoveFavoriteUseCase extends ObservableUseCase<C2345e> {

    /* renamed from: i */
    private final C3061b f15542i;

    /* renamed from: j */
    private final C3060h f15543j;

    /* renamed from: k */
    private Consumer<Movie> f15544k = ObservableUseCase.m17658b();

    /* renamed from: l */
    private final C2345e f15545l = new C2790m(this);

    public RemoveFavoriteUseCase(Schedulers bVar, C3061b bVar2, C3060h hVar) {
        super(bVar);
        this.f15542i = bVar2;
        this.f15543j = hVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void mo17994r(Movie movie) {
        C2348b bVar;
        try {
            mo17054i(new C2349c());
            mo17993p(movie);
            mo17054i(new C2350d(movie));
            bVar = new C2348b();
        } catch (Exception e) {
            ErrorBundle cVar = new ErrorBundle(e);
            if (cVar.mo17116f()) {
                this.f15543j.mo18619i();
            }
            mo17054i(new C2347a(cVar));
            bVar = new C2348b();
        } catch (Throwable th) {
            mo17054i(new C2348b());
            throw th;
        }
        mo17054i(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void mo17995t(C2346f fVar) {
        if (fVar instanceof C2349c) {
            this.f14275c.run();
        } else if (fVar instanceof C2348b) {
            this.f14276d.run();
        } else if (fVar instanceof C2350d) {
            this.f15544k.mo4887a(((C2350d) fVar).f14282a);
        } else if (fVar instanceof C2347a) {
            this.f14277e.mo4887a(((C2347a) fVar).f14281a);
        }
    }

    /* renamed from: o */
    public void mo17992o(Movie movie) {
        mo17058m(this.f15545l);
        mo17055j(new C2791n(this, movie));
    }

    /* renamed from: p */
    public void mo17993p(Movie movie) throws Exception {
        this.f15542i.mo18664h(this.f15543j.mo18614d(), this.f15543j.mo18617g(), movie.f14083id);
    }

    /* renamed from: u */
    public RemoveFavoriteUseCase mo17996u(Consumer<ErrorBundle> aVar) {
        this.f14277e = aVar;
        return this;
    }

    /* renamed from: v */
    public RemoveFavoriteUseCase mo17997v(Runnable runnable) {
        this.f14276d = runnable;
        return this;
    }

    /* renamed from: w */
    public RemoveFavoriteUseCase mo17998w(Runnable runnable) {
        this.f14275c = runnable;
        return this;
    }

    /* renamed from: x */
    public RemoveFavoriteUseCase mo17999x(Consumer<Movie> aVar) {
        this.f15544k = aVar;
        return this;
    }
}
