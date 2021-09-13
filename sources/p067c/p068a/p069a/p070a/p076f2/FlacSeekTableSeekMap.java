package p067c.p068a.p069a.p070a.p076f2;

import p067c.p068a.p069a.p070a.p076f2.FlacStreamMetadata.C1001a;
import p067c.p068a.p069a.p070a.p076f2.SeekMap.C1002a;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.f2.r */
public final class FlacSeekTableSeekMap implements SeekMap {

    /* renamed from: a */
    private final FlacStreamMetadata f6990a;

    /* renamed from: b */
    private final long f6991b;

    public FlacSeekTableSeekMap(FlacStreamMetadata sVar, long j) {
        this.f6990a = sVar;
        this.f6991b = j;
    }

    /* renamed from: a */
    private SeekPoint m8291a(long j, long j2) {
        return new SeekPoint((j * 1000000) / ((long) this.f6990a.f6996e), this.f6991b + j2);
    }

    /* renamed from: f */
    public boolean mo6167f() {
        return true;
    }

    /* renamed from: h */
    public C1002a mo6168h(long j) {
        long j2;
        Assertions.m10156h(this.f6990a.f7002k);
        FlacStreamMetadata sVar = this.f6990a;
        C1001a aVar = sVar.f7002k;
        long[] jArr = aVar.f7004a;
        long[] jArr2 = aVar.f7005b;
        int h = Util.m10291h(jArr, sVar.mo6388j(j), true, false);
        long j3 = 0;
        if (h == -1) {
            j2 = 0;
        } else {
            j2 = jArr[h];
        }
        if (h != -1) {
            j3 = jArr2[h];
        }
        SeekPoint a = m8291a(j2, j3);
        if (a.f7021b == j || h == jArr.length - 1) {
            return new C1002a(a);
        }
        int i = h + 1;
        return new C1002a(a, m8291a(jArr[i], jArr2[i]));
    }

    /* renamed from: j */
    public long mo6169j() {
        return this.f6990a.mo6385g();
    }
}
