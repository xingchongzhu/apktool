package com.umeng.analytics.pro;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.analytics.pro.UMDBConfig.C3131c;
import com.umeng.analytics.pro.UMDBConfig.C3134d.C3135a;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.pro.h */
public class UMStoreManager {

    /* renamed from: a */
    public static final int f17039a = 2049;

    /* renamed from: b */
    public static final int f17040b = 2050;

    /* renamed from: c */
    private static final int f17041c = 1000;

    /* renamed from: d */
    private static Context f17042d = null;

    /* renamed from: e */
    private static String f17043e = null;

    /* renamed from: f */
    private static final String f17044f = "umeng+";

    /* renamed from: g */
    private static final String f17045g = "ek__id";

    /* renamed from: h */
    private static final String f17046h = "ek_key";

    /* renamed from: i */
    private List<String> f17047i;

    /* renamed from: j */
    private List<Integer> f17048j;

    /* renamed from: k */
    private String f17049k;

    /* renamed from: l */
    private List<String> f17050l;

    /* renamed from: com.umeng.analytics.pro.h$a */
    /* compiled from: UMStoreManager */
    public enum C3143a {
        AUTOPAGE,
        PAGE,
        BEGIN,
        END,
        NEWSESSION,
        INSTANTSESSIONBEGIN
    }

    /* renamed from: com.umeng.analytics.pro.h$b */
    /* compiled from: UMStoreManager */
    private static class C3144b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final UMStoreManager f17058a = new UMStoreManager();

