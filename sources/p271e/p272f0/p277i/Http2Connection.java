package p271e.p272f0.p277i;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p271e.p272f0.C3310c;
import p271e.p272f0.NamedRunnable;
import p271e.p272f0.p278j.C3358g;
import p281f.BufferedSink;
import p281f.BufferedSource;
import p281f.ByteString;
import p281f.C3383c;

/* renamed from: e.f0.i.g */
public final class Http2Connection implements Closeable {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final ExecutorService f18286a;

    /* renamed from: b */
    final boolean f18287b;

    /* renamed from: c */
    final C3340j f18288c;

    /* renamed from: d */
    final Map<Integer, Http2Stream> f18289d = new LinkedHashMap();

    /* renamed from: e */
    final String f18290e;

    /* renamed from: f */
    int f18291f;

    /* renamed from: g */
    int f18292g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f18293h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final ScheduledExecutorService f18294i;

    /* renamed from: j */
    private final ExecutorService f18295j;

    /* renamed from: k */
    final PushObserver f18296k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public long f18297l = 0;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public long f18298m = 0;

    /* renamed from: n */
    private long f18299n = 0;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public long f18300o = 0;

    /* renamed from: p */
    private long f18301p = 0;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public long f18302q = 0;

    /* renamed from: r */
    private long f18303r = 0;

    /* renamed from: s */
    long f18304s = 0;

    /* renamed from: t */
    long f18305t;

    /* renamed from: u */
    Settings f18306u = new Settings();

    /* renamed from: v */
    final Settings f18307v;

    /* renamed from: w */
    final Socket f18308w;

    /* renamed from: x */
    final Http2Writer f18309x;

    /* renamed from: y */
    final C3343l f18310y;

    /* renamed from: z */
    final Set<Integer> f18311z;

    /* renamed from: e.f0.i.g$a */
    /* compiled from: Http2Connection */
    class C3331a extends NamedRunnable {

        /* renamed from: b */
        final /* synthetic */ int f18312b;

        /* renamed from: c */
        final /* synthetic */ ErrorCode f18313c;

        C3331a(String str, Object[] objArr, int i, ErrorCode bVar) {
            this.f18312b = i;
            this.f18313c = bVar;
            super(str, objArr);
        }

        /* renamed from: k */
        public void mo19732k() {
            try {
                Http2Connection.this.mo19858h0(this.f18312b, this.f18313c);
            } catch (IOException unused) {
                Http2Connection.this.m23291N();
            }
        }
    }

    /* renamed from: e.f0.i.g$b */
    /* compiled from: Http2Connection */
    class C3332b extends NamedRunnable {

        /* renamed from: b */
        final /* synthetic */ int f18315b;

        /* renamed from: c */
        final /* synthetic */ long f18316c;

        C3332b(String str, Object[] objArr, int i, long j) {
            this.f18315b = i;
            this.f18316c = j;
            super(str, objArr);
        }

        /* renamed from: k */
        public void mo19732k() {
            try {
                Http2Connection.this.f18309x.mo19914O(this.f18315b, this.f18316c);
            } catch (IOException unused) {
                Http2Connection.this.m23291N();
            }
        }
    }

    /* renamed from: e.f0.i.g$c */
    /* compiled from: Http2Connection */
    class C3333c extends NamedRunnable {
        C3333c(String str, Object... objArr) {
            super(str, objArr);
        }

        /* renamed from: k */
        public void mo19732k() {
            Http2Connection.this.mo19857g0(false, 2, 0);
        }
    }

    /* renamed from: e.f0.i.g$d */
    /* compiled from: Http2Connection */
    class C3334d extends NamedRunnable {

        /* renamed from: b */
        final /* synthetic */ int f18319b;

        /* renamed from: c */
        final /* synthetic */ List f18320c;

        C3334d(String str, Object[] objArr, int i, List list) {
            this.f18319b = i;
            this.f18320c = list;
            super(str, objArr);
        }

