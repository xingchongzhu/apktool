package com.bumptech.glide.load.p158p.p164i;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.p152n.Resource;
import com.bumptech.glide.load.p158p.p159d.LazyBitmapDrawableResource;
import com.bumptech.glide.p174t.C1638j;

/* renamed from: com.bumptech.glide.load.p.i.b */
public class BitmapDrawableTranscoder implements ResourceTranscoder<Bitmap, BitmapDrawable> {

    /* renamed from: a */
    private final Resources f10976a;

    public BitmapDrawableTranscoder(Resources resources) {
        this.f10976a = (Resources) C1638j.m14081d(resources);
    }

    /* renamed from: a */
    public Resource<BitmapDrawable> mo9323a(Resource<Bitmap> vVar, Options iVar) {
        return LazyBitmapDrawableResource.m13455g(this.f10976a, vVar);
    }
}
