package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.Toolbar.C0149e;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0228b;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0232f;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton.C2027b;
import com.google.android.material.internal.C2053k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p010b.p034g.p043k.ViewCompat;
import p010b.p048i.p049a.AbsSavedState;
import p067c.p068a.p069a.p114b.C1288d;
import p067c.p068a.p069a.p114b.C1296k;
import p067c.p068a.p069a.p114b.p117c0.MaterialShapeDrawable;
import p067c.p068a.p069a.p114b.p117c0.MaterialShapeUtils;
import p067c.p068a.p069a.p114b.p119m.TransformationCallback;

public class BottomAppBar extends Toolbar implements C0228b {

    /* renamed from: R */
    private static final int f12551R = C1296k.Widget_MaterialComponents_BottomAppBar;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public final int f12552S;

    /* renamed from: T */
    private final MaterialShapeDrawable f12553T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public Animator f12554U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public Animator f12555V;

    /* renamed from: W */
    private int f12556W;

    /* renamed from: a0 */
    private int f12557a0;

    /* renamed from: b0 */
    private boolean f12558b0;

    /* renamed from: c0 */
    private int f12559c0;

    /* renamed from: d0 */
    private ArrayList<C1957g> f12560d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public int f12561e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public boolean f12562f0;

    /* renamed from: g0 */
    private boolean f12563g0;

    /* renamed from: h0 */
    private Behavior f12564h0;

    /* renamed from: i0 */
    private int f12565i0;

    /* renamed from: j0 */
    private int f12566j0;

    /* renamed from: k0 */
    private int f12567k0;

    /* renamed from: l0 */
    AnimatorListenerAdapter f12568l0;

    /* renamed from: m0 */
    TransformationCallback<FloatingActionButton> f12569m0;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final Rect f12570e = new Rect();
        /* access modifiers changed from: private */

        /* renamed from: f */
        public WeakReference<BottomAppBar> f12571f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f12572g;

