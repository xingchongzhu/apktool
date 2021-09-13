package p067c.p068a.p069a.p070a.p076f2.p085m0;

import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;

/* renamed from: c.a.a.a.f2.m0.j0 */
public final class TsUtil {
    /* renamed from: a */
    public static int m8071a(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    /* renamed from: b */
    public static long m8072b(ParsableByteArray a0Var, int i, int i2) {
        a0Var.mo7374P(i);
        if (a0Var.mo7376a() < 5) {
            return -9223372036854775807L;
        }
        int n = a0Var.mo7389n();
        if ((8388608 & n) != 0 || ((2096896 & n) >> 8) != i2) {
            return -9223372036854775807L;
        }
        boolean z = true;
        if (((n & 32) != 0) && a0Var.mo7362D() >= 7 && a0Var.mo7376a() >= 7) {
            if ((a0Var.mo7362D() & 16) != 16) {
                z = false;
            }
            if (z) {
                byte[] bArr = new byte[6];
                a0Var.mo7385j(bArr, 0, 6);
                return m8073c(bArr);
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: c */
    private static long m8073c(byte[] bArr) {
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }
}
