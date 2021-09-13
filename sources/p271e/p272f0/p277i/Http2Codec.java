package p271e.p272f0.p277i;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p271e.C3370s;
import p271e.C3370s.C3371a;
import p271e.C3378z;
import p271e.Interceptor.C3373a;
import p271e.OkHttpClient;
import p271e.Protocol;
import p271e.Response;
import p271e.Response.C3306a;
import p271e.ResponseBody;
import p271e.p272f0.C3310c;
import p271e.p272f0.Internal;
import p271e.p272f0.p274f.StreamAllocation;
import p271e.p272f0.p275g.HttpCodec;
import p271e.p272f0.p275g.HttpHeaders;
import p271e.p272f0.p275g.RealResponseBody;
import p271e.p272f0.p275g.RequestLine;
import p271e.p272f0.p275g.StatusLine;
import p281f.ByteString;
import p281f.C3383c;
import p281f.ForwardingSource;
import p281f.Okio;
import p281f.Sink;
import p281f.Source;
import p281f.Timeout;

/* renamed from: e.f0.i.f */
public final class Http2Codec implements HttpCodec {

    /* renamed from: a */
    private static final List<String> f18276a = C3310c.m23066t("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: b */
    private static final List<String> f18277b = C3310c.m23066t("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: c */
    private final C3373a f18278c;

    /* renamed from: d */
    final StreamAllocation f18279d;

    /* renamed from: e */
    private final Http2Connection f18280e;

    /* renamed from: f */
    private Http2Stream f18281f;

    /* renamed from: g */
    private final Protocol f18282g;

    /* renamed from: e.f0.i.f$a */
    /* compiled from: Http2Codec */
    class C3330a extends ForwardingSource {

        /* renamed from: b */
        boolean f18283b = false;

        /* renamed from: c */
        long f18284c = 0;

        C3330a(Source sVar) {
            super(sVar);
        }

        /* renamed from: C */
        private void m23278C(IOException iOException) {
            if (!this.f18283b) {
                this.f18283b = true;
                Http2Codec fVar = Http2Codec.this;
                fVar.f18279d.mo19787r(false, fVar, this.f18284c, iOException);
            }
        }

        public void close() throws IOException {
            super.close();
            m23278C(null);
        }

        /* renamed from: t */
        public long mo19739t(C3383c cVar, long j) throws IOException {
            try {
                long t = mo20257B().mo19739t(cVar, j);
                if (t > 0) {
                    this.f18284c += t;
                }
                return t;
            } catch (IOException e) {
                m23278C(e);
                throw e;
            }
        }
    }

    public Http2Codec(OkHttpClient wVar, C3373a aVar, StreamAllocation gVar, Http2Connection gVar2) {
        this.f18278c = aVar;
        this.f18279d = gVar;
        this.f18280e = gVar2;
        List t = wVar.mo20120t();
        Protocol xVar = Protocol.H2_PRIOR_KNOWLEDGE;
        if (!t.contains(xVar)) {
            xVar = Protocol.HTTP_2;
        }
        this.f18282g = xVar;
    }

    /* renamed from: g */
    public static List<Header> m23270g(C3378z zVar) {
        C3370s d = zVar.mo20142d();
        ArrayList arrayList = new ArrayList(d.mo20052g() + 4);
        arrayList.add(new Header(Header.f18245c, zVar.mo20144f()));
        arrayList.add(new Header(Header.f18246d, RequestLine.m23198c(zVar.mo20147i())));
        String c = zVar.mo20141c("Host");
        if (c != null) {
            arrayList.add(new Header(Header.f18248f, c));
        }
        arrayList.add(new Header(Header.f18247e, zVar.mo20147i().mo20065D()));
        int g = d.mo20052g();
        for (int i = 0; i < g; i++) {
            ByteString g2 = ByteString.m23878g(d.mo20049e(i).toLowerCase(Locale.US));
            if (!f18276a.contains(g2.mo20253t())) {
                arrayList.add(new Header(g2, d.mo20053h(i)));
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public static C3306a m23271h(C3370s sVar, Protocol xVar) throws IOException {
        C3371a aVar = new C3371a();
        int g = sVar.mo20052g();
        StatusLine kVar = null;
        for (int i = 0; i < g; i++) {
            String e = sVar.mo20049e(i);
            String h = sVar.mo20053h(i);
            if (e.equals(":status")) {
                StringBuilder sb = new StringBuilder();
                sb.append("HTTP/1.1 ");
                sb.append(h);
                kVar = StatusLine.m23210a(sb.toString());
            } else if (!f18277b.contains(e)) {
                Internal.f18084a.mo19722b(aVar, e, h);
            }
        }
        if (kVar != null) {
            return new C3306a().mo19686n(xVar).mo19679g(kVar.f18203b).mo19683k(kVar.f18204c).mo19682j(aVar.mo20060d());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    /* renamed from: a */
    public void mo19790a() throws IOException {
        this.f18281f.mo19885j().close();
    }

    /* renamed from: b */
    public void mo19791b(C3378z zVar) throws IOException {
        if (this.f18281f == null) {
            Http2Stream S = this.f18280e.mo19842S(m23270g(zVar), zVar.mo20139a() != null);
            this.f18281f = S;
            Timeout n = S.mo19889n();
            long b = (long) this.f18278c.mo19801b();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            n.mo20265g(b, timeUnit);
            this.f18281f.mo19896u().mo20265g((long) this.f18278c.mo19802c(), timeUnit);
        }
    }

    /* renamed from: c */
    public ResponseBody mo19792c(Response b0Var) throws IOException {
        StreamAllocation gVar = this.f18279d;
        gVar.f18164f.mo20036q(gVar.f18163e);
        return new RealResponseBody(b0Var.mo19663F("Content-Type"), HttpHeaders.m23170b(b0Var), Okio.m23920c(new C3330a(this.f18281f.mo19886k())));
    }

    public void cancel() {
        Http2Stream iVar = this.f18281f;
        if (iVar != null) {
            iVar.mo19883h(ErrorCode.CANCEL);
        }
    }

    /* renamed from: d */
    public void mo19794d() throws IOException {
        this.f18280e.flush();
    }

    /* renamed from: e */
    public Sink mo19795e(C3378z zVar, long j) {
        return this.f18281f.mo19885j();
    }

    /* renamed from: f */
    public C3306a mo19796f(boolean z) throws IOException {
        C3306a h = m23271h(this.f18281f.mo19894s(), this.f18282g);
        if (!z || Internal.f18084a.mo19724d(h) != 100) {
            return h;
        }
        return null;
    }
}
