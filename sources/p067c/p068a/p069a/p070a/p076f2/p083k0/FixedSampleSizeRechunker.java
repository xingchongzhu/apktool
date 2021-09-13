package p067c.p068a.p069a.p070a.p076f2.p083k0;

import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.f2.k0.h */
final class FixedSampleSizeRechunker {

    /* renamed from: c.a.a.a.f2.k0.h$b */
    /* compiled from: FixedSampleSizeRechunker */
    public static final class C0955b {

        /* renamed from: a */
        public final long[] f6367a;

        /* renamed from: b */
        public final int[] f6368b;

        /* renamed from: c */
        public final int f6369c;

        /* renamed from: d */
        public final long[] f6370d;

        /* renamed from: e */
        public final int[] f6371e;

        /* renamed from: f */
        public final long f6372f;

        private C0955b(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
            this.f6367a = jArr;
            this.f6368b = iArr;
            this.f6369c = i;
            this.f6370d = jArr2;
            this.f6371e = iArr2;
            this.f6372f = j;
        }
    }

    /* renamed from: a */
    public static C0955b m7724a(int i, long[] jArr, int[] iArr, long j) {
        int[] iArr2 = iArr;
        int i2 = 8192 / i;
        int i3 = 0;
        for (int k : iArr2) {
            i3 += Util.m10297k(k, i2);
        }
        long[] jArr2 = new long[i3];
        int[] iArr3 = new int[i3];
        long[] jArr3 = new long[i3];
        int[] iArr4 = new int[i3];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < iArr2.length; i7++) {
            int i8 = iArr2[i7];
            long j2 = jArr[i7];
            while (i8 > 0) {
                int min = Math.min(i2, i8);
                jArr2[i5] = j2;
                iArr3[i5] = i * min;
                i6 = Math.max(i6, iArr3[i5]);
                jArr3[i5] = ((long) i4) * j;
                iArr4[i5] = 1;
                j2 += (long) iArr3[i5];
                i4 += min;
                i8 -= min;
                i5++;
            }
        }
        C0955b bVar = new C0955b(jArr2, iArr3, i6, jArr3, iArr4, j * ((long) i4));
        return bVar;
    }
}
