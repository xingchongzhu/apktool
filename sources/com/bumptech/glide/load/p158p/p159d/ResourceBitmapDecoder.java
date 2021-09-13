package com.bumptech.glide.load.p158p.p159d;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.p152n.Resource;
import com.bumptech.glide.load.p152n.p153a0.BitmapPool;
import com.bumptech.glide.load.p158p.p161f.ResourceDrawableDecoder;

/* renamed from: com.bumptech.glide.load.p.d.y */
public class ResourceBitmapDecoder implements ResourceDecoder<Uri, Bitmap> {

    /* renamed from: a */
    private final ResourceDrawableDecoder f10912a;

    /* renamed from: b */
    private final BitmapPool f10913b;

    public ResourceBitmapDecoder(ResourceDrawableDecoder dVar, BitmapPool eVar) {
        this.f10912a = dVar;
        this.f10913b = eVar;
    }

    /* renamed from: c */
    public Resource<Bitmap> mo8839a(Uri uri, int i, int i2, Options iVar) {
        Resource c = this.f10912a.mo8839a(uri, i, i2, iVar);
        if (c == null) {
            return null;
        }
        return DrawableToBitmapConverter.m13418a(this.f10913b, (Drawable) c.mo9056a(), i, i2);
    }

    /* renamed from: d */
    public boolean mo8840b(Uri uri, Options iVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
