package com.bumptech.glide.load.p158p.p164i;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.p152n.Resource;
import com.bumptech.glide.load.p152n.p153a0.BitmapPool;
import com.bumptech.glide.load.p158p.p159d.BitmapResource;
import com.bumptech.glide.load.p158p.p163h.GifDrawable;

/* renamed from: com.bumptech.glide.load.p.i.c */
public final class DrawableBytesTranscoder implements ResourceTranscoder<Drawable, byte[]> {

    /* renamed from: a */
    private final BitmapPool f10977a;

    /* renamed from: b */
    private final ResourceTranscoder<Bitmap, byte[]> f10978b;

    /* renamed from: c */
    private final ResourceTranscoder<GifDrawable, byte[]> f10979c;

    public DrawableBytesTranscoder(BitmapPool eVar, ResourceTranscoder<Bitmap, byte[]> eVar2, ResourceTranscoder<GifDrawable, byte[]> eVar3) {
        this.f10977a = eVar;
        this.f10978b = eVar2;
        this.f10979c = eVar3;
    }

    /* renamed from: b */
    private static Resource<GifDrawable> m13590b(Resource<Drawable> vVar) {
        return vVar;
    }

    /* renamed from: a */
    public Resource<byte[]> mo9323a(Resource<Drawable> vVar, Options iVar) {
        Drawable drawable = (Drawable) vVar.mo9056a();
        if (drawable instanceof BitmapDrawable) {
            return this.f10978b.mo9323a(BitmapResource.m13323g(((BitmapDrawable) drawable).getBitmap(), this.f10977a), iVar);
        }
        if (drawable instanceof GifDrawable) {
            return this.f10979c.mo9323a(m13590b(vVar), iVar);
        }
        return null;
    }
}
