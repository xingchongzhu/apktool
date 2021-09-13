package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p010b.p034g.p043k.ViewCompat;

/* renamed from: com.google.android.material.appbar.a */
abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {

    /* renamed from: d */
    private Runnable f12504d;

    /* renamed from: e */
    OverScroller f12505e;

    /* renamed from: f */
    private boolean f12506f;

    /* renamed from: g */
    private int f12507g = -1;

    /* renamed from: h */
    private int f12508h;

    /* renamed from: i */
    private int f12509i = -1;

    /* renamed from: j */
    private VelocityTracker f12510j;

    /* renamed from: com.google.android.material.appbar.a$a */
    /* compiled from: HeaderBehavior */
    private class C1943a implements Runnable {

        /* renamed from: a */
        private final CoordinatorLayout f12511a;

        /* renamed from: b */
        private final V f12512b;

        C1943a(CoordinatorLayout coordinatorLayout, V v) {
            this.f12511a = coordinatorLayout;
            this.f12512b = v;
        }

        public void run() {
            if (this.f12512b != null) {
                OverScroller overScroller = HeaderBehavior.this.f12505e;
                if (overScroller == null) {
                    return;
                }
                if (overScroller.computeScrollOffset()) {
                    HeaderBehavior aVar = HeaderBehavior.this;
                    aVar.mo15059P(this.f12511a, this.f12512b, aVar.f12505e.getCurrY());
                    ViewCompat.m5557g0(this.f12512b, this);
                    return;
                }
                HeaderBehavior.this.mo15021N(this.f12511a, this.f12512b);
            }
        }
    }

    public HeaderBehavior() {
    }

    /* renamed from: I */
    private void m15277I() {
        if (this.f12510j == null) {
            this.f12510j = VelocityTracker.obtain();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0085  */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2058D(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L_0x004e
            r4 = 2
            if (r0 == r4) goto L_0x002d
            r12 = 3
            if (r0 == r12) goto L_0x0072
            r12 = 6
            if (r0 == r12) goto L_0x0013
            goto L_0x004c
        L_0x0013:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L_0x001b
            r12 = 1
            goto L_0x001c
        L_0x001b:
            r12 = 0
        L_0x001c:
            int r13 = r14.getPointerId(r12)
            r11.f12507g = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f12508h = r12
            goto L_0x004c
        L_0x002d:
            int r0 = r11.f12507g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L_0x0036
            return r3
        L_0x0036:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f12508h
            int r7 = r1 - r0
            r11.f12508h = r0
            int r8 = r11.mo15018K(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.mo15058O(r5, r6, r7, r8, r9)
        L_0x004c:
            r12 = 0
            goto L_0x0081
        L_0x004e:
            android.view.VelocityTracker r0 = r11.f12510j
            if (r0 == 0) goto L_0x0072
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f12510j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f12510j
            int r4 = r11.f12507g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.mo15019L(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.mo15057J(r6, r7, r8, r9, r10)
            r12 = 1
            goto L_0x0073
        L_0x0072:
            r12 = 0
        L_0x0073:
            r11.f12506f = r3
            r11.f12507g = r1
            android.view.VelocityTracker r13 = r11.f12510j
            if (r13 == 0) goto L_0x0081
            r13.recycle()
            r13 = 0
            r11.f12510j = r13
        L_0x0081:
            android.view.VelocityTracker r13 = r11.f12510j
            if (r13 == 0) goto L_0x0088
            r13.addMovement(r14)
        L_0x0088:
            boolean r13 = r11.f12506f
            if (r13 != 0) goto L_0x0090
            if (r12 == 0) goto L_0x008f
            goto L_0x0090
        L_0x008f:
            r2 = 0
        L_0x0090:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.mo2058D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: H */
    public abstract boolean mo15017H(V v);

    /* access modifiers changed from: 0000 */
    /* renamed from: J */
    public final boolean mo15057J(CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f) {
        V v2 = v;
        Runnable runnable = this.f12504d;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.f12504d = null;
        }
        if (this.f12505e == null) {
            this.f12505e = new OverScroller(v.getContext());
        }
        this.f12505e.fling(0, mo15043E(), 0, Math.round(f), 0, 0, i, i2);
        if (this.f12505e.computeScrollOffset()) {
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            C1943a aVar = new C1943a(coordinatorLayout, v);
            this.f12504d = aVar;
            ViewCompat.m5557g0(v, aVar);
            return true;
        }
        CoordinatorLayout coordinatorLayout3 = coordinatorLayout;
        mo15021N(coordinatorLayout, v);
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: K */
    public abstract int mo15018K(V v);

    /* access modifiers changed from: 0000 */
    /* renamed from: L */
    public abstract int mo15019L(V v);

    /* access modifiers changed from: 0000 */
    /* renamed from: M */
    public abstract int mo15020M();

    /* access modifiers changed from: 0000 */
    /* renamed from: N */
    public abstract void mo15021N(CoordinatorLayout coordinatorLayout, V v);

    /* access modifiers changed from: 0000 */
    /* renamed from: O */
    public final int mo15058O(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo15022Q(coordinatorLayout, v, mo15020M() - i, i2, i3);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: P */
    public int mo15059P(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo15022Q(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Q */
    public abstract int mo15022Q(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3);

    /* renamed from: k */
    public boolean mo2069k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.f12509i < 0) {
            this.f12509i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f12506f) {
            int i = this.f12507g;
            if (i == -1) {
                return false;
            }
            int findPointerIndex = motionEvent.findPointerIndex(i);
            if (findPointerIndex == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.f12508h) > this.f12509i) {
                this.f12508h = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f12507g = -1;
            int y2 = (int) motionEvent.getY();
            boolean z = mo15017H(v) && coordinatorLayout.mo2003B(v, (int) motionEvent.getX(), y2);
            this.f12506f = z;
            if (z) {
                this.f12508h = y2;
                this.f12507g = motionEvent.getPointerId(0);
                m15277I();
                OverScroller overScroller = this.f12505e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f12505e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f12510j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
