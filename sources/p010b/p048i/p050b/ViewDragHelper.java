package p010b.p048i.p050b;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import p010b.p034g.p043k.ViewCompat;

/* renamed from: b.i.b.c */
public class ViewDragHelper {

    /* renamed from: a */
    private static final Interpolator f4796a = new C0679a();

    /* renamed from: b */
    private int f4797b;

    /* renamed from: c */
    private int f4798c;

    /* renamed from: d */
    private int f4799d = -1;

    /* renamed from: e */
    private float[] f4800e;

    /* renamed from: f */
    private float[] f4801f;

    /* renamed from: g */
    private float[] f4802g;

    /* renamed from: h */
    private float[] f4803h;

    /* renamed from: i */
    private int[] f4804i;

    /* renamed from: j */
    private int[] f4805j;

    /* renamed from: k */
    private int[] f4806k;

    /* renamed from: l */
    private int f4807l;

    /* renamed from: m */
    private VelocityTracker f4808m;

    /* renamed from: n */
    private float f4809n;

    /* renamed from: o */
    private float f4810o;

    /* renamed from: p */
    private int f4811p;

    /* renamed from: q */
    private int f4812q;

    /* renamed from: r */
    private OverScroller f4813r;

    /* renamed from: s */
    private final C0681c f4814s;

    /* renamed from: t */
    private View f4815t;

    /* renamed from: u */
    private boolean f4816u;

    /* renamed from: v */
    private final ViewGroup f4817v;

    /* renamed from: w */
    private final Runnable f4818w = new C0680b();

    /* renamed from: b.i.b.c$a */
    /* compiled from: ViewDragHelper */
    static class C0679a implements Interpolator {
        C0679a() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: b.i.b.c$b */
    /* compiled from: ViewDragHelper */
    class C0680b implements Runnable {
        C0680b() {
        }

        public void run() {
            ViewDragHelper.this.mo5225E(0);
        }
    }

    /* renamed from: b.i.b.c$c */
    /* compiled from: ViewDragHelper */
    public static abstract class C0681c {
        /* renamed from: a */
        public abstract int mo5241a(View view, int i, int i2);

        /* renamed from: b */
        public abstract int mo5242b(View view, int i, int i2);

        /* renamed from: c */
        public int mo5243c(int i) {
            return i;
        }

        /* renamed from: d */
        public int mo5244d(View view) {
            return 0;
        }

        /* renamed from: e */
        public int mo5245e(View view) {
            return 0;
        }

        /* renamed from: f */
        public void mo5246f(int i, int i2) {
        }

        /* renamed from: g */
        public boolean mo5247g(int i) {
            return false;
        }

        /* renamed from: h */
        public void mo5248h(int i, int i2) {
        }

        /* renamed from: i */
        public void mo5249i(View view, int i) {
        }

        /* renamed from: j */
        public abstract void mo5250j(int i);

        /* renamed from: k */
        public abstract void mo5251k(View view, int i, int i2, int i3, int i4);

        /* renamed from: l */
        public abstract void mo5252l(View view, float f, float f2);

        /* renamed from: m */
        public abstract boolean mo5253m(View view, int i);
    }

