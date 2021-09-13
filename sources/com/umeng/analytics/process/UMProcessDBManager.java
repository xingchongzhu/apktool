package com.umeng.analytics.process;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.umeng.commonsdk.service.UMGlobalContext;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.umeng.analytics.process.c */
class UMProcessDBManager {

    /* renamed from: a */
    private static UMProcessDBManager f17303a;

    /* renamed from: b */
    private ConcurrentHashMap<String, C3166a> f17304b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private Context f17305c;

    /* renamed from: com.umeng.analytics.process.c$a */
    /* compiled from: UMProcessDBManager */
    static class C3166a {

        /* renamed from: a */
        private AtomicInteger f17306a = new AtomicInteger();

        /* renamed from: b */
        private SQLiteOpenHelper f17307b;

        /* renamed from: c */
        private SQLiteDatabase f17308c;

        private C3166a() {
        }

        /* renamed from: a */
        static C3166a m22166a(Context context, String str) {
            Context appContext = UMGlobalContext.getAppContext(context);
            C3166a aVar = new C3166a();
            aVar.f17307b = UMProcessDBCreater.m22158a(appContext, str);
            return aVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public synchronized void mo19214b() {
            try {
                if (this.f17306a.decrementAndGet() == 0) {
                    this.f17308c.close();
                }
            } catch (Throwable unused) {
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public synchronized SQLiteDatabase mo19213a() {
            if (this.f17306a.incrementAndGet() == 1) {
                this.f17308c = this.f17307b.getWritableDatabase();
            }
            return this.f17308c;
        }
    }

    private UMProcessDBManager() {
    }

    /* renamed from: a */
    static UMProcessDBManager m22162a(Context context) {
        if (f17303a == null) {
            synchronized (UMProcessDBManager.class) {
                if (f17303a == null) {
                    f17303a = new UMProcessDBManager();
                }
            }
        }
        UMProcessDBManager cVar = f17303a;
        cVar.f17305c = context;
        return cVar;
    }

    /* renamed from: c */
    private C3166a m22163c(String str) {
        if (this.f17304b.get(str) != null) {
            return (C3166a) this.f17304b.get(str);
        }
        C3166a a = C3166a.m22166a(this.f17305c, str);
        this.f17304b.put(str, a);
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized void mo19212b(String str) {
        m22163c(str).mo19214b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized SQLiteDatabase mo19211a(String str) {
        return m22163c(str).mo19213a();
    }
}
