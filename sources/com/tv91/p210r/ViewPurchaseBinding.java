package com.tv91.p210r;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.chip.ninetyonetv.R;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.t0 */
public final class ViewPurchaseBinding implements ViewBinding {

    /* renamed from: a */
    private final ConstraintLayout f14612a;

    /* renamed from: b */
    public final RecyclerView f14613b;

    /* renamed from: c */
    public final ConstraintLayout f14614c;

    /* renamed from: d */
    public final ProgressBar f14615d;

    /* renamed from: e */
    public final ScrollView f14616e;

    /* renamed from: f */
    public final TextView f14617f;

    /* renamed from: g */
    public final TextView f14618g;

    /* renamed from: h */
    public final Guideline f14619h;

    /* renamed from: i */
    public final LayoutToolbarTextTitleBinding f14620i;

    private ViewPurchaseBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, ConstraintLayout constraintLayout2, ProgressBar progressBar, ScrollView scrollView, TextView textView, TextView textView2, Guideline guideline, LayoutToolbarTextTitleBinding yVar) {
        this.f14612a = constraintLayout;
        this.f14613b = recyclerView;
        this.f14614c = constraintLayout2;
        this.f14615d = progressBar;
        this.f14616e = scrollView;
        this.f14617f = textView;
        this.f14618g = textView2;
        this.f14619h = guideline;
        this.f14620i = yVar;
    }

    /* renamed from: b */
    public static ViewPurchaseBinding m17808b(View view) {
        int i = R.id.grid_purchase_package;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.grid_purchase_package);
        if (recyclerView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.progress_purchase;
            ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.progress_purchase);
            if (progressBar != null) {
                i = R.id.scrollView_purchase;
                ScrollView scrollView = (ScrollView) view.findViewById(R.id.scrollView_purchase);
                if (scrollView != null) {
                    i = R.id.text_purchase_user_point;
                    TextView textView = (TextView) view.findViewById(R.id.text_purchase_user_point);
                    if (textView != null) {
                        i = R.id.text_vip_exchange_option;
                        TextView textView2 = (TextView) view.findViewById(R.id.text_vip_exchange_option);
                        if (textView2 != null) {
                            i = R.id.toolbar_guideline;
                            Guideline guideline = (Guideline) view.findViewById(R.id.toolbar_guideline);
                            if (guideline != null) {
                                i = R.id.toolbar_purchase;
                                View findViewById = view.findViewById(R.id.toolbar_purchase);
                                if (findViewById != null) {
                                    ViewPurchaseBinding t0Var = new ViewPurchaseBinding(constraintLayout, recyclerView, constraintLayout, progressBar, scrollView, textView, textView2, guideline, LayoutToolbarTextTitleBinding.m17835b(findViewById));
                                    return t0Var;
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
        return this.f14612a;
    }
}
