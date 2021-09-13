package com.umeng.analytics.pro;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteOpenHelper;
import com.umeng.commonsdk.debug.UMRTLog;

/* renamed from: com.umeng.analytics.pro.ak */
public class CacheDBHelper extends SQLiteOpenHelper {

    /* renamed from: b */
    private static final Object f16709b = new Object();

    /* renamed from: c */
    private static CacheDBHelper f16710c = null;

    /* renamed from: d */
    private static final String f16711d = "CREATE TABLE IF NOT EXISTS stf(_id INTEGER PRIMARY KEY AUTOINCREMENT, _tp TEXT, _hd TEXT, _bd TEXT, _ts TEXT, _uuid TEXT, _re1 TEXT, _re2 TEXT)";

    /* renamed from: e */
    private static final String f16712e = "DROP TABLE IF EXISTS stf";

    /* renamed from: f */
    private static final String f16713f = "DELETE FROM stf WHERE _id IN( SELECT _id FROM stf ORDER BY _id LIMIT 1)";

    /* renamed from: a */
    private final Context f16714a;

    private CacheDBHelper(Context context, String str, CursorFactory cursorFactory, int i) {
        super(context, str, cursorFactory, i);
        this.f16714a = context;
    }

    /* renamed from: a */
    public static final int m21591a() {
        return 1;
    }

    /* renamed from: a */
    public static CacheDBHelper m21592a(Context context) {
        CacheDBHelper akVar;
        synchronized (f16709b) {
            if (f16710c == null) {
                f16710c = new CacheDBHelper(context, Constants.f16722b, null, 1);
            }
            akVar = f16710c;
        }
        return akVar;
    }

