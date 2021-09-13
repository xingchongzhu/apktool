package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ShowableListMenu;

/* renamed from: androidx.appcompat.widget.i0 */
public abstract class ForwardingListener implements OnTouchListener, OnAttachStateChangeListener {

    /* renamed from: a */
    private final float f1039a;

    /* renamed from: b */
    private final int f1040b;

    /* renamed from: c */
    private final int f1041c;

    /* renamed from: d */
    final View f1042d;

    /* renamed from: e */
    private Runnable f1043e;

    /* renamed from: f */
    private Runnable f1044f;

    /* renamed from: g */
    private boolean f1045g;

    /* renamed from: h */
    private int f1046h;

    /* renamed from: i */
    private final int[] f1047i = new int[2];

    /* renamed from: androidx.appcompat.widget.i0$a */
    /* compiled from: ForwardingListener */
    private class C0170a implements Runnable {
        C0170a() {
        }

        public void run() {
            ViewParent parent = ForwardingListener.this.f1042d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.i0$b */
    /* compiled from: ForwardingListener */
    private class C0171b implements Runnable {
        C0171b() {
        }

        public void run() {
            ForwardingListener.this.mo1492e();
        }
    }

    public ForwardingListener(View view) {
        this.f1042d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1039a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1040b = tapTimeout;
        this.f1041c = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: a */
    private void m1147a() {
        Runnable runnable = this.f1044f;
        if (runnable != null) {
            this.f1042d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1043e;
        if (runnable2 != null) {
            this.f1042d.removeCallbacks(runnable2);
        }
    }

    /* renamed from: f */
    private boolean m1148f(MotionEvent motionEvent) {
        View view = this.f1042d;
        ShowableListMenu b = mo504b();
        if (b == null || !b.mo602c()) {
            return false;
        }
        DropDownListView g0Var = (DropDownListView) b.mo606h();
        if (g0Var == null || !g0Var.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m1151i(view, obtainNoHistory);
        m1152j(g0Var, obtainNoHistory);
        boolean e = g0Var.mo1460e(obtainNoHistory, this.f1046h);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        boolean z = (actionMasked == 1 || actionMasked == 3) ? false : true;
        if (!e || !z) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x006d;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m1149g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f1042d
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L_0x0041
            r3 = 1
            if (r1 == r3) goto L_0x003d
            r4 = 2
            if (r1 == r4) goto L_0x001a
            r6 = 3
            if (r1 == r6) goto L_0x003d
            goto L_0x006d
        L_0x001a:
            int r1 = r5.f1046h
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L_0x006d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f1039a
            boolean r6 = m1150h(r0, r4, r6, r1)
            if (r6 != 0) goto L_0x006d
            r5.m1147a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L_0x003d:
            r5.m1147a()
            goto L_0x006d
        L_0x0041:
            int r6 = r6.getPointerId(r2)
            r5.f1046h = r6
            java.lang.Runnable r6 = r5.f1043e
            if (r6 != 0) goto L_0x0052
            androidx.appcompat.widget.i0$a r6 = new androidx.appcompat.widget.i0$a
            r6.<init>()
            r5.f1043e = r6
        L_0x0052:
            java.lang.Runnable r6 = r5.f1043e
            int r1 = r5.f1040b
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f1044f
            if (r6 != 0) goto L_0x0065
            androidx.appcompat.widget.i0$b r6 = new androidx.appcompat.widget.i0$b
            r6.<init>()
            r5.f1044f = r6
        L_0x0065:
            java.lang.Runnable r6 = r5.f1044f
            int r1 = r5.f1041c
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ForwardingListener.m1149g(android.view.MotionEvent):boolean");
    }

    /* renamed from: h */
    private static boolean m1150h(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    /* renamed from: i */
    private boolean m1151i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1047i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    /* renamed from: j */
    private boolean m1152j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1047i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    /* renamed from: b */
    public abstract ShowableListMenu mo504b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract boolean mo505c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo1376d() {
        ShowableListMenu b = mo504b();
        if (b != null && b.mo602c()) {
            b.dismiss();
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo1492e() {
        m1147a();
        View view = this.f1042d;
        if (view.isEnabled() && !view.isLongClickable() && mo505c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f1045g = true;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f1045g;
        if (z2) {
            z = m1148f(motionEvent) || !mo1376d();
        } else {
            z = m1149g(motionEvent) && mo505c();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f1042d.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f1045g = z;
        if (z || z2) {
            return true;
        }
        return false;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f1045g = false;
        this.f1046h = -1;
        Runnable runnable = this.f1043e;
        if (runnable != null) {
            this.f1042d.removeCallbacks(runnable);
        }
    }
}
