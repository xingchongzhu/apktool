package p271e.p272f0.p274f;

import com.efs.sdk.base.Constants;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import p271e.Address;
import p271e.C3378z;
import p271e.C3378z.C3379a;
import p271e.Call;
import p271e.Connection;
import p271e.ConnectionPool;
import p271e.EventListener;
import p271e.Handshake;
import p271e.HttpUrl;
import p271e.Interceptor.C3373a;
import p271e.OkHttpClient;
import p271e.Protocol;
import p271e.Response;
import p271e.Response.C3306a;
import p271e.Route;
import p271e.p272f0.C3310c;
import p271e.p272f0.C3313d;
import p271e.p272f0.Internal;
import p271e.p272f0.p275g.HttpCodec;
import p271e.p272f0.p275g.HttpHeaders;
import p271e.p272f0.p276h.Http1Codec;
import p271e.p272f0.p277i.ErrorCode;
import p271e.p272f0.p277i.Http2Codec;
import p271e.p272f0.p277i.Http2Connection;
import p271e.p272f0.p277i.Http2Connection.C3338h;
import p271e.p272f0.p277i.Http2Connection.C3340j;
import p271e.p272f0.p277i.Http2Stream;
import p271e.p272f0.p278j.C3358g;
import p271e.p272f0.p280l.OkHostnameVerifier;
import p281f.BufferedSink;
import p281f.BufferedSource;
import p281f.Okio;
import p281f.Source;
import p281f.Timeout;

/* renamed from: e.f0.f.c */
public final class RealConnection extends C3340j implements Connection {

    /* renamed from: b */
    private final ConnectionPool f18132b;

    /* renamed from: c */
    private final Route f18133c;

    /* renamed from: d */
    private Socket f18134d;

    /* renamed from: e */
    private Socket f18135e;

    /* renamed from: f */
    private Handshake f18136f;

    /* renamed from: g */
    private Protocol f18137g;

    /* renamed from: h */
    private Http2Connection f18138h;

    /* renamed from: i */
    private BufferedSource f18139i;

    /* renamed from: j */
    private BufferedSink f18140j;

    /* renamed from: k */
    public boolean f18141k;

    /* renamed from: l */
    public int f18142l;

    /* renamed from: m */
    public int f18143m = 1;

    /* renamed from: n */
    public final List<Reference<StreamAllocation>> f18144n = new ArrayList();

    /* renamed from: o */
    public long f18145o = Long.MAX_VALUE;

    public RealConnection(ConnectionPool jVar, Route d0Var) {
        this.f18132b = jVar;
        this.f18133c = d0Var;
    }

