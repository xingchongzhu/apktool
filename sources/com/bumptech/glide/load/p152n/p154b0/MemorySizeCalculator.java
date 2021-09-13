package com.bumptech.glide.load.p152n.p154b0;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* renamed from: com.bumptech.glide.load.n.b0.i */
public final class MemorySizeCalculator {

    /* renamed from: a */
    private final int f10426a;

    /* renamed from: b */
    private final int f10427b;

    /* renamed from: c */
    private final Context f10428c;

    /* renamed from: d */
    private final int f10429d;

    /* renamed from: com.bumptech.glide.load.n.b0.i$a */
    /* compiled from: MemorySizeCalculator */
    public static final class C1462a {

        /* renamed from: a */
        static final int f10430a = (VERSION.SDK_INT < 26 ? 4 : 1);

        /* renamed from: b */
        final Context f10431b;

        /* renamed from: c */
        ActivityManager f10432c;

        /* renamed from: d */
        C1464c f10433d;

        /* renamed from: e */
        float f10434e = 2.0f;

        /* renamed from: f */
        float f10435f = ((float) f10430a);

        /* renamed from: g */
        float f10436g = 0.4f;

        /* renamed from: h */
        float f10437h = 0.33f;

        /* renamed from: i */
        int f10438i = 4194304;

        public C1462a(Context context) {
            this.f10431b = context;
            this.f10432c = (ActivityManager) context.getSystemService("activity");
            this.f10433d = new C1463b(context.getResources().getDisplayMetrics());
            if (VERSION.SDK_INT >= 26 && MemorySizeCalculator.m12780e(this.f10432c)) {
                this.f10435f = 0.0f;
            }
        }

        /* renamed from: a */
        public MemorySizeCalculator mo8934a() {
            return new MemorySizeCalculator(this);
        }
    }

    /* renamed from: com.bumptech.glide.load.n.b0.i$b */
    /* compiled from: MemorySizeCalculator */
    private static final class C1463b implements C1464c {

        /* renamed from: a */
        private final DisplayMetrics f10439a;

        C1463b(DisplayMetrics displayMetrics) {
            this.f10439a = displayMetrics;
        }

        /* renamed from: a */
        public int mo8935a() {
            return this.f10439a.heightPixels;
        }

        /* renamed from: b */
        public int mo8936b() {
            return this.f10439a.widthPixels;
        }
    }

    /* renamed from: com.bumptech.glide.load.n.b0.i$c */
    /* compiled from: MemorySizeCalculator */
    interface C1464c {
        /* renamed from: a */
        int mo8935a();

        /* renamed from: b */
        int mo8936b();
    }

    MemorySizeCalculator(C1462a aVar) {
        int i;
        this.f10428c = aVar.f10431b;
        if (m12780e(aVar.f10432c)) {
            i = aVar.f10438i / 2;
        } else {
            i = aVar.f10438i;
        }
        this.f10429d = i;
        int c = m12779c(aVar.f10432c, aVar.f10436g, aVar.f10437h);
        float b = (float) (aVar.f10433d.mo8936b() * aVar.f10433d.mo8935a() * 4);
        int round = Math.round(aVar.f10435f * b);
        int round2 = Math.round(b * aVar.f10434e);
        int i2 = c - i;
        int i3 = round2 + round;
        if (i3 <= i2) {
            this.f10427b = round2;
            this.f10426a = round;
        } else {
            float f = (float) i2;
            float f2 = aVar.f10435f;
            float f3 = aVar.f10434e;
            float f4 = f / (f2 + f3);
            this.f10427b = Math.round(f3 * f4);
            this.f10426a = Math.round(f4 * aVar.f10435f);
        }
        String str = "MemorySizeCalculator";
        if (Log.isLoggable(str, 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(m12781f(this.f10427b));
            sb.append(", pool size: ");
            sb.append(m12781f(this.f10426a));
            sb.append(", byte array size: ");
            sb.append(m12781f(i));
            sb.append(", memory class limited? ");
            sb.append(i3 > c);
            sb.append(", max size: ");
            sb.append(m12781f(c));
            sb.append(", memoryClass: ");
            sb.append(aVar.f10432c.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(m12780e(aVar.f10432c));
            Log.d(str, sb.toString());
        }
    }

    /* renamed from: c */
    private static int m12779c(ActivityManager activityManager, float f, float f2) {
        float memoryClass = (float) (activityManager.getMemoryClass() * 1024 * 1024);
        if (m12780e(activityManager)) {
            f = f2;
        }
        return Math.round(memoryClass * f);
    }

    @TargetApi(19)
    /* renamed from: e */
    static boolean m12780e(ActivityManager activityManager) {
        if (VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return true;
    }

    /* renamed from: f */
    private String m12781f(int i) {
        return Formatter.formatFileSize(this.f10428c, (long) i);
    }

    /* renamed from: a */
    public int mo8931a() {
        return this.f10429d;
    }

    /* renamed from: b */
    public int mo8932b() {
        return this.f10426a;
    }

    /* renamed from: d */
    public int mo8933d() {
        return this.f10427b;
    }
}
