package com.tv91.p210r;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.chip.ninetyonetv.R;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.v */
public final class LayoutPurchaseDetailBinding implements ViewBinding {

    /* renamed from: a */
    private final ConstraintLayout f14642a;

    /* renamed from: b */
    public final TextView f14643b;

    /* renamed from: c */
    public final TextView f14644c;

    /* renamed from: d */
    public final TextView f14645d;

    /* renamed from: e */
    public final TextView f14646e;

    /* renamed from: f */
    public final TextView f14647f;

    /* renamed from: g */
    public final TextView f14648g;

    /* renamed from: h */
    public final View f14649h;

    private LayoutPurchaseDetailBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, View view) {
        this.f14642a = constraintLayout;
        this.f14643b = textView;
        this.f14644c = textView2;
        this.f14645d = textView3;
        this.f14646e = textView4;
        this.f14647f = textView5;
        this.f14648g = textView6;
        this.f14649h = view;
    }

    /* renamed from: b */
    public static LayoutPurchaseDetailBinding m17817b(View view) {
        int i = R.id.text_deposit_description;
        TextView textView = (TextView) view.findViewById(R.id.text_deposit_description);
        if (textView != null) {
            i = R.id.text_deposit_method;
            TextView textView2 = (TextView) view.findViewById(R.id.text_deposit_method);
            if (textView2 != null) {
                i = R.id.text_deposit_point;
                TextView textView3 = (TextView) view.findViewById(R.id.text_deposit_point);
                if (textView3 != null) {
                    i = R.id.text_deposit_point_unit;
                    TextView textView4 = (TextView) view.findViewById(R.id.text_deposit_point_unit);
                    if (textView4 != null) {
                        i = R.id.text_deposit_price;
                        TextView textView5 = (TextView) view.findViewById(R.id.text_deposit_price);
                        if (textView5 != null) {
                            i = R.id.text_deposit_price_currency;
                            TextView textView6 = (TextView) view.findViewById(R.id.text_deposit_price_currency);
                            if (textView6 != null) {
                                i = R.id.view_divider_1;
                                View findViewById = view.findViewById(R.id.view_divider_1);
                                if (findViewById != null) {
                                    LayoutPurchaseDetailBinding vVar = new LayoutPurchaseDetailBinding((ConstraintLayout) view, textView, textView2, textView3, textView4, textView5, textView6, findViewById);
                                    return vVar;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static LayoutPurchaseDetailBinding m17818d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_purchase_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m17817b(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo5604a() {
        return this.f14642a;
    }
}
