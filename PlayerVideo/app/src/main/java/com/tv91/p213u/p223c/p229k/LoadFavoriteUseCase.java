package com.tv91.p213u.p223c.p229k;

import com.tv91.model.Movie;
import com.tv91.model.Paging;
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

/* renamed from: com.tv91.u.c.k.p */
public final class LoadFavoriteUseCase extends ObservableUseCase<C2345e> {

    /* renamed from: i */
    private final C3061b f15513i;

    /* renamed from: j */
    private final C3060h f15514j;

    /* renamed from: k */
    private Consumer<Paging<Movie>> f15515k = ObservableUseCase.m17658b();

    /* renamed from: l */
    private final C2345e f15516l = new C2780c(this);

    public LoadFavoriteUseCase(Schedulers bVar, C3061b bVar2, C3060h hVar) {
        super(bVar);
        this.f15513i = bVar2;
        this.f15514j = hVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void mo17953r(int i, int i2) {
        C2348b bVar;
        try {
            mo17054i(new C2349c());
            mo17054i(new C2350d(mo17952p(i, i2)));
            bVar = new C2348b();
        } catch (Exception e) {
            ErrorBundle cVar = new ErrorBundle(e);
            if (cVar.mo17116f()) {
                this.f15514j.mo18619i();
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
    public /* synthetic */ void mo17954t(C2346f fVar) {
        if (fVar instanceof C2349c) {
            this.f14275c.run();
        } else if (fVar instanceof C2348b) {
            this.f14276d.run();
        } else if (fVar instanceof C2350d) {
            this.f15515k.mo4887a(((C2350d) fVar).f14282a);
        } else if (fVar instanceof C2347a) {
            this.f14277e.mo4887a(((C2347a) fVar).f14281a);
        }
    }

    /* renamed from: o */
    public void mo17951o(int i, int i2) {
        mo17058m(this.f15516l);
        mo17055j(new C2781d(this, i, i2));
    }

    /* renamed from: p */
    public Paging<Movie> mo17952p(int i, int i2) throws Exception {
        Paging<Movie> T = this.f15513i.mo18649T(this.f15514j.mo18614d(), this.f15514j.mo18617g(), i, i2);
        int size = T.getMovies().size();
        for (int i3 = 0; i3 < size; i3++) {
            T.getMovies().set(i3, ((Movie) T.getMovies().get(i3)).newBuilder().favorite(true).build());
        }
        return T;
    }

    /* renamed from: u */
    public LoadFavoriteUseCase mo17955u(Consumer<ErrorBundle> aVar) {
        this.f14277e = aVar;
        return this;
    }

    /* renamed from: v */
    public LoadFavoriteUseCase mo17956v(Runnable runnable) {
        this.f14276d = runnable;
        return this;
    }

    /* renamed from: w */
    public LoadFavoriteUseCase mo17957w(Runnable runnable) {
        this.f14275c = runnable;
        return this;
    }

    /* renamed from: x */
    public LoadFavoriteUseCase mo17958x(Consumer<Paging<Movie>> aVar) {
        this.f15515k = aVar;
        return this;
    }
}
