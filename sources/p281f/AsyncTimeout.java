package p281f;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: f.a */
public class AsyncTimeout extends Timeout {

    /* renamed from: e */
    private static final long f18737e;

    /* renamed from: f */
    private static final long f18738f;

    /* renamed from: g */
    static AsyncTimeout f18739g;

    /* renamed from: h */
    private boolean f18740h;

    /* renamed from: i */
    private AsyncTimeout f18741i;

    /* renamed from: j */
    private long f18742j;

    /* renamed from: f.a$a */
    /* compiled from: AsyncTimeout */
    class C3380a implements Sink {

        /* renamed from: a */
        final /* synthetic */ Sink f18743a;

        C3380a(Sink rVar) {
            this.f18743a = rVar;
        }

        public void close() throws IOException {
            AsyncTimeout.this.mo20161k();
            try {
                this.f18743a.close();
                AsyncTimeout.this.mo20163m(true);
            } catch (IOException e) {
                throw AsyncTimeout.this.mo20162l(e);
            } catch (Throwable th) {
                AsyncTimeout.this.mo20163m(false);
                throw th;
            }
        }

        /* renamed from: d */
        public Timeout mo19824d() {
            return AsyncTimeout.this;
        }

        /* renamed from: f */
        public void mo19789f(C3383c cVar, long j) throws IOException {
            C3388u.m24008b(cVar.f18751c, 0, j);
            while (true) {
                long j2 = 0;
                if (j > 0) {
                    Segment oVar = cVar.f18750b;
                    while (true) {
                        if (j2 >= 65536) {
                            break;
                        }
                        j2 += (long) (oVar.f18783c - oVar.f18782b);
                        if (j2 >= j) {
                            j2 = j;
                            break;
                        }
                        oVar = oVar.f18786f;
                    }
                    AsyncTimeout.this.mo20161k();
                    try {
                        this.f18743a.mo19789f(cVar, j2);
                        j -= j2;
                        AsyncTimeout.this.mo20163m(true);
                    } catch (IOException e) {
                        throw AsyncTimeout.this.mo20162l(e);
                    } catch (Throwable th) {
                        AsyncTimeout.this.mo20163m(false);
                        throw th;
                    }
                } else {
                    return;
                }
            }
        }

