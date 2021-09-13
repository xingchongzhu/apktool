package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView.C0401a0;
import androidx.recyclerview.widget.RecyclerView.C0420n;
import androidx.recyclerview.widget.RecyclerView.C0429s;
import androidx.recyclerview.widget.RecyclerView.C0430t;
import com.fasterxml.jackson.core.JsonLocation;
import p010b.p034g.p043k.ViewCompat;

/* renamed from: androidx.recyclerview.widget.e */
class FastScroller extends C0420n implements C0429s {

    /* renamed from: a */
    private static final int[] f3062a = {16842919};

    /* renamed from: b */
    private static final int[] f3063b = new int[0];

    /* renamed from: A */
    private final int[] f3064A = new int[2];

    /* renamed from: B */
    final ValueAnimator f3065B;

    /* renamed from: C */
    int f3066C;

    /* renamed from: D */
    private final Runnable f3067D;

    /* renamed from: E */
    private final C0430t f3068E;

    /* renamed from: c */
    private final int f3069c;

    /* renamed from: d */
    private final int f3070d;

    /* renamed from: e */
    final StateListDrawable f3071e;

    /* renamed from: f */
    final Drawable f3072f;

    /* renamed from: g */
    private final int f3073g;

    /* renamed from: h */
    private final int f3074h;

    /* renamed from: i */
    private final StateListDrawable f3075i;

    /* renamed from: j */
    private final Drawable f3076j;

    /* renamed from: k */
    private final int f3077k;

    /* renamed from: l */
    private final int f3078l;

    /* renamed from: m */
    int f3079m;

    /* renamed from: n */
    int f3080n;

    /* renamed from: o */
    float f3081o;

    /* renamed from: p */
    int f3082p;

    /* renamed from: q */
    int f3083q;

    /* renamed from: r */
    float f3084r;

    /* renamed from: s */
    private int f3085s = 0;

    /* renamed from: t */
    private int f3086t = 0;

    /* renamed from: u */
    private RecyclerView f3087u;

    /* renamed from: v */
    private boolean f3088v = false;

    /* renamed from: w */
    private boolean f3089w = false;

    /* renamed from: x */
    private int f3090x = 0;

    /* renamed from: y */
    private int f3091y = 0;

    /* renamed from: z */
    private final int[] f3092z = new int[2];

    /* renamed from: androidx.recyclerview.widget.e$a */
    /* compiled from: FastScroller */
    class C0464a implements Runnable {
        C0464a() {
        }

