package p067c.p068a.p134b.p136b;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

/* renamed from: c.a.b.b.k0 */
final class Platform {
    /* renamed from: a */
    static <T> T[] m11836a(Object[] objArr, int i, int i2, T[] tArr) {
        return Arrays.copyOfRange(objArr, i, i2, tArr.getClass());
    }

    /* renamed from: b */
    static <T> T[] m11837b(T[] tArr, int i) {
        return (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i);
    }

    /* renamed from: c */
    static <K, V> Map<K, V> m11838c() {
        return CompactHashMap.m11805f();
    }
}
