package com.bumptech.glide.load.data;

import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.e */
public interface DataRewinder<T> {

    /* renamed from: com.bumptech.glide.load.data.e$a */
    /* compiled from: DataRewinder */
    public interface C1423a<T> {
        /* renamed from: a */
        Class<T> mo8777a();

        /* renamed from: b */
        DataRewinder<T> mo8778b(T t);
    }

    /* renamed from: a */
    T mo8773a() throws IOException;

    /* renamed from: b */
    void mo8774b();
}
