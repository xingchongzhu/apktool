package p010b.p062p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import p010b.p034g.p043k.ViewCompat;

/* renamed from: b.p.c */
public class ChangeBounds extends Transition {

    /* renamed from: M */
    private static final String[] f4964M = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: N */
    private static final Property<Drawable, PointF> f4965N = new C0699b(PointF.class, "boundsOrigin");

    /* renamed from: O */
    private static final Property<C0708k, PointF> f4966O;

    /* renamed from: P */
    private static final Property<C0708k, PointF> f4967P;

    /* renamed from: Q */
    private static final Property<View, PointF> f4968Q;

    /* renamed from: R */
    private static final Property<View, PointF> f4969R;

    /* renamed from: S */
    private static final Property<View, PointF> f4970S = new C0704g(PointF.class, "position");

    /* renamed from: T */
    private static RectEvaluator f4971T = new RectEvaluator();

    /* renamed from: U */
    private int[] f4972U = new int[2];

    /* renamed from: V */
    private boolean f4973V = false;

    /* renamed from: W */
    private boolean f4974W = false;

    /* renamed from: b.p.c$a */
    /* compiled from: ChangeBounds */
    class C0698a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f4975a;

        /* renamed from: b */
        final /* synthetic */ BitmapDrawable f4976b;

        /* renamed from: c */
        final /* synthetic */ View f4977c;

        /* renamed from: d */
        final /* synthetic */ float f4978d;

