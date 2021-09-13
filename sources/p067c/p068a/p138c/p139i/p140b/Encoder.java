package p067c.p068a.p138c.p139i.p140b;

import p067c.p068a.p138c.p141j.BitArray;
import p067c.p068a.p138c.p141j.BitMatrix;
import p067c.p068a.p138c.p141j.p142d.GenericGF;
import p067c.p068a.p138c.p141j.p142d.ReedSolomonEncoder;

/* renamed from: c.a.c.i.b.c */
public final class Encoder {

    /* renamed from: a */
    private static final int[] f9966a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    /* renamed from: a */
    private static int[] m12064a(BitArray aVar, int i, int i2) {
        int[] iArr = new int[i2];
        int g = aVar.mo8560g() / i;
        for (int i3 = 0; i3 < g; i3++) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i4 |= aVar.mo8559f((i3 * i) + i5) ? 1 << ((i - i5) - 1) : 0;
            }
            iArr[i3] = i4;
        }
        return iArr;
    }

    /* renamed from: b */
    private static void m12065b(BitMatrix bVar, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 > i6) {
                    break;
                }
                bVar.mo8573g(i5, i4);
                bVar.mo8573g(i5, i6);
                bVar.mo8573g(i4, i5);
                bVar.mo8573g(i6, i5);
                i5++;
            }
        }
        int i7 = i - i2;
        bVar.mo8573g(i7, i7);
        int i8 = i7 + 1;
        bVar.mo8573g(i8, i7);
        bVar.mo8573g(i7, i8);
        int i9 = i + i2;
        bVar.mo8573g(i9, i7);
        bVar.mo8573g(i9, i8);
        bVar.mo8573g(i9, i9 - 1);
    }

    /* renamed from: c */
    private static void m12066c(BitMatrix bVar, boolean z, int i, BitArray aVar) {
        int i2 = i / 2;
        int i3 = 0;
        if (z) {
            while (i3 < 7) {
                int i4 = (i2 - 3) + i3;
                if (aVar.mo8559f(i3)) {
                    bVar.mo8573g(i4, i2 - 5);
                }
                if (aVar.mo8559f(i3 + 7)) {
                    bVar.mo8573g(i2 + 5, i4);
                }
                if (aVar.mo8559f(20 - i3)) {
                    bVar.mo8573g(i4, i2 + 5);
                }
                if (aVar.mo8559f(27 - i3)) {
                    bVar.mo8573g(i2 - 5, i4);
                }
                i3++;
            }
            return;
        }
        while (i3 < 10) {
            int i5 = (i2 - 5) + i3 + (i3 / 5);
            if (aVar.mo8559f(i3)) {
                bVar.mo8573g(i5, i2 - 7);
            }
            if (aVar.mo8559f(i3 + 10)) {
                bVar.mo8573g(i2 + 7, i5);
            }
            if (aVar.mo8559f(29 - i3)) {
                bVar.mo8573g(i5, i2 + 7);
            }
            if (aVar.mo8559f(39 - i3)) {
                bVar.mo8573g(i2 - 7, i5);
            }
            i3++;
        }
    }

    /* renamed from: d */
    public static AztecCode m12067d(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        BitArray aVar;
        int i6;
        BitArray a = new HighLevelEncoder(bArr).mo8536a();
        int i7 = 11;
        int g = ((a.mo8560g() * i) / 100) + 11;
        int g2 = a.mo8560g() + g;
        int i8 = 32;
        int i9 = 0;
        int i10 = 1;
        if (i2 != 0) {
            z = i2 < 0;
            i4 = Math.abs(i2);
            if (z) {
                i8 = 4;
            }
            if (i4 <= i8) {
                i5 = m12072i(i4, z);
                i3 = f9966a[i4];
                int i11 = i5 - (i5 % i3);
                aVar = m12071h(a, i3);
                int g3 = aVar.mo8560g() + g;
                String str = "Data to large for user specified layer";
                if (g3 > i11) {
                    throw new IllegalArgumentException(str);
                } else if (z && aVar.mo8560g() > (i3 << 6)) {
                    throw new IllegalArgumentException(str);
                }
            } else {
                throw new IllegalArgumentException(String.format("Illegal value %s for layers", new Object[]{Integer.valueOf(i2)}));
            }
        } else {
            BitArray aVar2 = null;
            int i12 = 0;
            int i13 = 0;
            while (i12 <= 32) {
                boolean z2 = i12 <= 3;
                int i14 = z2 ? i12 + 1 : i12;
                int i15 = m12072i(i14, z2);
                if (g2 <= i15) {
                    if (aVar2 == null || i13 != f9966a[i14]) {
                        int i16 = f9966a[i14];
                        i13 = i16;
                        aVar2 = m12071h(a, i16);
                    }
                    int i17 = i15 - (i15 % i13);
                    if ((!z2 || aVar2.mo8560g() <= (i13 << 6)) && aVar2.mo8560g() + g <= i17) {
                        aVar = aVar2;
                        i3 = i13;
                        z = z2;
                        i4 = i14;
                        i5 = i15;
                    }
                }
                i12++;
                i9 = 0;
                i10 = 1;
            }
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        BitArray e = m12068e(aVar, i5, i3);
        int g4 = aVar.mo8560g() / i3;
        BitArray f = m12069f(z, i4, g4);
        if (!z) {
            i7 = 14;
        }
        int i18 = i7 + (i4 << 2);
        int[] iArr = new int[i18];
        int i19 = 2;
        if (z) {
            for (int i20 = 0; i20 < i18; i20++) {
                iArr[i20] = i20;
            }
            i6 = i18;
        } else {
            int i21 = i18 / 2;
            i6 = i18 + 1 + (((i21 - 1) / 15) * 2);
            int i22 = i6 / 2;
            for (int i23 = 0; i23 < i21; i23++) {
                int i24 = (i23 / 15) + i23;
                iArr[(i21 - i23) - i10] = (i22 - i24) - 1;
                iArr[i21 + i23] = i24 + i22 + i10;
            }
        }
        BitMatrix bVar = new BitMatrix(i6);
        int i25 = 0;
        int i26 = 0;
        while (i25 < i4) {
            int i27 = ((i4 - i25) << i19) + (z ? 9 : 12);
            int i28 = 0;
            while (i28 < i27) {
                int i29 = i28 << 1;
                while (i9 < i19) {
                    if (e.mo8559f(i26 + i29 + i9)) {
                        int i30 = i25 << 1;
                        bVar.mo8573g(iArr[i30 + i9], iArr[i30 + i28]);
                    }
                    if (e.mo8559f((i27 << 1) + i26 + i29 + i9)) {
                        int i31 = i25 << 1;
                        bVar.mo8573g(iArr[i31 + i28], iArr[((i18 - 1) - i31) - i9]);
                    }
                    if (e.mo8559f((i27 << 2) + i26 + i29 + i9)) {
                        int i32 = (i18 - 1) - (i25 << 1);
                        bVar.mo8573g(iArr[i32 - i9], iArr[i32 - i28]);
                    }
                    if (e.mo8559f((i27 * 6) + i26 + i29 + i9)) {
                        int i33 = i25 << 1;
                        bVar.mo8573g(iArr[((i18 - 1) - i33) - i28], iArr[i33 + i9]);
                    }
                    i9++;
                    i19 = 2;
                }
                i28++;
                i9 = 0;
                i19 = 2;
            }
            i26 += i27 << 3;
            i25++;
            i9 = 0;
            i19 = 2;
        }
        m12066c(bVar, z, i6, f);
        if (z) {
            m12065b(bVar, i6 / 2, 5);
        } else {
            int i34 = i6 / 2;
            m12065b(bVar, i34, 7);
            int i35 = 0;
            int i36 = 0;
            while (i36 < (i18 / 2) - 1) {
                for (int i37 = i34 & 1; i37 < i6; i37 += 2) {
                    int i38 = i34 - i35;
                    bVar.mo8573g(i38, i37);
                    int i39 = i34 + i35;
                    bVar.mo8573g(i39, i37);
                    bVar.mo8573g(i37, i38);
                    bVar.mo8573g(i37, i39);
                }
                i36 += 15;
                i35 += 16;
            }
        }
        AztecCode aVar3 = new AztecCode();
        aVar3.mo8530c(z);
        aVar3.mo8533f(i6);
        aVar3.mo8531d(i4);
        aVar3.mo8529b(g4);
        aVar3.mo8532e(bVar);
        return aVar3;
    }

    /* renamed from: e */
    private static BitArray m12068e(BitArray aVar, int i, int i2) {
        int g = aVar.mo8560g() / i2;
        ReedSolomonEncoder cVar = new ReedSolomonEncoder(m12070g(i2));
        int i3 = i / i2;
        int[] a = m12064a(aVar, i2, i3);
        cVar.mo8596b(a, i3 - g);
        int i4 = i % i2;
        BitArray aVar2 = new BitArray();
        aVar2.mo8555c(0, i4);
        for (int c : a) {
            aVar2.mo8555c(c, i2);
        }
        return aVar2;
    }

    /* renamed from: f */
    static BitArray m12069f(boolean z, int i, int i2) {
        BitArray aVar = new BitArray();
        if (z) {
            aVar.mo8555c(i - 1, 2);
            aVar.mo8555c(i2 - 1, 6);
            return m12068e(aVar, 28, 4);
        }
        aVar.mo8555c(i - 1, 5);
        aVar.mo8555c(i2 - 1, 11);
        return m12068e(aVar, 40, 4);
    }

    /* renamed from: g */
    private static GenericGF m12070g(int i) {
        if (i == 4) {
            return GenericGF.f10023d;
        }
        if (i == 6) {
            return GenericGF.f10022c;
        }
        if (i == 8) {
            return GenericGF.f10026g;
        }
        if (i == 10) {
            return GenericGF.f10021b;
        }
        if (i == 12) {
            return GenericGF.f10020a;
        }
        throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i)));
    }

    /* renamed from: h */
    static BitArray m12071h(BitArray aVar, int i) {
        BitArray aVar2 = new BitArray();
        int g = aVar.mo8560g();
        int i2 = (1 << i) - 2;
        int i3 = 0;
        while (i3 < g) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = i3 + i5;
                if (i6 >= g || aVar.mo8559f(i6)) {
                    i4 |= 1 << ((i - 1) - i5);
                }
            }
            int i7 = i4 & i2;
            if (i7 == i2) {
                aVar2.mo8555c(i7, i);
            } else if (i7 == 0) {
                aVar2.mo8555c(i4 | 1, i);
            } else {
                aVar2.mo8555c(i4, i);
                i3 += i;
            }
            i3--;
            i3 += i;
        }
        return aVar2;
    }

    /* renamed from: i */
    private static int m12072i(int i, boolean z) {
        return ((z ? 88 : 112) + (i << 4)) * i;
    }
}
