package p067c.p068a.p069a.p070a.p076f2.p080h0;

import java.io.IOException;
import p067c.p068a.p069a.p070a.Format.C1245b;
import p067c.p068a.p069a.p070a.p076f2.Extractor;
import p067c.p068a.p069a.p070a.p076f2.ExtractorInput;
import p067c.p068a.p069a.p070a.p076f2.ExtractorOutput;
import p067c.p068a.p069a.p070a.p076f2.PositionHolder;
import p067c.p068a.p069a.p070a.p076f2.SeekMap.C1003b;
import p067c.p068a.p069a.p070a.p076f2.p083k0.Mp4Extractor;
import p067c.p068a.p069a.p070a.p088h2.Metadata;
import p067c.p068a.p069a.p070a.p088h2.Metadata.C1034b;
import p067c.p068a.p069a.p070a.p088h2.p094n.MotionPhotoMetadata;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;

/* renamed from: c.a.a.a.f2.h0.a */
public final class JpegExtractor implements Extractor {

    /* renamed from: a */
    private final ParsableByteArray f6129a = new ParsableByteArray(6);

    /* renamed from: b */
    private ExtractorOutput f6130b;

    /* renamed from: c */
    private int f6131c;

    /* renamed from: d */
    private int f6132d;

    /* renamed from: e */
    private int f6133e;

    /* renamed from: f */
    private long f6134f = -1;

    /* renamed from: g */
    private MotionPhotoMetadata f6135g;

    /* renamed from: h */
    private ExtractorInput f6136h;

    /* renamed from: i */
    private StartOffsetExtractorInput f6137i;

    /* renamed from: j */
    private Mp4Extractor f6138j;

    /* renamed from: d */
    private void m7467d(ExtractorInput kVar) throws IOException {
        this.f6129a.mo7370L(2);
        kVar.mo6204o(this.f6129a.mo7379d(), 0, 2);
        kVar.mo6205p(this.f6129a.mo7368J() - 2);
    }

    /* renamed from: f */
    private void m7468f() {
        m7470h(new C1034b[0]);
        ((ExtractorOutput) Assertions.m10153e(this.f6130b)).mo6217h();
        this.f6130b.mo6216f(new C1003b(-9223372036854775807L));
        this.f6131c = 6;
    }

    /* renamed from: g */
    private static MotionPhotoMetadata m7469g(String str, long j) throws IOException {
        if (j == -1) {
            return null;
        }
        MotionPhotoDescription a = XmpMotionPhotoDescriptionParser.m7493a(str);
        if (a == null) {
            return null;
        }
        return a.mo6215a(j);
    }

    /* renamed from: h */
    private void m7470h(C1034b... bVarArr) {
        ((ExtractorOutput) Assertions.m10153e(this.f6130b)).mo6218q(1024, 4).mo6177d(new C1245b().mo7698X(new Metadata(bVarArr)).mo7679E());
    }

    /* renamed from: j */
    private int m7471j(ExtractorInput kVar) throws IOException {
        this.f6129a.mo7370L(2);
        kVar.mo6204o(this.f6129a.mo7379d(), 0, 2);
        return this.f6129a.mo7368J();
    }

    /* renamed from: k */
    private void m7472k(ExtractorInput kVar) throws IOException {
        this.f6129a.mo7370L(2);
        kVar.readFully(this.f6129a.mo7379d(), 0, 2);
        int J = this.f6129a.mo7368J();
        this.f6132d = J;
        if (J == 65498) {
            if (this.f6134f != -1) {
                this.f6131c = 4;
            } else {
                m7468f();
            }
        } else if ((J < 65488 || J > 65497) && J != 65281) {
            this.f6131c = 1;
        }
    }

    /* renamed from: l */
    private void m7473l(ExtractorInput kVar) throws IOException {
        if (this.f6132d == 65505) {
            ParsableByteArray a0Var = new ParsableByteArray(this.f6133e);
            kVar.readFully(a0Var.mo7379d(), 0, this.f6133e);
            if (this.f6135g == null) {
                if ("http://ns.adobe.com/xap/1.0/".equals(a0Var.mo7399x())) {
                    String x = a0Var.mo7399x();
                    if (x != null) {
                        MotionPhotoMetadata g = m7469g(x, kVar.mo6194a());
                        this.f6135g = g;
                        if (g != null) {
                            this.f6134f = g.f7322d;
                        }
                    }
                }
            }
        } else {
            kVar.mo6200i(this.f6133e);
        }
        this.f6131c = 0;
    }

