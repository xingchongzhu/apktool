package com.tv91.p213u.p221b.p222x0;

import com.tv91.model.DownloadRecord;
import com.tv91.model.Movie;
import com.tv91.p207q.p209b.ObservableUseCase;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p212t.Schedulers;
import com.tv91.p253y.C3058c;
import com.tv91.p253y.C3060h;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.u.b.x0.k1 */
public final class LoadDownloadRecordUseCase extends ObservableUseCase<C2540e> {

    /* renamed from: i */
    private final C3060h f15087i;

    /* renamed from: j */
    private final C3058c f15088j;

    /* renamed from: com.tv91.u.b.x0.k1$a */
    /* compiled from: LoadDownloadRecordUseCase */
    class C2536a implements C2540e {

        /* renamed from: a */
        final /* synthetic */ Runnable f15089a;

        C2536a(Runnable runnable) {
            this.f15089a = runnable;
        }

        /* renamed from: a */
        public /* synthetic */ void mo17506a(ErrorBundle cVar) {
            C2543l1.m18607a(this, cVar);
        }

        /* renamed from: b */
        public /* synthetic */ void mo17507b(DownloadRecord aVar) {
            C2543l1.m18610d(this, aVar);
        }

        /* renamed from: c */
        public /* synthetic */ void mo17508c() {
            C2543l1.m18608b(this);
        }

        /* renamed from: d */
        public void mo17509d() {
            this.f15089a.run();
        }
    }

    /* renamed from: com.tv91.u.b.x0.k1$b */
    /* compiled from: LoadDownloadRecordUseCase */
    class C2537b implements C2540e {

        /* renamed from: a */
        final /* synthetic */ Runnable f15091a;

        C2537b(Runnable runnable) {
            this.f15091a = runnable;
        }

        /* renamed from: a */
        public /* synthetic */ void mo17506a(ErrorBundle cVar) {
            C2543l1.m18607a(this, cVar);
        }

        /* renamed from: b */
        public /* synthetic */ void mo17507b(DownloadRecord aVar) {
            C2543l1.m18610d(this, aVar);
        }

        /* renamed from: c */
        public void mo17508c() {
            this.f15091a.run();
        }

        /* renamed from: d */
        public /* synthetic */ void mo17509d() {
            C2543l1.m18609c(this);
        }
    }

    /* renamed from: com.tv91.u.b.x0.k1$c */
    /* compiled from: LoadDownloadRecordUseCase */
    class C2538c implements C2540e {

        /* renamed from: a */
        final /* synthetic */ Consumer f15093a;

        C2538c(Consumer aVar) {
            this.f15093a = aVar;
        }

        /* renamed from: a */
        public /* synthetic */ void mo17506a(ErrorBundle cVar) {
            C2543l1.m18607a(this, cVar);
        }

        /* renamed from: b */
        public void mo17507b(DownloadRecord aVar) {
            this.f15093a.mo4887a(aVar);
        }

        /* renamed from: c */
        public /* synthetic */ void mo17508c() {
            C2543l1.m18608b(this);
        }

        /* renamed from: d */
        public /* synthetic */ void mo17509d() {
            C2543l1.m18609c(this);
        }
    }

    /* renamed from: com.tv91.u.b.x0.k1$d */
    /* compiled from: LoadDownloadRecordUseCase */
    class C2539d implements C2540e {

        /* renamed from: a */
        final /* synthetic */ Consumer f15095a;

        C2539d(Consumer aVar) {
            this.f15095a = aVar;
        }

        /* renamed from: a */
        public void mo17506a(ErrorBundle cVar) {
            this.f15095a.mo4887a(cVar);
        }

        /* renamed from: b */
        public /* synthetic */ void mo17507b(DownloadRecord aVar) {
            C2543l1.m18610d(this, aVar);
        }

        /* renamed from: c */
        public /* synthetic */ void mo17508c() {
            C2543l1.m18608b(this);
        }

        /* renamed from: d */
        public /* synthetic */ void mo17509d() {
            C2543l1.m18609c(this);
        }
    }

    /* renamed from: com.tv91.u.b.x0.k1$e */
    /* compiled from: LoadDownloadRecordUseCase */
    public interface C2540e {
        /* renamed from: a */
        void mo17506a(ErrorBundle cVar);

        /* renamed from: b */
        void mo17507b(DownloadRecord aVar);

        /* renamed from: c */
        void mo17508c();

        /* renamed from: d */
        void mo17509d();
    }

    public LoadDownloadRecordUseCase(Schedulers bVar, C3060h hVar, C3058c cVar) {
        super(bVar);
        this.f15087i = hVar;
        this.f15088j = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void m18569A() {
        for (C2540e d : mo17052d()) {
            d.mo17509d();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public void m18574u(DownloadRecord aVar) {
        for (C2540e b : mo17052d()) {
            b.mo17507b(aVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void mo17503t(Movie movie) {
        C2570s sVar;
        try {
            mo17057l(new C2561p(this));
            mo17057l(new C2572t(this, mo17502p(movie)));
            sVar = new C2570s(this);
        } catch (Exception e) {
            ErrorBundle cVar = new ErrorBundle(e);
            if (cVar.mo17116f()) {
                this.f15087i.mo18619i();
            }
            mo17057l(new C2566r(this, cVar));
            sVar = new C2570s(this);
        } catch (Throwable th) {
            mo17057l(new C2570s(this));
            throw th;
        }
        mo17057l(sVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public void m18575w(ErrorBundle cVar) {
        for (C2540e a : mo17052d()) {
            a.mo17506a(cVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m18577z() {
        for (C2540e c : mo17052d()) {
            c.mo17508c();
        }
        mo17051a();
    }

    /* renamed from: C */
    public LoadDownloadRecordUseCase mo17497C(Consumer<ErrorBundle> aVar) {
        mo17058m(new C2539d(aVar));
        return this;
    }

    /* renamed from: D */
    public LoadDownloadRecordUseCase mo17498D(Runnable runnable) {
        mo17058m(new C2537b(runnable));
        return this;
    }

    /* renamed from: E */
    public LoadDownloadRecordUseCase mo17499E(Runnable runnable) {
        mo17058m(new C2536a(runnable));
        return this;
    }

    /* renamed from: F */
    public LoadDownloadRecordUseCase mo17500F(Consumer<DownloadRecord> aVar) {
        mo17058m(new C2538c(aVar));
        return this;
    }

    /* renamed from: o */
    public void mo17501o(Movie movie) {
        mo17056k(new C2564q(this, movie));
    }

    /* renamed from: p */
    public DownloadRecord mo17502p(Movie movie) throws Exception {
        DownloadRecord d = this.f15088j.mo18596d(this.f15087i.mo18614d(), movie.f14083id);
        return d != null ? d.mo17039d(this.f15087i.mo18615e()) : d;
    }
}
