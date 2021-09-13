package p067c.p068a.p069a.p070a.p112n2;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.display.DisplayManager.DisplayListener;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.n2.w */
public final class VideoFrameReleaseHelper {

    /* renamed from: a */
    private final FixedFrameRateEstimator f8635a = new FixedFrameRateEstimator();

    /* renamed from: b */
    private final WindowManager f8636b;

    /* renamed from: c */
    private final C1222b f8637c;

    /* renamed from: d */
    private final C1221a f8638d;

    /* renamed from: e */
    private boolean f8639e;

    /* renamed from: f */
    private Surface f8640f;

    /* renamed from: g */
    private float f8641g;

    /* renamed from: h */
    private float f8642h;

    /* renamed from: i */
    private float f8643i;

    /* renamed from: j */
    private float f8644j;

    /* renamed from: k */
    private long f8645k;

    /* renamed from: l */
    private long f8646l;

    /* renamed from: m */
    private long f8647m;

    /* renamed from: n */
    private long f8648n;

    /* renamed from: o */
    private long f8649o;

    /* renamed from: p */
    private long f8650p;

    /* renamed from: q */
    private long f8651q;

    /* renamed from: c.a.a.a.n2.w$a */
    /* compiled from: VideoFrameReleaseHelper */
    private final class C1221a implements DisplayListener {

        /* renamed from: a */
        private final DisplayManager f8652a;

        public C1221a(DisplayManager displayManager) {
            this.f8652a = displayManager;
        }

        /* renamed from: a */
        public void mo7590a() {
            this.f8652a.registerDisplayListener(this, Util.m10319v());
        }

        /* renamed from: b */
        public void mo7591b() {
            this.f8652a.unregisterDisplayListener(this);
        }

        public void onDisplayAdded(int i) {
        }

        public void onDisplayChanged(int i) {
            if (i == 0) {
                VideoFrameReleaseHelper.this.m10606r();
            }
        }

        public void onDisplayRemoved(int i) {
        }
    }

    /* renamed from: c.a.a.a.n2.w$b */
    /* compiled from: VideoFrameReleaseHelper */
    private static final class C1222b implements FrameCallback, Callback {

        /* renamed from: a */
        private static final C1222b f8654a = new C1222b();

        /* renamed from: b */
        public volatile long f8655b = -9223372036854775807L;

        /* renamed from: c */
        private final Handler f8656c;

        /* renamed from: d */
        private final HandlerThread f8657d;

        /* renamed from: e */
        private Choreographer f8658e;

        /* renamed from: f */
        private int f8659f;

        private C1222b() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f8657d = handlerThread;
            handlerThread.start();
            Handler u = Util.m10317u(handlerThread.getLooper(), this);
            this.f8656c = u;
            u.sendEmptyMessage(0);
        }

        /* renamed from: b */
        private void m10621b() {
            int i = this.f8659f + 1;
            this.f8659f = i;
            if (i == 1) {
                ((Choreographer) Assertions.m10153e(this.f8658e)).postFrameCallback(this);
            }
        }

        /* renamed from: c */
        private void m10622c() {
            this.f8658e = Choreographer.getInstance();
        }

        /* renamed from: d */
        public static C1222b m10623d() {
            return f8654a;
        }

        /* renamed from: f */
        private void m10624f() {
            int i = this.f8659f - 1;
            this.f8659f = i;
            if (i == 0) {
                ((Choreographer) Assertions.m10153e(this.f8658e)).removeFrameCallback(this);
                this.f8655b = -9223372036854775807L;
            }
        }

        /* renamed from: a */
        public void mo7595a() {
            this.f8656c.sendEmptyMessage(1);
        }

        public void doFrame(long j) {
            this.f8655b = j;
            ((Choreographer) Assertions.m10153e(this.f8658e)).postFrameCallbackDelayed(this, 500);
        }

