package p067c.p068a.p069a.p070a.p072b2;

import com.umeng.analytics.pro.TType;
import java.nio.ByteBuffer;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.Format.C1245b;
import p067c.p068a.p069a.p070a.p075e2.DrmInitData;
import p067c.p068a.p069a.p070a.p111m2.ParsableBitArray;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;

/* renamed from: c.a.a.a.b2.m */
public final class Ac4Util {

    /* renamed from: a */
    private static final int[] f5536a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: c.a.a.a.b2.m$b */
    /* compiled from: Ac4Util */
    public static final class C0828b {

        /* renamed from: a */
        public final int f5537a;

        /* renamed from: b */
        public final int f5538b;

        /* renamed from: c */
        public final int f5539c;

        /* renamed from: d */
        public final int f5540d;

        /* renamed from: e */
        public final int f5541e;

        private C0828b(int i, int i2, int i3, int i4, int i5) {
            this.f5537a = i;
            this.f5539c = i2;
            this.f5538b = i3;
            this.f5540d = i4;
            this.f5541e = i5;
        }
    }

    /* renamed from: a */
    public static void m6634a(int i, ParsableByteArray a0Var) {
        a0Var.mo7370L(7);
        byte[] d = a0Var.mo7379d();
        d[0] = -84;
        d[1] = 64;
        d[2] = -1;
        d[3] = -1;
        d[4] = (byte) ((i >> 16) & 255);
        d[5] = (byte) ((i >> 8) & 255);
        d[6] = (byte) (i & 255);
    }

    /* renamed from: b */
    public static Format m6635b(ParsableByteArray a0Var, String str, String str2, DrmInitData tVar) {
        a0Var.mo7375Q(1);
        return new C1245b().mo7693S(str).mo7705e0("audio/ac4").mo7682H(2).mo7706f0(((a0Var.mo7362D() & 32) >> 5) == 1 ? 48000 : 44100).mo7686L(tVar).mo7696V(str2).mo7679E();
    }

    /* renamed from: c */
    public static int m6636c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int position = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return m6637d(new ParsableBitArray(bArr)).f5541e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0086, code lost:
        if (r10 != 11) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008b, code lost:
        if (r10 != 11) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0090, code lost:
        if (r10 != 8) goto L_0x0093;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p067c.p068a.p069a.p070a.p072b2.Ac4Util.C0828b m6637d(p067c.p068a.p069a.p070a.p111m2.ParsableBitArray r10) {
        /*
            r0 = 16
            int r1 = r10.mo7495h(r0)
            int r0 = r10.mo7495h(r0)
            r2 = 4
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r3) goto L_0x0018
            r0 = 24
            int r0 = r10.mo7495h(r0)
            r3 = 7
            goto L_0x0019
        L_0x0018:
            r3 = 4
        L_0x0019:
            int r0 = r0 + r3
            r3 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r3) goto L_0x0021
            int r0 = r0 + 2
        L_0x0021:
            r7 = r0
            r0 = 2
            int r1 = r10.mo7495h(r0)
            r3 = 3
            if (r1 != r3) goto L_0x002f
            int r4 = m6639f(r10, r0)
            int r1 = r1 + r4
        L_0x002f:
            r4 = r1
            r1 = 10
            int r1 = r10.mo7495h(r1)
            boolean r5 = r10.mo7494g()
            if (r5 == 0) goto L_0x0045
            int r5 = r10.mo7495h(r3)
            if (r5 <= 0) goto L_0x0045
            r10.mo7505r(r0)
        L_0x0045:
            boolean r5 = r10.mo7494g()
            r6 = 48000(0xbb80, float:6.7262E-41)
            r8 = 44100(0xac44, float:6.1797E-41)
            if (r5 == 0) goto L_0x0055
            r9 = 48000(0xbb80, float:6.7262E-41)
            goto L_0x0058
        L_0x0055:
            r9 = 44100(0xac44, float:6.1797E-41)
        L_0x0058:
            int r10 = r10.mo7495h(r2)
            r5 = 0
            if (r9 != r8) goto L_0x0069
            r8 = 13
            if (r10 != r8) goto L_0x0069
            int[] r0 = f5536a
            r10 = r0[r10]
            r8 = r10
            goto L_0x0099
        L_0x0069:
            if (r9 != r6) goto L_0x0098
            int[] r6 = f5536a
            int r8 = r6.length
            if (r10 >= r8) goto L_0x0098
            r5 = r6[r10]
            int r1 = r1 % 5
            r6 = 8
            r8 = 1
            if (r1 == r8) goto L_0x008e
            r8 = 11
            if (r1 == r0) goto L_0x0089
            if (r1 == r3) goto L_0x008e
            if (r1 == r2) goto L_0x0082
            goto L_0x0093
        L_0x0082:
            if (r10 == r3) goto L_0x0095
            if (r10 == r6) goto L_0x0095
            if (r10 != r8) goto L_0x0093
            goto L_0x0095
        L_0x0089:
            if (r10 == r6) goto L_0x0095
            if (r10 != r8) goto L_0x0093
            goto L_0x0095
        L_0x008e:
            if (r10 == r3) goto L_0x0095
            if (r10 != r6) goto L_0x0093
            goto L_0x0095
        L_0x0093:
            r8 = r5
            goto L_0x0099
        L_0x0095:
            int r5 = r5 + 1
            goto L_0x0093
        L_0x0098:
            r8 = 0
        L_0x0099:
            c.a.a.a.b2.m$b r10 = new c.a.a.a.b2.m$b
            r5 = 2
            r0 = 0
            r3 = r10
            r6 = r9
            r9 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p072b2.Ac4Util.m6637d(c.a.a.a.m2.z):c.a.a.a.b2.m$b");
    }

    /* renamed from: e */
    public static int m6638e(byte[] bArr, int i) {
        int i2 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        byte b = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (b == 65535) {
            b = ((bArr[4] & 255) << TType.f16865n) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i2 = 4;
        }
        if (i == 44097) {
            i2 += 2;
        }
        return b + i2;
    }

    /* renamed from: f */
    private static int m6639f(ParsableBitArray zVar, int i) {
        int i2 = 0;
        while (true) {
            int h = i2 + zVar.mo7495h(i);
            if (!zVar.mo7494g()) {
                return h;
            }
            i2 = (h + 1) << i;
        }
    }
}
