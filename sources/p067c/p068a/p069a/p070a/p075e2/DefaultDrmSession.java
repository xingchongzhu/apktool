package p067c.p068a.p069a.p070a.p075e2;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy.C1896a;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p067c.p068a.p069a.p070a.C;
import p067c.p068a.p069a.p070a.p075e2.C0896v.C0897a;
import p067c.p068a.p069a.p070a.p075e2.DrmInitData.C0894b;
import p067c.p068a.p069a.p070a.p075e2.DrmSessionEventListener.C0898a;
import p067c.p068a.p069a.p070a.p075e2.ExoMediaDrm.C0865a;
import p067c.p068a.p069a.p070a.p075e2.ExoMediaDrm.C0868d;
import p067c.p068a.p069a.p070a.p097j2.LoadEventInfo;
import p067c.p068a.p069a.p070a.p097j2.MediaLoadData;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.C1191k;
import p067c.p068a.p069a.p070a.p111m2.CopyOnWriteMultiset;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.e2.q */
class DefaultDrmSession implements C0896v {

    /* renamed from: a */
    public final List<C0894b> f5847a;

    /* renamed from: b */
    private final ExoMediaDrm f5848b;

    /* renamed from: c */
    private final C0880a f5849c;

    /* renamed from: d */
    private final C0881b f5850d;

    /* renamed from: e */
    private final int f5851e;

    /* renamed from: f */
    private final boolean f5852f;

    /* renamed from: g */
    private final boolean f5853g;

    /* renamed from: h */
    private final HashMap<String, String> f5854h;

    /* renamed from: i */
    private final CopyOnWriteMultiset<C0898a> f5855i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final LoadErrorHandlingPolicy f5856j;

    /* renamed from: k */
    final MediaDrmCallback f5857k;

    /* renamed from: l */
    final UUID f5858l;

    /* renamed from: m */
    final C0884e f5859m;

    /* renamed from: n */
    private int f5860n;

    /* renamed from: o */
    private int f5861o;

    /* renamed from: p */
    private HandlerThread f5862p;

    /* renamed from: q */
    private C0882c f5863q;

    /* renamed from: r */
    private ExoMediaCrypto f5864r;

    /* renamed from: s */
    private C0897a f5865s;

    /* renamed from: t */
    private byte[] f5866t;

    /* renamed from: u */
    private byte[] f5867u;

    /* renamed from: v */
    private C0865a f5868v;

    /* renamed from: w */
    private C0868d f5869w;

    /* renamed from: c.a.a.a.e2.q$a */
    /* compiled from: DefaultDrmSession */
    public interface C0880a {
        /* renamed from: a */
        void mo6074a(DefaultDrmSession qVar);

        /* renamed from: b */
        void mo6075b(Exception exc);

        /* renamed from: c */
        void mo6076c();
    }

    /* renamed from: c.a.a.a.e2.q$b */
    /* compiled from: DefaultDrmSession */
    public interface C0881b {
        /* renamed from: a */
        void mo6077a(DefaultDrmSession qVar, int i);

        /* renamed from: b */
        void mo6078b(DefaultDrmSession qVar, int i);
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: c.a.a.a.e2.q$c */
    /* compiled from: DefaultDrmSession */
    private class C0882c extends Handler {

        /* renamed from: a */
        private boolean f5870a;

