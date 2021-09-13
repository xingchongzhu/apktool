package com.bumptech.glide.p170r.p171j;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: com.bumptech.glide.r.j.b */
public class BitmapImageViewTarget extends ImageViewTarget<Bitmap> {
    public BitmapImageViewTarget(ImageView imageView) {
        super(imageView);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo9524r(Bitmap bitmap) {
        ((ImageView) this.f11218c).setImageBitmap(bitmap);
    }
}
