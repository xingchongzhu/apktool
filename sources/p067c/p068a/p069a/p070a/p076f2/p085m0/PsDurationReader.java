package p067c.p068a.p069a.p070a.p076f2.p085m0;

import com.umeng.analytics.pro.TType;
import java.io.IOException;
import p067c.p068a.p069a.p070a.p076f2.ExtractorInput;
import p067c.p068a.p069a.p070a.p076f2.PositionHolder;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.TimestampAdjuster;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.f2.m0.a0 */
final class PsDurationReader {

    /* renamed from: a */
    private final TimestampAdjuster f6578a = new TimestampAdjuster(0);

    /* renamed from: b */
    private final ParsableByteArray f6579b = new ParsableByteArray();

    /* renamed from: c */
    private boolean f6580c;

    /* renamed from: d */
    private boolean f6581d;

    /* renamed from: e */
    private boolean f6582e;

    /* renamed from: f */
    private long f6583f = -9223372036854775807L;

    /* renamed from: g */
    private long f6584g = -9223372036854775807L;

    /* renamed from: h */
    private long f6585h = -9223372036854775807L;

    PsDurationReader() {
    }

    /* renamed from: a */
    private static boolean m7941a(byte[] bArr) {
        boolean z = false;
        if ((bArr[0] & 196) != 68 || (bArr[2] & 4) != 4 || (bArr[4] & 4) != 4 || (bArr[5] & 1) != 1) {
            return false;
        }
        if ((bArr[8] & 3) == 3) {
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    private int m7942b(ExtractorInput kVar) {
        this.f6579b.mo7371M(Util.f8403f);
        this.f6580c = true;
        kVar.mo6199h();
        return 0;
    }

    /* renamed from: f */
    private int m7943f(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << TType.f16865n) | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: h */
    private int m7944h(ExtractorInput kVar, PositionHolder xVar) throws IOException {
        int min = (int) Math.min(20000, kVar.mo6194a());
        long j = (long) 0;
        if (kVar.mo6206q() != j) {
            xVar.f7015a = j;
            return 1;
        }
        this.f6579b.mo7370L(min);
        kVar.mo6199h();
        kVar.mo6204o(this.f6579b.mo7379d(), 0, min);
        this.f6583f = m7945i(this.f6579b);
        this.f6581d = true;
        return 0;
    }

    /* renamed from: i */
    private long m7945i(ParsableByteArray a0Var) {
        int f = a0Var.mo7381f();
        for (int e = a0Var.mo7380e(); e < f - 3; e++) {
            if (m7943f(a0Var.mo7379d(), e) == 442) {
                a0Var.mo7374P(e + 4);
                long l = m7948l(a0Var);
                if (l != -9223372036854775807L) {
                    return l;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: j */
    private int m7946j(ExtractorInput kVar, PositionHolder xVar) throws IOException {
        long a = kVar.mo6194a();
        int min = (int) Math.min(20000, a);
        long j = a - ((long) min);
        if (kVar.mo6206q() != j) {
            xVar.f7015a = j;
            return 1;
        }
        this.f6579b.mo7370L(min);
        kVar.mo6199h();
        kVar.mo6204o(this.f6579b.mo7379d(), 0, min);
        this.f6584g = m7947k(this.f6579b);
        this.f6582e = true;
        return 0;
    }

    /* renamed from: k */
    private long m7947k(ParsableByteArray a0Var) {
        int e = a0Var.mo7380e();
        for (int f = a0Var.mo7381f() - 4; f >= e; f--) {
            if (m7943f(a0Var.mo7379d(), f) == 442) {
                a0Var.mo7374P(f + 4);
                long l = m7948l(a0Var);
                if (l != -9223372036854775807L) {
                    return l;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: l */
    public static long m7948l(ParsableByteArray a0Var) {
        int e = a0Var.mo7380e();
        if (a0Var.mo7376a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        a0Var.mo7385j(bArr, 0, 9);
        a0Var.mo7374P(e);
        if (!m7941a(bArr)) {
            return -9223372036854775807L;
        }
        return m7949m(bArr);
    }

    /* renamed from: m */
    private static long m7949m(byte[] bArr) {
        return (((((long) bArr[0]) & 56) >> 3) << 30) | ((((long) bArr[0]) & 3) << 28) | ((((long) bArr[1]) & 255) << 20) | (((((long) bArr[2]) & 248) >> 3) << 15) | ((((long) bArr[2]) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    /* renamed from: c */
    public long mo6318c() {
        return this.f6585h;
    }

    /* renamed from: d */
    public TimestampAdjuster mo6319d() {
        return this.f6578a;
    }

    /* renamed from: e */
    public boolean mo6320e() {
        return this.f6580c;
    }

    /* renamed from: g */
    public int mo6321g(ExtractorInput kVar, PositionHolder xVar) throws IOException {
        if (!this.f6582e) {
            return m7946j(kVar, xVar);
        }
        if (this.f6584g == -9223372036854775807L) {
            return m7942b(kVar);
        }
        if (!this.f6581d) {
            return m7944h(kVar, xVar);
        }
        long j = this.f6583f;
        if (j == -9223372036854775807L) {
            return m7942b(kVar);
        }
        this.f6585h = this.f6578a.mo7447b(this.f6584g) - this.f6578a.mo7447b(j);
        return m7942b(kVar);
    }
}
