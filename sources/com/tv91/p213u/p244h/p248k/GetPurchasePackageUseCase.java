package com.tv91.p213u.p244h.p248k;

import com.tv91.model.PurchasePackage;
import com.tv91.p207q.p209b.C2345e;
import com.tv91.p207q.p209b.C2346f;
import com.tv91.p207q.p209b.C2346f.C2347a;
import com.tv91.p207q.p209b.C2346f.C2348b;
import com.tv91.p207q.p209b.C2346f.C2349c;
import com.tv91.p207q.p209b.C2346f.C2350d;
import com.tv91.p207q.p209b.ObservableUseCase;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p212t.Schedulers;
import com.tv91.p255z.C3061b;
import java.util.List;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.u.h.k.q */
public final class GetPurchasePackageUseCase extends ObservableUseCase<C2345e> {

    /* renamed from: i */
    private final C3061b f16063i;

    /* renamed from: j */
    private Consumer<List<PurchasePackage>> f16064j = ObservableUseCase.m17658b();

    /* renamed from: k */
    private final C2345e f16065k = new C3045j(this);

    public GetPurchasePackageUseCase(Schedulers bVar, C3061b bVar2) {
        super(bVar);
        this.f16063i = bVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void mo18555r() {
        C2348b bVar;
        try {
            mo17054i(new C2349c());
            mo17054i(new C2350d(mo18554p()));
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
    /* renamed from: s */
    public /* synthetic */ void mo18556t(C2346f fVar) {
        if (fVar instanceof C2349c) {
            this.f14275c.run();
        } else if (fVar instanceof C2348b) {
            this.f14276d.run();
        } else if (fVar instanceof C2350d) {
            this.f16064j.mo4887a(((C2350d) fVar).f14282a);
        } else if (fVar instanceof C2347a) {
            this.f14277e.mo4887a(((C2347a) fVar).f14281a);
        }
    }

    /* renamed from: o */
    public void mo18553o() {
        mo17058m(this.f16065k);
        mo17055j(new C3044i(this));
    }

    /* renamed from: p */
    public List<PurchasePackage> mo18554p() throws Exception {
        return this.f16063i.mo18632C();
    }

    /* renamed from: u */
    public GetPurchasePackageUseCase mo18557u(Consumer<ErrorBundle> aVar) {
        this.f14277e = aVar;
        return this;
    }

    /* renamed from: v */
    public GetPurchasePackageUseCase mo18558v(Runnable runnable) {
        this.f14276d = runnable;
        return this;
    }

    /* renamed from: w */
    public GetPurchasePackageUseCase mo18559w(Runnable runnable) {
        this.f14275c = runnable;
        return this;
    }

    /* renamed from: x */
    public GetPurchasePackageUseCase mo18560x(Consumer<List<PurchasePackage>> aVar) {
        this.f16064j = aVar;
        return this;
    }
}
