package com.bumptech.glide.load.p158p.p159d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.p152n.Resource;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.p.d.p */
public class DrawableTransformation implements Transformation<Drawable> {

    /* renamed from: b */
    private final Transformation<Bitmap> f10882b;

    /* renamed from: c */
    private final boolean f10883c;

    public DrawableTransformation(Transformation<Bitmap> mVar, boolean z) {
        this.f10882b = mVar;
        this.f10883c = z;
    }

    /* renamed from: d */
    private Resource<Drawable> m13421d(Context context, Resource<Bitmap> vVar) {
        return LazyBitmapDrawableResource.m13455g(context.getResources(), vVar);
    }

    /* renamed from: a */
    public Resource<Drawable> mo8842a(Context context, Resource<Drawable> vVar, int i, int i2) {
        Drawable drawable = (Drawable) vVar.mo9056a();
        Resource a = DrawableToBitmapConverter.m13418a(Glide.m12384c(context).mo8686f(), drawable, i, i2);
        if (a != null) {
            Resource a2 = this.f10882b.mo8842a(context, a, i, i2);
            if (!a2.equals(a)) {
                return m13421d(context, a2);
            }
            a2.mo9061f();
            return vVar;
        } else if (!this.f10883c) {
            return vVar;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to convert ");
            sb.append(drawable);
            sb.append(" to a Bitmap");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: b */
    public void mo8826b(MessageDigest messageDigest) {
        this.f10882b.mo8826b(messageDigest);
    }

    /* renamed from: c */
    public Transformation<BitmapDrawable> mo9231c() {
        return this;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DrawableTransformation)) {
            return false;
        }
        return this.f10882b.equals(((DrawableTransformation) obj).f10882b);
    }

    public int hashCode() {
        return this.f10882b.hashCode();
    }
}
