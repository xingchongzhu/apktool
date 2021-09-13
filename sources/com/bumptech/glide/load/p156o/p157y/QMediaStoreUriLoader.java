package com.bumptech.glide.load.p156o.p157y;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataFetcher.C1422a;
import com.bumptech.glide.load.data.p151o.MediaStoreUtil;
import com.bumptech.glide.load.p156o.ModelLoader;
import com.bumptech.glide.load.p156o.ModelLoader.C1535a;
import com.bumptech.glide.load.p156o.ModelLoaderFactory;
import com.bumptech.glide.load.p156o.MultiModelLoaderFactory;
import com.bumptech.glide.p173s.ObjectKey;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.o.y.d */
public final class QMediaStoreUriLoader<DataT> implements ModelLoader<Uri, DataT> {

    /* renamed from: a */
    private final Context f10785a;

    /* renamed from: b */
    private final ModelLoader<File, DataT> f10786b;

    /* renamed from: c */
    private final ModelLoader<Uri, DataT> f10787c;

    /* renamed from: d */
    private final Class<DataT> f10788d;

    /* renamed from: com.bumptech.glide.load.o.y.d$a */
    /* compiled from: QMediaStoreUriLoader */
    private static abstract class C1559a<DataT> implements ModelLoaderFactory<Uri, DataT> {

        /* renamed from: a */
        private final Context f10789a;

        /* renamed from: b */
        private final Class<DataT> f10790b;

        C1559a(Context context, Class<DataT> cls) {
            this.f10789a = context;
            this.f10790b = cls;
        }

        /* renamed from: b */
        public final ModelLoader<Uri, DataT> mo9098b(MultiModelLoaderFactory rVar) {
            return new QMediaStoreUriLoader(this.f10789a, rVar.mo9152d(File.class, this.f10790b), rVar.mo9152d(Uri.class, this.f10790b), this.f10790b);
        }
    }

    /* renamed from: com.bumptech.glide.load.o.y.d$b */
    /* compiled from: QMediaStoreUriLoader */
    public static final class C1560b extends C1559a<ParcelFileDescriptor> {
        public C1560b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* renamed from: com.bumptech.glide.load.o.y.d$c */
    /* compiled from: QMediaStoreUriLoader */
    public static final class C1561c extends C1559a<InputStream> {
        public C1561c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: com.bumptech.glide.load.o.y.d$d */
    /* compiled from: QMediaStoreUriLoader */
    private static final class C1562d<DataT> implements DataFetcher<DataT> {

        /* renamed from: a */
        private static final String[] f10791a = {"_data"};

        /* renamed from: b */
        private final Context f10792b;

        /* renamed from: c */
        private final ModelLoader<File, DataT> f10793c;

        /* renamed from: d */
        private final ModelLoader<Uri, DataT> f10794d;

        /* renamed from: e */
        private final Uri f10795e;

        /* renamed from: f */
        private final int f10796f;

        /* renamed from: g */
        private final int f10797g;

        /* renamed from: h */
        private final Options f10798h;

        /* renamed from: i */
        private final Class<DataT> f10799i;

        /* renamed from: j */
        private volatile boolean f10800j;

        /* renamed from: k */
        private volatile DataFetcher<DataT> f10801k;

        C1562d(Context context, ModelLoader<File, DataT> nVar, ModelLoader<Uri, DataT> nVar2, Uri uri, int i, int i2, Options iVar, Class<DataT> cls) {
            this.f10792b = context.getApplicationContext();
            this.f10793c = nVar;
            this.f10794d = nVar2;
            this.f10795e = uri;
            this.f10796f = i;
            this.f10797g = i2;
            this.f10798h = iVar;
            this.f10799i = cls;
        }

        /* renamed from: c */
        private C1535a<DataT> m13234c() throws FileNotFoundException {
            if (Environment.isExternalStorageLegacy()) {
                return this.f10793c.mo9093a(m13237h(this.f10795e), this.f10796f, this.f10797g, this.f10798h);
            }
            return this.f10794d.mo9093a(m13236g() ? MediaStore.setRequireOriginal(this.f10795e) : this.f10795e, this.f10796f, this.f10797g, this.f10798h);
        }

        /* renamed from: d */
        private DataFetcher<DataT> m13235d() throws FileNotFoundException {
            C1535a c = m13234c();
            if (c != null) {
                return c.f10737c;
            }
            return null;
        }

        /* renamed from: g */
        private boolean m13236g() {
            return this.f10792b.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        /* renamed from: h */
        private File m13237h(Uri uri) throws FileNotFoundException {
            Cursor cursor = null;
            try {
                cursor = this.f10792b.getContentResolver().query(uri, f10791a, null, null, null);
                if (cursor == null || !cursor.moveToFirst()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to media store entry for: ");
                    sb.append(uri);
                    throw new FileNotFoundException(sb.toString());
                }
                String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    cursor.close();
                    return file;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("File path was empty in media store for: ");
                sb2.append(uri);
                throw new FileNotFoundException(sb2.toString());
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }

        /* renamed from: a */
        public Class<DataT> mo8780a() {
            return this.f10799i;
        }

        /* renamed from: b */
        public void mo8785b() {
            DataFetcher<DataT> dVar = this.f10801k;
            if (dVar != null) {
                dVar.mo8785b();
            }
        }

        public void cancel() {
            this.f10800j = true;
            DataFetcher<DataT> dVar = this.f10801k;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        /* renamed from: e */
        public DataSource mo8789e() {
            return DataSource.LOCAL;
        }

        /* renamed from: f */
        public void mo8790f(Priority gVar, C1422a<? super DataT> aVar) {
            try {
                DataFetcher<DataT> d = m13235d();
                if (d == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to build fetcher for: ");
                    sb.append(this.f10795e);
                    aVar.mo8796c(new IllegalArgumentException(sb.toString()));
                    return;
                }
                this.f10801k = d;
                if (this.f10800j) {
                    cancel();
                } else {
                    d.mo8790f(gVar, aVar);
                }
            } catch (FileNotFoundException e) {
                aVar.mo8796c(e);
            }
        }
    }

    QMediaStoreUriLoader(Context context, ModelLoader<File, DataT> nVar, ModelLoader<Uri, DataT> nVar2, Class<DataT> cls) {
        this.f10785a = context.getApplicationContext();
        this.f10786b = nVar;
        this.f10787c = nVar2;
        this.f10788d = cls;
    }

    /* renamed from: c */
    public C1535a<DataT> mo9093a(Uri uri, int i, int i2, Options iVar) {
        Uri uri2 = uri;
        ObjectKey bVar = new ObjectKey(uri);
        C1562d dVar = new C1562d(this.f10785a, this.f10786b, this.f10787c, uri2, i, i2, iVar, this.f10788d);
        return new C1535a<>(bVar, dVar);
    }

    /* renamed from: d */
    public boolean mo9094b(Uri uri) {
        return VERSION.SDK_INT >= 29 && MediaStoreUtil.m12569b(uri);
    }
}
