package com.tv91.p210r;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.chip.ninetyonetv.R;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.a0 */
public final class ViewCategoryBinding implements ViewBinding {

    /* renamed from: a */
    private final ConstraintLayout f14287a;

    /* renamed from: b */
    public final Guideline f14288b;

    /* renamed from: c */
    public final LinearLayout f14289c;

    /* renamed from: d */
    public final ConstraintLayout f14290d;

    /* renamed from: e */
    public final FrameLayout f14291e;

    /* renamed from: f */
    public final FrameLayout f14292f;

    /* renamed from: g */
    public final FrameLayout f14293g;

    /* renamed from: h */
    public final ProgressBar f14294h;

    /* renamed from: i */
    public final RecyclerView f14295i;

    /* renamed from: j */
    public final SearchView f14296j;

    /* renamed from: k */
    public final LayoutToolbarTextTitleBinding f14297k;

    /* renamed from: l */
    public final Guideline f14298l;

    private ViewCategoryBinding(ConstraintLayout constraintLayout, Guideline guideline, LinearLayout linearLayout, ConstraintLayout constraintLayout2, FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3, ProgressBar progressBar, RecyclerView recyclerView, SearchView searchView, LayoutToolbarTextTitleBinding yVar, Guideline guideline2) {
        this.f14287a = constraintLayout;
        this.f14288b = guideline;
        this.f14289c = linearLayout;
        this.f14290d = constraintLayout2;
        this.f14291e = frameLayout;
        this.f14292f = frameLayout2;
        this.f14293g = frameLayout3;
        this.f14294h = progressBar;
        this.f14295i = recyclerView;
        this.f14296j = searchView;
        this.f14297k = yVar;
        this.f14298l = guideline2;
    }

    /* renamed from: b */
    public static ViewCategoryBinding m17677b(View view) {
        int i = R.id.bottom_bar_guideline;
        Guideline guideline = (Guideline) view.findViewById(R.id.bottom_bar_guideline);
        if (guideline != null) {
            i = R.id.bottom_nav;
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.bottom_nav);
            if (linearLayout != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = R.id.layout_rank_day;
                FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.layout_rank_day);
                if (frameLayout != null) {
                    i = R.id.layout_rank_month;
                    FrameLayout frameLayout2 = (FrameLayout) view.findViewById(R.id.layout_rank_month);
                    if (frameLayout2 != null) {
                        i = R.id.layout_rank_year;
                        FrameLayout frameLayout3 = (FrameLayout) view.findViewById(R.id.layout_rank_year);
                        if (frameLayout3 != null) {
                            i = R.id.progress_category;
                            ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.progress_category);
                            if (progressBar != null) {
                                i = R.id.recycler_category_list;
                                RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_category_list);
                                if (recyclerView != null) {
                                    i = R.id.search_category;
                                    SearchView searchView = (SearchView) view.findViewById(R.id.search_category);
                                    if (searchView != null) {
                                        i = R.id.toolbar_category;
                                        View findViewById = view.findViewById(R.id.toolbar_category);
                                        if (findViewById != null) {
                                            LayoutToolbarTextTitleBinding b = LayoutToolbarTextTitleBinding.m17835b(findViewById);
                                            i = R.id.toolbar_guideline;
                                            Guideline guideline2 = (Guideline) view.findViewById(R.id.toolbar_guideline);
                                            if (guideline2 != null) {
                                                ViewCategoryBinding a0Var = new ViewCategoryBinding(constraintLayout, guideline, linearLayout, constraintLayout, frameLayout, frameLayout2, frameLayout3, progressBar, recyclerView, searchView, b, guideline2);
                                                return a0Var;
                                            }
                                        }
                                    }
                                }
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
        return this.f14287a;
    }
}
