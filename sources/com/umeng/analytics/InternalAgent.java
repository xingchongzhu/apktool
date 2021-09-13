package com.umeng.analytics;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.umeng.analytics.MobclickAgent.EScenarioType;
import com.umeng.analytics.MobclickAgent.PageMode;
import com.umeng.analytics.filter.EventBlackList;
import com.umeng.analytics.filter.EventWhiteList;
import com.umeng.analytics.pro.ActivityManualPageTracker;
import com.umeng.analytics.pro.AutoViewPageTracker;
import com.umeng.analytics.pro.BackgroundMonitor;
import com.umeng.analytics.pro.BackgroundWatcher;
import com.umeng.analytics.pro.CoreProtocolImpl;
import com.umeng.analytics.pro.CoreProtocolImpl.C3149a;
import com.umeng.analytics.pro.CrashHandler;
import com.umeng.analytics.pro.EventTracker;
import com.umeng.analytics.pro.OnAppCrashHandler;
import com.umeng.analytics.pro.SessionIdManager;
import com.umeng.analytics.pro.SessionTracker;
import com.umeng.analytics.pro.UContent;
import com.umeng.analytics.pro.UMLogAnalytics;
import com.umeng.analytics.pro.UMStoreManager;
import com.umeng.analytics.pro.ViewPageTracker;
import com.umeng.common.ISysListener;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMConstant;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.microedition.khronos.opengles.GL10;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.b */
public class InternalAgent implements BackgroundWatcher, OnAppCrashHandler {

    /* renamed from: A */
    private static final String f16488A = "umsp_2";

    /* renamed from: B */
    private static final String f16489B = "umsp_3";

    /* renamed from: C */
    private static final String f16490C = "umsp_4";

    /* renamed from: D */
    private static final String f16491D = "umsp_5";

    /* renamed from: a */
    private static Context f16492a = null;

    /* renamed from: h */
    private static final String f16493h = "sp_uapp";

    /* renamed from: i */
    private static final String f16494i = "prepp_uapp";

    /* renamed from: o */
    private static final int f16495o = 128;

    /* renamed from: p */
    private static final int f16496p = 256;

    /* renamed from: q */
    private static String f16497q = "";

    /* renamed from: r */
    private static String f16498r = "";

    /* renamed from: s */
    private static final String f16499s = "ekv_bl";

    /* renamed from: t */
    private static final String f16500t = "ekv_bl_ver";

    /* renamed from: v */
    private static final String f16501v = "ekv_wl";

    /* renamed from: w */
    private static final String f16502w = "ekv_wl_ver";

    /* renamed from: z */
    private static final String f16503z = "umsp_1";

    /* renamed from: b */
    private ISysListener f16504b;

    /* renamed from: c */
    private CrashHandler f16505c;

    /* renamed from: d */
    private ViewPageTracker f16506d;

    /* renamed from: e */
    private ActivityManualPageTracker f16507e;

    /* renamed from: f */
    private SessionTracker f16508f;

    /* renamed from: g */
    private AutoViewPageTracker f16509g;

    /* renamed from: j */
    private boolean f16510j;

    /* renamed from: k */
    private volatile JSONObject f16511k;

    /* renamed from: l */
    private volatile JSONObject f16512l;

    /* renamed from: m */
    private volatile JSONObject f16513m;

    /* renamed from: n */
    private boolean f16514n;

    /* renamed from: u */
    private EventBlackList f16515u;

    /* renamed from: x */
    private EventWhiteList f16516x;

    /* renamed from: y */
    private BackgroundMonitor f16517y;

    /* renamed from: com.umeng.analytics.b$a */
    /* compiled from: InternalAgent */
    private static class C3101a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final InternalAgent f16518a = new InternalAgent();

