package com.bumptech.glide.load.p158p.p163h;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.util.Log;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.p152n.p153a0.ArrayPool;
import com.bumptech.glide.load.p152n.p153a0.BitmapPool;
import com.bumptech.glide.load.p158p.UnitTransformation;
import com.bumptech.glide.p166n.GifDecoder;
import com.bumptech.glide.p166n.GifDecoder.C1614a;
import com.bumptech.glide.p166n.GifHeader;
import com.bumptech.glide.p166n.GifHeaderParser;
import com.bumptech.glide.p166n.StandardGifDecoder;
import com.bumptech.glide.p174t.C1639k;
import com.bumptech.glide.p174t.LogTime;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

/* renamed from: com.bumptech.glide.load.p.h.a */
public class ByteBufferGifDecoder implements ResourceDecoder<ByteBuffer, GifDrawable> {

    /* renamed from: a */
    private static final C1599a f10921a = new C1599a();

    /* renamed from: b */
    private static final C1600b f10922b = new C1600b();

    /* renamed from: c */
    private final Context f10923c;

    /* renamed from: d */
    private final List<ImageHeaderParser> f10924d;

    /* renamed from: e */
    private final C1600b f10925e;

    /* renamed from: f */
    private final C1599a f10926f;

    /* renamed from: g */
    private final GifBitmapProvider f10927g;

    /* renamed from: com.bumptech.glide.load.p.h.a$a */
    /* compiled from: ByteBufferGifDecoder */
    static class C1599a {
        C1599a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public GifDecoder mo9267a(C1614a aVar, GifHeader cVar, ByteBuffer byteBuffer, int i) {
            return new StandardGifDecoder(aVar, cVar, byteBuffer, i);
        }
    }

    /* renamed from: com.bumptech.glide.load.p.h.a$b */
    /* compiled from: ByteBufferGifDecoder */
    static class C1600b {

        /* renamed from: a */
        private final Queue<GifHeaderParser> f10928a = C1639k.m14087e(0);

        C1600b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public synchronized GifHeaderParser mo9268a(ByteBuffer byteBuffer) {
            GifHeaderParser dVar;
            dVar = (GifHeaderParser) this.f10928a.poll();
            if (dVar == null) {
                dVar = new GifHeaderParser();
            }
            return dVar.mo9364p(byteBuffer);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public synchronized void mo9269b(GifHeaderParser dVar) {
            dVar.mo9362a();
            this.f10928a.offer(dVar);
        }
    }

    public ByteBufferGifDecoder(Context context, List<ImageHeaderParser> list, BitmapPool eVar, ArrayPool bVar) {
        this(context, list, eVar, bVar, f10922b, f10921a);
    }

    /* renamed from: c */
    private GifDrawableResource m13515c(ByteBuffer byteBuffer, int i, int i2, GifHeaderParser dVar, Options iVar) {
        Config config;
        String str = "Decoded GIF from stream in ";
        String str2 = "BufferGifDecoder";
        long b = LogTime.m14065b();
        try {
            GifHeader c = dVar.mo9363c();
            if (c.mo9359b() > 0) {
                if (c.mo9360c() == 0) {
                    if (iVar.mo8835c(GifOptions.f10969a) == DecodeFormat.PREFER_RGB_565) {
                        config = Config.RGB_565;
                    } else {
                        config = Config.ARGB_8888;
                    }
                    GifDecoder a = this.f10926f.mo9267a(this.f10927g, c, byteBuffer, m13516e(c, i, i2));
                    a.mo9355g(config);
                    a.mo9350c();
                    Bitmap b2 = a.mo9349b();
                    if (b2 == null) {
                        if (Log.isLoggable(str2, 2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str);
                            sb.append(LogTime.m14064a(b));
                            Log.v(str2, sb.toString());
                        }
                        return null;
                    }
                    GifDrawable cVar = new GifDrawable(this.f10923c, a, UnitTransformation.m13256c(), i, i2, b2);
                    GifDrawableResource eVar = new GifDrawableResource(cVar);
                    if (Log.isLoggable(str2, 2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(LogTime.m14064a(b));
                        Log.v(str2, sb2.toString());
                    }
                    return eVar;
                }
            }
            return null;
        } finally {
            if (Log.isLoggable(str2, 2)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(LogTime.m14064a(b));
                Log.v(str2, sb3.toString());
            }
        }
    }

    /* renamed from: e */
    private static int m13516e(GifHeader cVar, int i, int i2) {
        int i3;
        int min = Math.min(cVar.mo9358a() / i2, cVar.mo9361d() / i);
        if (min == 0) {
            i3 = 0;
        } else {
            i3 = Integer.highestOneBit(min);
        }
        int max = Math.max(1, i3);
        String str = "BufferGifDecoder";
        if (Log.isLoggable(str, 2) && max > 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Downsampling GIF, sampleSize: ");
            sb.append(max);
            sb.append(", target dimens: [");
            sb.append(i);
            String str2 = "x";
            sb.append(str2);
            sb.append(i2);
            sb.append("], actual dimens: [");
            sb.append(cVar.mo9361d());
            sb.append(str2);
            sb.append(cVar.mo9358a());
            sb.append("]");
            Log.v(str, sb.toString());
        }
        return max;
    }

    /* renamed from: d */
    public GifDrawableResource mo8839a(ByteBuffer byteBuffer, int i, int i2, Options iVar) {
        GifHeaderParser a = this.f10925e.mo9268a(byteBuffer);
        try {
            GifDrawableResource c = m13515c(byteBuffer, i, i2, a, iVar);
            return c;
        } finally {
            this.f10925e.mo9269b(a);
        }
    }

    /* renamed from: f */
    public boolean mo8840b(ByteBuffer byteBuffer, Options iVar) throws IOException {
        return !((Boolean) iVar.mo8835c(GifOptions.f10970b)).booleanValue() && ImageHeaderParserUtils.m12593f(this.f10924d, byteBuffer) == ImageType.GIF;
    }

    ByteBufferGifDecoder(Context context, List<ImageHeaderParser> list, BitmapPool eVar, ArrayPool bVar, C1600b bVar2, C1599a aVar) {
        this.f10923c = context.getApplicationContext();
        this.f10924d = list;
        this.f10926f = aVar;
        this.f10927g = new GifBitmapProvider(eVar, bVar);
        this.f10925e = bVar2;
    }
}
