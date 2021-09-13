package p271e.p272f0.p277i;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Objects;
import p271e.C3370s;
import p271e.p272f0.C3310c;
import p281f.AsyncTimeout;
import p281f.BufferedSource;
import p281f.C3383c;
import p281f.Sink;
import p281f.Source;
import p281f.Timeout;

/* renamed from: e.f0.i.i */
public final class Http2Stream {

    /* renamed from: a */
    long f18367a = 0;

    /* renamed from: b */
    long f18368b;

    /* renamed from: c */
    final int f18369c;

    /* renamed from: d */
    final Http2Connection f18370d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Deque<C3370s> f18371e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C3327a f18372f;

    /* renamed from: g */
    private boolean f18373g;

    /* renamed from: h */
    private final C3350b f18374h;

    /* renamed from: i */
    final C3349a f18375i;

    /* renamed from: j */
    final C3351c f18376j;

    /* renamed from: k */
    final C3351c f18377k;

    /* renamed from: l */
    ErrorCode f18378l;

    /* renamed from: e.f0.i.i$a */
    /* compiled from: Http2Stream */
    final class C3349a implements Sink {

        /* renamed from: a */
        private final C3383c f18379a = new C3383c();

        /* renamed from: b */
        boolean f18380b;

        /* renamed from: c */
        boolean f18381c;