        private C3144b() {
        }
    }

    /* renamed from: a */
    public static UMStoreManager m21939a(Context context) {
        UMStoreManager a = C3144b.f17058a;
        if (f17042d == null && context != null) {
            f17042d = context.getApplicationContext();
            a.m21949k();
        }
        return a;
    }

    /* renamed from: k */
    private void m21949k() {
        synchronized (this) {
            m21950l();
            this.f17047i.clear();
            this.f17050l.clear();
            this.f17048j.clear();
        }
    }

    /* renamed from: l */
    private void m21950l() {
        String str = f17046h;
        String str2 = f17045g;
        try {
            if (TextUtils.isEmpty(f17043e)) {
                String multiProcessSP = UMUtils.getMultiProcessSP(f17042d, str2);
                if (TextUtils.isEmpty(multiProcessSP)) {
                    multiProcessSP = PreferenceWrapper.getDefault(f17042d).getString(str2, null);
                    if (TextUtils.isEmpty(multiProcessSP)) {
                        multiProcessSP = UMUtils.genId();
                    }
                    if (!TextUtils.isEmpty(multiProcessSP)) {
                        UMUtils.setMultiProcessSP(f17042d, str2, multiProcessSP);
                    }
                }
                if (!TextUtils.isEmpty(multiProcessSP)) {
                    String substring = multiProcessSP.substring(1, 9);
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < substring.length(); i++) {
                        char charAt = substring.charAt(i);
                        if (!Character.isDigit(charAt)) {
                            sb.append(charAt);
                        } else if (Integer.parseInt(Character.toString(charAt)) == 0) {
                            sb.append(0);
                        } else {
                            sb.append(10 - Integer.parseInt(Character.toString(charAt)));
                        }
                    }
                    f17043e = sb.toString();
                }
                if (!TextUtils.isEmpty(f17043e)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(f17043e);
                    sb2.append(new StringBuilder(f17043e).reverse().toString());
                    f17043e = sb2.toString();
                    String multiProcessSP2 = UMUtils.getMultiProcessSP(f17042d, str);
                    boolean isEmpty = TextUtils.isEmpty(multiProcessSP2);
                    String str3 = f17044f;
                    if (isEmpty) {
                        UMUtils.setMultiProcessSP(f17042d, str, mo19101c(str3));
                    } else if (!str3.equals(mo19103d(multiProcessSP2))) {
                        mo19100b(true, false);
                        mo19094a(true, false);
                        mo19108h();
                        mo19109i();
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public void mo19098b() {
        this.f17050l.clear();
    }

    /* renamed from: c */
    public boolean mo19102c() {
        return this.f17050l.isEmpty();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0069, code lost:
        if (r0 == null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007d, code lost:
        if (r0 == null) goto L_0x006e;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19104d() {
        /*
            r7 = this;
            r0 = 0
            android.content.Context r1 = f17042d     // Catch:{ SQLiteDatabaseCorruptException -> 0x0078, all -> 0x0069 }
            com.umeng.analytics.pro.f r1 = com.umeng.analytics.pro.UMDBManager.m21926a(r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0078, all -> 0x0069 }
            android.database.sqlite.SQLiteDatabase r0 = r1.mo19087a()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0078, all -> 0x0069 }
            r0.beginTransaction()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0078, all -> 0x0069 }
            com.umeng.analytics.pro.t r1 = com.umeng.analytics.pro.SessionTracker.m22097a()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0078, all -> 0x0069 }
            java.lang.String r1 = r1.mo19177c()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0078, all -> 0x0069 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0078, all -> 0x0069 }
            if (r2 == 0) goto L_0x0029
            r0.endTransaction()     // Catch:{ all -> 0x001f }
        L_0x001f:
            android.content.Context r0 = f17042d
            com.umeng.analytics.pro.f r0 = com.umeng.analytics.pro.UMDBManager.m21926a(r0)
            r0.mo19088b()
            return
        L_0x0029:
            r2 = 2
            java.lang.String r3 = ""
            java.lang.String r4 = "-1"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch:{ SQLiteDatabaseCorruptException -> 0x0078, all -> 0x0069 }
            r4 = 0
        L_0x0033:
            if (r4 >= r2) goto L_0x0065
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SQLiteDatabaseCorruptException -> 0x0078, all -> 0x0069 }
            r5.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0078, all -> 0x0069 }
            java.lang.String r6 = "update __et set __i=\""
            r5.append(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0078, all -> 0x0069 }
            r5.append(r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0078, all -> 0x0069 }
            java.lang.String r6 = "\" where "
            r5.append(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0078, all -> 0x0069 }
            java.lang.String r6 = "__i"
            r5.append(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0078, all -> 0x0069 }
            java.lang.String r6 = "=\""
            r5.append(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0078, all -> 0x0069 }
            r6 = r3[r4]     // Catch:{ SQLiteDatabaseCorruptException -> 0x0078, all -> 0x0069 }
            r5.append(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0078, all -> 0x0069 }
            java.lang.String r6 = "\""
            r5.append(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0078, all -> 0x0069 }
            java.lang.String r5 = r5.toString()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0078, all -> 0x0069 }
            r0.execSQL(r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0078, all -> 0x0069 }
            int r4 = r4 + 1
            goto L_0x0033
        L_0x0065:
            r0.setTransactionSuccessful()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0078, all -> 0x0069 }
            goto L_0x006b
        L_0x0069:
            if (r0 == 0) goto L_0x006e
        L_0x006b:
            r0.endTransaction()     // Catch:{ all -> 0x006e }
        L_0x006e:
            android.content.Context r0 = f17042d
            com.umeng.analytics.pro.f r0 = com.umeng.analytics.pro.UMDBManager.m21926a(r0)
            r0.mo19088b()
            goto L_0x0080
        L_0x0078:
            android.content.Context r1 = f17042d     // Catch:{ all -> 0x0081 }
            com.umeng.analytics.pro.UMDBUtils.m21932a(r1)     // Catch:{ all -> 0x0081 }
            if (r0 == 0) goto L_0x006e
            goto L_0x006b
        L_0x0080:
            return
        L_0x0081:
            r1 = move-exception
            if (r0 == 0) goto L_0x0087
            r0.endTransaction()     // Catch:{ all -> 0x0087 }
        L_0x0087:
            android.content.Context r0 = f17042d
            com.umeng.analytics.pro.f r0 = com.umeng.analytics.pro.UMDBManager.m21926a(r0)
            r0.mo19088b()
            goto L_0x0092
        L_0x0091:
            throw r1
        L_0x0092:
            goto L_0x0091
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.UMStoreManager.mo19104d():void");
    }

    /* renamed from: e */
    public boolean mo19105e() {
        return this.f17047i.isEmpty();
    }

    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [org.json.JSONObject] */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r3v2, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r3v4, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r4v3, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r5v10 */
    /* JADX WARNING: type inference failed for: r5v11 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r5v12 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r5v14, types: [org.json.JSONObject] */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r5v15 */
    /* JADX WARNING: type inference failed for: r5v16 */
    /* JADX WARNING: type inference failed for: r5v17 */
    /* JADX WARNING: type inference failed for: r5v18 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: type inference failed for: r3v21 */
    /* JADX WARNING: type inference failed for: r5v19 */
    /* JADX WARNING: type inference failed for: r5v20 */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0079, code lost:
        if (r2 == null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r2.endTransaction();
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0095, code lost:
        if (r2 == null) goto L_0x007e;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v0
  assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], ?[OBJECT, ARRAY]]
  uses: [?[OBJECT, ARRAY], ?[int, boolean, OBJECT, ARRAY, byte, short, char], android.database.Cursor, org.json.JSONObject]
  mth insns count: 86
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
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARNING: Unknown variable types count: 10 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject mo19106f() {
        /*
            r8 = this;
            java.lang.String r0 = "__vc"
            java.lang.String r1 = "__av"
            java.util.List<java.lang.String> r2 = r8.f17050l
            boolean r2 = r2.isEmpty()
            r3 = 0
            if (r2 == 0) goto L_0x000e
            return r3
        L_0x000e:
            android.content.Context r2 = f17042d     // Catch:{ SQLiteDatabaseCorruptException -> 0x0089, all -> 0x0072 }
            com.umeng.analytics.pro.f r2 = com.umeng.analytics.pro.UMDBManager.m21926a(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0089, all -> 0x0072 }
            android.database.sqlite.SQLiteDatabase r2 = r2.mo19087a()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0089, all -> 0x0072 }
            r2.beginTransaction()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0070, all -> 0x006e }
            java.util.List<java.lang.String> r4 = r8.f17050l     // Catch:{ SQLiteDatabaseCorruptException -> 0x0070, all -> 0x006e }
            r5 = 0
            java.lang.Object r4 = r4.get(r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0070, all -> 0x006e }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ SQLiteDatabaseCorruptException -> 0x0070, all -> 0x006e }
            java.lang.String r6 = "select *  from __is where __ii=?"
            r7 = 1
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch:{ SQLiteDatabaseCorruptException -> 0x0070, all -> 0x006e }
            r7[r5] = r4     // Catch:{ SQLiteDatabaseCorruptException -> 0x0070, all -> 0x006e }
            android.database.Cursor r4 = r2.rawQuery(r6, r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0070, all -> 0x006e }
            if (r4 == 0) goto L_0x0053
            boolean r5 = r4.moveToNext()     // Catch:{ SQLiteDatabaseCorruptException -> 0x006b, all -> 0x0068 }
            if (r5 == 0) goto L_0x0053
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ SQLiteDatabaseCorruptException -> 0x006b, all -> 0x0068 }
            r5.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x006b, all -> 0x0068 }
            int r3 = r4.getColumnIndex(r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x006c, all -> 0x0069 }
            java.lang.String r3 = r4.getString(r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x006c, all -> 0x0069 }
            int r6 = r4.getColumnIndex(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x006c, all -> 0x0069 }
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x006c, all -> 0x0069 }
            r5.put(r1, r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x006c, all -> 0x0069 }
            r5.put(r0, r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x006c, all -> 0x0069 }
            r3 = r5
        L_0x0053:
            r2.setTransactionSuccessful()     // Catch:{ SQLiteDatabaseCorruptException -> 0x006b, all -> 0x0068 }
            if (r4 == 0) goto L_0x005b
            r4.close()
        L_0x005b:
            r2.endTransaction()     // Catch:{ all -> 0x005e }
        L_0x005e:
            android.content.Context r0 = f17042d
            com.umeng.analytics.pro.f r0 = com.umeng.analytics.pro.UMDBManager.m21926a(r0)
            r0.mo19088b()
            goto L_0x0098
        L_0x0068:
            r5 = r3
        L_0x0069:
            r3 = r4
            goto L_0x0074
        L_0x006b:
            r5 = r3
        L_0x006c:
            r3 = r4
            goto L_0x008b
        L_0x006e:
            r5 = r3
            goto L_0x0074
        L_0x0070:
            r5 = r3
            goto L_0x008b
        L_0x0072:
            r2 = r3
            r5 = r2
        L_0x0074:
            if (r3 == 0) goto L_0x0079
            r3.close()
        L_0x0079:
            if (r2 == 0) goto L_0x007e
        L_0x007b:
            r2.endTransaction()     // Catch:{ all -> 0x007e }
        L_0x007e:
            android.content.Context r0 = f17042d
            com.umeng.analytics.pro.f r0 = com.umeng.analytics.pro.UMDBManager.m21926a(r0)
            r0.mo19088b()
            r3 = r5
            goto L_0x0098
        L_0x0089:
            r2 = r3
            r5 = r2
        L_0x008b:
            android.content.Context r0 = f17042d     // Catch:{ all -> 0x0099 }
            com.umeng.analytics.pro.UMDBUtils.m21932a(r0)     // Catch:{ all -> 0x0099 }
            if (r3 == 0) goto L_0x0095
            r3.close()
        L_0x0095:
            if (r2 == 0) goto L_0x007e
            goto L_0x007b
        L_0x0098:
            return r3
        L_0x0099:
            r0 = move-exception
            if (r3 == 0) goto L_0x009f
            r3.close()
        L_0x009f:
            if (r2 == 0) goto L_0x00a4
            r2.endTransaction()     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            android.content.Context r1 = f17042d
            com.umeng.analytics.pro.f r1 = com.umeng.analytics.pro.UMDBManager.m21926a(r1)
            r1.mo19088b()
            goto L_0x00af
        L_0x00ae:
            throw r0
        L_0x00af:
            goto L_0x00ae
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.UMStoreManager.mo19106f():org.json.JSONObject");
    }

    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [org.json.JSONObject] */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r3v2, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r3v4, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r4v3, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r5v10 */
    /* JADX WARNING: type inference failed for: r5v11 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r5v12 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r5v14, types: [org.json.JSONObject] */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r5v15 */
    /* JADX WARNING: type inference failed for: r5v16 */
    /* JADX WARNING: type inference failed for: r5v17 */
    /* JADX WARNING: type inference failed for: r5v18 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: type inference failed for: r3v21 */
    /* JADX WARNING: type inference failed for: r5v19 */
    /* JADX WARNING: type inference failed for: r5v20 */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0079, code lost:
        if (r2 == null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r2.endTransaction();
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0095, code lost:
        if (r2 == null) goto L_0x007e;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v0
  assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], ?[OBJECT, ARRAY]]
  uses: [?[OBJECT, ARRAY], ?[int, boolean, OBJECT, ARRAY, byte, short, char], android.database.Cursor, org.json.JSONObject]
  mth insns count: 86
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
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARNING: Unknown variable types count: 10 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject mo19107g() {
        /*
            r8 = this;
            java.lang.String r0 = "__vc"
            java.lang.String r1 = "__av"
            java.util.List<java.lang.String> r2 = r8.f17047i
            boolean r2 = r2.isEmpty()
            r3 = 0
            if (r2 == 0) goto L_0x000e
            return r3
        L_0x000e:
            android.content.Context r2 = f17042d     // Catch:{ SQLiteDatabaseCorruptException -> 0x0089, all -> 0x0072 }
            com.umeng.analytics.pro.f r2 = com.umeng.analytics.pro.UMDBManager.m21926a(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0089, all -> 0x0072 }
            android.database.sqlite.SQLiteDatabase r2 = r2.mo19087a()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0089, all -> 0x0072 }
            r2.beginTransaction()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0070, all -> 0x006e }
            java.util.List<java.lang.String> r4 = r8.f17047i     // Catch:{ SQLiteDatabaseCorruptException -> 0x0070, all -> 0x006e }
            r5 = 0
            java.lang.Object r4 = r4.get(r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0070, all -> 0x006e }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ SQLiteDatabaseCorruptException -> 0x0070, all -> 0x006e }
            java.lang.String r6 = "select *  from __sd where __ii=?"
            r7 = 1
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch:{ SQLiteDatabaseCorruptException -> 0x0070, all -> 0x006e }
            r7[r5] = r4     // Catch:{ SQLiteDatabaseCorruptException -> 0x0070, all -> 0x006e }
            android.database.Cursor r4 = r2.rawQuery(r6, r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0070, all -> 0x006e }
            if (r4 == 0) goto L_0x0053
            boolean r5 = r4.moveToNext()     // Catch:{ SQLiteDatabaseCorruptException -> 0x006b, all -> 0x0068 }
            if (r5 == 0) goto L_0x0053
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ SQLiteDatabaseCorruptException -> 0x006b, all -> 0x0068 }
            r5.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x006b, all -> 0x0068 }
            int r3 = r4.getColumnIndex(r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x006c, all -> 0x0069 }
            java.lang.String r3 = r4.getString(r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x006c, all -> 0x0069 }
            int r6 = r4.getColumnIndex(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x006c, all -> 0x0069 }
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x006c, all -> 0x0069 }
            r5.put(r1, r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x006c, all -> 0x0069 }
            r5.put(r0, r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x006c, all -> 0x0069 }
            r3 = r5
        L_0x0053:
            r2.setTransactionSuccessful()     // Catch:{ SQLiteDatabaseCorruptException -> 0x006b, all -> 0x0068 }
            if (r4 == 0) goto L_0x005b
            r4.close()
        L_0x005b:
            r2.endTransaction()     // Catch:{ all -> 0x005e }
        L_0x005e:
            android.content.Context r0 = f17042d
            com.umeng.analytics.pro.f r0 = com.umeng.analytics.pro.UMDBManager.m21926a(r0)
            r0.mo19088b()
            goto L_0x0098
        L_0x0068:
            r5 = r3
        L_0x0069:
            r3 = r4
            goto L_0x0074
        L_0x006b:
            r5 = r3
        L_0x006c:
            r3 = r4
            goto L_0x008b
        L_0x006e:
            r5 = r3
            goto L_0x0074
        L_0x0070:
            r5 = r3
            goto L_0x008b
        L_0x0072:
            r2 = r3
            r5 = r2
        L_0x0074:
            if (r3 == 0) goto L_0x0079
            r3.close()
        L_0x0079:
            if (r2 == 0) goto L_0x007e
        L_0x007b:
            r2.endTransaction()     // Catch:{ all -> 0x007e }
        L_0x007e:
            android.content.Context r0 = f17042d
            com.umeng.analytics.pro.f r0 = com.umeng.analytics.pro.UMDBManager.m21926a(r0)
            r0.mo19088b()
            r3 = r5
            goto L_0x0098
        L_0x0089:
            r2 = r3
            r5 = r2
        L_0x008b:
            android.content.Context r0 = f17042d     // Catch:{ all -> 0x0099 }
            com.umeng.analytics.pro.UMDBUtils.m21932a(r0)     // Catch:{ all -> 0x0099 }
            if (r3 == 0) goto L_0x0095
            r3.close()
        L_0x0095:
            if (r2 == 0) goto L_0x007e
            goto L_0x007b
        L_0x0098:
            return r3
        L_0x0099:
            r0 = move-exception
            if (r3 == 0) goto L_0x009f
            r3.close()
        L_0x009f:
            if (r2 == 0) goto L_0x00a4
            r2.endTransaction()     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            android.content.Context r1 = f17042d
            com.umeng.analytics.pro.f r1 = com.umeng.analytics.pro.UMDBManager.m21926a(r1)
            r1.mo19088b()
            goto L_0x00af
        L_0x00ae:
            throw r0
        L_0x00af:
            goto L_0x00ae
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.UMStoreManager.mo19107g():org.json.JSONObject");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
        if (r0 == null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0045, code lost:
        if (r0 == null) goto L_0x004a;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19108h() {
        /*
            r4 = this;
            r0 = 0
            android.content.Context r1 = f17042d     // Catch:{ SQLiteDatabaseCorruptException -> 0x0054, all -> 0x0045 }
            com.umeng.analytics.pro.f r1 = com.umeng.analytics.pro.UMDBManager.m21926a(r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0054, all -> 0x0045 }
            android.database.sqlite.SQLiteDatabase r0 = r1.mo19087a()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0054, all -> 0x0045 }
            r0.beginTransaction()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0054, all -> 0x0045 }
            java.util.List<java.lang.Integer> r1 = r4.f17048j     // Catch:{ SQLiteDatabaseCorruptException -> 0x0054, all -> 0x0045 }
            int r1 = r1.size()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0054, all -> 0x0045 }
            if (r1 <= 0) goto L_0x003c
            r1 = 0
        L_0x0017:
            java.util.List<java.lang.Integer> r2 = r4.f17048j     // Catch:{ SQLiteDatabaseCorruptException -> 0x0054, all -> 0x0045 }
            int r2 = r2.size()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0054, all -> 0x0045 }
            if (r1 >= r2) goto L_0x003c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SQLiteDatabaseCorruptException -> 0x0054, all -> 0x0045 }
            r2.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0054, all -> 0x0045 }
            java.lang.String r3 = "delete from __et where rowid="
            r2.append(r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0054, all -> 0x0045 }
            java.util.List<java.lang.Integer> r3 = r4.f17048j     // Catch:{ SQLiteDatabaseCorruptException -> 0x0054, all -> 0x0045 }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0054, all -> 0x0045 }
            r2.append(r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0054, all -> 0x0045 }
            java.lang.String r2 = r2.toString()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0054, all -> 0x0045 }
            r0.execSQL(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0054, all -> 0x0045 }
            int r1 = r1 + 1
            goto L_0x0017
        L_0x003c:
            java.util.List<java.lang.Integer> r1 = r4.f17048j     // Catch:{ SQLiteDatabaseCorruptException -> 0x0054, all -> 0x0045 }
            r1.clear()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0054, all -> 0x0045 }
            r0.setTransactionSuccessful()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0054, all -> 0x0045 }
            goto L_0x0047
        L_0x0045:
            if (r0 == 0) goto L_0x004a
        L_0x0047:
            r0.endTransaction()     // Catch:{ all -> 0x004a }
        L_0x004a:
            android.content.Context r0 = f17042d
            com.umeng.analytics.pro.f r0 = com.umeng.analytics.pro.UMDBManager.m21926a(r0)
            r0.mo19088b()
            goto L_0x005c
        L_0x0054:
            android.content.Context r1 = f17042d     // Catch:{ all -> 0x005d }
            com.umeng.analytics.pro.UMDBUtils.m21932a(r1)     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x004a
            goto L_0x0047
        L_0x005c:
            return
        L_0x005d:
            r1 = move-exception
            if (r0 == 0) goto L_0x0063
            r0.endTransaction()     // Catch:{ all -> 0x0063 }
        L_0x0063:
            android.content.Context r0 = f17042d
            com.umeng.analytics.pro.f r0 = com.umeng.analytics.pro.UMDBManager.m21926a(r0)
            r0.mo19088b()
            goto L_0x006e
        L_0x006d:
            throw r1
        L_0x006e:
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.UMStoreManager.mo19108h():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r0 != null) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r0 == null) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        r0.endTransaction();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0026 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19109i() {
        /*
            r2 = this;
            r0 = 0
            android.content.Context r1 = f17042d     // Catch:{ SQLiteDatabaseCorruptException -> 0x0026, all -> 0x0017 }
            com.umeng.analytics.pro.f r1 = com.umeng.analytics.pro.UMDBManager.m21926a(r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0026, all -> 0x0017 }
            android.database.sqlite.SQLiteDatabase r0 = r1.mo19087a()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0026, all -> 0x0017 }
            r0.beginTransaction()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0026, all -> 0x0017 }
            java.lang.String r1 = "delete from __er"
            r0.execSQL(r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0026, all -> 0x0017 }
            r0.setTransactionSuccessful()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0026, all -> 0x0017 }
            goto L_0x0019
        L_0x0017:
            if (r0 == 0) goto L_0x001c
        L_0x0019:
            r0.endTransaction()     // Catch:{ all -> 0x001c }
        L_0x001c:
            android.content.Context r0 = f17042d
            com.umeng.analytics.pro.f r0 = com.umeng.analytics.pro.UMDBManager.m21926a(r0)
            r0.mo19088b()
            goto L_0x002e
        L_0x0026:
            android.content.Context r1 = f17042d     // Catch:{ all -> 0x002f }
            com.umeng.analytics.pro.UMDBUtils.m21932a(r1)     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x001c
            goto L_0x0019
        L_0x002e:
            return
        L_0x002f:
            r1 = move-exception
            if (r0 == 0) goto L_0x0035
            r0.endTransaction()     // Catch:{ all -> 0x0035 }
        L_0x0035:
            android.content.Context r0 = f17042d
            com.umeng.analytics.pro.f r0 = com.umeng.analytics.pro.UMDBManager.m21926a(r0)
            r0.mo19088b()
            goto L_0x0040
        L_0x003f:
            throw r1
        L_0x0040:
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.UMStoreManager.mo19109i():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r1.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        if (r1 != null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004f, code lost:
        if (r1 != null) goto L_0x0051;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005f */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19110j() {
        /*
            r5 = this;
            java.lang.String r0 = "\""
            java.lang.String r1 = r5.f17049k
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = 0
            if (r1 != 0) goto L_0x0077
            android.content.Context r1 = f17042d     // Catch:{ SQLiteDatabaseCorruptException -> 0x005e, all -> 0x004e }
            com.umeng.analytics.pro.f r1 = com.umeng.analytics.pro.UMDBManager.m21926a(r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x005e, all -> 0x004e }
            android.database.sqlite.SQLiteDatabase r1 = r1.mo19087a()     // Catch:{ SQLiteDatabaseCorruptException -> 0x005e, all -> 0x004e }
            r1.beginTransaction()     // Catch:{ SQLiteDatabaseCorruptException -> 0x005f, all -> 0x004f }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SQLiteDatabaseCorruptException -> 0x005f, all -> 0x004f }
            r3.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x005f, all -> 0x004f }
            java.lang.String r4 = "delete from __er where __i=\""
            r3.append(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x005f, all -> 0x004f }
            java.lang.String r4 = r5.f17049k     // Catch:{ SQLiteDatabaseCorruptException -> 0x005f, all -> 0x004f }
            r3.append(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x005f, all -> 0x004f }
            r3.append(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x005f, all -> 0x004f }
            java.lang.String r3 = r3.toString()     // Catch:{ SQLiteDatabaseCorruptException -> 0x005f, all -> 0x004f }
            r1.execSQL(r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x005f, all -> 0x004f }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SQLiteDatabaseCorruptException -> 0x005f, all -> 0x004f }
            r3.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x005f, all -> 0x004f }
            java.lang.String r4 = "delete from __et where __i=\""
            r3.append(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x005f, all -> 0x004f }
            java.lang.String r4 = r5.f17049k     // Catch:{ SQLiteDatabaseCorruptException -> 0x005f, all -> 0x004f }
            r3.append(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x005f, all -> 0x004f }
            r3.append(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x005f, all -> 0x004f }
            java.lang.String r0 = r3.toString()     // Catch:{ SQLiteDatabaseCorruptException -> 0x005f, all -> 0x004f }
            r1.execSQL(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x005f, all -> 0x004f }
            r1.setTransactionSuccessful()     // Catch:{ SQLiteDatabaseCorruptException -> 0x005f, all -> 0x004f }
            goto L_0x0051
        L_0x004e:
            r1 = r2
        L_0x004f:
            if (r1 == 0) goto L_0x0054
        L_0x0051:
            r1.endTransaction()     // Catch:{ all -> 0x0054 }
        L_0x0054:
            android.content.Context r0 = f17042d
            com.umeng.analytics.pro.f r0 = com.umeng.analytics.pro.UMDBManager.m21926a(r0)
            r0.mo19088b()
            goto L_0x0077
        L_0x005e:
            r1 = r2
        L_0x005f:
            android.content.Context r0 = f17042d     // Catch:{ all -> 0x0067 }
            com.umeng.analytics.pro.UMDBUtils.m21932a(r0)     // Catch:{ all -> 0x0067 }
            if (r1 == 0) goto L_0x0054
            goto L_0x0051
        L_0x0067:
            r0 = move-exception
            if (r1 == 0) goto L_0x006d
            r1.endTransaction()     // Catch:{ all -> 0x006d }
        L_0x006d:
            android.content.Context r1 = f17042d
            com.umeng.analytics.pro.f r1 = com.umeng.analytics.pro.UMDBManager.m21926a(r1)
            r1.mo19088b()
            throw r0
        L_0x0077:
            r5.f17049k = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.UMStoreManager.mo19110j():void");
    }

    private UMStoreManager() {
        this.f17047i = new ArrayList();
        this.f17048j = new ArrayList();
        this.f17049k = null;
        this.f17050l = new ArrayList();
    }

    /* renamed from: b */
    private void m21946b(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase) {
        String str2;
        String str3 = "__pp";
        String str4 = "__sp";
        String str5 = "__e";
        try {
            long longValue = ((Long) jSONObject.get(str5)).longValue();
            JSONObject optJSONObject = jSONObject.optJSONObject(str4);
            JSONObject optJSONObject2 = jSONObject.optJSONObject(str3);
            String str6 = "";
            if (optJSONObject != null) {
                if (optJSONObject.length() > 0) {
                    str2 = mo19101c(optJSONObject.toString());
                    if (optJSONObject2 != null && optJSONObject2.length() > 0) {
                        str6 = mo19101c(optJSONObject2.toString());
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("__ii", str);
                    contentValues.put(str5, String.valueOf(longValue));
                    contentValues.put(str4, str2);
                    contentValues.put(str3, str6);
                    contentValues.put("__av", UMGlobalContext.getInstance(f17042d).getAppVersion());
                    contentValues.put("__vc", UMUtils.getAppVersionCode(f17042d));
                    sQLiteDatabase.insert(C3131c.f16993a, null, contentValues);
                }
            }
            str2 = str6;
            str6 = mo19101c(optJSONObject2.toString());
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("__ii", str);
            contentValues2.put(str5, String.valueOf(longValue));
            contentValues2.put(str4, str2);
            contentValues2.put(str3, str6);
            contentValues2.put("__av", UMGlobalContext.getInstance(f17042d).getAppVersion());
            contentValues2.put("__vc", UMUtils.getAppVersionCode(f17042d));
            sQLiteDatabase.insert(C3131c.f16993a, null, contentValues2);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r3v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v4, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: type inference failed for: r1v18, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v19 */
    /* JADX WARNING: type inference failed for: r1v20 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r1v21 */
    /* JADX WARNING: type inference failed for: r1v22 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v0
  assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], java.lang.String, ?[OBJECT, ARRAY]]
  uses: [java.lang.CharSequence, java.lang.String, ?[int, boolean, OBJECT, ARRAY, byte, short, char], android.database.Cursor]
  mth insns count: 88
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
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m21948c(java.lang.String r10, org.json.JSONObject r11, android.database.sqlite.SQLiteDatabase r12) {
        /*
            r9 = this;
            java.lang.String r0 = "__d"
            r1 = 0
            org.json.JSONObject r2 = r11.optJSONObject(r0)     // Catch:{ all -> 0x00e7 }
            if (r2 == 0) goto L_0x002a
            java.lang.String r3 = "select __d from __sd where __ii=?"
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ all -> 0x00e7 }
            r5 = 0
            r4[r5] = r10     // Catch:{ all -> 0x00e7 }
            android.database.Cursor r3 = r12.rawQuery(r3, r4)     // Catch:{ all -> 0x00e7 }
            if (r3 == 0) goto L_0x002b
        L_0x0017:
            boolean r4 = r3.moveToNext()     // Catch:{ all -> 0x00e5 }
            if (r4 == 0) goto L_0x002b
            int r1 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x00e5 }
            java.lang.String r1 = r3.getString(r1)     // Catch:{ all -> 0x00e5 }
            java.lang.String r1 = r9.mo19103d(r1)     // Catch:{ all -> 0x00e5 }
            goto L_0x0017
        L_0x002a:
            r3 = r1
        L_0x002b:
            java.lang.String r0 = "\""
            java.lang.String r4 = "=\""
            java.lang.String r5 = "__ii"
            java.lang.String r6 = "\" where "
            if (r2 == 0) goto L_0x0079
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch:{ all -> 0x00e5 }
            r7.<init>()     // Catch:{ all -> 0x00e5 }
            boolean r8 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00e5 }
            if (r8 != 0) goto L_0x0045
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch:{ all -> 0x00e5 }
            r7.<init>(r1)     // Catch:{ all -> 0x00e5 }
        L_0x0045:
            r7.put(r2)     // Catch:{ all -> 0x00e5 }
            java.lang.String r1 = r7.toString()     // Catch:{ all -> 0x00e5 }
            java.lang.String r1 = r9.mo19101c(r1)     // Catch:{ all -> 0x00e5 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00e5 }
            if (r2 != 0) goto L_0x0079
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e5 }
            r2.<init>()     // Catch:{ all -> 0x00e5 }
            java.lang.String r7 = "update  __sd set __d=\""
            r2.append(r7)     // Catch:{ all -> 0x00e5 }
            r2.append(r1)     // Catch:{ all -> 0x00e5 }
            r2.append(r6)     // Catch:{ all -> 0x00e5 }
            r2.append(r5)     // Catch:{ all -> 0x00e5 }
            r2.append(r4)     // Catch:{ all -> 0x00e5 }
            r2.append(r10)     // Catch:{ all -> 0x00e5 }
            r2.append(r0)     // Catch:{ all -> 0x00e5 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x00e5 }
            r12.execSQL(r1)     // Catch:{ all -> 0x00e5 }
        L_0x0079:
            java.lang.String r1 = "__c"
            org.json.JSONObject r1 = r11.optJSONObject(r1)     // Catch:{ all -> 0x00e5 }
            if (r1 == 0) goto L_0x00b2
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00e5 }
            java.lang.String r1 = r9.mo19101c(r1)     // Catch:{ all -> 0x00e5 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00e5 }
            if (r2 != 0) goto L_0x00b2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e5 }
            r2.<init>()     // Catch:{ all -> 0x00e5 }
            java.lang.String r7 = "update  __sd set __c=\""
            r2.append(r7)     // Catch:{ all -> 0x00e5 }
            r2.append(r1)     // Catch:{ all -> 0x00e5 }
            r2.append(r6)     // Catch:{ all -> 0x00e5 }
            r2.append(r5)     // Catch:{ all -> 0x00e5 }
            r2.append(r4)     // Catch:{ all -> 0x00e5 }
            r2.append(r10)     // Catch:{ all -> 0x00e5 }
            r2.append(r0)     // Catch:{ all -> 0x00e5 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x00e5 }
            r12.execSQL(r1)     // Catch:{ all -> 0x00e5 }
        L_0x00b2:
            java.lang.String r1 = "__f"
            long r1 = r11.optLong(r1)     // Catch:{ all -> 0x00e5 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e5 }
            r11.<init>()     // Catch:{ all -> 0x00e5 }
            java.lang.String r7 = "update  __sd set __f=\""
            r11.append(r7)     // Catch:{ all -> 0x00e5 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00e5 }
            r11.append(r1)     // Catch:{ all -> 0x00e5 }
            r11.append(r6)     // Catch:{ all -> 0x00e5 }
            r11.append(r5)     // Catch:{ all -> 0x00e5 }
            r11.append(r4)     // Catch:{ all -> 0x00e5 }
            r11.append(r10)     // Catch:{ all -> 0x00e5 }
            r11.append(r0)     // Catch:{ all -> 0x00e5 }
            java.lang.String r10 = r11.toString()     // Catch:{ all -> 0x00e5 }
            r12.execSQL(r10)     // Catch:{ all -> 0x00e5 }
            if (r3 == 0) goto L_0x00ed
            r3.close()
            goto L_0x00ed
        L_0x00e5:
            r1 = r3
            goto L_0x00e8
        L_0x00e7:
        L_0x00e8:
            if (r1 == 0) goto L_0x00ed
            r1.close()
        L_0x00ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.UMStoreManager.m21948c(java.lang.String, org.json.JSONObject, android.database.sqlite.SQLiteDatabase):void");
    }

    /* renamed from: a */
    public void mo19091a() {
        this.f17047i.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r9.equals(r7) != false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0094, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0098, code lost:
        if (r2 != null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009a, code lost:
        r2.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ac, code lost:
        if (r2 != null) goto L_0x009a;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00a7 */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[ExcHandler: all (unused java.lang.Throwable), SYNTHETIC, Splitter:B:3:0x000f] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19092a(org.json.JSONArray r11) {
        /*
            r10 = this;
            java.lang.String r0 = "__t"
            java.lang.String r1 = "__i"
            r2 = 0
            android.content.Context r3 = f17042d     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a7, all -> 0x0098 }
            com.umeng.analytics.pro.f r3 = com.umeng.analytics.pro.UMDBManager.m21926a(r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a7, all -> 0x0098 }
            android.database.sqlite.SQLiteDatabase r3 = r3.mo19087a()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a7, all -> 0x0098 }
            r3.beginTransaction()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0096, all -> 0x0094 }
            r4 = 0
        L_0x0013:
            int r5 = r11.length()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0096, all -> 0x0094 }
            if (r4 >= r5) goto L_0x008d
            org.json.JSONObject r5 = r11.getJSONObject(r4)     // Catch:{ Exception -> 0x008a, all -> 0x0094 }
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ Exception -> 0x008a, all -> 0x0094 }
            r6.<init>()     // Catch:{ Exception -> 0x008a, all -> 0x0094 }
            java.lang.String r7 = r5.optString(r1)     // Catch:{ Exception -> 0x008a, all -> 0x0094 }
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Exception -> 0x008a, all -> 0x0094 }
            java.lang.String r9 = "-1"
            if (r8 != 0) goto L_0x0034
            boolean r8 = r9.equals(r7)     // Catch:{ Exception -> 0x008a, all -> 0x0094 }
            if (r8 == 0) goto L_0x0043
        L_0x0034:
            com.umeng.analytics.pro.t r7 = com.umeng.analytics.pro.SessionTracker.m22097a()     // Catch:{ Exception -> 0x008a, all -> 0x0094 }
            java.lang.String r7 = r7.mo19173b()     // Catch:{ Exception -> 0x008a, all -> 0x0094 }
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Exception -> 0x008a, all -> 0x0094 }
            if (r8 == 0) goto L_0x0043
            r7 = r9
        L_0x0043:
            r6.put(r1, r7)     // Catch:{ Exception -> 0x008a, all -> 0x0094 }
            java.lang.String r7 = "__e"
            java.lang.String r8 = "id"
            java.lang.String r8 = r5.optString(r8)     // Catch:{ Exception -> 0x008a, all -> 0x0094 }
            r6.put(r7, r8)     // Catch:{ Exception -> 0x008a, all -> 0x0094 }
            int r7 = r5.optInt(r0)     // Catch:{ Exception -> 0x008a, all -> 0x0094 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x008a, all -> 0x0094 }
            r6.put(r0, r7)     // Catch:{ Exception -> 0x008a, all -> 0x0094 }
            java.lang.String r7 = "__av"
            android.content.Context r8 = f17042d     // Catch:{ Exception -> 0x008a, all -> 0x0094 }
            java.lang.String r8 = com.umeng.commonsdk.utils.UMUtils.getAppVersionName(r8)     // Catch:{ Exception -> 0x008a, all -> 0x0094 }
            r6.put(r7, r8)     // Catch:{ Exception -> 0x008a, all -> 0x0094 }
            java.lang.String r7 = "__vc"
            android.content.Context r8 = f17042d     // Catch:{ Exception -> 0x008a, all -> 0x0094 }
            java.lang.String r8 = com.umeng.commonsdk.utils.UMUtils.getAppVersionCode(r8)     // Catch:{ Exception -> 0x008a, all -> 0x0094 }
            r6.put(r7, r8)     // Catch:{ Exception -> 0x008a, all -> 0x0094 }
            r5.remove(r1)     // Catch:{ Exception -> 0x008a, all -> 0x0094 }
            r5.remove(r0)     // Catch:{ Exception -> 0x008a, all -> 0x0094 }
            java.lang.String r7 = "__s"
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x008a, all -> 0x0094 }
            java.lang.String r5 = r10.mo19101c(r5)     // Catch:{ Exception -> 0x008a, all -> 0x0094 }
            r6.put(r7, r5)     // Catch:{ Exception -> 0x008a, all -> 0x0094 }
            java.lang.String r5 = "__et"
            r3.insert(r5, r2, r6)     // Catch:{ Exception -> 0x008a, all -> 0x0094 }
        L_0x008a:
            int r4 = r4 + 1
            goto L_0x0013
        L_0x008d:
            r3.setTransactionSuccessful()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0096, all -> 0x0094 }
            r3.endTransaction()     // Catch:{ all -> 0x009d }
            goto L_0x009d
        L_0x0094:
            r2 = r3
            goto L_0x0098
        L_0x0096:
            r2 = r3
            goto L_0x00a7
        L_0x0098:
            if (r2 == 0) goto L_0x009d
        L_0x009a:
            r2.endTransaction()     // Catch:{ all -> 0x009d }
        L_0x009d:
            android.content.Context r11 = f17042d
            com.umeng.analytics.pro.f r11 = com.umeng.analytics.pro.UMDBManager.m21926a(r11)
            r11.mo19088b()
            goto L_0x00af
        L_0x00a7:
            android.content.Context r11 = f17042d     // Catch:{ all -> 0x00b0 }
            com.umeng.analytics.pro.UMDBUtils.m21932a(r11)     // Catch:{ all -> 0x00b0 }
            if (r2 == 0) goto L_0x009d
            goto L_0x009a
        L_0x00af:
            return
        L_0x00b0:
            r11 = move-exception
            if (r2 == 0) goto L_0x00b6
            r2.endTransaction()     // Catch:{ all -> 0x00b6 }
        L_0x00b6:
            android.content.Context r0 = f17042d
            com.umeng.analytics.pro.f r0 = com.umeng.analytics.pro.UMDBManager.m21926a(r0)
            r0.mo19088b()
            goto L_0x00c1
        L_0x00c0:
            throw r11
        L_0x00c1:
            goto L_0x00c0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.UMStoreManager.mo19092a(org.json.JSONArray):void");
    }

    /* renamed from: d */
    public String mo19103d(String str) {
        try {
            if (TextUtils.isEmpty(f17043e)) {
                return str;
            }
            return new String(DataHelper.decrypt(Base64.decode(str.getBytes(), 0), f17043e.getBytes()));
        } catch (Exception unused) {
            if (VERSION.SDK_INT >= 29 && !TextUtils.isEmpty(str)) {
                new JSONObject(str);
                UMRTLog.m22228e(UMRTLog.RTLOG_TAG, "--->>> UMStoreManager decrypt failed, return origin data.");
                return str;
            }
        } catch (Throwable unused2) {
        }
        return null;
    }

    /* renamed from: b */
    public JSONObject mo19097b(boolean z) {
        JSONObject jSONObject = new JSONObject();
        m21944b(jSONObject, z);
        return jSONObject;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.String[], android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r1v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARNING: type inference failed for: r1v1, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v8, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* JADX INFO: used method not loaded: com.umeng.analytics.pro.g.a(android.content.Context):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0067, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        com.umeng.analytics.pro.UMDBUtils.m21932a(f17042d);
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006c, code lost:
        if (r0 != 0) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006e, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0071, code lost:
        if (r1 != 0) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0075, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        com.umeng.analytics.pro.UMDBUtils.m21932a(f17042d);
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007a, code lost:
        if (r0 != 0) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007c, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007f, code lost:
        if (r1 != 0) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008e, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008f, code lost:
        if (r0 != 0) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0091, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0094, code lost:
        if (r1 != 0) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r1.endTransaction();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:24:0x0067, B:31:0x0075] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0067 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0075 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0, types: [java.lang.String[], android.database.Cursor]
  assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
  uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], android.database.Cursor, ?[OBJECT, ARRAY], java.lang.String[]]
  mth insns count: 68
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
    /* JADX WARNING: Unknown top exception splitter block from list: {B:31:0x0075=Splitter:B:31:0x0075, B:24:0x0067=Splitter:B:24:0x0067} */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m21947b(org.json.JSONObject r6, java.lang.String r7) {
        /*
            r5 = this;
            r0 = 0
            android.content.Context r1 = f17042d     // Catch:{ SQLiteDatabaseCorruptException -> 0x0074, all -> 0x0066 }
            com.umeng.analytics.pro.f r1 = com.umeng.analytics.pro.UMDBManager.m21926a(r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0074, all -> 0x0066 }
            android.database.sqlite.SQLiteDatabase r1 = r1.mo19087a()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0074, all -> 0x0066 }
            r1.beginTransaction()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0075, all -> 0x0067 }
            java.lang.String r2 = "select *  from __er"
            boolean r3 = android.text.TextUtils.isEmpty(r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0075, all -> 0x0067 }
            if (r3 != 0) goto L_0x0023
            java.lang.String r2 = "select *  from __er where __i=?"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteDatabaseCorruptException -> 0x0075, all -> 0x0067 }
            r4 = 0
            r3[r4] = r7     // Catch:{ SQLiteDatabaseCorruptException -> 0x0075, all -> 0x0067 }
            android.database.Cursor r7 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0075, all -> 0x0067 }
            goto L_0x0027
        L_0x0023:
            android.database.Cursor r7 = r1.rawQuery(r2, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0075, all -> 0x0067 }
        L_0x0027:
            r0 = r7
            if (r0 == 0) goto L_0x005d
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch:{ SQLiteDatabaseCorruptException -> 0x0075, all -> 0x0067 }
            r7.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0075, all -> 0x0067 }
        L_0x002f:
            boolean r2 = r0.moveToNext()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0075, all -> 0x0067 }
            if (r2 == 0) goto L_0x0052
            java.lang.String r2 = "__a"
            int r2 = r0.getColumnIndex(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0075, all -> 0x0067 }
            java.lang.String r2 = r0.getString(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0075, all -> 0x0067 }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0075, all -> 0x0067 }
            if (r3 != 0) goto L_0x002f
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ SQLiteDatabaseCorruptException -> 0x0075, all -> 0x0067 }
            java.lang.String r2 = r5.mo19103d(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0075, all -> 0x0067 }
            r3.<init>(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0075, all -> 0x0067 }
            r7.put(r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0075, all -> 0x0067 }
            goto L_0x002f
        L_0x0052:
            int r2 = r7.length()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0075, all -> 0x0067 }
            if (r2 <= 0) goto L_0x005d
            java.lang.String r2 = "error"
            r6.put(r2, r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0075, all -> 0x0067 }
        L_0x005d:
            r1.setTransactionSuccessful()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0075, all -> 0x0067 }
            if (r0 == 0) goto L_0x0081
            r0.close()
            goto L_0x0081
        L_0x0066:
            r1 = r0
        L_0x0067:
            android.content.Context r6 = f17042d     // Catch:{ all -> 0x008e }
            com.umeng.analytics.pro.UMDBUtils.m21932a(r6)     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x0071
            r0.close()
        L_0x0071:
            if (r1 == 0) goto L_0x0084
            goto L_0x0081
        L_0x0074:
            r1 = r0
        L_0x0075:
            android.content.Context r6 = f17042d     // Catch:{ all -> 0x008e }
            com.umeng.analytics.pro.UMDBUtils.m21932a(r6)     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x007f
            r0.close()
        L_0x007f:
            if (r1 == 0) goto L_0x0084
        L_0x0081:
            r1.endTransaction()     // Catch:{ all -> 0x0084 }
        L_0x0084:
            android.content.Context r6 = f17042d
            com.umeng.analytics.pro.f r6 = com.umeng.analytics.pro.UMDBManager.m21926a(r6)
            r6.mo19088b()
            return
        L_0x008e:
            r6 = move-exception
            if (r0 == 0) goto L_0x0094
            r0.close()
        L_0x0094:
            if (r1 == 0) goto L_0x0099
            r1.endTransaction()     // Catch:{ all -> 0x0099 }
        L_0x0099:
            android.content.Context r7 = f17042d
            com.umeng.analytics.pro.f r7 = com.umeng.analytics.pro.UMDBManager.m21926a(r7)
            r7.mo19088b()
            goto L_0x00a4
        L_0x00a3:
            throw r6
        L_0x00a4:
            goto L_0x00a3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.UMStoreManager.m21947b(org.json.JSONObject, java.lang.String):void");
    }

    /* renamed from: c */
    public String mo19101c(String str) {
        try {
            return TextUtils.isEmpty(f17043e) ? str : Base64.encodeToString(DataHelper.encrypt(str.getBytes(), f17043e.getBytes()), 0);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0056, code lost:
        if (r0 != null) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0058, code lost:
        r0.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006a, code lost:
        if (r0 != null) goto L_0x0058;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0065 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo19095a(java.lang.String r5, java.lang.String r6, int r7) {
        /*
            r4 = this;
            r0 = 0
            android.content.Context r1 = f17042d     // Catch:{ SQLiteDatabaseCorruptException -> 0x0065, all -> 0x0056 }
            com.umeng.analytics.pro.f r1 = com.umeng.analytics.pro.UMDBManager.m21926a(r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0065, all -> 0x0056 }
            android.database.sqlite.SQLiteDatabase r1 = r1.mo19087a()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0065, all -> 0x0056 }
            r1.beginTransaction()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0054, all -> 0x0052 }
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ SQLiteDatabaseCorruptException -> 0x0054, all -> 0x0052 }
            r2.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0054, all -> 0x0052 }
            java.lang.String r3 = "__i"
            r2.put(r3, r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0054, all -> 0x0052 }
            java.lang.String r5 = r4.mo19101c(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0054, all -> 0x0052 }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0054, all -> 0x0052 }
            if (r6 != 0) goto L_0x004b
            java.lang.String r6 = "__a"
            r2.put(r6, r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0054, all -> 0x0052 }
            java.lang.String r5 = "__t"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0054, all -> 0x0052 }
            r2.put(r5, r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0054, all -> 0x0052 }
            java.lang.String r5 = "__av"
            android.content.Context r6 = f17042d     // Catch:{ SQLiteDatabaseCorruptException -> 0x0054, all -> 0x0052 }
            java.lang.String r6 = com.umeng.commonsdk.utils.UMUtils.getAppVersionName(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0054, all -> 0x0052 }
            r2.put(r5, r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0054, all -> 0x0052 }
            java.lang.String r5 = "__vc"
            android.content.Context r6 = f17042d     // Catch:{ SQLiteDatabaseCorruptException -> 0x0054, all -> 0x0052 }
            java.lang.String r6 = com.umeng.commonsdk.utils.UMUtils.getAppVersionCode(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0054, all -> 0x0052 }
            r2.put(r5, r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0054, all -> 0x0052 }
            java.lang.String r5 = "__er"
            r1.insert(r5, r0, r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0054, all -> 0x0052 }
        L_0x004b:
            r1.setTransactionSuccessful()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0054, all -> 0x0052 }
            r1.endTransaction()     // Catch:{ all -> 0x005b }
            goto L_0x005b
        L_0x0052:
            r0 = r1
            goto L_0x0056
        L_0x0054:
            r0 = r1
            goto L_0x0065
        L_0x0056:
            if (r0 == 0) goto L_0x005b
        L_0x0058:
            r0.endTransaction()     // Catch:{ all -> 0x005b }
        L_0x005b:
            android.content.Context r5 = f17042d
            com.umeng.analytics.pro.f r5 = com.umeng.analytics.pro.UMDBManager.m21926a(r5)
            r5.mo19088b()
            goto L_0x006d
        L_0x0065:
            android.content.Context r5 = f17042d     // Catch:{ all -> 0x006f }
            com.umeng.analytics.pro.UMDBUtils.m21932a(r5)     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x005b
            goto L_0x0058
        L_0x006d:
            r5 = 0
            return r5
        L_0x006f:
            r5 = move-exception
            if (r0 == 0) goto L_0x0075
            r0.endTransaction()     // Catch:{ all -> 0x0075 }
        L_0x0075:
            android.content.Context r6 = f17042d
            com.umeng.analytics.pro.f r6 = com.umeng.analytics.pro.UMDBManager.m21926a(r6)
            r6.mo19088b()
            goto L_0x0080
        L_0x007f:
            throw r5
        L_0x0080:
            goto L_0x007f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.UMStoreManager.mo19095a(java.lang.String, java.lang.String, int):boolean");
    }

    /* renamed from: b */
    private JSONArray m21945b(JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null && optJSONObject.optLong("duration") > 0) {
                jSONArray2.put(optJSONObject);
            }
        }
        return jSONArray2;
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r0v3, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r0v4, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r0v10, types: [java.lang.Object, java.lang.String] */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: type inference failed for: r0v14 */
    /* JADX WARNING: type inference failed for: r0v15 */
    /* JADX WARNING: type inference failed for: r0v16 */
    /* JADX WARNING: type inference failed for: r0v17 */
    /* JADX WARNING: type inference failed for: r0v18 */
    /* JADX WARNING: type inference failed for: r0v19 */
    /* JADX WARNING: type inference failed for: r0v20 */
    /* JADX WARNING: type inference failed for: r0v21 */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00cc, code lost:
        if (r1 != null) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00db, code lost:
        if (r1 != null) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r1.endTransaction();
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0
  assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], ?[OBJECT, ARRAY], java.lang.String]
  uses: [java.lang.String, ?[int, boolean, OBJECT, ARRAY, byte, short, char], android.database.Cursor, java.lang.Object]
  mth insns count: 108
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
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d8  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:49:0x00d1=Splitter:B:49:0x00d1, B:42:0x00c2=Splitter:B:42:0x00c2} */
    /* JADX WARNING: Unknown variable types count: 8 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m21944b(org.json.JSONObject r11, boolean r12) {
        /*
            r10 = this;
            r0 = 0
            android.content.Context r1 = f17042d     // Catch:{ SQLiteDatabaseCorruptException -> 0x00cf, all -> 0x00c0 }
            com.umeng.analytics.pro.f r1 = com.umeng.analytics.pro.UMDBManager.m21926a(r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00cf, all -> 0x00c0 }
            android.database.sqlite.SQLiteDatabase r1 = r1.mo19087a()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00cf, all -> 0x00c0 }
            r1.beginTransaction()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00be, all -> 0x00bc }
            java.lang.String r2 = "select *  from __is"
            android.database.Cursor r2 = r1.rawQuery(r2, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00be, all -> 0x00bc }
            if (r2 == 0) goto L_0x00a1
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b9, all -> 0x00b6 }
            r3.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b9, all -> 0x00b6 }
        L_0x001b:
            boolean r4 = r2.moveToNext()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b9, all -> 0x00b6 }
            if (r4 == 0) goto L_0x0096
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b9, all -> 0x00b6 }
            r4.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b9, all -> 0x00b6 }
            java.lang.String r5 = "__e"
            int r5 = r2.getColumnIndex(r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b9, all -> 0x00b6 }
            java.lang.String r5 = r2.getString(r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b9, all -> 0x00b6 }
            java.lang.String r6 = "__ii"
            int r6 = r2.getColumnIndex(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b9, all -> 0x00b6 }
            java.lang.String r0 = r2.getString(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b9, all -> 0x00b6 }
            java.util.List<java.lang.String> r6 = r10.f17050l     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b9, all -> 0x00b6 }
            r6.add(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b9, all -> 0x00b6 }
            java.lang.String r6 = "__sp"
            int r6 = r2.getColumnIndex(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b9, all -> 0x00b6 }
            java.lang.String r6 = r2.getString(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b9, all -> 0x00b6 }
            java.lang.String r7 = "__pp"
            int r7 = r2.getColumnIndex(r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b9, all -> 0x00b6 }
            java.lang.String r7 = r2.getString(r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b9, all -> 0x00b6 }
            boolean r8 = android.text.TextUtils.isEmpty(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b9, all -> 0x00b6 }
            if (r8 != 0) goto L_0x0067
            java.lang.String r8 = "_$sp"
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b9, all -> 0x00b6 }
            java.lang.String r6 = r10.mo19103d(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b9, all -> 0x00b6 }
            r9.<init>(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b9, all -> 0x00b6 }
            r4.put(r8, r9)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b9, all -> 0x00b6 }
        L_0x0067:
            boolean r6 = android.text.TextUtils.isEmpty(r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b9, all -> 0x00b6 }
            if (r6 != 0) goto L_0x007b
            java.lang.String r6 = "_$pp"
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b9, all -> 0x00b6 }
            java.lang.String r7 = r10.mo19103d(r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b9, all -> 0x00b6 }
            r8.<init>(r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b9, all -> 0x00b6 }
            r4.put(r6, r8)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b9, all -> 0x00b6 }
        L_0x007b:
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b9, all -> 0x00b6 }
            if (r6 != 0) goto L_0x001b
            java.lang.String r6 = "id"
            r4.put(r6, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b9, all -> 0x00b6 }
            java.lang.String r6 = "start_time"
            r4.put(r6, r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b9, all -> 0x00b6 }
            int r5 = r4.length()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b9, all -> 0x00b6 }
            if (r5 <= 0) goto L_0x0094
            r3.put(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b9, all -> 0x00b6 }
        L_0x0094:
            if (r12 == 0) goto L_0x001b
        L_0x0096:
            int r12 = r3.length()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b9, all -> 0x00b6 }
            if (r12 <= 0) goto L_0x00a1
            java.lang.String r12 = "sessions"
            r11.put(r12, r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b9, all -> 0x00b6 }
        L_0x00a1:
            r1.setTransactionSuccessful()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b9, all -> 0x00b6 }
            if (r2 == 0) goto L_0x00a9
            r2.close()
        L_0x00a9:
            r1.endTransaction()     // Catch:{ all -> 0x00ac }
        L_0x00ac:
            android.content.Context r11 = f17042d
            com.umeng.analytics.pro.f r11 = com.umeng.analytics.pro.UMDBManager.m21926a(r11)
            r11.mo19088b()
            goto L_0x00ea
        L_0x00b6:
            r11 = r0
            r0 = r2
            goto L_0x00c2
        L_0x00b9:
            r11 = r0
            r0 = r2
            goto L_0x00d1
        L_0x00bc:
            r11 = r0
            goto L_0x00c2
        L_0x00be:
            r11 = r0
            goto L_0x00d1
        L_0x00c0:
            r11 = r0
            r1 = r11
        L_0x00c2:
            android.content.Context r12 = f17042d     // Catch:{ all -> 0x00eb }
            com.umeng.analytics.pro.UMDBUtils.m21932a(r12)     // Catch:{ all -> 0x00eb }
            if (r0 == 0) goto L_0x00cc
            r0.close()
        L_0x00cc:
            if (r1 == 0) goto L_0x00e0
            goto L_0x00dd
        L_0x00cf:
            r11 = r0
            r1 = r11
        L_0x00d1:
            android.content.Context r12 = f17042d     // Catch:{ all -> 0x00eb }
            com.umeng.analytics.pro.UMDBUtils.m21932a(r12)     // Catch:{ all -> 0x00eb }
            if (r0 == 0) goto L_0x00db
            r0.close()
        L_0x00db:
            if (r1 == 0) goto L_0x00e0
        L_0x00dd:
            r1.endTransaction()     // Catch:{ all -> 0x00e0 }
        L_0x00e0:
            android.content.Context r12 = f17042d
            com.umeng.analytics.pro.f r12 = com.umeng.analytics.pro.UMDBManager.m21926a(r12)
            r12.mo19088b()
            r0 = r11
        L_0x00ea:
            return r0
        L_0x00eb:
            r11 = move-exception
            if (r0 == 0) goto L_0x00f1
            r0.close()
        L_0x00f1:
            if (r1 == 0) goto L_0x00f6
            r1.endTransaction()     // Catch:{ all -> 0x00f6 }
        L_0x00f6:
            android.content.Context r12 = f17042d
            com.umeng.analytics.pro.f r12 = com.umeng.analytics.pro.UMDBManager.m21926a(r12)
            r12.mo19088b()
            goto L_0x0101
        L_0x0100:
            throw r11
        L_0x0101:
            goto L_0x0100
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.UMStoreManager.m21944b(org.json.JSONObject, boolean):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0085, code lost:
        if (r2 != null) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0087, code lost:
        r2.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0099, code lost:
        if (r2 != null) goto L_0x0087;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0094 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo19096a(java.lang.String r7, org.json.JSONObject r8, com.umeng.analytics.pro.UMStoreManager.C3143a r9) {
        /*
            r6 = this;
            java.lang.String r0 = "__e"
            r1 = 0
            if (r8 != 0) goto L_0x0006
            return r1
        L_0x0006:
            r2 = 0
            android.content.Context r3 = f17042d     // Catch:{ SQLiteDatabaseCorruptException -> 0x0094, all -> 0x0085 }
            com.umeng.analytics.pro.f r3 = com.umeng.analytics.pro.UMDBManager.m21926a(r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0094, all -> 0x0085 }
            android.database.sqlite.SQLiteDatabase r3 = r3.mo19087a()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0094, all -> 0x0085 }
            r3.beginTransaction()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0083, all -> 0x0081 }
            com.umeng.analytics.pro.h$a r4 = com.umeng.analytics.pro.UMStoreManager.C3143a.BEGIN     // Catch:{ SQLiteDatabaseCorruptException -> 0x0083, all -> 0x0081 }
            if (r9 != r4) goto L_0x004f
            java.lang.Object r8 = r8.opt(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0083, all -> 0x0081 }
            java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ SQLiteDatabaseCorruptException -> 0x0083, all -> 0x0081 }
            long r8 = r8.longValue()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0083, all -> 0x0081 }
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ SQLiteDatabaseCorruptException -> 0x0083, all -> 0x0081 }
            r4.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0083, all -> 0x0081 }
            java.lang.String r5 = "__ii"
            r4.put(r5, r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0083, all -> 0x0081 }
            java.lang.String r7 = java.lang.String.valueOf(r8)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0083, all -> 0x0081 }
            r4.put(r0, r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0083, all -> 0x0081 }
            java.lang.String r7 = "__av"
            android.content.Context r8 = f17042d     // Catch:{ SQLiteDatabaseCorruptException -> 0x0083, all -> 0x0081 }
            java.lang.String r8 = com.umeng.commonsdk.utils.UMUtils.getAppVersionName(r8)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0083, all -> 0x0081 }
            r4.put(r7, r8)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0083, all -> 0x0081 }
            java.lang.String r7 = "__vc"
            android.content.Context r8 = f17042d     // Catch:{ SQLiteDatabaseCorruptException -> 0x0083, all -> 0x0081 }
            java.lang.String r8 = com.umeng.commonsdk.utils.UMUtils.getAppVersionCode(r8)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0083, all -> 0x0081 }
            r4.put(r7, r8)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0083, all -> 0x0081 }
            java.lang.String r7 = "__sd"
            r3.insert(r7, r2, r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0083, all -> 0x0081 }
            goto L_0x007a
        L_0x004f:
            com.umeng.analytics.pro.h$a r0 = com.umeng.analytics.pro.UMStoreManager.C3143a.INSTANTSESSIONBEGIN     // Catch:{ SQLiteDatabaseCorruptException -> 0x0083, all -> 0x0081 }
            if (r9 != r0) goto L_0x0057
            r6.m21946b(r7, r8, r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0083, all -> 0x0081 }
            goto L_0x007a
        L_0x0057:
            com.umeng.analytics.pro.h$a r0 = com.umeng.analytics.pro.UMStoreManager.C3143a.END     // Catch:{ SQLiteDatabaseCorruptException -> 0x0083, all -> 0x0081 }
            if (r9 != r0) goto L_0x005f
            r6.m21941a(r7, r8, r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0083, all -> 0x0081 }
            goto L_0x007a
        L_0x005f:
            com.umeng.analytics.pro.h$a r0 = com.umeng.analytics.pro.UMStoreManager.C3143a.PAGE     // Catch:{ SQLiteDatabaseCorruptException -> 0x0083, all -> 0x0081 }
            if (r9 != r0) goto L_0x0069
            java.lang.String r9 = "__a"
            r6.m21942a(r7, r8, r3, r9)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0083, all -> 0x0081 }
            goto L_0x007a
        L_0x0069:
            com.umeng.analytics.pro.h$a r0 = com.umeng.analytics.pro.UMStoreManager.C3143a.AUTOPAGE     // Catch:{ SQLiteDatabaseCorruptException -> 0x0083, all -> 0x0081 }
            if (r9 != r0) goto L_0x0073
            java.lang.String r9 = "__b"
            r6.m21942a(r7, r8, r3, r9)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0083, all -> 0x0081 }
            goto L_0x007a
        L_0x0073:
            com.umeng.analytics.pro.h$a r0 = com.umeng.analytics.pro.UMStoreManager.C3143a.NEWSESSION     // Catch:{ SQLiteDatabaseCorruptException -> 0x0083, all -> 0x0081 }
            if (r9 != r0) goto L_0x007a
            r6.m21948c(r7, r8, r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0083, all -> 0x0081 }
        L_0x007a:
            r3.setTransactionSuccessful()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0083, all -> 0x0081 }
            r3.endTransaction()     // Catch:{ all -> 0x008a }
            goto L_0x008a
        L_0x0081:
            r2 = r3
            goto L_0x0085
        L_0x0083:
            r2 = r3
            goto L_0x0094
        L_0x0085:
            if (r2 == 0) goto L_0x008a
        L_0x0087:
            r2.endTransaction()     // Catch:{ all -> 0x008a }
        L_0x008a:
            android.content.Context r7 = f17042d
            com.umeng.analytics.pro.f r7 = com.umeng.analytics.pro.UMDBManager.m21926a(r7)
            r7.mo19088b()
            goto L_0x009c
        L_0x0094:
            android.content.Context r7 = f17042d     // Catch:{ all -> 0x009d }
            com.umeng.analytics.pro.UMDBUtils.m21932a(r7)     // Catch:{ all -> 0x009d }
            if (r2 == 0) goto L_0x008a
            goto L_0x0087
        L_0x009c:
            return r1
        L_0x009d:
            r7 = move-exception
            if (r2 == 0) goto L_0x00a3
            r2.endTransaction()     // Catch:{ all -> 0x00a3 }
        L_0x00a3:
            android.content.Context r8 = f17042d
            com.umeng.analytics.pro.f r8 = com.umeng.analytics.pro.UMDBManager.m21926a(r8)
            r8.mo19088b()
            goto L_0x00ae
        L_0x00ad:
            throw r7
        L_0x00ae:
            goto L_0x00ad
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.UMStoreManager.mo19096a(java.lang.String, org.json.JSONObject, com.umeng.analytics.pro.h$a):boolean");
    }

    /* renamed from: a */
    private void m21941a(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase) {
        String str2;
        String str3 = "__pp";
        String str4 = "__sp";
        String str5 = C3135a.f17014h;
        String str6 = "\", ";
        String str7 = "=\"";
        try {
            long longValue = ((Long) jSONObject.opt(C3135a.f17013g)).longValue();
            long j = 0;
            Object opt = jSONObject.opt(str5);
            if (opt != null && (opt instanceof Long)) {
                j = ((Long) opt).longValue();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(str4);
            JSONObject optJSONObject2 = jSONObject.optJSONObject(str3);
            String str8 = "";
            if (optJSONObject != null) {
                if (optJSONObject.length() > 0) {
                    str2 = mo19101c(optJSONObject.toString());
                    if (optJSONObject2 != null && optJSONObject2.length() > 0) {
                        str8 = mo19101c(optJSONObject2.toString());
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("update __sd set __f=\"");
                    sb.append(longValue);
                    sb.append(str6);
                    sb.append(str5);
                    sb.append(str7);
                    sb.append(j);
                    sb.append(str6);
                    sb.append(str4);
                    sb.append(str7);
                    sb.append(str2);
                    sb.append(str6);
                    sb.append(str3);
                    sb.append(str7);
                    sb.append(str8);
                    sb.append("\" where ");
                    sb.append("__ii");
                    sb.append(str7);
                    sb.append(str);
                    sb.append("\"");
                    sQLiteDatabase.execSQL(sb.toString());
                }
            }
            str2 = str8;
            str8 = mo19101c(optJSONObject2.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("update __sd set __f=\"");
            sb2.append(longValue);
            sb2.append(str6);
            sb2.append(str5);
            sb2.append(str7);
            sb2.append(j);
            sb2.append(str6);
            sb2.append(str4);
            sb2.append(str7);
            sb2.append(str2);
            sb2.append(str6);
            sb2.append(str3);
            sb2.append(str7);
            sb2.append(str8);
            sb2.append("\" where ");
            sb2.append("__ii");
            sb2.append(str7);
            sb2.append(str);
            sb2.append("\"");
            sQLiteDatabase.execSQL(sb2.toString());
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0051, code lost:
        if (r0 == null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0065, code lost:
        if (r0 == null) goto L_0x0056;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0060 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19100b(boolean r3, boolean r4) {
        /*
            r2 = this;
            r0 = 0
            android.content.Context r1 = f17042d     // Catch:{ SQLiteDatabaseCorruptException -> 0x0060, all -> 0x0051 }
            com.umeng.analytics.pro.f r1 = com.umeng.analytics.pro.UMDBManager.m21926a(r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0060, all -> 0x0051 }
            android.database.sqlite.SQLiteDatabase r0 = r1.mo19087a()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0060, all -> 0x0051 }
            r0.beginTransaction()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0060, all -> 0x0051 }
            if (r4 == 0) goto L_0x0018
            if (r3 == 0) goto L_0x004d
            java.lang.String r3 = "delete from __sd"
            r0.execSQL(r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0060, all -> 0x0051 }
            goto L_0x004d
        L_0x0018:
            java.util.List<java.lang.String> r3 = r2.f17047i     // Catch:{ SQLiteDatabaseCorruptException -> 0x0060, all -> 0x0051 }
            int r3 = r3.size()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0060, all -> 0x0051 }
            if (r3 <= 0) goto L_0x004d
            r3 = 0
        L_0x0021:
            java.util.List<java.lang.String> r4 = r2.f17047i     // Catch:{ SQLiteDatabaseCorruptException -> 0x0060, all -> 0x0051 }
            int r4 = r4.size()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0060, all -> 0x0051 }
            if (r3 >= r4) goto L_0x004d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteDatabaseCorruptException -> 0x0060, all -> 0x0051 }
            r4.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0060, all -> 0x0051 }
            java.lang.String r1 = "delete from __sd where __ii=\""
            r4.append(r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0060, all -> 0x0051 }
            java.util.List<java.lang.String> r1 = r2.f17047i     // Catch:{ SQLiteDatabaseCorruptException -> 0x0060, all -> 0x0051 }
            java.lang.Object r1 = r1.get(r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0060, all -> 0x0051 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x0060, all -> 0x0051 }
            r4.append(r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0060, all -> 0x0051 }
            java.lang.String r1 = "\""
            r4.append(r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0060, all -> 0x0051 }
            java.lang.String r4 = r4.toString()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0060, all -> 0x0051 }
            r0.execSQL(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0060, all -> 0x0051 }
            int r3 = r3 + 1
            goto L_0x0021
        L_0x004d:
            r0.setTransactionSuccessful()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0060, all -> 0x0051 }
            goto L_0x0053
        L_0x0051:
            if (r0 == 0) goto L_0x0056
        L_0x0053:
            r0.endTransaction()     // Catch:{ all -> 0x0056 }
        L_0x0056:
            android.content.Context r3 = f17042d
            com.umeng.analytics.pro.f r3 = com.umeng.analytics.pro.UMDBManager.m21926a(r3)
            r3.mo19088b()
            goto L_0x0068
        L_0x0060:
            android.content.Context r3 = f17042d     // Catch:{ all -> 0x0069 }
            com.umeng.analytics.pro.UMDBUtils.m21932a(r3)     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x0056
            goto L_0x0053
        L_0x0068:
            return
        L_0x0069:
            r3 = move-exception
            if (r0 == 0) goto L_0x006f
            r0.endTransaction()     // Catch:{ all -> 0x006f }
        L_0x006f:
            android.content.Context r4 = f17042d
            com.umeng.analytics.pro.f r4 = com.umeng.analytics.pro.UMDBManager.m21926a(r4)
            r4.mo19088b()
            goto L_0x007a
        L_0x0079:
            throw r3
        L_0x007a:
            goto L_0x0079
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.UMStoreManager.mo19100b(boolean, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.database.Cursor] */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004f, code lost:
        if (r4 == 0) goto L_0x0054;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037 A[SYNTHETIC, Splitter:B:14:0x0037] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c A[Catch:{ Exception -> 0x003f }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c A[SYNTHETIC, Splitter:B:25:0x004c] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo19089a(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "select __f from __sd where __ii=?"
            r1 = 0
            r2 = 0
            android.content.Context r4 = f17042d     // Catch:{ Exception -> 0x0049, all -> 0x0033 }
            com.umeng.analytics.pro.f r4 = com.umeng.analytics.pro.UMDBManager.m21926a(r4)     // Catch:{ Exception -> 0x0049, all -> 0x0033 }
            android.database.sqlite.SQLiteDatabase r4 = r4.mo19087a()     // Catch:{ Exception -> 0x0049, all -> 0x0033 }
            r4.beginTransaction()     // Catch:{ Exception -> 0x004a, all -> 0x0031 }
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ Exception -> 0x004a, all -> 0x0031 }
            r6 = 0
            r5[r6] = r8     // Catch:{ Exception -> 0x004a, all -> 0x0031 }
            android.database.Cursor r1 = r4.rawQuery(r0, r5)     // Catch:{ Exception -> 0x004a, all -> 0x0031 }
            if (r1 == 0) goto L_0x002b
            r1.moveToFirst()     // Catch:{ Exception -> 0x004a, all -> 0x0031 }
            java.lang.String r8 = "__f"
            int r8 = r1.getColumnIndex(r8)     // Catch:{ Exception -> 0x004a, all -> 0x0031 }
            long r2 = r1.getLong(r8)     // Catch:{ Exception -> 0x004a, all -> 0x0031 }
        L_0x002b:
            if (r1 == 0) goto L_0x0051
            r1.close()     // Catch:{ Exception -> 0x0054 }
            goto L_0x0051
        L_0x0031:
            r8 = move-exception
            goto L_0x0035
        L_0x0033:
            r8 = move-exception
            r4 = r1
        L_0x0035:
            if (r1 == 0) goto L_0x003a
            r1.close()     // Catch:{ Exception -> 0x003f }
        L_0x003a:
            if (r4 == 0) goto L_0x003f
            r4.endTransaction()     // Catch:{ Exception -> 0x003f }
        L_0x003f:
            android.content.Context r0 = f17042d
            com.umeng.analytics.pro.f r0 = com.umeng.analytics.pro.UMDBManager.m21926a(r0)
            r0.mo19088b()
            throw r8
        L_0x0049:
            r4 = r1
        L_0x004a:
            if (r1 == 0) goto L_0x004f
            r1.close()     // Catch:{ Exception -> 0x0054 }
        L_0x004f:
            if (r4 == 0) goto L_0x0054
        L_0x0051:
            r4.endTransaction()     // Catch:{ Exception -> 0x0054 }
        L_0x0054:
            android.content.Context r8 = f17042d
            com.umeng.analytics.pro.f r8 = com.umeng.analytics.pro.UMDBManager.m21926a(r8)
            r8.mo19088b()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.UMStoreManager.mo19089a(java.lang.String):long");
    }

    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r2v3, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r4v9, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v0
  assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], java.lang.String, ?[OBJECT, ARRAY]]
  uses: [java.lang.CharSequence, java.lang.String, ?[int, boolean, OBJECT, ARRAY, byte, short, char], android.database.Cursor]
  mth insns count: 94
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
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ee  */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m21942a(java.lang.String r8, org.json.JSONObject r9, android.database.sqlite.SQLiteDatabase r10, java.lang.String r11) throws org.json.JSONException {
        /*
            r7 = this;
            java.lang.String r0 = "=\""
            java.lang.String r1 = "__ii"
            java.lang.String r2 = "__b"
            java.lang.String r3 = "__a"
            r4 = 0
            boolean r5 = r3.equals(r11)     // Catch:{ all -> 0x00eb }
            if (r5 == 0) goto L_0x001c
            org.json.JSONArray r9 = r9.optJSONArray(r3)     // Catch:{ all -> 0x00eb }
            if (r9 == 0) goto L_0x001b
            int r2 = r9.length()     // Catch:{ all -> 0x00eb }
            if (r2 > 0) goto L_0x0030
        L_0x001b:
            return
        L_0x001c:
            boolean r3 = r2.equals(r11)     // Catch:{ all -> 0x00eb }
            if (r3 == 0) goto L_0x002f
            org.json.JSONArray r9 = r9.optJSONArray(r2)     // Catch:{ all -> 0x00eb }
            if (r9 == 0) goto L_0x002e
            int r2 = r9.length()     // Catch:{ all -> 0x00eb }
            if (r2 > 0) goto L_0x0030
        L_0x002e:
            return
        L_0x002f:
            r9 = r4
        L_0x0030:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00eb }
            r2.<init>()     // Catch:{ all -> 0x00eb }
            java.lang.String r3 = "select "
            r2.append(r3)     // Catch:{ all -> 0x00eb }
            r2.append(r11)     // Catch:{ all -> 0x00eb }
            java.lang.String r3 = " from "
            r2.append(r3)     // Catch:{ all -> 0x00eb }
            java.lang.String r3 = "__sd"
            r2.append(r3)     // Catch:{ all -> 0x00eb }
            java.lang.String r3 = " where "
            r2.append(r3)     // Catch:{ all -> 0x00eb }
            r2.append(r1)     // Catch:{ all -> 0x00eb }
            java.lang.String r3 = "=?"
            r2.append(r3)     // Catch:{ all -> 0x00eb }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00eb }
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ all -> 0x00eb }
            r5 = 0
            r3[r5] = r8     // Catch:{ all -> 0x00eb }
            android.database.Cursor r2 = r10.rawQuery(r2, r3)     // Catch:{ all -> 0x00eb }
            if (r2 == 0) goto L_0x007a
        L_0x0064:
            boolean r3 = r2.moveToNext()     // Catch:{ all -> 0x0077 }
            if (r3 == 0) goto L_0x007a
            int r3 = r2.getColumnIndex(r11)     // Catch:{ all -> 0x0077 }
            java.lang.String r3 = r2.getString(r3)     // Catch:{ all -> 0x0077 }
            java.lang.String r4 = r7.mo19103d(r3)     // Catch:{ all -> 0x0077 }
            goto L_0x0064
        L_0x0077:
            r4 = r2
            goto L_0x00ec
        L_0x007a:
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ all -> 0x0077 }
            r3.<init>()     // Catch:{ all -> 0x0077 }
            boolean r6 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0077 }
            if (r6 != 0) goto L_0x008a
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ all -> 0x0077 }
            r3.<init>(r4)     // Catch:{ all -> 0x0077 }
        L_0x008a:
            int r4 = r3.length()     // Catch:{ all -> 0x0077 }
            r6 = 1000(0x3e8, float:1.401E-42)
            if (r4 <= r6) goto L_0x0098
            if (r2 == 0) goto L_0x0097
            r2.close()
        L_0x0097:
            return
        L_0x0098:
            int r4 = r9.length()     // Catch:{ all -> 0x0077 }
            if (r5 >= r4) goto L_0x00aa
            org.json.JSONObject r4 = r9.getJSONObject(r5)     // Catch:{ JSONException -> 0x00a7 }
            if (r4 == 0) goto L_0x00a7
            r3.put(r4)     // Catch:{ all -> 0x0077 }
        L_0x00a7:
            int r5 = r5 + 1
            goto L_0x0098
        L_0x00aa:
            java.lang.String r9 = r3.toString()     // Catch:{ all -> 0x0077 }
            java.lang.String r9 = r7.mo19101c(r9)     // Catch:{ all -> 0x0077 }
            boolean r3 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0077 }
            if (r3 != 0) goto L_0x00e5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0077 }
            r3.<init>()     // Catch:{ all -> 0x0077 }
            java.lang.String r4 = "update __sd set "
            r3.append(r4)     // Catch:{ all -> 0x0077 }
            r3.append(r11)     // Catch:{ all -> 0x0077 }
            r3.append(r0)     // Catch:{ all -> 0x0077 }
            r3.append(r9)     // Catch:{ all -> 0x0077 }
            java.lang.String r9 = "\" where "
            r3.append(r9)     // Catch:{ all -> 0x0077 }
            r3.append(r1)     // Catch:{ all -> 0x0077 }
            r3.append(r0)     // Catch:{ all -> 0x0077 }
            r3.append(r8)     // Catch:{ all -> 0x0077 }
            java.lang.String r8 = "\""
            r3.append(r8)     // Catch:{ all -> 0x0077 }
            java.lang.String r8 = r3.toString()     // Catch:{ all -> 0x0077 }
            r10.execSQL(r8)     // Catch:{ all -> 0x0077 }
        L_0x00e5:
            if (r2 == 0) goto L_0x00f1
            r2.close()
            goto L_0x00f1
        L_0x00eb:
        L_0x00ec:
            if (r4 == 0) goto L_0x00f1
            r4.close()
        L_0x00f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.UMStoreManager.m21942a(java.lang.String, org.json.JSONObject, android.database.sqlite.SQLiteDatabase, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        if (r0 == null) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0031, code lost:
        if (r0 == null) goto L_0x0036;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0040 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19099b(java.lang.String r4) {
        /*
            r3 = this;
            r0 = 0
            android.content.Context r1 = f17042d     // Catch:{ SQLiteDatabaseCorruptException -> 0x0040, all -> 0x0031 }
            com.umeng.analytics.pro.f r1 = com.umeng.analytics.pro.UMDBManager.m21926a(r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0040, all -> 0x0031 }
            android.database.sqlite.SQLiteDatabase r0 = r1.mo19087a()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0040, all -> 0x0031 }
            r0.beginTransaction()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0040, all -> 0x0031 }
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0040, all -> 0x0031 }
            if (r1 != 0) goto L_0x002d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SQLiteDatabaseCorruptException -> 0x0040, all -> 0x0031 }
            r1.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0040, all -> 0x0031 }
            java.lang.String r2 = "delete from __is where __ii=\""
            r1.append(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0040, all -> 0x0031 }
            r1.append(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0040, all -> 0x0031 }
            java.lang.String r4 = "\""
            r1.append(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0040, all -> 0x0031 }
            java.lang.String r4 = r1.toString()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0040, all -> 0x0031 }
            r0.execSQL(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0040, all -> 0x0031 }
        L_0x002d:
            r0.setTransactionSuccessful()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0040, all -> 0x0031 }
            goto L_0x0033
        L_0x0031:
            if (r0 == 0) goto L_0x0036
        L_0x0033:
            r0.endTransaction()     // Catch:{ all -> 0x0036 }
        L_0x0036:
            android.content.Context r4 = f17042d
            com.umeng.analytics.pro.f r4 = com.umeng.analytics.pro.UMDBManager.m21926a(r4)
            r4.mo19088b()
            goto L_0x0048
        L_0x0040:
            android.content.Context r4 = f17042d     // Catch:{ all -> 0x0049 }
            com.umeng.analytics.pro.UMDBUtils.m21932a(r4)     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x0036
            goto L_0x0033
        L_0x0048:
            return
        L_0x0049:
            r4 = move-exception
            if (r0 == 0) goto L_0x004f
            r0.endTransaction()     // Catch:{ all -> 0x004f }
        L_0x004f:
            android.content.Context r0 = f17042d
            com.umeng.analytics.pro.f r0 = com.umeng.analytics.pro.UMDBManager.m21926a(r0)
            r0.mo19088b()
            goto L_0x005a
        L_0x0059:
            throw r4
        L_0x005a:
            goto L_0x0059
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.UMStoreManager.mo19099b(java.lang.String):void");
    }

    /* renamed from: a */
    public JSONObject mo19090a(boolean z) {
        mo19091a();
        this.f17048j.clear();
        JSONObject jSONObject = new JSONObject();
        if (!z) {
            m21940a(jSONObject, z);
            m21947b(jSONObject, (String) null);
            m21943a(jSONObject, (String) null);
        } else {
            String a = m21940a(jSONObject, z);
            if (!TextUtils.isEmpty(a)) {
                m21947b(jSONObject, a);
                m21943a(jSONObject, a);
            }
        }
        return jSONObject;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.String[], android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r1v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARNING: type inference failed for: r1v1, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v8, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* JADX INFO: used method not loaded: com.umeng.analytics.pro.g.a(android.content.Context):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0164, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        com.umeng.analytics.pro.UMDBUtils.m21932a(f17042d);
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0169, code lost:
        if (r0 != 0) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x016b, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x016e, code lost:
        if (r1 != 0) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0172, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        com.umeng.analytics.pro.UMDBUtils.m21932a(f17042d);
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0177, code lost:
        if (r0 != 0) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0179, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x017c, code lost:
        if (r1 != 0) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x018b, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x018c, code lost:
        if (r0 != 0) goto L_0x018e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x018e, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0191, code lost:
        if (r1 != 0) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        r1.endTransaction();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:66:0x0164, B:73:0x0172] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x0164 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x0172 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0, types: [java.lang.String[], android.database.Cursor]
  assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
  uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], android.database.Cursor, ?[OBJECT, ARRAY], java.lang.String[]]
  mth insns count: 146
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
    /* JADX WARNING: Unknown top exception splitter block from list: {B:73:0x0172=Splitter:B:73:0x0172, B:66:0x0164=Splitter:B:66:0x0164} */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m21943a(org.json.JSONObject r11, java.lang.String r12) {
        /*
            r10 = this;
            r0 = 0
            android.content.Context r1 = f17042d     // Catch:{ SQLiteDatabaseCorruptException -> 0x0171, all -> 0x0163 }
            com.umeng.analytics.pro.f r1 = com.umeng.analytics.pro.UMDBManager.m21926a(r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0171, all -> 0x0163 }
            android.database.sqlite.SQLiteDatabase r1 = r1.mo19087a()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0171, all -> 0x0163 }
            r1.beginTransaction()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            java.lang.String r2 = "select *  from __et"
            boolean r3 = android.text.TextUtils.isEmpty(r12)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            r4 = 0
            if (r3 != 0) goto L_0x0023
            java.lang.String r2 = "select *  from __et where __i=?"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            r3[r4] = r12     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            android.database.Cursor r12 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            goto L_0x0027
        L_0x0023:
            android.database.Cursor r12 = r1.rawQuery(r2, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
        L_0x0027:
            r0 = r12
            if (r0 == 0) goto L_0x015a
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            r12.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            r2.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            com.umeng.analytics.pro.t r3 = com.umeng.analytics.pro.SessionTracker.m22097a()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            java.lang.String r3 = r3.mo19173b()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
        L_0x003c:
            boolean r5 = r0.moveToNext()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            if (r5 == 0) goto L_0x00d8
            java.lang.String r5 = "__t"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            int r5 = r0.getInt(r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            java.lang.String r6 = "__i"
            int r6 = r0.getColumnIndex(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            java.lang.String r6 = r0.getString(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            java.lang.String r7 = "__s"
            int r7 = r0.getColumnIndex(r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            java.lang.String r7 = r0.getString(r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            boolean r8 = android.text.TextUtils.isEmpty(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            if (r8 != 0) goto L_0x006e
            java.lang.String r8 = "-1"
            boolean r8 = r8.equals(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            if (r8 == 0) goto L_0x0075
        L_0x006e:
            boolean r6 = android.text.TextUtils.isEmpty(r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            if (r6 != 0) goto L_0x003c
            r6 = r3
        L_0x0075:
            int r8 = r0.getInt(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            java.util.List<java.lang.Integer> r9 = r10.f17048j     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            r9.add(r8)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            r8 = 2049(0x801, float:2.871E-42)
            if (r5 == r8) goto L_0x00b1
            r8 = 2050(0x802, float:2.873E-42)
            if (r5 == r8) goto L_0x008b
            goto L_0x003c
        L_0x008b:
            boolean r5 = android.text.TextUtils.isEmpty(r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            if (r5 != 0) goto L_0x003c
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            java.lang.String r7 = r10.mo19103d(r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            r5.<init>(r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            boolean r7 = r2.has(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            if (r7 == 0) goto L_0x00a5
            org.json.JSONArray r7 = r2.optJSONArray(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            goto L_0x00aa
        L_0x00a5:
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            r7.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
        L_0x00aa:
            r7.put(r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            r2.put(r6, r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            goto L_0x003c
        L_0x00b1:
            boolean r5 = android.text.TextUtils.isEmpty(r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            if (r5 != 0) goto L_0x003c
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            java.lang.String r7 = r10.mo19103d(r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            r5.<init>(r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            boolean r7 = r12.has(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            if (r7 == 0) goto L_0x00cb
            org.json.JSONArray r7 = r12.optJSONArray(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            goto L_0x00d0
        L_0x00cb:
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            r7.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
        L_0x00d0:
            r7.put(r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            r12.put(r6, r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            goto L_0x003c
        L_0x00d8:
            int r3 = r12.length()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            if (r3 <= 0) goto L_0x0119
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            r3.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            java.util.Iterator r4 = r12.keys()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
        L_0x00e7:
            boolean r5 = r4.hasNext()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            if (r5 == 0) goto L_0x010e
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            r5.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            java.lang.Object r6 = r4.next()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            java.lang.String r7 = r12.optString(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            r8.<init>(r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            r5.put(r6, r8)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            int r6 = r5.length()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            if (r6 <= 0) goto L_0x00e7
            r3.put(r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            goto L_0x00e7
        L_0x010e:
            int r12 = r3.length()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            if (r12 <= 0) goto L_0x0119
            java.lang.String r12 = "ekv"
            r11.put(r12, r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
        L_0x0119:
            int r12 = r2.length()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            if (r12 <= 0) goto L_0x015a
            org.json.JSONArray r12 = new org.json.JSONArray     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            r12.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            java.util.Iterator r3 = r2.keys()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
        L_0x0128:
            boolean r4 = r3.hasNext()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            if (r4 == 0) goto L_0x014f
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            r4.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            java.lang.Object r5 = r3.next()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            java.lang.String r6 = r2.optString(r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            r7.<init>(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            r4.put(r5, r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            int r5 = r4.length()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            if (r5 <= 0) goto L_0x0128
            r12.put(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            goto L_0x0128
        L_0x014f:
            int r2 = r12.length()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            if (r2 <= 0) goto L_0x015a
            java.lang.String r2 = "gkv"
            r11.put(r2, r12)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
        L_0x015a:
            r1.setTransactionSuccessful()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0172, all -> 0x0164 }
            if (r0 == 0) goto L_0x017e
            r0.close()
            goto L_0x017e
        L_0x0163:
            r1 = r0
        L_0x0164:
            android.content.Context r11 = f17042d     // Catch:{ all -> 0x018b }
            com.umeng.analytics.pro.UMDBUtils.m21932a(r11)     // Catch:{ all -> 0x018b }
            if (r0 == 0) goto L_0x016e
            r0.close()
        L_0x016e:
            if (r1 == 0) goto L_0x0181
            goto L_0x017e
        L_0x0171:
            r1 = r0
        L_0x0172:
            android.content.Context r11 = f17042d     // Catch:{ all -> 0x018b }
            com.umeng.analytics.pro.UMDBUtils.m21932a(r11)     // Catch:{ all -> 0x018b }
            if (r0 == 0) goto L_0x017c
            r0.close()
        L_0x017c:
            if (r1 == 0) goto L_0x0181
        L_0x017e:
            r1.endTransaction()     // Catch:{ all -> 0x0181 }
        L_0x0181:
            android.content.Context r11 = f17042d
            com.umeng.analytics.pro.f r11 = com.umeng.analytics.pro.UMDBManager.m21926a(r11)
            r11.mo19088b()
            return
        L_0x018b:
            r11 = move-exception
            if (r0 == 0) goto L_0x0191
            r0.close()
        L_0x0191:
            if (r1 == 0) goto L_0x0196
            r1.endTransaction()     // Catch:{ all -> 0x0196 }
        L_0x0196:
            android.content.Context r12 = f17042d
            com.umeng.analytics.pro.f r12 = com.umeng.analytics.pro.UMDBManager.m21926a(r12)
            r12.mo19088b()
            goto L_0x01a1
        L_0x01a0:
            throw r11
        L_0x01a1:
            goto L_0x01a0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.UMStoreManager.m21943a(org.json.JSONObject, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x021b, code lost:
        r16.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x021e, code lost:
        if (r12 != null) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x022b, code lost:
        r16.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x022e, code lost:
        if (r12 != null) goto L_0x0230;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:102:0x0214, B:109:0x0224] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:102:0x0214 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:109:0x0224 */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x022b  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:102:0x0214=Splitter:B:102:0x0214, B:109:0x0224=Splitter:B:109:0x0224} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m21940a(org.json.JSONObject r22, boolean r23) {
        /*
            r21 = this;
            r1 = r21
            r0 = 0
            android.content.Context r2 = f17042d     // Catch:{ SQLiteDatabaseCorruptException -> 0x0221, all -> 0x0211 }
            com.umeng.analytics.pro.f r2 = com.umeng.analytics.pro.UMDBManager.m21926a(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0221, all -> 0x0211 }
            android.database.sqlite.SQLiteDatabase r2 = r2.mo19087a()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0221, all -> 0x0211 }
            r2.beginTransaction()     // Catch:{ SQLiteDatabaseCorruptException -> 0x020d, all -> 0x0209 }
            java.lang.String r3 = "select *  from __sd"
            android.database.Cursor r3 = r2.rawQuery(r3, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x020d, all -> 0x0209 }
            if (r3 == 0) goto L_0x01fd
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ SQLiteDatabaseCorruptException -> 0x01f9, all -> 0x01f5 }
            r4.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x01f9, all -> 0x01f5 }
        L_0x001d:
            boolean r5 = r3.moveToNext()     // Catch:{ SQLiteDatabaseCorruptException -> 0x01f9, all -> 0x01f5 }
            if (r5 == 0) goto L_0x01cb
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ SQLiteDatabaseCorruptException -> 0x01f9, all -> 0x01f5 }
            r5.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x01f9, all -> 0x01f5 }
            java.lang.String r6 = "__f"
            int r6 = r3.getColumnIndex(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01f9, all -> 0x01f5 }
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01f9, all -> 0x01f5 }
            java.lang.String r7 = "__e"
            int r7 = r3.getColumnIndex(r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01f9, all -> 0x01f5 }
            java.lang.String r7 = r3.getString(r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01f9, all -> 0x01f5 }
            java.lang.String r8 = "__g"
            int r8 = r3.getColumnIndex(r8)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01f9, all -> 0x01f5 }
            java.lang.String r8 = r3.getString(r8)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01f9, all -> 0x01f5 }
            java.lang.String r9 = "__ii"
            int r9 = r3.getColumnIndex(r9)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01f9, all -> 0x01f5 }
            java.lang.String r0 = r3.getString(r9)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01f9, all -> 0x01f5 }
            boolean r9 = android.text.TextUtils.isEmpty(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01c8, all -> 0x01c5 }
            if (r9 != 0) goto L_0x01b9
            boolean r9 = android.text.TextUtils.isEmpty(r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01c8, all -> 0x01c5 }
            if (r9 != 0) goto L_0x01b9
            long r9 = java.lang.Long.parseLong(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01c8, all -> 0x01c5 }
            long r11 = java.lang.Long.parseLong(r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01c8, all -> 0x01c5 }
            long r9 = r9 - r11
            r11 = 0
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 <= 0) goto L_0x01af
            java.lang.String r9 = "__a"
            int r9 = r3.getColumnIndex(r9)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01c8, all -> 0x01c5 }
            java.lang.String r9 = r3.getString(r9)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01c8, all -> 0x01c5 }
            java.lang.String r10 = "__b"
            int r10 = r3.getColumnIndex(r10)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01c8, all -> 0x01c5 }
            java.lang.String r10 = r3.getString(r10)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01c8, all -> 0x01c5 }
            java.lang.String r13 = "__c"
            int r13 = r3.getColumnIndex(r13)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01c8, all -> 0x01c5 }
            java.lang.String r13 = r3.getString(r13)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01c8, all -> 0x01c5 }
            java.lang.String r14 = "__d"
            int r14 = r3.getColumnIndex(r14)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01c8, all -> 0x01c5 }
            java.lang.String r14 = r3.getString(r14)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01c8, all -> 0x01c5 }
            java.util.List<java.lang.String> r15 = r1.f17047i     // Catch:{ SQLiteDatabaseCorruptException -> 0x01c8, all -> 0x01c5 }
            r15.add(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01c8, all -> 0x01c5 }
            java.lang.String r15 = "__sp"
            int r15 = r3.getColumnIndex(r15)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01c8, all -> 0x01c5 }
            java.lang.String r15 = r3.getString(r15)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01c8, all -> 0x01c5 }
            java.lang.String r11 = "__pp"
            int r11 = r3.getColumnIndex(r11)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01c8, all -> 0x01c5 }
            java.lang.String r11 = r3.getString(r11)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01c8, all -> 0x01c5 }
            java.lang.String r12 = "id"
            r5.put(r12, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01c8, all -> 0x01c5 }
            java.lang.String r12 = "start_time"
            r5.put(r12, r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01c8, all -> 0x01c5 }
            java.lang.String r12 = "end_time"
            r5.put(r12, r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01c8, all -> 0x01c5 }
            java.lang.String r12 = "header_foreground_count"
            boolean r12 = com.umeng.commonsdk.config.FieldManager.allow(r12)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01c8, all -> 0x01c5 }
            r18 = r0
            java.lang.String r0 = "duration"
            if (r12 == 0) goto L_0x0109
            long r19 = java.lang.Long.parseLong(r8)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0102, all -> 0x00fb }
            r16 = 0
            int r12 = (r19 > r16 ? 1 : (r19 == r16 ? 0 : -1))
            if (r12 > 0) goto L_0x00e2
            long r16 = java.lang.Long.parseLong(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0102, all -> 0x00fb }
            long r6 = java.lang.Long.parseLong(r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0102, all -> 0x00fb }
            long r6 = r16 - r6
            r5.put(r0, r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0102, all -> 0x00fb }
            r12 = r2
            r16 = r3
            goto L_0x0118
        L_0x00e2:
            r12 = r2
            r16 = r3
            long r2 = java.lang.Long.parseLong(r8)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0105, all -> 0x00fe }
            r5.put(r0, r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0105, all -> 0x00fe }
            java.lang.String r0 = "duration_old"
            long r2 = java.lang.Long.parseLong(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0105, all -> 0x00fe }
            long r6 = java.lang.Long.parseLong(r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0105, all -> 0x00fe }
            long r2 = r2 - r6
            r5.put(r0, r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0105, all -> 0x00fe }
            goto L_0x0118
        L_0x00fb:
            r12 = r2
            r16 = r3
        L_0x00fe:
            r0 = r18
            goto L_0x0214
        L_0x0102:
            r12 = r2
            r16 = r3
        L_0x0105:
            r0 = r18
            goto L_0x0224
        L_0x0109:
            r12 = r2
            r16 = r3
            long r2 = java.lang.Long.parseLong(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0105, all -> 0x00fe }
            long r6 = java.lang.Long.parseLong(r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0105, all -> 0x00fe }
            long r2 = r2 - r6
            r5.put(r0, r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0105, all -> 0x00fe }
        L_0x0118:
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0105, all -> 0x00fe }
            if (r0 != 0) goto L_0x012c
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ SQLiteDatabaseCorruptException -> 0x0105, all -> 0x00fe }
            java.lang.String r2 = r1.mo19103d(r9)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0105, all -> 0x00fe }
            r0.<init>(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0105, all -> 0x00fe }
            java.lang.String r2 = "pages"
            r5.put(r2, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0105, all -> 0x00fe }
        L_0x012c:
            boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0105, all -> 0x00fe }
            if (r0 != 0) goto L_0x0155
            com.umeng.analytics.MobclickAgent$PageMode r0 = com.umeng.analytics.pro.AutoViewPageTracker.f17130b     // Catch:{ SQLiteDatabaseCorruptException -> 0x0105, all -> 0x00fe }
            com.umeng.analytics.MobclickAgent$PageMode r2 = com.umeng.analytics.MobclickAgent.PageMode.AUTO     // Catch:{ SQLiteDatabaseCorruptException -> 0x0105, all -> 0x00fe }
            if (r0 != r2) goto L_0x0155
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ SQLiteDatabaseCorruptException -> 0x0105, all -> 0x00fe }
            java.lang.String r2 = r1.mo19103d(r10)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0105, all -> 0x00fe }
            r0.<init>(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0105, all -> 0x00fe }
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ SQLiteDatabaseCorruptException -> 0x0105, all -> 0x00fe }
            r2.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0105, all -> 0x00fe }
            int r3 = r0.length()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0105, all -> 0x00fe }
            if (r3 <= 0) goto L_0x0150
            org.json.JSONArray r2 = r1.m21945b(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0105, all -> 0x00fe }
        L_0x0150:
            java.lang.String r0 = "autopages"
            r5.put(r0, r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0105, all -> 0x00fe }
        L_0x0155:
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0105, all -> 0x00fe }
            if (r0 != 0) goto L_0x0169
            java.lang.String r0 = "traffic"
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ SQLiteDatabaseCorruptException -> 0x0105, all -> 0x00fe }
            java.lang.String r3 = r1.mo19103d(r13)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0105, all -> 0x00fe }
            r2.<init>(r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0105, all -> 0x00fe }
            r5.put(r0, r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0105, all -> 0x00fe }
        L_0x0169:
            boolean r0 = android.text.TextUtils.isEmpty(r14)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0105, all -> 0x00fe }
            if (r0 != 0) goto L_0x017d
            java.lang.String r0 = "locations"
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ SQLiteDatabaseCorruptException -> 0x0105, all -> 0x00fe }
            java.lang.String r3 = r1.mo19103d(r14)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0105, all -> 0x00fe }
            r2.<init>(r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0105, all -> 0x00fe }
            r5.put(r0, r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0105, all -> 0x00fe }
        L_0x017d:
            boolean r0 = android.text.TextUtils.isEmpty(r15)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0105, all -> 0x00fe }
            if (r0 != 0) goto L_0x0191
            java.lang.String r0 = "_$sp"
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ SQLiteDatabaseCorruptException -> 0x0105, all -> 0x00fe }
            java.lang.String r3 = r1.mo19103d(r15)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0105, all -> 0x00fe }
            r2.<init>(r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0105, all -> 0x00fe }
            r5.put(r0, r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0105, all -> 0x00fe }
        L_0x0191:
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0105, all -> 0x00fe }
            if (r0 != 0) goto L_0x01a5
            java.lang.String r0 = "_$pp"
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ SQLiteDatabaseCorruptException -> 0x0105, all -> 0x00fe }
            java.lang.String r3 = r1.mo19103d(r11)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0105, all -> 0x00fe }
            r2.<init>(r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0105, all -> 0x00fe }
            r5.put(r0, r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0105, all -> 0x00fe }
        L_0x01a5:
            int r0 = r5.length()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0105, all -> 0x00fe }
            if (r0 <= 0) goto L_0x01b4
            r4.put(r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0105, all -> 0x00fe }
            goto L_0x01b4
        L_0x01af:
            r18 = r0
            r12 = r2
            r16 = r3
        L_0x01b4:
            if (r23 == 0) goto L_0x01be
            r0 = r18
            goto L_0x01ce
        L_0x01b9:
            r18 = r0
            r12 = r2
            r16 = r3
        L_0x01be:
            r2 = r12
            r3 = r16
            r0 = r18
            goto L_0x001d
        L_0x01c5:
            r18 = r0
            goto L_0x01f5
        L_0x01c8:
            r18 = r0
            goto L_0x01f9
        L_0x01cb:
            r12 = r2
            r16 = r3
        L_0x01ce:
            java.util.List<java.lang.String> r2 = r1.f17047i     // Catch:{ SQLiteDatabaseCorruptException -> 0x0224, all -> 0x0214 }
            int r2 = r2.size()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0224, all -> 0x0214 }
            r3 = 1
            if (r2 >= r3) goto L_0x01e7
            r16.close()
            r12.endTransaction()     // Catch:{ all -> 0x01dd }
        L_0x01dd:
            android.content.Context r2 = f17042d
            com.umeng.analytics.pro.f r2 = com.umeng.analytics.pro.UMDBManager.m21926a(r2)
            r2.mo19088b()
            return r0
        L_0x01e7:
            int r2 = r4.length()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0224, all -> 0x0214 }
            if (r2 <= 0) goto L_0x0200
            java.lang.String r2 = "sessions"
            r3 = r22
            r3.put(r2, r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0224, all -> 0x0214 }
            goto L_0x0200
        L_0x01f5:
            r12 = r2
            r16 = r3
            goto L_0x0214
        L_0x01f9:
            r12 = r2
            r16 = r3
            goto L_0x0224
        L_0x01fd:
            r12 = r2
            r16 = r3
        L_0x0200:
            r12.setTransactionSuccessful()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0224, all -> 0x0214 }
            if (r16 == 0) goto L_0x0230
            r16.close()
            goto L_0x0230
        L_0x0209:
            r12 = r2
            r16 = r0
            goto L_0x0214
        L_0x020d:
            r12 = r2
            r16 = r0
            goto L_0x0224
        L_0x0211:
            r12 = r0
            r16 = r12
        L_0x0214:
            android.content.Context r2 = f17042d     // Catch:{ all -> 0x023d }
            com.umeng.analytics.pro.UMDBUtils.m21932a(r2)     // Catch:{ all -> 0x023d }
            if (r16 == 0) goto L_0x021e
            r16.close()
        L_0x021e:
            if (r12 == 0) goto L_0x0233
            goto L_0x0230
        L_0x0221:
            r12 = r0
            r16 = r12
        L_0x0224:
            android.content.Context r2 = f17042d     // Catch:{ all -> 0x023d }
            com.umeng.analytics.pro.UMDBUtils.m21932a(r2)     // Catch:{ all -> 0x023d }
            if (r16 == 0) goto L_0x022e
            r16.close()
        L_0x022e:
            if (r12 == 0) goto L_0x0233
        L_0x0230:
            r12.endTransaction()     // Catch:{ all -> 0x0233 }
        L_0x0233:
            android.content.Context r2 = f17042d
            com.umeng.analytics.pro.f r2 = com.umeng.analytics.pro.UMDBManager.m21926a(r2)
            r2.mo19088b()
            return r0
        L_0x023d:
            r0 = move-exception
            if (r16 == 0) goto L_0x0243
            r16.close()
        L_0x0243:
            if (r12 == 0) goto L_0x0248
            r12.endTransaction()     // Catch:{ all -> 0x0248 }
        L_0x0248:
            android.content.Context r2 = f17042d
            com.umeng.analytics.pro.f r2 = com.umeng.analytics.pro.UMDBManager.m21926a(r2)
            r2.mo19088b()
            goto L_0x0253
        L_0x0252:
            throw r0
        L_0x0253:
            goto L_0x0252
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.UMStoreManager.m21940a(org.json.JSONObject, boolean):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0064, code lost:
        if (r0 == null) goto L_0x0069;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0057 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19094a(boolean r6, boolean r7) {
        /*
            r5 = this;
            r0 = 0
            android.content.Context r1 = f17042d     // Catch:{ SQLiteDatabaseCorruptException -> 0x005f, all -> 0x0057 }
            com.umeng.analytics.pro.f r1 = com.umeng.analytics.pro.UMDBManager.m21926a(r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x005f, all -> 0x0057 }
            android.database.sqlite.SQLiteDatabase r0 = r1.mo19087a()     // Catch:{ SQLiteDatabaseCorruptException -> 0x005f, all -> 0x0057 }
            r0.beginTransaction()     // Catch:{ SQLiteDatabaseCorruptException -> 0x005f, all -> 0x0057 }
            if (r7 == 0) goto L_0x0018
            if (r6 == 0) goto L_0x0053
            java.lang.String r6 = "delete from __is"
            r0.execSQL(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x005f, all -> 0x0057 }
            goto L_0x0053
        L_0x0018:
            java.util.List<java.lang.String> r6 = r5.f17050l     // Catch:{ SQLiteDatabaseCorruptException -> 0x005f, all -> 0x0057 }
            int r6 = r6.size()     // Catch:{ SQLiteDatabaseCorruptException -> 0x005f, all -> 0x0057 }
            r7 = 0
            if (r6 <= 0) goto L_0x004c
            r1 = 0
        L_0x0022:
            if (r7 >= r6) goto L_0x004b
            java.util.List<java.lang.String> r2 = r5.f17050l     // Catch:{ SQLiteDatabaseCorruptException -> 0x005f, all -> 0x0057 }
            java.lang.Object r2 = r2.get(r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x005f, all -> 0x0057 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ SQLiteDatabaseCorruptException -> 0x005f, all -> 0x0057 }
            if (r2 != 0) goto L_0x002f
            r1 = 1
        L_0x002f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SQLiteDatabaseCorruptException -> 0x005f, all -> 0x0057 }
            r3.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x005f, all -> 0x0057 }
            java.lang.String r4 = "delete from __is where __ii=\""
            r3.append(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x005f, all -> 0x0057 }
            r3.append(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x005f, all -> 0x0057 }
            java.lang.String r2 = "\""
            r3.append(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x005f, all -> 0x0057 }
            java.lang.String r2 = r3.toString()     // Catch:{ SQLiteDatabaseCorruptException -> 0x005f, all -> 0x0057 }
            r0.execSQL(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x005f, all -> 0x0057 }
            int r7 = r7 + 1
            goto L_0x0022
        L_0x004b:
            r7 = r1
        L_0x004c:
            if (r7 == 0) goto L_0x0053
            java.lang.String r6 = "delete from __is where __ii is null"
            r0.execSQL(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x005f, all -> 0x0057 }
        L_0x0053:
            r0.setTransactionSuccessful()     // Catch:{ SQLiteDatabaseCorruptException -> 0x005f, all -> 0x0057 }
            goto L_0x0066
        L_0x0057:
            android.content.Context r6 = f17042d     // Catch:{ all -> 0x0073 }
            com.umeng.analytics.pro.UMDBUtils.m21932a(r6)     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x0069
            goto L_0x0066
        L_0x005f:
            android.content.Context r6 = f17042d     // Catch:{ all -> 0x0073 }
            com.umeng.analytics.pro.UMDBUtils.m21932a(r6)     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x0069
        L_0x0066:
            r0.endTransaction()     // Catch:{ all -> 0x0069 }
        L_0x0069:
            android.content.Context r6 = f17042d
            com.umeng.analytics.pro.f r6 = com.umeng.analytics.pro.UMDBManager.m21926a(r6)
            r6.mo19088b()
            return
        L_0x0073:
            r6 = move-exception
            if (r0 == 0) goto L_0x0079
            r0.endTransaction()     // Catch:{ all -> 0x0079 }
        L_0x0079:
            android.content.Context r7 = f17042d
            com.umeng.analytics.pro.f r7 = com.umeng.analytics.pro.UMDBManager.m21926a(r7)
            r7.mo19088b()
            goto L_0x0084
        L_0x0083:
            throw r6
        L_0x0084:
            goto L_0x0083
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.UMStoreManager.mo19094a(boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0078, code lost:
        if (r0 == null) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0064, code lost:
        if (r0 == null) goto L_0x0069;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0073 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19093a(boolean r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.String r4 = "\""
            r0 = 0
            android.content.Context r1 = f17042d     // Catch:{ SQLiteDatabaseCorruptException -> 0x0073, all -> 0x0064 }
            com.umeng.analytics.pro.f r1 = com.umeng.analytics.pro.UMDBManager.m21926a(r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0073, all -> 0x0064 }
            android.database.sqlite.SQLiteDatabase r0 = r1.mo19087a()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0073, all -> 0x0064 }
            r0.beginTransaction()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0073, all -> 0x0064 }
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0073, all -> 0x0064 }
            if (r1 != 0) goto L_0x0060
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SQLiteDatabaseCorruptException -> 0x0073, all -> 0x0064 }
            r1.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0073, all -> 0x0064 }
            java.lang.String r2 = "delete from __er where __i=\""
            r1.append(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0073, all -> 0x0064 }
            r1.append(r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0073, all -> 0x0064 }
            r1.append(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0073, all -> 0x0064 }
            java.lang.String r1 = r1.toString()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0073, all -> 0x0064 }
            r0.execSQL(r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0073, all -> 0x0064 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SQLiteDatabaseCorruptException -> 0x0073, all -> 0x0064 }
            r1.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0073, all -> 0x0064 }
            java.lang.String r2 = "delete from __et where __i=\""
            r1.append(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0073, all -> 0x0064 }
            r1.append(r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0073, all -> 0x0064 }
            r1.append(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0073, all -> 0x0064 }
            java.lang.String r1 = r1.toString()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0073, all -> 0x0064 }
            r0.execSQL(r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0073, all -> 0x0064 }
            java.util.List<java.lang.Integer> r1 = r3.f17048j     // Catch:{ SQLiteDatabaseCorruptException -> 0x0073, all -> 0x0064 }
            r1.clear()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0073, all -> 0x0064 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SQLiteDatabaseCorruptException -> 0x0073, all -> 0x0064 }
            r1.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0073, all -> 0x0064 }
            java.lang.String r2 = "delete from __sd where __ii=\""
            r1.append(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0073, all -> 0x0064 }
            r1.append(r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0073, all -> 0x0064 }
            r1.append(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0073, all -> 0x0064 }
            java.lang.String r4 = r1.toString()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0073, all -> 0x0064 }
            r0.execSQL(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0073, all -> 0x0064 }
        L_0x0060:
            r0.setTransactionSuccessful()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0073, all -> 0x0064 }
            goto L_0x0066
        L_0x0064:
            if (r0 == 0) goto L_0x0069
        L_0x0066:
            r0.endTransaction()     // Catch:{ all -> 0x0069 }
        L_0x0069:
            android.content.Context r4 = f17042d
            com.umeng.analytics.pro.f r4 = com.umeng.analytics.pro.UMDBManager.m21926a(r4)
            r4.mo19088b()
            goto L_0x007b
        L_0x0073:
            android.content.Context r4 = f17042d     // Catch:{ all -> 0x007c }
            com.umeng.analytics.pro.UMDBUtils.m21932a(r4)     // Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x0069
            goto L_0x0066
        L_0x007b:
            return
        L_0x007c:
            r4 = move-exception
            if (r0 == 0) goto L_0x0082
            r0.endTransaction()     // Catch:{ all -> 0x0082 }
        L_0x0082:
            android.content.Context r5 = f17042d
            com.umeng.analytics.pro.f r5 = com.umeng.analytics.pro.UMDBManager.m21926a(r5)
            r5.mo19088b()
            goto L_0x008d
        L_0x008c:
            throw r4
        L_0x008d:
            goto L_0x008c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.UMStoreManager.mo19093a(boolean, java.lang.String):void");
    }
}
