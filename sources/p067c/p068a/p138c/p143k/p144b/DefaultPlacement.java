package p067c.p068a.p138c.p143k.p144b;

import java.util.Arrays;

/* renamed from: c.a.c.k.b.e */
public class DefaultPlacement {

    /* renamed from: a */
    private final CharSequence f10039a;

    /* renamed from: b */
    private final int f10040b;

    /* renamed from: c */
    private final int f10041c;

    /* renamed from: d */
    private final byte[] f10042d;

    public DefaultPlacement(CharSequence charSequence, int i, int i2) {
        this.f10039a = charSequence;
        this.f10041c = i;
        this.f10040b = i2;
        byte[] bArr = new byte[(i * i2)];
        this.f10042d = bArr;
        Arrays.fill(bArr, -1);
    }

    /* renamed from: a */
    private void m12153a(int i) {
        m12157f(this.f10040b - 1, 0, i, 1);
        m12157f(this.f10040b - 1, 1, i, 2);
        m12157f(this.f10040b - 1, 2, i, 3);
        m12157f(0, this.f10041c - 2, i, 4);
        m12157f(0, this.f10041c - 1, i, 5);
        m12157f(1, this.f10041c - 1, i, 6);
        m12157f(2, this.f10041c - 1, i, 7);
        m12157f(3, this.f10041c - 1, i, 8);
    }

    /* renamed from: b */
    private void m12154b(int i) {
        m12157f(this.f10040b - 3, 0, i, 1);
        m12157f(this.f10040b - 2, 0, i, 2);
        m12157f(this.f10040b - 1, 0, i, 3);
        m12157f(0, this.f10041c - 4, i, 4);
        m12157f(0, this.f10041c - 3, i, 5);
        m12157f(0, this.f10041c - 2, i, 6);
        m12157f(0, this.f10041c - 1, i, 7);
        m12157f(1, this.f10041c - 1, i, 8);
    }

    /* renamed from: c */
    private void m12155c(int i) {
        m12157f(this.f10040b - 3, 0, i, 1);
        m12157f(this.f10040b - 2, 0, i, 2);
        m12157f(this.f10040b - 1, 0, i, 3);
        m12157f(0, this.f10041c - 2, i, 4);
        m12157f(0, this.f10041c - 1, i, 5);
        m12157f(1, this.f10041c - 1, i, 6);
        m12157f(2, this.f10041c - 1, i, 7);
        m12157f(3, this.f10041c - 1, i, 8);
    }

    /* renamed from: d */
    private void m12156d(int i) {
        m12157f(this.f10040b - 1, 0, i, 1);
        m12157f(this.f10040b - 1, this.f10041c - 1, i, 2);
        m12157f(0, this.f10041c - 3, i, 3);
        m12157f(0, this.f10041c - 2, i, 4);
        m12157f(0, this.f10041c - 1, i, 5);
        m12157f(1, this.f10041c - 3, i, 6);
        m12157f(1, this.f10041c - 2, i, 7);
        m12157f(1, this.f10041c - 1, i, 8);
    }

    /* renamed from: f */
    private void m12157f(int i, int i2, int i3, int i4) {
        if (i < 0) {
            int i5 = this.f10040b;
            i += i5;
            i2 += 4 - ((i5 + 4) % 8);
        }
        if (i2 < 0) {
            int i6 = this.f10041c;
            i2 += i6;
            i += 4 - ((i6 + 4) % 8);
        }
        boolean z = true;
        if ((this.f10039a.charAt(i3) & (1 << (8 - i4))) == 0) {
            z = false;
        }
        m12159i(i2, i, z);
    }

    /* renamed from: g */
    private boolean m12158g(int i, int i2) {
        return this.f10042d[(i2 * this.f10041c) + i] < 0;
    }

    /* renamed from: i */
    private void m12159i(int i, int i2, boolean z) {
        this.f10042d[(i2 * this.f10041c) + i] = z ? (byte) 1 : 0;
    }

    /* renamed from: j */
    private void m12160j(int i, int i2, int i3) {
        int i4 = i - 2;
        int i5 = i2 - 2;
        m12157f(i4, i5, i3, 1);
        int i6 = i2 - 1;
        m12157f(i4, i6, i3, 2);
        int i7 = i - 1;
        m12157f(i7, i5, i3, 3);
        m12157f(i7, i6, i3, 4);
        m12157f(i7, i2, i3, 5);
        m12157f(i, i5, i3, 6);
        m12157f(i, i6, i3, 7);
        m12157f(i, i2, i3, 8);
    }

    /* renamed from: e */
    public final boolean mo8605e(int i, int i2) {
        return this.f10042d[(i2 * this.f10041c) + i] == 1;
    }

    /* renamed from: h */
    public final void mo8606h() {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 4;
        while (true) {
            if (i5 == this.f10040b && i3 == 0) {
                int i6 = i4 + 1;
                m12153a(i4);
                i4 = i6;
            }
            if (i5 == this.f10040b - 2 && i3 == 0 && this.f10041c % 4 != 0) {
                int i7 = i4 + 1;
                m12154b(i4);
                i4 = i7;
            }
            if (i5 == this.f10040b - 2 && i3 == 0 && this.f10041c % 8 == 4) {
                int i8 = i4 + 1;
                m12155c(i4);
                i4 = i8;
            }
            if (i5 == this.f10040b + 4 && i3 == 2 && this.f10041c % 8 == 0) {
                int i9 = i4 + 1;
                m12156d(i4);
                i4 = i9;
            }
            do {
                if (i5 < this.f10040b && i3 >= 0 && m12158g(i3, i5)) {
                    int i10 = i4 + 1;
                    m12160j(i5, i3, i4);
                    i4 = i10;
                }
                i5 -= 2;
                i3 += 2;
                if (i5 < 0) {
                    break;
                }
            } while (i3 < this.f10041c);
            int i11 = i5 + 1;
            int i12 = i3 + 3;
            do {
                if (i11 >= 0 && i12 < this.f10041c && m12158g(i12, i11)) {
                    int i13 = i4 + 1;
                    m12160j(i11, i12, i4);
                    i4 = i13;
                }
                i11 += 2;
                i12 -= 2;
                i = this.f10040b;
                if (i11 >= i) {
                    break;
                }
            } while (i12 >= 0);
            i5 = i11 + 3;
            i3 = i12 + 1;
            if (i5 >= i) {
                i2 = this.f10041c;
                if (i3 >= i2) {
                    break;
                }
            }
        }
        if (m12158g(i2 - 1, i - 1)) {
            m12159i(this.f10041c - 1, this.f10040b - 1, true);
            m12159i(this.f10041c - 2, this.f10040b - 2, true);
        }
    }
}
