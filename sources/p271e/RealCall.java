package p271e;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import p271e.p272f0.C3310c;
import p271e.p272f0.NamedRunnable;
import p271e.p272f0.p273e.CacheInterceptor;
import p271e.p272f0.p274f.ConnectInterceptor;
import p271e.p272f0.p275g.BridgeInterceptor;
import p271e.p272f0.p275g.CallServerInterceptor;
import p271e.p272f0.p275g.RealInterceptorChain;
import p271e.p272f0.p275g.RetryAndFollowUpInterceptor;
import p271e.p272f0.p278j.C3358g;
import p281f.AsyncTimeout;

/* renamed from: e.y */
final class RealCall implements Call {

    /* renamed from: a */
    final OkHttpClient f18716a;

    /* renamed from: b */
    final RetryAndFollowUpInterceptor f18717b;

    /* renamed from: c */
    final AsyncTimeout f18718c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public EventListener f18719d;

    /* renamed from: e */
    final C3378z f18720e;

    /* renamed from: f */
    final boolean f18721f;

    /* renamed from: g */
    private boolean f18722g;

    /* renamed from: e.y$a */
    /* compiled from: RealCall */
    class C3376a extends AsyncTimeout {
        C3376a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: t */
        public void mo19899t() {
            RealCall.this.cancel();
        }
    }

    /* renamed from: e.y$b */
    /* compiled from: RealCall */
    final class C3377b extends NamedRunnable {

        /* renamed from: b */
        private final Callback f18724b;

        static {
            Class<RealCall> cls = RealCall.class;
        }