        public C0882c(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        private boolean m7116a(Message message, MediaDrmCallbackException j0Var) {
            IOException iOException;
            MediaDrmCallbackException j0Var2 = j0Var;
            C0883d dVar = (C0883d) message.obj;
            if (!dVar.f5873b) {
                return false;
            }
            int i = dVar.f5876e + 1;
            dVar.f5876e = i;
            if (i > DefaultDrmSession.this.f5856j.mo14892d(3)) {
                return false;
            }
            LoadEventInfo wVar = new LoadEventInfo(dVar.f5872a, j0Var2.f5836a, j0Var2.f5837b, j0Var2.f5838c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f5874c, j0Var2.f5839d);
            MediaLoadData zVar = new MediaLoadData(3);
            if (j0Var.getCause() instanceof IOException) {
                iOException = (IOException) j0Var.getCause();
            } else {
                iOException = new C0885f(j0Var.getCause());
            }
            long b = DefaultDrmSession.this.f5856j.mo14890b(new C1896a(wVar, zVar, iOException, dVar.f5876e));
            if (b == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                if (this.f5870a) {
                    return false;
                }
                sendMessageDelayed(Message.obtain(message), b);
                return true;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo6079b(int i, Object obj, boolean z) {
            C0883d dVar = new C0883d(LoadEventInfo.m9282a(), z, SystemClock.elapsedRealtime(), obj);
            obtainMessage(i, dVar).sendToTarget();
        }

        /* renamed from: c */
        public synchronized void mo6080c() {
            removeCallbacksAndMessages(null);
            this.f5870a = true;
        }

        /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Throwable, java.lang.Exception] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r6.obj
                c.a.a.a.e2.q$d r0 = (p067c.p068a.p069a.p070a.p075e2.DefaultDrmSession.C0883d) r0
                int r1 = r6.what     // Catch:{ j0 -> 0x0038, Exception -> 0x002f }
                if (r1 == 0) goto L_0x0020
                r2 = 1
                if (r1 != r2) goto L_0x001a
                c.a.a.a.e2.q r1 = p067c.p068a.p069a.p070a.p075e2.DefaultDrmSession.this     // Catch:{ j0 -> 0x0038, Exception -> 0x002f }
                c.a.a.a.e2.i0 r2 = r1.f5857k     // Catch:{ j0 -> 0x0038, Exception -> 0x002f }
                java.util.UUID r1 = r1.f5858l     // Catch:{ j0 -> 0x0038, Exception -> 0x002f }
                java.lang.Object r3 = r0.f5875d     // Catch:{ j0 -> 0x0038, Exception -> 0x002f }
                c.a.a.a.e2.d0$a r3 = (p067c.p068a.p069a.p070a.p075e2.ExoMediaDrm.C0865a) r3     // Catch:{ j0 -> 0x0038, Exception -> 0x002f }
                byte[] r1 = r2.mo6062a(r1, r3)     // Catch:{ j0 -> 0x0038, Exception -> 0x002f }
                goto L_0x0040
            L_0x001a:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ j0 -> 0x0038, Exception -> 0x002f }
                r1.<init>()     // Catch:{ j0 -> 0x0038, Exception -> 0x002f }
                throw r1     // Catch:{ j0 -> 0x0038, Exception -> 0x002f }
            L_0x0020:
                c.a.a.a.e2.q r1 = p067c.p068a.p069a.p070a.p075e2.DefaultDrmSession.this     // Catch:{ j0 -> 0x0038, Exception -> 0x002f }
                c.a.a.a.e2.i0 r2 = r1.f5857k     // Catch:{ j0 -> 0x0038, Exception -> 0x002f }
                java.util.UUID r1 = r1.f5858l     // Catch:{ j0 -> 0x0038, Exception -> 0x002f }
                java.lang.Object r3 = r0.f5875d     // Catch:{ j0 -> 0x0038, Exception -> 0x002f }
                c.a.a.a.e2.d0$d r3 = (p067c.p068a.p069a.p070a.p075e2.ExoMediaDrm.C0868d) r3     // Catch:{ j0 -> 0x0038, Exception -> 0x002f }
                byte[] r1 = r2.mo6063b(r1, r3)     // Catch:{ j0 -> 0x0038, Exception -> 0x002f }
                goto L_0x0040
            L_0x002f:
                r1 = move-exception
                java.lang.String r2 = "DefaultDrmSession"
                java.lang.String r3 = "Key/provisioning request produced an unexpected exception. Not retrying."
                p067c.p068a.p069a.p070a.p111m2.Log.m10387i(r2, r3, r1)
                goto L_0x0040
            L_0x0038:
                r1 = move-exception
                boolean r2 = r5.m7116a(r6, r1)
                if (r2 == 0) goto L_0x0040
                return
            L_0x0040:
                c.a.a.a.e2.q r2 = p067c.p068a.p069a.p070a.p075e2.DefaultDrmSession.this
                com.google.android.exoplayer2.upstream.a0 r2 = r2.f5856j
                long r3 = r0.f5872a
                r2.mo14889a(r3)
                monitor-enter(r5)
                boolean r2 = r5.f5870a     // Catch:{ all -> 0x0065 }
                if (r2 != 0) goto L_0x0063
                c.a.a.a.e2.q r2 = p067c.p068a.p069a.p070a.p075e2.DefaultDrmSession.this     // Catch:{ all -> 0x0065 }
                c.a.a.a.e2.q$e r2 = r2.f5859m     // Catch:{ all -> 0x0065 }
                int r6 = r6.what     // Catch:{ all -> 0x0065 }
                java.lang.Object r0 = r0.f5875d     // Catch:{ all -> 0x0065 }
                android.util.Pair r0 = android.util.Pair.create(r0, r1)     // Catch:{ all -> 0x0065 }
                android.os.Message r6 = r2.obtainMessage(r6, r0)     // Catch:{ all -> 0x0065 }
                r6.sendToTarget()     // Catch:{ all -> 0x0065 }
            L_0x0063:
                monitor-exit(r5)     // Catch:{ all -> 0x0065 }
                return
            L_0x0065:
                r6 = move-exception
                monitor-exit(r5)     // Catch:{ all -> 0x0065 }
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p075e2.DefaultDrmSession.C0882c.handleMessage(android.os.Message):void");
        }
    }

