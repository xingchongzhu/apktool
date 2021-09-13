package com.umeng.analytics.pro;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import com.umeng.analytics.InternalAgent;
import com.umeng.analytics.MobclickAgent.PageMode;
import com.umeng.analytics.pro.UMDBConfig.C3134d.C3135a;
import com.umeng.analytics.pro.UMStoreManager.C3143a;
import com.umeng.analytics.vshelper.PageLifeCycle;
import com.umeng.analytics.vshelper.PageNameMonitor;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.utils.UMConstant;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.pro.k */
public class AutoViewPageTracker {

    /* renamed from: a */
    public static String f17129a;

    /* renamed from: b */
    public static PageMode f17130b = PageMode.AUTO;

    /* renamed from: e */
    static String f17131e = null;

    /* renamed from: f */
    static int f17132f = -1;

    /* renamed from: j */
    private static JSONArray f17133j = new JSONArray();

    /* renamed from: k */
    private static Object f17134k = new Object();

    /* renamed from: l */
    private static Application f17135l = null;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static boolean f17136p = true;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static Object f17137q = new Object();

    /* renamed from: c */
    boolean f17138c;

    /* renamed from: d */
    boolean f17139d;

    /* renamed from: g */
    PageLifeCycle f17140g;

    /* renamed from: h */
    ActivityLifecycleCallbacks f17141h;

    /* renamed from: i */
    private final Map<String, Long> f17142i;

    /* renamed from: m */
    private boolean f17143m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f17144n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f17145o;

    /* renamed from: com.umeng.analytics.pro.k$a */
    /* compiled from: AutoViewPageTracker */
    private static class C3146a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final AutoViewPageTracker f17147a = new AutoViewPageTracker();

