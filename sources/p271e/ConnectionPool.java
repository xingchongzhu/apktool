package p271e;

import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p271e.p272f0.C3310c;
import p271e.p272f0.p274f.RealConnection;
import p271e.p272f0.p274f.RouteDatabase;
import p271e.p272f0.p274f.StreamAllocation;
import p271e.p272f0.p274f.StreamAllocation.C3317a;
import p271e.p272f0.p278j.C3358g;

/* renamed from: e.j */
public final class ConnectionPool {

    /* renamed from: a */
    private static final Executor f18569a;

    /* renamed from: b */
    private final int f18570b;

    /* renamed from: c */
    private final long f18571c;

    /* renamed from: d */
    private final Runnable f18572d;

    /* renamed from: e */
    private final Deque<RealConnection> f18573e;

    /* renamed from: f */
    final RouteDatabase f18574f;

    /* renamed from: g */
    boolean f18575g;

    /* renamed from: e.j$a */
    /* compiled from: ConnectionPool */
    class C3362a implements Runnable {
        C3362a() {
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
            L_0x0000:
                e.j r0 = p271e.ConnectionPool.this
                long r1 = java.lang.System.nanoTime()
                long r0 = r0.mo19983a(r1)
                r2 = -1
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L_0x0011
                return
            L_0x0011:
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto L_0x0000
                r2 = 1000000(0xf4240, double:4.940656E-318)
                long r4 = r0 / r2
                long r2 = r2 * r4
                long r0 = r0 - r2
                e.j r2 = p271e.ConnectionPool.this
                monitor-enter(r2)
                e.j r3 = p271e.ConnectionPool.this     // Catch:{ InterruptedException -> 0x002b }
                int r1 = (int) r0     // Catch:{ InterruptedException -> 0x002b }
                r3.wait(r4, r1)     // Catch:{ InterruptedException -> 0x002b }
                goto L_0x002b
            L_0x0029:
                r0 = move-exception
                goto L_0x002d
            L_0x002b:
                monitor-exit(r2)     // Catch:{ all -> 0x0029 }
                goto L_0x0000
            L_0x002d:
                monitor-exit(r2)     // Catch:{ all -> 0x0029 }
                goto L_0x0030
            L_0x002f:
                throw r0
            L_0x0030:
                goto L_0x002f
            */
            throw new UnsupportedOperationException("Method not decompiled: p271e.ConnectionPool.C3362a.run():void");
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C3310c.m23043F("OkHttp ConnectionPool", true));
        f18569a = threadPoolExecutor;
    }

    public ConnectionPool() {
        this(5, 5, TimeUnit.MINUTES);
    }

    /* renamed from: e */
    private int m23534e(RealConnection cVar, long j) {
        List<Reference<StreamAllocation>> list = cVar.f18144n;
        int i = 0;
        while (i < list.size()) {
            Reference reference = (Reference) list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                C3317a aVar = (C3317a) reference;
                StringBuilder sb = new StringBuilder();
                sb.append("A connection to ");
                sb.append(cVar.mo19760p().mo19709a().mo19653l());
                sb.append(" was leaked. Did you forget to close a response body?");
                C3358g.m23494l().mo19943t(sb.toString(), aVar.f18173a);
                list.remove(i);
                cVar.f18141k = true;
                if (list.isEmpty()) {
                    cVar.f18145o = j - this.f18571c;
                    return 0;
                }
            }
        }
        return list.size();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public long mo19983a(long j) {
        synchronized (this) {
            RealConnection cVar = null;
            long j2 = Long.MIN_VALUE;
            int i = 0;
            int i2 = 0;
            for (RealConnection cVar2 : this.f18573e) {
                if (m23534e(cVar2, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long j3 = j - cVar2.f18145o;
                    if (j3 > j2) {
                        cVar = cVar2;
                        j2 = j3;
                    }
                }
            }
            long j4 = this.f18571c;
            if (j2 < j4) {
                if (i <= this.f18570b) {
                    if (i > 0) {
                        long j5 = j4 - j2;
                        return j5;
                    } else if (i2 > 0) {
                        return j4;
                    } else {
                        this.f18575g = false;
                        return -1;
                    }
                }
            }
            this.f18573e.remove(cVar);
            C3310c.m23053g(cVar.mo19761q());
            return 0;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo19984b(RealConnection cVar) {
        if (cVar.f18141k || this.f18570b == 0) {
            this.f18573e.remove(cVar);
            return true;
        }
        notifyAll();
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Socket mo19985c(Address aVar, StreamAllocation gVar) {
        for (RealConnection cVar : this.f18573e) {
            if (cVar.mo19756l(aVar, null) && cVar.mo19758n() && cVar != gVar.mo19779d()) {
                return gVar.mo19784m(cVar);
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public RealConnection mo19986d(Address aVar, StreamAllocation gVar, Route d0Var) {
        for (RealConnection cVar : this.f18573e) {
            if (cVar.mo19756l(aVar, d0Var)) {
                gVar.mo19776a(cVar, true);
                return cVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo19987f(RealConnection cVar) {
        if (!this.f18575g) {
            this.f18575g = true;
            f18569a.execute(this.f18572d);
        }
        this.f18573e.add(cVar);
    }

    public ConnectionPool(int i, long j, TimeUnit timeUnit) {
        this.f18572d = new C3362a();
        this.f18573e = new ArrayDeque();
        this.f18574f = new RouteDatabase();
        this.f18570b = i;
        this.f18571c = timeUnit.toNanos(j);
        if (j <= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("keepAliveDuration <= 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
