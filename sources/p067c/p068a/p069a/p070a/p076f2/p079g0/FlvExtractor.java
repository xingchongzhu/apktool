package p067c.p068a.p069a.p070a.p076f2.p079g0;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p067c.p068a.p069a.p070a.p076f2.C0998o;
import p067c.p068a.p069a.p070a.p076f2.Extractor;
import p067c.p068a.p069a.p070a.p076f2.ExtractorInput;
import p067c.p068a.p069a.p070a.p076f2.ExtractorOutput;
import p067c.p068a.p069a.p070a.p076f2.PositionHolder;
import p067c.p068a.p069a.p070a.p076f2.SeekMap.C1003b;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;

/* renamed from: c.a.a.a.f2.g0.c */
public final class FlvExtractor implements Extractor {

    /* renamed from: a */
    public static final C0998o f6089a = C0928a.f6084b;

    /* renamed from: b */
    private final ParsableByteArray f6090b = new ParsableByteArray(4);

    /* renamed from: c */
    private final ParsableByteArray f6091c = new ParsableByteArray(9);

    /* renamed from: d */
    private final ParsableByteArray f6092d = new ParsableByteArray(11);

    /* renamed from: e */
    private final ParsableByteArray f6093e = new ParsableByteArray();

    /* renamed from: f */
    private final ScriptTagPayloadReader f6094f = new ScriptTagPayloadReader();

    /* renamed from: g */
    private ExtractorOutput f6095g;

    /* renamed from: h */
    private int f6096h = 1;

    /* renamed from: i */
    private boolean f6097i;

    /* renamed from: j */
    private long f6098j;

    /* renamed from: k */
    private int f6099k;

    /* renamed from: l */
    private int f6100l;

    /* renamed from: m */
    private int f6101m;

    /* renamed from: n */
    private long f6102n;

    /* renamed from: o */
    private boolean f6103o;

    /* renamed from: p */
    private AudioTagPayloadReader f6104p;

    /* renamed from: q */
    private VideoTagPayloadReader f6105q;

    @RequiresNonNull({"extractorOutput"})
    /* renamed from: d */
    private void m7432d() {
        if (!this.f6103o) {
            this.f6095g.mo6216f(new C1003b(-9223372036854775807L));
            this.f6103o = true;
        }
    }

    /* renamed from: f */
    private long m7433f() {
        if (this.f6097i) {
            return this.f6098j + this.f6102n;
        }
        if (this.f6094f.mo6211d() == -9223372036854775807L) {
            return 0;
        }
        return this.f6102n;
    }

    /* renamed from: g */
    static /* synthetic */ Extractor[] m7434g() {
        return new Extractor[]{new FlvExtractor()};
    }

    /* renamed from: h */
    private ParsableByteArray m7435h(ExtractorInput kVar) throws IOException {
        if (this.f6101m > this.f6093e.mo7377b()) {
            ParsableByteArray a0Var = this.f6093e;
            a0Var.mo7372N(new byte[Math.max(a0Var.mo7377b() * 2, this.f6101m)], 0);
        } else {
            this.f6093e.mo7374P(0);
        }
        this.f6093e.mo7373O(this.f6101m);
        kVar.readFully(this.f6093e.mo7379d(), 0, this.f6101m);
        return this.f6093e;
    }

