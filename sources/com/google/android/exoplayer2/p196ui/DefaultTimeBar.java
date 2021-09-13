package com.google.android.exoplayer2.p196ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import com.google.android.exoplayer2.p196ui.TimeBar.C1884a;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: com.google.android.exoplayer2.ui.DefaultTimeBar */
public class DefaultTimeBar extends View implements TimeBar {

    /* renamed from: A */
    private int f11904A;

    /* renamed from: B */
    private long f11905B;

    /* renamed from: C */
    private int f11906C;

    /* renamed from: D */
    private Rect f11907D;

    /* renamed from: G */
    private ValueAnimator f11908G;

    /* renamed from: H */
    private float f11909H;

    /* renamed from: I */
    private boolean f11910I;

    /* renamed from: J */
    private boolean f11911J;

    /* renamed from: K */
    private long f11912K;

    /* renamed from: L */
    private long f11913L;

    /* renamed from: M */
    private long f11914M;

    /* renamed from: N */
    private long f11915N;

    /* renamed from: O */
    private int f11916O;

    /* renamed from: P */
    private long[] f11917P;

    /* renamed from: Q */
    private boolean[] f11918Q;

    /* renamed from: a */
    private final Rect f11919a;

    /* renamed from: b */
    private final Rect f11920b;

    /* renamed from: c */
    private final Rect f11921c;

    /* renamed from: d */
    private final Rect f11922d;

    /* renamed from: e */
    private final Paint f11923e;

    /* renamed from: f */
    private final Paint f11924f;

    /* renamed from: g */
    private final Paint f11925g;

    /* renamed from: h */
    private final Paint f11926h;

    /* renamed from: i */
    private final Paint f11927i;

    /* renamed from: j */
    private final Paint f11928j;

    /* renamed from: k */
    private final Drawable f11929k;

    /* renamed from: l */
    private final int f11930l;

    /* renamed from: m */
    private final int f11931m;

    /* renamed from: n */
    private final int f11932n;

    /* renamed from: o */
    private final int f11933o;

    /* renamed from: p */
    private final int f11934p;

    /* renamed from: q */
    private final int f11935q;

    /* renamed from: r */
    private final int f11936r;

    /* renamed from: s */
    private final int f11937s;

    /* renamed from: t */
    private final int f11938t;

    /* renamed from: u */
    private final StringBuilder f11939u;

    /* renamed from: v */
    private final Formatter f11940v;

    /* renamed from: w */
    private final Runnable f11941w;

    /* renamed from: x */
    private final CopyOnWriteArraySet<C1884a> f11942x;

    /* renamed from: y */
    private final Point f11943y;

    /* renamed from: z */
    private final float f11944z;

    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: c */
    private static int m14709c(float f, int i) {
        return (int) ((((float) i) * f) + 0.5f);
    }

    /* renamed from: d */
    private void m14710d(Canvas canvas) {
        if (this.f11913L > 0) {
            Rect rect = this.f11922d;
            int p = Util.m10307p(rect.right, rect.left, this.f11920b.right);
            int centerY = this.f11922d.centerY();
            Drawable drawable = this.f11929k;
            if (drawable == null) {
                int i = (this.f11911J || isFocused()) ? this.f11936r : isEnabled() ? this.f11934p : this.f11935q;
                canvas.drawCircle((float) p, (float) centerY, (float) ((int) ((((float) i) * this.f11909H) / 2.0f)), this.f11928j);
            } else {
                int intrinsicWidth = ((int) (((float) drawable.getIntrinsicWidth()) * this.f11909H)) / 2;
                int intrinsicHeight = ((int) (((float) this.f11929k.getIntrinsicHeight()) * this.f11909H)) / 2;
                this.f11929k.setBounds(p - intrinsicWidth, centerY - intrinsicHeight, p + intrinsicWidth, centerY + intrinsicHeight);
                this.f11929k.draw(canvas);
            }
        }
    }

