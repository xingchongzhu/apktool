package p271e;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import p271e.C3370s.C3371a;
import p271e.EventListener.C3368c;
import p271e.Response.C3306a;
import p271e.p272f0.C3310c;
import p271e.p272f0.Internal;
import p271e.p272f0.p273e.InternalCache;
import p271e.p272f0.p274f.RealConnection;
import p271e.p272f0.p274f.RouteDatabase;
import p271e.p272f0.p274f.StreamAllocation;
import p271e.p272f0.p278j.C3358g;
import p271e.p272f0.p279k.NullProxySelector;
import p271e.p272f0.p280l.CertificateChainCleaner;
import p271e.p272f0.p280l.OkHostnameVerifier;

/* renamed from: e.w */
public class OkHttpClient implements Cloneable {

    /* renamed from: a */
    static final List<Protocol> f18651a = C3310c.m23066t(Protocol.HTTP_2, Protocol.HTTP_1_1);

    /* renamed from: b */
    static final List<ConnectionSpec> f18652b = C3310c.m23066t(ConnectionSpec.f18580d, ConnectionSpec.f18582f);

    /* renamed from: A */
    final int f18653A;

    /* renamed from: B */
    final int f18654B;

    /* renamed from: C */
    final int f18655C;

    /* renamed from: D */
    final int f18656D;

    /* renamed from: c */
    final Dispatcher f18657c;

    /* renamed from: d */
    final Proxy f18658d;

    /* renamed from: e */
    final List<Protocol> f18659e;

    /* renamed from: f */
    final List<ConnectionSpec> f18660f;

    /* renamed from: g */
    final List<Interceptor> f18661g;

    /* renamed from: h */
    final List<Interceptor> f18662h;

    /* renamed from: i */
    final C3368c f18663i;

    /* renamed from: j */
    final ProxySelector f18664j;

    /* renamed from: k */
    final CookieJar f18665k;

    /* renamed from: l */
    final C3307c f18666l;

    /* renamed from: m */
    final InternalCache f18667m;

    /* renamed from: n */
    final SocketFactory f18668n;

    /* renamed from: o */
    final SSLSocketFactory f18669o;

    /* renamed from: p */
    final CertificateChainCleaner f18670p;

    /* renamed from: q */
    final HostnameVerifier f18671q;

    /* renamed from: r */
    final CertificatePinner f18672r;

    /* renamed from: s */
    final Authenticator f18673s;

    /* renamed from: t */
    final Authenticator f18674t;

    /* renamed from: u */
    final ConnectionPool f18675u;

    /* renamed from: v */
    final Dns f18676v;

    /* renamed from: w */
    final boolean f18677w;

    /* renamed from: x */
    final boolean f18678x;

    /* renamed from: y */
    final boolean f18679y;

    /* renamed from: z */
    final int f18680z;

    /* renamed from: e.w$a */
    /* compiled from: OkHttpClient */
    class C3374a extends Internal {
        C3374a() {
        }

        /* renamed from: a */
        public void mo19721a(C3371a aVar, String str) {
            aVar.mo20058b(str);
        }

        /* renamed from: b */
        public void mo19722b(C3371a aVar, String str, String str2) {
            aVar.mo20059c(str, str2);
        }

        /* renamed from: c */
        public void mo19723c(ConnectionSpec kVar, SSLSocket sSLSocket, boolean z) {
            kVar.mo19989a(sSLSocket, z);
        }

        /* renamed from: d */
        public int mo19724d(C3306a aVar) {
            return aVar.f18038c;
        }

        /* renamed from: e */
        public boolean mo19725e(ConnectionPool jVar, RealConnection cVar) {
            return jVar.mo19984b(cVar);
        }

        /* renamed from: f */
        public Socket mo19726f(ConnectionPool jVar, Address aVar, StreamAllocation gVar) {
            return jVar.mo19985c(aVar, gVar);
        }

        /* renamed from: g */
        public boolean mo19727g(Address aVar, Address aVar2) {
            return aVar.mo19643d(aVar2);
        }

        /* renamed from: h */
        public RealConnection mo19728h(ConnectionPool jVar, Address aVar, StreamAllocation gVar, Route d0Var) {
            return jVar.mo19986d(aVar, gVar, d0Var);
        }

        /* renamed from: i */
        public void mo19729i(ConnectionPool jVar, RealConnection cVar) {
            jVar.mo19987f(cVar);
        }

