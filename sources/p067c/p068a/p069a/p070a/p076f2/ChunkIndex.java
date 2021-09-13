package p067c.p068a.p069a.p070a.p076f2;

import java.util.Arrays;
import p067c.p068a.p069a.p070a.p076f2.SeekMap.C1002a;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.f2.e */
public final class ChunkIndex implements SeekMap {

    /* renamed from: a */
    public final int f6023a;

    /* renamed from: b */
    public final int[] f6024b;

    /* renamed from: c */
    public final long[] f6025c;

    /* renamed from: d */
    public final long[] f6026d;

    /* renamed from: e */
    public final long[] f6027e;

    /* renamed from: f */
    private final long f6028f;

    public ChunkIndex(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f6024b = iArr;
        this.f6025c = jArr;
        this.f6026d = jArr2;
        this.f6027e = jArr3;
        int length = iArr.length;
        this.f6023a = length;
        if (length > 0) {
            this.f6028f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f6028f = 0;
        }
    }

    /* renamed from: a */
    public int mo6186a(long j) {
        return Util.m10291h(this.f6027e, j, true, true);
    }

    /* renamed from: f */
    public boolean mo6167f() {
        return true;
    }

    /* renamed from: h */
    public C1002a mo6168h(long j) {
        int a = mo6186a(j);
        SeekPoint zVar = new SeekPoint(this.f6027e[a], this.f6025c[a]);
        if (zVar.f7021b >= j || a == this.f6023a - 1) {
            return new C1002a(zVar);
        }
        int i = a + 1;
        return new C1002a(zVar, new SeekPoint(this.f6027e[i], this.f6025c[i]));
    }

    /* renamed from: j */
    public long mo6169j() {
        return this.f6028f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChunkIndex(length=");
        sb.append(this.f6023a);
        sb.append(", sizes=");
        sb.append(Arrays.toString(this.f6024b));
        sb.append(", offsets=");
        sb.append(Arrays.toString(this.f6025c));
        sb.append(", timeUs=");
        sb.append(Arrays.toString(this.f6027e));
        sb.append(", durationsUs=");
        sb.append(Arrays.toString(this.f6026d));
        sb.append(")");
        return sb.toString();
    }
}
