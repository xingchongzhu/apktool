package com.umeng.analytics.pro;

import android.content.Context;
import android.os.Looper;

/* renamed from: com.umeng.analytics.pro.z */
public class OpenDeviceId {

    /* renamed from: a */
    private static IDeviceIdSupplier f17265a = null;

    /* renamed from: b */
    private static boolean f17266b = false;

    /* renamed from: a */
    public static synchronized String m22153a(Context context) {
        synchronized (OpenDeviceId.class) {
            if (context != null) {
                try {
                    if (Looper.myLooper() != Looper.getMainLooper()) {
                        m22154b(context);
                        IDeviceIdSupplier yVar = f17265a;
                        if (yVar != null) {
                            try {
                                String a = yVar.mo18859a(context);
                                return a;
                            } catch (Exception unused) {
                            }
                        }
                        return null;
                    }
                    throw new IllegalStateException("Cannot be called from the main thread");
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                throw new RuntimeException("Context is null");
            }
        }
    }

    /* renamed from: b */
    private static void m22154b(Context context) {
        if (f17265a == null && !f17266b) {
            synchronized (OpenDeviceId.class) {
                if (f17265a == null && !f17266b) {
                    f17265a = DeviceIdSupplier.m21485a(context);
                    f17266b = true;
                }
            }
        }
    }
}
