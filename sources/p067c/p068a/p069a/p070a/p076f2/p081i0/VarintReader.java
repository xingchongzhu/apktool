package p067c.p068a.p069a.p070a.p076f2.p081i0;

import java.io.IOException;
import p067c.p068a.p069a.p070a.p076f2.ExtractorInput;

/* renamed from: c.a.a.a.f2.i0.g */
final class VarintReader {

    /* renamed from: a */
    private static final long[] f6284a = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: b */
    private final byte[] f6285b = new byte[8];

    /* renamed from: c */
    private int f6286c;

    /* renamed from: d */
    private int f6287d;

    /* renamed from: a */
    public static long m7590a(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= f6284a[i - 1] ^ -1;
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    /* renamed from: c */
    public static int m7591c(int i) {
        int i2 = 0;
        while (true) {
            long[] jArr = f6284a;
            if (i2 >= jArr.length) {
                return -1;
            }
            if ((jArr[i2] & ((long) i)) != 0) {
                return i2 + 1;
            }
            i2++;
        }
    }

    /* renamed from: b */
    public int mo6248b() {
        return this.f6287d;
    }

    /* renamed from: d */
    public long mo6249d(ExtractorInput kVar, boolean z, boolean z2, int i) throws IOException {
        if (this.f6286c == 0) {
            if (!kVar.mo6197d(this.f6285b, 0, 1, z)) {
                return -1;
            }
            int c = m7591c(this.f6285b[0] & 255);
            this.f6287d = c;
            if (c != -1) {
                this.f6286c = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.f6287d;
        if (i2 > i) {
            this.f6286c = 0;
            return -2;
        }
        if (i2 != 1) {
            kVar.readFully(this.f6285b, 1, i2 - 1);
        }
        this.f6286c = 0;
        return m7590a(this.f6285b, this.f6287d, z2);
    }

    /* renamed from: e */
    public void mo6250e() {
        this.f6286c = 0;
        this.f6287d = 0;
    }
}