    /* renamed from: c.a.a.a.e2.q$d */
    /* compiled from: DefaultDrmSession */
    private static final class C0883d {

        /* renamed from: a */
        public final long f5872a;

        /* renamed from: b */
        public final boolean f5873b;

        /* renamed from: c */
        public final long f5874c;

        /* renamed from: d */
        public final Object f5875d;

        /* renamed from: e */
        public int f5876e;

        public C0883d(long j, boolean z, long j2, Object obj) {
            this.f5872a = j;
            this.f5873b = z;
            this.f5874c = j2;
            this.f5875d = obj;
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: c.a.a.a.e2.q$e */
    /* compiled from: DefaultDrmSession */
    private class C0884e extends Handler {
        public C0884e(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i == 0) {
                DefaultDrmSession.this.m7096x(obj, obj2);
            } else if (i == 1) {
                DefaultDrmSession.this.m7093r(obj, obj2);
            }
        }
    }

    /* renamed from: c.a.a.a.e2.q$f */
    /* compiled from: DefaultDrmSession */
    public static final class C0885f extends IOException {
        public C0885f(Throwable th) {
            super(th);
        }
    }

    public DefaultDrmSession(UUID uuid, ExoMediaDrm d0Var, C0880a aVar, C0881b bVar, List<C0894b> list, int i, boolean z, boolean z2, byte[] bArr, HashMap<String, String> hashMap, MediaDrmCallback i0Var, Looper looper, LoadErrorHandlingPolicy a0Var) {
        if (i == 1 || i == 3) {
            Assertions.m10153e(bArr);
        }
        this.f5858l = uuid;
        this.f5849c = aVar;
        this.f5850d = bVar;
        this.f5848b = d0Var;
        this.f5851e = i;
        this.f5852f = z;
        this.f5853g = z2;
        if (bArr != null) {
            this.f5867u = bArr;
            this.f5847a = null;
        } else {
            this.f5847a = Collections.unmodifiableList((List) Assertions.m10153e(list));
        }
        this.f5854h = hashMap;
        this.f5857k = i0Var;
        this.f5855i = new CopyOnWriteMultiset<>();
        this.f5856j = a0Var;
        this.f5860n = 2;
        this.f5859m = new C0884e(looper);
    }

    @RequiresNonNull({"sessionId", "offlineLicenseKeySetId"})
    /* renamed from: B */
    private boolean m7083B() {
        try {
            this.f5848b.mo6031c(this.f5866t, this.f5867u);
            return true;
        } catch (Exception e) {
            Log.m10382d("DefaultDrmSession", "Error trying to restore keys.", e);
            m7092q(e);
            return false;
        }
    }

