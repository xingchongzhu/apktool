package com.tv91.features.authentication.p203q;

import com.tv91.model.User;
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

/* renamed from: com.tv91.features.authentication.q.b0 */
public final class QuickRegisterUseCase extends ObservableUseCase<C2345e> {

    /* renamed from: i */
    private final C3061b f13776i;

    /* renamed from: j */
    private final C3060h f13777j;

    /* renamed from: k */
    private final SystemRepository f13778k;

    /* renamed from: l */
    private Consumer<User> f13779l = ObservableUseCase.m17658b();

    /* renamed from: m */
    private final C2345e f13780m = new C2251k(this);

    public QuickRegisterUseCase(Schedulers bVar, C3061b bVar2, C3060h hVar, SystemRepository eVar) {
        super(bVar);
        this.f13776i = bVar2;
        this.f13777j = hVar;
        this.f13778k = eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void mo16683r() {
        C2348b bVar;
        try {
            mo17054i(new C2349c());
            mo17054i(new C2350d(mo16682p()));
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
    public /* synthetic */ void mo16684t(C2346f fVar) {
        if (fVar instanceof C2349c) {
            this.f14275c.run();
        } else if (fVar instanceof C2348b) {
            this.f14276d.run();
        } else if (fVar instanceof C2350d) {
            this.f13779l.mo4887a(((C2350d) fVar).f14282a);
        } else if (fVar instanceof C2347a) {
            this.f14277e.mo4887a(((C2347a) fVar).f14281a);
        }
    }

    /* renamed from: o */
    public void mo16681o() {
        mo17058m(this.f13780m);
        mo17055j(new C2252l(this));
    }

    /* renamed from: p */
    public User mo16682p() throws Exception {
        User g = this.f13776i.mo18663g(this.f13778k.mo18606c());
        this.f13777j.mo18616f(g.account);
        this.f13777j.mo18618h(g);
        this.f13778k.mo18607d(g.sid);
        return g;
    }

    /* renamed from: u */
    public QuickRegisterUseCase mo16685u(Consumer<ErrorBundle> aVar) {
        this.f14277e = aVar;
        return this;
    }

    /* renamed from: v */
    public QuickRegisterUseCase mo16686v(Runnable runnable) {
        this.f14275c = runnable;
        return this;
    }

    /* renamed from: w */
    public QuickRegisterUseCase mo16687w(Consumer<User> aVar) {
        this.f13779l = aVar;
        return this;
    }
}
