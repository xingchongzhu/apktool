package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.view.View;
import java.util.ArrayList;
import p067c.p068a.p069a.p114b.p115a0.RippleUtils;
import p067c.p068a.p069a.p114b.p116b0.ShadowViewDelegate;

/* renamed from: com.google.android.material.floatingactionbutton.c */
class FloatingActionButtonImplLollipop extends FloatingActionButtonImpl {
    FloatingActionButtonImplLollipop(FloatingActionButton floatingActionButton, ShadowViewDelegate bVar) {
        super(floatingActionButton, bVar);
    }

    /* renamed from: e0 */
    private Animator m16089e0(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f13018F, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f13018F, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
        animatorSet.setInterpolator(FloatingActionButtonImpl.f13006a);
        return animatorSet;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: A */
    public void mo15819A() {
        mo15845b0();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: C */
    public void mo15821C(int[] iArr) {
        if (VERSION.SDK_INT != 21) {
            return;
        }
        if (this.f13018F.isEnabled()) {
            this.f13018F.setElevation(this.f13032o);
            if (this.f13018F.isPressed()) {
                this.f13018F.setTranslationZ(this.f13034q);
            } else if (this.f13018F.isFocused() || this.f13018F.isHovered()) {
                this.f13018F.setTranslationZ(this.f13033p);
            } else {
                this.f13018F.setTranslationZ(0.0f);
            }
        } else {
            this.f13018F.setElevation(0.0f);
            this.f13018F.setTranslationZ(0.0f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: D */
    public void mo15822D(float f, float f2, float f3) {
        int i = VERSION.SDK_INT;
        if (i == 21) {
            this.f13018F.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(FloatingActionButtonImpl.f13007b, m16089e0(f, f3));
            stateListAnimator.addState(FloatingActionButtonImpl.f13008c, m16089e0(f, f2));
            stateListAnimator.addState(FloatingActionButtonImpl.f13009d, m16089e0(f, f2));
            stateListAnimator.addState(FloatingActionButtonImpl.f13010e, m16089e0(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f13018F, "elevation", new float[]{f}).setDuration(0));
            if (i >= 22 && i <= 24) {
                FloatingActionButton floatingActionButton = this.f13018F;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, new float[]{floatingActionButton.getTranslationZ()}).setDuration(100));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f13018F, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(FloatingActionButtonImpl.f13006a);
            stateListAnimator.addState(FloatingActionButtonImpl.f13011f, animatorSet);
            stateListAnimator.addState(FloatingActionButtonImpl.f13012g, m16089e0(0.0f, 0.0f));
            this.f13018F.setStateListAnimator(stateListAnimator);
        }
        if (mo15840V()) {
            mo15845b0();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: I */
    public boolean mo15827I() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: R */
    public void mo15836R(ColorStateList colorStateList) {
        Drawable drawable = this.f13027j;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(RippleUtils.m11253d(colorStateList));
        } else {
            super.mo15836R(colorStateList);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: V */
    public boolean mo15840V() {
        return this.f13019G.mo7818c() || !mo15841X();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Z */
    public void mo15843Z() {
    }

    /* renamed from: m */
    public float mo15851m() {
        return this.f13018F.getElevation();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public void mo15855r(Rect rect) {
        if (this.f13019G.mo7818c()) {
            super.mo15855r(rect);
        } else if (!mo15841X()) {
            int sizeDimension = (this.f13035r - this.f13018F.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y */
    public void mo15862y() {
    }
}
