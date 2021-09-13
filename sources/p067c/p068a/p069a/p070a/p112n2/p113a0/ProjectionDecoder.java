package p067c.p068a.p069a.p070a.p112n2.p113a0;

import java.util.ArrayList;
import java.util.zip.Inflater;
import p067c.p068a.p069a.p070a.p111m2.ParsableBitArray;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.Util;
import p067c.p068a.p069a.p070a.p112n2.p113a0.Projection.C1205a;
import p067c.p068a.p069a.p070a.p112n2.p113a0.Projection.C1206b;

/* renamed from: c.a.a.a.n2.a0.e */
public final class ProjectionDecoder {
    /* renamed from: a */
    public static Projection m10493a(byte[] bArr, int i) {
        ArrayList arrayList;
        ParsableByteArray a0Var = new ParsableByteArray(bArr);
        try {
            arrayList = m10495c(a0Var) ? m10498f(a0Var) : m10497e(a0Var);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        if (size == 1) {
            return new Projection((C1205a) arrayList.get(0), i);
        }
        if (size != 2) {
            return null;
        }
        return new Projection((C1205a) arrayList.get(0), (C1205a) arrayList.get(1), i);
    }

    /* renamed from: b */
    private static int m10494b(int i) {
        return (-(i & 1)) ^ (i >> 1);
    }

    /* renamed from: c */
    private static boolean m10495c(ParsableByteArray a0Var) {
        a0Var.mo7375Q(4);
        int n = a0Var.mo7389n();
        a0Var.mo7374P(0);
        if (n == 1886547818) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static C1205a m10496d(ParsableByteArray a0Var) {
        int n = a0Var.mo7389n();
        if (n > 10000) {
            return null;
        }
        float[] fArr = new float[n];
        for (int i = 0; i < n; i++) {
            fArr[i] = a0Var.mo7388m();
        }
        int n2 = a0Var.mo7389n();
        if (n2 > 32000) {
            return null;
        }
        double d = 2.0d;
        double log = Math.log(2.0d);
        double d2 = (double) n;
        Double.isNaN(d2);
        int ceil = (int) Math.ceil(Math.log(d2 * 2.0d) / log);
        ParsableBitArray zVar = new ParsableBitArray(a0Var.mo7379d());
        int i2 = 8;
        zVar.mo7503p(a0Var.mo7380e() * 8);
        float[] fArr2 = new float[(n2 * 5)];
        int i3 = 5;
        int[] iArr = new int[5];
        int i4 = 0;
        int i5 = 0;
        while (i4 < n2) {
            int i6 = 0;
            while (i6 < i3) {
                int b = iArr[i6] + m10494b(zVar.mo7495h(ceil));
                if (b >= n || b < 0) {
                    return null;
                }
                int i7 = i5 + 1;
                fArr2[i5] = fArr[b];
                iArr[i6] = b;
                i6++;
                i5 = i7;
                i3 = 5;
            }
            i4++;
            i3 = 5;
        }
        zVar.mo7503p((zVar.mo7492e() + 7) & -8);
        int i8 = 32;
        int h = zVar.mo7495h(32);
        C1206b[] bVarArr = new C1206b[h];
        int i9 = 0;
        while (i9 < h) {
            int h2 = zVar.mo7495h(i2);
            int h3 = zVar.mo7495h(i2);
            int h4 = zVar.mo7495h(i8);
            if (h4 > 128000) {
                return null;
            }
            int i10 = h2;
            double d3 = (double) n2;
            Double.isNaN(d3);
            int ceil2 = (int) Math.ceil(Math.log(d3 * d) / log);
            float[] fArr3 = new float[(h4 * 3)];
            float[] fArr4 = new float[(h4 * 2)];
            int i11 = 0;
            for (int i12 = 0; i12 < h4; i12++) {
                i11 += m10494b(zVar.mo7495h(ceil2));
                if (i11 < 0 || i11 >= n2) {
                    return null;
                }
                int i13 = i12 * 3;
                int i14 = i11 * 5;
                fArr3[i13] = fArr2[i14];
                fArr3[i13 + 1] = fArr2[i14 + 1];
                fArr3[i13 + 2] = fArr2[i14 + 2];
                int i15 = i12 * 2;
                fArr4[i15] = fArr2[i14 + 3];
                fArr4[i15 + 1] = fArr2[i14 + 4];
            }
            bVarArr[i9] = new C1206b(i10, fArr3, fArr4, h3);
            i9++;
            i8 = 32;
            d = 2.0d;
            i2 = 8;
        }
        return new C1205a(bVarArr);
    }

    /* renamed from: e */
    private static ArrayList<C1205a> m10497e(ParsableByteArray a0Var) {
        if (a0Var.mo7362D() != 0) {
            return null;
        }
        a0Var.mo7375Q(7);
        int n = a0Var.mo7389n();
        if (n == 1684433976) {
            ParsableByteArray a0Var2 = new ParsableByteArray();
            Inflater inflater = new Inflater(true);
            try {
                if (!Util.m10292h0(a0Var, a0Var2, inflater)) {
                    return null;
                }
                inflater.end();
                a0Var = a0Var2;
            } finally {
                inflater.end();
            }
        } else if (n != 1918990112) {
            return null;
        }
        return m10499g(a0Var);
    }

    /* renamed from: f */
    private static ArrayList<C1205a> m10498f(ParsableByteArray a0Var) {
        a0Var.mo7375Q(8);
        int e = a0Var.mo7380e();
        int f = a0Var.mo7381f();
        while (e < f) {
            int n = a0Var.mo7389n() + e;
            if (n <= e || n > f) {
                break;
            }
            int n2 = a0Var.mo7389n();
            if (n2 == 2037673328 || n2 == 1836279920) {
                a0Var.mo7373O(n);
                return m10497e(a0Var);
            }
            a0Var.mo7374P(n);
            e = n;
        }
        return null;
    }

    /* renamed from: g */
    private static ArrayList<C1205a> m10499g(ParsableByteArray a0Var) {
        ArrayList<C1205a> arrayList = new ArrayList<>();
        int e = a0Var.mo7380e();
        int f = a0Var.mo7381f();
        while (e < f) {
            int n = a0Var.mo7389n() + e;
            if (n <= e || n > f) {
                return null;
            }
            if (a0Var.mo7389n() == 1835365224) {
                C1205a d = m10496d(a0Var);
                if (d == null) {
                    return null;
                }
                arrayList.add(d);
            }
            a0Var.mo7374P(n);
            e = n;
        }
        return arrayList;
    }
}
