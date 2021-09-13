package p271e.p272f0.p274f;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import p271e.Address;
import p271e.Call;
import p271e.EventListener;
import p271e.HttpUrl;
import p271e.Route;
import p271e.p272f0.C3310c;

/* renamed from: e.f0.f.f */
public final class RouteSelector {

    /* renamed from: a */
    private final Address f18149a;

    /* renamed from: b */
    private final RouteDatabase f18150b;

    /* renamed from: c */
    private final Call f18151c;

    /* renamed from: d */
    private final EventListener f18152d;

    /* renamed from: e */
    private List<Proxy> f18153e = Collections.emptyList();

    /* renamed from: f */
    private int f18154f;

    /* renamed from: g */
    private List<InetSocketAddress> f18155g = Collections.emptyList();

    /* renamed from: h */
    private final List<Route> f18156h = new ArrayList();

    /* renamed from: e.f0.f.f$a */
    /* compiled from: RouteSelector */
    public static final class C3316a {

        /* renamed from: a */
        private final List<Route> f18157a;

        /* renamed from: b */
        private int f18158b = 0;

        C3316a(List<Route> list) {
            this.f18157a = list;
        }

        /* renamed from: a */
        public List<Route> mo19773a() {
            return new ArrayList(this.f18157a);
        }

        /* renamed from: b */
        public boolean mo19774b() {
            return this.f18158b < this.f18157a.size();
        }

        /* renamed from: c */
        public Route mo19775c() {
            if (mo19774b()) {
                List<Route> list = this.f18157a;
                int i = this.f18158b;
                this.f18158b = i + 1;
                return (Route) list.get(i);
            }
            throw new NoSuchElementException();
        }
    }

    public RouteSelector(Address aVar, RouteDatabase dVar, Call eVar, EventListener pVar) {
        this.f18149a = aVar;
        this.f18150b = dVar;
        this.f18151c = eVar;
        this.f18152d = pVar;
        m23131h(aVar.mo19653l(), aVar.mo19647g());
    }

    /* renamed from: b */
    static String m23127b(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        if (address == null) {
            return inetSocketAddress.getHostName();
        }
        return address.getHostAddress();
    }

    /* renamed from: d */
    private boolean m23128d() {
        return this.f18154f < this.f18153e.size();
    }

    /* renamed from: f */
    private Proxy m23129f() throws IOException {
        if (m23128d()) {
            List<Proxy> list = this.f18153e;
            int i = this.f18154f;
            this.f18154f = i + 1;
            Proxy proxy = (Proxy) list.get(i);
            m23130g(proxy);
            return proxy;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No route to ");
        sb.append(this.f18149a.mo19653l().mo20075m());
        sb.append("; exhausted proxy configurations: ");
        sb.append(this.f18153e);
        throw new SocketException(sb.toString());
    }

    /* renamed from: g */
    private void m23130g(Proxy proxy) throws IOException {
        String str;
        int i;
        this.f18155g = new ArrayList();
        if (proxy.type() == Type.DIRECT || proxy.type() == Type.SOCKS) {
            str = this.f18149a.mo19653l().mo20075m();
            i = this.f18149a.mo19653l().mo20080y();
        } else {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                str = m23127b(inetSocketAddress);
                i = inetSocketAddress.getPort();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Proxy.address() is not an InetSocketAddress: ");
                sb.append(address.getClass());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (i < 1 || i > 65535) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No route to ");
            sb2.append(str);
            sb2.append(":");
            sb2.append(i);
            sb2.append("; port is out of range");
            throw new SocketException(sb2.toString());
        } else if (proxy.type() == Type.SOCKS) {
            this.f18155g.add(InetSocketAddress.createUnresolved(str, i));
        } else {
            this.f18152d.mo20030j(this.f18151c, str);
            List a = this.f18149a.mo19642c().mo20020a(str);
            if (!a.isEmpty()) {
                this.f18152d.mo20029i(this.f18151c, str, a);
                int size = a.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.f18155g.add(new InetSocketAddress((InetAddress) a.get(i2), i));
                }
                return;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f18149a.mo19642c());
            sb3.append(" returned no addresses for ");
            sb3.append(str);
            throw new UnknownHostException(sb3.toString());
        }
    }

    /* renamed from: h */
    private void m23131h(HttpUrl tVar, Proxy proxy) {
        List<Proxy> list;
        if (proxy != null) {
            this.f18153e = Collections.singletonList(proxy);
        } else {
            List select = this.f18149a.mo19650i().select(tVar.mo20066E());
            if (select == null || select.isEmpty()) {
                list = C3310c.m23066t(Proxy.NO_PROXY);
            } else {
                list = C3310c.m23065s(select);
            }
            this.f18153e = list;
        }
        this.f18154f = 0;
    }

    /* renamed from: a */
    public void mo19770a(Route d0Var, IOException iOException) {
        if (!(d0Var.mo19710b().type() == Type.DIRECT || this.f18149a.mo19650i() == null)) {
            this.f18149a.mo19650i().connectFailed(this.f18149a.mo19653l().mo20066E(), d0Var.mo19710b().address(), iOException);
        }
        this.f18150b.mo19765b(d0Var);
    }

    /* renamed from: c */
    public boolean mo19771c() {
        return m23128d() || !this.f18156h.isEmpty();
    }

    /* renamed from: e */
    public C3316a mo19772e() throws IOException {
        if (mo19771c()) {
            ArrayList arrayList = new ArrayList();
            while (m23128d()) {
                Proxy f = m23129f();
                int size = this.f18155g.size();
                for (int i = 0; i < size; i++) {
                    Route d0Var = new Route(this.f18149a, f, (InetSocketAddress) this.f18155g.get(i));
                    if (this.f18150b.mo19766c(d0Var)) {
                        this.f18156h.add(d0Var);
                    } else {
                        arrayList.add(d0Var);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(this.f18156h);
                this.f18156h.clear();
            }
            return new C3316a(arrayList);
        }
        throw new NoSuchElementException();
    }
}
