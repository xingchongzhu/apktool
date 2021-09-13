package com.tv91.p213u.p221b.p222x0;

import com.tv91.model.DownloadRecord;
import com.tv91.p207q.p209b.ObservableUseCase;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p212t.Schedulers;
import com.tv91.p253y.C3058c;

/* renamed from: com.tv91.u.b.x0.w1 */
public final class UpdateDownloadUseCase extends ObservableUseCase<C2584a> {

    /* renamed from: i */
    private final C3058c f15163i;

    /* renamed from: com.tv91.u.b.x0.w1$a */
    /* compiled from: UpdateDownloadUseCase */
    public interface C2584a {
        /* renamed from: a */
        void mo17578a(ErrorBundle cVar);

        /* renamed from: b */
        void mo17579b();

        /* renamed from: c */
        void mo17580c();

        /* renamed from: d */
        void mo17581d();
    }

    public UpdateDownloadUseCase(Schedulers bVar, C3058c cVar) {
        super(bVar);
        this.f15163i = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void m18773A() {
        for (C2584a b : mo17052d()) {
            b.mo17579b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void mo17576t(DownloadRecord aVar) {
        C2500a1 a1Var;
        try {
            mo17057l(new C2590z0(this));
            mo17575p(aVar);
            mo17057l(new C2509d1(this));
            a1Var = new C2500a1(this);
        } catch (Exception e) {
            mo17057l(new C2506c1(this, e));
            a1Var = new C2500a1(this);
        } catch (Throwable th) {
            mo17057l(new C2500a1(this));
            throw th;
        }
        mo17057l(a1Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void mo17577v(Exception exc) {
        m18779x(new ErrorBundle(exc));
    }

    /* renamed from: x */
    private void m18779x(ErrorBundle cVar) {
        for (C2584a a : mo17052d()) {
            a.mo17578a(cVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public void m18780y() {
        for (C2584a d : mo17052d()) {
            d.mo17581d();
        }
        mo17051a();
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m18781z() {
        for (C2584a c : mo17052d()) {
            c.mo17580c();
        }
    }

    /* renamed from: o */
    public void mo17574o(DownloadRecord aVar) {
        mo17055j(new C2503b1(this, aVar));
    }

    /* renamed from: p */
    public void mo17575p(DownloadRecord aVar) throws Exception {
        this.f15163i.mo18600h(aVar);
    }
}
