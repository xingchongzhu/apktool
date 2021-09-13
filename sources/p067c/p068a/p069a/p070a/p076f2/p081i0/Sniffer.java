package p067c.p068a.p069a.p070a.p076f2.p081i0;

import java.io.IOException;
import p067c.p068a.p069a.p070a.p076f2.ExtractorInput;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;

/* renamed from: c.a.a.a.f2.i0.f */
final class Sniffer {

    /* renamed from: a */
    private final ParsableByteArray f6282a = new ParsableByteArray(8);

    /* renamed from: b */
    private int f6283b;

    /* renamed from: a */
    private long m7588a(ExtractorInput kVar) throws IOException {
        int i = 0;
        kVar.mo6204o(this.f6282a.mo7379d(), 0, 1);
        byte b = this.f6282a.mo7379d()[0] & 255;
        if (b == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = 128;
        int i3 = 0;
        while ((b & i2) == 0) {
            i2 >>= 1;
            i3++;
        }
        int i4 = b & (i2 ^ -1);
        kVar.mo6204o(this.f6282a.mo7379d(), 1, i3);
        while (i < i3) {
            i++;
            i4 = (this.f6282a.mo7379d()[i] & 255) + (i4 << 8);
        }
        this.f6283b += i3 + 1;
        return (long) i4;
    }

    /* renamed from: b */
    public boolean mo6247b(ExtractorInput kVar) throws IOException {
        ExtractorInput kVar2 = kVar;
        long a = kVar.mo6194a();
        long j = 1024;
        if (a != -1 && a <= 1024) {
            j = a;
        }
        int i = (int) j;
        boolean z = false;
        kVar2.mo6204o(this.f6282a.mo7379d(), 0, 4);
        this.f6283b = 4;
        for (long F = this.f6282a.mo7364F(); F != 440786851; F = ((F << 8) & -256) | ((long) (this.f6282a.mo7379d()[0] & 255))) {
            int i2 = this.f6283b + 1;
            this.f6283b = i2;
            if (i2 == i) {
                return false;
            }
            kVar2.mo6204o(this.f6282a.mo7379d(), 0, 1);
        }
        long a2 = m7588a(kVar);
        long j2 = (long) this.f6283b;
        if (a2 != Long.MIN_VALUE && (a == -1 || j2 + a2 < a)) {
            while (true) {
                int i3 = this.f6283b;
                long j3 = j2 + a2;
                if (((long) i3) < j3) {
                    if (m7588a(kVar) == Long.MIN_VALUE) {
                        return false;
                    }
                    long a3 = m7588a(kVar);
                    if (a3 < 0 || a3 > 2147483647L) {
                        return false;
                    }
                    if (a3 != 0) {
                        int i4 = (int) a3;
                        kVar2.mo6205p(i4);
                        this.f6283b += i4;
                    }
                } else if (((long) i3) == j3) {
                    z = true;
                }
            }
        }
        return z;
    }
}