        public void run() {
            FastScroller.this.mo3822q(JsonLocation.MAX_CONTENT_SNIPPET);
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$b */
    /* compiled from: FastScroller */
    class C0465b extends C0430t {
        C0465b() {
        }

        /* renamed from: b */
        public void mo3584b(RecyclerView recyclerView, int i, int i2) {
            FastScroller.this.mo3820B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$c */
    /* compiled from: FastScroller */
    private class C0466c extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f3095a = false;

        C0466c() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f3095a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f3095a) {
                this.f3095a = false;
                return;
            }
            if (((Float) FastScroller.this.f3065B.getAnimatedValue()).floatValue() == 0.0f) {
                FastScroller eVar = FastScroller.this;
                eVar.f3066C = 0;
                eVar.mo3826y(0);
            } else {
                FastScroller eVar2 = FastScroller.this;
                eVar2.f3066C = 2;
                eVar2.mo3825v();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$d */
    /* compiled from: FastScroller */
    private class C0467d implements AnimatorUpdateListener {
        C0467d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            FastScroller.this.f3071e.setAlpha(floatValue);
            FastScroller.this.f3072f.setAlpha(floatValue);
            FastScroller.this.mo3825v();
        }
    }

    FastScroller(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f3065B = ofFloat;
        this.f3066C = 0;
        this.f3067D = new C0464a();
        this.f3068E = new C0465b();
        this.f3071e = stateListDrawable;
        this.f3072f = drawable;
        this.f3075i = stateListDrawable2;
        this.f3076j = drawable2;
        this.f3073g = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f3074h = Math.max(i, drawable.getIntrinsicWidth());
        this.f3077k = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f3078l = Math.max(i, drawable2.getIntrinsicWidth());
        this.f3069c = i2;
        this.f3070d = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C0466c());
        ofFloat.addUpdateListener(new C0467d());
        mo3821j(recyclerView);
    }

    /* renamed from: C */
    private void m3763C(float f) {
        int[] p = m3769p();
        float max = Math.max((float) p[0], Math.min((float) p[1], f));
        if (Math.abs(((float) this.f3080n) - max) >= 2.0f) {
            int x = m3773x(this.f3081o, max, p, this.f3087u.computeVerticalScrollRange(), this.f3087u.computeVerticalScrollOffset(), this.f3086t);
            if (x != 0) {
                this.f3087u.scrollBy(0, x);
            }
            this.f3081o = max;
        }
    }

    /* renamed from: k */
    private void m3764k() {
        this.f3087u.removeCallbacks(this.f3067D);
    }

    /* renamed from: l */
    private void m3765l() {
        this.f3087u.mo3192Y0(this);
        this.f3087u.mo3194Z0(this);
        this.f3087u.mo3197a1(this.f3068E);
        m3764k();
    }

    /* renamed from: m */
    private void m3766m(Canvas canvas) {
        int i = this.f3086t;
        int i2 = this.f3077k;
        int i3 = i - i2;
        int i4 = this.f3083q;
        int i5 = this.f3082p;
        int i6 = i4 - (i5 / 2);
        this.f3075i.setBounds(0, 0, i5, i2);
        this.f3076j.setBounds(0, 0, this.f3085s, this.f3078l);
        canvas.translate(0.0f, (float) i3);
        this.f3076j.draw(canvas);
        canvas.translate((float) i6, 0.0f);
        this.f3075i.draw(canvas);
        canvas.translate((float) (-i6), (float) (-i3));
    }

    /* renamed from: n */
    private void m3767n(Canvas canvas) {
        int i = this.f3085s;
        int i2 = this.f3073g;
        int i3 = i - i2;
        int i4 = this.f3080n;
        int i5 = this.f3079m;
        int i6 = i4 - (i5 / 2);
        this.f3071e.setBounds(0, 0, i2, i5);
        this.f3072f.setBounds(0, 0, this.f3074h, this.f3086t);
        if (m3771s()) {
            this.f3072f.draw(canvas);
            canvas.translate((float) this.f3073g, (float) i6);
            canvas.scale(-1.0f, 1.0f);
            this.f3071e.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            canvas.translate((float) (-this.f3073g), (float) (-i6));
            return;
        }
        canvas.translate((float) i3, 0.0f);
        this.f3072f.draw(canvas);
        canvas.translate(0.0f, (float) i6);
        this.f3071e.draw(canvas);
        canvas.translate((float) (-i3), (float) (-i6));
    }

    /* renamed from: o */
    private int[] m3768o() {
        int[] iArr = this.f3064A;
        int i = this.f3070d;
        iArr[0] = i;
        iArr[1] = this.f3085s - i;
        return iArr;
    }

    /* renamed from: p */
    private int[] m3769p() {
        int[] iArr = this.f3092z;
        int i = this.f3070d;
        iArr[0] = i;
        iArr[1] = this.f3086t - i;
        return iArr;
    }

    /* renamed from: r */
    private void m3770r(float f) {
        int[] o = m3768o();
        float max = Math.max((float) o[0], Math.min((float) o[1], f));
        if (Math.abs(((float) this.f3083q) - max) >= 2.0f) {
            int x = m3773x(this.f3084r, max, o, this.f3087u.computeHorizontalScrollRange(), this.f3087u.computeHorizontalScrollOffset(), this.f3085s);
            if (x != 0) {
                this.f3087u.scrollBy(x, 0);
            }
            this.f3084r = max;
        }
    }

    /* renamed from: s */
    private boolean m3771s() {
        return ViewCompat.m5514C(this.f3087u) == 1;
    }

    /* renamed from: w */
    private void m3772w(int i) {
        m3764k();
        this.f3087u.postDelayed(this.f3067D, (long) i);
    }

    /* renamed from: x */
    private int m3773x(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / ((float) i4)) * ((float) i5));
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* renamed from: z */
    private void m3774z() {
        this.f3087u.mo3244h(this);
        this.f3087u.mo3252j(this);
        this.f3087u.mo3254k(this.f3068E);
    }

