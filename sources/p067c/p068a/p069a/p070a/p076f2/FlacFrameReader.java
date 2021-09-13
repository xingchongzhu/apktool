package p067c.p068a.p069a.p070a.p076f2;

import com.p259uc.crashsdk.export.LogType;
import java.io.IOException;
import p067c.p068a.p069a.p070a.ParserException;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.f2.p */
public final class FlacFrameReader {

    /* renamed from: c.a.a.a.f2.p$a */
    /* compiled from: FlacFrameReader */
    public static final class C0999a {

        /* renamed from: a */
        public long f6988a;
    }

    /* renamed from: a */
    private static boolean m8270a(ParsableByteArray a0Var, FlacStreamMetadata sVar, int i) {
        int j = m8279j(a0Var, i);
        return j != -1 && j <= sVar.f6993b;
    }

    /* renamed from: b */
    private static boolean m8271b(ParsableByteArray a0Var, int i) {
        return a0Var.mo7362D() == Util.m10315t(a0Var.mo7379d(), i, a0Var.mo7380e() - 1, 0);
    }

    /* renamed from: c */
    private static boolean m8272c(ParsableByteArray a0Var, FlacStreamMetadata sVar, boolean z, C0999a aVar) {
        try {
            long K = a0Var.mo7369K();
            if (!z) {
                K *= (long) sVar.f6993b;
            }
            aVar.f6988a = K;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m8273d(ParsableByteArray a0Var, FlacStreamMetadata sVar, int i, C0999a aVar) {
        ParsableByteArray a0Var2 = a0Var;
        FlacStreamMetadata sVar2 = sVar;
        int e = a0Var.mo7380e();
        long F = a0Var.mo7364F();
        long j = F >>> 16;
        boolean z = false;
        if (j != ((long) i)) {
            return false;
        }
        boolean z2 = (j & 1) == 1;
        int i2 = (int) ((F >> 12) & 15);
        int i3 = (int) ((F >> 8) & 15);
        int i4 = (int) (15 & (F >> 4));
        int i5 = (int) ((F >> 1) & 7);
        boolean z3 = (F & 1) == 1;
        if (m8276g(i4, sVar2) && m8275f(i5, sVar2) && !z3 && m8272c(a0Var2, sVar2, z2, aVar) && m8270a(a0Var2, sVar2, i2) && m8274e(a0Var2, sVar2, i3) && m8271b(a0Var2, e)) {
            z = true;
        }
        return z;
    }

    /* renamed from: e */
    private static boolean m8274e(ParsableByteArray a0Var, FlacStreamMetadata sVar, int i) {
        int i2 = sVar.f6996e;
        boolean z = true;
        if (i == 0) {
            return true;
        }
        if (i <= 11) {
            if (i != sVar.f6997f) {
                z = false;
            }
            return z;
        } else if (i == 12) {
            if (a0Var.mo7362D() * 1000 != i2) {
                z = false;
            }
            return z;
        } else if (i > 14) {
            return false;
        } else {
            int J = a0Var.mo7368J();
            if (i == 14) {
                J *= 10;
            }
            if (J != i2) {
                z = false;
            }
            return z;
        }
    }

    /* renamed from: f */
    private static boolean m8275f(int i, FlacStreamMetadata sVar) {
        boolean z = true;
        if (i == 0) {
            return true;
        }
        if (i != sVar.f7000i) {
            z = false;
        }
        return z;
    }

    /* renamed from: g */
    private static boolean m8276g(int i, FlacStreamMetadata sVar) {
        boolean z = false;
        if (i <= 7) {
            if (i == sVar.f6998g - 1) {
                z = true;
            }
            return z;
        }
        if (i <= 10 && sVar.f6998g == 2) {
            z = true;
        }
        return z;
    }

    /* renamed from: h */
    public static boolean m8277h(ExtractorInput kVar, FlacStreamMetadata sVar, int i, C0999a aVar) throws IOException {
        long n = kVar.mo6203n();
        byte[] bArr = new byte[2];
        kVar.mo6204o(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
            kVar.mo6199h();
            kVar.mo6205p((int) (n - kVar.mo6206q()));
            return false;
        }
        ParsableByteArray a0Var = new ParsableByteArray(16);
        System.arraycopy(bArr, 0, a0Var.mo7379d(), 0, 2);
        a0Var.mo7373O(ExtractorUtil.m7938a(kVar, a0Var.mo7379d(), 2, 14));
        kVar.mo6199h();
        kVar.mo6205p((int) (n - kVar.mo6206q()));
        return m8273d(a0Var, sVar, i, aVar);
    }

    /* renamed from: i */
    public static long m8278i(ExtractorInput kVar, FlacStreamMetadata sVar) throws IOException {
        kVar.mo6199h();
        boolean z = true;
        kVar.mo6205p(1);
        byte[] bArr = new byte[1];
        kVar.mo6204o(bArr, 0, 1);
        if ((bArr[0] & 1) != 1) {
            z = false;
        }
        kVar.mo6205p(2);
        int i = z ? 7 : 6;
        ParsableByteArray a0Var = new ParsableByteArray(i);
        a0Var.mo7373O(ExtractorUtil.m7938a(kVar, a0Var.mo7379d(), 0, i));
        kVar.mo6199h();
        C0999a aVar = new C0999a();
        if (m8272c(a0Var, sVar, z, aVar)) {
            return aVar.f6988a;
        }
        throw new ParserException();
    }

    /* renamed from: j */
    public static int m8279j(ParsableByteArray a0Var, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return a0Var.mo7362D() + 1;
            case 7:
                return a0Var.mo7368J() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return LogType.UNEXP << (i - 8);
            default:
                return -1;
        }
    }
}
