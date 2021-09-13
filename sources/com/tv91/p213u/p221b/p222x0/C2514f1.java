package com.tv91.p213u.p221b.p222x0;

import com.tv91.model.DownloadInfo;
import com.tv91.model.DownloadRecord;
import com.tv91.model.Movie;
import com.tv91.model.User;
import com.tv91.p207q.p209b.ObservableUseCase;
import com.tv91.p211s.ApiException;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p212t.Schedulers;
import com.tv91.p253y.C3058c;
import com.tv91.p253y.C3060h;

/* renamed from: com.tv91.u.b.x0.f1 */
/* compiled from: AddDownloadUseCase */
public final class C2514f1 extends ObservableUseCase<C2515a> {

    /* renamed from: i */
    private final C3060h f15052i;

    /* renamed from: j */
    private final C3058c f15053j;

    /* renamed from: com.tv91.u.b.x0.f1$a */
    /* compiled from: AddDownloadUseCase */
    public interface C2515a {
        /* renamed from: a */
        void mo17367a(ErrorBundle cVar);

        /* renamed from: h */
        void mo17373h();

        /* renamed from: o */
        void mo17383o(DownloadRecord aVar);

        /* renamed from: q */
        void mo17385q();
    }

    public C2514f1(Schedulers bVar, C3060h hVar, C3058c cVar) {
        super(bVar);
        this.f15052i = hVar;
        this.f15053j = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void m18477A() {
        for (C2515a h : mo17052d()) {
            h.mo17373h();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public void m18481t(DownloadRecord aVar) {
        for (C2515a o : mo17052d()) {
            o.mo17383o(aVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void mo17460s(Movie movie, DownloadInfo downloadInfo, String str) {
        C2510e eVar;
        try {
            mo17057l(new C2498a(this));
            mo17057l(new C2507d(this, mo17459p(movie, downloadInfo, str)));
            eVar = new C2510e(this);
        } catch (Exception e) {
            ErrorBundle cVar = new ErrorBundle(e);
            if (cVar.mo17116f()) {
                this.f15052i.mo18619i();
            }
            mo17057l(new C2504c(this, cVar));
            eVar = new C2510e(this);
        } catch (Throwable th) {
            mo17057l(new C2510e(this));
            throw th;
        }
        mo17057l(eVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public void m18482v(ErrorBundle cVar) {
        for (C2515a a : mo17052d()) {
            a.mo17367a(cVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m18485z() {
        for (C2515a q : mo17052d()) {
            q.mo17385q();
        }
    }

    /* renamed from: o */
    public void mo17458o(Movie movie, DownloadInfo downloadInfo, String str) {
        mo17055j(new C2501b(this, movie, downloadInfo, str));
    }

    /* renamed from: p */
    public DownloadRecord mo17459p(Movie movie, DownloadInfo downloadInfo, String str) throws Exception {
        User e = this.f15052i.mo18615e();
        if (e != null) {
            return this.f15053j.mo18601i(e, movie, downloadInfo, str);
        }
        throw new ApiException("NotLogin");
    }
}
