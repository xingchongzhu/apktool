package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0228b;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0229c;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0232f;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.DescendantOffsetUtils;
import java.util.List;
import p010b.p034g.p043k.ViewCompat;
import p067c.p068a.p069a.p114b.C1296k;
import p067c.p068a.p069a.p114b.C1297l;
import p067c.p068a.p069a.p114b.p119m.MotionSpec;

public class ExtendedFloatingActionButton extends MaterialButton implements C0228b {

    /* renamed from: s */
    private static final int f12956s = C1296k.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;

    /* renamed from: t */
    static final Property<View, Float> f12957t;

    /* renamed from: u */
    static final Property<View, Float> f12958u;

    /* renamed from: v */
    static final Property<View, Float> f12959v;

    /* renamed from: w */
    static final Property<View, Float> f12960w;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public final MotionStrategy f12961A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public final MotionStrategy f12962B;

    /* renamed from: C */
    private final int f12963C;

    /* renamed from: D */
    private int f12964D;

    /* renamed from: G */
    private int f12965G;

    /* renamed from: H */
    private final C0229c<ExtendedFloatingActionButton> f12966H;

    /* renamed from: I */
    private boolean f12967I;

    /* renamed from: J */
    private boolean f12968J;

    /* renamed from: K */
    private boolean f12969K;

    /* renamed from: L */
    protected ColorStateList f12970L;

    /* renamed from: x */
    private int f12971x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public final MotionStrategy f12972y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public final MotionStrategy f12973z;

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends C0229c<T> {

        /* renamed from: a */
        private Rect f12974a;

        /* renamed from: b */
        private C2025f f12975b;

        /* renamed from: c */
        private C2025f f12976c;

        /* renamed from: d */
        private boolean f12977d;

        /* renamed from: e */
        private boolean f12978e;

        public ExtendedFloatingActionButtonBehavior() {
            this.f12977d = false;
            this.f12978e = true;
        }

        /* renamed from: G */
        private static boolean m15956G(View view) {
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof C0232f) {
                return ((C0232f) layoutParams).mo2093f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: J */
        private boolean m15957J(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            C0232f fVar = (C0232f) extendedFloatingActionButton.getLayoutParams();
            if ((this.f12977d || this.f12978e) && fVar.mo2092e() == view.getId()) {
                return true;
            }
            return false;
        }

        /* renamed from: L */
        private boolean m15958L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m15957J(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f12974a == null) {
                this.f12974a = new Rect();
            }
            Rect rect = this.f12974a;
            DescendantOffsetUtils.m16187a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                mo15723K(extendedFloatingActionButton);
            } else {
                mo15719E(extendedFloatingActionButton);
            }
            return true;
        }

