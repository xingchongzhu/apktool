package p067c.p068a.p069a.p070a.p112n2;

import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;

/* renamed from: c.a.a.a.n2.l */
public final class DolbyVisionConfig {

    /* renamed from: a */
    public final int f8535a;

    /* renamed from: b */
    public final int f8536b;

    /* renamed from: c */
    public final String f8537c;

    private DolbyVisionConfig(int i, int i2, String str) {
        this.f8535a = i;
        this.f8536b = i2;
        this.f8537c = str;
    }

    /* renamed from: a */
    public static DolbyVisionConfig m10504a(ParsableByteArray a0Var) {
        String str;
        a0Var.mo7375Q(2);
        int D = a0Var.mo7362D();
        int i = D >> 1;
        int D2 = ((a0Var.mo7362D() >> 3) & 31) | ((D & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else if (i != 9) {
            return null;
        } else {
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str2 = ".0";
        sb.append(str2);
        sb.append(i);
        if (D2 >= 10) {
            str2 = ".";
        }
        sb.append(str2);
        sb.append(D2);
        return new DolbyVisionConfig(i, D2, sb.toString());
    }
}
