package com.bumptech.glide.load.p158p.p159d;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.p152n.Resource;
import com.bumptech.glide.p174t.C1638j;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.p.d.a */
public class BitmapDrawableDecoder<DataType> implements ResourceDecoder<DataType, BitmapDrawable> {

    /* renamed from: a */
    private final ResourceDecoder<DataType, Bitmap> f10814a;

    /* renamed from: b */
    private final Resources f10815b;

    public BitmapDrawableDecoder(Resources resources, ResourceDecoder<DataType, Bitmap> kVar) {
        this.f10815b = (Resources) C1638j.m14081d(resources);
        this.f10814a = (ResourceDecoder) C1638j.m14081d(kVar);
    }

    /* renamed from: a */
    public Resource<BitmapDrawable> mo8839a(DataType datatype, int i, int i2, Options iVar) throws IOException {
        return LazyBitmapDrawableResource.m13455g(this.f10815b, this.f10814a.mo8839a(datatype, i, i2, iVar));
    }

    /* renamed from: b */
    public boolean mo8840b(DataType datatype, Options iVar) throws IOException {
        return this.f10814a.mo8840b(datatype, iVar);
    }
}
