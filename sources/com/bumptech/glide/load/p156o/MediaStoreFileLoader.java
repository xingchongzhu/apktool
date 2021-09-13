package com.bumptech.glide.load.p156o;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataFetcher.C1422a;
import com.bumptech.glide.load.data.p151o.MediaStoreUtil;
import com.bumptech.glide.load.p156o.ModelLoader.C1535a;
import com.bumptech.glide.p173s.ObjectKey;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: com.bumptech.glide.load.o.k */
public final class MediaStoreFileLoader implements ModelLoader<Uri, File> {

    /* renamed from: a */
    private final Context f10724a;

    /* renamed from: com.bumptech.glide.load.o.k$a */
    /* compiled from: MediaStoreFileLoader */
    public static final class C1531a implements ModelLoaderFactory<Uri, File> {

        /* renamed from: a */
        private final Context f10725a;

        public C1531a(Context context) {
            this.f10725a = context;
        }

        /* renamed from: b */
        public ModelLoader<Uri, File> mo9098b(MultiModelLoaderFactory rVar) {
            return new MediaStoreFileLoader(this.f10725a);
        }
    }

    /* renamed from: com.bumptech.glide.load.o.k$b */
    /* compiled from: MediaStoreFileLoader */
    private static class C1532b implements DataFetcher<File> {

        /* renamed from: a */
        private static final String[] f10726a = {"_data"};

        /* renamed from: b */
        private final Context f10727b;

        /* renamed from: c */
        private final Uri f10728c;

        C1532b(Context context, Uri uri) {
            this.f10727b = context;
            this.f10728c = uri;
        }

        /* renamed from: a */
        public Class<File> mo8780a() {
            return File.class;
        }

        /* renamed from: b */
        public void mo8785b() {
        }

        public void cancel() {
        }

        /* renamed from: e */
        public DataSource mo8789e() {
            return DataSource.LOCAL;
        }

        /* renamed from: f */
        public void mo8790f(Priority gVar, C1422a<? super File> aVar) {
            Cursor query = this.f10727b.getContentResolver().query(this.f10728c, f10726a, null, null, null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to find file path for: ");
                sb.append(this.f10728c);
                aVar.mo8796c(new FileNotFoundException(sb.toString()));
                return;
            }
            aVar.mo8797d(new File(str));
        }
    }

    public MediaStoreFileLoader(Context context) {
        this.f10724a = context;
    }

    /* renamed from: c */
    public C1535a<File> mo9093a(Uri uri, int i, int i2, Options iVar) {
        return new C1535a<>(new ObjectKey(uri), new C1532b(this.f10724a, uri));
    }

    /* renamed from: d */
    public boolean mo9094b(Uri uri) {
        return MediaStoreUtil.m12569b(uri);
    }
}
