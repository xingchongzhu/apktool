package com.tv91.features.authentication.p203q;

import com.tv91.p207q.p209b.C2345e;
import com.tv91.p207q.p209b.C2346f;
import com.tv91.p207q.p209b.C2346f.C2347a;
import com.tv91.p207q.p209b.C2346f.C2348b;
import com.tv91.p207q.p209b.C2346f.C2349c;
import com.tv91.p207q.p209b.C2346f.C2350d;
import com.tv91.p207q.p209b.ObservableUseCase;
import com.tv91.p212t.Schedulers;
import com.tv91.p253y.C3060h;

/* renamed from: com.tv91.features.authentication.q.y */
public final class LogoutUseCase extends ObservableUseCase<C2345e> {

    /* renamed from: i */
    private final C3060h f13852i;

    /* renamed from: j */
    private Runnable f13853j = ObservableUseCase.m17659c();

    /* renamed from: k */
    private final C2345e f13854k = new C2244e(this);

    public LogoutUseCase(Schedulers bVar, C3060h hVar) {
        super(bVar);
        this.f13852i = hVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void mo16750r() {
        mo17054i(new C2349c());
        mo16749p();
        mo17054i(new C2350d());
        mo17054i(new C2348b());
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void mo16751t(C2346f fVar) {
        if (fVar instanceof C2349c) {
            this.f14275c.run();
        } else if (fVar instanceof C2348b) {
            this.f14276d.run();
        } else if (fVar instanceof C2350d) {
            this.f13853j.run();
        } else if (fVar instanceof C2347a) {
            this.f14277e.mo4887a(((C2347a) fVar).f14281a);
        }
    }

    /* renamed from: o */
    public void mo16748o() {
        mo17058m(this.f13854k);
        mo17055j(new C2245f(this));
    }

    /* renamed from: p */
    public void mo16749p() {
        this.f13852i.mo18619i();
    }

    /* renamed from: u */
    public LogoutUseCase mo16752u(Runnable runnable) {
        this.f13853j = runnable;
        return this;
    }
}
