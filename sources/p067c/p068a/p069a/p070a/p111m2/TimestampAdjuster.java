package p067c.p068a.p069a.p070a.p111m2;

/* renamed from: c.a.a.a.m2.j0 */
public final class TimestampAdjuster {

    /* renamed from: a */
    private boolean f8382a;

    /* renamed from: b */
    private long f8383b;

    /* renamed from: c */
    private long f8384c;

    /* renamed from: d */
    private long f8385d = -9223372036854775807L;

    public TimestampAdjuster(long j) {
        this.f8383b = j;
    }

    /* renamed from: f */
    public static long m10205f(long j) {
        return (j * 1000000) / 90000;
    }

    /* renamed from: i */
    public static long m10206i(long j) {
        return (j * 90000) / 1000000;
    }

    /* renamed from: j */
    public static long m10207j(long j) {
        return m10206i(j) % 8589934592L;
    }

    /* renamed from: a */
    public synchronized long mo7446a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f8385d != -9223372036854775807L) {
            this.f8385d = j;
        } else {
            long j2 = this.f8383b;
            if (j2 != Long.MAX_VALUE) {
                this.f8384c = j2 - j;
            }
            this.f8385d = j;
            notifyAll();
        }
        return j + this.f8384c;
    }

    /* renamed from: b */
    public synchronized long mo7447b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.f8385d;
        if (j2 != -9223372036854775807L) {
            long i = m10206i(j2);
            long j3 = (4294967296L + i) / 8589934592L;
            long j4 = ((j3 - 1) * 8589934592L) + j;
            j += j3 * 8589934592L;
            if (Math.abs(j4 - i) < Math.abs(j - i)) {
                j = j4;
            }
        }
        return mo7446a(m10205f(j));
    }

    /* renamed from: c */
    public synchronized long mo7448c() {
        return this.f8383b;
    }

    /* renamed from: d */
    public synchronized long mo7449d() {
        long j;
        long j2 = this.f8385d;
        j = -9223372036854775807L;
        if (j2 != -9223372036854775807L) {
            j = this.f8384c + j2;
        } else {
            long j3 = this.f8383b;
            if (j3 != Long.MAX_VALUE) {
                j = j3;
            }
        }
        return j;
    }

    /* renamed from: e */
    public synchronized long mo7450e() {
        long j;
        j = -9223372036854775807L;
        if (this.f8383b == Long.MAX_VALUE) {
            j = 0;
        } else if (this.f8385d != -9223372036854775807L) {
            j = this.f8384c;
        }
        return j;
    }

    /* renamed from: g */
    public synchronized void mo7451g(long j) {
        this.f8383b = j;
        this.f8385d = -9223372036854775807L;
        this.f8382a = false;
    }

    /* renamed from: h */
    public synchronized void mo7452h(boolean z, long j) throws InterruptedException {
        if (z) {
            try {
                if (!this.f8382a) {
                    this.f8383b = j;
                    this.f8382a = true;
                }
            } finally {
            }
        }
        if (!z || j != this.f8383b) {
            while (this.f8385d == -9223372036854775807L) {
                wait();
            }
        }
    }
}
