package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.material.internal.StateListAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import p010b.p034g.p042j.Preconditions;
import p010b.p034g.p043k.ViewCompat;
import p067c.p068a.p069a.p114b.C1267a;
import p067c.p068a.p069a.p114b.p115a0.RippleUtils;
import p067c.p068a.p069a.p114b.p116b0.ShadowViewDelegate;
import p067c.p068a.p069a.p114b.p117c0.MaterialShapeDrawable;
import p067c.p068a.p069a.p114b.p117c0.MaterialShapeUtils;
import p067c.p068a.p069a.p114b.p117c0.ShapeAppearanceModel;
import p067c.p068a.p069a.p114b.p117c0.Shapeable;
import p067c.p068a.p069a.p114b.p119m.AnimationUtils;
import p067c.p068a.p069a.p114b.p119m.AnimatorSetCompat;
import p067c.p068a.p069a.p114b.p119m.ImageMatrixProperty;
import p067c.p068a.p069a.p114b.p119m.MatrixEvaluator;
import p067c.p068a.p069a.p114b.p119m.MotionSpec;

/* renamed from: com.google.android.material.floatingactionbutton.b */
class FloatingActionButtonImpl {

    /* renamed from: a */
    static final TimeInterpolator f13006a = AnimationUtils.f9613c;

    /* renamed from: b */
    static final int[] f13007b = {16842919, 16842910};

    /* renamed from: c */
    static final int[] f13008c = {16843623, 16842908, 16842910};

    /* renamed from: d */
    static final int[] f13009d = {16842908, 16842910};

    /* renamed from: e */
    static final int[] f13010e = {16843623, 16842910};

    /* renamed from: f */
    static final int[] f13011f = {16842910};

    /* renamed from: g */
    static final int[] f13012g = new int[0];

    /* renamed from: A */
    private int f13013A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public int f13014B = 0;

    /* renamed from: C */
    private ArrayList<AnimatorListener> f13015C;

    /* renamed from: D */
    private ArrayList<AnimatorListener> f13016D;

    /* renamed from: E */
    private ArrayList<C2038i> f13017E;

    /* renamed from: F */
    final FloatingActionButton f13018F;

    /* renamed from: G */
    final ShadowViewDelegate f13019G;

    /* renamed from: H */
    private final Rect f13020H = new Rect();

    /* renamed from: I */
    private final RectF f13021I = new RectF();

    /* renamed from: J */
    private final RectF f13022J = new RectF();

    /* renamed from: K */
    private final Matrix f13023K = new Matrix();

    /* renamed from: L */
    private OnPreDrawListener f13024L;

    /* renamed from: h */
    ShapeAppearanceModel f13025h;

    /* renamed from: i */
    MaterialShapeDrawable f13026i;

    /* renamed from: j */
    Drawable f13027j;

    /* renamed from: k */
    BorderDrawable f13028k;

    /* renamed from: l */
    Drawable f13029l;

    /* renamed from: m */
    boolean f13030m;

    /* renamed from: n */
    boolean f13031n = true;

    /* renamed from: o */
    float f13032o;

    /* renamed from: p */
    float f13033p;

    /* renamed from: q */
    float f13034q;

    /* renamed from: r */
    int f13035r;

    /* renamed from: s */
    private final StateListAnimator f13036s;

    /* renamed from: t */
    private MotionSpec f13037t;

    /* renamed from: u */
    private MotionSpec f13038u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public Animator f13039v;

    /* renamed from: w */
    private MotionSpec f13040w;

    /* renamed from: x */
    private MotionSpec f13041x;

    /* renamed from: y */
    private float f13042y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public float f13043z = 1.0f;

    /* renamed from: com.google.android.material.floatingactionbutton.b$a */
    /* compiled from: FloatingActionButtonImpl */
    class C2030a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f13044a;

        /* renamed from: b */
        final /* synthetic */ boolean f13045b;

        /* renamed from: c */
        final /* synthetic */ C2039j f13046c;

        C2030a(boolean z, C2039j jVar) {
            this.f13045b = z;
            this.f13046c = jVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f13044a = true;
        }

