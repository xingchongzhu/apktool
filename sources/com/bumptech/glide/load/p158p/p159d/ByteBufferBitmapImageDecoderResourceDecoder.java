package com.bumptech.glide.load.p158p.p159d;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.p152n.Resource;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.p.d.h */
public final class ByteBufferBitmapImageDecoderResourceDecoder implements ResourceDecoder<ByteBuffer, Bitmap> {

    /* renamed from: a */
    private final BitmapImageDecoderResourceDecoder f10846a = new BitmapImageDecoderResourceDecoder();

    /* renamed from: c */
    public Resource<Bitmap> mo8839a(ByteBuffer byteBuffer, int i, int i2, Options iVar) throws IOException {
        return this.f10846a.mo8839a(ImageDecoder.createSource(byteBuffer), i, i2, iVar);
    }

    /* renamed from: d */
    public boolean mo8840b(ByteBuffer byteBuffer, Options iVar) throws IOException {
        return true;
    }
}
