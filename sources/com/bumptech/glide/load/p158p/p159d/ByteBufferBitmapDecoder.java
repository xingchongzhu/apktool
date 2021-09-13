package com.bumptech.glide.load.p158p.p159d;

import android.graphics.Bitmap;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.p152n.Resource;
import com.bumptech.glide.p174t.ByteBufferUtil;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.p.d.g */
public class ByteBufferBitmapDecoder implements ResourceDecoder<ByteBuffer, Bitmap> {

    /* renamed from: a */
    private final Downsampler f10845a;

    public ByteBufferBitmapDecoder(Downsampler nVar) {
        this.f10845a = nVar;
    }

    /* renamed from: c */
    public Resource<Bitmap> mo8839a(ByteBuffer byteBuffer, int i, int i2, Options iVar) throws IOException {
        return this.f10845a.mo9226f(ByteBufferUtil.m14052f(byteBuffer), i, i2, iVar);
    }

    /* renamed from: d */
    public boolean mo8840b(ByteBuffer byteBuffer, Options iVar) {
        return this.f10845a.mo9230q(byteBuffer);
    }
}
