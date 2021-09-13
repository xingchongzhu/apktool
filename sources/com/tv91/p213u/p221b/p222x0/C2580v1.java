package com.tv91.p213u.p221b.p222x0;

import com.tv91.model.DownloadInfo;
import com.tv91.model.DownloadRecord;
import com.tv91.model.DownloadRecord.C2335a;
import com.tv91.p207q.p209b.ObservableUseCase;
import com.tv91.p211s.ApiException;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p212t.Schedulers;
import com.tv91.p253y.C3058c;
import com.tv91.p253y.C3060h;
import com.tv91.p255z.C3061b;
import com.tv91.p255z.DownloadApi;
import java.io.File;
import java.util.Date;

/* renamed from: com.tv91.u.b.x0.v1 */
/* compiled from: StartDownloadUseCase */
public final class C2580v1 extends ObservableUseCase<C2581a> {

    /* renamed from: i */
    private final C3061b f15156i;

    /* renamed from: j */
    private final DownloadApi f15157j;

    /* renamed from: k */
    private final C3060h f15158k;

    /* renamed from: l */
    private final C3058c f15159l;

    /* renamed from: com.tv91.u.b.x0.v1$a */
    /* compiled from: StartDownloadUseCase */
    public interface C2581a {
        /* renamed from: a */
        void mo17367a(ErrorBundle cVar);

        /* renamed from: k */
        void mo17376k(DownloadRecord aVar, Number number);

        /* renamed from: l */
        void mo17378l();

        /* renamed from: s */
        void mo17388s();

        /* renamed from: u */
        void mo17391u(DownloadRecord aVar, File file);
    }

    public C2580v1(Schedulers bVar, C3061b bVar2, DownloadApi cVar, C3060h hVar, C3058c cVar2) {
        super(bVar);
        this.f15156i = bVar2;
        this.f15157j = cVar;
        this.f15158k = hVar;
        this.f15159l = cVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ void mo17563C(DownloadRecord aVar) {
        C2583w0 w0Var;
        try {
            mo17057l(new C2573t0(this));
            mo17569r(aVar);
            w0Var = new C2583w0(this);
        } catch (Exception e) {
            ErrorBundle cVar = new ErrorBundle(e);
            if (cVar.mo17116f()) {
                this.f15158k.mo18619i();
            }
            mo17057l(new C2567r0(this, cVar));
            w0Var = new C2583w0(this);
        } catch (Throwable th) {
            mo17057l(new C2583w0(this));
            throw th;
        }
        mo17057l(w0Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public /* synthetic */ void mo17564E(DownloadRecord aVar, Number number) {
        mo17057l(new C2586x0(this, aVar, number));
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public void m18743H(ErrorBundle cVar) {
        for (C2581a a : mo17052d()) {
            a.mo17367a(cVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public void m18746M() {
        for (C2581a s : mo17052d()) {
            s.mo17388s();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public void m18744J(DownloadRecord aVar, Number number) {
        for (C2581a k : mo17052d()) {
            k.mo17376k(aVar, number);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public void m18748O() {
        for (C2581a l : mo17052d()) {
            l.mo17378l();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public void m18755v(DownloadRecord aVar, File file) {
        for (C2581a u : mo17052d()) {
            u.mo17391u(aVar, file);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m18742F(DownloadRecord aVar, File file) {
        this.f15157j.mo18684a(aVar);
        try {
            String d = this.f15158k.mo18614d();
            String g = this.f15158k.mo18617g();
            C3061b bVar = this.f15156i;
            int i = aVar.f14101c.f14083id;
            DownloadInfo downloadInfo = aVar.f14102d;
            bVar.mo18667k(d, g, i, downloadInfo.f14080id, downloadInfo.verifyId);
            mo17057l(new C2571s0(this, this.f15159l.mo18602j(aVar), file));
        } catch (Exception e) {
            mo17057l(new C2555o0(this, e));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m18751p(Exception exc) {
        mo17057l(new C2588y0(this, exc));
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void mo17571y(Exception exc) {
        m18743H(new ErrorBundle(exc));
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void mo17562A(Exception exc) {
        m18743H(new ErrorBundle(exc));
    }

    /* renamed from: q */
    public void mo17568q(DownloadRecord aVar) {
        mo17056k(new C2579v0(this, aVar));
    }

    /* renamed from: r */
    public void mo17569r(DownloadRecord aVar) throws Exception {
        if (!new Date().after(aVar.f14102d.expireDate)) {
            DownloadRecord c = this.f15159l.mo18595c(aVar);
            this.f15157j.mo18688e(c, new C2562p0(this, c));
            this.f15157j.mo18689f(c, new C2577u0(this, c), new C2565q0(this));
            return;
        }
        this.f15159l.mo18600h(aVar.mo17037b(C2335a.EXPIRED));
        throw new ApiException("Download-Expired");
    }
}
