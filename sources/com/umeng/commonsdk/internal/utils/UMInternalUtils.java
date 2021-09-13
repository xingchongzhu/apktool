package com.umeng.commonsdk.internal.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/* renamed from: com.umeng.commonsdk.internal.utils.j */
public class UMInternalUtils {

    /* renamed from: a */
    private static final String f17597a = "um_pri";

    /* renamed from: b */
    private static final String f17598b = "um_common_strength";

    /* renamed from: c */
    private static final String f17599c = "um_common_battery";

    /* renamed from: a */
    public static String m22361a(Context context) {
        if (context == null) {
            return null;
        }
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f17597a, 0);
        if (sharedPreferences != null) {
            return sharedPreferences.getString(f17599c, null);
        }
        return null;
    }

    /* renamed from: a */
    public static void m22362a(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f17597a, 0);
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString(f17599c, str).commit();
            }
        }
    }
}
