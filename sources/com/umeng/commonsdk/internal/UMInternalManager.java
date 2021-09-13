package com.umeng.commonsdk.internal;

import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.inputmethod.InputMethodInfo;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.umeng.analytics.pro.UMCommonContent;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.internal.utils.ApplicationLayerUtil;
import com.umeng.commonsdk.internal.utils.ApplicationLayerUtil.C3201a;
import com.umeng.commonsdk.internal.utils.CpuUtil;
import com.umeng.commonsdk.internal.utils.CpuUtil.C3207a;
import com.umeng.commonsdk.internal.utils.UMInternalUtils;
import com.umeng.commonsdk.internal.utils.UMProbe;
import com.umeng.commonsdk.statistics.UMServerURL;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.utils.UMConstant;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.umeng.commonsdk.internal.d */
public class UMInternalManager {
    /* renamed from: a */
    public static void m22285a(Context context) {
        String str = "walle";
        try {
            ULog.m22482i(str, "[internal] workEvent send envelope");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(UMCommonContent.f16587aK, UMInternalConfig.f17497e);
            JSONObject buildEnvelopeWithExtHeader = UMEnvelopeBuild.buildEnvelopeWithExtHeader(context, jSONObject, m22292d(context), UMServerURL.PATH_ANALYTICS, UMCommonContent.f16577aA, UMInternalConfig.f17497e);
            if (buildEnvelopeWithExtHeader != null && !buildEnvelopeWithExtHeader.has("exception")) {
                ULog.m22482i(str, "[internal] workEvent send envelope back, result is ok");
                ApplicationLayerUtil.m22315e(context);
            }
        } catch (Exception e) {
            UMCrashManager.reportCrash(context, e);
        }
    }

    /* renamed from: b */
    public static void m22289b(Context context) {
        ULog.m22482i("walle", "[internal] begin by stateful--->>>");
        if (context != null) {
            m22298j(context);
        }
    }

    /* renamed from: c */
    public static void m22291c(Context context) {
        ULog.m22482i("walle", "[internal] begin by stateful--->>>");
        if (context != null && UMEnvelopeBuild.getTransmissionSendFlag()) {
            m22298j(context);
        }
    }

