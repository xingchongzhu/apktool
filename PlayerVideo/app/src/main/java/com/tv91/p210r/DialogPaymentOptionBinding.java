package com.tv91.p210r;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.chip.ninetyonetv.R;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.p */
public final class DialogPaymentOptionBinding implements ViewBinding {

    /* renamed from: a */
    private final FrameLayout f14537a;

    /* renamed from: b */
    public final FrameLayout f14538b;

    /* renamed from: c */
    public final ImageView f14539c;

    /* renamed from: d */
    public final RecyclerView f14540d;

    /* renamed from: e */
    public final TextView f14541e;

    private DialogPaymentOptionBinding(FrameLayout frameLayout, FrameLayout frameLayout2, ImageView imageView, RecyclerView recyclerView, TextView textView) {
        this.f14537a = frameLayout;
        this.f14538b = frameLayout2;
        this.f14539c = imageView;
        this.f14540d = recyclerView;
        this.f14541e = textView;
    }

    /* renamed from: b */
    public static DialogPaymentOptionBinding m17778b(View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i = R.id.image_paymenet_close;
        ImageView imageView = (ImageView) view.findViewById(R.id.image_paymenet_close);
        if (imageView != null) {
            i = R.id.recycler_payment;
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_payment);
            if (recyclerView != null) {
                i = R.id.text_payment_title;
                TextView textView = (TextView) view.findViewById(R.id.text_payment_title);
                if (textView != null) {
                    DialogPaymentOptionBinding pVar = new DialogPaymentOptionBinding((FrameLayout) view, frameLayout, imageView, recyclerView, textView);
                    return pVar;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public FrameLayout mo5604a() {
        return this.f14537a;
    }
}
