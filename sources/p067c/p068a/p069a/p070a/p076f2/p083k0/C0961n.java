package p067c.p068a.p069a.p070a.p076f2.p083k0;

import java.io.IOException;
import p067c.p068a.p069a.p070a.p076f2.ExtractorInput;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;

/* renamed from: c.a.a.a.f2.k0.n */
/* compiled from: Sniffer */
final class C0961n {

    /* renamed from: a */
    private static final int[] f6465a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* renamed from: a */
    private static boolean m7839a(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 : f6465a) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m7840b(ExtractorInput kVar) throws IOException {
        return m7841c(kVar, true, false);
    }

    /* renamed from: c */
    private static boolean m7841c(ExtractorInput kVar, boolean z, boolean z2) throws IOException {
        boolean z3;
        ExtractorInput kVar2 = kVar;
        long a = kVar.mo6194a();
        long j = 4096;
        long j2 = -1;
        if (a != -1 && a <= 4096) {
            j = a;
        }
        int i = (int) j;
        ParsableByteArray a0Var = new ParsableByteArray(64);
        boolean z4 = false;
        int i2 = 0;
        boolean z5 = false;
        while (true) {
            if (i2 >= i) {
                break;
            }
            a0Var.mo7370L(8);
            if (!kVar2.mo6202m(a0Var.mo7379d(), z4 ? 1 : 0, 8, true)) {
                break;
            }
            long F = a0Var.mo7364F();
            int n = a0Var.mo7389n();
            int i3 = 16;
            if (F == 1) {
                kVar2.mo6204o(a0Var.mo7379d(), 8, 8);
                a0Var.mo7373O(16);
                F = a0Var.mo7398w();
            } else {
                if (F == 0) {
                    long a2 = kVar.mo6194a();
                    if (a2 != j2) {
                        F = ((long) 8) + (a2 - kVar.mo6203n());
                    }
                }
                i3 = 8;
            }
            long j3 = (long) i3;
            if (F < j3) {
                return z4;
            }
            i2 += i3;
            if (n == 1836019574) {
                i += (int) F;
                if (a != -1 && ((long) i) > a) {
                    i = (int) a;
                }
                j2 = -1;
            } else if (n == 1836019558 || n == 1836475768) {
                z3 = true;
            } else {
                long j4 = a;
                int i4 = i2;
                if ((((long) i2) + F) - j3 >= ((long) i)) {
                    break;
                }
                int i5 = (int) (F - j3);
                i2 = i4 + i5;
                if (n != 1718909296) {
                    boolean z6 = z2;
                    if (i5 != 0) {
                        kVar2.mo6205p(i5);
                    }
                } else if (i5 < 8) {
                    return false;
                } else {
                    a0Var.mo7370L(i5);
                    kVar2.mo6204o(a0Var.mo7379d(), 0, i5);
                    int i6 = i5 / 4;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= i6) {
                            boolean z7 = z2;
                            break;
                        }
                        if (i7 == 1) {
                            a0Var.mo7375Q(4);
                            boolean z8 = z2;
                        } else if (m7839a(a0Var.mo7389n(), z2)) {
                            z5 = true;
                            break;
                        }
                        i7++;
                    }
                    if (!z5) {
                        return false;
                    }
                }
                j2 = -1;
                a = j4;
                z4 = false;
            }
        }
        z3 = false;
        return z5 && z == z3;
    }

    /* renamed from: d */
    public static boolean m7842d(ExtractorInput kVar, boolean z) throws IOException {
        return m7841c(kVar, false, z);
    }
}
