package com.tv91.p210r;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.chip.ninetyonetv.R;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.m */
public final class AdapterPromotionBinding implements ViewBinding {

    /* renamed from: a */
    private final FrameLayout f14483a;

    /* renamed from: b */
    public final ImageView f14484b;

    /* renamed from: c */
    public final TextView f14485c;

    private AdapterPromotionBinding(FrameLayout frameLayout, ImageView imageView, TextView textView) {
        this.f14483a = frameLayout;
        this.f14484b = imageView;
        this.f14485c = textView;
    }

    /* renamed from: b */
    public static AdapterPromotionBinding m17757b(View view) {
        int i = R.id.image_promotion;
        ImageView imageView = (ImageView) view.findViewById(R.id.image_promotion);
        if (imageView != null) {
            i = R.id.text_promotion_name;
            TextView textView = (TextView) view.findViewById(R.id.text_promotion_name);
            if (textView != null) {
                return new AdapterPromotionBinding((FrameLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static AdapterPromotionBinding m17758d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.adapter_promotion, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m17757b(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo5604a() {
        return this.f14483a;
    }
}
