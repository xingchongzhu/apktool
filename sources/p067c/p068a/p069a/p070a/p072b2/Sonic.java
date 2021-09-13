package p067c.p068a.p069a.p070a.p072b2;

import java.nio.ShortBuffer;
import java.util.Arrays;
import p067c.p068a.p069a.p070a.p111m2.Assertions;

/* renamed from: c.a.a.a.b2.g0 */
final class Sonic {

    /* renamed from: a */
    private final int f5468a;

    /* renamed from: b */
    private final int f5469b;

    /* renamed from: c */
    private final float f5470c;

    /* renamed from: d */
    private final float f5471d;

    /* renamed from: e */
    private final float f5472e;

    /* renamed from: f */
    private final int f5473f;

    /* renamed from: g */
    private final int f5474g;

    /* renamed from: h */
    private final int f5475h;

    /* renamed from: i */
    private final short[] f5476i;

    /* renamed from: j */
    private short[] f5477j;

    /* renamed from: k */
    private int f5478k;

    /* renamed from: l */
    private short[] f5479l;

    /* renamed from: m */
    private int f5480m;

    /* renamed from: n */
    private short[] f5481n;

    /* renamed from: o */
    private int f5482o;

    /* renamed from: p */
    private int f5483p;

    /* renamed from: q */
    private int f5484q;

    /* renamed from: r */
    private int f5485r;

    /* renamed from: s */
    private int f5486s;

    /* renamed from: t */
    private int f5487t;

    /* renamed from: u */
    private int f5488u;

    /* renamed from: v */
    private int f5489v;

    public Sonic(int i, int i2, float f, float f2, int i3) {
        this.f5468a = i;
        this.f5469b = i2;
        this.f5470c = f;
        this.f5471d = f2;
        this.f5472e = ((float) i) / ((float) i3);
        this.f5473f = i / 400;
        int i4 = i / 65;
        this.f5474g = i4;
        int i5 = i4 * 2;
        this.f5475h = i5;
        this.f5476i = new short[i5];
        this.f5477j = new short[(i5 * i2)];
        this.f5479l = new short[(i5 * i2)];
        this.f5481n = new short[(i5 * i2)];
    }