    /* renamed from: e */
    private void m23102e(int i, int i2, Call eVar, EventListener pVar) throws IOException {
        Socket socket;
        Proxy b = this.f18133c.mo19710b();
        Address a = this.f18133c.mo19709a();
        if (b.type() == Type.DIRECT || b.type() == Type.HTTP) {
            socket = a.mo19651j().createSocket();
        } else {
            socket = new Socket(b);
        }
        this.f18134d = socket;
        pVar.mo20026f(eVar, this.f18133c.mo19712d(), b);
        this.f18134d.setSoTimeout(i2);
        try {
            C3358g.m23494l().mo19938h(this.f18134d, this.f18133c.mo19712d(), i);
            try {
                this.f18139i = Okio.m23920c(Okio.m23928k(this.f18134d));
                this.f18140j = Okio.m23919b(Okio.m23925h(this.f18134d));
            } catch (NullPointerException e) {
                if ("throw with null exception".equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to connect to ");
            sb.append(this.f18133c.mo19712d());
            ConnectException connectException = new ConnectException(sb.toString());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.net.Socket, javax.net.ssl.SSLSocket] */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.net.Socket, javax.net.ssl.SSLSocket] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r2v6, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v2
  assigns: []
  uses: []
  mth insns count: 110
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0135 A[Catch:{ all -> 0x012c }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x013b A[Catch:{ all -> 0x012c }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x013e  */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m23103f(p271e.p272f0.p274f.ConnectionSpecSelector r8) throws java.io.IOException {
        /*
            r7 = this;
            e.d0 r0 = r7.f18133c
            e.a r0 = r0.mo19709a()
            javax.net.ssl.SSLSocketFactory r1 = r0.mo19652k()
            r2 = 0
            java.net.Socket r3 = r7.f18134d     // Catch:{ AssertionError -> 0x012e }
            e.t r4 = r0.mo19653l()     // Catch:{ AssertionError -> 0x012e }
            java.lang.String r4 = r4.mo20075m()     // Catch:{ AssertionError -> 0x012e }
            e.t r5 = r0.mo19653l()     // Catch:{ AssertionError -> 0x012e }
            int r5 = r5.mo20080y()     // Catch:{ AssertionError -> 0x012e }
            r6 = 1
            java.net.Socket r1 = r1.createSocket(r3, r4, r5, r6)     // Catch:{ AssertionError -> 0x012e }
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch:{ AssertionError -> 0x012e }
            e.k r8 = r8.mo19749a(r1)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            boolean r3 = r8.mo19994f()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            if (r3 == 0) goto L_0x0041
            e.f0.j.g r3 = p271e.p272f0.p278j.C3358g.m23494l()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            e.t r4 = r0.mo19653l()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r4 = r4.mo20075m()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.util.List r5 = r0.mo19646f()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r3.mo19934g(r1, r4, r5)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
        L_0x0041:
            r1.startHandshake()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            javax.net.ssl.SSLSession r3 = r1.getSession()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            e.r r4 = p271e.Handshake.m23610b(r3)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            javax.net.ssl.HostnameVerifier r5 = r0.mo19644e()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            e.t r6 = r0.mo19653l()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r6 = r6.mo20075m()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            boolean r3 = r5.verify(r6, r3)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            if (r3 != 0) goto L_0x00d8
            java.util.List r8 = r4.mo20045c()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            boolean r2 = r8.isEmpty()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r3 = "Hostname "
            if (r2 != 0) goto L_0x00b6
            r2 = 0
            java.lang.Object r8 = r8.get(r2)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.security.cert.X509Certificate r8 = (java.security.cert.X509Certificate) r8     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            javax.net.ssl.SSLPeerUnverifiedException r2 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r4.<init>()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r4.append(r3)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            e.t r0 = r0.mo19653l()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = r0.mo20075m()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r4.append(r0)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = " not verified:\n    certificate: "
            r4.append(r0)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = p271e.CertificatePinner.m23521c(r8)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r4.append(r0)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = "\n    DN: "
            r4.append(r0)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.security.Principal r0 = r8.getSubjectDN()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = r0.getName()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r4.append(r0)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = "\n    subjectAltNames: "
            r4.append(r0)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.util.List r8 = p271e.p272f0.p280l.OkHostnameVerifier.m23514a(r8)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r4.append(r8)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r8 = r4.toString()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r2.<init>(r8)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            throw r2     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
        L_0x00b6:
            javax.net.ssl.SSLPeerUnverifiedException r8 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r2.<init>()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r2.append(r3)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            e.t r0 = r0.mo19653l()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = r0.mo20075m()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r2.append(r0)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = " not verified (no certificates)"
            r2.append(r0)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = r2.toString()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r8.<init>(r0)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            throw r8     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
        L_0x00d8:
            e.g r3 = r0.mo19640a()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            e.t r0 = r0.mo19653l()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = r0.mo20075m()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.util.List r5 = r4.mo20045c()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r3.mo19970a(r0, r5)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            boolean r8 = r8.mo19994f()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            if (r8 == 0) goto L_0x00f9
            e.f0.j.g r8 = p271e.p272f0.p278j.C3358g.m23494l()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r2 = r8.mo19935n(r1)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
        L_0x00f9:
            r7.f18135e = r1     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            f.s r8 = p281f.Okio.m23928k(r1)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            f.e r8 = p281f.Okio.m23920c(r8)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r7.f18139i = r8     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.net.Socket r8 = r7.f18135e     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            f.r r8 = p281f.Okio.m23925h(r8)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            f.d r8 = p281f.Okio.m23919b(r8)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r7.f18140j = r8     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r7.f18136f = r4     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            if (r2 == 0) goto L_0x011a
            e.x r8 = p271e.Protocol.m23733a(r2)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            goto L_0x011c
        L_0x011a:
            e.x r8 = p271e.Protocol.HTTP_1_1     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
        L_0x011c:
            r7.f18137g = r8     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            e.f0.j.g r8 = p271e.p272f0.p278j.C3358g.m23494l()
            r8.mo19953a(r1)
            return
        L_0x0126:
            r8 = move-exception
            r2 = r1
            goto L_0x013c
        L_0x0129:
            r8 = move-exception
            r2 = r1
            goto L_0x012f
        L_0x012c:
            r8 = move-exception
            goto L_0x013c
        L_0x012e:
            r8 = move-exception
        L_0x012f:
            boolean r0 = p271e.p272f0.C3310c.m23072z(r8)     // Catch:{ all -> 0x012c }
            if (r0 == 0) goto L_0x013b
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x012c }
            r0.<init>(r8)     // Catch:{ all -> 0x012c }
            throw r0     // Catch:{ all -> 0x012c }
        L_0x013b:
            throw r8     // Catch:{ all -> 0x012c }
        L_0x013c:
            if (r2 == 0) goto L_0x0145
            e.f0.j.g r0 = p271e.p272f0.p278j.C3358g.m23494l()
            r0.mo19953a(r2)
        L_0x0145:
            p271e.p272f0.C3310c.m23053g(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p271e.p272f0.p274f.RealConnection.m23103f(e.f0.f.b):void");
    }

    /* renamed from: g */
    private void m23104g(int i, int i2, int i3, Call eVar, EventListener pVar) throws IOException {
        C3378z i4 = m23106i();
        HttpUrl i5 = i4.mo20147i();
        int i6 = 0;
        while (i6 < 21) {
            m23102e(i, i2, eVar, pVar);
            i4 = m23105h(i2, i3, i4, i5);
            if (i4 != null) {
                C3310c.m23053g(this.f18134d);
                this.f18134d = null;
                this.f18140j = null;
                this.f18139i = null;
                pVar.mo20024d(eVar, this.f18133c.mo19712d(), this.f18133c.mo19710b(), null);
                i6++;
            } else {
                return;
            }
        }
    }

    /* renamed from: h */
    private C3378z m23105h(int i, int i2, C3378z zVar, HttpUrl tVar) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("CONNECT ");
        sb.append(C3310c.m23064r(tVar, true));
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        while (true) {
            Http1Codec aVar = new Http1Codec(null, null, this.f18139i, this.f18140j);
            Timeout d = this.f18139i.mo19738d();
            long j = (long) i;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            d.mo20265g(j, timeUnit);
            this.f18140j.mo19824d().mo20265g((long) i2, timeUnit);
            aVar.mo19821o(zVar.mo20142d(), sb2);
            aVar.mo19790a();
            Response c = aVar.mo19796f(false).mo19688p(zVar).mo19677c();
            long b = HttpHeaders.m23170b(c);
            if (b == -1) {
                b = 0;
            }
            Source k = aVar.mo19818k(b);
            C3310c.m23040C(k, Integer.MAX_VALUE, timeUnit);
            k.close();
            int D = c.mo19661D();
            if (D != 200) {
                if (D == 407) {
                    C3378z a = this.f18133c.mo19709a().mo19648h().mo19658a(this.f18133c, c);
                    if (a != null) {
                        if ("close".equalsIgnoreCase(c.mo19663F("Connection"))) {
                            return a;
                        }
                        zVar = a;
                    } else {
                        throw new IOException("Failed to authenticate with proxy");
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Unexpected response code for CONNECT: ");
                    sb3.append(c.mo19661D());
                    throw new IOException(sb3.toString());
                }
            } else if (this.f18139i.mo20196c().mo20217m() && this.f18140j.mo20196c().mo20217m()) {
                return null;
            } else {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        }
    }

    /* renamed from: i */
    private C3378z m23106i() throws IOException {
        C3378z b = new C3379a().mo20160l(this.f18133c.mo19709a().mo19653l()).mo20154f("CONNECT", null).mo20152d("Host", C3310c.m23064r(this.f18133c.mo19709a().mo19653l(), true)).mo20152d("Proxy-Connection", "Keep-Alive").mo20152d("User-Agent", C3313d.m23074a()).mo20150b();
        C3378z a = this.f18133c.mo19709a().mo19648h().mo19658a(this.f18133c, new C3306a().mo19688p(b).mo19686n(Protocol.HTTP_1_1).mo19679g(407).mo19683k("Preemptive Authenticate").mo19676b(C3310c.f18088c).mo19689q(-1).mo19687o(-1).mo19681i("Proxy-Authenticate", "OkHttp-Preemptive").mo19677c());
        return a != null ? a : b;
    }

    /* renamed from: j */
    private void m23107j(ConnectionSpecSelector bVar, int i, Call eVar, EventListener pVar) throws IOException {
        if (this.f18133c.mo19709a().mo19652k() == null) {
            List f = this.f18133c.mo19709a().mo19646f();
            Protocol xVar = Protocol.H2_PRIOR_KNOWLEDGE;
            if (f.contains(xVar)) {
                this.f18135e = this.f18134d;
                this.f18137g = xVar;
                m23108r(i);
                return;
            }
            this.f18135e = this.f18134d;
            this.f18137g = Protocol.HTTP_1_1;
            return;
        }
        pVar.mo20040u(eVar);
        m23103f(bVar);
        pVar.mo20039t(eVar, this.f18136f);
        if (this.f18137g == Protocol.HTTP_2) {
            m23108r(i);
        }
    }

    /* renamed from: r */
    private void m23108r(int i) throws IOException {
        this.f18135e.setSoTimeout(0);
        Http2Connection a = new C3338h(true).mo19864d(this.f18135e, this.f18133c.mo19709a().mo19653l().mo20075m(), this.f18139i, this.f18140j).mo19862b(this).mo19863c(i).mo19861a();
        this.f18138h = a;
        a.mo19851c0();
    }

    /* renamed from: a */
    public void mo19751a(Http2Connection gVar) {
        synchronized (this.f18132b) {
            this.f18143m = gVar.mo19841Q();
        }
    }

    /* renamed from: b */
    public void mo19752b(Http2Stream iVar) throws IOException {
        iVar.mo19882f(ErrorCode.REFUSED_STREAM);
    }

    /* renamed from: c */
    public void mo19753c() {
        C3310c.m23053g(this.f18134d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0142 A[EDGE_INSN: B:63:0x0142->B:56:0x0142 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19754d(int r17, int r18, int r19, int r20, boolean r21, p271e.Call r22, p271e.EventListener r23) {
        /*
            r16 = this;
            r7 = r16
            r8 = r22
            r9 = r23
            e.x r0 = r7.f18137g
            if (r0 != 0) goto L_0x0150
            e.d0 r0 = r7.f18133c
            e.a r0 = r0.mo19709a()
            java.util.List r0 = r0.mo19641b()
            e.f0.f.b r10 = new e.f0.f.b
            r10.<init>(r0)
            e.d0 r1 = r7.f18133c
            e.a r1 = r1.mo19709a()
            javax.net.ssl.SSLSocketFactory r1 = r1.mo19652k()
            if (r1 != 0) goto L_0x0074
            e.k r1 = p271e.ConnectionSpec.f18582f
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0067
            e.d0 r0 = r7.f18133c
            e.a r0 = r0.mo19709a()
            e.t r0 = r0.mo19653l()
            java.lang.String r0 = r0.mo20075m()
            e.f0.j.g r1 = p271e.p272f0.p278j.C3358g.m23494l()
            boolean r1 = r1.mo19941q(r0)
            if (r1 == 0) goto L_0x0046
            goto L_0x0086
        L_0x0046:
            e.f0.f.e r1 = new e.f0.f.e
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "CLEARTEXT communication to "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " not permitted by network security policy"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x0067:
            e.f0.f.e r0 = new e.f0.f.e
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0074:
            e.d0 r0 = r7.f18133c
            e.a r0 = r0.mo19709a()
            java.util.List r0 = r0.mo19646f()
            e.x r1 = p271e.Protocol.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0143
        L_0x0086:
            r11 = 0
            r12 = r11
        L_0x0088:
            e.d0 r0 = r7.f18133c     // Catch:{ IOException -> 0x00f9 }
            boolean r0 = r0.mo19711c()     // Catch:{ IOException -> 0x00f9 }
            if (r0 == 0) goto L_0x00a9
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r23
            r1.m23104g(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x00f9 }
            java.net.Socket r0 = r7.f18134d     // Catch:{ IOException -> 0x00f9 }
            if (r0 != 0) goto L_0x00a4
            goto L_0x00c6
        L_0x00a4:
            r13 = r17
            r14 = r18
            goto L_0x00b0
        L_0x00a9:
            r13 = r17
            r14 = r18
            r7.m23102e(r13, r14, r8, r9)     // Catch:{ IOException -> 0x00f7 }
        L_0x00b0:
            r15 = r20
            r7.m23107j(r10, r15, r8, r9)     // Catch:{ IOException -> 0x00f5 }
            e.d0 r0 = r7.f18133c     // Catch:{ IOException -> 0x00f5 }
            java.net.InetSocketAddress r0 = r0.mo19712d()     // Catch:{ IOException -> 0x00f5 }
            e.d0 r1 = r7.f18133c     // Catch:{ IOException -> 0x00f5 }
            java.net.Proxy r1 = r1.mo19710b()     // Catch:{ IOException -> 0x00f5 }
            e.x r2 = r7.f18137g     // Catch:{ IOException -> 0x00f5 }
            r9.mo20024d(r8, r0, r1, r2)     // Catch:{ IOException -> 0x00f5 }
        L_0x00c6:
            e.d0 r0 = r7.f18133c
            boolean r0 = r0.mo19711c()
            if (r0 == 0) goto L_0x00e0
            java.net.Socket r0 = r7.f18134d
            if (r0 == 0) goto L_0x00d3
            goto L_0x00e0
        L_0x00d3:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Too many tunnel connections attempted: 21"
            r0.<init>(r1)
            e.f0.f.e r1 = new e.f0.f.e
            r1.<init>(r0)
            throw r1
        L_0x00e0:
            e.f0.i.g r0 = r7.f18138h
            if (r0 == 0) goto L_0x00f4
            e.j r1 = r7.f18132b
            monitor-enter(r1)
            e.f0.i.g r0 = r7.f18138h     // Catch:{ all -> 0x00f1 }
            int r0 = r0.mo19841Q()     // Catch:{ all -> 0x00f1 }
            r7.f18143m = r0     // Catch:{ all -> 0x00f1 }
            monitor-exit(r1)     // Catch:{ all -> 0x00f1 }
            goto L_0x00f4
        L_0x00f1:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00f1 }
            throw r0
        L_0x00f4:
            return
        L_0x00f5:
            r0 = move-exception
            goto L_0x0100
        L_0x00f7:
            r0 = move-exception
            goto L_0x00fe
        L_0x00f9:
            r0 = move-exception
            r13 = r17
            r14 = r18
        L_0x00fe:
            r15 = r20
        L_0x0100:
            java.net.Socket r1 = r7.f18135e
            p271e.p272f0.C3310c.m23053g(r1)
            java.net.Socket r1 = r7.f18134d
            p271e.p272f0.C3310c.m23053g(r1)
            r7.f18135e = r11
            r7.f18134d = r11
            r7.f18139i = r11
            r7.f18140j = r11
            r7.f18136f = r11
            r7.f18137g = r11
            r7.f18138h = r11
            e.d0 r1 = r7.f18133c
            java.net.InetSocketAddress r3 = r1.mo19712d()
            e.d0 r1 = r7.f18133c
            java.net.Proxy r4 = r1.mo19710b()
            r5 = 0
            r1 = r23
            r2 = r22
            r6 = r0
            r1.mo20025e(r2, r3, r4, r5, r6)
            if (r12 != 0) goto L_0x0135
            e.f0.f.e r12 = new e.f0.f.e
            r12.<init>(r0)
            goto L_0x0138
        L_0x0135:
            r12.mo19767a(r0)
        L_0x0138:
            if (r21 == 0) goto L_0x0142
            boolean r0 = r10.mo19750b(r0)
            if (r0 == 0) goto L_0x0142
            goto L_0x0088
        L_0x0142:
            throw r12
        L_0x0143:
            e.f0.f.e r0 = new e.f0.f.e
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0150:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            r0.<init>(r1)
            goto L_0x0159
        L_0x0158:
            throw r0
        L_0x0159:
            goto L_0x0158
        */
        throw new UnsupportedOperationException("Method not decompiled: p271e.p272f0.p274f.RealConnection.mo19754d(int, int, int, int, boolean, e.e, e.p):void");
    }

    /* renamed from: k */
    public Handshake mo19755k() {
        return this.f18136f;
    }

    /* renamed from: l */
    public boolean mo19756l(Address aVar, Route d0Var) {
        if (this.f18144n.size() >= this.f18143m || this.f18141k || !Internal.f18084a.mo19727g(this.f18133c.mo19709a(), aVar)) {
            return false;
        }
        if (aVar.mo19653l().mo20075m().equals(mo19760p().mo19709a().mo19653l().mo20075m())) {
            return true;
        }
        if (this.f18138h == null || d0Var == null || d0Var.mo19710b().type() != Type.DIRECT || this.f18133c.mo19710b().type() != Type.DIRECT || !this.f18133c.mo19712d().equals(d0Var.mo19712d()) || d0Var.mo19709a().mo19644e() != OkHostnameVerifier.f18438a || !mo19762s(aVar.mo19653l())) {
            return false;
        }
        try {
            aVar.mo19640a().mo19970a(aVar.mo19653l().mo20075m(), mo19755k().mo20045c());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    /* renamed from: m */
    public boolean mo19757m(boolean z) {
        int soTimeout;
        if (this.f18135e.isClosed() || this.f18135e.isInputShutdown() || this.f18135e.isOutputShutdown()) {
            return false;
        }
        Http2Connection gVar = this.f18138h;
        if (gVar != null) {
            return gVar.mo19840P(System.nanoTime());
        }
        if (z) {
            try {
                soTimeout = this.f18135e.getSoTimeout();
                this.f18135e.setSoTimeout(1);
                if (this.f18139i.mo20217m()) {
                    this.f18135e.setSoTimeout(soTimeout);
                    return false;
                }
                this.f18135e.setSoTimeout(soTimeout);
                return true;
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            } catch (Throwable th) {
                this.f18135e.setSoTimeout(soTimeout);
                throw th;
            }
        }
        return true;
    }

    /* renamed from: n */
    public boolean mo19758n() {
        return this.f18138h != null;
    }

    /* renamed from: o */
    public HttpCodec mo19759o(OkHttpClient wVar, C3373a aVar, StreamAllocation gVar) throws SocketException {
        if (this.f18138h != null) {
            return new Http2Codec(wVar, aVar, gVar, this.f18138h);
        }
        this.f18135e.setSoTimeout(aVar.mo19801b());
        Timeout d = this.f18139i.mo19738d();
        long b = (long) aVar.mo19801b();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        d.mo20265g(b, timeUnit);
        this.f18140j.mo19824d().mo20265g((long) aVar.mo19802c(), timeUnit);
        return new Http1Codec(wVar, gVar, this.f18139i, this.f18140j);
    }

    /* renamed from: p */
    public Route mo19760p() {
        return this.f18133c;
    }

    /* renamed from: q */
    public Socket mo19761q() {
        return this.f18135e;
    }

    /* renamed from: s */
    public boolean mo19762s(HttpUrl tVar) {
        boolean z = false;
        if (tVar.mo20080y() != this.f18133c.mo19709a().mo19653l().mo20080y()) {
            return false;
        }
        if (tVar.mo20075m().equals(this.f18133c.mo19709a().mo19653l().mo20075m())) {
            return true;
        }
        if (this.f18136f != null && OkHostnameVerifier.f18438a.mo19967c(tVar.mo20075m(), (X509Certificate) this.f18136f.mo20045c().get(0))) {
            z = true;
        }
        return z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f18133c.mo19709a().mo19653l().mo20075m());
        sb.append(":");
        sb.append(this.f18133c.mo19709a().mo19653l().mo20080y());
        sb.append(", proxy=");
        sb.append(this.f18133c.mo19710b());
        sb.append(" hostAddress=");
        sb.append(this.f18133c.mo19712d());
        sb.append(" cipherSuite=");
        Handshake rVar = this.f18136f;
        sb.append(rVar != null ? rVar.mo20044a() : Constants.CP_NONE);
        sb.append(" protocol=");
        sb.append(this.f18137g);
        sb.append('}');
        return sb.toString();
    }
}
