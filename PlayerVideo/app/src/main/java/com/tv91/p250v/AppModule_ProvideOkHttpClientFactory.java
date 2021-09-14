package com.tv91.p250v;

import dagger.internal.Preconditions;
import okhttp3.OkHttpClient;

/* renamed from: com.tv91.v.b */
public final class AppModule_ProvideOkHttpClientFactory {
    /* renamed from: a */
    public static OkHttpClient m20602a() {
        return (OkHttpClient) Preconditions.checkNotNullFromProvides(AppModule.m20600b());
    }
}
