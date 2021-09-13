package p067c.p068a.p069a.p070a.p076f2.p078f0;

import java.io.IOException;
import java.util.Objects;
import p067c.p068a.p069a.p070a.p076f2.BinarySearchSeeker;
import p067c.p068a.p069a.p070a.p076f2.BinarySearchSeeker.C0914e;
import p067c.p068a.p069a.p070a.p076f2.C0918c;
import p067c.p068a.p069a.p070a.p076f2.ExtractorInput;
import p067c.p068a.p069a.p070a.p076f2.FlacFrameReader;
import p067c.p068a.p069a.p070a.p076f2.FlacFrameReader.C0999a;
import p067c.p068a.p069a.p070a.p076f2.FlacStreamMetadata;

/* renamed from: c.a.a.a.f2.f0.c */
final class FlacBinarySearchSeeker extends BinarySearchSeeker {

    /* renamed from: c.a.a.a.f2.f0.c$b */
    /* compiled from: FlacBinarySearchSeeker */
    private static final class C0927b implements C0915f {

        /* renamed from: a */
        private final FlacStreamMetadata f6059a;

        /* renamed from: b */
        private final int f6060b;

        /* renamed from: c */
        private final C0999a f6061c;

        /* renamed from: c */
        private long m7390c(ExtractorInput kVar) throws IOException {
            while (kVar.mo6203n() < kVar.mo6194a() - 6 && !FlacFrameReader.m8277h(kVar, this.f6059a, this.f6060b, this.f6061c)) {
                kVar.mo6205p(1);
            }
            if (kVar.mo6203n() < kVar.mo6194a() - 6) {
                return this.f6061c.f6988a;
            }
            kVar.mo6205p((int) (kVar.mo6194a() - kVar.mo6203n()));
            return this.f6059a.f7001j;
        }

        /* renamed from: a */
        public /* synthetic */ void mo6172a() {
            C0918c.m7335a(this);
        }

        /* renamed from: b */
        public C0914e mo6173b(ExtractorInput kVar, long j) throws IOException {
            long q = kVar.mo6206q();
            long c = m7390c(kVar);
            long n = kVar.mo6203n();
            kVar.mo6205p(Math.max(6, this.f6059a.f6994c));
            long c2 = m7390c(kVar);
            long n2 = kVar.mo6203n();
            if (c <= j && c2 > j) {
                return C0914e.m7325e(n);
            }
            if (c2 <= j) {
                return C0914e.m7326f(c2, n2);
            }
            return C0914e.m7324d(c, q);
        }

        private C0927b(FlacStreamMetadata sVar, int i) {
            this.f6059a = sVar;
            this.f6060b = i;
            this.f6061c = new C0999a();
        }
    }

    public FlacBinarySearchSeeker(FlacStreamMetadata sVar, int i, long j, long j2) {
        FlacStreamMetadata sVar2 = sVar;
        Objects.requireNonNull(sVar);
        C0925b bVar = new C0925b(sVar2);
        C0927b bVar2 = new C0927b(sVar2, i);
        long g = sVar.mo6385g();
        long j3 = sVar2.f7001j;
        long e = sVar.mo6384e();
        int max = Math.max(6, sVar2.f6994c);
        super(bVar, bVar2, g, 0, j3, j, j2, e, max);
    }
}
