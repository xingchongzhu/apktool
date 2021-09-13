package com.bumptech.glide.load.p158p.p159d;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.p152n.Resource;
import com.bumptech.glide.load.p152n.p153a0.BitmapPool;
import com.bumptech.glide.p174t.C1639k;

/* renamed from: com.bumptech.glide.load.p.d.f */
public abstract class BitmapTransformation implements Transformation<Bitmap> {
    /* renamed from: a */
    public final Resource<Bitmap> mo8842a(Context context, Resource<Bitmap> vVar, int i, int i2) {
        if (C1639k.m14102t(i, i2)) {
            BitmapPool f = Glide.m12384c(context).mo8686f();
            Bitmap bitmap = (Bitmap) vVar.mo9056a();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap c = mo9210c(f, bitmap, i, i2);
            return bitmap.equals(c) ? vVar : BitmapResource.m13323g(c, f);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot apply transformation on width: ");
        sb.append(i);
        sb.append(" or height: ");
        sb.append(i2);
        sb.append(" less than or equal to zero and not Target.SIZE_ORIGINAL");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Bitmap mo9210c(BitmapPool eVar, Bitmap bitmap, int i, int i2);
}
