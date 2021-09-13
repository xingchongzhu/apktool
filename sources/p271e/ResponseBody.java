package p271e;

import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;
import p271e.p272f0.C3310c;
import p281f.BufferedSource;
import p281f.C3383c;

/* renamed from: e.c0 */
public abstract class ResponseBody implements Closeable {

    /* renamed from: e.c0$a */
    /* compiled from: ResponseBody */
    class C3308a extends ResponseBody {

        /* renamed from: a */
        final /* synthetic */ MediaType f18048a;

        /* renamed from: b */
        final /* synthetic */ long f18049b;

        /* renamed from: c */
        final /* synthetic */ BufferedSource f18050c;

        C3308a(MediaType vVar, long j, BufferedSource eVar) {
            this.f18048a = vVar;
            this.f18049b = j;
            this.f18050c = eVar;
        }

        /* renamed from: C */
        public long mo19690C() {
            return this.f18049b;
        }

        /* renamed from: D */
        public MediaType mo19691D() {
            return this.f18048a;
        }

        /* renamed from: H */
        public BufferedSource mo19692H() {
            return this.f18050c;
        }
    }

    /* renamed from: B */
    private Charset m22988B() {
        MediaType D = mo19691D();
        return D != null ? D.mo20096b(C3310c.f18095j) : C3310c.f18095j;
    }

    /* renamed from: E */
    public static ResponseBody m22989E(MediaType vVar, long j, BufferedSource eVar) {
        Objects.requireNonNull(eVar, "source == null");
        return new C3308a(vVar, j, eVar);
    }

    /* renamed from: F */
    public static ResponseBody m22990F(MediaType vVar, String str) {
        Charset charset = C3310c.f18095j;
        if (vVar != null) {
            Charset a = vVar.mo20095a();
            if (a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(vVar);
                sb.append("; charset=utf-8");
                vVar = MediaType.m23689d(sb.toString());
            } else {
                charset = a;
            }
        }
        C3383c h0 = new C3383c().mo20207h0(str, charset);
        return m22989E(vVar, h0.mo20186Q(), h0);
    }

    /* renamed from: G */
    public static ResponseBody m22991G(MediaType vVar, byte[] bArr) {
        return m22989E(vVar, (long) bArr.length, new C3383c().mo20220p(bArr));
    }

    /* renamed from: C */
    public abstract long mo19690C();

    /* renamed from: D */
    public abstract MediaType mo19691D();

    /* renamed from: H */
    public abstract BufferedSource mo19692H();

    /* renamed from: I */
    public final String mo19693I() throws IOException {
        BufferedSource H = mo19692H();
        try {
            return H.mo20170A(C3310c.m23049c(H, m22988B()));
        } finally {
            C3310c.m23052f(H);
        }
    }

    public void close() {
        C3310c.m23052f(mo19692H());
    }
}
