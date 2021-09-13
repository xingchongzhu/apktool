package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0229c;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0232f;
import com.google.android.material.internal.C2053k;
import com.google.android.material.internal.C2053k.C2056c;
import com.google.android.material.internal.C2053k.C2057d;
import com.p259uc.crashsdk.export.LogType;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p010b.p034g.p038f.MathUtils;
import p010b.p034g.p043k.ViewCompat;
import p010b.p034g.p043k.WindowInsetsCompat;
import p010b.p034g.p043k.p044f0.AccessibilityNodeInfoCompat.C0634a;
import p010b.p034g.p043k.p044f0.AccessibilityViewCommand;
import p010b.p034g.p043k.p044f0.AccessibilityViewCommand.C0640a;
import p010b.p048i.p049a.AbsSavedState;
import p010b.p048i.p050b.ViewDragHelper;
import p010b.p048i.p050b.ViewDragHelper.C0681c;
import p067c.p068a.p069a.p114b.C1270b;
import p067c.p068a.p069a.p114b.C1288d;
import p067c.p068a.p069a.p114b.C1295j;
import p067c.p068a.p069a.p114b.C1296k;
import p067c.p068a.p069a.p114b.C1297l;
import p067c.p068a.p069a.p114b.p117c0.MaterialShapeDrawable;
import p067c.p068a.p069a.p114b.p117c0.ShapeAppearanceModel;
import p067c.p068a.p069a.p114b.p133z.MaterialResources;

public class BottomSheetBehavior<V extends View> extends C0229c<V> {

    /* renamed from: a */
    private static final int f12597a = C1296k.Widget_Design_BottomSheet_Modal;

    /* renamed from: A */
    int f12598A = 4;

    /* renamed from: B */
    ViewDragHelper f12599B;

    /* renamed from: C */
    private boolean f12600C;

    /* renamed from: D */
    private int f12601D;

    /* renamed from: E */
    private boolean f12602E;

    /* renamed from: F */
    private int f12603F;

    /* renamed from: G */
    int f12604G;

    /* renamed from: H */
    int f12605H;

    /* renamed from: I */
    WeakReference<V> f12606I;

    /* renamed from: J */
    WeakReference<View> f12607J;

    /* renamed from: K */
    private final ArrayList<C1965f> f12608K = new ArrayList<>();

    /* renamed from: L */
    private VelocityTracker f12609L;

    /* renamed from: M */
    int f12610M;

    /* renamed from: N */
    private int f12611N;

    /* renamed from: O */
    boolean f12612O;

    /* renamed from: P */
    private Map<View, Integer> f12613P;

    /* renamed from: Q */
    private int f12614Q = -1;

    /* renamed from: R */
    private final C0681c f12615R = new C1963d();

    /* renamed from: b */
    private int f12616b = 0;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f12617c = true;

    /* renamed from: d */
    private boolean f12618d = false;

    /* renamed from: e */
    private float f12619e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f12620f;

    /* renamed from: g */
    private boolean f12621g;

    /* renamed from: h */
    private int f12622h;

    /* renamed from: i */
    private int f12623i;

    /* renamed from: j */
    private boolean f12624j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public MaterialShapeDrawable f12625k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f12626l;

    /* renamed from: m */
    private boolean f12627m;

    /* renamed from: n */
    private ShapeAppearanceModel f12628n;

    /* renamed from: o */
    private boolean f12629o;

    /* renamed from: p */
    private C1968h f12630p = null;

    /* renamed from: q */
    private ValueAnimator f12631q;

    /* renamed from: r */
    int f12632r;

    /* renamed from: s */
    int f12633s;

    /* renamed from: t */
    int f12634t;

    /* renamed from: u */
    float f12635u = 0.5f;

    /* renamed from: v */
    int f12636v;

    /* renamed from: w */
    float f12637w = -1.0f;

    /* renamed from: x */
    boolean f12638x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public boolean f12639y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public boolean f12640z = true;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    class C1960a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f12641a;

        /* renamed from: b */
        final /* synthetic */ int f12642b;

        C1960a(View view, int i) {
            this.f12641a = view;
            this.f12642b = i;
        }

