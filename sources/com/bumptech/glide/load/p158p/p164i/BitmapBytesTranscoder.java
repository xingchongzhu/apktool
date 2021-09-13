package com.bumptech.glide.load.p158p.p164i;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.p152n.Resource;
import com.bumptech.glide.load.p158p.p160e.BytesResource;
import java.io.ByteArrayOutputStream;

/* renamed from: com.bumptech.glide.load.p.i.a */
public class BitmapBytesTranscoder implements ResourceTranscoder<Bitmap, byte[]> {

    /* renamed from: a */
    private final CompressFormat f10974a;

    /* renamed from: b */
    private final int f10975b;

    public BitmapBytesTranscoder() {
        this(CompressFormat.JPEG, 100);
    }

    /* renamed from: a */
    public Resource<byte[]> mo9323a(Resource<Bitmap> vVar, Options iVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) vVar.mo9056a()).compress(this.f10974a, this.f10975b, byteArrayOutputStream);
        vVar.mo9061f();
        return new BytesResource(byteArrayOutputStream.toByteArray());
    }

    public BitmapBytesTranscoder(CompressFormat compressFormat, int i) {
        this.f10974a = compressFormat;
        this.f10975b = i;
    }
}