    private ViewDragHelper(Context context, ViewGroup viewGroup, C0681c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.f4817v = viewGroup;
            this.f4814s = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f4811p = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f4798c = viewConfiguration.getScaledTouchSlop();
            this.f4809n = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f4810o = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f4813r = new OverScroller(context, f4796a);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: A */
    private void m5743A() {
        this.f4808m.computeCurrentVelocity(1000, this.f4809n);
        m5757n(m5749e(this.f4808m.getXVelocity(this.f4799d), this.f4810o, this.f4809n), m5749e(this.f4808m.getYVelocity(this.f4799d), this.f4810o, this.f4809n));
    }

    /* renamed from: B */
    private void m5744B(float f, float f2, int i) {
        int i2 = 1;
        if (!m5747c(f, f2, i, 1)) {
            i2 = 0;
        }
        if (m5747c(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (m5747c(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (m5747c(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f4805j;
            iArr[i] = iArr[i] | i2;
            this.f4814s.mo5246f(i2, i);
        }
    }

    /* renamed from: C */
    private void m5745C(float f, float f2, int i) {
        m5760q(i);
        float[] fArr = this.f4800e;
        this.f4802g[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f4801f;
        this.f4803h[i] = f2;
        fArr2[i] = f2;
        this.f4804i[i] = m5762t((int) f, (int) f2);
        this.f4807l |= 1 << i;
    }

    /* renamed from: D */
    private void m5746D(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m5763x(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f4802g[pointerId] = x;
                this.f4803h[pointerId] = y;
            }
        }
    }

    /* renamed from: c */
    private boolean m5747c(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        boolean z = false;
        if (!((this.f4804i[i] & i2) != i2 || (this.f4812q & i2) == 0 || (this.f4806k[i] & i2) == i2 || (this.f4805j[i] & i2) == i2)) {
            int i3 = this.f4798c;
            if (abs > ((float) i3) || abs2 > ((float) i3)) {
                if (abs < abs2 * 0.5f && this.f4814s.mo5247g(i2)) {
                    int[] iArr = this.f4806k;
                    iArr[i] = iArr[i] | i2;
                    return false;
                } else if ((this.f4805j[i] & i2) == 0 && abs > ((float) this.f4798c)) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: d */
    private boolean m5748d(View view, float f, float f2) {
        boolean z = false;
        if (view == null) {
            return false;
        }
        boolean z2 = this.f4814s.mo5244d(view) > 0;
        boolean z3 = this.f4814s.mo5245e(view) > 0;
        if (z2 && z3) {
            float f3 = (f * f) + (f2 * f2);
            int i = this.f4798c;
            if (f3 > ((float) (i * i))) {
                z = true;
            }
            return z;
        } else if (z2) {
            if (Math.abs(f) > ((float) this.f4798c)) {
                z = true;
            }
            return z;
        } else {
            if (z3 && Math.abs(f2) > ((float) this.f4798c)) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: e */
    private float m5749e(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        if (abs <= f3) {
            return f;
        }
        if (f <= 0.0f) {
            f3 = -f3;
        }
        return f3;
    }

    /* renamed from: f */
    private int m5750f(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        if (abs <= i3) {
            return i;
        }
        if (i <= 0) {
            i3 = -i3;
        }
        return i3;
    }

    /* renamed from: g */
    private void m5751g() {
        float[] fArr = this.f4800e;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f4801f, 0.0f);
            Arrays.fill(this.f4802g, 0.0f);
            Arrays.fill(this.f4803h, 0.0f);
            Arrays.fill(this.f4804i, 0);
            Arrays.fill(this.f4805j, 0);
            Arrays.fill(this.f4806k, 0);
            this.f4807l = 0;
        }
    }

    /* renamed from: h */
    private void m5752h(int i) {
        if (this.f4800e != null && mo5236w(i)) {
            this.f4800e[i] = 0.0f;
            this.f4801f[i] = 0.0f;
            this.f4802g[i] = 0.0f;
            this.f4803h[i] = 0.0f;
            this.f4804i[i] = 0;
            this.f4805j[i] = 0;
            this.f4806k[i] = 0;
            this.f4807l = ((1 << i) ^ -1) & this.f4807l;
        }
    }

    /* renamed from: i */
    private int m5753i(int i, int i2, int i3) {
        int i4;
        if (i == 0) {
            return 0;
        }
        int width = this.f4817v.getWidth();
        float f = (float) (width / 2);
        float o = f + (m5758o(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))) * f);
        int abs = Math.abs(i2);
        if (abs > 0) {
            i4 = Math.round(Math.abs(o / ((float) abs)) * 1000.0f) * 4;
        } else {
            i4 = (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(i4, 600);
    }

    /* renamed from: j */
    private int m5754j(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int f5 = m5750f(i3, (int) this.f4810o, (int) this.f4809n);
        int f6 = m5750f(i4, (int) this.f4810o, (int) this.f4809n);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(f5);
        int abs4 = Math.abs(f6);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (f5 != 0) {
            f2 = (float) abs3;
            f = (float) i5;
        } else {
            f2 = (float) abs;
            f = (float) i6;
        }
        float f7 = f2 / f;
        if (f6 != 0) {
            f4 = (float) abs4;
            f3 = (float) i5;
        } else {
            f4 = (float) abs2;
            f3 = (float) i6;
        }
        float f8 = f4 / f3;
        return (int) ((((float) m5753i(i, f5, this.f4814s.mo5244d(view))) * f7) + (((float) m5753i(i2, f6, this.f4814s.mo5245e(view))) * f8));
    }

    /* renamed from: l */
    public static ViewDragHelper m5755l(ViewGroup viewGroup, float f, C0681c cVar) {
        ViewDragHelper m = m5756m(viewGroup, cVar);
        m.f4798c = (int) (((float) m.f4798c) * (1.0f / f));
        return m;
    }

    /* renamed from: m */
    public static ViewDragHelper m5756m(ViewGroup viewGroup, C0681c cVar) {
        return new ViewDragHelper(viewGroup.getContext(), viewGroup, cVar);
    }

    /* renamed from: n */
    private void m5757n(float f, float f2) {
        this.f4816u = true;
        this.f4814s.mo5252l(this.f4815t, f, f2);
        this.f4816u = false;
        if (this.f4797b == 1) {
            mo5225E(0);
        }
    }

    /* renamed from: o */
    private float m5758o(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* renamed from: p */
    private void m5759p(int i, int i2, int i3, int i4) {
        int left = this.f4815t.getLeft();
        int top = this.f4815t.getTop();
        if (i3 != 0) {
            i = this.f4814s.mo5241a(this.f4815t, i, i3);
            ViewCompat.m5542Y(this.f4815t, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f4814s.mo5242b(this.f4815t, i2, i4);
            ViewCompat.m5543Z(this.f4815t, i2 - top);
        }
        int i6 = i2;
        if (i3 != 0 || i4 != 0) {
            this.f4814s.mo5251k(this.f4815t, i5, i6, i5 - left, i6 - top);
        }
    }

    /* renamed from: q */
    private void m5760q(int i) {
        float[] fArr = this.f4800e;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f4801f;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f4802g;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f4803h;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f4804i;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f4805j;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f4806k;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f4800e = fArr2;
            this.f4801f = fArr3;
            this.f4802g = fArr4;
            this.f4803h = fArr5;
            this.f4804i = iArr;
            this.f4805j = iArr2;
            this.f4806k = iArr3;
        }
    }

    /* renamed from: s */
    private boolean m5761s(int i, int i2, int i3, int i4) {
        int left = this.f4815t.getLeft();
        int top = this.f4815t.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f4813r.abortAnimation();
            mo5225E(0);
            return false;
        }
        this.f4813r.startScroll(left, top, i5, i6, m5754j(this.f4815t, i5, i6, i3, i4));
        mo5225E(2);
        return true;
    }

    /* renamed from: t */
    private int m5762t(int i, int i2) {
        int i3 = i < this.f4817v.getLeft() + this.f4811p ? 1 : 0;
        if (i2 < this.f4817v.getTop() + this.f4811p) {
            i3 |= 4;
        }
        if (i > this.f4817v.getRight() - this.f4811p) {
            i3 |= 2;
        }
        return i2 > this.f4817v.getBottom() - this.f4811p ? i3 | 8 : i3;
    }

    /* renamed from: x */
    private boolean m5763x(int i) {
        if (mo5236w(i)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Ignoring pointerId=");
        sb.append(i);
        sb.append(" because ACTION_DOWN was not received ");
        sb.append("for this pointer before ACTION_MOVE. It likely happened because ");
        sb.append(" ViewDragHelper did not receive all the events in the event stream.");
        Log.e("ViewDragHelper", sb.toString());
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: E */
    public void mo5225E(int i) {
        this.f4817v.removeCallbacks(this.f4818w);
        if (this.f4797b != i) {
            this.f4797b = i;
            this.f4814s.mo5250j(i);
            if (this.f4797b == 0) {
                this.f4815t = null;
            }
        }
    }

    /* renamed from: F */
    public boolean mo5226F(int i, int i2) {
        if (this.f4816u) {
            return m5761s(i, i2, (int) this.f4808m.getXVelocity(this.f4799d), (int) this.f4808m.getYVelocity(this.f4799d));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        if (r12 != r11) goto L_0x00e6;
     */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo5227G(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.mo5230a()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f4808m
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f4808m = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f4808m
            r4.addMovement(r1)
            r4 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0104
            if (r2 == r6) goto L_0x00ff
            if (r2 == r4) goto L_0x0070
            r7 = 3
            if (r2 == r7) goto L_0x00ff
            r7 = 5
            if (r2 == r7) goto L_0x003c
            r4 = 6
            if (r2 == r4) goto L_0x0034
        L_0x0031:
            r5 = 0
            goto L_0x0135
        L_0x0034:
            int r1 = r1.getPointerId(r3)
            r0.m5752h(r1)
            goto L_0x0031
        L_0x003c:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.m5745C(r7, r1, r2)
            int r3 = r0.f4797b
            if (r3 != 0) goto L_0x0060
            int[] r1 = r0.f4804i
            r1 = r1[r2]
            int r3 = r0.f4812q
            r4 = r1 & r3
            if (r4 == 0) goto L_0x0031
            b.i.b.c$c r4 = r0.f4814s
            r1 = r1 & r3
            r4.mo5248h(r1, r2)
            goto L_0x0031
        L_0x0060:
            if (r3 != r4) goto L_0x0031
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.mo5233r(r3, r1)
            android.view.View r3 = r0.f4815t
            if (r1 != r3) goto L_0x0031
            r0.mo5229I(r1, r2)
            goto L_0x0031
        L_0x0070:
            float[] r2 = r0.f4800e
            if (r2 == 0) goto L_0x0031
            float[] r2 = r0.f4801f
            if (r2 != 0) goto L_0x0079
            goto L_0x0031
        L_0x0079:
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x007e:
            if (r3 >= r2) goto L_0x00fa
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.m5763x(r4)
            if (r7 != 0) goto L_0x008c
            goto L_0x00f7
        L_0x008c:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f4800e
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f4801f
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.mo5233r(r7, r8)
            if (r7 == 0) goto L_0x00b0
            boolean r8 = r0.m5748d(r7, r9, r10)
            if (r8 == 0) goto L_0x00b0
            r8 = 1
            goto L_0x00b1
        L_0x00b0:
            r8 = 0
        L_0x00b1:
            if (r8 == 0) goto L_0x00e6
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            b.i.b.c$c r14 = r0.f4814s
            int r12 = r14.mo5241a(r7, r13, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            b.i.b.c$c r5 = r0.f4814s
            int r5 = r5.mo5242b(r7, r15, r14)
            b.i.b.c$c r14 = r0.f4814s
            int r14 = r14.mo5244d(r7)
            b.i.b.c$c r15 = r0.f4814s
            int r15 = r15.mo5245e(r7)
            if (r14 == 0) goto L_0x00df
            if (r14 <= 0) goto L_0x00e6
            if (r12 != r11) goto L_0x00e6
        L_0x00df:
            if (r15 == 0) goto L_0x00fa
            if (r15 <= 0) goto L_0x00e6
            if (r5 != r13) goto L_0x00e6
            goto L_0x00fa
        L_0x00e6:
            r0.m5744B(r9, r10, r4)
            int r5 = r0.f4797b
            if (r5 != r6) goto L_0x00ee
            goto L_0x00fa
        L_0x00ee:
            if (r8 == 0) goto L_0x00f7
            boolean r4 = r0.mo5229I(r7, r4)
            if (r4 == 0) goto L_0x00f7
            goto L_0x00fa
        L_0x00f7:
            int r3 = r3 + 1
            goto L_0x007e
        L_0x00fa:
            r16.m5746D(r17)
            goto L_0x0031
        L_0x00ff:
            r16.mo5230a()
            goto L_0x0031
        L_0x0104:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r5 = 0
            int r1 = r1.getPointerId(r5)
            r0.m5745C(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.mo5233r(r2, r3)
            android.view.View r3 = r0.f4815t
            if (r2 != r3) goto L_0x0125
            int r3 = r0.f4797b
            if (r3 != r4) goto L_0x0125
            r0.mo5229I(r2, r1)
        L_0x0125:
            int[] r2 = r0.f4804i
            r2 = r2[r1]
            int r3 = r0.f4812q
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0135
            b.i.b.c$c r4 = r0.f4814s
            r2 = r2 & r3
            r4.mo5248h(r2, r1)
        L_0x0135:
            int r1 = r0.f4797b
            if (r1 != r6) goto L_0x013a
            r5 = 1
        L_0x013a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p010b.p048i.p050b.ViewDragHelper.mo5227G(android.view.MotionEvent):boolean");
    }

    /* renamed from: H */
    public boolean mo5228H(View view, int i, int i2) {
        this.f4815t = view;
        this.f4799d = -1;
        boolean s = m5761s(i, i2, 0, 0);
        if (!s && this.f4797b == 0 && this.f4815t != null) {
            this.f4815t = null;
        }
        return s;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: I */
    public boolean mo5229I(View view, int i) {
        if (view == this.f4815t && this.f4799d == i) {
            return true;
        }
        if (view == null || !this.f4814s.mo5253m(view, i)) {
            return false;
        }
        this.f4799d = i;
        mo5231b(view, i);
        return true;
    }

    /* renamed from: a */
    public void mo5230a() {
        this.f4799d = -1;
        m5751g();
        VelocityTracker velocityTracker = this.f4808m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f4808m = null;
        }
    }

    /* renamed from: b */
    public void mo5231b(View view, int i) {
        if (view.getParent() == this.f4817v) {
            this.f4815t = view;
            this.f4799d = i;
            this.f4814s.mo5249i(view, i);
            mo5225E(1);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        sb.append(this.f4817v);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: k */
    public boolean mo5232k(boolean z) {
        if (this.f4797b == 2) {
            boolean computeScrollOffset = this.f4813r.computeScrollOffset();
            int currX = this.f4813r.getCurrX();
            int currY = this.f4813r.getCurrY();
            int left = currX - this.f4815t.getLeft();
            int top = currY - this.f4815t.getTop();
            if (left != 0) {
                ViewCompat.m5542Y(this.f4815t, left);
            }
            if (top != 0) {
                ViewCompat.m5543Z(this.f4815t, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f4814s.mo5251k(this.f4815t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f4813r.getFinalX() && currY == this.f4813r.getFinalY()) {
                this.f4813r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f4817v.post(this.f4818w);
                } else {
                    mo5225E(0);
                }
            }
        }
        if (this.f4797b == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public View mo5233r(int i, int i2) {
        for (int childCount = this.f4817v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f4817v.getChildAt(this.f4814s.mo5243c(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: u */
    public int mo5234u() {
        return this.f4798c;
    }

    /* renamed from: v */
    public boolean mo5235v(int i, int i2) {
        return mo5237y(this.f4815t, i, i2);
    }

    /* renamed from: w */
    public boolean mo5236w(int i) {
        return ((1 << i) & this.f4807l) != 0;
    }

    /* renamed from: y */
    public boolean mo5237y(View view, int i, int i2) {
        boolean z = false;
        if (view == null) {
            return false;
        }
        if (i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom()) {
            z = true;
        }
        return z;
    }

    /* renamed from: z */
    public void mo5238z(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            mo5230a();
        }
        if (this.f4808m == null) {
            this.f4808m = VelocityTracker.obtain();
        }
        this.f4808m.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View r = mo5233r((int) x, (int) y);
            m5745C(x, y, pointerId);
            mo5229I(r, pointerId);
            int i3 = this.f4804i[pointerId];
            int i4 = this.f4812q;
            if ((i3 & i4) != 0) {
                this.f4814s.mo5248h(i3 & i4, pointerId);
            }
        } else if (actionMasked == 1) {
            if (this.f4797b == 1) {
                m5743A();
            }
            mo5230a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f4797b == 1) {
                    m5757n(0.0f, 0.0f);
                }
                mo5230a();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m5745C(x2, y2, pointerId2);
                if (this.f4797b == 0) {
                    mo5229I(mo5233r((int) x2, (int) y2), pointerId2);
                    int i5 = this.f4804i[pointerId2];
                    int i6 = this.f4812q;
                    if ((i5 & i6) != 0) {
                        this.f4814s.mo5248h(i5 & i6, pointerId2);
                    }
                } else if (mo5235v((int) x2, (int) y2)) {
                    mo5229I(this.f4815t, pointerId2);
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (this.f4797b == 1 && pointerId3 == this.f4799d) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i2 >= pointerCount) {
                            i = -1;
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i2);
                        if (pointerId4 != this.f4799d) {
                            View r2 = mo5233r((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                            View view = this.f4815t;
                            if (r2 == view && mo5229I(view, pointerId4)) {
                                i = this.f4799d;
                                break;
                            }
                        }
                        i2++;
                    }
                    if (i == -1) {
                        m5743A();
                    }
                }
                m5752h(pointerId3);
            }
        } else if (this.f4797b != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i2 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i2);
                if (m5763x(pointerId5)) {
                    float x3 = motionEvent.getX(i2);
                    float y3 = motionEvent.getY(i2);
                    float f = x3 - this.f4800e[pointerId5];
                    float f2 = y3 - this.f4801f[pointerId5];
                    m5744B(f, f2, pointerId5);
                    if (this.f4797b != 1) {
                        View r3 = mo5233r((int) x3, (int) y3);
                        if (m5748d(r3, f, f2) && mo5229I(r3, pointerId5)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i2++;
            }
            m5746D(motionEvent);
        } else if (m5763x(this.f4799d)) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f4799d);
            float x4 = motionEvent.getX(findPointerIndex);
            float y4 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.f4802g;
            int i7 = this.f4799d;
            int i8 = (int) (x4 - fArr[i7]);
            int i9 = (int) (y4 - this.f4803h[i7]);
            m5759p(this.f4815t.getLeft() + i8, this.f4815t.getTop() + i9, i8, i9);
            m5746D(motionEvent);
        }
    }
}
