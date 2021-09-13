package p067c.p068a.p069a.p070a.p076f2.p086n0;

import p067c.p068a.p069a.p070a.p076f2.SeekMap;
import p067c.p068a.p069a.p070a.p076f2.SeekMap.C1002a;
import p067c.p068a.p069a.p070a.p076f2.SeekPoint;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.f2.n0.e */
final class WavSeekMap implements SeekMap {

    /* renamed from: a */
    private final WavHeader f6982a;

    /* renamed from: b */
    private final int f6983b;

    /* renamed from: c */
    private final long f6984c;

    /* renamed from: d */
    private final long f6985d;

    /* renamed from: e */
    private final long f6986e;

    public WavSeekMap(WavHeader cVar, int i, long j, long j2) {
        this.f6982a = cVar;
        this.f6983b = i;
        this.f6984c = j;
        long j3 = (j2 - j) / ((long) cVar.f6977e);
        this.f6985d = j3;
        this.f6986e = m8264a(j3);
    }

    /* renamed from: a */
    private long m8264a(long j) {
        return Util.m10240B0(j * ((long) this.f6983b), 1000000, (long) this.f6982a.f6975c);
    }

    /* renamed from: f */
    public boolean mo6167f() {
        return true;
    }

    /* renamed from: h */
    public C1002a mo6168h(long j) {
        long q = Util.m10309q((((long) this.f6982a.f6975c) * j) / (((long) this.f6983b) * 1000000), 0, this.f6985d - 1);
        long j2 = this.f6984c + (((long) this.f6982a.f6977e) * q);
        long a = m8264a(q);
        SeekPoint zVar = new SeekPoint(a, j2);
        if (a >= j || q == this.f6985d - 1) {
            return new C1002a(zVar);
        }
        long j3 = q + 1;
        return new C1002a(zVar, new SeekPoint(m8264a(j3), this.f6984c + (((long) this.f6982a.f6977e) * j3)));
    }

    /* renamed from: j */
    public long mo6169j() {
        return this.f6986e;
    }
}
