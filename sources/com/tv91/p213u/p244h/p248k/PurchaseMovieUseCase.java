package com.tv91.p213u.p244h.p248k;

import com.tv91.model.Movie;
import com.tv91.model.PurchasePackage;
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
import com.tv91.p253y.C3060h;
import com.tv91.p255z.C3061b;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.u.h.k.r */
public final class PurchaseMovieUseCase extends ObservableUseCase<C2345e> {

    /* renamed from: i */
    private final C3061b f16066i;

    /* renamed from: j */
    private final C3060h f16067j;

    /* renamed from: k */
    private Runnable f16068k = ObservableUseCase.m17659c();

    /* renamed from: l */
    private final C2345e f16069l = new C3047l(this);

    public PurchaseMovieUseCase(Schedulers bVar, C3061b bVar2, C3060h hVar) {
        super(bVar);
        this.f16066i = bVar2;
        this.f16067j = hVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void mo18563r(Movie movie, PurchasePackage purchasePackage) {
        C2348b bVar;
        try {
            mo17054i(new C2349c());
            mo18562p(movie, purchasePackage);
            mo17054i(new C2350d());
            bVar = new C2348b();
        } catch (Exception e) {
            ErrorBundle cVar = new ErrorBundle(e);
            if (cVar.mo17116f()) {
                this.f16067j.mo18619i();
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
    public /* synthetic */ void mo18564t(C2346f fVar) {
        if (fVar instanceof C2349c) {
            this.f14275c.run();
        } else if (fVar instanceof C2348b) {
            this.f14276d.run();
        } else if (fVar instanceof C2350d) {
            this.f16068k.run();
        } else if (fVar instanceof C2347a) {
            this.f14277e.mo4887a(((C2347a) fVar).f14281a);
        }
    }

    /* renamed from: o */
    public void mo18561o(Movie movie, PurchasePackage purchasePackage) {
        mo17058m(this.f16069l);
        mo17055j(new C3046k(this, movie, purchasePackage));
    }

    /* renamed from: p */
    public void mo18562p(Movie movie, PurchasePackage purchasePackage) throws Exception {
        this.f16066i.mo18647R(this.f16067j.mo18614d(), this.f16067j.mo18617g(), movie == null ? -1 : movie.f14083id, purchasePackage.type.f14096h, movie == null ? -1 : movie.sourceId);
        User e = this.f16067j.mo18615e();
        this.f16067j.mo18618h(e.newBuilder().point(e.point - purchasePackage.point).build());
    }

    /* renamed from: u */
    public PurchaseMovieUseCase mo18565u(Consumer<ErrorBundle> aVar) {
        this.f14277e = aVar;
        return this;
    }

    /* renamed from: v */
    public PurchaseMovieUseCase mo18566v(Runnable runnable) {
        this.f14276d = runnable;
        return this;
    }

    /* renamed from: w */
    public PurchaseMovieUseCase mo18567w(Runnable runnable) {
        this.f14275c = runnable;
        return this;
    }

    /* renamed from: x */
    public PurchaseMovieUseCase mo18568x(Runnable runnable) {
        this.f16068k = runnable;
        return this;
    }
}
