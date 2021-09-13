package p067c.p068a.p069a.p070a.p073c2;

import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.p111m2.Assertions;

/* renamed from: c.a.a.a.c2.g */
public final class DecoderReuseEvaluation {

    /* renamed from: a */
    public final String f5752a;

    /* renamed from: b */
    public final Format f5753b;

    /* renamed from: c */
    public final Format f5754c;

    /* renamed from: d */
    public final int f5755d;

    /* renamed from: e */
    public final int f5756e;

    public DecoderReuseEvaluation(String str, Format u0Var, Format u0Var2, int i, int i2) {
        Assertions.m10149a(i == 0 || i2 == 0);
        this.f5752a = Assertions.m10152d(str);
        this.f5753b = (Format) Assertions.m10153e(u0Var);
        this.f5754c = (Format) Assertions.m10153e(u0Var2);
        this.f5755d = i;
        this.f5756e = i2;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || DecoderReuseEvaluation.class != obj.getClass()) {
            return false;
        }
        DecoderReuseEvaluation gVar = (DecoderReuseEvaluation) obj;
        if (this.f5755d != gVar.f5755d || this.f5756e != gVar.f5756e || !this.f5752a.equals(gVar.f5752a) || !this.f5753b.equals(gVar.f5753b) || !this.f5754c.equals(gVar.f5754c)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((((((527 + this.f5755d) * 31) + this.f5756e) * 31) + this.f5752a.hashCode()) * 31) + this.f5753b.hashCode()) * 31) + this.f5754c.hashCode();
    }
}