    /* renamed from: a */
    private void m6575a(float f, int i) {
        int i2;
        int i3;
        if (this.f5480m != i) {
            int i4 = this.f5468a;
            int i5 = (int) (((float) i4) / f);
            while (true) {
                if (i5 <= 16384 && i4 <= 16384) {
                    break;
                }
                i5 /= 2;
                i4 /= 2;
            }
            m6585o(i);
            int i6 = 0;
            while (true) {
                int i7 = this.f5482o;
                boolean z = true;
                if (i6 < i7 - 1) {
                    while (true) {
                        i2 = this.f5483p;
                        int i8 = (i2 + 1) * i5;
                        i3 = this.f5484q;
                        if (i8 <= i3 * i4) {
                            break;
                        }
                        this.f5479l = m6580f(this.f5479l, this.f5480m, 1);
                        int i9 = 0;
                        while (true) {
                            int i10 = this.f5469b;
                            if (i9 >= i10) {
                                break;
                            }
                            this.f5479l[(this.f5480m * i10) + i9] = m6584n(this.f5481n, (i10 * i6) + i9, i4, i5);
                            i9++;
                        }
                        this.f5484q++;
                        this.f5480m++;
                    }
                    int i11 = i2 + 1;
                    this.f5483p = i11;
                    if (i11 == i4) {
                        this.f5483p = 0;
                        if (i3 != i5) {
                            z = false;
                        }
                        Assertions.m10154f(z);
                        this.f5484q = 0;
                    }
                    i6++;
                } else {
                    m6589u(i7 - 1);
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    private void m6576b(float f) {
        int m;
        int i = this.f5478k;
        if (i >= this.f5475h) {
            int i2 = 0;
            do {
                if (this.f5485r > 0) {
                    m = m6577c(i2);
                } else {
                    int g = m6581g(this.f5477j, i2);
                    if (((double) f) > 1.0d) {
                        m = g + m6591w(this.f5477j, i2, f, g);
                    } else {
                        m = m6583m(this.f5477j, i2, f, g);
                    }
                }
                i2 += m;
            } while (this.f5475h + i2 <= i);
            m6590v(i2);
        }
    }

    /* renamed from: c */
    private int m6577c(int i) {
        int min = Math.min(this.f5475h, this.f5485r);
        m6578d(this.f5477j, i, min);
        this.f5485r -= min;
        return min;
    }

    /* renamed from: d */
    private void m6578d(short[] sArr, int i, int i2) {
        short[] f = m6580f(this.f5479l, this.f5480m, i2);
        this.f5479l = f;
        int i3 = this.f5469b;
        System.arraycopy(sArr, i * i3, f, this.f5480m * i3, i3 * i2);
        this.f5480m += i2;
    }

    /* renamed from: e */
    private void m6579e(short[] sArr, int i, int i2) {
        int i3 = this.f5475h / i2;
        int i4 = this.f5469b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f5476i[i7] = (short) (i8 / i5);
        }
    }

    /* renamed from: f */
    private short[] m6580f(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f5469b;
        int i4 = length / i3;
        if (i + i2 <= i4) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    /* renamed from: g */
    private int m6581g(short[] sArr, int i) {
        int i2;
        int i3 = this.f5468a;
        int i4 = i3 > 4000 ? i3 / 4000 : 1;
        if (this.f5469b == 1 && i4 == 1) {
            i2 = m6582h(sArr, i, this.f5473f, this.f5474g);
        } else {
            m6579e(sArr, i, i4);
            int h = m6582h(this.f5476i, 0, this.f5473f / i4, this.f5474g / i4);
            if (i4 != 1) {
                int i5 = h * i4;
                int i6 = i4 * 4;
                int i7 = i5 - i6;
                int i8 = i5 + i6;
                int i9 = this.f5473f;
                if (i7 < i9) {
                    i7 = i9;
                }
                int i10 = this.f5474g;
                if (i8 > i10) {
                    i8 = i10;
                }
                if (this.f5469b == 1) {
                    i2 = m6582h(sArr, i, i7, i8);
                } else {
                    m6579e(sArr, i, 1);
                    i2 = m6582h(this.f5476i, 0, i7, i8);
                }
            } else {
                i2 = h;
            }
        }
        int i11 = m6587q(this.f5488u, this.f5489v) ? this.f5486s : i2;
        this.f5487t = this.f5488u;
        this.f5486s = i2;
        return i11;
    }

    /* renamed from: h */
    private int m6582h(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f5469b;
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
            }
            if (i9 * i7 < i5 * i2) {
                i7 = i2;
                i5 = i9;
            }
            if (i9 * i6 > i8 * i2) {
                i6 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.f5488u = i5 / i7;
        this.f5489v = i8 / i6;
        return i7;
    }

    /* renamed from: m */
    private int m6583m(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f < 0.5f) {
            i3 = (int) ((((float) i2) * f) / (1.0f - f));
        } else {
            this.f5485r = (int) ((((float) i2) * ((2.0f * f) - 1.0f)) / (1.0f - f));
            i3 = i2;
        }
        int i4 = i2 + i3;
        short[] f2 = m6580f(this.f5479l, this.f5480m, i4);
        this.f5479l = f2;
        int i5 = this.f5469b;
        System.arraycopy(sArr, i * i5, f2, this.f5480m * i5, i5 * i2);
        m6586p(i3, this.f5469b, this.f5479l, this.f5480m + i2, sArr, i + i2, sArr, i);
        this.f5480m += i4;
        return i3;
    }

    /* renamed from: n */
    private short m6584n(short[] sArr, int i, int i2, int i3) {
        short s = sArr[i];
        short s2 = sArr[i + this.f5469b];
        int i4 = this.f5484q * i2;
        int i5 = this.f5483p;
        int i6 = i5 * i3;
        int i7 = (i5 + 1) * i3;
        int i8 = i7 - i4;
        int i9 = i7 - i6;
        return (short) (((s * i8) + ((i9 - i8) * s2)) / i9);
    }

    /* renamed from: o */
    private void m6585o(int i) {
        int i2 = this.f5480m - i;
        short[] f = m6580f(this.f5481n, this.f5482o, i2);
        this.f5481n = f;
        short[] sArr = this.f5479l;
        int i3 = this.f5469b;
        System.arraycopy(sArr, i * i3, f, this.f5482o * i3, i3 * i2);
        this.f5480m = i;
        this.f5482o += i2;
    }

    /* renamed from: p */
    private static void m6586p(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i9] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    /* renamed from: q */
    private boolean m6587q(int i, int i2) {
        if (i == 0 || this.f5486s == 0 || i2 > i * 3 || i * 2 <= this.f5487t * 3) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    private void m6588r() {
        int i = this.f5480m;
        float f = this.f5470c;
        float f2 = this.f5471d;
        float f3 = f / f2;
        float f4 = this.f5472e * f2;
        double d = (double) f3;
        if (d > 1.00001d || d < 0.99999d) {
            m6576b(f3);
        } else {
            m6578d(this.f5477j, 0, this.f5478k);
            this.f5478k = 0;
        }
        if (f4 != 1.0f) {
            m6575a(f4, i);
        }
    }

    /* renamed from: u */
    private void m6589u(int i) {
        if (i != 0) {
            short[] sArr = this.f5481n;
            int i2 = this.f5469b;
            System.arraycopy(sArr, i * i2, sArr, 0, (this.f5482o - i) * i2);
            this.f5482o -= i;
        }
    }

    /* renamed from: v */
    private void m6590v(int i) {
        int i2 = this.f5478k - i;
        short[] sArr = this.f5477j;
        int i3 = this.f5469b;
        System.arraycopy(sArr, i * i3, sArr, 0, i3 * i2);
        this.f5478k = i2;
    }

    /* renamed from: w */
    private int m6591w(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f >= 2.0f) {
            i3 = (int) (((float) i2) / (f - 1.0f));
        } else {
            this.f5485r = (int) ((((float) i2) * (2.0f - f)) / (f - 1.0f));
            i3 = i2;
        }
        short[] f2 = m6580f(this.f5479l, this.f5480m, i3);
        this.f5479l = f2;
        m6586p(i3, this.f5469b, f2, this.f5480m, sArr, i, sArr, i + i2);
        this.f5480m += i3;
        return i3;
    }

    /* renamed from: i */
    public void mo5817i() {
        this.f5478k = 0;
        this.f5480m = 0;
        this.f5482o = 0;
        this.f5483p = 0;
        this.f5484q = 0;
        this.f5485r = 0;
        this.f5486s = 0;
        this.f5487t = 0;
        this.f5488u = 0;
        this.f5489v = 0;
    }

    /* renamed from: j */
    public void mo5818j(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f5469b, this.f5480m);
        shortBuffer.put(this.f5479l, 0, this.f5469b * min);
        int i = this.f5480m - min;
        this.f5480m = i;
        short[] sArr = this.f5479l;
        int i2 = this.f5469b;
        System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
    }

    /* renamed from: k */
    public int mo5819k() {
        return this.f5480m * this.f5469b * 2;
    }

    /* renamed from: l */
    public int mo5820l() {
        return this.f5478k * this.f5469b * 2;
    }

    /* renamed from: s */
    public void mo5821s() {
        int i;
        int i2 = this.f5478k;
        float f = this.f5470c;
        float f2 = this.f5471d;
        float f3 = this.f5472e * f2;
        int i3 = this.f5480m + ((int) ((((((float) i2) / (f / f2)) + ((float) this.f5482o)) / f3) + 0.5f));
        this.f5477j = m6580f(this.f5477j, i2, (this.f5475h * 2) + i2);
        int i4 = 0;
        while (true) {
            i = this.f5475h;
            int i5 = i * 2;
            int i6 = this.f5469b;
            if (i4 >= i5 * i6) {
                break;
            }
            this.f5477j[(i6 * i2) + i4] = 0;
            i4++;
        }
        this.f5478k += i * 2;
        m6588r();
        if (this.f5480m > i3) {
            this.f5480m = i3;
        }
        this.f5478k = 0;
        this.f5485r = 0;
        this.f5482o = 0;
    }

    /* renamed from: t */
    public void mo5822t(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.f5469b;
        int i2 = remaining / i;
        int i3 = i * i2 * 2;
        short[] f = m6580f(this.f5477j, this.f5478k, i2);
        this.f5477j = f;
        shortBuffer.get(f, this.f5478k * this.f5469b, i3 / 2);
        this.f5478k += i2;
        m6588r();
    }
}
