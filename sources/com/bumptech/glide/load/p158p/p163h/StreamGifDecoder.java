package com.bumptech.glide.load.p158p.p163h;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.p152n.Resource;
import com.bumptech.glide.load.p152n.p153a0.ArrayPool;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.bumptech.glide.load.p.h.j */
public class StreamGifDecoder implements ResourceDecoder<InputStream, GifDrawable> {

    /* renamed from: a */
    private final List<ImageHeaderParser> f10971a;

    /* renamed from: b */
    private final ResourceDecoder<ByteBuffer, GifDrawable> f10972b;

    /* renamed from: c */
    private final ArrayPool f10973c;

    public StreamGifDecoder(List<ImageHeaderParser> list, ResourceDecoder<ByteBuffer, GifDrawable> kVar, ArrayPool bVar) {
        this.f10971a = list;
        this.f10972b = kVar;
        this.f10973c = bVar;
    }

    /* renamed from: e */
    private static byte[] m13583e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            String str = "StreamGifDecoder";
            if (Log.isLoggable(str, 5)) {
                Log.w(str, "Error reading data from stream", e);
            }
            return null;
        }
    }

    /* renamed from: c */
    public Resource<GifDrawable> mo8839a(InputStream inputStream, int i, int i2, Options iVar) throws IOException {
        byte[] e = m13583e(inputStream);
        if (e == null) {
            return null;
        }
        return this.f10972b.mo8839a(ByteBuffer.wrap(e), i, i2, iVar);
    }

    /* renamed from: d */
    public boolean mo8840b(InputStream inputStream, Options iVar) throws IOException {
        return !((Boolean) iVar.mo8835c(GifOptions.f10970b)).booleanValue() && ImageHeaderParserUtils.m12592e(this.f10971a, inputStream, this.f10973c) == ImageType.GIF;
    }
}