        /* renamed from: h */
        private final OnLayoutChangeListener f12573h = new C1949a();

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$a */
        class C1949a implements OnLayoutChangeListener {
            C1949a() {
            }

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f12571f.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                floatingActionButton.mo15764j(Behavior.this.f12570e);
                int height = Behavior.this.f12570e.height();
                bottomAppBar.mo15103x0(height);
                C0232f fVar = (C0232f) view.getLayoutParams();
                if (Behavior.this.f12572g == 0) {
                    fVar.bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(C1288d.mtrl_bottomappbar_fab_bottom_margin) - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                    fVar.leftMargin = bottomAppBar.getLeftInset();
                    fVar.rightMargin = bottomAppBar.getRightInset();
                    if (C2053k.m16233d(floatingActionButton)) {
                        fVar.leftMargin += bottomAppBar.f12552S;
                    } else {
                        fVar.rightMargin += bottomAppBar.f12552S;
                    }
                }
            }
        }

        public Behavior() {
        }

        /* renamed from: M */
        public boolean mo2070l(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            this.f12571f = new WeakReference<>(bottomAppBar);
            View d0 = bottomAppBar.m15366n0();
            if (d0 != null && !ViewCompat.m5537T(d0)) {
                C0232f fVar = (C0232f) d0.getLayoutParams();
                fVar.f1923d = 49;
                this.f12572g = fVar.bottomMargin;
                if (d0 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) d0;
                    floatingActionButton.addOnLayoutChangeListener(this.f12573h);
                    bottomAppBar.m15359f0(floatingActionButton);
                }
                bottomAppBar.m15372v0();
            }
            coordinatorLayout.mo2006I(bottomAppBar, i);
            return super.mo2070l(coordinatorLayout, bottomAppBar, i);
        }

        /* renamed from: N */
        public boolean mo2055A(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            return bottomAppBar.getHideOnScroll() && super.mo2055A(coordinatorLayout, bottomAppBar, view, view2, i, i2);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    class C1950a extends AnimatorListenerAdapter {
        C1950a() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m15363k0();
            BottomAppBar.this.f12554U = null;
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m15364l0();
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b */
    class C1951b extends C2027b {

        /* renamed from: a */
        final /* synthetic */ int f12576a;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b$a */
        class C1952a extends C2027b {
            C1952a() {
            }

            /* renamed from: b */
            public void mo15110b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.m15363k0();
            }
        }

        C1951b(int i) {
            this.f12576a = i;
        }

        /* renamed from: a */
        public void mo15109a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.m15367p0(this.f12576a));
            floatingActionButton.mo15776s(new C1952a());
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$c */
    class C1953c extends AnimatorListenerAdapter {
        C1953c() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m15363k0();
            BottomAppBar.this.f12562f0 = false;
            BottomAppBar.this.f12555V = null;
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m15364l0();
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$d */
    class C1954d extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f12580a;

        /* renamed from: b */
        final /* synthetic */ ActionMenuView f12581b;

        /* renamed from: c */
        final /* synthetic */ int f12582c;

        /* renamed from: d */
        final /* synthetic */ boolean f12583d;

        C1954d(ActionMenuView actionMenuView, int i, boolean z) {
            this.f12581b = actionMenuView;
            this.f12582c = i;
            this.f12583d = z;
        }

        public void onAnimationCancel(Animator animator) {
            this.f12580a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f12580a) {
                boolean z = BottomAppBar.this.f12561e0 != 0;
                BottomAppBar bottomAppBar = BottomAppBar.this;
                bottomAppBar.mo15101t0(bottomAppBar.f12561e0);
                BottomAppBar.this.m15374z0(this.f12581b, this.f12582c, this.f12583d, z);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$e */
    class C1955e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ActionMenuView f12585a;

        /* renamed from: b */
        final /* synthetic */ int f12586b;

        /* renamed from: c */
        final /* synthetic */ boolean f12587c;

        C1955e(ActionMenuView actionMenuView, int i, boolean z) {
            this.f12585a = actionMenuView;
            this.f12586b = i;
            this.f12587c = z;
        }

        public void run() {
            ActionMenuView actionMenuView = this.f12585a;
            actionMenuView.setTranslationX((float) BottomAppBar.this.mo15091o0(actionMenuView, this.f12586b, this.f12587c));
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$f */
    class C1956f extends AnimatorListenerAdapter {
        C1956f() {
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f12568l0.onAnimationStart(animator);
            FloatingActionButton X = BottomAppBar.this.m15365m0();
            if (X != null) {
                X.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$g */
    interface C1957g {
        /* renamed from: a */
        void mo15117a(BottomAppBar bottomAppBar);

        /* renamed from: b */
        void mo15118b(BottomAppBar bottomAppBar);
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$h */
    static class C1958h extends AbsSavedState {
        public static final Creator<C1958h> CREATOR = new C1959a();

        /* renamed from: c */
        int f12590c;

        /* renamed from: d */
        boolean f12591d;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$h$a */
        static class C1959a implements ClassLoaderCreator<C1958h> {
            C1959a() {
            }

            /* renamed from: a */
            public C1958h createFromParcel(Parcel parcel) {
                return new C1958h(parcel, null);
            }

            /* renamed from: b */
            public C1958h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1958h(parcel, classLoader);
            }

            /* renamed from: c */
            public C1958h[] newArray(int i) {
                return new C1958h[i];
            }
        }

        public C1958h(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f12590c);
            parcel.writeInt(this.f12591d ? 1 : 0);
        }

        public C1958h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f12590c = parcel.readInt();
            this.f12591d = parcel.readInt() != 0;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public void m15359f0(FloatingActionButton floatingActionButton) {
        floatingActionButton.mo15744e(this.f12568l0);
        floatingActionButton.mo15745f(new C1956f());
        floatingActionButton.mo15746g(this.f12569m0);
    }

    /* renamed from: g0 */
    private void m15360g0() {
        Animator animator = this.f12555V;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f12554U;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public int getBottomInset() {
        return this.f12565i0;
    }

    /* access modifiers changed from: private */
    public float getFabTranslationX() {
        return m15367p0(this.f12556W);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().mo15125c();
    }

    /* access modifiers changed from: private */
    public int getLeftInset() {
        return this.f12567k0;
    }

    /* access modifiers changed from: private */
    public int getRightInset() {
        return this.f12566j0;
    }

    private BottomAppBarTopEdgeTreatment getTopEdgeTreatment() {
        return (BottomAppBarTopEdgeTreatment) this.f12553T.mo7830C().mo7889p();
    }

    /* renamed from: i0 */
    private void m15361i0(int i, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m15365m0(), "translationX", new float[]{m15367p0(i)});
        ofFloat.setDuration(300);
        list.add(ofFloat);
    }

    /* renamed from: j0 */
    private void m15362j0(int i, boolean z, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            String str = "alpha";
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, str, new float[]{1.0f});
            if (Math.abs(actionMenuView.getTranslationX() - ((float) mo15091o0(actionMenuView, i, z))) > 1.0f) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, str, new float[]{0.0f});
                ofFloat2.addListener(new C1954d(actionMenuView, i, z));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(150);
                animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat});
                list.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public void m15363k0() {
        int i = this.f12559c0 - 1;
        this.f12559c0 = i;
        if (i == 0) {
            ArrayList<C1957g> arrayList = this.f12560d0;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C1957g) it.next()).mo15117a(this);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public void m15364l0() {
        int i = this.f12559c0;
        this.f12559c0 = i + 1;
        if (i == 0) {
            ArrayList<C1957g> arrayList = this.f12560d0;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C1957g) it.next()).mo15118b(this);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m0 */
    public FloatingActionButton m15365m0() {
        View n0 = m15366n0();
        if (n0 instanceof FloatingActionButton) {
            return (FloatingActionButton) n0;
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: n0 */
    public View m15366n0() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).mo2042s(this)) {
            if (!(view instanceof FloatingActionButton)) {
                if (view instanceof ExtendedFloatingActionButton) {
                }
            }
            return view;
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: p0 */
    public float m15367p0(int i) {
        boolean d = C2053k.m16233d(this);
        int i2 = 1;
        if (i != 1) {
            return 0.0f;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - (this.f12552S + (d ? this.f12567k0 : this.f12566j0));
        if (d) {
            i2 = -1;
        }
        return (float) (measuredWidth * i2);
    }

    /* renamed from: q0 */
    private boolean m15368q0() {
        FloatingActionButton m0 = m15365m0();
        return m0 != null && m0.mo15769o();
    }

    /* renamed from: r0 */
    private void m15369r0(int i, boolean z) {
        if (!ViewCompat.m5537T(this)) {
            this.f12562f0 = false;
            mo15101t0(this.f12561e0);
            return;
        }
        Animator animator = this.f12555V;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!m15368q0()) {
            i = 0;
            z = false;
        }
        m15362j0(i, z, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.f12555V = animatorSet;
        animatorSet.addListener(new C1953c());
        this.f12555V.start();
    }

    /* renamed from: s0 */
    private void m15370s0(int i) {
        if (this.f12556W != i && ViewCompat.m5537T(this)) {
            Animator animator = this.f12554U;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.f12557a0 == 1) {
                m15361i0(i, arrayList);
            } else {
                mo15090h0(i, arrayList);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f12554U = animatorSet;
            animatorSet.addListener(new C1950a());
            this.f12554U.start();
        }
    }

    /* renamed from: u0 */
    private void m15371u0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null && this.f12555V == null) {
            actionMenuView.setAlpha(1.0f);
            if (!m15368q0()) {
                m15373y0(actionMenuView, 0, false);
            } else {
                m15373y0(actionMenuView, this.f12556W, this.f12563g0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v0 */
    public void m15372v0() {
        getTopEdgeTreatment().mo15133k(getFabTranslationX());
        View n0 = m15366n0();
        this.f12553T.mo7844Y((!this.f12563g0 || !m15368q0()) ? 0.0f : 1.0f);
        if (n0 != null) {
            n0.setTranslationY(getFabTranslationY());
            n0.setTranslationX(getFabTranslationX());
        }
    }

    /* renamed from: y0 */
    private void m15373y0(ActionMenuView actionMenuView, int i, boolean z) {
        m15374z0(actionMenuView, i, z, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: z0 */
    public void m15374z0(ActionMenuView actionMenuView, int i, boolean z, boolean z2) {
        C1955e eVar = new C1955e(actionMenuView, i, z);
        if (z2) {
            actionMenuView.post(eVar);
        } else {
            eVar.run();
        }
    }

    public ColorStateList getBackgroundTint() {
        return this.f12553T.mo7831E();
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().mo15125c();
    }

    public int getFabAlignmentMode() {
        return this.f12556W;
    }

    public int getFabAnimationMode() {
        return this.f12557a0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().mo15126d();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().mo15127e();
    }

    public boolean getHideOnScroll() {
        return this.f12558b0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h0 */
    public void mo15090h0(int i, List<Animator> list) {
        FloatingActionButton m0 = m15365m0();
        if (m0 != null && !m0.mo15768n()) {
            m15364l0();
            m0.mo15766l(new C1951b(i));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o0 */
    public int mo15091o0(ActionMenuView actionMenuView, int i, boolean z) {
        if (i != 1 || !z) {
            return 0;
        }
        boolean d = C2053k.m16233d(this);
        int measuredWidth = d ? getMeasuredWidth() : 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt.getLayoutParams() instanceof C0149e) && (((C0149e) childAt.getLayoutParams()).f272a & 8388615) == 8388611) {
                if (d) {
                    measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                } else {
                    measuredWidth = Math.max(measuredWidth, childAt.getRight());
                }
            }
        }
        return measuredWidth - ((d ? actionMenuView.getRight() : actionMenuView.getLeft()) + (d ? this.f12566j0 : -this.f12567k0));
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.m11338f(this, this.f12553T);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m15360g0();
            m15372v0();
        }
        m15371u0();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1958h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1958h hVar = (C1958h) parcelable;
        super.onRestoreInstanceState(hVar.mo5193l());
        this.f12556W = hVar.f12590c;
        this.f12563g0 = hVar.f12591d;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C1958h hVar = new C1958h(super.onSaveInstanceState());
        hVar.f12590c = this.f12556W;
        hVar.f12591d = this.f12563g0;
        return hVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        DrawableCompat.m1856o(this.f12553T, colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            getTopEdgeTreatment().mo15129g(f);
            this.f12553T.invalidateSelf();
            m15372v0();
        }
    }

    public void setElevation(float f) {
        this.f12553T.mo7842W(f);
        getBehavior().mo15072G(this, this.f12553T.mo7829B() - this.f12553T.mo7828A());
    }

    public void setFabAlignmentMode(int i) {
        mo15102w0(i, 0);
    }

    public void setFabAnimationMode(int i) {
        this.f12557a0 = i;
    }

    public void setFabCradleMargin(float f) {
        if (f != getFabCradleMargin()) {
            getTopEdgeTreatment().mo15130h(f);
            this.f12553T.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().mo15131i(f);
            this.f12553T.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.f12558b0 = z;
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    /* renamed from: t0 */
    public void mo15101t0(int i) {
        if (i != 0) {
            this.f12561e0 = 0;
            getMenu().clear();
            mo1255x(i);
        }
    }

    /* renamed from: w0 */
    public void mo15102w0(int i, int i2) {
        this.f12561e0 = i2;
        this.f12562f0 = true;
        m15369r0(i, this.f12563g0);
        m15370s0(i);
        this.f12556W = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x0 */
    public boolean mo15103x0(int i) {
        float f = (float) i;
        if (f == getTopEdgeTreatment().mo15128f()) {
            return false;
        }
        getTopEdgeTreatment().mo15132j(f);
        this.f12553T.invalidateSelf();
        return true;
    }

    public Behavior getBehavior() {
        if (this.f12564h0 == null) {
            this.f12564h0 = new Behavior();
        }
        return this.f12564h0;
    }
}
