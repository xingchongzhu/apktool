package com.tv91.p213u.p231e.p235j;

import com.tv91.model.Promotion;
import com.tv91.p207q.p209b.C2345e;
import com.tv91.p207q.p209b.C2346f;
import com.tv91.p207q.p209b.C2346f.C2347a;
import com.tv91.p207q.p209b.C2346f.C2348b;
import com.tv91.p207q.p209b.C2346f.C2349c;
import com.tv91.p207q.p209b.C2346f.C2350d;
import com.tv91.p207q.p209b.ObservableUseCase;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p212t.Schedulers;
import com.tv91.p253y.SystemRepository;
import com.tv91.p255z.C3061b;
import java.util.List;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.u.e.j.n */
public final class LoadPromotionsUseCase extends ObservableUseCase<C2345e> {

    /* renamed from: i */
    private final C3061b f15680i;

    /* renamed from: j */
    private final SystemRepository f15681j;

    /* renamed from: k */
    private Consumer<List<Promotion>> f15682k = ObservableUseCase.m17658b();

    /* renamed from: l */
    private final C2345e f15683l = new C2854h(this);

    public LoadPromotionsUseCase(Schedulers bVar, C3061b bVar2, SystemRepository eVar) {
        super(bVar);
        this.f15680i = bVar2;
        this.f15681j = eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void mo18141r() {
        C2348b bVar;
        try {
            mo17054i(new C2349c());
            mo17054i(new C2350d(mo18140p()));
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
    public /* synthetic */ void mo18142t(C2346f fVar) {
        if (fVar instanceof C2349c) {
            this.f14275c.run();
        } else if (fVar instanceof C2348b) {
            this.f14276d.run();
        } else if (fVar instanceof C2350d) {
            this.f15682k.mo4887a(((C2350d) fVar).f14282a);
        } else if (fVar instanceof C2347a) {
            this.f14277e.mo4887a(((C2347a) fVar).f14281a);
        }
    }

    /* renamed from: o */
    public void mo18139o() {
        mo17058m(this.f15683l);
        mo17055j(new C2853g(this));
    }

    /* renamed from: p */
    public List<Promotion> mo18140p() throws Exception {
        return this.f15680i.mo18666j(this.f15681j.mo18606c());
    }

    /* renamed from: u */
    public LoadPromotionsUseCase mo18143u(Consumer<ErrorBundle> aVar) {
        this.f14277e = aVar;
        return this;
    }

    /* renamed from: v */
    public LoadPromotionsUseCase mo18144v(Consumer<List<Promotion>> aVar) {
        this.f15682k = aVar;
        return this;
    }
}
