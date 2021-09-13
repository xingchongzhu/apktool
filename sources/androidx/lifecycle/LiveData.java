package androidx.lifecycle;

import androidx.lifecycle.Lifecycle.C0377b;
import androidx.lifecycle.Lifecycle.C0378c;
import java.util.Map.Entry;
import p010b.p018b.p019a.p020a.ArchTaskExecutor;
import p010b.p018b.p019a.p021b.SafeIterableMap;

public abstract class LiveData<T> {

    /* renamed from: a */
    static final Object f2599a = new Object();

    /* renamed from: b */
    final Object f2600b = new Object();

    /* renamed from: c */
    private SafeIterableMap<Observer<? super T>, C0370c> f2601c = new SafeIterableMap<>();

    /* renamed from: d */
    int f2602d = 0;

    /* renamed from: e */
    private boolean f2603e;

    /* renamed from: f */
    private volatile Object f2604f;

    /* renamed from: g */
    volatile Object f2605g;

    /* renamed from: h */
    private int f2606h;

    /* renamed from: i */
    private boolean f2607i;

    /* renamed from: j */
    private boolean f2608j;

    /* renamed from: k */
    private final Runnable f2609k;

    class LifecycleBoundObserver extends C0370c implements LifecycleEventObserver {

        /* renamed from: e */
        final LifecycleOwner f2610e;

        LifecycleBoundObserver(LifecycleOwner iVar, Observer<? super T> oVar) {
            super(oVar);
            this.f2610e = iVar;
        }

        /* renamed from: c */
        public void mo154c(LifecycleOwner iVar, C0377b bVar) {
            C0378c b = this.f2610e.mo132b().mo3000b();
            if (b == C0378c.DESTROYED) {
                LiveData.this.mo2976i(this.f2614a);
                return;
            }
            C0378c cVar = null;
            while (cVar != b) {
                mo2982f(mo2980i());
                cVar = b;
                b = this.f2610e.mo132b().mo3000b();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo2978g() {
            this.f2610e.mo132b().mo3001c(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public boolean mo2979h(LifecycleOwner iVar) {
            return this.f2610e == iVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public boolean mo2980i() {
            return this.f2610e.mo132b().mo3000b().mo3003a(C0378c.STARTED);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    class C0368a implements Runnable {
        C0368a() {
        }

        public void run() {
            Object obj;
            synchronized (LiveData.this.f2600b) {
                obj = LiveData.this.f2605g;
                LiveData.this.f2605g = LiveData.f2599a;
            }
            LiveData.this.mo2977j(obj);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$b */
    private class C0369b extends C0370c {
        C0369b(Observer<? super T> oVar) {
            super(oVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public boolean mo2980i() {
            return true;
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$c */
    private abstract class C0370c {

        /* renamed from: a */
        final Observer<? super T> f2614a;

        /* renamed from: b */
        boolean f2615b;

        /* renamed from: c */
        int f2616c = -1;

        C0370c(Observer<? super T> oVar) {
            this.f2614a = oVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo2982f(boolean z) {
            if (z != this.f2615b) {
                this.f2615b = z;
                LiveData.this.mo2970b(z ? 1 : -1);
                if (this.f2615b) {
                    LiveData.this.mo2971d(this);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo2978g() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public boolean mo2979h(LifecycleOwner iVar) {
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public abstract boolean mo2980i();
    }

    public LiveData() {
        Object obj = f2599a;
        this.f2605g = obj;
        this.f2609k = new C0368a();
        this.f2604f = obj;
        this.f2606h = -1;
    }

    /* renamed from: a */
    static void m2702a(String str) {
        if (!ArchTaskExecutor.m4313d().mo4264b()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot invoke ");
            sb.append(str);
            sb.append(" on a background thread");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: c */
    private void m2703c(C0370c cVar) {
        if (cVar.f2615b) {
            if (!cVar.mo2980i()) {
                cVar.mo2982f(false);
                return;
            }
            int i = cVar.f2616c;
            int i2 = this.f2606h;
            if (i < i2) {
                cVar.f2616c = i2;
                cVar.f2614a.mo2614a(this.f2604f);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2970b(int i) {
        int i2 = this.f2602d;
        this.f2602d = i + i2;
        if (!this.f2603e) {
            this.f2603e = true;
            while (true) {
                try {
                    int i3 = this.f2602d;
                    if (i2 != i3) {
                        boolean z = i2 == 0 && i3 > 0;
                        boolean z2 = i2 > 0 && i3 == 0;
                        if (z) {
                            mo2974g();
                        } else if (z2) {
                            mo2975h();
                        }
                        i2 = i3;
                    } else {
                        return;
                    }
                } finally {
                    this.f2603e = false;
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo2971d(C0370c cVar) {
        if (this.f2607i) {
            this.f2608j = true;
            return;
        }
        this.f2607i = true;
        do {
            this.f2608j = false;
            if (cVar == null) {
                C0538d d = this.f2601c.mo4275d();
                while (d.hasNext()) {
                    m2703c((C0370c) ((Entry) d.next()).getValue());
                    if (this.f2608j) {
                        break;
                    }
                }
            } else {
                m2703c(cVar);
                cVar = null;
            }
        } while (this.f2608j);
        this.f2607i = false;
    }

    /* renamed from: e */
    public void mo2972e(LifecycleOwner iVar, Observer<? super T> oVar) {
        m2702a("observe");
        if (iVar.mo132b().mo3000b() != C0378c.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(iVar, oVar);
            C0370c cVar = (C0370c) this.f2601c.mo4271g(oVar, lifecycleBoundObserver);
            if (cVar != null && !cVar.mo2979h(iVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (cVar == null) {
                iVar.mo132b().mo2999a(lifecycleBoundObserver);
            }
        }
    }

    /* renamed from: f */
    public void mo2973f(Observer<? super T> oVar) {
        m2702a("observeForever");
        C0369b bVar = new C0369b(oVar);
        C0370c cVar = (C0370c) this.f2601c.mo4271g(oVar, bVar);
        if (cVar instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (cVar == null) {
            bVar.mo2982f(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo2974g() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo2975h() {
    }

    /* renamed from: i */
    public void mo2976i(Observer<? super T> oVar) {
        m2702a("removeObserver");
        C0370c cVar = (C0370c) this.f2601c.mo4272h(oVar);
        if (cVar != null) {
            cVar.mo2978g();
            cVar.mo2982f(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo2977j(T t) {
        m2702a("setValue");
        this.f2606h++;
        this.f2604f = t;
        mo2971d(null);
    }
}
