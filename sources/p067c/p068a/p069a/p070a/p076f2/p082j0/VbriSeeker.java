package p067c.p068a.p069a.p070a.p076f2.p082j0;

import p067c.p068a.p069a.p070a.p072b2.MpegAudioUtil.C0815a;
import p067c.p068a.p069a.p070a.p076f2.SeekMap.C1002a;
import p067c.p068a.p069a.p070a.p076f2.SeekPoint;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.f2.j0.h */
final class VbriSeeker implements Seeker {

    /* renamed from: a */
    private final long[] f6319a;

    /* renamed from: b */
    private final long[] f6320b;

    /* renamed from: c */
    private final long f6321c;

    /* renamed from: d */
    private final long f6322d;

    private VbriSeeker(long[] jArr, long[] jArr2, long j, long j2) {
        this.f6319a = jArr;
        this.f6320b = jArr2;
        this.f6321c = j;
        this.f6322d = j2;
    }

    /* renamed from: a */
    public static VbriSeeker m7645a(long j, long j2, C0815a aVar, ParsableByteArray a0Var) {
        int i;
        long j3 = j;
        C0815a aVar2 = aVar;
        ParsableByteArray a0Var2 = a0Var;
        a0Var2.mo7375Q(10);
        int n = a0Var.mo7389n();
        if (n <= 0) {
            return null;
        }
        int i2 = aVar2.f5441d;
        long B0 = Util.m10240B0((long) n, 1000000 * ((long) (i2 >= 32000 ? 1152 : 576)), (long) i2);
        int J = a0Var.mo7368J();
        int J2 = a0Var.mo7368J();
        int J3 = a0Var.mo7368J();
        a0Var2.mo7375Q(2);
        long j4 = j2 + ((long) aVar2.f5440c);
        long[] jArr = new long[J];
        long[] jArr2 = new long[J];
        int i3 = 0;
        long j5 = j2;
        while (i3 < J) {
            int i4 = J2;
            long j6 = j4;
            jArr[i3] = (((long) i3) * B0) / ((long) J);
            long j7 = j6;
            jArr2[i3] = Math.max(j5, j7);
            if (J3 == 1) {
                i = a0Var.mo7362D();
            } else if (J3 == 2) {
                i = a0Var.mo7368J();
            } else if (J3 == 3) {
                i = a0Var.mo7365G();
            } else if (J3 != 4) {
                return null;
            } else {
                i = a0Var.mo7366H();
            }
            j5 += (long) (i * i4);
            i3++;
            j4 = j7;
            J2 = i4;
        }
        if (!(j3 == -1 || j3 == j5)) {
            StringBuilder sb = new StringBuilder();
            sb.append("VBRI data size mismatch: ");
            sb.append(j3);
            sb.append(", ");
            sb.append(j5);
            Log.m10386h("VbriSeeker", sb.toString());
        }
        VbriSeeker hVar = new VbriSeeker(jArr, jArr2, B0, j5);
        return hVar;
    }

    /* renamed from: d */
    public long mo6252d() {
        return this.f6322d;
    }

    /* renamed from: f */
    public boolean mo6167f() {
        return true;
    }

    /* renamed from: g */
    public long mo6253g(long j) {
        return this.f6319a[Util.m10291h(this.f6320b, j, true, true)];
    }

    /* renamed from: h */
    public C1002a mo6168h(long j) {
        int h = Util.m10291h(this.f6319a, j, true, true);
        SeekPoint zVar = new SeekPoint(this.f6319a[h], this.f6320b[h]);
        if (zVar.f7021b >= j || h == this.f6319a.length - 1) {
            return new C1002a(zVar);
        }
        int i = h + 1;
        return new C1002a(zVar, new SeekPoint(this.f6319a[i], this.f6320b[i]));
    }

    /* renamed from: j */
    public long mo6169j() {
        return this.f6321c;
    }
}
