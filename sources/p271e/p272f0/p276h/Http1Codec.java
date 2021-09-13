package p271e.p272f0.p276h;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import p271e.C3370s;
import p271e.C3370s.C3371a;
import p271e.C3378z;
import p271e.HttpUrl;
import p271e.OkHttpClient;
import p271e.Response;
import p271e.Response.C3306a;
import p271e.ResponseBody;
import p271e.p272f0.C3310c;
import p271e.p272f0.Internal;
import p271e.p272f0.p274f.RealConnection;
import p271e.p272f0.p274f.StreamAllocation;
import p271e.p272f0.p275g.HttpCodec;
import p271e.p272f0.p275g.HttpHeaders;
import p271e.p272f0.p275g.RealResponseBody;
import p271e.p272f0.p275g.RequestLine;
import p271e.p272f0.p275g.StatusLine;
import p281f.BufferedSink;
import p281f.BufferedSource;
import p281f.C3383c;
import p281f.ForwardingTimeout;
import p281f.Okio;
import p281f.Sink;
import p281f.Source;
import p281f.Timeout;

/* renamed from: e.f0.h.a */
public final class Http1Codec implements HttpCodec {

    /* renamed from: a */
    final OkHttpClient f18205a;

    /* renamed from: b */
    final StreamAllocation f18206b;

    /* renamed from: c */
    final BufferedSource f18207c;

    /* renamed from: d */
    final BufferedSink f18208d;

    /* renamed from: e */
    int f18209e = 0;

    /* renamed from: f */
    private long f18210f = 262144;

    /* renamed from: e.f0.h.a$b */
    /* compiled from: Http1Codec */
    private abstract class C3321b implements Source {

        /* renamed from: a */
        protected final ForwardingTimeout f18211a;

        /* renamed from: b */
        protected boolean f18212b;

        /* renamed from: c */
        protected long f18213c;

        private C3321b() {
            this.f18211a = new ForwardingTimeout(Http1Codec.this.f18207c.mo19738d());
            this.f18213c = 0;
        }

