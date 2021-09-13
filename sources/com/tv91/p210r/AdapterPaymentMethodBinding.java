package com.tv91.p210r;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.chip.ninetyonetv.R;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.l */
public final class AdapterPaymentMethodBinding implements ViewBinding {

    /* renamed from: a */
    private final ConstraintLayout f14471a;

    /* renamed from: b */
    public final ConstraintLayout f14472b;

    /* renamed from: c */
    public final ImageView f14473c;

    /* renamed from: d */
    public final TextView f14474d;

    private AdapterPaymentMethodBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, TextView textView) {
        this.f14471a = constraintLayout;
        this.f14472b = constraintLayout2;
        this.f14473c = imageView;
        this.f14474d = textView;
    }

    /* renamed from: b */
    public static AdapterPaymentMethodBinding m17750b(View view) {
        int i = R.id.container_payment;
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.container_payment);
        if (constraintLayout != null) {
            i = R.id.image_payment_icon;
            ImageView imageView = (ImageView) view.findViewById(R.id.image_payment_icon);
            if (imageView != null) {
                i = R.id.text_payment_name;
                TextView textView = (TextView) view.findViewById(R.id.text_payment_name);
                if (textView != null) {
                    return new AdapterPaymentMethodBinding((ConstraintLayout) view, constraintLayout, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static AdapterPaymentMethodBinding m17751d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.adapter_payment_method, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m17750b(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo5604a() {
        return this.f14471a;
    }
}
