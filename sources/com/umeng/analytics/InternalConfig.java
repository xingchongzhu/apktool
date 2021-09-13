package com.umeng.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.common.SPHelper;

/* renamed from: com.umeng.analytics.c */
public class InternalConfig {

    /* renamed from: a */
    private static String[] f16519a = new String[2];

    /* renamed from: a */
    public static void m21470a(Context context, String str, String str2) {
        String[] strArr = f16519a;
        strArr[0] = str;
        strArr[1] = str2;
        if (context != null) {
            SPHelper.m22175a(context).mo19227a(str, str2);
        }
    }

    /* renamed from: b */
    public static void m21472b(Context context) {
        String[] strArr = f16519a;
        strArr[0] = null;
        strArr[1] = null;
        if (context != null) {
            SPHelper.m22175a(context).mo19229b();
        }
    }

    /* renamed from: a */
    public static String[] m21471a(Context context) {
        if (!TextUtils.isEmpty(f16519a[0]) && !TextUtils.isEmpty(f16519a[1])) {
            return f16519a;
        }
        if (context != null) {
            String[] a = SPHelper.m22175a(context).mo19228a();
            if (a != null) {
                String[] strArr = f16519a;
                strArr[0] = a[0];
                strArr[1] = a[1];
                return strArr;
            }
        }
        return null;
    }
}
