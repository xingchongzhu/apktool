package p271e.p272f0.p278j;

import android.os.Build.VERSION;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import p271e.Protocol;
import p271e.p272f0.C3310c;
import p271e.p272f0.p280l.CertificateChainCleaner;
import p271e.p272f0.p280l.TrustRootIndex;

/* renamed from: e.f0.j.b */
class AndroidPlatform extends C3358g {

    /* renamed from: c */
    private final Class<?> f18408c;

    /* renamed from: d */
    private final OptionalMethod<Socket> f18409d;

    /* renamed from: e */
    private final OptionalMethod<Socket> f18410e;

    /* renamed from: f */
    private final OptionalMethod<Socket> f18411f;

    /* renamed from: g */
    private final OptionalMethod<Socket> f18412g;

    /* renamed from: h */
    private final C3356c f18413h = C3356c.m23466b();

    /* renamed from: e.f0.j.b$a */
    /* compiled from: AndroidPlatform */
    static final class C3354a extends CertificateChainCleaner {

        /* renamed from: a */
        private final Object f18414a;

        /* renamed from: b */
        private final Method f18415b;

        C3354a(Object obj, Method method) {
            this.f18414a = obj;
            this.f18415b = method;
        }

        /* renamed from: a */
        public List<Certificate> mo19944a(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
            try {
                X509Certificate[] x509CertificateArr = (X509Certificate[]) list.toArray(new X509Certificate[list.size()]);
                return (List) this.f18415b.invoke(this.f18414a, new Object[]{x509CertificateArr, "RSA", str});
            } catch (InvocationTargetException e) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
                sSLPeerUnverifiedException.initCause(e);
                throw sSLPeerUnverifiedException;
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        public boolean equals(Object obj) {
            return obj instanceof C3354a;
        }

        public int hashCode() {
            return 0;
        }
    }

    /* renamed from: e.f0.j.b$b */
    /* compiled from: AndroidPlatform */
    static final class C3355b implements TrustRootIndex {

        /* renamed from: a */
        private final X509TrustManager f18416a;

        /* renamed from: b */
        private final Method f18417b;

        C3355b(X509TrustManager x509TrustManager, Method method) {
            this.f18417b = method;
            this.f18416a = x509TrustManager;
        }

        /* renamed from: a */
        public X509Certificate mo19947a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f18417b.invoke(this.f18416a, new Object[]{x509Certificate});
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
                return null;
            } catch (IllegalAccessException e) {
                throw C3310c.m23048b("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C3355b)) {
                return false;
            }
            C3355b bVar = (C3355b) obj;
            if (!this.f18416a.equals(bVar.f18416a) || !this.f18417b.equals(bVar.f18417b)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return this.f18416a.hashCode() + (this.f18417b.hashCode() * 31);
        }
    }

    /* renamed from: e.f0.j.b$c */
    /* compiled from: AndroidPlatform */
    static final class C3356c {

        /* renamed from: a */
        private final Method f18418a;

        /* renamed from: b */
        private final Method f18419b;

        /* renamed from: c */
        private final Method f18420c;

        C3356c(Method method, Method method2, Method method3) {
            this.f18418a = method;
            this.f18419b = method2;
            this.f18420c = method3;
        }

