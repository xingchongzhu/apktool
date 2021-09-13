package p067c.p068a.p069a.p070a.p076f2.p085m0;

import java.io.IOException;
import p067c.p068a.p069a.p070a.p076f2.BinarySearchSeeker;
import p067c.p068a.p069a.p070a.p076f2.BinarySearchSeeker.C0911b;
import p067c.p068a.p069a.p070a.p076f2.BinarySearchSeeker.C0914e;
import p067c.p068a.p069a.p070a.p076f2.ExtractorInput;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.TimestampAdjuster;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.f2.m0.f0 */
final class TsBinarySearchSeeker extends BinarySearchSeeker {

    /* renamed from: c.a.a.a.f2.m0.f0$a */
    /* compiled from: TsBinarySearchSeeker */
    private static final class C0977a implements C0915f {

        /* renamed from: a */
        private final TimestampAdjuster f6622a;

        /* renamed from: b */
        private final ParsableByteArray f6623b = new ParsableByteArray();

        /* renamed from: c */
        private final int f6624c;

        /* renamed from: d */
        private final int f6625d;

        public C0977a(int i, TimestampAdjuster j0Var, int i2) {
            this.f6624c = i;
            this.f6622a = j0Var;
            this.f6625d = i2;
        }

        /* renamed from: c */
        private C0914e m7986c(ParsableByteArray a0Var, long j, long j2) {
            ParsableByteArray a0Var2 = a0Var;
            long j3 = j2;
            int f = a0Var.mo7381f();
            long j4 = -1;
            long j5 = -1;
            long j6 = -9223372036854775807L;
            while (a0Var.mo7376a() >= 188) {
                int a = TsUtil.m8071a(a0Var.mo7379d(), a0Var.mo7380e(), f);
                int i = a + 188;
                if (i > f) {
                    break;
                }
                long b = TsUtil.m8072b(a0Var2, a, this.f6624c);
                if (b != -9223372036854775807L) {
                    long b2 = this.f6622a.mo7447b(b);
                    if (b2 > j) {
                        if (j6 == -9223372036854775807L) {
                            return C0914e.m7324d(b2, j3);
                        }
                        return C0914e.m7325e(j3 + j5);
                    } else if (100000 + b2 > j) {
                        return C0914e.m7325e(j3 + ((long) a));
                    } else {
                        j5 = (long) a;
                        j6 = b2;
                    }
                }
                a0Var2.mo7374P(i);
                j4 = (long) i;
            }
            if (j6 != -9223372036854775807L) {
                return C0914e.m7326f(j6, j3 + j4);
            }
            return C0914e.f5989a;
        }

        /* renamed from: a */
        public void mo6172a() {
            this.f6623b.mo7371M(Util.f8403f);
        }

        /* renamed from: b */
        public C0914e mo6173b(ExtractorInput kVar, long j) throws IOException {
            long q = kVar.mo6206q();
            int min = (int) Math.min((long) this.f6625d, kVar.mo6194a() - q);
            this.f6623b.mo7370L(min);
            kVar.mo6204o(this.f6623b.mo7379d(), 0, min);
            return m7986c(this.f6623b, j, q);
        }
    }

    public TsBinarySearchSeeker(TimestampAdjuster j0Var, long j, long j2, int i, int i2) {
        long j3 = j;
        super(new C0911b(), new C0977a(i, j0Var, i2), j3, 0, j + 1, 0, j2, 188, 940);
    }
}
