package com.tv91.p213u.p221b.p222x0;

import com.tv91.p207q.p209b.ObservableUseCase;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p212t.Schedulers;
import com.tv91.p255z.C3061b;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.u.b.x0.i1 */
public final class GetDownloadStatementUseCase extends ObservableUseCase<C2530c> {

    /* renamed from: i */
    private final C3061b f15075i;

    /* renamed from: com.tv91.u.b.x0.i1$a */
    /* compiled from: GetDownloadStatementUseCase */
    class C2528a implements C2530c {

        /* renamed from: a */
        final /* synthetic */ Consumer f15076a;

        C2528a(Consumer aVar) {
            this.f15076a = aVar;
        }

        /* renamed from: a */
        public /* synthetic */ void mo17489a(ErrorBundle cVar) {
            C2533j1.m18565a(this, cVar);
        }

        /* renamed from: b */
        public /* synthetic */ void mo17490b() {
            C2533j1.m18566b(this);
        }

        /* renamed from: c */
        public /* synthetic */ void mo17491c() {
            C2533j1.m18567c(this);
        }

        /* renamed from: d */
        public void mo17492d(String str) {
            this.f15076a.mo4887a(str);
        }
    }

    /* renamed from: com.tv91.u.b.x0.i1$b */
    /* compiled from: GetDownloadStatementUseCase */
    class C2529b implements C2530c {

        /* renamed from: a */
        final /* synthetic */ Consumer f15078a;

        C2529b(Consumer aVar) {
            this.f15078a = aVar;
        }

        /* renamed from: a */
        public void mo17489a(ErrorBundle cVar) {
            this.f15078a.mo4887a(cVar);
        }

        /* renamed from: b */
        public /* synthetic */ void mo17490b() {
            C2533j1.m18566b(this);
        }

        /* renamed from: c */
        public /* synthetic */ void mo17491c() {
            C2533j1.m18567c(this);
        }

        /* renamed from: d */
        public /* synthetic */ void mo17492d(String str) {
            C2533j1.m18568d(this, str);
        }
    }

    /* renamed from: com.tv91.u.b.x0.i1$c */
    /* compiled from: GetDownloadStatementUseCase */
    public interface C2530c {
        /* renamed from: a */
        void mo17489a(ErrorBundle cVar);

        /* renamed from: b */
        void mo17490b();

        /* renamed from: c */
        void mo17491c();

        /* renamed from: d */
        void mo17492d(String str);
    }

    public GetDownloadStatementUseCase(Schedulers bVar, C3061b bVar2) {
        super(bVar);
        this.f15075i = bVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void m18537A() {
        for (C2530c c : mo17052d()) {
            c.mo17491c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public void m18542u(String str) {
        for (C2530c d : mo17052d()) {
            d.mo17492d(str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void mo17486s() {
        C2551n nVar;
        try {
            mo17057l(new C2541l(this));
            mo17057l(new C2544m(this, mo17485p()));
            nVar = new C2551n(this);
        } catch (Exception e) {
            mo17057l(new C2534k(this, e));
            nVar = new C2551n(this);
        } catch (Throwable th) {
            mo17057l(new C2551n(this));
            throw th;
        }
        mo17057l(nVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void mo17488x(Exception exc) {
        m18544y(new ErrorBundle(exc));
    }

    /* renamed from: y */
    private void m18544y(ErrorBundle cVar) {
        for (C2530c a : mo17052d()) {
            a.mo17489a(cVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m18545z() {
        for (C2530c b : mo17052d()) {
            b.mo17490b();
        }
        mo17051a();
    }

    /* renamed from: C */
    public GetDownloadStatementUseCase mo17482C(Consumer<ErrorBundle> aVar) {
        mo17058m(new C2529b(aVar));
        return this;
    }

    /* renamed from: D */
    public GetDownloadStatementUseCase mo17483D(Consumer<String> aVar) {
        mo17058m(new C2528a(aVar));
        return this;
    }

    /* renamed from: o */
    public void mo17484o() {
        mo17055j(new C2554o(this));
    }

    /* renamed from: p */
    public String mo17485p() throws Exception {
        return this.f15075i.mo18673q();
    }
}
