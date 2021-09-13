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

/* renamed from: c.a.a.a.f2.m0.f */
public final class Ac3Extractor implements Extractor {

    /* renamed from: a */
    public static final C0998o f6618a = C0971a.f6577b;

    /* renamed from: b */
    private final Ac3Reader f6619b = new Ac3Reader();

    /* renamed from: c */
    private final ParsableByteArray f6620c = new ParsableByteArray(2786);

    /* renamed from: d */
    private boolean f6621d;

    /* renamed from: d */
    static /* synthetic */ Extractor[] m7980d() {
        return new Extractor[]{new Ac3Extractor()};
    }

    /* renamed from: a */
    public void mo6188a() {
    }

    /* renamed from: b */
    public void mo6189b(ExtractorOutput lVar) {
        this.f6619b.mo6335f(lVar, new C0983d(0, 1));
        lVar.mo6217h();
        lVar.mo6216f(new C1003b(-9223372036854775807L));
    }

    /* renamed from: c */
    public void mo6190c(long j, long j2) {
        this.f6621d = false;
        this.f6619b.mo6331a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0037, code lost:
        r8.mo6199h();
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0040, code lost:
        if ((r4 - r3) < 8192) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0042, code lost:
        return false;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo6191e(p067c.p068a.p069a.p070a.p076f2.ExtractorInput r8) throws java.io.IOException {
        /*
            r7 = this;
            c.a.a.a.m2.a0 r0 = new c.a.a.a.m2.a0
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.mo7379d()
            r8.mo6204o(r4, r2, r1)
            r0.mo7374P(r2)
            int r4 = r0.mo7365G()
            r5 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r5) goto L_0x005f
            r8.mo6199h()
            r8.mo6205p(r3)
            r4 = r3
        L_0x0023:
            r1 = 0
        L_0x0024:
            byte[] r5 = r0.mo7379d()
            r6 = 6
            r8.mo6204o(r5, r2, r6)
            r0.mo7374P(r2)
            int r5 = r0.mo7368J()
            r6 = 2935(0xb77, float:4.113E-42)
            if (r5 == r6) goto L_0x0047
            r8.mo6199h()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.14794E-41)
            if (r1 < r5) goto L_0x0043
            return r2
        L_0x0043:
            r8.mo6205p(r4)
            goto L_0x0023
        L_0x0047:
            r5 = 1
            int r1 = r1 + r5
            r6 = 4
            if (r1 < r6) goto L_0x004d
            return r5
        L_0x004d:
            byte[] r5 = r0.mo7379d()
            int r5 = p067c.p068a.p069a.p070a.p072b2.Ac3Util.m6630f(r5)
            r6 = -1
            if (r5 != r6) goto L_0x0059
            return r2
        L_0x0059:
            int r5 = r5 + -6
            r8.mo6205p(r5)
            goto L_0x0024
        L_0x005f:
            r4 = 3
            r0.mo7375Q(r4)
            int r4 = r0.mo7361C()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r8.mo6205p(r4)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p076f2.p085m0.Ac3Extractor.mo6191e(c.a.a.a.f2.k):boolean");
    }

    /* renamed from: i */
    public int mo6192i(ExtractorInput kVar, PositionHolder xVar) throws IOException {
        int b = kVar.mo6195b(this.f6620c.mo7379d(), 0, 2786);
        if (b == -1) {
            return -1;
        }
        this.f6620c.mo7374P(0);
        this.f6620c.mo7373O(b);
        if (!this.f6621d) {
            this.f6619b.mo6334e(0, 4);
            this.f6621d = true;
        }
        this.f6619b.mo6332c(this.f6620c);
        return 0;
    }
}
