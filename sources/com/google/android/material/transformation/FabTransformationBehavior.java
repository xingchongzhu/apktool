package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0232f;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p010b.p034g.p043k.ViewCompat;
import p067c.p068a.p069a.p114b.C1291f;
import p067c.p068a.p069a.p114b.p119m.AnimationUtils;
import p067c.p068a.p069a.p114b.p119m.AnimatorSetCompat;
import p067c.p068a.p069a.p114b.p119m.ArgbEvaluatorCompat;
import p067c.p068a.p069a.p114b.p119m.ChildrenAlphaProperty;
import p067c.p068a.p069a.p114b.p119m.DrawableAlphaProperty;
import p067c.p068a.p069a.p114b.p119m.MotionSpec;
import p067c.p068a.p069a.p114b.p119m.MotionTiming;
import p067c.p068a.p069a.p114b.p119m.Positioning;
import p067c.p068a.p069a.p114b.p124r.CircularRevealCompat;
import p067c.p068a.p069a.p114b.p124r.CircularRevealHelper;
import p067c.p068a.p069a.p114b.p124r.CircularRevealWidget;
import p067c.p068a.p069a.p114b.p124r.CircularRevealWidget.C1306d;
import p067c.p068a.p069a.p114b.p124r.CircularRevealWidget.C1307e;
import p067c.p068a.p069a.p114b.p131x.C1309a;

