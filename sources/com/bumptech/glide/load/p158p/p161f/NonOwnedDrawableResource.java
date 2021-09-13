package com.bumptech.glide.load.p158p.p161f;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.p152n.Resource;

/* renamed from: com.bumptech.glide.load.p.f.c */
final class NonOwnedDrawableResource extends DrawableResource<Drawable> {
    private NonOwnedDrawableResource(Drawable drawable) {
        super(drawable);
    }

    /* renamed from: g */
    static Resource<Drawable> m13495g(Drawable drawable) {
        if (drawable != null) {
            return new NonOwnedDrawableResource(drawable);
        }
        return null;
    }

    /* renamed from: c */
    public int mo9058c() {
        return Math.max(1, this.f10919a.getIntrinsicWidth() * this.f10919a.getIntrinsicHeight() * 4);
    }

    /* renamed from: e */
    public Class<Drawable> mo9060e() {
        return this.f10919a.getClass();
    }

    /* renamed from: f */
    public void mo9061f() {
    }
}
