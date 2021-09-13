package p067c.p068a.p069a.p070a.p076f2;

import p067c.p068a.p069a.p070a.p111m2.Assertions;

/* renamed from: c.a.a.a.f2.c0 */
public final class VorbisBitArray {

    /* renamed from: a */
    private final byte[] f5997a;

    /* renamed from: b */
    private final int f5998b;

    /* renamed from: c */
    private int f5999c;

    /* renamed from: d */
    private int f6000d;

    public VorbisBitArray(byte[] bArr) {
        this.f5997a = bArr;
        this.f5998b = bArr.length;
    }

    /* renamed from: a */
    private void m7336a() {
        boolean z;
        int i = this.f5999c;
        if (i >= 0) {
            int i2 = this.f5998b;
            if (i < i2 || (i == i2 && this.f6000d == 0)) {
                z = true;
                Assertions.m10154f(z);
            }
        }
        z = false;
        Assertions.m10154f(z);
    }

    /* renamed from: b */
    public int mo6182b() {
        return (this.f5999c * 8) + this.f6000d;
    }

    /* renamed from: c */
    public boolean mo6183c() {
        boolean z = (((this.f5997a[this.f5999c] & 255) >> this.f6000d) & 1) == 1;
        mo6185e(1);
        return z;
    }

    /* renamed from: d */
    public int mo6184d(int i) {
        int i2 = this.f5999c;
        int min = Math.min(i, 8 - this.f6000d);
        int i3 = i2 + 1;
        int i4 = ((this.f5997a[i2] & 255) >> this.f6000d) & (255 >> (8 - min));
        while (min < i) {
            i4 |= (this.f5997a[i3] & 255) << min;
            min += 8;
            i3++;
        }
        int i5 = i4 & (-1 >>> (32 - i));
        mo6185e(i);
        return i5;
    }

    /* renamed from: e */
    public void mo6185e(int i) {
        int i2 = i / 8;
        int i3 = this.f5999c + i2;
        this.f5999c = i3;
        int i4 = this.f6000d + (i - (i2 * 8));
        this.f6000d = i4;
        if (i4 > 7) {
            this.f5999c = i3 + 1;
            this.f6000d = i4 - 8;
        }
        m7336a();
    }
}
