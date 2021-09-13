package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0228b;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0229c;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0232f;
import androidx.core.graphics.drawable.DrawableCompat;
import java.lang.ref.WeakReference;
import java.util.List;
import p010b.p011a.p012k.p013a.AppCompatResources;
import p010b.p034g.p038f.MathUtils;
import p010b.p034g.p043k.NestedScrollingChild;
import p010b.p034g.p043k.ViewCompat;
import p010b.p034g.p043k.WindowInsetsCompat;
import p010b.p034g.p043k.p044f0.AccessibilityNodeInfoCompat.C0634a;
import p010b.p034g.p043k.p044f0.AccessibilityViewCommand;
import p010b.p034g.p043k.p044f0.AccessibilityViewCommand.C0640a;
import p010b.p048i.p049a.AbsSavedState;
import p067c.p068a.p069a.p114b.C1270b;
import p067c.p068a.p069a.p114b.C1288d;
import p067c.p068a.p069a.p114b.C1292g;
import p067c.p068a.p069a.p114b.C1296k;
import p067c.p068a.p069a.p114b.C1297l;
import p067c.p068a.p069a.p114b.p117c0.MaterialShapeDrawable;
import p067c.p068a.p069a.p114b.p117c0.MaterialShapeUtils;
import p067c.p068a.p069a.p114b.p119m.AnimationUtils;

public class AppBarLayout extends LinearLayout implements C0228b {

    /* renamed from: a */
    private static final int f12458a = C1296k.Widget_Design_AppBarLayout;

    /* renamed from: b */
    private int f12459b;

    /* renamed from: c */
    private int f12460c;

    /* renamed from: d */
    private int f12461d;

    /* renamed from: e */
    private int f12462e;

    /* renamed from: f */
    private boolean f12463f;

    /* renamed from: g */
    private int f12464g;

    /* renamed from: h */
    private WindowInsetsCompat f12465h;

    /* renamed from: i */
    private List<C1941b> f12466i;

    /* renamed from: j */
    private boolean f12467j;

    /* renamed from: k */
    private boolean f12468k;

    /* renamed from: l */
    private boolean f12469l;

    /* renamed from: m */
    private boolean f12470m;

    /* renamed from: n */
    private int f12471n;

    /* renamed from: o */
    private WeakReference<View> f12472o;

    /* renamed from: p */
    private ValueAnimator f12473p;

    /* renamed from: q */
    private int[] f12474q;

    /* renamed from: r */
    private Drawable f12475r;

