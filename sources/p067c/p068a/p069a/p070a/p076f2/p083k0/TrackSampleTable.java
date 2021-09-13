package p067c.p068a.p069a.p070a.p076f2.p083k0;

import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.f2.k0.r */
final class TrackSampleTable {

    /* renamed from: a */
    public final Track f6501a;

    /* renamed from: b */
    public final int f6502b;

    /* renamed from: c */
    public final long[] f6503c;

    /* renamed from: d */
    public final int[] f6504d;

    /* renamed from: e */
    public final int f6505e;

    /* renamed from: f */
    public final long[] f6506f;

    /* renamed from: g */
    public final int[] f6507g;

    /* renamed from: h */
    public final long f6508h;

    public TrackSampleTable(Track oVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        boolean z = false;
        Assertions.m10149a(iArr.length == jArr2.length);
        Assertions.m10149a(jArr.length == jArr2.length);
        if (iArr2.length == jArr2.length) {
            z = true;
        }
        Assertions.m10149a(z);
        this.f6501a = oVar;
        this.f6503c = jArr;
        this.f6504d = iArr;
        this.f6505e = i;
        this.f6506f = jArr2;
        this.f6507g = iArr2;
        this.f6508h = j;
        this.f6502b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    /* renamed from: a */
    public int mo6291a(long j) {
        for (int h = Util.m10291h(this.f6506f, j, true, false); h >= 0; h--) {
            if ((this.f6507g[h] & 1) != 0) {
                return h;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public int mo6292b(long j) {
        for (int d = Util.m10283d(this.f6506f, j, true, false); d < this.f6506f.length; d++) {
            if ((this.f6507g[d] & 1) != 0) {
                return d;
            }
        }
        return -1;
    }
}
