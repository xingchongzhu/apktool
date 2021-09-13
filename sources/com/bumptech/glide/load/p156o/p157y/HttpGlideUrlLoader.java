package com.bumptech.glide.load.p156o.p157y;

import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.HttpUrlFetcher;
import com.bumptech.glide.load.p156o.GlideUrl;
import com.bumptech.glide.load.p156o.ModelCache;
import com.bumptech.glide.load.p156o.ModelLoader;
import com.bumptech.glide.load.p156o.ModelLoader.C1535a;
import com.bumptech.glide.load.p156o.ModelLoaderFactory;
import com.bumptech.glide.load.p156o.MultiModelLoaderFactory;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.o.y.a */
public class HttpGlideUrlLoader implements ModelLoader<GlideUrl, InputStream> {

    /* renamed from: a */
    public static final Option<Integer> f10778a = Option.m12607f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", Integer.valueOf(2500));

    /* renamed from: b */
    private final ModelCache<GlideUrl, GlideUrl> f10779b;

    /* renamed from: com.bumptech.glide.load.o.y.a$a */
    /* compiled from: HttpGlideUrlLoader */
    public static class C1556a implements ModelLoaderFactory<GlideUrl, InputStream> {

        /* renamed from: a */
        private final ModelCache<GlideUrl, GlideUrl> f10780a = new ModelCache<>(500);

        /* renamed from: b */
        public ModelLoader<GlideUrl, InputStream> mo9098b(MultiModelLoaderFactory rVar) {
            return new HttpGlideUrlLoader(this.f10780a);
        }
    }

    public HttpGlideUrlLoader(ModelCache<GlideUrl, GlideUrl> mVar) {
        this.f10779b = mVar;
    }

    /* renamed from: c */
    public C1535a<InputStream> mo9093a(GlideUrl gVar, int i, int i2, Options iVar) {
        ModelCache<GlideUrl, GlideUrl> mVar = this.f10779b;
        if (mVar != null) {
            GlideUrl gVar2 = (GlideUrl) mVar.mo9138a(gVar, 0, 0);
            if (gVar2 == null) {
                this.f10779b.mo9139b(gVar, 0, 0, gVar);
            } else {
                gVar = gVar2;
            }
        }
        return new C1535a<>(gVar, new HttpUrlFetcher(gVar, ((Integer) iVar.mo8835c(f10778a)).intValue()));
    }

    /* renamed from: d */
    public boolean mo9094b(GlideUrl gVar) {
        return true;
    }
}
