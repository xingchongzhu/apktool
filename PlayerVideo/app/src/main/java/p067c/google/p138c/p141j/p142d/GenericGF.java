package p067c.google.p138c.p141j.p142d;

import com.crashsdk.export.LogType;

/* renamed from: c.a.c.j.d.a */
public final class GenericGF {

    /* renamed from: a */
    public static final GenericGF f10020a = new GenericGF(4201, 4096, 1);

    /* renamed from: b */
    public static final GenericGF f10021b = new GenericGF(1033, 1024, 1);

    /* renamed from: c */
    public static final GenericGF f10022c;

    /* renamed from: d */
    public static final GenericGF f10023d = new GenericGF(19, 16, 1);

    /* renamed from: e */
    public static final GenericGF f10024e = new GenericGF(285, LogType.UNEXP, 0);

    /* renamed from: f */
    public static final GenericGF f10025f;

    /* renamed from: g */
    public static final GenericGF f10026g;

    /* renamed from: h */
    public static final GenericGF f10027h;

    /* renamed from: i */
    private final int[] f10028i;

    /* renamed from: j */
    private final int[] f10029j;

    /* renamed from: k */
    private final GenericGFPoly f10030k;

    /* renamed from: l */
    private final GenericGFPoly f10031l;

    /* renamed from: m */
    private final int f10032m;

    /* renamed from: n */
    private final int f10033n;

    /* renamed from: o */
    private final int f10034o;

    static {
        GenericGF aVar = new GenericGF(67, 64, 1);
        f10022c = aVar;
        GenericGF aVar2 = new GenericGF(301, LogType.UNEXP, 1);
        f10025f = aVar2;
        f10026g = aVar2;
        f10027h = aVar;
    }

    public GenericGF(int i, int i2, int i3) {
        this.f10033n = i;
        this.f10032m = i2;
        this.f10034o = i3;
        this.f10028i = new int[i2];
        this.f10029j = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f10028i[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.f10029j[this.f10028i[i6]] = i6;
        }
        this.f10030k = new GenericGFPoly(this, new int[]{0});
        this.f10031l = new GenericGFPoly(this, new int[]{1});
    }

    /* renamed from: a */
    static int m12117a(int i, int i2) {
        return i ^ i2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public GenericGFPoly mo8579b(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f10030k;
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new GenericGFPoly(this, iArr);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo8580c(int i) {
        return this.f10028i[i];
    }

    /* renamed from: d */
    public int mo8581d() {
        return this.f10034o;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public GenericGFPoly mo8582e() {
        return this.f10030k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int mo8583f(int i) {
        if (i != 0) {
            return this.f10028i[(this.f10032m - this.f10029j[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public int mo8584g(int i) {
        if (i != 0) {
            return this.f10029j[i];
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public int mo8585h(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f10028i;
        int[] iArr2 = this.f10029j;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f10032m - 1)];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GF(0x");
        sb.append(Integer.toHexString(this.f10033n));
        sb.append(',');
        sb.append(this.f10032m);
        sb.append(')');
        return sb.toString();
    }
}
