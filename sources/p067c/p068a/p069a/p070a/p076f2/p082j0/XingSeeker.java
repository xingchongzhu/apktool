package p067c.p068a.p069a.p070a.p076f2.p082j0;

import p067c.p068a.p069a.p070a.p072b2.MpegAudioUtil.C0815a;
import p067c.p068a.p069a.p070a.p076f2.SeekMap.C1002a;
import p067c.p068a.p069a.p070a.p076f2.SeekPoint;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.f2.j0.i */
final class XingSeeker implements Seeker {

    /* renamed from: a */
    private final long f6323a;

    /* renamed from: b */
    private final int f6324b;

    /* renamed from: c */
    private final long f6325c;

    /* renamed from: d */
    private final long f6326d;

    /* renamed from: e */
    private final long f6327e;

    /* renamed from: f */
    private final long[] f6328f;

    private XingSeeker(long j, int i, long j2) {
        this(j, i, j2, -1, null);
    }

    /* renamed from: a */
    public static XingSeeker m7651a(long j, long j2, C0815a aVar, ParsableByteArray a0Var) {
        long j3 = j;
        C0815a aVar2 = aVar;
        int i = aVar2.f5444g;
        int i2 = aVar2.f5441d;
        int n = a0Var.mo7389n();
        if ((n & 1) == 1) {
            int H = a0Var.mo7366H();
            if (H != 0) {
                long B0 = Util.m10240B0((long) H, ((long) i) * 1000000, (long) i2);
                if ((n & 6) != 6) {
                    XingSeeker iVar = new XingSeeker(j2, aVar2.f5440c, B0);
                    return iVar;
                }
                long F = a0Var.mo7364F();
                long[] jArr = new long[100];
                for (int i3 = 0; i3 < 100; i3++) {
                    jArr[i3] = (long) a0Var.mo7362D();
                }
                if (j3 != -1) {
                    long j4 = j2 + F;
                    if (j3 != j4) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("XING data size mismatch: ");
                        sb.append(j3);
                        sb.append(", ");
                        sb.append(j4);
                        Log.m10386h("XingSeeker", sb.toString());
                    }
                }
                XingSeeker iVar2 = new XingSeeker(j2, aVar2.f5440c, B0, F, jArr);
                return iVar2;
            }
        }
        return null;
    }

    /* renamed from: b */
    private long m7652b(int i) {
        return (this.f6325c * ((long) i)) / 100;
    }

    /* renamed from: d */
    public long mo6252d() {
        return this.f6327e;
    }

    /* renamed from: f */
    public boolean mo6167f() {
        return this.f6328f != null;
    }

    /* renamed from: g */
    public long mo6253g(long j) {
        long j2;
        double d;
        long j3 = j - this.f6323a;
        if (!mo6167f() || j3 <= ((long) this.f6324b)) {
            return 0;
        }
        long[] jArr = (long[]) Assertions.m10156h(this.f6328f);
        double d2 = (double) j3;
        Double.isNaN(d2);
        double d3 = d2 * 256.0d;
        double d4 = (double) this.f6326d;
        Double.isNaN(d4);
        double d5 = d3 / d4;
        int h = Util.m10291h(jArr, (long) d5, true, true);
        long b = m7652b(h);
        long j4 = jArr[h];
        int i = h + 1;
        long b2 = m7652b(i);
        if (h == 99) {
            j2 = 256;
        } else {
            j2 = jArr[i];
        }
        if (j4 == j2) {
            d = 0.0d;
        } else {
            double d6 = (double) j4;
            Double.isNaN(d6);
            double d7 = d5 - d6;
            double d8 = (double) (j2 - j4);
            Double.isNaN(d8);
            d = d7 / d8;
        }
        double d9 = (double) (b2 - b);
        Double.isNaN(d9);
        return b + Math.round(d * d9);
    }

    /* renamed from: h */
    public C1002a mo6168h(long j) {
        double d;
        if (!mo6167f()) {
            return new C1002a(new SeekPoint(0, this.f6323a + ((long) this.f6324b)));
        }
        long q = Util.m10309q(j, 0, this.f6325c);
        double d2 = (double) q;
        Double.isNaN(d2);
        double d3 = d2 * 100.0d;
        double d4 = (double) this.f6325c;
        Double.isNaN(d4);
        double d5 = d3 / d4;
        double d6 = 0.0d;
        if (d5 > 0.0d) {
            if (d5 >= 100.0d) {
                d6 = 256.0d;
            } else {
                int i = (int) d5;
                long[] jArr = (long[]) Assertions.m10156h(this.f6328f);
                double d7 = (double) jArr[i];
                if (i == 99) {
                    d = 256.0d;
                } else {
                    d = (double) jArr[i + 1];
                }
                double d8 = (double) i;
                Double.isNaN(d8);
                double d9 = d5 - d8;
                Double.isNaN(d7);
                double d10 = d9 * (d - d7);
                Double.isNaN(d7);
                d6 = d7 + d10;
            }
        }
        double d11 = d6 / 256.0d;
        double d12 = (double) this.f6326d;
        Double.isNaN(d12);
        return new C1002a(new SeekPoint(q, this.f6323a + Util.m10309q(Math.round(d11 * d12), (long) this.f6324b, this.f6326d - 1)));
    }

    /* renamed from: j */
    public long mo6169j() {
        return this.f6325c;
    }

    private XingSeeker(long j, int i, long j2, long j3, long[] jArr) {
        this.f6323a = j;
        this.f6324b = i;
        this.f6325c = j2;
        this.f6328f = jArr;
        this.f6326d = j3;
        long j4 = -1;
        if (j3 != -1) {
            j4 = j + j3;
        }
        this.f6327e = j4;
    }
}