    /* renamed from: k */
    private void m7087k(C1191k<C0898a> kVar) {
        for (C0898a a : this.f5855i.mo7453a()) {
            kVar.mo6028a(a);
        }
    }

    @RequiresNonNull({"sessionId"})
    /* renamed from: l */
    private void m7088l(boolean z) {
        if (!this.f5853g) {
            byte[] bArr = (byte[]) Util.m10293i(this.f5866t);
            int i = this.f5851e;
            if (i == 0 || i == 1) {
                if (this.f5867u == null) {
                    m7098z(bArr, 1, z);
                } else if (this.f5860n == 4 || m7083B()) {
                    long m = m7089m();
                    if (this.f5851e == 0 && m <= 60) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Offline license has expired or will expire soon. Remaining seconds: ");
                        sb.append(m);
                        Log.m10380b("DefaultDrmSession", sb.toString());
                        m7098z(bArr, 2, z);
                    } else if (m <= 0) {
                        m7092q(new KeysExpiredException());
                    } else {
                        this.f5860n = 4;
                        m7087k(C0879o.f5846a);
                    }
                }
            } else if (i != 2) {
                if (i == 3) {
                    Assertions.m10153e(this.f5867u);
                    Assertions.m10153e(this.f5866t);
                    if (m7083B()) {
                        m7098z(this.f5867u, 3, z);
                    }
                }
            } else if (this.f5867u == null || m7083B()) {
                m7098z(bArr, 2, z);
            }
        }
    }