    /* renamed from: b */
    private void m21594b(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(f16711d);
        } catch (SQLiteDatabaseCorruptException unused) {
            m21593a(sQLiteDatabase);
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder();
            sb.append("--->>> [有状态]创建二级缓存数据库失败: ");
            sb.append(th.getMessage());
            UMRTLog.m22228e(UMRTLog.RTLOG_TAG, sb.toString());
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0011 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m21595d() {
        /*
            r2 = this;
            android.database.sqlite.SQLiteDatabase r0 = r2.getWritableDatabase()     // Catch:{ all -> 0x0014 }
            if (r0 == 0) goto L_0x0014
            boolean r1 = r0.isOpen()     // Catch:{ all -> 0x0014 }
            if (r1 == 0) goto L_0x0014
            java.lang.String r1 = "DELETE FROM stf WHERE _id IN( SELECT _id FROM stf ORDER BY _id LIMIT 1)"
            r0.execSQL(r1)     // Catch:{ all -> 0x0011 }
        L_0x0011:
            r0.close()     // Catch:{ all -> 0x0014 }
        L_0x0014:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.CacheDBHelper.m21595d():void");
    }

    /* renamed from: c */
    public boolean mo18947c() {
        return !mo18946b(Constants.f16723c);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m21594b(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* renamed from: b */
    public void mo18945b() {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase != null && writableDatabase.isOpen()) {
                writableDatabase.close();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private void m21593a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(f16712e);
            sQLiteDatabase.execSQL(f16711d);
        } catch (SQLException unused) {
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r12v4, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        if (r10 != 0) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003e, code lost:
        if (r10 == 0) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0044, code lost:
        return false;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo18946b(java.lang.String r12) {
        /*
            r11 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r10 = r11.getWritableDatabase()     // Catch:{ all -> 0x0038 }
            if (r10 == 0) goto L_0x001e
            boolean r1 = r10.isOpen()     // Catch:{ all -> 0x001c }
            if (r1 == 0) goto L_0x001e
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r1 = r10
            r2 = r12
            android.database.Cursor r12 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x001c }
            r0 = r12
            goto L_0x001e
        L_0x001c:
            goto L_0x0039
        L_0x001e:
            if (r0 == 0) goto L_0x0030
            int r12 = r0.getCount()     // Catch:{ all -> 0x001c }
            if (r12 <= 0) goto L_0x0030
            r12 = 1
            r0.close()
            if (r10 == 0) goto L_0x002f
            r10.close()
        L_0x002f:
            return r12
        L_0x0030:
            if (r0 == 0) goto L_0x0035
            r0.close()
        L_0x0035:
            if (r10 == 0) goto L_0x0043
            goto L_0x0040
        L_0x0038:
            r10 = r0
        L_0x0039:
            if (r0 == 0) goto L_0x003e
            r0.close()
        L_0x003e:
            if (r10 == 0) goto L_0x0043
        L_0x0040:
            r10.close()
        L_0x0043:
            r12 = 0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.CacheDBHelper.mo18946b(java.lang.String):boolean");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18942a(java.lang.String r3, android.content.ContentValues r4) {
        /*
            r2 = this;
            android.database.sqlite.SQLiteDatabase r0 = r2.getWritableDatabase()     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x0023
            boolean r1 = r0.isOpen()     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x0023
            r0.beginTransaction()     // Catch:{ all -> 0x001d }
            r1 = 0
            r0.insert(r3, r1, r4)     // Catch:{ all -> 0x001d }
            r0.setTransactionSuccessful()     // Catch:{ all -> 0x001d }
            java.lang.String r3 = "MobclickRT"
            java.lang.String r4 = "--->>> [有状态]插入二级缓存数据记录 成功。"
            com.umeng.commonsdk.debug.UMRTLog.m22228e(r3, r4)     // Catch:{ all -> 0x001d }
        L_0x001d:
            r0.endTransaction()     // Catch:{ all -> 0x0023 }
            r0.close()     // Catch:{ all -> 0x0023 }
        L_0x0023:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.CacheDBHelper.mo18942a(java.lang.String, android.content.ContentValues):void");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0015 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18944a(java.lang.String r3, java.lang.String r4, java.lang.String[] r5) {
        /*
            r2 = this;
            android.database.sqlite.SQLiteDatabase r0 = r2.getWritableDatabase()     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x001b
            boolean r1 = r0.isOpen()     // Catch:{ all -> 0x001b }
            if (r1 == 0) goto L_0x001b
            r0.beginTransaction()     // Catch:{ all -> 0x0015 }
            r0.delete(r3, r4, r5)     // Catch:{ all -> 0x0015 }
            r0.setTransactionSuccessful()     // Catch:{ all -> 0x0015 }
        L_0x0015:
            r0.endTransaction()     // Catch:{ all -> 0x001b }
            r0.close()     // Catch:{ all -> 0x001b }
        L_0x001b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.CacheDBHelper.mo18944a(java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006d, code lost:
        if (r1 != null) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006f, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0077, code lost:
        if (r1 != null) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007a, code lost:
        return r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0074 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.umeng.analytics.pro.CacheData mo18941a(java.lang.String r11) {
        /*
            r10 = this;
            r0 = 0
            java.lang.String r1 = "_uuid"
            java.lang.String r2 = "_tp"
            java.lang.String r3 = "_hd"
            java.lang.String r4 = "_bd"
            java.lang.String r5 = "_re1"
            java.lang.String r6 = "_re2"
            java.lang.String[] r3 = new java.lang.String[]{r1, r2, r3, r4, r5, r6}     // Catch:{ all -> 0x0073 }
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r9 = "1"
            r1 = r10
            r2 = r11
            android.database.Cursor r1 = r1.mo18940a(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0073 }
            if (r1 == 0) goto L_0x006d
            boolean r2 = r1.moveToFirst()     // Catch:{ all -> 0x0074 }
            if (r2 == 0) goto L_0x006d
            com.umeng.analytics.pro.al r2 = new com.umeng.analytics.pro.al     // Catch:{ all -> 0x0074 }
            r2.<init>()     // Catch:{ all -> 0x0074 }
            r0 = 0
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x006b }
            r2.f16715a = r0     // Catch:{ all -> 0x006b }
            r0 = 1
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x006b }
            r2.f16716b = r0     // Catch:{ all -> 0x006b }
            r0 = 2
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x006b }
            r3 = 3
            java.lang.String r3 = r1.getString(r3)     // Catch:{ all -> 0x006b }
            android.content.Context r4 = r10.f16714a     // Catch:{ all -> 0x006b }
            com.umeng.analytics.pro.h r4 = com.umeng.analytics.pro.UMStoreManager.m21939a(r4)     // Catch:{ all -> 0x006b }
            java.lang.String r0 = r4.mo19103d(r0)     // Catch:{ all -> 0x006b }
            r2.f16717c = r0     // Catch:{ all -> 0x006b }
            android.content.Context r0 = r10.f16714a     // Catch:{ all -> 0x006b }
            com.umeng.analytics.pro.h r0 = com.umeng.analytics.pro.UMStoreManager.m21939a(r0)     // Catch:{ all -> 0x006b }
            java.lang.String r0 = r0.mo19103d(r3)     // Catch:{ all -> 0x006b }
            r2.f16718d = r0     // Catch:{ all -> 0x006b }
            r0 = 4
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x006b }
            r2.f16719e = r0     // Catch:{ all -> 0x006b }
            r0 = 5
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x006b }
            r2.f16720f = r0     // Catch:{ all -> 0x006b }
            r0 = r2
            goto L_0x006d
        L_0x006b:
            r0 = r2
            goto L_0x0074
        L_0x006d:
            if (r1 == 0) goto L_0x007a
        L_0x006f:
            r1.close()
            goto L_0x007a
        L_0x0073:
            r1 = r0
        L_0x0074:
            r10.m21595d()     // Catch:{ all -> 0x007b }
            if (r1 == 0) goto L_0x007a
            goto L_0x006f
        L_0x007a:
            return r0
        L_0x007b:
            r0 = move-exception
            r2 = r0
            if (r1 == 0) goto L_0x0082
            r1.close()
        L_0x0082:
            goto L_0x0084
        L_0x0083:
            throw r2
        L_0x0084:
            goto L_0x0083
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.CacheDBHelper.mo18941a(java.lang.String):com.umeng.analytics.pro.al");
    }

    /* renamed from: a */
    public void mo18943a(String str, String str2) {
        mo18944a(str, "_uuid=?", new String[]{str2});
    }

    /* renamed from: a */
    public Cursor mo18940a(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null || !writableDatabase.isOpen()) {
                return null;
            }
            return writableDatabase.query(str, strArr, str2, strArr2, str3, str4, str5, str6);
        } catch (Throwable unused) {
            return null;
        }
    }
}