        public void run() {
            BottomSheetBehavior.this.mo15152r0(this.f12641a, this.f12642b);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    class C1961b implements AnimatorUpdateListener {
        C1961b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f12625k != null) {
                BottomSheetBehavior.this.f12625k.mo7844Y(floatValue);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    class C1962c implements C2056c {
        C1962c() {
        }

        /* renamed from: a */
        public WindowInsetsCompat mo15157a(View view, WindowInsetsCompat e0Var, C2057d dVar) {
            BottomSheetBehavior.this.f12626l = e0Var.mo4989e().f4459e;
            BottomSheetBehavior.this.m15429y0(false);
            return e0Var;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    class C1963d extends C0681c {
        C1963d() {
        }

        /* renamed from: n */
        private boolean m15464n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f12605H + bottomSheetBehavior.mo15137X()) / 2;
        }

        /* renamed from: a */
        public int mo5241a(View view, int i, int i2) {
            return view.getLeft();
        }

        /* renamed from: b */
        public int mo5242b(View view, int i, int i2) {
            int X = BottomSheetBehavior.this.mo15137X();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return MathUtils.m5069b(i, X, bottomSheetBehavior.f12638x ? bottomSheetBehavior.f12605H : bottomSheetBehavior.f12636v);
        }

        /* renamed from: e */
        public int mo5245e(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.f12638x) {
                return bottomSheetBehavior.f12605H;
            }
            return bottomSheetBehavior.f12636v;
        }

        /* renamed from: j */
        public void mo5250j(int i) {
            if (i == 1 && BottomSheetBehavior.this.f12640z) {
                BottomSheetBehavior.this.mo15151p0(1);
            }
        }

        /* renamed from: k */
        public void mo5251k(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.mo15135U(i2);
        }

        /* renamed from: l */
        public void mo5252l(View view, float f, float f2) {
            int i;
            int i2;
            int i3 = 4;
            if (f2 >= 0.0f) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (!bottomSheetBehavior.f12638x || !bottomSheetBehavior.mo15153t0(view, f2)) {
                    if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                        int top = view.getTop();
                        if (!BottomSheetBehavior.this.f12617c) {
                            BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                            int i4 = bottomSheetBehavior2.f12634t;
                            if (top < i4) {
                                if (top < Math.abs(top - bottomSheetBehavior2.f12636v)) {
                                    i = BottomSheetBehavior.this.f12632r;
                                } else {
                                    i2 = BottomSheetBehavior.this.f12634t;
                                }
                            } else if (Math.abs(top - i4) < Math.abs(top - BottomSheetBehavior.this.f12636v)) {
                                i2 = BottomSheetBehavior.this.f12634t;
                            } else {
                                i = BottomSheetBehavior.this.f12636v;
                                BottomSheetBehavior.this.mo15154u0(view, i3, i, true);
                            }
                            i3 = 6;
                            BottomSheetBehavior.this.mo15154u0(view, i3, i, true);
                        } else if (Math.abs(top - BottomSheetBehavior.this.f12633s) < Math.abs(top - BottomSheetBehavior.this.f12636v)) {
                            i = BottomSheetBehavior.this.f12633s;
                        } else {
                            i = BottomSheetBehavior.this.f12636v;
                            BottomSheetBehavior.this.mo15154u0(view, i3, i, true);
                        }
                    } else {
                        if (BottomSheetBehavior.this.f12617c) {
                            i = BottomSheetBehavior.this.f12636v;
                        } else {
                            int top2 = view.getTop();
                            if (Math.abs(top2 - BottomSheetBehavior.this.f12634t) < Math.abs(top2 - BottomSheetBehavior.this.f12636v)) {
                                i2 = BottomSheetBehavior.this.f12634t;
                                i3 = 6;
                            } else {
                                i = BottomSheetBehavior.this.f12636v;
                            }
                        }
                        BottomSheetBehavior.this.mo15154u0(view, i3, i, true);
                    }
                } else if ((Math.abs(f) < Math.abs(f2) && f2 > 500.0f) || m15464n(view)) {
                    i = BottomSheetBehavior.this.f12605H;
                    i3 = 5;
                    BottomSheetBehavior.this.mo15154u0(view, i3, i, true);
                } else if (BottomSheetBehavior.this.f12617c) {
                    i = BottomSheetBehavior.this.f12633s;
                } else if (Math.abs(view.getTop() - BottomSheetBehavior.this.f12632r) < Math.abs(view.getTop() - BottomSheetBehavior.this.f12634t)) {
                    i = BottomSheetBehavior.this.f12632r;
                } else {
                    i2 = BottomSheetBehavior.this.f12634t;
                    i3 = 6;
                    BottomSheetBehavior.this.mo15154u0(view, i3, i, true);
                }
            } else if (BottomSheetBehavior.this.f12617c) {
                i = BottomSheetBehavior.this.f12633s;
            } else {
                int top3 = view.getTop();
                BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                int i5 = bottomSheetBehavior3.f12634t;
                if (top3 > i5) {
                    i2 = i5;
                    i3 = 6;
                    BottomSheetBehavior.this.mo15154u0(view, i3, i, true);
                }
                i = bottomSheetBehavior3.f12632r;
            }
            i3 = 3;
            BottomSheetBehavior.this.mo15154u0(view, i3, i, true);
        }

