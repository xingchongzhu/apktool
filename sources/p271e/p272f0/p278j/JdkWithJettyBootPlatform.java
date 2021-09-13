package p271e.p272f0.p278j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p271e.Protocol;
import p271e.p272f0.C3310c;

/* renamed from: e.f0.j.e */
class JdkWithJettyBootPlatform extends C3358g {

    /* renamed from: c */
    private final Method f18423c;

    /* renamed from: d */
    private final Method f18424d;

    /* renamed from: e */
    private final Method f18425e;

    /* renamed from: f */
    private final Class<?> f18426f;

    /* renamed from: g */
    private final Class<?> f18427g;

    /* renamed from: e.f0.j.e$a */
    /* compiled from: JdkWithJettyBootPlatform */
    private static class C3357a implements InvocationHandler {

        /* renamed from: a */
        private final List<String> f18428a;

        /* renamed from: b */
        boolean f18429b;

        /* renamed from: c */
        String f18430c;

        C3357a(List<String> list) {
            this.f18428a = list;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<String> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = C3310c.f18087b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f18429b = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.f18428a;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    List list = (List) objArr[0];
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f18428a.contains(list.get(i))) {
                            String str = (String) list.get(i);
                            this.f18430c = str;
                            return str;
                        }
                    }
                    String str2 = (String) this.f18428a.get(0);
                    this.f18430c = str2;
                    return str2;
                } else if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                } else {
                    this.f18430c = (String) objArr[0];
                    return null;
                }
            }
        }
    }

    JdkWithJettyBootPlatform(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f18423c = method;
        this.f18424d = method2;
        this.f18425e = method3;
        this.f18426f = cls;
        this.f18427g = cls2;
    }

    /* renamed from: u */
    public static C3358g m23478u() {
        String str = "org.eclipse.jetty.alpn.ALPN";
        try {
            Class cls = Class.forName("org.eclipse.jetty.alpn.ALPN");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("$Provider");
            Class cls2 = Class.forName(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("$ClientProvider");
            Class cls3 = Class.forName(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append("$ServerProvider");
            Class cls4 = Class.forName(sb3.toString());
            Method method = cls.getMethod("put", new Class[]{SSLSocket.class, cls2});
            Method method2 = method;
            JdkWithJettyBootPlatform eVar = new JdkWithJettyBootPlatform(method2, cls.getMethod("get", new Class[]{SSLSocket.class}), cls.getMethod("remove", new Class[]{SSLSocket.class}), cls3, cls4);
            return eVar;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void mo19953a(SSLSocket sSLSocket) {
        try {
            this.f18425e.invoke(null, new Object[]{sSLSocket});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C3310c.m23048b("unable to remove alpn", e);
        }
    }

    /* renamed from: g */
    public void mo19934g(SSLSocket sSLSocket, String str, List<Protocol> list) {
        List b = C3358g.m23489b(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(C3358g.class.getClassLoader(), new Class[]{this.f18426f, this.f18427g}, new C3357a(b));
            this.f18423c.invoke(null, new Object[]{sSLSocket, newProxyInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C3310c.m23048b("unable to set alpn", e);
        }
    }

    /* renamed from: n */
    public String mo19935n(SSLSocket sSLSocket) {
        try {
            Object[] objArr = {sSLSocket};
            String str = null;
            C3357a aVar = (C3357a) Proxy.getInvocationHandler(this.f18424d.invoke(null, objArr));
            boolean z = aVar.f18429b;
            if (z || aVar.f18430c != null) {
                if (!z) {
                    str = aVar.f18430c;
                }
                return str;
            }
            C3358g.m23494l().mo19942s(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C3310c.m23048b("unable to get selected protocol", e);
        }
    }
}
