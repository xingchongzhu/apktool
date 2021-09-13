package p067c.p068a.p069a.p070a.p076f2;

import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;

/* renamed from: c.a.a.a.f2.d */
public final class CeaUtil {
    /* renamed from: a */
    public static void m7341a(long j, ParsableByteArray a0Var, C0916b0[] b0VarArr) {
        while (true) {
            boolean z = true;
            if (a0Var.mo7376a() > 1) {
                int c = m7343c(a0Var);
                int c2 = m7343c(a0Var);
                int e = a0Var.mo7380e() + c2;
                if (c2 == -1 || c2 > a0Var.mo7376a()) {
                    Log.m10386h("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    e = a0Var.mo7381f();
                } else if (c == 4 && c2 >= 8) {
                    int D = a0Var.mo7362D();
                    int J = a0Var.mo7368J();
                    int n = J == 49 ? a0Var.mo7389n() : 0;
                    int D2 = a0Var.mo7362D();
                    if (J == 47) {
                        a0Var.mo7375Q(1);
                    }
                    boolean z2 = D == 181 && (J == 49 || J == 47) && D2 == 3;
                    if (J == 49) {
                        if (n != 1195456820) {
                            z = false;
                        }
                        z2 &= z;
                    }
                    if (z2) {
                        m7342b(j, a0Var, b0VarArr);
                    }
                }
                a0Var.mo7374P(e);
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public static void m7342b(long j, ParsableByteArray a0Var, C0916b0[] b0VarArr) {
        int D = a0Var.mo7362D();
        if ((D & 64) != 0) {
            int i = D & 31;
            a0Var.mo7375Q(1);
            int i2 = i * 3;
            int e = a0Var.mo7380e();
            for (C0916b0 b0Var : b0VarArr) {
                a0Var.mo7374P(e);
                b0Var.mo6174a(a0Var, i2);
                b0Var.mo6176c(j, 1, i2, 0, null);
            }
        }
    }

    /* renamed from: c */
    private static int m7343c(ParsableByteArray a0Var) {
        int i = 0;
        while (a0Var.mo7376a() != 0) {
            int D = a0Var.mo7362D();
            i += D;
            if (D != 255) {
                return i;
            }
        }
        return -1;
    }
}
