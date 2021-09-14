package com.tv91.p210r;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.chip.ninetyonetv.R;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.z */
public final class ViewActorBinding implements ViewBinding {

    /* renamed from: a */
    private final ConstraintLayout f14686a;

    /* renamed from: b */
    public final Guideline f14687b;

    /* renamed from: c */
    public final LinearLayout f14688c;

    /* renamed from: d */
    public final ConstraintLayout f14689d;

    /* renamed from: e */
    public final ProgressBar f14690e;

    /* renamed from: f */
    public final RecyclerView f14691f;

    /* renamed from: g */
    public final LayoutToolbarTextTitleBinding f14692g;

    /* renamed from: h */
    public final Guideline f14693h;

    private ViewActorBinding(ConstraintLayout constraintLayout, Guideline guideline, LinearLayout linearLayout, ConstraintLayout constraintLayout2, ProgressBar progressBar, RecyclerView recyclerView, LayoutToolbarTextTitleBinding yVar, Guideline guideline2) {
        this.f14686a = constraintLayout;
        this.f14687b = guideline;
        this.f14688c = linearLayout;
        this.f14689d = constraintLayout2;
        this.f14690e = progressBar;
        this.f14691f = recyclerView;
        this.f14692g = yVar;
        this.f14693h = guideline2;
    }

    /* renamed from: b */
    public static ViewActorBinding m17838b(View view) {
        int i = R.id.bottom_bar_guideline;
        Guideline guideline = (Guideline) view.findViewById(R.id.bottom_bar_guideline);
        if (guideline != null) {
            i = R.id.bottom_nav;
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.bottom_nav);
            if (linearLayout != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = R.id.progress_listing_actor;
                ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.progress_listing_actor);
                if (progressBar != null) {
                    i = R.id.recycler_listing_actor;
                    RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_listing_actor);
                    if (recyclerView != null) {
                        i = R.id.toolbar_actor;
                        View findViewById = view.findViewById(R.id.toolbar_actor);
                        if (findViewById != null) {
                            LayoutToolbarTextTitleBinding b = LayoutToolbarTextTitleBinding.m17835b(findViewById);
                            i = R.id.toolbar_guideline;
                            Guideline guideline2 = (Guideline) view.findViewById(R.id.toolbar_guideline);
                            if (guideline2 != null) {
                                ViewActorBinding zVar = new ViewActorBinding(constraintLayout, guideline, linearLayout, constraintLayout, progressBar, recyclerView, b, guideline2);
                                return zVar;
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
        return this.f14686a;
    }
}
