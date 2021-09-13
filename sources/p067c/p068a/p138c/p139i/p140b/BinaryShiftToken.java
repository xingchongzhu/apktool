package p067c.p068a.p138c.p139i.p140b;

import p067c.p068a.p138c.p141j.BitArray;

/* renamed from: c.a.c.i.b.b */
final class BinaryShiftToken extends Token {

    /* renamed from: c */
    private final short f9964c;

    /* renamed from: d */
    private final short f9965d;

    BinaryShiftToken(Token gVar, int i, int i2) {
        super(gVar);
        this.f9964c = (short) i;
        this.f9965d = (short) i2;
    }

    /* renamed from: c */
    public void mo8534c(BitArray aVar, byte[] bArr) {
        int i = 0;
        while (true) {
            short s = this.f9965d;
            if (i < s) {
                if (i == 0 || (i == 31 && s <= 62)) {
                    aVar.mo8555c(31, 5);
                    short s2 = this.f9965d;
                    if (s2 > 62) {
                        aVar.mo8555c(s2 - 31, 16);
                    } else if (i == 0) {
                        aVar.mo8555c(Math.min(s2, 31), 5);
                    } else {
                        aVar.mo8555c(s2 - 31, 5);
                    }
                }
                aVar.mo8555c(bArr[this.f9964c + i], 8);
                i++;
            } else {
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(this.f9964c);
        sb.append("::");
        sb.append((this.f9964c + this.f9965d) - 1);
        sb.append('>');
        return sb.toString();
    }
}
