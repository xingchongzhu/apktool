package p271e;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p271e.HttpUrl.C3372a;
import p271e.p272f0.C3310c;

/* renamed from: e.a */
public final class Address {

    /* renamed from: a */
    final HttpUrl f18007a;

    /* renamed from: b */
    final Dns f18008b;

    /* renamed from: c */
    final SocketFactory f18009c;

    /* renamed from: d */
    final Authenticator f18010d;

    /* renamed from: e */
    final List<Protocol> f18011e;

    /* renamed from: f */
    final List<ConnectionSpec> f18012f;

    /* renamed from: g */
    final ProxySelector f18013g;

    /* renamed from: h */
    final Proxy f18014h;

    /* renamed from: i */
    final SSLSocketFactory f18015i;

    /* renamed from: j */
    final HostnameVerifier f18016j;

    /* renamed from: k */
    final CertificatePinner f18017k;

    public Address(String str, int i, Dns oVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner gVar, Authenticator bVar, Proxy proxy, List<Protocol> list, List<ConnectionSpec> list2, ProxySelector proxySelector) {
        this.f18007a = new C3372a().mo20092t(sSLSocketFactory != null ? "https" : "http").mo20086f(str).mo20089m(i).mo20083b();
        Objects.requireNonNull(oVar, "dns == null");
        this.f18008b = oVar;
        Objects.requireNonNull(socketFactory, "socketFactory == null");
        this.f18009c = socketFactory;
        Objects.requireNonNull(bVar, "proxyAuthenticator == null");
        this.f18010d = bVar;
        Objects.requireNonNull(list, "protocols == null");
        this.f18011e = C3310c.m23065s(list);
        Objects.requireNonNull(list2, "connectionSpecs == null");
        this.f18012f = C3310c.m23065s(list2);
        Objects.requireNonNull(proxySelector, "proxySelector == null");
        this.f18013g = proxySelector;
        this.f18014h = proxy;
        this.f18015i = sSLSocketFactory;
        this.f18016j = hostnameVerifier;
        this.f18017k = gVar;
    }

    /* renamed from: a */
    public CertificatePinner mo19640a() {
        return this.f18017k;
    }

    /* renamed from: b */
    public List<ConnectionSpec> mo19641b() {
        return this.f18012f;
    }

    /* renamed from: c */
    public Dns mo19642c() {
        return this.f18008b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo19643d(Address aVar) {
        return this.f18008b.equals(aVar.f18008b) && this.f18010d.equals(aVar.f18010d) && this.f18011e.equals(aVar.f18011e) && this.f18012f.equals(aVar.f18012f) && this.f18013g.equals(aVar.f18013g) && C3310c.m23062p(this.f18014h, aVar.f18014h) && C3310c.m23062p(this.f18015i, aVar.f18015i) && C3310c.m23062p(this.f18016j, aVar.f18016j) && C3310c.m23062p(this.f18017k, aVar.f18017k) && mo19653l().mo20080y() == aVar.mo19653l().mo20080y();
    }

    /* renamed from: e */
    public HostnameVerifier mo19644e() {
        return this.f18016j;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Address) {
            Address aVar = (Address) obj;
            if (this.f18007a.equals(aVar.f18007a) && mo19643d(aVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public List<Protocol> mo19646f() {
        return this.f18011e;
    }

    /* renamed from: g */
    public Proxy mo19647g() {
        return this.f18014h;
    }

    /* renamed from: h */
    public Authenticator mo19648h() {
        return this.f18010d;
    }

    public int hashCode() {
        int hashCode = (((((((((((527 + this.f18007a.hashCode()) * 31) + this.f18008b.hashCode()) * 31) + this.f18010d.hashCode()) * 31) + this.f18011e.hashCode()) * 31) + this.f18012f.hashCode()) * 31) + this.f18013g.hashCode()) * 31;
        Proxy proxy = this.f18014h;
        int i = 0;
        int hashCode2 = (hashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f18015i;
        int hashCode3 = (hashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f18016j;
        int hashCode4 = (hashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        CertificatePinner gVar = this.f18017k;
        if (gVar != null) {
            i = gVar.hashCode();
        }
        return hashCode4 + i;
    }

    /* renamed from: i */
    public ProxySelector mo19650i() {
        return this.f18013g;
    }

    /* renamed from: j */
    public SocketFactory mo19651j() {
        return this.f18009c;
    }

    /* renamed from: k */
    public SSLSocketFactory mo19652k() {
        return this.f18015i;
    }

    /* renamed from: l */
    public HttpUrl mo19653l() {
        return this.f18007a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.f18007a.mo20075m());
        sb.append(":");
        sb.append(this.f18007a.mo20080y());
        if (this.f18014h != null) {
            sb.append(", proxy=");
            sb.append(this.f18014h);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.f18013g);
        }
        sb.append("}");
        return sb.toString();
    }
}
