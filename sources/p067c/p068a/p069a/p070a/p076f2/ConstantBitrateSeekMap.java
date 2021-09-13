package p067c.p068a.p069a.p070a.p076f2;

import p067c.p068a.p069a.p070a.p076f2.SeekMap.C1002a;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.f2.f */
public class ConstantBitrateSeekMap implements SeekMap {

    /* renamed from: a */
    private final long f6051a;

    /* renamed from: b */
    private final long f6052b;

    /* renamed from: c */
    private final int f6053c;

    /* renamed from: d */
    private final long f6054d;

    /* renamed from: e */
    private final int f6055e;

    /* renamed from: f */
    private final long f6056f;

    public ConstantBitrateSeekMap(long j, long j2, int i, int i2) {
        this.f6051a = j;
        this.f6052b = j2;
        if (i2 == -1) {
            i2 = 1;
        }
        this.f6053c = i2;
        this.f6055e = i;
        if (j == -1) {
            this.f6054d = -1;
            this.f6056f = -9223372036854775807L;
            return;
        }
        this.f6054d = j - j2;
        this.f6056f = m7382c(j, j2, i);
    }

    /* renamed from: a */
    private long m7381a(long j) {
        long j2 = (j * ((long) this.f6055e)) / 8000000;
        int i = this.f6053c;
        return this.f6052b + Util.m10309q((j2 / ((long) i)) * ((long) i), 0, this.f6054d - ((long) i));
    }

    /* renamed from: c */
    private static long m7382c(long j, long j2, int i) {
        return ((Math.max(0, j - j2) * 8) * 1000000) / ((long) i);
    }

    /* renamed from: b */
    public long mo6193b(long j) {
        return m7382c(j, this.f6052b, this.f6055e);
    }

    /* renamed from: f */
    public boolean mo6167f() {
        return this.f6054d != -1;
    }

    /* renamed from: h */
    public C1002a mo6168h(long j) {
        if (this.f6054d == -1) {
            return new C1002a(new SeekPoint(0, this.f6052b));
        }
        long a = m7381a(j);
        long b = mo6193b(a);
        SeekPoint zVar = new SeekPoint(b, a);
        if (b < j) {
            int i = this.f6053c;
            if (((long) i) + a < this.f6051a) {
                long j2 = a + ((long) i);
                return new C1002a(zVar, new SeekPoint(mo6193b(j2), j2));
            }
        }
        return new C1002a(zVar);
    }

    /* renamed from: j */
    public long mo6169j() {
        return this.f6056f;
    }
}
