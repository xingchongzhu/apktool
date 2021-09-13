package com.umeng.commonsdk.debug;

import android.util.Log;
import com.umeng.commonsdk.utils.UMUtils;

public class UMRTLog {
    private static final String RTLOG_ENABLE = "1";
    private static final String RTLOG_PROP = "debug.umeng.rtlog";
    public static final String RTLOG_TAG = "MobclickRT";

    private UMRTLog() {
    }

    /* renamed from: d */
    public static void m22227d(String str, String str2) {
        if (shouldOutput()) {
            Log.d(str, warpperMsg(str2, false));
        }
    }

    /* renamed from: e */
    public static void m22228e(String str, String str2) {
        if (shouldOutput()) {
            Log.e(str, warpperMsg(str2, false));
        }
    }

    /* renamed from: i */
    public static void m22229i(String str, String str2) {
        if (shouldOutput()) {
            Log.i(str, warpperMsg(str2, false));
        }
    }

    /* renamed from: sd */
    public static void m22230sd(String str, String str2) {
        if (shouldOutput()) {
            Log.d(str, warpperMsg(str2, true));
        }
    }

    /* renamed from: se */
    public static void m22231se(String str, String str2) {
        if (shouldOutput()) {
            Log.e(str, warpperMsg(str2, true));
        }
    }

    private static boolean shouldOutput() {
        return "1".equals(UMUtils.getSystemProperty(RTLOG_PROP, "0"));
    }

    /* renamed from: si */
    public static void m22232si(String str, String str2) {
        if (shouldOutput()) {
            Log.i(str, warpperMsg(str2, true));
        }
    }

    /* renamed from: sv */
    public static void m22233sv(String str, String str2) {
        if (shouldOutput()) {
            Log.v(str, warpperMsg(str2, true));
        }
    }

    /* renamed from: sw */
    public static void m22234sw(String str, String str2) {
        if (shouldOutput()) {
            Log.w(str, warpperMsg(str2, true));
        }
    }

    /* renamed from: v */
    public static void m22235v(String str, String str2) {
        if (shouldOutput()) {
            Log.v(str, warpperMsg(str2, false));
        }
    }

    /* renamed from: w */
    public static void m22236w(String str, String str2) {
        if (shouldOutput()) {
            Log.w(str, warpperMsg(str2, false));
        }
    }

    private static String warpperMsg(String str, boolean z) {
        String str2 = ":";
        if (!z) {
            return str;
        }
        StringBuffer stringBuffer = null;
        try {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            if (stackTrace.length >= 3) {
                String fileName = stackTrace[2].getFileName();
                String methodName = stackTrace[2].getMethodName();
                int lineNumber = stackTrace[2].getLineNumber();
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("<");
                stringBuffer2.append(fileName);
                stringBuffer2.append(str2);
                stringBuffer2.append(methodName);
                stringBuffer2.append(str2);
                stringBuffer2.append(lineNumber);
                stringBuffer2.append("> ");
                stringBuffer2.append(str);
                stringBuffer = stringBuffer2;
            }
            str = stringBuffer.toString();
        } catch (Throwable unused) {
        }
        return str;
    }
}
