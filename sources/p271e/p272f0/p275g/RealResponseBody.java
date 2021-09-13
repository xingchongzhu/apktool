package p271e.p272f0.p275g;

import p271e.MediaType;
import p271e.ResponseBody;
import p281f.BufferedSource;

/* renamed from: e.f0.g.h */
public final class RealResponseBody extends ResponseBody {

    /* renamed from: a */
    private final String f18194a;

    /* renamed from: b */
    private final long f18195b;

    /* renamed from: c */
    private final BufferedSource f18196c;

    public RealResponseBody(String str, long j, BufferedSource eVar) {
        this.f18194a = str;
        this.f18195b = j;
        this.f18196c = eVar;
    }

    /* renamed from: C */
    public long mo19690C() {
        return this.f18195b;
    }

    /* renamed from: D */
    public MediaType mo19691D() {
        String str = this.f18194a;
        if (str != null) {
            return MediaType.m23689d(str);
        }
        return null;
    }

    /* renamed from: H */
    public BufferedSource mo19692H() {
        return this.f18196c;
    }
}
