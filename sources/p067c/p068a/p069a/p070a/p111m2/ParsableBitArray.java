package p067c.p068a.p069a.p070a.p111m2;

import java.nio.charset.Charset;

/* renamed from: c.a.a.a.m2.z */
public final class ParsableBitArray {

    /* renamed from: a */
    public byte[] f8462a;

    /* renamed from: b */
    private int f8463b;

    /* renamed from: c */
    private int f8464c;

    /* renamed from: d */
    private int f8465d;

    public ParsableBitArray() {
        this.f8462a = Util.f8403f;
    }

    /* renamed from: a */
    private void m10429a() {
        boolean z;
        int i = this.f8463b;
        if (i >= 0) {
            int i2 = this.f8465d;
            if (i < i2 || (i == i2 && this.f8464c == 0)) {
                z = true;
                Assertions.m10154f(z);
            }
        }
        z = false;
        Assertions.m10154f(z);
    }

    /* renamed from: b */
    public int mo7489b() {
        return ((this.f8465d - this.f8463b) * 8) - this.f8464c;
    }

    /* renamed from: c */
    public void mo7490c() {
        if (this.f8464c != 0) {
            this.f8464c = 0;
            this.f8463b++;
            m10429a();
        }
    }

    /* renamed from: d */
    public int mo7491d() {
        Assertions.m10154f(this.f8464c == 0);
        return this.f8463b;
    }

    /* renamed from: e */
    public int mo7492e() {
        return (this.f8463b * 8) + this.f8464c;
    }

    /* renamed from: f */
    public void mo7493f(int i, int i2) {
        if (i2 < 32) {
            i &= (1 << i2) - 1;
        }
        int min = Math.min(8 - this.f8464c, i2);
        int i3 = this.f8464c;
        int i4 = (8 - i3) - min;
        byte b = (65280 >> i3) | ((1 << i4) - 1);
        byte[] bArr = this.f8462a;
        int i5 = this.f8463b;
        bArr[i5] = (byte) (b & bArr[i5]);
        int i6 = i2 - min;
        bArr[i5] = (byte) (((i >>> i6) << i4) | bArr[i5]);
        int i7 = i5 + 1;
        while (i6 > 8) {
            int i8 = i7 + 1;
            this.f8462a[i7] = (byte) (i >>> (i6 - 8));
            i6 -= 8;
            i7 = i8;
        }
        int i9 = 8 - i6;
        byte[] bArr2 = this.f8462a;
        bArr2[i7] = (byte) (bArr2[i7] & ((1 << i9) - 1));
        bArr2[i7] = (byte) (((i & ((1 << i6) - 1)) << i9) | bArr2[i7]);
        mo7505r(i2);
        m10429a();
    }

    /* renamed from: g */
    public boolean mo7494g() {
        boolean z = (this.f8462a[this.f8463b] & (128 >> this.f8464c)) != 0;
        mo7504q();
        return z;
    }

    /* renamed from: h */
    public int mo7495h(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f8464c += i;
        int i3 = 0;
        while (true) {
            i2 = this.f8464c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f8464c = i4;
            byte[] bArr = this.f8462a;
            int i5 = this.f8463b;
            this.f8463b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f8462a;
        int i6 = this.f8463b;
        int i7 = (-1 >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f8464c = 0;
            this.f8463b = i6 + 1;
        }
        m10429a();
        return i7;
    }

    /* renamed from: i */
    public void mo7496i(byte[] bArr, int i, int i2) {
        int i3 = (i2 >> 3) + i;
        while (i < i3) {
            byte[] bArr2 = this.f8462a;
            int i4 = this.f8463b;
            int i5 = i4 + 1;
            this.f8463b = i5;
            byte b = bArr2[i4];
            int i6 = this.f8464c;
            bArr[i] = (byte) (b << i6);
            bArr[i] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | bArr[i]);
            i++;
        }
        int i7 = i2 & 7;
        if (i7 != 0) {
            bArr[i3] = (byte) (bArr[i3] & (255 >> i7));
            int i8 = this.f8464c;
            if (i8 + i7 > 8) {
                byte b2 = bArr[i3];
                byte[] bArr3 = this.f8462a;
                int i9 = this.f8463b;
                this.f8463b = i9 + 1;
                bArr[i3] = (byte) (b2 | ((bArr3[i9] & 255) << i8));
                this.f8464c = i8 - 8;
            }
            int i10 = this.f8464c + i7;
            this.f8464c = i10;
            byte[] bArr4 = this.f8462a;
            int i11 = this.f8463b;
            bArr[i3] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i3]);
            if (i10 == 8) {
                this.f8464c = 0;
                this.f8463b = i11 + 1;
            }
            m10429a();
        }
    }

    /* renamed from: j */
    public long mo7497j(int i) {
        if (i <= 32) {
            return Util.m10258K0(mo7495h(i));
        }
        return Util.m10254I0(mo7495h(i - 32), mo7495h(32));
    }

    /* renamed from: k */
    public void mo7498k(byte[] bArr, int i, int i2) {
        Assertions.m10154f(this.f8464c == 0);
        System.arraycopy(this.f8462a, this.f8463b, bArr, i, i2);
        this.f8463b += i2;
        m10429a();
    }

    /* renamed from: l */
    public String mo7499l(int i, Charset charset) {
        byte[] bArr = new byte[i];
        mo7498k(bArr, 0, i);
        return new String(bArr, charset);
    }

    /* renamed from: m */
    public void mo7500m(ParsableByteArray a0Var) {
        mo7502o(a0Var.mo7379d(), a0Var.mo7381f());
        mo7503p(a0Var.mo7380e() * 8);
    }

    /* renamed from: n */
    public void mo7501n(byte[] bArr) {
        mo7502o(bArr, bArr.length);
    }

    /* renamed from: o */
    public void mo7502o(byte[] bArr, int i) {
        this.f8462a = bArr;
        this.f8463b = 0;
        this.f8464c = 0;
        this.f8465d = i;
    }

    /* renamed from: p */
    public void mo7503p(int i) {
        int i2 = i / 8;
        this.f8463b = i2;
        this.f8464c = i - (i2 * 8);
        m10429a();
    }

    /* renamed from: q */
    public void mo7504q() {
        int i = this.f8464c + 1;
        this.f8464c = i;
        if (i == 8) {
            this.f8464c = 0;
            this.f8463b++;
        }
        m10429a();
    }

    /* renamed from: r */
    public void mo7505r(int i) {
        int i2 = i / 8;
        int i3 = this.f8463b + i2;
        this.f8463b = i3;
        int i4 = this.f8464c + (i - (i2 * 8));
        this.f8464c = i4;
        if (i4 > 7) {
            this.f8463b = i3 + 1;
            this.f8464c = i4 - 8;
        }
        m10429a();
    }

    /* renamed from: s */
    public void mo7506s(int i) {
        Assertions.m10154f(this.f8464c == 0);
        this.f8463b += i;
        m10429a();
    }

    public ParsableBitArray(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public ParsableBitArray(byte[] bArr, int i) {
        this.f8462a = bArr;
        this.f8465d = i;
    }
}
