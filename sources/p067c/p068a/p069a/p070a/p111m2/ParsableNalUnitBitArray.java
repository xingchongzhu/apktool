package p067c.p068a.p069a.p070a.p111m2;

/* renamed from: c.a.a.a.m2.b0 */
public final class ParsableNalUnitBitArray {

    /* renamed from: a */
    private byte[] f8341a;

    /* renamed from: b */
    private int f8342b;

    /* renamed from: c */
    private int f8343c;

    /* renamed from: d */
    private int f8344d;

    public ParsableNalUnitBitArray(byte[] bArr, int i, int i2) {
        mo7409i(bArr, i, i2);
    }

    /* renamed from: a */
    private void m10126a() {
        boolean z;
        int i = this.f8343c;
        if (i >= 0) {
            int i2 = this.f8342b;
            if (i < i2 || (i == i2 && this.f8344d == 0)) {
                z = true;
                Assertions.m10154f(z);
            }
        }
        z = false;
        Assertions.m10154f(z);
    }

    /* renamed from: f */
    private int m10127f() {
        int i = 0;
        int i2 = 0;
        while (!mo7405d()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = mo7406e(i2);
        }
        return i3 + i;
    }

    /* renamed from: j */
    private boolean m10128j(int i) {
        if (2 <= i && i < this.f8342b) {
            byte[] bArr = this.f8341a;
            if (bArr[i] == 3 && bArr[i - 2] == 0 && bArr[i - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo7403b(int i) {
        int i2 = this.f8343c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f8344d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f8342b) {
                int i6 = this.f8342b;
            } else if (m10128j(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i62 = this.f8342b;
        if (i4 < i62) {
            return true;
        }
        if (i4 == i62 && i5 == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo7404c() {
        int i = this.f8343c;
        int i2 = this.f8344d;
        int i3 = 0;
        while (this.f8343c < this.f8342b && !mo7405d()) {
            i3++;
        }
        boolean z = this.f8343c == this.f8342b;
        this.f8343c = i;
        this.f8344d = i2;
        if (z || !mo7403b((i3 * 2) + 1)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public boolean mo7405d() {
        boolean z = (this.f8341a[this.f8343c] & (128 >> this.f8344d)) != 0;
        mo7410k();
        return z;
    }

    /* renamed from: e */
    public int mo7406e(int i) {
        int i2;
        int i3;
        this.f8344d += i;
        int i4 = 0;
        while (true) {
            i2 = this.f8344d;
            i3 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.f8344d = i5;
            byte[] bArr = this.f8341a;
            int i6 = this.f8343c;
            i4 |= (bArr[i6] & 255) << i5;
            if (!m10128j(i6 + 1)) {
                i3 = 1;
            }
            this.f8343c = i6 + i3;
        }
        byte[] bArr2 = this.f8341a;
        int i7 = this.f8343c;
        int i8 = (-1 >>> (32 - i)) & (i4 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f8344d = 0;
            if (!m10128j(i7 + 1)) {
                i3 = 1;
            }
            this.f8343c = i7 + i3;
        }
        m10126a();
        return i8;
    }

    /* renamed from: g */
    public int mo7407g() {
        int f = m10127f();
        return (f % 2 == 0 ? -1 : 1) * ((f + 1) / 2);
    }

    /* renamed from: h */
    public int mo7408h() {
        return m10127f();
    }

    /* renamed from: i */
    public void mo7409i(byte[] bArr, int i, int i2) {
        this.f8341a = bArr;
        this.f8343c = i;
        this.f8342b = i2;
        this.f8344d = 0;
        m10126a();
    }

    /* renamed from: k */
    public void mo7410k() {
        int i = 1;
        int i2 = this.f8344d + 1;
        this.f8344d = i2;
        if (i2 == 8) {
            this.f8344d = 0;
            int i3 = this.f8343c;
            if (m10128j(i3 + 1)) {
                i = 2;
            }
            this.f8343c = i3 + i;
        }
        m10126a();
    }

    /* renamed from: l */
    public void mo7411l(int i) {
        int i2 = this.f8343c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f8343c = i4;
        int i5 = this.f8344d + (i - (i3 * 8));
        this.f8344d = i5;
        if (i5 > 7) {
            this.f8343c = i4 + 1;
            this.f8344d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f8343c) {
                m10126a();
                return;
            } else if (m10128j(i2)) {
                this.f8343c++;
                i2 += 2;
            }
        }
    }
}
