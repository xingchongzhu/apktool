package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.fasterxml.jackson.core.JsonLocation;
import p010b.p034g.p043k.ViewCompat;

/* renamed from: androidx.core.widget.a */
public abstract class AutoScrollHelper implements OnTouchListener {

    /* renamed from: a */
    private static final int f2078a = ViewConfiguration.getTapTimeout();

    /* renamed from: b */
    final C0269a f2079b = new C0269a();

    /* renamed from: c */
    private final Interpolator f2080c = new AccelerateInterpolator();

    /* renamed from: d */
    final View f2081d;

    /* renamed from: e */
    private Runnable f2082e;

    /* renamed from: f */
    private float[] f2083f = {0.0f, 0.0f};

    /* renamed from: g */
    private float[] f2084g = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: h */
    private int f2085h;

    /* renamed from: i */
    private int f2086i;

    /* renamed from: j */
    private float[] f2087j = {0.0f, 0.0f};

    /* renamed from: k */
    private float[] f2088k = {0.0f, 0.0f};

    /* renamed from: l */
    private float[] f2089l = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: m */
    private boolean f2090m;

    /* renamed from: n */
    boolean f2091n;

    /* renamed from: o */
    boolean f2092o;

    /* renamed from: p */
    boolean f2093p;

    /* renamed from: q */
    private boolean f2094q;

    /* renamed from: r */
    private boolean f2095r;

    /* renamed from: androidx.core.widget.a$a */
    /* compiled from: AutoScrollHelper */
    private static class C0269a {

        /* renamed from: a */
        private int f2096a;

        /* renamed from: b */
        private int f2097b;

        /* renamed from: c */
        private float f2098c;

        /* renamed from: d */
        private float f2099d;

        /* renamed from: e */
        private long f2100e = Long.MIN_VALUE;

        /* renamed from: f */
        private long f2101f = 0;

        /* renamed from: g */
        private int f2102g = 0;

        /* renamed from: h */
        private int f2103h = 0;

        /* renamed from: i */
        private long f2104i = -1;

        /* renamed from: j */
        private float f2105j;

        /* renamed from: k */
        private int f2106k;

        C0269a() {
        }

        /* renamed from: e */
        private float m1943e(long j) {
            long j2 = this.f2100e;
            if (j < j2) {
                return 0.0f;
            }
            long j3 = this.f2104i;
            if (j3 < 0 || j < j3) {
                return AutoScrollHelper.m1922e(((float) (j - j2)) / ((float) this.f2096a), 0.0f, 1.0f) * 0.5f;
            }
            long j4 = j - j3;
            float f = this.f2105j;
            return (1.0f - f) + (f * AutoScrollHelper.m1922e(((float) j4) / ((float) this.f2106k), 0.0f, 1.0f));
        }

        /* renamed from: g */
        private float m1944g(float f) {
            return (-4.0f * f * f) + (f * 4.0f);
        }

