package com.tv91.p210r;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.chip.ninetyonetv.R;
import com.google.android.material.imageview.ShapeableImageView;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.a */
public final class AdapterActorBinding implements ViewBinding {

    /* renamed from: a */
    private final RelativeLayout f14283a;

    /* renamed from: b */
    public final ShapeableImageView f14284b;

    /* renamed from: c */
    public final TextView f14285c;

    /* renamed from: d */
    public final TextView f14286d;

    private AdapterActorBinding(RelativeLayout relativeLayout, ShapeableImageView shapeableImageView, TextView textView, TextView textView2) {
        this.f14283a = relativeLayout;
        this.f14284b = shapeableImageView;
        this.f14285c = textView;
        this.f14286d = textView2;
    }

    /* renamed from: b */
    public static AdapterActorBinding m17673b(View view) {
        int i = R.id.image_actor_avatar;
        ShapeableImageView shapeableImageView = (ShapeableImageView) view.findViewById(R.id.image_actor_avatar);
        if (shapeableImageView != null) {
            i = R.id.text_actor_count;
            TextView textView = (TextView) view.findViewById(R.id.text_actor_count);
            if (textView != null) {
                i = R.id.text_actor_name;
                TextView textView2 = (TextView) view.findViewById(R.id.text_actor_name);
                if (textView2 != null) {
                    return new AdapterActorBinding((RelativeLayout) view, shapeableImageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static AdapterActorBinding m17674d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.adapter_actor, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m17673b(inflate);
    }

    /* renamed from: c */
    public RelativeLayout mo5604a() {
        return this.f14283a;
    }
}
