package com.bumptech.glide.load.p152n;

import android.os.Process;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.p174t.C1638j;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bumptech.glide.load.n.a */
final class ActiveResources {

    /* renamed from: a */
    private final boolean f10353a;

    /* renamed from: b */
    private final Executor f10354b;

    /* renamed from: c */
    final Map<Key, C1444d> f10355c;

    /* renamed from: d */
    private final ReferenceQueue<EngineResource<?>> f10356d;

    /* renamed from: e */
    private C1501a f10357e;

    /* renamed from: f */
    private volatile boolean f10358f;

    /* renamed from: g */
    private volatile C1443c f10359g;

    /* renamed from: com.bumptech.glide.load.n.a$a */
    /* compiled from: ActiveResources */
    class C1440a implements ThreadFactory {

        /* renamed from: com.bumptech.glide.load.n.a$a$a */
        /* compiled from: ActiveResources */
        class C1441a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Runnable f10360a;

            C1441a(Runnable runnable) {
                this.f10360a = runnable;
            }

            public void run() {
                Process.setThreadPriority(10);
                this.f10360a.run();
            }
        }

        C1440a() {
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(new C1441a(runnable), "glide-active-resources");
        }
    }

    /* renamed from: com.bumptech.glide.load.n.a$b */
    /* compiled from: ActiveResources */
    class C1442b implements Runnable {
        C1442b() {
        }

        public void run() {
            ActiveResources.this.mo8844b();
        }
    }

    /* renamed from: com.bumptech.glide.load.n.a$c */
    /* compiled from: ActiveResources */
    interface C1443c {
        /* renamed from: a */
        void mo8852a();
    }

    /* renamed from: com.bumptech.glide.load.n.a$d */
    /* compiled from: ActiveResources */
    static final class C1444d extends WeakReference<EngineResource<?>> {

        /* renamed from: a */
        final Key f10363a;

        /* renamed from: b */
        final boolean f10364b;

        /* renamed from: c */
        Resource<?> f10365c;

        C1444d(Key gVar, EngineResource<?> pVar, ReferenceQueue<? super EngineResource<?>> referenceQueue, boolean z) {
            super(pVar, referenceQueue);
            this.f10363a = (Key) C1638j.m14081d(gVar);
            this.f10365c = (!pVar.mo9062g() || !z) ? null : (Resource) C1638j.m14081d(pVar.mo9059d());
            this.f10364b = pVar.mo9062g();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo8853a() {
            this.f10365c = null;
            clear();
        }
    }

    ActiveResources(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new C1440a()));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo8843a(Key gVar, EngineResource<?> pVar) {
        C1444d dVar = (C1444d) this.f10355c.put(gVar, new C1444d(gVar, pVar, this.f10356d, this.f10353a));
        if (dVar != null) {
            dVar.mo8853a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo8844b() {
        while (!this.f10358f) {
            try {
                mo8845c((C1444d) this.f10356d.remove());
                C1443c cVar = this.f10359g;
                if (cVar != null) {
                    cVar.mo8852a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo8845c(C1444d dVar) {
        synchronized (this) {
            this.f10355c.remove(dVar.f10363a);
            if (dVar.f10364b) {
                Resource<?> vVar = dVar.f10365c;
                if (vVar != null) {
                    EngineResource pVar = new EngineResource(vVar, true, false, dVar.f10363a, this.f10357e);
                    this.f10357e.mo9021d(dVar.f10363a, pVar);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public synchronized void mo8846d(Key gVar) {
        C1444d dVar = (C1444d) this.f10355c.remove(gVar);
        if (dVar != null) {
            dVar.mo8853a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        return r0;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.bumptech.glide.load.p152n.EngineResource<?> mo8847e(com.bumptech.glide.load.Key r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map<com.bumptech.glide.load.g, com.bumptech.glide.load.n.a$d> r0 = r1.f10355c     // Catch:{ all -> 0x001b }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x001b }
            com.bumptech.glide.load.n.a$d r2 = (com.bumptech.glide.load.p152n.ActiveResources.C1444d) r2     // Catch:{ all -> 0x001b }
            if (r2 != 0) goto L_0x000e
            r2 = 0
            monitor-exit(r1)
            return r2
        L_0x000e:
            java.lang.Object r0 = r2.get()     // Catch:{ all -> 0x001b }
            com.bumptech.glide.load.n.p r0 = (com.bumptech.glide.load.p152n.EngineResource) r0     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.mo8845c(r2)     // Catch:{ all -> 0x001b }
        L_0x0019:
            monitor-exit(r1)
            return r0
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p152n.ActiveResources.mo8847e(com.bumptech.glide.load.g):com.bumptech.glide.load.n.p");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo8848f(C1501a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f10357e = aVar;
            }
        }
    }

    ActiveResources(boolean z, Executor executor) {
        this.f10355c = new HashMap();
        this.f10356d = new ReferenceQueue<>();
        this.f10353a = z;
        this.f10354b = executor;
        executor.execute(new C1442b());
    }
}
