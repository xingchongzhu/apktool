package p262d.p263a.p269c;

import java.util.Objects;

/* renamed from: d.a.c.c */
/* compiled from: Preconditions */
public final class C3294c {
    /* renamed from: a */
    public static <T> T m22900a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: b */
    public static <T> T m22901b(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: c */
    public static void m22902c(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }
}