    @RequiresNonNull({"extractorOutput"})
    /* renamed from: j */
    private boolean m7436j(ExtractorInput kVar) throws IOException {
        boolean z = false;
        if (!kVar.mo6197d(this.f6091c.mo7379d(), 0, 9, true)) {
            return false;
        }
        this.f6091c.mo7374P(0);
        this.f6091c.mo7375Q(4);
        int D = this.f6091c.mo7362D();
        boolean z2 = (D & 4) != 0;
        if ((D & 1) != 0) {
            z = true;
        }
        if (z2 && this.f6104p == null) {
            this.f6104p = new AudioTagPayloadReader(this.f6095g.mo6218q(8, 1));
        }
        if (z && this.f6105q == null) {
            this.f6105q = new VideoTagPayloadReader(this.f6095g.mo6218q(9, 2));
        }
        this.f6095g.mo6217h();
        this.f6099k = (this.f6091c.mo7389n() - 9) + 4;
        this.f6096h = 2;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008b  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput"})
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m7437k(p067c.p068a.p069a.p070a.p076f2.ExtractorInput r10) throws java.io.IOException {
        /*
            r9 = this;
            long r0 = r9.m7433f()
            int r2 = r9.f6100l
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            r6 = 1
            r7 = 8
            if (r2 != r7) goto L_0x0024
            c.a.a.a.f2.g0.b r7 = r9.f6104p
            if (r7 == 0) goto L_0x0024
            r9.m7432d()
            c.a.a.a.f2.g0.b r2 = r9.f6104p
            c.a.a.a.m2.a0 r10 = r9.m7435h(r10)
            boolean r5 = r2.mo6214a(r10, r0)
        L_0x0022:
            r10 = 1
            goto L_0x0075
        L_0x0024:
            r7 = 9
            if (r2 != r7) goto L_0x003a
            c.a.a.a.f2.g0.f r7 = r9.f6105q
            if (r7 == 0) goto L_0x003a
            r9.m7432d()
            c.a.a.a.f2.g0.f r2 = r9.f6105q
            c.a.a.a.m2.a0 r10 = r9.m7435h(r10)
            boolean r5 = r2.mo6214a(r10, r0)
            goto L_0x0022
        L_0x003a:
            r7 = 18
            if (r2 != r7) goto L_0x006f
            boolean r2 = r9.f6103o
            if (r2 != 0) goto L_0x006f
            c.a.a.a.f2.g0.d r2 = r9.f6094f
            c.a.a.a.m2.a0 r10 = r9.m7435h(r10)
            boolean r5 = r2.mo6214a(r10, r0)
            c.a.a.a.f2.g0.d r10 = r9.f6094f
            long r0 = r10.mo6211d()
            int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r10 == 0) goto L_0x0022
            c.a.a.a.f2.l r10 = r9.f6095g
            c.a.a.a.f2.w r2 = new c.a.a.a.f2.w
            c.a.a.a.f2.g0.d r7 = r9.f6094f
            long[] r7 = r7.mo6212e()
            c.a.a.a.f2.g0.d r8 = r9.f6094f
            long[] r8 = r8.mo6213f()
            r2.<init>(r7, r8, r0)
            r10.mo6216f(r2)
            r9.f6103o = r6
            goto L_0x0022
        L_0x006f:
            int r0 = r9.f6101m
            r10.mo6200i(r0)
            r10 = 0
        L_0x0075:
            boolean r0 = r9.f6097i
            if (r0 != 0) goto L_0x008f
            if (r5 == 0) goto L_0x008f
            r9.f6097i = r6
            c.a.a.a.f2.g0.d r0 = r9.f6094f
            long r0 = r0.mo6211d()
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x008b
            long r0 = r9.f6102n
            long r0 = -r0
            goto L_0x008d
        L_0x008b:
            r0 = 0
        L_0x008d:
            r9.f6098j = r0
        L_0x008f:
            r0 = 4
            r9.f6099k = r0
            r0 = 2
            r9.f6096h = r0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p076f2.p079g0.FlvExtractor.m7437k(c.a.a.a.f2.k):boolean");
    }

    /* renamed from: l */
    private boolean m7438l(ExtractorInput kVar) throws IOException {
        if (!kVar.mo6197d(this.f6092d.mo7379d(), 0, 11, true)) {
            return false;
        }
        this.f6092d.mo7374P(0);
        this.f6100l = this.f6092d.mo7362D();
        this.f6101m = this.f6092d.mo7365G();
        this.f6102n = (long) this.f6092d.mo7365G();
        this.f6102n = (((long) (this.f6092d.mo7362D() << 24)) | this.f6102n) * 1000;
        this.f6092d.mo7375Q(3);
        this.f6096h = 4;
        return true;
    }

    /* renamed from: m */
    private void m7439m(ExtractorInput kVar) throws IOException {
        kVar.mo6200i(this.f6099k);
        this.f6099k = 0;
        this.f6096h = 3;
    }

    /* renamed from: a */
    public void mo6188a() {
    }

    /* renamed from: b */
    public void mo6189b(ExtractorOutput lVar) {
        this.f6095g = lVar;
    }

    /* renamed from: c */
    public void mo6190c(long j, long j2) {
        if (j == 0) {
            this.f6096h = 1;
            this.f6097i = false;
        } else {
            this.f6096h = 3;
        }
        this.f6099k = 0;
    }

    /* renamed from: e */
    public boolean mo6191e(ExtractorInput kVar) throws IOException {
        boolean z = false;
        kVar.mo6204o(this.f6090b.mo7379d(), 0, 3);
        this.f6090b.mo7374P(0);
        if (this.f6090b.mo7365G() != 4607062) {
            return false;
        }
        kVar.mo6204o(this.f6090b.mo7379d(), 0, 2);
        this.f6090b.mo7374P(0);
        if ((this.f6090b.mo7368J() & 250) != 0) {
            return false;
        }
        kVar.mo6204o(this.f6090b.mo7379d(), 0, 4);
        this.f6090b.mo7374P(0);
        int n = this.f6090b.mo7389n();
        kVar.mo6199h();
        kVar.mo6205p(n);
        kVar.mo6204o(this.f6090b.mo7379d(), 0, 4);
        this.f6090b.mo7374P(0);
        if (this.f6090b.mo7389n() == 0) {
            z = true;
        }
        return z;
    }

    /* renamed from: i */
    public int mo6192i(ExtractorInput kVar, PositionHolder xVar) throws IOException {
        Assertions.m10156h(this.f6095g);
        while (true) {
            int i = this.f6096h;
            if (i != 1) {
                if (i == 2) {
                    m7439m(kVar);
                } else if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException();
                    } else if (m7437k(kVar)) {
                        return 0;
                    }
                } else if (!m7438l(kVar)) {
                    return -1;
                }
            } else if (!m7436j(kVar)) {
                return -1;
            }
        }
    }
}
