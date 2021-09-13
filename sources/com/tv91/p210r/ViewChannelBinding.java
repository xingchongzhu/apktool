package com.tv91.p210r;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewpager.widget.ViewPager;
import com.chip.ninetyonetv.R;
import com.google.android.material.tabs.TabLayout;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.c0 */
public final class ViewChannelBinding implements ViewBinding {

    /* renamed from: a */
    private final ConstraintLayout f14325a;

    /* renamed from: b */
    public final Guideline f14326b;

    /* renamed from: c */
    public final LinearLayout f14327c;

    /* renamed from: d */
    public final ConstraintLayout f14328d;

    /* renamed from: e */
    public final ViewPager f14329e;

    /* renamed from: f */
    public final TabLayout f14330f;

    /* renamed from: g */
    public final LayoutToolbarImageTitleBinding f14331g;

    /* renamed from: h */
    public final Guideline f14332h;

    private ViewChannelBinding(ConstraintLayout constraintLayout, Guideline guideline, LinearLayout linearLayout, ConstraintLayout constraintLayout2, ViewPager viewPager, TabLayout tabLayout, LayoutToolbarImageTitleBinding xVar, Guideline guideline2) {
        this.f14325a = constraintLayout;
        this.f14326b = guideline;
        this.f14327c = linearLayout;
        this.f14328d = constraintLayout2;
        this.f14329e = viewPager;
        this.f14330f = tabLayout;
        this.f14331g = xVar;
        this.f14332h = guideline2;
    }

    /* renamed from: b */
    public static ViewChannelBinding m17691b(View view) {
        int i = R.id.bottom_bar_guideline;
        Guideline guideline = (Guideline) view.findViewById(R.id.bottom_bar_guideline);
        if (guideline != null) {
            i = R.id.bottom_nav;
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.bottom_nav);
            if (linearLayout != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = R.id.pager_channels;
                ViewPager viewPager = (ViewPager) view.findViewById(R.id.pager_channels);
                if (viewPager != null) {
                    i = R.id.tab_channels;
                    TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tab_channels);
                    if (tabLayout != null) {
                        i = R.id.toolbar_channel;
                        View findViewById = view.findViewById(R.id.toolbar_channel);
                        if (findViewById != null) {
                            LayoutToolbarImageTitleBinding b = LayoutToolbarImageTitleBinding.m17829b(findViewById);
                            i = R.id.toolbar_guideline;
                            Guideline guideline2 = (Guideline) view.findViewById(R.id.toolbar_guideline);
                            if (guideline2 != null) {
                                ViewChannelBinding c0Var = new ViewChannelBinding(constraintLayout, guideline, linearLayout, constraintLayout, viewPager, tabLayout, b, guideline2);
                                return c0Var;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public ConstraintLayout mo5604a() {
        return this.f14325a;
    }
}
