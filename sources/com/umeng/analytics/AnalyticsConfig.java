package com.umeng.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.UMLogAnalytics;
import com.umeng.common.SPHelper;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.utils.UMUtils;

public class AnalyticsConfig {
    public static boolean CATCH_EXCEPTION = false;
    public static boolean CHANGE_CATCH_EXCEPTION_NOTALLOW = true;
    public static boolean CLEAR_EKV_BL = false;
    public static boolean CLEAR_EKV_WL = false;
    public static String GPU_RENDERER = "";
    public static String GPU_VENDER = "";

    /* renamed from: a */
    static double[] f16468a = null;

    /* renamed from: b */
    private static String f16469b = null;

    /* renamed from: c */
    private static String f16470c = null;

    /* renamed from: d */
    private static String f16471d = null;

    /* renamed from: e */
    private static int f16472e = 0;
    public static boolean enable = true;
    public static long kContinueSessionMillis = 30000;
    public static String mWrapperType;
    public static String mWrapperVersion;

    /* renamed from: a */
    static void m21412a(String str) {
        f16470c = str;
    }

    public static String getAppkey(Context context) {
        return UMUtils.getAppkey(context);
    }

    public static String getChannel(Context context) {
        return UMUtils.getChannel(context);
    }

    public static String getGameSdkVersion(Context context) {
        try {
            Class cls = Class.forName("com.umeng.analytics.game.GameSdkVersion");
            return (String) cls.getDeclaredField("SDK_VERSION").get(cls);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static double[] getLocation() {
        return f16468a;
    }

    public static String getSecretKey(Context context) {
        if (TextUtils.isEmpty(f16471d)) {
            f16471d = SPHelper.m22175a(context).mo19230c();
        }
        return f16471d;
    }

    public static int getVerticalType(Context context) {
        if (f16472e == 0) {
            f16472e = SPHelper.m22175a(context).mo19231d();
        }
        return f16472e;
    }

    /* renamed from: a */
    static void m21411a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            f16471d = str;
            SPHelper.m22175a(context).mo19226a(f16471d);
            return;
        }
        UMLog.m22222aq(UMLogAnalytics.f17059A, 0, "\\|");
    }

    /* renamed from: a */
    static void m21410a(Context context, int i) {
        f16472e = i;
        SPHelper.m22175a(context).mo19225a(f16472e);
    }
}
