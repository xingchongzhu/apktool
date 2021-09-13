package com.umeng.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.UMLogAnalytics;
import com.umeng.common.ISysListener;
import com.umeng.commonsdk.debug.UMLog;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.microedition.khronos.opengles.GL10;
import org.json.JSONObject;

public class MobclickAgent {

    public enum EScenarioType {
        E_UM_NORMAL(0),
        E_UM_GAME(1);
        

        /* renamed from: a */
        private int f16478a;

        private EScenarioType(int i) {
            this.f16478a = i;
        }

        public int toValue() {
            return this.f16478a;
        }
    }

    public enum PageMode {
        AUTO,
        MANUAL,
        LEGACY_AUTO,
        LEGACY_MANUAL
    }

    public static void clearPreProperties(Context context) {
        getAgent().mo18828g(context);
    }

    public static void disable() {
        AnalyticsConfig.enable = false;
    }

    private static void disableExceptionCatch() {
        InternalAgent.m21414a().mo18809a(false);
        AnalyticsConfig.CHANGE_CATCH_EXCEPTION_NOTALLOW = true;
    }

    public static void enableEncrypt(boolean z) {
    }

    public static InternalAgent getAgent() {
        return InternalAgent.m21414a();
    }

    public static JSONObject getPreProperties(Context context) {
        return getAgent().mo18829h(context);
    }

    private static void init(Context context) {
        InternalAgent.m21414a().mo18790a(context);
    }

    public static void onEvent(Context context, String str) {
        InternalAgent.m21414a().mo18795a(context, str, (String) null, -1, 1);
    }

    public static void onEventObject(Context context, String str, Map<String, Object> map) {
        if (map == null) {
            UMLog.m22222aq(UMLogAnalytics.f17085a, 0, "\\|");
        } else {
            InternalAgent.m21414a().mo18798a(context, str, map, -1);
        }
    }

    public static void onEventValue(Context context, String str, Map<String, String> map, int i) {
        HashMap hashMap;
        if (map == null) {
            hashMap = new HashMap();
        } else {
            hashMap = new HashMap(map);
        }
        hashMap.put("__ct__", Integer.valueOf(i));
        InternalAgent.m21414a().mo18798a(context, str, hashMap, -1);
    }

    private static void onGKVEvent(Context context, String str, HashMap<String, Object> hashMap) {
        InternalAgent.m21414a().mo18796a(context, str, hashMap);
    }

    public static void onKillProcess(Context context) {
        InternalAgent.m21414a().mo18819d(context);
    }

    public static void onPageEnd(String str) {
        if (!TextUtils.isEmpty(str)) {
            InternalAgent.m21414a().mo18814b(str);
        } else {
            UMLog.m22222aq(UMLogAnalytics.f17062D, 0, "\\|");
        }
    }

    public static void onPageStart(String str) {
        if (!TextUtils.isEmpty(str)) {
            InternalAgent.m21414a().mo18805a(str);
        } else {
            UMLog.m22222aq(UMLogAnalytics.f17061C, 0, "\\|");
        }
    }

    public static void onPause(Context context) {
        InternalAgent.m21414a().mo18816c(context);
    }

    public static void onProfileSignIn(String str) {
        onProfileSignIn("_adhoc", str);
    }

    public static void onProfileSignOff() {
        InternalAgent.m21414a().mo18832j();
    }

    public static void onResume(Context context) {
        if (context == null) {
            UMLog.m22222aq(UMLogAnalytics.f17116n, 0, "\\|");
        } else {
            InternalAgent.m21414a().mo18811b(context);
        }
    }

    public static void registerPreProperties(Context context, JSONObject jSONObject) {
        getAgent().mo18801a(context, jSONObject);
    }

    public static void reportError(Context context, String str) {
        Class<String> cls = String.class;
        try {
            Class cls2 = Class.forName("com.umeng.umcrash.UMCrash");
            Method declaredMethod = cls2.getDeclaredMethod("generateCustomLog", new Class[]{cls, cls});
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(cls2, new Object[]{str, "DEFAULT"});
            }
        } catch (Throwable unused) {
        }
    }

    public static void setCatchUncaughtExceptions(boolean z) {
        InternalAgent.m21414a().mo18809a(z);
    }

    public static void setCheckDevice(boolean z) {
    }

    public static void setDebugMode(boolean z) {
    }

    public static void setFirstLaunchEvent(Context context, List<String> list) {
        getAgent().mo18800a(context, list);
    }

    private static void setGameScenarioType(Context context) {
        InternalAgent.m21414a().mo18792a(context, EScenarioType.E_UM_GAME);
    }

    public static void setLatencyWindow(long j) {
    }

    public static void setLocation(double d, double d2) {
        InternalAgent.m21414a().mo18788a(d, d2);
    }

    public static void setOpenGLContext(GL10 gl10) {
        InternalAgent.m21414a().mo18808a(gl10);
    }

    public static void setPageCollectionMode(PageMode pageMode) {
        InternalAgent.m21414a().mo18802a(pageMode);
    }

    public static void setScenarioType(Context context, EScenarioType eScenarioType) {
    }

    public static void setSecret(Context context, String str) {
        InternalAgent.m21414a().mo18817c(context, str);
    }

    public static void setSessionContinueMillis(long j) {
        if (j <= 30000) {
            j = 30000;
        }
        InternalAgent.m21414a().mo18789a(j);
    }

    private static void setSysListener(ISysListener iSysListener) {
        InternalAgent.m21414a().mo18803a(iSysListener);
    }

    public static void unregisterPreProperty(Context context, String str) {
        getAgent().mo18826f(context, str);
    }

    public static void onEvent(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            UMLog.m22222aq(UMLogAnalytics.f17113k, 0, "\\|");
        } else {
            InternalAgent.m21414a().mo18795a(context, str, str2, -1, 1);
        }
    }

    public static void onProfileSignIn(String str, String str2) {
        String str3 = "\\|";
        if (TextUtils.isEmpty(str2)) {
            UMLog.m22222aq(UMLogAnalytics.f17122t, 0, str3);
        } else if (str2.length() > 64) {
            UMLog.m22222aq(UMLogAnalytics.f17123u, 0, str3);
        } else {
            if (TextUtils.isEmpty(str)) {
                InternalAgent.m21414a().mo18806a("_adhoc", str2);
            } else if (str.length() > 32) {
                UMLog.m22222aq(UMLogAnalytics.f17124v, 0, str3);
            } else {
                InternalAgent.m21414a().mo18806a(str, str2);
            }
        }
    }

    public static void onEvent(Context context, String str, Map<String, String> map) {
        if (map == null) {
            UMLog.m22222aq(UMLogAnalytics.f17085a, 0, "\\|");
            return;
        }
        InternalAgent.m21414a().mo18798a(context, str, new HashMap(map), -1);
    }

    public static void reportError(Context context, Throwable th) {
        try {
            Class cls = Class.forName("com.umeng.umcrash.UMCrash");
            Method declaredMethod = cls.getDeclaredMethod("generateCustomLog", new Class[]{Throwable.class, String.class});
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(cls, new Object[]{th, "DEFAULT"});
            }
        } catch (Throwable unused) {
        }
    }
}
