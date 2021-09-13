package com.tv91.p213u.p214a.p220r;

import com.tv91.model.ExternalSource;
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
import java.util.Collections;
import java.util.List;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.u.a.r.j */
public final class LoadAdvertiseUseCase extends ObservableUseCase<C2345e> {

    /* renamed from: i */
    private final C3061b f14917i;

    /* renamed from: j */
    private Consumer<List<ExternalSource>> f14918j = ObservableUseCase.m17658b();

    /* renamed from: k */
    private final C2345e f14919k = new C2444c(this);

    public LoadAdvertiseUseCase(Schedulers bVar, C3061b bVar2) {
        super(bVar);
        this.f14917i = bVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void mo17312r() {
        C2348b bVar;
        try {
            mo17054i(new C2349c());
            mo17054i(new C2350d(mo17311p()));
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
    public /* synthetic */ void mo17313t(C2346f fVar) {
        if (fVar instanceof C2349c) {
            this.f14275c.run();
        } else if (fVar instanceof C2348b) {
            this.f14276d.run();
        } else if (fVar instanceof C2350d) {
            this.f14918j.mo4887a(((C2350d) fVar).f14282a);
        } else if (fVar instanceof C2347a) {
            this.f14277e.mo4887a(((C2347a) fVar).f14281a);
        }
    }

    /* renamed from: o */
    public void mo17310o() {
        mo17058m(this.f14919k);
        mo17055j(new C2445d(this));
    }

    /* renamed from: p */
    public List<ExternalSource> mo17311p() throws Exception {
        List<ExternalSource> Q = this.f14917i.mo18646Q();
        return Q == null ? Collections.emptyList() : Q;
    }

    /* renamed from: u */
    public LoadAdvertiseUseCase mo17314u(Consumer<ErrorBundle> aVar) {
        this.f14277e = aVar;
        return this;
    }

    /* renamed from: v */
    public LoadAdvertiseUseCase mo17315v(Consumer<List<ExternalSource>> aVar) {
        this.f14918j = aVar;
        return this;
    }
}
