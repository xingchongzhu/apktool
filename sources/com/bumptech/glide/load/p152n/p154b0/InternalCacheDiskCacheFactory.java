package com.bumptech.glide.load.p152n.p154b0;

import android.content.Context;
import com.bumptech.glide.load.p152n.p154b0.DiskLruCacheFactory.C1459a;
import java.io.File;

/* renamed from: com.bumptech.glide.load.n.b0.f */
public final class InternalCacheDiskCacheFactory extends DiskLruCacheFactory {

    /* renamed from: com.bumptech.glide.load.n.b0.f$a */
    /* compiled from: InternalCacheDiskCacheFactory */
    class C1460a implements C1459a {

        /* renamed from: a */
        final /* synthetic */ Context f10423a;

        /* renamed from: b */
        final /* synthetic */ String f10424b;

        C1460a(Context context, String str) {
            this.f10423a = context;
            this.f10424b = str;
        }

        /* renamed from: a */
        public File mo8920a() {
            File cacheDir = this.f10423a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f10424b != null ? new File(cacheDir, this.f10424b) : cacheDir;
        }
    }

    public InternalCacheDiskCacheFactory(Context context) {
        this(context, "image_manager_disk_cache", 262144000);
    }

    public InternalCacheDiskCacheFactory(Context context, String str, long j) {
        super(new C1460a(context, str), j);
    }
}
