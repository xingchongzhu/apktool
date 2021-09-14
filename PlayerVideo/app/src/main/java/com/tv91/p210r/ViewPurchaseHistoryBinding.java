package com.tv91.p210r;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.chip.ninetyonetv.R;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.u0 */
public final class ViewPurchaseHistoryBinding implements ViewBinding {

    /* renamed from: a */
    private final ConstraintLayout f14626a;

    /* renamed from: b */
    public final Guideline f14627b;

    /* renamed from: c */
    public final ConstraintLayout f14628c;

    /* renamed from: d */
    public final Guideline f14629d;

    /* renamed from: e */
    public final Guideline f14630e;

    /* renamed from: f */
    public final ProgressBar f14631f;

    /* renamed from: g */
    public final TextView f14632g;

    /* renamed from: h */
    public final TextView f14633h;

    /* renamed from: i */
    public final TextView f14634i;

    /* renamed from: j */
    public final TextView f14635j;

    /* renamed from: k */
    public final TextView f14636k;

    /* renamed from: l */
    public final RecyclerView f14637l;

    /* renamed from: m */
    public final Guideline f14638m;

    /* renamed from: n */
    public final TextView f14639n;

    /* renamed from: o */
    public final Guideline f14640o;

    /* renamed from: p */
    public final LayoutToolbarTextTitleBinding f14641p;

    private ViewPurchaseHistoryBinding(ConstraintLayout constraintLayout, Guideline guideline, ConstraintLayout constraintLayout2, Guideline guideline2, Guideline guideline3, ProgressBar progressBar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, RecyclerView recyclerView, Guideline guideline4, TextView textView6, Guideline guideline5, LayoutToolbarTextTitleBinding yVar) {
        this.f14626a = constraintLayout;
        this.f14627b = guideline;
        this.f14628c = constraintLayout2;
        this.f14629d = guideline2;
        this.f14630e = guideline3;
        this.f14631f = progressBar;
        this.f14632g = textView;
        this.f14633h = textView2;
        this.f14634i = textView3;
        this.f14635j = textView4;
        this.f14636k = textView5;
        this.f14637l = recyclerView;
        this.f14638m = guideline4;
        this.f14639n = textView6;
        this.f14640o = guideline5;
        this.f14641p = yVar;
    }

    /* renamed from: b */
    public static ViewPurchaseHistoryBinding m17814b(View view) {
        View view2 = view;
        int i = R.id.head_guideline;
        Guideline guideline = (Guideline) view2.findViewById(R.id.head_guideline);
        if (guideline != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view2;
            i = R.id.left_padding_guideline;
            Guideline guideline2 = (Guideline) view2.findViewById(R.id.left_padding_guideline);
            if (guideline2 != null) {
                i = R.id.movie_image_guideline;
                Guideline guideline3 = (Guideline) view2.findViewById(R.id.movie_image_guideline);
                if (guideline3 != null) {
                    i = R.id.progress_purchase_history;
                    ProgressBar progressBar = (ProgressBar) view2.findViewById(R.id.progress_purchase_history);
                    if (progressBar != null) {
                        i = R.id.purchase_history_desc_head;
                        TextView textView = (TextView) view2.findViewById(R.id.purchase_history_desc_head);
                        if (textView != null) {
                            i = R.id.purchase_history_name_head;
                            TextView textView2 = (TextView) view2.findViewById(R.id.purchase_history_name_head);
                            if (textView2 != null) {
                                i = R.id.purchase_history_point_head;
                                TextView textView3 = (TextView) view2.findViewById(R.id.purchase_history_point_head);
                                if (textView3 != null) {
                                    i = R.id.purchase_history_time_end_head;
                                    TextView textView4 = (TextView) view2.findViewById(R.id.purchase_history_time_end_head);
                                    if (textView4 != null) {
                                        i = R.id.purchase_history_time_start_head;
                                        TextView textView5 = (TextView) view2.findViewById(R.id.purchase_history_time_start_head);
                                        if (textView5 != null) {
                                            i = R.id.recycler_purchase_history;
                                            RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.recycler_purchase_history);
                                            if (recyclerView != null) {
                                                i = R.id.right_padding_guideline;
                                                Guideline guideline4 = (Guideline) view2.findViewById(R.id.right_padding_guideline);
                                                if (guideline4 != null) {
                                                    i = R.id.text_purchase_history_empty;
                                                    TextView textView6 = (TextView) view2.findViewById(R.id.text_purchase_history_empty);
                                                    if (textView6 != null) {
                                                        i = R.id.toolbar_guideline;
                                                        Guideline guideline5 = (Guideline) view2.findViewById(R.id.toolbar_guideline);
                                                        if (guideline5 != null) {
                                                            i = R.id.toolbar_purchase_history;
                                                            View findViewById = view2.findViewById(R.id.toolbar_purchase_history);
                                                            if (findViewById != null) {
                                                                ViewPurchaseHistoryBinding u0Var = new ViewPurchaseHistoryBinding(constraintLayout, guideline, constraintLayout, guideline2, guideline3, progressBar, textView, textView2, textView3, textView4, textView5, recyclerView, guideline4, textView6, guideline5, LayoutToolbarTextTitleBinding.m17835b(findViewById));
                                                                return u0Var;
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public ConstraintLayout mo5604a() {
        return this.f14626a;
    }
}