        C3377b(Callback fVar) {
            super("OkHttp %s", RealCall.this.mo20133f());
            this.f18724b = fVar;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0030 A[Catch:{ IOException -> 0x004e, all -> 0x0026, all -> 0x008d }] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0059 A[Catch:{ IOException -> 0x004e, all -> 0x0026, all -> 0x008d }] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0079 A[Catch:{ IOException -> 0x004e, all -> 0x0026, all -> 0x008d }] */
        /* renamed from: k */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo19732k() {
            /*
                r5 = this;
                e.y r0 = p271e.RealCall.this
                f.a r0 = r0.f18718c
                r0.mo20161k()
                r0 = 0
                e.y r1 = p271e.RealCall.this     // Catch:{ IOException -> 0x004e, all -> 0x0026 }
                e.b0 r0 = r1.mo20132d()     // Catch:{ IOException -> 0x004e, all -> 0x0026 }
                r1 = 1
                e.f r2 = r5.f18724b     // Catch:{ IOException -> 0x0024, all -> 0x0022 }
                e.y r3 = p271e.RealCall.this     // Catch:{ IOException -> 0x0024, all -> 0x0022 }
                r2.mo18704a(r3, r0)     // Catch:{ IOException -> 0x0024, all -> 0x0022 }
            L_0x0016:
                e.y r0 = p271e.RealCall.this
                e.w r0 = r0.f18716a
                e.n r0 = r0.mo20109h()
                r0.mo20015e(r5)
                goto L_0x008c
            L_0x0022:
                r0 = move-exception
                goto L_0x0029
            L_0x0024:
                r0 = move-exception
                goto L_0x0051
            L_0x0026:
                r1 = move-exception
                r0 = r1
                r1 = 0
            L_0x0029:
                e.y r2 = p271e.RealCall.this     // Catch:{ all -> 0x008d }
                r2.cancel()     // Catch:{ all -> 0x008d }
                if (r1 != 0) goto L_0x004d
                java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x008d }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x008d }
                r2.<init>()     // Catch:{ all -> 0x008d }
                java.lang.String r3 = "canceled due to "
                r2.append(r3)     // Catch:{ all -> 0x008d }
                r2.append(r0)     // Catch:{ all -> 0x008d }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x008d }
                r1.<init>(r2)     // Catch:{ all -> 0x008d }
                e.f r2 = r5.f18724b     // Catch:{ all -> 0x008d }
                e.y r3 = p271e.RealCall.this     // Catch:{ all -> 0x008d }
                r2.mo18705b(r3, r1)     // Catch:{ all -> 0x008d }
            L_0x004d:
                throw r0     // Catch:{ all -> 0x008d }
            L_0x004e:
                r1 = move-exception
                r0 = r1
                r1 = 0
            L_0x0051:
                e.y r2 = p271e.RealCall.this     // Catch:{ all -> 0x008d }
                java.io.IOException r0 = r2.mo20134g(r0)     // Catch:{ all -> 0x008d }
                if (r1 == 0) goto L_0x0079
                e.f0.j.g r1 = p271e.p272f0.p278j.C3358g.m23494l()     // Catch:{ all -> 0x008d }
                r2 = 4
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x008d }
                r3.<init>()     // Catch:{ all -> 0x008d }
                java.lang.String r4 = "Callback failure for "
                r3.append(r4)     // Catch:{ all -> 0x008d }
                e.y r4 = p271e.RealCall.this     // Catch:{ all -> 0x008d }
                java.lang.String r4 = r4.mo20135h()     // Catch:{ all -> 0x008d }
                r3.append(r4)     // Catch:{ all -> 0x008d }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x008d }
                r1.mo19942s(r2, r3, r0)     // Catch:{ all -> 0x008d }
                goto L_0x0016
            L_0x0079:
                e.y r1 = p271e.RealCall.this     // Catch:{ all -> 0x008d }
                e.p r1 = r1.f18719d     // Catch:{ all -> 0x008d }
                e.y r2 = p271e.RealCall.this     // Catch:{ all -> 0x008d }
                r1.mo20022b(r2, r0)     // Catch:{ all -> 0x008d }
                e.f r1 = r5.f18724b     // Catch:{ all -> 0x008d }
                e.y r2 = p271e.RealCall.this     // Catch:{ all -> 0x008d }
                r1.mo18705b(r2, r0)     // Catch:{ all -> 0x008d }
                goto L_0x0016
            L_0x008c:
                return
            L_0x008d:
                r0 = move-exception
                e.y r1 = p271e.RealCall.this
                e.w r1 = r1.f18716a
                e.n r1 = r1.mo20109h()
                r1.mo20015e(r5)
                goto L_0x009b
            L_0x009a:
                throw r0
            L_0x009b:
                goto L_0x009a
            */
            throw new UnsupportedOperationException("Method not decompiled: p271e.RealCall.C3377b.mo19732k():void");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: l */
        public void mo20136l(ExecutorService executorService) {
            try {
                executorService.execute(this);
            } catch (RejectedExecutionException e) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(e);
                RealCall.this.f18719d.mo20022b(RealCall.this, interruptedIOException);
                this.f18724b.mo18705b(RealCall.this, interruptedIOException);
                RealCall.this.f18716a.mo20109h().mo20015e(this);
            } catch (Throwable th) {
                RealCall.this.f18716a.mo20109h().mo20015e(this);
                throw th;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: m */
        public RealCall mo20137m() {
            return RealCall.this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: n */
        public String mo20138n() {
            return RealCall.this.f18720e.mo20147i().mo20075m();
        }
    }

    private RealCall(OkHttpClient wVar, C3378z zVar, boolean z) {
        this.f18716a = wVar;
        this.f18720e = zVar;
        this.f18721f = z;
        this.f18717b = new RetryAndFollowUpInterceptor(wVar, z);
        C3376a aVar = new C3376a();
        this.f18718c = aVar;
        aVar.mo20265g((long) wVar.mo20103b(), TimeUnit.MILLISECONDS);
    }

    /* renamed from: b */
    private void m23735b() {
        this.f18717b.mo19812k(C3358g.m23494l().mo19940o("response.body().close()"));
    }

    /* renamed from: e */
    static RealCall m23736e(OkHttpClient wVar, C3378z zVar, boolean z) {
        RealCall yVar = new RealCall(wVar, zVar, z);
        yVar.f18719d = wVar.mo20111j().mo20041a(yVar);
        return yVar;
    }

    /* renamed from: S */
    public C3378z mo19716S() {
        return this.f18720e;
    }

    /* renamed from: T */
    public void mo19717T(Callback fVar) {
        synchronized (this) {
            if (!this.f18722g) {
                this.f18722g = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        m23735b();
        this.f18719d.mo20023c(this);
        this.f18716a.mo20109h().mo20012a(new C3377b(fVar));
    }

    /* renamed from: U */
    public Response mo19718U() throws IOException {
        synchronized (this) {
            if (!this.f18722g) {
                this.f18722g = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        m23735b();
        this.f18718c.mo20161k();
        this.f18719d.mo20023c(this);
        try {
            this.f18716a.mo20109h().mo20013b(this);
            Response d = mo20132d();
            if (d != null) {
                this.f18716a.mo20109h().mo20016f(this);
                return d;
            }
            throw new IOException("Canceled");
        } catch (IOException e) {
            IOException g = mo20134g(e);
            this.f18719d.mo20022b(this, g);
            throw g;
        } catch (Throwable th) {
            this.f18716a.mo20109h().mo20016f(this);
            throw th;
        }
    }

    /* renamed from: V */
    public boolean mo19719V() {
        return this.f18717b.mo19811e();
    }

    /* renamed from: c */
    public RealCall clone() {
        return m23736e(this.f18716a, this.f18720e, this.f18721f);
    }

    public void cancel() {
        this.f18717b.mo19810b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public Response mo20132d() throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f18716a.mo20115n());
        arrayList.add(this.f18717b);
        arrayList.add(new BridgeInterceptor(this.f18716a.mo20108g()));
        arrayList.add(new CacheInterceptor(this.f18716a.mo20116o()));
        arrayList.add(new ConnectInterceptor(this.f18716a));
        if (!this.f18721f) {
            arrayList.addAll(this.f18716a.mo20117p());
        }
        arrayList.add(new CallServerInterceptor(this.f18721f));
        RealInterceptorChain gVar = new RealInterceptorChain(arrayList, null, null, null, 0, this.f18720e, this, this.f18719d, this.f18716a.mo20105d(), this.f18716a.mo20124x(), this.f18716a.mo20101B());
        Response d = gVar.mo19803d(this.f18720e);
        if (!this.f18717b.mo19811e()) {
            return d;
        }
        C3310c.m23052f(d);
        throw new IOException("Canceled");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public String mo20133f() {
        return this.f18720e.mo20147i().mo20063B();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public IOException mo20134g(IOException iOException) {
        if (!this.f18718c.mo20164n()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public String mo20135h() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo19719V() ? "canceled " : "");
        sb.append(this.f18721f ? "web socket" : "call");
        sb.append(" to ");
        sb.append(mo20133f());
        return sb.toString();
    }
}
