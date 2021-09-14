package com.efs.sdk.base.p176a.p187h;

import android.util.Log;
import com.efs.sdk.base.p176a.p181d.C1682a;

/* renamed from: com.efs.sdk.base.a.h.d */
public final class C1728d {
    /* renamed from: a */
    public static void m14307a(String str, String str2) {
        if (C1682a.m14214a().f11302f) {
            Log.i(str, str2);
        }
    }

    /* renamed from: b */
    public static void m14309b(String str, String str2, Throwable th) {
        if (C1682a.m14214a().f11302f) {
            if (th == null) {
                Log.e(str, str2);
                return;
            }
            Log.e(str, str2, th);
        }
    }

    /* renamed from: a */
    public static void m14308a(String str, String str2, Throwable th) {
        if (C1682a.m14214a().f11302f) {
            if (th == null) {
                Log.w(str, str2);
                return;
            }
            Log.w(str, str2, th);
        }
    }
}
