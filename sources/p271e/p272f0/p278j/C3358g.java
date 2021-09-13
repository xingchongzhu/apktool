package p271e.p272f0.p278j;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import p271e.OkHttpClient;
import p271e.Protocol;
import p271e.p272f0.p280l.BasicCertificateChainCleaner;
import p271e.p272f0.p280l.BasicTrustRootIndex;
import p271e.p272f0.p280l.CertificateChainCleaner;
import p271e.p272f0.p280l.TrustRootIndex;
import p281f.C3383c;

/* renamed from: e.f0.j.g */
/* compiled from: Platform */
public class C3358g {

    /* renamed from: a */
    private static final C3358g f18434a = m23493k();

    /* renamed from: b */
    private static final Logger f18435b = Logger.getLogger(OkHttpClient.class.getName());

    /* renamed from: b */
    public static List<String> m23489b(List<Protocol> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Protocol xVar = (Protocol) list.get(i);
            if (xVar != Protocol.HTTP_1_0) {
                arrayList.add(xVar.toString());
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    static byte[] m23490e(List<Protocol> list) {
        C3383c cVar = new C3383c();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Protocol xVar = (Protocol) list.get(i);
            if (xVar != Protocol.HTTP_1_0) {
                cVar.mo20218n(xVar.toString().length());
                cVar.mo20232w(xVar.toString());
            }
        }
        return cVar.mo20180K();
    }

    /* renamed from: i */
    private static C3358g m23491i() {
        C3358g w = Android10Platform.m23445w();
        if (w != null) {
            return w;
        }
        C3358g w2 = AndroidPlatform.m23451w();
        Objects.requireNonNull(w2, "No platform found on Android");
        return w2;
    }

    /* renamed from: j */
    private static C3358g m23492j() {
        if (m23496r()) {
            ConscryptPlatform u = ConscryptPlatform.m23469u();
            if (u != null) {
                return u;
            }
        }
        Jdk9Platform u2 = Jdk9Platform.m23475u();
        if (u2 != null) {
            return u2;
        }
        C3358g u3 = JdkWithJettyBootPlatform.m23478u();
        if (u3 != null) {
            return u3;
        }
        return new C3358g();
    }

    /* renamed from: k */
    private static C3358g m23493k() {
        if (m23495p()) {
            return m23491i();
        }
        return m23492j();
    }

    /* renamed from: l */
    public static C3358g m23494l() {
        return f18434a;
    }

    /* renamed from: p */
    public static boolean m23495p() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    /* renamed from: r */
    public static boolean m23496r() {
        if ("conscrypt".equals(System.getProperty("okhttp.platform"))) {
            return true;
        }
        return "Conscrypt".equals(Security.getProviders()[0].getName());
    }

    /* renamed from: a */
    public void mo19953a(SSLSocket sSLSocket) {
    }

    /* renamed from: c */
    public CertificateChainCleaner mo19936c(X509TrustManager x509TrustManager) {
        return new BasicCertificateChainCleaner(mo19937d(x509TrustManager));
    }

    /* renamed from: d */
    public TrustRootIndex mo19937d(X509TrustManager x509TrustManager) {
        return new BasicTrustRootIndex(x509TrustManager.getAcceptedIssuers());
    }

    /* renamed from: f */
    public void mo19952f(SSLSocketFactory sSLSocketFactory) {
    }

    /* renamed from: g */
    public void mo19934g(SSLSocket sSLSocket, String str, List<Protocol> list) throws IOException {
    }

    /* renamed from: h */
    public void mo19938h(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    /* renamed from: m */
    public SSLContext mo19939m() {
        if ("1.7".equals(System.getProperty("java.specification.version"))) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    /* renamed from: n */
    public String mo19935n(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: o */
    public Object mo19940o(String str) {
        if (f18435b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    /* renamed from: q */
    public boolean mo19941q(String str) {
        return true;
    }

    /* renamed from: s */
    public void mo19942s(int i, String str, Throwable th) {
        f18435b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* renamed from: t */
    public void mo19943t(String str, Object obj) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
            str = sb.toString();
        }
        mo19942s(5, str, (Throwable) obj);
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
