package com.tv91.p210r;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.chip.ninetyonetv.R;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.k */
public final class AdapterPaymentHistoryBinding implements ViewBinding {

    /* renamed from: a */
    private final LinearLayout f14435a;

    /* renamed from: b */
    public final TextView f14436b;

    /* renamed from: c */
    public final TextView f14437c;

    /* renamed from: d */
    public final TextView f14438d;

    /* renamed from: e */
    public final TextView f14439e;

    private AdapterPaymentHistoryBinding(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f14435a = linearLayout;
        this.f14436b = textView;
        this.f14437c = textView2;
        this.f14438d = textView3;
        this.f14439e = textView4;
    }

    /* renamed from: b */
    public static AdapterPaymentHistoryBinding m17743b(View view) {
        int i = R.id.text_payment_history_date;
        TextView textView = (TextView) view.findViewById(R.id.text_payment_history_date);
        if (textView != null) {
            i = R.id.text_payment_history_method;
            TextView textView2 = (TextView) view.findViewById(R.id.text_payment_history_method);
            if (textView2 != null) {
                i = R.id.text_payment_history_point;
                TextView textView3 = (TextView) view.findViewById(R.id.text_payment_history_point);
                if (textView3 != null) {
                    i = R.id.text_payment_history_price;
                    TextView textView4 = (TextView) view.findViewById(R.id.text_payment_history_price);
                    if (textView4 != null) {
                        AdapterPaymentHistoryBinding kVar = new AdapterPaymentHistoryBinding((LinearLayout) view, textView, textView2, textView3, textView4);
                        return kVar;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static AdapterPaymentHistoryBinding m17744d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.adapter_payment_history, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m17743b(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo5604a() {
        return this.f14435a;
    }
}
