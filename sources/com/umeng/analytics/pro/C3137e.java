package com.umeng.analytics.pro;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.umeng.analytics.pro.UMDBConfig.C3125a;
import com.umeng.analytics.pro.UMDBConfig.C3128b;
import com.umeng.analytics.pro.UMDBConfig.C3131c;
import com.umeng.analytics.pro.UMDBConfig.C3134d;

/* renamed from: com.umeng.analytics.pro.e */
/* compiled from: UMDBCreater */
class C3137e extends SQLiteOpenHelper {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static Context f17031b;

    /* renamed from: a */
    private String f17032a;

    /* renamed from: com.umeng.analytics.pro.e$a */
    /* compiled from: UMDBCreater */
    private static class C3139a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C3137e f17033a;

        static {
            C3137e eVar = new C3137e(C3137e.f17031b, UMDBUtils.m21936b(C3137e.f17031b), UMDBConfig.f16965b, null, 2);
            f17033a = eVar;
        }

        private C3139a() {
        }
    }

    /* renamed from: a */
    public static C3137e m21915a(Context context) {
        if (f17031b == null) {
            f17031b = context.getApplicationContext();
        }
        return C3139a.f17033a;
    }

    /* renamed from: c */
    private void m21920c(SQLiteDatabase sQLiteDatabase) {
        String str = "create table if not exists __sd(id INTEGER primary key autoincrement, __ii TEXT unique, __a TEXT, __b TEXT, __c TEXT, __d TEXT, __e TEXT, __f TEXT, __g TEXT, __sp TEXT, __pp TEXT, __av TEXT, __vc TEXT)";
        try {
            this.f17032a = str;
            sQLiteDatabase.execSQL(str);
        } catch (SQLException unused) {
        }
    }

    /* renamed from: d */
    private void m21921d(SQLiteDatabase sQLiteDatabase) {
        String str = "create table if not exists __is(id INTEGER primary key autoincrement, __ii TEXT unique, __e TEXT, __sp TEXT, __pp TEXT, __av TEXT, __vc TEXT)";
        try {
            this.f17032a = str;
            sQLiteDatabase.execSQL(str);
        } catch (SQLException unused) {
        }
    }

    /* renamed from: e */
    private void m21922e(SQLiteDatabase sQLiteDatabase) {
        String str = C3134d.f17006a;
        String str2 = "__av";
        String str3 = "__vc";
        String str4 = "TEXT";
        if (!UMDBUtils.m21934a(sQLiteDatabase, str, str2)) {
            UMDBUtils.m21933a(sQLiteDatabase, str, "__sp", str4);
            UMDBUtils.m21933a(sQLiteDatabase, str, "__pp", str4);
            UMDBUtils.m21933a(sQLiteDatabase, str, str2, str4);
            UMDBUtils.m21933a(sQLiteDatabase, str, str3, str4);
        }
        String str5 = C3128b.f16980a;
        if (!UMDBUtils.m21934a(sQLiteDatabase, str5, str2)) {
            UMDBUtils.m21933a(sQLiteDatabase, str5, str2, str4);
            UMDBUtils.m21933a(sQLiteDatabase, str5, str3, str4);
        }
        String str6 = C3125a.f16969a;
        if (!UMDBUtils.m21934a(sQLiteDatabase, str6, str2)) {
            UMDBUtils.m21933a(sQLiteDatabase, str6, str2, str4);
            UMDBUtils.m21933a(sQLiteDatabase, str6, str3, str4);
        }
    }

    /* renamed from: f */
    private void m21923f(SQLiteDatabase sQLiteDatabase) {
        m21917a(sQLiteDatabase, C3134d.f17006a);
        m21917a(sQLiteDatabase, C3128b.f16980a);
        m21917a(sQLiteDatabase, C3125a.f16969a);
        mo19084a();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0019 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.database.sqlite.SQLiteDatabase r2) {
        /*
            r1 = this;
            r2.beginTransaction()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0019, all -> 0x0016 }
            r1.m21920c(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0019, all -> 0x0016 }
            r1.m21921d(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0019, all -> 0x0016 }
            r1.m21919b(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0019, all -> 0x0016 }
            r1.m21916a(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0019, all -> 0x0016 }
            r2.setTransactionSuccessful()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0019, all -> 0x0016 }
        L_0x0012:
            r2.endTransaction()     // Catch:{ all -> 0x0021 }
            goto L_0x0021
        L_0x0016:
            if (r2 == 0) goto L_0x0021
            goto L_0x0012
        L_0x0019:
            android.content.Context r0 = f17031b     // Catch:{ all -> 0x0022 }
            com.umeng.analytics.pro.UMDBUtils.m21932a(r0)     // Catch:{ all -> 0x0022 }
            if (r2 == 0) goto L_0x0021
            goto L_0x0012
        L_0x0021:
            return
        L_0x0022:
            r0 = move-exception
            if (r2 == 0) goto L_0x0028
            r2.endTransaction()     // Catch:{ all -> 0x0028 }
        L_0x0028:
            goto L_0x002a
        L_0x0029:
            throw r0
        L_0x002a:
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3137e.onCreate(android.database.sqlite.SQLiteDatabase):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:3|4|5|6|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
        m21923f(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0009 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
        /*
            r0 = this;
            if (r3 <= r2) goto L_0x0010
            r3 = 1
            if (r2 != r3) goto L_0x0010
            r0.m21922e(r1)     // Catch:{ Exception -> 0x0009 }
            goto L_0x0010
        L_0x0009:
            r0.m21922e(r1)     // Catch:{ Exception -> 0x000d }
            goto L_0x0010
        L_0x000d:
            r0.m21923f(r1)
        L_0x0010:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3137e.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }

    private C3137e(Context context, String str, String str2, CursorFactory cursorFactory, int i) {
        this(new UMDBCreater(context, str), str2, cursorFactory, i);
    }

    /* renamed from: b */
    private void m21919b(SQLiteDatabase sQLiteDatabase) {
        String str = "create table if not exists __et(id INTEGER primary key autoincrement, __i TEXT, __e TEXT, __s TEXT, __t INTEGER, __av TEXT, __vc TEXT)";
        try {
            this.f17032a = str;
            sQLiteDatabase.execSQL(str);
        } catch (SQLException unused) {
        }
    }

    private C3137e(Context context, String str, CursorFactory cursorFactory, int i) {
        if (TextUtils.isEmpty(str)) {
            str = UMDBConfig.f16965b;
        }
        super(context, str, cursorFactory, i);
        this.f17032a = null;
        mo19084a();
    }

    /* renamed from: a */
    public void mo19084a() {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (!UMDBUtils.m21935a(C3134d.f17006a, writableDatabase)) {
                m21920c(writableDatabase);
            }
            if (!UMDBUtils.m21935a(C3131c.f16993a, writableDatabase)) {
                m21921d(writableDatabase);
            }
            if (!UMDBUtils.m21935a(C3128b.f16980a, writableDatabase)) {
                m21919b(writableDatabase);
            }
            if (!UMDBUtils.m21935a(C3125a.f16969a, writableDatabase)) {
                m21916a(writableDatabase);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m21916a(SQLiteDatabase sQLiteDatabase) {
        String str = "create table if not exists __er(id INTEGER primary key autoincrement, __i TEXT, __a TEXT, __t INTEGER, __av TEXT, __vc TEXT)";
        try {
            this.f17032a = str;
            sQLiteDatabase.execSQL(str);
        } catch (SQLException unused) {
        }
    }

    /* renamed from: a */
    private void m21917a(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("DROP TABLE IF EXISTS ");
            sb.append(str);
            sQLiteDatabase.execSQL(sb.toString());
        } catch (SQLException unused) {
        }
    }
}
