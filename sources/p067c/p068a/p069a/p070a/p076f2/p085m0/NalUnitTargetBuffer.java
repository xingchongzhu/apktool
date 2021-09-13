package p067c.p068a.p069a.p070a.p076f2.p085m0;

import java.util.Arrays;
import p067c.p068a.p069a.p070a.p111m2.Assertions;

/* renamed from: c.a.a.a.f2.m0.w */
final class NalUnitTargetBuffer {

    /* renamed from: a */
    private final int f6922a;

    /* renamed from: b */
    private boolean f6923b;

    /* renamed from: c */
    private boolean f6924c;

    /* renamed from: d */
    public byte[] f6925d;

    /* renamed from: e */
    public int f6926e;

    public NalUnitTargetBuffer(int i, int i2) {
        this.f6922a = i;
        byte[] bArr = new byte[(i2 + 3)];
        this.f6925d = bArr;
        bArr[2] = 1;
    }

    /* renamed from: a */
    public void mo6373a(byte[] bArr, int i, int i2) {
        if (this.f6923b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f6925d;
            int length = bArr2.length;
            int i4 = this.f6926e;
            if (length < i4 + i3) {
                this.f6925d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.f6925d, this.f6926e, i3);
            this.f6926e += i3;
        }
    }

    /* renamed from: b */
    public boolean mo6374b(int i) {
        if (!this.f6923b) {
            return false;
        }
        this.f6926e -= i;
        this.f6923b = false;
        this.f6924c = true;
        return true;
    }

    /* renamed from: c */
    public boolean mo6375c() {
        return this.f6924c;
    }

    /* renamed from: d */
    public void mo6376d() {
        this.f6923b = false;
        this.f6924c = false;
    }

    /* renamed from: e */
    public void mo6377e(int i) {
        boolean z = true;
        Assertions.m10154f(!this.f6923b);
        if (i != this.f6922a) {
            z = false;
        }
        this.f6923b = z;
        if (z) {
            this.f6926e = 3;
            this.f6924c = false;
        }
    }
}
