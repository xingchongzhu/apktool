package com.bumptech.glide.load.p156o.p157y;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.p151o.MediaStoreUtil;
import com.bumptech.glide.load.data.p151o.ThumbFetcher;
import com.bumptech.glide.load.p156o.ModelLoader;
import com.bumptech.glide.load.p156o.ModelLoader.C1535a;
import com.bumptech.glide.load.p156o.ModelLoaderFactory;
import com.bumptech.glide.load.p156o.MultiModelLoaderFactory;
import com.bumptech.glide.load.p158p.p159d.VideoDecoder;
import com.bumptech.glide.p173s.ObjectKey;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.o.y.c */
public class MediaStoreVideoThumbLoader implements ModelLoader<Uri, InputStream> {

    /* renamed from: a */
    private final Context f10783a;

    /* renamed from: com.bumptech.glide.load.o.y.c$a */
    /* compiled from: MediaStoreVideoThumbLoader */
    public static class C1558a implements ModelLoaderFactory<Uri, InputStream> {

        /* renamed from: a */
        private final Context f10784a;

        public C1558a(Context context) {
            this.f10784a = context;
        }

        /* renamed from: b */
        public ModelLoader<Uri, InputStream> mo9098b(MultiModelLoaderFactory rVar) {
            return new MediaStoreVideoThumbLoader(this.f10784a);
        }
    }

    public MediaStoreVideoThumbLoader(Context context) {
        this.f10783a = context.getApplicationContext();
    }

    /* renamed from: e */
    private boolean m13223e(Options iVar) {
        Long l = (Long) iVar.mo8835c(VideoDecoder.f10833a);
        return l != null && l.longValue() == -1;
    }

    /* renamed from: c */
    public C1535a<InputStream> mo9093a(Uri uri, int i, int i2, Options iVar) {
        if (!MediaStoreUtil.m12571d(i, i2) || !m13223e(iVar)) {
            return null;
        }
        return new C1535a<>(new ObjectKey(uri), ThumbFetcher.m12575g(this.f10783a, uri));
    }

    /* renamed from: d */
    public boolean mo9094b(Uri uri) {
        return MediaStoreUtil.m12570c(uri);
    }
}
