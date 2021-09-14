package com.tv91.p210r;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.chip.ninetyonetv.R;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.j */
public final class AdapterPaymentBinding implements ViewBinding {

    /* renamed from: a */
    private final ConstraintLayout f14412a;

    /* renamed from: b */
    public final ConstraintLayout f14413b;

    /* renamed from: c */
    public final TextView f14414c;

    /* renamed from: d */
    public final TextView f14415d;

    /* renamed from: e */
    public final TextView f14416e;

    /* renamed from: f */
    public final TextView f14417f;

    /* renamed from: g */
    public final TextView f14418g;

    /* renamed from: h */
    public final TextView f14419h;

    private AdapterPaymentBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.f14412a = constraintLayout;
        this.f14413b = constraintLayout2;
        this.f14414c = textView;
        this.f14415d = textView2;
        this.f14416e = textView3;
        this.f14417f = textView4;
        this.f14418g = textView5;
        this.f14419h = textView6;
    }

    /* renamed from: b */
    public static AdapterPaymentBinding m17736b(View view) {
        int i = R.id.layout_payment_item;
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.layout_payment_item);
        if (constraintLayout != null) {
            i = R.id.text_payment_currency;
            TextView textView = (TextView) view.findViewById(R.id.text_payment_currency);
            if (textView != null) {
                i = R.id.text_payment_extra;
                TextView textView2 = (TextView) view.findViewById(R.id.text_payment_extra);
                if (textView2 != null) {
                    i = R.id.text_payment_item;
                    TextView textView3 = (TextView) view.findViewById(R.id.text_payment_item);
                    if (textView3 != null) {
                        i = R.id.text_payment_item_desc;
                        TextView textView4 = (TextView) view.findViewById(R.id.text_payment_item_desc);
                        if (textView4 != null) {
                            i = R.id.text_payment_item_sub;
                            TextView textView5 = (TextView) view.findViewById(R.id.text_payment_item_sub);
                            if (textView5 != null) {
                                i = R.id.text_payment_price;
                                TextView textView6 = (TextView) view.findViewById(R.id.text_payment_price);
                                if (textView6 != null) {
                                    AdapterPaymentBinding jVar = new AdapterPaymentBinding((ConstraintLayout) view, constraintLayout, textView, textView2, textView3, textView4, textView5, textView6);
                                    return jVar;
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
    public static AdapterPaymentBinding m17737d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.adapter_payment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m17736b(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo5604a() {
        return this.f14412a;
    }
}
