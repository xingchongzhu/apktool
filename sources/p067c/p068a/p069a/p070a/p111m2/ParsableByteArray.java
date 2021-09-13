package p067c.p068a.p069a.p070a.p111m2;

import com.umeng.analytics.pro.TType;
import java.nio.charset.Charset;
import java.util.Arrays;
import p067c.p068a.p134b.p135a.Charsets;

/* renamed from: c.a.a.a.m2.a0 */
public final class ParsableByteArray {

    /* renamed from: a */
    private byte[] f8337a;

    /* renamed from: b */
    private int f8338b;

    /* renamed from: c */
    private int f8339c;

    public ParsableByteArray() {
        this.f8337a = Util.f8403f;
    }

    /* renamed from: A */
    public String mo7359A(int i) {
        return mo7360B(i, Charsets.f9743c);
    }

    /* renamed from: B */
    public String mo7360B(int i, Charset charset) {
        String str = new String(this.f8337a, this.f8338b, i, charset);
        this.f8338b += i;
        return str;
    }

    /* renamed from: C */
    public int mo7361C() {
        return (mo7362D() << 21) | (mo7362D() << 14) | (mo7362D() << 7) | mo7362D();
    }

    /* renamed from: D */
    public int mo7362D() {
        byte[] bArr = this.f8337a;
        int i = this.f8338b;
        this.f8338b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: E */
    public int mo7363E() {
        byte[] bArr = this.f8337a;
        int i = this.f8338b;
        int i2 = i + 1;
        this.f8338b = i2;
        int i3 = (bArr[i] & 255) << 8;
        int i4 = i2 + 1;
        this.f8338b = i4;
        byte b = (bArr[i2] & 255) | i3;
        this.f8338b = i4 + 2;
        return b;
    }

    /* renamed from: F */
    public long mo7364F() {
        byte[] bArr = this.f8337a;
        int i = this.f8338b;
        int i2 = i + 1;
        this.f8338b = i2;
        long j = (((long) bArr[i]) & 255) << 24;
        int i3 = i2 + 1;
        this.f8338b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 16);
        int i4 = i3 + 1;
        this.f8338b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 8);
        this.f8338b = i4 + 1;
        return (((long) bArr[i4]) & 255) | j3;
    }

    /* renamed from: G */
    public int mo7365G() {
        byte[] bArr = this.f8337a;
        int i = this.f8338b;
        int i2 = i + 1;
        this.f8338b = i2;
        int i3 = (bArr[i] & 255) << TType.f16865n;
        int i4 = i2 + 1;
        this.f8338b = i4;
        byte b = i3 | ((bArr[i2] & 255) << 8);
        this.f8338b = i4 + 1;
        return (bArr[i4] & 255) | b;
    }

    /* renamed from: H */
    public int mo7366H() {
        int n = mo7389n();
        if (n >= 0) {
            return n;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Top bit not zero: ");
        sb.append(n);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: I */
    public long mo7367I() {
        long w = mo7398w();
        if (w >= 0) {
            return w;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Top bit not zero: ");
        sb.append(w);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: J */
    public int mo7368J() {
        byte[] bArr = this.f8337a;
        int i = this.f8338b;
        int i2 = i + 1;
        this.f8338b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.f8338b = i2 + 1;
        return (bArr[i2] & 255) | i3;
    }

    /* renamed from: K */
    public long mo7369K() {
        int i;
        int i2;
        long j = (long) this.f8337a[this.f8338b];
        int i3 = 7;
        while (true) {
            i = 1;
            if (i3 < 0) {
                break;
            }
            int i4 = 1 << i3;
            if ((((long) i4) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= (long) (i4 - 1);
                i2 = 7 - i3;
            } else if (i3 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 != 0) {
            while (i < i2) {
                byte b = this.f8337a[this.f8338b + i];
                if ((b & 192) == 128) {
                    j = (j << 6) | ((long) (b & 63));
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid UTF-8 sequence continuation byte: ");
                    sb.append(j);
                    throw new NumberFormatException(sb.toString());
                }
            }
            this.f8338b += i2;
            return j;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Invalid UTF-8 sequence first byte: ");
        sb2.append(j);
        throw new NumberFormatException(sb2.toString());
    }

    /* renamed from: L */
    public void mo7370L(int i) {
        mo7372N(mo7377b() < i ? new byte[i] : this.f8337a, i);
    }

    /* renamed from: M */
    public void mo7371M(byte[] bArr) {
        mo7372N(bArr, bArr.length);
    }

    /* renamed from: N */
    public void mo7372N(byte[] bArr, int i) {
        this.f8337a = bArr;
        this.f8339c = i;
        this.f8338b = 0;
    }

    /* renamed from: O */
    public void mo7373O(int i) {
        Assertions.m10149a(i >= 0 && i <= this.f8337a.length);
        this.f8339c = i;
    }

    /* renamed from: P */
    public void mo7374P(int i) {
        Assertions.m10149a(i >= 0 && i <= this.f8339c);
        this.f8338b = i;
    }

    /* renamed from: Q */
    public void mo7375Q(int i) {
        mo7374P(this.f8338b + i);
    }

    /* renamed from: a */
    public int mo7376a() {
        return this.f8339c - this.f8338b;
    }

    /* renamed from: b */
    public int mo7377b() {
        return this.f8337a.length;
    }

    /* renamed from: c */
    public void mo7378c(int i) {
        if (i > mo7377b()) {
            this.f8337a = Arrays.copyOf(this.f8337a, i);
        }
    }

    /* renamed from: d */
    public byte[] mo7379d() {
        return this.f8337a;
    }

    /* renamed from: e */
    public int mo7380e() {
        return this.f8338b;
    }

    /* renamed from: f */
    public int mo7381f() {
        return this.f8339c;
    }

    /* renamed from: g */
    public char mo7382g() {
        byte[] bArr = this.f8337a;
        int i = this.f8338b;
        return (char) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    /* renamed from: h */
    public int mo7383h() {
        return this.f8337a[this.f8338b] & 255;
    }

    /* renamed from: i */
    public void mo7384i(ParsableBitArray zVar, int i) {
        mo7385j(zVar.f8462a, 0, i);
        zVar.mo7503p(0);
    }

    /* renamed from: j */
    public void mo7385j(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f8337a, this.f8338b, bArr, i, i2);
        this.f8338b += i2;
    }

    /* renamed from: k */
    public String mo7386k(char c) {
        if (mo7376a() == 0) {
            return null;
        }
        int i = this.f8338b;
        while (i < this.f8339c && this.f8337a[i] != c) {
            i++;
        }
        byte[] bArr = this.f8337a;
        int i2 = this.f8338b;
        String C = Util.m10241C(bArr, i2, i - i2);
        this.f8338b = i;
        if (i < this.f8339c) {
            this.f8338b = i + 1;
        }
        return C;
    }

    /* renamed from: l */
    public double mo7387l() {
        return Double.longBitsToDouble(mo7398w());
    }

    /* renamed from: m */
    public float mo7388m() {
        return Float.intBitsToFloat(mo7389n());
    }

    /* renamed from: n */
    public int mo7389n() {
        byte[] bArr = this.f8337a;
        int i = this.f8338b;
        int i2 = i + 1;
        this.f8338b = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i2 + 1;
        this.f8338b = i4;
        byte b = i3 | ((bArr[i2] & 255) << TType.f16865n);
        int i5 = i4 + 1;
        this.f8338b = i5;
        byte b2 = b | ((bArr[i4] & 255) << 8);
        this.f8338b = i5 + 1;
        return (bArr[i5] & 255) | b2;
    }

    /* renamed from: o */
    public int mo7390o() {
        byte[] bArr = this.f8337a;
        int i = this.f8338b;
        int i2 = i + 1;
        this.f8338b = i2;
        int i3 = ((bArr[i] & 255) << 24) >> 8;
        int i4 = i2 + 1;
        this.f8338b = i4;
        byte b = i3 | ((bArr[i2] & 255) << 8);
        this.f8338b = i4 + 1;
        return (bArr[i4] & 255) | b;
    }

    /* renamed from: p */
    public String mo7391p() {
        if (mo7376a() == 0) {
            return null;
        }
        int i = this.f8338b;
        while (i < this.f8339c && !Util.m10298k0(this.f8337a[i])) {
            i++;
        }
        int i2 = this.f8338b;
        if (i - i2 >= 3) {
            byte[] bArr = this.f8337a;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.f8338b = i2 + 3;
            }
        }
        byte[] bArr2 = this.f8337a;
        int i3 = this.f8338b;
        String C = Util.m10241C(bArr2, i3, i - i3);
        this.f8338b = i;
        int i4 = this.f8339c;
        if (i == i4) {
            return C;
        }
        byte[] bArr3 = this.f8337a;
        if (bArr3[i] == 13) {
            int i5 = i + 1;
            this.f8338b = i5;
            if (i5 == i4) {
                return C;
            }
        }
        int i6 = this.f8338b;
        if (bArr3[i6] == 10) {
            this.f8338b = i6 + 1;
        }
        return C;
    }

    /* renamed from: q */
    public int mo7392q() {
        byte[] bArr = this.f8337a;
        int i = this.f8338b;
        int i2 = i + 1;
        this.f8338b = i2;
        byte b = bArr[i] & 255;
        int i3 = i2 + 1;
        this.f8338b = i3;
        byte b2 = b | ((bArr[i2] & 255) << 8);
        int i4 = i3 + 1;
        this.f8338b = i4;
        byte b3 = b2 | ((bArr[i3] & 255) << TType.f16865n);
        this.f8338b = i4 + 1;
        return ((bArr[i4] & 255) << 24) | b3;
    }

    /* renamed from: r */
    public long mo7393r() {
        byte[] bArr = this.f8337a;
        int i = this.f8338b;
        int i2 = i + 1;
        this.f8338b = i2;
        long j = ((long) bArr[i]) & 255;
        int i3 = i2 + 1;
        this.f8338b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i3 + 1;
        this.f8338b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        int i5 = i4 + 1;
        this.f8338b = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 24);
        int i6 = i5 + 1;
        this.f8338b = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 32);
        int i7 = i6 + 1;
        this.f8338b = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 40);
        int i8 = i7 + 1;
        this.f8338b = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 48);
        this.f8338b = i8 + 1;
        return ((((long) bArr[i8]) & 255) << 56) | j7;
    }

    /* renamed from: s */
    public short mo7394s() {
        byte[] bArr = this.f8337a;
        int i = this.f8338b;
        int i2 = i + 1;
        this.f8338b = i2;
        byte b = bArr[i] & 255;
        this.f8338b = i2 + 1;
        return (short) (((bArr[i2] & 255) << 8) | b);
    }

    /* renamed from: t */
    public long mo7395t() {
        byte[] bArr = this.f8337a;
        int i = this.f8338b;
        int i2 = i + 1;
        this.f8338b = i2;
        long j = ((long) bArr[i]) & 255;
        int i3 = i2 + 1;
        this.f8338b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i3 + 1;
        this.f8338b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        this.f8338b = i4 + 1;
        return ((((long) bArr[i4]) & 255) << 24) | j3;
    }

    /* renamed from: u */
    public int mo7396u() {
        int q = mo7392q();
        if (q >= 0) {
            return q;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Top bit not zero: ");
        sb.append(q);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: v */
    public int mo7397v() {
        byte[] bArr = this.f8337a;
        int i = this.f8338b;
        int i2 = i + 1;
        this.f8338b = i2;
        byte b = bArr[i] & 255;
        this.f8338b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | b;
    }

    /* renamed from: w */
    public long mo7398w() {
        byte[] bArr = this.f8337a;
        int i = this.f8338b;
        int i2 = i + 1;
        this.f8338b = i2;
        long j = (((long) bArr[i]) & 255) << 56;
        int i3 = i2 + 1;
        this.f8338b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 48);
        int i4 = i3 + 1;
        this.f8338b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 40);
        int i5 = i4 + 1;
        this.f8338b = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 32);
        int i6 = i5 + 1;
        this.f8338b = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 24);
        int i7 = i6 + 1;
        this.f8338b = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 16);
        int i8 = i7 + 1;
        this.f8338b = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 8);
        this.f8338b = i8 + 1;
        return (((long) bArr[i8]) & 255) | j7;
    }

    /* renamed from: x */
    public String mo7399x() {
        return mo7386k(0);
    }

    /* renamed from: y */
    public String mo7400y(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f8338b;
        int i3 = (i2 + i) - 1;
        String C = Util.m10241C(this.f8337a, i2, (i3 >= this.f8339c || this.f8337a[i3] != 0) ? i : i - 1);
        this.f8338b += i;
        return C;
    }

    /* renamed from: z */
    public short mo7401z() {
        byte[] bArr = this.f8337a;
        int i = this.f8338b;
        int i2 = i + 1;
        this.f8338b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.f8338b = i2 + 1;
        return (short) ((bArr[i2] & 255) | i3);
    }

    public ParsableByteArray(int i) {
        this.f8337a = new byte[i];
        this.f8339c = i;
    }

    public ParsableByteArray(byte[] bArr) {
        this.f8337a = bArr;
        this.f8339c = bArr.length;
    }

    public ParsableByteArray(byte[] bArr, int i) {
        this.f8337a = bArr;
        this.f8339c = i;
    }
}
