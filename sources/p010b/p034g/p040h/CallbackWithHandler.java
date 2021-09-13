package p010b.p034g.p040h;

import android.graphics.Typeface;
import android.os.Handler;
import p010b.p034g.p040h.FontsContractCompat.C0595c;

/* renamed from: b.g.h.a */
class CallbackWithHandler {

    /* renamed from: a */
    private final C0595c f4495a;

    /* renamed from: b */
    private final Handler f4496b;

    /* renamed from: b.g.h.a$a */
    /* compiled from: CallbackWithHandler */
    class C0585a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0595c f4497a;

        /* renamed from: b */
        final /* synthetic */ Typeface f4498b;

        C0585a(C0595c cVar, Typeface typeface) {
            this.f4497a = cVar;
            this.f4498b = typeface;
        }

        public void run() {
            this.f4497a.mo4849b(this.f4498b);
        }
    }

    /* renamed from: b.g.h.a$b */
    /* compiled from: CallbackWithHandler */
    class C0586b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0595c f4500a;

        /* renamed from: b */
        final /* synthetic */ int f4501b;

        C0586b(C0595c cVar, int i) {
            this.f4500a = cVar;
            this.f4501b = i;
        }

        public void run() {
            this.f4500a.mo4848a(this.f4501b);
        }
    }

    CallbackWithHandler(C0595c cVar, Handler handler) {
        this.f4495a = cVar;
        this.f4496b = handler;
    }

    /* renamed from: a */
    private void m5078a(int i) {
        this.f4496b.post(new C0586b(this.f4495a, i));
    }

    /* renamed from: c */
    private void m5079c(Typeface typeface) {
        this.f4496b.post(new C0585a(this.f4495a, typeface));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo4873b(C0592e eVar) {
        if (eVar.mo4892a()) {
            m5079c(eVar.f4524a);
        } else {
            m5078a(eVar.f4525b);
        }
    }
}
