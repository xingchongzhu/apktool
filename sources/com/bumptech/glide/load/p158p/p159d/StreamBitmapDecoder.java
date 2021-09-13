package com.bumptech.glide.load.p158p.p159d;

import android.graphics.Bitmap;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.p152n.Resource;
import com.bumptech.glide.load.p152n.p153a0.ArrayPool;
import com.bumptech.glide.load.p152n.p153a0.BitmapPool;
import com.bumptech.glide.load.p158p.p159d.Downsampler.C1593b;
import com.bumptech.glide.p174t.ExceptionPassthroughInputStream;
import com.bumptech.glide.p174t.MarkEnforcingInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.p.d.a0 */
public class StreamBitmapDecoder implements ResourceDecoder<InputStream, Bitmap> {

    /* renamed from: a */
    private final Downsampler f10816a;

    /* renamed from: b */
    private final ArrayPool f10817b;

    /* renamed from: com.bumptech.glide.load.p.d.a0$a */
    /* compiled from: StreamBitmapDecoder */
    static class C1566a implements C1593b {

        /* renamed from: a */
        private final RecyclableBufferedInputStream f10818a;

        /* renamed from: b */
        private final ExceptionPassthroughInputStream f10819b;

        C1566a(RecyclableBufferedInputStream xVar, ExceptionPassthroughInputStream dVar) {
            this.f10818a = xVar;
            this.f10819b = dVar;
        }

        /* renamed from: a */
        public void mo9185a(BitmapPool eVar, Bitmap bitmap) throws IOException {
            IOException B = this.f10819b.mo9554B();
            if (B != null) {
                if (bitmap != null) {
                    eVar.mo8883d(bitmap);
                }
                throw B;
            }
        }

        /* renamed from: b */
        public void mo9186b() {
            this.f10818a.mo9243C();
        }
    }

    public StreamBitmapDecoder(Downsampler nVar, ArrayPool bVar) {
        this.f10816a = nVar;
        this.f10817b = bVar;
    }

    /* renamed from: c */
    public Resource<Bitmap> mo8839a(InputStream inputStream, int i, int i2, Options iVar) throws IOException {
        RecyclableBufferedInputStream xVar;
        boolean z;
        if (inputStream instanceof RecyclableBufferedInputStream) {
            xVar = (RecyclableBufferedInputStream) inputStream;
            z = false;
        } else {
            xVar = new RecyclableBufferedInputStream(inputStream, this.f10817b);
            z = true;
        }
        ExceptionPassthroughInputStream C = ExceptionPassthroughInputStream.m14058C(xVar);
        try {
            return this.f10816a.mo9227g(new MarkEnforcingInputStream(C), i, i2, iVar, new C1566a(xVar, C));
        } finally {
            C.mo9555D();
            if (z) {
                xVar.mo9244D();
            }
        }
    }

    /* renamed from: d */
    public boolean mo8840b(InputStream inputStream, Options iVar) {
        return this.f10816a.mo9229p(inputStream);
    }
}
