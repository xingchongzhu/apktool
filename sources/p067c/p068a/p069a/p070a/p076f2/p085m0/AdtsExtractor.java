package p067c.p068a.p069a.p070a.p076f2.p085m0;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p067c.p068a.p069a.p070a.p076f2.C0998o;
import p067c.p068a.p069a.p070a.p076f2.ConstantBitrateSeekMap;
import p067c.p068a.p069a.p070a.p076f2.Extractor;
import p067c.p068a.p069a.p070a.p076f2.ExtractorInput;
import p067c.p068a.p069a.p070a.p076f2.ExtractorOutput;
import p067c.p068a.p069a.p070a.p076f2.PositionHolder;
import p067c.p068a.p069a.p070a.p076f2.SeekMap;
import p067c.p068a.p069a.p070a.p076f2.SeekMap.C1003b;
import p067c.p068a.p069a.p070a.p076f2.p085m0.TsPayloadReader.C0983d;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.ParsableBitArray;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;

/* renamed from: c.a.a.a.f2.m0.j */
public final class AdtsExtractor implements Extractor {

    /* renamed from: a */
    public static final C0998o f6703a = C0974c.f6607b;

    /* renamed from: b */
    private final int f6704b;

    /* renamed from: c */
    private final AdtsReader f6705c;

    /* renamed from: d */
    private final ParsableByteArray f6706d;

    /* renamed from: e */
    private final ParsableByteArray f6707e;

    /* renamed from: f */
    private final ParsableBitArray f6708f;

    /* renamed from: g */
    private ExtractorOutput f6709g;

    /* renamed from: h */
    private long f6710h;

    /* renamed from: i */
    private long f6711i;

    /* renamed from: j */
    private int f6712j;

    /* renamed from: k */
    private boolean f6713k;

    /* renamed from: l */
    private boolean f6714l;

    /* renamed from: m */
    private boolean f6715m;

