package com.bumptech.glide.load.p158p.p159d;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder.OnHeaderDecodedListener;
import android.graphics.ImageDecoder.Source;
import android.util.Log;
import com.bumptech.glide.load.p152n.Resource;
import com.bumptech.glide.load.p152n.p153a0.BitmapPool;
import com.bumptech.glide.load.p152n.p153a0.BitmapPoolAdapter;
import com.bumptech.glide.load.p158p.ImageDecoderResourceDecoder;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.p.d.d */
public final class BitmapImageDecoderResourceDecoder extends ImageDecoderResourceDecoder<Bitmap> {

    /* renamed from: b */
    private final BitmapPool f10832b = new BitmapPoolAdapter();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Resource<Bitmap> mo9178c(Source source, int i, int i2, OnHeaderDecodedListener onHeaderDecodedListener) throws IOException {
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, onHeaderDecodedListener);
        String str = "BitmapImageDecoder";
        if (Log.isLoggable(str, 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Decoded [");
            sb.append(decodeBitmap.getWidth());
            String str2 = "x";
            sb.append(str2);
            sb.append(decodeBitmap.getHeight());
            sb.append("] for [");
            sb.append(i);
            sb.append(str2);
            sb.append(i2);
            sb.append("]");
            Log.v(str, sb.toString());
        }
        return new BitmapResource(decodeBitmap, this.f10832b);
    }
}