    /* renamed from: m */
    private void m7474m(ExtractorInput kVar) throws IOException {
        this.f6129a.mo7370L(2);
        kVar.readFully(this.f6129a.mo7379d(), 0, 2);
        this.f6133e = this.f6129a.mo7368J() - 2;
        this.f6131c = 2;
    }

    /* renamed from: n */
    private void m7475n(ExtractorInput kVar) throws IOException {
        if (!kVar.mo6202m(this.f6129a.mo7379d(), 0, 1, true)) {
            m7468f();
            return;
        }
        kVar.mo6199h();
        if (this.f6138j == null) {
            this.f6138j = new Mp4Extractor();
        }
        StartOffsetExtractorInput cVar = new StartOffsetExtractorInput(kVar, this.f6134f);
        this.f6137i = cVar;
        if (this.f6138j.mo6191e(cVar)) {
            this.f6138j.mo6189b(new StartOffsetExtractorOutput(this.f6134f, (ExtractorOutput) Assertions.m10153e(this.f6130b)));
            m7476o();
            return;
        }
        m7468f();
    }

    /* renamed from: o */
    private void m7476o() {
        m7470h((C1034b) Assertions.m10153e(this.f6135g));
        this.f6131c = 5;
    }

    /* renamed from: a */
    public void mo6188a() {
        Mp4Extractor kVar = this.f6138j;
        if (kVar != null) {
            kVar.mo6188a();
        }
    }

    /* renamed from: b */
    public void mo6189b(ExtractorOutput lVar) {
        this.f6130b = lVar;
    }

    /* renamed from: c */
    public void mo6190c(long j, long j2) {
        if (j == 0) {
            this.f6131c = 0;
            this.f6138j = null;
        } else if (this.f6131c == 5) {
            ((Mp4Extractor) Assertions.m10153e(this.f6138j)).mo6190c(j, j2);
        }
    }

    /* renamed from: e */
    public boolean mo6191e(ExtractorInput kVar) throws IOException {
        boolean z = false;
        if (m7471j(kVar) != 65496) {
            return false;
        }
        int j = m7471j(kVar);
        this.f6132d = j;
        if (j == 65504) {
            m7467d(kVar);
            this.f6132d = m7471j(kVar);
        }
        if (this.f6132d != 65505) {
            return false;
        }
        kVar.mo6205p(2);
        this.f6129a.mo7370L(6);
        kVar.mo6204o(this.f6129a.mo7379d(), 0, 6);
        if (this.f6129a.mo7364F() == 1165519206 && this.f6129a.mo7368J() == 0) {
            z = true;
        }
        return z;
    }

    /* renamed from: i */
    public int mo6192i(ExtractorInput kVar, PositionHolder xVar) throws IOException {
        int i = this.f6131c;
        if (i == 0) {
            m7472k(kVar);
            return 0;
        } else if (i == 1) {
            m7474m(kVar);
            return 0;
        } else if (i == 2) {
            m7473l(kVar);
            return 0;
        } else if (i == 4) {
            long q = kVar.mo6206q();
            long j = this.f6134f;
            if (q != j) {
                xVar.f7015a = j;
                return 1;
            }
            m7475n(kVar);
            return 0;
        } else if (i == 5) {
            if (this.f6137i == null || kVar != this.f6136h) {
                this.f6136h = kVar;
                this.f6137i = new StartOffsetExtractorInput(kVar, this.f6134f);
            }
            int i2 = ((Mp4Extractor) Assertions.m10153e(this.f6138j)).mo6192i(this.f6137i, xVar);
            if (i2 == 1) {
                xVar.f7015a += this.f6134f;
            }
            return i2;
        } else if (i == 6) {
            return -1;
        } else {
            throw new IllegalStateException();
        }
    }
}
