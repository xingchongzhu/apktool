package com.tv91.p213u.p221b.p222x0;

import com.tv91.model.DownloadInfo;
import com.tv91.model.Movie;
import com.tv91.p207q.p209b.ObservableUseCase;
import com.tv91.p211s.ApiException;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p212t.Schedulers;
import com.tv91.p253y.C3060h;
import com.tv91.p255z.C3061b;
import java.util.Date;

import androidx.core.util.Consumer;

/* renamed from: com.tv91.u.b.x0.g1 */
public final class GetDownloadInfoUseCase extends ObservableUseCase<GetDownloadInfoUseCase.GetDownloadInterface> {

    /* renamed from: i */
    private final C3061b f15058i;

    /* renamed from: j */
    private final C3060h f15059j;

    /* renamed from: com.tv91.u.b.x0.g1$a */
    /* compiled from: GetDownloadInfoUseCase */
    class C2518a implements GetDownloadInterface {

        /* renamed from: a */
        final /* synthetic */ Runnable f15060a;

        C2518a(Runnable runnable) {
            this.f15060a = runnable;
        }

        /* renamed from: a */
        public /* synthetic */ void mo17474a(ErrorBundle cVar) {
            C2525h1.m18533a(this, cVar);
        }

        /* renamed from: b */
        public /* synthetic */ void mo17475b() {
            C2525h1.m18534b(this);
        }

        /* renamed from: c */
        public void mo17476c() {
            this.f15060a.run();
        }

        /* renamed from: d */
        public /* synthetic */ void mo17477d(DownloadInfo downloadInfo) {
            C2525h1.m18536d(this, downloadInfo);
        }
    }

    /* renamed from: com.tv91.u.b.x0.g1$b */
    /* compiled from: GetDownloadInfoUseCase */
    class C2519b implements GetDownloadInterface {

        /* renamed from: a */
        final /* synthetic */ Runnable f15062a;

        C2519b(Runnable runnable) {
            this.f15062a = runnable;
        }

        /* renamed from: a */
        public /* synthetic */ void mo17474a(ErrorBundle cVar) {
            C2525h1.m18533a(this, cVar);
        }

        /* renamed from: b */
        public void mo17475b() {
            this.f15062a.run();
        }

        /* renamed from: c */
        public /* synthetic */ void mo17476c() {
            C2525h1.m18535c(this);
        }

        /* renamed from: d */
        public /* synthetic */ void mo17477d(DownloadInfo downloadInfo) {
            C2525h1.m18536d(this, downloadInfo);
        }
    }

    /* renamed from: com.tv91.u.b.x0.g1$c */
    /* compiled from: GetDownloadInfoUseCase */
    class C2520c implements GetDownloadInterface {

        /* renamed from: a */
        final /* synthetic */ Consumer f15064a;

        C2520c(Consumer aVar) {
            this.f15064a = aVar;
        }

        /* renamed from: a */
        public /* synthetic */ void mo17474a(ErrorBundle cVar) {
            C2525h1.m18533a(this, cVar);
        }

        /* renamed from: b */
        public /* synthetic */ void mo17475b() {
            C2525h1.m18534b(this);
        }

        /* renamed from: c */
        public /* synthetic */ void mo17476c() {
            C2525h1.m18535c(this);
        }

        /* renamed from: d */
        public void mo17477d(DownloadInfo downloadInfo) {
            this.f15064a.accept(downloadInfo);
        }
    }

    /* renamed from: com.tv91.u.b.x0.g1$d */
    /* compiled from: GetDownloadInfoUseCase */
    class C2521d implements GetDownloadInterface {

        /* renamed from: a */
        final /* synthetic */ Consumer f15066a;

        C2521d(Consumer aVar) {
            this.f15066a = aVar;
        }

        /* renamed from: a */
        public void mo17474a(ErrorBundle cVar) {
            this.f15066a.accept(cVar);
        }

        /* renamed from: b */
        public /* synthetic */ void mo17475b() {
            C2525h1.m18534b(this);
        }

        /* renamed from: c */
        public /* synthetic */ void mo17476c() {
            C2525h1.m18535c(this);
        }

        /* renamed from: d */
        public /* synthetic */ void mo17477d(DownloadInfo downloadInfo) {
            C2525h1.m18536d(this, downloadInfo);
        }
    }

    /* renamed from: com.tv91.u.b.x0.g1$e */
    /* compiled from: GetDownloadInfoUseCase */
    public interface GetDownloadInterface {
        /* renamed from: a */
        void mo17474a(ErrorBundle cVar);

        /* renamed from: b */
        void mo17475b();

        /* renamed from: c */
        void mo17476c();

        /* renamed from: d */
        void mo17477d(DownloadInfo downloadInfo);
    }

    public GetDownloadInfoUseCase(Schedulers bVar, C3061b bVar2, C3060h hVar) {
        super(bVar);
        this.f15058i = bVar2;
        this.f15059j = hVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void m18495A() {
        for (GetDownloadInterface c : mo17052d()) {
            c.mo17476c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public void m18499t(DownloadInfo downloadInfo) {
        for (GetDownloadInterface d : mo17052d()) {
            d.mo17477d(downloadInfo);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void mo17471r(Movie movie) {
        C2531j jVar;
        try {
            mo17057l(new C2526i(this));
            mo17057l(new C2523h(this, mo17470p(movie)));
            jVar = new C2531j(this);
        } catch (Exception e) {
            ErrorBundle cVar = new ErrorBundle(e);
            if (cVar.mo17116f()) {
                this.f15059j.mo18619i();
            }
            mo17057l(new C2516g(this, cVar));
            jVar = new C2531j(this);
        } catch (Throwable th) {
            mo17057l(new C2531j(this));
            throw th;
        }
        mo17057l(jVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public void m18500v(ErrorBundle cVar) {
        for (GetDownloadInterface a : mo17052d()) {
            a.mo17474a(cVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m18503z() {
        for (GetDownloadInterface b : mo17052d()) {
            b.mo17475b();
        }
        mo17051a();
    }

    /* renamed from: C */
    public GetDownloadInfoUseCase mo17465C(Consumer<ErrorBundle> aVar) {
        mo17058m(new C2521d(aVar));
        return this;
    }

    /* renamed from: D */
    public GetDownloadInfoUseCase mo17466D(Runnable runnable) {
        mo17058m(new C2519b(runnable));
        return this;
    }

    /* renamed from: E */
    public GetDownloadInfoUseCase mo17467E(Runnable runnable) {
        mo17058m(new C2518a(runnable));
        return this;
    }

    /* renamed from: F */
    public GetDownloadInfoUseCase mo17468F(Consumer<DownloadInfo> aVar) {
        mo17058m(new C2520c(aVar));
        return this;
    }

    /* renamed from: o */
    public void mo17469o(Movie movie) {
        mo17055j(new C2512f(this, movie));
    }

    /* renamed from: p */
    public DownloadInfo mo17470p(Movie movie) throws Exception {
        DownloadInfo W = this.f15058i.mo18652W(this.f15059j.mo18614d(), this.f15059j.mo18617g(), movie.f14083id);
        if (!new Date().after(W.expireDate)) {
            return W;
        }
        throw new ApiException("Download-Expired");
    }
}
