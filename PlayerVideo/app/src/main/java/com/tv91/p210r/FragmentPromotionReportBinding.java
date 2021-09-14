package com.tv91.p210r;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.chip.ninetyonetv.R;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.s */
public final class FragmentPromotionReportBinding implements ViewBinding {

    /* renamed from: a */
    private final ConstraintLayout f14580a;

    /* renamed from: b */
    public final Button f14581b;

    /* renamed from: c */
    public final ConstraintLayout f14582c;

    /* renamed from: d */
    public final RecyclerView f14583d;

    /* renamed from: e */
    public final TextView f14584e;

    private FragmentPromotionReportBinding(ConstraintLayout constraintLayout, Button button, ConstraintLayout constraintLayout2, RecyclerView recyclerView, TextView textView) {
        this.f14580a = constraintLayout;
        this.f14581b = button;
        this.f14582c = constraintLayout2;
        this.f14583d = recyclerView;
        this.f14584e = textView;
    }

    /* renamed from: b */
    public static FragmentPromotionReportBinding m17799b(View view) {
        int i = R.id.button_promotion_report_withdraw;
        Button button = (Button) view.findViewById(R.id.button_promotion_report_withdraw);
        if (button != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.recycler_promotion_report;
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_promotion_report);
            if (recyclerView != null) {
                i = R.id.text_promotion_report_withdraw_money;
                TextView textView = (TextView) view.findViewById(R.id.text_promotion_report_withdraw_money);
                if (textView != null) {
                    FragmentPromotionReportBinding sVar = new FragmentPromotionReportBinding(constraintLayout, button, constraintLayout, recyclerView, textView);
                    return sVar;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public ConstraintLayout mo5604a() {
        return this.f14580a;
    }
}
