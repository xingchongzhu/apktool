package p067c.p068a.p069a.p070a.p097j2;

import java.io.IOException;
import p067c.p068a.p069a.p070a.p076f2.C0998o;
import p067c.p068a.p069a.p070a.p076f2.Extractor;
import p067c.p068a.p069a.p070a.p076f2.ExtractorInput;
import p067c.p068a.p069a.p070a.p076f2.PositionHolder;
import p067c.p068a.p069a.p070a.p076f2.p082j0.Mp3Extractor;
import p067c.p068a.p069a.p070a.p111m2.Assertions;

/* renamed from: c.a.a.a.j2.m */
final class BundledExtractorsAdapter implements ProgressiveMediaExtractor {

    /* renamed from: a */
    private final C0998o f7566a;

    /* renamed from: b */
    private Extractor f7567b;

    /* renamed from: c */
    private ExtractorInput f7568c;

    public BundledExtractorsAdapter(C0998o oVar) {
        this.f7566a = oVar;
    }

    /* renamed from: a */
    public void mo6869a() {
        Extractor jVar = this.f7567b;
        if (jVar != null) {
            jVar.mo6188a();
            this.f7567b = null;
        }
        this.f7568c = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r0.mo6206q() != r11) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0062, code lost:
        if (r0.mo6206q() != r11) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0065, code lost:
        r1 = false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6870b(com.google.android.exoplayer2.upstream.DataReader r8, android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, long r11, long r13, p067c.p068a.p069a.p070a.p076f2.ExtractorOutput r15) throws java.io.IOException {
        /*
            r7 = this;
            c.a.a.a.f2.g r6 = new c.a.a.a.f2.g
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f7568c = r6
            c.a.a.a.f2.j r8 = r7.f7567b
            if (r8 == 0) goto L_0x0010
            return
        L_0x0010:
            c.a.a.a.f2.o r8 = r7.f7566a
            c.a.a.a.f2.j[] r8 = r8.mo6157b(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L_0x0020
            r8 = r8[r13]
            r7.f7567b = r8
            goto L_0x0075
        L_0x0020:
            int r10 = r8.length
            r0 = 0
        L_0x0022:
            if (r0 >= r10) goto L_0x0071
            r1 = r8[r0]
            boolean r2 = r1.mo6191e(r6)     // Catch:{ EOFException -> 0x0057, all -> 0x0042 }
            if (r2 == 0) goto L_0x0035
            r7.f7567b = r1     // Catch:{ EOFException -> 0x0057, all -> 0x0042 }
            p067c.p068a.p069a.p070a.p111m2.Assertions.m10154f(r14)
            r6.mo6199h()
            goto L_0x0071
        L_0x0035:
            c.a.a.a.f2.j r1 = r7.f7567b
            if (r1 != 0) goto L_0x0067
            long r1 = r6.mo6206q()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x0065
            goto L_0x0067
        L_0x0042:
            r8 = move-exception
            c.a.a.a.f2.j r9 = r7.f7567b
            if (r9 != 0) goto L_0x004f
            long r9 = r6.mo6206q()
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 != 0) goto L_0x0050
        L_0x004f:
            r13 = 1
        L_0x0050:
            p067c.p068a.p069a.p070a.p111m2.Assertions.m10154f(r13)
            r6.mo6199h()
            throw r8
        L_0x0057:
            c.a.a.a.f2.j r1 = r7.f7567b
            if (r1 != 0) goto L_0x0067
            long r1 = r6.mo6206q()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            r1 = 0
            goto L_0x0068
        L_0x0067:
            r1 = 1
        L_0x0068:
            p067c.p068a.p069a.p070a.p111m2.Assertions.m10154f(r1)
            r6.mo6199h()
            int r0 = r0 + 1
            goto L_0x0022
        L_0x0071:
            c.a.a.a.f2.j r10 = r7.f7567b
            if (r10 == 0) goto L_0x007b
        L_0x0075:
            c.a.a.a.f2.j r8 = r7.f7567b
            r8.mo6189b(r15)
            return
        L_0x007b:
            c.a.a.a.j2.r0 r10 = new c.a.a.a.j2.r0
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "None of the available extractors ("
            r11.append(r12)
            java.lang.String r8 = p067c.p068a.p069a.p070a.p111m2.Util.m10251H(r8)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            java.lang.Object r9 = p067c.p068a.p069a.p070a.p111m2.Assertions.m10153e(r9)
            android.net.Uri r9 = (android.net.Uri) r9
            r10.<init>(r8, r9)
            goto L_0x00a2
        L_0x00a1:
            throw r10
        L_0x00a2:
            goto L_0x00a1
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p097j2.BundledExtractorsAdapter.mo6870b(com.google.android.exoplayer2.upstream.j, android.net.Uri, java.util.Map, long, long, c.a.a.a.f2.l):void");
    }

    /* renamed from: c */
    public void mo6871c(long j, long j2) {
        ((Extractor) Assertions.m10153e(this.f7567b)).mo6190c(j, j2);
    }

    /* renamed from: d */
    public int mo6872d(PositionHolder xVar) throws IOException {
        return ((Extractor) Assertions.m10153e(this.f7567b)).mo6192i((ExtractorInput) Assertions.m10153e(this.f7568c), xVar);
    }

    /* renamed from: e */
    public long mo6873e() {
        ExtractorInput kVar = this.f7568c;
        if (kVar != null) {
            return kVar.mo6206q();
        }
        return -1;
    }

    /* renamed from: f */
    public void mo6874f() {
        Extractor jVar = this.f7567b;
        if (jVar instanceof Mp3Extractor) {
            ((Mp3Extractor) jVar).mo6257h();
        }
    }
}
