package com.tv91.p213u.p244h.p248k;

import com.tv91.model.ProductGroup;
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
import java.util.List;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.u.h.k.o */
public final class GetProductGroupsUseCase extends ObservableUseCase<C2345e> {

    /* renamed from: i */
    private final C3061b f16054i;

    /* renamed from: j */
    private final C3060h f16055j;

    /* renamed from: k */
    private final SystemRepository f16056k;

    /* renamed from: l */
    private Consumer<List<ProductGroup>> f16057l = ObservableUseCase.m17658b();

    /* renamed from: m */
    private final C2345e f16058m = new C3040e(this);

    public GetProductGroupsUseCase(Schedulers bVar, C3061b bVar2, C3060h hVar, SystemRepository eVar) {
        super(bVar);
        this.f16054i = bVar2;
        this.f16055j = hVar;
        this.f16056k = eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void mo18539r() {
        C2348b bVar;
        try {
            mo17054i(new C2349c());
            mo17054i(new C2350d(mo18538p()));
            bVar = new C2348b();
        } catch (Exception e) {
            ErrorBundle cVar = new ErrorBundle(e);
            if (cVar.mo17116f()) {
                this.f16055j.mo18619i();
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
    public /* synthetic */ void mo18540t(C2346f fVar) {
        if (fVar instanceof C2349c) {
            this.f14275c.run();
        } else if (fVar instanceof C2348b) {
            this.f14276d.run();
        } else if (fVar instanceof C2350d) {
            this.f16057l.mo4887a(((C2350d) fVar).f14282a);
        } else if (fVar instanceof C2347a) {
            this.f14277e.mo4887a(((C2347a) fVar).f14281a);
        }
    }

    /* renamed from: o */
    public void mo18537o() {
        mo17058m(this.f16058m);
        mo17055j(new C3041f(this));
    }

    /* renamed from: p */
    public List<ProductGroup> mo18538p() throws Exception {
        return this.f16054i.mo18674r(this.f16055j.mo18614d(), this.f16055j.mo18617g(), this.f16056k.mo18610g());
    }

    /* renamed from: u */
    public GetProductGroupsUseCase mo18541u(Consumer<ErrorBundle> aVar) {
        this.f14277e = aVar;
        return this;
    }

    /* renamed from: v */
    public GetProductGroupsUseCase mo18542v(Runnable runnable) {
        this.f14276d = runnable;
        return this;
    }

    /* renamed from: w */
    public GetProductGroupsUseCase mo18543w(Runnable runnable) {
        this.f14275c = runnable;
        return this;
    }

    /* renamed from: x */
    public GetProductGroupsUseCase mo18544x(Consumer<List<ProductGroup>> aVar) {
        this.f16057l = aVar;
        return this;
    }
}
