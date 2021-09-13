package p271e.p272f0.p278j;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.conscrypt.Conscrypt;
import p271e.Protocol;

/* renamed from: e.f0.j.c */
public class ConscryptPlatform extends C3358g {
    private ConscryptPlatform() {
    }

    /* renamed from: u */
    public static ConscryptPlatform m23469u() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (!Conscrypt.isAvailable()) {
                return null;
            }
            return new ConscryptPlatform();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: v */
    private Provider m23470v() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    /* renamed from: f */
    public void mo19952f(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }

    /* renamed from: g */
    public void mo19934g(SSLSocket sSLSocket, String str, List<Protocol> list) throws IOException {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C3358g.m23489b(list).toArray(new String[0]));
            return;
        }
        super.mo19934g(sSLSocket, str, list);
    }

    /* renamed from: m */
    public SSLContext mo19939m() {
        try {
            return SSLContext.getInstance("TLSv1.3", m23470v());
        } catch (NoSuchAlgorithmException e) {
            try {
                return SSLContext.getInstance("TLS", m23470v());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e);
            }
        }
    }

    /* renamed from: n */
    public String mo19935n(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return super.mo19935n(sSLSocket);
    }
}
