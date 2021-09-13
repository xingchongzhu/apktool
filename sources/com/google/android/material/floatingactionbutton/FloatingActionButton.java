package com.google.android.material.floatingactionbutton;

import android.animation.Animator.AnimatorListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatImageHelper;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0228b;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0229c;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0232f;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.TintableImageSourceView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.VisibilityAwareImageButton;
import java.util.List;
import p010b.p034g.p042j.Preconditions;
import p010b.p034g.p043k.TintableBackgroundView;
import p010b.p034g.p043k.ViewCompat;
import p067c.p068a.p069a.p114b.C1288d;
import p067c.p068a.p069a.p114b.C1296k;
import p067c.p068a.p069a.p114b.C1297l;
import p067c.p068a.p069a.p114b.p116b0.ShadowViewDelegate;
import p067c.p068a.p069a.p114b.p117c0.ShapeAppearanceModel;
import p067c.p068a.p069a.p114b.p117c0.Shapeable;
import p067c.p068a.p069a.p114b.p118d0.ExtendableSavedState;
import p067c.p068a.p069a.p114b.p119m.MotionSpec;
import p067c.p068a.p069a.p114b.p119m.TransformationCallback;
import p067c.p068a.p069a.p114b.p130w.ExpandableWidget;

public class FloatingActionButton extends VisibilityAwareImageButton implements TintableBackgroundView, TintableImageSourceView, ExpandableWidget, Shapeable, C0228b {

    /* renamed from: b */
    private static final int f12983b = C1296k.Widget_Design_FloatingActionButton;

    /* renamed from: c */
    private ColorStateList f12984c;

    /* renamed from: d */
    private Mode f12985d;

    /* renamed from: e */
    private ColorStateList f12986e;

    /* renamed from: f */
    private Mode f12987f;

    /* renamed from: g */
    private ColorStateList f12988g;

    /* renamed from: h */
    private int f12989h;

    /* renamed from: i */
    private int f12990i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f12991j;

    /* renamed from: k */
    private int f12992k;

    /* renamed from: l */
    boolean f12993l;

    /* renamed from: m */
    final Rect f12994m;

    /* renamed from: n */
    private final Rect f12995n;

    /* renamed from: o */
    private final AppCompatImageHelper f12996o;

    /* renamed from: p */
    private FloatingActionButtonImpl f12997p;

    protected static class BaseBehavior<T extends FloatingActionButton> extends C0229c<T> {

        /* renamed from: a */
        private Rect f12998a;

        /* renamed from: b */
        private C2027b f12999b;

        /* renamed from: c */
        private boolean f13000c;

        public BaseBehavior() {
            this.f13000c = true;
        }

        /* renamed from: F */
        private static boolean m15997F(View view) {
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof C0232f) {
                return ((C0232f) layoutParams).mo2093f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: G */
        private void m15998G(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.f12994m;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                C0232f fVar = (C0232f) floatingActionButton.getLayoutParams();
                int i = 0;
                int i2 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - fVar.rightMargin ? rect.right : floatingActionButton.getLeft() <= fVar.leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - fVar.bottomMargin) {
                    i = rect.bottom;
                } else if (floatingActionButton.getTop() <= fVar.topMargin) {
                    i = -rect.top;
                }
                if (i != 0) {
                    ViewCompat.m5543Z(floatingActionButton, i);
                }
                if (i2 != 0) {
                    ViewCompat.m5542Y(floatingActionButton, i2);
                }
            }
        }