    /* renamed from: d */
    public static JSONObject m22292d(Context context) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            try {
                if (FieldManager.allow(UMConstant.f17891I)) {
                    JSONArray k = m22299k(applicationContext);
                    if (k != null && k.length() > 0) {
                        jSONObject2.put("rs", k);
                    }
                }
            } catch (Exception e) {
                UMCrashManager.reportCrash(applicationContext, e);
            }
            try {
                JSONArray l = m22300l(applicationContext);
                if (l != null && l.length() > 0) {
                    jSONObject2.put("by", l);
                }
            } catch (Exception e2) {
                UMCrashManager.reportCrash(applicationContext, e2);
            }
            try {
                m22286a(applicationContext, jSONObject2);
            } catch (Exception e3) {
                UMCrashManager.reportCrash(applicationContext, e3);
            }
            try {
                m22290b(applicationContext, jSONObject2);
            } catch (Exception e4) {
                UMCrashManager.reportCrash(applicationContext, e4);
            }
            try {
                JSONObject a = m22284a();
                if (a != null && a.length() > 0) {
                    jSONObject2.put(JsonPOJOBuilder.DEFAULT_BUILD_METHOD, a);
                }
            } catch (Exception e5) {
                UMCrashManager.reportCrash(applicationContext, e5);
            }
            try {
                JSONObject e6 = m22293e(applicationContext);
                if (e6 != null && e6.length() > 0) {
                    jSONObject2.put("scr", e6);
                }
            } catch (Exception e7) {
                UMCrashManager.reportCrash(applicationContext, e7);
            }
            try {
                JSONObject f = m22294f(applicationContext);
                if (f != null && f.length() > 0) {
                    jSONObject2.put("sinfo", f);
                }
            } catch (Exception e8) {
                UMCrashManager.reportCrash(applicationContext, e8);
            }
            try {
                JSONObject jSONObject3 = new JSONObject();
                JSONArray d = ApplicationLayerUtil.m22312d(applicationContext);
                if (d != null && d.length() > 0) {
                    try {
                        jSONObject3.put("wl", d);
                    } catch (JSONException unused) {
                    }
                }
                jSONObject2.put("winfo", jSONObject3);
            } catch (Exception e9) {
                UMCrashManager.reportCrash(applicationContext, e9);
            }
            try {
                JSONArray g = m22295g(applicationContext);
                if (g != null && g.length() > 0) {
                    jSONObject2.put("input", g);
                }
            } catch (Exception e10) {
                UMCrashManager.reportCrash(applicationContext, e10);
            }
            try {
                if (FieldManager.allow(UMConstant.f17915af)) {
                    JSONArray h = m22296h(applicationContext);
                    if (h != null && h.length() > 0) {
                        jSONObject2.put("appls", h);
                    }
                }
            } catch (Exception e11) {
                UMCrashManager.reportCrash(applicationContext, e11);
            }
            try {
                JSONObject i = m22297i(applicationContext);
                if (i != null && i.length() > 0) {
                    jSONObject2.put("mem", i);
                }
            } catch (Exception e12) {
                UMCrashManager.reportCrash(applicationContext, e12);
            }
            try {
                JSONObject b = m22288b();
                if (b != null && b.length() > 0) {
                    jSONObject2.put(UMCommonContent.f16661w, b);
                }
            } catch (Exception unused2) {
            }
            try {
                jSONObject.put(UMCommonContent.f16621as, jSONObject2);
            } catch (JSONException e13) {
                UMCrashManager.reportCrash(applicationContext, e13);
            }
        }
        return jSONObject;
    }

    /* renamed from: e */
    public static JSONObject m22293e(Context context) {
        JSONObject jSONObject = new JSONObject();
        if (context != null) {
            try {
                jSONObject.put("a_st_h", ApplicationLayerUtil.m22317g(context));
                jSONObject.put("a_nav_h", ApplicationLayerUtil.m22318h(context));
                if (context.getResources() != null) {
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    if (displayMetrics != null) {
                        jSONObject.put("a_den", (double) displayMetrics.density);
                        jSONObject.put("a_dpi", displayMetrics.densityDpi);
                    }
                }
            } catch (Exception e) {
                UMCrashManager.reportCrash(context, e);
            }
        }
        return jSONObject;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:2|3|4|5|(3:7|8|9)(1:10)|11|(3:13|14|15)|16|17|(3:19|20|21)|22|24|25) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0081 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008b  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject m22294f(android.content.Context r5) {
        /*
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            if (r5 == 0) goto L_0x00a7
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r2 = "a_fit"
            long r3 = com.umeng.commonsdk.internal.utils.ApplicationLayerUtil.m22302a(r5, r1)     // Catch:{ Exception -> 0x00a3 }
            r0.put(r2, r3)     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r2 = "a_alut"
            long r3 = com.umeng.commonsdk.internal.utils.ApplicationLayerUtil.m22304b(r5, r1)     // Catch:{ Exception -> 0x00a3 }
            r0.put(r2, r3)     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r2 = "a_c"
            java.lang.String r3 = com.umeng.commonsdk.internal.utils.ApplicationLayerUtil.m22308c(r5, r1)     // Catch:{ Exception -> 0x00a3 }
            r0.put(r2, r3)     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r2 = "a_uid"
            int r1 = com.umeng.commonsdk.internal.utils.ApplicationLayerUtil.m22310d(r5, r1)     // Catch:{ Exception -> 0x00a3 }
            r0.put(r2, r1)     // Catch:{ Exception -> 0x00a3 }
            boolean r1 = com.umeng.commonsdk.internal.utils.ApplicationLayerUtil.m22303a()     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r2 = "a_root"
            if (r1 == 0) goto L_0x0040
            r1 = 1
            r0.put(r2, r1)     // Catch:{ Exception -> 0x00a3 }
            goto L_0x0044
        L_0x0040:
            r1 = 0
            r0.put(r2, r1)     // Catch:{ Exception -> 0x00a3 }
        L_0x0044:
            java.lang.String r1 = "tf"
            java.lang.String r2 = com.umeng.commonsdk.internal.utils.ApplicationLayerUtil.m22306b()     // Catch:{ Exception -> 0x00a3 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r1 = "s_fs"
            float r2 = com.umeng.commonsdk.internal.utils.ApplicationLayerUtil.m22301a(r5)     // Catch:{ Exception -> 0x00a3 }
            double r2 = (double) r2     // Catch:{ Exception -> 0x00a3 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r1 = "a_meid"
            java.lang.String r2 = com.umeng.commonsdk.statistics.common.DeviceConfig.getMeid(r5)     // Catch:{ Exception -> 0x00a3 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r1 = "a_imsi"
            java.lang.String r2 = com.umeng.commonsdk.statistics.common.DeviceConfig.getImsi(r5)     // Catch:{ Exception -> 0x00a3 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r1 = "st"
            long r2 = com.umeng.commonsdk.internal.utils.ApplicationLayerUtil.m22311d()     // Catch:{ Exception -> 0x00a3 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r1 = com.umeng.commonsdk.statistics.common.DeviceConfig.getSimICCID(r5)     // Catch:{ Exception -> 0x00a3 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x00a3 }
            if (r2 != 0) goto L_0x0081
            java.lang.String r2 = "a_iccid"
            r0.put(r2, r1)     // Catch:{ Exception -> 0x0081 }
        L_0x0081:
            java.lang.String r1 = com.umeng.commonsdk.statistics.common.DeviceConfig.getSecondSimIMEi(r5)     // Catch:{ Exception -> 0x00a3 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x00a3 }
            if (r2 != 0) goto L_0x0090
            java.lang.String r2 = "a_simei"
            r0.put(r2, r1)     // Catch:{ Exception -> 0x0090 }
        L_0x0090:
            java.lang.String r1 = "hn"
            java.lang.String r2 = com.umeng.commonsdk.internal.utils.ApplicationLayerUtil.m22313e()     // Catch:{ Exception -> 0x00a3 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r1 = "ts"
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00a3 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x00a3 }
            goto L_0x00a7
        L_0x00a3:
            r1 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r1)
        L_0x00a7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.internal.UMInternalManager.m22294f(android.content.Context):org.json.JSONObject");
    }

    /* renamed from: g */
    public static JSONArray m22295g(Context context) {
        JSONArray jSONArray = new JSONArray();
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            List<InputMethodInfo> j = ApplicationLayerUtil.m22320j(applicationContext);
            if (j != null) {
                for (InputMethodInfo inputMethodInfo : j) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("a_id", inputMethodInfo.getId());
                        jSONObject.put("a_pn", inputMethodInfo.getPackageName());
                        jSONObject.put("ts", System.currentTimeMillis());
                        jSONArray.put(jSONObject);
                    } catch (Throwable th) {
                        UMCrashManager.reportCrash(applicationContext, th);
                    }
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: h */
    public static JSONArray m22296h(Context context) {
        JSONArray jSONArray = new JSONArray();
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            List<C3201a> k = ApplicationLayerUtil.m22321k(applicationContext);
            if (k != null && !k.isEmpty()) {
                for (C3201a aVar : k) {
                    if (aVar != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("a_pn", aVar.f17537a);
                            jSONObject.put("a_la", aVar.f17538b);
                            jSONObject.put("ts", System.currentTimeMillis());
                            jSONArray.put(jSONObject);
                        } catch (Exception e) {
                            UMCrashManager.reportCrash(applicationContext, e);
                        }
                    }
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: i */
    public static JSONObject m22297i(Context context) {
        JSONObject jSONObject = new JSONObject();
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            MemoryInfo l = ApplicationLayerUtil.m22322l(applicationContext);
            if (l != null) {
                try {
                    if (VERSION.SDK_INT >= 16) {
                        jSONObject.put(UMCommonContent.f16582aF, l.totalMem);
                    }
                    jSONObject.put("f", l.availMem);
                    jSONObject.put("ts", System.currentTimeMillis());
                } catch (Exception e) {
                    UMCrashManager.reportCrash(applicationContext, e);
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: j */
    private static void m22298j(Context context) {
        try {
            if (UMEnvelopeBuild.isReadyBuild(context, UMBusinessType.U_INTERNAL)) {
                UMWorkDispatch.sendEvent(context, UMInternalConfig.f17498f, UMInternalData.m22265a(context).mo19254a(), null);
            }
            UMRTLog.m22228e(UMRTLog.RTLOG_TAG, "--->>> 冷启动：5秒后触发2号数据仓遗留信封检查动作。");
            UMWorkDispatch.sendEvent(context, UMInternalConfig.f17514v, UMInternalData.m22265a(context).mo19254a(), null, 5000);
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00a5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00af */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static org.json.JSONArray m22299k(android.content.Context r7) {
        /*
            r0 = 0
            if (r7 == 0) goto L_0x00c2
            android.content.Context r1 = r7.getApplicationContext()     // Catch:{ all -> 0x00be }
            java.lang.String r2 = "activity"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch:{ all -> 0x00be }
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch:{ all -> 0x00be }
            if (r1 == 0) goto L_0x00c2
            r2 = 2147483647(0x7fffffff, float:NaN)
            java.util.List r1 = r1.getRunningServices(r2)     // Catch:{ all -> 0x00be }
            if (r1 == 0) goto L_0x00c2
            boolean r2 = r1.isEmpty()     // Catch:{ all -> 0x00be }
            if (r2 != 0) goto L_0x00c2
            r2 = 0
        L_0x0021:
            int r3 = r1.size()     // Catch:{ all -> 0x00be }
            if (r2 >= r3) goto L_0x0090
            java.lang.Object r3 = r1.get(r2)     // Catch:{ all -> 0x00be }
            if (r3 == 0) goto L_0x008d
            java.lang.Object r3 = r1.get(r2)     // Catch:{ all -> 0x00be }
            android.app.ActivityManager$RunningServiceInfo r3 = (android.app.ActivityManager.RunningServiceInfo) r3     // Catch:{ all -> 0x00be }
            android.content.ComponentName r3 = r3.service     // Catch:{ all -> 0x00be }
            if (r3 == 0) goto L_0x008d
            java.lang.Object r3 = r1.get(r2)     // Catch:{ all -> 0x00be }
            android.app.ActivityManager$RunningServiceInfo r3 = (android.app.ActivityManager.RunningServiceInfo) r3     // Catch:{ all -> 0x00be }
            android.content.ComponentName r3 = r3.service     // Catch:{ all -> 0x00be }
            java.lang.String r3 = r3.getClassName()     // Catch:{ all -> 0x00be }
            if (r3 == 0) goto L_0x008d
            java.lang.Object r3 = r1.get(r2)     // Catch:{ all -> 0x00be }
            android.app.ActivityManager$RunningServiceInfo r3 = (android.app.ActivityManager.RunningServiceInfo) r3     // Catch:{ all -> 0x00be }
            android.content.ComponentName r3 = r3.service     // Catch:{ all -> 0x00be }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ all -> 0x00be }
            if (r3 == 0) goto L_0x008d
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x008d }
            r3.<init>()     // Catch:{ JSONException -> 0x008d }
            java.lang.String r4 = "sn"
            java.lang.Object r5 = r1.get(r2)     // Catch:{ JSONException -> 0x008d }
            android.app.ActivityManager$RunningServiceInfo r5 = (android.app.ActivityManager.RunningServiceInfo) r5     // Catch:{ JSONException -> 0x008d }
            android.content.ComponentName r5 = r5.service     // Catch:{ JSONException -> 0x008d }
            java.lang.String r5 = r5.getClassName()     // Catch:{ JSONException -> 0x008d }
            java.lang.String r5 = r5.toString()     // Catch:{ JSONException -> 0x008d }
            r3.put(r4, r5)     // Catch:{ JSONException -> 0x008d }
            java.lang.String r4 = "pn"
            java.lang.Object r5 = r1.get(r2)     // Catch:{ JSONException -> 0x008d }
            android.app.ActivityManager$RunningServiceInfo r5 = (android.app.ActivityManager.RunningServiceInfo) r5     // Catch:{ JSONException -> 0x008d }
            android.content.ComponentName r5 = r5.service     // Catch:{ JSONException -> 0x008d }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ JSONException -> 0x008d }
            java.lang.String r5 = r5.toString()     // Catch:{ JSONException -> 0x008d }
            r3.put(r4, r5)     // Catch:{ JSONException -> 0x008d }
            if (r0 != 0) goto L_0x008a
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ JSONException -> 0x008d }
            r4.<init>()     // Catch:{ JSONException -> 0x008d }
            r0 = r4
        L_0x008a:
            r0.put(r3)     // Catch:{ JSONException -> 0x008d }
        L_0x008d:
            int r2 = r2 + 1
            goto L_0x0021
        L_0x0090:
            if (r0 == 0) goto L_0x00c2
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x00be }
            r1.<init>()     // Catch:{ all -> 0x00be }
            java.lang.String r2 = "ts"
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x00a5 }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x00a5 }
            java.lang.String r2 = "ls"
            r1.put(r2, r0)     // Catch:{ JSONException -> 0x00a5 }
        L_0x00a5:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x00be }
            r2.<init>()     // Catch:{ all -> 0x00be }
            java.lang.String r3 = "sers"
            r2.put(r3, r1)     // Catch:{ JSONException -> 0x00af }
        L_0x00af:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ all -> 0x00be }
            r1.<init>()     // Catch:{ all -> 0x00be }
            r1.put(r2)     // Catch:{ all -> 0x00b9 }
            r0 = r1
            goto L_0x00c2
        L_0x00b9:
            r0 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
            goto L_0x00bf
        L_0x00be:
            r1 = move-exception
        L_0x00bf:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r7, r1)
        L_0x00c2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.internal.UMInternalManager.m22299k(android.content.Context):org.json.JSONArray");
    }

    /* renamed from: l */
    private static JSONArray m22300l(Context context) {
        JSONArray jSONArray = new JSONArray();
        String a = UMInternalUtils.m22361a(context);
        if (!TextUtils.isEmpty(a)) {
            try {
                jSONArray.put(new JSONObject(a));
            } catch (Exception unused) {
            }
        }
        return jSONArray;
    }

    /* renamed from: b */
    private static JSONObject m22288b() {
        String str = "rev";
        try {
            C3207a a = CpuUtil.m22341a();
            if (a == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("pro", a.f17564a);
                jSONObject.put("pla", a.f17565b);
                jSONObject.put("cpus", a.f17566c);
                jSONObject.put("fea", a.f17567d);
                jSONObject.put("imp", a.f17568e);
                jSONObject.put("arc", a.f17569f);
                jSONObject.put("var", a.f17570g);
                jSONObject.put("par", a.f17571h);
                jSONObject.put(str, a.f17572i);
                jSONObject.put("har", a.f17573j);
                jSONObject.put(str, a.f17574k);
                jSONObject.put("ser", a.f17575l);
                jSONObject.put("cur_cpu", CpuUtil.m22344d());
                jSONObject.put("max_cpu", CpuUtil.m22342b());
                jSONObject.put("min_cpu", CpuUtil.m22343c());
                jSONObject.put("ts", System.currentTimeMillis());
            } catch (Exception unused) {
            }
            return jSONObject;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: a */
    private static void m22286a(Context context, JSONObject jSONObject) {
        if (context != null) {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            if (packageManager != null) {
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                m22287a(jSONObject, "gp", packageManager.hasSystemFeature("android.hardware.location.gps"));
                m22287a(jSONObject, "to", packageManager.hasSystemFeature("android.hardware.touchscreen"));
                m22287a(jSONObject, "mo", packageManager.hasSystemFeature("android.hardware.telephony"));
                m22287a(jSONObject, "ca", packageManager.hasSystemFeature("android.hardware.camera"));
                m22287a(jSONObject, "fl", packageManager.hasSystemFeature("android.hardware.camera.flash"));
            }
        }
    }

    /* renamed from: a */
    private static void m22287a(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject != null && !TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    jSONObject.put(str, 1);
                } catch (Exception unused) {
                }
            } else {
                jSONObject.put(str, 0);
            }
        }
    }

    /* renamed from: a */
    public static JSONObject m22284a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("a_pr", Build.PRODUCT);
            jSONObject.put("a_bl", Build.BOOTLOADER);
            int i = VERSION.SDK_INT;
            if (i >= 14) {
                jSONObject.put("a_rv", Build.getRadioVersion());
            }
            jSONObject.put("a_fp", Build.FINGERPRINT);
            jSONObject.put("a_hw", Build.HARDWARE);
            jSONObject.put("a_host", Build.HOST);
            int i2 = 0;
            if (i >= 21) {
                JSONArray jSONArray = new JSONArray();
                int i3 = 0;
                while (true) {
                    String[] strArr = Build.SUPPORTED_32_BIT_ABIS;
                    if (i3 >= strArr.length) {
                        break;
                    }
                    jSONArray.put(strArr[i3]);
                    i3++;
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put("a_s32", jSONArray);
                }
            }
            if (VERSION.SDK_INT >= 21) {
                JSONArray jSONArray2 = new JSONArray();
                int i4 = 0;
                while (true) {
                    String[] strArr2 = Build.SUPPORTED_64_BIT_ABIS;
                    if (i4 >= strArr2.length) {
                        break;
                    }
                    jSONArray2.put(strArr2[i4]);
                    i4++;
                }
                if (jSONArray2.length() > 0) {
                    jSONObject.put("a_s64", jSONArray2);
                }
            }
            if (VERSION.SDK_INT >= 21) {
                JSONArray jSONArray3 = new JSONArray();
                while (true) {
                    String[] strArr3 = Build.SUPPORTED_ABIS;
                    if (i2 >= strArr3.length) {
                        break;
                    }
                    jSONArray3.put(strArr3[i2]);
                    i2++;
                }
                if (jSONArray3.length() > 0) {
                    jSONObject.put("a_sa", jSONArray3);
                }
            }
            jSONObject.put("a_ta", Build.TAGS);
            jSONObject.put("a_uk", "unknown");
            jSONObject.put("a_user", Build.USER);
            jSONObject.put("a_cpu1", Build.CPU_ABI);
            jSONObject.put("a_cpu2", Build.CPU_ABI2);
            jSONObject.put("a_ra", Build.RADIO);
            if (VERSION.SDK_INT >= 23) {
                jSONObject.put("a_bos", VERSION.BASE_OS);
                jSONObject.put("a_pre", VERSION.PREVIEW_SDK_INT);
                jSONObject.put("a_sp", VERSION.SECURITY_PATCH);
            }
            jSONObject.put("a_cn", VERSION.CODENAME);
            jSONObject.put("a_intl", VERSION.INCREMENTAL);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: b */
    private static void m22290b(Context context, JSONObject jSONObject) {
        String str = UMProbe.f17601b;
        String str2 = UMProbe.f17602c;
        String str3 = UMProbe.f17603d;
        if (context != null) {
            String a = UMProbe.m22365a(context);
            if (!TextUtils.isEmpty(a)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(a);
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    if (jSONObject2.has(str3)) {
                        jSONObject.put(str3, jSONObject2.opt(str3));
                    }
                    if (jSONObject2.has(str2)) {
                        jSONObject.put(str2, jSONObject2.opt(str2));
                    }
                    if (jSONObject2.has(str)) {
                        jSONObject.put(str, jSONObject2.opt(str));
                    }
                } catch (Exception unused) {
                }
            }
        }
    }
}