    /* renamed from: A */
    public void mo3819A() {
        int i = this.f3066C;
        if (i != 0) {
            if (i == 3) {
                this.f3065B.cancel();
            } else {
                return;
            }
        }
        this.f3066C = 1;
        ValueAnimator valueAnimator = this.f3065B;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.f3065B.setDuration(500);
        this.f3065B.setStartDelay(0);
        this.f3065B.start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: B */
    public void mo3820B(int i, int i2) {
        int computeVerticalScrollRange = this.f3087u.computeVerticalScrollRange();
        int i3 = this.f3086t;
        this.f3088v = computeVerticalScrollRange - i3 > 0 && i3 >= this.f3069c;
        int computeHorizontalScrollRange = this.f3087u.computeHorizontalScrollRange();
        int i4 = this.f3085s;
        boolean z = computeHorizontalScrollRange - i4 > 0 && i4 >= this.f3069c;
        this.f3089w = z;
        boolean z2 = this.f3088v;
        if (z2 || z) {
            if (z2) {
                float f = (float) i3;
                this.f3080n = (int) ((f * (((float) i2) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
                this.f3079m = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
            }
            if (this.f3089w) {
                float f2 = (float) i4;
                this.f3083q = (int) ((f2 * (((float) i) + (f2 / 2.0f))) / ((float) computeHorizontalScrollRange));
                this.f3082p = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
            }
            int i5 = this.f3090x;
            if (i5 == 0 || i5 == 1) {
                mo3826y(1);
            }
            return;
        }
        if (this.f3090x != 0) {
            mo3826y(0);
        }
    }

    /* renamed from: a */
    public boolean mo3580a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f3090x;
        if (i == 1) {
            boolean u = mo3824u(motionEvent.getX(), motionEvent.getY());
            boolean t = mo3823t(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!u && !t) {
                return false;
            }
            if (t) {
                this.f3091y = 1;
                this.f3084r = (float) ((int) motionEvent.getX());
            } else if (u) {
                this.f3091y = 2;
                this.f3081o = (float) ((int) motionEvent.getY());
            }
            mo3826y(2);
        } else if (i != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo3581b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f3090x != 0) {
            if (motionEvent.getAction() == 0) {
                boolean u = mo3824u(motionEvent.getX(), motionEvent.getY());
                boolean t = mo3823t(motionEvent.getX(), motionEvent.getY());
                if (u || t) {
                    if (t) {
                        this.f3091y = 1;
                        this.f3084r = (float) ((int) motionEvent.getX());
                    } else if (u) {
                        this.f3091y = 2;
                        this.f3081o = (float) ((int) motionEvent.getY());
                    }
                    mo3826y(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f3090x == 2) {
                this.f3081o = 0.0f;
                this.f3084r = 0.0f;
                mo3826y(1);
                this.f3091y = 0;
            } else if (motionEvent.getAction() == 2 && this.f3090x == 2) {
                mo3819A();
                if (this.f3091y == 1) {
                    m3770r(motionEvent.getX());
                }
                if (this.f3091y == 2) {
                    m3763C(motionEvent.getY());
                }
            }
        }
    }

    /* renamed from: c */
    public void mo3582c(boolean z) {
    }

    /* renamed from: i */
    public void mo3473i(Canvas canvas, RecyclerView recyclerView, C0401a0 a0Var) {
        if (this.f3085s == this.f3087u.getWidth() && this.f3086t == this.f3087u.getHeight()) {
            if (this.f3066C != 0) {
                if (this.f3088v) {
                    m3767n(canvas);
                }
                if (this.f3089w) {
                    m3766m(canvas);
                }
            }
            return;
        }
        this.f3085s = this.f3087u.getWidth();
        this.f3086t = this.f3087u.getHeight();
        mo3826y(0);
    }

    /* renamed from: j */
    public void mo3821j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3087u;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                m3765l();
            }
            this.f3087u = recyclerView;
            if (recyclerView != null) {
                m3774z();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public void mo3822q(int i) {
        int i2 = this.f3066C;
        if (i2 == 1) {
            this.f3065B.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.f3066C = 3;
        ValueAnimator valueAnimator = this.f3065B;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
        this.f3065B.setDuration((long) i);
        this.f3065B.start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public boolean mo3823t(float f, float f2) {
        if (f2 >= ((float) (this.f3086t - this.f3077k))) {
            int i = this.f3083q;
            int i2 = this.f3082p;
            if (f >= ((float) (i - (i2 / 2))) && f <= ((float) (i + (i2 / 2)))) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public boolean mo3824u(float f, float f2) {
        if (!m3771s() ? f >= ((float) (this.f3085s - this.f3073g)) : f <= ((float) (this.f3073g / 2))) {
            int i = this.f3080n;
            int i2 = this.f3079m;
            if (f2 >= ((float) (i - (i2 / 2))) && f2 <= ((float) (i + (i2 / 2)))) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public void mo3825v() {
        this.f3087u.invalidate();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y */
    public void mo3826y(int i) {
        if (i == 2 && this.f3090x != 2) {
            this.f3071e.setState(f3062a);
            m3764k();
        }
        if (i == 0) {
            mo3825v();
        } else {
            mo3819A();
        }
        if (this.f3090x == 2 && i != 2) {
            this.f3071e.setState(f3063b);
            m3772w(1200);
        } else if (i == 1) {
            m3772w(1500);
        }
        this.f3090x = i;
    }
}
