package com.tv91.p213u.p231e.p235j;

import com.tv91.model.PromotionReport;
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

/* renamed from: com.tv91.u.e.j.l */
public final class LoadPromotionReportUseCase extends ObservableUseCase<C2345e> {

    /* renamed from: i */
    private final C3061b f15671i;

    /* renamed from: j */
    private final C3060h f15672j;

    /* renamed from: k */
    private Consumer<List<PromotionReport>> f15673k = ObservableUseCase.m17658b();

    /* renamed from: l */
    private final C2345e f15674l = new C2850d(this);

    public LoadPromotionReportUseCase(Schedulers bVar, C3061b bVar2, C3060h hVar) {
        super(bVar);
        this.f15671i = bVar2;
        this.f15672j = hVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void mo18126r() {
        C2348b bVar;
        try {
            mo17054i(new C2349c());
            mo17054i(new C2350d(mo18125p()));
            bVar = new C2348b();
        } catch (Exception e) {
            ErrorBundle cVar = new ErrorBundle(e);
            if (cVar.mo17116f()) {
                this.f15672j.mo18619i();
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
    public /* synthetic */ void mo18127t(C2346f fVar) {
        if (fVar instanceof C2349c) {
            this.f14275c.run();
        } else if (fVar instanceof C2348b) {
            this.f14276d.run();
        } else if (fVar instanceof C2350d) {
            this.f15673k.mo4887a(((C2350d) fVar).f14282a);
        } else if (fVar instanceof C2347a) {
            this.f14277e.mo4887a(((C2347a) fVar).f14281a);
        }
    }

    /* renamed from: o */
    public void mo18124o() {
        mo17058m(this.f15674l);
        mo17055j(new C2849c(this));
    }

    /* renamed from: p */
    public List<PromotionReport> mo18125p() throws Exception {
        return this.f15671i.mo18641L(this.f15672j.mo18614d(), this.f15672j.mo18617g());
    }

    /* renamed from: u */
    public LoadPromotionReportUseCase mo18128u(Consumer<ErrorBundle> aVar) {
        this.f14277e = aVar;
        return this;
    }

    /* renamed from: v */
    public LoadPromotionReportUseCase mo18129v(Runnable runnable) {
        this.f14276d = runnable;
        return this;
    }

    /* renamed from: w */
    public LoadPromotionReportUseCase mo18130w(Runnable runnable) {
        this.f14275c = runnable;
        return this;
    }

    /* renamed from: x */
    public LoadPromotionReportUseCase mo18131x(Consumer<List<PromotionReport>> aVar) {
        this.f15673k = aVar;
        return this;
    }
}