    public AdtsExtractor() {
        this(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0082  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8060d(p067c.p068a.p069a.p070a.p076f2.ExtractorInput r10) throws java.io.IOException {
        /*
            r9 = this;
            boolean r0 = r9.f6713k
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = -1
            r9.f6712j = r0
            r10.mo6199h()
            long r1 = r10.mo6206q()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0018
            r9.m8065k(r10)
        L_0x0018:
            r1 = 0
            r2 = 0
        L_0x001a:
            r5 = 1
            c.a.a.a.m2.a0 r6 = r9.f6707e     // Catch:{ EOFException -> 0x0076 }
            byte[] r6 = r6.mo7379d()     // Catch:{ EOFException -> 0x0076 }
            r7 = 2
            boolean r6 = r10.mo6202m(r6, r1, r7, r5)     // Catch:{ EOFException -> 0x0076 }
            if (r6 == 0) goto L_0x0076
            c.a.a.a.m2.a0 r6 = r9.f6707e     // Catch:{ EOFException -> 0x0076 }
            r6.mo7374P(r1)     // Catch:{ EOFException -> 0x0076 }
            c.a.a.a.m2.a0 r6 = r9.f6707e     // Catch:{ EOFException -> 0x0076 }
            int r6 = r6.mo7368J()     // Catch:{ EOFException -> 0x0076 }
            boolean r6 = p067c.p068a.p069a.p070a.p076f2.p085m0.AdtsReader.m8080m(r6)     // Catch:{ EOFException -> 0x0076 }
            if (r6 != 0) goto L_0x003a
            goto L_0x0077
        L_0x003a:
            c.a.a.a.m2.a0 r6 = r9.f6707e     // Catch:{ EOFException -> 0x0076 }
            byte[] r6 = r6.mo7379d()     // Catch:{ EOFException -> 0x0076 }
            r7 = 4
            boolean r6 = r10.mo6202m(r6, r1, r7, r5)     // Catch:{ EOFException -> 0x0076 }
            if (r6 != 0) goto L_0x0048
            goto L_0x0076
        L_0x0048:
            c.a.a.a.m2.z r6 = r9.f6708f     // Catch:{ EOFException -> 0x0076 }
            r7 = 14
            r6.mo7503p(r7)     // Catch:{ EOFException -> 0x0076 }
            c.a.a.a.m2.z r6 = r9.f6708f     // Catch:{ EOFException -> 0x0076 }
            r7 = 13
            int r6 = r6.mo7495h(r7)     // Catch:{ EOFException -> 0x0076 }
            r7 = 6
            if (r6 <= r7) goto L_0x006c
            long r7 = (long) r6     // Catch:{ EOFException -> 0x0076 }
            long r3 = r3 + r7
            int r2 = r2 + 1
            r7 = 1000(0x3e8, float:1.401E-42)
            if (r2 != r7) goto L_0x0063
            goto L_0x006b
        L_0x0063:
            int r6 = r6 + -6
            boolean r6 = r10.mo6201j(r6, r5)     // Catch:{ EOFException -> 0x0076 }
            if (r6 != 0) goto L_0x001a
        L_0x006b:
            goto L_0x0076
        L_0x006c:
            r9.f6713k = r5     // Catch:{ EOFException -> 0x0076 }
            c.a.a.a.g1 r1 = new c.a.a.a.g1     // Catch:{ EOFException -> 0x0076 }
            java.lang.String r6 = "Malformed ADTS stream"
            r1.<init>(r6)     // Catch:{ EOFException -> 0x0076 }
            throw r1     // Catch:{ EOFException -> 0x0076 }
        L_0x0076:
            r1 = r2
        L_0x0077:
            r10.mo6199h()
            if (r1 <= 0) goto L_0x0082
            long r0 = (long) r1
            long r3 = r3 / r0
            int r10 = (int) r3
            r9.f6712j = r10
            goto L_0x0084
        L_0x0082:
            r9.f6712j = r0
        L_0x0084:
            r9.f6713k = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p076f2.p085m0.AdtsExtractor.m8060d(c.a.a.a.f2.k):void");
    }

    /* renamed from: f */
    private static int m8061f(int i, long j) {
        return (int) ((((long) (i * 8)) * 1000000) / j);
    }

    /* renamed from: g */
    private SeekMap m8062g(long j) {
        long j2 = j;
        ConstantBitrateSeekMap fVar = new ConstantBitrateSeekMap(j2, this.f6711i, m8061f(this.f6712j, this.f6705c.mo6345k()), this.f6712j);
        return fVar;
    }

    /* renamed from: h */
    static /* synthetic */ Extractor[] m8063h() {
        return new Extractor[]{new AdtsExtractor()};
    }

    @RequiresNonNull({"extractorOutput"})
    /* renamed from: j */
    private void m8064j(long j, boolean z, boolean z2) {
        if (!this.f6715m) {
            boolean z3 = z && this.f6712j > 0;
            if (!z3 || this.f6705c.mo6345k() != -9223372036854775807L || z2) {
                if (!z3 || this.f6705c.mo6345k() == -9223372036854775807L) {
                    this.f6709g.mo6216f(new C1003b(-9223372036854775807L));
                } else {
                    this.f6709g.mo6216f(m8062g(j));
                }
                this.f6715m = true;
            }
        }
    }

    /* renamed from: k */
    private int m8065k(ExtractorInput kVar) throws IOException {
        int i = 0;
        while (true) {
            kVar.mo6204o(this.f6707e.mo7379d(), 0, 10);
            this.f6707e.mo7374P(0);
            if (this.f6707e.mo7365G() != 4801587) {
                break;
            }
            this.f6707e.mo7375Q(3);
            int C = this.f6707e.mo7361C();
            i += C + 10;
            kVar.mo6205p(C);
        }
        kVar.mo6199h();
        kVar.mo6205p(i);
        if (this.f6711i == -1) {
            this.f6711i = (long) i;
        }
        return i;
    }

    /* renamed from: a */
    public void mo6188a() {
    }

    /* renamed from: b */
    public void mo6189b(ExtractorOutput lVar) {
        this.f6709g = lVar;
        this.f6705c.mo6335f(lVar, new C0983d(0, 1));
        lVar.mo6217h();
    }

    /* renamed from: c */
    public void mo6190c(long j, long j2) {
        this.f6714l = false;
        this.f6705c.mo6331a();
        this.f6710h = j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0023, code lost:
        r9.mo6199h();
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002c, code lost:
        if ((r3 - r0) < 8192) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002e, code lost:
        return false;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo6191e(p067c.p068a.p069a.p070a.p076f2.ExtractorInput r9) throws java.io.IOException {
        /*
            r8 = this;
            int r0 = r8.m8065k(r9)
            r1 = 0
            r3 = r0
        L_0x0006:
            r2 = 0
            r4 = 0
        L_0x0008:
            c.a.a.a.m2.a0 r5 = r8.f6707e
            byte[] r5 = r5.mo7379d()
            r6 = 2
            r9.mo6204o(r5, r1, r6)
            c.a.a.a.m2.a0 r5 = r8.f6707e
            r5.mo7374P(r1)
            c.a.a.a.m2.a0 r5 = r8.f6707e
            int r5 = r5.mo7368J()
            boolean r5 = p067c.p068a.p069a.p070a.p076f2.p085m0.AdtsReader.m8080m(r5)
            if (r5 != 0) goto L_0x0033
            r9.mo6199h()
            int r3 = r3 + 1
            int r2 = r3 - r0
            r4 = 8192(0x2000, float:1.14794E-41)
            if (r2 < r4) goto L_0x002f
            return r1
        L_0x002f:
            r9.mo6205p(r3)
            goto L_0x0006
        L_0x0033:
            r5 = 1
            int r2 = r2 + r5
            r6 = 4
            if (r2 < r6) goto L_0x003d
            r7 = 188(0xbc, float:2.63E-43)
            if (r4 <= r7) goto L_0x003d
            return r5
        L_0x003d:
            c.a.a.a.m2.a0 r5 = r8.f6707e
            byte[] r5 = r5.mo7379d()
            r9.mo6204o(r5, r1, r6)
            c.a.a.a.m2.z r5 = r8.f6708f
            r6 = 14
            r5.mo7503p(r6)
            c.a.a.a.m2.z r5 = r8.f6708f
            r6 = 13
            int r5 = r5.mo7495h(r6)
            r6 = 6
            if (r5 > r6) goto L_0x0059
            return r1
        L_0x0059:
            int r6 = r5 + -6
            r9.mo6205p(r6)
            int r4 = r4 + r5
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p076f2.p085m0.AdtsExtractor.mo6191e(c.a.a.a.f2.k):boolean");
    }

    /* renamed from: i */
    public int mo6192i(ExtractorInput kVar, PositionHolder xVar) throws IOException {
        Assertions.m10156h(this.f6709g);
        long a = kVar.mo6194a();
        boolean z = ((this.f6704b & 1) == 0 || a == -1) ? false : true;
        if (z) {
            m8060d(kVar);
        }
        int b = kVar.mo6195b(this.f6706d.mo7379d(), 0, 2048);
        boolean z2 = b == -1;
        m8064j(a, z, z2);
        if (z2) {
            return -1;
        }
        this.f6706d.mo7374P(0);
        this.f6706d.mo7373O(b);
        if (!this.f6714l) {
            this.f6705c.mo6334e(this.f6710h, 4);
            this.f6714l = true;
        }
        this.f6705c.mo6332c(this.f6706d);
        return 0;
    }

    public AdtsExtractor(int i) {
        this.f6704b = i;
        this.f6705c = new AdtsReader(true);
        this.f6706d = new ParsableByteArray(2048);
        this.f6712j = -1;
        this.f6711i = -1;
        ParsableByteArray a0Var = new ParsableByteArray(10);
        this.f6707e = a0Var;
        this.f6708f = new ParsableBitArray(a0Var.mo7379d());
    }
}
