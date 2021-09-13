package com.bumptech.glide.load.p156o.p157y;

import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.p156o.GlideUrl;
import com.bumptech.glide.load.p156o.ModelLoader;
import com.bumptech.glide.load.p156o.ModelLoader.C1535a;
import com.bumptech.glide.load.p156o.ModelLoaderFactory;
import com.bumptech.glide.load.p156o.MultiModelLoaderFactory;
import java.io.InputStream;
import java.net.URL;

/* renamed from: com.bumptech.glide.load.o.y.e */
public class UrlLoader implements ModelLoader<URL, InputStream> {

    /* renamed from: a */
    private final ModelLoader<GlideUrl, InputStream> f10802a;

    /* renamed from: com.bumptech.glide.load.o.y.e$a */
    /* compiled from: UrlLoader */
    public static class C1563a implements ModelLoaderFactory<URL, InputStream> {
        /* renamed from: b */
        public ModelLoader<URL, InputStream> mo9098b(MultiModelLoaderFactory rVar) {
            return new UrlLoader(rVar.mo9152d(GlideUrl.class, InputStream.class));
        }
    }

    public UrlLoader(ModelLoader<GlideUrl, InputStream> nVar) {
        this.f10802a = nVar;
    }

    /* renamed from: c */
    public C1535a<InputStream> mo9093a(URL url, int i, int i2, Options iVar) {
        return this.f10802a.mo9093a(new GlideUrl(url), i, i2, iVar);
    }

    /* renamed from: d */
    public boolean mo9094b(URL url) {
        return true;
    }
}
