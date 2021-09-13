package p067c.p068a.p069a.p070a.p111m2;

import java.util.Arrays;

/* renamed from: c.a.a.a.m2.i0 */
public final class TimedValueQueue<V> {

    /* renamed from: a */
    private long[] f8376a;

    /* renamed from: b */
    private V[] f8377b;

    /* renamed from: c */
    private int f8378c;

    /* renamed from: d */
    private int f8379d;

    public TimedValueQueue() {
        this(10);
    }

    /* renamed from: b */
    private void m10189b(long j, V v) {
        int i = this.f8378c;
        int i2 = this.f8379d;
        int i3 = i + i2;
        V[] vArr = this.f8377b;
        int length = i3 % vArr.length;
        this.f8376a[length] = j;
        vArr[length] = v;
        this.f8379d = i2 + 1;
    }

    /* renamed from: d */
    private void m10190d(long j) {
        int i = this.f8379d;
        if (i > 0) {
            if (j <= this.f8376a[((this.f8378c + i) - 1) % this.f8377b.length]) {
                mo7437c();
            }
        }
    }

    /* renamed from: e */
    private void m10191e() {
        int length = this.f8377b.length;
        if (this.f8379d >= length) {
            int i = length * 2;
            long[] jArr = new long[i];
            V[] f = m10192f(i);
            int i2 = this.f8378c;
            int i3 = length - i2;
            System.arraycopy(this.f8376a, i2, jArr, 0, i3);
            System.arraycopy(this.f8377b, this.f8378c, f, 0, i3);
            int i4 = this.f8378c;
            if (i4 > 0) {
                System.arraycopy(this.f8376a, 0, jArr, i3, i4);
                System.arraycopy(this.f8377b, 0, f, i3, this.f8378c);
            }
            this.f8376a = jArr;
            this.f8377b = f;
            this.f8378c = 0;
        }
    }

    /* renamed from: f */
    private static <V> V[] m10192f(int i) {
        return new Object[i];
    }

    /* renamed from: h */
    private V m10193h(long j, boolean z) {
        V v = null;
        long j2 = Long.MAX_VALUE;
        while (this.f8379d > 0) {
            long j3 = j - this.f8376a[this.f8378c];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            v = m10194k();
            j2 = j3;
        }
        return v;
    }

    /* renamed from: k */
    private V m10194k() {
        Assertions.m10154f(this.f8379d > 0);
        V[] vArr = this.f8377b;
        int i = this.f8378c;
        V v = vArr[i];
        vArr[i] = null;
        this.f8378c = (i + 1) % vArr.length;
        this.f8379d--;
        return v;
    }

    /* renamed from: a */
    public synchronized void mo7436a(long j, V v) {
        m10190d(j);
        m10191e();
        m10189b(j, v);
    }

    /* renamed from: c */
    public synchronized void mo7437c() {
        this.f8378c = 0;
        this.f8379d = 0;
        Arrays.fill(this.f8377b, null);
    }

    /* renamed from: g */
    public synchronized V mo7438g(long j) {
        return m10193h(j, false);
    }

    /* renamed from: i */
    public synchronized V mo7439i() {
        return this.f8379d == 0 ? null : m10194k();
    }

    /* renamed from: j */
    public synchronized V mo7440j(long j) {
        return m10193h(j, true);
    }

    /* renamed from: l */
    public synchronized int mo7441l() {
        return this.f8379d;
    }

    public TimedValueQueue(int i) {
        this.f8376a = new long[i];
        this.f8377b = m10192f(i);
    }
}
