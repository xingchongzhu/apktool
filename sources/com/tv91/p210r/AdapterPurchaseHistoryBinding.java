package com.tv91.p210r;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.widget.DrawableTextView;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.o */
public final class AdapterPurchaseHistoryBinding implements ViewBinding {

    /* renamed from: a */
    private final LinearLayout f14513a;

    /* renamed from: b */
    public final TextView f14514b;

    /* renamed from: c */
    public final TextView f14515c;

    /* renamed from: d */
    public final DrawableTextView f14516d;

    /* renamed from: e */
    public final TextView f14517e;

    /* renamed from: f */
    public final TextView f14518f;

    private AdapterPurchaseHistoryBinding(LinearLayout linearLayout, TextView textView, TextView textView2, DrawableTextView drawableTextView, TextView textView3, TextView textView4) {
        this.f14513a = linearLayout;
        this.f14514b = textView;
        this.f14515c = textView2;
        this.f14516d = drawableTextView;
        this.f14517e = textView3;
        this.f14518f = textView4;
    }

    /* renamed from: b */
    public static AdapterPurchaseHistoryBinding m17771b(View view) {
        int i = R.id.text_purchase_history_description;
        TextView textView = (TextView) view.findViewById(R.id.text_purchase_history_description);
        if (textView != null) {
            i = R.id.text_purchase_history_end;
            TextView textView2 = (TextView) view.findViewById(R.id.text_purchase_history_end);
            if (textView2 != null) {
                i = R.id.text_purchase_history_movie_name;
                DrawableTextView drawableTextView = (DrawableTextView) view.findViewById(R.id.text_purchase_history_movie_name);
                if (drawableTextView != null) {
                    i = R.id.text_purchase_history_point;
                    TextView textView3 = (TextView) view.findViewById(R.id.text_purchase_history_point);
                    if (textView3 != null) {
                        i = R.id.text_purchase_history_start;
                        TextView textView4 = (TextView) view.findViewById(R.id.text_purchase_history_start);
                        if (textView4 != null) {
                            AdapterPurchaseHistoryBinding oVar = new AdapterPurchaseHistoryBinding((LinearLayout) view, textView, textView2, drawableTextView, textView3, textView4);
                            return oVar;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static AdapterPurchaseHistoryBinding m17772d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.adapter_purchase_history, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m17771b(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo5604a() {
        return this.f14513a;
    }
}
