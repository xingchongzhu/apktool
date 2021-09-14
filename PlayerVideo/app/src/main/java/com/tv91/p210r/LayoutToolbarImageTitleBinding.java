package com.tv91.p210r;

import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import com.chip.ninetyonetv.R;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.x */
public final class LayoutToolbarImageTitleBinding implements ViewBinding {

    /* renamed from: a */
    private final Toolbar f14672a;

    /* renamed from: b */
    public final ImageView f14673b;

    private LayoutToolbarImageTitleBinding(Toolbar toolbar, ImageView imageView) {
        this.f14672a = toolbar;
        this.f14673b = imageView;
    }

    /* renamed from: b */
    public static LayoutToolbarImageTitleBinding m17829b(View view) {
        ImageView imageView = (ImageView) view.findViewById(R.id.image_toolbar_title);
        if (imageView != null) {
            return new LayoutToolbarImageTitleBinding((Toolbar) view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.image_toolbar_title)));
    }

    /* renamed from: c */
    public Toolbar mo5604a() {
        return this.f14672a;
    }
}
