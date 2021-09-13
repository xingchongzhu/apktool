package p067c.p068a.p069a.p070a.p111m2;

import com.p259uc.crashsdk.export.LogType;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: c.a.a.a.m2.y */
public final class NalUnitUtil {

    /* renamed from: a */
    public static final byte[] f8442a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final float[] f8443b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c */
    private static final Object f8444c = new Object();

    /* renamed from: d */
    private static int[] f8445d = new int[10];

    /* renamed from: c.a.a.a.m2.y$a */
    /* compiled from: NalUnitUtil */
    public static final class C1200a {

        /* renamed from: a */
        public final int f8446a;

        /* renamed from: b */
        public final int f8447b;

        /* renamed from: c */
        public final boolean f8448c;

        public C1200a(int i, int i2, boolean z) {
            this.f8446a = i;
            this.f8447b = i2;
            this.f8448c = z;
        }
    }

    /* renamed from: c.a.a.a.m2.y$b */
    /* compiled from: NalUnitUtil */
    public static final class C1201b {

        /* renamed from: a */
        public final int f8449a;

        /* renamed from: b */
        public final int f8450b;

        /* renamed from: c */
        public final int f8451c;

        /* renamed from: d */
        public final int f8452d;

        /* renamed from: e */
        public final int f8453e;

        /* renamed from: f */
        public final int f8454f;

        /* renamed from: g */
        public final float f8455g;

        /* renamed from: h */
        public final boolean f8456h;

        /* renamed from: i */
        public final boolean f8457i;

        /* renamed from: j */
        public final int f8458j;

        /* renamed from: k */
        public final int f8459k;

        /* renamed from: l */
        public final int f8460l;

        /* renamed from: m */
        public final boolean f8461m;

        public C1201b(int i, int i2, int i3, int i4, int i5, int i6, float f, boolean z, boolean z2, int i7, int i8, int i9, boolean z3) {
            this.f8449a = i;
            this.f8450b = i2;
            this.f8451c = i3;
            this.f8452d = i4;
            this.f8453e = i5;
            this.f8454f = i6;
            this.f8455g = f;
            this.f8456h = z;
            this.f8457i = z2;
            this.f8458j = i7;
            this.f8459k = i8;
            this.f8460l = i9;
            this.f8461m = z3;
        }
    }

