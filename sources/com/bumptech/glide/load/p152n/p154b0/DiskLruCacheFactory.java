package com.bumptech.glide.load.p152n.p154b0;

import com.bumptech.glide.load.p152n.p154b0.DiskCache.C1455a;
import java.io.File;

/* renamed from: com.bumptech.glide.load.n.b0.d */
public class DiskLruCacheFactory implements C1455a {

    /* renamed from: a */
    private final long f10416a;

    /* renamed from: b */
    private final C1459a f10417b;

    /* renamed from: com.bumptech.glide.load.n.b0.d$a */
    /* compiled from: DiskLruCacheFactory */
    public interface C1459a {
        /* renamed from: a */
        File mo8920a();
    }

    public DiskLruCacheFactory(C1459a aVar, long j) {
        this.f10416a = j;
        this.f10417b = aVar;
    }

    /* renamed from: a */
    public DiskCache mo8914a() {
        File a = this.f10417b.mo8920a();
        if (a == null) {
            return null;
        }
        if (a.isDirectory() || a.mkdirs()) {
            return DiskLruCacheWrapper.m12760c(a, this.f10416a);
        }
        return null;
    }
}
