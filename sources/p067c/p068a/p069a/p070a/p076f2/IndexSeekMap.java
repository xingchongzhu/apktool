package p067c.p068a.p069a.p070a.p076f2;

import p067c.p068a.p069a.p070a.p076f2.SeekMap.C1002a;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.f2.w */
public final class IndexSeekMap implements SeekMap {

    /* renamed from: a */
    private final long[] f7011a;

    /* renamed from: b */
    private final long[] f7012b;

    /* renamed from: c */
    private final long f7013c;

    /* renamed from: d */
    private final boolean f7014d;

    public IndexSeekMap(long[] jArr, long[] jArr2, long j) {
        Assertions.m10149a(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z = length > 0;
        this.f7014d = z;
        if (!z || jArr2[0] <= 0) {
            this.f7011a = jArr;
            this.f7012b = jArr2;
        } else {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.f7011a = jArr3;
            long[] jArr4 = new long[i];
            this.f7012b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f7013c = j;
    }

    /* renamed from: f */
    public boolean mo6167f() {
        return this.f7014d;
    }

    /* renamed from: h */
    public C1002a mo6168h(long j) {
        if (!this.f7014d) {
            return new C1002a(SeekPoint.f7020a);
        }
        int h = Util.m10291h(this.f7012b, j, true, true);
        SeekPoint zVar = new SeekPoint(this.f7012b[h], this.f7011a[h]);
        if (zVar.f7021b == j || h == this.f7012b.length - 1) {
            return new C1002a(zVar);
        }
        int i = h + 1;
        return new C1002a(zVar, new SeekPoint(this.f7012b[i], this.f7011a[i]));
    }

    /* renamed from: j */
    public long mo6169j() {
        return this.f7013c;
    }
}