    /* renamed from: a */
    public static void m10418a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* renamed from: b */
    public static void m10419b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 < position) {
                byte b = byteBuffer.get(i) & 255;
                if (i2 == 3) {
                    if (b == 1 && (byteBuffer.get(i3) & 31) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (b == 0) {
                    i2++;
                }
                if (b != 0) {
                    i2 = 0;
                }
                i = i3;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    /* renamed from: c */
    public static int m10420c(byte[] bArr, int i, int i2, boolean[] zArr) {
        boolean z;
        int i3 = i2 - i;
        boolean z2 = false;
        Assertions.m10154f(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            m10418a(zArr);
            return i - 3;
        } else if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            m10418a(zArr);
            return i - 2;
        } else if (i3 <= 2 || !zArr[2] || bArr[i] != 0 || bArr[i + 1] != 1) {
            int i4 = i2 - 1;
            int i5 = i + 2;
            while (i5 < i4) {
                if ((bArr[i5] & 254) == 0) {
                    int i6 = i5 - 2;
                    if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && bArr[i5] == 1) {
                        m10418a(zArr);
                        return i6;
                    }
                    i5 -= 2;
                }
                i5 += 3;
            }
            if (i3 <= 2 ? i3 != 2 ? !zArr[1] || bArr[i4] != 1 : !(zArr[2] && bArr[i2 - 2] == 0 && bArr[i4] == 1) : !(bArr[i2 - 3] == 0 && bArr[i2 - 2] == 0 && bArr[i4] == 1)) {
                z = false;
            } else {
                z = true;
            }
            zArr[0] = z;
            zArr[1] = i3 <= 1 ? !(!zArr[2] || bArr[i4] != 0) : bArr[i2 + -2] == 0 && bArr[i4] == 0;
            if (bArr[i4] == 0) {
                z2 = true;
            }
            zArr[2] = z2;
            return i2;
        } else {
            m10418a(zArr);
            return i - 1;
        }
    }

    /* renamed from: d */
    private static int m10421d(byte[] bArr, int i, int i2) {
        while (i < i2 - 2) {
            if (bArr[i] == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 3) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: e */
    public static int m10422e(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    /* renamed from: f */
    public static int m10423f(byte[] bArr, int i) {
        return bArr[i + 3] & 31;
    }

    /* renamed from: g */
    public static boolean m10424g(String str, byte b) {
        if ("video/avc".equals(str) && (b & 31) == 6) {
            return true;
        }
        if (!"video/hevc".equals(str) || ((b & 126) >> 1) != 39) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static C1200a m10425h(byte[] bArr, int i, int i2) {
        ParsableNalUnitBitArray b0Var = new ParsableNalUnitBitArray(bArr, i, i2);
        b0Var.mo7411l(8);
        int h = b0Var.mo7408h();
        int h2 = b0Var.mo7408h();
        b0Var.mo7410k();
        return new C1200a(h, h2, b0Var.mo7405d());
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0149  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p067c.p068a.p069a.p070a.p111m2.NalUnitUtil.C1201b m10426i(byte[] r21, int r22, int r23) {
        /*
            c.a.a.a.m2.b0 r0 = new c.a.a.a.m2.b0
            r1 = r21
            r2 = r22
            r3 = r23
            r0.<init>(r1, r2, r3)
            r1 = 8
            r0.mo7411l(r1)
            int r3 = r0.mo7406e(r1)
            int r4 = r0.mo7406e(r1)
            int r5 = r0.mo7406e(r1)
            int r6 = r0.mo7408h()
            r2 = 3
            r9 = 1
            r10 = 100
            if (r3 == r10) goto L_0x004e
            r10 = 110(0x6e, float:1.54E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 122(0x7a, float:1.71E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 244(0xf4, float:3.42E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 44
            if (r3 == r10) goto L_0x004e
            r10 = 83
            if (r3 == r10) goto L_0x004e
            r10 = 86
            if (r3 == r10) goto L_0x004e
            r10 = 118(0x76, float:1.65E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 128(0x80, float:1.794E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 138(0x8a, float:1.93E-43)
            if (r3 != r10) goto L_0x004b
            goto L_0x004e
        L_0x004b:
            r10 = 1
            r11 = 0
            goto L_0x0087
        L_0x004e:
            int r10 = r0.mo7408h()
            if (r10 != r2) goto L_0x0059
            boolean r11 = r0.mo7405d()
            goto L_0x005a
        L_0x0059:
            r11 = 0
        L_0x005a:
            r0.mo7408h()
            r0.mo7408h()
            r0.mo7410k()
            boolean r12 = r0.mo7405d()
            if (r12 == 0) goto L_0x0087
            if (r10 == r2) goto L_0x006e
            r12 = 8
            goto L_0x0070
        L_0x006e:
            r12 = 12
        L_0x0070:
            r13 = 0
        L_0x0071:
            if (r13 >= r12) goto L_0x0087
            boolean r14 = r0.mo7405d()
            if (r14 == 0) goto L_0x0084
            r14 = 6
            if (r13 >= r14) goto L_0x007f
            r14 = 16
            goto L_0x0081
        L_0x007f:
            r14 = 64
        L_0x0081:
            m10427j(r0, r14)
        L_0x0084:
            int r13 = r13 + 1
            goto L_0x0071
        L_0x0087:
            int r12 = r0.mo7408h()
            int r12 = r12 + 4
            int r13 = r0.mo7408h()
            if (r13 != 0) goto L_0x009a
            int r14 = r0.mo7408h()
            int r14 = r14 + 4
            goto L_0x00bb
        L_0x009a:
            if (r13 != r9) goto L_0x00ba
            boolean r14 = r0.mo7405d()
            r0.mo7407g()
            r0.mo7407g()
            int r15 = r0.mo7408h()
            long r1 = (long) r15
            r15 = 0
        L_0x00ac:
            long r7 = (long) r15
            int r17 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r17 >= 0) goto L_0x00b7
            r0.mo7408h()
            int r15 = r15 + 1
            goto L_0x00ac
        L_0x00b7:
            r15 = r14
            r14 = 0
            goto L_0x00bc
        L_0x00ba:
            r14 = 0
        L_0x00bb:
            r15 = 0
        L_0x00bc:
            r0.mo7408h()
            r0.mo7410k()
            int r1 = r0.mo7408h()
            int r1 = r1 + r9
            int r2 = r0.mo7408h()
            int r2 = r2 + r9
            boolean r16 = r0.mo7405d()
            int r7 = 2 - r16
            int r7 = r7 * r2
            if (r16 != 0) goto L_0x00d9
            r0.mo7410k()
        L_0x00d9:
            r0.mo7410k()
            r2 = 16
            int r1 = r1 * 16
            int r7 = r7 * 16
            boolean r2 = r0.mo7405d()
            if (r2 == 0) goto L_0x011c
            int r2 = r0.mo7408h()
            int r8 = r0.mo7408h()
            int r17 = r0.mo7408h()
            int r18 = r0.mo7408h()
            if (r10 != 0) goto L_0x00fd
            int r10 = 2 - r16
            goto L_0x0112
        L_0x00fd:
            r19 = 2
            r9 = 3
            if (r10 != r9) goto L_0x0106
            r9 = 1
            r20 = 1
            goto L_0x0109
        L_0x0106:
            r9 = 1
            r20 = 2
        L_0x0109:
            if (r10 != r9) goto L_0x010c
            r9 = 2
        L_0x010c:
            int r10 = 2 - r16
            int r10 = r10 * r9
            r9 = r20
        L_0x0112:
            int r2 = r2 + r8
            int r2 = r2 * r9
            int r1 = r1 - r2
            int r17 = r17 + r18
            int r17 = r17 * r10
            int r7 = r7 - r17
        L_0x011c:
            r8 = r7
            r7 = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            boolean r2 = r0.mo7405d()
            if (r2 == 0) goto L_0x0168
            boolean r2 = r0.mo7405d()
            if (r2 == 0) goto L_0x0168
            r2 = 8
            int r2 = r0.mo7406e(r2)
            r9 = 255(0xff, float:3.57E-43)
            if (r2 != r9) goto L_0x0149
            r9 = 16
            int r2 = r0.mo7406e(r9)
            int r0 = r0.mo7406e(r9)
            if (r2 == 0) goto L_0x0147
            if (r0 == 0) goto L_0x0147
            float r1 = (float) r2
            float r0 = (float) r0
            float r1 = r1 / r0
        L_0x0147:
            r9 = r1
            goto L_0x016a
        L_0x0149:
            float[] r0 = f8443b
            int r9 = r0.length
            if (r2 >= r9) goto L_0x0152
            r0 = r0[r2]
            r9 = r0
            goto L_0x016a
        L_0x0152:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r9 = "Unexpected aspect_ratio_idc value: "
            r0.append(r9)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "NalUnitUtil"
            p067c.p068a.p069a.p070a.p111m2.Log.m10386h(r2, r0)
        L_0x0168:
            r9 = 1065353216(0x3f800000, float:1.0)
        L_0x016a:
            c.a.a.a.m2.y$b r0 = new c.a.a.a.m2.y$b
            r2 = r0
            r10 = r11
            r11 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p111m2.NalUnitUtil.m10426i(byte[], int, int):c.a.a.a.m2.y$b");
    }

    /* renamed from: j */
    private static void m10427j(ParsableNalUnitBitArray b0Var, int i) {
        int i2 = 8;
        int i3 = 8;
        for (int i4 = 0; i4 < i; i4++) {
            if (i2 != 0) {
                i2 = ((b0Var.mo7407g() + i3) + LogType.UNEXP) % LogType.UNEXP;
            }
            if (i2 != 0) {
                i3 = i2;
            }
        }
    }

    /* renamed from: k */
    public static int m10428k(byte[] bArr, int i) {
        int i2;
        synchronized (f8444c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                try {
                    i3 = m10421d(bArr, i3, i);
                    if (i3 < i) {
                        int[] iArr = f8445d;
                        if (iArr.length <= i4) {
                            f8445d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        int i5 = i4 + 1;
                        f8445d[i4] = i3;
                        i3 += 3;
                        i4 = i5;
                    }
                } finally {
                }
            }
            i2 = i - i4;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = f8445d[i8] - i7;
                System.arraycopy(bArr, i7, bArr, i6, i9);
                int i10 = i6 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i6 = i11 + 1;
                bArr[i11] = 0;
                i7 += i9 + 3;
            }
            System.arraycopy(bArr, i7, bArr, i6, i2 - i6);
        }
        return i2;
    }
}
