package com.umeng.analytics.pro;

import android.util.Log;

/* renamed from: com.umeng.analytics.pro.ah */
public class Logger {

    /* renamed from: a */
    private static final String f16548a = "OpenId";

    /* renamed from: b */
    private static boolean f16549b = false;

    /* renamed from: a */
    public static void m21501a(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("setDebug:");
        sb.append(z);
        Log.d(f16548a, sb.toString());
        f16549b = z;
    }

    /* renamed from: b */
    public static void m21502b(String str, Object... objArr) {
        if (f16549b) {
            Log.i(f16548a, m21505e(str, objArr));
        }
    }

    /* renamed from: c */
    public static void m21503c(String str, Object... objArr) {
        if (f16549b) {
            Log.w(f16548a, m21505e(str, objArr));
        }
    }

    /* renamed from: d */
    public static void m21504d(String str, Object... objArr) {
        if (f16549b) {
            Log.e(f16548a, m21505e(str, objArr));
        }
    }

    /* renamed from: e */
    private static String m21505e(String str, Object... objArr) {
        if (str == null && objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Object[] objArr2 = new Object[1];
        if (str == null) {
            str = "-";
        }
        int i = 0;
        objArr2[0] = str;
        sb.append(String.format("[%s] ", objArr2));
        if (objArr != null) {
            int length = objArr.length;
            while (true) {
                int i2 = i + 1;
                if (i2 >= objArr.length) {
                    break;
                }
                sb.append(m21499a(objArr[i], objArr[i2]));
                if (i2 < length - 1) {
                    sb.append(",");
                }
                i = i2 + 1;
            }
            if (i == objArr.length - 1) {
                sb.append(objArr[i]);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m21500a(String str, Object... objArr) {
        if (f16549b) {
            Log.d(f16548a, m21505e(str, objArr));
        }
    }

    /* renamed from: a */
    private static String m21499a(Object obj, Object obj2) {
        Object[] objArr = new Object[2];
        Object obj3 = "";
        if (obj == null) {
            obj = obj3;
        }
        objArr[0] = obj;
        if (obj2 == null) {
            obj2 = obj3;
        }
        objArr[1] = obj2;
        return String.format("%s:%s", objArr);
    }
}