    protected static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {
        /* access modifiers changed from: private */

        /* renamed from: k */
        public int f12476k;

        /* renamed from: l */
        private int f12477l;

        /* renamed from: m */
        private ValueAnimator f12478m;

        /* renamed from: n */
        private int f12479n = -1;

        /* renamed from: o */
        private boolean f12480o;

        /* renamed from: p */
        private float f12481p;

        /* renamed from: q */
        private WeakReference<View> f12482q;

        /* renamed from: r */
        private C1937d f12483r;

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        class C1934a implements AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ CoordinatorLayout f12484a;

            /* renamed from: b */
            final /* synthetic */ AppBarLayout f12485b;

            C1934a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f12484a = coordinatorLayout;
                this.f12485b = appBarLayout;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.mo15059P(this.f12484a, this.f12485b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$b */
        class C1935b implements AccessibilityViewCommand {

            /* renamed from: a */
            final /* synthetic */ CoordinatorLayout f12487a;

            /* renamed from: b */
            final /* synthetic */ AppBarLayout f12488b;

            /* renamed from: c */
            final /* synthetic */ View f12489c;

            /* renamed from: d */
            final /* synthetic */ int f12490d;

            C1935b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
                this.f12487a = coordinatorLayout;
                this.f12488b = appBarLayout;
                this.f12489c = view;
                this.f12490d = i;
            }

            /* renamed from: a */
            public boolean mo5114a(View view, C0640a aVar) {
                BaseBehavior.this.mo2075q(this.f12487a, this.f12488b, this.f12489c, 0, this.f12490d, new int[]{0, 0}, 1);
                return true;
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$c */
        class C1936c implements AccessibilityViewCommand {

            /* renamed from: a */
            final /* synthetic */ AppBarLayout f12492a;

            /* renamed from: b */
            final /* synthetic */ boolean f12493b;

            C1936c(AppBarLayout appBarLayout, boolean z) {
                this.f12492a = appBarLayout;
                this.f12493b = z;
            }

            /* renamed from: a */
            public boolean mo5114a(View view, C0640a aVar) {
                this.f12492a.setExpanded(this.f12493b);
                return true;
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$d */
        public static abstract class C1937d<T extends AppBarLayout> {
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$e */
        protected static class C1938e extends AbsSavedState {
            public static final Creator<C1938e> CREATOR = new C1939a();

            /* renamed from: c */
            int f12495c;

            /* renamed from: d */
            float f12496d;

            /* renamed from: e */
            boolean f12497e;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$e$a */
            static class C1939a implements ClassLoaderCreator<C1938e> {
                C1939a() {
                }

                /* renamed from: a */
                public C1938e createFromParcel(Parcel parcel) {
                    return new C1938e(parcel, null);
                }

                /* renamed from: b */
                public C1938e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new C1938e(parcel, classLoader);
                }

                /* renamed from: c */
                public C1938e[] newArray(int i) {
                    return new C1938e[i];
                }
            }

            public C1938e(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f12495c = parcel.readInt();
                this.f12496d = parcel.readFloat();
                this.f12497e = parcel.readByte() != 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.f12495c);
                parcel.writeFloat(this.f12496d);
                parcel.writeByte(this.f12497e ? (byte) 1 : 0);
            }

            public C1938e(Parcelable parcelable) {
                super(parcelable);
            }
        }

        public BaseBehavior() {
        }

        /* renamed from: S */
        private void m15202S(CoordinatorLayout coordinatorLayout, T t, View view) {
            if (mo15020M() != (-t.getTotalScrollRange()) && view.canScrollVertically(1)) {
                m15203T(coordinatorLayout, t, C0634a.f4692m, false);
            }
            if (mo15020M() == 0) {
                return;
            }
            if (view.canScrollVertically(-1)) {
                int i = -t.getDownNestedPreScrollRange();
                if (i != 0) {
                    C0634a aVar = C0634a.f4693n;
                    C1935b bVar = new C1935b(coordinatorLayout, t, view, i);
                    ViewCompat.m5565k0(coordinatorLayout, aVar, null, bVar);
                    return;
                }
                return;
            }
            m15203T(coordinatorLayout, t, C0634a.f4693n, true);
        }

        /* renamed from: T */
        private void m15203T(CoordinatorLayout coordinatorLayout, T t, C0634a aVar, boolean z) {
            ViewCompat.m5565k0(coordinatorLayout, aVar, null, new C1936c(t, z));
        }

        /* renamed from: U */
        private void m15204U(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int i2;
            int abs = Math.abs(mo15020M() - i);
            float abs2 = Math.abs(f);
            if (abs2 > 0.0f) {
                i2 = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                i2 = (int) (((((float) abs) / ((float) t.getHeight())) + 1.0f) * 150.0f);
            }
            m15205V(coordinatorLayout, t, i, i2);
        }

        /* renamed from: V */
        private void m15205V(CoordinatorLayout coordinatorLayout, T t, int i, int i2) {
            int M = mo15020M();
            if (M == i) {
                ValueAnimator valueAnimator = this.f12478m;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f12478m.cancel();
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f12478m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f12478m = valueAnimator3;
                valueAnimator3.setInterpolator(AnimationUtils.f9615e);
                this.f12478m.addUpdateListener(new C1934a(coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.f12478m.setDuration((long) Math.min(i2, 600));
            this.f12478m.setIntValues(new int[]{M, i});
            this.f12478m.start();
        }

        /* renamed from: X */
        private boolean m15206X(CoordinatorLayout coordinatorLayout, T t, View view) {
            return t.mo14994h() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }

        /* renamed from: Y */
        private static boolean m15207Y(int i, int i2) {
            return (i & i2) == i2;
        }

        /* renamed from: Z */
        private View m15208Z(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof NestedScrollingChild) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: a0 */
        private static View m15209a0(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: b0 */
        private int m15210b0(T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C1942c cVar = (C1942c) childAt.getLayoutParams();
                if (m15207Y(cVar.mo15051a(), 32)) {
                    top -= cVar.topMargin;
                    bottom += cVar.bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        /* renamed from: e0 */
        private int m15211e0(T t, int i) {
            int abs = Math.abs(i);
            int childCount = t.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i3);
                C1942c cVar = (C1942c) childAt.getLayoutParams();
                Interpolator b = cVar.mo15052b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else if (b != null) {
                    int a = cVar.mo15051a();
                    if ((a & 1) != 0) {
                        i2 = 0 + childAt.getHeight() + cVar.topMargin + cVar.bottomMargin;
                        if ((a & 2) != 0) {
                            i2 -= ViewCompat.m5516D(childAt);
                        }
                    }
                    if (ViewCompat.m5594z(childAt)) {
                        i2 -= t.getTopInset();
                    }
                    if (i2 > 0) {
                        float f = (float) i2;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f * b.getInterpolation(((float) (abs - childAt.getTop())) / f)));
                    }
                }
            }
            return i;
        }

        /* renamed from: p0 */
        private boolean m15212p0(CoordinatorLayout coordinatorLayout, T t) {
            List s = coordinatorLayout.mo2042s(t);
            int size = s.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                C0229c f = ((C0232f) ((View) s.get(i)).getLayoutParams()).mo2093f();
                if (f instanceof ScrollingViewBehavior) {
                    if (((ScrollingViewBehavior) f).mo15063K() != 0) {
                        z = true;
                    }
                    return z;
                }
            }
            return false;
        }

        /* renamed from: q0 */
        private void m15213q0(CoordinatorLayout coordinatorLayout, T t) {
            int M = mo15020M();
            int b0 = m15210b0(t, M);
            if (b0 >= 0) {
                View childAt = t.getChildAt(b0);
                C1942c cVar = (C1942c) childAt.getLayoutParams();
                int a = cVar.mo15051a();
                if ((a & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (b0 == t.getChildCount() - 1) {
                        i2 += t.getTopInset();
                    }
                    if (m15207Y(a, 2)) {
                        i2 += ViewCompat.m5516D(childAt);
                    } else if (m15207Y(a, 5)) {
                        int D = ViewCompat.m5516D(childAt) + i2;
                        if (M < D) {
                            i = D;
                        } else {
                            i2 = D;
                        }
                    }
                    if (m15207Y(a, 32)) {
                        i += cVar.topMargin;
                        i2 -= cVar.bottomMargin;
                    }
                    if (M < (i2 + i) / 2) {
                        i = i2;
                    }
                    m15204U(coordinatorLayout, t, MathUtils.m5069b(i, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* renamed from: r0 */
        private void m15214r0(CoordinatorLayout coordinatorLayout, T t) {
            ViewCompat.m5561i0(coordinatorLayout, C0634a.f4692m.mo5098b());
            ViewCompat.m5561i0(coordinatorLayout, C0634a.f4693n.mo5098b());
            View Z = m15208Z(coordinatorLayout);
            if (Z != null && t.getTotalScrollRange() != 0 && (((C0232f) Z.getLayoutParams()).mo2093f() instanceof ScrollingViewBehavior)) {
                m15202S(coordinatorLayout, t, Z);
            }
        }

        /* renamed from: s0 */
        private void m15215s0(CoordinatorLayout coordinatorLayout, T t, int i, int i2, boolean z) {
            View a0 = m15209a0(t, i);
            if (a0 != null) {
                int a = ((C1942c) a0.getLayoutParams()).mo15051a();
                boolean z2 = false;
                if ((a & 1) != 0) {
                    int D = ViewCompat.m5516D(a0);
                    if (i2 <= 0 || (a & 12) == 0 ? !((a & 2) == 0 || (-i) < (a0.getBottom() - D) - t.getTopInset()) : (-i) >= (a0.getBottom() - D) - t.getTopInset()) {
                        z2 = true;
                    }
                }
                if (t.mo14995j()) {
                    z2 = t.mo15005r(m15208Z(coordinatorLayout));
                }
                boolean p = t.mo15004p(z2);
                if (z || (p && m15212p0(coordinatorLayout, t))) {
                    t.jumpDrawablesToCurrentState();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: M */
        public int mo15020M() {
            return mo15043E() + this.f12476k;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: W */
        public boolean mo15017H(T t) {
            if (this.f12483r == null) {
                WeakReference<View> weakReference = this.f12482q;
                if (weakReference == null) {
                    return true;
                }
                View view = (View) weakReference.get();
                if (view == null || !view.isShown() || view.canScrollVertically(-1)) {
                    return false;
                }
                return true;
            }
            throw null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c0 */
        public int mo15018K(T t) {
            return -t.getDownNestedScrollRange();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d0 */
        public int mo15019L(T t) {
            return t.getTotalScrollRange();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f0 */
        public void mo15021N(CoordinatorLayout coordinatorLayout, T t) {
            m15213q0(coordinatorLayout, t);
            if (t.mo14995j()) {
                t.mo15004p(t.mo15005r(m15208Z(coordinatorLayout)));
            }
        }

        /* renamed from: g0 */
        public boolean mo2070l(CoordinatorLayout coordinatorLayout, T t, int i) {
            int i2;
            boolean l = super.mo2070l(coordinatorLayout, t, i);
            int pendingAction = t.getPendingAction();
            int i3 = this.f12479n;
            if (i3 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t.getChildAt(i3);
                int i4 = -childAt.getBottom();
                if (this.f12480o) {
                    i2 = ViewCompat.m5516D(childAt) + t.getTopInset();
                } else {
                    i2 = Math.round(((float) childAt.getHeight()) * this.f12481p);
                }
                mo15059P(coordinatorLayout, t, i4 + i2);
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i5 = -t.getUpNestedPreScrollRange();
                    if (z) {
                        m15204U(coordinatorLayout, t, i5, 0.0f);
                    } else {
                        mo15059P(coordinatorLayout, t, i5);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        m15204U(coordinatorLayout, t, 0, 0.0f);
                    } else {
                        mo15059P(coordinatorLayout, t, 0);
                    }
                }
            }
            t.mo14997l();
            this.f12479n = -1;
            mo15044G(MathUtils.m5069b(mo15043E(), -t.getTotalScrollRange(), 0));
            m15215s0(coordinatorLayout, t, mo15043E(), 0, true);
            t.mo14996k(mo15043E());
            m15214r0(coordinatorLayout, t);
            return l;
        }

        /* renamed from: h0 */
        public boolean mo2071m(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((C0232f) t.getLayoutParams()).height != -2) {
                return super.mo2071m(coordinatorLayout, t, i, i2, i3, i4);
            }
            coordinatorLayout.mo2007J(t, i, i2, MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* renamed from: i0 */
        public void mo2075q(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i6 = -t.getTotalScrollRange();
                    i5 = i6;
                    i4 = t.getDownNestedPreScrollRange() + i6;
                } else {
                    i5 = -t.getUpNestedPreScrollRange();
                    i4 = 0;
                }
                if (i5 != i4) {
                    iArr[1] = mo15058O(coordinatorLayout, t, i2, i5, i4);
                }
            }
            if (t.mo14995j()) {
                t.mo15004p(t.mo15005r(view));
            }
        }

        /* renamed from: j0 */
        public void mo2078t(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                iArr[1] = mo15058O(coordinatorLayout, t, i4, -t.getDownNestedScrollRange(), 0);
            }
            if (i4 == 0) {
                m15214r0(coordinatorLayout, t);
            }
        }

        /* renamed from: k0 */
        public void mo2082x(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof C1938e) {
                C1938e eVar = (C1938e) parcelable;
                super.mo2082x(coordinatorLayout, t, eVar.mo5193l());
                this.f12479n = eVar.f12495c;
                this.f12481p = eVar.f12496d;
                this.f12480o = eVar.f12497e;
                return;
            }
            super.mo2082x(coordinatorLayout, t, parcelable);
            this.f12479n = -1;
        }

        /* renamed from: l0 */
        public Parcelable mo2083y(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable y = super.mo2083y(coordinatorLayout, t);
            int E = mo15043E();
            int childCount = t.getChildCount();
            boolean z = false;
            int i = 0;
            while (i < childCount) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + E;
                if (childAt.getTop() + E > 0 || bottom < 0) {
                    i++;
                } else {
                    C1938e eVar = new C1938e(y);
                    eVar.f12495c = i;
                    if (bottom == ViewCompat.m5516D(childAt) + t.getTopInset()) {
                        z = true;
                    }
                    eVar.f12497e = z;
                    eVar.f12496d = ((float) bottom) / ((float) childAt.getHeight());
                    return eVar;
                }
            }
            return y;
        }

        /* renamed from: m0 */
        public boolean mo2055A(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i, int i2) {
            boolean z = (i & 2) != 0 && (t.mo14995j() || m15206X(coordinatorLayout, t, view));
            if (z) {
                ValueAnimator valueAnimator = this.f12478m;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            }
            this.f12482q = null;
            this.f12477l = i2;
            return z;
        }

        /* renamed from: n0 */
        public void mo2057C(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.f12477l == 0 || i == 1) {
                m15213q0(coordinatorLayout, t);
                if (t.mo14995j()) {
                    t.mo15004p(t.mo15005r(view));
                }
            }
            this.f12482q = new WeakReference<>(view);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: o0 */
        public int mo15022Q(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3) {
            int M = mo15020M();
            int i4 = 0;
            if (i2 == 0 || M < i2 || M > i3) {
                this.f12476k = 0;
            } else {
                int b = MathUtils.m5069b(i, i2, i3);
                if (M != b) {
                    int e0 = t.mo14980f() ? m15211e0(t, b) : b;
                    boolean G = mo15044G(e0);
                    i4 = M - b;
                    this.f12476k = b - e0;
                    if (!G && t.mo14980f()) {
                        coordinatorLayout.mo2015f(t);
                    }
                    t.mo14996k(mo15043E());
                    m15215s0(coordinatorLayout, t, b, b < M ? -1 : 1, false);
                }
            }
            m15214r0(coordinatorLayout, t);
            return i4;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        /* renamed from: E */
        public /* bridge */ /* synthetic */ int mo15043E() {
            return super.mo15043E();
        }

        /* renamed from: G */
        public /* bridge */ /* synthetic */ boolean mo15044G(int i) {
            return super.mo15044G(i);
        }

        /* renamed from: g0 */
        public /* bridge */ /* synthetic */ boolean mo15027g0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            return super.mo2070l(coordinatorLayout, appBarLayout, i);
        }

        /* renamed from: h0 */
        public /* bridge */ /* synthetic */ boolean mo15028h0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            return super.mo2071m(coordinatorLayout, appBarLayout, i, i2, i3, i4);
        }

        /* renamed from: i0 */
        public /* bridge */ /* synthetic */ void mo15029i0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            super.mo2075q(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }

        /* renamed from: j0 */
        public /* bridge */ /* synthetic */ void mo15030j0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            super.mo2078t(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5, iArr);
        }

        /* renamed from: k0 */
        public /* bridge */ /* synthetic */ void mo15031k0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.mo2082x(coordinatorLayout, appBarLayout, parcelable);
        }

        /* renamed from: l0 */
        public /* bridge */ /* synthetic */ Parcelable mo15032l0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.mo2083y(coordinatorLayout, appBarLayout);
        }

        /* renamed from: m0 */
        public /* bridge */ /* synthetic */ boolean mo15033m0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            return super.mo2055A(coordinatorLayout, appBarLayout, view, view2, i, i2);
        }

        /* renamed from: n0 */
        public /* bridge */ /* synthetic */ void mo15034n0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            super.mo2057C(coordinatorLayout, appBarLayout, view, i);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        /* renamed from: R */
        private static int m15258R(AppBarLayout appBarLayout) {
            C0229c f = ((C0232f) appBarLayout.getLayoutParams()).mo2093f();
            if (f instanceof BaseBehavior) {
                return ((BaseBehavior) f).mo15020M();
            }
            return 0;
        }

        /* renamed from: S */
        private void m15259S(View view, View view2) {
            C0229c f = ((C0232f) view2.getLayoutParams()).mo2093f();
            if (f instanceof BaseBehavior) {
                ViewCompat.m5543Z(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) f).f12476k) + mo15064M()) - mo15062I(view2));
            }
        }

        /* renamed from: T */
        private void m15260T(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.mo14995j()) {
                    appBarLayout.mo15004p(appBarLayout.mo15005r(view));
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: J */
        public float mo15046J(View view) {
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int R = m15258R(appBarLayout);
                if (downNestedPreScrollRange != 0 && totalScrollRange + R <= downNestedPreScrollRange) {
                    return 0.0f;
                }
                int i = totalScrollRange - downNestedPreScrollRange;
                if (i != 0) {
                    return (((float) R) / ((float) i)) + 1.0f;
                }
            }
            return 0.0f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: L */
        public int mo15047L(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.mo15047L(view);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: Q */
        public AppBarLayout mo15045H(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        /* renamed from: e */
        public boolean mo2063e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        /* renamed from: h */
        public boolean mo2066h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            m15259S(view, view2);
            m15260T(view, view2);
            return false;
        }

        /* renamed from: i */
        public void mo2067i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                ViewCompat.m5561i0(coordinatorLayout, C0634a.f4692m.mo5098b());
                ViewCompat.m5561i0(coordinatorLayout, C0634a.f4693n.mo5098b());
            }
        }

        /* renamed from: l */
        public /* bridge */ /* synthetic */ boolean mo2070l(CoordinatorLayout coordinatorLayout, View view, int i) {
            return super.mo2070l(coordinatorLayout, view, i);
        }

        /* renamed from: m */
        public /* bridge */ /* synthetic */ boolean mo2071m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.mo2071m(coordinatorLayout, view, i, i2, i3, i4);
        }

        /* renamed from: w */
        public boolean mo2081w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout Q = mo15045H(coordinatorLayout.mo2039r(view));
            if (Q != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f12514d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    Q.mo14998m(false, !z);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1297l.f9234C3);
            mo15065O(obtainStyledAttributes.getDimensionPixelSize(C1297l.f9242D3, 0));
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$a */
    class C1940a implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ MaterialShapeDrawable f12498a;

        C1940a(MaterialShapeDrawable gVar) {
            this.f12498a = gVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f12498a.mo7842W(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$b */
    public interface C1941b<T extends AppBarLayout> {
        /* renamed from: a */
        void mo15050a(T t, int i);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$c */
    public static class C1942c extends LayoutParams {

        /* renamed from: a */
        int f12500a = 1;

        /* renamed from: b */
        Interpolator f12501b;

        public C1942c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1297l.f9499m);
            this.f12500a = obtainStyledAttributes.getInt(C1297l.f9507n, 0);
            int i = C1297l.f9515o;
            if (obtainStyledAttributes.hasValue(i)) {
                this.f12501b = android.view.animation.AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i, 0));
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public int mo15051a() {
            return this.f12500a;
        }

        /* renamed from: b */
        public Interpolator mo15052b() {
            return this.f12501b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public boolean mo15053c() {
            int i = this.f12500a;
            return (i & 1) == 1 && (i & 10) != 0;
        }

        public C1942c(int i, int i2) {
            super(i, i2);
        }

        public C1942c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C1942c(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C1942c(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: a */
    private void m15180a() {
        WeakReference<View> weakReference = this.f12472o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f12472o = null;
    }

    /* renamed from: b */
    private View m15181b(View view) {
        if (this.f12472o == null) {
            int i = this.f12471n;
            if (i != -1) {
                View findViewById = view != null ? view.findViewById(i) : null;
                if (findViewById == null && (getParent() instanceof ViewGroup)) {
                    findViewById = ((ViewGroup) getParent()).findViewById(this.f12471n);
                }
                if (findViewById != null) {
                    this.f12472o = new WeakReference<>(findViewById);
                }
            }
        }
        WeakReference<View> weakReference = this.f12472o;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* renamed from: g */
    private boolean m15182g() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C1942c) getChildAt(i).getLayoutParams()).mo15053c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    private void m15183i() {
        this.f12460c = -1;
        this.f12461d = -1;
        this.f12462e = -1;
    }

    /* renamed from: n */
    private void m15184n(boolean z, boolean z2, boolean z3) {
        int i = 0;
        int i2 = (z ? 1 : 2) | (z2 ? 4 : 0);
        if (z3) {
            i = 8;
        }
        this.f12464g = i2 | i;
        requestLayout();
    }

    /* renamed from: o */
    private boolean m15185o(boolean z) {
        if (this.f12468k == z) {
            return false;
        }
        this.f12468k = z;
        refreshDrawableState();
        return true;
    }

    /* renamed from: q */
    private boolean m15186q() {
        return this.f12475r != null && getTopInset() > 0;
    }

    /* renamed from: s */
    private boolean m15187s() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8 || ViewCompat.m5594z(childAt)) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    private void m15188t(MaterialShapeDrawable gVar, boolean z) {
        float dimension = getResources().getDimension(C1288d.design_appbar_elevation);
        float f = z ? 0.0f : dimension;
        if (!z) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.f12473p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, dimension});
        this.f12473p = ofFloat;
        ofFloat.setDuration((long) getResources().getInteger(C1292g.app_bar_elevation_anim_duration));
        this.f12473p.setInterpolator(AnimationUtils.f9611a);
        this.f12473p.addUpdateListener(new C1940a(gVar));
        this.f12473p.start();
    }

    /* renamed from: u */
    private void m15189u() {
        setWillNotDraw(!m15186q());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C1942c generateDefaultLayoutParams() {
        return new C1942c(-1, -2);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1942c;
    }

    /* renamed from: d */
    public C1942c generateLayoutParams(AttributeSet attributeSet) {
        return new C1942c(getContext(), attributeSet);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (m15186q()) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.f12459b));
            this.f12475r.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f12475r;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C1942c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (VERSION.SDK_INT >= 19 && (layoutParams instanceof LayoutParams)) {
            return new C1942c((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new C1942c((MarginLayoutParams) layoutParams);
        }
        return new C1942c(layoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo14980f() {
        return this.f12463f;
    }

    public C0229c<AppBarLayout> getBehavior() {
        return new Behavior();
    }

    /* access modifiers changed from: 0000 */
    public int getDownNestedPreScrollRange() {
        int i;
        int D;
        int i2 = this.f12461d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            C1942c cVar = (C1942c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = cVar.f12500a;
            if ((i4 & 5) == 5) {
                int i5 = cVar.topMargin + cVar.bottomMargin;
                if ((i4 & 8) != 0) {
                    D = ViewCompat.m5516D(childAt);
                } else if ((i4 & 2) != 0) {
                    D = measuredHeight - ViewCompat.m5516D(childAt);
                } else {
                    i = i5 + measuredHeight;
                    if (childCount == 0 && ViewCompat.m5594z(childAt)) {
                        i = Math.min(i, measuredHeight - getTopInset());
                    }
                    i3 += i;
                }
                i = i5 + D;
                i = Math.min(i, measuredHeight - getTopInset());
                i3 += i;
            } else if (i3 > 0) {
                break;
            }
        }
        int max = Math.max(0, i3);
        this.f12461d = max;
        return max;
    }

    /* access modifiers changed from: 0000 */
    public int getDownNestedScrollRange() {
        int i = this.f12462e;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C1942c cVar = (C1942c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + cVar.topMargin + cVar.bottomMargin;
            int i4 = cVar.f12500a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= ViewCompat.m5516D(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f12462e = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f12471n;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int D = ViewCompat.m5516D(this);
        if (D == 0) {
            int childCount = getChildCount();
            D = childCount >= 1 ? ViewCompat.m5516D(getChildAt(childCount - 1)) : 0;
            if (D == 0) {
                return getHeight() / 3;
            }
        }
        return (D * 2) + topInset;
    }

    /* access modifiers changed from: 0000 */
    public int getPendingAction() {
        return this.f12464g;
    }

    public Drawable getStatusBarForeground() {
        return this.f12475r;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    /* access modifiers changed from: 0000 */
    public final int getTopInset() {
        WindowInsetsCompat e0Var = this.f12465h;
        if (e0Var != null) {
            return e0Var.mo4995i();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f12460c;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C1942c cVar = (C1942c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = cVar.f12500a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight + cVar.topMargin + cVar.bottomMargin;
            if (i2 == 0 && ViewCompat.m5594z(childAt)) {
                i3 -= getTopInset();
            }
            if ((i4 & 2) != 0) {
                i3 -= ViewCompat.m5516D(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f12460c = max;
        return max;
    }

    /* access modifiers changed from: 0000 */
    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public boolean mo14994h() {
        return getTotalScrollRange() != 0;
    }

    /* renamed from: j */
    public boolean mo14995j() {
        return this.f12470m;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo14996k(int i) {
        this.f12459b = i;
        if (!willNotDraw()) {
            ViewCompat.m5555f0(this);
        }
        List<C1941b> list = this.f12466i;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1941b bVar = (C1941b) this.f12466i.get(i2);
                if (bVar != null) {
                    bVar.mo15050a(this, i);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo14997l() {
        this.f12464g = 0;
    }

    /* renamed from: m */
    public void mo14998m(boolean z, boolean z2) {
        m15184n(z, z2, true);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.m11337e(this);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        if (this.f12474q == null) {
            this.f12474q = new int[4];
        }
        int[] iArr = this.f12474q;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.f12468k;
        int i2 = C1270b.state_liftable;
        if (!z) {
            i2 = -i2;
        }
        iArr[0] = i2;
        iArr[1] = (!z || !this.f12469l) ? -C1270b.state_lifted : C1270b.state_lifted;
        int i3 = C1270b.state_collapsible;
        if (!z) {
            i3 = -i3;
        }
        iArr[2] = i3;
        iArr[3] = (!z || !this.f12469l) ? -C1270b.state_collapsed : C1270b.state_collapsed;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m15180a();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (ViewCompat.m5594z(this) && m15187s()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                ViewCompat.m5543Z(getChildAt(childCount), topInset);
            }
        }
        m15183i();
        this.f12463f = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((C1942c) getChildAt(i5).getLayoutParams()).mo15052b() != null) {
                this.f12463f = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.f12475r;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f12467j) {
            if (!this.f12470m && !m15182g()) {
                z2 = false;
            }
            m15185o(z2);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i2);
        if (mode != 1073741824 && ViewCompat.m5594z(this) && m15187s()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = MathUtils.m5069b(getMeasuredHeight() + getTopInset(), 0, MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        m15183i();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public boolean mo15004p(boolean z) {
        if (this.f12469l == z) {
            return false;
        }
        this.f12469l = z;
        refreshDrawableState();
        if (this.f12470m && (getBackground() instanceof MaterialShapeDrawable)) {
            m15188t((MaterialShapeDrawable) getBackground(), z);
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public boolean mo15005r(View view) {
        View b = m15181b(view);
        if (b != null) {
            view = b;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.m11336d(this, f);
    }

    public void setExpanded(boolean z) {
        mo14998m(z, ViewCompat.m5537T(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.f12470m = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.f12471n = i;
        m15180a();
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f12475r;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f12475r = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f12475r.setState(getDrawableState());
                }
                DrawableCompat.m1854m(this.f12475r, ViewCompat.m5514C(this));
                this.f12475r.setVisible(getVisibility() == 0, false);
                this.f12475r.setCallback(this);
            }
            m15189u();
            ViewCompat.m5555f0(this);
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(AppCompatResources.m4143d(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        if (VERSION.SDK_INT >= 21) {
            ViewUtilsLollipop.m15309a(this, f);
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f12475r;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f12475r;
    }
}
