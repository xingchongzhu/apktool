package com.bumptech.glide.load.p158p.p161f;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.p152n.Resource;

/* renamed from: com.bumptech.glide.load.p.f.e */
public class UnitDrawableDecoder implements ResourceDecoder<Drawable, Drawable> {
    /* renamed from: c */
    public Resource<Drawable> mo8839a(Drawable drawable, int i, int i2, Options iVar) {
        return NonOwnedDrawableResource.m13495g(drawable);
    }

    /* renamed from: d */
    public boolean mo8840b(Drawable drawable, Options iVar) {
        return true;
    }
}
