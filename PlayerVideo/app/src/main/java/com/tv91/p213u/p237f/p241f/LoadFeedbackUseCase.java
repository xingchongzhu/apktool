package com.tv91.p213u.p237f.p241f;

import com.tv91.model.Feedback;
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

/* renamed from: com.tv91.u.f.f.h */
public final class LoadFeedbackUseCase extends ObservableUseCase<C2345e> {

    /* renamed from: i */
    private final C3061b f15797i;

    /* renamed from: j */
    private final C3060h f15798j;

    /* renamed from: k */
    private Consumer<Paging<Feedback>> f15799k = ObservableUseCase.m17658b();

    /* renamed from: l */
    private final C2345e f15800l = new C2914c(this);

    public LoadFeedbackUseCase(Schedulers bVar, C3061b bVar2, C3060h hVar) {
        super(bVar);
        this.f15797i = bVar2;
        this.f15798j = hVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void mo18274r(int i, int i2) {
        C2348b bVar;
        try {
            mo17054i(new C2349c());
            mo17054i(new C2350d(mo18273p(i, i2)));
            bVar = new C2348b();
        } catch (Exception e) {
            ErrorBundle cVar = new ErrorBundle(e);
            if (cVar.mo17116f()) {
                this.f15798j.mo18619i();
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
    public /* synthetic */ void mo18275t(C2346f fVar) {
        if (fVar instanceof C2349c) {
            this.f14275c.run();
        } else if (fVar instanceof C2348b) {
            this.f14276d.run();
        } else if (fVar instanceof C2350d) {
            this.f15799k.mo4887a(((C2350d) fVar).f14282a);
        } else if (fVar instanceof C2347a) {
            this.f14277e.mo4887a(((C2347a) fVar).f14281a);
        }
    }

    /* renamed from: o */
    public void mo18272o(int i, int i2) {
        mo17058m(this.f15800l);
        mo17055j(new C2915d(this, i, i2));
    }

    /* renamed from: p */
    public Paging<Feedback> mo18273p(int i, int i2) throws Exception {
        return this.f15797i.mo18634E(this.f15798j.mo18614d(), this.f15798j.mo18617g(), i, i2);
    }

    /* renamed from: u */
    public LoadFeedbackUseCase mo18276u(Consumer<ErrorBundle> aVar) {
        this.f14277e = aVar;
        return this;
    }

    /* renamed from: v */
    public LoadFeedbackUseCase mo18277v(Runnable runnable) {
        this.f14276d = runnable;
        return this;
    }

    /* renamed from: w */
    public LoadFeedbackUseCase mo18278w(Runnable runnable) {
        this.f14275c = runnable;
        return this;
    }

    /* renamed from: x */
    public LoadFeedbackUseCase mo18279x(Consumer<Paging<Feedback>> aVar) {
        this.f15799k = aVar;
        return this;
    }
}
