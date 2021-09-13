package com.tv91.p210r;

import android.view.View;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.chip.ninetyonetv.R;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.u */
public final class LayoutMoviesBinding implements ViewBinding {

    /* renamed from: a */
    private final ConstraintLayout f14621a;

    /* renamed from: b */
    public final ConstraintLayout f14622b;

    /* renamed from: c */
    public final ProgressBar f14623c;

    /* renamed from: d */
    public final RecyclerView f14624d;

    /* renamed from: e */
    public final LayoutToolbarTextTitleBinding f14625e;

    private LayoutMoviesBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ProgressBar progressBar, RecyclerView recyclerView, LayoutToolbarTextTitleBinding yVar) {
        this.f14621a = constraintLayout;
        this.f14622b = constraintLayout2;
        this.f14623c = progressBar;
        this.f14624d = recyclerView;
        this.f14625e = yVar;
    }

    /* renamed from: b */
    public static LayoutMoviesBinding m17811b(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.progress_movies;
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.progress_movies);
        if (progressBar != null) {
            i = R.id.recycler_movies;
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_movies);
            if (recyclerView != null) {
                i = R.id.toolbar_movies;
                View findViewById = view.findViewById(R.id.toolbar_movies);
                if (findViewById != null) {
                    LayoutMoviesBinding uVar = new LayoutMoviesBinding((ConstraintLayout) view, constraintLayout, progressBar, recyclerView, LayoutToolbarTextTitleBinding.m17835b(findViewById));
                    return uVar;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public ConstraintLayout mo5604a() {
        return this.f14621a;
    }
}
