package p067c.google.p138c.p148n.p150c;

import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: c.a.c.n.c.b */
public final class ByteMatrix {

    /* renamed from: a */
    private final byte[][] f10163a;

    /* renamed from: b */
    private final int f10164b;

    /* renamed from: c */
    private final int f10165c;

    public ByteMatrix(int i, int i2) {
        int[] iArr = new int[2];
        iArr[1] = i;
        iArr[0] = i2;
        this.f10163a = (byte[][]) Array.newInstance(byte.class, iArr);
        this.f10164b = i;
        this.f10165c = i2;
    }

    /* renamed from: a */
    public void mo8667a(byte b) {
        for (byte[] fill : this.f10163a) {
            Arrays.fill(fill, b);
        }
    }

    /* renamed from: b */
    public byte mo8668b(int i, int i2) {
        return this.f10163a[i2][i];
    }

    /* renamed from: c */
    public byte[][] mo8669c() {
        return this.f10163a;
    }

    /* renamed from: d */
    public int mo8670d() {
        return this.f10165c;
    }

    /* renamed from: e */
    public int mo8671e() {
        return this.f10164b;
    }

    /* renamed from: f */
    public void mo8672f(int i, int i2, int i3) {
        this.f10163a[i2][i] = (byte) i3;
    }

    /* renamed from: g */
    public void mo8673g(int i, int i2, boolean z) {
        this.f10163a[i2][i] = z ? (byte) 1 : 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.f10164b * 2 * this.f10165c) + 2);
        for (int i = 0; i < this.f10165c; i++) {
            byte[] bArr = this.f10163a[i];
            for (int i2 = 0; i2 < this.f10164b; i2++) {
                byte b = bArr[i2];
                if (b == 0) {
                    sb.append(" 0");
                } else if (b != 1) {
                    sb.append("  ");
                } else {
                    sb.append(" 1");
                }
            }
            sb.append(10);
        }
        return sb.toString();
    }
}
