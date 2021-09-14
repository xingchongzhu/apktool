package com.tv91.p213u.p221b.p222x0;

import com.tv91.model.DownloadRecord;
import com.tv91.p207q.p209b.ObservableUseCase;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p212t.Schedulers;
import com.tv91.p253y.C3058c;
import com.tv91.p255z.DownloadApi;

/* renamed from: com.tv91.u.b.x0.t1 */
/* compiled from: RemoveDownloadUseCase */
public final class RemoveDownObservableUseCase extends ObservableUseCase<RemoveDownObservableUseCase.RemoveDownloadInterface> {

    /* renamed from: i */
    private final DownloadApi f15147i;

    /* renamed from: j */
    private final C3058c f15148j;

    /* renamed from: com.tv91.u.b.x0.t1$a */
    /* compiled from: RemoveDownloadUseCase */
    public interface RemoveDownloadInterface {
        /* renamed from: a */
        void mo17367a(ErrorBundle cVar);

        /* renamed from: f */
        void mo17371f();

        /* renamed from: n */
        void mo17381n(DownloadRecord aVar);

        /* renamed from: r */
        void mo17387r();
    }

    public RemoveDownObservableUseCase(Schedulers bVar, DownloadApi cVar, C3058c cVar2) {
        super(bVar);
        this.f15147i = cVar;
        this.f15148j = cVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void m18719A() {
        for (RemoveDownloadInterface f : mo17052d()) {
            f.mo17371f();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public void m18724u(DownloadRecord aVar) {
        for (RemoveDownloadInterface n : mo17052d()) {
            n.mo17381n(aVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void mo17556s(DownloadRecord aVar) {
        C2542l0 l0Var;
        try {
            mo17057l(new C2545m0(this));
            mo17057l(new C2552n0(this, mo17555p(aVar)));
            l0Var = new C2542l0(this);
        } catch (Exception e) {
            mo17057l(new C2532j0(this, e));
            l0Var = new C2542l0(this);
        } catch (Throwable th) {
            mo17057l(new C2542l0(this));
            throw th;
        }
        mo17057l(l0Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void mo17558x(Exception exc) {
        m18726y(new ErrorBundle(exc));
    }

    /* renamed from: y */
    private void m18726y(ErrorBundle cVar) {
        for (RemoveDownloadInterface a : mo17052d()) {
            a.mo17367a(cVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m18727z() {
        for (RemoveDownloadInterface r : mo17052d()) {
            r.mo17387r();
        }
    }

    /* renamed from: o */
    public void mo17554o(DownloadRecord aVar) {
        mo17055j(new C2535k0(this, aVar));
    }

    /* renamed from: p */
    public DownloadRecord mo17555p(DownloadRecord aVar) throws Exception {
        this.f15147i.mo18684a(aVar);
        this.f15147i.mo18686c(aVar);
        return this.f15148j.mo18603k(aVar);
    }
}
