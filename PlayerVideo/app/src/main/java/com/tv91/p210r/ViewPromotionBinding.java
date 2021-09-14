package com.tv91.p210r;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.chip.ninetyonetv.R;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.p0 */
public final class ViewPromotionBinding implements ViewBinding {

    /* renamed from: a */
    private final ConstraintLayout f14542a;

    /* renamed from: b */
    public final Guideline f14543b;

    /* renamed from: c */
    public final LinearLayout f14544c;

    /* renamed from: d */
    public final ConstraintLayout f14545d;

    /* renamed from: e */
    public final RecyclerView f14546e;

    /* renamed from: f */
    public final TextView f14547f;

    /* renamed from: g */
    public final Guideline f14548g;

    /* renamed from: h */
    public final LayoutToolbarTextTitleBinding f14549h;

    private ViewPromotionBinding(ConstraintLayout constraintLayout, Guideline guideline, LinearLayout linearLayout, ConstraintLayout constraintLayout2, RecyclerView recyclerView, TextView textView, Guideline guideline2, LayoutToolbarTextTitleBinding yVar) {
        this.f14542a = constraintLayout;
        this.f14543b = guideline;
        this.f14544c = linearLayout;
        this.f14545d = constraintLayout2;
        this.f14546e = recyclerView;
        this.f14547f = textView;
        this.f14548g = guideline2;
        this.f14549h = yVar;
    }

    /* renamed from: b */
    public static ViewPromotionBinding m17781b(View view) {
        int i = R.id.bottom_bar_guideline;
        Guideline guideline = (Guideline) view.findViewById(R.id.bottom_bar_guideline);
        if (guideline != null) {
            i = R.id.bottom_nav;
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.bottom_nav);
            if (linearLayout != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = R.id.recycler_promotion;
                RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_promotion);
                if (recyclerView != null) {
                    i = R.id.text_promotion_empty;
                    TextView textView = (TextView) view.findViewById(R.id.text_promotion_empty);
                    if (textView != null) {
                        i = R.id.toolbar_guideline;
                        Guideline guideline2 = (Guideline) view.findViewById(R.id.toolbar_guideline);
                        if (guideline2 != null) {
                            i = R.id.toolbar_promotion;
                            View findViewById = view.findViewById(R.id.toolbar_promotion);
                            if (findViewById != null) {
                                ViewPromotionBinding p0Var = new ViewPromotionBinding(constraintLayout, guideline, linearLayout, constraintLayout, recyclerView, textView, guideline2, LayoutToolbarTextTitleBinding.m17835b(findViewById));
                                return p0Var;
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
        return this.f14542a;
    }
}
