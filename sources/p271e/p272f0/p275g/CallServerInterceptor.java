package p271e.p272f0.p275g;

import java.io.IOException;
import java.net.ProtocolException;
import p271e.C3378z;
import p271e.Interceptor;
import p271e.Interceptor.C3373a;
import p271e.Response;
import p271e.Response.C3306a;
import p271e.p272f0.C3310c;
import p271e.p272f0.p274f.RealConnection;
import p271e.p272f0.p274f.StreamAllocation;
import p281f.BufferedSink;
import p281f.C3383c;
import p281f.ForwardingSink;
import p281f.Okio;
import p281f.Sink;

/* renamed from: e.f0.g.b */
public final class CallServerInterceptor implements Interceptor {

    /* renamed from: a */
    private final boolean f18175a;

    /* renamed from: e.f0.g.b$a */
    /* compiled from: CallServerInterceptor */
    static final class C3318a extends ForwardingSink {

        /* renamed from: b */
        long f18176b;

        C3318a(Sink rVar) {
            super(rVar);
        }

        /* renamed from: f */
        public void mo19789f(C3383c cVar, long j) throws IOException {
            super.mo19789f(cVar, j);
            this.f18176b += j;
        }
    }

    public CallServerInterceptor(boolean z) {
        this.f18175a = z;
    }

    /* renamed from: a */
    public Response mo18702a(C3373a aVar) throws IOException {
        Response b0Var;
        RealInterceptorChain gVar = (RealInterceptorChain) aVar;
        HttpCodec h = gVar.mo19807h();
        StreamAllocation j = gVar.mo19809j();
        RealConnection cVar = (RealConnection) gVar.mo19805f();
        C3378z S = gVar.mo19799S();
        long currentTimeMillis = System.currentTimeMillis();
        gVar.mo19806g().mo20034o(gVar.mo19804e());
        h.mo19791b(S);
        gVar.mo19806g().mo20033n(gVar.mo19804e(), S);
        C3306a aVar2 = null;
        if (HttpMethod.m23178b(S.mo20144f()) && S.mo20139a() != null) {
            if ("100-continue".equalsIgnoreCase(S.mo20141c("Expect"))) {
                h.mo19794d();
                gVar.mo19806g().mo20038s(gVar.mo19804e());
                aVar2 = h.mo19796f(true);
            }
            if (aVar2 == null) {
                gVar.mo19806g().mo20032m(gVar.mo19804e());
                C3318a aVar3 = new C3318a(h.mo19795e(S, S.mo20139a().mo19655a()));
                BufferedSink b = Okio.m23919b(aVar3);
                S.mo20139a().mo19657e(b);
                b.close();
                gVar.mo19806g().mo20031l(gVar.mo19804e(), aVar3.f18176b);
            } else if (!cVar.mo19758n()) {
                j.mo19782j();
            }
        }
        h.mo19790a();
        if (aVar2 == null) {
            gVar.mo19806g().mo20038s(gVar.mo19804e());
            aVar2 = h.mo19796f(false);
        }
        Response c = aVar2.mo19688p(S).mo19680h(j.mo19779d().mo19755k()).mo19689q(currentTimeMillis).mo19687o(System.currentTimeMillis()).mo19677c();
        int D = c.mo19661D();
        if (D == 100) {
            c = h.mo19796f(false).mo19688p(S).mo19680h(j.mo19779d().mo19755k()).mo19689q(currentTimeMillis).mo19687o(System.currentTimeMillis()).mo19677c();
            D = c.mo19661D();
        }
        gVar.mo19806g().mo20037r(gVar.mo19804e(), c);
        if (!this.f18175a || D != 101) {
            b0Var = c.mo19668K().mo19676b(h.mo19792c(c)).mo19677c();
        } else {
            b0Var = c.mo19668K().mo19676b(C3310c.f18088c).mo19677c();
        }
        String str = "Connection";
        String str2 = "close";
        if (str2.equalsIgnoreCase(b0Var.mo19671N().mo20141c(str)) || str2.equalsIgnoreCase(b0Var.mo19663F(str))) {
            j.mo19782j();
        }
        if ((D != 204 && D != 205) || b0Var.mo19659B().mo19690C() <= 0) {
            return b0Var;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("HTTP ");
        sb.append(D);
        sb.append(" had non-zero Content-Length: ");
        sb.append(b0Var.mo19659B().mo19690C());
        throw new ProtocolException(sb.toString());
    }
}