    /* renamed from: e */
    private void m14711e(Canvas canvas) {
        int height = this.f11920b.height();
        int centerY = this.f11920b.centerY() - (height / 2);
        int i = height + centerY;
        if (this.f11913L <= 0) {
            Rect rect = this.f11920b;
            canvas.drawRect((float) rect.left, (float) centerY, (float) rect.right, (float) i, this.f11925g);
            return;
        }
        Rect rect2 = this.f11921c;
        int i2 = rect2.left;
        int i3 = rect2.right;
        int max = Math.max(Math.max(this.f11920b.left, i3), this.f11922d.right);
        int i4 = this.f11920b.right;
        if (max < i4) {
            canvas.drawRect((float) max, (float) centerY, (float) i4, (float) i, this.f11925g);
        }
        int max2 = Math.max(i2, this.f11922d.right);
        if (i3 > max2) {
            canvas.drawRect((float) max2, (float) centerY, (float) i3, (float) i, this.f11924f);
        }
        if (this.f11922d.width() > 0) {
            Rect rect3 = this.f11922d;
            canvas.drawRect((float) rect3.left, (float) centerY, (float) rect3.right, (float) i, this.f11923e);
        }
        if (this.f11916O != 0) {
            long[] jArr = (long[]) Assertions.m10153e(this.f11917P);
            boolean[] zArr = (boolean[]) Assertions.m10153e(this.f11918Q);
            int i5 = this.f11933o / 2;
            for (int i6 = 0; i6 < this.f11916O; i6++) {
                int width = ((int) ((((long) this.f11920b.width()) * Util.m10309q(jArr[i6], 0, this.f11913L)) / this.f11913L)) - i5;
                Rect rect4 = this.f11920b;
                int min = rect4.left + Math.min(rect4.width() - this.f11933o, Math.max(0, width));
                canvas.drawRect((float) min, (float) centerY, (float) (min + this.f11933o), (float) i, zArr[i6] ? this.f11927i : this.f11926h);
            }
        }
    }