        private C3146a() {
        }
    }

    private AutoViewPageTracker() {
        this.f17142i = new HashMap();
        this.f17143m = false;
        this.f17138c = false;
        this.f17139d = false;
        this.f17144n = 0;
        this.f17145o = 0;
        this.f17140g = PageNameMonitor.getInstance();
        this.f17141h = new ActivityLifecycleCallbacks() {
            public void onActivityCreated(Activity activity, Bundle bundle) {
            }

            public void onActivityDestroyed(Activity activity) {
            }

            public void onActivityPaused(Activity activity) {
                if (FieldManager.allow(UMConstant.f17888F)) {
                    UMRTLog.m22229i(UMRTLog.RTLOG_TAG, "--->>> onActivityPaused: FirstResumeTrigger enabled.");
                    synchronized (AutoViewPageTracker.f17137q) {
                        if (AutoViewPageTracker.f17136p) {
                            return;
                        }
                    }
                } else {
                    UMRTLog.m22229i(UMRTLog.RTLOG_TAG, "--->>> onActivityPaused: FirstResumeTrigger disabled.");
                }
                if (AutoViewPageTracker.f17130b == PageMode.AUTO) {
                    AutoViewPageTracker.this.m21985c(activity);
                    InternalAgent.m21414a().mo18831i();
                    AutoViewPageTracker.this.f17138c = false;
                }
            }

            public void onActivityResumed(Activity activity) {
                if (FieldManager.allow(UMConstant.f17888F)) {
                    UMRTLog.m22229i(UMRTLog.RTLOG_TAG, "--->>> onActivityResumed: FirstResumeTrigger enabled.");
                    synchronized (AutoViewPageTracker.f17137q) {
                        if (AutoViewPageTracker.f17136p) {
                            AutoViewPageTracker.f17136p = false;
                        }
                    }
                    AutoViewPageTracker.this.m21977a(activity);
                    return;
                }
                UMRTLog.m22229i(UMRTLog.RTLOG_TAG, "--->>> onActivityResumed: FirstResumeTrigger disabled.");
                AutoViewPageTracker.this.m21977a(activity);
            }

            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            public void onActivityStarted(Activity activity) {
                if (activity != null) {
                    if (AutoViewPageTracker.this.f17144n <= 0) {
                        if (AutoViewPageTracker.f17131e == null) {
                            AutoViewPageTracker.f17131e = UUID.randomUUID().toString();
                        }
                        if (AutoViewPageTracker.f17132f == -1) {
                            AutoViewPageTracker.f17132f = activity.isTaskRoot() ? 1 : 0;
                        }
                        String str = "activityName";
                        String str2 = "isMainProcess";
                        String str3 = "pid";
                        if (AutoViewPageTracker.f17132f == 0 && UMUtils.isMainProgress(activity)) {
                            HashMap hashMap = new HashMap();
                            hashMap.put(str, activity.toString());
                            hashMap.put(str3, Integer.valueOf(Process.myPid()));
                            hashMap.put(str2, Integer.valueOf(UMUtils.isMainProgress(activity) ? 1 : 0));
                            InternalAgent a = InternalAgent.m21414a();
                            if (a != null) {
                                a.mo18797a((Context) activity, "$$_onUMengEnterForegroundInitError", (Map<String, Object>) hashMap);
                            }
                            AutoViewPageTracker.f17132f = -2;
                            if (UMConfigure.isDebugLog()) {
                                UMLog.mutlInfo(2, UMLogAnalytics.f17103ar);
                            }
                        } else if (AutoViewPageTracker.f17132f == 1 || !UMUtils.isMainProgress(activity)) {
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("pairUUID", AutoViewPageTracker.f17131e);
                            hashMap2.put(str3, Integer.valueOf(Process.myPid()));
                            hashMap2.put(str2, Integer.valueOf(UMUtils.isMainProgress(activity) ? 1 : 0));
                            hashMap2.put(str, activity.toString());
                            if (InternalAgent.m21414a() != null) {
                                InternalAgent.m21414a().mo18797a((Context) activity, "$$_onUMengEnterForeground", (Map<String, Object>) hashMap2);
                            }
                        }
                    }
                    if (AutoViewPageTracker.this.f17145o < 0) {
                        AutoViewPageTracker.this.f17145o = AutoViewPageTracker.this.f17145o + 1;
                    } else {
                        AutoViewPageTracker.this.f17144n = AutoViewPageTracker.this.f17144n + 1;
                    }
                }
            }

            public void onActivityStopped(Activity activity) {
                PageMode pageMode = AutoViewPageTracker.f17130b;
                PageMode pageMode2 = PageMode.AUTO;
                if (activity == null) {
                    return;
                }
                if (activity.isChangingConfigurations()) {
                    AutoViewPageTracker.this.f17145o = AutoViewPageTracker.this.f17145o - 1;
                    return;
                }
                AutoViewPageTracker.this.f17144n = AutoViewPageTracker.this.f17144n - 1;
                if (AutoViewPageTracker.this.f17144n > 0) {
                    return;
                }
                if (AutoViewPageTracker.f17132f != 0 || !UMUtils.isMainProgress(activity)) {
                    int i = AutoViewPageTracker.f17132f;
                    if (i == 1 || (i == 0 && !UMUtils.isMainProgress(activity))) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("pairUUID", AutoViewPageTracker.f17131e);
                        hashMap.put("reason", "Normal");
                        hashMap.put("pid", Integer.valueOf(Process.myPid()));
                        hashMap.put("isMainProcess", Integer.valueOf(UMUtils.isMainProgress(activity) ? 1 : 0));
                        hashMap.put("activityName", activity.toString());
                        InternalAgent a = InternalAgent.m21414a();
                        if (a != null) {
                            a.mo18797a((Context) activity, "$$_onUMengEnterBackground", (Map<String, Object>) hashMap);
                        }
                        if (AutoViewPageTracker.f17131e != null) {
                            AutoViewPageTracker.f17131e = null;
                        }
                    }
                }
            }
        };
        synchronized (this) {
            if (f17135l != null) {
                m21992f();
            }
        }
    }

    /* renamed from: f */
    private void m21992f() {
        if (!this.f17143m) {
            this.f17143m = true;
            if (f17135l != null && VERSION.SDK_INT >= 14) {
                f17135l.registerActivityLifecycleCallbacks(this.f17141h);
            }
        }
    }

    /* renamed from: c */
    public void mo19115c() {
        m21985c((Activity) null);
        mo19113b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        r0 = r5.getLocalClassName();
        r1 = com.umeng.commonsdk.debug.UMRTLog.RTLOG_TAG;
        r2 = new java.lang.StringBuilder();
        r2.append("--->>> init触发onResume: 补救成功，前台Activity名：");
        r2.append(r0);
        com.umeng.commonsdk.debug.UMRTLog.m22228e(r1, r2.toString());
        m21977a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000b, code lost:
        r5 = com.umeng.commonsdk.statistics.common.DeviceConfig.getGlobleActivity(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
        if (r5 != null) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        com.umeng.commonsdk.debug.UMRTLog.m22228e(com.umeng.commonsdk.debug.UMRTLog.RTLOG_TAG, "--->>> init触发onResume: 无前台Activity，直接退出。");
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19114b(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.Object r0 = f17137q
            monitor-enter(r0)
            boolean r1 = f17136p     // Catch:{ all -> 0x0040 }
            if (r1 == 0) goto L_0x0037
            r1 = 0
            f17136p = r1     // Catch:{ all -> 0x0040 }
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            android.app.Activity r5 = com.umeng.commonsdk.statistics.common.DeviceConfig.getGlobleActivity(r5)
            if (r5 != 0) goto L_0x0019
            java.lang.String r5 = "MobclickRT"
            java.lang.String r0 = "--->>> init触发onResume: 无前台Activity，直接退出。"
            com.umeng.commonsdk.debug.UMRTLog.m22228e(r5, r0)
            return
        L_0x0019:
            java.lang.String r0 = r5.getLocalClassName()
            java.lang.String r1 = "MobclickRT"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "--->>> init触发onResume: 补救成功，前台Activity名："
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.umeng.commonsdk.debug.UMRTLog.m22228e(r1, r0)
            r4.m21977a(r5)
            return
        L_0x0037:
            java.lang.String r5 = "MobclickRT"
            java.lang.String r1 = "--->>> init触发onResume: firstResumeCall = false，直接返回。"
            com.umeng.commonsdk.debug.UMRTLog.m22228e(r5, r1)     // Catch:{ all -> 0x0040 }
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            return
        L_0x0040:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.AutoViewPageTracker.mo19114b(android.content.Context):void");
    }

    /* renamed from: c */
    public static void m21986c(Context context) {
        String jSONArray;
        if (context != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                synchronized (f17134k) {
                    jSONArray = f17133j.toString();
                    f17133j = new JSONArray();
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put(C3135a.f17009c, new JSONArray(jSONArray));
                    UMStoreManager.m21939a(context).mo19096a(SessionTracker.m22097a().mo19177c(), jSONObject, C3143a.AUTOPAGE);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public boolean mo19112a() {
        return this.f17143m;
    }

    /* renamed from: a */
    public static synchronized AutoViewPageTracker m21976a(Context context) {
        AutoViewPageTracker a;
        synchronized (AutoViewPageTracker.class) {
            if (f17135l == null && context != null) {
                if (context instanceof Activity) {
                    f17135l = ((Activity) context).getApplication();
                } else if (context instanceof Application) {
                    f17135l = (Application) context;
                }
            }
            a = C3146a.f17147a;
        }
        return a;
    }

    /* renamed from: a */
    public static void m21978a(Context context, String str) {
        if (f17132f == 1 && UMUtils.isMainProgress(context)) {
            HashMap hashMap = new HashMap();
            hashMap.put("pairUUID", f17131e);
            hashMap.put("reason", str);
            if (f17131e != null) {
                f17131e = null;
            }
            if (context != null) {
                hashMap.put("pid", Integer.valueOf(Process.myPid()));
                hashMap.put("isMainProcess", Integer.valueOf(UMUtils.isMainProgress(context) ? 1 : 0));
                hashMap.put("Context", context.toString());
                InternalAgent.m21414a().mo18797a(context, "$$_onUMengEnterBackground", (Map<String, Object>) hashMap);
            }
        }
    }

    /* renamed from: b */
    public void mo19113b() {
        this.f17143m = false;
        if (f17135l != null) {
            if (VERSION.SDK_INT >= 14) {
                f17135l.unregisterActivityLifecycleCallbacks(this.f17141h);
            }
            f17135l = null;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x007f */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m21985c(android.app.Activity r10) {
        /*
            r9 = this;
            java.util.Map<java.lang.String, java.lang.Long> r0 = r9.f17142i     // Catch:{ all -> 0x0087 }
            monitor-enter(r0)     // Catch:{ all -> 0x0087 }
            java.lang.String r1 = f17129a     // Catch:{ all -> 0x0084 }
            if (r1 != 0) goto L_0x0027
            if (r10 == 0) goto L_0x0027
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0084 }
            r1.<init>()     // Catch:{ all -> 0x0084 }
            java.lang.String r2 = r10.getPackageName()     // Catch:{ all -> 0x0084 }
            r1.append(r2)     // Catch:{ all -> 0x0084 }
            java.lang.String r2 = "."
            r1.append(r2)     // Catch:{ all -> 0x0084 }
            java.lang.String r10 = r10.getLocalClassName()     // Catch:{ all -> 0x0084 }
            r1.append(r10)     // Catch:{ all -> 0x0084 }
            java.lang.String r10 = r1.toString()     // Catch:{ all -> 0x0084 }
            f17129a = r10     // Catch:{ all -> 0x0084 }
        L_0x0027:
            java.lang.String r10 = f17129a     // Catch:{ all -> 0x0084 }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0084 }
            r1 = 0
            if (r10 != 0) goto L_0x0059
            java.util.Map<java.lang.String, java.lang.Long> r10 = r9.f17142i     // Catch:{ all -> 0x0084 }
            java.lang.String r3 = f17129a     // Catch:{ all -> 0x0084 }
            boolean r10 = r10.containsKey(r3)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x0059
            java.util.Map<java.lang.String, java.lang.Long> r10 = r9.f17142i     // Catch:{ all -> 0x0084 }
            java.lang.String r1 = f17129a     // Catch:{ all -> 0x0084 }
            java.lang.Object r10 = r10.get(r1)     // Catch:{ all -> 0x0084 }
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ all -> 0x0084 }
            long r1 = r10.longValue()     // Catch:{ all -> 0x0084 }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0084 }
            long r3 = r3 - r1
            java.util.Map<java.lang.String, java.lang.Long> r10 = r9.f17142i     // Catch:{ all -> 0x0084 }
            java.lang.String r5 = f17129a     // Catch:{ all -> 0x0084 }
            r10.remove(r5)     // Catch:{ all -> 0x0084 }
            r7 = r1
            r1 = r3
            r3 = r7
            goto L_0x005a
        L_0x0059:
            r3 = r1
        L_0x005a:
            monitor-exit(r0)     // Catch:{ all -> 0x0084 }
            java.lang.Object r10 = f17134k     // Catch:{ all -> 0x0087 }
            monitor-enter(r10)     // Catch:{ all -> 0x0087 }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x007f }
            r0.<init>()     // Catch:{ all -> 0x007f }
            java.lang.String r5 = "page_name"
            java.lang.String r6 = f17129a     // Catch:{ all -> 0x007f }
            r0.put(r5, r6)     // Catch:{ all -> 0x007f }
            java.lang.String r5 = "duration"
            r0.put(r5, r1)     // Catch:{ all -> 0x007f }
            java.lang.String r1 = "page_start"
            r0.put(r1, r3)     // Catch:{ all -> 0x007f }
            java.lang.String r1 = "type"
            r2 = 0
            r0.put(r1, r2)     // Catch:{ all -> 0x007f }
            org.json.JSONArray r1 = f17133j     // Catch:{ all -> 0x007f }
            r1.put(r0)     // Catch:{ all -> 0x007f }
        L_0x007f:
            monitor-exit(r10)     // Catch:{ all -> 0x0081 }
            goto L_0x0087
        L_0x0081:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0081 }
            throw r0     // Catch:{ all -> 0x0087 }
        L_0x0084:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0084 }
            throw r10     // Catch:{ all -> 0x0087 }
        L_0x0087:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.AutoViewPageTracker.m21985c(android.app.Activity):void");
    }

    /* renamed from: b */
    private void m21982b(Activity activity) {
        StringBuilder sb = new StringBuilder();
        sb.append(activity.getPackageName());
        sb.append(".");
        sb.append(activity.getLocalClassName());
        f17129a = sb.toString();
        synchronized (this.f17142i) {
            this.f17142i.put(f17129a, Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m21977a(Activity activity) {
        if (f17130b == PageMode.AUTO && activity != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(activity.getPackageName());
            sb.append(".");
            sb.append(activity.getLocalClassName());
            String sb2 = sb.toString();
            this.f17140g.activityResume(sb2);
            if (this.f17138c) {
                this.f17138c = false;
                if (TextUtils.isEmpty(f17129a)) {
                    f17129a = sb2;
                } else if (!f17129a.equals(sb2)) {
                    m21982b(activity);
                    synchronized (f17137q) {
                        InternalAgent.m21414a().mo18830h();
                    }
                }
            } else {
                m21982b(activity);
                synchronized (f17137q) {
                    InternalAgent.m21414a().mo18830h();
                }
            }
        }
    }
}
