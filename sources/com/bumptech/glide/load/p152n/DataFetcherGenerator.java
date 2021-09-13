package com.bumptech.glide.load.p152n;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher;

/* renamed from: com.bumptech.glide.load.n.f */
interface DataFetcherGenerator {

    /* renamed from: com.bumptech.glide.load.n.f$a */
    /* compiled from: DataFetcherGenerator */
    public interface C1475a {
        /* renamed from: a */
        void mo8965a();

        /* renamed from: b */
        void mo8966b(Key gVar, Exception exc, DataFetcher<?> dVar, DataSource aVar);

        /* renamed from: c */
        void mo8967c(Key gVar, Object obj, DataFetcher<?> dVar, DataSource aVar, Key gVar2);
    }

    void cancel();

    /* renamed from: e */
    boolean mo8942e();
}
