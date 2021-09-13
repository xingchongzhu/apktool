package p271e.p272f0.p280l;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import p271e.p272f0.p278j.C3358g;

/* renamed from: e.f0.l.c */
public abstract class CertificateChainCleaner {
    /* renamed from: b */
    public static CertificateChainCleaner m23512b(X509TrustManager x509TrustManager) {
        return C3358g.m23494l().mo19936c(x509TrustManager);
    }

    /* renamed from: a */
    public abstract List<Certificate> mo19944a(List<Certificate> list, String str) throws SSLPeerUnverifiedException;
}
