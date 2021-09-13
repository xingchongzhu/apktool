package com.bumptech.glide.load.p158p.p163h;

import android.util.Log;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.p152n.Resource;
import com.bumptech.glide.p174t.ByteBufferUtil;
import java.io.File;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.p.h.d */
public class GifDrawableEncoder implements ResourceEncoder<GifDrawable> {
    /* renamed from: b */
    public EncodeStrategy mo8841b(Options iVar) {
        return EncodeStrategy.SOURCE;
    }

    /* renamed from: c */
    public boolean mo8772a(Resource<GifDrawable> vVar, File file, Options iVar) {
        try {
            ByteBufferUtil.m14051e(((GifDrawable) vVar.mo9056a()).mo9277c(), file);
            return true;
        } catch (IOException e) {
            String str = "GifEncoder";
            if (Log.isLoggable(str, 5)) {
                Log.w(str, "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }
}
