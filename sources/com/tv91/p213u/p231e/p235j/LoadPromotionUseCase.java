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
import com.tv91.p253y.C3060h;
import com.tv91.p253y.SystemRepository;
import com.tv91.p255z.C3061b;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.u.e.j.m */
public final class LoadPromotionUseCase extends ObservableUseCase<C2345e> {

    /* renamed from: i */
    private final C3061b f15675i;

    /* renamed from: j */
    private final C3060h f15676j;

    /* renamed from: k */
    private final SystemRepository f15677k;

    /* renamed from: l */
    private Consumer<Promotion> f15678l = ObservableUseCase.m17658b();

    /* renamed from: m */
    private final C2345e f15679m = new C2852f(this);

    public LoadPromotionUseCase(Schedulers bVar, C3061b bVar2, C3060h hVar, SystemRepository eVar) {
        super(bVar);
        this.f15675i = bVar2;
        this.f15676j = hVar;
        this.f15677k = eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void mo18134r() {
        C2348b bVar;
        try {
            mo17054i(new C2349c());
            mo17054i(new C2350d(mo18133p()));
            bVar = new C2348b();
        } catch (Exception e) {
            ErrorBundle cVar = new ErrorBundle(e);
            if (cVar.mo17116f()) {
                this.f15676j.mo18619i();
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
    public /* synthetic */ void mo18135t(C2346f fVar) {
        if (fVar instanceof C2349c) {
            this.f14275c.run();
        } else if (fVar instanceof C2348b) {
            this.f14276d.run();
        } else if (fVar instanceof C2350d) {
            this.f15678l.mo4887a(((C2350d) fVar).f14282a);
        } else if (fVar instanceof C2347a) {
            this.f14277e.mo4887a(((C2347a) fVar).f14281a);
        }
    }

    /* renamed from: o */
    public void mo18132o() {
        mo17058m(this.f15679m);
        mo17055j(new C2851e(this));
    }

    /* renamed from: p */
    public Promotion mo18133p() throws Exception {
        return this.f15675i.mo18668l(this.f15676j.mo18614d(), this.f15676j.mo18617g(), this.f15677k.mo18606c());
    }

    /* renamed from: u */
    public LoadPromotionUseCase mo18136u(Consumer<ErrorBundle> aVar) {
        this.f14277e = aVar;
        return this;
    }

    /* renamed from: v */
    public LoadPromotionUseCase mo18137v(Runnable runnable) {
        this.f14275c = runnable;
        return this;
    }

    /* renamed from: w */
    public LoadPromotionUseCase mo18138w(Consumer<Promotion> aVar) {
        this.f15678l = aVar;
        return this;
    }
}
