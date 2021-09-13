package p067c.p068a.p138c.p141j;

import java.util.Arrays;

/* renamed from: c.a.c.j.a */
public final class BitArray implements Cloneable {

    /* renamed from: a */
    private int[] f9982a;

    /* renamed from: b */
    private int f9983b;

    public BitArray() {
        this.f9983b = 0;
        this.f9982a = new int[1];
    }

    /* renamed from: e */
    private void m12095e(int i) {
        if (i > (this.f9982a.length << 5)) {
            int[] i2 = m12096i(i);
            int[] iArr = this.f9982a;
            System.arraycopy(iArr, 0, i2, 0, iArr.length);
            this.f9982a = i2;
        }
    }

    /* renamed from: i */
    private static int[] m12096i(int i) {
        return new int[((i + 31) / 32)];
    }

    /* renamed from: a */
    public void mo8553a(boolean z) {
        m12095e(this.f9983b + 1);
        if (z) {
            int[] iArr = this.f9982a;
            int i = this.f9983b;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.f9983b++;
    }

    /* renamed from: b */
    public void mo8554b(BitArray aVar) {
        int i = aVar.f9983b;
        m12095e(this.f9983b + i);
        for (int i2 = 0; i2 < i; i2++) {
            mo8553a(aVar.mo8559f(i2));
        }
    }

    /* renamed from: c */
    public void mo8555c(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        m12095e(this.f9983b + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            mo8553a(z);
            i2--;
        }
    }

    /* renamed from: d */
    public BitArray clone() {
        return new BitArray((int[]) this.f9982a.clone(), this.f9983b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BitArray)) {
            return false;
        }
        BitArray aVar = (BitArray) obj;
        if (this.f9983b != aVar.f9983b || !Arrays.equals(this.f9982a, aVar.f9982a)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public boolean mo8559f(int i) {
        return ((1 << (i & 31)) & this.f9982a[i / 32]) != 0;
    }

    /* renamed from: g */
    public int mo8560g() {
        return this.f9983b;
    }

    /* renamed from: h */
    public int mo8561h() {
        return (this.f9983b + 7) / 8;
    }

    public int hashCode() {
        return (this.f9983b * 31) + Arrays.hashCode(this.f9982a);
    }

    /* renamed from: j */
    public void mo8563j(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < 8; i6++) {
                if (mo8559f(i)) {
                    i5 |= 1 << (7 - i6);
                }
                i++;
            }
            bArr[i2 + i4] = (byte) i5;
        }
    }

    /* renamed from: k */
    public void mo8564k(BitArray aVar) {
        if (this.f9983b == aVar.f9983b) {
            int i = 0;
            while (true) {
                int[] iArr = this.f9982a;
                if (i < iArr.length) {
                    iArr[i] = iArr[i] ^ aVar.f9982a[i];
                    i++;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Sizes don't match");
        }
    }

    public String toString() {
        int i = this.f9983b;
        StringBuilder sb = new StringBuilder(i + (i / 8) + 1);
        for (int i2 = 0; i2 < this.f9983b; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(mo8559f(i2) ? 'X' : '.');
        }
        return sb.toString();
    }

    BitArray(int[] iArr, int i) {
        this.f9982a = iArr;
        this.f9983b = i;
    }
}
