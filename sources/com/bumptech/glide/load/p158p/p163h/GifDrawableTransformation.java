package com.bumptech.glide.load.p158p.p163h;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.p152n.Resource;
import com.bumptech.glide.load.p158p.p159d.BitmapResource;
import com.bumptech.glide.p174t.C1638j;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.p.h.f */
public class GifDrawableTransformation implements Transformation<GifDrawable> {

    /* renamed from: b */
    private final Transformation<Bitmap> f10943b;

    public GifDrawableTransformation(Transformation<Bitmap> mVar) {
        this.f10943b = (Transformation) C1638j.m14081d(mVar);
    }

    /* renamed from: a */
    public Resource<GifDrawable> mo8842a(Context context, Resource<GifDrawable> vVar, int i, int i2) {
        GifDrawable cVar = (GifDrawable) vVar.mo9056a();
        BitmapResource eVar = new BitmapResource(cVar.mo9279e(), Glide.m12384c(context).mo8686f());
        Resource a = this.f10943b.mo8842a(context, eVar, i, i2);
        if (!eVar.equals(a)) {
            eVar.mo9061f();
        }
        cVar.mo9289m(this.f10943b, (Bitmap) a.mo9056a());
        return vVar;
    }

    /* renamed from: b */
    public void mo8826b(MessageDigest messageDigest) {
        this.f10943b.mo8826b(messageDigest);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GifDrawableTransformation)) {
            return false;
        }
        return this.f10943b.equals(((GifDrawableTransformation) obj).f10943b);
    }

    public int hashCode() {
        return this.f10943b.hashCode();
    }
}
