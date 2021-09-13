package p067c.p068a.p138c.p139i.p140b;

import p067c.p068a.p138c.p141j.BitArray;

/* renamed from: c.a.c.i.b.e */
final class SimpleToken extends Token {

    /* renamed from: c */
    private final short f9973c;

    /* renamed from: d */
    private final short f9974d;

    SimpleToken(Token gVar, int i, int i2) {
        super(gVar);
        this.f9973c = (short) i;
        this.f9974d = (short) i2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo8534c(BitArray aVar, byte[] bArr) {
        aVar.mo8555c(this.f9973c, this.f9974d);
    }

    public String toString() {
        short s = this.f9973c;
        short s2 = this.f9974d;
        short s3 = (s & ((1 << s2) - 1)) | (1 << s2);
        StringBuilder sb = new StringBuilder("<");
        sb.append(Integer.toBinaryString(s3 | (1 << this.f9974d)).substring(1));
        sb.append('>');
        return sb.toString();
    }
}
