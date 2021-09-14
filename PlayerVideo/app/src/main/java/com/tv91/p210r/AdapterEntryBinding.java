package com.tv91.p210r;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.chip.ninetyonetv.R;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.c */
public final class AdapterEntryBinding implements ViewBinding {

    /* renamed from: a */
    private final ConstraintLayout f14320a;

    /* renamed from: b */
    public final ImageView f14321b;

    /* renamed from: c */
    public final ImageView f14322c;

    /* renamed from: d */
    public final TextView f14323d;

    /* renamed from: e */
    public final View f14324e;

    private AdapterEntryBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView, View view) {
        this.f14320a = constraintLayout;
        this.f14321b = imageView;
        this.f14322c = imageView2;
        this.f14323d = textView;
        this.f14324e = view;
    }

    /* renamed from: b */
    public static AdapterEntryBinding m17687b(View view) {
        int i = R.id.image_entry_action;
        ImageView imageView = (ImageView) view.findViewById(R.id.image_entry_action);
        if (imageView != null) {
            i = R.id.image_entry_icon;
            ImageView imageView2 = (ImageView) view.findViewById(R.id.image_entry_icon);
            if (imageView2 != null) {
                i = R.id.text_entry_value;
                TextView textView = (TextView) view.findViewById(R.id.text_entry_value);
                if (textView != null) {
                    i = R.id.view_entry_divider;
                    View findViewById = view.findViewById(R.id.view_entry_divider);
                    if (findViewById != null) {
                        AdapterEntryBinding cVar = new AdapterEntryBinding((ConstraintLayout) view, imageView, imageView2, textView, findViewById);
                        return cVar;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static AdapterEntryBinding m17688d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.adapter_entry, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m17687b(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo5604a() {
        return this.f14320a;
    }
}
