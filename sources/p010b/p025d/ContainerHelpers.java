package p010b.p025d;

/* renamed from: b.d.c */
class ContainerHelpers {

    /* renamed from: a */
    static final int[] f3930a = new int[0];

    /* renamed from: b */
    static final long[] f3931b = new long[0];

    /* renamed from: c */
    static final Object[] f3932c = new Object[0];

    /* renamed from: a */
    static int m4457a(int[] iArr, int i, int i2) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else if (i6 <= i2) {
                return i5;
            } else {
                i3 = i5 - 1;
            }
        }
        return i4 ^ -1;
    }

    /* renamed from: b */
    static int m4458b(long[] jArr, int i, long j) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else if (j2 <= j) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return i3 ^ -1;
    }

    /* renamed from: c */
    public static boolean m4459c(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: d */
    public static int m4460d(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            int i3 = (1 << i2) - 12;
            if (i <= i3) {
                return i3;
            }
        }
        return i;
    }

    /* renamed from: e */
    public static int m4461e(int i) {
        return m4460d(i * 4) / 4;
    }

    /* renamed from: f */
    public static int m4462f(int i) {
        return m4460d(i * 8) / 8;
    }
}