        /* renamed from: J */
        private boolean m15999J(View view, FloatingActionButton floatingActionButton) {
            C0232f fVar = (C0232f) floatingActionButton.getLayoutParams();
            if (this.f13000c && fVar.mo2092e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: K */
        private boolean m16000K(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m15999J(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f12998a == null) {
                this.f12998a = new Rect();
            }
            Rect rect = this.f12998a;
            DescendantOffsetUtils.m16187a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.mo15767m(this.f12999b, false);
            } else {
                floatingActionButton.mo15809t(this.f12999b, false);
            }
            return true;
        }

        /* renamed from: L */
        private boolean m16001L(View view, FloatingActionButton floatingActionButton) {
            if (!m15999J(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((C0232f) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.mo15767m(this.f12999b, false);
            } else {
                floatingActionButton.mo15809t(this.f12999b, false);
            }
            return true;
        }

        /* renamed from: E */
        public boolean mo2060b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f12994m;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: H */
        public boolean mo2066h(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m16000K(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
            } else if (m15997F(view)) {
                m16001L(view, floatingActionButton);
            }
            return false;
        }

        /* renamed from: I */
        public boolean mo2070l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List r = coordinatorLayout.mo2039r(floatingActionButton);
            int size = r.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) r.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m15997F(view) && m16001L(view, floatingActionButton)) {
                        break;
                    }
                } else if (m16000K(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo2006I(floatingActionButton, i);
            m15998G(coordinatorLayout, floatingActionButton);
            return true;
        }

        /* renamed from: g */
        public void mo2065g(C0232f fVar) {
            if (fVar.f1927h == 0) {
                fVar.f1927h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1297l.f9541r1);
            this.f13000c = obtainStyledAttributes.getBoolean(C1297l.f9549s1, true);
            obtainStyledAttributes.recycle();
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        /* renamed from: E */
        public /* bridge */ /* synthetic */ boolean mo15810E(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.mo2060b(coordinatorLayout, floatingActionButton, rect);
        }

        /* renamed from: H */
        public /* bridge */ /* synthetic */ boolean mo15811H(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.mo2066h(coordinatorLayout, floatingActionButton, view);
        }

        /* renamed from: I */
        public /* bridge */ /* synthetic */ boolean mo15812I(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            return super.mo2070l(coordinatorLayout, floatingActionButton, i);
        }

        /* renamed from: g */
        public /* bridge */ /* synthetic */ void mo2065g(C0232f fVar) {
            super.mo2065g(fVar);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    class C2026a implements C2039j {

        /* renamed from: a */
        final /* synthetic */ C2027b f13001a;

        C2026a(C2027b bVar) {
            this.f13001a = bVar;
        }

        /* renamed from: a */
        public void mo15813a() {
            this.f13001a.mo15110b(FloatingActionButton.this);
        }

        /* renamed from: b */
        public void mo15814b() {
            this.f13001a.mo15109a(FloatingActionButton.this);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    public static abstract class C2027b {
        /* renamed from: a */
        public void mo15109a(FloatingActionButton floatingActionButton) {
        }

        /* renamed from: b */
        public void mo15110b(FloatingActionButton floatingActionButton) {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$c */
    private class C2028c implements ShadowViewDelegate {
        C2028c() {
        }

        /* renamed from: a */
        public void mo7816a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.f12994m.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.f12991j, i2 + FloatingActionButton.this.f12991j, i3 + FloatingActionButton.this.f12991j, i4 + FloatingActionButton.this.f12991j);
        }

        /* renamed from: b */
        public void mo7817b(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        /* renamed from: c */
        public boolean mo7818c() {
            return FloatingActionButton.this.f12993l;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$d */
    class C2029d<T extends FloatingActionButton> implements C2038i {

        /* renamed from: a */
        private final TransformationCallback<T> f13004a;

        C2029d(TransformationCallback<T> kVar) {
            this.f13004a = kVar;
        }

        /* renamed from: a */
        public void mo15815a() {
            this.f13004a.mo7974a(FloatingActionButton.this);
        }

        /* renamed from: b */
        public void mo15816b() {
            this.f13004a.mo7975b(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof C2029d) && ((C2029d) obj).f13004a.equals(this.f13004a);
        }

        public int hashCode() {
            return this.f13004a.hashCode();
        }
    }

    private FloatingActionButtonImpl getImpl() {
        if (this.f12997p == null) {
            this.f12997p = m15979h();
        }
        return this.f12997p;
    }

    /* renamed from: h */
    private FloatingActionButtonImpl m15979h() {
        if (VERSION.SDK_INT >= 21) {
            return new FloatingActionButtonImplLollipop(this, new C2028c());
        }
        return new FloatingActionButtonImpl(this, new C2028c());
    }

    /* renamed from: k */
    private int m15980k(int i) {
        int i2;
        int i3 = this.f12990i;
        if (i3 != 0) {
            return i3;
        }
        Resources resources = getResources();
        if (i == -1) {
            if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
                i2 = m15980k(1);
            } else {
                i2 = m15980k(0);
            }
            return i2;
        } else if (i != 1) {
            return resources.getDimensionPixelSize(C1288d.design_fab_size_normal);
        } else {
            return resources.getDimensionPixelSize(C1288d.design_fab_size_mini);
        }
    }

    /* renamed from: p */
    private void m15981p(Rect rect) {
        int i = rect.left;
        Rect rect2 = this.f12994m;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    /* renamed from: q */
    private void m15982q() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f12986e;
            if (colorStateList == null) {
                DrawableCompat.m1844c(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            Mode mode = this.f12987f;
            if (mode == null) {
                mode = Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(AppCompatDrawableManager.m1159e(colorForState, mode));
        }
    }

    /* renamed from: r */
    private static int m15983r(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: u */
    private C2039j m15984u(C2027b bVar) {
        if (bVar == null) {
            return null;
        }
        return new C2026a(bVar);
    }

    /* renamed from: a */
    public boolean mo8082a() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo15821C(getDrawableState());
    }

    /* renamed from: e */
    public void mo15744e(AnimatorListener animatorListener) {
        getImpl().mo15847d(animatorListener);
    }

    /* renamed from: f */
    public void mo15745f(AnimatorListener animatorListener) {
        getImpl().mo15848e(animatorListener);
    }

    /* renamed from: g */
    public void mo15746g(TransformationCallback<? extends FloatingActionButton> kVar) {
        getImpl().mo15849f(new C2029d(kVar));
    }

    public ColorStateList getBackgroundTintList() {
        return this.f12984c;
    }

    public Mode getBackgroundTintMode() {
        return this.f12985d;
    }

    public C0229c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().mo15851m();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().mo15854p();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().mo15856s();
    }

    public Drawable getContentBackground() {
        return getImpl().mo15850j();
    }

    public int getCustomSize() {
        return this.f12990i;
    }

    public int getExpandedComponentIdHint() {
        throw null;
    }

    public MotionSpec getHideMotionSpec() {
        return getImpl().mo15853o();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f12988g;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f12988g;
    }

    public ShapeAppearanceModel getShapeAppearanceModel() {
        return (ShapeAppearanceModel) Preconditions.m5188e(getImpl().mo15857t());
    }

    public MotionSpec getShowMotionSpec() {
        return getImpl().mo15858u();
    }

    public int getSize() {
        return this.f12989h;
    }

    /* access modifiers changed from: 0000 */
    public int getSizeDimension() {
        return m15980k(this.f12989h);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f12986e;
    }

    public Mode getSupportImageTintMode() {
        return this.f12987f;
    }

    public boolean getUseCompatPadding() {
        return this.f12993l;
    }

    @Deprecated
    /* renamed from: i */
    public boolean mo15763i(Rect rect) {
        if (!ViewCompat.m5537T(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        m15981p(rect);
        return true;
    }

    /* renamed from: j */
    public void mo15764j(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        m15981p(rect);
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo15862y();
    }

    /* renamed from: l */
    public void mo15766l(C2027b bVar) {
        mo15767m(bVar, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public void mo15767m(C2027b bVar, boolean z) {
        getImpl().mo15859v(m15984u(bVar), z);
    }

    /* renamed from: n */
    public boolean mo15768n() {
        return getImpl().mo15860w();
    }

    /* renamed from: o */
    public boolean mo15769o() {
        return getImpl().mo15861x();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().mo15863z();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().mo15820B();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f12991j = (sizeDimension - this.f12992k) / 2;
        getImpl().mo15845b0();
        int min = Math.min(m15983r(sizeDimension, i), m15983r(sizeDimension, i2));
        Rect rect = this.f12994m;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState aVar = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(aVar.mo5193l());
        Bundle bundle = (Bundle) Preconditions.m5188e(aVar.f9211c.get("expandableWidgetHelper"));
        throw null;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        new ExtendableSavedState(onSaveInstanceState);
        throw null;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !mo15763i(this.f12995n) || this.f12995n.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* renamed from: s */
    public void mo15776s(C2027b bVar) {
        mo15809t(bVar, true);
    }

    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f12984c != colorStateList) {
            this.f12984c = colorStateList;
            getImpl().mo15828J(colorStateList);
        }
    }

    public void setBackgroundTintMode(Mode mode) {
        if (this.f12985d != mode) {
            this.f12985d = mode;
            getImpl().mo15829K(mode);
        }
    }

    public void setCompatElevation(float f) {
        getImpl().mo15830L(f);
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        getImpl().mo15833O(f);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        getImpl().mo15835Q(f);
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i != this.f12990i) {
            this.f12990i = i;
            requestLayout();
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().mo15846c0(f);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().mo15852n()) {
            getImpl().mo15831M(z);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        throw null;
    }

    public void setHideMotionSpec(MotionSpec hVar) {
        getImpl().mo15832N(hVar);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(MotionSpec.m11486c(getContext(), i));
    }

    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().mo15844a0();
            if (this.f12986e != null) {
                m15982q();
            }
        }
    }

    public void setImageResource(int i) {
        this.f12996o.mo1622g(i);
        m15982q();
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().mo15825G();
    }

    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().mo15825G();
    }

    public void setShadowPaddingEnabled(boolean z) {
        getImpl().mo15837S(z);
    }

    public void setShapeAppearanceModel(ShapeAppearanceModel kVar) {
        getImpl().mo15838T(kVar);
    }

    public void setShowMotionSpec(MotionSpec hVar) {
        getImpl().mo15839U(hVar);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(MotionSpec.m11486c(getContext(), i));
    }

    public void setSize(int i) {
        this.f12990i = 0;
        if (i != this.f12989h) {
            this.f12989h = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f12986e != colorStateList) {
            this.f12986e = colorStateList;
            m15982q();
        }
    }

    public void setSupportImageTintMode(Mode mode) {
        if (this.f12987f != mode) {
            this.f12987f = mode;
            m15982q();
        }
    }

    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().mo15826H();
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().mo15826H();
    }

    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().mo15826H();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f12993l != z) {
            this.f12993l = z;
            getImpl().mo15819A();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public void mo15809t(C2027b bVar, boolean z) {
        getImpl().mo15842Y(m15984u(bVar), z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f12988g != colorStateList) {
            this.f12988g = colorStateList;
            getImpl().mo15836R(this.f12988g);
        }
    }
}
