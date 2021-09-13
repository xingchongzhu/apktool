package com.bumptech.glide.load.p158p.p159d;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.p152n.Resource;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.p.d.w */
public final class ParcelFileDescriptorBitmapDecoder implements ResourceDecoder<ParcelFileDescriptor, Bitmap> {

    /* renamed from: a */
    private final Downsampler f10905a;

    public ParcelFileDescriptorBitmapDecoder(Downsampler nVar) {
        this.f10905a = nVar;
    }

    /* renamed from: c */
    public Resource<Bitmap> mo8839a(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, Options iVar) throws IOException {
        return this.f10905a.mo9225d(parcelFileDescriptor, i, i2, iVar);
    }

    /* renamed from: d */
    public boolean mo8840b(ParcelFileDescriptor parcelFileDescriptor, Options iVar) {
        return this.f10905a.mo9228o(parcelFileDescriptor);
    }
}
