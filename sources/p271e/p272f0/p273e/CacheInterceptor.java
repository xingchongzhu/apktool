package p271e.p272f0.p273e;

import com.umeng.commonsdk.statistics.SdkVersion;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import p271e.C3370s;
import p271e.C3370s.C3371a;
import p271e.C3378z;
import p271e.Interceptor;
import p271e.Interceptor.C3373a;
import p271e.Protocol;
import p271e.Response;
import p271e.Response.C3306a;
import p271e.p272f0.C3310c;
import p271e.p272f0.Internal;
import p271e.p272f0.p273e.CacheStrategy.C3315a;
import p271e.p272f0.p275g.HttpHeaders;
import p271e.p272f0.p275g.HttpMethod;
import p271e.p272f0.p275g.RealResponseBody;
import p281f.BufferedSink;
import p281f.BufferedSource;
import p281f.C3383c;
import p281f.Okio;
import p281f.Sink;
import p281f.Source;
import p281f.Timeout;

/* renamed from: e.f0.e.a */
public final class CacheInterceptor implements Interceptor {

    /* renamed from: a */
    final InternalCache f18107a;

    /* renamed from: e.f0.e.a$a */
    /* compiled from: CacheInterceptor */
    class C3314a implements Source {

        /* renamed from: a */
        boolean f18108a;

        /* renamed from: b */
        final /* synthetic */ BufferedSource f18109b;

        /* renamed from: c */
        final /* synthetic */ CacheRequest f18110c;

        /* renamed from: d */
        final /* synthetic */ BufferedSink f18111d;

        C3314a(BufferedSource eVar, CacheRequest bVar, BufferedSink dVar) {
            this.f18109b = eVar;
            this.f18110c = bVar;
            this.f18111d = dVar;
        }

        public void close() throws IOException {
            if (!this.f18108a && !C3310c.m23061o(this, 100, TimeUnit.MILLISECONDS)) {
                this.f18108a = true;
                this.f18110c.mo19741b();
            }
            this.f18109b.close();
        }

        /* renamed from: d */
        public Timeout mo19738d() {
            return this.f18109b.mo19738d();
        }

        /* renamed from: t */
        public long mo19739t(C3383c cVar, long j) throws IOException {
            try {
                long t = this.f18109b.mo19739t(cVar, j);
                if (t == -1) {
                    if (!this.f18108a) {
                        this.f18108a = true;
                        this.f18111d.close();
                    }
                    return -1;
                }
                cVar.mo20174E(this.f18111d.mo20196c(), cVar.mo20186Q() - t, t);
                this.f18111d.mo20228s();
                return t;
            } catch (IOException e) {
                if (!this.f18108a) {
                    this.f18108a = true;
                    this.f18110c.mo19741b();
                }
                throw e;
            }
        }
    }

    public CacheInterceptor(InternalCache dVar) {
        this.f18107a = dVar;
    }

    /* renamed from: b */
    private Response m23075b(CacheRequest bVar, Response b0Var) throws IOException {
        if (bVar == null) {
            return b0Var;
        }
        Sink a = bVar.mo19740a();
        if (a == null) {
            return b0Var;
        }
        C3314a aVar = new C3314a(b0Var.mo19659B().mo19692H(), bVar, Okio.m23919b(a));
        return b0Var.mo19668K().mo19676b(new RealResponseBody(b0Var.mo19663F("Content-Type"), b0Var.mo19659B().mo19690C(), Okio.m23920c(aVar))).mo19677c();
    }

    /* renamed from: c */
    private static C3370s m23076c(C3370s sVar, C3370s sVar2) {
        C3371a aVar = new C3371a();
        int g = sVar.mo20052g();
        for (int i = 0; i < g; i++) {
            String e = sVar.mo20049e(i);
            String h = sVar.mo20053h(i);
            if ((!"Warning".equalsIgnoreCase(e) || !h.startsWith(SdkVersion.MINI_VERSION)) && (m23077d(e) || !m23078e(e) || sVar2.mo20048c(e) == null)) {
                Internal.f18084a.mo19722b(aVar, e, h);
            }
        }
        int g2 = sVar2.mo20052g();
        for (int i2 = 0; i2 < g2; i2++) {
            String e2 = sVar2.mo20049e(i2);
            if (!m23077d(e2) && m23078e(e2)) {
                Internal.f18084a.mo19722b(aVar, e2, sVar2.mo20053h(i2));
            }
        }
        return aVar.mo20060d();
    }

    /* renamed from: d */
    static boolean m23077d(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    /* renamed from: e */
    static boolean m23078e(String str) {
        return !"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str);
    }

    /* renamed from: f */
    private static Response m23079f(Response b0Var) {
        return (b0Var == null || b0Var.mo19659B() == null) ? b0Var : b0Var.mo19668K().mo19676b(null).mo19677c();
    }

    /* renamed from: a */
    public Response mo18702a(C3373a aVar) throws IOException {
        InternalCache dVar = this.f18107a;
        Response a = dVar != null ? dVar.mo19743a(aVar.mo19799S()) : null;
        CacheStrategy c = new C3315a(System.currentTimeMillis(), aVar.mo19799S(), a).mo19742c();
        C3378z zVar = c.f18113a;
        Response b0Var = c.f18114b;
        InternalCache dVar2 = this.f18107a;
        if (dVar2 != null) {
            dVar2.mo19745c(c);
        }
        if (a != null && b0Var == null) {
            C3310c.m23052f(a.mo19659B());
        }
        if (zVar == null && b0Var == null) {
            return new C3306a().mo19688p(aVar.mo19799S()).mo19686n(Protocol.HTTP_1_1).mo19679g(504).mo19683k("Unsatisfiable Request (only-if-cached)").mo19676b(C3310c.f18088c).mo19689q(-1).mo19687o(System.currentTimeMillis()).mo19677c();
        }
        if (zVar == null) {
            return b0Var.mo19668K().mo19678d(m23079f(b0Var)).mo19677c();
        }
        try {
            Response d = aVar.mo19803d(zVar);
            if (d == null && a != null) {
            }
            if (b0Var != null) {
                if (d.mo19661D() == 304) {
                    Response c2 = b0Var.mo19668K().mo19682j(m23076c(b0Var.mo19665H(), d.mo19665H())).mo19689q(d.mo19672O()).mo19687o(d.mo19670M()).mo19678d(m23079f(b0Var)).mo19684l(m23079f(d)).mo19677c();
                    d.mo19659B().close();
                    this.f18107a.mo19744b();
                    this.f18107a.mo19746d(b0Var, c2);
                    return c2;
                }
                C3310c.m23052f(b0Var.mo19659B());
            }
            Response c3 = d.mo19668K().mo19678d(m23079f(b0Var)).mo19684l(m23079f(d)).mo19677c();
            if (this.f18107a != null) {
                if (HttpHeaders.m23171c(c3) && CacheStrategy.m23085a(c3, zVar)) {
                    return m23075b(this.f18107a.mo19748f(c3), c3);
                }
                if (HttpMethod.m23177a(zVar.mo20144f())) {
                    try {
                        this.f18107a.mo19747e(zVar);
                    } catch (IOException unused) {
                    }
                }
            }
            return c3;
        } finally {
            if (a != null) {
                C3310c.m23052f(a.mo19659B());
            }
        }
    }
}