        public void onAnimationEnd(Animator animator) {
            FloatingActionButtonImpl.this.f13014B = 0;
            FloatingActionButtonImpl.this.f13039v = null;
            if (!this.f13044a) {
                FloatingActionButton floatingActionButton = FloatingActionButtonImpl.this.f13018F;
                boolean z = this.f13045b;
                floatingActionButton.mo16015b(z ? 8 : 4, z);
                C2039j jVar = this.f13046c;
                if (jVar != null) {
                    jVar.mo15814b();
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            FloatingActionButtonImpl.this.f13018F.mo16015b(0, this.f13045b);
            FloatingActionButtonImpl.this.f13014B = 1;
            FloatingActionButtonImpl.this.f13039v = animator;
            this.f13044a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$b */
    /* compiled from: FloatingActionButtonImpl */
    class C2031b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f13048a;

        /* renamed from: b */
        final /* synthetic */ C2039j f13049b;

        C2031b(boolean z, C2039j jVar) {
            this.f13048a = z;
            this.f13049b = jVar;
        }

        public void onAnimationEnd(Animator animator) {
            FloatingActionButtonImpl.this.f13014B = 0;
            FloatingActionButtonImpl.this.f13039v = null;
            C2039j jVar = this.f13049b;
            if (jVar != null) {
                jVar.mo15813a();
            }
        }

        public void onAnimationStart(Animator animator) {
            FloatingActionButtonImpl.this.f13018F.mo16015b(0, this.f13048a);
            FloatingActionButtonImpl.this.f13014B = 2;
            FloatingActionButtonImpl.this.f13039v = animator;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$c */
    /* compiled from: FloatingActionButtonImpl */
    class C2032c extends MatrixEvaluator {
        C2032c() {
        }

        /* renamed from: a */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            FloatingActionButtonImpl.this.f13043z = f;
            return super.mo7956a(f, matrix, matrix2);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$d */
    /* compiled from: FloatingActionButtonImpl */
    class C2033d implements TypeEvaluator<Float> {

        /* renamed from: a */
        FloatEvaluator f13052a = new FloatEvaluator();

        C2033d() {
        }

        /* renamed from: a */
        public Float evaluate(float f, Float f2, Float f3) {
            float floatValue = this.f13052a.evaluate(f, f2, f3).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$e */
    /* compiled from: FloatingActionButtonImpl */
    class C2034e implements OnPreDrawListener {
        C2034e() {
        }

        public boolean onPreDraw() {
            FloatingActionButtonImpl.this.mo15824F();
            return true;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$f */
    /* compiled from: FloatingActionButtonImpl */
    private class C2035f extends C2041l {
        C2035f() {
            super(FloatingActionButtonImpl.this, null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo15873a() {
            return 0.0f;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$g */
    /* compiled from: FloatingActionButtonImpl */
    private class C2036g extends C2041l {
        C2036g() {
            super(FloatingActionButtonImpl.this, null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo15873a() {
            FloatingActionButtonImpl bVar = FloatingActionButtonImpl.this;
            return bVar.f13032o + bVar.f13033p;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$h */
    /* compiled from: FloatingActionButtonImpl */
    private class C2037h extends C2041l {
        C2037h() {
            super(FloatingActionButtonImpl.this, null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo15873a() {
            FloatingActionButtonImpl bVar = FloatingActionButtonImpl.this;
            return bVar.f13032o + bVar.f13034q;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$i */
    /* compiled from: FloatingActionButtonImpl */
    interface C2038i {
        /* renamed from: a */
        void mo15815a();

        /* renamed from: b */
        void mo15816b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$j */
    /* compiled from: FloatingActionButtonImpl */
    interface C2039j {
        /* renamed from: a */
        void mo15813a();

        /* renamed from: b */
        void mo15814b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$k */
    /* compiled from: FloatingActionButtonImpl */
    private class C2040k extends C2041l {
        C2040k() {
            super(FloatingActionButtonImpl.this, null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo15873a() {
            return FloatingActionButtonImpl.this.f13032o;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$l */
    /* compiled from: FloatingActionButtonImpl */
    private abstract class C2041l extends AnimatorListenerAdapter implements AnimatorUpdateListener {

        /* renamed from: a */
        private boolean f13059a;

        /* renamed from: b */
        private float f13060b;

        /* renamed from: c */
        private float f13061c;

        private C2041l() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract float mo15873a();

        public void onAnimationEnd(Animator animator) {
            FloatingActionButtonImpl.this.mo15846c0((float) ((int) this.f13061c));
            this.f13059a = false;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f13059a) {
                MaterialShapeDrawable gVar = FloatingActionButtonImpl.this.f13026i;
                this.f13060b = gVar == null ? 0.0f : gVar.mo7871w();
                this.f13061c = mo15873a();
                this.f13059a = true;
            }
            FloatingActionButtonImpl bVar = FloatingActionButtonImpl.this;
            float f = this.f13060b;
            bVar.mo15846c0((float) ((int) (f + ((this.f13061c - f) * valueAnimator.getAnimatedFraction()))));
        }

        /* synthetic */ C2041l(FloatingActionButtonImpl bVar, C2030a aVar) {
            this();
        }
    }

    FloatingActionButtonImpl(FloatingActionButton floatingActionButton, ShadowViewDelegate bVar) {
        this.f13018F = floatingActionButton;
        this.f13019G = bVar;
        StateListAnimator fVar = new StateListAnimator();
        this.f13036s = fVar;
        fVar.mo15992a(f13007b, m16029i(new C2037h()));
        fVar.mo15992a(f13008c, m16029i(new C2036g()));
        fVar.mo15992a(f13009d, m16029i(new C2036g()));
        fVar.mo15992a(f13010e, m16029i(new C2036g()));
        fVar.mo15992a(f13011f, m16029i(new C2040k()));
        fVar.mo15992a(f13012g, m16029i(new C2035f()));
        this.f13042y = floatingActionButton.getRotation();
    }

    /* renamed from: W */
    private boolean m16022W() {
        return ViewCompat.m5537T(this.f13018F) && !this.f13018F.isInEditMode();
    }

    /* renamed from: d0 */
    private void m16026d0(ObjectAnimator objectAnimator) {
        if (VERSION.SDK_INT == 26) {
            objectAnimator.setEvaluator(new C2033d());
        }
    }

    /* renamed from: g */
    private void m16027g(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f13018F.getDrawable();
        if (drawable != null && this.f13013A != 0) {
            RectF rectF = this.f13021I;
            RectF rectF2 = this.f13022J;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i = this.f13013A;
            rectF2.set(0.0f, 0.0f, (float) i, (float) i);
            matrix.setRectToRect(rectF, rectF2, ScaleToFit.CENTER);
            int i2 = this.f13013A;
            matrix.postScale(f, f, ((float) i2) / 2.0f, ((float) i2) / 2.0f);
        }
    }

    /* renamed from: h */
    private AnimatorSet m16028h(MotionSpec hVar, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f13018F, View.ALPHA, new float[]{f});
        hVar.mo7957e("opacity").mo7965a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f13018F, View.SCALE_X, new float[]{f2});
        String str = "scale";
        hVar.mo7957e(str).mo7965a(ofFloat2);
        m16026d0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f13018F, View.SCALE_Y, new float[]{f2});
        hVar.mo7957e(str).mo7965a(ofFloat3);
        m16026d0(ofFloat3);
        arrayList.add(ofFloat3);
        m16027g(f3, this.f13023K);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f13018F, new ImageMatrixProperty(), new C2032c(), new Matrix[]{new Matrix(this.f13023K)});
        hVar.mo7957e("iconScale").mo7965a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSetCompat.m11474a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: i */
    private ValueAnimator m16029i(C2041l lVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f13006a);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(lVar);
        valueAnimator.addUpdateListener(lVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    /* renamed from: k */
    private MotionSpec m16030k() {
        if (this.f13038u == null) {
            this.f13038u = MotionSpec.m11486c(this.f13018F.getContext(), C1267a.design_fab_hide_motion_spec);
        }
        return (MotionSpec) Preconditions.m5188e(this.f13038u);
    }

    /* renamed from: l */
    private MotionSpec m16031l() {
        if (this.f13037t == null) {
            this.f13037t = MotionSpec.m11486c(this.f13018F.getContext(), C1267a.design_fab_show_motion_spec);
        }
        return (MotionSpec) Preconditions.m5188e(this.f13037t);
    }

    /* renamed from: q */
    private OnPreDrawListener m16032q() {
        if (this.f13024L == null) {
            this.f13024L = new C2034e();
        }
        return this.f13024L;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: A */
    public void mo15819A() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: B */
    public void mo15820B() {
        ViewTreeObserver viewTreeObserver = this.f13018F.getViewTreeObserver();
        OnPreDrawListener onPreDrawListener = this.f13024L;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f13024L = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: C */
    public void mo15821C(int[] iArr) {
        this.f13036s.mo15994d(iArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: D */
    public void mo15822D(float f, float f2, float f3) {
        mo15845b0();
        mo15846c0(f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: E */
    public void mo15823E(Rect rect) {
        Preconditions.m5189f(this.f13029l, "Didn't initialize content background");
        if (mo15840V()) {
            InsetDrawable insetDrawable = new InsetDrawable(this.f13029l, rect.left, rect.top, rect.right, rect.bottom);
            this.f13019G.mo7817b(insetDrawable);
            return;
        }
        this.f13019G.mo7817b(this.f13029l);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: F */
    public void mo15824F() {
        float rotation = this.f13018F.getRotation();
        if (this.f13042y != rotation) {
            this.f13042y = rotation;
            mo15843Z();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: G */
    public void mo15825G() {
        ArrayList<C2038i> arrayList = this.f13017E;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C2038i) it.next()).mo15816b();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: H */
    public void mo15826H() {
        ArrayList<C2038i> arrayList = this.f13017E;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C2038i) it.next()).mo15815a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: I */
    public boolean mo15827I() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: J */
    public void mo15828J(ColorStateList colorStateList) {
        MaterialShapeDrawable gVar = this.f13026i;
        if (gVar != null) {
            gVar.setTintList(colorStateList);
        }
        if (this.f13028k != null) {
            throw null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: K */
    public void mo15829K(Mode mode) {
        MaterialShapeDrawable gVar = this.f13026i;
        if (gVar != null) {
            gVar.setTintMode(mode);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: L */
    public final void mo15830L(float f) {
        if (this.f13032o != f) {
            this.f13032o = f;
            mo15822D(f, this.f13033p, this.f13034q);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: M */
    public void mo15831M(boolean z) {
        this.f13030m = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: N */
    public final void mo15832N(MotionSpec hVar) {
        this.f13041x = hVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: O */
    public final void mo15833O(float f) {
        if (this.f13033p != f) {
            this.f13033p = f;
            mo15822D(this.f13032o, f, this.f13034q);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: P */
    public final void mo15834P(float f) {
        this.f13043z = f;
        Matrix matrix = this.f13023K;
        m16027g(f, matrix);
        this.f13018F.setImageMatrix(matrix);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Q */
    public final void mo15835Q(float f) {
        if (this.f13034q != f) {
            this.f13034q = f;
            mo15822D(this.f13032o, this.f13033p, f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: R */
    public void mo15836R(ColorStateList colorStateList) {
        Drawable drawable = this.f13027j;
        if (drawable != null) {
            DrawableCompat.m1856o(drawable, RippleUtils.m11253d(colorStateList));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: S */
    public void mo15837S(boolean z) {
        this.f13031n = z;
        mo15845b0();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: T */
    public final void mo15838T(ShapeAppearanceModel kVar) {
        this.f13025h = kVar;
        MaterialShapeDrawable gVar = this.f13026i;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        Drawable drawable = this.f13027j;
        if (drawable instanceof Shapeable) {
            ((Shapeable) drawable).setShapeAppearanceModel(kVar);
        }
        if (this.f13028k != null) {
            throw null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: U */
    public final void mo15839U(MotionSpec hVar) {
        this.f13040w = hVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: V */
    public boolean mo15840V() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: X */
    public final boolean mo15841X() {
        return !this.f13030m || this.f13018F.getSizeDimension() >= this.f13035r;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Y */
    public void mo15842Y(C2039j jVar, boolean z) {
        if (!mo15861x()) {
            Animator animator = this.f13039v;
            if (animator != null) {
                animator.cancel();
            }
            if (m16022W()) {
                if (this.f13018F.getVisibility() != 0) {
                    this.f13018F.setAlpha(0.0f);
                    this.f13018F.setScaleY(0.0f);
                    this.f13018F.setScaleX(0.0f);
                    mo15834P(0.0f);
                }
                MotionSpec hVar = this.f13040w;
                if (hVar == null) {
                    hVar = m16031l();
                }
                AnimatorSet h = m16028h(hVar, 1.0f, 1.0f, 1.0f);
                h.addListener(new C2031b(z, jVar));
                ArrayList<AnimatorListener> arrayList = this.f13015C;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        h.addListener((AnimatorListener) it.next());
                    }
                }
                h.start();
            } else {
                this.f13018F.mo16015b(0, z);
                this.f13018F.setAlpha(1.0f);
                this.f13018F.setScaleY(1.0f);
                this.f13018F.setScaleX(1.0f);
                mo15834P(1.0f);
                if (jVar != null) {
                    jVar.mo15813a();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Z */
    public void mo15843Z() {
        if (VERSION.SDK_INT == 19) {
            if (this.f13042y % 90.0f != 0.0f) {
                if (this.f13018F.getLayerType() != 1) {
                    this.f13018F.setLayerType(1, null);
                }
            } else if (this.f13018F.getLayerType() != 0) {
                this.f13018F.setLayerType(0, null);
            }
        }
        MaterialShapeDrawable gVar = this.f13026i;
        if (gVar != null) {
            gVar.mo7847b0((int) this.f13042y);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a0 */
    public final void mo15844a0() {
        mo15834P(this.f13043z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b0 */
    public final void mo15845b0() {
        Rect rect = this.f13020H;
        mo15855r(rect);
        mo15823E(rect);
        this.f13019G.mo7816a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c0 */
    public void mo15846c0(float f) {
        MaterialShapeDrawable gVar = this.f13026i;
        if (gVar != null) {
            gVar.mo7842W(f);
        }
    }

    /* renamed from: d */
    public void mo15847d(AnimatorListener animatorListener) {
        if (this.f13016D == null) {
            this.f13016D = new ArrayList<>();
        }
        this.f13016D.add(animatorListener);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo15848e(AnimatorListener animatorListener) {
        if (this.f13015C == null) {
            this.f13015C = new ArrayList<>();
        }
        this.f13015C.add(animatorListener);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo15849f(C2038i iVar) {
        if (this.f13017E == null) {
            this.f13017E = new ArrayList<>();
        }
        this.f13017E.add(iVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final Drawable mo15850j() {
        return this.f13029l;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public float mo15851m() {
        return this.f13032o;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public boolean mo15852n() {
        return this.f13030m;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final MotionSpec mo15853o() {
        return this.f13041x;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public float mo15854p() {
        return this.f13033p;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public void mo15855r(Rect rect) {
        int sizeDimension = this.f13030m ? (this.f13035r - this.f13018F.getSizeDimension()) / 2 : 0;
        float m = this.f13031n ? mo15851m() + this.f13034q : 0.0f;
        int max = Math.max(sizeDimension, (int) Math.ceil((double) m));
        int max2 = Math.max(sizeDimension, (int) Math.ceil((double) (m * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public float mo15856s() {
        return this.f13034q;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public final ShapeAppearanceModel mo15857t() {
        return this.f13025h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public final MotionSpec mo15858u() {
        return this.f13040w;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public void mo15859v(C2039j jVar, boolean z) {
        if (!mo15860w()) {
            Animator animator = this.f13039v;
            if (animator != null) {
                animator.cancel();
            }
            if (m16022W()) {
                MotionSpec hVar = this.f13041x;
                if (hVar == null) {
                    hVar = m16030k();
                }
                AnimatorSet h = m16028h(hVar, 0.0f, 0.0f, 0.0f);
                h.addListener(new C2030a(z, jVar));
                ArrayList<AnimatorListener> arrayList = this.f13016D;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        h.addListener((AnimatorListener) it.next());
                    }
                }
                h.start();
            } else {
                this.f13018F.mo16015b(z ? 8 : 4, z);
                if (jVar != null) {
                    jVar.mo15814b();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public boolean mo15860w() {
        boolean z = false;
        if (this.f13018F.getVisibility() == 0) {
            if (this.f13014B == 1) {
                z = true;
            }
            return z;
        }
        if (this.f13014B != 2) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public boolean mo15861x() {
        boolean z = false;
        if (this.f13018F.getVisibility() != 0) {
            if (this.f13014B == 2) {
                z = true;
            }
            return z;
        }
        if (this.f13014B != 1) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y */
    public void mo15862y() {
        this.f13036s.mo15993c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: z */
    public void mo15863z() {
        MaterialShapeDrawable gVar = this.f13026i;
        if (gVar != null) {
            MaterialShapeUtils.m11338f(this.f13018F, gVar);
        }
        if (mo15827I()) {
            this.f13018F.getViewTreeObserver().addOnPreDrawListener(m16032q());
        }
    }
}
