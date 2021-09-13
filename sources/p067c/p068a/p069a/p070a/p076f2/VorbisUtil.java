package p067c.p068a.p069a.p070a.p076f2;

import java.util.Arrays;
import p067c.p068a.p069a.p070a.ParserException;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;

/* renamed from: c.a.a.a.f2.d0 */
public final class VorbisUtil {

    /* renamed from: c.a.a.a.f2.d0$a */
    /* compiled from: VorbisUtil */
    private static final class C0919a {

        /* renamed from: a */
        public final int f6001a;

        /* renamed from: b */
        public final int f6002b;

        /* renamed from: c */
        public final long[] f6003c;

        /* renamed from: d */
        public final int f6004d;

        /* renamed from: e */
        public final boolean f6005e;

        public C0919a(int i, int i2, long[] jArr, int i3, boolean z) {
            this.f6001a = i;
            this.f6002b = i2;
            this.f6003c = jArr;
            this.f6004d = i3;
            this.f6005e = z;
        }
    }

    /* renamed from: c.a.a.a.f2.d0$b */
    /* compiled from: VorbisUtil */
    public static final class C0920b {

        /* renamed from: a */
        public final String f6006a;

        /* renamed from: b */
        public final String[] f6007b;

        /* renamed from: c */
        public final int f6008c;

        public C0920b(String str, String[] strArr, int i) {
            this.f6006a = str;
            this.f6007b = strArr;
            this.f6008c = i;
        }
    }

    /* renamed from: c.a.a.a.f2.d0$c */
    /* compiled from: VorbisUtil */
    public static final class C0921c {

        /* renamed from: a */
        public final boolean f6009a;

        /* renamed from: b */
        public final int f6010b;

        /* renamed from: c */
        public final int f6011c;

        /* renamed from: d */
        public final int f6012d;

        public C0921c(boolean z, int i, int i2, int i3) {
            this.f6009a = z;
            this.f6010b = i;
            this.f6011c = i2;
            this.f6012d = i3;
        }
    }

    /* renamed from: c.a.a.a.f2.d0$d */
    /* compiled from: VorbisUtil */
    public static final class C0922d {

        /* renamed from: a */
        public final int f6013a;

        /* renamed from: b */
        public final int f6014b;

        /* renamed from: c */
        public final int f6015c;

        /* renamed from: d */
        public final int f6016d;

        /* renamed from: e */
        public final int f6017e;

        /* renamed from: f */
        public final int f6018f;

        /* renamed from: g */
        public final int f6019g;

        /* renamed from: h */
        public final int f6020h;

        /* renamed from: i */
        public final boolean f6021i;

        /* renamed from: j */
        public final byte[] f6022j;

        public C0922d(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, byte[] bArr) {
            this.f6013a = i;
            this.f6014b = i2;
            this.f6015c = i3;
            this.f6016d = i4;
            this.f6017e = i5;
            this.f6018f = i6;
            this.f6019g = i7;
            this.f6020h = i8;
            this.f6021i = z;
            this.f6022j = bArr;
        }
    }

    /* renamed from: a */
    public static int m7344a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    /* renamed from: b */
    private static long m7345b(long j, long j2) {
        double d = (double) j;
        double d2 = (double) j2;
        Double.isNaN(d2);
        return (long) Math.floor(Math.pow(d, 1.0d / d2));
    }

