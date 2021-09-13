package com.tv91.p250v;

import android.content.Context;
import android.content.SharedPreferences;
import com.tv91.p255z.p256g.RetryInterceptor;
import p271e.OkHttpClient;
import p271e.OkHttpClient.C3375b;

/* renamed from: com.tv91.v.a */
public abstract class AppModule {
    /* renamed from: a */
    public static boolean m20599a() {
        return false;
    }

    /* renamed from: b */
    public static OkHttpClient m20600b() {
        return new C3375b().mo20127a(new RetryInterceptor()).mo20128b();
    }

    /* renamed from: c */
    public static SharedPreferences m20601c(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".Pref");
        return context.getSharedPreferences(sb.toString(), 0);
    }
}
