package p067c.p068a.p134b.p136b;

import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* renamed from: c.a.b.b.i0 */
public final class ObjectArrays {
    @CanIgnoreReturnValue
    /* renamed from: a */
    static Object m11788a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("at index ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    @CanIgnoreReturnValue
    /* renamed from: b */
    static Object[] m11789b(Object... objArr) {
        return m11790c(objArr, objArr.length);
    }

    @CanIgnoreReturnValue
    /* renamed from: c */
    static Object[] m11790c(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            m11788a(objArr[i2], i2);
        }
        return objArr;
    }

    /* renamed from: d */
    public static <T> T[] m11791d(T[] tArr, int i) {
        return Platform.m11837b(tArr, i);
    }
}
