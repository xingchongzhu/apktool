package p271e.p272f0.p274f;

import java.io.IOException;
import p271e.C3378z;
import p271e.Interceptor;
import p271e.Interceptor.C3373a;
import p271e.OkHttpClient;
import p271e.Response;
import p271e.p272f0.p275g.RealInterceptorChain;

/* renamed from: e.f0.f.a */
public final class ConnectInterceptor implements Interceptor {

    /* renamed from: a */
    public final OkHttpClient f18127a;

    public ConnectInterceptor(OkHttpClient wVar) {
        this.f18127a = wVar;
    }

    /* renamed from: a */
    public Response mo18702a(C3373a aVar) throws IOException {
        RealInterceptorChain gVar = (RealInterceptorChain) aVar;
        C3378z S = gVar.mo19799S();
        StreamAllocation j = gVar.mo19809j();
        return gVar.mo19808i(S, j, j.mo19781i(this.f18127a, aVar, !S.mo20144f().equals("GET")), j.mo19779d());
    }
}
