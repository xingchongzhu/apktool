package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.C2053k;
import com.google.android.material.tabs.TabLayout.C2075i;
import p067c.p068a.p069a.p114b.p119m.AnimationUtils;

/* renamed from: com.google.android.material.tabs.b */
class TabIndicatorInterpolator {
    TabIndicatorInterpolator() {
    }

    /* renamed from: a */
    static RectF m16363a(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.mo16115z() || !(view instanceof C2075i)) {
            return new RectF((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom());
        }
        return m16364b((C2075i) view, 24);
    }

    /* renamed from: b */
    static RectF m16364b(C2075i iVar, int i) {
        int contentWidth = iVar.getContentWidth();
        int contentHeight = iVar.getContentHeight();
        int b = (int) C2053k.m16231b(iVar.getContext(), i);
        if (contentWidth < b) {
            contentWidth = b;
        }
        int left = (iVar.getLeft() + iVar.getRight()) / 2;
        int top = (iVar.getTop() + iVar.getBottom()) / 2;
        int i2 = contentWidth / 2;
        return new RectF((float) (left - i2), (float) (top - (contentHeight / 2)), (float) (i2 + left), (float) (top + (left / 2)));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo16163c(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF a = m16363a(tabLayout, view);
        RectF a2 = m16363a(tabLayout, view2);
        drawable.setBounds(AnimationUtils.m11473b((int) a.left, (int) a2.left, f), drawable.getBounds().top, AnimationUtils.m11473b((int) a.right, (int) a2.right, f), drawable.getBounds().bottom);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo16164d(TabLayout tabLayout, View view, Drawable drawable) {
        RectF a = m16363a(tabLayout, view);
        drawable.setBounds((int) a.left, drawable.getBounds().top, (int) a.right, drawable.getBounds().bottom);
    }
}
