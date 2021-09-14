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
import com.tv91.p255z.C3061b;

import androidx.core.util.Consumer;

/* renamed from: com.tv91.features.authentication.q.w */
public final class LoadUserInfoUseCase extends ObservableUseCase<C2345e> {

    /* renamed from: i */
    private final C3061b f13843i;

    /* renamed from: j */
    private final C3060h f13844j;

    /* renamed from: k */
    private Consumer<User> f13845k = ObservableUseCase.m17658b();

    /* renamed from: l */
    private final C2345e f13846l = new C2240a(this);

    public LoadUserInfoUseCase(Schedulers bVar, C3061b bVar2, C3060h hVar) {
        super(bVar);
        this.f13843i = bVar2;
        this.f13844j = hVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void mo16735r() {
        C2348b bVar;
        try {
            mo17054i(new C2349c());
            mo17054i(new C2350d(mo16734p()));
            bVar = new C2348b();
        } catch (Exception e) {
            ErrorBundle cVar = new ErrorBundle(e);
            if (cVar.mo17116f()) {
                this.f13844j.mo18619i();
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
    public /* synthetic */ void mo16736t(C2346f fVar) {
        if (fVar instanceof C2349c) {
            this.f14275c.run();
        } else if (fVar instanceof C2348b) {
            this.f14276d.run();
        } else if (fVar instanceof C2350d) {
            this.f13845k.accept(((C2350d) fVar).f14282a);
        } else if (fVar instanceof C2347a) {
            this.f14277e.mo4887a(((C2347a) fVar).f14281a);
        }
    }

    /* renamed from: o */
    public void mo16733o() {
        mo17058m(this.f13846l);
        mo17055j(new C2241b(this));
    }

    /* renamed from: p */
    public User mo16734p() throws Exception {
        User H = this.f13843i.mo18637H(this.f13844j.mo18614d(), this.f13844j.mo18617g());
        User build = this.f13844j.mo18615e().newBuilder().phone(H.phone).point(H.point).isVip(H.isVip).vipDate(H.vipDate).isQuick(H.isQuick).isCertified(H.isCertified).onlineServiceAvailable(H.onlineServiceAvailable).onlineServiceUrl(H.onlineServiceUrl).build();
        this.f13844j.mo18618h(build);
        return build;
    }

    /* renamed from: u */
    public LoadUserInfoUseCase mo16737u(Consumer<ErrorBundle> aVar) {
        this.f14277e = aVar;
        return this;
    }

    /* renamed from: v */
    public LoadUserInfoUseCase mo16738v(Runnable runnable) {
        this.f14276d = runnable;
        return this;
    }

    /* renamed from: w */
    public LoadUserInfoUseCase mo16739w(Runnable runnable) {
        this.f14275c = runnable;
        return this;
    }

    /* renamed from: x */
    public LoadUserInfoUseCase mo16740x(Consumer<User> aVar) {
        this.f13845k = aVar;
        return this;
    }
}
