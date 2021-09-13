package androidx.core.content.p007c;

import java.lang.reflect.Array;

/* renamed from: androidx.core.content.c.e */
final class GrowingArrayUtils {
    /* renamed from: a */
    public static int[] m1808a(int[] iArr, int i, int i2) {
        if (i + 1 > iArr.length) {
            int[] iArr2 = new int[m1810c(i)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr = iArr2;
        }
        iArr[i] = i2;
        return iArr;
    }

    /* renamed from: b */
    public static <T> T[] m1809b(T[] tArr, int i, T t) {
        if (i + 1 > tArr.length) {
            T[] tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), m1810c(i));
            System.arraycopy(tArr, 0, tArr2, 0, i);
            tArr = tArr2;
        }
        tArr[i] = t;
        return tArr;
    }

    /* renamed from: c */
    public static int m1810c(int i) {
        if (i <= 4) {
            return 8;
        }
        return i * 2;
    }
}
