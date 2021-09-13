package p067c.p068a.p138c.p139i.p140b;

import java.util.LinkedList;
import p067c.p068a.p138c.p141j.BitArray;

/* renamed from: c.a.c.i.b.f */
final class State {

    /* renamed from: a */
    static final State f9975a = new State(Token.f9980a, 0, 0, 0);

    /* renamed from: b */
    private final int f9976b;

    /* renamed from: c */
    private final Token f9977c;

    /* renamed from: d */
    private final int f9978d;

    /* renamed from: e */
    private final int f9979e;

    private State(Token gVar, int i, int i2, int i3) {
        this.f9977c = gVar;
        this.f9976b = i;
        this.f9978d = i2;
        this.f9979e = i3;
    }

    /* renamed from: b */
    private static int m12081b(State fVar) {
        int i = fVar.f9978d;
        if (i > 62) {
            return 21;
        }
        if (i > 31) {
            return 20;
        }
        return i > 0 ? 10 : 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public State mo8540a(int i) {
        Token gVar = this.f9977c;
        int i2 = this.f9976b;
        int i3 = this.f9979e;
        if (i2 == 4 || i2 == 2) {
            int i4 = HighLevelEncoder.f9968b[i2][0];
            int i5 = 65535 & i4;
            int i6 = i4 >> 16;
            gVar = gVar.mo8550a(i5, i6);
            i3 += i6;
            i2 = 0;
        }
        int i7 = this.f9978d;
        int i8 = (i7 == 0 || i7 == 31) ? 18 : i7 == 62 ? 9 : 8;
        State fVar = new State(gVar, i2, i7 + 1, i3 + i8);
        return fVar.f9978d == 2078 ? fVar.mo8541c(i + 1) : fVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public State mo8541c(int i) {
        int i2 = this.f9978d;
        if (i2 == 0) {
            return this;
        }
        return new State(this.f9977c.mo8551b(i - i2, i2), this.f9976b, 0, this.f9979e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo8542d() {
        return this.f9978d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo8543e() {
        return this.f9979e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int mo8544f() {
        return this.f9976b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public boolean mo8545g(State fVar) {
        int i = this.f9979e + (HighLevelEncoder.f9968b[this.f9976b][fVar.f9976b] >> 16);
        int i2 = this.f9978d;
        int i3 = fVar.f9978d;
        if (i2 < i3) {
            i += m12081b(fVar) - m12081b(this);
        } else if (i2 > i3 && i3 > 0) {
            i += 10;
        }
        return i <= fVar.f9979e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public State mo8546h(int i, int i2) {
        int i3 = this.f9979e;
        Token gVar = this.f9977c;
        int i4 = this.f9976b;
        if (i != i4) {
            int i5 = HighLevelEncoder.f9968b[i4][i];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            gVar = gVar.mo8550a(i6, i7);
            i3 += i7;
        }
        int i8 = i == 2 ? 4 : 5;
        return new State(gVar.mo8550a(i2, i8), i, 0, i3 + i8);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public State mo8547i(int i, int i2) {
        Token gVar = this.f9977c;
        int i3 = this.f9976b;
        int i4 = i3 == 2 ? 4 : 5;
        return new State(gVar.mo8550a(HighLevelEncoder.f9970d[i3][i], i4).mo8550a(i2, 5), this.f9976b, 0, this.f9979e + i4 + 5);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public BitArray mo8548j(byte[] bArr) {
        LinkedList<Token> linkedList = new LinkedList<>();
        for (Token gVar = mo8541c(bArr.length).f9977c; gVar != null; gVar = gVar.mo8552d()) {
            linkedList.addFirst(gVar);
        }
        BitArray aVar = new BitArray();
        for (Token c : linkedList) {
            c.mo8534c(aVar, bArr);
        }
        return aVar;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", new Object[]{HighLevelEncoder.f9967a[this.f9976b], Integer.valueOf(this.f9979e), Integer.valueOf(this.f9978d)});
    }
}