        /* renamed from: j */
        public RouteDatabase mo19730j(ConnectionPool jVar) {
            return jVar.f18574f;
        }

        /* renamed from: k */
        public IOException mo19731k(Call eVar, IOException iOException) {
            return ((RealCall) eVar).mo20134g(iOException);
        }
    }

    /* renamed from: e.w$b */
    /* compiled from: OkHttpClient */
    public static final class C3375b {

        /* renamed from: A */
        int f18681A;

        /* renamed from: a */
        Dispatcher f18682a = new Dispatcher();

        /* renamed from: b */
        Proxy f18683b;

        /* renamed from: c */
        List<Protocol> f18684c = OkHttpClient.f18651a;

        /* renamed from: d */
        List<ConnectionSpec> f18685d = OkHttpClient.f18652b;

        /* renamed from: e */
        final List<Interceptor> f18686e = new ArrayList();

        /* renamed from: f */
        final List<Interceptor> f18687f = new ArrayList();

        /* renamed from: g */
        C3368c f18688g = EventListener.m23581k(EventListener.f18613a);

        /* renamed from: h */
        ProxySelector f18689h;

        /* renamed from: i */
        CookieJar f18690i;

        /* renamed from: j */
        InternalCache f18691j;

        /* renamed from: k */
        SocketFactory f18692k;

        /* renamed from: l */
        SSLSocketFactory f18693l;

        /* renamed from: m */
        CertificateChainCleaner f18694m;

        /* renamed from: n */
        HostnameVerifier f18695n;

        /* renamed from: o */
        CertificatePinner f18696o;

        /* renamed from: p */
        Authenticator f18697p;

        /* renamed from: q */
        Authenticator f18698q;

        /* renamed from: r */
        ConnectionPool f18699r;

        /* renamed from: s */
        Dns f18700s;

        /* renamed from: t */
        boolean f18701t;

        /* renamed from: u */
        boolean f18702u;

        /* renamed from: v */
        boolean f18703v;

        /* renamed from: w */
        int f18704w;

        /* renamed from: x */
        int f18705x;

        /* renamed from: y */
        int f18706y;

        /* renamed from: z */
        int f18707z;

        public C3375b() {
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.f18689h = proxySelector;
            if (proxySelector == null) {
                this.f18689h = new NullProxySelector();
            }
            this.f18690i = CookieJar.f18604a;
            this.f18692k = SocketFactory.getDefault();
            this.f18695n = OkHostnameVerifier.f18438a;
            this.f18696o = CertificatePinner.f18439a;
            Authenticator bVar = Authenticator.f18022a;
            this.f18697p = bVar;
            this.f18698q = bVar;
            this.f18699r = new ConnectionPool();
            this.f18700s = Dns.f18612a;
            this.f18701t = true;
            this.f18702u = true;
            this.f18703v = true;
            this.f18704w = 0;
            this.f18705x = 10000;
            this.f18706y = 10000;
            this.f18707z = 10000;
            this.f18681A = 0;
        }

        /* renamed from: a */
        public C3375b mo20127a(Interceptor uVar) {
            if (uVar != null) {
                this.f18686e.add(uVar);
                return this;
            }
            throw new IllegalArgumentException("interceptor == null");
        }

        /* renamed from: b */
        public OkHttpClient mo20128b() {
            return new OkHttpClient(this);
        }
    }

    static {
        Internal.f18084a = new C3374a();
    }

    public OkHttpClient() {
        this(new C3375b());
    }

    /* renamed from: r */
    private static SSLSocketFactory m23692r(X509TrustManager x509TrustManager) {
        try {
            SSLContext m = C3358g.m23494l().mo19939m();
            m.init(null, new TrustManager[]{x509TrustManager}, null);
            return m.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw C3310c.m23048b("No System TLS", e);
        }
    }

    /* renamed from: A */
    public SSLSocketFactory mo20100A() {
        return this.f18669o;
    }

    /* renamed from: B */
    public int mo20101B() {
        return this.f18655C;
    }

    /* renamed from: a */
    public Authenticator mo20102a() {
        return this.f18674t;
    }

    /* renamed from: b */
    public int mo20103b() {
        return this.f18680z;
    }

    /* renamed from: c */
    public CertificatePinner mo20104c() {
        return this.f18672r;
    }

    /* renamed from: d */
    public int mo20105d() {
        return this.f18653A;
    }

    /* renamed from: e */
    public ConnectionPool mo20106e() {
        return this.f18675u;
    }

