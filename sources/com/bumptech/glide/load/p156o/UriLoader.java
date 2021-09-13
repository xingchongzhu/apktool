package com.bumptech.glide.load.p156o;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.AssetFileDescriptorLocalUriFetcher;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.FileDescriptorLocalUriFetcher;
import com.bumptech.glide.load.data.StreamLocalUriFetcher;
import com.bumptech.glide.load.p156o.ModelLoader.C1535a;
import com.bumptech.glide.p173s.ObjectKey;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.o.w */
public class UriLoader<Data> implements ModelLoader<Uri, Data> {

    /* renamed from: a */
    private static final Set<String> f10771a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "android.resource", "content"})));

    /* renamed from: b */
    private final C1553c<Data> f10772b;

    /* renamed from: com.bumptech.glide.load.o.w$a */
    /* compiled from: UriLoader */
    public static final class C1551a implements ModelLoaderFactory<Uri, AssetFileDescriptor>, C1553c<AssetFileDescriptor> {

        /* renamed from: a */
        private final ContentResolver f10773a;

        public C1551a(ContentResolver contentResolver) {
            this.f10773a = contentResolver;
        }

        /* renamed from: a */
        public DataFetcher<AssetFileDescriptor> mo9165a(Uri uri) {
            return new AssetFileDescriptorLocalUriFetcher(this.f10773a, uri);
        }

        /* renamed from: b */
        public ModelLoader<Uri, AssetFileDescriptor> mo9098b(MultiModelLoaderFactory rVar) {
            return new UriLoader(this);
        }
    }

    /* renamed from: com.bumptech.glide.load.o.w$b */
    /* compiled from: UriLoader */
    public static class C1552b implements ModelLoaderFactory<Uri, ParcelFileDescriptor>, C1553c<ParcelFileDescriptor> {

        /* renamed from: a */
        private final ContentResolver f10774a;

        public C1552b(ContentResolver contentResolver) {
            this.f10774a = contentResolver;
        }

        /* renamed from: a */
        public DataFetcher<ParcelFileDescriptor> mo9165a(Uri uri) {
            return new FileDescriptorLocalUriFetcher(this.f10774a, uri);
        }

        /* renamed from: b */
        public ModelLoader<Uri, ParcelFileDescriptor> mo9098b(MultiModelLoaderFactory rVar) {
            return new UriLoader(this);
        }
    }

    /* renamed from: com.bumptech.glide.load.o.w$c */
    /* compiled from: UriLoader */
    public interface C1553c<Data> {
        /* renamed from: a */
        DataFetcher<Data> mo9165a(Uri uri);
    }

    /* renamed from: com.bumptech.glide.load.o.w$d */
    /* compiled from: UriLoader */
    public static class C1554d implements ModelLoaderFactory<Uri, InputStream>, C1553c<InputStream> {

        /* renamed from: a */
        private final ContentResolver f10775a;

        public C1554d(ContentResolver contentResolver) {
            this.f10775a = contentResolver;
        }

        /* renamed from: a */
        public DataFetcher<InputStream> mo9165a(Uri uri) {
            return new StreamLocalUriFetcher(this.f10775a, uri);
        }

        /* renamed from: b */
        public ModelLoader<Uri, InputStream> mo9098b(MultiModelLoaderFactory rVar) {
            return new UriLoader(this);
        }
    }

    public UriLoader(C1553c<Data> cVar) {
        this.f10772b = cVar;
    }

    /* renamed from: c */
    public C1535a<Data> mo9093a(Uri uri, int i, int i2, Options iVar) {
        return new C1535a<>(new ObjectKey(uri), this.f10772b.mo9165a(uri));
    }

    /* renamed from: d */
    public boolean mo9094b(Uri uri) {
        return f10771a.contains(uri.getScheme());
    }
}
