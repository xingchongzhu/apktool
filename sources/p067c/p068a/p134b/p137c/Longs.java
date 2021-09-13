package p067c.p068a.p134b.p137c;

import p067c.p068a.p134b.p135a.C1320g;

/* renamed from: c.a.b.c.d */
public final class Longs {
    /* renamed from: a */
    public static int m12046a(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    /* renamed from: b */
    public static int m12047b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: c */
    public static long m12048c(long... jArr) {
        C1320g.m11645d(jArr.length > 0);
        long j = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            if (jArr[i] > j) {
                j = jArr[i];
            }
        }
        return j;
    }
}
