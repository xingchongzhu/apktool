package p271e.p272f0.p274f;

import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import p271e.Address;
import p271e.Call;
import p271e.ConnectionPool;
import p271e.EventListener;
import p271e.Interceptor.C3373a;
import p271e.OkHttpClient;
import p271e.Route;
import p271e.p272f0.C3310c;
import p271e.p272f0.Internal;
import p271e.p272f0.p274f.RouteSelector.C3316a;
import p271e.p272f0.p275g.HttpCodec;

/* renamed from: e.f0.f.g */
public final class StreamAllocation {

    /* renamed from: a */
    public final Address f18159a;

    /* renamed from: b */
    private C3316a f18160b;

    /* renamed from: c */
    private Route f18161c;

    /* renamed from: d */
    private final ConnectionPool f18162d;

    /* renamed from: e */
    public final Call f18163e;

    /* renamed from: f */
    public final EventListener f18164f;

    /* renamed from: g */
    private final Object f18165g;

    /* renamed from: h */
    private final RouteSelector f18166h;

    /* renamed from: i */
    private int f18167i;

    /* renamed from: j */
    private RealConnection f18168j;

    /* renamed from: k */
    private boolean f18169k;

    /* renamed from: l */
    private boolean f18170l;

    /* renamed from: m */
    private boolean f18171m;

    /* renamed from: n */
    private HttpCodec f18172n;

    /* renamed from: e.f0.f.g$a */
    /* compiled from: StreamAllocation */
    public static final class C3317a extends WeakReference<StreamAllocation> {

        /* renamed from: a */
        public final Object f18173a;

        C3317a(StreamAllocation gVar, Object obj) {
            super(gVar);
            this.f18173a = obj;
        }
    }

    public StreamAllocation(ConnectionPool jVar, Address aVar, Call eVar, EventListener pVar, Object obj) {
        this.f18162d = jVar;
        this.f18159a = aVar;
        this.f18163e = eVar;
        this.f18164f = pVar;
        this.f18166h = new RouteSelector(aVar, m23143p(), eVar, pVar);
        this.f18165g = obj;
    }

