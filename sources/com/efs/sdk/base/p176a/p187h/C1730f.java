package com.efs.sdk.base.p176a.p187h;

import android.content.Context;

/* renamed from: com.efs.sdk.base.a.h.f */
public final class C1730f {
    /* renamed from: a */
    public static String m14314a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionName;
        } catch (Throwable th) {
            C1728d.m14308a("efs.util.pkg", "get version name error", th);
            return "unknown";
        }
    }

    /* renamed from: b */
    public static String m14315b(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionCode);
        } catch (Throwable th) {
            C1728d.m14308a("efs.util.pkg", "get version name error", th);
            return "unknown";
        }
    }
}
