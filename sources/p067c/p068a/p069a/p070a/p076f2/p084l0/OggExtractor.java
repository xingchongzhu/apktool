package p067c.p068a.p069a.p070a.p076f2.p084l0;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p067c.p068a.p069a.p070a.ParserException;
import p067c.p068a.p069a.p070a.p076f2.C0916b0;
import p067c.p068a.p069a.p070a.p076f2.C0998o;
import p067c.p068a.p069a.p070a.p076f2.Extractor;
import p067c.p068a.p069a.p070a.p076f2.ExtractorInput;
import p067c.p068a.p069a.p070a.p076f2.ExtractorOutput;
import p067c.p068a.p069a.p070a.p076f2.PositionHolder;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;

/* renamed from: c.a.a.a.f2.l0.d */
public class OggExtractor implements Extractor {

    /* renamed from: a */
    public static final C0998o f6530a = C0963a.f6510b;

    /* renamed from: b */
    private ExtractorOutput f6531b;

    /* renamed from: c */
    private StreamReader f6532c;

    /* renamed from: d */
    private boolean f6533d;

    /* renamed from: d */
    static /* synthetic */ Extractor[] m7886d() {
        return new Extractor[]{new OggExtractor()};
    }

    /* renamed from: f */
    private static ParsableByteArray m7887f(ParsableByteArray a0Var) {
        a0Var.mo7374P(0);
        return a0Var;
    }

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    /* renamed from: g */
    private boolean m7888g(ExtractorInput kVar) throws IOException {
        OggPageHeader fVar = new OggPageHeader();
        if (fVar.mo6307b(kVar, true) && (fVar.f6540b & 2) == 2) {
            int min = Math.min(fVar.f6547i, 8);
            ParsableByteArray a0Var = new ParsableByteArray(min);
            kVar.mo6204o(a0Var.mo7379d(), 0, min);
            if (FlacReader.m7878p(m7887f(a0Var))) {
                this.f6532c = new FlacReader();
            } else if (VorbisReader.m7932r(m7887f(a0Var))) {
                this.f6532c = new VorbisReader();
            } else if (OpusReader.m7909o(m7887f(a0Var))) {
                this.f6532c = new OpusReader();
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo6188a() {
    }

    /* renamed from: b */
    public void mo6189b(ExtractorOutput lVar) {
        this.f6531b = lVar;
    }

    /* renamed from: c */
    public void mo6190c(long j, long j2) {
        StreamReader iVar = this.f6532c;
        if (iVar != null) {
            iVar.mo6316m(j, j2);
        }
    }

    /* renamed from: e */
    public boolean mo6191e(ExtractorInput kVar) throws IOException {
        try {
            return m7888g(kVar);
        } catch (ParserException unused) {
            return false;
        }
    }

    /* renamed from: i */
    public int mo6192i(ExtractorInput kVar, PositionHolder xVar) throws IOException {
        Assertions.m10156h(this.f6531b);
        if (this.f6532c == null) {
            if (m7888g(kVar)) {
                kVar.mo6199h();
            } else {
                throw new ParserException("Failed to determine bitstream type");
            }
        }
        if (!this.f6533d) {
            C0916b0 q = this.f6531b.mo6218q(0, 1);
            this.f6531b.mo6217h();
            this.f6532c.mo6313d(this.f6531b, q);
            this.f6533d = true;
        }
        return this.f6532c.mo6315g(kVar, xVar);
    }
}
