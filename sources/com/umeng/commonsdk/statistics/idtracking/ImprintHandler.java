package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.TSerializer;
import com.umeng.analytics.pro.UMCommonContent;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.internal.OnImprintChangedListener;
import com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback;
import com.umeng.commonsdk.statistics.internal.UMImprintPreProcessCallback;
import com.umeng.commonsdk.statistics.proto.Imprint;
import com.umeng.commonsdk.statistics.proto.ImprintValue;
import com.umeng.commonsdk.utils.FileLockCallback;
import com.umeng.commonsdk.utils.FileLockUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class ImprintHandler implements FileLockCallback {

    /* renamed from: a */
    private static final String f17694a = "ImprintHandler";

    /* renamed from: b */
    private static Object f17695b = new Object();

    /* renamed from: c */
    private static final String f17696c = ".imprint";

    /* renamed from: d */
    private static final byte[] f17697d = "pbl0".getBytes();

    /* renamed from: f */
    private static Map<String, ArrayList<UMImprintChangeCallback>> f17698f = new HashMap();

    /* renamed from: g */
    private static Object f17699g = new Object();

    /* renamed from: j */
    private static ImprintHandler f17700j = null;

    /* renamed from: k */
    private static Context f17701k = null;

    /* renamed from: l */
    private static FileLockUtil f17702l = null;

    /* renamed from: m */
    private static final int f17703m = 0;

    /* renamed from: n */
    private static final int f17704n = 1;

    /* renamed from: o */
    private static Map<String, UMImprintPreProcessCallback> f17705o = new HashMap();

    /* renamed from: p */
    private static Object f17706p = new Object();

    /* renamed from: e */
    private OnImprintChangedListener f17707e;

    /* renamed from: h */
    private C3230a f17708h = new C3230a();

    /* renamed from: i */
    private Imprint f17709i = null;

    /* renamed from: com.umeng.commonsdk.statistics.idtracking.ImprintHandler$a */
    public static class C3230a {

        /* renamed from: a */
        private Map<String, String> f17710a = new HashMap();

        C3230a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0065, code lost:
            return;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private synchronized void m22548b(com.umeng.commonsdk.statistics.proto.Imprint r7) {
            /*
                r6 = this;
                monitor-enter(r6)
                if (r7 == 0) goto L_0x0064
                boolean r0 = r7.mo19541e()     // Catch:{ all -> 0x0062 }
                if (r0 != 0) goto L_0x000a
                goto L_0x0064
            L_0x000a:
                java.util.Map r7 = r7.mo19538c()     // Catch:{ all -> 0x0062 }
                java.util.Set r0 = r7.keySet()     // Catch:{ all -> 0x0062 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0062 }
            L_0x0016:
                boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0062 }
                if (r1 == 0) goto L_0x0062
                java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0062 }
                java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0062 }
                boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0062 }
                if (r2 != 0) goto L_0x0016
                java.lang.Object r2 = r7.get(r1)     // Catch:{ all -> 0x0062 }
                com.umeng.commonsdk.statistics.proto.e r2 = (com.umeng.commonsdk.statistics.proto.ImprintValue) r2     // Catch:{ all -> 0x0062 }
                if (r2 == 0) goto L_0x0016
                java.lang.String r2 = r2.mo19562b()     // Catch:{ all -> 0x0062 }
                boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0062 }
                if (r3 != 0) goto L_0x0016
                java.util.Map<java.lang.String, java.lang.String> r3 = r6.f17710a     // Catch:{ all -> 0x0062 }
                r3.put(r1, r2)     // Catch:{ all -> 0x0062 }
                boolean r3 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG     // Catch:{ all -> 0x0062 }
                if (r3 == 0) goto L_0x0016
                java.lang.String r3 = "ImprintHandler"
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0062 }
                r4.<init>()     // Catch:{ all -> 0x0062 }
                java.lang.String r5 = "imKey is "
                r4.append(r5)     // Catch:{ all -> 0x0062 }
                r4.append(r1)     // Catch:{ all -> 0x0062 }
                java.lang.String r1 = ", imValue is "
                r4.append(r1)     // Catch:{ all -> 0x0062 }
                r4.append(r2)     // Catch:{ all -> 0x0062 }
                java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0062 }
                android.util.Log.i(r3, r1)     // Catch:{ all -> 0x0062 }
                goto L_0x0016
            L_0x0062:
                monitor-exit(r6)
                return
            L_0x0064:
                monitor-exit(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.idtracking.ImprintHandler.C3230a.m22548b(com.umeng.commonsdk.statistics.proto.d):void");
        }

        /* renamed from: a */
        public synchronized void mo19355a(String str) {
            Map<String, String> map = this.f17710a;
            if (map != null && map.size() > 0 && !TextUtils.isEmpty(str) && this.f17710a.containsKey(str)) {
                this.f17710a.remove(str);
            }
        }

        C3230a(Imprint dVar) {
            mo19354a(dVar);
        }

        /* renamed from: a */
        public void mo19354a(Imprint dVar) {
            if (dVar != null) {
                m22548b(dVar);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
            return r3;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized java.lang.String mo19353a(java.lang.String r2, java.lang.String r3) {
            /*
                r1 = this;
                monitor-enter(r1)
                boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0024 }
                if (r0 != 0) goto L_0x0022
                java.util.Map<java.lang.String, java.lang.String> r0 = r1.f17710a     // Catch:{ all -> 0x0024 }
                int r0 = r0.size()     // Catch:{ all -> 0x0024 }
                if (r0 > 0) goto L_0x0010
                goto L_0x0022
            L_0x0010:
                java.util.Map<java.lang.String, java.lang.String> r0 = r1.f17710a     // Catch:{ all -> 0x0024 }
                java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x0024 }
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0024 }
                boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0024 }
                if (r0 != 0) goto L_0x0020
                monitor-exit(r1)
                return r2
            L_0x0020:
                monitor-exit(r1)
                return r3
            L_0x0022:
                monitor-exit(r1)
                return r3
            L_0x0024:
                r2 = move-exception
                monitor-exit(r1)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.idtracking.ImprintHandler.C3230a.mo19353a(java.lang.String, java.lang.String):java.lang.String");
        }
    }

    private ImprintHandler(Context context) {
        f17701k = context.getApplicationContext();
    }

    /* renamed from: a */
    private static void m22532a(String str, UMImprintChangeCallback uMImprintChangeCallback) {
        synchronized (f17699g) {
            try {
                int i = 0;
                if (f17698f.containsKey(str)) {
                    ArrayList arrayList = (ArrayList) f17698f.get(str);
                    int size = arrayList.size();
                    StringBuilder sb = new StringBuilder();
                    sb.append("--->>> addCallback: before add: callbacks size is: ");
                    sb.append(size);
                    ULog.m22479i(sb.toString());
                    while (i < size) {
                        if (uMImprintChangeCallback == arrayList.get(i)) {
                            ULog.m22479i("--->>> addCallback: callback has exist, just exit");
                            return;
                        }
                        i++;
                    }
                    arrayList.add(uMImprintChangeCallback);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("--->>> addCallback: after add: callbacks size is: ");
                    sb2.append(arrayList.size());
                    ULog.m22479i(sb2.toString());
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = arrayList2.size();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("--->>> addCallback: before add: callbacks size is: ");
                    sb3.append(size2);
                    ULog.m22479i(sb3.toString());
                    while (i < size2) {
                        if (uMImprintChangeCallback == arrayList2.get(i)) {
                            ULog.m22479i("--->>> addCallback: callback has exist, just exit");
                            return;
                        }
                        i++;
                    }
                    arrayList2.add(uMImprintChangeCallback);
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("--->>> addCallback: after add: callbacks size is: ");
                    sb4.append(arrayList2.size());
                    ULog.m22479i(sb4.toString());
                    f17698f.put(str, arrayList2);
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(f17701k, th);
            }
        }
    }

    /* renamed from: b */
    private static void m22534b(String str, UMImprintChangeCallback uMImprintChangeCallback) {
        if (!TextUtils.isEmpty(str) && uMImprintChangeCallback != null) {
            synchronized (f17699g) {
                try {
                    if (f17698f.containsKey(str)) {
                        ArrayList arrayList = (ArrayList) f17698f.get(str);
                        if (arrayList.size() > 0) {
                            int size = arrayList.size();
                            StringBuilder sb = new StringBuilder();
                            sb.append("--->>> removeCallback: before remove: callbacks size is: ");
                            sb.append(size);
                            ULog.m22479i(sb.toString());
                            int i = 0;
                            while (true) {
                                if (i >= size) {
                                    break;
                                } else if (uMImprintChangeCallback == arrayList.get(i)) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("--->>> removeCallback: remove index ");
                                    sb2.append(i);
                                    ULog.m22479i(sb2.toString());
                                    arrayList.remove(i);
                                    break;
                                } else {
                                    i++;
                                }
                            }
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("--->>> removeCallback: after remove: callbacks size is: ");
                            sb3.append(arrayList.size());
                            ULog.m22479i(sb3.toString());
                            if (arrayList.size() == 0) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("--->>> removeCallback: remove key from map: key = ");
                                sb4.append(str);
                                ULog.m22479i(sb4.toString());
                                f17698f.remove(str);
                            }
                        }
                    }
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(f17701k, th);
                }
            }
        }
    }

    /* renamed from: c */
    private boolean m22535c(Imprint dVar) {
        if (!dVar.mo19545i().equals(mo19341a(dVar))) {
            return false;
        }
        for (ImprintValue eVar : dVar.mo19538c().values()) {
            byte[] reverseHexString = DataHelper.reverseHexString(eVar.mo19570h());
            byte[] a = mo19345a(eVar);
            int i = 0;
            while (true) {
                if (i < 4) {
                    if (reverseHexString[i] != a[i]) {
                        return false;
                    }
                    i++;
                }
            }
        }
        return true;
    }

    /* renamed from: d */
    private Imprint m22536d(Imprint dVar) {
        Map c = dVar.mo19538c();
        String str = UMCommonContent.f16644f;
        if (c.containsKey(str)) {
            c.remove(str);
            this.f17708h.mo19355a(str);
            dVar.mo19530a(dVar.mo19542f());
            dVar.mo19531a(mo19341a(dVar));
        }
        return dVar;
    }

    /* renamed from: e */
    private Imprint m22537e(Imprint dVar) {
        boolean z;
        Map c = dVar.mo19538c();
        ArrayList<String> arrayList = new ArrayList<>(c.size() / 2);
        Iterator it = c.entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                Entry entry = (Entry) it.next();
                if (!((ImprintValue) entry.getValue()).mo19566d()) {
                    arrayList.add(entry.getKey());
                } else {
                    String str = (String) entry.getKey();
                    String str2 = ((ImprintValue) entry.getValue()).f17862a;
                    synchronized (f17706p) {
                        if (!TextUtils.isEmpty(str) && f17705o.containsKey(str)) {
                            UMImprintPreProcessCallback uMImprintPreProcessCallback = (UMImprintPreProcessCallback) f17705o.get(str);
                            if (uMImprintPreProcessCallback != null && uMImprintPreProcessCallback.onPreProcessImprintKey(str, str2)) {
                                z = true;
                            }
                        }
                        z = false;
                    }
                    if (z) {
                        arrayList.add(str);
                    }
                    synchronized (f17699g) {
                        if (!TextUtils.isEmpty(str) && f17698f.containsKey(str)) {
                            ArrayList arrayList2 = (ArrayList) f17698f.get(str);
                            if (arrayList2 != null) {
                                for (int i = 0; i < arrayList2.size(); i++) {
                                    ((UMImprintChangeCallback) arrayList2.get(i)).onImprintValueChanged(str, str2);
                                }
                            }
                        }
                    }
                }
            } else {
                for (String str3 : arrayList) {
                    synchronized (f17699g) {
                        if (!TextUtils.isEmpty(str3) && f17698f.containsKey(str3)) {
                            ArrayList arrayList3 = (ArrayList) f17698f.get(str3);
                            if (arrayList3 != null) {
                                for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                                    ((UMImprintChangeCallback) arrayList3.get(i2)).onImprintValueChanged(str3, null);
                                }
                            }
                        }
                    }
                    c.remove(str3);
                }
                return dVar;
            }
        }
        while (true) {
        }
    }

    public static synchronized ImprintHandler getImprintService(Context context) {
        ImprintHandler imprintHandler;
        synchronized (ImprintHandler.class) {
            if (f17700j == null) {
                f17700j = new ImprintHandler(context);
                FileLockUtil fileLockUtil = new FileLockUtil();
                f17702l = fileLockUtil;
                if (fileLockUtil != null) {
                    f17702l.doFileOperateion(new File(f17701k.getFilesDir(), f17696c), (FileLockCallback) f17700j, 0);
                }
            }
            imprintHandler = f17700j;
        }
        return imprintHandler;
    }

    public boolean onFileLock(File file, int i) {
        if (i == 0) {
            f17700j.m22538e();
        } else if (i == 1) {
            f17700j.m22531a(file);
        }
        return true;
    }

    public boolean onFileLock(String str) {
        return false;
    }

    public boolean onFileLock(String str, Object obj) {
        return false;
    }

    public void registImprintCallback(String str, UMImprintChangeCallback uMImprintChangeCallback) {
        if (!TextUtils.isEmpty(str) && uMImprintChangeCallback != null) {
            m22532a(str, uMImprintChangeCallback);
        }
    }

    public void registPreProcessCallback(String str, UMImprintPreProcessCallback uMImprintPreProcessCallback) {
        if (!TextUtils.isEmpty(str) && uMImprintPreProcessCallback != null) {
            synchronized (f17706p) {
                try {
                    if (!f17705o.containsKey(str)) {
                        f17705o.put(str, uMImprintPreProcessCallback);
                        String str2 = UMRTLog.RTLOG_TAG;
                        StringBuilder sb = new StringBuilder();
                        sb.append("--->>> registPreProcessCallback: key : ");
                        sb.append(str);
                        sb.append(" regist success.");
                        UMRTLog.m22229i(str2, sb.toString());
                    } else {
                        String str3 = UMRTLog.RTLOG_TAG;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("--->>> key : ");
                        sb2.append(str);
                        sb2.append(" PreProcesser has registed!");
                        UMRTLog.m22229i(str3, sb2.toString());
                    }
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(f17701k, th);
                }
            }
        }
    }

    public void unregistImprintCallback(String str, UMImprintChangeCallback uMImprintChangeCallback) {
        if (!TextUtils.isEmpty(str) && uMImprintChangeCallback != null) {
            m22534b(str, uMImprintChangeCallback);
        }
    }

    /* renamed from: c */
    public C3230a mo19348c() {
        return this.f17708h;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(f17701k, r1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0020 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19349d() {
        /*
            r4 = this;
            com.umeng.commonsdk.statistics.proto.d r0 = r4.f17709i
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            com.umeng.commonsdk.utils.FileLockUtil r0 = f17702l
            if (r0 == 0) goto L_0x0032
            java.io.File r0 = new java.io.File
            android.content.Context r1 = f17701k
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r2 = ".imprint"
            r0.<init>(r1, r2)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x002a
            r0.createNewFile()     // Catch:{ IOException -> 0x0020 }
            goto L_0x002a
        L_0x0020:
            r0.createNewFile()     // Catch:{ IOException -> 0x0024 }
            goto L_0x002a
        L_0x0024:
            r1 = move-exception
            android.content.Context r2 = f17701k
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r2, r1)
        L_0x002a:
            com.umeng.commonsdk.utils.FileLockUtil r1 = f17702l
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler r2 = f17700j
            r3 = 1
            r1.doFileOperateion(r0, r2, r3)
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.idtracking.ImprintHandler.mo19349d():void");
    }

    /* renamed from: b */
    public void mo19347b(Imprint dVar) {
        String str;
        Imprint dVar2;
        boolean z;
        if (dVar == null) {
            if (AnalyticsConstants.UM_DEBUG) {
                UMRTLog.m22227d(UMRTLog.RTLOG_TAG, "Imprint is null");
            }
        } else if (!m22535c(dVar)) {
            if (AnalyticsConstants.UM_DEBUG) {
                UMRTLog.m22228e(UMRTLog.RTLOG_TAG, "Imprint is not valid");
            }
        } else {
            boolean z2 = AnalyticsConstants.UM_DEBUG;
            HashMap hashMap = new HashMap();
            synchronized (this) {
                Imprint dVar3 = this.f17709i;
                Imprint d = m22536d(dVar);
                String str2 = null;
                if (dVar3 == null) {
                    str = null;
                } else {
                    str = dVar3.mo19545i();
                }
                if (dVar3 == null) {
                    dVar2 = m22537e(d);
                } else {
                    dVar2 = m22530a(dVar3, d, hashMap);
                }
                this.f17709i = dVar2;
                if (dVar2 != null) {
                    str2 = dVar2.mo19545i();
                }
                z = !m22533a(str, str2);
            }
            Imprint dVar4 = this.f17709i;
            if (dVar4 != null && z) {
                this.f17708h.mo19354a(dVar4);
                OnImprintChangedListener dVar5 = this.f17707e;
                if (dVar5 != null) {
                    dVar5.onImprintChanged(this.f17708h);
                }
            }
            if (hashMap.size() > 0) {
                synchronized (f17699g) {
                    for (Entry entry : hashMap.entrySet()) {
                        String str3 = (String) entry.getKey();
                        String str4 = (String) entry.getValue();
                        if (!TextUtils.isEmpty(str3) && f17698f.containsKey(str3)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("--->>> target imprint key is: ");
                            sb.append(str3);
                            sb.append("; value is: ");
                            sb.append(str4);
                            ULog.m22479i(sb.toString());
                            ArrayList arrayList = (ArrayList) f17698f.get(str3);
                            if (arrayList != null) {
                                for (int i = 0; i < arrayList.size(); i++) {
                                    ((UMImprintChangeCallback) arrayList.get(i)).onImprintValueChanged(str3, str4);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo19343a(String str) {
        if (!TextUtils.isEmpty(str)) {
            synchronized (f17706p) {
                try {
                    if (f17705o.containsKey(str)) {
                        String str2 = UMRTLog.RTLOG_TAG;
                        StringBuilder sb = new StringBuilder();
                        sb.append("--->>> unregistPreProcessCallback: unregist [");
                        sb.append(str);
                        sb.append("] success.");
                        UMRTLog.m22229i(str2, sb.toString());
                        f17698f.remove(str);
                    } else {
                        String str3 = UMRTLog.RTLOG_TAG;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("--->>> unregistPreProcessCallback: can't find [");
                        sb2.append(str);
                        sb2.append("], pls regist first.");
                        UMRTLog.m22229i(str3, sb2.toString());
                    }
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(f17701k, th);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0038 A[SYNTHETIC, Splitter:B:22:0x0038] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m22538e() {
        /*
            r5 = this;
            java.io.File r0 = new java.io.File
            android.content.Context r1 = f17701k
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r2 = ".imprint"
            r0.<init>(r1, r2)
            java.lang.Object r1 = f17695b
            monitor-enter(r1)
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0060 }
            if (r0 != 0) goto L_0x0018
            monitor-exit(r1)     // Catch:{ all -> 0x0060 }
            return
        L_0x0018:
            r0 = 0
            android.content.Context r2 = f17701k     // Catch:{ Exception -> 0x0030, all -> 0x002b }
            java.lang.String r3 = ".imprint"
            java.io.FileInputStream r2 = r2.openFileInput(r3)     // Catch:{ Exception -> 0x0030, all -> 0x002b }
            byte[] r0 = com.umeng.commonsdk.statistics.common.HelperUtils.readStreamToByteArray(r2)     // Catch:{ Exception -> 0x0029 }
        L_0x0025:
            com.umeng.commonsdk.statistics.common.HelperUtils.safeClose(r2)     // Catch:{ all -> 0x0060 }
            goto L_0x0036
        L_0x0029:
            r3 = move-exception
            goto L_0x0032
        L_0x002b:
            r2 = move-exception
            r4 = r2
            r2 = r0
            r0 = r4
            goto L_0x005c
        L_0x0030:
            r3 = move-exception
            r2 = r0
        L_0x0032:
            r3.printStackTrace()     // Catch:{ all -> 0x005b }
            goto L_0x0025
        L_0x0036:
            if (r0 == 0) goto L_0x0059
            com.umeng.commonsdk.statistics.proto.d r2 = new com.umeng.commonsdk.statistics.proto.d     // Catch:{ Exception -> 0x0055 }
            r2.<init>()     // Catch:{ Exception -> 0x0055 }
            com.umeng.analytics.pro.at r3 = new com.umeng.analytics.pro.at     // Catch:{ Exception -> 0x0055 }
            r3.<init>()     // Catch:{ Exception -> 0x0055 }
            r3.mo18963a(r2, r0)     // Catch:{ Exception -> 0x0055 }
            r5.f17709i = r2     // Catch:{ Exception -> 0x0055 }
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler$a r0 = r5.f17708h     // Catch:{ Exception -> 0x0055 }
            r0.mo19354a(r2)     // Catch:{ Exception -> 0x0055 }
            com.umeng.commonsdk.statistics.proto.d r0 = r5.f17709i     // Catch:{ Exception -> 0x0055 }
            com.umeng.commonsdk.statistics.proto.d r0 = r5.m22536d(r0)     // Catch:{ Exception -> 0x0055 }
            r5.f17709i = r0     // Catch:{ Exception -> 0x0055 }
            goto L_0x0059
        L_0x0055:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x0060 }
        L_0x0059:
            monitor-exit(r1)     // Catch:{ all -> 0x0060 }
            return
        L_0x005b:
            r0 = move-exception
        L_0x005c:
            com.umeng.commonsdk.statistics.common.HelperUtils.safeClose(r2)     // Catch:{ all -> 0x0060 }
            throw r0     // Catch:{ all -> 0x0060 }
        L_0x0060:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0060 }
            goto L_0x0064
        L_0x0063:
            throw r0
        L_0x0064:
            goto L_0x0063
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.idtracking.ImprintHandler.m22538e():void");
    }

    /* renamed from: a */
    public void mo19342a(OnImprintChangedListener dVar) {
        this.f17707e = dVar;
    }

    /* renamed from: a */
    public String mo19341a(Imprint dVar) {
        StringBuilder sb = new StringBuilder();
        for (Entry entry : new TreeMap(dVar.mo19538c()).entrySet()) {
            sb.append((String) entry.getKey());
            if (((ImprintValue) entry.getValue()).mo19566d()) {
                sb.append(((ImprintValue) entry.getValue()).mo19562b());
            }
            sb.append(((ImprintValue) entry.getValue()).mo19567e());
            sb.append(((ImprintValue) entry.getValue()).mo19570h());
        }
        sb.append(dVar.f17844b);
        return HelperUtils.MD5(sb.toString()).toLowerCase(Locale.US);
    }

    /* renamed from: a */
    public byte[] mo19345a(ImprintValue eVar) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(null);
        allocate.putLong(eVar.mo19567e());
        byte[] array = allocate.array();
        byte[] bArr = f17697d;
        byte[] bArr2 = new byte[4];
        for (int i = 0; i < 4; i++) {
            bArr2[i] = (byte) (array[i] ^ bArr[i]);
        }
        return bArr2;
    }

    /* renamed from: a */
    public byte[] mo19344a() {
        try {
            synchronized (this) {
                Imprint dVar = this.f17709i;
                if (dVar == null) {
                    return null;
                }
                if (dVar.mo19535b() <= 0) {
                    return null;
                }
                byte[] a = new TSerializer().mo18975a(this.f17709i);
                return a;
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f17701k, th);
            return null;
        }
    }

    /* renamed from: b */
    public synchronized Imprint mo19346b() {
        return this.f17709i;
    }

    /* renamed from: a */
    private boolean m22533a(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    /* renamed from: a */
    private Imprint m22530a(Imprint dVar, Imprint dVar2, Map<String, String> map) {
        if (dVar2 == null) {
            return dVar;
        }
        Map c = dVar.mo19538c();
        for (Entry entry : dVar2.mo19538c().entrySet()) {
            int i = 0;
            if (((ImprintValue) entry.getValue()).mo19566d()) {
                String str = (String) entry.getKey();
                String str2 = ((ImprintValue) entry.getValue()).f17862a;
                synchronized (f17706p) {
                    if (!TextUtils.isEmpty(str) && f17705o.containsKey(str)) {
                        UMImprintPreProcessCallback uMImprintPreProcessCallback = (UMImprintPreProcessCallback) f17705o.get(str);
                        if (uMImprintPreProcessCallback != null && uMImprintPreProcessCallback.onPreProcessImprintKey(str, str2)) {
                            i = 1;
                        }
                    }
                }
                if (i == 0) {
                    c.put(entry.getKey(), entry.getValue());
                    synchronized (f17699g) {
                        if (!TextUtils.isEmpty(str) && f17698f.containsKey(str) && ((ArrayList) f17698f.get(str)) != null) {
                            map.put(str, str2);
                        }
                    }
                } else {
                    String str3 = UMRTLog.RTLOG_TAG;
                    StringBuilder sb = new StringBuilder();
                    sb.append("--->>> merge: [");
                    sb.append(str);
                    sb.append("] should be ignored.");
                    UMRTLog.m22229i(str3, sb.toString());
                }
            } else {
                String str4 = (String) entry.getKey();
                synchronized (f17699g) {
                    if (!TextUtils.isEmpty(str4) && f17698f.containsKey(str4)) {
                        ArrayList arrayList = (ArrayList) f17698f.get(str4);
                        if (arrayList != null) {
                            while (i < arrayList.size()) {
                                ((UMImprintChangeCallback) arrayList.get(i)).onImprintValueChanged(str4, null);
                                i++;
                            }
                        }
                    }
                }
                c.remove(str4);
                this.f17708h.mo19355a(str4);
            }
        }
        dVar.mo19530a(dVar2.mo19542f());
        dVar.mo19531a(mo19341a(dVar));
        return dVar;
    }

    /* renamed from: a */
    private void m22531a(File file) {
        if (this.f17709i != null) {
            try {
                synchronized (f17695b) {
                    byte[] a = new TSerializer().mo18975a(this.f17709i);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        fileOutputStream.write(a);
                        fileOutputStream.flush();
                    } finally {
                        HelperUtils.safeClose((OutputStream) fileOutputStream);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
