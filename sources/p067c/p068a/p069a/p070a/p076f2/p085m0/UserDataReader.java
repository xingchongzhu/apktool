package p067c.p068a.p069a.p070a.p076f2.p085m0;

import java.util.List;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.Format.C1245b;
import p067c.p068a.p069a.p070a.p076f2.C0916b0;
import p067c.p068a.p069a.p070a.p076f2.CeaUtil;
import p067c.p068a.p069a.p070a.p076f2.ExtractorOutput;
import p067c.p068a.p069a.p070a.p076f2.p085m0.TsPayloadReader.C0983d;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;

/* renamed from: c.a.a.a.f2.m0.k0 */
final class UserDataReader {

    /* renamed from: a */
    private final List<Format> f6738a;

    /* renamed from: b */
    private final C0916b0[] f6739b;

    public UserDataReader(List<Format> list) {
        this.f6738a = list;
        this.f6739b = new C0916b0[list.size()];
    }

    /* renamed from: a */
    public void mo6346a(long j, ParsableByteArray a0Var) {
        if (a0Var.mo7376a() >= 9) {
            int n = a0Var.mo7389n();
            int n2 = a0Var.mo7389n();
            int D = a0Var.mo7362D();
            if (n == 434 && n2 == 1195456820 && D == 3) {
                CeaUtil.m7342b(j, a0Var, this.f6739b);
            }
        }
    }

    /* renamed from: b */
    public void mo6347b(ExtractorOutput lVar, C0983d dVar) {
        for (int i = 0; i < this.f6739b.length; i++) {
            dVar.mo6342a();
            C0916b0 q = lVar.mo6218q(dVar.mo6344c(), 3);
            Format u0Var = (Format) this.f6738a.get(i);
            String str = u0Var.f8814l;
            boolean z = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid closed caption mime type provided: ");
            sb.append(str);
            Assertions.m10150b(z, sb.toString());
            q.mo6177d(new C1245b().mo7693S(dVar.mo6343b()).mo7705e0(str).mo7707g0(u0Var.f8806d).mo7696V(u0Var.f8805c).mo7680F(u0Var.f8800D).mo7694T(u0Var.f8816n).mo7679E());
            this.f6739b[i] = q;
        }
    }
}
