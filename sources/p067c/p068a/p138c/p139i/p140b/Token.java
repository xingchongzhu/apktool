package p067c.p068a.p138c.p139i.p140b;

import p067c.p068a.p138c.p141j.BitArray;

/* renamed from: c.a.c.i.b.g */
abstract class Token {

    /* renamed from: a */
    static final Token f9980a = new SimpleToken(null, 0, 0);

    /* renamed from: b */
    private final Token f9981b;

    Token(Token gVar) {
        this.f9981b = gVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Token mo8550a(int i, int i2) {
        return new SimpleToken(this, i, i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final Token mo8551b(int i, int i2) {
        return new BinaryShiftToken(this, i, i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract void mo8534c(BitArray aVar, byte[] bArr);

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final Token mo8552d() {
        return this.f9981b;
    }
}
