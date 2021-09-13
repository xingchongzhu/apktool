package com.bumptech.glide.load.p158p.p159d;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.p152n.Resource;
import com.bumptech.glide.load.p152n.p153a0.BitmapPool;
import java.io.File;

/* renamed from: com.bumptech.glide.load.p.d.b */
public class BitmapDrawableEncoder implements ResourceEncoder<BitmapDrawable> {

    /* renamed from: a */
    private final BitmapPool f10820a;

    /* renamed from: b */
    private final ResourceEncoder<Bitmap> f10821b;

    public BitmapDrawableEncoder(BitmapPool eVar, ResourceEncoder<Bitmap> lVar) {
        this.f10820a = eVar;
        this.f10821b = lVar;
    }

    /* renamed from: b */
    public EncodeStrategy mo8841b(Options iVar) {
        return this.f10821b.mo8841b(iVar);
    }

    /* renamed from: c */
    public boolean mo8772a(Resource<BitmapDrawable> vVar, File file, Options iVar) {
        return this.f10821b.mo8772a(new BitmapResource(((BitmapDrawable) vVar.mo9056a()).getBitmap(), this.f10820a), file, iVar);
    }
}
