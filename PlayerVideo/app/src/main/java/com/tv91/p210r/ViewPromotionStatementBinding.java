package com.tv91.p210r;

import android.view.View;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewpager.widget.ViewPager;
import com.chip.ninetyonetv.R;
import com.google.android.material.tabs.TabLayout;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.r0 */
public final class ViewPromotionStatementBinding implements ViewBinding {

    /* renamed from: a */
    private final ConstraintLayout f14573a;

    /* renamed from: b */
    public final ConstraintLayout f14574b;

    /* renamed from: c */
    public final ViewPager f14575c;

    /* renamed from: d */
    public final ProgressBar f14576d;

    /* renamed from: e */
    public final TabLayout f14577e;

    /* renamed from: f */
    public final Guideline f14578f;

    /* renamed from: g */
    public final LayoutToolbarTextTitleBinding f14579g;

    private ViewPromotionStatementBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ViewPager viewPager, ProgressBar progressBar, TabLayout tabLayout, Guideline guideline, LayoutToolbarTextTitleBinding yVar) {
        this.f14573a = constraintLayout;
        this.f14574b = constraintLayout2;
        this.f14575c = viewPager;
        this.f14576d = progressBar;
        this.f14577e = tabLayout;
        this.f14578f = guideline;
        this.f14579g = yVar;
    }

    /* renamed from: b */
    public static ViewPromotionStatementBinding m17796b(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.pager_promotion_statement;
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.pager_promotion_statement);
        if (viewPager != null) {
            i = R.id.progress_promotion_statement;
            ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.progress_promotion_statement);
            if (progressBar != null) {
                i = R.id.tab_promotion_statement;
                TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tab_promotion_statement);
                if (tabLayout != null) {
                    i = R.id.toolbar_guideline;
                    Guideline guideline = (Guideline) view.findViewById(R.id.toolbar_guideline);
                    if (guideline != null) {
                        i = R.id.toolbar_promotion_statement;
                        View findViewById = view.findViewById(R.id.toolbar_promotion_statement);
                        if (findViewById != null) {
                            ViewPromotionStatementBinding r0Var = new ViewPromotionStatementBinding((ConstraintLayout) view, constraintLayout, viewPager, progressBar, tabLayout, guideline, LayoutToolbarTextTitleBinding.m17835b(findViewById));
                            return r0Var;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public ConstraintLayout mo5604a() {
        return this.f14573a;
    }
}
