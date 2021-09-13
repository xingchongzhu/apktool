package com.umeng.tunnel;

import android.content.Context;
import android.util.Log;
import java.util.Map;

public class UMChannelAgent {
    private static final String TAG = "UMChannelAgent";
    private static final String UMENG_VCHANNEL = "com.umeng.commonsdk.vchannel.Sender";
    private static boolean vChannelReady = true;

    static {
        try {
            Class.forName(UMENG_VCHANNEL);
        } catch (Throwable unused) {
        }
    }

    public static boolean init() {
        if (!vChannelReady) {
            Log.e(TAG, "--->>> Umeng tunnel module depends on common library, please integrate common first.");
        }
        return vChannelReady;
    }

    public static void onDebugEvent(Context context, String str, Map<String, Object> map) {
        reflectOnEvent(context, str, map);
    }

    private static void reflectOnEvent(Context context, String str, Map<String, Object> map) {
        String str2 = TAG;
        try {
            Class.forName(UMENG_VCHANNEL).getMethod("onEvent", new Class[]{Context.class, String.class, Map.class}).invoke(null, new Object[]{context, str, map});
        } catch (ClassNotFoundException unused) {
            Log.e(str2, "--->>> Can not find class com.umeng.commonsdk.vchannel.sender .");
        } catch (NoSuchMethodException unused2) {
            Log.e(str2, "--->>> Can not find method onEvent .");
        } catch (SecurityException unused3) {
            Log.e(str2, "--->>> Security exception is thrown when we find onEvent method !");
        } catch (Exception unused4) {
            Log.e(str2, "--->>> Exception is thrown when onEvent method is called !");
        }
    }

    private static void reflectSetCustomHeader(Map<String, String> map) {
        String str = TAG;
        try {
            Class.forName(UMENG_VCHANNEL).getMethod("setCustomHeader", new Class[]{Map.class}).invoke(null, new Object[]{map});
        } catch (ClassNotFoundException unused) {
            Log.e(str, "--->>> Can not find class com.umeng.commonsdk.vchannel.sender .");
        } catch (NoSuchMethodException unused2) {
            Log.e(str, "--->>> Can not find method setCustomHeader .");
        } catch (SecurityException unused3) {
            Log.e(str, "--->>> Security exception is thrown when we find setCustomHeader method !");
        } catch (Exception unused4) {
            Log.e(str, "--->>> Exception is thrown when setCustomHeader method is called !");
        }
    }

    public static void setCustomHeader(Map<String, String> map) {
        reflectSetCustomHeader(map);
    }
}
