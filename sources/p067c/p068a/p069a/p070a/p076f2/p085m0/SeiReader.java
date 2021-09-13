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

/* renamed from: c.a.a.a.f2.m0.e0 */
public final class SeiReader {

    /* renamed from: a */
    private final List<Format> f6616a;

    /* renamed from: b */
    private final C0916b0[] f6617b;

    public SeiReader(List<Format> list) {
        this.f6616a = list;
        this.f6617b = new C0916b0[list.size()];
    }

    /* renamed from: a */
    public void mo6329a(long j, ParsableByteArray a0Var) {
        CeaUtil.m7341a(j, a0Var, this.f6617b);
    }

    /* renamed from: b */
    public void mo6330b(ExtractorOutput lVar, C0983d dVar) {
        for (int i = 0; i < this.f6617b.length; i++) {
            dVar.mo6342a();
            C0916b0 q = lVar.mo6218q(dVar.mo6344c(), 3);
            Format u0Var = (Format) this.f6616a.get(i);
            String str = u0Var.f8814l;
            boolean z = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid closed caption mime type provided: ");
            sb.append(str);
            Assertions.m10150b(z, sb.toString());
            String str2 = u0Var.f8803a;
            if (str2 == null) {
                str2 = dVar.mo6343b();
            }
            q.mo6177d(new C1245b().mo7693S(str2).mo7705e0(str).mo7707g0(u0Var.f8806d).mo7696V(u0Var.f8805c).mo7680F(u0Var.f8800D).mo7694T(u0Var.f8816n).mo7679E());
            this.f6617b[i] = q;
        }
    }
}
