package com.p259uc.crashsdk.p260a;

import android.util.Log;
import com.p259uc.crashsdk.C3084b;
import com.p259uc.crashsdk.C3093g;
import com.p259uc.crashsdk.JNIBridge;

/* renamed from: com.uc.crashsdk.a.a */
/* compiled from: ProGuard */
public final class C3075a {
    /* renamed from: a */
    public static void m20975a(String str) {
        if (C3093g.m21362M()) {
            Log.d("crashsdk", str);
        }
    }

    /* renamed from: b */
    public static void m20978b(String str) {
        if (C3093g.m21362M()) {
            Log.w("crashsdk", str);
        }
    }

    /* renamed from: c */
    public static void m20980c(String str, String str2) {
        if (C3084b.f16345d) {
            JNIBridge.nativeLog(5, str, str2);
        } else {
            Log.w(str, str2);
        }
    }

    /* renamed from: d */
    public static void m20981d(String str, String str2) {
        if (C3084b.f16345d) {
            JNIBridge.nativeLog(6, str, str2);
        } else {
            Log.e(str, str2);
        }
    }

    /* renamed from: a */
    public static void m20976a(String str, String str2) {
        if (C3093g.m21362M()) {
            Log.i(str, str2);
        }
    }

    /* renamed from: b */
    public static void m20979b(String str, String str2) {
        if (C3084b.f16345d) {
            JNIBridge.nativeLog(4, str, str2);
        } else {
            Log.i(str, str2);
        }
    }

    /* renamed from: a */
    public static void m20977a(String str, String str2, Throwable th) {
        if (C3093g.m21362M()) {
            if (th == null) {
                Log.e(str, str2);
                return;
            }
            Log.e(str, str2, th);
        }
    }
}
