package p010b.p034g.p035d;

import android.graphics.Color;

/* renamed from: b.g.d.a */
public final class ColorUtils {

    /* renamed from: a */
    private static final ThreadLocal<double[]> f4454a = new ThreadLocal<>();

    /* renamed from: a */
    private static int m4967a(int i, int i2) {
        return 255 - (((255 - i2) * (255 - i)) / 255);
    }

    /* renamed from: b */
    public static int m4968b(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int a = m4967a(alpha2, alpha);
        return Color.argb(a, m4969c(Color.red(i), alpha2, Color.red(i2), alpha, a), m4969c(Color.green(i), alpha2, Color.green(i2), alpha, a), m4969c(Color.blue(i), alpha2, Color.blue(i2), alpha, a));
    }

    /* renamed from: c */
    private static int m4969c(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    /* renamed from: d */
    public static int m4970d(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
