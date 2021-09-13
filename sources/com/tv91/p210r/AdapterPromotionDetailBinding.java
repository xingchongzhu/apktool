package com.tv91.p210r;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.chip.ninetyonetv.R;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.n */
public final class AdapterPromotionDetailBinding implements ViewBinding {

    /* renamed from: a */
    private final ConstraintLayout f14501a;

    /* renamed from: b */
    public final TextView f14502b;

    /* renamed from: c */
    public final TextView f14503c;

    /* renamed from: d */
    public final TextView f14504d;

    /* renamed from: e */
    public final View f14505e;

    private AdapterPromotionDetailBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, View view) {
        this.f14501a = constraintLayout;
        this.f14502b = textView;
        this.f14503c = textView2;
        this.f14504d = textView3;
        this.f14505e = view;
    }

    /* renamed from: b */
    public static AdapterPromotionDetailBinding m17764b(View view) {
        int i = R.id.text_promotiondetail_date;
        TextView textView = (TextView) view.findViewById(R.id.text_promotiondetail_date);
        if (textView != null) {
            i = R.id.text_promotiondetail_effect;
            TextView textView2 = (TextView) view.findViewById(R.id.text_promotiondetail_effect);
            if (textView2 != null) {
                i = R.id.text_promotiondetail_name;
                TextView textView3 = (TextView) view.findViewById(R.id.text_promotiondetail_name);
                if (textView3 != null) {
                    i = R.id.view_promotiondetail_divider;
                    View findViewById = view.findViewById(R.id.view_promotiondetail_divider);
                    if (findViewById != null) {
                        AdapterPromotionDetailBinding nVar = new AdapterPromotionDetailBinding((ConstraintLayout) view, textView, textView2, textView3, findViewById);
                        return nVar;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static AdapterPromotionDetailBinding m17765d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.adapter_promotion_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m17764b(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo5604a() {
        return this.f14501a;
    }
}
