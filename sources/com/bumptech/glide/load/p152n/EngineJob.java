package com.bumptech.glide.load.p152n;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.p152n.p155c0.GlideExecutor;
import com.bumptech.glide.p170r.ResourceCallback;
import com.bumptech.glide.p174t.C1638j;
import com.bumptech.glide.p174t.Executors;
import com.bumptech.glide.p174t.p175l.FactoryPools.C1646f;
import com.bumptech.glide.p174t.p175l.StateVerifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p010b.p034g.p042j.C0610e;

/* renamed from: com.bumptech.glide.load.n.l */
class EngineJob<R> implements C1477b<R>, C1646f {

    /* renamed from: a */
    private static final C1498c f10586a = new C1498c();

    /* renamed from: b */
    final C1500e f10587b;

    /* renamed from: c */
    private final StateVerifier f10588c;

    /* renamed from: d */
    private final C1501a f10589d;

    /* renamed from: e */
    private final C0610e<EngineJob<?>> f10590e;

    /* renamed from: f */
    private final C1498c f10591f;

    /* renamed from: g */
    private final EngineJobListener f10592g;

    /* renamed from: h */
    private final GlideExecutor f10593h;

    /* renamed from: i */
    private final GlideExecutor f10594i;

    /* renamed from: j */
    private final GlideExecutor f10595j;

    /* renamed from: k */
    private final GlideExecutor f10596k;

    /* renamed from: l */
    private final AtomicInteger f10597l;

    /* renamed from: m */
    private Key f10598m;

    /* renamed from: n */
    private boolean f10599n;

    /* renamed from: o */
    private boolean f10600o;

    /* renamed from: p */
    private boolean f10601p;

    /* renamed from: q */
    private boolean f10602q;

    /* renamed from: r */
    private Resource<?> f10603r;

    /* renamed from: s */
    DataSource f10604s;

    /* renamed from: t */
    private boolean f10605t;

    /* renamed from: u */
    GlideException f10606u;

    /* renamed from: v */
    private boolean f10607v;

    /* renamed from: w */
    EngineResource<?> f10608w;

    /* renamed from: x */
    private DecodeJob<R> f10609x;

    /* renamed from: y */
    private volatile boolean f10610y;

    /* renamed from: z */
    private boolean f10611z;

    /* renamed from: com.bumptech.glide.load.n.l$a */
    /* compiled from: EngineJob */
    private class C1496a implements Runnable {

        /* renamed from: a */
        private final ResourceCallback f10612a;

        C1496a(ResourceCallback gVar) {
            this.f10612a = gVar;
        }

