package p271e.p272f0.p278j;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p271e.Protocol;
import p271e.p272f0.C3310c;

/* renamed from: e.f0.j.d */
final class Jdk9Platform extends C3358g {

    /* renamed from: c */
    final Method f18421c;

    /* renamed from: d */
    final Method f18422d;

    Jdk9Platform(Method method, Method method2) {
        this.f18421c = method;
        this.f18422d = method2;
    }

    /* renamed from: u */
    public static Jdk9Platform m23475u() {
        try {
            return new Jdk9Platform(SSLParameters.class.getMethod("setApplicationProtocols", new Class[]{String[].class}), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public void mo19934g(SSLSocket sSLSocket, String str, List<Protocol> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List b = C3358g.m23489b(list);
            this.f18421c.invoke(sSLParameters, new Object[]{b.toArray(new String[b.size()])});
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C3310c.m23048b("unable to set ssl parameters", e);
        }
    }

    /* renamed from: n */
    public String mo19935n(SSLSocket sSLSocket) {
        String str = "failed to get ALPN selected protocol";
        try {
            String str2 = (String) this.f18422d.invoke(sSLSocket, new Object[0]);
            if (str2 == null || str2.equals("")) {
                return null;
            }
            return str2;
        } catch (InvocationTargetException e) {
            if (e.getCause() instanceof UnsupportedOperationException) {
                return null;
            }
            throw C3310c.m23048b(str, e);
        } catch (IllegalAccessException e2) {
            throw C3310c.m23048b(str, e2);
        }
    }
}
