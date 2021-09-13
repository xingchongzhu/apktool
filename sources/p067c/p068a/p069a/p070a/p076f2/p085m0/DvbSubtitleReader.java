package p067c.p068a.p069a.p070a.p076f2.p085m0;

import java.util.Collections;
import java.util.List;
import p067c.p068a.p069a.p070a.Format.C1245b;
import p067c.p068a.p069a.p070a.p076f2.C0916b0;
import p067c.p068a.p069a.p070a.p076f2.ExtractorOutput;
import p067c.p068a.p069a.p070a.p076f2.p085m0.TsPayloadReader.C0980a;
import p067c.p068a.p069a.p070a.p076f2.p085m0.TsPayloadReader.C0983d;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;

/* renamed from: c.a.a.a.f2.m0.n */
public final class DvbSubtitleReader implements ElementaryStreamReader {

    /* renamed from: a */
    private final List<C0980a> f6753a;

    /* renamed from: b */
    private final C0916b0[] f6754b;

    /* renamed from: c */
    private boolean f6755c;

    /* renamed from: d */
    private int f6756d;

    /* renamed from: e */
    private int f6757e;

    /* renamed from: f */
    private long f6758f;

    public DvbSubtitleReader(List<C0980a> list) {
        this.f6753a = list;
        this.f6754b = new C0916b0[list.size()];
    }

    /* renamed from: b */
    private boolean m8113b(ParsableByteArray a0Var, int i) {
        if (a0Var.mo7376a() == 0) {
            return false;
        }
        if (a0Var.mo7362D() != i) {
            this.f6755c = false;
        }
        this.f6756d--;
        return this.f6755c;
    }

    /* renamed from: a */
    public void mo6331a() {
        this.f6755c = false;
    }

    /* renamed from: c */
    public void mo6332c(ParsableByteArray a0Var) {
        C0916b0[] b0VarArr;
        if (this.f6755c && (this.f6756d != 2 || m8113b(a0Var, 32))) {
            if (this.f6756d != 1 || m8113b(a0Var, 0)) {
                int e = a0Var.mo7380e();
                int a = a0Var.mo7376a();
                for (C0916b0 b0Var : this.f6754b) {
                    a0Var.mo7374P(e);
                    b0Var.mo6174a(a0Var, a);
                }
                this.f6757e += a;
            }
        }
    }

    /* renamed from: d */
    public void mo6333d() {
        if (this.f6755c) {
            for (C0916b0 c : this.f6754b) {
                c.mo6176c(this.f6758f, 1, this.f6757e, 0, null);
            }
            this.f6755c = false;
        }
    }

    /* renamed from: e */
    public void mo6334e(long j, int i) {
        if ((i & 4) != 0) {
            this.f6755c = true;
            this.f6758f = j;
            this.f6757e = 0;
            this.f6756d = 2;
        }
    }

    /* renamed from: f */
    public void mo6335f(ExtractorOutput lVar, C0983d dVar) {
        for (int i = 0; i < this.f6754b.length; i++) {
            C0980a aVar = (C0980a) this.f6753a.get(i);
            dVar.mo6342a();
            C0916b0 q = lVar.mo6218q(dVar.mo6344c(), 3);
            q.mo6177d(new C1245b().mo7693S(dVar.mo6343b()).mo7705e0("application/dvbsubs").mo7694T(Collections.singletonList(aVar.f6693c)).mo7696V(aVar.f6691a).mo7679E());
            this.f6754b[i] = q;
        }
    }
}
