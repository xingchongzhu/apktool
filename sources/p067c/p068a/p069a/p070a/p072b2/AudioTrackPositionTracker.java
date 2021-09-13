package p067c.p068a.p069a.p070a.p072b2;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import p067c.p068a.p069a.p070a.C;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.b2.u */
final class AudioTrackPositionTracker {

    /* renamed from: A */
    private long f5582A;

    /* renamed from: B */
    private long f5583B;

    /* renamed from: C */
    private long f5584C;

    /* renamed from: D */
    private boolean f5585D;

    /* renamed from: E */
    private long f5586E;

    /* renamed from: F */
    private long f5587F;

    /* renamed from: a */
    private final C0839a f5588a;

    /* renamed from: b */
    private final long[] f5589b;

    /* renamed from: c */
    private AudioTrack f5590c;

    /* renamed from: d */
    private int f5591d;

    /* renamed from: e */
    private int f5592e;

    /* renamed from: f */
    private AudioTimestampPoller f5593f;

    /* renamed from: g */
    private int f5594g;

    /* renamed from: h */
    private boolean f5595h;

    /* renamed from: i */
    private long f5596i;

    /* renamed from: j */
    private float f5597j;

    /* renamed from: k */
    private boolean f5598k;

    /* renamed from: l */
    private long f5599l;

    /* renamed from: m */
    private long f5600m;

    /* renamed from: n */
    private Method f5601n;

    /* renamed from: o */
    private long f5602o;

    /* renamed from: p */
    private boolean f5603p;

    /* renamed from: q */
    private boolean f5604q;

    /* renamed from: r */
    private long f5605r;

    /* renamed from: s */
    private long f5606s;

    /* renamed from: t */
    private long f5607t;

    /* renamed from: u */
    private long f5608u;

    /* renamed from: v */
    private int f5609v;

    /* renamed from: w */
    private int f5610w;

    /* renamed from: x */
    private long f5611x;

    /* renamed from: y */
    private long f5612y;

    /* renamed from: z */
    private long f5613z;

    /* renamed from: c.a.a.a.b2.u$a */
    /* compiled from: AudioTrackPositionTracker */
    public interface C0839a {
        /* renamed from: a */
        void mo5914a(int i, long j);

        /* renamed from: b */
        void mo5915b(long j);

        /* renamed from: c */
        void mo5916c(long j, long j2, long j3, long j4);

        /* renamed from: d */
        void mo5917d(long j, long j2, long j3, long j4);

        /* renamed from: e */
        void mo5918e(long j);
    }

