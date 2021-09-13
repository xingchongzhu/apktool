package com.umeng.analytics.pro;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.umeng.analytics.pro.f */
class UMDBManager {

    /* renamed from: b */
    private static SQLiteOpenHelper f17034b;

    /* renamed from: d */
    private static Context f17035d;

    /* renamed from: a */
    private AtomicInteger f17036a;

    /* renamed from: c */
    private SQLiteDatabase f17037c;

    /* renamed from: com.umeng.analytics.pro.f$a */
    /* compiled from: UMDBManager */
    private static class C3141a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final UMDBManager f17038a = new UMDBManager();

        private C3141a() {
        }
    }

    /* renamed from: a */
    public static UMDBManager m21926a(Context context) {
        if (f17035d == null && context != null) {
            Context applicationContext = context.getApplicationContext();
            f17035d = applicationContext;
            f17034b = C3137e.m21915a(applicationContext);
        }
        return C3141a.f17038a;
    }

    /* renamed from: b */
    public synchronized void mo19088b() {
        try {
            if (this.f17036a.decrementAndGet() == 0) {
                this.f17037c.close();
            }
        } catch (Throwable unused) {
        }
    }

    private UMDBManager() {
        this.f17036a = new AtomicInteger();
    }

    /* renamed from: a */
    public synchronized SQLiteDatabase mo19087a() {
        if (this.f17036a.incrementAndGet() == 1) {
            this.f17037c = f17034b.getWritableDatabase();
        }
        return this.f17037c;
    }
}