    /* renamed from: m */
    private long m7089m() {
        if (!C.f7373d.equals(this.f5858l)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) Assertions.m10153e(WidevineUtil.m7076b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    /* renamed from: o */
    private boolean m7090o() {
        int i = this.f5860n;
        return i == 3 || i == 4;
    }

    /* renamed from: q */
    private void m7092q(Exception exc) {
        this.f5865s = new C0897a(exc);
        m7087k(new C0863c(exc));
        if (this.f5860n != 4) {
            this.f5860n = 1;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m7093r(Object obj, Object obj2) {
        if (obj == this.f5868v && m7090o()) {
            this.f5868v = null;
            if (obj2 instanceof Exception) {
                m7094s((Exception) obj2);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f5851e == 3) {
                    this.f5848b.mo6035g((byte[]) Util.m10293i(this.f5867u), bArr);
                    m7087k(C0862b.f5802a);
                } else {
                    byte[] g = this.f5848b.mo6035g(this.f5866t, bArr);
                    int i = this.f5851e;
                    if (!((i != 2 && (i != 0 || this.f5867u == null)) || g == null || g.length == 0)) {
                        this.f5867u = g;
                    }
                    this.f5860n = 4;
                    m7087k(C0878n.f5845a);
                }
            } catch (Exception e) {
                m7094s(e);
            }
        }
    }

    /* renamed from: s */
    private void m7094s(Exception exc) {
        if (exc instanceof NotProvisionedException) {
            this.f5849c.mo6074a(this);
        } else {
            m7092q(exc);
        }
    }

    /* renamed from: t */
    private void m7095t() {
        if (this.f5851e == 0 && this.f5860n == 4) {
            Util.m10293i(this.f5866t);
            m7088l(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m7096x(Object obj, Object obj2) {
        if (obj == this.f5869w && (this.f5860n == 2 || m7090o())) {
            this.f5869w = null;
            if (obj2 instanceof Exception) {
                this.f5849c.mo6075b((Exception) obj2);
                return;
            }
            try {
                this.f5848b.mo6038j((byte[]) obj2);
                this.f5849c.mo6076c();
            } catch (Exception e) {
                this.f5849c.mo6075b(e);
            }
        }
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    /* renamed from: y */
    private boolean m7097y(boolean z) {
        if (m7090o()) {
            return true;
        }
        try {
            byte[] l = this.f5848b.mo6040l();
            this.f5866t = l;
            this.f5864r = this.f5848b.mo6036h(l);
            m7087k(C0875k.f5840a);
            this.f5860n = 3;
            Assertions.m10153e(this.f5866t);
            return true;
        } catch (NotProvisionedException e) {
            if (z) {
                this.f5849c.mo6074a(this);
            } else {
                m7092q(e);
            }
            return false;
        } catch (Exception e2) {
            m7092q(e2);
            return false;
        }
    }

    /* renamed from: z */
    private void m7098z(byte[] bArr, int i, boolean z) {
        try {
            this.f5868v = this.f5848b.mo6039k(bArr, this.f5847a, i, this.f5854h);
            ((C0882c) Util.m10293i(this.f5863q)).mo6079b(1, Assertions.m10153e(this.f5868v), z);
        } catch (Exception e) {
            m7094s(e);
        }
    }

    /* renamed from: A */
    public void mo6069A() {
        this.f5869w = this.f5848b.mo6037i();
        ((C0882c) Util.m10293i(this.f5863q)).mo6079b(0, Assertions.m10153e(this.f5869w), true);
    }

    /* renamed from: a */
    public boolean mo6041a() {
        return this.f5852f;
    }

    /* renamed from: b */
    public void mo6042b(C0898a aVar) {
        boolean z = false;
        Assertions.m10154f(this.f5861o >= 0);
        if (aVar != null) {
            this.f5855i.mo7454b(aVar);
        }
        int i = this.f5861o + 1;
        this.f5861o = i;
        if (i == 1) {
            if (this.f5860n == 2) {
                z = true;
            }
            Assertions.m10154f(z);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f5862p = handlerThread;
            handlerThread.start();
            this.f5863q = new C0882c(this.f5862p.getLooper());
            if (m7097y(true)) {
                m7088l(true);
            }
        } else if (aVar != null && m7090o()) {
            aVar.mo6123e();
        }
        this.f5850d.mo6078b(this, this.f5861o);
    }

    /* renamed from: c */
    public Map<String, String> mo6043c() {
        byte[] bArr = this.f5866t;
        if (bArr == null) {
            return null;
        }
        return this.f5848b.mo6032d(bArr);
    }

    /* renamed from: d */
    public void mo6044d(C0898a aVar) {
        Assertions.m10154f(this.f5861o > 0);
        int i = this.f5861o - 1;
        this.f5861o = i;
        if (i == 0) {
            this.f5860n = 0;
            ((C0884e) Util.m10293i(this.f5859m)).removeCallbacksAndMessages(null);
            ((C0882c) Util.m10293i(this.f5863q)).mo6080c();
            this.f5863q = null;
            ((HandlerThread) Util.m10293i(this.f5862p)).quit();
            this.f5862p = null;
            this.f5864r = null;
            this.f5865s = null;
            this.f5868v = null;
            this.f5869w = null;
            byte[] bArr = this.f5866t;
            if (bArr != null) {
                this.f5848b.mo6033e(bArr);
                this.f5866t = null;
            }
            m7087k(C0861a.f5801a);
        }
        if (aVar != null) {
            if (m7090o()) {
                aVar.mo6125g();
            }
            this.f5855i.mo7455c(aVar);
        }
        this.f5850d.mo6077a(this, this.f5861o);
    }

    /* renamed from: e */
    public final UUID mo6045e() {
        return this.f5858l;
    }

    /* renamed from: f */
    public final ExoMediaCrypto mo6046f() {
        return this.f5864r;
    }

    /* renamed from: g */
    public final C0897a mo6047g() {
        if (this.f5860n == 1) {
            return this.f5865s;
        }
        return null;
    }

    public final int getState() {
        return this.f5860n;
    }

    /* renamed from: n */
    public boolean mo6070n(byte[] bArr) {
        return Arrays.equals(this.f5866t, bArr);
    }

    /* renamed from: u */
    public void mo6071u(int i) {
        if (i == 2) {
            m7095t();
        }
    }

    /* renamed from: v */
    public void mo6072v() {
        if (m7097y(false)) {
            m7088l(true);
        }
    }

    /* renamed from: w */
    public void mo6073w(Exception exc) {
        m7092q(exc);
    }
}
