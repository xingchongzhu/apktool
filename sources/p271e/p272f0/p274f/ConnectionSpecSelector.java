package p271e.p272f0.p274f;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;
import p271e.ConnectionSpec;
import p271e.p272f0.Internal;

/* renamed from: e.f0.f.b */
public final class ConnectionSpecSelector {

    /* renamed from: a */
    private final List<ConnectionSpec> f18128a;

    /* renamed from: b */
    private int f18129b = 0;

    /* renamed from: c */
    private boolean f18130c;

    /* renamed from: d */
    private boolean f18131d;

    public ConnectionSpecSelector(List<ConnectionSpec> list) {
        this.f18128a = list;
    }

    /* renamed from: c */
    private boolean m23099c(SSLSocket sSLSocket) {
        for (int i = this.f18129b; i < this.f18128a.size(); i++) {
            if (((ConnectionSpec) this.f18128a.get(i)).mo19991c(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public ConnectionSpec mo19749a(SSLSocket sSLSocket) throws IOException {
        ConnectionSpec kVar;
        int i = this.f18129b;
        int size = this.f18128a.size();
        while (true) {
            if (i >= size) {
                kVar = null;
                break;
            }
            kVar = (ConnectionSpec) this.f18128a.get(i);
            if (kVar.mo19991c(sSLSocket)) {
                this.f18129b = i + 1;
                break;
            }
            i++;
        }
        if (kVar != null) {
            this.f18130c = m23099c(sSLSocket);
            Internal.f18084a.mo19723c(kVar, sSLSocket, this.f18131d);
            return kVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f18131d);
        sb.append(", modes=");
        sb.append(this.f18128a);
        sb.append(", supported protocols=");
        sb.append(Arrays.toString(sSLSocket.getEnabledProtocols()));
        throw new UnknownServiceException(sb.toString());
    }

    /* renamed from: b */
    public boolean mo19750b(IOException iOException) {
        boolean z = true;
        this.f18131d = true;
        if (!this.f18130c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z2 = iOException instanceof SSLHandshakeException;
        if ((z2 && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        if (!z2 && !(iOException instanceof SSLProtocolException) && !(iOException instanceof SSLException)) {
            z = false;
        }
        return z;
    }
}
