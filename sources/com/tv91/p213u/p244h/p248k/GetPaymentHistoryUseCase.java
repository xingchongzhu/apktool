package com.tv91.p213u.p244h.p248k;

import com.tv91.model.PaymentHistory;
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

/* renamed from: com.tv91.u.h.k.n */
public final class GetPaymentHistoryUseCase extends ObservableUseCase<C2345e> {

    /* renamed from: i */
    private final C3061b f16050i;

    /* renamed from: j */
    private final C3060h f16051j;

    /* renamed from: k */
    private Consumer<List<PaymentHistory>> f16052k = ObservableUseCase.m17658b();

    /* renamed from: l */
    private final C2345e f16053l = new C3038c(this);

    public GetPaymentHistoryUseCase(Schedulers bVar, C3061b bVar2, C3060h hVar) {
        super(bVar);
        this.f16050i = bVar2;
        this.f16051j = hVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void mo18531r() {
        C2348b bVar;
        try {
            mo17054i(new C2349c());
            mo17054i(new C2350d(mo18530p()));
            bVar = new C2348b();
        } catch (Exception e) {
            ErrorBundle cVar = new ErrorBundle(e);
            if (cVar.mo17116f()) {
                this.f16051j.mo18619i();
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
    public /* synthetic */ void mo18532t(C2346f fVar) {
        if (fVar instanceof C2349c) {
            this.f14275c.run();
        } else if (fVar instanceof C2348b) {
            this.f14276d.run();
        } else if (fVar instanceof C2350d) {
            this.f16052k.mo4887a(((C2350d) fVar).f14282a);
        } else if (fVar instanceof C2347a) {
            this.f14277e.mo4887a(((C2347a) fVar).f14281a);
        }
    }

    /* renamed from: o */
    public void mo18529o() {
        mo17058m(this.f16053l);
        mo17055j(new C3039d(this));
    }

    /* renamed from: p */
    public List<PaymentHistory> mo18530p() throws Exception {
        return this.f16050i.mo18645P(this.f16051j.mo18614d(), this.f16051j.mo18617g());
    }

    /* renamed from: u */
    public GetPaymentHistoryUseCase mo18533u(Consumer<ErrorBundle> aVar) {
        this.f14277e = aVar;
        return this;
    }

    /* renamed from: v */
    public GetPaymentHistoryUseCase mo18534v(Runnable runnable) {
        this.f14276d = runnable;
        return this;
    }

    /* renamed from: w */
    public GetPaymentHistoryUseCase mo18535w(Runnable runnable) {
        this.f14275c = runnable;
        return this;
    }

    /* renamed from: x */
    public GetPaymentHistoryUseCase mo18536x(Consumer<List<PaymentHistory>> aVar) {
        this.f16052k = aVar;
        return this;
    }
}
