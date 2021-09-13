package p067c.p068a.p069a.p070a.p076f2;

import java.io.IOException;

/* renamed from: c.a.a.a.f2.t */
public class ForwardingExtractorInput implements ExtractorInput {

    /* renamed from: b */
    private final ExtractorInput f7006b;

    public ForwardingExtractorInput(ExtractorInput kVar) {
        this.f7006b = kVar;
    }

    /* renamed from: a */
    public long mo6194a() {
        return this.f7006b.mo6194a();
    }

    /* renamed from: b */
    public int mo6195b(byte[] bArr, int i, int i2) throws IOException {
        return this.f7006b.mo6195b(bArr, i, i2);
    }

    /* renamed from: c */
    public int mo6196c(int i) throws IOException {
        return this.f7006b.mo6196c(i);
    }

    /* renamed from: d */
    public boolean mo6197d(byte[] bArr, int i, int i2, boolean z) throws IOException {
        return this.f7006b.mo6197d(bArr, i, i2, z);
    }

    /* renamed from: f */
    public int mo6198f(byte[] bArr, int i, int i2) throws IOException {
        return this.f7006b.mo6198f(bArr, i, i2);
    }

    /* renamed from: h */
    public void mo6199h() {
        this.f7006b.mo6199h();
    }

    /* renamed from: i */
    public void mo6200i(int i) throws IOException {
        this.f7006b.mo6200i(i);
    }

    /* renamed from: j */
    public boolean mo6201j(int i, boolean z) throws IOException {
        return this.f7006b.mo6201j(i, z);
    }

    /* renamed from: m */
    public boolean mo6202m(byte[] bArr, int i, int i2, boolean z) throws IOException {
        return this.f7006b.mo6202m(bArr, i, i2, z);
    }

    /* renamed from: n */
    public long mo6203n() {
        return this.f7006b.mo6203n();
    }

    /* renamed from: o */
    public void mo6204o(byte[] bArr, int i, int i2) throws IOException {
        this.f7006b.mo6204o(bArr, i, i2);
    }

    /* renamed from: p */
    public void mo6205p(int i) throws IOException {
        this.f7006b.mo6205p(i);
    }

    /* renamed from: q */
    public long mo6206q() {
        return this.f7006b.mo6206q();
    }

    public void readFully(byte[] bArr, int i, int i2) throws IOException {
        this.f7006b.readFully(bArr, i, i2);
    }
}
