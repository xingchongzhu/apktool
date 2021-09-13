package p067c.p068a.p069a.p070a.p076f2.p084l0;

import java.io.EOFException;
import java.io.IOException;
import p067c.p068a.p069a.p070a.ParserException;
import p067c.p068a.p069a.p070a.p076f2.ExtractorInput;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;

/* renamed from: c.a.a.a.f2.l0.f */
final class OggPageHeader {

    /* renamed from: a */
    public int f6539a;

    /* renamed from: b */
    public int f6540b;

    /* renamed from: c */
    public long f6541c;

    /* renamed from: d */
    public long f6542d;

    /* renamed from: e */
    public long f6543e;

    /* renamed from: f */
    public long f6544f;

    /* renamed from: g */
    public int f6545g;

    /* renamed from: h */
    public int f6546h;

    /* renamed from: i */
    public int f6547i;

    /* renamed from: j */
    public final int[] f6548j = new int[255];

    /* renamed from: k */
    private final ParsableByteArray f6549k = new ParsableByteArray(255);

    OggPageHeader() {
    }

    /* renamed from: a */
    private static boolean m7900a(ExtractorInput kVar, byte[] bArr, int i, int i2, boolean z) throws IOException {
        try {
            return kVar.mo6202m(bArr, i, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    /* renamed from: b */
    public boolean mo6307b(ExtractorInput kVar, boolean z) throws IOException {
        mo6308c();
        this.f6549k.mo7370L(27);
        if (!m7900a(kVar, this.f6549k.mo7379d(), 0, 27, z) || this.f6549k.mo7364F() != 1332176723) {
            return false;
        }
        int D = this.f6549k.mo7362D();
        this.f6539a = D;
        if (D == 0) {
            this.f6540b = this.f6549k.mo7362D();
            this.f6541c = this.f6549k.mo7393r();
            this.f6542d = this.f6549k.mo7395t();
            this.f6543e = this.f6549k.mo7395t();
            this.f6544f = this.f6549k.mo7395t();
            int D2 = this.f6549k.mo7362D();
            this.f6545g = D2;
            this.f6546h = D2 + 27;
            this.f6549k.mo7370L(D2);
            kVar.mo6204o(this.f6549k.mo7379d(), 0, this.f6545g);
            for (int i = 0; i < this.f6545g; i++) {
                this.f6548j[i] = this.f6549k.mo7362D();
                this.f6547i += this.f6548j[i];
            }
            return true;
        } else if (z) {
            return false;
        } else {
            throw new ParserException("unsupported bit stream revision");
        }
    }

    /* renamed from: c */
    public void mo6308c() {
        this.f6539a = 0;
        this.f6540b = 0;
        this.f6541c = 0;
        this.f6542d = 0;
        this.f6543e = 0;
        this.f6544f = 0;
        this.f6545g = 0;
        this.f6546h = 0;
        this.f6547i = 0;
    }

    /* renamed from: d */
    public boolean mo6309d(ExtractorInput kVar) throws IOException {
        return mo6310e(kVar, -1);
    }

    /* renamed from: e */
    public boolean mo6310e(ExtractorInput kVar, long j) throws IOException {
        Assertions.m10149a(kVar.mo6206q() == kVar.mo6203n());
        this.f6549k.mo7370L(4);
        while (true) {
            if ((j == -1 || kVar.mo6206q() + 4 < j) && m7900a(kVar, this.f6549k.mo7379d(), 0, 4, true)) {
                this.f6549k.mo7374P(0);
                if (this.f6549k.mo7364F() == 1332176723) {
                    kVar.mo6199h();
                    return true;
                }
                kVar.mo6200i(1);
            }
        }
        do {
            if (j != -1 && kVar.mo6206q() >= j) {
                break;
            }
        } while (kVar.mo6196c(1) != -1);
        return false;
    }
}
