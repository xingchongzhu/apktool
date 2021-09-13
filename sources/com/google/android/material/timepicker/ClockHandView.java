package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.List;
import p010b.p034g.p043k.ViewCompat;
import p067c.p068a.p069a.p114b.C1270b;
import p067c.p068a.p069a.p114b.C1288d;
import p067c.p068a.p069a.p114b.C1296k;
import p067c.p068a.p069a.p114b.C1297l;

class ClockHandView extends View {

    /* renamed from: a */
    private ValueAnimator f13527a;

    /* renamed from: b */
    private boolean f13528b;

    /* renamed from: c */
    private float f13529c;

    /* renamed from: d */
    private float f13530d;

    /* renamed from: e */
    private boolean f13531e;

    /* renamed from: f */
    private int f13532f;

    /* renamed from: g */
    private final List<C2123d> f13533g;

    /* renamed from: h */
    private final int f13534h;

    /* renamed from: i */
    private final float f13535i;

    /* renamed from: j */
    private final Paint f13536j;

    /* renamed from: k */
    private final RectF f13537k;

    /* renamed from: l */
    private final int f13538l;

    /* renamed from: m */
    private float f13539m;

    /* renamed from: n */
    private boolean f13540n;

    /* renamed from: o */
    private C2122c f13541o;

    /* renamed from: p */
    private double f13542p;

    /* renamed from: q */
    private int f13543q;

    /* renamed from: com.google.android.material.timepicker.ClockHandView$a */
    class C2120a implements AnimatorUpdateListener {
        C2120a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ClockHandView.this.m16607m(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockHandView$b */
    class C2121b extends AnimatorListenerAdapter {
        C2121b() {
        }

        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockHandView$c */
    public interface C2122c {
        /* renamed from: a */
        void mo16425a(float f, boolean z);
    }

    /* renamed from: com.google.android.material.timepicker.ClockHandView$d */
    public interface C2123d {
        /* renamed from: a */
        void mo16409a(float f, boolean z);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1270b.materialClockStyle);
    }

    /* renamed from: c */
    private void m16603c(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = (float) width;
        float cos = (((float) this.f13543q) * ((float) Math.cos(this.f13542p))) + f;
        float f2 = (float) height;
        float sin = (((float) this.f13543q) * ((float) Math.sin(this.f13542p))) + f2;
        this.f13536j.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, (float) this.f13534h, this.f13536j);
        double sin2 = Math.sin(this.f13542p);
        double cos2 = Math.cos(this.f13542p);
        double d = (double) ((float) (this.f13543q - this.f13534h));
        Double.isNaN(d);
        float f3 = (float) (width + ((int) (cos2 * d)));
        Double.isNaN(d);
        float f4 = (float) (height + ((int) (d * sin2)));
        this.f13536j.setStrokeWidth((float) this.f13538l);
        canvas.drawLine(f, f2, f3, f4, this.f13536j);
        canvas.drawCircle(f, f2, this.f13535i, this.f13536j);
    }

    /* renamed from: e */
    private int m16604e(float f, float f2) {
        int degrees = ((int) Math.toDegrees(Math.atan2((double) (f2 - ((float) (getHeight() / 2))), (double) (f - ((float) (getWidth() / 2)))))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    /* renamed from: h */
    private Pair<Float, Float> m16605h(float f) {
        float f2 = mo16415f();
        if (Math.abs(f2 - f) > 180.0f) {
            if (f2 > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (f2 < 180.0f && f > 180.0f) {
                f2 += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(f2), Float.valueOf(f));
    }

    /* renamed from: i */
    private boolean m16606i(float f, float f2, boolean z, boolean z2, boolean z3) {
        float e = (float) m16604e(f, f2);
        boolean z4 = false;
        boolean z5 = mo16415f() != e;
        if (z2 && z5) {
            return true;
        }
        if (!z5 && !z) {
            return false;
        }
        if (z3 && this.f13528b) {
            z4 = true;
        }
        mo16419l(e, z4);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m16607m(float f, boolean z) {
        float f2 = f % 360.0f;
        this.f13539m = f2;
        this.f13542p = Math.toRadians((double) (f2 - 90.0f));
        float width = ((float) (getWidth() / 2)) + (((float) this.f13543q) * ((float) Math.cos(this.f13542p)));
        float height = ((float) (getHeight() / 2)) + (((float) this.f13543q) * ((float) Math.sin(this.f13542p)));
        RectF rectF = this.f13537k;
        int i = this.f13534h;
        rectF.set(width - ((float) i), height - ((float) i), width + ((float) i), height + ((float) i));
        for (C2123d a : this.f13533g) {
            a.mo16409a(f2, z);
        }
        invalidate();
    }

    /* renamed from: b */
    public void mo16413b(C2123d dVar) {
        this.f13533g.add(dVar);
    }

    /* renamed from: d */
    public RectF mo16414d() {
        return this.f13537k;
    }

    /* renamed from: f */
    public float mo16415f() {
        return this.f13539m;
    }

    /* renamed from: g */
    public int mo16416g() {
        return this.f13534h;
    }

    /* renamed from: j */
    public void mo16417j(int i) {
        this.f13543q = i;
        invalidate();
    }

    /* renamed from: k */
    public void mo16418k(float f) {
        mo16419l(f, false);
    }

    /* renamed from: l */
    public void mo16419l(float f, boolean z) {
        ValueAnimator valueAnimator = this.f13527a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            m16607m(f, false);
            return;
        }
        Pair h = m16605h(f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{((Float) h.first).floatValue(), ((Float) h.second).floatValue()});
        this.f13527a = ofFloat;
        ofFloat.setDuration(200);
        this.f13527a.addUpdateListener(new C2120a());
        this.f13527a.addListener(new C2121b());
        this.f13527a.start();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m16603c(canvas);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mo16418k(mo16415f());
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 2) {
                int i = (int) (x - this.f13529c);
                int i2 = (int) (y - this.f13530d);
                this.f13531e = (i * i) + (i2 * i2) > this.f13532f;
                boolean z4 = this.f13540n;
                z3 = actionMasked == 1;
                z2 = z4;
            } else {
                z3 = false;
                z2 = false;
            }
            z = false;
        } else {
            this.f13529c = x;
            this.f13530d = y;
            this.f13531e = true;
            this.f13540n = false;
            z3 = false;
            z2 = false;
            z = true;
        }
        boolean i3 = m16606i(x, y, z2, z, z3) | this.f13540n;
        this.f13540n = i3;
        if (i3 && z3) {
            C2122c cVar = this.f13541o;
            if (cVar != null) {
                cVar.mo16425a((float) m16604e(x, y), this.f13531e);
            }
        }
        return true;
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13533g = new ArrayList();
        Paint paint = new Paint();
        this.f13536j = paint;
        this.f13537k = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1297l.f9376W0, i, C1296k.Widget_MaterialComponents_TimePicker_Clock);
        this.f13543q = obtainStyledAttributes.getDimensionPixelSize(C1297l.f9390Y0, 0);
        this.f13534h = obtainStyledAttributes.getDimensionPixelSize(C1297l.f9397Z0, 0);
        Resources resources = getResources();
        this.f13538l = resources.getDimensionPixelSize(C1288d.material_clock_hand_stroke_width);
        this.f13535i = (float) resources.getDimensionPixelSize(C1288d.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(C1297l.f9383X0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        mo16418k(0.0f);
        this.f13532f = ViewConfiguration.get(context).getScaledTouchSlop();
        ViewCompat.m5591x0(this, 2);
        obtainStyledAttributes.recycle();
    }
}
