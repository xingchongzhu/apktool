package p262d.p270b;

import java.util.Objects;

/* renamed from: d.b.c */
/* compiled from: Preconditions */
public final class C3295c {
    /* renamed from: a */
    public static <T> void m22905a(T t, Class<T> cls) {
        if (t == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getCanonicalName());
            sb.append(" must be set");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: b */
    public static <T> T m22906b(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: c */
    public static <T> T m22907c(T t) {
        Objects.requireNonNull(t, "Cannot return null from a non-@Nullable @Provides method");
        return t;
    }
}