        private C3101a() {
        }
    }

    static {
        Context appContext = UMGlobalContext.getAppContext();
        if (appContext != null) {
            f16492a = appContext.getApplicationContext();
        }
    }

    /* renamed from: a */
    public static InternalAgent m21414a() {
        return C3101a.f16518a;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:5|(1:7)|8|(1:10)|11|(1:13)|14|(2:16|17)|18|19|(1:21)|22) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0040 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044 A[Catch:{ all -> 0x004b }] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m21419i(android.content.Context r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0008
            java.lang.String r3 = "unexpected null context in getNativeSuperProperties"
            com.umeng.commonsdk.statistics.common.MLog.m22443e(r3)     // Catch:{ all -> 0x004b }
            return
        L_0x0008:
            android.content.Context r0 = f16492a     // Catch:{ all -> 0x004b }
            if (r0 != 0) goto L_0x0012
            android.content.Context r0 = r3.getApplicationContext()     // Catch:{ all -> 0x004b }
            f16492a = r0     // Catch:{ all -> 0x004b }
        L_0x0012:
            android.content.SharedPreferences r3 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r3)     // Catch:{ all -> 0x004b }
            org.json.JSONObject r0 = r2.f16511k     // Catch:{ all -> 0x004b }
            if (r0 != 0) goto L_0x0021
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x004b }
            r0.<init>()     // Catch:{ all -> 0x004b }
            r2.f16511k = r0     // Catch:{ all -> 0x004b }
        L_0x0021:
            org.json.JSONObject r0 = r2.f16512l     // Catch:{ all -> 0x004b }
            if (r0 != 0) goto L_0x002c
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x004b }
            r0.<init>()     // Catch:{ all -> 0x004b }
            r2.f16512l = r0     // Catch:{ all -> 0x004b }
        L_0x002c:
            java.lang.String r0 = "prepp_uapp"
            r1 = 0
            java.lang.String r3 = r3.getString(r0, r1)     // Catch:{ all -> 0x004b }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x004b }
            if (r0 != 0) goto L_0x0040
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0040 }
            r0.<init>(r3)     // Catch:{ JSONException -> 0x0040 }
            r2.f16513m = r0     // Catch:{ JSONException -> 0x0040 }
        L_0x0040:
            org.json.JSONObject r3 = r2.f16513m     // Catch:{ all -> 0x004b }
            if (r3 != 0) goto L_0x004b
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ all -> 0x004b }
            r3.<init>()     // Catch:{ all -> 0x004b }
            r2.f16513m = r3     // Catch:{ all -> 0x004b }
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.InternalAgent.m21419i(android.content.Context):void");
    }

    /* renamed from: b */
    public JSONObject mo18810b() {
        return this.f16511k;
    }

    /* renamed from: c */
    public JSONObject mo18815c() {
        return this.f16513m;
    }

    /* renamed from: d */
    public JSONObject mo18818d() {
        return this.f16512l;
    }

    /* renamed from: e */
    public void mo18823e() {
        this.f16512l = null;
    }

    /* renamed from: f */
    public String mo18824f() {
        if (UMUtils.isMainProgress(f16492a)) {
            return f16497q;
        }
        MLog.m22443e("getOnResumedActivityName can not be called in child process");
        return null;
    }

    /* renamed from: g */
    public String mo18827g() {
        if (UMUtils.isMainProgress(f16492a)) {
            return f16498r;
        }
        MLog.m22443e("getOnPausedActivityName can not be called in child process");
        return null;
    }

    /* renamed from: h */
    public void mo18830h() {
        try {
            Context context = f16492a;
            if (context != null) {
                if (!UMUtils.isMainProgress(context)) {
                    MLog.m22443e("onStartSessionInternal can not be called in child process");
                    return;
                }
                if (UMConfigure.isDebugLog() && !UMConfigure.getInitStatus()) {
                    UMLog.mutlInfo(UMLogAnalytics.f17066H, 3, "", null, null);
                }
                long currentTimeMillis = System.currentTimeMillis();
                Context context2 = f16492a;
                UMWorkDispatch.sendEvent(context2, 4352, CoreProtocol.getInstance(context2), Long.valueOf(currentTimeMillis));
                Context context3 = f16492a;
                UMWorkDispatch.sendEvent(context3, C3149a.f17191g, CoreProtocol.getInstance(context3), Long.valueOf(currentTimeMillis));
            }
            ISysListener iSysListener = this.f16504b;
            if (iSysListener != null) {
                iSysListener.onAppResume();
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo18832j() {
        try {
            Context context = f16492a;
            if (context != null) {
                if (!UMUtils.isMainProgress(context)) {
                    MLog.m22443e("onProfileSignOff can not be called in child process");
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ts", currentTimeMillis);
                Context context2 = f16492a;
                UMWorkDispatch.sendEvent(context2, C3149a.f17190f, CoreProtocol.getInstance(context2), jSONObject);
                Context context3 = f16492a;
                UMWorkDispatch.sendEvent(context3, C3149a.f17199o, CoreProtocol.getInstance(context3), jSONObject);
            }
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m22445e(" Excepthon  in  onProfileSignOff", th);
            }
        }
    }

    /* renamed from: k */
    public synchronized void mo18833k() {
        try {
            Context context = f16492a;
            if (context != null) {
                if (!UMUtils.isMainProgress(context)) {
                    MLog.m22443e("unregisterSuperPropertyByCoreProtocol can not be called in child process");
                } else if (this.f16511k != null) {
                    Editor edit = PreferenceWrapper.getDefault(f16492a).edit();
                    edit.putString(f16493h, this.f16511k.toString());
                    edit.commit();
                } else {
                    this.f16511k = new JSONObject();
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0020 */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized org.json.JSONObject mo18834l() {
        /*
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = f16492a     // Catch:{ all -> 0x0020 }
            r1 = 0
            if (r0 != 0) goto L_0x0008
            monitor-exit(r2)
            return r1
        L_0x0008:
            boolean r0 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r0)     // Catch:{ all -> 0x0020 }
            if (r0 != 0) goto L_0x0015
            java.lang.String r0 = "getSuperPropertiesJSONObject can not be called in child process"
            com.umeng.commonsdk.statistics.common.MLog.m22443e(r0)     // Catch:{ all -> 0x0020 }
            monitor-exit(r2)
            return r1
        L_0x0015:
            org.json.JSONObject r0 = r2.f16511k     // Catch:{ all -> 0x0020 }
            if (r0 != 0) goto L_0x0020
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x0020 }
            r0.<init>()     // Catch:{ all -> 0x0020 }
            r2.f16511k = r0     // Catch:{ all -> 0x0020 }
        L_0x0020:
            org.json.JSONObject r0 = r2.f16511k     // Catch:{ all -> 0x0024 }
            monitor-exit(r2)
            return r0
        L_0x0024:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.InternalAgent.mo18834l():org.json.JSONObject");
    }

    /* renamed from: m */
    public synchronized void mo18835m() {
        try {
            Context context = f16492a;
            if (context != null) {
                if (!UMUtils.isMainProgress(context)) {
                    MLog.m22443e("clearSuperPropertiesByCoreProtocol can not be called in child process");
                    return;
                }
                Editor edit = PreferenceWrapper.getDefault(f16492a).edit();
                edit.remove(f16493h);
                edit.commit();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: n */
    public void mo18836n() {
        String str = UMRTLog.RTLOG_TAG;
        UMRTLog.m22229i(str, "--->>> onIntoBackground triggered.");
        if (AnalyticsConfig.enable && FieldManager.m22200b()) {
            if (!FieldManager.allow(UMConstant.f17886D)) {
                UMRTLog.m22229i(str, "--->>> 退出发送策略: 云控控制字关闭。功能不生效");
            } else if (!UMWorkDispatch.eventHasExist(C3149a.f17210z)) {
                UMRTLog.m22229i(str, "--->>> 退出时发送策略 被触发！");
                Context context = f16492a;
                UMWorkDispatch.sendEvent(context, C3149a.f17210z, CoreProtocol.getInstance(context), null);
            }
        }
    }

    private InternalAgent() {
        this.f16505c = new CrashHandler();
        this.f16506d = new ViewPageTracker();
        this.f16507e = new ActivityManualPageTracker();
        this.f16508f = SessionTracker.m22097a();
        this.f16509g = null;
        this.f16510j = false;
        this.f16511k = null;
        this.f16512l = null;
        this.f16513m = null;
        this.f16514n = false;
        this.f16515u = null;
        this.f16516x = null;
        this.f16517y = null;
        this.f16505c.mo19159a((OnAppCrashHandler) this);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:21|22|(5:24|(1:26)|27|28|29)|30|31) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0071 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18790a(android.content.Context r4) {
        /*
            r3 = this;
            if (r4 != 0) goto L_0x0003
            return
        L_0x0003:
            android.content.Context r0 = f16492a     // Catch:{ all -> 0x0090 }
            if (r0 != 0) goto L_0x000d
            android.content.Context r0 = r4.getApplicationContext()     // Catch:{ all -> 0x0090 }
            f16492a = r0     // Catch:{ all -> 0x0090 }
        L_0x000d:
            com.umeng.analytics.filter.a r0 = r3.f16515u     // Catch:{ all -> 0x0090 }
            if (r0 != 0) goto L_0x0021
            com.umeng.analytics.filter.a r0 = new com.umeng.analytics.filter.a     // Catch:{ all -> 0x0090 }
            java.lang.String r1 = "ekv_bl"
            java.lang.String r2 = "ekv_bl_ver"
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0090 }
            r3.f16515u = r0     // Catch:{ all -> 0x0090 }
            android.content.Context r1 = f16492a     // Catch:{ all -> 0x0090 }
            r0.register(r1)     // Catch:{ all -> 0x0090 }
        L_0x0021:
            com.umeng.analytics.filter.b r0 = r3.f16516x     // Catch:{ all -> 0x0090 }
            if (r0 != 0) goto L_0x0035
            com.umeng.analytics.filter.b r0 = new com.umeng.analytics.filter.b     // Catch:{ all -> 0x0090 }
            java.lang.String r1 = "ekv_wl"
            java.lang.String r2 = "ekv_wl_ver"
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0090 }
            r3.f16516x = r0     // Catch:{ all -> 0x0090 }
            android.content.Context r1 = f16492a     // Catch:{ all -> 0x0090 }
            r0.register(r1)     // Catch:{ all -> 0x0090 }
        L_0x0035:
            android.content.Context r0 = f16492a     // Catch:{ all -> 0x0090 }
            boolean r0 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r0)     // Catch:{ all -> 0x0090 }
            if (r0 != 0) goto L_0x003e
            return
        L_0x003e:
            boolean r0 = r3.f16510j     // Catch:{ all -> 0x0090 }
            r1 = 1
            if (r0 != 0) goto L_0x004a
            r3.f16510j = r1     // Catch:{ all -> 0x0090 }
            android.content.Context r0 = f16492a     // Catch:{ all -> 0x0090 }
            r3.m21419i(r0)     // Catch:{ all -> 0x0090 }
        L_0x004a:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0090 }
            r2 = 13
            if (r0 <= r2) goto L_0x0076
            monitor-enter(r3)     // Catch:{ all -> 0x0090 }
            boolean r0 = r3.f16514n     // Catch:{ all -> 0x0073 }
            if (r0 != 0) goto L_0x0071
            com.umeng.analytics.pro.k r0 = com.umeng.analytics.pro.AutoViewPageTracker.m21976a(r4)     // Catch:{ all -> 0x0073 }
            r3.f16509g = r0     // Catch:{ all -> 0x0073 }
            boolean r0 = r0.mo19112a()     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x0063
            r3.f16514n = r1     // Catch:{ all -> 0x0073 }
        L_0x0063:
            com.umeng.analytics.pro.l r0 = com.umeng.analytics.pro.BackgroundMonitor.m21998a()     // Catch:{ all -> 0x0073 }
            r3.f16517y = r0     // Catch:{ all -> 0x0073 }
            com.umeng.analytics.pro.BackgroundMonitor.m21999a(r4)     // Catch:{ all -> 0x0071 }
            com.umeng.analytics.pro.l r4 = r3.f16517y     // Catch:{ all -> 0x0071 }
            r4.mo19123a(r3)     // Catch:{ all -> 0x0071 }
        L_0x0071:
            monitor-exit(r3)     // Catch:{ all -> 0x0073 }
            goto L_0x0078
        L_0x0073:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0073 }
            throw r4     // Catch:{ all -> 0x0090 }
        L_0x0076:
            r3.f16514n = r1     // Catch:{ all -> 0x0090 }
        L_0x0078:
            boolean r4 = com.umeng.commonsdk.UMConfigure.isDebugLog()     // Catch:{ all -> 0x0090 }
            if (r4 == 0) goto L_0x0087
            java.lang.String r4 = "统计SDK常见问题索引贴 详见链接 http://developer.umeng.com/docs/66650/cate/66650"
            r0 = 3
            java.lang.String r1 = ""
            r2 = 0
            com.umeng.commonsdk.debug.UMLog.mutlInfo(r4, r0, r1, r2, r2)     // Catch:{ all -> 0x0090 }
        L_0x0087:
            android.content.Context r4 = f16492a     // Catch:{ all -> 0x0090 }
            com.umeng.analytics.CoreProtocol r4 = com.umeng.analytics.CoreProtocol.getInstance(r4)     // Catch:{ all -> 0x0090 }
            com.umeng.commonsdk.framework.UMWorkDispatch.registerConnStateObserver(r4)     // Catch:{ all -> 0x0090 }
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.InternalAgent.mo18790a(android.content.Context):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo18814b(String str) {
        if (!UMUtils.isMainProgress(f16492a)) {
            MLog.m22443e("onPageEnd can not be called in child process");
            return;
        }
        try {
            if (AutoViewPageTracker.f17130b != PageMode.LEGACY_AUTO) {
                this.f16506d.mo19182b(str);
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo18816c(Context context) {
        String str = "\\|";
        if (context == null) {
            UMLog.m22222aq(UMLogAnalytics.f17118p, 0, str);
        } else if (AutoViewPageTracker.f17130b != PageMode.AUTO) {
            if (f16492a == null) {
                f16492a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f16492a)) {
                MLog.m22443e("onPause can not be called in child process");
                return;
            }
            if (UMConfigure.isDebugLog() && !(context instanceof Activity)) {
                UMLog.m22222aq(UMLogAnalytics.f17119q, 2, str);
            }
            try {
                if (!this.f16510j || !this.f16514n) {
                    mo18790a(context);
                }
                if (AutoViewPageTracker.f17130b != PageMode.LEGACY_MANUAL) {
                    this.f16507e.mo19182b(context.getClass().getName());
                }
                mo18831i();
            } catch (Throwable th) {
                if (MLog.DEBUG) {
                    MLog.m22445e("Exception occurred in Mobclick.onRause(). ", th);
                }
            }
            if (UMConfigure.isDebugLog() && (context instanceof Activity)) {
                f16498r = context.getClass().getName();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo18819d(Context context) {
        if (context != null) {
            try {
                if (f16492a == null) {
                    f16492a = context.getApplicationContext();
                }
                if (!UMUtils.isMainProgress(f16492a)) {
                    MLog.m22443e("onKillProcess can not be called in child process");
                    return;
                }
                AutoViewPageTracker kVar = this.f16509g;
                if (kVar != null) {
                    kVar.mo19115c();
                }
                AutoViewPageTracker.m21978a(context, "onKillProcess");
                ActivityManualPageTracker jVar = this.f16507e;
                if (jVar != null) {
                    jVar.mo19181b();
                }
                ViewPageTracker uVar = this.f16506d;
                if (uVar != null) {
                    uVar.mo19181b();
                }
                Context context2 = f16492a;
                if (context2 != null) {
                    SessionTracker tVar = this.f16508f;
                    if (tVar != null) {
                        tVar.mo19179c(context2, Long.valueOf(System.currentTimeMillis()));
                    }
                    CoreProtocolImpl.m22007a(f16492a).mo19146d();
                    ViewPageTracker.m22117a(f16492a);
                    if (AutoViewPageTracker.f17130b == PageMode.AUTO) {
                        AutoViewPageTracker.m21986c(f16492a);
                    }
                    PreferenceWrapper.getDefault(f16492a).edit().commit();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: e */
    public synchronized Object mo18821e(Context context, String str) {
        if (context == null) {
            try {
                UMLog.m22222aq(UMLogAnalytics.f17094ai, 0, "\\|");
                return null;
            } catch (Throwable unused) {
            }
        } else {
            if (f16492a == null) {
                f16492a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f16492a)) {
                MLog.m22443e("getSuperProperty can not be called in child process");
                return null;
            } else if (TextUtils.isEmpty(str)) {
                UMLog.m22222aq(UMLogAnalytics.f17092ag, 0, "\\|");
                return null;
            } else if (!str.equals(f16503z) && !str.equals(f16488A) && !str.equals(f16489B) && !str.equals(f16490C) && !str.equals(f16491D)) {
                MLog.m22443e("please check key or value, must be correct!");
                return null;
            } else if (this.f16511k == null) {
                this.f16511k = new JSONObject();
            } else if (this.f16511k.has(str)) {
                return this.f16511k.opt(str);
            }
        }
        return null;
    }

    /* renamed from: f */
    public synchronized void mo18825f(Context context) {
        if (context == null) {
            UMLog.m22222aq(UMLogAnalytics.f17093ah, 0, "\\|");
            return;
        }
        if (f16492a == null) {
            f16492a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f16492a)) {
            MLog.m22443e("clearSuperProperties can not be called in child process");
            return;
        }
        if (!this.f16510j || !this.f16514n) {
            mo18790a(f16492a);
        }
        this.f16511k = new JSONObject();
        Context context2 = f16492a;
        UMWorkDispatch.sendEvent(context2, C3149a.f17203s, CoreProtocol.getInstance(context2), null);
    }

    /* renamed from: g */
    public synchronized void mo18828g(Context context) {
        if (context == null) {
            UMLog.m22222aq(UMLogAnalytics.f17101ap, 0, "\\|");
            return;
        }
        if (f16492a == null) {
            f16492a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f16492a)) {
            MLog.m22443e("clearPreProperties can not be called in child process");
            return;
        }
        if (!this.f16510j || !this.f16514n) {
            mo18790a(f16492a);
        }
        if (this.f16513m.length() > 0) {
            Context context2 = f16492a;
            UMWorkDispatch.sendEvent(context2, C3149a.f17207w, CoreProtocol.getInstance(context2), null);
        }
        this.f16513m = new JSONObject();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo18811b(Context context) {
        if (context == null) {
            MLog.m22443e("unexpected null context in onResume");
        } else if (AutoViewPageTracker.f17130b != PageMode.AUTO) {
            if (f16492a == null) {
                f16492a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f16492a)) {
                MLog.m22443e("onResume can not be called in child process");
                return;
            }
            if (UMConfigure.isDebugLog() && !(context instanceof Activity)) {
                UMLog.m22222aq(UMLogAnalytics.f17117o, 2, "\\|");
            }
            try {
                if (!this.f16510j || !this.f16514n) {
                    mo18790a(context);
                }
                if (AutoViewPageTracker.f17130b != PageMode.LEGACY_MANUAL) {
                    this.f16507e.mo19180a(context.getClass().getName());
                }
                mo18830h();
                if (UMConfigure.isDebugLog() && (context instanceof Activity)) {
                    f16497q = context.getClass().getName();
                }
            } catch (Throwable th) {
                MLog.m22445e("Exception occurred in Mobclick.onResume(). ", th);
            }
        }
    }

    /* renamed from: i */
    public void mo18831i() {
        try {
            Context context = f16492a;
            if (context != null) {
                if (!UMUtils.isMainProgress(context)) {
                    MLog.m22443e("onEndSessionInternal can not be called in child process");
                    return;
                }
                Context context2 = f16492a;
                UMWorkDispatch.sendEvent(context2, C3149a.f17192h, CoreProtocol.getInstance(context2), Long.valueOf(System.currentTimeMillis()));
                Context context3 = f16492a;
                UMWorkDispatch.sendEvent(context3, C3149a.f17188d, CoreProtocol.getInstance(context3), null);
                Context context4 = f16492a;
                UMWorkDispatch.sendEvent(context4, C3149a.f17187c, CoreProtocol.getInstance(context4), null);
                Context context5 = f16492a;
                UMWorkDispatch.sendEvent(context5, C3149a.f17193i, CoreProtocol.getInstance(context5), null);
            }
        } catch (Throwable unused) {
        }
        ISysListener iSysListener = this.f16504b;
        if (iSysListener != null) {
            iSysListener.onAppPause();
        }
    }

    /* renamed from: h */
    public synchronized JSONObject mo18829h(Context context) {
        JSONObject jSONObject;
        if (context == null) {
            UMLog.m22222aq(UMLogAnalytics.f17102aq, 0, "\\|");
            return null;
        }
        if (f16492a == null) {
            f16492a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f16492a)) {
            MLog.m22443e("getPreProperties can not be called in child process");
            return null;
        }
        if (!this.f16510j || !this.f16514n) {
            mo18790a(f16492a);
        }
        if (this.f16513m == null) {
            this.f16513m = new JSONObject();
        }
        jSONObject = new JSONObject();
        if (this.f16513m.length() > 0) {
            try {
                jSONObject = new JSONObject(this.f16513m.toString());
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0074, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo18826f(android.content.Context r3, java.lang.String r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            if (r3 != 0) goto L_0x000d
            java.lang.String r3 = com.umeng.analytics.pro.UMLogAnalytics.f17099an     // Catch:{ all -> 0x007c }
            java.lang.String r4 = "\\|"
            com.umeng.commonsdk.debug.UMLog.m22222aq(r3, r0, r4)     // Catch:{ all -> 0x007c }
            monitor-exit(r2)
            return
        L_0x000d:
            android.content.Context r1 = f16492a     // Catch:{ all -> 0x007c }
            if (r1 != 0) goto L_0x0017
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x007c }
            f16492a = r3     // Catch:{ all -> 0x007c }
        L_0x0017:
            android.content.Context r3 = f16492a     // Catch:{ all -> 0x007c }
            boolean r3 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r3)     // Catch:{ all -> 0x007c }
            if (r3 != 0) goto L_0x0026
            java.lang.String r3 = "unregisterPreProperty can not be called in child process"
            com.umeng.commonsdk.statistics.common.MLog.m22443e(r3)     // Catch:{ all -> 0x007c }
            monitor-exit(r2)
            return
        L_0x0026:
            boolean r3 = r2.f16510j     // Catch:{ all -> 0x007c }
            if (r3 == 0) goto L_0x002e
            boolean r3 = r2.f16514n     // Catch:{ all -> 0x007c }
            if (r3 != 0) goto L_0x0033
        L_0x002e:
            android.content.Context r3 = f16492a     // Catch:{ all -> 0x007c }
            r2.mo18790a(r3)     // Catch:{ all -> 0x007c }
        L_0x0033:
            org.json.JSONObject r3 = r2.f16513m     // Catch:{ all -> 0x007c }
            if (r3 != 0) goto L_0x003e
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ all -> 0x007c }
            r3.<init>()     // Catch:{ all -> 0x007c }
            r2.f16513m = r3     // Catch:{ all -> 0x007c }
        L_0x003e:
            if (r4 == 0) goto L_0x0075
            int r3 = r4.length()     // Catch:{ all -> 0x007c }
            if (r3 > 0) goto L_0x0047
            goto L_0x0075
        L_0x0047:
            org.json.JSONObject r3 = r2.f16513m     // Catch:{ all -> 0x007c }
            boolean r3 = r3.has(r4)     // Catch:{ all -> 0x007c }
            if (r3 == 0) goto L_0x0066
            org.json.JSONObject r3 = r2.f16513m     // Catch:{ all -> 0x007c }
            r3.remove(r4)     // Catch:{ all -> 0x007c }
            android.content.Context r3 = f16492a     // Catch:{ all -> 0x007c }
            r4 = 8200(0x2008, float:1.149E-41)
            com.umeng.analytics.CoreProtocol r0 = com.umeng.analytics.CoreProtocol.getInstance(r3)     // Catch:{ all -> 0x007c }
            org.json.JSONObject r1 = r2.f16513m     // Catch:{ all -> 0x007c }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x007c }
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r3, r4, r0, r1)     // Catch:{ all -> 0x007c }
            goto L_0x0073
        L_0x0066:
            boolean r3 = com.umeng.commonsdk.UMConfigure.isDebugLog()     // Catch:{ all -> 0x007c }
            if (r3 == 0) goto L_0x0073
            java.lang.String r3 = com.umeng.analytics.pro.UMLogAnalytics.f17100ao     // Catch:{ all -> 0x007c }
            java.lang.String r4 = "\\|"
            com.umeng.commonsdk.debug.UMLog.m22222aq(r3, r0, r4)     // Catch:{ all -> 0x007c }
        L_0x0073:
            monitor-exit(r2)
            return
        L_0x0075:
            java.lang.String r3 = "please check propertics, property is null!"
            com.umeng.commonsdk.statistics.common.MLog.m22443e(r3)     // Catch:{ all -> 0x007c }
            monitor-exit(r2)
            return
        L_0x007c:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.InternalAgent.mo18826f(android.content.Context, java.lang.String):void");
    }

    /* renamed from: c */
    private boolean m21418c(String str) {
        if (this.f16515u.enabled() && this.f16515u.matchHit(str)) {
            return true;
        }
        if (!this.f16516x.enabled()) {
            return false;
        }
        if (!this.f16516x.matchHit(str)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("--->>> white list match! id = ");
        sb.append(str);
        UMRTLog.m22229i(UMRTLog.RTLOG_TAG, sb.toString());
        return false;
    }

    /* renamed from: d */
    public synchronized void mo18820d(Context context, String str) {
        if (context == null) {
            try {
                UMLog.m22222aq(UMLogAnalytics.f17093ah, 0, "\\|");
                return;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } else {
            if (f16492a == null) {
                f16492a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f16492a)) {
                MLog.m22443e("unregisterSuperProperty can not be called in child process");
                return;
            }
            if (!this.f16510j || !this.f16514n) {
                mo18790a(f16492a);
            }
            if (TextUtils.isEmpty(str)) {
                UMLog.m22222aq(UMLogAnalytics.f17092ag, 0, "\\|");
                return;
            } else if (str.equals(f16503z) || str.equals(f16488A) || str.equals(f16489B) || str.equals(f16490C) || str.equals(f16491D)) {
                if (this.f16511k == null) {
                    this.f16511k = new JSONObject();
                }
                if (this.f16511k.has(str)) {
                    this.f16511k.remove(str);
                    Context context2 = f16492a;
                    UMWorkDispatch.sendEvent(context2, C3149a.f17204t, CoreProtocol.getInstance(context2), str);
                }
            } else {
                MLog.m22443e("please check key or value, must be correct!");
                return;
            }
        }
        return;
    }

    /* renamed from: b */
    public void mo18812b(Context context, String str) {
        String str2 = "\\|";
        if (context == null) {
            try {
                UMLog.m22222aq(UMLogAnalytics.f17072N, 0, str2);
            } catch (Throwable th) {
                if (MLog.DEBUG) {
                    MLog.m22447e(th);
                }
            }
        } else {
            if (f16492a == null) {
                f16492a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f16492a)) {
                MLog.m22443e("onDeepLinkReceived can not be called in child process");
                return;
            }
            if (!this.f16510j || !this.f16514n) {
                mo18790a(f16492a);
            }
            if (!TextUtils.isEmpty(str)) {
                HashMap hashMap = new HashMap();
                hashMap.put(UContent.f16897aE, str);
                m21415a(f16492a, UContent.f16896aD, (Map<String, Object>) hashMap, -1, false);
            } else {
                UMLog.m22222aq(UMLogAnalytics.f17073O, 0, str2);
            }
        }
    }

    /* renamed from: e */
    public synchronized String mo18822e(Context context) {
        if (context == null) {
            try {
                UMLog.m22222aq(UMLogAnalytics.f17094ai, 0, "\\|");
                return null;
            } catch (Throwable unused) {
            }
        } else {
            if (f16492a == null) {
                f16492a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f16492a)) {
                MLog.m22443e("getSuperProperties can not be called in child process");
                return null;
            } else if (this.f16511k != null) {
                return this.f16511k.toString();
            } else {
                this.f16511k = new JSONObject();
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo18817c(Context context, String str) {
        if (context == null) {
            UMLog.m22222aq(UMLogAnalytics.f17128z, 0, "\\|");
            return;
        }
        if (f16492a == null) {
            f16492a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f16492a)) {
            MLog.m22443e("setSecret can not be called in child process");
            return;
        }
        if (!this.f16510j || !this.f16514n) {
            mo18790a(f16492a);
        }
        AnalyticsConfig.m21411a(f16492a, str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo18805a(String str) {
        if (!UMUtils.isMainProgress(f16492a)) {
            MLog.m22443e("onPageStart can not be called in child process");
            return;
        }
        try {
            if (AutoViewPageTracker.f17130b != PageMode.LEGACY_AUTO) {
                this.f16506d.mo19180a(str);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo18803a(ISysListener iSysListener) {
        if (!UMUtils.isMainProgress(f16492a)) {
            MLog.m22443e("setSysListener can not be called in child process");
        } else {
            this.f16504b = iSysListener;
        }
    }

    /* renamed from: a */
    public void mo18791a(Context context, int i) {
        if (context == null) {
            MLog.m22443e("unexpected null context in setVerticalType");
            return;
        }
        if (f16492a == null) {
            f16492a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f16492a)) {
            MLog.m22443e("setVerticalType can not be called in child process");
            return;
        }
        if (!this.f16510j || !this.f16514n) {
            mo18790a(f16492a);
        }
        AnalyticsConfig.m21410a(f16492a, i);
    }

    /* renamed from: b */
    public synchronized void mo18813b(Object obj) {
        try {
            Context context = f16492a;
            if (context != null) {
                if (!UMUtils.isMainProgress(context)) {
                    MLog.m22443e("updateNativePrePropertiesByCoreProtocol can not be called in child process");
                    return;
                }
                Editor edit = PreferenceWrapper.getDefault(f16492a).edit();
                if (obj != null) {
                    String str = (String) obj;
                    if (edit != null && !TextUtils.isEmpty(str)) {
                        edit.putString(f16494i, str).commit();
                    }
                } else if (edit != null) {
                    edit.remove(f16494i).commit();
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo18796a(Context context, String str, HashMap<String, Object> hashMap) {
        if (context != null) {
            try {
                if (f16492a == null) {
                    f16492a = context.getApplicationContext();
                }
                if (!UMUtils.isMainProgress(f16492a)) {
                    MLog.m22443e("onGKVEvent can not be called in child process");
                    return;
                }
                if (!this.f16510j || !this.f16514n) {
                    mo18790a(f16492a);
                }
                String str2 = "";
                if (this.f16511k == null) {
                    this.f16511k = new JSONObject();
                } else {
                    str2 = this.f16511k.toString();
                }
                EventTracker.m22079a(f16492a).mo19166a(str, hashMap, str2);
            } catch (Throwable th) {
                if (MLog.DEBUG) {
                    MLog.m22447e(th);
                }
            }
        }
    }

    /* renamed from: b */
    private boolean m21417b(String str, Object obj) {
        int i;
        String str2 = "UTF-8";
        try {
            String str3 = ", please check key, illegal";
            if (TextUtils.isEmpty(str)) {
                StringBuilder sb = new StringBuilder();
                sb.append("key is ");
                sb.append(str);
                sb.append(str3);
                MLog.m22443e(sb.toString());
                return false;
            }
            try {
                i = str.getBytes(str2).length;
            } catch (UnsupportedEncodingException unused) {
                i = 0;
            }
            if (i > f16495o) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("key length is ");
                sb2.append(i);
                sb2.append(str3);
                MLog.m22443e(sb2.toString());
                return false;
            } else if (obj instanceof String) {
                if (((String) obj).getBytes(str2).length <= 256) {
                    return true;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("value length is ");
                sb3.append(((String) obj).getBytes(str2).length);
                sb3.append(", please check value, illegal");
                MLog.m22443e(sb3.toString());
                return false;
            } else if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof Float)) {
                return true;
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("value is ");
                sb4.append(obj);
                sb4.append(", please check value, type illegal");
                MLog.m22443e(sb4.toString());
                return false;
            }
        } catch (Throwable unused2) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo18793a(Context context, String str) {
        String str2 = "\\|";
        if (context == null) {
            UMLog.m22222aq(UMLogAnalytics.f17125w, 0, str2);
            return;
        }
        if (f16492a == null) {
            f16492a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f16492a)) {
            MLog.m22443e("reportError can not be called in child process");
        } else if (TextUtils.isEmpty(str)) {
            if (UMConfigure.isDebugLog()) {
                UMLog.m22222aq(UMLogAnalytics.f17126x, 0, str2);
            }
        } else {
            try {
                if (!this.f16510j || !this.f16514n) {
                    mo18790a(f16492a);
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ts", System.currentTimeMillis());
                jSONObject.put(UContent.f16882Q, 2);
                jSONObject.put(UContent.f16883R, str);
                jSONObject.put("__ii", this.f16508f.mo19177c());
                Context context2 = f16492a;
                UMWorkDispatch.sendEvent(context2, C3149a.f17194j, CoreProtocol.getInstance(context2), jSONObject);
            } catch (Throwable th) {
                if (MLog.DEBUG) {
                    MLog.m22447e(th);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo18799a(Context context, Throwable th) {
        if (context == null || th == null) {
            UMLog.m22222aq(UMLogAnalytics.f17127y, 0, "\\|");
            return;
        }
        if (f16492a == null) {
            f16492a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f16492a)) {
            MLog.m22443e("reportError can not be called in child process");
            return;
        }
        try {
            if (!this.f16510j || !this.f16514n) {
                mo18790a(f16492a);
            }
            mo18793a(f16492a, DataHelper.convertExceptionToString(th));
        } catch (Exception e) {
            if (MLog.DEBUG) {
                MLog.m22447e((Throwable) e);
            }
        }
    }

    /* renamed from: a */
    public void mo18795a(Context context, String str, String str2, long j, int i) {
        if (context != null) {
            try {
                if (f16492a == null) {
                    f16492a = context.getApplicationContext();
                }
                if (!this.f16510j || !this.f16514n) {
                    mo18790a(f16492a);
                }
                if (m21418c(str)) {
                    String str3 = UMRTLog.RTLOG_TAG;
                    StringBuilder sb = new StringBuilder();
                    sb.append("--->>> filter ekv [");
                    sb.append(str);
                    sb.append("].");
                    UMRTLog.m22229i(str3, sb.toString());
                    return;
                }
                String str4 = "";
                if (this.f16511k == null) {
                    this.f16511k = new JSONObject();
                } else {
                    str4 = this.f16511k.toString();
                }
                EventTracker.m22079a(f16492a).mo19164a(str, str2, j, i, str4);
            } catch (Throwable th) {
                if (MLog.DEBUG) {
                    MLog.m22447e(th);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo18798a(Context context, String str, Map<String, Object> map, long j) {
        try {
            String str2 = "\\|";
            if (TextUtils.isEmpty(str)) {
                UMLog.m22222aq(UMLogAnalytics.f17105c, 0, str2);
            } else if (Arrays.asList(UContent.f16898aF).contains(str)) {
                UMLog.m22222aq(UMLogAnalytics.f17104b, 0, str2);
            } else if (map.isEmpty()) {
                UMLog.m22222aq(UMLogAnalytics.f17106d, 0, str2);
            } else {
                for (Entry key : map.entrySet()) {
                    if (Arrays.asList(UContent.f16898aF).contains(key.getKey())) {
                        UMLog.m22222aq(UMLogAnalytics.f17107e, 0, str2);
                        return;
                    }
                }
                m21415a(context, str, map, j, false);
            }
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m22447e(th);
            }
        }
    }

    /* renamed from: a */
    public void mo18797a(Context context, String str, Map<String, Object> map) {
        m21415a(context, str, map, -1, true);
    }

    /* renamed from: a */
    private void m21415a(Context context, String str, Map<String, Object> map, long j, boolean z) {
        if (context == null) {
            try {
                MLog.m22443e("context is null in onEventNoCheck, please check!");
            } catch (Throwable th) {
                if (MLog.DEBUG) {
                    MLog.m22447e(th);
                }
            }
        } else {
            if (f16492a == null) {
                f16492a = context.getApplicationContext();
            }
            if (!this.f16510j || !this.f16514n) {
                mo18790a(f16492a);
            }
            if (m21418c(str)) {
                String str2 = UMRTLog.RTLOG_TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("--->>> filter ekv [");
                sb.append(str);
                sb.append("].");
                UMRTLog.m22229i(str2, sb.toString());
                return;
            }
            String str3 = "";
            if (this.f16511k == null) {
                this.f16511k = new JSONObject();
            } else {
                str3 = this.f16511k.toString();
            }
            EventTracker.m22079a(f16492a).mo19165a(str, map, j, str3, z);
        }
    }

    /* renamed from: a */
    public void mo18807a(Throwable th) {
        try {
            Context context = f16492a;
            if (context != null) {
                if (!UMUtils.isMainProgress(context)) {
                    MLog.m22443e("onAppCrash can not be called in child process");
                } else if (AnalyticsConfig.enable) {
                    ViewPageTracker uVar = this.f16506d;
                    if (uVar != null) {
                        uVar.mo19181b();
                    }
                    AutoViewPageTracker.m21978a(f16492a, "onAppCrash");
                    ActivityManualPageTracker jVar = this.f16507e;
                    if (jVar != null) {
                        jVar.mo19181b();
                    }
                    AutoViewPageTracker kVar = this.f16509g;
                    if (kVar != null) {
                        kVar.mo19115c();
                    }
                    SessionTracker tVar = this.f16508f;
                    if (tVar != null) {
                        tVar.mo19179c(f16492a, Long.valueOf(System.currentTimeMillis()));
                    }
                    if (th != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("ts", System.currentTimeMillis());
                        jSONObject.put(UContent.f16882Q, 1);
                        jSONObject.put(UContent.f16883R, DataHelper.convertExceptionToString(th));
                        UMStoreManager.m21939a(f16492a).mo19095a(this.f16508f.mo19177c(), jSONObject.toString(), 1);
                    }
                    CoreProtocolImpl.m22007a(f16492a).mo19146d();
                    ViewPageTracker.m22117a(f16492a);
                    if (AutoViewPageTracker.f17130b == PageMode.AUTO) {
                        AutoViewPageTracker.m21986c(f16492a);
                    }
                    PreferenceWrapper.getDefault(f16492a).edit().commit();
                }
            }
        } catch (Exception e) {
            if (MLog.DEBUG) {
                MLog.m22445e("Exception in onAppCrash", (Throwable) e);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo18806a(String str, String str2) {
        try {
            Context context = f16492a;
            if (context != null) {
                if (!UMUtils.isMainProgress(context)) {
                    MLog.m22443e("onProfileSignIn can not be called in child process");
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(UContent.f16878M, str);
                jSONObject.put("uid", str2);
                jSONObject.put("ts", currentTimeMillis);
                Context context2 = f16492a;
                UMWorkDispatch.sendEvent(context2, C3149a.f17189e, CoreProtocol.getInstance(context2), jSONObject);
                Context context3 = f16492a;
                UMWorkDispatch.sendEvent(context3, C3149a.f17199o, CoreProtocol.getInstance(context3), jSONObject);
            }
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m22445e(" Excepthon  in  onProfileSignIn", th);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo18809a(boolean z) {
        Context context = f16492a;
        if (context != null) {
            if (!UMUtils.isMainProgress(context)) {
                MLog.m22443e("setCatchUncaughtExceptions can not be called in child process");
                return;
            }
            if (!AnalyticsConfig.CHANGE_CATCH_EXCEPTION_NOTALLOW) {
                AnalyticsConfig.CATCH_EXCEPTION = z;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo18808a(GL10 gl10) {
        String[] gpu = UMUtils.getGPU(gl10);
        if (gpu.length == 2) {
            AnalyticsConfig.GPU_VENDER = gpu[0];
            AnalyticsConfig.GPU_RENDERER = gpu[1];
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo18802a(PageMode pageMode) {
        Context context = f16492a;
        if (context != null) {
            if (!UMUtils.isMainProgress(context)) {
                MLog.m22443e("setPageCollectionMode can not be called in child process");
            } else {
                AutoViewPageTracker.f17130b = pageMode;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo18788a(double d, double d2) {
        Context context = f16492a;
        if (context != null) {
            if (!UMUtils.isMainProgress(context)) {
                MLog.m22443e("setLocation can not be called in child process");
                return;
            }
            if (AnalyticsConfig.f16468a == null) {
                AnalyticsConfig.f16468a = new double[2];
            }
            double[] dArr = AnalyticsConfig.f16468a;
            dArr[0] = d;
            dArr[1] = d2;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo18792a(Context context, EScenarioType eScenarioType) {
        if (context == null) {
            MLog.m22443e("unexpected null context in setScenarioType");
            return;
        }
        if (f16492a == null) {
            f16492a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f16492a)) {
            MLog.m22443e("setScenarioType can not be called in child process");
            return;
        }
        if (eScenarioType != null) {
            mo18791a(f16492a, eScenarioType.toValue());
        }
        if (!this.f16510j || !this.f16514n) {
            mo18790a(f16492a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo18789a(long j) {
        Context context = f16492a;
        if (context != null) {
            if (!UMUtils.isMainProgress(context)) {
                MLog.m22443e("setSessionContinueMillis can not be called in child process");
                return;
            }
            AnalyticsConfig.kContinueSessionMillis = j;
            SessionIdManager.m22133a().mo19190a(AnalyticsConfig.kContinueSessionMillis);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:169:0x029f, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:162:0x0283 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo18794a(android.content.Context r4, java.lang.String r5, java.lang.Object r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            if (r4 != 0) goto L_0x000d
            java.lang.String r4 = com.umeng.analytics.pro.UMLogAnalytics.f17091af     // Catch:{ all -> 0x029e }
            java.lang.String r5 = "\\|"
            com.umeng.commonsdk.debug.UMLog.m22222aq(r4, r0, r5)     // Catch:{ all -> 0x029e }
            monitor-exit(r3)
            return
        L_0x000d:
            android.content.Context r1 = f16492a     // Catch:{ all -> 0x029e }
            if (r1 != 0) goto L_0x0017
            android.content.Context r4 = r4.getApplicationContext()     // Catch:{ all -> 0x029e }
            f16492a = r4     // Catch:{ all -> 0x029e }
        L_0x0017:
            android.content.Context r4 = f16492a     // Catch:{ all -> 0x029e }
            boolean r4 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r4)     // Catch:{ all -> 0x029e }
            if (r4 != 0) goto L_0x0026
            java.lang.String r4 = "registerSuperProperty can not be called in child process"
            com.umeng.commonsdk.statistics.common.MLog.m22443e(r4)     // Catch:{ all -> 0x029e }
            monitor-exit(r3)
            return
        L_0x0026:
            boolean r4 = r3.f16510j     // Catch:{ all -> 0x029e }
            if (r4 == 0) goto L_0x002e
            boolean r4 = r3.f16514n     // Catch:{ all -> 0x029e }
            if (r4 != 0) goto L_0x0033
        L_0x002e:
            android.content.Context r4 = f16492a     // Catch:{ all -> 0x029e }
            r3.mo18790a(r4)     // Catch:{ all -> 0x029e }
        L_0x0033:
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x029e }
            if (r4 != 0) goto L_0x0295
            if (r6 != 0) goto L_0x003d
            goto L_0x0295
        L_0x003d:
            java.lang.String r4 = "umsp_1"
            boolean r4 = r5.equals(r4)     // Catch:{ all -> 0x029e }
            if (r4 != 0) goto L_0x0080
            java.lang.String r4 = "umsp_2"
            boolean r4 = r5.equals(r4)     // Catch:{ all -> 0x029e }
            if (r4 != 0) goto L_0x0080
            java.lang.String r4 = "umsp_3"
            boolean r4 = r5.equals(r4)     // Catch:{ all -> 0x029e }
            if (r4 != 0) goto L_0x0080
            java.lang.String r4 = "umsp_4"
            boolean r4 = r5.equals(r4)     // Catch:{ all -> 0x029e }
            if (r4 != 0) goto L_0x0080
            java.lang.String r4 = "umsp_5"
            boolean r4 = r5.equals(r4)     // Catch:{ all -> 0x029e }
            if (r4 != 0) goto L_0x0080
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x029e }
            r4.<init>()     // Catch:{ all -> 0x029e }
            java.lang.String r6 = "property name is "
            r4.append(r6)     // Catch:{ all -> 0x029e }
            r4.append(r5)     // Catch:{ all -> 0x029e }
            java.lang.String r5 = ", please check key, must be correct!"
            r4.append(r5)     // Catch:{ all -> 0x029e }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x029e }
            com.umeng.commonsdk.statistics.common.MLog.m22443e(r4)     // Catch:{ all -> 0x029e }
            monitor-exit(r3)
            return
        L_0x0080:
            boolean r4 = r6 instanceof java.lang.String     // Catch:{ all -> 0x029e }
            r1 = 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x00ab
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x029e }
            boolean r4 = com.umeng.commonsdk.statistics.common.HelperUtils.checkStrLen(r4, r1)     // Catch:{ all -> 0x029e }
            if (r4 != 0) goto L_0x00ab
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x029e }
            r4.<init>()     // Catch:{ all -> 0x029e }
            java.lang.String r5 = "property value is "
            r4.append(r5)     // Catch:{ all -> 0x029e }
            r4.append(r6)     // Catch:{ all -> 0x029e }
            java.lang.String r5 = ", please check value, lawless!"
            r4.append(r5)     // Catch:{ all -> 0x029e }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x029e }
            com.umeng.commonsdk.statistics.common.MLog.m22443e(r4)     // Catch:{ all -> 0x029e }
            monitor-exit(r3)
            return
        L_0x00ab:
            org.json.JSONObject r4 = r3.f16511k     // Catch:{ all -> 0x0283 }
            if (r4 != 0) goto L_0x00b6
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ all -> 0x0283 }
            r4.<init>()     // Catch:{ all -> 0x0283 }
            r3.f16511k = r4     // Catch:{ all -> 0x0283 }
        L_0x00b6:
            java.lang.Class r4 = r6.getClass()     // Catch:{ all -> 0x0283 }
            boolean r4 = r4.isArray()     // Catch:{ all -> 0x0283 }
            if (r4 == 0) goto L_0x025e
            boolean r4 = r6 instanceof java.lang.String[]     // Catch:{ all -> 0x0283 }
            r2 = 10
            if (r4 == 0) goto L_0x012c
            java.lang.String[] r6 = (java.lang.String[]) r6     // Catch:{ all -> 0x0283 }
            int r4 = r6.length     // Catch:{ all -> 0x0283 }
            if (r4 <= r2) goto L_0x00e7
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0283 }
            r4.<init>()     // Catch:{ all -> 0x0283 }
            java.lang.String r5 = "please check value, size is "
            r4.append(r5)     // Catch:{ all -> 0x0283 }
            int r5 = r6.length     // Catch:{ all -> 0x0283 }
            r4.append(r5)     // Catch:{ all -> 0x0283 }
            java.lang.String r5 = ", overstep 10!"
            r4.append(r5)     // Catch:{ all -> 0x0283 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0283 }
            com.umeng.commonsdk.statistics.common.MLog.m22443e(r4)     // Catch:{ all -> 0x0283 }
            monitor-exit(r3)
            return
        L_0x00e7:
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ all -> 0x0283 }
            r4.<init>()     // Catch:{ all -> 0x0283 }
        L_0x00ec:
            int r2 = r6.length     // Catch:{ all -> 0x0283 }
            if (r0 >= r2) goto L_0x0125
            r2 = r6[r0]     // Catch:{ all -> 0x0283 }
            if (r2 == 0) goto L_0x0104
            r2 = r6[r0]     // Catch:{ all -> 0x0283 }
            boolean r2 = com.umeng.commonsdk.statistics.common.HelperUtils.checkStrLen(r2, r1)     // Catch:{ all -> 0x0283 }
            if (r2 != 0) goto L_0x00fc
            goto L_0x0104
        L_0x00fc:
            r2 = r6[r0]     // Catch:{ all -> 0x0283 }
            r4.put(r2)     // Catch:{ all -> 0x0283 }
            int r0 = r0 + 1
            goto L_0x00ec
        L_0x0104:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0283 }
            r4.<init>()     // Catch:{ all -> 0x0283 }
            java.lang.String r5 = "please check value, length is "
            r4.append(r5)     // Catch:{ all -> 0x0283 }
            r5 = r6[r0]     // Catch:{ all -> 0x0283 }
            int r5 = r5.length()     // Catch:{ all -> 0x0283 }
            r4.append(r5)     // Catch:{ all -> 0x0283 }
            java.lang.String r5 = ", overlength 256!"
            r4.append(r5)     // Catch:{ all -> 0x0283 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0283 }
            com.umeng.commonsdk.statistics.common.MLog.m22443e(r4)     // Catch:{ all -> 0x0283 }
            monitor-exit(r3)
            return
        L_0x0125:
            org.json.JSONObject r6 = r3.f16511k     // Catch:{ all -> 0x0283 }
            r6.put(r5, r4)     // Catch:{ all -> 0x0283 }
            goto L_0x0283
        L_0x012c:
            boolean r4 = r6 instanceof long[]     // Catch:{ all -> 0x0283 }
            if (r4 == 0) goto L_0x0168
            long[] r6 = (long[]) r6     // Catch:{ all -> 0x0283 }
            int r4 = r6.length     // Catch:{ all -> 0x0283 }
            if (r4 <= r2) goto L_0x0151
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0283 }
            r4.<init>()     // Catch:{ all -> 0x0283 }
            java.lang.String r5 = "please check value, size is "
            r4.append(r5)     // Catch:{ all -> 0x0283 }
            int r5 = r6.length     // Catch:{ all -> 0x0283 }
            r4.append(r5)     // Catch:{ all -> 0x0283 }
            java.lang.String r5 = ", overstep 10!"
            r4.append(r5)     // Catch:{ all -> 0x0283 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0283 }
            com.umeng.commonsdk.statistics.common.MLog.m22443e(r4)     // Catch:{ all -> 0x0283 }
            monitor-exit(r3)
            return
        L_0x0151:
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ all -> 0x0283 }
            r4.<init>()     // Catch:{ all -> 0x0283 }
        L_0x0156:
            int r1 = r6.length     // Catch:{ all -> 0x0283 }
            if (r0 >= r1) goto L_0x0161
            r1 = r6[r0]     // Catch:{ all -> 0x0283 }
            r4.put(r1)     // Catch:{ all -> 0x0283 }
            int r0 = r0 + 1
            goto L_0x0156
        L_0x0161:
            org.json.JSONObject r6 = r3.f16511k     // Catch:{ all -> 0x0283 }
            r6.put(r5, r4)     // Catch:{ all -> 0x0283 }
            goto L_0x0283
        L_0x0168:
            boolean r4 = r6 instanceof int[]     // Catch:{ all -> 0x0283 }
            if (r4 == 0) goto L_0x01a4
            int[] r6 = (int[]) r6     // Catch:{ all -> 0x0283 }
            int r4 = r6.length     // Catch:{ all -> 0x0283 }
            if (r4 <= r2) goto L_0x018d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0283 }
            r4.<init>()     // Catch:{ all -> 0x0283 }
            java.lang.String r5 = "please check value, size is "
            r4.append(r5)     // Catch:{ all -> 0x0283 }
            int r5 = r6.length     // Catch:{ all -> 0x0283 }
            r4.append(r5)     // Catch:{ all -> 0x0283 }
            java.lang.String r5 = ", overstep 10!"
            r4.append(r5)     // Catch:{ all -> 0x0283 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0283 }
            com.umeng.commonsdk.statistics.common.MLog.m22443e(r4)     // Catch:{ all -> 0x0283 }
            monitor-exit(r3)
            return
        L_0x018d:
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ all -> 0x0283 }
            r4.<init>()     // Catch:{ all -> 0x0283 }
        L_0x0192:
            int r1 = r6.length     // Catch:{ all -> 0x0283 }
            if (r0 >= r1) goto L_0x019d
            r1 = r6[r0]     // Catch:{ all -> 0x0283 }
            r4.put(r1)     // Catch:{ all -> 0x0283 }
            int r0 = r0 + 1
            goto L_0x0192
        L_0x019d:
            org.json.JSONObject r6 = r3.f16511k     // Catch:{ all -> 0x0283 }
            r6.put(r5, r4)     // Catch:{ all -> 0x0283 }
            goto L_0x0283
        L_0x01a4:
            boolean r4 = r6 instanceof float[]     // Catch:{ all -> 0x0283 }
            if (r4 == 0) goto L_0x01e1
            float[] r6 = (float[]) r6     // Catch:{ all -> 0x0283 }
            int r4 = r6.length     // Catch:{ all -> 0x0283 }
            if (r4 <= r2) goto L_0x01c9
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0283 }
            r4.<init>()     // Catch:{ all -> 0x0283 }
            java.lang.String r5 = "please check value, size is "
            r4.append(r5)     // Catch:{ all -> 0x0283 }
            int r5 = r6.length     // Catch:{ all -> 0x0283 }
            r4.append(r5)     // Catch:{ all -> 0x0283 }
            java.lang.String r5 = ", overstep 10!"
            r4.append(r5)     // Catch:{ all -> 0x0283 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0283 }
            com.umeng.commonsdk.statistics.common.MLog.m22443e(r4)     // Catch:{ all -> 0x0283 }
            monitor-exit(r3)
            return
        L_0x01c9:
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ all -> 0x0283 }
            r4.<init>()     // Catch:{ all -> 0x0283 }
        L_0x01ce:
            int r1 = r6.length     // Catch:{ all -> 0x0283 }
            if (r0 >= r1) goto L_0x01da
            r1 = r6[r0]     // Catch:{ all -> 0x0283 }
            double r1 = (double) r1     // Catch:{ all -> 0x0283 }
            r4.put(r1)     // Catch:{ all -> 0x0283 }
            int r0 = r0 + 1
            goto L_0x01ce
        L_0x01da:
            org.json.JSONObject r6 = r3.f16511k     // Catch:{ all -> 0x0283 }
            r6.put(r5, r4)     // Catch:{ all -> 0x0283 }
            goto L_0x0283
        L_0x01e1:
            boolean r4 = r6 instanceof double[]     // Catch:{ all -> 0x0283 }
            if (r4 == 0) goto L_0x021c
            double[] r6 = (double[]) r6     // Catch:{ all -> 0x0283 }
            int r4 = r6.length     // Catch:{ all -> 0x0283 }
            if (r4 <= r2) goto L_0x0206
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0283 }
            r4.<init>()     // Catch:{ all -> 0x0283 }
            java.lang.String r5 = "please check value, size is "
            r4.append(r5)     // Catch:{ all -> 0x0283 }
            int r5 = r6.length     // Catch:{ all -> 0x0283 }
            r4.append(r5)     // Catch:{ all -> 0x0283 }
            java.lang.String r5 = ", overstep 10!"
            r4.append(r5)     // Catch:{ all -> 0x0283 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0283 }
            com.umeng.commonsdk.statistics.common.MLog.m22443e(r4)     // Catch:{ all -> 0x0283 }
            monitor-exit(r3)
            return
        L_0x0206:
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ all -> 0x0283 }
            r4.<init>()     // Catch:{ all -> 0x0283 }
        L_0x020b:
            int r1 = r6.length     // Catch:{ all -> 0x0283 }
            if (r0 >= r1) goto L_0x0216
            r1 = r6[r0]     // Catch:{ all -> 0x0283 }
            r4.put(r1)     // Catch:{ all -> 0x0283 }
            int r0 = r0 + 1
            goto L_0x020b
        L_0x0216:
            org.json.JSONObject r6 = r3.f16511k     // Catch:{ all -> 0x0283 }
            r6.put(r5, r4)     // Catch:{ all -> 0x0283 }
            goto L_0x0283
        L_0x021c:
            boolean r4 = r6 instanceof short[]     // Catch:{ all -> 0x0283 }
            if (r4 == 0) goto L_0x0257
            short[] r6 = (short[]) r6     // Catch:{ all -> 0x0283 }
            int r4 = r6.length     // Catch:{ all -> 0x0283 }
            if (r4 <= r2) goto L_0x0241
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0283 }
            r4.<init>()     // Catch:{ all -> 0x0283 }
            java.lang.String r5 = "please check value, size is "
            r4.append(r5)     // Catch:{ all -> 0x0283 }
            int r5 = r6.length     // Catch:{ all -> 0x0283 }
            r4.append(r5)     // Catch:{ all -> 0x0283 }
            java.lang.String r5 = ", overstep 10!"
            r4.append(r5)     // Catch:{ all -> 0x0283 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0283 }
            com.umeng.commonsdk.statistics.common.MLog.m22443e(r4)     // Catch:{ all -> 0x0283 }
            monitor-exit(r3)
            return
        L_0x0241:
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ all -> 0x0283 }
            r4.<init>()     // Catch:{ all -> 0x0283 }
        L_0x0246:
            int r1 = r6.length     // Catch:{ all -> 0x0283 }
            if (r0 >= r1) goto L_0x0251
            short r1 = r6[r0]     // Catch:{ all -> 0x0283 }
            r4.put(r1)     // Catch:{ all -> 0x0283 }
            int r0 = r0 + 1
            goto L_0x0246
        L_0x0251:
            org.json.JSONObject r6 = r3.f16511k     // Catch:{ all -> 0x0283 }
            r6.put(r5, r4)     // Catch:{ all -> 0x0283 }
            goto L_0x0283
        L_0x0257:
            java.lang.String r4 = "please check value, illegal type!"
            com.umeng.commonsdk.statistics.common.MLog.m22443e(r4)     // Catch:{ all -> 0x0283 }
            monitor-exit(r3)
            return
        L_0x025e:
            boolean r4 = r6 instanceof java.lang.String     // Catch:{ all -> 0x0283 }
            if (r4 != 0) goto L_0x027e
            boolean r4 = r6 instanceof java.lang.Long     // Catch:{ all -> 0x0283 }
            if (r4 != 0) goto L_0x027e
            boolean r4 = r6 instanceof java.lang.Integer     // Catch:{ all -> 0x0283 }
            if (r4 != 0) goto L_0x027e
            boolean r4 = r6 instanceof java.lang.Float     // Catch:{ all -> 0x0283 }
            if (r4 != 0) goto L_0x027e
            boolean r4 = r6 instanceof java.lang.Double     // Catch:{ all -> 0x0283 }
            if (r4 != 0) goto L_0x027e
            boolean r4 = r6 instanceof java.lang.Short     // Catch:{ all -> 0x0283 }
            if (r4 == 0) goto L_0x0277
            goto L_0x027e
        L_0x0277:
            java.lang.String r4 = "please check value, illegal type!"
            com.umeng.commonsdk.statistics.common.MLog.m22443e(r4)     // Catch:{ all -> 0x0283 }
            monitor-exit(r3)
            return
        L_0x027e:
            org.json.JSONObject r4 = r3.f16511k     // Catch:{ all -> 0x0283 }
            r4.put(r5, r6)     // Catch:{ all -> 0x0283 }
        L_0x0283:
            android.content.Context r4 = f16492a     // Catch:{ all -> 0x029e }
            r5 = 8195(0x2003, float:1.1484E-41)
            com.umeng.analytics.CoreProtocol r6 = com.umeng.analytics.CoreProtocol.getInstance(r4)     // Catch:{ all -> 0x029e }
            org.json.JSONObject r0 = r3.f16511k     // Catch:{ all -> 0x029e }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x029e }
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r4, r5, r6, r0)     // Catch:{ all -> 0x029e }
            goto L_0x029e
        L_0x0295:
            java.lang.String r4 = com.umeng.analytics.pro.UMLogAnalytics.f17092ag     // Catch:{ all -> 0x029e }
            java.lang.String r5 = "\\|"
            com.umeng.commonsdk.debug.UMLog.m22222aq(r4, r0, r5)     // Catch:{ all -> 0x029e }
            monitor-exit(r3)
            return
        L_0x029e:
            monitor-exit(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.InternalAgent.mo18794a(android.content.Context, java.lang.String, java.lang.Object):void");
    }

    /* renamed from: a */
    private void m21416a(String str, Object obj) {
        try {
            if (this.f16511k == null) {
                this.f16511k = new JSONObject();
            }
            int i = 0;
            if (obj.getClass().isArray()) {
                if (obj instanceof String[]) {
                    String[] strArr = (String[]) obj;
                    if (strArr.length <= 10) {
                        JSONArray jSONArray = new JSONArray();
                        while (i < strArr.length) {
                            if (strArr[i] != null && !HelperUtils.checkStrLen(strArr[i], 256)) {
                                jSONArray.put(strArr[i]);
                            }
                            i++;
                        }
                        this.f16511k.put(str, jSONArray);
                    }
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    JSONArray jSONArray2 = new JSONArray();
                    while (i < jArr.length) {
                        jSONArray2.put(jArr[i]);
                        i++;
                    }
                    this.f16511k.put(str, jSONArray2);
                } else if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    JSONArray jSONArray3 = new JSONArray();
                    while (i < iArr.length) {
                        jSONArray3.put(iArr[i]);
                        i++;
                    }
                    this.f16511k.put(str, jSONArray3);
                } else if (obj instanceof float[]) {
                    float[] fArr = (float[]) obj;
                    JSONArray jSONArray4 = new JSONArray();
                    while (i < fArr.length) {
                        jSONArray4.put((double) fArr[i]);
                        i++;
                    }
                    this.f16511k.put(str, jSONArray4);
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    JSONArray jSONArray5 = new JSONArray();
                    while (i < dArr.length) {
                        jSONArray5.put(dArr[i]);
                        i++;
                    }
                    this.f16511k.put(str, jSONArray5);
                } else if (obj instanceof short[]) {
                    short[] sArr = (short[]) obj;
                    JSONArray jSONArray6 = new JSONArray();
                    while (i < sArr.length) {
                        jSONArray6.put(sArr[i]);
                        i++;
                    }
                    this.f16511k.put(str, jSONArray6);
                }
            } else if (obj instanceof List) {
                List list = (List) obj;
                JSONArray jSONArray7 = new JSONArray();
                while (i < list.size()) {
                    Object obj2 = list.get(i);
                    if ((obj2 instanceof String) || (obj2 instanceof Long) || (obj2 instanceof Integer) || (obj2 instanceof Float) || (obj2 instanceof Double) || (obj2 instanceof Short)) {
                        jSONArray7.put(list.get(i));
                    }
                    i++;
                }
                this.f16511k.put(str, jSONArray7);
            } else if ((obj instanceof String) || (obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Float) || (obj instanceof Double) || (obj instanceof Short)) {
                this.f16511k.put(str, obj);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public synchronized void mo18804a(Object obj) {
        try {
            Context context = f16492a;
            if (context != null) {
                if (!UMUtils.isMainProgress(context)) {
                    MLog.m22443e("registerSuperPropertyByCoreProtocol can not be called in child process");
                } else if (obj != null) {
                    String str = (String) obj;
                    Editor edit = PreferenceWrapper.getDefault(f16492a).edit();
                    if (edit != null && !TextUtils.isEmpty(str)) {
                        edit.putString(f16493h, this.f16511k.toString()).commit();
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public synchronized void mo18800a(Context context, List<String> list) {
        if (context == null) {
            try {
                UMLog.m22222aq(UMLogAnalytics.f17095aj, 0, "\\|");
                return;
            } catch (Throwable th) {
                MLog.m22447e(th);
            }
        } else {
            if (f16492a == null) {
                f16492a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f16492a)) {
                MLog.m22443e("setFirstLaunchEvent can not be called in child process");
                return;
            }
            if (!this.f16510j || !this.f16514n) {
                mo18790a(f16492a);
            }
            EventTracker.m22079a(f16492a).mo19167a(list);
        }
        return;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ab, code lost:
        return;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:58:0x00ac=Splitter:B:58:0x00ac, B:52:0x008f=Splitter:B:52:0x008f} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo18801a(android.content.Context r5, org.json.JSONObject r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            if (r5 != 0) goto L_0x000d
            java.lang.String r5 = com.umeng.analytics.pro.UMLogAnalytics.f17097al     // Catch:{ all -> 0x00b5 }
            java.lang.String r6 = "\\|"
            com.umeng.commonsdk.debug.UMLog.m22222aq(r5, r0, r6)     // Catch:{ all -> 0x00b5 }
            monitor-exit(r4)
            return
        L_0x000d:
            android.content.Context r1 = f16492a     // Catch:{ all -> 0x00b5 }
            if (r1 != 0) goto L_0x0017
            android.content.Context r5 = r5.getApplicationContext()     // Catch:{ all -> 0x00b5 }
            f16492a = r5     // Catch:{ all -> 0x00b5 }
        L_0x0017:
            android.content.Context r5 = f16492a     // Catch:{ all -> 0x00b5 }
            boolean r5 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r5)     // Catch:{ all -> 0x00b5 }
            if (r5 != 0) goto L_0x0026
            java.lang.String r5 = "registerPreProperties can not be called in child process"
            com.umeng.commonsdk.statistics.common.MLog.m22443e(r5)     // Catch:{ all -> 0x00b5 }
            monitor-exit(r4)
            return
        L_0x0026:
            boolean r5 = r4.f16510j     // Catch:{ all -> 0x00b5 }
            if (r5 == 0) goto L_0x002e
            boolean r5 = r4.f16514n     // Catch:{ all -> 0x00b5 }
            if (r5 != 0) goto L_0x0033
        L_0x002e:
            android.content.Context r5 = f16492a     // Catch:{ all -> 0x00b5 }
            r4.mo18790a(r5)     // Catch:{ all -> 0x00b5 }
        L_0x0033:
            org.json.JSONObject r5 = r4.f16513m     // Catch:{ all -> 0x00b5 }
            if (r5 != 0) goto L_0x003e
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x00b5 }
            r5.<init>()     // Catch:{ all -> 0x00b5 }
            r4.f16513m = r5     // Catch:{ all -> 0x00b5 }
        L_0x003e:
            if (r6 == 0) goto L_0x00ac
            int r5 = r6.length()     // Catch:{ all -> 0x00b5 }
            if (r5 > 0) goto L_0x0047
            goto L_0x00ac
        L_0x0047:
            r5 = 0
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x0055 }
            org.json.JSONObject r1 = r4.f16513m     // Catch:{ Exception -> 0x0055 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0055 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0055 }
            r5 = r0
            goto L_0x0056
        L_0x0055:
        L_0x0056:
            if (r5 != 0) goto L_0x005d
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x00b5 }
            r5.<init>()     // Catch:{ all -> 0x00b5 }
        L_0x005d:
            java.util.Iterator r0 = r6.keys()     // Catch:{ all -> 0x00b5 }
            if (r0 == 0) goto L_0x008f
        L_0x0063:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x00b5 }
            if (r1 == 0) goto L_0x008f
            java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x0063 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0063 }
            java.lang.Object r2 = r6.get(r1)     // Catch:{ Exception -> 0x0063 }
            boolean r3 = r4.m21417b(r1, r2)     // Catch:{ Exception -> 0x0063 }
            if (r3 != 0) goto L_0x007d
            monitor-exit(r4)
            return
        L_0x007d:
            r5.put(r1, r2)     // Catch:{ Exception -> 0x0063 }
            int r1 = r5.length()     // Catch:{ Exception -> 0x0063 }
            r2 = 10
            if (r1 <= r2) goto L_0x0063
            java.lang.String r1 = "please check propertics, size overlength!"
            com.umeng.commonsdk.statistics.common.MLog.m22443e(r1)     // Catch:{ Exception -> 0x0063 }
            monitor-exit(r4)
            return
        L_0x008f:
            r4.f16513m = r5     // Catch:{ all -> 0x00b5 }
            org.json.JSONObject r5 = r4.f16513m     // Catch:{ all -> 0x00b5 }
            int r5 = r5.length()     // Catch:{ all -> 0x00b5 }
            if (r5 <= 0) goto L_0x00aa
            android.content.Context r5 = f16492a     // Catch:{ all -> 0x00b5 }
            r6 = 8199(0x2007, float:1.1489E-41)
            com.umeng.analytics.CoreProtocol r0 = com.umeng.analytics.CoreProtocol.getInstance(r5)     // Catch:{ all -> 0x00b5 }
            org.json.JSONObject r1 = r4.f16513m     // Catch:{ all -> 0x00b5 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00b5 }
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r5, r6, r0, r1)     // Catch:{ all -> 0x00b5 }
        L_0x00aa:
            monitor-exit(r4)
            return
        L_0x00ac:
            java.lang.String r5 = com.umeng.analytics.pro.UMLogAnalytics.f17098am     // Catch:{ all -> 0x00b5 }
            java.lang.String r6 = "\\|"
            com.umeng.commonsdk.debug.UMLog.m22222aq(r5, r0, r6)     // Catch:{ all -> 0x00b5 }
            monitor-exit(r4)
            return
        L_0x00b5:
            r5 = move-exception
            monitor-exit(r4)
            goto L_0x00b9
        L_0x00b8:
            throw r5
        L_0x00b9:
            goto L_0x00b8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.InternalAgent.mo18801a(android.content.Context, org.json.JSONObject):void");
    }
}
