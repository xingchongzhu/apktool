package com.umeng.umzid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import java.lang.reflect.Method;

/* renamed from: com.umeng.umzid.c */
public class C3290c {
    /* renamed from: a */
    public static String m22877a(Context context) {
        if (context != null) {
            SharedPreferences a = C3286a.m22873a(context);
            if (a != null) {
                return a.getString("aaid", null);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m22878a(Context context, String str) {
        if (context != null && str != null && !TextUtils.isEmpty(str)) {
            SharedPreferences a = C3286a.m22873a(context);
            if (a != null) {
                Editor edit = a.edit();
                if (edit != null) {
                    edit.putString("mac", str).commit();
                }
            }
        }
    }

    /* renamed from: b */
    public static String m22879b(Context context) {
        if (context != null) {
            SharedPreferences a = C3286a.m22873a(context);
            if (a != null) {
                return a.getString("zdata", null);
            }
        }
        return "";
    }

    /* renamed from: b */
    public static void m22880b(Context context, String str) {
        if (context != null && str != null && !TextUtils.isEmpty(str)) {
            SharedPreferences a = C3286a.m22873a(context);
            if (a != null) {
                Editor edit = a.edit();
                if (edit != null) {
                    edit.putString("oaid", str).commit();
                }
            }
        }
    }

    /* renamed from: c */
    public static String m22881c(Context context) {
        try {
            Class cls = Class.forName("com.umeng.commonsdk.statistics.common.DeviceConfig");
            Method declaredMethod = cls.getDeclaredMethod("getMac", new Class[]{Context.class});
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(cls, new Object[]{context});
                if (invoke != null && (invoke instanceof String)) {
                    return (String) invoke;
                }
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    /* renamed from: c */
    public static void m22882c(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            SharedPreferences a = C3286a.m22873a(context);
            if (a != null) {
                Editor edit = a.edit();
                if (edit != null) {
                    edit.putString("resetToken", str).commit();
                }
            }
        }
    }

    /* renamed from: d */
    public static String m22883d(Context context) {
        try {
            Class cls = Class.forName("com.umeng.commonsdk.statistics.common.DeviceConfig");
            Method declaredMethod = cls.getDeclaredMethod("getOaid", new Class[]{Context.class});
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(cls, new Object[]{context});
                if (invoke != null && (invoke instanceof String)) {
                    return (String) invoke;
                }
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    /* renamed from: d */
    public static void m22884d(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            SharedPreferences a = C3286a.m22873a(context);
            if (a != null) {
                Editor edit = a.edit();
                if (edit != null) {
                    edit.putString("uabc", str).commit();
                }
            }
        }
    }

    /* renamed from: e */
    public static void m22885e(Context context, String str) {
        if (context != null && str != null && !TextUtils.isEmpty(str)) {
            SharedPreferences a = C3286a.m22873a(context);
            if (a != null) {
                Editor edit = a.edit();
                if (edit != null) {
                    edit.putString("aaid", str).commit();
                }
            }
        }
    }

    /* renamed from: f */
    public static void m22886f(Context context, String str) {
        if (context != null && str != null && !TextUtils.isEmpty(str)) {
            SharedPreferences a = C3286a.m22873a(context);
            if (a != null) {
                Editor edit = a.edit();
                if (edit != null) {
                    edit.putString("zdata", str).commit();
                }
            }
        }
    }
}
