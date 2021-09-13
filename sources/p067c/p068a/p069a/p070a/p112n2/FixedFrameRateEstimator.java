package p067c.p068a.p069a.p070a.p112n2;

import java.util.Arrays;

/* renamed from: c.a.a.a.n2.n */
final class FixedFrameRateEstimator {

    /* renamed from: a */
    private C1218a f8548a = new C1218a();

    /* renamed from: b */
    private C1218a f8549b = new C1218a();

    /* renamed from: c */
    private boolean f8550c;

    /* renamed from: d */
    private boolean f8551d;

    /* renamed from: e */
    private long f8552e = -9223372036854775807L;

    /* renamed from: f */
    private int f8553f;

    /* renamed from: c.a.a.a.n2.n$a */
    /* compiled from: FixedFrameRateEstimator */
    private static final class C1218a {

        /* renamed from: a */
        private long f8554a;

        /* renamed from: b */
        private long f8555b;

        /* renamed from: c */
        private long f8556c;

        /* renamed from: d */
        private long f8557d;

        /* renamed from: e */
        private long f8558e;

        /* renamed from: f */
        private long f8559f;

        /* renamed from: g */
        private final boolean[] f8560g = new boolean[15];

        /* renamed from: h */
        private int f8561h;

        /* renamed from: c */
        private static int m10519c(long j) {
            return (int) (j % 15);
        }

        /* renamed from: a */
        public long mo7552a() {
            long j = this.f8558e;
            if (j == 0) {
                return 0;
            }
            return this.f8559f / j;
        }

        /* renamed from: b */
        public long mo7553b() {
            return this.f8559f;
        }

        /* renamed from: d */
        public boolean mo7554d() {
            long j = this.f8557d;
            if (j == 0) {
                return false;
            }
            return this.f8560g[m10519c(j - 1)];
        }

        /* renamed from: e */
        public boolean mo7555e() {
            return this.f8557d > 15 && this.f8561h == 0;
        }

        /* renamed from: f */
        public void mo7556f(long j) {
            long j2 = this.f8557d;
            if (j2 == 0) {
                this.f8554a = j;
            } else if (j2 == 1) {
                long j3 = j - this.f8554a;
                this.f8555b = j3;
                this.f8559f = j3;
                this.f8558e = 1;
            } else {
                long j4 = j - this.f8556c;
                int c = m10519c(j2);
                if (Math.abs(j4 - this.f8555b) <= 1000000) {
                    this.f8558e++;
                    this.f8559f += j4;
                    boolean[] zArr = this.f8560g;
                    if (zArr[c]) {
                        zArr[c] = false;
                        this.f8561h--;
                    }
                } else {
                    boolean[] zArr2 = this.f8560g;
                    if (!zArr2[c]) {
                        zArr2[c] = true;
                        this.f8561h++;
                    }
                }
            }
            this.f8557d++;
            this.f8556c = j;
        }

        /* renamed from: g */
        public void mo7557g() {
            this.f8557d = 0;
            this.f8558e = 0;
            this.f8559f = 0;
            this.f8561h = 0;
            Arrays.fill(this.f8560g, false);
        }
    }

    /* renamed from: a */
    public long mo7545a() {
        if (mo7549e()) {
            return this.f8548a.mo7552a();
        }
        return -9223372036854775807L;
    }

    /* renamed from: b */
    public float mo7546b() {
        if (!mo7549e()) {
            return -1.0f;
        }
        double a = (double) this.f8548a.mo7552a();
        Double.isNaN(a);
        return (float) (1.0E9d / a);
    }

    /* renamed from: c */
    public int mo7547c() {
        return this.f8553f;
    }

    /* renamed from: d */
    public long mo7548d() {
        if (mo7549e()) {
            return this.f8548a.mo7553b();
        }
        return -9223372036854775807L;
    }

    /* renamed from: e */
    public boolean mo7549e() {
        return this.f8548a.mo7555e();
    }

    /* renamed from: f */
    public void mo7550f(long j) {
        this.f8548a.mo7556f(j);
        int i = 0;
        if (this.f8548a.mo7555e() && !this.f8551d) {
            this.f8550c = false;
        } else if (this.f8552e != -9223372036854775807L) {
            if (!this.f8550c || this.f8549b.mo7554d()) {
                this.f8549b.mo7557g();
                this.f8549b.mo7556f(this.f8552e);
            }
            this.f8550c = true;
            this.f8549b.mo7556f(j);
        }
        if (this.f8550c && this.f8549b.mo7555e()) {
            C1218a aVar = this.f8548a;
            this.f8548a = this.f8549b;
            this.f8549b = aVar;
            this.f8550c = false;
            this.f8551d = false;
        }
        this.f8552e = j;
        if (!this.f8548a.mo7555e()) {
            i = this.f8553f + 1;
        }
        this.f8553f = i;
    }

    /* renamed from: g */
    public void mo7551g() {
        this.f8548a.mo7557g();
        this.f8549b.mo7557g();
        this.f8550c = false;
        this.f8552e = -9223372036854775807L;
        this.f8553f = 0;
    }
}
