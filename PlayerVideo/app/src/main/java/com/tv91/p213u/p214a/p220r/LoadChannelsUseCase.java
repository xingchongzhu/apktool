package com.tv91.p213u.p214a.p220r;

import com.tv91.model.Channel;
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

/* renamed from: com.tv91.u.a.r.l */
public final class LoadChannelsUseCase extends ObservableUseCase<C2345e> {

    /* renamed from: i */
    private final C3061b f14923i;

    /* renamed from: j */
    private Consumer<List<Channel>> f14924j = ObservableUseCase.m17658b();

    /* renamed from: k */
    private final C2345e f14925k = new C2449h(this);

    public LoadChannelsUseCase(Schedulers bVar, C3061b bVar2) {
        super(bVar);
        this.f14923i = bVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void mo17326r() {
        C2348b bVar;
        try {
            mo17054i(new C2349c());
            mo17054i(new C2350d(mo17325p()));
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
    public /* synthetic */ void mo17327t(C2346f fVar) {
        if (fVar instanceof C2349c) {
            this.f14275c.run();
        } else if (fVar instanceof C2348b) {
            this.f14276d.run();
        } else if (fVar instanceof C2350d) {
            this.f14924j.mo4887a(((C2350d) fVar).f14282a);
        } else if (fVar instanceof C2347a) {
            this.f14277e.mo4887a(((C2347a) fVar).f14281a);
        }
    }

    /* renamed from: o */
    public void mo17324o() {
        mo17058m(this.f14925k);
        mo17055j(new C2448g(this));
    }

    /* renamed from: p */
    public List<Channel> mo17325p() throws Exception {
        return this.f14923i.mo18680x();
    }

    /* renamed from: u */
    public LoadChannelsUseCase mo17328u(Consumer<ErrorBundle> aVar) {
        this.f14277e = aVar;
        return this;
    }

    /* renamed from: v */
    public LoadChannelsUseCase mo17329v(Consumer<List<Channel>> aVar) {
        this.f14924j = aVar;
        return this;
    }
}