        C3349a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            r1.f18377k.mo19900u();
            r11.f18382d.mo19881e();
            r9 = java.lang.Math.min(r11.f18382d.f18368b, r11.f18379a.mo20186Q());
            r1 = r11.f18382d;
            r1.f18368b -= r9;
         */
        /* renamed from: B */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m23395B(boolean r12) throws java.io.IOException {
            /*
                r11 = this;
                e.f0.i.i r0 = p271e.p272f0.p277i.Http2Stream.this
                monitor-enter(r0)
                e.f0.i.i r1 = p271e.p272f0.p277i.Http2Stream.this     // Catch:{ all -> 0x007f }
                e.f0.i.i$c r1 = r1.f18377k     // Catch:{ all -> 0x007f }
                r1.mo20161k()     // Catch:{ all -> 0x007f }
            L_0x000a:
                e.f0.i.i r1 = p271e.p272f0.p277i.Http2Stream.this     // Catch:{ all -> 0x0076 }
                long r2 = r1.f18368b     // Catch:{ all -> 0x0076 }
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 > 0) goto L_0x0024
                boolean r2 = r11.f18381c     // Catch:{ all -> 0x0076 }
                if (r2 != 0) goto L_0x0024
                boolean r2 = r11.f18380b     // Catch:{ all -> 0x0076 }
                if (r2 != 0) goto L_0x0024
                e.f0.i.b r2 = r1.f18378l     // Catch:{ all -> 0x0076 }
                if (r2 != 0) goto L_0x0024
                r1.mo19895t()     // Catch:{ all -> 0x0076 }
                goto L_0x000a
            L_0x0024:
                e.f0.i.i$c r1 = r1.f18377k     // Catch:{ all -> 0x007f }
                r1.mo19900u()     // Catch:{ all -> 0x007f }
                e.f0.i.i r1 = p271e.p272f0.p277i.Http2Stream.this     // Catch:{ all -> 0x007f }
                r1.mo19881e()     // Catch:{ all -> 0x007f }
                e.f0.i.i r1 = p271e.p272f0.p277i.Http2Stream.this     // Catch:{ all -> 0x007f }
                long r1 = r1.f18368b     // Catch:{ all -> 0x007f }
                f.c r3 = r11.f18379a     // Catch:{ all -> 0x007f }
                long r3 = r3.mo20186Q()     // Catch:{ all -> 0x007f }
                long r9 = java.lang.Math.min(r1, r3)     // Catch:{ all -> 0x007f }
                e.f0.i.i r1 = p271e.p272f0.p277i.Http2Stream.this     // Catch:{ all -> 0x007f }
                long r2 = r1.f18368b     // Catch:{ all -> 0x007f }
                long r2 = r2 - r9
                r1.f18368b = r2     // Catch:{ all -> 0x007f }
                monitor-exit(r0)     // Catch:{ all -> 0x007f }
                e.f0.i.i$c r0 = r1.f18377k
                r0.mo20161k()
                e.f0.i.i r0 = p271e.p272f0.p277i.Http2Stream.this     // Catch:{ all -> 0x006d }
                e.f0.i.g r5 = r0.f18370d     // Catch:{ all -> 0x006d }
                int r6 = r0.f18369c     // Catch:{ all -> 0x006d }
                if (r12 == 0) goto L_0x005e
                f.c r12 = r11.f18379a     // Catch:{ all -> 0x006d }
                long r0 = r12.mo20186Q()     // Catch:{ all -> 0x006d }
                int r12 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r12 != 0) goto L_0x005e
                r12 = 1
                r7 = 1
                goto L_0x0060
            L_0x005e:
                r12 = 0
                r7 = 0
            L_0x0060:
                f.c r8 = r11.f18379a     // Catch:{ all -> 0x006d }
                r5.mo19855f0(r6, r7, r8, r9)     // Catch:{ all -> 0x006d }
                e.f0.i.i r12 = p271e.p272f0.p277i.Http2Stream.this
                e.f0.i.i$c r12 = r12.f18377k
                r12.mo19900u()
                return
            L_0x006d:
                r12 = move-exception
                e.f0.i.i r0 = p271e.p272f0.p277i.Http2Stream.this
                e.f0.i.i$c r0 = r0.f18377k
                r0.mo19900u()
                throw r12
            L_0x0076:
                r12 = move-exception
                e.f0.i.i r1 = p271e.p272f0.p277i.Http2Stream.this     // Catch:{ all -> 0x007f }
                e.f0.i.i$c r1 = r1.f18377k     // Catch:{ all -> 0x007f }
                r1.mo19900u()     // Catch:{ all -> 0x007f }
                throw r12     // Catch:{ all -> 0x007f }
            L_0x007f:
                r12 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x007f }
                goto L_0x0083
            L_0x0082:
                throw r12
            L_0x0083:
                goto L_0x0082
            */
            throw new UnsupportedOperationException("Method not decompiled: p271e.p272f0.p277i.Http2Stream.C3349a.m23395B(boolean):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
            if (r8.f18379a.mo20186Q() <= 0) goto L_0x002d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
            if (r8.f18379a.mo20186Q() <= 0) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
            m23395B(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
            r0 = r8.f18382d;
            r0.f18370d.mo19855f0(r0.f18369c, true, null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
            r2 = r8.f18382d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r8.f18380b = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
            r8.f18382d.f18370d.flush();
            r8.f18382d.mo19880d();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r8.f18382d.f18375i.f18381c != false) goto L_0x003a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() throws java.io.IOException {
            /*
                r8 = this;
                e.f0.i.i r0 = p271e.p272f0.p277i.Http2Stream.this
                monitor-enter(r0)
                boolean r1 = r8.f18380b     // Catch:{ all -> 0x0050 }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                return
            L_0x0009:
                monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                e.f0.i.i r0 = p271e.p272f0.p277i.Http2Stream.this
                e.f0.i.i$a r0 = r0.f18375i
                boolean r0 = r0.f18381c
                r1 = 1
                if (r0 != 0) goto L_0x003a
                f.c r0 = r8.f18379a
                long r2 = r0.mo20186Q()
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x002d
            L_0x001f:
                f.c r0 = r8.f18379a
                long r2 = r0.mo20186Q()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x003a
                r8.m23395B(r1)
                goto L_0x001f
            L_0x002d:
                e.f0.i.i r0 = p271e.p272f0.p277i.Http2Stream.this
                e.f0.i.g r2 = r0.f18370d
                int r3 = r0.f18369c
                r4 = 1
                r5 = 0
                r6 = 0
                r2.mo19855f0(r3, r4, r5, r6)
            L_0x003a:
                e.f0.i.i r2 = p271e.p272f0.p277i.Http2Stream.this
                monitor-enter(r2)
                r8.f18380b = r1     // Catch:{ all -> 0x004d }
                monitor-exit(r2)     // Catch:{ all -> 0x004d }
                e.f0.i.i r0 = p271e.p272f0.p277i.Http2Stream.this
                e.f0.i.g r0 = r0.f18370d
                r0.flush()
                e.f0.i.i r0 = p271e.p272f0.p277i.Http2Stream.this
                r0.mo19880d()
                return
            L_0x004d:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x004d }
                throw r0
            L_0x0050:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                goto L_0x0054
            L_0x0053:
                throw r1
            L_0x0054:
                goto L_0x0053
            */
            throw new UnsupportedOperationException("Method not decompiled: p271e.p272f0.p277i.Http2Stream.C3349a.close():void");
        }

        /* renamed from: d */
        public Timeout mo19824d() {
            return Http2Stream.this.f18377k;
        }

        /* renamed from: f */
        public void mo19789f(C3383c cVar, long j) throws IOException {
            this.f18379a.mo19789f(cVar, j);
            while (this.f18379a.mo20186Q() >= 16384) {
                m23395B(false);
            }
        }

        public void flush() throws IOException {
            synchronized (Http2Stream.this) {
                Http2Stream.this.mo19881e();
            }
            while (this.f18379a.mo20186Q() > 0) {
                m23395B(false);
                Http2Stream.this.f18370d.flush();
            }
        }
    }

    /* renamed from: e.f0.i.i$b */
    /* compiled from: Http2Stream */
    private final class C3350b implements Source {

        /* renamed from: a */
        private final C3383c f18383a = new C3383c();

        /* renamed from: b */
        private final C3383c f18384b = new C3383c();

        /* renamed from: c */
        private final long f18385c;

        /* renamed from: d */
        boolean f18386d;

        /* renamed from: e */
        boolean f18387e;

        C3350b(long j) {
            this.f18385c = j;
        }

        /* renamed from: C */
        private void m23398C(long j) {
            Http2Stream.this.f18370d.mo19854e0(j);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: B */
        public void mo19897B(BufferedSource eVar, long j) throws IOException {
            boolean z;
            boolean z2;
            boolean z3;
            long j2;
            while (j > 0) {
                synchronized (Http2Stream.this) {
                    z = this.f18387e;
                    z2 = true;
                    z3 = this.f18384b.mo20186Q() + j > this.f18385c;
                }
                if (z3) {
                    eVar.mo20192a(j);
                    Http2Stream.this.mo19883h(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                } else if (z) {
                    eVar.mo20192a(j);
                    return;
                } else {
                    long t = eVar.mo19739t(this.f18383a, j);
                    if (t != -1) {
                        j -= t;
                        synchronized (Http2Stream.this) {
                            if (this.f18386d) {
                                j2 = this.f18383a.mo20186Q();
                                this.f18383a.mo20171B();
                            } else {
                                if (this.f18384b.mo20186Q() != 0) {
                                    z2 = false;
                                }
                                this.f18384b.mo20195b0(this.f18383a);
                                if (z2) {
                                    Http2Stream.this.notifyAll();
                                }
                                j2 = 0;
                            }
                        }
                        if (j2 > 0) {
                            m23398C(j2);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
        }

        public void close() throws IOException {
            long Q;
            C3327a aVar;
            List<C3370s> list;
            synchronized (Http2Stream.this) {
                this.f18386d = true;
                Q = this.f18384b.mo20186Q();
                this.f18384b.mo20171B();
                aVar = null;
                if (Http2Stream.this.f18371e.isEmpty() || Http2Stream.this.f18372f == null) {
                    list = null;
                } else {
                    ArrayList arrayList = new ArrayList(Http2Stream.this.f18371e);
                    Http2Stream.this.f18371e.clear();
                    List list2 = arrayList;
                    aVar = Http2Stream.this.f18372f;
                    list = list2;
                }
                Http2Stream.this.notifyAll();
            }
            if (Q > 0) {
                m23398C(Q);
            }
            Http2Stream.this.mo19880d();
            if (aVar != null) {
                for (C3370s a : list) {
                    aVar.mo19829a(a);
                }
            }
        }

        /* renamed from: d */
        public Timeout mo19738d() {
            return Http2Stream.this.f18376j;
        }

        /* renamed from: t */
        public long mo19739t(C3383c cVar, long j) throws IOException {
            ErrorCode bVar;
            long j2;
            C3327a aVar;
            C3370s sVar;
            long j3 = j;
            if (j3 >= 0) {
                while (true) {
                    synchronized (Http2Stream.this) {
                        Http2Stream.this.f18376j.mo20161k();
                        try {
                            Http2Stream iVar = Http2Stream.this;
                            bVar = iVar.f18378l;
                            if (bVar == null) {
                                bVar = null;
                            }
                            if (!this.f18386d) {
                                if (!iVar.f18371e.isEmpty() && Http2Stream.this.f18372f != null) {
                                    sVar = (C3370s) Http2Stream.this.f18371e.removeFirst();
                                    C3383c cVar2 = cVar;
                                    aVar = Http2Stream.this.f18372f;
                                } else if (this.f18384b.mo20186Q() > 0) {
                                    C3383c cVar3 = this.f18384b;
                                    j2 = cVar3.mo19739t(cVar, Math.min(j3, cVar3.mo20186Q()));
                                    Http2Stream iVar2 = Http2Stream.this;
                                    long j4 = iVar2.f18367a + j2;
                                    iVar2.f18367a = j4;
                                    if (bVar == null && j4 >= ((long) (iVar2.f18370d.f18306u.mo19927d() / 2))) {
                                        Http2Stream iVar3 = Http2Stream.this;
                                        iVar3.f18370d.mo19860j0(iVar3.f18369c, iVar3.f18367a);
                                        Http2Stream.this.f18367a = 0;
                                    }
                                    sVar = null;
                                    aVar = null;
                                    if (sVar != null && aVar != null) {
                                        aVar.mo19829a(sVar);
                                    }
                                } else {
                                    C3383c cVar4 = cVar;
                                    if (this.f18387e || bVar != null) {
                                        sVar = null;
                                        aVar = null;
                                    } else {
                                        Http2Stream.this.mo19895t();
                                        Http2Stream.this.f18376j.mo19900u();
                                    }
                                }
                                j2 = -1;
                                if (sVar != null) {
                                    break;
                                }
                                break;
                            }
                            throw new IOException("stream closed");
                        } finally {
                            Http2Stream.this.f18376j.mo19900u();
                        }
                    }
                }
                if (j2 != -1) {
                    m23398C(j2);
                    return j2;
                } else if (bVar == null) {
                    return -1;
                } else {
                    throw new StreamResetException(bVar);
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("byteCount < 0: ");
                sb.append(j3);
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    /* renamed from: e.f0.i.i$c */
    /* compiled from: Http2Stream */
    class C3351c extends AsyncTimeout {
        C3351c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: o */
        public IOException mo19898o(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* access modifiers changed from: protected */
        /* renamed from: t */
        public void mo19899t() {
            Http2Stream.this.mo19883h(ErrorCode.CANCEL);
            Http2Stream.this.f18370d.mo19849a0();
        }

        /* renamed from: u */
        public void mo19900u() throws IOException {
            if (mo20164n()) {
                throw mo19898o(null);
            }
        }
    }

    Http2Stream(int i, Http2Connection gVar, boolean z, boolean z2, C3370s sVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f18371e = arrayDeque;
        this.f18376j = new C3351c();
        this.f18377k = new C3351c();
        this.f18378l = null;
        Objects.requireNonNull(gVar, "connection == null");
        this.f18369c = i;
        this.f18370d = gVar;
        this.f18368b = (long) gVar.f18307v.mo19927d();
        C3350b bVar = new C3350b((long) gVar.f18306u.mo19927d());
        this.f18374h = bVar;
        C3349a aVar = new C3349a();
        this.f18375i = aVar;
        bVar.f18387e = z2;
        aVar.f18381c = z;
        if (sVar != null) {
            arrayDeque.add(sVar);
        }
        if (mo19887l() && sVar != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        } else if (!mo19887l() && sVar == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    /* renamed from: g */
    private boolean m23376g(ErrorCode bVar) {
        synchronized (this) {
            if (this.f18378l != null) {
                return false;
            }
            if (this.f18374h.f18387e && this.f18375i.f18381c) {
                return false;
            }
            this.f18378l = bVar;
            notifyAll();
            this.f18370d.mo19848Z(this.f18369c);
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo19879c(long j) {
        this.f18368b += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo19880d() throws IOException {
        boolean z;
        boolean m;
        synchronized (this) {
            C3350b bVar = this.f18374h;
            if (!bVar.f18387e && bVar.f18386d) {
                C3349a aVar = this.f18375i;
                if (aVar.f18381c || aVar.f18380b) {
                    z = true;
                    m = mo19888m();
                }
            }
            z = false;
            m = mo19888m();
        }
        if (z) {
            mo19882f(ErrorCode.CANCEL);
        } else if (!m) {
            this.f18370d.mo19848Z(this.f18369c);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo19881e() throws IOException {
        C3349a aVar = this.f18375i;
        if (aVar.f18380b) {
            throw new IOException("stream closed");
        } else if (aVar.f18381c) {
            throw new IOException("stream finished");
        } else if (this.f18378l != null) {
            throw new StreamResetException(this.f18378l);
        }
    }

    /* renamed from: f */
    public void mo19882f(ErrorCode bVar) throws IOException {
        if (m23376g(bVar)) {
            this.f18370d.mo19858h0(this.f18369c, bVar);
        }
    }

    /* renamed from: h */
    public void mo19883h(ErrorCode bVar) {
        if (m23376g(bVar)) {
            this.f18370d.mo19859i0(this.f18369c, bVar);
        }
    }

    /* renamed from: i */
    public int mo19884i() {
        return this.f18369c;
    }

    /* renamed from: j */
    public Sink mo19885j() {
        synchronized (this) {
            if (!this.f18373g) {
                if (!mo19887l()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.f18375i;
    }

    /* renamed from: k */
    public Source mo19886k() {
        return this.f18374h;
    }

    /* renamed from: l */
    public boolean mo19887l() {
        if (this.f18370d.f18287b == ((this.f18369c & 1) == 1)) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public synchronized boolean mo19888m() {
        if (this.f18378l != null) {
            return false;
        }
        C3350b bVar = this.f18374h;
        if (bVar.f18387e || bVar.f18386d) {
            C3349a aVar = this.f18375i;
            if ((aVar.f18381c || aVar.f18380b) && this.f18373g) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    public Timeout mo19889n() {
        return this.f18376j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public void mo19890o(BufferedSource eVar, int i) throws IOException {
        this.f18374h.mo19897B(eVar, (long) i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public void mo19891p() {
        boolean m;
        synchronized (this) {
            this.f18374h.f18387e = true;
            m = mo19888m();
            notifyAll();
        }
        if (!m) {
            this.f18370d.mo19848Z(this.f18369c);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public void mo19892q(List<Header> list) {
        boolean m;
        synchronized (this) {
            this.f18373g = true;
            this.f18371e.add(C3310c.m23044G(list));
            m = mo19888m();
            notifyAll();
        }
        if (!m) {
            this.f18370d.mo19848Z(this.f18369c);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public synchronized void mo19893r(ErrorCode bVar) {
        if (this.f18378l == null) {
            this.f18378l = bVar;
            notifyAll();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: s */
    public synchronized C3370s mo19894s() throws IOException {
        this.f18376j.mo20161k();
        while (this.f18371e.isEmpty() && this.f18378l == null) {
            try {
                mo19895t();
            } catch (Throwable th) {
                this.f18376j.mo19900u();
                throw th;
            }
        }
        this.f18376j.mo19900u();
        if (!this.f18371e.isEmpty()) {
        } else {
            throw new StreamResetException(this.f18378l);
        }
        return (C3370s) this.f18371e.removeFirst();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public void mo19895t() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* renamed from: u */
    public Timeout mo19896u() {
        return this.f18377k;
    }
}
