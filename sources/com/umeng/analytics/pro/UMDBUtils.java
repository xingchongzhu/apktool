package com.umeng.analytics.pro;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.umeng.analytics.pro.g */
public class UMDBUtils {
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        if (r1 == null) goto L_0x0038;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m21935a(java.lang.String r5, android.database.sqlite.SQLiteDatabase r6) {
        /*
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 0
            r5.trim()     // Catch:{ Exception -> 0x0034, all -> 0x002d }
            java.lang.String r2 = "select count(*) as c from sqlite_master where type=? and name=?"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ Exception -> 0x0034, all -> 0x002d }
            java.lang.String r4 = "table"
            r3[r0] = r4     // Catch:{ Exception -> 0x0034, all -> 0x002d }
            java.lang.String r5 = r5.trim()     // Catch:{ Exception -> 0x0034, all -> 0x002d }
            r4 = 1
            r3[r4] = r5     // Catch:{ Exception -> 0x0034, all -> 0x002d }
            android.database.Cursor r1 = r6.rawQuery(r2, r3)     // Catch:{ Exception -> 0x0034, all -> 0x002d }
            boolean r5 = r1.moveToNext()     // Catch:{ Exception -> 0x0034, all -> 0x002d }
            if (r5 == 0) goto L_0x0029
            int r5 = r1.getInt(r0)     // Catch:{ Exception -> 0x0034, all -> 0x002d }
            if (r5 <= 0) goto L_0x0029
            r0 = 1
        L_0x0029:
            r1.close()
            goto L_0x0038
        L_0x002d:
            r5 = move-exception
            if (r1 == 0) goto L_0x0033
            r1.close()
        L_0x0033:
            throw r5
        L_0x0034:
            if (r1 == 0) goto L_0x0038
            goto L_0x0029
        L_0x0038:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.UMDBUtils.m21935a(java.lang.String, android.database.sqlite.SQLiteDatabase):boolean");
    }

    /* renamed from: b */
    public static String m21936b(Context context) {
        File databasePath = context.getDatabasePath(UMDBConfig.f16965b);
        StringBuilder sb = new StringBuilder();
        sb.append(databasePath.getParent());
        sb.append(File.separator);
        return sb.toString();
    }

    /* renamed from: c */
    public static String m21938c(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(m21936b(context));
        sb.append("subprocess/");
        return sb.toString();
    }

    /* renamed from: b */
    public static List<String> m21937b(List<String> list) {
        ArrayList arrayList = new ArrayList();
        try {
            for (String str : list) {
                if (Collections.frequency(arrayList, str) < 1) {
                    arrayList.add(str);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m21932a(Context context) {
        if (context != null) {
            try {
                File databasePath = context.getDatabasePath(UMDBConfig.f16965b);
                if (databasePath != null && databasePath.exists()) {
                    databasePath.delete();
                }
                C3137e.m21915a(context).mo19084a();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static String m21930a(List<String> list) {
        return TextUtils.join("!", list);
    }

    /* renamed from: a */
    public static List<String> m21931a(String str) {
        return new ArrayList(Arrays.asList(str.split("!")));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.String[], android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r0v2, types: [android.database.Cursor] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        if (r0.isClosed() == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0047, code lost:
        if (r0.isClosed() == false) goto L_0x002f;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0, types: [java.lang.String[], android.database.Cursor]
  assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], android.database.Cursor]
  uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], android.database.Cursor, java.lang.String[]]
  mth insns count: 29
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m21934a(android.database.sqlite.SQLiteDatabase r4, java.lang.String r5, java.lang.String r6) {
        /*
            r0 = 0
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0040, all -> 0x0033 }
            r2.<init>()     // Catch:{ Exception -> 0x0040, all -> 0x0033 }
            java.lang.String r3 = "SELECT * FROM "
            r2.append(r3)     // Catch:{ Exception -> 0x0040, all -> 0x0033 }
            r2.append(r5)     // Catch:{ Exception -> 0x0040, all -> 0x0033 }
            java.lang.String r5 = " LIMIT 0"
            r2.append(r5)     // Catch:{ Exception -> 0x0040, all -> 0x0033 }
            java.lang.String r5 = r2.toString()     // Catch:{ Exception -> 0x0040, all -> 0x0033 }
            android.database.Cursor r0 = r4.rawQuery(r5, r0)     // Catch:{ Exception -> 0x0040, all -> 0x0033 }
            if (r0 == 0) goto L_0x0027
            int r4 = r0.getColumnIndex(r6)     // Catch:{ Exception -> 0x0040, all -> 0x0033 }
            r5 = -1
            if (r4 == r5) goto L_0x0027
            r4 = 1
            r1 = 1
        L_0x0027:
            if (r0 == 0) goto L_0x004a
            boolean r4 = r0.isClosed()
            if (r4 != 0) goto L_0x004a
        L_0x002f:
            r0.close()
            goto L_0x004a
        L_0x0033:
            r4 = move-exception
            if (r0 == 0) goto L_0x003f
            boolean r5 = r0.isClosed()
            if (r5 != 0) goto L_0x003f
            r0.close()
        L_0x003f:
            throw r4
        L_0x0040:
            if (r0 == 0) goto L_0x004a
            boolean r4 = r0.isClosed()
            if (r4 != 0) goto L_0x004a
            goto L_0x002f
        L_0x004a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.UMDBUtils.m21934a(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: a */
    public static void m21933a(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append("alter table ");
        sb.append(str);
        sb.append(" add ");
        sb.append(str2);
        sb.append(" ");
        sb.append(str3);
        sQLiteDatabase.execSQL(sb.toString());
    }
}