@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final Rect f13579c = new Rect();

    /* renamed from: d */
    private final RectF f13580d = new RectF();

    /* renamed from: e */
    private final RectF f13581e = new RectF();

    /* renamed from: f */
    private final int[] f13582f = new int[2];

    /* renamed from: g */
    private float f13583g;

    /* renamed from: h */
    private float f13584h;

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    class C2135a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f13585a;

        /* renamed from: b */
        final /* synthetic */ View f13586b;

        /* renamed from: c */
        final /* synthetic */ View f13587c;

        C2135a(boolean z, View view, View view2) {
            this.f13585a = z;
            this.f13586b = view;
            this.f13587c = view2;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f13585a) {
                this.f13586b.setVisibility(4);
                this.f13587c.setAlpha(1.0f);
                this.f13587c.setVisibility(0);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f13585a) {
                this.f13586b.setVisibility(0);
                this.f13587c.setAlpha(0.0f);
                this.f13587c.setVisibility(4);
            }
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    class C2136b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f13589a;

        C2136b(View view) {
            this.f13589a = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f13589a.invalidate();
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$c */
    class C2137c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ CircularRevealWidget f13591a;

        /* renamed from: b */
        final /* synthetic */ Drawable f13592b;

        C2137c(CircularRevealWidget dVar, Drawable drawable) {
            this.f13591a = dVar;
            this.f13592b = drawable;
        }

        public void onAnimationEnd(Animator animator) {
            this.f13591a.setCircularRevealOverlayDrawable(null);
        }

        public void onAnimationStart(Animator animator) {
            this.f13591a.setCircularRevealOverlayDrawable(this.f13592b);
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$d */
    class C2138d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ CircularRevealWidget f13594a;

        C2138d(CircularRevealWidget dVar) {
            this.f13594a = dVar;
        }

        public void onAnimationEnd(Animator animator) {
            C1307e revealInfo = this.f13594a.getRevealInfo();
            revealInfo.f9690c = Float.MAX_VALUE;
            this.f13594a.setRevealInfo(revealInfo);
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$e */
    protected static class C2139e {

        /* renamed from: a */
        public MotionSpec f13596a;

        /* renamed from: b */
        public Positioning f13597b;

        protected C2139e() {
        }
    }

    public FabTransformationBehavior() {
    }

    /* renamed from: K */
    private ViewGroup m16647K(View view) {
        View findViewById = view.findViewById(C1291f.mtrl_child_content_container);
        if (findViewById != null) {
            return m16667f0(findViewById);
        }
        if ((view instanceof TransformationChildLayout) || (view instanceof TransformationChildCard)) {
            return m16667f0(((ViewGroup) view).getChildAt(0));
        }
        return m16667f0(view);
    }

    /* renamed from: L */
    private void m16648L(View view, C2139e eVar, MotionTiming iVar, MotionTiming iVar2, float f, float f2, float f3, float f4, RectF rectF) {
        float S = m16655S(eVar, iVar, f, f3);
        float S2 = m16655S(eVar, iVar2, f2, f4);
        Rect rect = this.f13579c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f13580d;
        rectF2.set(rect);
        RectF rectF3 = this.f13581e;
        m16656T(view, rectF3);
        rectF3.offset(S, S2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    /* renamed from: M */
    private void m16649M(View view, RectF rectF) {
        m16656T(view, rectF);
        rectF.offset(this.f13583g, this.f13584h);
    }

    /* renamed from: N */
    private Pair<MotionTiming, MotionTiming> m16650N(float f, float f2, boolean z, C2139e eVar) {
        MotionTiming iVar;
        MotionTiming iVar2;
        if (f == 0.0f || f2 == 0.0f) {
            iVar2 = eVar.f13596a.mo7957e("translationXLinear");
            iVar = eVar.f13596a.mo7957e("translationYLinear");
        } else if ((!z || f2 >= 0.0f) && (z || f2 <= 0.0f)) {
            iVar2 = eVar.f13596a.mo7957e("translationXCurveDownwards");
            iVar = eVar.f13596a.mo7957e("translationYCurveDownwards");
        } else {
            iVar2 = eVar.f13596a.mo7957e("translationXCurveUpwards");
            iVar = eVar.f13596a.mo7957e("translationYCurveUpwards");
        }
        return new Pair<>(iVar2, iVar);
    }

    /* renamed from: O */
    private float m16651O(View view, View view2, Positioning jVar) {
        RectF rectF = this.f13580d;
        RectF rectF2 = this.f13581e;
        m16649M(view, rectF);
        m16656T(view2, rectF2);
        rectF2.offset(-m16653Q(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    /* renamed from: P */
    private float m16652P(View view, View view2, Positioning jVar) {
        RectF rectF = this.f13580d;
        RectF rectF2 = this.f13581e;
        m16649M(view, rectF);
        m16656T(view2, rectF2);
        rectF2.offset(0.0f, -m16654R(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    /* renamed from: Q */
    private float m16653Q(View view, View view2, Positioning jVar) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.f13580d;
        RectF rectF2 = this.f13581e;
        m16649M(view, rectF);
        m16656T(view2, rectF2);
        int i = jVar.f9631a & 7;
        if (i == 1) {
            f3 = rectF2.centerX();
            f2 = rectF.centerX();
        } else if (i == 3) {
            f3 = rectF2.left;
            f2 = rectF.left;
        } else if (i != 5) {
            f = 0.0f;
            return f + jVar.f9632b;
        } else {
            f3 = rectF2.right;
            f2 = rectF.right;
        }
        f = f3 - f2;
        return f + jVar.f9632b;
    }

    /* renamed from: R */
    private float m16654R(View view, View view2, Positioning jVar) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.f13580d;
        RectF rectF2 = this.f13581e;
        m16649M(view, rectF);
        m16656T(view2, rectF2);
        int i = jVar.f9631a & 112;
        if (i == 16) {
            f3 = rectF2.centerY();
            f2 = rectF.centerY();
        } else if (i == 48) {
            f3 = rectF2.top;
            f2 = rectF.top;
        } else if (i != 80) {
            f = 0.0f;
            return f + jVar.f9633c;
        } else {
            f3 = rectF2.bottom;
            f2 = rectF.bottom;
        }
        f = f3 - f2;
        return f + jVar.f9633c;
    }

    /* renamed from: S */
    private float m16655S(C2139e eVar, MotionTiming iVar, float f, float f2) {
        long c = iVar.mo7966c();
        long d = iVar.mo7967d();
        MotionTiming e = eVar.f13596a.mo7957e("expansion");
        return AnimationUtils.m11472a(f, f2, iVar.mo7968e().getInterpolation(((float) (((e.mo7966c() + e.mo7967d()) + 17) - c)) / ((float) d)));
    }

    /* renamed from: T */
    private void m16656T(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f13582f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    /* renamed from: U */
    private void m16657U(View view, View view2, boolean z, boolean z2, C2139e eVar, List<Animator> list, List<AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (view2 instanceof ViewGroup) {
            if (!(view2 instanceof CircularRevealWidget) || CircularRevealHelper.f9683a != 0) {
                ViewGroup K = m16647K(view2);
                if (K != null) {
                    if (z) {
                        if (!z2) {
                            ChildrenAlphaProperty.f9617a.set(K, Float.valueOf(0.0f));
                        }
                        objectAnimator = ObjectAnimator.ofFloat(K, ChildrenAlphaProperty.f9617a, new float[]{1.0f});
                    } else {
                        objectAnimator = ObjectAnimator.ofFloat(K, ChildrenAlphaProperty.f9617a, new float[]{0.0f});
                    }
                    eVar.f13596a.mo7957e("contentFade").mo7965a(objectAnimator);
                    list.add(objectAnimator);
                }
            }
        }
    }

    /* renamed from: V */
    private void m16658V(View view, View view2, boolean z, boolean z2, C2139e eVar, List<Animator> list, List<AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (view2 instanceof CircularRevealWidget) {
            CircularRevealWidget dVar = (CircularRevealWidget) view2;
            int d0 = m16666d0(view);
            int i = 16777215 & d0;
            if (z) {
                if (!z2) {
                    dVar.setCircularRevealScrimColor(d0);
                }
                objectAnimator = ObjectAnimator.ofInt(dVar, C1306d.f9687a, new int[]{i});
            } else {
                objectAnimator = ObjectAnimator.ofInt(dVar, C1306d.f9687a, new int[]{d0});
            }
            objectAnimator.setEvaluator(ArgbEvaluatorCompat.m11475b());
            eVar.f13596a.mo7957e("color").mo7965a(objectAnimator);
            list.add(objectAnimator);
        }
    }

    /* renamed from: W */
    private void m16659W(View view, View view2, boolean z, C2139e eVar, List<Animator> list) {
        float Q = m16653Q(view, view2, eVar.f13597b);
        float R = m16654R(view, view2, eVar.f13597b);
        Pair N = m16650N(Q, R, z, eVar);
        MotionTiming iVar = (MotionTiming) N.first;
        MotionTiming iVar2 = (MotionTiming) N.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            Q = this.f13583g;
        }
        fArr[0] = Q;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            R = this.f13584h;
        }
        fArr2[0] = R;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, fArr2);
        iVar.mo7965a(ofFloat);
        iVar2.mo7965a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    @TargetApi(21)
    /* renamed from: X */
    private void m16660X(View view, View view2, boolean z, boolean z2, C2139e eVar, List<Animator> list, List<AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        float w = ViewCompat.m5588w(view2) - ViewCompat.m5588w(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-w);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{0.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{-w});
        }
        eVar.f13596a.mo7957e("elevation").mo7965a(objectAnimator);
        list.add(objectAnimator);
    }

    /* renamed from: Y */
    private void m16661Y(View view, View view2, boolean z, boolean z2, C2139e eVar, float f, float f2, List<Animator> list, List<AnimatorListener> list2) {
        Animator animator;
        View view3 = view;
        View view4 = view2;
        C2139e eVar2 = eVar;
        if (view4 instanceof CircularRevealWidget) {
            CircularRevealWidget dVar = (CircularRevealWidget) view4;
            float O = m16651O(view3, view4, eVar2.f13597b);
            float P = m16652P(view3, view4, eVar2.f13597b);
            ((FloatingActionButton) view3).mo15763i(this.f13579c);
            float width = ((float) this.f13579c.width()) / 2.0f;
            MotionTiming e = eVar2.f13596a.mo7957e("expansion");
            if (z) {
                if (!z2) {
                    dVar.setRevealInfo(new C1307e(O, P, width));
                }
                if (z2) {
                    width = dVar.getRevealInfo().f9690c;
                }
                animator = CircularRevealCompat.m11559a(dVar, O, P, C1309a.m11588b(O, P, 0.0f, 0.0f, f, f2));
                animator.addListener(new C2138d(dVar));
                m16664b0(view2, e.mo7966c(), (int) O, (int) P, width, list);
            } else {
                float f3 = dVar.getRevealInfo().f9690c;
                Animator a = CircularRevealCompat.m11559a(dVar, O, P, width);
                int i = (int) O;
                int i2 = (int) P;
                View view5 = view2;
                int i3 = i;
                m16664b0(view5, e.mo7966c(), i, i2, f3, list);
                m16663a0(view5, e.mo7966c(), e.mo7967d(), eVar2.f13596a.mo7959f(), i3, i2, width, list);
                animator = a;
            }
            e.mo7965a(animator);
            list.add(animator);
            list2.add(CircularRevealCompat.m11560b(dVar));
        }
    }

    /* renamed from: Z */
    private void m16662Z(View view, View view2, boolean z, boolean z2, C2139e eVar, List<Animator> list, List<AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if ((view2 instanceof CircularRevealWidget) && (view instanceof ImageView)) {
            CircularRevealWidget dVar = (CircularRevealWidget) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    objectAnimator = ObjectAnimator.ofInt(drawable, DrawableAlphaProperty.f9618a, new int[]{0});
                } else {
                    objectAnimator = ObjectAnimator.ofInt(drawable, DrawableAlphaProperty.f9618a, new int[]{255});
                }
                objectAnimator.addUpdateListener(new C2136b(view2));
                eVar.f13596a.mo7957e("iconFade").mo7965a(objectAnimator);
                list.add(objectAnimator);
                list2.add(new C2137c(dVar, drawable));
            }
        }
    }

    /* renamed from: a0 */
    private void m16663a0(View view, long j, long j2, long j3, int i, int i2, float f, List<Animator> list) {
        if (VERSION.SDK_INT >= 21) {
            long j4 = j + j2;
            if (j4 < j3) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
                createCircularReveal.setStartDelay(j4);
                createCircularReveal.setDuration(j3 - j4);
                list.add(createCircularReveal);
            }
        }
    }

    /* renamed from: b0 */
    private void m16664b0(View view, long j, int i, int i2, float f, List<Animator> list) {
        if (VERSION.SDK_INT >= 21 && j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(0);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }

    /* renamed from: c0 */
    private void m16665c0(View view, View view2, boolean z, boolean z2, C2139e eVar, List<Animator> list, List<AnimatorListener> list2, RectF rectF) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        View view3 = view;
        View view4 = view2;
        boolean z3 = z;
        C2139e eVar2 = eVar;
        List<Animator> list3 = list;
        float Q = m16653Q(view3, view4, eVar2.f13597b);
        float R = m16654R(view3, view4, eVar2.f13597b);
        Pair N = m16650N(Q, R, z3, eVar2);
        MotionTiming iVar = (MotionTiming) N.first;
        MotionTiming iVar2 = (MotionTiming) N.second;
        if (z3) {
            if (!z2) {
                view4.setTranslationX(-Q);
                view4.setTranslationY(-R);
            }
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{0.0f});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{0.0f});
            m16648L(view2, eVar, iVar, iVar2, -Q, -R, 0.0f, 0.0f, rectF);
        } else {
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{-Q});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{-R});
        }
        iVar.mo7965a(objectAnimator2);
        iVar2.mo7965a(objectAnimator);
        list3.add(objectAnimator2);
        list3.add(objectAnimator);
    }

    /* renamed from: d0 */
    private int m16666d0(View view) {
        ColorStateList s = ViewCompat.m5580s(view);
        if (s != null) {
            return s.getColorForState(view.getDrawableState(), s.getDefaultColor());
        }
        return 0;
    }

    /* renamed from: f0 */
    private ViewGroup m16667f0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public AnimatorSet mo16451J(View view, View view2, boolean z, boolean z2) {
        boolean z3 = z;
        C2139e e0 = mo16453e0(view2.getContext(), z3);
        if (z3) {
            this.f13583g = view.getTranslationX();
            this.f13584h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (VERSION.SDK_INT >= 21) {
            m16660X(view, view2, z, z2, e0, arrayList, arrayList2);
        }
        RectF rectF = this.f13580d;
        View view3 = view;
        View view4 = view2;
        boolean z4 = z;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        m16665c0(view3, view4, z4, z2, e0, arrayList3, arrayList4, rectF);
        float width = rectF.width();
        float height = rectF.height();
        m16659W(view3, view4, z4, e0, arrayList);
        boolean z5 = z2;
        C2139e eVar = e0;
        m16662Z(view3, view4, z4, z5, eVar, arrayList3, arrayList4);
        m16661Y(view3, view4, z4, z5, eVar, width, height, arrayList, arrayList2);
        ArrayList arrayList5 = arrayList;
        ArrayList arrayList6 = arrayList2;
        m16658V(view3, view4, z4, z5, eVar, arrayList5, arrayList6);
        m16657U(view3, view4, z4, z5, eVar, arrayList5, arrayList6);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSetCompat.m11474a(animatorSet, arrayList);
        animatorSet.addListener(new C2135a(z3, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener((AnimatorListener) arrayList2.get(i));
        }
        return animatorSet;
    }

    /* renamed from: e */
    public boolean mo2063e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId()) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public abstract C2139e mo16453e0(Context context, boolean z);

    /* renamed from: g */
    public void mo2065g(C0232f fVar) {
        if (fVar.f1927h == 0) {
            fVar.f1927h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
