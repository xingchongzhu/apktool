package com.tv91.p210r;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.widget.DrawableTextView;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.f0 */
public final class ViewFeedbackBinding implements ViewBinding {

    /* renamed from: a */
    private final ConstraintLayout f14356a;

    /* renamed from: b */
    public final ConstraintLayout f14357b;

    /* renamed from: c */
    public final LinearLayout f14358c;

    /* renamed from: d */
    public final ProgressBar f14359d;

    /* renamed from: e */
    public final RecyclerView f14360e;

    /* renamed from: f */
    public final TextView f14361f;

    /* renamed from: g */
    public final DrawableTextView f14362g;

    /* renamed from: h */
    public final LayoutToolbarTextTitleBinding f14363h;

    /* renamed from: i */
    public final Guideline f14364i;

    private ViewFeedbackBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, LinearLayout linearLayout, ProgressBar progressBar, RecyclerView recyclerView, TextView textView, DrawableTextView drawableTextView, LayoutToolbarTextTitleBinding yVar, Guideline guideline) {
        this.f14356a = constraintLayout;
        this.f14357b = constraintLayout2;
        this.f14358c = linearLayout;
        this.f14359d = progressBar;
        this.f14360e = recyclerView;
        this.f14361f = textView;
        this.f14362g = drawableTextView;
        this.f14363h = yVar;
        this.f14364i = guideline;
    }

    /* renamed from: b */
    public static ViewFeedbackBinding m17712b(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.layout_feedback_header;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.layout_feedback_header);
        if (linearLayout != null) {
            i = R.id.progress_feedback;
            ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.progress_feedback);
            if (progressBar != null) {
                i = R.id.recycler_feedback;
                RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_feedback);
                if (recyclerView != null) {
                    i = R.id.text_feedback_empty;
                    TextView textView = (TextView) view.findViewById(R.id.text_feedback_empty);
                    if (textView != null) {
                        i = R.id.text_feedback_online;
                        DrawableTextView drawableTextView = (DrawableTextView) view.findViewById(R.id.text_feedback_online);
                        if (drawableTextView != null) {
                            i = R.id.toolbar_feedback;
                            View findViewById = view.findViewById(R.id.toolbar_feedback);
                            if (findViewById != null) {
                                LayoutToolbarTextTitleBinding b = LayoutToolbarTextTitleBinding.m17835b(findViewById);
                                i = R.id.toolbar_guideline;
                                Guideline guideline = (Guideline) view.findViewById(R.id.toolbar_guideline);
                                if (guideline != null) {
                                    ViewFeedbackBinding f0Var = new ViewFeedbackBinding((ConstraintLayout) view, constraintLayout, linearLayout, progressBar, recyclerView, textView, drawableTextView, b, guideline);
                                    return f0Var;
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
        return this.f14356a;
    }
}
