package p067c.p068a.p069a.p070a.p076f2;

import java.io.EOFException;
import java.io.IOException;
import p067c.p068a.p069a.p070a.p088h2.Metadata;
import p067c.p068a.p069a.p070a.p088h2.p093m.Id3Decoder;
import p067c.p068a.p069a.p070a.p088h2.p093m.Id3Decoder.C1050a;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;

/* renamed from: c.a.a.a.f2.v */
public final class Id3Peeker {

    /* renamed from: a */
    private final ParsableByteArray f7010a = new ParsableByteArray(10);

    /* renamed from: a */
    public Metadata mo6392a(ExtractorInput kVar, C1050a aVar) throws IOException {
        Metadata aVar2 = null;
        int i = 0;
        while (true) {
            try {
                kVar.mo6204o(this.f7010a.mo7379d(), 0, 10);
                this.f7010a.mo7374P(0);
                if (this.f7010a.mo7365G() != 4801587) {
                    break;
                }
                this.f7010a.mo7375Q(3);
                int C = this.f7010a.mo7361C();
                int i2 = C + 10;
                if (aVar2 == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.f7010a.mo7379d(), 0, bArr, 0, 10);
                    kVar.mo6204o(bArr, 10, C);
                    aVar2 = new Id3Decoder(aVar).mo6665d(bArr, i2);
                } else {
                    kVar.mo6205p(C);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        kVar.mo6199h();
        kVar.mo6205p(i);
        return aVar2;
    }
}
