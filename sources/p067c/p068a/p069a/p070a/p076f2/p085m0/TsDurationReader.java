package p067c.p068a.p069a.p070a.p076f2.p085m0;

import java.io.IOException;
import p067c.p068a.p069a.p070a.p076f2.ExtractorInput;
import p067c.p068a.p069a.p070a.p076f2.PositionHolder;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.TimestampAdjuster;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.f2.m0.g0 */
final class TsDurationReader {

    /* renamed from: a */
    private final int f6638a;

    /* renamed from: b */
    private final TimestampAdjuster f6639b = new TimestampAdjuster(0);

    /* renamed from: c */
    private final ParsableByteArray f6640c = new ParsableByteArray();

    /* renamed from: d */
    private boolean f6641d;

    /* renamed from: e */
    private boolean f6642e;

    /* renamed from: f */
    private boolean f6643f;

    /* renamed from: g */
    private long f6644g = -9223372036854775807L;

    /* renamed from: h */
    private long f6645h = -9223372036854775807L;

    /* renamed from: i */
    private long f6646i = -9223372036854775807L;

    TsDurationReader(int i) {
        this.f6638a = i;
    }

    /* renamed from: a */
    private int m7997a(ExtractorInput kVar) {
        this.f6640c.mo7371M(Util.f8403f);
        this.f6641d = true;
        kVar.mo6199h();
        return 0;
    }

    /* renamed from: f */
    private int m7998f(ExtractorInput kVar, PositionHolder xVar, int i) throws IOException {
        int min = (int) Math.min((long) this.f6638a, kVar.mo6194a());
        long j = (long) 0;
        if (kVar.mo6206q() != j) {
            xVar.f7015a = j;
            return 1;
        }
        this.f6640c.mo7370L(min);
        kVar.mo6199h();
        kVar.mo6204o(this.f6640c.mo7379d(), 0, min);
        this.f6644g = m7999g(this.f6640c, i);
        this.f6642e = true;
        return 0;
    }

    /* renamed from: g */
    private long m7999g(ParsableByteArray a0Var, int i) {
        int f = a0Var.mo7381f();
        for (int e = a0Var.mo7380e(); e < f; e++) {
            if (a0Var.mo7379d()[e] == 71) {
                long b = TsUtil.m8072b(a0Var, e, i);
                if (b != -9223372036854775807L) {
                    return b;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: h */
    private int m8000h(ExtractorInput kVar, PositionHolder xVar, int i) throws IOException {
        long a = kVar.mo6194a();
        int min = (int) Math.min((long) this.f6638a, a);
        long j = a - ((long) min);
        if (kVar.mo6206q() != j) {
            xVar.f7015a = j;
            return 1;
        }
        this.f6640c.mo7370L(min);
        kVar.mo6199h();
        kVar.mo6204o(this.f6640c.mo7379d(), 0, min);
        this.f6645h = m8001i(this.f6640c, i);
        this.f6643f = true;
        return 0;
    }

    /* renamed from: i */
    private long m8001i(ParsableByteArray a0Var, int i) {
        int e = a0Var.mo7380e();
        int f = a0Var.mo7381f();
        while (true) {
            f--;
            if (f < e) {
                return -9223372036854775807L;
            }
            if (a0Var.mo7379d()[f] == 71) {
                long b = TsUtil.m8072b(a0Var, f, i);
                if (b != -9223372036854775807L) {
                    return b;
                }
            }
        }
    }

    /* renamed from: b */
    public long mo6336b() {
        return this.f6646i;
    }

    /* renamed from: c */
    public TimestampAdjuster mo6337c() {
        return this.f6639b;
    }

    /* renamed from: d */
    public boolean mo6338d() {
        return this.f6641d;
    }

    /* renamed from: e */
    public int mo6339e(ExtractorInput kVar, PositionHolder xVar, int i) throws IOException {
        if (i <= 0) {
            return m7997a(kVar);
        }
        if (!this.f6643f) {
            return m8000h(kVar, xVar, i);
        }
        if (this.f6645h == -9223372036854775807L) {
            return m7997a(kVar);
        }
        if (!this.f6642e) {
            return m7998f(kVar, xVar, i);
        }
        long j = this.f6644g;
        if (j == -9223372036854775807L) {
            return m7997a(kVar);
        }
        this.f6646i = this.f6639b.mo7447b(this.f6645h) - this.f6639b.mo7447b(j);
        return m7997a(kVar);
    }
}
