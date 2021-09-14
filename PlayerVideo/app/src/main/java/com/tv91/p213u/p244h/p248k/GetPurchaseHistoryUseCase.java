package com.tv91.p213u.p244h.p248k;

import com.tv91.model.Paging;
import com.tv91.model.PurchaseHistory;
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
import java.util.List;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.u.h.k.p */
public final class GetPurchaseHistoryUseCase extends ObservableUseCase<C2345e> {

    /* renamed from: i */
    private final C3061b f16059i;

    /* renamed from: j */
    private final C3060h f16060j;

    /* renamed from: k */
    private Consumer<Paging<PurchaseHistory>> f16061k = ObservableUseCase.m17658b();

    /* renamed from: l */
    private final C2345e f16062l = new C3042g(this);

    public GetPurchaseHistoryUseCase(Schedulers bVar, C3061b bVar2, C3060h hVar) {
        super(bVar);
        this.f16059i = bVar2;
        this.f16060j = hVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void mo18547r(int i, int i2) {
        C2348b bVar;
        try {
            mo17054i(new C2349c());
            mo17054i(new C2350d(mo18546p(i, i2)));
            bVar = new C2348b();
        } catch (Exception e) {
            ErrorBundle cVar = new ErrorBundle(e);
            if (cVar.mo17116f()) {
                this.f16060j.mo18619i();
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
    public /* synthetic */ void mo18548t(C2346f fVar) {
        if (fVar instanceof C2349c) {
            this.f14275c.run();
        } else if (fVar instanceof C2348b) {
            this.f14276d.run();
        } else if (fVar instanceof C2350d) {
            this.f16061k.mo4887a(((C2350d) fVar).f14282a);
        } else if (fVar instanceof C2347a) {
            this.f14277e.mo4887a(((C2347a) fVar).f14281a);
        }
    }

    /* renamed from: o */
    public void mo18545o(int i, int i2) {
        mo17058m(this.f16062l);
        mo17055j(new C3043h(this, i, i2));
    }

    /* renamed from: p */
    public Paging<PurchaseHistory> mo18546p(int i, int i2) throws Exception {
        if (i2 != 0) {
            return this.f16059i.mo18672p(this.f16060j.mo18614d(), this.f16060j.mo18617g(), i, i2);
        }
        List e = this.f16059i.mo18661e(this.f16060j.mo18614d(), this.f16060j.mo18617g(), 1);
        return new Paging<>(e.size(), 1, e);
    }

    /* renamed from: u */
    public GetPurchaseHistoryUseCase mo18549u(Consumer<ErrorBundle> aVar) {
        this.f14277e = aVar;
        return this;
    }

    /* renamed from: v */
    public GetPurchaseHistoryUseCase mo18550v(Runnable runnable) {
        this.f14276d = runnable;
        return this;
    }

    /* renamed from: w */
    public GetPurchaseHistoryUseCase mo18551w(Runnable runnable) {
        this.f14275c = runnable;
        return this;
    }

    /* renamed from: x */
    public GetPurchaseHistoryUseCase mo18552x(Consumer<Paging<PurchaseHistory>> aVar) {
        this.f16061k = aVar;
        return this;
    }
}
