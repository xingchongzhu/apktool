package com.bumptech.glide.p174t;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.os.SystemClock;

/* renamed from: com.bumptech.glide.t.f */
public final class LogTime {

    /* renamed from: a */
    private static final double f11247a;

    static {
        double d = 1.0d;
        if (VERSION.SDK_INT >= 17) {
            d = 1.0d / Math.pow(10.0d, 6.0d);
        }
        f11247a = d;
    }

    /* renamed from: a */
    public static double m14064a(long j) {
        double b = (double) (m14065b() - j);
        double d = f11247a;
        Double.isNaN(b);
        return b * d;
    }

    @TargetApi(17)
    /* renamed from: b */
    public static long m14065b() {
        if (VERSION.SDK_INT >= 17) {
            return SystemClock.elapsedRealtimeNanos();
        }
        return SystemClock.uptimeMillis();
    }
}
