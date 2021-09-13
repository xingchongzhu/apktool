package p271e;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.util.Objects;

/* renamed from: e.d0 */
public final class Route {

    /* renamed from: a */
    final Address f18074a;

    /* renamed from: b */
    final Proxy f18075b;

    /* renamed from: c */
    final InetSocketAddress f18076c;

    public Route(Address aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        Objects.requireNonNull(aVar, "address == null");
        Objects.requireNonNull(proxy, "proxy == null");
        Objects.requireNonNull(inetSocketAddress, "inetSocketAddress == null");
        this.f18074a = aVar;
        this.f18075b = proxy;
        this.f18076c = inetSocketAddress;
    }

    /* renamed from: a */
    public Address mo19709a() {
        return this.f18074a;
    }

    /* renamed from: b */
    public Proxy mo19710b() {
        return this.f18075b;
    }

    /* renamed from: c */
    public boolean mo19711c() {
        return this.f18074a.f18015i != null && this.f18075b.type() == Type.HTTP;
    }

    /* renamed from: d */
    public InetSocketAddress mo19712d() {
        return this.f18076c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Route) {
            Route d0Var = (Route) obj;
            if (d0Var.f18074a.equals(this.f18074a) && d0Var.f18075b.equals(this.f18075b) && d0Var.f18076c.equals(this.f18076c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f18074a.hashCode()) * 31) + this.f18075b.hashCode()) * 31) + this.f18076c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Route{");
        sb.append(this.f18076c);
        sb.append("}");
        return sb.toString();
    }
}
