package p067c.google.p134b.p135a;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: c.a.b.a.g */
/* compiled from: Preconditions */
public final class C1320g {
    /* renamed from: a */
    private static String m11642a(int i, int i2, @NullableDecl String str) {
        if (i < 0) {
            return Strings.m11673a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return Strings.m11673a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: b */
    private static String m11643b(int i, int i2, @NullableDecl String str) {
        if (i < 0) {
            return Strings.m11673a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return Strings.m11673a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: c */
    private static String m11644c(int i, int i2, int i3) {
        if (i < 0 || i > i3) {
            return m11643b(i, i3, "start index");
        }
        if (i2 < 0 || i2 > i3) {
            return m11643b(i2, i3, "end index");
        }
        return Strings.m11673a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
    }

    /* renamed from: d */
    public static void m11645d(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: e */
    public static void m11646e(boolean z, @NullableDecl Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: f */
    public static void m11647f(boolean z, @NullableDecl String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(Strings.m11673a(str, Long.valueOf(j)));
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: g */
    public static int m11648g(int i, int i2) {
        return m11649h(i, i2, "index");
    }

    @CanIgnoreReturnValue
    /* renamed from: h */
    public static int m11649h(int i, int i2, @NullableDecl String str) {
        if (i >= 0 && i < i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m11642a(i, i2, str));
    }

    @NonNullDecl
    @CanIgnoreReturnValue
    /* renamed from: i */
    public static <T> T m11650i(@NonNullDecl T t) {
        Objects.requireNonNull(t);
        return t;
    }

    @NonNullDecl
    @CanIgnoreReturnValue
    /* renamed from: j */
    public static <T> T m11651j(@NonNullDecl T t, @NullableDecl Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @CanIgnoreReturnValue
    /* renamed from: k */
    public static int m11652k(int i, int i2) {
        return m11653l(i, i2, "index");
    }

    @CanIgnoreReturnValue
    /* renamed from: l */
    public static int m11653l(int i, int i2, @NullableDecl String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m11643b(i, i2, str));
    }

    /* renamed from: m */
    public static void m11654m(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException(m11644c(i, i2, i3));
        }
    }

    /* renamed from: n */
    public static void m11655n(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: o */
    public static void m11656o(boolean z, @NullableDecl Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
