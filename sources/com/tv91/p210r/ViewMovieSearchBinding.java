package com.tv91.p210r;

import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.chip.ninetyonetv.R;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.l0 */
public final class ViewMovieSearchBinding implements ViewBinding {

    /* renamed from: a */
    private final ConstraintLayout f14475a;

    /* renamed from: b */
    public final ConstraintLayout f14476b;

    /* renamed from: c */
    public final ProgressBar f14477c;

    /* renamed from: d */
    public final RecyclerView f14478d;

    /* renamed from: e */
    public final EditText f14479e;

    /* renamed from: f */
    public final TextView f14480f;

    /* renamed from: g */
    public final Guideline f14481g;

    /* renamed from: h */
    public final LayoutToolbarTextTitleBinding f14482h;

    private ViewMovieSearchBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ProgressBar progressBar, RecyclerView recyclerView, EditText editText, TextView textView, Guideline guideline, LayoutToolbarTextTitleBinding yVar) {
        this.f14475a = constraintLayout;
        this.f14476b = constraintLayout2;
        this.f14477c = progressBar;
        this.f14478d = recyclerView;
        this.f14479e = editText;
        this.f14480f = textView;
        this.f14481g = guideline;
        this.f14482h = yVar;
    }

    /* renamed from: b */
    public static ViewMovieSearchBinding m17754b(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.progress_movie_search;
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.progress_movie_search);
        if (progressBar != null) {
            i = R.id.recycler_movie_search;
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_movie_search);
            if (recyclerView != null) {
                i = R.id.text_search_query;
                EditText editText = (EditText) view.findViewById(R.id.text_search_query);
                if (editText != null) {
                    i = R.id.text_search_result;
                    TextView textView = (TextView) view.findViewById(R.id.text_search_result);
                    if (textView != null) {
                        i = R.id.toolbar_guideline;
                        Guideline guideline = (Guideline) view.findViewById(R.id.toolbar_guideline);
                        if (guideline != null) {
                            i = R.id.toolbar_movie_search;
                            View findViewById = view.findViewById(R.id.toolbar_movie_search);
                            if (findViewById != null) {
                                ViewMovieSearchBinding l0Var = new ViewMovieSearchBinding((ConstraintLayout) view, constraintLayout, progressBar, recyclerView, editText, textView, guideline, LayoutToolbarTextTitleBinding.m17835b(findViewById));
                                return l0Var;
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
        return this.f14475a;
    }
}
