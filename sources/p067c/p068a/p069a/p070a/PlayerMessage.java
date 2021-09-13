package p067c.p068a.p069a.p070a;

import android.os.Looper;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Clock;

/* renamed from: c.a.a.a.m1 */
public final class PlayerMessage {

    /* renamed from: a */
    private final C1183b f8320a;

    /* renamed from: b */
    private final C1182a f8321b;

    /* renamed from: c */
    private final Clock f8322c;

    /* renamed from: d */
    private final Timeline f8323d;

    /* renamed from: e */
    private int f8324e;

    /* renamed from: f */
    private Object f8325f;

    /* renamed from: g */
    private Looper f8326g;

    /* renamed from: h */
    private int f8327h;

    /* renamed from: i */
    private long f8328i = -9223372036854775807L;

    /* renamed from: j */
    private boolean f8329j = true;

    /* renamed from: k */
    private boolean f8330k;

    /* renamed from: l */
    private boolean f8331l;

    /* renamed from: m */
    private boolean f8332m;

    /* renamed from: n */
    private boolean f8333n;

    /* renamed from: c.a.a.a.m1$a */
    /* compiled from: PlayerMessage */
    public interface C1182a {
        /* renamed from: a */
        void mo7357a(PlayerMessage m1Var);
    }

    /* renamed from: c.a.a.a.m1$b */
    /* compiled from: PlayerMessage */
    public interface C1183b {
        /* renamed from: m */
        void mo5791m(int i, Object obj) throws ExoPlaybackException;
    }

    public PlayerMessage(C1182a aVar, C1183b bVar, Timeline x1Var, int i, Clock gVar, Looper looper) {
        this.f8321b = aVar;
        this.f8320a = bVar;
        this.f8323d = x1Var;
        this.f8326g = looper;
        this.f8322c = gVar;
        this.f8327h = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b A[SYNTHETIC, Splitter:B:16:0x003b] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo7343a(long r7) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f8330k     // Catch:{ all -> 0x0043 }
            p067c.p068a.p069a.p070a.p111m2.Assertions.m10154f(r0)     // Catch:{ all -> 0x0043 }
            android.os.Looper r0 = r6.f8326g     // Catch:{ all -> 0x0043 }
            java.lang.Thread r0 = r0.getThread()     // Catch:{ all -> 0x0043 }
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0043 }
            if (r0 == r1) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            p067c.p068a.p069a.p070a.p111m2.Assertions.m10154f(r0)     // Catch:{ all -> 0x0043 }
            c.a.a.a.m2.g r0 = r6.f8322c     // Catch:{ all -> 0x0043 }
            long r0 = r0.mo7425c()     // Catch:{ all -> 0x0043 }
            long r0 = r0 + r7
        L_0x001f:
            boolean r2 = r6.f8332m     // Catch:{ all -> 0x0043 }
            if (r2 != 0) goto L_0x0035
            r3 = 0
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0035
            r6.wait(r7)     // Catch:{ all -> 0x0043 }
            c.a.a.a.m2.g r7 = r6.f8322c     // Catch:{ all -> 0x0043 }
            long r7 = r7.mo7425c()     // Catch:{ all -> 0x0043 }
            long r7 = r0 - r7
            goto L_0x001f
        L_0x0035:
            if (r2 == 0) goto L_0x003b
            boolean r7 = r6.f8331l     // Catch:{ all -> 0x0043 }
            monitor-exit(r6)
            return r7
        L_0x003b:
            java.util.concurrent.TimeoutException r7 = new java.util.concurrent.TimeoutException     // Catch:{ all -> 0x0043 }
            java.lang.String r8 = "Message delivery timed out."
            r7.<init>(r8)     // Catch:{ all -> 0x0043 }
            throw r7     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r7 = move-exception
            monitor-exit(r6)
            goto L_0x0047
        L_0x0046:
            throw r7
        L_0x0047:
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.PlayerMessage.mo7343a(long):boolean");
    }

    /* renamed from: b */
    public boolean mo7344b() {
        return this.f8329j;
    }

    /* renamed from: c */
    public Looper mo7345c() {
        return this.f8326g;
    }

    /* renamed from: d */
    public Object mo7346d() {
        return this.f8325f;
    }

    /* renamed from: e */
    public long mo7347e() {
        return this.f8328i;
    }

    /* renamed from: f */
    public C1183b mo7348f() {
        return this.f8320a;
    }

    /* renamed from: g */
    public Timeline mo7349g() {
        return this.f8323d;
    }

    /* renamed from: h */
    public int mo7350h() {
        return this.f8324e;
    }

    /* renamed from: i */
    public int mo7351i() {
        return this.f8327h;
    }

    /* renamed from: j */
    public synchronized boolean mo7352j() {
        return this.f8333n;
    }

    /* renamed from: k */
    public synchronized void mo7353k(boolean z) {
        this.f8331l = z | this.f8331l;
        this.f8332m = true;
        notifyAll();
    }

    /* renamed from: l */
    public PlayerMessage mo7354l() {
        Assertions.m10154f(!this.f8330k);
        if (this.f8328i == -9223372036854775807L) {
            Assertions.m10149a(this.f8329j);
        }
        this.f8330k = true;
        this.f8321b.mo7357a(this);
        return this;
    }

    /* renamed from: m */
    public PlayerMessage mo7355m(Object obj) {
        Assertions.m10154f(!this.f8330k);
        this.f8325f = obj;
        return this;
    }

    /* renamed from: n */
    public PlayerMessage mo7356n(int i) {
        Assertions.m10154f(!this.f8330k);
        this.f8324e = i;
        return this;
    }
}
