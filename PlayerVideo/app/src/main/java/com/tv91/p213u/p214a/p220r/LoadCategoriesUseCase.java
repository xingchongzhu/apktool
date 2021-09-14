package com.tv91.p213u.p214a.p220r;

import com.tv91.model.Category;
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

/* renamed from: com.tv91.u.a.r.k */
public final class LoadCategoriesUseCase extends ObservableUseCase<C2345e> {

    /* renamed from: i */
    private final C3061b f14920i;

    /* renamed from: j */
    private Consumer<List<Category>> f14921j = ObservableUseCase.m17658b();

    /* renamed from: k */
    private final C2345e f14922k = new C2446e(this);

    public LoadCategoriesUseCase(Schedulers bVar, C3061b bVar2) {
        super(bVar);
        this.f14920i = bVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void mo17318r() {
        C2348b bVar;
        try {
            mo17054i(new C2349c());
            mo17054i(new C2350d(mo17317p()));
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
    public /* synthetic */ void mo17319t(C2346f fVar) {
        if (fVar instanceof C2349c) {
            this.f14275c.run();
        } else if (fVar instanceof C2348b) {
            this.f14276d.run();
        } else if (fVar instanceof C2350d) {
            this.f14921j.mo4887a(((C2350d) fVar).f14282a);
        } else if (fVar instanceof C2347a) {
            this.f14277e.mo4887a(((C2347a) fVar).f14281a);
        }
    }

    /* renamed from: o */
    public void mo17316o() {
        mo17058m(this.f14922k);
        mo17055j(new C2447f(this));
    }

    /* renamed from: p */
    public List<Category> mo17317p() throws Exception {
        return this.f14920i.mo18642M();
    }

    /* renamed from: u */
    public LoadCategoriesUseCase mo17320u(Consumer<ErrorBundle> aVar) {
        this.f14277e = aVar;
        return this;
    }

    /* renamed from: v */
    public LoadCategoriesUseCase mo17321v(Runnable runnable) {
        this.f14276d = runnable;
        return this;
    }

    /* renamed from: w */
    public LoadCategoriesUseCase mo17322w(Runnable runnable) {
        this.f14275c = runnable;
        return this;
    }

    /* renamed from: x */
    public LoadCategoriesUseCase mo17323x(Consumer<List<Category>> aVar) {
        this.f14921j = aVar;
        return this;
    }
}
