package com.tv91.p213u.p214a.p220r;

import com.tv91.model.Actor;
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
import com.tv91.p255z.C3061b;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.u.a.r.i */
public final class LoadActorsUseCase extends ObservableUseCase<C2345e> {

    /* renamed from: i */
    private final C3061b f14914i;

    /* renamed from: j */
    private Consumer<Paging<Actor>> f14915j = ObservableUseCase.m17658b();

    /* renamed from: k */
    private final C2345e f14916k = new C2443b(this);

    public LoadActorsUseCase(Schedulers bVar, C3061b bVar2) {
        super(bVar);
        this.f14914i = bVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void mo17304r(int i, int i2) {
        C2348b bVar;
        try {
            mo17054i(new C2349c());
            mo17054i(new C2350d(mo17303p(i, i2)));
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
    public /* synthetic */ void mo17305t(C2346f fVar) {
        if (fVar instanceof C2349c) {
            this.f14275c.run();
        } else if (fVar instanceof C2348b) {
            this.f14276d.run();
        } else if (fVar instanceof C2350d) {
            this.f14915j.mo4887a(((C2350d) fVar).f14282a);
        } else if (fVar instanceof C2347a) {
            this.f14277e.mo4887a(((C2347a) fVar).f14281a);
        }
    }

    /* renamed from: o */
    public void mo17302o(int i, int i2) {
        mo17058m(this.f14916k);
        mo17055j(new C2442a(this, i, i2));
    }

    /* renamed from: p */
    public Paging<Actor> mo17303p(int i, int i2) throws Exception {
        return this.f14914i.mo18678v(i, i2);
    }

    /* renamed from: u */
    public LoadActorsUseCase mo17306u(Consumer<ErrorBundle> aVar) {
        this.f14277e = aVar;
        return this;
    }

    /* renamed from: v */
    public LoadActorsUseCase mo17307v(Runnable runnable) {
        this.f14276d = runnable;
        return this;
    }

    /* renamed from: w */
    public LoadActorsUseCase mo17308w(Runnable runnable) {
        this.f14275c = runnable;
        return this;
    }

    /* renamed from: x */
    public LoadActorsUseCase mo17309x(Consumer<Paging<Actor>> aVar) {
        this.f14915j = aVar;
        return this;
    }
}
