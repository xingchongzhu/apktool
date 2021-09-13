package com.tv91.p210r;

import android.view.View;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.recyclerview.widget.RecyclerView;
import com.chip.ninetyonetv.R;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.t */
public final class LayoutHighlightBinding implements ViewBinding {

    /* renamed from: a */
    private final ScrollView f14599a;

    /* renamed from: b */
    public final LinearLayout f14600b;

    /* renamed from: c */
    public final GridLayout f14601c;

    /* renamed from: d */
    public final LinearLayout f14602d;

    /* renamed from: e */
    public final ViewFlipper f14603e;

    /* renamed from: f */
    public final ScrollView f14604f;

    /* renamed from: g */
    public final RecyclerView f14605g;

    /* renamed from: h */
    public final RecyclerView f14606h;

    /* renamed from: i */
    public final RecyclerView f14607i;

    /* renamed from: j */
    public final TextView f14608j;

    /* renamed from: k */
    public final TextView f14609k;

    /* renamed from: l */
    public final TextView f14610l;

    /* renamed from: m */
    public final TextView f14611m;

    private LayoutHighlightBinding(ScrollView scrollView, LinearLayout linearLayout, GridLayout gridLayout, LinearLayout linearLayout2, ViewFlipper viewFlipper, ScrollView scrollView2, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f14599a = scrollView;
        this.f14600b = linearLayout;
        this.f14601c = gridLayout;
        this.f14602d = linearLayout2;
        this.f14603e = viewFlipper;
        this.f14604f = scrollView2;
        this.f14605g = recyclerView;
        this.f14606h = recyclerView2;
        this.f14607i = recyclerView3;
        this.f14608j = textView;
        this.f14609k = textView2;
        this.f14610l = textView3;
        this.f14611m = textView4;
    }

    /* renamed from: b */
    public static LayoutHighlightBinding m17805b(View view) {
        View view2 = view;
        int i = R.id.container_group;
        LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.container_group);
        if (linearLayout != null) {
            i = R.id.container_recommend;
            GridLayout gridLayout = (GridLayout) view2.findViewById(R.id.container_recommend);
            if (gridLayout != null) {
                i = R.id.container_web;
                LinearLayout linearLayout2 = (LinearLayout) view2.findViewById(R.id.container_web);
                if (linearLayout2 != null) {
                    i = R.id.flipper_ad;
                    ViewFlipper viewFlipper = (ViewFlipper) view2.findViewById(R.id.flipper_ad);
                    if (viewFlipper != null) {
                        ScrollView scrollView = (ScrollView) view2;
                        i = R.id.recycler_ranking_month;
                        RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.recycler_ranking_month);
                        if (recyclerView != null) {
                            i = R.id.recycler_ranking_top;
                            RecyclerView recyclerView2 = (RecyclerView) view2.findViewById(R.id.recycler_ranking_top);
                            if (recyclerView2 != null) {
                                i = R.id.recycler_ranking_year;
                                RecyclerView recyclerView3 = (RecyclerView) view2.findViewById(R.id.recycler_ranking_year);
                                if (recyclerView3 != null) {
                                    i = R.id.text_ranking_month;
                                    TextView textView = (TextView) view2.findViewById(R.id.text_ranking_month);
                                    if (textView != null) {
                                        i = R.id.text_ranking_top;
                                        TextView textView2 = (TextView) view2.findViewById(R.id.text_ranking_top);
                                        if (textView2 != null) {
                                            i = R.id.text_ranking_year;
                                            TextView textView3 = (TextView) view2.findViewById(R.id.text_ranking_year);
                                            if (textView3 != null) {
                                                i = R.id.text_recommend;
                                                TextView textView4 = (TextView) view2.findViewById(R.id.text_recommend);
                                                if (textView4 != null) {
                                                    LayoutHighlightBinding tVar = new LayoutHighlightBinding(scrollView, linearLayout, gridLayout, linearLayout2, viewFlipper, scrollView, recyclerView, recyclerView2, recyclerView3, textView, textView2, textView3, textView4);
                                                    return tVar;
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
    public ScrollView mo5604a() {
        return this.f14599a;
    }
}
