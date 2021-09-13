package com.umeng.analytics.pro;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.UMStoreManager.C3143a;
import com.umeng.analytics.vshelper.PageLifeCycle;
import com.umeng.analytics.vshelper.PageNameMonitor;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMLog;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.pro.u */
public class ViewPageTracker {

    /* renamed from: c */
    private static final int f17253c = 5;

    /* renamed from: d */
    private static JSONArray f17254d = new JSONArray();

    /* renamed from: e */
    private static Object f17255e = new Object();

    /* renamed from: a */
    Stack<String> f17256a = new Stack<>();

    /* renamed from: b */
    PageLifeCycle f17257b = PageNameMonitor.getInstance();

    /* renamed from: f */
    private final Map<String, Long> f17258f = new HashMap();

    /* renamed from: a */
    public static void m22117a(Context context) {
        String jSONArray;
        if (context != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                synchronized (f17255e) {
                    jSONArray = f17254d.toString();
                    f17254d = new JSONArray();
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put("__a", new JSONArray(jSONArray));
                    if (jSONObject.length() > 0) {
                        UMStoreManager.m21939a(context).mo19096a(SessionTracker.m22097a().mo19177c(), jSONObject, C3143a.PAGE);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo19111a() {
        return 2;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0085 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19182b(java.lang.String r11) {
        /*
            r10 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto L_0x00d1
            java.util.Map<java.lang.String, java.lang.Long> r0 = r10.f17258f
            boolean r0 = r0.containsKey(r11)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00af
            java.util.Map<java.lang.String, java.lang.Long> r0 = r10.f17258f
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Long> r3 = r10.f17258f     // Catch:{ all -> 0x00ac }
            java.lang.Object r3 = r3.get(r11)     // Catch:{ all -> 0x00ac }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ all -> 0x00ac }
            monitor-exit(r0)     // Catch:{ all -> 0x00ac }
            if (r3 != 0) goto L_0x001f
            return
        L_0x001f:
            boolean r0 = com.umeng.commonsdk.UMConfigure.isDebugLog()
            if (r0 == 0) goto L_0x003e
            java.util.Stack<java.lang.String> r0 = r10.f17256a
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x003e
            java.util.Stack<java.lang.String> r0 = r10.f17256a
            java.lang.Object r0 = r0.peek()
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x003e
            java.util.Stack<java.lang.String> r0 = r10.f17256a
            r0.pop()
        L_0x003e:
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r3.longValue()
            long r4 = r4 - r6
            java.lang.Object r6 = f17255e
            monitor-enter(r6)
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x0085 }
            r0.<init>()     // Catch:{ all -> 0x0085 }
            java.lang.String r7 = "page_name"
            r0.put(r7, r11)     // Catch:{ all -> 0x0085 }
            java.lang.String r7 = "duration"
            r0.put(r7, r4)     // Catch:{ all -> 0x0085 }
            java.lang.String r4 = "page_start"
            r0.put(r4, r3)     // Catch:{ all -> 0x0085 }
            java.lang.String r3 = "type"
            int r4 = r10.mo19111a()     // Catch:{ all -> 0x0085 }
            r0.put(r3, r4)     // Catch:{ all -> 0x0085 }
            org.json.JSONArray r3 = f17254d     // Catch:{ all -> 0x0085 }
            r3.put(r0)     // Catch:{ all -> 0x0085 }
            org.json.JSONArray r0 = f17254d     // Catch:{ all -> 0x0085 }
            int r0 = r0.length()     // Catch:{ all -> 0x0085 }
            r3 = 5
            if (r0 < r3) goto L_0x0085
            r0 = 0
            android.content.Context r3 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext(r0)     // Catch:{ all -> 0x0085 }
            if (r3 == 0) goto L_0x0085
            r4 = 4099(0x1003, float:5.744E-42)
            com.umeng.analytics.CoreProtocol r5 = com.umeng.analytics.CoreProtocol.getInstance(r3)     // Catch:{ all -> 0x0085 }
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r3, r4, r5, r0)     // Catch:{ all -> 0x0085 }
        L_0x0085:
            monitor-exit(r6)     // Catch:{ all -> 0x00a9 }
            boolean r0 = com.umeng.commonsdk.UMConfigure.isDebugLog()
            if (r0 == 0) goto L_0x00d1
            java.util.Stack<java.lang.String> r0 = r10.f17256a
            int r0 = r0.size()
            if (r0 == 0) goto L_0x00d1
            java.lang.String r0 = "@"
            java.lang.String[] r6 = new java.lang.String[]{r0}
            java.lang.String[] r7 = new java.lang.String[r2]
            r7[r1] = r11
            java.lang.String r3 = com.umeng.analytics.pro.UMLogAnalytics.f17063E
            r4 = 0
            java.lang.String r5 = "\\|"
            r8 = 0
            r9 = 0
            com.umeng.commonsdk.debug.UMLog.m22224aq(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x00d1
        L_0x00a9:
            r11 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00a9 }
            throw r11
        L_0x00ac:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ac }
            throw r11
        L_0x00af:
            boolean r0 = com.umeng.commonsdk.UMConfigure.isDebugLog()
            if (r0 == 0) goto L_0x00d1
            java.util.Stack<java.lang.String> r0 = r10.f17256a
            int r0 = r0.size()
            if (r0 != 0) goto L_0x00d1
            java.lang.String r0 = "@"
            java.lang.String[] r6 = new java.lang.String[]{r0}
            java.lang.String[] r7 = new java.lang.String[r2]
            r7[r1] = r11
            java.lang.String r3 = com.umeng.analytics.pro.UMLogAnalytics.f17065G
            r4 = 0
            java.lang.String r5 = "\\|"
            r8 = 0
            r9 = 0
            com.umeng.commonsdk.debug.UMLog.m22224aq(r3, r4, r5, r6, r7, r8, r9)
        L_0x00d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.ViewPageTracker.mo19182b(java.lang.String):void");
    }

    /* renamed from: a */
    public void mo19180a(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (UMConfigure.isDebugLog() && this.f17256a.size() != 0) {
                UMLog.m22224aq(UMLogAnalytics.f17064F, 0, "\\|", new String[]{"@"}, new String[]{(String) this.f17256a.peek()}, null, null);
            }
            this.f17257b.customPageBegin(str);
            synchronized (this.f17258f) {
                this.f17258f.put(str, Long.valueOf(System.currentTimeMillis()));
                if (UMConfigure.isDebugLog()) {
                    this.f17256a.push(str);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo19181b() {
        String str;
        synchronized (this.f17258f) {
            str = null;
            long j = 0;
            for (Entry entry : this.f17258f.entrySet()) {
                if (((Long) entry.getValue()).longValue() > j) {
                    long longValue = ((Long) entry.getValue()).longValue();
                    str = (String) entry.getKey();
                    j = longValue;
                }
            }
        }
        if (str != null) {
            mo19182b(str);
        }
    }
}
