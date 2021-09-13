package com.bumptech.glide.p170r.p171j;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: com.bumptech.glide.r.j.d */
public class DrawableImageViewTarget extends ImageViewTarget<Drawable> {
    public DrawableImageViewTarget(ImageView imageView) {
        super(imageView);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo9524r(Drawable drawable) {
        ((ImageView) this.f11218c).setImageDrawable(drawable);
    }
}
