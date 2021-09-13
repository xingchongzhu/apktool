package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.snackbar.e */
class SnackbarManager {

    /* renamed from: a */
    private static SnackbarManager f13221a;

    /* renamed from: b */
    private final Object f13222b = new Object();

    /* renamed from: c */
    private final Handler f13223c = new Handler(Looper.getMainLooper(), new C2062a());

    /* renamed from: d */
    private C2064c f13224d;

    /* renamed from: e */
    private C2064c f13225e;

    /* renamed from: com.google.android.material.snackbar.e$a */
    /* compiled from: SnackbarManager */
    class C2062a implements Callback {
        C2062a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            SnackbarManager.this.mo16043c((C2064c) message.obj);
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.e$b */
    /* compiled from: SnackbarManager */
    interface C2063b {
        /* renamed from: a */
        void mo16047a(int i);
    }

    /* renamed from: com.google.android.material.snackbar.e$c */
    /* compiled from: SnackbarManager */
    private static class C2064c {

        /* renamed from: a */
        final WeakReference<C2063b> f13227a;

        /* renamed from: b */
        int f13228b;

        /* renamed from: c */
        boolean f13229c;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo16048a(C2063b bVar) {
            return bVar != null && this.f13227a.get() == bVar;
        }
    }

    private SnackbarManager() {
    }

    /* renamed from: a */
    private boolean m16247a(C2064c cVar, int i) {
        C2063b bVar = (C2063b) cVar.f13227a.get();
        if (bVar == null) {
            return false;
        }
        this.f13223c.removeCallbacksAndMessages(cVar);
        bVar.mo16047a(i);
        return true;
    }

    /* renamed from: b */
    static SnackbarManager m16248b() {
        if (f13221a == null) {
            f13221a = new SnackbarManager();
        }
        return f13221a;
    }

    /* renamed from: d */
    private boolean m16249d(C2063b bVar) {
        C2064c cVar = this.f13224d;
        return cVar != null && cVar.mo16048a(bVar);
    }

    /* renamed from: g */
    private void m16250g(C2064c cVar) {
        int i = cVar.f13228b;
        if (i != -2) {
            if (i <= 0) {
                i = i == -1 ? 1500 : 2750;
            }
            this.f13223c.removeCallbacksAndMessages(cVar);
            Handler handler = this.f13223c;
            handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), (long) i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo16043c(C2064c cVar) {
        synchronized (this.f13222b) {
            if (this.f13224d == cVar || this.f13225e == cVar) {
                m16247a(cVar, 2);
            }
        }
    }

    /* renamed from: e */
    public void mo16044e(C2063b bVar) {
        synchronized (this.f13222b) {
            if (m16249d(bVar)) {
                C2064c cVar = this.f13224d;
                if (!cVar.f13229c) {
                    cVar.f13229c = true;
                    this.f13223c.removeCallbacksAndMessages(cVar);
                }
            }
        }
    }

    /* renamed from: f */
    public void mo16045f(C2063b bVar) {
        synchronized (this.f13222b) {
            if (m16249d(bVar)) {
                C2064c cVar = this.f13224d;
                if (cVar.f13229c) {
                    cVar.f13229c = false;
                    m16250g(cVar);
                }
            }
        }
    }
}
