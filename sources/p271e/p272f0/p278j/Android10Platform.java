package p271e.p272f0.p278j;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p271e.Protocol;

@SuppressLint({"NewApi"})
/* renamed from: e.f0.j.a */
class Android10Platform extends AndroidPlatform {
    Android10Platform(Class<?> cls) {
        super(cls, null, null, null, null);
    }

    /* renamed from: w */
    public static C3358g m23445w() {
        if (!C3358g.m23495p()) {
            return null;
        }
        try {
            if (AndroidPlatform.m23452x() >= 29) {
                return new Android10Platform(Class.forName("com.android.org.conscrypt.SSLParametersImpl"));
            }
        } catch (ClassNotFoundException unused) {
        }
        return null;
    }

    /* renamed from: z */
    private void m23446z(SSLSocket sSLSocket) {
        if (SSLSockets.isSupportedSocket(sSLSocket)) {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
        }
    }

    @SuppressLint({"NewApi"})
    @IgnoreJRERequirement
    /* renamed from: g */
    public void mo19934g(SSLSocket sSLSocket, String str, List<Protocol> list) throws IOException {
        try {
            m23446z(sSLSocket);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) C3358g.m23489b(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }

    @IgnoreJRERequirement
    /* renamed from: n */
    public String mo19935n(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.isEmpty()) {
            return null;
        }
        return applicationProtocol;
    }
}
