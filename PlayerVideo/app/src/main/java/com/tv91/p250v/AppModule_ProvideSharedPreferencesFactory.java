package com.tv91.p250v;

import android.content.Context;
import android.content.SharedPreferences;
import dagger.internal.Preconditions;

/* renamed from: com.tv91.v.c */
public final class AppModule_ProvideSharedPreferencesFactory {
    /* renamed from: a */
    public static SharedPreferences m20603a(Context context) {
        return (SharedPreferences) Preconditions.checkNotNullFromProvides(AppModule.m20601c(context));
    }
}
