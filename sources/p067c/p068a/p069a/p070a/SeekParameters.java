package p067c.p068a.p069a.p070a;

import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.u1 */
public final class SeekParameters {

    /* renamed from: a */
    public static final SeekParameters f8859a;

    /* renamed from: b */
    public static final SeekParameters f8860b = new SeekParameters(Long.MAX_VALUE, Long.MAX_VALUE);

    /* renamed from: c */
    public static final SeekParameters f8861c = new SeekParameters(Long.MAX_VALUE, 0);

    /* renamed from: d */
    public static final SeekParameters f8862d = new SeekParameters(0, Long.MAX_VALUE);

    /* renamed from: e */
    public static final SeekParameters f8863e;

    /* renamed from: f */
    public final long f8864f;

    /* renamed from: g */
    public final long f8865g;

    static {
        SeekParameters u1Var = new SeekParameters(0, 0);
        f8859a = u1Var;
        f8863e = u1Var;
    }

    public SeekParameters(long j, long j2) {
        boolean z = true;
        Assertions.m10149a(j >= 0);
        if (j2 < 0) {
            z = false;
        }
        Assertions.m10149a(z);
        this.f8864f = j;
        this.f8865g = j2;
    }

    /* renamed from: a */
    public long mo7711a(long j, long j2, long j3) {
        long j4 = this.f8864f;
        if (j4 == 0 && this.f8865g == 0) {
            return j;
        }
        long G0 = Util.m10250G0(j, j4, Long.MIN_VALUE);
        long a = Util.m10277a(j, this.f8865g, Long.MAX_VALUE);
        boolean z = true;
        boolean z2 = G0 <= j2 && j2 <= a;
        if (G0 > j3 || j3 > a) {
            z = false;
        }
        if (z2 && z) {
            return Math.abs(j2 - j) <= Math.abs(j3 - j) ? j2 : j3;
        }
        if (z2) {
            return j2;
        }
        return z ? j3 : G0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || SeekParameters.class != obj.getClass()) {
            return false;
        }
        SeekParameters u1Var = (SeekParameters) obj;
        if (!(this.f8864f == u1Var.f8864f && this.f8865g == u1Var.f8865g)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (((int) this.f8864f) * 31) + ((int) this.f8865g);
    }
}