        /* renamed from: a */
        public void mo2326a() {
            if (this.f2101f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float g = m1944g(m1943e(currentAnimationTimeMillis));
                long j = currentAnimationTimeMillis - this.f2101f;
                this.f2101f = currentAnimationTimeMillis;
                float f = ((float) j) * g;
                this.f2102g = (int) (this.f2098c * f);
                this.f2103h = (int) (f * this.f2099d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        /* renamed from: b */
        public int mo2327b() {
            return this.f2102g;
        }

        /* renamed from: c */
        public int mo2328c() {
            return this.f2103h;
        }

        /* renamed from: d */
        public int mo2329d() {
            float f = this.f2098c;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: f */
        public int mo2330f() {
            float f = this.f2099d;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: h */
        public boolean mo2331h() {
            return this.f2104i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f2104i + ((long) this.f2106k);
        }

        /* renamed from: i */
        public void mo2332i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2106k = AutoScrollHelper.m1923f((int) (currentAnimationTimeMillis - this.f2100e), 0, this.f2097b);
            this.f2105j = m1943e(currentAnimationTimeMillis);
            this.f2104i = currentAnimationTimeMillis;
        }

        /* renamed from: j */
        public void mo2333j(int i) {
            this.f2097b = i;
        }

        /* renamed from: k */
        public void mo2334k(int i) {
            this.f2096a = i;
        }

        /* renamed from: l */
        public void mo2335l(float f, float f2) {
            this.f2098c = f;
            this.f2099d = f2;
        }

        /* renamed from: m */
        public void mo2336m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2100e = currentAnimationTimeMillis;
            this.f2104i = -1;
            this.f2101f = currentAnimationTimeMillis;
            this.f2105j = 0.5f;
            this.f2102g = 0;
            this.f2103h = 0;
        }
    }

    /* renamed from: androidx.core.widget.a$b */
    /* compiled from: AutoScrollHelper */
    private class C0270b implements Runnable {
        C0270b() {
        }

        public void run() {
            AutoScrollHelper aVar = AutoScrollHelper.this;
            if (aVar.f2093p) {
                if (aVar.f2091n) {
                    aVar.f2091n = false;
                    aVar.f2079b.mo2336m();
                }
                C0269a aVar2 = AutoScrollHelper.this.f2079b;
                if (aVar2.mo2331h() || !AutoScrollHelper.this.mo2325u()) {
                    AutoScrollHelper.this.f2093p = false;
                    return;
                }
                AutoScrollHelper aVar3 = AutoScrollHelper.this;
                if (aVar3.f2092o) {
                    aVar3.f2092o = false;
                    aVar3.mo2312c();
                }
                aVar2.mo2326a();
                AutoScrollHelper.this.mo2313j(aVar2.mo2327b(), aVar2.mo2328c());
                ViewCompat.m5557g0(AutoScrollHelper.this.f2081d, this);
            }
        }
    }

    public AutoScrollHelper(View view) {
        this.f2081d = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        int i = (int) ((f * 315.0f) + 0.5f);
        float f2 = (float) ((int) ((1575.0f * f) + 0.5f));
        mo2318o(f2, f2);
        float f3 = (float) i;
        mo2320p(f3, f3);
        mo2315l(1);
        mo2317n(Float.MAX_VALUE, Float.MAX_VALUE);
        mo2323s(0.2f, 0.2f);
        mo2324t(1.0f, 1.0f);
        mo2314k(f2078a);
        mo2322r(JsonLocation.MAX_CONTENT_SNIPPET);
        mo2321q(JsonLocation.MAX_CONTENT_SNIPPET);
    }

    /* renamed from: d */
    private float m1921d(int i, float f, float f2, float f3) {
        float h = m1925h(this.f2083f[i], f2, this.f2084g[i], f);
        if (h == 0.0f) {
            return 0.0f;
        }
        float f4 = this.f2087j[i];
        float f5 = this.f2088k[i];
        float f6 = this.f2089l[i];
        float f7 = f4 * f3;
        if (h > 0.0f) {
            return m1922e(h * f7, f5, f6);
        }
        return -m1922e((-h) * f7, f5, f6);
    }

    /* renamed from: e */
    static float m1922e(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: f */
    static int m1923f(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: g */
    private float m1924g(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f2085h;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                return (!this.f2093p || i != 1) ? 0.0f : 1.0f;
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
    }

    /* renamed from: h */
    private float m1925h(float f, float f2, float f3, float f4) {
        float f5;
        float e = m1922e(f * f2, 0.0f, f3);
        float g = m1924g(f2 - f4, e) - m1924g(f4, e);
        if (g < 0.0f) {
            f5 = -this.f2080c.getInterpolation(-g);
        } else if (g <= 0.0f) {
            return 0.0f;
        } else {
            f5 = this.f2080c.getInterpolation(g);
        }
        return m1922e(f5, -1.0f, 1.0f);
    }

    /* renamed from: i */
    private void m1926i() {
        if (this.f2091n) {
            this.f2093p = false;
        } else {
            this.f2079b.mo2332i();
        }
    }

    /* renamed from: v */
    private void m1927v() {
        if (this.f2082e == null) {
            this.f2082e = new C0270b();
        }
        this.f2093p = true;
        this.f2091n = true;
        if (!this.f2090m) {
            int i = this.f2086i;
            if (i > 0) {
                ViewCompat.m5559h0(this.f2081d, this.f2082e, (long) i);
                this.f2090m = true;
            }
        }
        this.f2082e.run();
        this.f2090m = true;
    }

    /* renamed from: a */
    public abstract boolean mo2310a(int i);

    /* renamed from: b */
    public abstract boolean mo2311b(int i);

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo2312c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f2081d.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: j */
    public abstract void mo2313j(int i, int i2);

    /* renamed from: k */
    public AutoScrollHelper mo2314k(int i) {
        this.f2086i = i;
        return this;
    }

    /* renamed from: l */
    public AutoScrollHelper mo2315l(int i) {
        this.f2085h = i;
        return this;
    }

    /* renamed from: m */
    public AutoScrollHelper mo2316m(boolean z) {
        if (this.f2094q && !z) {
            m1926i();
        }
        this.f2094q = z;
        return this;
    }

    /* renamed from: n */
    public AutoScrollHelper mo2317n(float f, float f2) {
        float[] fArr = this.f2084g;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: o */
    public AutoScrollHelper mo2318o(float f, float f2) {
        float[] fArr = this.f2089l;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f2094q
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            r5.m1926i()
            goto L_0x0058
        L_0x001a:
            r5.f2092o = r2
            r5.f2090m = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f2081d
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m1921d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f2081d
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m1921d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f2079b
            r7.mo2335l(r0, r6)
            boolean r6 = r5.f2093p
            if (r6 != 0) goto L_0x0058
            boolean r6 = r5.mo2325u()
            if (r6 == 0) goto L_0x0058
            r5.m1927v()
        L_0x0058:
            boolean r6 = r5.f2095r
            if (r6 == 0) goto L_0x0061
            boolean r6 = r5.f2093p
            if (r6 == 0) goto L_0x0061
            r1 = 1
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.AutoScrollHelper.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public AutoScrollHelper mo2320p(float f, float f2) {
        float[] fArr = this.f2088k;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: q */
    public AutoScrollHelper mo2321q(int i) {
        this.f2079b.mo2333j(i);
        return this;
    }

    /* renamed from: r */
    public AutoScrollHelper mo2322r(int i) {
        this.f2079b.mo2334k(i);
        return this;
    }

    /* renamed from: s */
    public AutoScrollHelper mo2323s(float f, float f2) {
        float[] fArr = this.f2083f;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: t */
    public AutoScrollHelper mo2324t(float f, float f2) {
        float[] fArr = this.f2087j;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public boolean mo2325u() {
        C0269a aVar = this.f2079b;
        int f = aVar.mo2330f();
        int d = aVar.mo2329d();
        return (f != 0 && mo2311b(f)) || (d != 0 && mo2310a(d));
    }
}
