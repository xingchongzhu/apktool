package p067c.p068a.p069a.p070a.p111m2;

/* renamed from: c.a.a.a.m2.d0 */
public final class RepeatModeUtil {
    /* renamed from: a */
    public static int m10140a(int i, int i2) {
        for (int i3 = 1; i3 <= 2; i3++) {
            int i4 = (i + i3) % 3;
            if (m10141b(i4, i2)) {
                return i4;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static boolean m10141b(int i, int i2) {
        boolean z = true;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                if ((i2 & 2) == 0) {
                    z = false;
                }
                return z;
            } else if ((i2 & 1) == 0) {
                z = false;
            }
        }
        return z;
    }
}
