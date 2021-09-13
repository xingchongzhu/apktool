package p271e.p272f0.p275g;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy.Type;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import p271e.Address;
import p271e.C3378z;
import p271e.C3378z.C3379a;
import p271e.Call;
import p271e.CertificatePinner;
import p271e.EventListener;
import p271e.HttpUrl;
import p271e.Interceptor;
import p271e.Interceptor.C3373a;
import p271e.OkHttpClient;
import p271e.RequestBody;
import p271e.Response;
import p271e.Route;
import p271e.p272f0.C3310c;
import p271e.p272f0.p274f.RouteException;
import p271e.p272f0.p274f.StreamAllocation;
import p271e.p272f0.p277i.ConnectionShutdownException;

/* renamed from: e.f0.g.j */
public final class RetryAndFollowUpInterceptor implements Interceptor {

    /* renamed from: a */
    private final OkHttpClient f18197a;

    /* renamed from: b */
    private final boolean f18198b;

    /* renamed from: c */
    private volatile StreamAllocation f18199c;

    /* renamed from: d */
    private Object f18200d;

    /* renamed from: e */
    private volatile boolean f18201e;

    public RetryAndFollowUpInterceptor(OkHttpClient wVar, boolean z) {
        this.f18197a = wVar;
        this.f18198b = z;
    }

    /* renamed from: c */
    private Address m23199c(HttpUrl tVar) {
        CertificatePinner gVar;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        if (tVar.mo20076n()) {
            SSLSocketFactory A = this.f18197a.mo20100A();
            hostnameVerifier = this.f18197a.mo20114m();
            sSLSocketFactory = A;
            gVar = this.f18197a.mo20104c();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            gVar = null;
        }
        Address aVar = new Address(tVar.mo20075m(), tVar.mo20080y(), this.f18197a.mo20110i(), this.f18197a.mo20126z(), sSLSocketFactory, hostnameVerifier, gVar, this.f18197a.mo20122v(), this.f18197a.mo20121u(), this.f18197a.mo20120t(), this.f18197a.mo20107f(), this.f18197a.mo20123w());
        return aVar;
    }

