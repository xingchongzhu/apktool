package com.bumptech.glide.load.p158p;

import android.annotation.SuppressLint;
import android.graphics.ColorSpace;
import android.graphics.ColorSpace.Named;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder.DecodeException;
import android.graphics.ImageDecoder.ImageInfo;
import android.graphics.ImageDecoder.OnHeaderDecodedListener;
import android.graphics.ImageDecoder.OnPartialImageListener;
import android.graphics.ImageDecoder.Source;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.p152n.Resource;
import com.bumptech.glide.load.p158p.p159d.DownsampleStrategy;
import com.bumptech.glide.load.p158p.p159d.Downsampler;
import com.bumptech.glide.load.p158p.p159d.HardwareConfigState;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.p.a */
public abstract class ImageDecoderResourceDecoder<T> implements ResourceDecoder<Source, T> {

    /* renamed from: a */
    final HardwareConfigState f10803a = HardwareConfigState.m13431b();

    /* renamed from: com.bumptech.glide.load.p.a$a */
    /* compiled from: ImageDecoderResourceDecoder */
    class C1564a implements OnHeaderDecodedListener {

        /* renamed from: a */
        final /* synthetic */ int f10804a;

        /* renamed from: b */
        final /* synthetic */ int f10805b;

        /* renamed from: c */
        final /* synthetic */ boolean f10806c;

        /* renamed from: d */
        final /* synthetic */ DecodeFormat f10807d;

        /* renamed from: e */
        final /* synthetic */ DownsampleStrategy f10808e;

        /* renamed from: f */
        final /* synthetic */ PreferredColorSpace f10809f;

        /* renamed from: com.bumptech.glide.load.p.a$a$a */
        /* compiled from: ImageDecoderResourceDecoder */
        class C1565a implements OnPartialImageListener {
            C1565a() {
            }

            public boolean onPartialImage(DecodeException decodeException) {
                return false;
            }
        }

        C1564a(int i, int i2, boolean z, DecodeFormat bVar, DownsampleStrategy mVar, PreferredColorSpace jVar) {
            this.f10804a = i;
            this.f10805b = i2;
            this.f10806c = z;
            this.f10807d = bVar;
            this.f10808e = mVar;
            this.f10809f = jVar;
        }

        @SuppressLint({"Override"})
        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageInfo imageInfo, Source source) {
            boolean z = false;
            if (ImageDecoderResourceDecoder.this.f10803a.mo9232e(this.f10804a, this.f10805b, this.f10806c, false)) {
                imageDecoder.setAllocator(3);
            } else {
                imageDecoder.setAllocator(1);
            }
            if (this.f10807d == DecodeFormat.PREFER_RGB_565) {
                imageDecoder.setMemorySizePolicy(0);
            }
            imageDecoder.setOnPartialImageListener(new C1565a());
            Size size = imageInfo.getSize();
            int i = this.f10804a;
            if (i == Integer.MIN_VALUE) {
                i = size.getWidth();
            }
            int i2 = this.f10805b;
            if (i2 == Integer.MIN_VALUE) {
                i2 = size.getHeight();
            }
            float b = this.f10808e.mo9224b(size.getWidth(), size.getHeight(), i, i2);
            int round = Math.round(((float) size.getWidth()) * b);
            int round2 = Math.round(((float) size.getHeight()) * b);
            String str = "ImageDecoder";
            if (Log.isLoggable(str, 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Resizing from [");
                sb.append(size.getWidth());
                String str2 = "x";
                sb.append(str2);
                sb.append(size.getHeight());
                sb.append("] to [");
                sb.append(round);
                sb.append(str2);
                sb.append(round2);
                sb.append("] scaleFactor: ");
                sb.append(b);
                Log.v(str, sb.toString());
            }
            imageDecoder.setTargetSize(round, round2);
            int i3 = VERSION.SDK_INT;
            if (i3 >= 28) {
                if (this.f10809f == PreferredColorSpace.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                    z = true;
                }
                imageDecoder.setTargetColorSpace(ColorSpace.get(z ? Named.DISPLAY_P3 : Named.SRGB));
            } else if (i3 >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(Named.SRGB));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Resource<T> mo9178c(Source source, int i, int i2, OnHeaderDecodedListener onHeaderDecodedListener) throws IOException;

    /* renamed from: d */
    public final Resource<T> mo8839a(Source source, int i, int i2, Options iVar) throws IOException {
        DecodeFormat bVar = (DecodeFormat) iVar.mo8835c(Downsampler.f10867a);
        DownsampleStrategy mVar = (DownsampleStrategy) iVar.mo8835c(DownsampleStrategy.f10862h);
        Option<Boolean> hVar = Downsampler.f10871e;
        C1564a aVar = new C1564a(i, i2, iVar.mo8835c(hVar) != null && ((Boolean) iVar.mo8835c(hVar)).booleanValue(), bVar, mVar, (PreferredColorSpace) iVar.mo8835c(Downsampler.f10868b));
        return mo9178c(source, i, i2, aVar);
    }

    /* renamed from: e */
    public final boolean mo8840b(Source source, Options iVar) {
        return true;
    }
}
