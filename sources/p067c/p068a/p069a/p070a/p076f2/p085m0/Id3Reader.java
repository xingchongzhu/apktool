package p067c.p068a.p069a.p070a.p076f2.p085m0;

import p067c.p068a.p069a.p070a.Format.C1245b;
import p067c.p068a.p069a.p070a.p076f2.C0916b0;
import p067c.p068a.p069a.p070a.p076f2.ExtractorOutput;
import p067c.p068a.p069a.p070a.p076f2.p085m0.TsPayloadReader.C0983d;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;

/* renamed from: c.a.a.a.f2.m0.t */
public final class Id3Reader implements ElementaryStreamReader {

    /* renamed from: a */
    private final ParsableByteArray f6883a = new ParsableByteArray(10);

    /* renamed from: b */
    private C0916b0 f6884b;

    /* renamed from: c */
    private boolean f6885c;

    /* renamed from: d */
    private long f6886d;

    /* renamed from: e */
    private int f6887e;

    /* renamed from: f */
    private int f6888f;

    /* renamed from: a */
    public void mo6331a() {
        this.f6885c = false;
    }

    /* renamed from: c */
    public void mo6332c(ParsableByteArray a0Var) {
        Assertions.m10156h(this.f6884b);
        if (this.f6885c) {
            int a = a0Var.mo7376a();
            int i = this.f6888f;
            if (i < 10) {
                int min = Math.min(a, 10 - i);
                System.arraycopy(a0Var.mo7379d(), a0Var.mo7380e(), this.f6883a.mo7379d(), this.f6888f, min);
                if (this.f6888f + min == 10) {
                    this.f6883a.mo7374P(0);
                    if (73 == this.f6883a.mo7362D() && 68 == this.f6883a.mo7362D() && 51 == this.f6883a.mo7362D()) {
                        this.f6883a.mo7375Q(3);
                        this.f6887e = this.f6883a.mo7361C() + 10;
                    } else {
                        Log.m10386h("Id3Reader", "Discarding invalid ID3 tag");
                        this.f6885c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(a, this.f6887e - this.f6888f);
            this.f6884b.mo6174a(a0Var, min2);
            this.f6888f += min2;
        }
    }

    /* renamed from: d */
    public void mo6333d() {
        Assertions.m10156h(this.f6884b);
        if (this.f6885c) {
            int i = this.f6887e;
            if (i != 0 && this.f6888f == i) {
                this.f6884b.mo6176c(this.f6886d, 1, i, 0, null);
                this.f6885c = false;
            }
        }
    }

    /* renamed from: e */
    public void mo6334e(long j, int i) {
        if ((i & 4) != 0) {
            this.f6885c = true;
            this.f6886d = j;
            this.f6887e = 0;
            this.f6888f = 0;
        }
    }

    /* renamed from: f */
    public void mo6335f(ExtractorOutput lVar, C0983d dVar) {
        dVar.mo6342a();
        C0916b0 q = lVar.mo6218q(dVar.mo6344c(), 5);
        this.f6884b = q;
        q.mo6177d(new C1245b().mo7693S(dVar.mo6343b()).mo7705e0("application/id3").mo7679E());
    }
}