    /* renamed from: c */
    private static C0919a m7346c(VorbisBitArray c0Var) throws ParserException {
        if (c0Var.mo6184d(24) == 5653314) {
            int d = c0Var.mo6184d(16);
            int d2 = c0Var.mo6184d(24);
            long[] jArr = new long[d2];
            boolean c = c0Var.mo6183c();
            long j = 0;
            if (!c) {
                boolean c2 = c0Var.mo6183c();
                for (int i = 0; i < d2; i++) {
                    if (!c2) {
                        jArr[i] = (long) (c0Var.mo6184d(5) + 1);
                    } else if (c0Var.mo6183c()) {
                        jArr[i] = (long) (c0Var.mo6184d(5) + 1);
                    } else {
                        jArr[i] = 0;
                    }
                }
            } else {
                int d3 = c0Var.mo6184d(5) + 1;
                int i2 = 0;
                while (i2 < d2) {
                    int d4 = c0Var.mo6184d(m7344a(d2 - i2));
                    for (int i3 = 0; i3 < d4 && i2 < d2; i3++) {
                        jArr[i2] = (long) d3;
                        i2++;
                    }
                    d3++;
                }
            }
            int d5 = c0Var.mo6184d(4);
            if (d5 <= 2) {
                if (d5 == 1 || d5 == 2) {
                    c0Var.mo6185e(32);
                    c0Var.mo6185e(32);
                    int d6 = c0Var.mo6184d(4) + 1;
                    c0Var.mo6185e(1);
                    if (d5 != 1) {
                        j = ((long) d2) * ((long) d);
                    } else if (d != 0) {
                        j = m7345b((long) d2, (long) d);
                    }
                    c0Var.mo6185e((int) (j * ((long) d6)));
                }
                C0919a aVar = new C0919a(d, d2, jArr, d5, c);
                return aVar;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("lookup type greater than 2 not decodable: ");
            sb.append(d5);
            throw new ParserException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("expected code book to start with [0x56, 0x43, 0x42] at ");
        sb2.append(c0Var.mo6182b());
        throw new ParserException(sb2.toString());
    }

    /* renamed from: d */
    private static void m7347d(VorbisBitArray c0Var) throws ParserException {
        int d = c0Var.mo6184d(6) + 1;
        for (int i = 0; i < d; i++) {
            int d2 = c0Var.mo6184d(16);
            if (d2 == 0) {
                c0Var.mo6185e(8);
                c0Var.mo6185e(16);
                c0Var.mo6185e(16);
                c0Var.mo6185e(6);
                c0Var.mo6185e(8);
                int d3 = c0Var.mo6184d(4) + 1;
                for (int i2 = 0; i2 < d3; i2++) {
                    c0Var.mo6185e(8);
                }
            } else if (d2 == 1) {
                int d4 = c0Var.mo6184d(5);
                int i3 = -1;
                int[] iArr = new int[d4];
                for (int i4 = 0; i4 < d4; i4++) {
                    iArr[i4] = c0Var.mo6184d(4);
                    if (iArr[i4] > i3) {
                        i3 = iArr[i4];
                    }
                }
                int i5 = i3 + 1;
                int[] iArr2 = new int[i5];
                for (int i6 = 0; i6 < i5; i6++) {
                    iArr2[i6] = c0Var.mo6184d(3) + 1;
                    int d5 = c0Var.mo6184d(2);
                    if (d5 > 0) {
                        c0Var.mo6185e(8);
                    }
                    for (int i7 = 0; i7 < (1 << d5); i7++) {
                        c0Var.mo6185e(8);
                    }
                }
                c0Var.mo6185e(2);
                int d6 = c0Var.mo6184d(4);
                int i8 = 0;
                int i9 = 0;
                for (int i10 = 0; i10 < d4; i10++) {
                    i8 += iArr2[iArr[i10]];
                    while (i9 < i8) {
                        c0Var.mo6185e(d6);
                        i9++;
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("floor type greater than 1 not decodable: ");
                sb.append(d2);
                throw new ParserException(sb.toString());
            }
        }
    }

    /* renamed from: e */
    private static void m7348e(int i, VorbisBitArray c0Var) throws ParserException {
        int d = c0Var.mo6184d(6) + 1;
        for (int i2 = 0; i2 < d; i2++) {
            int d2 = c0Var.mo6184d(16);
            if (d2 != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("mapping type other than 0 not supported: ");
                sb.append(d2);
                Log.m10381c("VorbisUtil", sb.toString());
            } else {
                int d3 = c0Var.mo6183c() ? c0Var.mo6184d(4) + 1 : 1;
                if (c0Var.mo6183c()) {
                    int d4 = c0Var.mo6184d(8) + 1;
                    for (int i3 = 0; i3 < d4; i3++) {
                        int i4 = i - 1;
                        c0Var.mo6185e(m7344a(i4));
                        c0Var.mo6185e(m7344a(i4));
                    }
                }
                if (c0Var.mo6184d(2) == 0) {
                    if (d3 > 1) {
                        for (int i5 = 0; i5 < i; i5++) {
                            c0Var.mo6185e(4);
                        }
                    }
                    for (int i6 = 0; i6 < d3; i6++) {
                        c0Var.mo6185e(8);
                        c0Var.mo6185e(8);
                        c0Var.mo6185e(8);
                    }
                } else {
                    throw new ParserException("to reserved bits must be zero after mapping coupling steps");
                }
            }
        }
    }

    /* renamed from: f */
    private static C0921c[] m7349f(VorbisBitArray c0Var) {
        int d = c0Var.mo6184d(6) + 1;
        C0921c[] cVarArr = new C0921c[d];
        for (int i = 0; i < d; i++) {
            cVarArr[i] = new C0921c(c0Var.mo6183c(), c0Var.mo6184d(16), c0Var.mo6184d(16), c0Var.mo6184d(8));
        }
        return cVarArr;
    }

    /* renamed from: g */
    private static void m7350g(VorbisBitArray c0Var) throws ParserException {
        int d = c0Var.mo6184d(6) + 1;
        int i = 0;
        while (i < d) {
            if (c0Var.mo6184d(16) <= 2) {
                c0Var.mo6185e(24);
                c0Var.mo6185e(24);
                c0Var.mo6185e(24);
                int d2 = c0Var.mo6184d(6) + 1;
                c0Var.mo6185e(8);
                int[] iArr = new int[d2];
                for (int i2 = 0; i2 < d2; i2++) {
                    iArr[i2] = ((c0Var.mo6183c() ? c0Var.mo6184d(5) : 0) * 8) + c0Var.mo6184d(3);
                }
                for (int i3 = 0; i3 < d2; i3++) {
                    for (int i4 = 0; i4 < 8; i4++) {
                        if ((iArr[i3] & (1 << i4)) != 0) {
                            c0Var.mo6185e(8);
                        }
                    }
                }
                i++;
            } else {
                throw new ParserException("residueType greater than 2 is not decodable");
            }
        }
    }

    /* renamed from: h */
    public static C0920b m7351h(ParsableByteArray a0Var) throws ParserException {
        return m7352i(a0Var, true, true);
    }

    /* renamed from: i */
    public static C0920b m7352i(ParsableByteArray a0Var, boolean z, boolean z2) throws ParserException {
        if (z) {
            m7355l(3, a0Var, false);
        }
        String A = a0Var.mo7359A((int) a0Var.mo7395t());
        int length = 11 + A.length();
        long t = a0Var.mo7395t();
        String[] strArr = new String[((int) t)];
        int i = length + 4;
        for (int i2 = 0; ((long) i2) < t; i2++) {
            int i3 = i + 4;
            strArr[i2] = a0Var.mo7359A((int) a0Var.mo7395t());
            i = i3 + strArr[i2].length();
        }
        if (!z2 || (a0Var.mo7362D() & 1) != 0) {
            return new C0920b(A, strArr, i + 1);
        }
        throw new ParserException("framing bit expected to be set");
    }

    /* renamed from: j */
    public static C0922d m7353j(ParsableByteArray a0Var) throws ParserException {
        boolean z = true;
        m7355l(1, a0Var, false);
        int u = a0Var.mo7396u();
        int D = a0Var.mo7362D();
        int u2 = a0Var.mo7396u();
        int q = a0Var.mo7392q();
        if (q <= 0) {
            q = -1;
        }
        int q2 = a0Var.mo7392q();
        if (q2 <= 0) {
            q2 = -1;
        }
        int q3 = a0Var.mo7392q();
        if (q3 <= 0) {
            q3 = -1;
        }
        int D2 = a0Var.mo7362D();
        int pow = (int) Math.pow(2.0d, (double) (D2 & 15));
        int pow2 = (int) Math.pow(2.0d, (double) ((D2 & 240) >> 4));
        if ((a0Var.mo7362D() & 1) <= 0) {
            z = false;
        }
        C0922d dVar = new C0922d(u, D, u2, q, q2, q3, pow, pow2, z, Arrays.copyOf(a0Var.mo7379d(), a0Var.mo7381f()));
        return dVar;
    }

    /* renamed from: k */
    public static C0921c[] m7354k(ParsableByteArray a0Var, int i) throws ParserException {
        int i2 = 0;
        m7355l(5, a0Var, false);
        int D = a0Var.mo7362D() + 1;
        VorbisBitArray c0Var = new VorbisBitArray(a0Var.mo7379d());
        c0Var.mo6185e(a0Var.mo7380e() * 8);
        for (int i3 = 0; i3 < D; i3++) {
            m7346c(c0Var);
        }
        int d = c0Var.mo6184d(6) + 1;
        while (i2 < d) {
            if (c0Var.mo6184d(16) == 0) {
                i2++;
            } else {
                throw new ParserException("placeholder of time domain transforms not zeroed out");
            }
        }
        m7347d(c0Var);
        m7350g(c0Var);
        m7348e(i, c0Var);
        C0921c[] f = m7349f(c0Var);
        if (c0Var.mo6183c()) {
            return f;
        }
        throw new ParserException("framing bit after modes not set as expected");
    }

    /* renamed from: l */
    public static boolean m7355l(int i, ParsableByteArray a0Var, boolean z) throws ParserException {
        if (a0Var.mo7376a() < 7) {
            if (z) {
                return false;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("too short header: ");
            sb.append(a0Var.mo7376a());
            throw new ParserException(sb.toString());
        } else if (a0Var.mo7362D() != i) {
            if (z) {
                return false;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("expected header type ");
            sb2.append(Integer.toHexString(i));
            throw new ParserException(sb2.toString());
        } else if (a0Var.mo7362D() == 118 && a0Var.mo7362D() == 111 && a0Var.mo7362D() == 114 && a0Var.mo7362D() == 98 && a0Var.mo7362D() == 105 && a0Var.mo7362D() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw new ParserException("expected characters 'vorbis'");
        }
    }
}
