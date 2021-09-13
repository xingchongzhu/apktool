package com.bumptech.glide.p174t;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.load.p156o.Model;
import com.umeng.analytics.pro.TType;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* renamed from: com.bumptech.glide.t.k */
/* compiled from: Util */
public final class C1639k {

    /* renamed from: a */
    private static final char[] f11258a = "0123456789abcdef".toCharArray();

    /* renamed from: b */
    private static final char[] f11259b = new char[64];

    /* renamed from: c */
    private static volatile Handler f11260c;

    /* renamed from: com.bumptech.glide.t.k$a */
    /* compiled from: Util */
    static /* synthetic */ class C1640a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11261a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11261a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11261a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f11261a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f11261a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGBA_F16     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f11261a     // Catch:{ NoSuchFieldError -> 0x003e }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p174t.C1639k.C1640a.<clinit>():void");
        }
    }

    private C1639k() {
    }

    /* renamed from: a */
    public static void m14083a() {
        if (!m14100r()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* renamed from: b */
    public static boolean m14084b(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        } else if (obj instanceof Model) {
            return ((Model) obj).mo9137a(obj2);
        } else {
            return obj.equals(obj2);
        }
    }

    /* renamed from: c */
    public static boolean m14085c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: d */
    private static String m14086d(byte[] bArr, char[] cArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            char[] cArr2 = f11258a;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & TType.f16864m];
        }
        return new String(cArr);
    }

    /* renamed from: e */
    public static <T> Queue<T> m14087e(int i) {
        return new ArrayDeque(i);
    }

    /* renamed from: f */
    public static int m14088f(int i, int i2, Config config) {
        return i * i2 * m14090h(config);
    }

    @TargetApi(19)
    /* renamed from: g */
    public static int m14089g(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            if (VERSION.SDK_INT >= 19) {
                try {
                    return bitmap.getAllocationByteCount();
                } catch (NullPointerException unused) {
                }
            }
            return bitmap.getHeight() * bitmap.getRowBytes();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot obtain size for recycled Bitmap: ");
        sb.append(bitmap);
        sb.append("[");
        sb.append(bitmap.getWidth());
        sb.append("x");
        sb.append(bitmap.getHeight());
        sb.append("] ");
        sb.append(bitmap.getConfig());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: h */
    private static int m14090h(Config config) {
        if (config == null) {
            config = Config.ARGB_8888;
        }
        int i = C1640a.f11261a[config.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 3) {
            return 2;
        }
        return i != 4 ? 4 : 8;
    }

    /* renamed from: i */
    public static <T> List<T> m14091i(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    private static Handler m14092j() {
        if (f11260c == null) {
            synchronized (C1639k.class) {
                if (f11260c == null) {
                    f11260c = new Handler(Looper.getMainLooper());
                }
            }
        }
        return f11260c;
    }

    /* renamed from: k */
    public static int m14093k(float f) {
        return m14094l(f, 17);
    }

    /* renamed from: l */
    public static int m14094l(float f, int i) {
        return m14096n(Float.floatToIntBits(f), i);
    }

    /* renamed from: m */
    public static int m14095m(int i) {
        return m14096n(i, 17);
    }

    /* renamed from: n */
    public static int m14096n(int i, int i2) {
        return (i2 * 31) + i;
    }

    /* renamed from: o */
    public static int m14097o(Object obj, int i) {
        return m14096n(obj == null ? 0 : obj.hashCode(), i);
    }

    /* renamed from: p */
    public static int m14098p(boolean z, int i) {
        return m14096n(z ? 1 : 0, i);
    }

    /* renamed from: q */
    public static boolean m14099q() {
        return !m14100r();
    }

    /* renamed from: r */
    public static boolean m14100r() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: s */
    private static boolean m14101s(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    /* renamed from: t */
    public static boolean m14102t(int i, int i2) {
        return m14101s(i) && m14101s(i2);
    }

    /* renamed from: u */
    public static void m14103u(Runnable runnable) {
        m14092j().post(runnable);
    }

    /* renamed from: v */
    public static void m14104v(Runnable runnable) {
        m14092j().removeCallbacks(runnable);
    }

    /* renamed from: w */
    public static String m14105w(byte[] bArr) {
        String d;
        char[] cArr = f11259b;
        synchronized (cArr) {
            d = m14086d(bArr, cArr);
        }
        return d;
    }
}
