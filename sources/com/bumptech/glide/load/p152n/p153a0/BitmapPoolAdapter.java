package com.bumptech.glide.load.p152n.p153a0;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;

/* renamed from: com.bumptech.glide.load.n.a0.f */
public class BitmapPoolAdapter implements BitmapPool {
    /* renamed from: a */
    public void mo8880a(int i) {
    }

    /* renamed from: b */
    public void mo8881b() {
    }

    /* renamed from: c */
    public Bitmap mo8882c(int i, int i2, Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    /* renamed from: d */
    public void mo8883d(Bitmap bitmap) {
        bitmap.recycle();
    }

    /* renamed from: e */
    public Bitmap mo8884e(int i, int i2, Config config) {
        return mo8882c(i, i2, config);
    }
}