        /* renamed from: k */
        public void mo19732k() {
            if (Http2Connection.this.f18296k.mo19920a(this.f18319b, this.f18320c)) {
                try {
                    Http2Connection.this.f18309x.mo19911L(this.f18319b, ErrorCode.CANCEL);
                    synchronized (Http2Connection.this) {
                        Http2Connection.this.f18311z.remove(Integer.valueOf(this.f18319b));
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    /* renamed from: e.f0.i.g$e */
    /* compiled from: Http2Connection */
    class C3335e extends NamedRunnable {

        /* renamed from: b */
        final /* synthetic */ int f18322b;

        /* renamed from: c */
        final /* synthetic */ List f18323c;

        /* renamed from: d */
        final /* synthetic */ boolean f18324d;

        C3335e(String str, Object[] objArr, int i, List list, boolean z) {
            this.f18322b = i;
            this.f18323c = list;
            this.f18324d = z;
            super(str, objArr);
        }

        /* renamed from: k */
        public void mo19732k() {
            boolean b = Http2Connection.this.f18296k.mo19921b(this.f18322b, this.f18323c, this.f18324d);
            if (b) {
                try {
                    Http2Connection.this.f18309x.mo19911L(this.f18322b, ErrorCode.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (b || this.f18324d) {
                synchronized (Http2Connection.this) {
                    Http2Connection.this.f18311z.remove(Integer.valueOf(this.f18322b));
                }
            }
        }
    }

    /* renamed from: e.f0.i.g$f */
    /* compiled from: Http2Connection */
    class C3336f extends NamedRunnable {

        /* renamed from: b */
        final /* synthetic */ int f18326b;

        /* renamed from: c */
        final /* synthetic */ C3383c f18327c;

        /* renamed from: d */
        final /* synthetic */ int f18328d;

        /* renamed from: e */
        final /* synthetic */ boolean f18329e;

        C3336f(String str, Object[] objArr, int i, C3383c cVar, int i2, boolean z) {
            this.f18326b = i;
            this.f18327c = cVar;
            this.f18328d = i2;
            this.f18329e = z;
            super(str, objArr);
        }

        /* renamed from: k */
        public void mo19732k() {
            try {
                boolean d = Http2Connection.this.f18296k.mo19923d(this.f18326b, this.f18327c, this.f18328d, this.f18329e);
                if (d) {
                    Http2Connection.this.f18309x.mo19911L(this.f18326b, ErrorCode.CANCEL);
                }
                if (d || this.f18329e) {
                    synchronized (Http2Connection.this) {
                        Http2Connection.this.f18311z.remove(Integer.valueOf(this.f18326b));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: e.f0.i.g$g */
    /* compiled from: Http2Connection */
    class C3337g extends NamedRunnable {

        /* renamed from: b */
        final /* synthetic */ int f18331b;

        /* renamed from: c */
        final /* synthetic */ ErrorCode f18332c;

        C3337g(String str, Object[] objArr, int i, ErrorCode bVar) {
            this.f18331b = i;
            this.f18332c = bVar;
            super(str, objArr);
        }

        /* renamed from: k */
        public void mo19732k() {
            Http2Connection.this.f18296k.mo19922c(this.f18331b, this.f18332c);
            synchronized (Http2Connection.this) {
                Http2Connection.this.f18311z.remove(Integer.valueOf(this.f18331b));
            }
        }
    }

    /* renamed from: e.f0.i.g$h */
    /* compiled from: Http2Connection */
    public static class C3338h {

        /* renamed from: a */
        Socket f18334a;

        /* renamed from: b */
        String f18335b;

        /* renamed from: c */
        BufferedSource f18336c;

        /* renamed from: d */
        BufferedSink f18337d;

        /* renamed from: e */
        C3340j f18338e = C3340j.f18343a;

        /* renamed from: f */
        PushObserver f18339f = PushObserver.f18404a;

        /* renamed from: g */
        boolean f18340g;

        /* renamed from: h */
        int f18341h;

        public C3338h(boolean z) {
            this.f18340g = z;
        }

        /* renamed from: a */
        public Http2Connection mo19861a() {
            return new Http2Connection(this);
        }

        /* renamed from: b */
        public C3338h mo19862b(C3340j jVar) {
            this.f18338e = jVar;
            return this;
        }

        /* renamed from: c */
        public C3338h mo19863c(int i) {
            this.f18341h = i;
            return this;
        }

        /* renamed from: d */
        public C3338h mo19864d(Socket socket, String str, BufferedSource eVar, BufferedSink dVar) {
            this.f18334a = socket;
            this.f18335b = str;
            this.f18336c = eVar;
            this.f18337d = dVar;
            return this;
        }
    }

    /* renamed from: e.f0.i.g$i */
    /* compiled from: Http2Connection */
    final class C3339i extends NamedRunnable {
        C3339i() {
            super("OkHttp %s ping", Http2Connection.this.f18290e);
        }

        /* renamed from: k */
        public void mo19732k() {
            boolean z;
            synchronized (Http2Connection.this) {
                if (Http2Connection.this.f18298m < Http2Connection.this.f18297l) {
                    z = true;
                } else {
                    Http2Connection.this.f18297l = 1 + Http2Connection.this.f18297l;
                    z = false;
                }
            }
            if (z) {
                Http2Connection.this.m23291N();
            } else {
                Http2Connection.this.mo19857g0(false, 1, 0);
            }
        }
    }

    /* renamed from: e.f0.i.g$j */
    /* compiled from: Http2Connection */
    public static abstract class C3340j {

        /* renamed from: a */
        public static final C3340j f18343a = new C3341a();

        /* renamed from: e.f0.i.g$j$a */
        /* compiled from: Http2Connection */
        class C3341a extends C3340j {
            C3341a() {
            }

            /* renamed from: b */
            public void mo19752b(Http2Stream iVar) throws IOException {
                iVar.mo19882f(ErrorCode.REFUSED_STREAM);
            }
        }

        /* renamed from: a */
        public void mo19751a(Http2Connection gVar) {
        }

        /* renamed from: b */
        public abstract void mo19752b(Http2Stream iVar) throws IOException;
    }

    /* renamed from: e.f0.i.g$k */
    /* compiled from: Http2Connection */
    final class C3342k extends NamedRunnable {

        /* renamed from: b */
        final boolean f18344b;

        /* renamed from: c */
        final int f18345c;

        /* renamed from: d */
        final int f18346d;

        C3342k(boolean z, int i, int i2) {
            super("OkHttp %s ping %08x%08x", Http2Connection.this.f18290e, Integer.valueOf(i), Integer.valueOf(i2));
            this.f18344b = z;
            this.f18345c = i;
            this.f18346d = i2;
        }

        /* renamed from: k */
        public void mo19732k() {
            Http2Connection.this.mo19857g0(this.f18344b, this.f18345c, this.f18346d);
        }
    }

    /* renamed from: e.f0.i.g$l */
    /* compiled from: Http2Connection */
    class C3343l extends NamedRunnable implements C3348b {

        /* renamed from: b */
        final Http2Reader f18348b;

        /* renamed from: e.f0.i.g$l$a */
        /* compiled from: Http2Connection */
        class C3344a extends NamedRunnable {

            /* renamed from: b */
            final /* synthetic */ Http2Stream f18350b;

            C3344a(String str, Object[] objArr, Http2Stream iVar) {
                this.f18350b = iVar;
                super(str, objArr);
            }

            /* renamed from: k */
            public void mo19732k() {
                try {
                    Http2Connection.this.f18288c.mo19752b(this.f18350b);
                } catch (IOException e) {
                    C3358g l = C3358g.m23494l();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Http2Connection.Listener failure for ");
                    sb.append(Http2Connection.this.f18290e);
                    l.mo19942s(4, sb.toString(), e);
                    try {
                        this.f18350b.mo19882f(ErrorCode.PROTOCOL_ERROR);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* renamed from: e.f0.i.g$l$b */
        /* compiled from: Http2Connection */
        class C3345b extends NamedRunnable {

            /* renamed from: b */
            final /* synthetic */ boolean f18352b;

            /* renamed from: c */
            final /* synthetic */ Settings f18353c;

            C3345b(String str, Object[] objArr, boolean z, Settings mVar) {
                this.f18352b = z;
                this.f18353c = mVar;
                super(str, objArr);
            }

            /* renamed from: k */
            public void mo19732k() {
                C3343l.this.mo19875l(this.f18352b, this.f18353c);
            }
        }

        /* renamed from: e.f0.i.g$l$c */
        /* compiled from: Http2Connection */
        class C3346c extends NamedRunnable {
            C3346c(String str, Object... objArr) {
                super(str, objArr);
            }

            /* renamed from: k */
            public void mo19732k() {
                Http2Connection gVar = Http2Connection.this;
                gVar.f18288c.mo19751a(gVar);
            }
        }

        C3343l(Http2Reader hVar) {
            super("OkHttp %s", Http2Connection.this.f18290e);
            this.f18348b = hVar;
        }

        /* renamed from: a */
        public void mo19865a() {
        }

        /* renamed from: b */
        public void mo19866b(boolean z, Settings mVar) {
            try {
                ScheduledExecutorService J = Http2Connection.this.f18294i;
                C3345b bVar = new C3345b("OkHttp %s ACK Settings", new Object[]{Http2Connection.this.f18290e}, z, mVar);
                J.execute(bVar);
            } catch (RejectedExecutionException unused) {
            }
        }

        /* renamed from: c */
        public void mo19867c(boolean z, int i, BufferedSource eVar, int i2) throws IOException {
            if (Http2Connection.this.mo19847Y(i)) {
                Http2Connection.this.mo19843T(i, eVar, i2, z);
                return;
            }
            Http2Stream O = Http2Connection.this.mo19839O(i);
            if (O == null) {
                Http2Connection.this.mo19859i0(i, ErrorCode.PROTOCOL_ERROR);
                long j = (long) i2;
                Http2Connection.this.mo19854e0(j);
                eVar.mo20192a(j);
                return;
            }
            O.mo19890o(eVar, i2);
            if (z) {
                O.mo19891p();
            }
        }

        /* renamed from: d */
        public void mo19868d(boolean z, int i, int i2) {
            if (z) {
                synchronized (Http2Connection.this) {
                    if (i == 1) {
                        try {
                            Http2Connection.this.f18298m = 1 + Http2Connection.this.f18298m;
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else if (i == 2) {
                        Http2Connection.this.f18300o = 1 + Http2Connection.this.f18300o;
                    } else if (i == 3) {
                        Http2Connection.this.f18302q = 1 + Http2Connection.this.f18302q;
                        Http2Connection.this.notifyAll();
                    }
                }
                return;
            }
            try {
                Http2Connection.this.f18294i.execute(new C3342k(true, i, i2));
            } catch (RejectedExecutionException unused) {
            }
        }

        /* renamed from: e */
        public void mo19869e(int i, int i2, int i3, boolean z) {
        }

        /* renamed from: f */
        public void mo19870f(int i, ErrorCode bVar) {
            if (Http2Connection.this.mo19847Y(i)) {
                Http2Connection.this.mo19846X(i, bVar);
                return;
            }
            Http2Stream Z = Http2Connection.this.mo19848Z(i);
            if (Z != null) {
                Z.mo19893r(bVar);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0072, code lost:
            r0.mo19892q(r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0075, code lost:
            if (r10 == false) goto L_0x007a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0077, code lost:
            r0.mo19891p();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x007a, code lost:
            return;
         */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo19871g(boolean r10, int r11, int r12, java.util.List<p271e.p272f0.p277i.Header> r13) {
            /*
                r9 = this;
                e.f0.i.g r12 = p271e.p272f0.p277i.Http2Connection.this
                boolean r12 = r12.mo19847Y(r11)
                if (r12 == 0) goto L_0x000e
                e.f0.i.g r12 = p271e.p272f0.p277i.Http2Connection.this
                r12.mo19844V(r11, r13, r10)
                return
            L_0x000e:
                e.f0.i.g r12 = p271e.p272f0.p277i.Http2Connection.this
                monitor-enter(r12)
                e.f0.i.g r0 = p271e.p272f0.p277i.Http2Connection.this     // Catch:{ all -> 0x007b }
                e.f0.i.i r0 = r0.mo19839O(r11)     // Catch:{ all -> 0x007b }
                if (r0 != 0) goto L_0x0071
                e.f0.i.g r0 = p271e.p272f0.p277i.Http2Connection.this     // Catch:{ all -> 0x007b }
                boolean r0 = r0.f18293h     // Catch:{ all -> 0x007b }
                if (r0 == 0) goto L_0x0023
                monitor-exit(r12)     // Catch:{ all -> 0x007b }
                return
            L_0x0023:
                e.f0.i.g r0 = p271e.p272f0.p277i.Http2Connection.this     // Catch:{ all -> 0x007b }
                int r1 = r0.f18291f     // Catch:{ all -> 0x007b }
                if (r11 > r1) goto L_0x002b
                monitor-exit(r12)     // Catch:{ all -> 0x007b }
                return
            L_0x002b:
                int r1 = r11 % 2
                int r0 = r0.f18292g     // Catch:{ all -> 0x007b }
                r2 = 2
                int r0 = r0 % r2
                if (r1 != r0) goto L_0x0035
                monitor-exit(r12)     // Catch:{ all -> 0x007b }
                return
            L_0x0035:
                e.s r8 = p271e.p272f0.C3310c.m23044G(r13)     // Catch:{ all -> 0x007b }
                e.f0.i.i r13 = new e.f0.i.i     // Catch:{ all -> 0x007b }
                e.f0.i.g r5 = p271e.p272f0.p277i.Http2Connection.this     // Catch:{ all -> 0x007b }
                r6 = 0
                r3 = r13
                r4 = r11
                r7 = r10
                r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x007b }
                e.f0.i.g r10 = p271e.p272f0.p277i.Http2Connection.this     // Catch:{ all -> 0x007b }
                r10.f18291f = r11     // Catch:{ all -> 0x007b }
                java.util.Map<java.lang.Integer, e.f0.i.i> r10 = r10.f18289d     // Catch:{ all -> 0x007b }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x007b }
                r10.put(r0, r13)     // Catch:{ all -> 0x007b }
                java.util.concurrent.ExecutorService r10 = p271e.p272f0.p277i.Http2Connection.f18286a     // Catch:{ all -> 0x007b }
                e.f0.i.g$l$a r0 = new e.f0.i.g$l$a     // Catch:{ all -> 0x007b }
                java.lang.String r1 = "OkHttp %s stream %d"
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x007b }
                r3 = 0
                e.f0.i.g r4 = p271e.p272f0.p277i.Http2Connection.this     // Catch:{ all -> 0x007b }
                java.lang.String r4 = r4.f18290e     // Catch:{ all -> 0x007b }
                r2[r3] = r4     // Catch:{ all -> 0x007b }
                r3 = 1
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x007b }
                r2[r3] = r11     // Catch:{ all -> 0x007b }
                r0.<init>(r1, r2, r13)     // Catch:{ all -> 0x007b }
                r10.execute(r0)     // Catch:{ all -> 0x007b }
                monitor-exit(r12)     // Catch:{ all -> 0x007b }
                return
            L_0x0071:
                monitor-exit(r12)     // Catch:{ all -> 0x007b }
                r0.mo19892q(r13)
                if (r10 == 0) goto L_0x007a
                r0.mo19891p()
            L_0x007a:
                return
            L_0x007b:
                r10 = move-exception
                monitor-exit(r12)     // Catch:{ all -> 0x007b }
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: p271e.p272f0.p277i.Http2Connection.C3343l.mo19871g(boolean, int, int, java.util.List):void");
        }

        /* renamed from: h */
        public void mo19872h(int i, long j) {
            if (i == 0) {
                synchronized (Http2Connection.this) {
                    Http2Connection gVar = Http2Connection.this;
                    gVar.f18305t += j;
                    gVar.notifyAll();
                }
                return;
            }
            Http2Stream O = Http2Connection.this.mo19839O(i);
            if (O != null) {
                synchronized (O) {
                    O.mo19879c(j);
                }
            }
        }

        /* renamed from: i */
        public void mo19873i(int i, int i2, List<Header> list) {
            Http2Connection.this.mo19845W(i2, list);
        }

        /* renamed from: j */
        public void mo19874j(int i, ErrorCode bVar, ByteString fVar) {
            Http2Stream[] iVarArr;
            fVar.mo20248o();
            synchronized (Http2Connection.this) {
                iVarArr = (Http2Stream[]) Http2Connection.this.f18289d.values().toArray(new Http2Stream[Http2Connection.this.f18289d.size()]);
                Http2Connection.this.f18293h = true;
            }
            for (Http2Stream iVar : iVarArr) {
                if (iVar.mo19884i() > i && iVar.mo19887l()) {
                    iVar.mo19893r(ErrorCode.REFUSED_STREAM);
                    Http2Connection.this.mo19848Z(iVar.mo19884i());
                }
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r0 = p271e.p272f0.p277i.ErrorCode.PROTOCOL_ERROR;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            r4.f18349c.mo19838M(r0, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x002c, code lost:
            r2 = th;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x001f */
        /* renamed from: k */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo19732k() {
            /*
                r4 = this;
                e.f0.i.b r0 = p271e.p272f0.p277i.ErrorCode.INTERNAL_ERROR
                e.f0.i.h r1 = r4.f18348b     // Catch:{ IOException -> 0x001e, all -> 0x001b }
                r1.mo19877D(r4)     // Catch:{ IOException -> 0x001e, all -> 0x001b }
            L_0x0007:
                e.f0.i.h r1 = r4.f18348b     // Catch:{ IOException -> 0x001e, all -> 0x001b }
                r2 = 0
                boolean r1 = r1.mo19876C(r2, r4)     // Catch:{ IOException -> 0x001e, all -> 0x001b }
                if (r1 == 0) goto L_0x0011
                goto L_0x0007
            L_0x0011:
                e.f0.i.b r1 = p271e.p272f0.p277i.ErrorCode.NO_ERROR     // Catch:{ IOException -> 0x001e, all -> 0x001b }
                e.f0.i.b r0 = p271e.p272f0.p277i.ErrorCode.CANCEL     // Catch:{ IOException -> 0x001f }
                e.f0.i.g r2 = p271e.p272f0.p277i.Http2Connection.this     // Catch:{ IOException -> 0x0026 }
                r2.mo19838M(r1, r0)     // Catch:{ IOException -> 0x0026 }
                goto L_0x0026
            L_0x001b:
                r2 = move-exception
                r1 = r0
                goto L_0x002d
            L_0x001e:
                r1 = r0
            L_0x001f:
                e.f0.i.b r0 = p271e.p272f0.p277i.ErrorCode.PROTOCOL_ERROR     // Catch:{ all -> 0x002c }
                e.f0.i.g r1 = p271e.p272f0.p277i.Http2Connection.this     // Catch:{ IOException -> 0x0026 }
                r1.mo19838M(r0, r0)     // Catch:{ IOException -> 0x0026 }
            L_0x0026:
                e.f0.i.h r0 = r4.f18348b
                p271e.p272f0.C3310c.m23052f(r0)
                return
            L_0x002c:
                r2 = move-exception
            L_0x002d:
                e.f0.i.g r3 = p271e.p272f0.p277i.Http2Connection.this     // Catch:{ IOException -> 0x0032 }
                r3.mo19838M(r1, r0)     // Catch:{ IOException -> 0x0032 }
            L_0x0032:
                e.f0.i.h r0 = r4.f18348b
                p271e.p272f0.C3310c.m23052f(r0)
                goto L_0x0039
            L_0x0038:
                throw r2
            L_0x0039:
                goto L_0x0038
            */
            throw new UnsupportedOperationException("Method not decompiled: p271e.p272f0.p277i.Http2Connection.C3343l.mo19732k():void");
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:2|3|7|17|18|19|20|21) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0061 */
        /* renamed from: l */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo19875l(boolean r6, p271e.p272f0.p277i.Settings r7) {
            /*
                r5 = this;
                e.f0.i.g r0 = p271e.p272f0.p277i.Http2Connection.this
                e.f0.i.j r0 = r0.f18309x
                monitor-enter(r0)
                e.f0.i.g r1 = p271e.p272f0.p277i.Http2Connection.this     // Catch:{ all -> 0x0096 }
                monitor-enter(r1)     // Catch:{ all -> 0x0096 }
                e.f0.i.g r2 = p271e.p272f0.p277i.Http2Connection.this     // Catch:{ all -> 0x0093 }
                e.f0.i.m r2 = r2.f18307v     // Catch:{ all -> 0x0093 }
                int r2 = r2.mo19927d()     // Catch:{ all -> 0x0093 }
                if (r6 == 0) goto L_0x0019
                e.f0.i.g r6 = p271e.p272f0.p277i.Http2Connection.this     // Catch:{ all -> 0x0093 }
                e.f0.i.m r6 = r6.f18307v     // Catch:{ all -> 0x0093 }
                r6.mo19924a()     // Catch:{ all -> 0x0093 }
            L_0x0019:
                e.f0.i.g r6 = p271e.p272f0.p277i.Http2Connection.this     // Catch:{ all -> 0x0093 }
                e.f0.i.m r6 = r6.f18307v     // Catch:{ all -> 0x0093 }
                r6.mo19931h(r7)     // Catch:{ all -> 0x0093 }
                e.f0.i.g r6 = p271e.p272f0.p277i.Http2Connection.this     // Catch:{ all -> 0x0093 }
                e.f0.i.m r6 = r6.f18307v     // Catch:{ all -> 0x0093 }
                int r6 = r6.mo19927d()     // Catch:{ all -> 0x0093 }
                r7 = -1
                r3 = 0
                if (r6 == r7) goto L_0x0054
                if (r6 == r2) goto L_0x0054
                int r6 = r6 - r2
                long r6 = (long) r6     // Catch:{ all -> 0x0093 }
                e.f0.i.g r2 = p271e.p272f0.p277i.Http2Connection.this     // Catch:{ all -> 0x0093 }
                java.util.Map<java.lang.Integer, e.f0.i.i> r2 = r2.f18289d     // Catch:{ all -> 0x0093 }
                boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0093 }
                if (r2 != 0) goto L_0x0056
                e.f0.i.g r2 = p271e.p272f0.p277i.Http2Connection.this     // Catch:{ all -> 0x0093 }
                java.util.Map<java.lang.Integer, e.f0.i.i> r2 = r2.f18289d     // Catch:{ all -> 0x0093 }
                java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x0093 }
                e.f0.i.g r3 = p271e.p272f0.p277i.Http2Connection.this     // Catch:{ all -> 0x0093 }
                java.util.Map<java.lang.Integer, e.f0.i.i> r3 = r3.f18289d     // Catch:{ all -> 0x0093 }
                int r3 = r3.size()     // Catch:{ all -> 0x0093 }
                e.f0.i.i[] r3 = new p271e.p272f0.p277i.Http2Stream[r3]     // Catch:{ all -> 0x0093 }
                java.lang.Object[] r2 = r2.toArray(r3)     // Catch:{ all -> 0x0093 }
                e.f0.i.i[] r2 = (p271e.p272f0.p277i.Http2Stream[]) r2     // Catch:{ all -> 0x0093 }
                r3 = r2
                goto L_0x0056
            L_0x0054:
                r6 = 0
            L_0x0056:
                monitor-exit(r1)     // Catch:{ all -> 0x0093 }
                e.f0.i.g r1 = p271e.p272f0.p277i.Http2Connection.this     // Catch:{ IOException -> 0x0061 }
                e.f0.i.j r2 = r1.f18309x     // Catch:{ IOException -> 0x0061 }
                e.f0.i.m r1 = r1.f18307v     // Catch:{ IOException -> 0x0061 }
                r2.mo19901B(r1)     // Catch:{ IOException -> 0x0061 }
                goto L_0x0066
            L_0x0061:
                e.f0.i.g r1 = p271e.p272f0.p277i.Http2Connection.this     // Catch:{ all -> 0x0096 }
                r1.m23291N()     // Catch:{ all -> 0x0096 }
            L_0x0066:
                monitor-exit(r0)     // Catch:{ all -> 0x0096 }
                r0 = 0
                if (r3 == 0) goto L_0x007b
                int r1 = r3.length
                r2 = 0
            L_0x006c:
                if (r2 >= r1) goto L_0x007b
                r4 = r3[r2]
                monitor-enter(r4)
                r4.mo19879c(r6)     // Catch:{ all -> 0x0078 }
                monitor-exit(r4)     // Catch:{ all -> 0x0078 }
                int r2 = r2 + 1
                goto L_0x006c
            L_0x0078:
                r6 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x0078 }
                throw r6
            L_0x007b:
                java.util.concurrent.ExecutorService r6 = p271e.p272f0.p277i.Http2Connection.f18286a
                e.f0.i.g$l$c r7 = new e.f0.i.g$l$c
                java.lang.String r1 = "OkHttp %s settings"
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                e.f0.i.g r3 = p271e.p272f0.p277i.Http2Connection.this
                java.lang.String r3 = r3.f18290e
                r2[r0] = r3
                r7.<init>(r1, r2)
                r6.execute(r7)
                return
            L_0x0093:
                r6 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0093 }
                throw r6     // Catch:{ all -> 0x0096 }
            L_0x0096:
                r6 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0096 }
                goto L_0x009a
            L_0x0099:
                throw r6
            L_0x009a:
                goto L_0x0099
            */
            throw new UnsupportedOperationException("Method not decompiled: p271e.p272f0.p277i.Http2Connection.C3343l.mo19875l(boolean, e.f0.i.m):void");
        }
    }

    static {
        Class<Http2Connection> cls = Http2Connection.class;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C3310c.m23043F("OkHttp Http2Connection", true));
        f18286a = threadPoolExecutor;
    }

    Http2Connection(C3338h hVar) {
        C3338h hVar2 = hVar;
        Settings mVar = new Settings();
        this.f18307v = mVar;
        this.f18311z = new LinkedHashSet();
        this.f18296k = hVar2.f18339f;
        boolean z = hVar2.f18340g;
        this.f18287b = z;
        this.f18288c = hVar2.f18338e;
        int i = z ? 1 : 2;
        this.f18292g = i;
        if (z) {
            this.f18292g = i + 2;
        }
        if (z) {
            this.f18306u.mo19932i(7, 16777216);
        }
        String str = hVar2.f18335b;
        this.f18290e = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, C3310c.m23043F(C3310c.m23063q("OkHttp %s Writer", str), false));
        this.f18294i = scheduledThreadPoolExecutor;
        if (hVar2.f18341h != 0) {
            C3339i iVar = new C3339i();
            int i2 = hVar2.f18341h;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(iVar, (long) i2, (long) i2, TimeUnit.MILLISECONDS);
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C3310c.m23043F(C3310c.m23063q("OkHttp %s Push Observer", str), true));
        this.f18295j = threadPoolExecutor;
        mVar.mo19932i(7, 65535);
        mVar.mo19932i(5, 16384);
        this.f18305t = (long) mVar.mo19927d();
        this.f18308w = hVar2.f18334a;
        this.f18309x = new Http2Writer(hVar2.f18337d, z);
        this.f18310y = new C3343l(new Http2Reader(hVar2.f18336c, z));
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public void m23291N() {
        try {
            ErrorCode bVar = ErrorCode.PROTOCOL_ERROR;
            mo19838M(bVar, bVar);
        } catch (IOException unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0041  */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p271e.p272f0.p277i.Http2Stream m23292R(int r11, java.util.List<p271e.p272f0.p277i.Header> r12, boolean r13) throws java.io.IOException {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            e.f0.i.j r7 = r10.f18309x
            monitor-enter(r7)
            monitor-enter(r10)     // Catch:{ all -> 0x0076 }
            int r0 = r10.f18292g     // Catch:{ all -> 0x0073 }
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L_0x0013
            e.f0.i.b r0 = p271e.p272f0.p277i.ErrorCode.REFUSED_STREAM     // Catch:{ all -> 0x0073 }
            r10.mo19850b0(r0)     // Catch:{ all -> 0x0073 }
        L_0x0013:
            boolean r0 = r10.f18293h     // Catch:{ all -> 0x0073 }
            if (r0 != 0) goto L_0x006d
            int r8 = r10.f18292g     // Catch:{ all -> 0x0073 }
            int r0 = r8 + 2
            r10.f18292g = r0     // Catch:{ all -> 0x0073 }
            e.f0.i.i r9 = new e.f0.i.i     // Catch:{ all -> 0x0073 }
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0073 }
            if (r13 == 0) goto L_0x003a
            long r0 = r10.f18305t     // Catch:{ all -> 0x0073 }
            r2 = 0
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x003a
            long r0 = r9.f18368b     // Catch:{ all -> 0x0073 }
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            r13 = 0
            goto L_0x003b
        L_0x003a:
            r13 = 1
        L_0x003b:
            boolean r0 = r9.mo19888m()     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x004a
            java.util.Map<java.lang.Integer, e.f0.i.i> r0 = r10.f18289d     // Catch:{ all -> 0x0073 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0073 }
            r0.put(r1, r9)     // Catch:{ all -> 0x0073 }
        L_0x004a:
            monitor-exit(r10)     // Catch:{ all -> 0x0073 }
            if (r11 != 0) goto L_0x0053
            e.f0.i.j r0 = r10.f18309x     // Catch:{ all -> 0x0076 }
            r0.mo19913N(r6, r8, r11, r12)     // Catch:{ all -> 0x0076 }
            goto L_0x005c
        L_0x0053:
            boolean r0 = r10.f18287b     // Catch:{ all -> 0x0076 }
            if (r0 != 0) goto L_0x0065
            e.f0.i.j r0 = r10.f18309x     // Catch:{ all -> 0x0076 }
            r0.mo19910K(r11, r8, r12)     // Catch:{ all -> 0x0076 }
        L_0x005c:
            monitor-exit(r7)     // Catch:{ all -> 0x0076 }
            if (r13 == 0) goto L_0x0064
            e.f0.i.j r11 = r10.f18309x
            r11.flush()
        L_0x0064:
            return r9
        L_0x0065:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0076 }
            java.lang.String r12 = "client streams shouldn't have associated stream IDs"
            r11.<init>(r12)     // Catch:{ all -> 0x0076 }
            throw r11     // Catch:{ all -> 0x0076 }
        L_0x006d:
            e.f0.i.a r11 = new e.f0.i.a     // Catch:{ all -> 0x0073 }
            r11.<init>()     // Catch:{ all -> 0x0073 }
            throw r11     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0073 }
            throw r11     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r11 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0076 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p271e.p272f0.p277i.Http2Connection.m23292R(int, java.util.List, boolean):e.f0.i.i");
    }

    /* renamed from: U */
    private synchronized void m23293U(NamedRunnable bVar) {
        if (!this.f18293h) {
            this.f18295j.execute(bVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: M */
    public void mo19838M(ErrorCode bVar, ErrorCode bVar2) throws IOException {
        Http2Stream[] iVarArr = null;
        try {
            mo19850b0(bVar);
            e = null;
        } catch (IOException e) {
            e = e;
        }
        synchronized (this) {
            if (!this.f18289d.isEmpty()) {
                iVarArr = (Http2Stream[]) this.f18289d.values().toArray(new Http2Stream[this.f18289d.size()]);
                this.f18289d.clear();
            }
        }
        if (iVarArr != null) {
            for (Http2Stream f : iVarArr) {
                try {
                    f.mo19882f(bVar2);
                } catch (IOException e2) {
                    if (e != null) {
                        e = e2;
                    }
                }
            }
        }
        try {
            this.f18309x.close();
        } catch (IOException e3) {
            if (e == null) {
                e = e3;
            }
        }
        try {
            this.f18308w.close();
        } catch (IOException e4) {
            e = e4;
        }
        this.f18294i.shutdown();
        this.f18295j.shutdown();
        if (e != null) {
            throw e;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: O */
    public synchronized Http2Stream mo19839O(int i) {
        return (Http2Stream) this.f18289d.get(Integer.valueOf(i));
    }

    /* renamed from: P */
    public synchronized boolean mo19840P(long j) {
        if (this.f18293h) {
            return false;
        }
        if (this.f18300o >= this.f18299n || j < this.f18303r) {
            return true;
        }
        return false;
    }

    /* renamed from: Q */
    public synchronized int mo19841Q() {
        return this.f18307v.mo19928e(Integer.MAX_VALUE);
    }

    /* renamed from: S */
    public Http2Stream mo19842S(List<Header> list, boolean z) throws IOException {
        return m23292R(0, list, z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: T */
    public void mo19843T(int i, BufferedSource eVar, int i2, boolean z) throws IOException {
        C3383c cVar = new C3383c();
        long j = (long) i2;
        eVar.mo20231v(j);
        eVar.mo19739t(cVar, j);
        if (cVar.mo20186Q() == j) {
            C3336f fVar = new C3336f("OkHttp %s Push Data[%s]", new Object[]{this.f18290e, Integer.valueOf(i)}, i, cVar, i2, z);
            m23293U(fVar);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(cVar.mo20186Q());
        sb.append(" != ");
        sb.append(i2);
        throw new IOException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: V */
    public void mo19844V(int i, List<Header> list, boolean z) {
        try {
            C3335e eVar = new C3335e("OkHttp %s Push Headers[%s]", new Object[]{this.f18290e, Integer.valueOf(i)}, i, list, z);
            m23293U(eVar);
        } catch (RejectedExecutionException unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r3 = r8;
        r2 = new p271e.p272f0.p277i.Http2Connection.C3334d(r3, "OkHttp %s Push Request[%s]", new java.lang.Object[]{r8.f18290e, java.lang.Integer.valueOf(r9)}, r9, r10);
        m23293U(r2);
     */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19845W(int r9, java.util.List<p271e.p272f0.p277i.Header> r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.Set<java.lang.Integer> r0 = r8.f18311z     // Catch:{ all -> 0x003c }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x003c }
            boolean r0 = r0.contains(r1)     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x0014
            e.f0.i.b r10 = p271e.p272f0.p277i.ErrorCode.PROTOCOL_ERROR     // Catch:{ all -> 0x003c }
            r8.mo19859i0(r9, r10)     // Catch:{ all -> 0x003c }
            monitor-exit(r8)     // Catch:{ all -> 0x003c }
            return
        L_0x0014:
            java.util.Set<java.lang.Integer> r0 = r8.f18311z     // Catch:{ all -> 0x003c }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x003c }
            r0.add(r1)     // Catch:{ all -> 0x003c }
            monitor-exit(r8)     // Catch:{ all -> 0x003c }
            e.f0.i.g$d r0 = new e.f0.i.g$d     // Catch:{ RejectedExecutionException -> 0x003b }
            java.lang.String r4 = "OkHttp %s Push Request[%s]"
            r1 = 2
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ RejectedExecutionException -> 0x003b }
            r1 = 0
            java.lang.String r2 = r8.f18290e     // Catch:{ RejectedExecutionException -> 0x003b }
            r5[r1] = r2     // Catch:{ RejectedExecutionException -> 0x003b }
            r1 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)     // Catch:{ RejectedExecutionException -> 0x003b }
            r5[r1] = r2     // Catch:{ RejectedExecutionException -> 0x003b }
            r2 = r0
            r3 = r8
            r6 = r9
            r7 = r10
            r2.<init>(r4, r5, r6, r7)     // Catch:{ RejectedExecutionException -> 0x003b }
            r8.m23293U(r0)     // Catch:{ RejectedExecutionException -> 0x003b }
        L_0x003b:
            return
        L_0x003c:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x003c }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p271e.p272f0.p277i.Http2Connection.mo19845W(int, java.util.List):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: X */
    public void mo19846X(int i, ErrorCode bVar) {
        C3337g gVar = new C3337g("OkHttp %s Push Reset[%s]", new Object[]{this.f18290e, Integer.valueOf(i)}, i, bVar);
        m23293U(gVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Y */
    public boolean mo19847Y(int i) {
        return i != 0 && (i & 1) == 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Z */
    public synchronized Http2Stream mo19848Z(int i) {
        Http2Stream iVar;
        iVar = (Http2Stream) this.f18289d.remove(Integer.valueOf(i));
        notifyAll();
        return iVar;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r6.f18294i.execute(new p271e.p272f0.p277i.Http2Connection.C3333c(r6, "OkHttp %s ping", r6.f18290e));
     */
    /* renamed from: a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19849a0() {
        /*
            r6 = this;
            monitor-enter(r6)
            long r0 = r6.f18300o     // Catch:{ all -> 0x0030 }
            long r2 = r6.f18299n     // Catch:{ all -> 0x0030 }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x000b
            monitor-exit(r6)     // Catch:{ all -> 0x0030 }
            return
        L_0x000b:
            r0 = 1
            long r2 = r2 + r0
            r6.f18299n = r2     // Catch:{ all -> 0x0030 }
            long r0 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0030 }
            r2 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r0 = r0 + r2
            r6.f18303r = r0     // Catch:{ all -> 0x0030 }
            monitor-exit(r6)     // Catch:{ all -> 0x0030 }
            java.util.concurrent.ScheduledExecutorService r0 = r6.f18294i     // Catch:{ RejectedExecutionException -> 0x002f }
            e.f0.i.g$c r1 = new e.f0.i.g$c     // Catch:{ RejectedExecutionException -> 0x002f }
            java.lang.String r2 = "OkHttp %s ping"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ RejectedExecutionException -> 0x002f }
            r4 = 0
            java.lang.String r5 = r6.f18290e     // Catch:{ RejectedExecutionException -> 0x002f }
            r3[r4] = r5     // Catch:{ RejectedExecutionException -> 0x002f }
            r1.<init>(r2, r3)     // Catch:{ RejectedExecutionException -> 0x002f }
            r0.execute(r1)     // Catch:{ RejectedExecutionException -> 0x002f }
        L_0x002f:
            return
        L_0x0030:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0030 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p271e.p272f0.p277i.Http2Connection.mo19849a0():void");
    }

    /* renamed from: b0 */
    public void mo19850b0(ErrorCode bVar) throws IOException {
        synchronized (this.f18309x) {
            synchronized (this) {
                if (!this.f18293h) {
                    this.f18293h = true;
                    int i = this.f18291f;
                    this.f18309x.mo19906G(i, bVar, C3310c.f18086a);
                }
            }
        }
    }

    /* renamed from: c0 */
    public void mo19851c0() throws IOException {
        mo19853d0(true);
    }

    public void close() throws IOException {
        mo19838M(ErrorCode.NO_ERROR, ErrorCode.CANCEL);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d0 */
    public void mo19853d0(boolean z) throws IOException {
        if (z) {
            this.f18309x.mo19902C();
            this.f18309x.mo19912M(this.f18306u);
            int d = this.f18306u.mo19927d();
            if (d != 65535) {
                this.f18309x.mo19914O(0, (long) (d - 65535));
            }
        }
        new Thread(this.f18310y).start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e0 */
    public synchronized void mo19854e0(long j) {
        long j2 = this.f18304s + j;
        this.f18304s = j2;
        if (j2 >= ((long) (this.f18306u.mo19927d() / 2))) {
            mo19860j0(0, this.f18304s);
            this.f18304s = 0;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r3), r8.f18309x.mo19908I());
        r6 = (long) r3;
        r8.f18305t -= r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0064, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0058 */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19855f0(int r9, boolean r10, p281f.C3383c r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x000d
            e.f0.i.j r12 = r8.f18309x
            r12.mo19903D(r10, r9, r11, r0)
            return
        L_0x000d:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0067
            monitor-enter(r8)
        L_0x0012:
            long r3 = r8.f18305t     // Catch:{ InterruptedException -> 0x0058 }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L_0x0030
            java.util.Map<java.lang.Integer, e.f0.i.i> r3 = r8.f18289d     // Catch:{ InterruptedException -> 0x0058 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x0058 }
            boolean r3 = r3.containsKey(r4)     // Catch:{ InterruptedException -> 0x0058 }
            if (r3 == 0) goto L_0x0028
            r8.wait()     // Catch:{ InterruptedException -> 0x0058 }
            goto L_0x0012
        L_0x0028:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x0058 }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x0058 }
            throw r9     // Catch:{ InterruptedException -> 0x0058 }
        L_0x0030:
            long r3 = java.lang.Math.min(r12, r3)     // Catch:{ all -> 0x0056 }
            int r4 = (int) r3     // Catch:{ all -> 0x0056 }
            e.f0.i.j r3 = r8.f18309x     // Catch:{ all -> 0x0056 }
            int r3 = r3.mo19908I()     // Catch:{ all -> 0x0056 }
            int r3 = java.lang.Math.min(r4, r3)     // Catch:{ all -> 0x0056 }
            long r4 = r8.f18305t     // Catch:{ all -> 0x0056 }
            long r6 = (long) r3     // Catch:{ all -> 0x0056 }
            long r4 = r4 - r6
            r8.f18305t = r4     // Catch:{ all -> 0x0056 }
            monitor-exit(r8)     // Catch:{ all -> 0x0056 }
            long r12 = r12 - r6
            e.f0.i.j r4 = r8.f18309x
            if (r10 == 0) goto L_0x0051
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x0051
            r5 = 1
            goto L_0x0052
        L_0x0051:
            r5 = 0
        L_0x0052:
            r4.mo19903D(r5, r9, r11, r3)
            goto L_0x000d
        L_0x0056:
            r9 = move-exception
            goto L_0x0065
        L_0x0058:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0056 }
            r9.interrupt()     // Catch:{ all -> 0x0056 }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0056 }
            r9.<init>()     // Catch:{ all -> 0x0056 }
            throw r9     // Catch:{ all -> 0x0056 }
        L_0x0065:
            monitor-exit(r8)     // Catch:{ all -> 0x0056 }
            throw r9
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p271e.p272f0.p277i.Http2Connection.mo19855f0(int, boolean, f.c, long):void");
    }

    public void flush() throws IOException {
        this.f18309x.flush();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g0 */
    public void mo19857g0(boolean z, int i, int i2) {
        try {
            this.f18309x.mo19909J(z, i, i2);
        } catch (IOException unused) {
            m23291N();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h0 */
    public void mo19858h0(int i, ErrorCode bVar) throws IOException {
        this.f18309x.mo19911L(i, bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i0 */
    public void mo19859i0(int i, ErrorCode bVar) {
        try {
            ScheduledExecutorService scheduledExecutorService = this.f18294i;
            C3331a aVar = new C3331a("OkHttp %s stream %d", new Object[]{this.f18290e, Integer.valueOf(i)}, i, bVar);
            scheduledExecutorService.execute(aVar);
        } catch (RejectedExecutionException unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j0 */
    public void mo19860j0(int i, long j) {
        try {
            ScheduledExecutorService scheduledExecutorService = this.f18294i;
            C3332b bVar = new C3332b("OkHttp Window Update %s stream %d", new Object[]{this.f18290e, Integer.valueOf(i)}, i, j);
            scheduledExecutorService.execute(bVar);
        } catch (RejectedExecutionException unused) {
        }
    }
}
