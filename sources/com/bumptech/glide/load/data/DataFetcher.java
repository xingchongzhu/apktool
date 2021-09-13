package com.bumptech.glide.load.data;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;

/* renamed from: com.bumptech.glide.load.data.d */
public interface DataFetcher<T> {

    /* renamed from: com.bumptech.glide.load.data.d$a */
    /* compiled from: DataFetcher */
    public interface C1422a<T> {
        /* renamed from: c */
        void mo8796c(Exception exc);

        /* renamed from: d */
        void mo8797d(T t);
    }

    /* renamed from: a */
    Class<T> mo8780a();

    /* renamed from: b */
    void mo8785b();

    void cancel();

    /* renamed from: e */
    DataSource mo8789e();

    /* renamed from: f */
    void mo8790f(Priority gVar, C1422a<? super T> aVar);
}
