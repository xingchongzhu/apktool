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
import com.bumptech.glide.p173s.ObjectKey;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.o.y.b */
public class MediaStoreImageThumbLoader implements ModelLoader<Uri, InputStream> {

    /* renamed from: a */
    private final Context f10781a;

    /* renamed from: com.bumptech.glide.load.o.y.b$a */
    /* compiled from: MediaStoreImageThumbLoader */
    public static class C1557a implements ModelLoaderFactory<Uri, InputStream> {

        /* renamed from: a */
        private final Context f10782a;

        public C1557a(Context context) {
            this.f10782a = context;
        }

        /* renamed from: b */
        public ModelLoader<Uri, InputStream> mo9098b(MultiModelLoaderFactory rVar) {
            return new MediaStoreImageThumbLoader(this.f10782a);
        }
    }

    public MediaStoreImageThumbLoader(Context context) {
        this.f10781a = context.getApplicationContext();
    }

    /* renamed from: c */
    public C1535a<InputStream> mo9093a(Uri uri, int i, int i2, Options iVar) {
        if (MediaStoreUtil.m12571d(i, i2)) {
            return new C1535a<>(new ObjectKey(uri), ThumbFetcher.m12574d(this.f10781a, uri));
        }
        return null;
    }

    /* renamed from: d */
    public boolean mo9094b(Uri uri) {
        return MediaStoreUtil.m12568a(uri);
    }
}