        public void run() {
            synchronized (this.f10612a.mo9519g()) {
                synchronized (EngineJob.this) {
                    if (EngineJob.this.f10587b.mo9047c(this.f10612a)) {
                        EngineJob.this.mo9030f(this.f10612a);
                    }
                    EngineJob.this.mo9033i();
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.n.l$b */
    /* compiled from: EngineJob */
    private class C1497b implements Runnable {

        /* renamed from: a */
        private final ResourceCallback f10614a;

        C1497b(ResourceCallback gVar) {
            this.f10614a = gVar;
        }

        public void run() {
            synchronized (this.f10614a.mo9519g()) {
                synchronized (EngineJob.this) {
                    if (EngineJob.this.f10587b.mo9047c(this.f10614a)) {
                        EngineJob.this.f10608w.mo9057b();
                        EngineJob.this.mo9031g(this.f10614a);
                        EngineJob.this.mo9039r(this.f10614a);
                    }
                    EngineJob.this.mo9033i();
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.n.l$c */
    /* compiled from: EngineJob */
    static class C1498c {
        C1498c() {
        }

        /* renamed from: a */
        public <R> EngineResource<R> mo9043a(Resource<R> vVar, boolean z, Key gVar, C1501a aVar) {
            EngineResource pVar = new EngineResource(vVar, z, true, gVar, aVar);
            return pVar;
        }
    }

    /* renamed from: com.bumptech.glide.load.n.l$d */
    /* compiled from: EngineJob */
    static final class C1499d {

        /* renamed from: a */
        final ResourceCallback f10616a;

        /* renamed from: b */
        final Executor f10617b;

        C1499d(ResourceCallback gVar, Executor executor) {
            this.f10616a = gVar;
            this.f10617b = executor;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1499d)) {
                return false;
            }
            return this.f10616a.equals(((C1499d) obj).f10616a);
        }

        public int hashCode() {
            return this.f10616a.hashCode();
        }
    }

    /* renamed from: com.bumptech.glide.load.n.l$e */
    /* compiled from: EngineJob */
    static final class C1500e implements Iterable<C1499d> {

        /* renamed from: a */
        private final List<C1499d> f10618a;

        C1500e() {
            this(new ArrayList(2));
        }

        /* renamed from: e */
        private static C1499d m12957e(ResourceCallback gVar) {
            return new C1499d(gVar, Executors.m14062a());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo9046b(ResourceCallback gVar, Executor executor) {
            this.f10618a.add(new C1499d(gVar, executor));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public boolean mo9047c(ResourceCallback gVar) {
            return this.f10618a.contains(m12957e(gVar));
        }

        /* access modifiers changed from: 0000 */
        public void clear() {
            this.f10618a.clear();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public C1500e mo9049d() {
            return new C1500e(new ArrayList(this.f10618a));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo9050f(ResourceCallback gVar) {
            this.f10618a.remove(m12957e(gVar));
        }

        /* access modifiers changed from: 0000 */
        public boolean isEmpty() {
            return this.f10618a.isEmpty();
        }

        public Iterator<C1499d> iterator() {
            return this.f10618a.iterator();
        }

        /* access modifiers changed from: 0000 */
        public int size() {
            return this.f10618a.size();
        }

        C1500e(List<C1499d> list) {
            this.f10618a = list;
        }
    }

    EngineJob(GlideExecutor aVar, GlideExecutor aVar2, GlideExecutor aVar3, GlideExecutor aVar4, EngineJobListener mVar, C1501a aVar5, C0610e<EngineJob<?>> eVar) {
        this(aVar, aVar2, aVar3, aVar4, mVar, aVar5, eVar, f10586a);
    }

    /* renamed from: j */
    private GlideExecutor m12937j() {
        if (this.f10600o) {
            return this.f10595j;
        }
        return this.f10601p ? this.f10596k : this.f10594i;
    }

    /* renamed from: m */
    private boolean m12938m() {
        return this.f10607v || this.f10605t || this.f10610y;
    }

    /* renamed from: q */
    private synchronized void m12939q() {
        if (this.f10598m != null) {
            this.f10587b.clear();
            this.f10598m = null;
            this.f10608w = null;
            this.f10603r = null;
            this.f10607v = false;
            this.f10610y = false;
            this.f10605t = false;
            this.f10611z = false;
            this.f10609x.mo8999w(false);
            this.f10609x = null;
            this.f10606u = null;
            this.f10604s = null;
            this.f10590e.mo4945a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public void mo9000a(GlideException qVar) {
        synchronized (this) {
            this.f10606u = qVar;
        }
        mo9036n();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized void mo9029b(ResourceCallback gVar, Executor executor) {
        this.f10588c.mo9588c();
        this.f10587b.mo9046b(gVar, executor);
        boolean z = true;
        if (this.f10605t) {
            mo9034k(1);
            executor.execute(new C1497b(gVar));
        } else if (this.f10607v) {
            mo9034k(1);
            executor.execute(new C1496a(gVar));
        } else {
            if (this.f10610y) {
                z = false;
            }
            C1638j.m14078a(z, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    /* renamed from: c */
    public void mo9001c(Resource<R> vVar, DataSource aVar, boolean z) {
        synchronized (this) {
            this.f10603r = vVar;
            this.f10604s = aVar;
            this.f10611z = z;
        }
        mo9037o();
    }

    /* renamed from: d */
    public StateVerifier mo8940d() {
        return this.f10588c;
    }

    /* renamed from: e */
    public void mo9002e(DecodeJob<?> hVar) {
        m12937j().execute(hVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo9030f(ResourceCallback gVar) {
        try {
            gVar.mo9517a(this.f10606u);
        } catch (Throwable th) {
            throw new CallbackException(th);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo9031g(ResourceCallback gVar) {
        try {
            gVar.mo9518c(this.f10608w, this.f10604s, this.f10611z);
        } catch (Throwable th) {
            throw new CallbackException(th);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo9032h() {
        if (!m12938m()) {
            this.f10610y = true;
            this.f10609x.mo8994e();
            this.f10592g.mo9020c(this, this.f10598m);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo9033i() {
        EngineResource<?> pVar;
        synchronized (this) {
            this.f10588c.mo9588c();
            C1638j.m14078a(m12938m(), "Not yet complete!");
            int decrementAndGet = this.f10597l.decrementAndGet();
            C1638j.m14078a(decrementAndGet >= 0, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                pVar = this.f10608w;
                m12939q();
            } else {
                pVar = null;
            }
        }
        if (pVar != null) {
            pVar.mo9063h();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public synchronized void mo9034k(int i) {
        C1638j.m14078a(m12938m(), "Not yet complete!");
        if (this.f10597l.getAndAdd(i) == 0) {
            EngineResource<?> pVar = this.f10608w;
            if (pVar != null) {
                pVar.mo9057b();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public synchronized EngineJob<R> mo9035l(Key gVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f10598m = gVar;
        this.f10599n = z;
        this.f10600o = z2;
        this.f10601p = z3;
        this.f10602q = z4;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r4.f10592g.mo9019b(r4, r1, null);
        r0 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r0.hasNext() == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        r1 = (com.bumptech.glide.load.p152n.EngineJob.C1499d) r0.next();
        r1.f10617b.execute(new com.bumptech.glide.load.p152n.EngineJob.C1496a(r4, r1.f10616a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        mo9033i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        return;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9036n() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.bumptech.glide.t.l.c r0 = r4.f10588c     // Catch:{ all -> 0x0066 }
            r0.mo9588c()     // Catch:{ all -> 0x0066 }
            boolean r0 = r4.f10610y     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x000f
            r4.m12939q()     // Catch:{ all -> 0x0066 }
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            return
        L_0x000f:
            com.bumptech.glide.load.n.l$e r0 = r4.f10587b     // Catch:{ all -> 0x0066 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x005e
            boolean r0 = r4.f10607v     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x0056
            r0 = 1
            r4.f10607v = r0     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.g r1 = r4.f10598m     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.n.l$e r2 = r4.f10587b     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.n.l$e r2 = r2.mo9049d()     // Catch:{ all -> 0x0066 }
            int r3 = r2.size()     // Catch:{ all -> 0x0066 }
            int r3 = r3 + r0
            r4.mo9034k(r3)     // Catch:{ all -> 0x0066 }
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.n.m r0 = r4.f10592g
            r3 = 0
            r0.mo9019b(r4, r1, r3)
            java.util.Iterator r0 = r2.iterator()
        L_0x0039:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0052
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.load.n.l$d r1 = (com.bumptech.glide.load.p152n.EngineJob.C1499d) r1
            java.util.concurrent.Executor r2 = r1.f10617b
            com.bumptech.glide.load.n.l$a r3 = new com.bumptech.glide.load.n.l$a
            com.bumptech.glide.r.g r1 = r1.f10616a
            r3.<init>(r1)
            r2.execute(r3)
            goto L_0x0039
        L_0x0052:
            r4.mo9033i()
            return
        L_0x0056:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "Already failed once"
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x005e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "Received an exception without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            goto L_0x006a
        L_0x0069:
            throw r0
        L_0x006a:
            goto L_0x0069
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p152n.EngineJob.mo9036n():void");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        r5.f10592g.mo9019b(r5, r0, r2);
        r0 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (r0.hasNext() == false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
        r1 = (com.bumptech.glide.load.p152n.EngineJob.C1499d) r0.next();
        r1.f10617b.execute(new com.bumptech.glide.load.p152n.EngineJob.C1497b(r5, r1.f10616a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
        mo9033i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006b, code lost:
        return;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9037o() {
        /*
            r5 = this;
            monitor-enter(r5)
            com.bumptech.glide.t.l.c r0 = r5.f10588c     // Catch:{ all -> 0x007c }
            r0.mo9588c()     // Catch:{ all -> 0x007c }
            boolean r0 = r5.f10610y     // Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x0014
            com.bumptech.glide.load.n.v<?> r0 = r5.f10603r     // Catch:{ all -> 0x007c }
            r0.mo9061f()     // Catch:{ all -> 0x007c }
            r5.m12939q()     // Catch:{ all -> 0x007c }
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            return
        L_0x0014:
            com.bumptech.glide.load.n.l$e r0 = r5.f10587b     // Catch:{ all -> 0x007c }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x007c }
            if (r0 != 0) goto L_0x0074
            boolean r0 = r5.f10605t     // Catch:{ all -> 0x007c }
            if (r0 != 0) goto L_0x006c
            com.bumptech.glide.load.n.l$c r0 = r5.f10591f     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.n.v<?> r1 = r5.f10603r     // Catch:{ all -> 0x007c }
            boolean r2 = r5.f10599n     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.g r3 = r5.f10598m     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.n.p$a r4 = r5.f10589d     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.n.p r0 = r0.mo9043a(r1, r2, r3, r4)     // Catch:{ all -> 0x007c }
            r5.f10608w = r0     // Catch:{ all -> 0x007c }
            r0 = 1
            r5.f10605t = r0     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.n.l$e r1 = r5.f10587b     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.n.l$e r1 = r1.mo9049d()     // Catch:{ all -> 0x007c }
            int r2 = r1.size()     // Catch:{ all -> 0x007c }
            int r2 = r2 + r0
            r5.mo9034k(r2)     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.g r0 = r5.f10598m     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.n.p<?> r2 = r5.f10608w     // Catch:{ all -> 0x007c }
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.n.m r3 = r5.f10592g
            r3.mo9019b(r5, r0, r2)
            java.util.Iterator r0 = r1.iterator()
        L_0x004f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0068
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.load.n.l$d r1 = (com.bumptech.glide.load.p152n.EngineJob.C1499d) r1
            java.util.concurrent.Executor r2 = r1.f10617b
            com.bumptech.glide.load.n.l$b r3 = new com.bumptech.glide.load.n.l$b
            com.bumptech.glide.r.g r1 = r1.f10616a
            r3.<init>(r1)
            r2.execute(r3)
            goto L_0x004f
        L_0x0068:
            r5.mo9033i()
            return
        L_0x006c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "Already have resource"
            r0.<init>(r1)     // Catch:{ all -> 0x007c }
            throw r0     // Catch:{ all -> 0x007c }
        L_0x0074:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "Received a resource without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x007c }
            throw r0     // Catch:{ all -> 0x007c }
        L_0x007c:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            goto L_0x0080
        L_0x007f:
            throw r0
        L_0x0080:
            goto L_0x007f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p152n.EngineJob.mo9037o():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public boolean mo9038p() {
        return this.f10602q;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public synchronized void mo9039r(ResourceCallback gVar) {
        boolean z;
        this.f10588c.mo9588c();
        this.f10587b.mo9050f(gVar);
        if (this.f10587b.isEmpty()) {
            mo9032h();
            if (!this.f10605t) {
                if (!this.f10607v) {
                    z = false;
                    if (z && this.f10597l.get() == 0) {
                        m12939q();
                    }
                }
            }
            z = true;
            m12939q();
        }
    }

    /* renamed from: s */
    public synchronized void mo9040s(DecodeJob<R> hVar) {
        this.f10609x = hVar;
        (hVar.mo8992C() ? this.f10593h : m12937j()).execute(hVar);
    }

    EngineJob(GlideExecutor aVar, GlideExecutor aVar2, GlideExecutor aVar3, GlideExecutor aVar4, EngineJobListener mVar, C1501a aVar5, C0610e<EngineJob<?>> eVar, C1498c cVar) {
        this.f10587b = new C1500e();
        this.f10588c = StateVerifier.m14126a();
        this.f10597l = new AtomicInteger();
        this.f10593h = aVar;
        this.f10594i = aVar2;
        this.f10595j = aVar3;
        this.f10596k = aVar4;
        this.f10592g = mVar;
        this.f10589d = aVar5;
        this.f10590e = eVar;
        this.f10591f = cVar;
    }
}
