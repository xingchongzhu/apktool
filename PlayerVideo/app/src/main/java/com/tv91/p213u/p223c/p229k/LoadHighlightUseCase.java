package com.tv91.p213u.p223c.p229k;

import com.tv91.model.Highlight;
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
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.u.c.k.q */
public final class LoadHighlightUseCase extends ObservableUseCase<C2345e> {

    /* renamed from: i */
    private final C3061b f15517i;

    /* renamed from: j */
    private Consumer<Highlight> f15518j = ObservableUseCase.m17658b();

    /* renamed from: k */
    private final C2345e f15519k = new C2782e(this);

    public LoadHighlightUseCase(Schedulers bVar, C3061b bVar2) {
        super(bVar);
        this.f15517i = bVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void mo17961r() {
        C2348b bVar;
        try {
            mo17054i(new C2349c());
            mo17054i(new C2350d(mo17960p()));
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
    public /* synthetic */ void mo17962t(C2346f fVar) {
        if (fVar instanceof C2349c) {
            this.f14275c.run();
        } else if (fVar instanceof C2348b) {
            this.f14276d.run();
        } else if (fVar instanceof C2350d) {
            this.f15518j.mo4887a(((C2350d) fVar).f14282a);
        } else if (fVar instanceof C2347a) {
            this.f14277e.mo4887a(((C2347a) fVar).f14281a);
        }
    }

    /* renamed from: o */
    public void mo17959o() {
        mo17058m(this.f15519k);
        mo17055j(new C2783f(this));
    }

    /* renamed from: p */
    public Highlight mo17960p() throws Exception {
        return this.f15517i.mo18650U();
    }

    /* renamed from: u */
    public LoadHighlightUseCase mo17963u(Consumer<ErrorBundle> aVar) {
        this.f14277e = aVar;
        return this;
    }

    /* renamed from: v */
    public LoadHighlightUseCase mo17964v(Consumer<Highlight> aVar) {
        this.f15518j = aVar;
        return this;
    }
}