        /* access modifiers changed from: protected */
        /* renamed from: B */
        public final void mo19822B(boolean z, IOException iOException) throws IOException {
            Http1Codec aVar = Http1Codec.this;
            int i = aVar.f18209e;
            if (i != 6) {
                if (i == 5) {
                    aVar.mo19814g(this.f18211a);
                    Http1Codec aVar2 = Http1Codec.this;
                    aVar2.f18209e = 6;
                    StreamAllocation gVar = aVar2.f18206b;
                    if (gVar != null) {
                        gVar.mo19787r(!z, aVar2, this.f18213c, iOException);
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("state: ");
                sb.append(Http1Codec.this.f18209e);
                throw new IllegalStateException(sb.toString());
            }
        }

        /* renamed from: d */
        public Timeout mo19738d() {
            return this.f18211a;
        }

        /* renamed from: t */
        public long mo19739t(C3383c cVar, long j) throws IOException {
            try {
                long t = Http1Codec.this.f18207c.mo19739t(cVar, j);
                if (t > 0) {
                    this.f18213c += t;
                }
                return t;
            } catch (IOException e) {
                mo19822B(false, e);
                throw e;
            }
        }
    }

    /* renamed from: e.f0.h.a$c */
    /* compiled from: Http1Codec */
    private final class C3322c implements Sink {

        /* renamed from: a */
        private final ForwardingTimeout f18215a;

        /* renamed from: b */
        private boolean f18216b;

        C3322c() {
            this.f18215a = new ForwardingTimeout(Http1Codec.this.f18208d.mo19824d());
        }

        public synchronized void close() throws IOException {
            if (!this.f18216b) {
                this.f18216b = true;
                Http1Codec.this.f18208d.mo20232w("0\r\n\r\n");
                Http1Codec.this.mo19814g(this.f18215a);
                Http1Codec.this.f18209e = 3;
            }
        }

        /* renamed from: d */
        public Timeout mo19824d() {
            return this.f18215a;
        }

        /* renamed from: f */
        public void mo19789f(C3383c cVar, long j) throws IOException {
            if (this.f18216b) {
                throw new IllegalStateException("closed");
            } else if (j != 0) {
                Http1Codec.this.f18208d.mo20204g(j);
                String str = "\r\n";
                Http1Codec.this.f18208d.mo20232w(str);
                Http1Codec.this.f18208d.mo19789f(cVar, j);
                Http1Codec.this.f18208d.mo20232w(str);
            }
        }

        public synchronized void flush() throws IOException {
            if (!this.f18216b) {
                Http1Codec.this.f18208d.flush();
            }
        }
    }

    /* renamed from: e.f0.h.a$d */
    /* compiled from: Http1Codec */
    private class C3323d extends C3321b {

        /* renamed from: e */
        private final HttpUrl f18218e;

        /* renamed from: f */
        private long f18219f = -1;

        /* renamed from: g */
        private boolean f18220g = true;

        C3323d(HttpUrl tVar) {
            super();
            this.f18218e = tVar;
        }

        /* renamed from: C */
        private void m23231C() throws IOException {
            if (this.f18219f != -1) {
                Http1Codec.this.f18207c.mo20214k();
            }
            try {
                this.f18219f = Http1Codec.this.f18207c.mo20236z();
                String trim = Http1Codec.this.f18207c.mo20214k().trim();
                if (this.f18219f < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("expected chunk size and optional extensions but was \"");
                    sb.append(this.f18219f);
                    sb.append(trim);
                    sb.append("\"");
                    throw new ProtocolException(sb.toString());
                } else if (this.f18219f == 0) {
                    this.f18220g = false;
                    HttpHeaders.m23173e(Http1Codec.this.f18205a.mo20108g(), this.f18218e, Http1Codec.this.mo19820n());
                    mo19822B(true, null);
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        public void close() throws IOException {
            if (!this.f18212b) {
                if (this.f18220g && !C3310c.m23061o(this, 100, TimeUnit.MILLISECONDS)) {
                    mo19822B(false, null);
                }
                this.f18212b = true;
            }
        }

        /* renamed from: t */
        public long mo19739t(C3383c cVar, long j) throws IOException {
            if (j < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (this.f18212b) {
                throw new IllegalStateException("closed");
            } else if (!this.f18220g) {
                return -1;
            } else {
                long j2 = this.f18219f;
                if (j2 == 0 || j2 == -1) {
                    m23231C();
                    if (!this.f18220g) {
                        return -1;
                    }
                }
                long t = super.mo19739t(cVar, Math.min(j, this.f18219f));
                if (t != -1) {
                    this.f18219f -= t;
                    return t;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                mo19822B(false, protocolException);
                throw protocolException;
            }
        }
    }

    /* renamed from: e.f0.h.a$e */
    /* compiled from: Http1Codec */
    private final class C3324e implements Sink {

        /* renamed from: a */
        private final ForwardingTimeout f18222a;

        /* renamed from: b */
        private boolean f18223b;

        /* renamed from: c */
        private long f18224c;

        C3324e(long j) {
            this.f18222a = new ForwardingTimeout(Http1Codec.this.f18208d.mo19824d());
            this.f18224c = j;
        }

        public void close() throws IOException {
            if (!this.f18223b) {
                this.f18223b = true;
                if (this.f18224c <= 0) {
                    Http1Codec.this.mo19814g(this.f18222a);
                    Http1Codec.this.f18209e = 3;
                    return;
                }
                throw new ProtocolException("unexpected end of stream");
            }
        }

        /* renamed from: d */
        public Timeout mo19824d() {
            return this.f18222a;
        }

        /* renamed from: f */
        public void mo19789f(C3383c cVar, long j) throws IOException {
            if (!this.f18223b) {
                C3310c.m23051e(cVar.mo20186Q(), 0, j);
                if (j <= this.f18224c) {
                    Http1Codec.this.f18208d.mo19789f(cVar, j);
                    this.f18224c -= j;
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("expected ");
                sb.append(this.f18224c);
                sb.append(" bytes but received ");
                sb.append(j);
                throw new ProtocolException(sb.toString());
            }
            throw new IllegalStateException("closed");
        }

        public void flush() throws IOException {
            if (!this.f18223b) {
                Http1Codec.this.f18208d.flush();
            }
        }
    }

    /* renamed from: e.f0.h.a$f */
    /* compiled from: Http1Codec */
    private class C3325f extends C3321b {

        /* renamed from: e */
        private long f18226e;

        C3325f(long j) throws IOException {
            super();
            this.f18226e = j;
            if (j == 0) {
                mo19822B(true, null);
            }
        }

        public void close() throws IOException {
            if (!this.f18212b) {
                if (this.f18226e != 0 && !C3310c.m23061o(this, 100, TimeUnit.MILLISECONDS)) {
                    mo19822B(false, null);
                }
                this.f18212b = true;
            }
        }

        /* renamed from: t */
        public long mo19739t(C3383c cVar, long j) throws IOException {
            if (j < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (!this.f18212b) {
                long j2 = this.f18226e;
                if (j2 == 0) {
                    return -1;
                }
                long t = super.mo19739t(cVar, Math.min(j2, j));
                if (t != -1) {
                    long j3 = this.f18226e - t;
                    this.f18226e = j3;
                    if (j3 == 0) {
                        mo19822B(true, null);
                    }
                    return t;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                mo19822B(false, protocolException);
                throw protocolException;
            } else {
                throw new IllegalStateException("closed");
            }
        }
    }

    /* renamed from: e.f0.h.a$g */
    /* compiled from: Http1Codec */
    private class C3326g extends C3321b {

        /* renamed from: e */
        private boolean f18228e;

        C3326g() {
            super();
        }

        public void close() throws IOException {
            if (!this.f18212b) {
                if (!this.f18228e) {
                    mo19822B(false, null);
                }
                this.f18212b = true;
            }
        }

        /* renamed from: t */
        public long mo19739t(C3383c cVar, long j) throws IOException {
            if (j < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (this.f18212b) {
                throw new IllegalStateException("closed");
            } else if (this.f18228e) {
                return -1;
            } else {
                long t = super.mo19739t(cVar, j);
                if (t != -1) {
                    return t;
                }
                this.f18228e = true;
                mo19822B(true, null);
                return -1;
            }
        }
    }

    public Http1Codec(OkHttpClient wVar, StreamAllocation gVar, BufferedSource eVar, BufferedSink dVar) {
        this.f18205a = wVar;
        this.f18206b = gVar;
        this.f18207c = eVar;
        this.f18208d = dVar;
    }

    /* renamed from: m */
    private String m23211m() throws IOException {
        String u = this.f18207c.mo20230u(this.f18210f);
        this.f18210f -= (long) u.length();
        return u;
    }

    /* renamed from: a */
    public void mo19790a() throws IOException {
        this.f18208d.flush();
    }

    /* renamed from: b */
    public void mo19791b(C3378z zVar) throws IOException {
        mo19821o(zVar.mo20142d(), RequestLine.m23196a(zVar, this.f18206b.mo19779d().mo19760p().mo19710b().type()));
    }

    /* renamed from: c */
    public ResponseBody mo19792c(Response b0Var) throws IOException {
        StreamAllocation gVar = this.f18206b;
        gVar.f18164f.mo20036q(gVar.f18163e);
        String F = b0Var.mo19663F("Content-Type");
        if (!HttpHeaders.m23171c(b0Var)) {
            return new RealResponseBody(F, 0, Okio.m23920c(mo19818k(0)));
        }
        if ("chunked".equalsIgnoreCase(b0Var.mo19663F("Transfer-Encoding"))) {
            return new RealResponseBody(F, -1, Okio.m23920c(mo19816i(b0Var.mo19671N().mo20147i())));
        }
        long b = HttpHeaders.m23170b(b0Var);
        if (b != -1) {
            return new RealResponseBody(F, b, Okio.m23920c(mo19818k(b)));
        }
        return new RealResponseBody(F, -1, Okio.m23920c(mo19819l()));
    }

    public void cancel() {
        RealConnection d = this.f18206b.mo19779d();
        if (d != null) {
            d.mo19753c();
        }
    }

    /* renamed from: d */
    public void mo19794d() throws IOException {
        this.f18208d.flush();
    }

    /* renamed from: e */
    public Sink mo19795e(C3378z zVar, long j) {
        if ("chunked".equalsIgnoreCase(zVar.mo20141c("Transfer-Encoding"))) {
            return mo19815h();
        }
        if (j != -1) {
            return mo19817j(j);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    /* renamed from: f */
    public C3306a mo19796f(boolean z) throws IOException {
        int i = this.f18209e;
        if (i == 1 || i == 3) {
            try {
                StatusLine a = StatusLine.m23210a(m23211m());
                C3306a j = new C3306a().mo19686n(a.f18202a).mo19679g(a.f18203b).mo19683k(a.f18204c).mo19682j(mo19820n());
                if (z && a.f18203b == 100) {
                    return null;
                }
                if (a.f18203b == 100) {
                    this.f18209e = 3;
                    return j;
                }
                this.f18209e = 4;
                return j;
            } catch (EOFException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("unexpected end of stream on ");
                sb.append(this.f18206b);
                IOException iOException = new IOException(sb.toString());
                iOException.initCause(e);
                throw iOException;
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("state: ");
            sb2.append(this.f18209e);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo19814g(ForwardingTimeout iVar) {
        Timeout i = iVar.mo20266i();
        iVar.mo20267j(Timeout.f18792a);
        i.mo20259a();
        i.mo20260b();
    }

    /* renamed from: h */
    public Sink mo19815h() {
        if (this.f18209e == 1) {
            this.f18209e = 2;
            return new C3322c();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.f18209e);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: i */
    public Source mo19816i(HttpUrl tVar) throws IOException {
        if (this.f18209e == 4) {
            this.f18209e = 5;
            return new C3323d(tVar);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.f18209e);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: j */
    public Sink mo19817j(long j) {
        if (this.f18209e == 1) {
            this.f18209e = 2;
            return new C3324e(j);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.f18209e);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: k */
    public Source mo19818k(long j) throws IOException {
        if (this.f18209e == 4) {
            this.f18209e = 5;
            return new C3325f(j);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.f18209e);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: l */
    public Source mo19819l() throws IOException {
        if (this.f18209e == 4) {
            StreamAllocation gVar = this.f18206b;
            if (gVar != null) {
                this.f18209e = 5;
                gVar.mo19782j();
                return new C3326g();
            }
            throw new IllegalStateException("streamAllocation == null");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.f18209e);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: n */
    public C3370s mo19820n() throws IOException {
        C3371a aVar = new C3371a();
        while (true) {
            String m = m23211m();
            if (m.length() == 0) {
                return aVar.mo20060d();
            }
            Internal.f18084a.mo19721a(aVar, m);
        }
    }

    /* renamed from: o */
    public void mo19821o(C3370s sVar, String str) throws IOException {
        if (this.f18209e == 0) {
            String str2 = "\r\n";
            this.f18208d.mo20232w(str).mo20232w(str2);
            int g = sVar.mo20052g();
            for (int i = 0; i < g; i++) {
                this.f18208d.mo20232w(sVar.mo20049e(i)).mo20232w(": ").mo20232w(sVar.mo20053h(i)).mo20232w(str2);
            }
            this.f18208d.mo20232w(str2);
            this.f18209e = 1;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.f18209e);
        throw new IllegalStateException(sb.toString());
    }
}
