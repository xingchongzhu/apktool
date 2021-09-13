package com.tv91.p210r;

import android.view.View;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.chip.ninetyonetv.R;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.e0 */
public final class ViewFavoriteBinding implements ViewBinding {

    /* renamed from: a */
    private final ConstraintLayout f14345a;

    /* renamed from: b */
    public final ConstraintLayout f14346b;

    /* renamed from: c */
    public final ProgressBar f14347c;

    /* renamed from: d */
    public final RecyclerView f14348d;

    /* renamed from: e */
    public final LayoutToolbarTextTitleBinding f14349e;

    /* renamed from: f */
    public final Guideline f14350f;

    private ViewFavoriteBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ProgressBar progressBar, RecyclerView recyclerView, LayoutToolbarTextTitleBinding yVar, Guideline guideline) {
        this.f14345a = constraintLayout;
        this.f14346b = constraintLayout2;
        this.f14347c = progressBar;
        this.f14348d = recyclerView;
        this.f14349e = yVar;
        this.f14350f = guideline;
    }

    /* renamed from: b */
    public static ViewFavoriteBinding m17705b(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.progress_favorite;
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.progress_favorite);
        if (progressBar != null) {
            i = R.id.recycler_favorite;
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_favorite);
            if (recyclerView != null) {
                i = R.id.toolbar_favorite;
                View findViewById = view.findViewById(R.id.toolbar_favorite);
                if (findViewById != null) {
                    LayoutToolbarTextTitleBinding b = LayoutToolbarTextTitleBinding.m17835b(findViewById);
                    i = R.id.toolbar_guideline;
                    Guideline guideline = (Guideline) view.findViewById(R.id.toolbar_guideline);
                    if (guideline != null) {
                        ViewFavoriteBinding e0Var = new ViewFavoriteBinding((ConstraintLayout) view, constraintLayout, progressBar, recyclerView, b, guideline);
                        return e0Var;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public ConstraintLayout mo5604a() {
        return this.f14345a;
    }
}
