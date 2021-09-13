package p067c.p068a.p069a.p070a.p076f2.p082j0;

import android.util.Pair;
import p067c.p068a.p069a.p070a.C;
import p067c.p068a.p069a.p070a.p076f2.SeekMap.C1002a;
import p067c.p068a.p069a.p070a.p076f2.SeekPoint;
import p067c.p068a.p069a.p070a.p088h2.p093m.MlltFrame;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.f2.j0.e */
final class MlltSeeker implements Seeker {

    /* renamed from: a */
    private final long[] f6294a;

    /* renamed from: b */
    private final long[] f6295b;

    /* renamed from: c */
    private final long f6296c;

    private MlltSeeker(long[] jArr, long[] jArr2, long j) {
        this.f6294a = jArr;
        this.f6295b = jArr2;
        if (j == -9223372036854775807L) {
            j = C.m8860c(jArr2[jArr2.length - 1]);
        }
        this.f6296c = j;
    }

    /* renamed from: a */
    public static MlltSeeker m7613a(long j, MlltFrame kVar, long j2) {
        int length = kVar.f7306e.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += (long) (kVar.f7304c + kVar.f7306e[i3]);
            j3 += (long) (kVar.f7305d + kVar.f7307f[i3]);
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new MlltSeeker(jArr, jArr2, j2);
    }

    /* renamed from: b */
    private static Pair<Long, Long> m7614b(long j, long[] jArr, long[] jArr2) {
        double d;
        int h = Util.m10291h(jArr, j, true, true);
        long j2 = jArr[h];
        long j3 = jArr2[h];
        int i = h + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        long j5 = jArr2[i];
        if (j4 == j2) {
            d = 0.0d;
        } else {
            double d2 = (double) j;
            double d3 = (double) j2;
            Double.isNaN(d2);
            Double.isNaN(d3);
            double d4 = d2 - d3;
            double d5 = (double) (j4 - j2);
            Double.isNaN(d5);
            d = d4 / d5;
        }
        double d6 = (double) (j5 - j3);
        Double.isNaN(d6);
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) (d * d6)) + j3));
    }

    /* renamed from: d */
    public long mo6252d() {
        return -1;
    }

    /* renamed from: f */
    public boolean mo6167f() {
        return true;
    }

    /* renamed from: g */
    public long mo6253g(long j) {
        return C.m8860c(((Long) m7614b(j, this.f6294a, this.f6295b).second).longValue());
    }

    /* renamed from: h */
    public C1002a mo6168h(long j) {
        Pair b = m7614b(C.m8861d(Util.m10309q(j, 0, this.f6296c)), this.f6295b, this.f6294a);
        return new C1002a(new SeekPoint(C.m8860c(((Long) b.first).longValue()), ((Long) b.second).longValue()));
    }

    /* renamed from: j */
    public long mo6169j() {
        return this.f6296c;
    }
}
