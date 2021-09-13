package com.bumptech.glide.load.p158p.p159d;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.p152n.Resource;
import com.bumptech.glide.p174t.ByteBufferUtil;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.p.d.u */
public final class InputStreamBitmapImageDecoderResourceDecoder implements ResourceDecoder<InputStream, Bitmap> {

    /* renamed from: a */
    private final BitmapImageDecoderResourceDecoder f10902a = new BitmapImageDecoderResourceDecoder();

    /* renamed from: c */
    public Resource<Bitmap> mo8839a(InputStream inputStream, int i, int i2, Options iVar) throws IOException {
        return this.f10902a.mo8839a(ImageDecoder.createSource(ByteBufferUtil.m14048b(inputStream)), i, i2, iVar);
    }

    /* renamed from: d */
    public boolean mo8840b(InputStream inputStream, Options iVar) throws IOException {
        return true;
    }
}
