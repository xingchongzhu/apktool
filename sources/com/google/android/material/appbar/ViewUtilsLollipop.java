package com.google.android.material.appbar;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;
import p067c.p068a.p069a.p114b.C1270b;
import p067c.p068a.p069a.p114b.C1292g;

/* renamed from: com.google.android.material.appbar.e */
class ViewUtilsLollipop {

    /* renamed from: a */
    private static final int[] f12528a = {16843848};

    /* renamed from: a */
    static void m15309a(View view, float f) {
        int integer = view.getResources().getInteger(C1292g.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        String str = "elevation";
        long j = (long) integer;
        stateListAnimator.addState(new int[]{16842766, C1270b.state_liftable, -C1270b.state_lifted}, ObjectAnimator.ofFloat(view, str, new float[]{0.0f}).setDuration(j));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view, str, new float[]{f}).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, str, new float[]{0.0f}).setDuration(0));
        view.setStateListAnimator(stateListAnimator);
    }
}
