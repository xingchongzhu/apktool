package p271e.p272f0.p275g;

import java.io.IOException;
import p271e.C3378z;
import p271e.Response;
import p271e.Response.C3306a;
import p271e.ResponseBody;
import p281f.Sink;

/* renamed from: e.f0.g.c */
public interface HttpCodec {
    /* renamed from: a */
    void mo19790a() throws IOException;

    /* renamed from: b */
    void mo19791b(C3378z zVar) throws IOException;

    /* renamed from: c */
    ResponseBody mo19792c(Response b0Var) throws IOException;

    void cancel();

    /* renamed from: d */
    void mo19794d() throws IOException;

    /* renamed from: e */
    Sink mo19795e(C3378z zVar, long j);

    /* renamed from: f */
    C3306a mo19796f(boolean z) throws IOException;
}
