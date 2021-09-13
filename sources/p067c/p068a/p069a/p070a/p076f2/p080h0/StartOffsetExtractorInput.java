package p067c.p068a.p069a.p070a.p076f2.p080h0;

import p067c.p068a.p069a.p070a.p076f2.ExtractorInput;
import p067c.p068a.p069a.p070a.p076f2.ForwardingExtractorInput;
import p067c.p068a.p069a.p070a.p111m2.Assertions;

/* renamed from: c.a.a.a.f2.h0.c */
final class StartOffsetExtractorInput extends ForwardingExtractorInput {

    /* renamed from: c */
    private final long f6145c;

    public StartOffsetExtractorInput(ExtractorInput kVar, long j) {
        super(kVar);
        Assertions.m10149a(kVar.mo6206q() >= j);
        this.f6145c = j;
    }

    /* renamed from: a */
    public long mo6194a() {
        return super.mo6194a() - this.f6145c;
    }

    /* renamed from: n */
    public long mo6203n() {
        return super.mo6203n() - this.f6145c;
    }

    /* renamed from: q */
    public long mo6206q() {
        return super.mo6206q() - this.f6145c;
    }
}
