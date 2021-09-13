package com.bumptech.glide.load.p158p.p159d;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.p152n.p153a0.ArrayPool;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p010b.p051j.p052a.ExifInterface;

/* renamed from: com.bumptech.glide.load.p.d.q */
public final class ExifInterfaceImageHeaderParser implements ImageHeaderParser {
    /* renamed from: a */
    public ImageType mo8768a(ByteBuffer byteBuffer) {
        return ImageType.UNKNOWN;
    }

    /* renamed from: b */
    public int mo8769b(InputStream inputStream, ArrayPool bVar) throws IOException {
        int e = new ExifInterface(inputStream).mo5255e("Orientation", 1);
        if (e == 0) {
            return -1;
        }
        return e;
    }

    /* renamed from: c */
    public ImageType mo8770c(InputStream inputStream) {
        return ImageType.UNKNOWN;
    }
}
