package p067c.google.p138c.p141j;

import java.util.Arrays;

/* renamed from: c.a.c.j.b */
public final class BitMatrix implements Cloneable {

    /* renamed from: a */
    private final int f9984a;

    /* renamed from: b */
    private final int f9985b;

    /* renamed from: c */
    private final int f9986c;

    /* renamed from: d */
    private final int[] f9987d;

    public BitMatrix(int i) {
        this(i, i);
    }

    /* renamed from: a */
    private String m12106a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(this.f9985b * (this.f9984a + 1));
        for (int i = 0; i < this.f9985b; i++) {
            for (int i2 = 0; i2 < this.f9984a; i2++) {
                sb.append(mo8569d(i2, i) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public void mo8566b() {
        int length = this.f9987d.length;
        for (int i = 0; i < length; i++) {
            this.f9987d[i] = 0;
        }
    }

    /* renamed from: c */
    public BitMatrix clone() {
        return new BitMatrix(this.f9984a, this.f9985b, this.f9986c, (int[]) this.f9987d.clone());
    }

    /* renamed from: d */
    public boolean mo8569d(int i, int i2) {
        return ((this.f9987d[(i2 * this.f9986c) + (i / 32)] >>> (i & 31)) & 1) != 0;
    }

    /* renamed from: e */
    public int mo8570e() {
        return this.f9985b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BitMatrix)) {
            return false;
        }
        BitMatrix bVar = (BitMatrix) obj;
        if (this.f9984a == bVar.f9984a && this.f9985b == bVar.f9985b && this.f9986c == bVar.f9986c && Arrays.equals(this.f9987d, bVar.f9987d)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int mo8572f() {
        return this.f9984a;
    }

    /* renamed from: g */
    public void mo8573g(int i, int i2) {
        int i3 = (i2 * this.f9986c) + (i / 32);
        int[] iArr = this.f9987d;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    /* renamed from: h */
    public void mo8574h(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        } else if (i4 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        } else {
            int i5 = i3 + i;
            int i6 = i4 + i2;
            if (i6 > this.f9985b || i5 > this.f9984a) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i2 < i6) {
                int i7 = this.f9986c * i2;
                for (int i8 = i; i8 < i5; i8++) {
                    int[] iArr = this.f9987d;
                    int i9 = (i8 / 32) + i7;
                    iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                }
                i2++;
            }
        }
    }

    public int hashCode() {
        int i = this.f9984a;
        return (((((((i * 31) + i) * 31) + this.f9985b) * 31) + this.f9986c) * 31) + Arrays.hashCode(this.f9987d);
    }

    /* renamed from: i */
    public String mo8576i(String str, String str2) {
        return m12106a(str, str2, "\n");
    }

    public String toString() {
        return mo8576i("X ", "  ");
    }

    public BitMatrix(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f9984a = i;
        this.f9985b = i2;
        int i3 = (i + 31) / 32;
        this.f9986c = i3;
        this.f9987d = new int[(i3 * i2)];
    }

    private BitMatrix(int i, int i2, int i3, int[] iArr) {
        this.f9984a = i;
        this.f9985b = i2;
        this.f9986c = i3;
        this.f9987d = iArr;
    }
}
