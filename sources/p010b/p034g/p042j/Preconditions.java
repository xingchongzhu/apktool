package p010b.p034g.p042j;

import java.util.Locale;
import java.util.Objects;

/* renamed from: b.g.j.h */
public final class Preconditions {
    /* renamed from: a */
    public static void m5184a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: b */
    public static int m5185b(int i, int i2, int i3, String str) {
        if (i < i2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i3)}));
        } else if (i <= i3) {
            return i;
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i3)}));
        }
    }

    /* renamed from: c */
    public static int m5186c(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: d */
    public static int m5187d(int i, int i2) {
        if ((i & i2) == i) {
            return i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Requested flags 0x");
        sb.append(Integer.toHexString(i));
        sb.append(", but only 0x");
        sb.append(Integer.toHexString(i2));
        sb.append(" are allowed");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: e */
    public static <T> T m5188e(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: f */
    public static <T> T m5189f(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }
}
