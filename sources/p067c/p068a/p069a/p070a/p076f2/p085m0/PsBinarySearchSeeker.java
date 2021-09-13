package p067c.p068a.p069a.p070a.p076f2.p085m0;

import com.umeng.analytics.pro.TType;
import java.io.IOException;
import p067c.p068a.p069a.p070a.p076f2.BinarySearchSeeker;
import p067c.p068a.p069a.p070a.p076f2.BinarySearchSeeker.C0911b;
import p067c.p068a.p069a.p070a.p076f2.BinarySearchSeeker.C0914e;
import p067c.p068a.p069a.p070a.p076f2.ExtractorInput;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.TimestampAdjuster;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.f2.m0.z */
final class PsBinarySearchSeeker extends BinarySearchSeeker {

    /* renamed from: c.a.a.a.f2.m0.z$b */
    /* compiled from: PsBinarySearchSeeker */
    private static final class C0992b implements C0915f {

        /* renamed from: a */
        private final TimestampAdjuster f6942a;

        /* renamed from: b */
        private final ParsableByteArray f6943b;

        /* renamed from: c */
        private C0914e m8231c(ParsableByteArray a0Var, long j, long j2) {
            int i = -1;
            long j3 = -9223372036854775807L;
            int i2 = -1;
            while (a0Var.mo7376a() >= 4) {
                if (PsBinarySearchSeeker.m8230k(a0Var.mo7379d(), a0Var.mo7380e()) != 442) {
                    a0Var.mo7375Q(1);
                } else {
                    a0Var.mo7375Q(4);
                    long l = PsDurationReader.m7948l(a0Var);
                    if (l != -9223372036854775807L) {
                        long b = this.f6942a.mo7447b(l);
                        if (b > j) {
                            if (j3 == -9223372036854775807L) {
                                return C0914e.m7324d(b, j2);
                            }
                            return C0914e.m7325e(j2 + ((long) i2));
                        } else if (100000 + b > j) {
                            return C0914e.m7325e(j2 + ((long) a0Var.mo7380e()));
                        } else {
                            i2 = a0Var.mo7380e();
                            j3 = b;
                        }
                    }
                    m8232d(a0Var);
                    i = a0Var.mo7380e();
                }
            }
            if (j3 != -9223372036854775807L) {
                return C0914e.m7326f(j3, j2 + ((long) i));
            }
            return C0914e.f5989a;
        }

        /* renamed from: d */
        private static void m8232d(ParsableByteArray a0Var) {
            int f = a0Var.mo7381f();
            if (a0Var.mo7376a() < 10) {
                a0Var.mo7374P(f);
                return;
            }
            a0Var.mo7375Q(9);
            int D = a0Var.mo7362D() & 7;
            if (a0Var.mo7376a() < D) {
                a0Var.mo7374P(f);
                return;
            }
            a0Var.mo7375Q(D);
            if (a0Var.mo7376a() < 4) {
                a0Var.mo7374P(f);
                return;
            }
            if (PsBinarySearchSeeker.m8230k(a0Var.mo7379d(), a0Var.mo7380e()) == 443) {
                a0Var.mo7375Q(4);
                int J = a0Var.mo7368J();
                if (a0Var.mo7376a() < J) {
                    a0Var.mo7374P(f);
                    return;
                }
                a0Var.mo7375Q(J);
            }
            while (a0Var.mo7376a() >= 4) {
                int j = PsBinarySearchSeeker.m8230k(a0Var.mo7379d(), a0Var.mo7380e());
                if (j == 442 || j == 441 || (j >>> 8) != 1) {
                    break;
                }
                a0Var.mo7375Q(4);
                if (a0Var.mo7376a() < 2) {
                    a0Var.mo7374P(f);
                    return;
                } else {
                    a0Var.mo7374P(Math.min(a0Var.mo7381f(), a0Var.mo7380e() + a0Var.mo7368J()));
                }
            }
        }

        /* renamed from: a */
        public void mo6172a() {
            this.f6943b.mo7371M(Util.f8403f);
        }

        /* renamed from: b */
        public C0914e mo6173b(ExtractorInput kVar, long j) throws IOException {
            long q = kVar.mo6206q();
            int min = (int) Math.min(20000, kVar.mo6194a() - q);
            this.f6943b.mo7370L(min);
            kVar.mo6204o(this.f6943b.mo7379d(), 0, min);
            return m8231c(this.f6943b, j, q);
        }

        private C0992b(TimestampAdjuster j0Var) {
            this.f6942a = j0Var;
            this.f6943b = new ParsableByteArray();
        }
    }

    public PsBinarySearchSeeker(TimestampAdjuster j0Var, long j, long j2) {
        super(new C0911b(), new C0992b(j0Var), j, 0, j + 1, 0, j2, 188, 1000);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static int m8230k(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << TType.f16865n) | ((bArr[i + 2] & 255) << 8);
    }
}