        /* renamed from: m */
        public boolean mo5253m(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.f12598A;
            boolean z = true;
            if (i2 == 1 || bottomSheetBehavior.f12612O) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.f12610M == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.f12607J;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.f12606I;
            if (weakReference2 == null || weakReference2.get() != view) {
                z = false;
            }
            return z;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e */
    class C1964e implements AccessibilityViewCommand {

        /* renamed from: a */
        final /* synthetic */ int f12647a;

        C1964e(int i) {
            this.f12647a = i;
        }

        /* renamed from: a */
        public boolean mo5114a(View view, C0640a aVar) {
            BottomSheetBehavior.this.mo15150o0(this.f12647a);
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f */
    public static abstract class C1965f {
        /* renamed from: a */
        public abstract void mo15158a(View view, float f);

        /* renamed from: b */
        public abstract void mo15159b(View view, int i);
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$g */
    protected static class C1966g extends AbsSavedState {
        public static final Creator<C1966g> CREATOR = new C1967a();

        /* renamed from: c */
        final int f12649c;

        /* renamed from: d */
        int f12650d;

        /* renamed from: e */
        boolean f12651e;

        /* renamed from: f */
        boolean f12652f;

        /* renamed from: g */
        boolean f12653g;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$g$a */
        static class C1967a implements ClassLoaderCreator<C1966g> {
            C1967a() {
            }

            /* renamed from: a */
            public C1966g createFromParcel(Parcel parcel) {
                return new C1966g(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C1966g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1966g(parcel, classLoader);
            }

            /* renamed from: c */
            public C1966g[] newArray(int i) {
                return new C1966g[i];
            }
        }

        public C1966g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f12649c = parcel.readInt();
            this.f12650d = parcel.readInt();
            boolean z = false;
            this.f12651e = parcel.readInt() == 1;
            this.f12652f = parcel.readInt() == 1;
            if (parcel.readInt() == 1) {
                z = true;
            }
            this.f12653g = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f12649c);
            parcel.writeInt(this.f12650d);
            parcel.writeInt(this.f12651e ? 1 : 0);
            parcel.writeInt(this.f12652f ? 1 : 0);
            parcel.writeInt(this.f12653g ? 1 : 0);
        }

        public C1966g(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f12649c = bottomSheetBehavior.f12598A;
            this.f12650d = bottomSheetBehavior.f12620f;
            this.f12651e = bottomSheetBehavior.f12617c;
            this.f12652f = bottomSheetBehavior.f12638x;
            this.f12653g = bottomSheetBehavior.f12639y;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$h */
    private class C1968h implements Runnable {

        /* renamed from: a */
        private final View f12654a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f12655b;

        /* renamed from: c */
        int f12656c;

        C1968h(View view, int i) {
            this.f12654a = view;
            this.f12656c = i;
        }

        public void run() {
            ViewDragHelper cVar = BottomSheetBehavior.this.f12599B;
            if (cVar == null || !cVar.mo5232k(true)) {
                BottomSheetBehavior.this.mo15151p0(this.f12656c);
            } else {
                ViewCompat.m5557g0(this.f12654a, this);
            }
            this.f12655b = false;
        }
    }

    public BottomSheetBehavior() {
    }

    /* renamed from: L */
    private int m15411L(V v, int i, int i2) {
        return ViewCompat.m5546b(v, v.getResources().getString(i), m15415Q(i2));
    }

    /* renamed from: N */
    private void m15412N() {
        int P = m15414P();
        if (this.f12617c) {
            this.f12636v = Math.max(this.f12605H - P, this.f12633s);
        } else {
            this.f12636v = this.f12605H - P;
        }
    }

    /* renamed from: O */
    private void m15413O() {
        this.f12634t = (int) (((float) this.f12605H) * (1.0f - this.f12635u));
    }

    /* renamed from: P */
    private int m15414P() {
        if (this.f12621g) {
            return Math.min(Math.max(this.f12622h, this.f12605H - ((this.f12604G * 9) / 16)), this.f12603F);
        }
        if (!this.f12627m) {
            int i = this.f12626l;
            if (i > 0) {
                return Math.max(this.f12620f, i + this.f12623i);
            }
        }
        return this.f12620f;
    }

    /* renamed from: Q */
    private AccessibilityViewCommand m15415Q(int i) {
        return new C1964e(i);
    }

    /* renamed from: R */
    private void m15416R(Context context, AttributeSet attributeSet, boolean z) {
        m15417S(context, attributeSet, z, null);
    }

    /* renamed from: S */
    private void m15417S(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.f12624j) {
            this.f12628n = ShapeAppearanceModel.m11345e(context, attributeSet, C1270b.bottomSheetStyle, f12597a).mo7905m();
            MaterialShapeDrawable gVar = new MaterialShapeDrawable(this.f12628n);
            this.f12625k = gVar;
            gVar.mo7836M(context);
            if (!z || colorStateList == null) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f12625k.setTint(typedValue.data);
                return;
            }
            this.f12625k.mo7843X(colorStateList);
        }
    }

    /* renamed from: T */
    private void m15418T() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f12631q = ofFloat;
        ofFloat.setDuration(500);
        this.f12631q.addUpdateListener(new C1961b());
    }

    /* renamed from: W */
    public static <V extends View> BottomSheetBehavior<V> m15419W(V v) {
        LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof C0232f) {
            C0229c f = ((C0232f) layoutParams).mo2093f();
            if (f instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) f;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* renamed from: Z */
    private float m15420Z() {
        VelocityTracker velocityTracker = this.f12609L;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f12619e);
        return this.f12609L.getYVelocity(this.f12610M);
    }

    /* renamed from: b0 */
    private void m15421b0(V v, C0634a aVar, int i) {
        ViewCompat.m5565k0(v, aVar, null, m15415Q(i));
    }

    /* renamed from: c0 */
    private void m15422c0() {
        this.f12610M = -1;
        VelocityTracker velocityTracker = this.f12609L;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f12609L = null;
        }
    }

    /* renamed from: d0 */
    private void m15423d0(C1966g gVar) {
        int i = this.f12616b;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f12620f = gVar.f12650d;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f12617c = gVar.f12651e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f12638x = gVar.f12652f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f12639y = gVar.f12653g;
            }
        }
    }

    /* renamed from: q0 */
    private void m15424q0(View view) {
        if (VERSION.SDK_INT >= 29 && !mo15139a0() && !this.f12621g) {
            C2053k.m16230a(view, new C1962c());
        }
    }

    /* renamed from: s0 */
    private void m15425s0(int i) {
        View view = (View) this.f12606I.get();
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null || !parent.isLayoutRequested() || !ViewCompat.m5536S(view)) {
                mo15152r0(view, i);
            } else {
                view.post(new C1960a(view, i));
            }
        }
    }

    /* renamed from: v0 */
    private void m15426v0() {
        WeakReference<V> weakReference = this.f12606I;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                ViewCompat.m5561i0(view, 524288);
                ViewCompat.m5561i0(view, 262144);
                ViewCompat.m5561i0(view, LogType.ANR);
                int i = this.f12614Q;
                if (i != -1) {
                    ViewCompat.m5561i0(view, i);
                }
                int i2 = 6;
                if (this.f12598A != 6) {
                    this.f12614Q = m15411L(view, C1295j.bottomsheet_action_expand_halfway, 6);
                }
                if (this.f12638x && this.f12598A != 5) {
                    m15421b0(view, C0634a.f4700u, 5);
                }
                int i3 = this.f12598A;
                if (i3 == 3) {
                    if (this.f12617c) {
                        i2 = 4;
                    }
                    m15421b0(view, C0634a.f4699t, i2);
                } else if (i3 == 4) {
                    if (this.f12617c) {
                        i2 = 3;
                    }
                    m15421b0(view, C0634a.f4698s, i2);
                } else if (i3 == 6) {
                    m15421b0(view, C0634a.f4699t, 4);
                    m15421b0(view, C0634a.f4698s, 3);
                }
            }
        }
    }

    /* renamed from: w0 */
    private void m15427w0(int i) {
        if (i != 2) {
            boolean z = i == 3;
            if (this.f12629o != z) {
                this.f12629o = z;
                if (this.f12625k != null) {
                    ValueAnimator valueAnimator = this.f12631q;
                    if (valueAnimator != null) {
                        if (valueAnimator.isRunning()) {
                            this.f12631q.reverse();
                        } else {
                            float f = z ? 0.0f : 1.0f;
                            this.f12631q.setFloatValues(new float[]{1.0f - f, f});
                            this.f12631q.start();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: x0 */
    private void m15428x0(boolean z) {
        WeakReference<V> weakReference = this.f12606I;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (VERSION.SDK_INT >= 16 && z) {
                    if (this.f12613P == null) {
                        this.f12613P = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.f12606I.get()) {
                        if (z) {
                            if (VERSION.SDK_INT >= 16) {
                                this.f12613P.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            }
                            if (this.f12618d) {
                                ViewCompat.m5591x0(childAt, 4);
                            }
                        } else if (this.f12618d) {
                            Map<View, Integer> map = this.f12613P;
                            if (map != null && map.containsKey(childAt)) {
                                ViewCompat.m5591x0(childAt, ((Integer) this.f12613P.get(childAt)).intValue());
                            }
                        }
                    }
                }
                if (!z) {
                    this.f12613P = null;
                } else if (this.f12618d) {
                    ((View) this.f12606I.get()).sendAccessibilityEvent(8);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y0 */
    public void m15429y0(boolean z) {
        if (this.f12606I != null) {
            m15412N();
            if (this.f12598A == 4) {
                View view = (View) this.f12606I.get();
                if (view == null) {
                    return;
                }
                if (z) {
                    m15425s0(this.f12598A);
                } else {
                    view.requestLayout();
                }
            }
        }
    }

    /* renamed from: A */
    public boolean mo2055A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.f12601D = 0;
        this.f12602E = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public void mo2057C(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        int i2;
        int i3;
        int i4 = 3;
        if (v.getTop() == mo15137X()) {
            mo15151p0(3);
            return;
        }
        WeakReference<View> weakReference = this.f12607J;
        if (weakReference != null && view == weakReference.get() && this.f12602E) {
            if (this.f12601D > 0) {
                if (this.f12617c) {
                    i2 = this.f12633s;
                } else {
                    int top = v.getTop();
                    int i5 = this.f12634t;
                    if (top > i5) {
                        i2 = i5;
                    } else {
                        i2 = this.f12632r;
                    }
                }
                mo15154u0(v, i4, i2, false);
                this.f12602E = false;
            } else if (!this.f12638x || !mo15153t0(v, m15420Z())) {
                if (this.f12601D == 0) {
                    int top2 = v.getTop();
                    if (!this.f12617c) {
                        int i6 = this.f12634t;
                        if (top2 < i6) {
                            if (top2 < Math.abs(top2 - this.f12636v)) {
                                i2 = this.f12632r;
                                mo15154u0(v, i4, i2, false);
                                this.f12602E = false;
                            } else {
                                i2 = this.f12634t;
                            }
                        } else if (Math.abs(top2 - i6) < Math.abs(top2 - this.f12636v)) {
                            i2 = this.f12634t;
                        } else {
                            i3 = this.f12636v;
                        }
                    } else if (Math.abs(top2 - this.f12633s) < Math.abs(top2 - this.f12636v)) {
                        i2 = this.f12633s;
                        mo15154u0(v, i4, i2, false);
                        this.f12602E = false;
                    } else {
                        i3 = this.f12636v;
                    }
                } else if (this.f12617c) {
                    i3 = this.f12636v;
                } else {
                    int top3 = v.getTop();
                    if (Math.abs(top3 - this.f12634t) < Math.abs(top3 - this.f12636v)) {
                        i2 = this.f12634t;
                    } else {
                        i3 = this.f12636v;
                    }
                }
                i4 = 4;
                mo15154u0(v, i4, i2, false);
                this.f12602E = false;
            } else {
                i2 = this.f12605H;
                i4 = 5;
                mo15154u0(v, i4, i2, false);
                this.f12602E = false;
            }
            i4 = 6;
            mo15154u0(v, i4, i2, false);
            this.f12602E = false;
        }
    }

    /* renamed from: D */
    public boolean mo2058D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f12598A == 1 && actionMasked == 0) {
            return true;
        }
        ViewDragHelper cVar = this.f12599B;
        if (cVar != null) {
            cVar.mo5238z(motionEvent);
        }
        if (actionMasked == 0) {
            m15422c0();
        }
        if (this.f12609L == null) {
            this.f12609L = VelocityTracker.obtain();
        }
        this.f12609L.addMovement(motionEvent);
        if (this.f12599B != null && actionMasked == 2 && !this.f12600C && Math.abs(((float) this.f12611N) - motionEvent.getY()) > ((float) this.f12599B.mo5234u())) {
            this.f12599B.mo5231b(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f12600C;
    }

    /* renamed from: M */
    public void mo15134M(C1965f fVar) {
        if (!this.f12608K.contains(fVar)) {
            this.f12608K.add(fVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: U */
    public void mo15135U(int i) {
        float f;
        float f2;
        View view = (View) this.f12606I.get();
        if (view != null && !this.f12608K.isEmpty()) {
            int i2 = this.f12636v;
            if (i > i2 || i2 == mo15137X()) {
                int i3 = this.f12636v;
                f = (float) (i3 - i);
                f2 = (float) (this.f12605H - i3);
            } else {
                int i4 = this.f12636v;
                f = (float) (i4 - i);
                f2 = (float) (i4 - mo15137X());
            }
            float f3 = f / f2;
            for (int i5 = 0; i5 < this.f12608K.size(); i5++) {
                ((C1965f) this.f12608K.get(i5)).mo15158a(view, f3);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: V */
    public View mo15136V(View view) {
        if (ViewCompat.m5538U(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View V = mo15136V(viewGroup.getChildAt(i));
                if (V != null) {
                    return V;
                }
            }
        }
        return null;
    }

    /* renamed from: X */
    public int mo15137X() {
        return this.f12617c ? this.f12633s : this.f12632r;
    }

    /* renamed from: Y */
    public int mo15138Y() {
        return this.f12598A;
    }

    /* renamed from: a0 */
    public boolean mo15139a0() {
        return this.f12627m;
    }

    /* renamed from: e0 */
    public void mo15140e0(boolean z) {
        this.f12640z = z;
    }

    /* renamed from: f0 */
    public void mo15141f0(int i) {
        if (i >= 0) {
            this.f12632r = i;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    /* renamed from: g */
    public void mo2065g(C0232f fVar) {
        super.mo2065g(fVar);
        this.f12606I = null;
        this.f12599B = null;
    }

    /* renamed from: g0 */
    public void mo15142g0(boolean z) {
        if (this.f12617c != z) {
            this.f12617c = z;
            if (this.f12606I != null) {
                m15412N();
            }
            mo15151p0((!this.f12617c || this.f12598A != 6) ? this.f12598A : 3);
            m15426v0();
        }
    }

    /* renamed from: h0 */
    public void mo15143h0(boolean z) {
        this.f12627m = z;
    }

    /* renamed from: i0 */
    public void mo15144i0(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f12635u = f;
        if (this.f12606I != null) {
            m15413O();
        }
    }

    /* renamed from: j */
    public void mo2068j() {
        super.mo2068j();
        this.f12606I = null;
        this.f12599B = null;
    }

    /* renamed from: j0 */
    public void mo15145j0(boolean z) {
        if (this.f12638x != z) {
            this.f12638x = z;
            if (!z && this.f12598A == 5) {
                mo15150o0(4);
            }
            m15426v0();
        }
    }

    /* renamed from: k */
    public boolean mo2069k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = false;
        if (!v.isShown() || !this.f12640z) {
            this.f12600C = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m15422c0();
        }
        if (this.f12609L == null) {
            this.f12609L = VelocityTracker.obtain();
        }
        this.f12609L.addMovement(motionEvent);
        View view = null;
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f12611N = (int) motionEvent.getY();
            if (this.f12598A != 2) {
                WeakReference<View> weakReference = this.f12607J;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.mo2003B(view2, x, this.f12611N)) {
                    this.f12610M = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f12612O = true;
                }
            }
            this.f12600C = this.f12610M == -1 && !coordinatorLayout.mo2003B(v, x, this.f12611N);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f12612O = false;
            this.f12610M = -1;
            if (this.f12600C) {
                this.f12600C = false;
                return false;
            }
        }
        if (!this.f12600C) {
            ViewDragHelper cVar = this.f12599B;
            if (cVar != null && cVar.mo5227G(motionEvent)) {
                return true;
            }
        }
        WeakReference<View> weakReference2 = this.f12607J;
        if (weakReference2 != null) {
            view = (View) weakReference2.get();
        }
        if (actionMasked == 2 && view != null && !this.f12600C && this.f12598A != 1 && !coordinatorLayout.mo2003B(view, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.f12599B != null && Math.abs(((float) this.f12611N) - motionEvent.getY()) > ((float) this.f12599B.mo5234u())) {
            z = true;
        }
        return z;
    }

    /* renamed from: k0 */
    public void mo15146k0(int i) {
        mo15147l0(i, false);
    }

    /* renamed from: l */
    public boolean mo2070l(CoordinatorLayout coordinatorLayout, V v, int i) {
        if (ViewCompat.m5594z(coordinatorLayout) && !ViewCompat.m5594z(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.f12606I == null) {
            this.f12622h = coordinatorLayout.getResources().getDimensionPixelSize(C1288d.design_bottom_sheet_peek_height_min);
            m15424q0(v);
            this.f12606I = new WeakReference<>(v);
            if (this.f12624j) {
                MaterialShapeDrawable gVar = this.f12625k;
                if (gVar != null) {
                    ViewCompat.m5579r0(v, gVar);
                }
            }
            MaterialShapeDrawable gVar2 = this.f12625k;
            if (gVar2 != null) {
                float f = this.f12637w;
                if (f == -1.0f) {
                    f = ViewCompat.m5588w(v);
                }
                gVar2.mo7842W(f);
                boolean z = this.f12598A == 3;
                this.f12629o = z;
                this.f12625k.mo7844Y(z ? 0.0f : 1.0f);
            }
            m15426v0();
            if (ViewCompat.m5510A(v) == 0) {
                ViewCompat.m5591x0(v, 1);
            }
        }
        if (this.f12599B == null) {
            this.f12599B = ViewDragHelper.m5756m(coordinatorLayout, this.f12615R);
        }
        int top = v.getTop();
        coordinatorLayout.mo2006I(v, i);
        this.f12604G = coordinatorLayout.getWidth();
        this.f12605H = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.f12603F = height;
        this.f12633s = Math.max(0, this.f12605H - height);
        m15413O();
        m15412N();
        int i2 = this.f12598A;
        if (i2 == 3) {
            ViewCompat.m5543Z(v, mo15137X());
        } else if (i2 == 6) {
            ViewCompat.m5543Z(v, this.f12634t);
        } else if (this.f12638x && i2 == 5) {
            ViewCompat.m5543Z(v, this.f12605H);
        } else if (i2 == 4) {
            ViewCompat.m5543Z(v, this.f12636v);
        } else if (i2 == 1 || i2 == 2) {
            ViewCompat.m5543Z(v, top - v.getTop());
        }
        this.f12607J = new WeakReference<>(mo15136V(v));
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* renamed from: l0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15147l0(int r4, boolean r5) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f12621g
            if (r4 != 0) goto L_0x0015
            r3.f12621g = r0
            goto L_0x001f
        L_0x000c:
            boolean r2 = r3.f12621g
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f12620f
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x001f
        L_0x0017:
            r3.f12621g = r1
            int r4 = java.lang.Math.max(r1, r4)
            r3.f12620f = r4
        L_0x001f:
            if (r0 == 0) goto L_0x0024
            r3.m15429y0(r5)
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo15147l0(int, boolean):void");
    }

    /* renamed from: m0 */
    public void mo15148m0(int i) {
        this.f12616b = i;
    }

    /* renamed from: n0 */
    public void mo15149n0(boolean z) {
        this.f12639y = z;
    }

    /* renamed from: o */
    public boolean mo2073o(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        WeakReference<View> weakReference = this.f12607J;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        if (this.f12598A != 3 || super.mo2073o(coordinatorLayout, v, view, f, f2)) {
            return true;
        }
        return false;
    }

    /* renamed from: o0 */
    public void mo15150o0(int i) {
        if (i != this.f12598A) {
            if (this.f12606I == null) {
                if (i == 4 || i == 3 || i == 6 || (this.f12638x && i == 5)) {
                    this.f12598A = i;
                }
                return;
            }
            m15425s0(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p0 */
    public void mo15151p0(int i) {
        if (this.f12598A != i) {
            this.f12598A = i;
            WeakReference<V> weakReference = this.f12606I;
            if (weakReference != null) {
                View view = (View) weakReference.get();
                if (view != null) {
                    if (i == 3) {
                        m15428x0(true);
                    } else if (i == 6 || i == 5 || i == 4) {
                        m15428x0(false);
                    }
                    m15427w0(i);
                    for (int i2 = 0; i2 < this.f12608K.size(); i2++) {
                        ((C1965f) this.f12608K.get(i2)).mo15159b(view, i);
                    }
                    m15426v0();
                }
            }
        }
    }

    /* renamed from: q */
    public void mo2075q(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        if (i3 != 1) {
            WeakReference<View> weakReference = this.f12607J;
            if (view == (weakReference != null ? (View) weakReference.get() : null)) {
                int top = v.getTop();
                int i4 = top - i2;
                if (i2 > 0) {
                    if (i4 < mo15137X()) {
                        iArr[1] = top - mo15137X();
                        ViewCompat.m5543Z(v, -iArr[1]);
                        mo15151p0(3);
                    } else if (this.f12640z) {
                        iArr[1] = i2;
                        ViewCompat.m5543Z(v, -i2);
                        mo15151p0(1);
                    } else {
                        return;
                    }
                } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                    int i5 = this.f12636v;
                    if (i4 > i5 && !this.f12638x) {
                        iArr[1] = top - i5;
                        ViewCompat.m5543Z(v, -iArr[1]);
                        mo15151p0(4);
                    } else if (this.f12640z) {
                        iArr[1] = i2;
                        ViewCompat.m5543Z(v, -i2);
                        mo15151p0(1);
                    } else {
                        return;
                    }
                }
                mo15135U(v.getTop());
                this.f12601D = i2;
                this.f12602E = true;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r0 */
    public void mo15152r0(View view, int i) {
        int i2;
        if (i == 4) {
            i2 = this.f12636v;
        } else if (i == 6) {
            int i3 = this.f12634t;
            if (this.f12617c) {
                int i4 = this.f12633s;
                if (i3 <= i4) {
                    i2 = i4;
                    i = 3;
                }
            }
            i2 = i3;
        } else if (i == 3) {
            i2 = mo15137X();
        } else if (!this.f12638x || i != 5) {
            StringBuilder sb = new StringBuilder();
            sb.append("Illegal state argument: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else {
            i2 = this.f12605H;
        }
        mo15154u0(view, i, i2, false);
    }

    /* renamed from: t */
    public void mo2078t(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t0 */
    public boolean mo15153t0(View view, float f) {
        boolean z = true;
        if (this.f12639y) {
            return true;
        }
        if (view.getTop() < this.f12636v) {
            return false;
        }
        if (Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f12636v)) / ((float) m15414P()) <= 0.5f) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u0 */
    public void mo15154u0(View view, int i, int i2, boolean z) {
        ViewDragHelper cVar = this.f12599B;
        if (cVar != null && (!z ? cVar.mo5228H(view, view.getLeft(), i2) : cVar.mo5226F(view.getLeft(), i2))) {
            mo15151p0(2);
            m15427w0(i);
            if (this.f12630p == null) {
                this.f12630p = new C1968h<>(view, i);
            }
            if (!this.f12630p.f12655b) {
                C1968h hVar = this.f12630p;
                hVar.f12656c = i;
                ViewCompat.m5557g0(view, hVar);
                this.f12630p.f12655b = true;
                return;
            }
            this.f12630p.f12656c = i;
            return;
        }
        mo15151p0(i);
    }

    /* renamed from: x */
    public void mo2082x(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        C1966g gVar = (C1966g) parcelable;
        super.mo2082x(coordinatorLayout, v, gVar.mo5193l());
        m15423d0(gVar);
        int i = gVar.f12649c;
        if (i == 1 || i == 2) {
            this.f12598A = 4;
        } else {
            this.f12598A = i;
        }
    }

    /* renamed from: y */
    public Parcelable mo2083y(CoordinatorLayout coordinatorLayout, V v) {
        return new C1966g(super.mo2083y(coordinatorLayout, v), this);
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        TypedValue peekValue;
        super(context, attributeSet);
        this.f12623i = context.getResources().getDimensionPixelSize(C1288d.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1297l.f9254F);
        this.f12624j = obtainStyledAttributes.hasValue(C1297l.f9340R);
        int i = C1297l.f9270H;
        boolean hasValue = obtainStyledAttributes.hasValue(i);
        if (hasValue) {
            m15417S(context, attributeSet, hasValue, MaterialResources.m11600a(context, obtainStyledAttributes, i));
        } else {
            m15416R(context, attributeSet, hasValue);
        }
        m15418T();
        if (VERSION.SDK_INT >= 21) {
            this.f12637w = obtainStyledAttributes.getDimension(C1297l.f9262G, -1.0f);
        }
        int i2 = C1297l.f9312N;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(i2);
        if (peekValue2 != null) {
            int i3 = peekValue2.data;
            if (i3 == -1) {
                mo15146k0(i3);
                mo15145j0(obtainStyledAttributes.getBoolean(C1297l.f9305M, false));
                mo15143h0(obtainStyledAttributes.getBoolean(C1297l.f9333Q, false));
                mo15142g0(obtainStyledAttributes.getBoolean(C1297l.f9291K, true));
                mo15149n0(obtainStyledAttributes.getBoolean(C1297l.f9326P, false));
                mo15140e0(obtainStyledAttributes.getBoolean(C1297l.f9277I, true));
                mo15148m0(obtainStyledAttributes.getInt(C1297l.f9319O, 0));
                mo15144i0(obtainStyledAttributes.getFloat(C1297l.f9298L, 0.5f));
                int i4 = C1297l.f9284J;
                peekValue = obtainStyledAttributes.peekValue(i4);
                if (peekValue == null && peekValue.type == 16) {
                    mo15141f0(peekValue.data);
                } else {
                    mo15141f0(obtainStyledAttributes.getDimensionPixelOffset(i4, 0));
                }
                obtainStyledAttributes.recycle();
                this.f12619e = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            }
        }
        mo15146k0(obtainStyledAttributes.getDimensionPixelSize(i2, -1));
        mo15145j0(obtainStyledAttributes.getBoolean(C1297l.f9305M, false));
        mo15143h0(obtainStyledAttributes.getBoolean(C1297l.f9333Q, false));
        mo15142g0(obtainStyledAttributes.getBoolean(C1297l.f9291K, true));
        mo15149n0(obtainStyledAttributes.getBoolean(C1297l.f9326P, false));
        mo15140e0(obtainStyledAttributes.getBoolean(C1297l.f9277I, true));
        mo15148m0(obtainStyledAttributes.getInt(C1297l.f9319O, 0));
        mo15144i0(obtainStyledAttributes.getFloat(C1297l.f9298L, 0.5f));
        int i42 = C1297l.f9284J;
        peekValue = obtainStyledAttributes.peekValue(i42);
        if (peekValue == null) {
        }
        mo15141f0(obtainStyledAttributes.getDimensionPixelOffset(i42, 0));
        obtainStyledAttributes.recycle();
        this.f12619e = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
