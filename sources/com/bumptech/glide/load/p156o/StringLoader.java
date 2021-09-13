package com.bumptech.glide.load.p156o;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.p156o.ModelLoader.C1535a;
import java.io.File;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.o.u */
public class StringLoader<Data> implements ModelLoader<String, Data> {

    /* renamed from: a */
    private final ModelLoader<Uri, Data> f10767a;

    /* renamed from: com.bumptech.glide.load.o.u$a */
    /* compiled from: StringLoader */
    public static final class C1546a implements ModelLoaderFactory<String, AssetFileDescriptor> {
        /* renamed from: b */
        public ModelLoader<String, AssetFileDescriptor> mo9098b(MultiModelLoaderFactory rVar) {
            return new StringLoader(rVar.mo9152d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.o.u$b */
    /* compiled from: StringLoader */
    public static class C1547b implements ModelLoaderFactory<String, ParcelFileDescriptor> {
        /* renamed from: b */
        public ModelLoader<String, ParcelFileDescriptor> mo9098b(MultiModelLoaderFactory rVar) {
            return new StringLoader(rVar.mo9152d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.o.u$c */
    /* compiled from: StringLoader */
    public static class C1548c implements ModelLoaderFactory<String, InputStream> {
        /* renamed from: b */
        public ModelLoader<String, InputStream> mo9098b(MultiModelLoaderFactory rVar) {
            return new StringLoader(rVar.mo9152d(Uri.class, InputStream.class));
        }
    }

    public StringLoader(ModelLoader<Uri, Data> nVar) {
        this.f10767a = nVar;
    }

    /* renamed from: e */
    private static Uri m13179e(String str) {
        Uri uri;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            uri = m13180f(str);
        } else {
            Uri parse = Uri.parse(str);
            uri = parse.getScheme() == null ? m13180f(str) : parse;
        }
        return uri;
    }

    /* renamed from: f */
    private static Uri m13180f(String str) {
        return Uri.fromFile(new File(str));
    }

    /* renamed from: c */
    public C1535a<Data> mo9093a(String str, int i, int i2, Options iVar) {
        Uri e = m13179e(str);
        if (e == null || !this.f10767a.mo9094b(e)) {
            return null;
        }
        return this.f10767a.mo9093a(e, i, i2, iVar);
    }

    /* renamed from: d */
    public boolean mo9094b(String str) {
        return true;
    }
}
