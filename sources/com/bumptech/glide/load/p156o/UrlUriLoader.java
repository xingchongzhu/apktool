package com.bumptech.glide.load.p156o;

import android.net.Uri;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.p156o.ModelLoader.C1535a;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.o.x */
public class UrlUriLoader<Data> implements ModelLoader<Uri, Data> {

    /* renamed from: a */
    private static final Set<String> f10776a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));

    /* renamed from: b */
    private final ModelLoader<GlideUrl, Data> f10777b;

    /* renamed from: com.bumptech.glide.load.o.x$a */
    /* compiled from: UrlUriLoader */
    public static class C1555a implements ModelLoaderFactory<Uri, InputStream> {
        /* renamed from: b */
        public ModelLoader<Uri, InputStream> mo9098b(MultiModelLoaderFactory rVar) {
            return new UrlUriLoader(rVar.mo9152d(GlideUrl.class, InputStream.class));
        }
    }

    public UrlUriLoader(ModelLoader<GlideUrl, Data> nVar) {
        this.f10777b = nVar;
    }

    /* renamed from: c */
    public C1535a<Data> mo9093a(Uri uri, int i, int i2, Options iVar) {
        return this.f10777b.mo9093a(new GlideUrl(uri.toString()), i, i2, iVar);
    }

    /* renamed from: d */
    public boolean mo9094b(Uri uri) {
        return f10776a.contains(uri.getScheme());
    }
}
