package com.bumptech.glide.load.p156o;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.FileDescriptorAssetPathFetcher;
import com.bumptech.glide.load.data.StreamAssetPathFetcher;
import com.bumptech.glide.load.p156o.ModelLoader.C1535a;
import com.bumptech.glide.p173s.ObjectKey;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.o.a */
public class AssetUriLoader<Data> implements ModelLoader<Uri, Data> {

    /* renamed from: a */
    private static final int f10685a = 22;

    /* renamed from: b */
    private final AssetManager f10686b;

    /* renamed from: c */
    private final C1506a<Data> f10687c;

    /* renamed from: com.bumptech.glide.load.o.a$a */
    /* compiled from: AssetUriLoader */
    public interface C1506a<Data> {
        /* renamed from: a */
        DataFetcher<Data> mo9097a(AssetManager assetManager, String str);
    }

    /* renamed from: com.bumptech.glide.load.o.a$b */
    /* compiled from: AssetUriLoader */
    public static class C1507b implements ModelLoaderFactory<Uri, ParcelFileDescriptor>, C1506a<ParcelFileDescriptor> {

        /* renamed from: a */
        private final AssetManager f10688a;

        public C1507b(AssetManager assetManager) {
            this.f10688a = assetManager;
        }

        /* renamed from: a */
        public DataFetcher<ParcelFileDescriptor> mo9097a(AssetManager assetManager, String str) {
            return new FileDescriptorAssetPathFetcher(assetManager, str);
        }

        /* renamed from: b */
        public ModelLoader<Uri, ParcelFileDescriptor> mo9098b(MultiModelLoaderFactory rVar) {
            return new AssetUriLoader(this.f10688a, this);
        }
    }

    /* renamed from: com.bumptech.glide.load.o.a$c */
    /* compiled from: AssetUriLoader */
    public static class C1508c implements ModelLoaderFactory<Uri, InputStream>, C1506a<InputStream> {

        /* renamed from: a */
        private final AssetManager f10689a;

        public C1508c(AssetManager assetManager) {
            this.f10689a = assetManager;
        }

        /* renamed from: a */
        public DataFetcher<InputStream> mo9097a(AssetManager assetManager, String str) {
            return new StreamAssetPathFetcher(assetManager, str);
        }

        /* renamed from: b */
        public ModelLoader<Uri, InputStream> mo9098b(MultiModelLoaderFactory rVar) {
            return new AssetUriLoader(this.f10689a, this);
        }
    }

    public AssetUriLoader(AssetManager assetManager, C1506a<Data> aVar) {
        this.f10686b = assetManager;
        this.f10687c = aVar;
    }

    /* renamed from: c */
    public C1535a<Data> mo9093a(Uri uri, int i, int i2, Options iVar) {
        return new C1535a<>(new ObjectKey(uri), this.f10687c.mo9097a(this.f10686b, uri.toString().substring(f10685a)));
    }

    /* renamed from: d */
    public boolean mo9094b(Uri uri) {
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty()) {
            return false;
        }
        if ("android_asset".equals(uri.getPathSegments().get(0))) {
            return true;
        }
        return false;
    }
}