        C0698a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.f4975a = viewGroup;
            this.f4976b = bitmapDrawable;
            this.f4977c = view;
            this.f4978d = f;
        }

        public void onAnimationEnd(Animator animator) {
            C0709c0.m5908b(this.f4975a).mo5303d(this.f4976b);
            C0709c0.m5913g(this.f4977c, this.f4978d);
        }
    }

    /* renamed from: b.p.c$b */
    /* compiled from: ChangeBounds */
    static class C0699b extends Property<Drawable, PointF> {

        /* renamed from: a */
        private Rect f4980a = new Rect();

        C0699b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f4980a);
            Rect rect = this.f4980a;
            return new PointF((float) rect.left, (float) rect.top);
        }

        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f4980a);
            this.f4980a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f4980a);
        }
    }

    /* renamed from: b.p.c$c */
    /* compiled from: ChangeBounds */
    static class C0700c extends Property<C0708k, PointF> {
        C0700c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C0708k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C0708k kVar, PointF pointF) {
            kVar.mo5340c(pointF);
        }
    }

    /* renamed from: b.p.c$d */
    /* compiled from: ChangeBounds */
    static class C0701d extends Property<C0708k, PointF> {
        C0701d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C0708k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C0708k kVar, PointF pointF) {
            kVar.mo5339a(pointF);
        }
    }

    /* renamed from: b.p.c$e */
    /* compiled from: ChangeBounds */
    static class C0702e extends Property<View, PointF> {
        C0702e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            C0709c0.m5912f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: b.p.c$f */
    /* compiled from: ChangeBounds */
    static class C0703f extends Property<View, PointF> {
        C0703f(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            C0709c0.m5912f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: b.p.c$g */
    /* compiled from: ChangeBounds */
    static class C0704g extends Property<View, PointF> {
        C0704g(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            C0709c0.m5912f(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: b.p.c$h */
    /* compiled from: ChangeBounds */
    class C0705h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0708k f4981a;
        private C0708k mViewBounds;

        C0705h(C0708k kVar) {
            this.f4981a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* renamed from: b.p.c$i */
    /* compiled from: ChangeBounds */
    class C0706i extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f4983a;

        /* renamed from: b */
        final /* synthetic */ View f4984b;

        /* renamed from: c */
        final /* synthetic */ Rect f4985c;

        /* renamed from: d */
        final /* synthetic */ int f4986d;

        /* renamed from: e */
        final /* synthetic */ int f4987e;

        /* renamed from: f */
        final /* synthetic */ int f4988f;

        /* renamed from: g */
        final /* synthetic */ int f4989g;

        C0706i(View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f4984b = view;
            this.f4985c = rect;
            this.f4986d = i;
            this.f4987e = i2;
            this.f4988f = i3;
            this.f4989g = i4;
        }

        public void onAnimationCancel(Animator animator) {
            this.f4983a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f4983a) {
                ViewCompat.m5585u0(this.f4984b, this.f4985c);
                C0709c0.m5912f(this.f4984b, this.f4986d, this.f4987e, this.f4988f, this.f4989g);
            }
        }
    }

    /* renamed from: b.p.c$j */
    /* compiled from: ChangeBounds */
    class C0707j extends TransitionListenerAdapter {

        /* renamed from: a */
        boolean f4991a = false;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f4992b;

        C0707j(ViewGroup viewGroup) {
            this.f4992b = viewGroup;
        }

        /* renamed from: b */
        public void mo5335b(Transition mVar) {
            C0732x.m6123c(this.f4992b, false);
            this.f4991a = true;
        }

        /* renamed from: c */
        public void mo5336c(Transition mVar) {
            C0732x.m6123c(this.f4992b, false);
        }

        /* renamed from: d */
        public void mo5337d(Transition mVar) {
            C0732x.m6123c(this.f4992b, true);
        }

        /* renamed from: e */
        public void mo5338e(Transition mVar) {
            if (!this.f4991a) {
                C0732x.m6123c(this.f4992b, false);
            }
            mVar.mo5388O(this);
        }
    }

    /* renamed from: b.p.c$k */
    /* compiled from: ChangeBounds */
    private static class C0708k {

        /* renamed from: a */
        private int f4994a;

        /* renamed from: b */
        private int f4995b;

        /* renamed from: c */
        private int f4996c;

        /* renamed from: d */
        private int f4997d;

        /* renamed from: e */
        private View f4998e;

        /* renamed from: f */
        private int f4999f;

        /* renamed from: g */
        private int f5000g;

        C0708k(View view) {
            this.f4998e = view;
        }

        /* renamed from: b */
        private void m5904b() {
            C0709c0.m5912f(this.f4998e, this.f4994a, this.f4995b, this.f4996c, this.f4997d);
            this.f4999f = 0;
            this.f5000g = 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5339a(PointF pointF) {
            this.f4996c = Math.round(pointF.x);
            this.f4997d = Math.round(pointF.y);
            int i = this.f5000g + 1;
            this.f5000g = i;
            if (this.f4999f == i) {
                m5904b();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo5340c(PointF pointF) {
            this.f4994a = Math.round(pointF.x);
            this.f4995b = Math.round(pointF.y);
            int i = this.f4999f + 1;
            this.f4999f = i;
            if (i == this.f5000g) {
                m5904b();
            }
        }
    }

    static {
        String str = "topLeft";
        f4966O = new C0700c(PointF.class, str);
        String str2 = "bottomRight";
        f4967P = new C0701d(PointF.class, str2);
        f4968Q = new C0702e(PointF.class, str2);
        f4969R = new C0703f(PointF.class, str);
    }

    /* renamed from: f0 */
    private void m5882f0(TransitionValues sVar) {
        View view = sVar.f5123b;
        if (ViewCompat.m5537T(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            sVar.f5122a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            sVar.f5122a.put("android:changeBounds:parent", sVar.f5123b.getParent());
            if (this.f4974W) {
                sVar.f5123b.getLocationInWindow(this.f4972U);
                sVar.f5122a.put("android:changeBounds:windowX", Integer.valueOf(this.f4972U[0]));
                sVar.f5122a.put("android:changeBounds:windowY", Integer.valueOf(this.f4972U[1]));
            }
            if (this.f4973V) {
                sVar.f5122a.put("android:changeBounds:clip", ViewCompat.m5584u(view));
            }
        }
    }

    /* renamed from: g0 */
    private boolean m5883g0(View view, View view2) {
        if (!this.f4974W) {
            return true;
        }
        TransitionValues s = mo5414s(view, true);
        if (s == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == s.f5123b) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public String[] mo5304C() {
        return f4964M;
    }

    /* renamed from: f */
    public void mo5305f(TransitionValues sVar) {
        m5882f0(sVar);
    }

    /* renamed from: i */
    public void mo5306i(TransitionValues sVar) {
        m5882f0(sVar);
    }

    /* renamed from: m */
    public Animator mo5307m(ViewGroup viewGroup, TransitionValues sVar, TransitionValues sVar2) {
        int i;
        View view;
        Animator animator;
        Animator animator2;
        int i2;
        Rect rect;
        ObjectAnimator objectAnimator;
        TransitionValues sVar3 = sVar;
        TransitionValues sVar4 = sVar2;
        if (sVar3 == null || sVar4 == null) {
            return null;
        }
        String str = "android:changeBounds:parent";
        ViewGroup viewGroup2 = (ViewGroup) sVar3.f5122a.get(str);
        ViewGroup viewGroup3 = (ViewGroup) sVar4.f5122a.get(str);
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = sVar4.f5123b;
        if (m5883g0(viewGroup2, viewGroup3)) {
            String str2 = "android:changeBounds:bounds";
            Rect rect2 = (Rect) sVar3.f5122a.get(str2);
            Rect rect3 = (Rect) sVar4.f5122a.get(str2);
            int i3 = rect2.left;
            int i4 = rect3.left;
            int i5 = rect2.top;
            int i6 = rect3.top;
            int i7 = rect2.right;
            int i8 = rect3.right;
            int i9 = rect2.bottom;
            int i10 = rect3.bottom;
            int i11 = i7 - i3;
            int i12 = i9 - i5;
            int i13 = i8 - i4;
            int i14 = i10 - i6;
            View view3 = view2;
            String str3 = "android:changeBounds:clip";
            Rect rect4 = (Rect) sVar3.f5122a.get(str3);
            Rect rect5 = (Rect) sVar4.f5122a.get(str3);
            if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
                i = 0;
            } else {
                i = (i3 == i4 && i5 == i6) ? 0 : 1;
                if (!(i7 == i8 && i9 == i10)) {
                    i++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i++;
            }
            if (i > 0) {
                Rect rect6 = rect5;
                Rect rect7 = rect4;
                if (!this.f4973V) {
                    view = view3;
                    C0709c0.m5912f(view, i3, i5, i7, i9);
                    if (i == 2) {
                        if (i11 == i13 && i12 == i14) {
                            animator = ObjectAnimatorUtils.m5957a(view, f4970S, mo5417u().mo5361a((float) i3, (float) i5, (float) i4, (float) i6));
                        } else {
                            C0708k kVar = new C0708k(view);
                            ObjectAnimator a = ObjectAnimatorUtils.m5957a(kVar, f4966O, mo5417u().mo5361a((float) i3, (float) i5, (float) i4, (float) i6));
                            ObjectAnimator a2 = ObjectAnimatorUtils.m5957a(kVar, f4967P, mo5417u().mo5361a((float) i7, (float) i9, (float) i8, (float) i10));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(new Animator[]{a, a2});
                            animatorSet.addListener(new C0705h(kVar));
                            animator = animatorSet;
                        }
                    } else if (i3 == i4 && i5 == i6) {
                        animator = ObjectAnimatorUtils.m5957a(view, f4968Q, mo5417u().mo5361a((float) i7, (float) i9, (float) i8, (float) i10));
                    } else {
                        animator = ObjectAnimatorUtils.m5957a(view, f4969R, mo5417u().mo5361a((float) i3, (float) i5, (float) i4, (float) i6));
                    }
                } else {
                    view = view3;
                    C0709c0.m5912f(view, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
                    if (i3 == i4 && i5 == i6) {
                        animator2 = null;
                    } else {
                        animator2 = ObjectAnimatorUtils.m5957a(view, f4970S, mo5417u().mo5361a((float) i3, (float) i5, (float) i4, (float) i6));
                    }
                    if (rect7 == null) {
                        i2 = 0;
                        rect = new Rect(0, 0, i11, i12);
                    } else {
                        i2 = 0;
                        rect = rect7;
                    }
                    Rect rect8 = rect6 == null ? new Rect(i2, i2, i13, i14) : rect6;
                    if (!rect.equals(rect8)) {
                        ViewCompat.m5585u0(view, rect);
                        RectEvaluator kVar2 = f4971T;
                        Object[] objArr = new Object[2];
                        objArr[i2] = rect;
                        objArr[1] = rect8;
                        ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", kVar2, objArr);
                        C0706i iVar = new C0706i(view, rect6, i4, i6, i8, i10);
                        ofObject.addListener(iVar);
                        objectAnimator = ofObject;
                    } else {
                        objectAnimator = null;
                    }
                    animator = TransitionUtils.m6111c(animator2, objectAnimator);
                }
                if (view.getParent() instanceof ViewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                    C0732x.m6123c(viewGroup4, true);
                    mo5395a(new C0707j(viewGroup4));
                }
                return animator;
            }
        } else {
            String str4 = "android:changeBounds:windowX";
            int intValue = ((Integer) sVar3.f5122a.get(str4)).intValue();
            String str5 = "android:changeBounds:windowY";
            int intValue2 = ((Integer) sVar3.f5122a.get(str5)).intValue();
            int intValue3 = ((Integer) sVar4.f5122a.get(str4)).intValue();
            int intValue4 = ((Integer) sVar4.f5122a.get(str5)).intValue();
            if (!(intValue == intValue3 && intValue2 == intValue4)) {
                viewGroup.getLocationInWindow(this.f4972U);
                Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Config.ARGB_8888);
                view2.draw(new Canvas(createBitmap));
                BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
                float c = C0709c0.m5909c(view2);
                C0709c0.m5913g(view2, 0.0f);
                C0709c0.m5908b(viewGroup).mo5302b(bitmapDrawable);
                PathMotion u = mo5417u();
                int[] iArr = this.f4972U;
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, new PropertyValuesHolder[]{PropertyValuesHolderUtils.m5969a(f4965N, u.mo5361a((float) (intValue - iArr[0]), (float) (intValue2 - iArr[1]), (float) (intValue3 - iArr[0]), (float) (intValue4 - iArr[1])))});
                C0698a aVar = new C0698a(viewGroup, bitmapDrawable, view2, c);
                ofPropertyValuesHolder.addListener(aVar);
                return ofPropertyValuesHolder;
            }
        }
        return null;
    }
}