    /* renamed from: d */
    private C3378z m23200d(Response b0Var, Route d0Var) throws IOException {
        if (b0Var != null) {
            int D = b0Var.mo19661D();
            String f = b0Var.mo19671N().mo20144f();
            String str = "GET";
            RequestBody a0Var = null;
            if (D == 307 || D == 308) {
                if (!f.equals(str) && !f.equals("HEAD")) {
                    return null;
                }
            } else if (D == 401) {
                return this.f18197a.mo20102a().mo19658a(d0Var, b0Var);
            } else {
                if (D != 503) {
                    if (D != 407) {
                        if (D != 408) {
                            switch (D) {
                                case 300:
                                case 301:
                                case 302:
                                case 303:
                                    break;
                                default:
                                    return null;
                            }
                        } else if (!this.f18197a.mo20125y()) {
                            return null;
                        } else {
                            b0Var.mo19671N().mo20139a();
                            if ((b0Var.mo19669L() == null || b0Var.mo19669L().mo19661D() != 408) && m23204i(b0Var, 0) <= 0) {
                                return b0Var.mo19671N();
                            }
                            return null;
                        }
                    } else if (d0Var.mo19710b().type() == Type.HTTP) {
                        return this.f18197a.mo20122v().mo19658a(d0Var, b0Var);
                    } else {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                } else if ((b0Var.mo19669L() == null || b0Var.mo19669L().mo19661D() != 503) && m23204i(b0Var, Integer.MAX_VALUE) == 0) {
                    return b0Var.mo19671N();
                } else {
                    return null;
                }
            }
            if (!this.f18197a.mo20112k()) {
                return null;
            }
            String F = b0Var.mo19663F("Location");
            if (F == null) {
                return null;
            }
            HttpUrl C = b0Var.mo19671N().mo20147i().mo20064C(F);
            if (C == null) {
                return null;
            }
            if (!C.mo20065D().equals(b0Var.mo19671N().mo20147i().mo20065D()) && !this.f18197a.mo20113l()) {
                return null;
            }
            C3379a g = b0Var.mo19671N().mo20145g();
            if (HttpMethod.m23178b(f)) {
                boolean d = HttpMethod.m23180d(f);
                if (HttpMethod.m23179c(f)) {
                    g.mo20154f(str, null);
                } else {
                    if (d) {
                        a0Var = b0Var.mo19671N().mo20139a();
                    }
                    g.mo20154f(f, a0Var);
                }
                if (!d) {
                    g.mo20156h("Transfer-Encoding");
                    g.mo20156h("Content-Length");
                    g.mo20156h("Content-Type");
                }
            }
            if (!m23205j(b0Var, C)) {
                g.mo20156h("Authorization");
            }
            return g.mo20160l(C).mo20150b();
        }
        throw new IllegalStateException();
    }

    /* renamed from: f */
    private boolean m23201f(IOException iOException, boolean z) {
        boolean z2 = false;
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if ((iOException instanceof SocketTimeoutException) && !z) {
                z2 = true;
            }
            return z2;
        } else if ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: g */
    private boolean m23202g(IOException iOException, StreamAllocation gVar, boolean z, C3378z zVar) {
        gVar.mo19786q(iOException);
        if (!this.f18197a.mo20125y()) {
            return false;
        }
        if ((!z || !m23203h(iOException, zVar)) && m23201f(iOException, z) && gVar.mo19780h()) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private boolean m23203h(IOException iOException, C3378z zVar) {
        zVar.mo20139a();
        return iOException instanceof FileNotFoundException;
    }

    /* renamed from: i */
    private int m23204i(Response b0Var, int i) {
        String F = b0Var.mo19663F("Retry-After");
        if (F == null) {
            return i;
        }
        if (F.matches("\\d+")) {
            return Integer.valueOf(F).intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: j */
    private boolean m23205j(Response b0Var, HttpUrl tVar) {
        HttpUrl i = b0Var.mo19671N().mo20147i();
        return i.mo20075m().equals(tVar.mo20075m()) && i.mo20080y() == tVar.mo20080y() && i.mo20065D().equals(tVar.mo20065D());
    }

    /* renamed from: a */
    public Response mo18702a(C3373a aVar) throws IOException {
        C3378z S = aVar.mo19799S();
        RealInterceptorChain gVar = (RealInterceptorChain) aVar;
        Call e = gVar.mo19804e();
        EventListener g = gVar.mo19806g();
        StreamAllocation gVar2 = new StreamAllocation(this.f18197a.mo20106e(), m23199c(S.mo20147i()), e, g, this.f18200d);
        this.f18199c = gVar2;
        Response b0Var = null;
        int i = 0;
        while (!this.f18201e) {
            try {
                Response i2 = gVar.mo19808i(S, gVar2, null, null);
                if (b0Var != null) {
                    i2 = i2.mo19668K().mo19685m(b0Var.mo19668K().mo19676b(null).mo19677c()).mo19677c();
                }
                try {
                    C3378z d = m23200d(i2, gVar2.mo19785o());
                    if (d == null) {
                        gVar2.mo19783k();
                        return i2;
                    }
                    C3310c.m23052f(i2.mo19659B());
                    int i3 = i + 1;
                    if (i3 <= 20) {
                        d.mo20139a();
                        if (!m23205j(i2, d.mo20147i())) {
                            gVar2.mo19783k();
                            gVar2 = new StreamAllocation(this.f18197a.mo20106e(), m23199c(d.mo20147i()), e, g, this.f18200d);
                            this.f18199c = gVar2;
                        } else if (gVar2.mo19778c() != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Closing the body of ");
                            sb.append(i2);
                            sb.append(" didn't close its backing stream. Bad interceptor?");
                            throw new IllegalStateException(sb.toString());
                        }
                        b0Var = i2;
                        S = d;
                        i = i3;
                    } else {
                        gVar2.mo19783k();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Too many follow-up requests: ");
                        sb2.append(i3);
                        throw new ProtocolException(sb2.toString());
                    }
                } catch (IOException e2) {
                    gVar2.mo19783k();
                    throw e2;
                }
            } catch (RouteException e3) {
                if (!m23202g(e3.mo19769c(), gVar2, false, S)) {
                    throw e3.mo19768b();
                }
            } catch (IOException e4) {
                if (!m23202g(e4, gVar2, !(e4 instanceof ConnectionShutdownException), S)) {
                    throw e4;
                }
            } catch (Throwable th) {
                gVar2.mo19786q(null);
                gVar2.mo19783k();
                throw th;
            }
        }
        gVar2.mo19783k();
        throw new IOException("Canceled");
    }

    /* renamed from: b */
    public void mo19810b() {
        this.f18201e = true;
        StreamAllocation gVar = this.f18199c;
        if (gVar != null) {
            gVar.mo19777b();
        }
    }

    /* renamed from: e */
    public boolean mo19811e() {
        return this.f18201e;
    }

    /* renamed from: k */
    public void mo19812k(Object obj) {
        this.f18200d = obj;
    }
}
