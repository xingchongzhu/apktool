package p067c.p068a.p069a.p070a.p076f2.p080h0;

import p067c.p068a.p069a.p070a.p076f2.C0916b0;
import p067c.p068a.p069a.p070a.p076f2.ExtractorOutput;
import p067c.p068a.p069a.p070a.p076f2.SeekMap;
import p067c.p068a.p069a.p070a.p076f2.SeekMap.C1002a;
import p067c.p068a.p069a.p070a.p076f2.SeekPoint;

/* renamed from: c.a.a.a.f2.h0.d */
public final class StartOffsetExtractorOutput implements ExtractorOutput {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final long f6146a;

    /* renamed from: b */
    private final ExtractorOutput f6147b;

    /* renamed from: c.a.a.a.f2.h0.d$a */
    /* compiled from: StartOffsetExtractorOutput */
    class C0931a implements SeekMap {

        /* renamed from: a */
        final /* synthetic */ SeekMap f6148a;

        C0931a(SeekMap yVar) {
            this.f6148a = yVar;
        }

        /* renamed from: f */
        public boolean mo6167f() {
            return this.f6148a.mo6167f();
        }

        /* renamed from: h */
        public C1002a mo6168h(long j) {
            C1002a h = this.f6148a.mo6168h(j);
            SeekPoint zVar = h.f7016a;
            SeekPoint zVar2 = new SeekPoint(zVar.f7021b, zVar.f7022c + StartOffsetExtractorOutput.this.f6146a);
            SeekPoint zVar3 = h.f7017b;
            return new C1002a(zVar2, new SeekPoint(zVar3.f7021b, zVar3.f7022c + StartOffsetExtractorOutput.this.f6146a));
        }

        /* renamed from: j */
        public long mo6169j() {
            return this.f6148a.mo6169j();
        }
    }

    public StartOffsetExtractorOutput(long j, ExtractorOutput lVar) {
        this.f6146a = j;
        this.f6147b = lVar;
    }

    /* renamed from: f */
    public void mo6216f(SeekMap yVar) {
        this.f6147b.mo6216f(new C0931a(yVar));
    }

    /* renamed from: h */
    public void mo6217h() {
        this.f6147b.mo6217h();
    }

    /* renamed from: q */
    public C0916b0 mo6218q(int i, int i2) {
        return this.f6147b.mo6218q(i, i2);
    }
}
