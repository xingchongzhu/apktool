package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import p067c.p068a.p069a.p114b.p119m.AnimationUtils;

/* renamed from: com.google.android.material.tabs.a */
class ElasticTabIndicatorInterpolator extends TabIndicatorInterpolator {
    ElasticTabIndicatorInterpolator() {
    }

    /* renamed from: e */
    private static float m16360e(float f) {
        double d = (double) f;
        Double.isNaN(d);
        return (float) (1.0d - Math.cos((d * 3.141592653589793d) / 2.0d));
    }

    /* renamed from: f */
    private static float m16361f(float f) {
        double d = (double) f;
        Double.isNaN(d);
        return (float) Math.sin((d * 3.141592653589793d) / 2.0d);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo16163c(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float f2;
        float f3;
        RectF a = TabIndicatorInterpolator.m16363a(tabLayout, view);
        RectF a2 = TabIndicatorInterpolator.m16363a(tabLayout, view2);
        if (a.left < a2.left) {
            f3 = m16360e(f);
            f2 = m16361f(f);
        } else {
            f3 = m16361f(f);
            f2 = m16360e(f);
        }
        drawable.setBounds(AnimationUtils.m11473b((int) a.left, (int) a2.left, f3), drawable.getBounds().top, AnimationUtils.m11473b((int) a.right, (int) a2.right, f2), drawable.getBounds().bottom);
    }
}
