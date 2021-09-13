package com.bumptech.glide.p174t;

import android.text.TextUtils;
import java.util.Collection;
import java.util.Objects;

/* renamed from: com.bumptech.glide.t.j */
/* compiled from: Preconditions */
public final class C1638j {
    /* renamed from: a */
    public static void m14078a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static String m14079b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    /* renamed from: c */
    public static <T extends Collection<Y>, Y> T m14080c(T t) {
        if (!t.isEmpty()) {
            return t;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    /* renamed from: d */
    public static <T> T m14081d(T t) {
        return m14082e(t, "Argument must not be null");
    }

    /* renamed from: e */
    public static <T> T m14082e(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }
}