        /* renamed from: b */
        static C3356c m23466b() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", new Class[0]);
                method = cls.getMethod("open", new Class[]{String.class});
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method2 = null;
                method = null;
            }
            return new C3356c(method3, method, method2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Object mo19950a(String str) {
            Method method = this.f18418a;
            if (method != null) {
                try {
                    Object invoke = method.invoke(null, new Object[0]);
                    this.f18419b.invoke(invoke, new Object[]{str});
                    return invoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public boolean mo19951c(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                this.f18420c.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    AndroidPlatform(Class<?> cls, OptionalMethod<Socket> fVar, OptionalMethod<Socket> fVar2, OptionalMethod<Socket> fVar3, OptionalMethod<Socket> fVar4) {
        this.f18408c = cls;
        this.f18409d = fVar;
        this.f18410e = fVar2;
        this.f18411f = fVar3;
        this.f18412g = fVar4;
    }

    /* renamed from: u */
    private boolean m23449u(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.mo19941q(str);
        }
    }

    /* renamed from: v */
    private boolean m23450v(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[]{String.class}).invoke(obj, new Object[]{str})).booleanValue();
        } catch (NoSuchMethodException unused) {
            return m23449u(str, cls, obj);
        }
    }

    /* renamed from: w */
    public static C3358g m23451w() {
        Class cls;
        OptionalMethod fVar;
        OptionalMethod fVar2;
        Class<byte[]> cls2 = byte[].class;
        if (!C3358g.m23495p()) {
            return null;
        }
        try {
            cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
        } catch (ClassNotFoundException unused) {
            try {
                cls = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            } catch (ClassNotFoundException unused2) {
                return null;
            }
        }
        Class cls3 = cls;
        OptionalMethod fVar3 = new OptionalMethod(null, "setUseSessionTickets", Boolean.TYPE);
        OptionalMethod fVar4 = new OptionalMethod(null, "setHostname", String.class);
        if (m23453y()) {
            OptionalMethod fVar5 = new OptionalMethod(cls2, "getAlpnSelectedProtocol", new Class[0]);
            fVar = new OptionalMethod(null, "setAlpnProtocols", cls2);
            fVar2 = fVar5;
        } else {
            fVar2 = null;
            fVar = null;
        }
        AndroidPlatform bVar = new AndroidPlatform(cls3, fVar3, fVar4, fVar2, fVar);
        return bVar;
    }

    /* renamed from: x */
    static int m23452x() {
        try {
            return VERSION.SDK_INT;
        } catch (NoClassDefFoundError unused) {
            return 0;
        }
    }

    /* renamed from: y */
    private static boolean m23453y() {
        if (Security.getProvider("GMSCore_OpenSSL") != null) {
            return true;
        }
        try {
            Class.forName("android.net.Network");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public CertificateChainCleaner mo19936c(X509TrustManager x509TrustManager) {
        Class<String> cls = String.class;
        try {
            Class cls2 = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new C3354a(cls2.getConstructor(new Class[]{X509TrustManager.class}).newInstance(new Object[]{x509TrustManager}), cls2.getMethod("checkServerTrusted", new Class[]{X509Certificate[].class, cls, cls}));
        } catch (Exception unused) {
            return super.mo19936c(x509TrustManager);
        }
    }

    /* renamed from: d */
    public TrustRootIndex mo19937d(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            declaredMethod.setAccessible(true);
            return new C3355b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo19937d(x509TrustManager);
        }
    }

    /* renamed from: g */
    public void mo19934g(SSLSocket sSLSocket, String str, List<Protocol> list) throws IOException {
        if (str != null) {
            this.f18409d.mo19957e(sSLSocket, Boolean.TRUE);
            this.f18410e.mo19957e(sSLSocket, str);
        }
        OptionalMethod<Socket> fVar = this.f18412g;
        if (fVar != null && fVar.mo19959g(sSLSocket)) {
            this.f18412g.mo19958f(sSLSocket, C3358g.m23490e(list));
        }
    }

    /* renamed from: h */
    public void mo19938h(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        String str = "Exception in connect";
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (C3310c.m23072z(e)) {
                throw new IOException(e);
            }
            throw e;
        } catch (SecurityException e2) {
            IOException iOException = new IOException(str);
            iOException.initCause(e2);
            throw iOException;
        } catch (ClassCastException e3) {
            if (VERSION.SDK_INT == 26) {
                IOException iOException2 = new IOException(str);
                iOException2.initCause(e3);
                throw iOException2;
            }
            throw e3;
        }
    }

    /* renamed from: m */
    public SSLContext mo19939m() {
        boolean z = true;
        try {
            int i = VERSION.SDK_INT;
            if (i < 16 || i >= 22) {
                z = false;
            }
        } catch (NoClassDefFoundError unused) {
        }
        if (z) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused2) {
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
        OptionalMethod<Socket> fVar = this.f18411f;
        String str = null;
        if (fVar == null || !fVar.mo19959g(sSLSocket)) {
            return null;
        }
        byte[] bArr = (byte[]) this.f18411f.mo19958f(sSLSocket, new Object[0]);
        if (bArr != null) {
            str = new String(bArr, C3310c.f18095j);
        }
        return str;
    }

    /* renamed from: o */
    public Object mo19940o(String str) {
        return this.f18413h.mo19950a(str);
    }

    /* renamed from: q */
    public boolean mo19941q(String str) {
        if (VERSION.SDK_INT < 23) {
            return super.mo19941q(str);
        }
        try {
            Class cls = Class.forName("android.security.NetworkSecurityPolicy");
            return m23450v(str, cls, cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.mo19941q(str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw C3310c.m23048b("unable to determine cleartext support", e);
        }
    }

    /* renamed from: s */
    public void mo19942s(int i, String str, Throwable th) {
        int min;
        int i2 = 5;
        if (i != 5) {
            i2 = 3;
        }
        if (th != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(10);
            sb.append(Log.getStackTraceString(th));
            str = sb.toString();
        }
        int i3 = 0;
        int length = str.length();
        while (i3 < length) {
            int indexOf = str.indexOf(10, i3);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i3 + 4000);
                Log.println(i2, "OkHttp", str.substring(i3, min));
                if (min >= indexOf) {
                    break;
                }
                i3 = min;
            }
            i3 = min + 1;
        }
    }

    /* renamed from: t */
    public void mo19943t(String str, Object obj) {
        if (!this.f18413h.mo19951c(obj)) {
            mo19942s(5, str, null);
        }
    }
}