    /* renamed from: f */
    public List<ConnectionSpec> mo20107f() {
        return this.f18660f;
    }

    /* renamed from: g */
    public CookieJar mo20108g() {
        return this.f18665k;
    }

    /* renamed from: h */
    public Dispatcher mo20109h() {
        return this.f18657c;
    }

    /* renamed from: i */
    public Dns mo20110i() {
        return this.f18676v;
    }

    /* renamed from: j */
    public C3368c mo20111j() {
        return this.f18663i;
    }

    /* renamed from: k */
    public boolean mo20112k() {
        return this.f18678x;
    }

    /* renamed from: l */
    public boolean mo20113l() {
        return this.f18677w;
    }

    /* renamed from: m */
    public HostnameVerifier mo20114m() {
        return this.f18671q;
    }

    /* renamed from: n */
    public List<Interceptor> mo20115n() {
        return this.f18661g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public InternalCache mo20116o() {
        if (this.f18666l == null) {
            return this.f18667m;
        }
        throw null;
    }

    /* renamed from: p */
    public List<Interceptor> mo20117p() {
        return this.f18662h;
    }

    /* renamed from: q */
    public Call mo20118q(C3378z zVar) {
        return RealCall.m23736e(this, zVar, false);
    }

    /* renamed from: s */
    public int mo20119s() {
        return this.f18656D;
    }

    /* renamed from: t */
    public List<Protocol> mo20120t() {
        return this.f18659e;
    }

    /* renamed from: u */
    public Proxy mo20121u() {
        return this.f18658d;
    }

    /* renamed from: v */
    public Authenticator mo20122v() {
        return this.f18673s;
    }

    /* renamed from: w */
    public ProxySelector mo20123w() {
        return this.f18664j;
    }

    /* renamed from: x */
    public int mo20124x() {
        return this.f18654B;
    }

    /* renamed from: y */
    public boolean mo20125y() {
        return this.f18679y;
    }

    /* renamed from: z */
    public SocketFactory mo20126z() {
        return this.f18668n;
    }

    OkHttpClient(C3375b bVar) {
        boolean z;
        this.f18657c = bVar.f18682a;
        this.f18658d = bVar.f18683b;
        this.f18659e = bVar.f18684c;
        List<ConnectionSpec> list = bVar.f18685d;
        this.f18660f = list;
        this.f18661g = C3310c.m23065s(bVar.f18686e);
        this.f18662h = C3310c.m23065s(bVar.f18687f);
        this.f18663i = bVar.f18688g;
        this.f18664j = bVar.f18689h;
        this.f18665k = bVar.f18690i;
        this.f18667m = bVar.f18691j;
        this.f18668n = bVar.f18692k;
        Iterator it = list.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                ConnectionSpec kVar = (ConnectionSpec) it.next();
                if (z || kVar.mo19992d()) {
                    z = true;
                }
            }
        }
        SSLSocketFactory sSLSocketFactory = bVar.f18693l;
        if (sSLSocketFactory != null || !z) {
            this.f18669o = sSLSocketFactory;
            this.f18670p = bVar.f18694m;
        } else {
            X509TrustManager B = C3310c.m23039B();
            this.f18669o = m23692r(B);
            this.f18670p = CertificateChainCleaner.m23512b(B);
        }
        if (this.f18669o != null) {
            C3358g.m23494l().mo19952f(this.f18669o);
        }
        this.f18671q = bVar.f18695n;
        this.f18672r = bVar.f18696o.mo19973f(this.f18670p);
        this.f18673s = bVar.f18697p;
        this.f18674t = bVar.f18698q;
        this.f18675u = bVar.f18699r;
        this.f18676v = bVar.f18700s;
        this.f18677w = bVar.f18701t;
        this.f18678x = bVar.f18702u;
        this.f18679y = bVar.f18703v;
        this.f18680z = bVar.f18704w;
        this.f18653A = bVar.f18705x;
        this.f18654B = bVar.f18706y;
        this.f18655C = bVar.f18707z;
        this.f18656D = bVar.f18681A;
        if (this.f18661g.contains(null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Null interceptor: ");
            sb.append(this.f18661g);
            throw new IllegalStateException(sb.toString());
        } else if (this.f18662h.contains(null)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Null network interceptor: ");
            sb2.append(this.f18662h);
            throw new IllegalStateException(sb2.toString());
        }
    }
}
