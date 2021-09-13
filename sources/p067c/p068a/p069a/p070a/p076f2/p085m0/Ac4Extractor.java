package p067c.p068a.p069a.p070a.p076f2.p085m0;

import java.io.IOException;
import p067c.p068a.p069a.p070a.p076f2.C0998o;
import p067c.p068a.p069a.p070a.p076f2.Extractor;
import p067c.p068a.p069a.p070a.p076f2.ExtractorInput;
import p067c.p068a.p069a.p070a.p076f2.ExtractorOutput;
import p067c.p068a.p069a.p070a.p076f2.PositionHolder;
import p067c.p068a.p069a.p070a.p076f2.SeekMap.C1003b;
import p067c.p068a.p069a.p070a.p076f2.p085m0.TsPayloadReader.C0983d;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;

/* renamed from: c.a.a.a.f2.m0.h */
public final class Ac4Extractor implements Extractor {

    /* renamed from: a */
    public static final C0998o f6647a = C0972b.f6586b;

    /* renamed from: b */
    private final Ac4Reader f6648b = new Ac4Reader();

    /* renamed from: c */
    private final ParsableByteArray f6649c = new ParsableByteArray(16384);

    /* renamed from: d */
    private boolean f6650d;

    /* renamed from: d */
    static /* synthetic */ Extractor[] m8006d() {
        return new Extractor[]{new Ac4Extractor()};
    }

    /* renamed from: a */
    public void mo6188a() {
    }

    /* renamed from: b */
    public void mo6189b(ExtractorOutput lVar) {
        this.f6648b.mo6335f(lVar, new C0983d(0, 1));
        lVar.mo6217h();
        lVar.mo6216f(new C1003b(-9223372036854775807L));
    }

    /* renamed from: c */
    public void mo6190c(long j, long j2) {
        this.f6650d = false;
        this.f6648b.mo6331a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0046, code lost:
        if ((r4 - r3) < 8192) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0048, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        r9.mo6199h();
        r4 = r4 + 1;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo6191e(p067c.p068a.p069a.p070a.p076f2.ExtractorInput r9) throws java.io.IOException {
        /*
            r8 = this;
            c.a.a.a.m2.a0 r0 = new c.a.a.a.m2.a0
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.mo7379d()
            r9.mo6204o(r4, r2, r1)
            r0.mo7374P(r2)
            int r4 = r0.mo7365G()
            r5 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r5) goto L_0x0065
            r9.mo6199h()
            r9.mo6205p(r3)
            r4 = r3
        L_0x0023:
            r1 = 0
        L_0x0024:
            byte[] r5 = r0.mo7379d()
            r6 = 7
            r9.mo6204o(r5, r2, r6)
            r0.mo7374P(r2)
            int r5 = r0.mo7368J()
            r6 = 44096(0xac40, float:6.1792E-41)
            if (r5 == r6) goto L_0x004d
            r6 = 44097(0xac41, float:6.1793E-41)
            if (r5 == r6) goto L_0x004d
            r9.mo6199h()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.14794E-41)
            if (r1 < r5) goto L_0x0049
            return r2
        L_0x0049:
            r9.mo6205p(r4)
            goto L_0x0023
        L_0x004d:
            r6 = 1
            int r1 = r1 + r6
            r7 = 4
            if (r1 < r7) goto L_0x0053
            return r6
        L_0x0053:
            byte[] r6 = r0.mo7379d()
            int r5 = p067c.p068a.p069a.p070a.p072b2.Ac4Util.m6638e(r6, r5)
            r6 = -1
            if (r5 != r6) goto L_0x005f
            return r2
        L_0x005f:
            int r5 = r5 + -7
            r9.mo6205p(r5)
            goto L_0x0024
        L_0x0065:
            r4 = 3
            r0.mo7375Q(r4)
            int r4 = r0.mo7361C()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r9.mo6205p(r4)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p076f2.p085m0.Ac4Extractor.mo6191e(c.a.a.a.f2.k):boolean");
    }

    /* renamed from: i */
    public int mo6192i(ExtractorInput kVar, PositionHolder xVar) throws IOException {
        int b = kVar.mo6195b(this.f6649c.mo7379d(), 0, 16384);
        if (b == -1) {
            return -1;
        }
        this.f6649c.mo7374P(0);
        this.f6649c.mo7373O(b);
        if (!this.f6650d) {
            this.f6648b.mo6334e(0, 4);
            this.f6650d = true;
        }
        this.f6648b.mo6332c(this.f6649c);
        return 0;
    }
}