        /* renamed from: e */
        public void mo7597e() {
            this.f8656c.sendEmptyMessage(2);
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                m10622c();
                return true;
            } else if (i == 1) {
                m10621b();
                return true;
            } else if (i != 2) {
                return false;
            } else {
                m10624f();
                return true;
            }
        }
    }

    public VideoFrameReleaseHelper(Context context) {
        C1221a aVar = null;
        if (context != null) {
            context = context.getApplicationContext();
            this.f8636b = (WindowManager) context.getSystemService("window");
        } else {
            this.f8636b = null;
        }
        if (this.f8636b != null) {
            if (Util.f8398a >= 17) {
                aVar = m10603f((Context) Assertions.m10153e(context));
            }
            this.f8638d = aVar;
            this.f8637c = C1222b.m10623d();
        } else {
            this.f8638d = null;
            this.f8637c = null;
        }
        this.f8645k = -9223372036854775807L;
        this.f8646l = -9223372036854775807L;
        this.f8641g = -1.0f;
        this.f8644j = 1.0f;
    }

    /* renamed from: c */
    private static boolean m10600c(long j, long j2) {
        return Math.abs(j - j2) <= 20000000;
    }

    /* renamed from: d */
    private void m10601d() {
        if (Util.f8398a >= 30) {
            Surface surface = this.f8640f;
            if (surface != null && this.f8643i != 0.0f) {
                this.f8643i = 0.0f;
                m10605q(surface, 0.0f);
            }
        }
    }

    /* renamed from: e */
    private static long m10602e(long j, long j2, long j3) {
        long j4;
        long j5 = j2 + (((j - j2) / j3) * j3);
        if (j <= j5) {
            j4 = j5 - j3;
        } else {
            long j6 = j5;
            j5 = j3 + j5;
            j4 = j6;
        }
        return j5 - j < j - j4 ? j5 : j4;
    }

    /* renamed from: f */
    private C1221a m10603f(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager == null) {
            return null;
        }
        return new C1221a(displayManager);
    }

    /* renamed from: p */
    private void m10604p() {
        this.f8647m = 0;
        this.f8650p = -1;
        this.f8648n = -1;
    }

    /* renamed from: q */
    private static void m10605q(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            Log.m10382d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m10606r() {
        Display defaultDisplay = ((WindowManager) Assertions.m10153e(this.f8636b)).getDefaultDisplay();
        if (defaultDisplay != null) {
            double refreshRate = (double) defaultDisplay.getRefreshRate();
            Double.isNaN(refreshRate);
            long j = (long) (1.0E9d / refreshRate);
            this.f8645k = j;
            this.f8646l = (j * 80) / 100;
            return;
        }
        Log.m10386h("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        this.f8645k = -9223372036854775807L;
        this.f8646l = -9223372036854775807L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005c, code lost:
        if (java.lang.Math.abs(r0 - r8.f8642h) >= (r8.f8635a.mo7549e() && (r8.f8635a.mo7548d() > 5000000000L ? 1 : (r8.f8635a.mo7548d() == 5000000000L ? 0 : -1)) >= 0 ? 0.02f : 1.0f)) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006c, code lost:
        if (r8.f8635a.mo7547c() >= 30) goto L_0x006e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0070  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m10607s() {
        /*
            r8 = this;
            int r0 = p067c.p068a.p069a.p070a.p111m2.Util.f8398a
            r1 = 30
            if (r0 < r1) goto L_0x0075
            android.view.Surface r0 = r8.f8640f
            if (r0 != 0) goto L_0x000c
            goto L_0x0075
        L_0x000c:
            c.a.a.a.n2.n r0 = r8.f8635a
            boolean r0 = r0.mo7549e()
            if (r0 == 0) goto L_0x001b
            c.a.a.a.n2.n r0 = r8.f8635a
            float r0 = r0.mo7546b()
            goto L_0x001d
        L_0x001b:
            float r0 = r8.f8641g
        L_0x001d:
            float r2 = r8.f8642h
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L_0x0024
            return
        L_0x0024:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = 0
            r5 = 1
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x0061
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0061
            c.a.a.a.n2.n r1 = r8.f8635a
            boolean r1 = r1.mo7549e()
            if (r1 == 0) goto L_0x0049
            c.a.a.a.n2.n r1 = r8.f8635a
            long r1 = r1.mo7548d()
            r6 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 < 0) goto L_0x0049
            r1 = 1
            goto L_0x004a
        L_0x0049:
            r1 = 0
        L_0x004a:
            if (r1 == 0) goto L_0x0050
            r1 = 1017370378(0x3ca3d70a, float:0.02)
            goto L_0x0052
        L_0x0050:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0052:
            float r2 = r8.f8642h
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x005f
            goto L_0x006e
        L_0x005f:
            r5 = 0
            goto L_0x006e
        L_0x0061:
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0066
            goto L_0x006e
        L_0x0066:
            c.a.a.a.n2.n r2 = r8.f8635a
            int r2 = r2.mo7547c()
            if (r2 < r1) goto L_0x005f
        L_0x006e:
            if (r5 == 0) goto L_0x0075
            r8.f8642h = r0
            r8.m10608t(r4)
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p112n2.VideoFrameReleaseHelper.m10607s():void");
    }

    /* renamed from: t */
    private void m10608t(boolean z) {
        if (Util.f8398a >= 30) {
            Surface surface = this.f8640f;
            if (surface != null) {
                float f = 0.0f;
                if (this.f8639e) {
                    float f2 = this.f8642h;
                    if (f2 != -1.0f) {
                        f = this.f8644j * f2;
                    }
                }
                if (z || this.f8643i != f) {
                    this.f8643i = f;
                    m10605q(surface, f);
                }
            }
        }
    }

    /* renamed from: b */
    public long mo7580b(long j) {
        long j2;
        C1222b bVar;
        if (this.f8650p != -1 && this.f8635a.mo7549e()) {
            long a = this.f8651q + ((long) (((float) (this.f8635a.mo7545a() * (this.f8647m - this.f8650p))) / this.f8644j));
            if (m10600c(j, a)) {
                j2 = a;
                this.f8648n = this.f8647m;
                this.f8649o = j2;
                bVar = this.f8637c;
                if (bVar != null || this.f8645k == -9223372036854775807L) {
                    return j2;
                }
                long j3 = bVar.f8655b;
                if (j3 == -9223372036854775807L) {
                    return j2;
                }
                return m10602e(j2, j3, this.f8645k) - this.f8646l;
            }
            m10604p();
        }
        j2 = j;
        this.f8648n = this.f8647m;
        this.f8649o = j2;
        bVar = this.f8637c;
        if (bVar != null) {
        }
        return j2;
    }

    @TargetApi(17)
    /* renamed from: g */
    public void mo7581g() {
        if (this.f8636b != null) {
            C1221a aVar = this.f8638d;
            if (aVar != null) {
                aVar.mo7591b();
            }
            ((C1222b) Assertions.m10153e(this.f8637c)).mo7597e();
        }
    }

    @TargetApi(17)
    /* renamed from: h */
    public void mo7582h() {
        if (this.f8636b != null) {
            ((C1222b) Assertions.m10153e(this.f8637c)).mo7595a();
            C1221a aVar = this.f8638d;
            if (aVar != null) {
                aVar.mo7590a();
            }
            m10606r();
        }
    }

    /* renamed from: i */
    public void mo7583i(float f) {
        this.f8641g = f;
        this.f8635a.mo7551g();
        m10607s();
    }

    /* renamed from: j */
    public void mo7584j(long j) {
        long j2 = this.f8648n;
        if (j2 != -1) {
            this.f8650p = j2;
            this.f8651q = this.f8649o;
        }
        this.f8647m++;
        this.f8635a.mo7550f(j * 1000);
        m10607s();
    }

    /* renamed from: k */
    public void mo7585k(float f) {
        this.f8644j = f;
        m10604p();
        m10608t(false);
    }

    /* renamed from: l */
    public void mo7586l() {
        m10604p();
    }

    /* renamed from: m */
    public void mo7587m() {
        this.f8639e = true;
        m10604p();
        m10608t(false);
    }

    /* renamed from: n */
    public void mo7588n() {
        this.f8639e = false;
        m10601d();
    }

    /* renamed from: o */
    public void mo7589o(Surface surface) {
        if (surface instanceof DummySurface) {
            surface = null;
        }
        if (this.f8640f != surface) {
            m10601d();
            this.f8640f = surface;
            m10608t(true);
        }
    }
}