        /* renamed from: M */
        private boolean m15959M(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m15957J(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((C0232f) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                mo15723K(extendedFloatingActionButton);
            } else {
                mo15719E(extendedFloatingActionButton);
            }
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: E */
        public void mo15719E(ExtendedFloatingActionButton extendedFloatingActionButton) {
            MotionStrategy dVar;
            boolean z = this.f12978e;
            C2025f fVar = z ? this.f12976c : this.f12975b;
            if (z) {
                dVar = extendedFloatingActionButton.f12973z;
            } else {
                dVar = extendedFloatingActionButton.f12961A;
            }
            extendedFloatingActionButton.m15953r(dVar, fVar);
        }

        /* renamed from: F */
        public boolean mo2060b(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.mo2060b(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        /* renamed from: H */
        public boolean mo2066h(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m15958L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
            } else if (m15956G(view)) {
                m15959M(view, extendedFloatingActionButton);
            }
            return false;
        }

        /* renamed from: I */
        public boolean mo2070l(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List r = coordinatorLayout.mo2039r(extendedFloatingActionButton);
            int size = r.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) r.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m15956G(view) && m15959M(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (m15958L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo2006I(extendedFloatingActionButton, i);
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: K */
        public void mo15723K(ExtendedFloatingActionButton extendedFloatingActionButton) {
            MotionStrategy dVar;
            boolean z = this.f12978e;
            C2025f fVar = z ? this.f12976c : this.f12975b;
            if (z) {
                dVar = extendedFloatingActionButton.f12972y;
            } else {
                dVar = extendedFloatingActionButton.f12962B;
            }
            extendedFloatingActionButton.m15953r(dVar, fVar);
        }

        /* renamed from: g */
        public void mo2065g(C0232f fVar) {
            if (fVar.f1927h == 0) {
                fVar.f1927h = 80;
            }
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1297l.f9509n1);
            this.f12977d = obtainStyledAttributes.getBoolean(C1297l.f9517o1, false);
            this.f12978e = obtainStyledAttributes.getBoolean(C1297l.f9525p1, true);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a */
    class C2020a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f12979a;

        /* renamed from: b */
        final /* synthetic */ MotionStrategy f12980b;

        /* renamed from: c */
        final /* synthetic */ C2025f f12981c;

        C2020a(MotionStrategy dVar, C2025f fVar) {
            this.f12980b = dVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f12979a = true;
            this.f12980b.mo15877b();
        }

        public void onAnimationEnd(Animator animator) {
            this.f12980b.mo15876a();
            if (!this.f12979a) {
                this.f12980b.mo15883h(this.f12981c);
            }
        }

        public void onAnimationStart(Animator animator) {
            this.f12980b.onAnimationStart(animator);
            this.f12979a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b */
    static class C2021b extends Property<View, Float> {
        C2021b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) view.getLayoutParams().width);
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            view.getLayoutParams().width = f.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c */
    static class C2022c extends Property<View, Float> {
        C2022c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) view.getLayoutParams().height);
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            view.getLayoutParams().height = f.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$d */
    static class C2023d extends Property<View, Float> {
        C2023d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) ViewCompat.m5526I(view));
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            ViewCompat.m5511A0(view, f.intValue(), view.getPaddingTop(), ViewCompat.m5524H(view), view.getPaddingBottom());
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$e */
    static class C2024e extends Property<View, Float> {
        C2024e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) ViewCompat.m5524H(view));
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            ViewCompat.m5511A0(view, ViewCompat.m5526I(view), view.getPaddingTop(), f.intValue(), view.getPaddingBottom());
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$f */
    public static abstract class C2025f {
    }

    static {
        Class<Float> cls = Float.class;
        f12957t = new C2021b(cls, "width");
        f12958u = new C2022c(cls, "height");
        f12959v = new C2023d(cls, "paddingStart");
        f12960w = new C2024e(cls, "paddingEnd");
    }

    /* renamed from: q */
    private boolean m15952q() {
        boolean z = false;
        if (getVisibility() != 0) {
            if (this.f12971x == 2) {
                z = true;
            }
            return z;
        }
        if (this.f12971x != 1) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m15953r(MotionStrategy dVar, C2025f fVar) {
        if (!dVar.mo15884i()) {
            if (!m15955t()) {
                dVar.mo15879d();
                dVar.mo15883h(fVar);
                return;
            }
            measure(0, 0);
            AnimatorSet f = dVar.mo15881f();
            f.addListener(new C2020a(dVar, fVar));
            for (AnimatorListener addListener : dVar.mo15882g()) {
                f.addListener(addListener);
            }
            f.start();
        }
    }

    /* renamed from: s */
    private void m15954s() {
        this.f12970L = getTextColors();
    }

    /* renamed from: t */
    private boolean m15955t() {
        return (ViewCompat.m5537T(this) || (!m15952q() && this.f12969K)) && !isInEditMode();
    }

    public C0229c<ExtendedFloatingActionButton> getBehavior() {
        return this.f12966H;
    }

    /* access modifiers changed from: 0000 */
    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    /* access modifiers changed from: 0000 */
    public int getCollapsedSize() {
        int i = this.f12963C;
        return i < 0 ? (Math.min(ViewCompat.m5526I(this), ViewCompat.m5524H(this)) * 2) + getIconSize() : i;
    }

    public MotionSpec getExtendMotionSpec() {
        return this.f12973z.mo15880e();
    }

    public MotionSpec getHideMotionSpec() {
        return this.f12962B.mo15880e();
    }

    public MotionSpec getShowMotionSpec() {
        return this.f12961A.mo15880e();
    }

    public MotionSpec getShrinkMotionSpec() {
        return this.f12972y.mo15880e();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f12967I && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f12967I = false;
            this.f12972y.mo15879d();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.f12969K = z;
    }

    public void setExtendMotionSpec(MotionSpec hVar) {
        this.f12973z.mo15878c(hVar);
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(MotionSpec.m11486c(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (this.f12967I != z) {
            MotionStrategy dVar = z ? this.f12973z : this.f12972y;
            if (!dVar.mo15884i()) {
                dVar.mo15879d();
            }
        }
    }

    public void setHideMotionSpec(MotionSpec hVar) {
        this.f12962B.mo15878c(hVar);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(MotionSpec.m11486c(getContext(), i));
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (this.f12967I && !this.f12968J) {
            this.f12964D = ViewCompat.m5526I(this);
            this.f12965G = ViewCompat.m5524H(this);
        }
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (this.f12967I && !this.f12968J) {
            this.f12964D = i;
            this.f12965G = i3;
        }
    }

    public void setShowMotionSpec(MotionSpec hVar) {
        this.f12961A.mo15878c(hVar);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(MotionSpec.m11486c(getContext(), i));
    }

    public void setShrinkMotionSpec(MotionSpec hVar) {
        this.f12972y.mo15878c(hVar);
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(MotionSpec.m11486c(getContext(), i));
    }

    public void setTextColor(int i) {
        super.setTextColor(i);
        m15954s();
    }

    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        m15954s();
    }
}