    /* renamed from: e */
    private Socket m23138e(boolean z, boolean z2, boolean z3) {
        Socket socket;
        if (z3) {
            this.f18172n = null;
        }
        if (z2) {
            this.f18170l = true;
        }
        RealConnection cVar = this.f18168j;
        if (cVar == null) {
            return null;
        }
        if (z) {
            cVar.f18141k = true;
        }
        if (this.f18172n != null) {
            return null;
        }
        if (!this.f18170l && !cVar.f18141k) {
            return null;
        }
        m23141l(cVar);
        if (this.f18168j.f18144n.isEmpty()) {
            this.f18168j.f18145o = System.nanoTime();
            if (Internal.f18084a.mo19725e(this.f18162d, this.f18168j)) {
                socket = this.f18168j.mo19761q();
                this.f18168j = null;
                return socket;
            }
        }
        socket = null;
        this.f18168j = null;
        return socket;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0079 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ca  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p271e.p272f0.p274f.RealConnection m23139f(int r19, int r20, int r21, int r22, boolean r23) throws java.io.IOException {
        /*
            r18 = this;
            r1 = r18
            e.j r2 = r1.f18162d
            monitor-enter(r2)
            boolean r0 = r1.f18170l     // Catch:{ all -> 0x013b }
            if (r0 != 0) goto L_0x0133
            e.f0.g.c r0 = r1.f18172n     // Catch:{ all -> 0x013b }
            if (r0 != 0) goto L_0x012b
            boolean r0 = r1.f18171m     // Catch:{ all -> 0x013b }
            if (r0 != 0) goto L_0x0123
            e.f0.f.c r0 = r1.f18168j     // Catch:{ all -> 0x013b }
            java.net.Socket r3 = r18.m23142n()     // Catch:{ all -> 0x013b }
            e.f0.f.c r4 = r1.f18168j     // Catch:{ all -> 0x013b }
            r5 = 0
            if (r4 == 0) goto L_0x001e
            r0 = r5
            goto L_0x001f
        L_0x001e:
            r4 = r5
        L_0x001f:
            boolean r6 = r1.f18169k     // Catch:{ all -> 0x013b }
            if (r6 != 0) goto L_0x0024
            r0 = r5
        L_0x0024:
            r6 = 1
            r7 = 0
            if (r4 != 0) goto L_0x003c
            e.f0.a r8 = p271e.p272f0.Internal.f18084a     // Catch:{ all -> 0x013b }
            e.j r9 = r1.f18162d     // Catch:{ all -> 0x013b }
            e.a r10 = r1.f18159a     // Catch:{ all -> 0x013b }
            r8.mo19728h(r9, r10, r1, r5)     // Catch:{ all -> 0x013b }
            e.f0.f.c r8 = r1.f18168j     // Catch:{ all -> 0x013b }
            if (r8 == 0) goto L_0x0039
            r4 = r8
            r9 = 1
            r8 = r5
            goto L_0x003e
        L_0x0039:
            e.d0 r8 = r1.f18161c     // Catch:{ all -> 0x013b }
            goto L_0x003d
        L_0x003c:
            r8 = r5
        L_0x003d:
            r9 = 0
        L_0x003e:
            monitor-exit(r2)     // Catch:{ all -> 0x013b }
            p271e.p272f0.C3310c.m23053g(r3)
            if (r0 == 0) goto L_0x004b
            e.p r2 = r1.f18164f
            e.e r3 = r1.f18163e
            r2.mo20028h(r3, r0)
        L_0x004b:
            if (r9 == 0) goto L_0x0054
            e.p r0 = r1.f18164f
            e.e r2 = r1.f18163e
            r0.mo20027g(r2, r4)
        L_0x0054:
            if (r4 == 0) goto L_0x005f
            e.f0.f.c r0 = r1.f18168j
            e.d0 r0 = r0.mo19760p()
            r1.f18161c = r0
            return r4
        L_0x005f:
            if (r8 != 0) goto L_0x0075
            e.f0.f.f$a r0 = r1.f18160b
            if (r0 == 0) goto L_0x006b
            boolean r0 = r0.mo19774b()
            if (r0 != 0) goto L_0x0075
        L_0x006b:
            e.f0.f.f r0 = r1.f18166h
            e.f0.f.f$a r0 = r0.mo19772e()
            r1.f18160b = r0
            r0 = 1
            goto L_0x0076
        L_0x0075:
            r0 = 0
        L_0x0076:
            e.j r3 = r1.f18162d
            monitor-enter(r3)
            boolean r2 = r1.f18171m     // Catch:{ all -> 0x0120 }
            if (r2 != 0) goto L_0x0118
            if (r0 == 0) goto L_0x00a7
            e.f0.f.f$a r0 = r1.f18160b     // Catch:{ all -> 0x0120 }
            java.util.List r0 = r0.mo19773a()     // Catch:{ all -> 0x0120 }
            int r2 = r0.size()     // Catch:{ all -> 0x0120 }
            r10 = 0
        L_0x008a:
            if (r10 >= r2) goto L_0x00a7
            java.lang.Object r11 = r0.get(r10)     // Catch:{ all -> 0x0120 }
            e.d0 r11 = (p271e.Route) r11     // Catch:{ all -> 0x0120 }
            e.f0.a r12 = p271e.p272f0.Internal.f18084a     // Catch:{ all -> 0x0120 }
            e.j r13 = r1.f18162d     // Catch:{ all -> 0x0120 }
            e.a r14 = r1.f18159a     // Catch:{ all -> 0x0120 }
            r12.mo19728h(r13, r14, r1, r11)     // Catch:{ all -> 0x0120 }
            e.f0.f.c r12 = r1.f18168j     // Catch:{ all -> 0x0120 }
            if (r12 == 0) goto L_0x00a4
            r1.f18161c = r11     // Catch:{ all -> 0x0120 }
            r4 = r12
            r9 = 1
            goto L_0x00a7
        L_0x00a4:
            int r10 = r10 + 1
            goto L_0x008a
        L_0x00a7:
            if (r9 != 0) goto L_0x00bf
            if (r8 != 0) goto L_0x00b1
            e.f0.f.f$a r0 = r1.f18160b     // Catch:{ all -> 0x0120 }
            e.d0 r8 = r0.mo19775c()     // Catch:{ all -> 0x0120 }
        L_0x00b1:
            r1.f18161c = r8     // Catch:{ all -> 0x0120 }
            r1.f18167i = r7     // Catch:{ all -> 0x0120 }
            e.f0.f.c r4 = new e.f0.f.c     // Catch:{ all -> 0x0120 }
            e.j r0 = r1.f18162d     // Catch:{ all -> 0x0120 }
            r4.<init>(r0, r8)     // Catch:{ all -> 0x0120 }
            r1.mo19776a(r4, r7)     // Catch:{ all -> 0x0120 }
        L_0x00bf:
            monitor-exit(r3)     // Catch:{ all -> 0x0120 }
            if (r9 == 0) goto L_0x00ca
            e.p r0 = r1.f18164f
            e.e r2 = r1.f18163e
            r0.mo20027g(r2, r4)
            return r4
        L_0x00ca:
            e.e r0 = r1.f18163e
            e.p r2 = r1.f18164f
            r10 = r4
            r11 = r19
            r12 = r20
            r13 = r21
            r14 = r22
            r15 = r23
            r16 = r0
            r17 = r2
            r10.mo19754d(r11, r12, r13, r14, r15, r16, r17)
            e.f0.f.d r0 = r18.m23143p()
            e.d0 r2 = r4.mo19760p()
            r0.mo19764a(r2)
            e.j r2 = r1.f18162d
            monitor-enter(r2)
            r1.f18169k = r6     // Catch:{ all -> 0x0115 }
            e.f0.a r0 = p271e.p272f0.Internal.f18084a     // Catch:{ all -> 0x0115 }
            e.j r3 = r1.f18162d     // Catch:{ all -> 0x0115 }
            r0.mo19729i(r3, r4)     // Catch:{ all -> 0x0115 }
            boolean r0 = r4.mo19758n()     // Catch:{ all -> 0x0115 }
            if (r0 == 0) goto L_0x0109
            e.f0.a r0 = p271e.p272f0.Internal.f18084a     // Catch:{ all -> 0x0115 }
            e.j r3 = r1.f18162d     // Catch:{ all -> 0x0115 }
            e.a r4 = r1.f18159a     // Catch:{ all -> 0x0115 }
            java.net.Socket r5 = r0.mo19726f(r3, r4, r1)     // Catch:{ all -> 0x0115 }
            e.f0.f.c r4 = r1.f18168j     // Catch:{ all -> 0x0115 }
        L_0x0109:
            monitor-exit(r2)     // Catch:{ all -> 0x0115 }
            p271e.p272f0.C3310c.m23053g(r5)
            e.p r0 = r1.f18164f
            e.e r2 = r1.f18163e
            r0.mo20027g(r2, r4)
            return r4
        L_0x0115:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0115 }
            throw r0
        L_0x0118:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0120 }
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)     // Catch:{ all -> 0x0120 }
            throw r0     // Catch:{ all -> 0x0120 }
        L_0x0120:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0120 }
            throw r0
        L_0x0123:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x013b }
            java.lang.String r3 = "Canceled"
            r0.<init>(r3)     // Catch:{ all -> 0x013b }
            throw r0     // Catch:{ all -> 0x013b }
        L_0x012b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x013b }
            java.lang.String r3 = "codec != null"
            r0.<init>(r3)     // Catch:{ all -> 0x013b }
            throw r0     // Catch:{ all -> 0x013b }
        L_0x0133:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x013b }
            java.lang.String r3 = "released"
            r0.<init>(r3)     // Catch:{ all -> 0x013b }
            throw r0     // Catch:{ all -> 0x013b }
        L_0x013b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x013b }
            goto L_0x013f
        L_0x013e:
            throw r0
        L_0x013f:
            goto L_0x013e
        */
        throw new UnsupportedOperationException("Method not decompiled: p271e.p272f0.p274f.StreamAllocation.m23139f(int, int, int, int, boolean):e.f0.f.c");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        if (r0.mo19757m(r9) != false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        return r0;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p271e.p272f0.p274f.RealConnection m23140g(int r4, int r5, int r6, int r7, boolean r8, boolean r9) throws java.io.IOException {
        /*
            r3 = this;
        L_0x0000:
            e.f0.f.c r0 = r3.m23139f(r4, r5, r6, r7, r8)
            e.j r1 = r3.f18162d
            monitor-enter(r1)
            int r2 = r0.f18142l     // Catch:{ all -> 0x001f }
            if (r2 != 0) goto L_0x0013
            boolean r2 = r0.mo19758n()     // Catch:{ all -> 0x001f }
            if (r2 != 0) goto L_0x0013
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            return r0
        L_0x0013:
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            boolean r1 = r0.mo19757m(r9)
            if (r1 != 0) goto L_0x001e
            r3.mo19782j()
            goto L_0x0000
        L_0x001e:
            return r0
        L_0x001f:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            goto L_0x0023
        L_0x0022:
            throw r4
        L_0x0023:
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: p271e.p272f0.p274f.StreamAllocation.m23140g(int, int, int, int, boolean, boolean):e.f0.f.c");
    }

    /* renamed from: l */
    private void m23141l(RealConnection cVar) {
        int size = cVar.f18144n.size();
        for (int i = 0; i < size; i++) {
            if (((Reference) cVar.f18144n.get(i)).get() == this) {
                cVar.f18144n.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    /* renamed from: n */
    private Socket m23142n() {
        RealConnection cVar = this.f18168j;
        if (cVar == null || !cVar.f18141k) {
            return null;
        }
        return m23138e(false, false, true);
    }

    /* renamed from: p */
    private RouteDatabase m23143p() {
        return Internal.f18084a.mo19730j(this.f18162d);
    }

    /* renamed from: a */
    public void mo19776a(RealConnection cVar, boolean z) {
        if (this.f18168j == null) {
            this.f18168j = cVar;
            this.f18169k = z;
            cVar.f18144n.add(new C3317a(this, this.f18165g));
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public void mo19777b() {
        HttpCodec cVar;
        RealConnection cVar2;
        synchronized (this.f18162d) {
            this.f18171m = true;
            cVar = this.f18172n;
            cVar2 = this.f18168j;
        }
        if (cVar != null) {
            cVar.cancel();
        } else if (cVar2 != null) {
            cVar2.mo19753c();
        }
    }

    /* renamed from: c */
    public HttpCodec mo19778c() {
        HttpCodec cVar;
        synchronized (this.f18162d) {
            cVar = this.f18172n;
        }
        return cVar;
    }

    /* renamed from: d */
    public synchronized RealConnection mo19779d() {
        return this.f18168j;
    }

    /* renamed from: h */
    public boolean mo19780h() {
        if (this.f18161c == null) {
            C3316a aVar = this.f18160b;
            if ((aVar == null || !aVar.mo19774b()) && !this.f18166h.mo19771c()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: i */
    public HttpCodec mo19781i(OkHttpClient wVar, C3373a aVar, boolean z) {
        try {
            HttpCodec o = m23140g(aVar.mo19800a(), aVar.mo19801b(), aVar.mo19802c(), wVar.mo20119s(), wVar.mo20125y(), z).mo19759o(wVar, aVar, this);
            synchronized (this.f18162d) {
                this.f18172n = o;
            }
            return o;
        } catch (IOException e) {
            throw new RouteException(e);
        }
    }

    /* renamed from: j */
    public void mo19782j() {
        RealConnection cVar;
        Socket e;
        synchronized (this.f18162d) {
            cVar = this.f18168j;
            e = m23138e(true, false, false);
            if (this.f18168j != null) {
                cVar = null;
            }
        }
        C3310c.m23053g(e);
        if (cVar != null) {
            this.f18164f.mo20028h(this.f18163e, cVar);
        }
    }

    /* renamed from: k */
    public void mo19783k() {
        RealConnection cVar;
        Socket e;
        synchronized (this.f18162d) {
            cVar = this.f18168j;
            e = m23138e(false, true, false);
            if (this.f18168j != null) {
                cVar = null;
            }
        }
        C3310c.m23053g(e);
        if (cVar != null) {
            Internal.f18084a.mo19731k(this.f18163e, null);
            this.f18164f.mo20028h(this.f18163e, cVar);
            this.f18164f.mo20021a(this.f18163e);
        }
    }

    /* renamed from: m */
    public Socket mo19784m(RealConnection cVar) {
        if (this.f18172n == null && this.f18168j.f18144n.size() == 1) {
            Reference reference = (Reference) this.f18168j.f18144n.get(0);
            Socket e = m23138e(true, false, false);
            this.f18168j = cVar;
            cVar.f18144n.add(reference);
            return e;
        }
        throw new IllegalStateException();
    }

    /* renamed from: o */
    public Route mo19785o() {
        return this.f18161c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0051  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19786q(java.io.IOException r7) {
        /*
            r6 = this;
            e.j r0 = r6.f18162d
            monitor-enter(r0)
            boolean r1 = r7 instanceof p271e.p272f0.p277i.StreamResetException     // Catch:{ all -> 0x0065 }
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0023
            e.f0.i.n r7 = (p271e.p272f0.p277i.StreamResetException) r7     // Catch:{ all -> 0x0065 }
            e.f0.i.b r7 = r7.f18407a     // Catch:{ all -> 0x0065 }
            e.f0.i.b r1 = p271e.p272f0.p277i.ErrorCode.REFUSED_STREAM     // Catch:{ all -> 0x0065 }
            if (r7 != r1) goto L_0x001c
            int r7 = r6.f18167i     // Catch:{ all -> 0x0065 }
            int r7 = r7 + r4
            r6.f18167i = r7     // Catch:{ all -> 0x0065 }
            if (r7 <= r4) goto L_0x0046
            r6.f18161c = r3     // Catch:{ all -> 0x0065 }
            goto L_0x0044
        L_0x001c:
            e.f0.i.b r1 = p271e.p272f0.p277i.ErrorCode.CANCEL     // Catch:{ all -> 0x0065 }
            if (r7 == r1) goto L_0x0046
            r6.f18161c = r3     // Catch:{ all -> 0x0065 }
            goto L_0x0044
        L_0x0023:
            e.f0.f.c r1 = r6.f18168j     // Catch:{ all -> 0x0065 }
            if (r1 == 0) goto L_0x0046
            boolean r1 = r1.mo19758n()     // Catch:{ all -> 0x0065 }
            if (r1 == 0) goto L_0x0031
            boolean r1 = r7 instanceof p271e.p272f0.p277i.ConnectionShutdownException     // Catch:{ all -> 0x0065 }
            if (r1 == 0) goto L_0x0046
        L_0x0031:
            e.f0.f.c r1 = r6.f18168j     // Catch:{ all -> 0x0065 }
            int r1 = r1.f18142l     // Catch:{ all -> 0x0065 }
            if (r1 != 0) goto L_0x0044
            e.d0 r1 = r6.f18161c     // Catch:{ all -> 0x0065 }
            if (r1 == 0) goto L_0x0042
            if (r7 == 0) goto L_0x0042
            e.f0.f.f r5 = r6.f18166h     // Catch:{ all -> 0x0065 }
            r5.mo19770a(r1, r7)     // Catch:{ all -> 0x0065 }
        L_0x0042:
            r6.f18161c = r3     // Catch:{ all -> 0x0065 }
        L_0x0044:
            r7 = 1
            goto L_0x0047
        L_0x0046:
            r7 = 0
        L_0x0047:
            e.f0.f.c r1 = r6.f18168j     // Catch:{ all -> 0x0065 }
            java.net.Socket r7 = r6.m23138e(r7, r2, r4)     // Catch:{ all -> 0x0065 }
            e.f0.f.c r2 = r6.f18168j     // Catch:{ all -> 0x0065 }
            if (r2 != 0) goto L_0x0057
            boolean r2 = r6.f18169k     // Catch:{ all -> 0x0065 }
            if (r2 != 0) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r3 = r1
        L_0x0057:
            monitor-exit(r0)     // Catch:{ all -> 0x0065 }
            p271e.p272f0.C3310c.m23053g(r7)
            if (r3 == 0) goto L_0x0064
            e.p r7 = r6.f18164f
            e.e r0 = r6.f18163e
            r7.mo20028h(r0, r3)
        L_0x0064:
            return
        L_0x0065:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0065 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p271e.p272f0.p274f.StreamAllocation.mo19786q(java.io.IOException):void");
    }

    /* renamed from: r */
    public void mo19787r(boolean z, HttpCodec cVar, long j, IOException iOException) {
        RealConnection cVar2;
        Socket e;
        boolean z2;
        this.f18164f.mo20035p(this.f18163e, j);
        synchronized (this.f18162d) {
            if (cVar != null) {
                if (cVar == this.f18172n) {
                    if (!z) {
                        this.f18168j.f18142l++;
                    }
                    cVar2 = this.f18168j;
                    e = m23138e(z, false, true);
                    if (this.f18168j != null) {
                        cVar2 = null;
                    }
                    z2 = this.f18170l;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("expected ");
            sb.append(this.f18172n);
            sb.append(" but was ");
            sb.append(cVar);
            throw new IllegalStateException(sb.toString());
        }
        C3310c.m23053g(e);
        if (cVar2 != null) {
            this.f18164f.mo20028h(this.f18163e, cVar2);
        }
        if (iOException != null) {
            this.f18164f.mo20022b(this.f18163e, Internal.f18084a.mo19731k(this.f18163e, iOException));
        } else if (z2) {
            Internal.f18084a.mo19731k(this.f18163e, null);
            this.f18164f.mo20021a(this.f18163e);
        }
    }

    public String toString() {
        RealConnection d = mo19779d();
        return d != null ? d.toString() : this.f18159a.toString();
    }
}
