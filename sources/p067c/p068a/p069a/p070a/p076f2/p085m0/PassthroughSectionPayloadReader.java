package p067c.p068a.p069a.p070a.p076f2.p085m0;

import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.Format.C1245b;
import p067c.p068a.p069a.p070a.p076f2.C0916b0;
import p067c.p068a.p069a.p070a.p076f2.ExtractorOutput;
import p067c.p068a.p069a.p070a.p076f2.p085m0.TsPayloadReader.C0983d;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.TimestampAdjuster;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.f2.m0.x */
public final class PassthroughSectionPayloadReader implements SectionPayloadReader {

    /* renamed from: a */
    private Format f6927a;

    /* renamed from: b */
    private TimestampAdjuster f6928b;

    /* renamed from: c */
    private C0916b0 f6929c;

    public PassthroughSectionPayloadReader(String str) {
        this.f6927a = new C1245b().mo7705e0(str).mo7679E();
    }

    @EnsuresNonNull({"timestampAdjuster", "output"})
    /* renamed from: a */
    private void m8219a() {
        Assertions.m10156h(this.f6928b);
        Util.m10293i(this.f6929c);
    }

    /* renamed from: b */
    public void mo6324b(TimestampAdjuster j0Var, ExtractorOutput lVar, C0983d dVar) {
        this.f6928b = j0Var;
        dVar.mo6342a();
        C0916b0 q = lVar.mo6218q(dVar.mo6344c(), 5);
        this.f6929c = q;
        q.mo6177d(this.f6927a);
    }

    /* renamed from: c */
    public void mo6325c(ParsableByteArray a0Var) {
        m8219a();
        long e = this.f6928b.mo7450e();
        if (e != -9223372036854775807L) {
            Format u0Var = this.f6927a;
            if (e != u0Var.f8818p) {
                Format E = u0Var.mo7668l().mo7709i0(e).mo7679E();
                this.f6927a = E;
                this.f6929c.mo6177d(E);
            }
            int a = a0Var.mo7376a();
            this.f6929c.mo6174a(a0Var, a);
            this.f6929c.mo6176c(this.f6928b.mo7449d(), 1, a, 0, null);
        }
    }
}
