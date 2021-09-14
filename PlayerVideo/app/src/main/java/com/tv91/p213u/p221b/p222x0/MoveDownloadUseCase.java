package com.tv91.p213u.p221b.p222x0;

import android.os.ParcelFileDescriptor;
import com.tv91.model.DownloadRecord;
import com.tv91.p207q.p209b.ObservableUseCase;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p212t.Schedulers;
import com.tv91.p253y.C3058c;
import com.tv91.p255z.DownloadApi;

import androidx.core.util.Consumer;


/* renamed from: com.tv91.u.b.x0.o1 */
public final class MoveDownloadUseCase extends ObservableUseCase<MoveDownloadUseCase.C2560e> {

    /* renamed from: i */
    private final DownloadApi f15118i;

    /* renamed from: j */
    private final C3058c f15119j;

    /* renamed from: com.tv91.u.b.x0.o1$a */
    /* compiled from: MoveDownloadUseCase */
    class C2556a implements C2560e {

        /* renamed from: a */
        final /* synthetic */ Runnable f15120a;

        C2556a(Runnable runnable) {
            this.f15120a = runnable;
        }

        /* renamed from: a */
        public void mo17536a() {
            this.f15120a.run();
        }

        /* renamed from: b */
        public /* synthetic */ void mo17537b(DownloadRecord aVar) {
            C2563p1.m18695d(this, aVar);
        }

        /* renamed from: c */
        public /* synthetic */ void mo17538c() {
            C2563p1.m18693b(this);
        }

        /* renamed from: d */
        public /* synthetic */ void mo17539d(ErrorBundle cVar) {
            C2563p1.m18692a(this, cVar);
        }
    }

    /* renamed from: com.tv91.u.b.x0.o1$b */
    /* compiled from: MoveDownloadUseCase */
    class C2557b implements C2560e {

        /* renamed from: a */
        final /* synthetic */ Runnable f15122a;

        C2557b(Runnable runnable) {
            this.f15122a = runnable;
        }

        /* renamed from: a */
        public /* synthetic */ void mo17536a() {
            C2563p1.m18694c(this);
        }

        /* renamed from: b */
        public /* synthetic */ void mo17537b(DownloadRecord aVar) {
            C2563p1.m18695d(this, aVar);
        }

        /* renamed from: c */
        public void mo17538c() {
            this.f15122a.run();
        }

        /* renamed from: d */
        public /* synthetic */ void mo17539d(ErrorBundle cVar) {
            C2563p1.m18692a(this, cVar);
        }
    }

    /* renamed from: com.tv91.u.b.x0.o1$c */
    /* compiled from: MoveDownloadUseCase */
    class C2558c implements C2560e {

        /* renamed from: a */
        final /* synthetic */ Consumer f15124a;

        C2558c(Consumer aVar) {
            this.f15124a = aVar;
        }

        /* renamed from: a */
        public /* synthetic */ void mo17536a() {
            C2563p1.m18694c(this);
        }

        /* renamed from: b */
        public void mo17537b(DownloadRecord aVar) {
            this.f15124a.accept(aVar);
        }

        /* renamed from: c */
        public /* synthetic */ void mo17538c() {
            C2563p1.m18693b(this);
        }

        /* renamed from: d */
        public /* synthetic */ void mo17539d(ErrorBundle cVar) {
            C2563p1.m18692a(this, cVar);
        }
    }

    /* renamed from: com.tv91.u.b.x0.o1$d */
    /* compiled from: MoveDownloadUseCase */
    class C2559d implements C2560e {

        /* renamed from: a */
        final /* synthetic */ Consumer f15126a;

        C2559d(Consumer aVar) {
            this.f15126a = aVar;
        }

        /* renamed from: a */
        public /* synthetic */ void mo17536a() {
            C2563p1.m18694c(this);
        }

        /* renamed from: b */
        public /* synthetic */ void mo17537b(DownloadRecord aVar) {
            C2563p1.m18695d(this, aVar);
        }

        /* renamed from: c */
        public /* synthetic */ void mo17538c() {
            C2563p1.m18693b(this);
        }

        /* renamed from: d */
        public void mo17539d(ErrorBundle cVar) {
            this.f15126a.accept(cVar);
        }
    }

    /* renamed from: com.tv91.u.b.x0.o1$e */
    /* compiled from: MoveDownloadUseCase */
    public interface C2560e {
        /* renamed from: a */
        void mo17536a();

        /* renamed from: b */
        void mo17537b(DownloadRecord aVar);

        /* renamed from: c */
        void mo17538c();

        /* renamed from: d */
        void mo17539d(ErrorBundle cVar);
    }

    public MoveDownloadUseCase(Schedulers bVar, DownloadApi cVar, C3058c cVar2) {
        super(bVar);
        this.f15118i = cVar;
        this.f15119j = cVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void m18653A() {
        for (C2560e a : mo17052d()) {
            a.mo17536a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public void m18657t(DownloadRecord aVar) {
        for (C2560e b : mo17052d()) {
            b.mo17537b(aVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void mo17533s(DownloadRecord aVar, ParcelFileDescriptor parcelFileDescriptor, String str) {
        C2508d0 d0Var;
        try {
            mo17057l(new C2502b0(this));
            mo17057l(new C2505c0(this, mo17532p(aVar, parcelFileDescriptor, str)));
            d0Var = new C2508d0(this);
        } catch (Exception e) {
            mo17057l(new C2589z(this, e));
            d0Var = new C2508d0(this);
        } catch (Throwable th) {
            mo17057l(new C2508d0(this));
            throw th;
        }
        mo17057l(d0Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void mo17535w(Exception exc) {
        m18660y(new ErrorBundle(exc));
    }

    /* renamed from: y */
    private void m18660y(ErrorBundle cVar) {
        for (C2560e d : mo17052d()) {
            d.mo17539d(cVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m18661z() {
        for (C2560e c : mo17052d()) {
            c.mo17538c();
        }
        mo17051a();
    }

    /* renamed from: C */
    public MoveDownloadUseCase mo17527C(Consumer<ErrorBundle> aVar) {
        mo17058m(new C2559d(aVar));
        return this;
    }

    /* renamed from: D */
    public MoveDownloadUseCase mo17528D(Runnable runnable) {
        mo17058m(new C2557b(runnable));
        return this;
    }

    /* renamed from: E */
    public MoveDownloadUseCase mo17529E(Runnable runnable) {
        mo17058m(new C2556a(runnable));
        return this;
    }

    /* renamed from: F */
    public MoveDownloadUseCase mo17530F(Consumer<DownloadRecord> aVar) {
        mo17058m(new C2558c(aVar));
        return this;
    }

    /* renamed from: o */
    public void mo17531o(DownloadRecord aVar, ParcelFileDescriptor parcelFileDescriptor, String str) {
        mo17055j(new C2499a0(this, aVar, parcelFileDescriptor, str));
    }

    /* renamed from: p */
    public DownloadRecord mo17532p(DownloadRecord aVar, ParcelFileDescriptor parcelFileDescriptor, String str) throws Exception {
        this.f15118i.mo18685b(aVar, parcelFileDescriptor.getFileDescriptor(), str);
        parcelFileDescriptor.close();
        return this.f15119j.mo18598f(aVar, str);
    }
}