    /* renamed from: f */
    private boolean m14712f(float f, float f2) {
        return this.f11919a.contains((int) f, (int) f2);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void mo14708h() {
        m14723s(false);
    }

    private long getPositionIncrement() {
        long j = this.f11905B;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.f11913L;
        if (j2 == -9223372036854775807L) {
            return 0;
        }
        return j2 / ((long) this.f11904A);
    }

    private String getProgressText() {
        return Util.m10278a0(this.f11939u, this.f11940v, this.f11914M);
    }

    private long getScrubberPosition() {
        if (this.f11920b.width() <= 0 || this.f11913L == -9223372036854775807L) {
            return 0;
        }
        return (((long) this.f11922d.width()) * this.f11913L) / ((long) this.f11920b.width());
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void mo14709j(ValueAnimator valueAnimator) {
        this.f11909H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate(this.f11919a);
    }

    /* renamed from: k */
    private void m14715k(float f) {
        Rect rect = this.f11922d;
        int i = (int) f;
        Rect rect2 = this.f11920b;
        rect.right = Util.m10307p(i, rect2.left, rect2.right);
    }

    /* renamed from: l */
    private static int m14716l(float f, int i) {
        return (int) (((float) i) / f);
    }

    /* renamed from: m */
    private Point m14717m(MotionEvent motionEvent) {
        this.f11943y.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.f11943y;
    }

    /* renamed from: n */
    private boolean m14718n(long j) {
        long j2 = this.f11913L;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.f11911J ? this.f11912K : this.f11914M;
        long q = Util.m10309q(j3 + j, 0, j2);
        if (q == j3) {
            return false;
        }
        if (!this.f11911J) {
            m14722r(q);
        } else {
            m14726v(q);
        }
        m14724t();
        return true;
    }

    /* renamed from: o */
    private boolean m14719o(Drawable drawable) {
        return Util.f8398a >= 23 && m14720p(drawable, getLayoutDirection());
    }

    /* renamed from: p */
    private static boolean m14720p(Drawable drawable, int i) {
        return Util.f8398a >= 23 && drawable.setLayoutDirection(i);
    }

    /* renamed from: q */
    private void m14721q(int i, int i2) {
        Rect rect = this.f11907D;
        if (rect == null || rect.width() != i || this.f11907D.height() != i2) {
            Rect rect2 = new Rect(0, 0, i, i2);
            this.f11907D = rect2;
            setSystemGestureExclusionRects(Collections.singletonList(rect2));
        }
    }

    /* renamed from: r */
    private void m14722r(long j) {
        this.f11912K = j;
        this.f11911J = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.f11942x.iterator();
        while (it.hasNext()) {
            ((C1884a) it.next()).mo14848b(this, j);
        }
    }

    /* renamed from: s */
    private void m14723s(boolean z) {
        removeCallbacks(this.f11941w);
        this.f11911J = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.f11942x.iterator();
        while (it.hasNext()) {
            ((C1884a) it.next()).mo14849d(this, this.f11912K, z);
        }
    }

    /* renamed from: t */
    private void m14724t() {
        this.f11921c.set(this.f11920b);
        this.f11922d.set(this.f11920b);
        long j = this.f11911J ? this.f11912K : this.f11914M;
        if (this.f11913L > 0) {
            int width = (int) ((((long) this.f11920b.width()) * this.f11915N) / this.f11913L);
            Rect rect = this.f11921c;
            Rect rect2 = this.f11920b;
            rect.right = Math.min(rect2.left + width, rect2.right);
            int width2 = (int) ((((long) this.f11920b.width()) * j) / this.f11913L);
            Rect rect3 = this.f11922d;
            Rect rect4 = this.f11920b;
            rect3.right = Math.min(rect4.left + width2, rect4.right);
        } else {
            Rect rect5 = this.f11921c;
            int i = this.f11920b.left;
            rect5.right = i;
            this.f11922d.right = i;
        }
        invalidate(this.f11919a);
    }

    /* renamed from: u */
    private void m14725u() {
        Drawable drawable = this.f11929k;
        if (drawable != null && drawable.isStateful() && this.f11929k.setState(getDrawableState())) {
            invalidate();
        }
    }

    /* renamed from: v */
    private void m14726v(long j) {
        if (this.f11912K != j) {
            this.f11912K = j;
            Iterator it = this.f11942x.iterator();
            while (it.hasNext()) {
                ((C1884a) it.next()).mo14847a(this, j);
            }
        }
    }

    /* renamed from: a */
    public void mo14704a(long[] jArr, boolean[] zArr, int i) {
        Assertions.m10149a(i == 0 || !(jArr == null || zArr == null));
        this.f11916O = i;
        this.f11917P = jArr;
        this.f11918Q = zArr;
        m14724t();
    }

    /* renamed from: b */
    public void mo14705b(C1884a aVar) {
        Assertions.m10153e(aVar);
        this.f11942x.add(aVar);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        m14725u();
    }

    public long getPreferredUpdateDelay() {
        int l = m14716l(this.f11944z, this.f11920b.width());
        if (l != 0) {
            long j = this.f11913L;
            if (!(j == 0 || j == -9223372036854775807L)) {
                return j / ((long) l);
            }
        }
        return Long.MAX_VALUE;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f11929k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onDraw(Canvas canvas) {
        canvas.save();
        m14711e(canvas);
        m14710d(canvas);
        canvas.restore();
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.f11911J && !z) {
            m14723s(false);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f11913L > 0) {
            if (Util.f8398a >= 21) {
                accessibilityNodeInfo.addAction(AccessibilityAction.ACTION_SCROLL_FORWARD);
                accessibilityNodeInfo.addAction(AccessibilityAction.ACTION_SCROLL_BACKWARD);
            } else {
                accessibilityNodeInfo.addAction(4096);
                accessibilityNodeInfo.addAction(8192);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (m14718n(r0) == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        removeCallbacks(r4.f11941w);
        postDelayed(r4.f11941w, 1000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L_0x0030
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L_0x0027
            switch(r5) {
                case 21: goto L_0x0013;
                case 22: goto L_0x0014;
                case 23: goto L_0x0027;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0030
        L_0x0013:
            long r0 = -r0
        L_0x0014:
            boolean r0 = r4.m14718n(r0)
            if (r0 == 0) goto L_0x0030
            java.lang.Runnable r5 = r4.f11941w
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.f11941w
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L_0x0027:
            boolean r0 = r4.f11911J
            if (r0 == 0) goto L_0x0030
            r5 = 0
            r4.m14723s(r5)
            return r3
        L_0x0030:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p196ui.DefaultTimeBar.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i7 - getPaddingRight();
        int i9 = this.f11910I ? 0 : this.f11937s;
        if (this.f11932n == 1) {
            i6 = (i8 - getPaddingBottom()) - this.f11931m;
            int paddingBottom = i8 - getPaddingBottom();
            int i10 = this.f11930l;
            i5 = (paddingBottom - i10) - Math.max(i9 - (i10 / 2), 0);
        } else {
            i6 = (i8 - this.f11931m) / 2;
            i5 = (i8 - this.f11930l) / 2;
        }
        this.f11919a.set(paddingLeft, i6, paddingRight, this.f11931m + i6);
        Rect rect = this.f11920b;
        Rect rect2 = this.f11919a;
        rect.set(rect2.left + i9, i5, rect2.right - i9, this.f11930l + i5);
        if (Util.f8398a >= 29) {
            m14721q(i7, i8);
        }
        m14724t();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        if (mode == 0) {
            size = this.f11931m;
        } else if (mode != 1073741824) {
            size = Math.min(this.f11931m, size);
        }
        setMeasuredDimension(MeasureSpec.getSize(i), size);
        m14725u();
    }

    public void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.f11929k;
        if (drawable != null && m14720p(drawable, i)) {
            invalidate();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r3 != 3) goto L_0x0076;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L_0x0076
            long r2 = r7.f11913L
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0010
            goto L_0x0076
        L_0x0010:
            android.graphics.Point r0 = r7.m14717m(r8)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L_0x005d
            r5 = 3
            if (r3 == r4) goto L_0x004e
            r6 = 2
            if (r3 == r6) goto L_0x0028
            if (r3 == r5) goto L_0x004e
            goto L_0x0076
        L_0x0028:
            boolean r8 = r7.f11911J
            if (r8 == 0) goto L_0x0076
            int r8 = r7.f11938t
            if (r0 >= r8) goto L_0x003a
            int r8 = r7.f11906C
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r8 = r8 + r2
            float r8 = (float) r8
            r7.m14715k(r8)
            goto L_0x0040
        L_0x003a:
            r7.f11906C = r2
            float r8 = (float) r2
            r7.m14715k(r8)
        L_0x0040:
            long r0 = r7.getScrubberPosition()
            r7.m14726v(r0)
            r7.m14724t()
            r7.invalidate()
            return r4
        L_0x004e:
            boolean r0 = r7.f11911J
            if (r0 == 0) goto L_0x0076
            int r8 = r8.getAction()
            if (r8 != r5) goto L_0x0059
            r1 = 1
        L_0x0059:
            r7.m14723s(r1)
            return r4
        L_0x005d:
            float r8 = (float) r2
            float r0 = (float) r0
            boolean r0 = r7.m14712f(r8, r0)
            if (r0 == 0) goto L_0x0076
            r7.m14715k(r8)
            long r0 = r7.getScrubberPosition()
            r7.m14722r(r0)
            r7.m14724t()
            r7.invalidate()
            return r4
        L_0x0076:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p196ui.DefaultTimeBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.f11913L <= 0) {
            return false;
        }
        if (i == 8192) {
            if (m14718n(-getPositionIncrement())) {
                m14723s(false);
            }
        } else if (i != 4096) {
            return false;
        } else {
            if (m14718n(getPositionIncrement())) {
                m14723s(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i) {
        this.f11926h.setColor(i);
        invalidate(this.f11919a);
    }

    public void setBufferedColor(int i) {
        this.f11924f.setColor(i);
        invalidate(this.f11919a);
    }

    public void setBufferedPosition(long j) {
        this.f11915N = j;
        m14724t();
    }

    public void setDuration(long j) {
        this.f11913L = j;
        if (this.f11911J && j == -9223372036854775807L) {
            m14723s(true);
        }
        m14724t();
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.f11911J && !z) {
            m14723s(true);
        }
    }

    public void setKeyCountIncrement(int i) {
        Assertions.m10149a(i > 0);
        this.f11904A = i;
        this.f11905B = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        Assertions.m10149a(j > 0);
        this.f11904A = -1;
        this.f11905B = j;
    }

    public void setPlayedAdMarkerColor(int i) {
        this.f11927i.setColor(i);
        invalidate(this.f11919a);
    }

    public void setPlayedColor(int i) {
        this.f11923e.setColor(i);
        invalidate(this.f11919a);
    }

    public void setPosition(long j) {
        this.f11914M = j;
        setContentDescription(getProgressText());
        m14724t();
    }

    public void setScrubberColor(int i) {
        this.f11928j.setColor(i);
        invalidate(this.f11919a);
    }

    public void setUnplayedColor(int i) {
        this.f11925g.setColor(i);
        invalidate(this.f11919a);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        this(context, attributeSet, i, attributeSet2, 0);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2, int i2) {
        AttributeSet attributeSet3 = attributeSet2;
        super(context, attributeSet, i);
        this.f11919a = new Rect();
        this.f11920b = new Rect();
        this.f11921c = new Rect();
        this.f11922d = new Rect();
        Paint paint = new Paint();
        this.f11923e = paint;
        Paint paint2 = new Paint();
        this.f11924f = paint2;
        Paint paint3 = new Paint();
        this.f11925g = paint3;
        Paint paint4 = new Paint();
        this.f11926h = paint4;
        Paint paint5 = new Paint();
        this.f11927i = paint5;
        Paint paint6 = new Paint();
        this.f11928j = paint6;
        paint6.setAntiAlias(true);
        this.f11942x = new CopyOnWriteArraySet<>();
        this.f11943y = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.f11944z = f;
        this.f11938t = m14709c(f, -50);
        int c = m14709c(f, 4);
        int c2 = m14709c(f, 26);
        int c3 = m14709c(f, 4);
        int c4 = m14709c(f, 12);
        int c5 = m14709c(f, 0);
        int c6 = m14709c(f, 16);
        if (attributeSet3 != null) {
            Paint paint7 = paint4;
            Paint paint8 = paint5;
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet3, C1879q.f12102d, i, i2);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(C1879q.f12113o);
                this.f11929k = drawable;
                if (drawable != null) {
                    m14719o(drawable);
                    c2 = Math.max(drawable.getMinimumHeight(), c2);
                }
                this.f11930l = obtainStyledAttributes.getDimensionPixelSize(C1879q.f12106h, c);
                this.f11931m = obtainStyledAttributes.getDimensionPixelSize(C1879q.f12115q, c2);
                this.f11932n = obtainStyledAttributes.getInt(C1879q.f12105g, 0);
                this.f11933o = obtainStyledAttributes.getDimensionPixelSize(C1879q.f12104f, c3);
                this.f11934p = obtainStyledAttributes.getDimensionPixelSize(C1879q.f12114p, c4);
                this.f11935q = obtainStyledAttributes.getDimensionPixelSize(C1879q.f12111m, c5);
                this.f11936r = obtainStyledAttributes.getDimensionPixelSize(C1879q.f12112n, c6);
                int i3 = obtainStyledAttributes.getInt(C1879q.f12109k, -1);
                int i4 = obtainStyledAttributes.getInt(C1879q.f12110l, -1);
                int i5 = obtainStyledAttributes.getInt(C1879q.f12107i, -855638017);
                int i6 = obtainStyledAttributes.getInt(C1879q.f12116r, 872415231);
                int i7 = obtainStyledAttributes.getInt(C1879q.f12103e, -1291845888);
                int i8 = obtainStyledAttributes.getInt(C1879q.f12108j, 872414976);
                paint.setColor(i3);
                paint6.setColor(i4);
                paint2.setColor(i5);
                paint3.setColor(i6);
                paint7.setColor(i7);
                paint8.setColor(i8);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            Paint paint9 = paint4;
            this.f11930l = c;
            this.f11931m = c2;
            this.f11932n = 0;
            this.f11933o = c3;
            this.f11934p = c4;
            this.f11935q = c5;
            this.f11936r = c6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint9.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f11929k = null;
        }
        StringBuilder sb = new StringBuilder();
        this.f11939u = sb;
        this.f11940v = new Formatter(sb, Locale.getDefault());
        this.f11941w = new C1864b(this);
        Drawable drawable2 = this.f11929k;
        if (drawable2 != null) {
            this.f11937s = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f11937s = (Math.max(this.f11935q, Math.max(this.f11934p, this.f11936r)) + 1) / 2;
        }
        this.f11909H = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f11908G = valueAnimator;
        valueAnimator.addUpdateListener(new C1865c(this));
        this.f11913L = -9223372036854775807L;
        this.f11905B = -9223372036854775807L;
        this.f11904A = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