        public void flush() throws IOException {
            AsyncTimeout.this.mo20161k();
            try {
                this.f18743a.flush();
                AsyncTimeout.this.mo20163m(true);
            } catch (IOException e) {
                throw AsyncTimeout.this.mo20162l(e);
            } catch (Throwable th) {
                AsyncTimeout.this.mo20163m(false);
                throw th;
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AsyncTimeout.sink(");
            sb.append(this.f18743a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: f.a$b */
    /* compiled from: AsyncTimeout */
    class C3381b implements Source {

        /* renamed from: a */
        final /* synthetic */ Source f18745a;

        C3381b(Source sVar) {
            this.f18745a = sVar;
        }

        public void close() throws IOException {
            try {
                this.f18745a.close();
                AsyncTimeout.this.mo20163m(true);
            } catch (IOException e) {
                throw AsyncTimeout.this.mo20162l(e);
            } catch (Throwable th) {
                AsyncTimeout.this.mo20163m(false);
                throw th;
            }
        }

        /* renamed from: d */
        public Timeout mo19738d() {
            return AsyncTimeout.this;
        }

        /* renamed from: t */
        public long mo19739t(C3383c cVar, long j) throws IOException {
            AsyncTimeout.this.mo20161k();
            try {
                long t = this.f18745a.mo19739t(cVar, j);
                AsyncTimeout.this.mo20163m(true);
                return t;
            } catch (IOException e) {
                throw AsyncTimeout.this.mo20162l(e);
            } catch (Throwable th) {
                AsyncTimeout.this.mo20163m(false);
                throw th;
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AsyncTimeout.source(");
            sb.append(this.f18745a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: f.a$c */
    /* compiled from: AsyncTimeout */
    private static final class C3382c extends Thread {
        C3382c() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r1.mo19899t();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<f.a> r0 = p281f.AsyncTimeout.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                f.a r1 = p281f.AsyncTimeout.m23772i()     // Catch:{ all -> 0x0019 }
                if (r1 != 0) goto L_0x000b
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                goto L_0x0000
            L_0x000b:
                f.a r2 = p281f.AsyncTimeout.f18739g     // Catch:{ all -> 0x0019 }
                if (r1 != r2) goto L_0x0014
                r1 = 0
                p281f.AsyncTimeout.f18739g = r1     // Catch:{ all -> 0x0019 }
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                return
            L_0x0014:
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                r1.mo19899t()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x0019:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                goto L_0x001d
            L_0x001c:
                throw r1
            L_0x001d:
                goto L_0x001c
            */
            throw new UnsupportedOperationException("Method not decompiled: p281f.AsyncTimeout.C3382c.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60);
        f18737e = millis;
        f18738f = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* renamed from: i */
    static AsyncTimeout m23772i() throws InterruptedException {
        Class<AsyncTimeout> cls = AsyncTimeout.class;
        AsyncTimeout aVar = f18739g.f18741i;
        AsyncTimeout aVar2 = null;
        if (aVar == null) {
            long nanoTime = System.nanoTime();
            cls.wait(f18737e);
            if (f18739g.f18741i == null && System.nanoTime() - nanoTime >= f18738f) {
                aVar2 = f18739g;
            }
            return aVar2;
        }
        long p = aVar.m23774p(System.nanoTime());
        if (p > 0) {
            long j = p / 1000000;
            cls.wait(j, (int) (p - (1000000 * j)));
            return null;
        }
        f18739g.f18741i = aVar.f18741i;
        aVar.f18741i = null;
        return aVar;
    }

    /* renamed from: j */
    private static synchronized boolean m23773j(AsyncTimeout aVar) {
        synchronized (AsyncTimeout.class) {
            AsyncTimeout aVar2 = f18739g;
            while (aVar2 != null) {
                AsyncTimeout aVar3 = aVar2.f18741i;
                if (aVar3 == aVar) {
                    aVar2.f18741i = aVar.f18741i;
                    aVar.f18741i = null;
                    return false;
                }
                aVar2 = aVar3;
            }
            return true;
        }
    }

    /* renamed from: p */
    private long m23774p(long j) {
        return this.f18742j - j;
    }

    /* renamed from: q */
    private static synchronized void m23775q(AsyncTimeout aVar, long j, boolean z) {
        Class<AsyncTimeout> cls = AsyncTimeout.class;
        synchronized (cls) {
            if (f18739g == null) {
                f18739g = new AsyncTimeout();
                new C3382c().start();
            }
            long nanoTime = System.nanoTime();
            if (j != 0 && z) {
                aVar.f18742j = Math.min(j, aVar.mo20261c() - nanoTime) + nanoTime;
            } else if (j != 0) {
                aVar.f18742j = j + nanoTime;
            } else if (z) {
                aVar.f18742j = aVar.mo20261c();
            } else {
                throw new AssertionError();
            }
            long p = aVar.m23774p(nanoTime);
            AsyncTimeout aVar2 = f18739g;
            while (true) {
                AsyncTimeout aVar3 = aVar2.f18741i;
                if (aVar3 == null) {
                    break;
                } else if (p < aVar3.m23774p(nanoTime)) {
                    break;
                } else {
                    aVar2 = aVar2.f18741i;
                }
            }
            aVar.f18741i = aVar2.f18741i;
            aVar2.f18741i = aVar;
            if (aVar2 == f18739g) {
                cls.notify();
            }
        }
    }

    /* renamed from: k */
    public final void mo20161k() {
        if (!this.f18740h) {
            long h = mo20287h();
            boolean e = mo20263e();
            if (h != 0 || e) {
                this.f18740h = true;
                m23775q(this, h, e);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final IOException mo20162l(IOException iOException) throws IOException {
        if (!mo20164n()) {
            return iOException;
        }
        return mo19898o(iOException);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public final void mo20163m(boolean z) throws IOException {
        if (mo20164n() && z) {
            throw mo19898o(null);
        }
    }

    /* renamed from: n */
    public final boolean mo20164n() {
        if (!this.f18740h) {
            return false;
        }
        this.f18740h = false;
        return m23773j(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public IOException mo19898o(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: r */
    public final Sink mo20165r(Sink rVar) {
        return new C3380a(rVar);
    }

    /* renamed from: s */
    public final Source mo20166s(Source sVar) {
        return new C3381b(sVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo19899t() {
    }
}
