package p067c.p068a.p069a.p070a;

import android.os.SystemClock;
import p067c.p068a.p069a.p070a.MediaItem.C1265f;
import p067c.p068a.p069a.p070a.p111m2.Util;
import p067c.p068a.p134b.p137c.Longs;

/* renamed from: c.a.a.a.l0 */
public final class DefaultLivePlaybackSpeedControl implements LivePlaybackSpeedControl {

    /* renamed from: a */
    private final float f8113a;

    /* renamed from: b */
    private final float f8114b;

    /* renamed from: c */
    private final long f8115c;

    /* renamed from: d */
    private final float f8116d;

    /* renamed from: e */
    private final long f8117e;

    /* renamed from: f */
    private final long f8118f;

    /* renamed from: g */
    private final float f8119g;

    /* renamed from: h */
    private long f8120h;

    /* renamed from: i */
    private long f8121i;

    /* renamed from: j */
    private long f8122j;

    /* renamed from: k */
    private long f8123k;

    /* renamed from: l */
    private long f8124l;

    /* renamed from: m */
    private long f8125m;

    /* renamed from: n */
    private float f8126n;

    /* renamed from: o */
    private float f8127o;

    /* renamed from: p */
    private float f8128p;

    /* renamed from: q */
    private long f8129q;

    /* renamed from: r */
    private long f8130r;

    /* renamed from: s */
    private long f8131s;

    /* renamed from: c.a.a.a.l0$b */
    /* compiled from: DefaultLivePlaybackSpeedControl */
    public static final class C1154b {

        /* renamed from: a */
        private float f8132a = 0.97f;

        /* renamed from: b */
        private float f8133b = 1.03f;

        /* renamed from: c */
        private long f8134c = 1000;

        /* renamed from: d */
        private float f8135d = 1.0E-7f;

        /* renamed from: e */
        private long f8136e = C.m8860c(20);

        /* renamed from: f */
        private long f8137f = C.m8860c(500);

        /* renamed from: g */
        private float f8138g = 0.999f;

        /* renamed from: a */
        public DefaultLivePlaybackSpeedControl mo7190a() {
            DefaultLivePlaybackSpeedControl l0Var = new DefaultLivePlaybackSpeedControl(this.f8132a, this.f8133b, this.f8134c, this.f8135d, this.f8136e, this.f8137f, this.f8138g);
            return l0Var;
        }
    }

    /* renamed from: f */
    private void m9827f(long j) {
        long j2 = this.f8130r + (this.f8131s * 3);
        if (this.f8125m > j2) {
            float c = (float) C.m8860c(this.f8115c);
            this.f8125m = Longs.m12048c(j2, this.f8122j, this.f8125m - (((long) ((this.f8128p - 1.0f) * c)) + ((long) ((this.f8126n - 1.0f) * c))));
            return;
        }
        long q = Util.m10309q(j - ((long) (Math.max(0.0f, this.f8128p - 1.0f) / this.f8116d)), this.f8125m, j2);
        this.f8125m = q;
        long j3 = this.f8124l;
        if (j3 != -9223372036854775807L && q > j3) {
            this.f8125m = j3;
        }
    }

    /* renamed from: g */
    private void m9828g() {
        long j = this.f8120h;
        if (j != -9223372036854775807L) {
            long j2 = this.f8121i;
            if (j2 != -9223372036854775807L) {
                j = j2;
            }
            long j3 = this.f8123k;
            if (j3 != -9223372036854775807L && j < j3) {
                j = j3;
            }
            long j4 = this.f8124l;
            if (j4 != -9223372036854775807L && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f8122j != j) {
            this.f8122j = j;
            this.f8125m = j;
            this.f8130r = -9223372036854775807L;
            this.f8131s = -9223372036854775807L;
            this.f8129q = -9223372036854775807L;
        }
    }

    /* renamed from: h */
    private static long m9829h(long j, long j2, float f) {
        return (long) ((((float) j) * f) + ((1.0f - f) * ((float) j2)));
    }

    /* renamed from: i */
    private void m9830i(long j, long j2) {
        long j3 = j - j2;
        long j4 = this.f8130r;
        if (j4 == -9223372036854775807L) {
            this.f8130r = j3;
            this.f8131s = 0;
            return;
        }
        long max = Math.max(j3, m9829h(j4, j3, this.f8119g));
        this.f8130r = max;
        this.f8131s = m9829h(this.f8131s, Math.abs(j3 - max), this.f8119g);
    }

    /* renamed from: a */
    public void mo7185a() {
        long j = this.f8125m;
        if (j != -9223372036854775807L) {
            long j2 = j + this.f8118f;
            this.f8125m = j2;
            long j3 = this.f8124l;
            if (j3 != -9223372036854775807L && j2 > j3) {
                this.f8125m = j3;
            }
            this.f8129q = -9223372036854775807L;
        }
    }

    /* renamed from: b */
    public void mo7186b(C1265f fVar) {
        this.f8120h = C.m8860c(fVar.f9033b);
        this.f8123k = C.m8860c(fVar.f9034c);
        this.f8124l = C.m8860c(fVar.f9035d);
        float f = fVar.f9036e;
        if (f == -3.4028235E38f) {
            f = this.f8113a;
        }
        this.f8127o = f;
        float f2 = fVar.f9037f;
        if (f2 == -3.4028235E38f) {
            f2 = this.f8114b;
        }
        this.f8126n = f2;
        m9828g();
    }

    /* renamed from: c */
    public float mo7187c(long j, long j2) {
        if (this.f8120h == -9223372036854775807L) {
            return 1.0f;
        }
        m9830i(j, j2);
        if (this.f8129q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f8129q < this.f8115c) {
            return this.f8128p;
        }
        this.f8129q = SystemClock.elapsedRealtime();
        m9827f(j);
        long j3 = j - this.f8125m;
        if (Math.abs(j3) < this.f8117e) {
            this.f8128p = 1.0f;
        } else {
            this.f8128p = Util.m10305o((this.f8116d * ((float) j3)) + 1.0f, this.f8127o, this.f8126n);
        }
        return this.f8128p;
    }

    /* renamed from: d */
    public void mo7188d(long j) {
        this.f8121i = j;
        m9828g();
    }

    /* renamed from: e */
    public long mo7189e() {
        return this.f8125m;
    }

    private DefaultLivePlaybackSpeedControl(float f, float f2, long j, float f3, long j2, long j3, float f4) {
        this.f8113a = f;
        this.f8114b = f2;
        this.f8115c = j;
        this.f8116d = f3;
        this.f8117e = j2;
        this.f8118f = j3;
        this.f8119g = f4;
        this.f8120h = -9223372036854775807L;
        this.f8121i = -9223372036854775807L;
        this.f8123k = -9223372036854775807L;
        this.f8124l = -9223372036854775807L;
        this.f8127o = f;
        this.f8126n = f2;
        this.f8128p = 1.0f;
        this.f8129q = -9223372036854775807L;
        this.f8122j = -9223372036854775807L;
        this.f8125m = -9223372036854775807L;
        this.f8130r = -9223372036854775807L;
        this.f8131s = -9223372036854775807L;
    }
}