    public AudioTrackPositionTracker(C0839a aVar) {
        this.f5588a = (C0839a) Assertions.m10153e(aVar);
        if (Util.f8398a >= 18) {
            try {
                this.f5601n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f5589b = new long[10];
    }

    /* renamed from: a */
    private boolean m6729a() {
        return this.f5595h && ((AudioTrack) Assertions.m10153e(this.f5590c)).getPlayState() == 2 && m6731f() == 0;
    }

    /* renamed from: b */
    private long m6730b(long j) {
        return (j * 1000000) / ((long) this.f5594g);
    }

    /* renamed from: f */
    private long m6731f() {
        AudioTrack audioTrack = (AudioTrack) Assertions.m10153e(this.f5590c);
        if (this.f5611x != -9223372036854775807L) {
            return Math.min(this.f5582A, this.f5613z + ((((SystemClock.elapsedRealtime() * 1000) - this.f5611x) * ((long) this.f5594g)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = 4294967295L & ((long) audioTrack.getPlaybackHeadPosition());
        if (this.f5595h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f5608u = this.f5606s;
            }
            playbackHeadPosition += this.f5608u;
        }
        if (Util.f8398a <= 29) {
            if (playbackHeadPosition == 0 && this.f5606s > 0 && playState == 3) {
                if (this.f5612y == -9223372036854775807L) {
                    this.f5612y = SystemClock.elapsedRealtime();
                }
                return this.f5606s;
            }
            this.f5612y = -9223372036854775807L;
        }
        if (this.f5606s > playbackHeadPosition) {
            this.f5607t++;
        }
        this.f5606s = playbackHeadPosition;
        return playbackHeadPosition + (this.f5607t << 32);
    }

    /* renamed from: g */
    private long m6732g() {
        return m6730b(m6731f());
    }

    /* renamed from: m */
    private void m6733m(long j, long j2) {
        AudioTimestampPoller tVar = (AudioTimestampPoller) Assertions.m10153e(this.f5593f);
        if (tVar.mo5895e(j)) {
            long c = tVar.mo5893c();
            long b = tVar.mo5892b();
            if (Math.abs(c - j) > 5000000) {
                this.f5588a.mo5917d(b, c, j, j2);
                tVar.mo5896f();
            } else if (Math.abs(m6730b(b) - j2) > 5000000) {
                this.f5588a.mo5916c(b, c, j, j2);
                tVar.mo5896f();
            } else {
                tVar.mo5891a();
            }
        }
    }

    /* renamed from: n */
    private void m6734n() {
        long g = m6732g();
        if (g != 0) {
            long nanoTime = System.nanoTime() / 1000;
            if (nanoTime - this.f5600m >= 30000) {
                long[] jArr = this.f5589b;
                int i = this.f5609v;
                jArr[i] = g - nanoTime;
                this.f5609v = (i + 1) % 10;
                int i2 = this.f5610w;
                if (i2 < 10) {
                    this.f5610w = i2 + 1;
                }
                this.f5600m = nanoTime;
                this.f5599l = 0;
                int i3 = 0;
                while (true) {
                    int i4 = this.f5610w;
                    if (i3 >= i4) {
                        break;
                    }
                    this.f5599l += this.f5589b[i3] / ((long) i4);
                    i3++;
                }
            }
            if (!this.f5595h) {
                m6733m(nanoTime, g);
                m6735o(nanoTime);
            }
        }
    }

    /* renamed from: o */
    private void m6735o(long j) {
        if (this.f5604q) {
            Method method = this.f5601n;
            if (method != null && j - this.f5605r >= 500000) {
                try {
                    long intValue = (((long) ((Integer) Util.m10293i((Integer) method.invoke(Assertions.m10153e(this.f5590c), new Object[0]))).intValue()) * 1000) - this.f5596i;
                    this.f5602o = intValue;
                    long max = Math.max(intValue, 0);
                    this.f5602o = max;
                    if (max > 5000000) {
                        this.f5588a.mo5918e(max);
                        this.f5602o = 0;
                    }
                } catch (Exception unused) {
                    this.f5601n = null;
                }
                this.f5605r = j;
            }
        }
    }

    /* renamed from: p */
    private static boolean m6736p(int i) {
        return Util.f8398a < 23 && (i == 5 || i == 6);
    }

    /* renamed from: s */
    private void m6737s() {
        this.f5599l = 0;
        this.f5610w = 0;
        this.f5609v = 0;
        this.f5600m = 0;
        this.f5584C = 0;
        this.f5587F = 0;
        this.f5598k = false;
    }

    /* renamed from: c */
    public int mo5901c(long j) {
        return this.f5592e - ((int) (j - (m6731f() * ((long) this.f5591d))));
    }

    /* renamed from: d */
    public long mo5902d(boolean z) {
        long j;
        if (((AudioTrack) Assertions.m10153e(this.f5590c)).getPlayState() == 3) {
            m6734n();
        }
        long nanoTime = System.nanoTime() / 1000;
        AudioTimestampPoller tVar = (AudioTimestampPoller) Assertions.m10153e(this.f5593f);
        boolean d = tVar.mo5894d();
        if (d) {
            j = m6730b(tVar.mo5892b()) + Util.m10268R(nanoTime - tVar.mo5893c(), this.f5597j);
        } else {
            if (this.f5610w == 0) {
                j = m6732g();
            } else {
                j = this.f5599l + nanoTime;
            }
            if (!z) {
                j = Math.max(0, j - this.f5602o);
            }
        }
        if (this.f5585D != d) {
            this.f5587F = this.f5584C;
            this.f5586E = this.f5583B;
        }
        long j2 = nanoTime - this.f5587F;
        if (j2 < 1000000) {
            long j3 = (j2 * 1000) / 1000000;
            j = ((j * j3) + ((1000 - j3) * (this.f5586E + Util.m10268R(j2, this.f5597j)))) / 1000;
        }
        if (!this.f5598k) {
            long j4 = this.f5583B;
            if (j > j4) {
                this.f5598k = true;
                this.f5588a.mo5915b(System.currentTimeMillis() - C.m8861d(Util.m10275Y(C.m8861d(j - j4), this.f5597j)));
            }
        }
        this.f5584C = nanoTime;
        this.f5583B = j;
        this.f5585D = d;
        return j;
    }

    /* renamed from: e */
    public long mo5903e(long j) {
        return C.m8861d(m6730b(j - m6731f()));
    }

    /* renamed from: h */
    public void mo5904h(long j) {
        this.f5613z = m6731f();
        this.f5611x = SystemClock.elapsedRealtime() * 1000;
        this.f5582A = j;
    }

    /* renamed from: i */
    public boolean mo5905i(long j) {
        return j > m6731f() || m6729a();
    }

    /* renamed from: j */
    public boolean mo5906j() {
        return ((AudioTrack) Assertions.m10153e(this.f5590c)).getPlayState() == 3;
    }

    /* renamed from: k */
    public boolean mo5907k(long j) {
        return this.f5612y != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.f5612y >= 200;
    }

    /* renamed from: l */
    public boolean mo5908l(long j) {
        int playState = ((AudioTrack) Assertions.m10153e(this.f5590c)).getPlayState();
        if (this.f5595h) {
            if (playState == 2) {
                this.f5603p = false;
                return false;
            } else if (playState == 1 && m6731f() == 0) {
                return false;
            }
        }
        boolean z = this.f5603p;
        boolean i = mo5905i(j);
        this.f5603p = i;
        if (z && !i && playState != 1) {
            this.f5588a.mo5914a(this.f5592e, C.m8861d(this.f5596i));
        }
        return true;
    }

    /* renamed from: q */
    public boolean mo5909q() {
        m6737s();
        if (this.f5611x != -9223372036854775807L) {
            return false;
        }
        ((AudioTimestampPoller) Assertions.m10153e(this.f5593f)).mo5897g();
        return true;
    }

    /* renamed from: r */
    public void mo5910r() {
        m6737s();
        this.f5590c = null;
        this.f5593f = null;
    }

    /* renamed from: t */
    public void mo5911t(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        this.f5590c = audioTrack;
        this.f5591d = i2;
        this.f5592e = i3;
        this.f5593f = new AudioTimestampPoller(audioTrack);
        this.f5594g = audioTrack.getSampleRate();
        this.f5595h = z && m6736p(i);
        boolean j0 = Util.m10296j0(i);
        this.f5604q = j0;
        this.f5596i = j0 ? m6730b((long) (i3 / i2)) : -9223372036854775807L;
        this.f5606s = 0;
        this.f5607t = 0;
        this.f5608u = 0;
        this.f5603p = false;
        this.f5611x = -9223372036854775807L;
        this.f5612y = -9223372036854775807L;
        this.f5605r = 0;
        this.f5602o = 0;
        this.f5597j = 1.0f;
    }

    /* renamed from: u */
    public void mo5912u(float f) {
        this.f5597j = f;
        AudioTimestampPoller tVar = this.f5593f;
        if (tVar != null) {
            tVar.mo5897g();
        }
    }

    /* renamed from: v */
    public void mo5913v() {
        ((AudioTimestampPoller) Assertions.m10153e(this.f5593f)).mo5897g();
    }
}
