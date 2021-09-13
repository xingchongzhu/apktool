package com.bumptech.glide.load.p158p.p163h;

import android.graphics.Bitmap;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.p152n.Resource;
import com.bumptech.glide.load.p152n.p153a0.BitmapPool;
import com.bumptech.glide.load.p158p.p159d.BitmapResource;
import com.bumptech.glide.p166n.GifDecoder;

/* renamed from: com.bumptech.glide.load.p.h.h */
public final class GifFrameResourceDecoder implements ResourceDecoder<GifDecoder, Bitmap> {

    /* renamed from: a */
    private final BitmapPool f10968a;

    public GifFrameResourceDecoder(BitmapPool eVar) {
        this.f10968a = eVar;
    }

    /* renamed from: c */
    public Resource<Bitmap> mo8839a(GifDecoder aVar, int i, int i2, Options iVar) {
        return BitmapResource.m13323g(aVar.mo9349b(), this.f10968a);
    }

    /* renamed from: d */
    public boolean mo8840b(GifDecoder aVar, Options iVar) {
        return true;
    }
}
