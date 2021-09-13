package com.tv91.p213u.p242g.p243f0;

import com.tv91.model.Version;
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
import com.tv91.utils.C3052g;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.u.g.f0.i */
public final class CheckUpdateUseCase extends ObservableUseCase<C2345e> {

    /* renamed from: i */
    private final C3061b f15848i;

    /* renamed from: j */
    private Consumer<Version> f15849j = ObservableUseCase.m17658b();

    /* renamed from: k */
    private Runnable f15850k = ObservableUseCase.m17659c();

    /* renamed from: l */
    private final C2345e f15851l = new C2927b(this);

    /* renamed from: com.tv91.u.g.f0.i$a */
    /* compiled from: CheckUpdateUseCase */
    public static class C2934a implements C2346f {
    }

    public CheckUpdateUseCase(Schedulers bVar, C3061b bVar2) {
        super(bVar);
        this.f15848i = bVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void mo18333r(String str, String str2) {
        C2348b bVar;
        try {
            mo17054i(new C2349c());
            Version p = mo18332p(str);
            if (C3052g.m20581b(str2, p.version)) {
                mo17054i(new C2934a());
            } else {
                mo17054i(new C2350d(p));
            }
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
    public /* synthetic */ void mo18334t(C2346f fVar) {
        if (fVar instanceof C2349c) {
            this.f14275c.run();
        } else if (fVar instanceof C2348b) {
            this.f14276d.run();
        } else if (fVar instanceof C2350d) {
            this.f15849j.mo4887a(((C2350d) fVar).f14282a);
        } else if (fVar instanceof C2934a) {
            this.f15850k.run();
        } else if (fVar instanceof C2347a) {
            this.f14277e.mo4887a(((C2347a) fVar).f14281a);
        }
    }

    /* renamed from: o */
    public void mo18331o(String str, String str2) {
        mo17058m(this.f15851l);
        mo17055j(new C2926a(this, str, str2));
    }

    /* renamed from: p */
    public Version mo18332p(String str) throws Exception {
        return this.f15848i.mo18662f(str);
    }

    /* renamed from: u */
    public CheckUpdateUseCase mo18335u(Consumer<ErrorBundle> aVar) {
        this.f14277e = aVar;
        return this;
    }

    /* renamed from: v */
    public CheckUpdateUseCase mo18336v(Runnable runnable) {
        this.f14275c = runnable;
        return this;
    }

    /* renamed from: w */
    public CheckUpdateUseCase mo18337w(Runnable runnable) {
        this.f15850k = runnable;
        return this;
    }

    /* renamed from: x */
    public CheckUpdateUseCase mo18338x(Consumer<Version> aVar) {
        this.f15849j = aVar;
        return this;
    }
}
