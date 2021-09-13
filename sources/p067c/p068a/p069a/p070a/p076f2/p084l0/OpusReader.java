package p067c.p068a.p069a.p070a.p076f2.p084l0;

import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p067c.p068a.p069a.p070a.Format.C1245b;
import p067c.p068a.p069a.p070a.p072b2.OpusUtil;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;

/* renamed from: c.a.a.a.f2.l0.h */
final class OpusReader extends StreamReader {

    /* renamed from: n */
    private static final byte[] f6550n = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: o */
    private boolean f6551o;

    OpusReader() {
    }

    /* renamed from: n */
    private long m7908n(byte[] bArr) {
        byte b = bArr[0] & 255;
        byte b2 = b & 3;
        byte b3 = 2;
        if (b2 == 0) {
            b3 = 1;
        } else if (!(b2 == 1 || b2 == 2)) {
            b3 = bArr[1] & 63;
        }
        int i = b >> 3;
        int i2 = i & 3;
        int i3 = i >= 16 ? 2500 << i2 : i >= 12 ? 10000 << (i2 & 1) : i2 == 3 ? 60000 : 10000 << i2;
        return ((long) b3) * ((long) i3);
    }

    /* renamed from: o */
    public static boolean m7909o(ParsableByteArray a0Var) {
        int a = a0Var.mo7376a();
        byte[] bArr = f6550n;
        if (a < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        a0Var.mo7385j(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public long mo6298f(ParsableByteArray a0Var) {
        return mo6312c(m7908n(a0Var.mo7379d()));
    }

    /* access modifiers changed from: protected */
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: i */
    public boolean mo6299i(ParsableByteArray a0Var, long j, C0968b bVar) {
        boolean z = true;
        if (!this.f6551o) {
            byte[] copyOf = Arrays.copyOf(a0Var.mo7379d(), a0Var.mo7381f());
            int c = OpusUtil.m6553c(copyOf);
            bVar.f6565a = new C1245b().mo7705e0("audio/opus").mo7682H(c).mo7706f0(48000).mo7694T(OpusUtil.m6551a(copyOf)).mo7679E();
            this.f6551o = true;
            return true;
        }
        Assertions.m10153e(bVar.f6565a);
        if (a0Var.mo7389n() != 1332770163) {
            z = false;
        }
        a0Var.mo7374P(0);
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo6300l(boolean z) {
        super.mo6300l(z);
        if (z) {
            this.f6551o = false;
        }
    }
}
