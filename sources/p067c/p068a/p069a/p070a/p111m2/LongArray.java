package p067c.p068a.p069a.p070a.p111m2;

import java.util.Arrays;

/* renamed from: c.a.a.a.m2.u */
public final class LongArray {

    /* renamed from: a */
    private int f8432a;

    /* renamed from: b */
    private long[] f8433b;

    public LongArray() {
        this(32);
    }

    /* renamed from: a */
    public void mo7481a(long j) {
        int i = this.f8432a;
        long[] jArr = this.f8433b;
        if (i == jArr.length) {
            this.f8433b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f8433b;
        int i2 = this.f8432a;
        this.f8432a = i2 + 1;
        jArr2[i2] = j;
    }

    /* renamed from: b */
    public long mo7482b(int i) {
        if (i >= 0 && i < this.f8432a) {
            return this.f8433b[i];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid index ");
        sb.append(i);
        sb.append(", size is ");
        sb.append(this.f8432a);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: c */
    public int mo7483c() {
        return this.f8432a;
    }

    /* renamed from: d */
    public long[] mo7484d() {
        return Arrays.copyOf(this.f8433b, this.f8432a);
    }

    public LongArray(int i) {
        this.f8433b = new long[i];
    }
}
