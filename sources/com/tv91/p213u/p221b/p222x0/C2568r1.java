package com.tv91.p213u.p221b.p222x0;

import com.tv91.model.DownloadRecord;
import com.tv91.p207q.p209b.ObservableUseCase;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p212t.Schedulers;
import com.tv91.p253y.C3058c;
import com.tv91.p255z.DownloadApi;

/* renamed from: com.tv91.u.b.x0.r1 */
/* compiled from: PauseDownloadUseCase */
public final class C2568r1 extends ObservableUseCase<C2569a> {

    /* renamed from: i */
    private final DownloadApi f15138i;

    /* renamed from: j */
    private final C3058c f15139j;

    /* renamed from: com.tv91.u.b.x0.r1$a */
    /* compiled from: PauseDownloadUseCase */
    public interface C2569a {
        /* renamed from: a */
        void mo17367a(ErrorBundle cVar);

        /* renamed from: i */
        void mo17374i(DownloadRecord aVar);

        /* renamed from: m */
        void mo17379m();

        /* renamed from: t */
        void mo17389t();
    }

    public C2568r1(Schedulers bVar, DownloadApi cVar, C3058c cVar2) {
        super(bVar);
        this.f15138i = cVar;
        this.f15139j = cVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void m18699A() {
        for (C2569a m : mo17052d()) {
            m.mo17379m();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public void m18704u(DownloadRecord aVar) {
        for (C2569a i : mo17052d()) {
            i.mo17374i(aVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void mo17547t(DownloadRecord aVar) {
        C2511e0 e0Var;
        try {
            mo17057l(new C2513f0(this));
            mo17057l(new C2517g0(this, mo17546p(aVar)));
            e0Var = new C2511e0(this);
        } catch (Exception e) {
            mo17057l(new C2524h0(this, e));
            e0Var = new C2511e0(this);
        } catch (Throwable th) {
            mo17057l(new C2511e0(this));
            throw th;
        }
        mo17057l(e0Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void mo17549x(Exception exc) {
        m18706y(new ErrorBundle(exc));
    }

    /* renamed from: y */
    private void m18706y(ErrorBundle cVar) {
        for (C2569a a : mo17052d()) {
            a.mo17367a(cVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m18707z() {
        for (C2569a t : mo17052d()) {
            t.mo17389t();
        }
    }

    /* renamed from: o */
    public void mo17545o(DownloadRecord aVar) {
        mo17055j(new C2527i0(this, aVar));
    }

    /* renamed from: p */
    public DownloadRecord mo17546p(DownloadRecord aVar) throws Exception {
        this.f15138i.mo18684a(aVar);
        this.f15138i.mo18687d(aVar);
        return this.f15139j.mo18597e(aVar);
    }
}
