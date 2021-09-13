package com.bumptech.glide.load.p152n;

import com.bumptech.glide.load.C1420d;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.p152n.p154b0.DiskCache.C1456b;
import java.io.File;

/* renamed from: com.bumptech.glide.load.n.e */
class DataCacheWriter<DataType> implements C1456b {

    /* renamed from: a */
    private final C1420d<DataType> f10475a;

    /* renamed from: b */
    private final DataType f10476b;

    /* renamed from: c */
    private final Options f10477c;

    DataCacheWriter(C1420d<DataType> dVar, DataType datatype, Options iVar) {
        this.f10475a = dVar;
        this.f10476b = datatype;
        this.f10477c = iVar;
    }

    /* renamed from: a */
    public boolean mo8915a(File file) {
        return this.f10475a.mo8772a(this.f10476b, file, this.f10477c);
    }
}
