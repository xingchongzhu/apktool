package com.umeng.analytics.process;

import android.content.ComponentName;
import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.process.DBFileTraversalUtil.C3161a;
import com.umeng.common.EncryptHelper;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.utils.FileLockCallback;
import com.umeng.commonsdk.utils.FileLockUtil;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class UMProcessDBHelper {
    private static UMProcessDBHelper mInstance;
    private InsertEventCallback ekvCallBack = new InsertEventCallback();
    /* access modifiers changed from: private */
    public Context mContext;
    private FileLockUtil mFileLock = new FileLockUtil();

    private class InsertEventCallback implements FileLockCallback {
        private InsertEventCallback() {
        }

        public boolean onFileLock(File file, int i) {
            return false;
        }

        public boolean onFileLock(String str) {
            return false;
        }

        public boolean onFileLock(String str, Object obj) {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            String str2 = DBConstant.f17289c;
            String str3 = "";
            if (str.startsWith(str2)) {
                str = str.replaceFirst(str2, str3);
            }
            UMProcessDBHelper.this.insertEvents(str.replace(DBConstant.f17290d, str3), (JSONArray) obj);
            return true;
        }
    }

    private class ProcessToMainCallback implements FileLockCallback {
        private ProcessToMainCallback() {
        }

        public boolean onFileLock(File file, int i) {
            return false;
        }

        public boolean onFileLock(String str) {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            String str2 = DBConstant.f17289c;
            String str3 = "";
            if (str.startsWith(str2)) {
                str = str.replaceFirst(str2, str3);
            }
            UMProcessDBHelper.this.processToMain(str.replace(DBConstant.f17290d, str3));
            return true;
        }

        public boolean onFileLock(String str, Object obj) {
            return false;
        }
    }

    /* renamed from: com.umeng.analytics.process.UMProcessDBHelper$a */
    private class C3164a implements Serializable {

        /* renamed from: a */
        int f17278a;

        /* renamed from: b */
        String f17279b;

        /* renamed from: c */
        String f17280c;

        /* renamed from: d */
        String f17281d;

        /* renamed from: e */
        int f17282e;

        /* renamed from: f */
        String f17283f;

        /* renamed from: g */
        String f17284g;

        /* renamed from: h */
        String f17285h;

        private C3164a() {
        }
    }

    private UMProcessDBHelper() {
    }

    private List<C3164a> datasAdapter(String str, JSONArray jSONArray) {
        String str2 = "__t";
        String str3 = "__i";
        String str4 = "ds";
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                C3164a aVar = new C3164a();
                aVar.f17280c = jSONObject.optString("id");
                aVar.f17284g = UMUtils.getAppVersionName(this.mContext);
                aVar.f17285h = UMUtils.getAppVersionCode(this.mContext);
                aVar.f17279b = jSONObject.optString(str3);
                aVar.f17282e = jSONObject.optInt(str2);
                aVar.f17283f = str;
                if (jSONObject.has(str4)) {
                    jSONObject.remove(str4);
                }
                jSONObject.put(str4, getDataSource());
                jSONObject.remove(str3);
                jSONObject.remove(str2);
                aVar.f17281d = EncryptHelper.m22170a().mo19222a(jSONObject.toString());
                jSONObject.remove(str4);
                arrayList.add(aVar);
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    private boolean dbIsExists(String str) {
        try {
            if (new File(UMProcessDBCreater.m22161b(this.mContext, str)).exists()) {
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private int getDataSource() {
        return 0;
    }

    public static UMProcessDBHelper getInstance(Context context) {
        if (mInstance == null) {
            synchronized (UMProcessDBHelper.class) {
                if (mInstance == null) {
                    mInstance = new UMProcessDBHelper(context);
                }
            }
        }
        UMProcessDBHelper uMProcessDBHelper = mInstance;
        uMProcessDBHelper.mContext = context;
        return uMProcessDBHelper;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007f, code lost:
        r9 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0080, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0082, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r0.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r0.endTransaction();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007f A[ExcHandler: all (th java.lang.Throwable), Splitter:B:8:0x001c] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0087 A[SYNTHETIC, Splitter:B:29:0x0087] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0097 A[SYNTHETIC, Splitter:B:37:0x0097] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean insertEvents_(java.lang.String r8, java.util.List<com.umeng.analytics.process.UMProcessDBHelper.C3164a> r9) {
        /*
            r7 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r1 = 1
            if (r0 != 0) goto L_0x00a4
            if (r9 == 0) goto L_0x00a4
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x0011
            goto L_0x00a4
        L_0x0011:
            r0 = 0
            android.content.Context r2 = r7.mContext     // Catch:{ Exception -> 0x0094, all -> 0x0084 }
            com.umeng.analytics.process.c r2 = com.umeng.analytics.process.UMProcessDBManager.m22162a(r2)     // Catch:{ Exception -> 0x0094, all -> 0x0084 }
            android.database.sqlite.SQLiteDatabase r2 = r2.mo19211a(r8)     // Catch:{ Exception -> 0x0094, all -> 0x0084 }
            r2.beginTransaction()     // Catch:{ Exception -> 0x0082, all -> 0x007f }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ Exception -> 0x0082, all -> 0x007f }
        L_0x0023:
            boolean r3 = r9.hasNext()     // Catch:{ Exception -> 0x0082, all -> 0x007f }
            if (r3 == 0) goto L_0x006f
            java.lang.Object r3 = r9.next()     // Catch:{ Exception -> 0x0082, all -> 0x007f }
            com.umeng.analytics.process.UMProcessDBHelper$a r3 = (com.umeng.analytics.process.UMProcessDBHelper.C3164a) r3     // Catch:{ Exception -> 0x0082, all -> 0x007f }
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ Exception -> 0x0023, all -> 0x007f }
            r4.<init>()     // Catch:{ Exception -> 0x0023, all -> 0x007f }
            java.lang.String r5 = "__i"
            java.lang.String r6 = r3.f17279b     // Catch:{ Exception -> 0x0023, all -> 0x007f }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0023, all -> 0x007f }
            java.lang.String r5 = "__e"
            java.lang.String r6 = r3.f17280c     // Catch:{ Exception -> 0x0023, all -> 0x007f }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0023, all -> 0x007f }
            java.lang.String r5 = "__t"
            int r6 = r3.f17282e     // Catch:{ Exception -> 0x0023, all -> 0x007f }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0023, all -> 0x007f }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0023, all -> 0x007f }
            java.lang.String r5 = "__pn"
            java.lang.String r6 = r3.f17283f     // Catch:{ Exception -> 0x0023, all -> 0x007f }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0023, all -> 0x007f }
            java.lang.String r5 = "__av"
            java.lang.String r6 = r3.f17284g     // Catch:{ Exception -> 0x0023, all -> 0x007f }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0023, all -> 0x007f }
            java.lang.String r5 = "__vc"
            java.lang.String r6 = r3.f17285h     // Catch:{ Exception -> 0x0023, all -> 0x007f }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0023, all -> 0x007f }
            java.lang.String r5 = "__s"
            java.lang.String r3 = r3.f17281d     // Catch:{ Exception -> 0x0023, all -> 0x007f }
            r4.put(r5, r3)     // Catch:{ Exception -> 0x0023, all -> 0x007f }
            java.lang.String r3 = "__et_p"
            r2.insert(r3, r0, r4)     // Catch:{ Exception -> 0x0023, all -> 0x007f }
            goto L_0x0023
        L_0x006f:
            r2.setTransactionSuccessful()     // Catch:{ Exception -> 0x0082, all -> 0x007f }
            r2.endTransaction()     // Catch:{ all -> 0x0075 }
        L_0x0075:
            android.content.Context r9 = r7.mContext
            com.umeng.analytics.process.c r9 = com.umeng.analytics.process.UMProcessDBManager.m22162a(r9)
            r9.mo19212b(r8)
            return r1
        L_0x007f:
            r9 = move-exception
            r0 = r2
            goto L_0x0085
        L_0x0082:
            r0 = r2
            goto L_0x0094
        L_0x0084:
            r9 = move-exception
        L_0x0085:
            if (r0 == 0) goto L_0x008a
            r0.endTransaction()     // Catch:{ all -> 0x008a }
        L_0x008a:
            android.content.Context r0 = r7.mContext
            com.umeng.analytics.process.c r0 = com.umeng.analytics.process.UMProcessDBManager.m22162a(r0)
            r0.mo19212b(r8)
            throw r9
        L_0x0094:
            r9 = 0
            if (r0 == 0) goto L_0x009a
            r0.endTransaction()     // Catch:{ all -> 0x009a }
        L_0x009a:
            android.content.Context r0 = r7.mContext
            com.umeng.analytics.process.c r0 = com.umeng.analytics.process.UMProcessDBManager.m22162a(r0)
            r0.mo19212b(r8)
            return r9
        L_0x00a4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.process.UMProcessDBHelper.insertEvents_(java.lang.String, java.util.List):boolean");
    }

    private boolean processIsService(Context context) {
        try {
            if (context.getPackageManager().getServiceInfo(new ComponentName(context, this.mContext.getClass()), 0) != null) {
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* access modifiers changed from: private */
    public void processToMain(String str) {
        if (dbIsExists(str)) {
            List readEventByProcess = readEventByProcess(str);
            if (!readEventByProcess.isEmpty() && insertEvents_(DBConstant.f17294h, readEventByProcess)) {
                deleteEventDatas(str, null, readEventByProcess);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a3, code lost:
        if (r3 != null) goto L_0x00a5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a0 A[SYNTHETIC, Splitter:B:24:0x00a0] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b6 A[SYNTHETIC, Splitter:B:34:0x00b6] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bb A[Catch:{ Exception -> 0x00be }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List<com.umeng.analytics.process.UMProcessDBHelper.C3164a> readEventByProcess(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "select *  from __et_p"
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            android.content.Context r3 = r7.mContext     // Catch:{ Exception -> 0x0097, all -> 0x0094 }
            com.umeng.analytics.process.c r3 = com.umeng.analytics.process.UMProcessDBManager.m22162a(r3)     // Catch:{ Exception -> 0x0097, all -> 0x0094 }
            android.database.sqlite.SQLiteDatabase r3 = r3.mo19211a(r8)     // Catch:{ Exception -> 0x0097, all -> 0x0094 }
            r3.beginTransaction()     // Catch:{ Exception -> 0x008f, all -> 0x008d }
            android.database.Cursor r0 = r3.rawQuery(r0, r2)     // Catch:{ Exception -> 0x008f, all -> 0x008d }
            if (r0 == 0) goto L_0x0087
        L_0x001b:
            boolean r4 = r0.moveToNext()     // Catch:{ Exception -> 0x0085 }
            if (r4 == 0) goto L_0x0087
            com.umeng.analytics.process.UMProcessDBHelper$a r4 = new com.umeng.analytics.process.UMProcessDBHelper$a     // Catch:{ Exception -> 0x0085 }
            r4.<init>()     // Catch:{ Exception -> 0x0085 }
            r5 = 0
            int r5 = r0.getInt(r5)     // Catch:{ Exception -> 0x0085 }
            r4.f17278a = r5     // Catch:{ Exception -> 0x0085 }
            java.lang.String r5 = "__i"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r5 = r0.getString(r5)     // Catch:{ Exception -> 0x0085 }
            r4.f17279b = r5     // Catch:{ Exception -> 0x0085 }
            java.lang.String r5 = "__e"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r5 = r0.getString(r5)     // Catch:{ Exception -> 0x0085 }
            r4.f17280c = r5     // Catch:{ Exception -> 0x0085 }
            java.lang.String r5 = "__s"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r5 = r0.getString(r5)     // Catch:{ Exception -> 0x0085 }
            r4.f17281d = r5     // Catch:{ Exception -> 0x0085 }
            java.lang.String r5 = "__t"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ Exception -> 0x0085 }
            int r5 = r0.getInt(r5)     // Catch:{ Exception -> 0x0085 }
            r4.f17282e = r5     // Catch:{ Exception -> 0x0085 }
            java.lang.String r5 = "__pn"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r5 = r0.getString(r5)     // Catch:{ Exception -> 0x0085 }
            r4.f17283f = r5     // Catch:{ Exception -> 0x0085 }
            java.lang.String r5 = "__av"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r5 = r0.getString(r5)     // Catch:{ Exception -> 0x0085 }
            r4.f17284g = r5     // Catch:{ Exception -> 0x0085 }
            java.lang.String r5 = "__vc"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r5 = r0.getString(r5)     // Catch:{ Exception -> 0x0085 }
            r4.f17285h = r5     // Catch:{ Exception -> 0x0085 }
            r1.add(r4)     // Catch:{ Exception -> 0x0085 }
            goto L_0x001b
        L_0x0085:
            r2 = move-exception
            goto L_0x009b
        L_0x0087:
            if (r0 == 0) goto L_0x00a5
            r0.close()     // Catch:{ Exception -> 0x00a8 }
            goto L_0x00a5
        L_0x008d:
            r1 = move-exception
            goto L_0x00b4
        L_0x008f:
            r0 = move-exception
            r6 = r2
            r2 = r0
            r0 = r6
            goto L_0x009b
        L_0x0094:
            r1 = move-exception
            r3 = r2
            goto L_0x00b4
        L_0x0097:
            r0 = move-exception
            r3 = r2
            r2 = r0
            r0 = r3
        L_0x009b:
            r2.printStackTrace()     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x00a3
            r0.close()     // Catch:{ Exception -> 0x00a8 }
        L_0x00a3:
            if (r3 == 0) goto L_0x00a8
        L_0x00a5:
            r3.endTransaction()     // Catch:{ Exception -> 0x00a8 }
        L_0x00a8:
            android.content.Context r0 = r7.mContext
            com.umeng.analytics.process.c r0 = com.umeng.analytics.process.UMProcessDBManager.m22162a(r0)
            r0.mo19212b(r8)
            return r1
        L_0x00b2:
            r1 = move-exception
            r2 = r0
        L_0x00b4:
            if (r2 == 0) goto L_0x00b9
            r2.close()     // Catch:{ Exception -> 0x00be }
        L_0x00b9:
            if (r3 == 0) goto L_0x00be
            r3.endTransaction()     // Catch:{ Exception -> 0x00be }
        L_0x00be:
            android.content.Context r0 = r7.mContext
            com.umeng.analytics.process.c r0 = com.umeng.analytics.process.UMProcessDBManager.m22162a(r0)
            r0.mo19212b(r8)
            goto L_0x00c9
        L_0x00c8:
            throw r1
        L_0x00c9:
            goto L_0x00c8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.process.UMProcessDBHelper.readEventByProcess(java.lang.String):java.util.List");
    }

    public void createDBByProcess(String str) {
        try {
            UMProcessDBManager.m22162a(this.mContext).mo19211a(str);
            UMProcessDBManager.m22162a(this.mContext).mo19212b(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void deleteEventDatas(java.lang.String r5, java.lang.String r6, java.util.List<com.umeng.analytics.process.UMProcessDBHelper.C3164a> r7) {
        /*
            r4 = this;
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 == 0) goto L_0x0007
            return
        L_0x0007:
            r6 = 0
            android.content.Context r0 = r4.mContext     // Catch:{ Exception -> 0x005f, all -> 0x004d }
            com.umeng.analytics.process.c r0 = com.umeng.analytics.process.UMProcessDBManager.m22162a(r0)     // Catch:{ Exception -> 0x005f, all -> 0x004d }
            android.database.sqlite.SQLiteDatabase r0 = r0.mo19211a(r5)     // Catch:{ Exception -> 0x005f, all -> 0x004d }
            r0.beginTransaction()     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            int r1 = r7.size()     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            if (r1 <= 0) goto L_0x003d
            r6 = 0
        L_0x001c:
            if (r6 >= r1) goto L_0x0042
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            r2.<init>()     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            java.lang.String r3 = "delete from __et_p where rowid="
            r2.append(r3)     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            java.lang.Object r3 = r7.get(r6)     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            com.umeng.analytics.process.UMProcessDBHelper$a r3 = (com.umeng.analytics.process.UMProcessDBHelper.C3164a) r3     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            int r3 = r3.f17278a     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            r2.append(r3)     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            r0.execSQL(r2)     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            int r6 = r6 + 1
            goto L_0x001c
        L_0x003d:
            java.lang.String r7 = "__et_p"
            r0.delete(r7, r6, r6)     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
        L_0x0042:
            r0.setTransactionSuccessful()     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            r0.endTransaction()
            goto L_0x0065
        L_0x0049:
            r6 = move-exception
            goto L_0x0050
        L_0x004b:
            r6 = r0
            goto L_0x0060
        L_0x004d:
            r7 = move-exception
            r0 = r6
            r6 = r7
        L_0x0050:
            if (r0 == 0) goto L_0x0055
            r0.endTransaction()
        L_0x0055:
            android.content.Context r7 = r4.mContext
            com.umeng.analytics.process.c r7 = com.umeng.analytics.process.UMProcessDBManager.m22162a(r7)
            r7.mo19212b(r5)
            throw r6
        L_0x005f:
        L_0x0060:
            if (r6 == 0) goto L_0x0065
            r6.endTransaction()
        L_0x0065:
            android.content.Context r6 = r4.mContext
            com.umeng.analytics.process.c r6 = com.umeng.analytics.process.UMProcessDBManager.m22162a(r6)
            r6.mo19212b(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.process.UMProcessDBHelper.deleteEventDatas(java.lang.String, java.lang.String, java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
        if (r1 == null) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void deleteMainProcessEventDatasByIds(java.util.List<java.lang.Integer> r8) {
        /*
            r7 = this;
            java.lang.String r0 = "_main_"
            r1 = 0
            android.content.Context r2 = r7.mContext     // Catch:{ Exception -> 0x0046, all -> 0x0036 }
            com.umeng.analytics.process.c r2 = com.umeng.analytics.process.UMProcessDBManager.m22162a(r2)     // Catch:{ Exception -> 0x0046, all -> 0x0036 }
            android.database.sqlite.SQLiteDatabase r1 = r2.mo19211a(r0)     // Catch:{ Exception -> 0x0046, all -> 0x0036 }
            r1.beginTransaction()     // Catch:{ Exception -> 0x0046, all -> 0x0036 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ Exception -> 0x0046, all -> 0x0036 }
        L_0x0014:
            boolean r2 = r8.hasNext()     // Catch:{ Exception -> 0x0046, all -> 0x0036 }
            if (r2 == 0) goto L_0x0032
            java.lang.Object r2 = r8.next()     // Catch:{ Exception -> 0x0046, all -> 0x0036 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Exception -> 0x0046, all -> 0x0036 }
            java.lang.String r3 = "__et_p"
            java.lang.String r4 = "id=?"
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ Exception -> 0x0046, all -> 0x0036 }
            r6 = 0
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x0046, all -> 0x0036 }
            r5[r6] = r2     // Catch:{ Exception -> 0x0046, all -> 0x0036 }
            r1.delete(r3, r4, r5)     // Catch:{ Exception -> 0x0046, all -> 0x0036 }
            goto L_0x0014
        L_0x0032:
            r1.setTransactionSuccessful()     // Catch:{ Exception -> 0x0046, all -> 0x0036 }
            goto L_0x0049
        L_0x0036:
            r8 = move-exception
            if (r1 == 0) goto L_0x003c
            r1.endTransaction()
        L_0x003c:
            android.content.Context r1 = r7.mContext
            com.umeng.analytics.process.c r1 = com.umeng.analytics.process.UMProcessDBManager.m22162a(r1)
            r1.mo19212b(r0)
            throw r8
        L_0x0046:
            if (r1 == 0) goto L_0x004c
        L_0x0049:
            r1.endTransaction()
        L_0x004c:
            android.content.Context r8 = r7.mContext
            com.umeng.analytics.process.c r8 = com.umeng.analytics.process.UMProcessDBManager.m22162a(r8)
            r8.mo19212b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.process.UMProcessDBHelper.deleteMainProcessEventDatasByIds(java.util.List):void");
    }

    public void insertEvents(String str, JSONArray jSONArray) {
        if (AnalyticsConstants.SUB_PROCESS_EVENT && !TextUtils.isEmpty(str)) {
            insertEvents_(str, datasAdapter(str, jSONArray));
        }
    }

    public void insertEventsInSubProcess(String str, JSONArray jSONArray) {
        if (AnalyticsConstants.SUB_PROCESS_EVENT && !TextUtils.isEmpty(str)) {
            File file = new File(UMProcessDBCreater.m22161b(this.mContext, str));
            if (file.exists()) {
                this.mFileLock.doFileOperateion(file, (FileLockCallback) this.ekvCallBack, (Object) jSONArray);
            } else {
                insertEvents(str, jSONArray);
            }
        }
    }

    public void processDBToMain() {
        try {
            DBFileTraversalUtil.traverseDBFiles(UMProcessDBCreater.m22159a(this.mContext), new ProcessToMainCallback(), new C3161a() {
                /* renamed from: a */
                public void mo19199a() {
                    if (AnalyticsConstants.SUB_PROCESS_EVENT) {
                        UMWorkDispatch.sendEvent(UMProcessDBHelper.this.mContext, UMProcessDBDatasSender.UM_PROCESS_CONSTRUCTMESSAGE, UMProcessDBDatasSender.getInstance(UMProcessDBHelper.this.mContext), null);
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r5v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARNING: type inference failed for: r4v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r4v2, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARNING: type inference failed for: r18v0 */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v7, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r18v1 */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v7, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: type inference failed for: r4v14 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v6
  assigns: []
  uses: []
  mth insns count: 148
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
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0180 A[SYNTHETIC, Splitter:B:76:0x0180] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:52:0x0142=Splitter:B:52:0x0142, B:66:0x0166=Splitter:B:66:0x0166} */
    /* JADX WARNING: Unknown variable types count: 11 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject readMainEvents(long r20, java.util.List<java.lang.Integer> r22) {
        /*
            r19 = this;
            r1 = r19
            java.lang.String r0 = "pn"
            java.lang.String r2 = "_main_"
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            r4 = 0
            android.content.Context r5 = r1.mContext     // Catch:{ Exception -> 0x0151, all -> 0x014e }
            com.umeng.analytics.process.c r5 = com.umeng.analytics.process.UMProcessDBManager.m22162a(r5)     // Catch:{ Exception -> 0x0151, all -> 0x014e }
            android.database.sqlite.SQLiteDatabase r5 = r5.mo19211a(r2)     // Catch:{ Exception -> 0x0151, all -> 0x014e }
            r5.beginTransaction()     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            java.lang.String r6 = "select *  from __et_p"
            android.database.Cursor r4 = r5.rawQuery(r6, r4)     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            if (r4 == 0) goto L_0x013a
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            r6.<init>()     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            java.lang.String r7 = ""
        L_0x0028:
            boolean r8 = r4.moveToNext()     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            if (r8 == 0) goto L_0x00f9
            java.lang.String r8 = "id"
            int r8 = r4.getColumnIndex(r8)     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            int r8 = r4.getInt(r8)     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            java.lang.String r9 = "__t"
            int r9 = r4.getColumnIndex(r9)     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            int r9 = r4.getInt(r9)     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            java.lang.String r10 = "__i"
            int r10 = r4.getColumnIndex(r10)     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            java.lang.String r10 = r4.getString(r10)     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            java.lang.String r11 = "__s"
            int r11 = r4.getColumnIndex(r11)     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            java.lang.String r11 = r4.getString(r11)     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            java.lang.String r12 = "__pn"
            int r12 = r4.getColumnIndex(r12)     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            java.lang.String r12 = r4.getString(r12)     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            java.lang.String r13 = "__av"
            int r13 = r4.getColumnIndex(r13)     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            java.lang.String r13 = r4.getString(r13)     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            boolean r14 = android.text.TextUtils.isEmpty(r10)     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            if (r14 == 0) goto L_0x0071
            goto L_0x0028
        L_0x0071:
            boolean r14 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            if (r14 == 0) goto L_0x0078
            r7 = r13
        L_0x0078:
            boolean r14 = android.text.TextUtils.isEmpty(r11)     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            if (r14 != 0) goto L_0x00f5
            r14 = 2049(0x801, float:2.871E-42)
            if (r9 != r14) goto L_0x00f5
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            com.umeng.common.a r14 = com.umeng.common.EncryptHelper.m22170a()     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            java.lang.String r11 = r14.mo19224b(r11)     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            r9.<init>(r11)     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            java.lang.String r11 = r9.optString(r0)     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            boolean r14 = android.text.TextUtils.isEmpty(r11)     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            if (r14 != 0) goto L_0x00a1
            java.lang.String r14 = "unknown"
            boolean r11 = r14.equals(r11)     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            if (r11 == 0) goto L_0x00be
        L_0x00a1:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            r11.<init>()     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            android.content.Context r14 = r1.mContext     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            java.lang.String r14 = r14.getPackageName()     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            r11.append(r14)     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            java.lang.String r14 = ":"
            r11.append(r14)     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            r11.append(r12)     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            r9.put(r0, r11)     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
        L_0x00be:
            boolean r11 = r6.has(r10)     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            if (r11 == 0) goto L_0x00c9
            org.json.JSONArray r11 = r6.optJSONArray(r10)     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            goto L_0x00ce
        L_0x00c9:
            org.json.JSONArray r11 = new org.json.JSONArray     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            r11.<init>()     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
        L_0x00ce:
            long r14 = com.umeng.analytics.pro.DataSpliter.m22069a(r11)     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            long r16 = com.umeng.analytics.pro.DataSpliter.m22070a(r9)     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            long r16 = r16 + r14
            int r12 = (r16 > r20 ? 1 : (r16 == r20 ? 0 : -1))
            if (r12 <= 0) goto L_0x00dd
            goto L_0x00f9
        L_0x00dd:
            boolean r12 = r7.equalsIgnoreCase(r13)     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            if (r12 != 0) goto L_0x00e4
            goto L_0x00f9
        L_0x00e4:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            r12 = r22
            r12.add(r8)     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            r11.put(r9)     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            r6.put(r10, r11)     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            goto L_0x0028
        L_0x00f5:
            r12 = r22
            goto L_0x0028
        L_0x00f9:
            int r0 = r6.length()     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            if (r0 <= 0) goto L_0x013a
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            r0.<init>()     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            java.util.Iterator r7 = r6.keys()     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
        L_0x0108:
            boolean r8 = r7.hasNext()     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            if (r8 == 0) goto L_0x012f
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            r8.<init>()     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            java.lang.Object r9 = r7.next()     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            java.lang.String r10 = r6.optString(r9)     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            org.json.JSONArray r11 = new org.json.JSONArray     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            r11.<init>(r10)     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            r8.put(r9, r11)     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            int r9 = r8.length()     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            if (r9 <= 0) goto L_0x0108
            r0.put(r8)     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            goto L_0x0108
        L_0x012f:
            int r6 = r0.length()     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            if (r6 <= 0) goto L_0x013a
            java.lang.String r6 = "ekv"
            r3.put(r6, r0)     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
        L_0x013a:
            r5.setTransactionSuccessful()     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            if (r4 == 0) goto L_0x0142
            r4.close()
        L_0x0142:
            r5.endTransaction()     // Catch:{ all -> 0x0169 }
            goto L_0x0169
        L_0x0146:
            r0 = move-exception
            goto L_0x0179
        L_0x0148:
            r18 = r5
            r5 = r4
            r4 = r18
            goto L_0x0152
        L_0x014e:
            r0 = move-exception
            r5 = r4
            goto L_0x0179
        L_0x0151:
            r5 = r4
        L_0x0152:
            java.lang.String r0 = "MobclickRT"
            java.lang.String r6 = "--->>> 构建子进程事件数据异常，清除数据库数据。"
            com.umeng.commonsdk.debug.UMRTLog.m22228e(r0, r6)     // Catch:{ all -> 0x0173 }
            java.lang.String r0 = "delete from __et_p"
            r4.execSQL(r0)     // Catch:{ all -> 0x0173 }
            r4.setTransactionSuccessful()     // Catch:{ all -> 0x0173 }
            if (r5 == 0) goto L_0x0166
            r5.close()
        L_0x0166:
            r4.endTransaction()     // Catch:{ all -> 0x0169 }
        L_0x0169:
            android.content.Context r0 = r1.mContext
            com.umeng.analytics.process.c r0 = com.umeng.analytics.process.UMProcessDBManager.m22162a(r0)
            r0.mo19212b(r2)
            return r3
        L_0x0173:
            r0 = move-exception
            r18 = r5
            r5 = r4
            r4 = r18
        L_0x0179:
            if (r4 == 0) goto L_0x017e
            r4.close()
        L_0x017e:
            if (r5 == 0) goto L_0x0183
            r5.endTransaction()     // Catch:{ all -> 0x0183 }
        L_0x0183:
            android.content.Context r3 = r1.mContext
            com.umeng.analytics.process.c r3 = com.umeng.analytics.process.UMProcessDBManager.m22162a(r3)
            r3.mo19212b(r2)
            goto L_0x018e
        L_0x018d:
            throw r0
        L_0x018e:
            goto L_0x018d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.process.UMProcessDBHelper.readMainEvents(long, java.util.List):org.json.JSONObject");
    }

    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r3v2, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r3v3, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r3v4, types: [org.json.JSONObject] */
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r9v6, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r3v5, types: [org.json.JSONObject] */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r5v6, types: [org.json.JSONObject] */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
        r3 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r5v3
  assigns: []
  uses: []
  mth insns count: 76
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
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c A[ExcHandler: all (th java.lang.Throwable), Splitter:B:6:0x002b] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0083 A[SYNTHETIC, Splitter:B:39:0x0083] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0088 A[Catch:{ Exception -> 0x008b }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0099 A[SYNTHETIC, Splitter:B:47:0x0099] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x009e A[Catch:{ Exception -> 0x00a1 }] */
    /* JADX WARNING: Unknown variable types count: 8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject readVersionInfoFromColumId(java.lang.Integer r9) {
        /*
            r8 = this;
            java.lang.String r0 = "__vc"
            java.lang.String r1 = "__av"
            java.lang.String r2 = "_main_"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "select *  from __et_p where rowid="
            r3.append(r4)
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            r3 = 0
            android.content.Context r4 = r8.mContext     // Catch:{ Exception -> 0x007b, all -> 0x0078 }
            com.umeng.analytics.process.c r4 = com.umeng.analytics.process.UMProcessDBManager.m22162a(r4)     // Catch:{ Exception -> 0x007b, all -> 0x0078 }
            android.database.sqlite.SQLiteDatabase r4 = r4.mo19211a(r2)     // Catch:{ Exception -> 0x007b, all -> 0x0078 }
            r4.beginTransaction()     // Catch:{ Exception -> 0x0075 }
            android.database.Cursor r9 = r4.rawQuery(r9, r3)     // Catch:{ Exception -> 0x0075 }
            if (r9 == 0) goto L_0x0063
            boolean r5 = r9.moveToNext()     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            if (r5 == 0) goto L_0x0063
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            r5.<init>()     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            int r3 = r9.getColumnIndex(r1)     // Catch:{ Exception -> 0x005a, all -> 0x005c }
            java.lang.String r3 = r9.getString(r3)     // Catch:{ Exception -> 0x005a, all -> 0x005c }
            int r6 = r9.getColumnIndex(r0)     // Catch:{ Exception -> 0x005a, all -> 0x005c }
            java.lang.String r6 = r9.getString(r6)     // Catch:{ Exception -> 0x005a, all -> 0x005c }
            boolean r7 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x005a, all -> 0x005c }
            if (r7 != 0) goto L_0x004f
            r5.put(r1, r3)     // Catch:{ Exception -> 0x005a, all -> 0x005c }
        L_0x004f:
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x005a, all -> 0x005c }
            if (r1 != 0) goto L_0x0058
            r5.put(r0, r6)     // Catch:{ Exception -> 0x005a, all -> 0x005c }
        L_0x0058:
            r3 = r5
            goto L_0x0063
        L_0x005a:
            r0 = move-exception
            goto L_0x0061
        L_0x005c:
            r0 = move-exception
            r3 = r9
            goto L_0x0097
        L_0x005f:
            r0 = move-exception
            r5 = r3
        L_0x0061:
            r3 = r9
            goto L_0x007e
        L_0x0063:
            if (r9 == 0) goto L_0x0068
            r9.close()     // Catch:{ Exception -> 0x006b }
        L_0x0068:
            r4.endTransaction()     // Catch:{ Exception -> 0x006b }
        L_0x006b:
            android.content.Context r9 = r8.mContext
            com.umeng.analytics.process.c r9 = com.umeng.analytics.process.UMProcessDBManager.m22162a(r9)
            r9.mo19212b(r2)
            goto L_0x0095
        L_0x0075:
            r0 = move-exception
            r5 = r3
            goto L_0x007e
        L_0x0078:
            r0 = move-exception
            r4 = r3
            goto L_0x0097
        L_0x007b:
            r0 = move-exception
            r4 = r3
            r5 = r4
        L_0x007e:
            r0.printStackTrace()     // Catch:{ all -> 0x0096 }
            if (r3 == 0) goto L_0x0086
            r3.close()     // Catch:{ Exception -> 0x008b }
        L_0x0086:
            if (r4 == 0) goto L_0x008b
            r4.endTransaction()     // Catch:{ Exception -> 0x008b }
        L_0x008b:
            android.content.Context r9 = r8.mContext
            com.umeng.analytics.process.c r9 = com.umeng.analytics.process.UMProcessDBManager.m22162a(r9)
            r9.mo19212b(r2)
            r3 = r5
        L_0x0095:
            return r3
        L_0x0096:
            r0 = move-exception
        L_0x0097:
            if (r3 == 0) goto L_0x009c
            r3.close()     // Catch:{ Exception -> 0x00a1 }
        L_0x009c:
            if (r4 == 0) goto L_0x00a1
            r4.endTransaction()     // Catch:{ Exception -> 0x00a1 }
        L_0x00a1:
            android.content.Context r9 = r8.mContext
            com.umeng.analytics.process.c r9 = com.umeng.analytics.process.UMProcessDBManager.m22162a(r9)
            r9.mo19212b(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.process.UMProcessDBHelper.readVersionInfoFromColumId(java.lang.Integer):org.json.JSONObject");
    }

    private UMProcessDBHelper(Context context) {
        EncryptHelper.m22170a().mo19223a(context);
    }
}
