package com.bumptech.glide.load;

import com.bumptech.glide.load.p152n.p153a0.ArrayPool;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);
        

        /* renamed from: a */
        private final boolean f10276a;

        private ImageType(boolean z) {
            this.f10276a = z;
        }

        public boolean hasAlpha() {
            return this.f10276a;
        }
    }

    /* renamed from: a */
    ImageType mo8768a(ByteBuffer byteBuffer) throws IOException;

    /* renamed from: b */
    int mo8769b(InputStream inputStream, ArrayPool bVar) throws IOException;

    /* renamed from: c */
    ImageType mo8770c(InputStream inputStream) throws IOException;
}
