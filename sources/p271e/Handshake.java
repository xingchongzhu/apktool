package p271e;

import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import p271e.p272f0.C3310c;

/* renamed from: e.r */
public final class Handshake {

    /* renamed from: a */
    private final TlsVersion f18621a;

    /* renamed from: b */
    private final CipherSuite f18622b;

    /* renamed from: c */
    private final List<Certificate> f18623c;

    /* renamed from: d */
    private final List<Certificate> f18624d;

    private Handshake(TlsVersion e0Var, CipherSuite hVar, List<Certificate> list, List<Certificate> list2) {
        this.f18621a = e0Var;
        this.f18622b = hVar;
        this.f18623c = list;
        this.f18624d = list2;
    }

    /* renamed from: b */
    public static Handshake m23610b(SSLSession sSLSession) throws IOException {
        Certificate[] certificateArr;
        List list;
        List list2;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        } else if (!"SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            CipherSuite a = CipherSuite.m23529a(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            } else if (!"NONE".equals(protocol)) {
                TlsVersion a2 = TlsVersion.m23022a(protocol);
                try {
                    certificateArr = sSLSession.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                    certificateArr = null;
                }
                if (certificateArr != null) {
                    list = C3310c.m23066t(certificateArr);
                } else {
                    list = Collections.emptyList();
                }
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                if (localCertificates != null) {
                    list2 = C3310c.m23066t(localCertificates);
                } else {
                    list2 = Collections.emptyList();
                }
                return new Handshake(a2, a, list, list2);
            } else {
                throw new IOException("tlsVersion == NONE");
            }
        } else {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
    }

    /* renamed from: a */
    public CipherSuite mo20044a() {
        return this.f18622b;
    }

    /* renamed from: c */
    public List<Certificate> mo20045c() {
        return this.f18623c;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof Handshake)) {
            return false;
        }
        Handshake rVar = (Handshake) obj;
        if (this.f18621a.equals(rVar.f18621a) && this.f18622b.equals(rVar.f18622b) && this.f18623c.equals(rVar.f18623c) && this.f18624d.equals(rVar.f18624d)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return ((((((527 + this.f18621a.hashCode()) * 31) + this.f18622b.hashCode()) * 31) + this.f18623c.hashCode()) * 31) + this.f18624d.hashCode();
    }
}
