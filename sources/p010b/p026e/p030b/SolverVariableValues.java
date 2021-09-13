package p010b.p026e.p030b;

import com.efs.sdk.base.Constants;
import java.util.Arrays;
import p010b.p026e.p030b.ArrayRow.C0551a;

/* renamed from: b.e.b.j */
public class SolverVariableValues implements C0551a {

    /* renamed from: a */
    private static float f4061a = 0.001f;

    /* renamed from: b */
    private final int f4062b = -1;

    /* renamed from: c */
    private int f4063c = 16;

    /* renamed from: d */
    private int f4064d = 16;

    /* renamed from: e */
    int[] f4065e = new int[16];

    /* renamed from: f */
    int[] f4066f = new int[16];

    /* renamed from: g */
    int[] f4067g = new int[16];

    /* renamed from: h */
    float[] f4068h = new float[16];

    /* renamed from: i */
    int[] f4069i = new int[16];

    /* renamed from: j */
    int[] f4070j = new int[16];

    /* renamed from: k */
    int f4071k = 0;

    /* renamed from: l */
    int f4072l = -1;

    /* renamed from: m */
    private final ArrayRow f4073m;

    /* renamed from: n */
    protected final Cache f4074n;

    SolverVariableValues(ArrayRow bVar, Cache cVar) {
        this.f4073m = bVar;
        this.f4074n = cVar;
        clear();
    }

    /* renamed from: l */
    private void m4638l(SolverVariable iVar, int i) {
        int[] iArr;
        int i2 = iVar.f4040d % this.f4064d;
        int[] iArr2 = this.f4065e;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.f4066f;
                if (iArr[i3] == -1) {
                    break;
                }
                i3 = iArr[i3];
            }
            iArr[i3] = i;
        }
        this.f4066f[i] = -1;
    }

    /* renamed from: m */
    private void m4639m(int i, SolverVariable iVar, float f) {
        this.f4067g[i] = iVar.f4040d;
        this.f4068h[i] = f;
        this.f4069i[i] = -1;
        this.f4070j[i] = -1;
        iVar.mo4613a(this.f4073m);
        iVar.f4050n++;
        this.f4071k++;
    }

    /* renamed from: n */
    private int m4640n() {
        for (int i = 0; i < this.f4063c; i++) {
            if (this.f4067g[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: o */
    private void m4641o() {
        int i = this.f4063c * 2;
        this.f4067g = Arrays.copyOf(this.f4067g, i);
        this.f4068h = Arrays.copyOf(this.f4068h, i);
        this.f4069i = Arrays.copyOf(this.f4069i, i);
        this.f4070j = Arrays.copyOf(this.f4070j, i);
        this.f4066f = Arrays.copyOf(this.f4066f, i);
        for (int i2 = this.f4063c; i2 < i; i2++) {
            this.f4067g[i2] = -1;
            this.f4066f[i2] = -1;
        }
        this.f4063c = i;
    }

    /* renamed from: q */
    private void m4642q(int i, SolverVariable iVar, float f) {
        int n = m4640n();
        m4639m(n, iVar, f);
        if (i != -1) {
            this.f4069i[n] = i;
            int[] iArr = this.f4070j;
            iArr[n] = iArr[i];
            iArr[i] = n;
        } else {
            this.f4069i[n] = -1;
            if (this.f4071k > 0) {
                this.f4070j[n] = this.f4072l;
                this.f4072l = n;
            } else {
                this.f4070j[n] = -1;
            }
        }
        int[] iArr2 = this.f4070j;
        if (iArr2[n] != -1) {
            this.f4069i[iArr2[n]] = n;
        }
        m4638l(iVar, n);
    }

    /* renamed from: r */
    private void m4643r(SolverVariable iVar) {
        int[] iArr;
        int i = iVar.f4040d;
        int i2 = i % this.f4064d;
        int[] iArr2 = this.f4065e;
        int i3 = iArr2[i2];
        if (i3 != -1) {
            if (this.f4067g[i3] == i) {
                int[] iArr3 = this.f4066f;
                iArr2[i2] = iArr3[i3];
                iArr3[i3] = -1;
            } else {
                while (true) {
                    iArr = this.f4066f;
                    if (iArr[i3] == -1 || this.f4067g[iArr[i3]] == i) {
                        int i4 = iArr[i3];
                    } else {
                        i3 = iArr[i3];
                    }
                }
                int i42 = iArr[i3];
                if (i42 != -1 && this.f4067g[i42] == i) {
                    iArr[i3] = iArr[i42];
                    iArr[i42] = -1;
                }
            }
        }
    }

    /* renamed from: a */
    public float mo4535a(int i) {
        int i2 = this.f4071k;
        int i3 = this.f4072l;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.f4068h[i3];
            }
            i3 = this.f4070j[i3];
            if (i3 == -1) {
                break;
            }
        }
        return 0.0f;
    }

    /* renamed from: b */
    public void mo4536b(SolverVariable iVar, float f, boolean z) {
        float f2 = f4061a;
        if (f <= (-f2) || f >= f2) {
            int p = mo4620p(iVar);
            if (p == -1) {
                mo4542g(iVar, f);
            } else {
                float[] fArr = this.f4068h;
                fArr[p] = fArr[p] + f;
                float f3 = fArr[p];
                float f4 = f4061a;
                if (f3 > (-f4) && fArr[p] < f4) {
                    fArr[p] = 0.0f;
                    mo4543h(iVar, z);
                }
            }
        }
    }

    /* renamed from: c */
    public float mo4537c(SolverVariable iVar) {
        int p = mo4620p(iVar);
        if (p != -1) {
            return this.f4068h[p];
        }
        return 0.0f;
    }

    public void clear() {
        int i = this.f4071k;
        for (int i2 = 0; i2 < i; i2++) {
            SolverVariable i3 = mo4544i(i2);
            if (i3 != null) {
                i3.mo4614c(this.f4073m);
            }
        }
        for (int i4 = 0; i4 < this.f4063c; i4++) {
            this.f4067g[i4] = -1;
            this.f4066f[i4] = -1;
        }
        for (int i5 = 0; i5 < this.f4064d; i5++) {
            this.f4065e[i5] = -1;
        }
        this.f4071k = 0;
        this.f4072l = -1;
    }

    /* renamed from: d */
    public boolean mo4539d(SolverVariable iVar) {
        return mo4620p(iVar) != -1;
    }

    /* renamed from: e */
    public int mo4540e() {
        return this.f4071k;
    }

    /* renamed from: f */
    public float mo4541f(ArrayRow bVar, boolean z) {
        float c = mo4537c(bVar.f3988a);
        mo4543h(bVar.f3988a, z);
        SolverVariableValues jVar = (SolverVariableValues) bVar.f3992e;
        int e = jVar.mo4540e();
        int i = 0;
        int i2 = 0;
        while (i < e) {
            int[] iArr = jVar.f4067g;
            if (iArr[i2] != -1) {
                mo4536b(this.f4074n.f3997d[iArr[i2]], jVar.f4068h[i2] * c, z);
                i++;
            }
            i2++;
        }
        return c;
    }

    /* renamed from: g */
    public void mo4542g(SolverVariable iVar, float f) {
        float f2 = f4061a;
        if (f <= (-f2) || f >= f2) {
            if (this.f4071k == 0) {
                m4639m(0, iVar, f);
                m4638l(iVar, 0);
                this.f4072l = 0;
            } else {
                int p = mo4620p(iVar);
                if (p != -1) {
                    this.f4068h[p] = f;
                } else {
                    if (this.f4071k + 1 >= this.f4063c) {
                        m4641o();
                    }
                    int i = this.f4071k;
                    int i2 = this.f4072l;
                    int i3 = -1;
                    for (int i4 = 0; i4 < i; i4++) {
                        int[] iArr = this.f4067g;
                        int i5 = iArr[i2];
                        int i6 = iVar.f4040d;
                        if (i5 == i6) {
                            this.f4068h[i2] = f;
                            return;
                        }
                        if (iArr[i2] < i6) {
                            i3 = i2;
                        }
                        i2 = this.f4070j[i2];
                        if (i2 == -1) {
                            break;
                        }
                    }
                    m4642q(i3, iVar, f);
                }
            }
            return;
        }
        mo4543h(iVar, true);
    }

    /* renamed from: h */
    public float mo4543h(SolverVariable iVar, boolean z) {
        int p = mo4620p(iVar);
        if (p == -1) {
            return 0.0f;
        }
        m4643r(iVar);
        float f = this.f4068h[p];
        if (this.f4072l == p) {
            this.f4072l = this.f4070j[p];
        }
        this.f4067g[p] = -1;
        int[] iArr = this.f4069i;
        if (iArr[p] != -1) {
            int[] iArr2 = this.f4070j;
            iArr2[iArr[p]] = iArr2[p];
        }
        int[] iArr3 = this.f4070j;
        if (iArr3[p] != -1) {
            iArr[iArr3[p]] = iArr[p];
        }
        this.f4071k--;
        iVar.f4050n--;
        if (z) {
            iVar.mo4614c(this.f4073m);
        }
        return f;
    }

    /* renamed from: i */
    public SolverVariable mo4544i(int i) {
        int i2 = this.f4071k;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.f4072l;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.f4074n.f3997d[this.f4067g[i3]];
            }
            i3 = this.f4070j[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    /* renamed from: j */
    public void mo4545j(float f) {
        int i = this.f4071k;
        int i2 = this.f4072l;
        int i3 = 0;
        while (i3 < i) {
            float[] fArr = this.f4068h;
            fArr[i2] = fArr[i2] / f;
            i2 = this.f4070j[i2];
            if (i2 != -1) {
                i3++;
            } else {
                return;
            }
        }
    }

    /* renamed from: k */
    public void mo4546k() {
        int i = this.f4071k;
        int i2 = this.f4072l;
        int i3 = 0;
        while (i3 < i) {
            float[] fArr = this.f4068h;
            fArr[i2] = fArr[i2] * -1.0f;
            i2 = this.f4070j[i2];
            if (i2 != -1) {
                i3++;
            } else {
                return;
            }
        }
    }

    /* renamed from: p */
    public int mo4620p(SolverVariable iVar) {
        int[] iArr;
        if (!(this.f4071k == 0 || iVar == null)) {
            int i = iVar.f4040d;
            int i2 = this.f4065e[i % this.f4064d];
            if (i2 == -1) {
                return -1;
            }
            if (this.f4067g[i2] == i) {
                return i2;
            }
            while (true) {
                iArr = this.f4066f;
                if (iArr[i2] != -1 && this.f4067g[iArr[i2]] != i) {
                    i2 = iArr[i2];
                }
            }
            if (iArr[i2] != -1 && this.f4067g[iArr[i2]] == i) {
                return iArr[i2];
            }
        }
        return -1;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(hashCode());
        sb.append(" { ");
        String sb2 = sb.toString();
        int i = this.f4071k;
        for (int i2 = 0; i2 < i; i2++) {
            SolverVariable i3 = mo4544i(i2);
            if (i3 != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append(i3);
                sb3.append(" = ");
                sb3.append(mo4535a(i2));
                sb3.append(" ");
                String sb4 = sb3.toString();
                int p = mo4620p(i3);
                StringBuilder sb5 = new StringBuilder();
                sb5.append(sb4);
                sb5.append("[p: ");
                String sb6 = sb5.toString();
                int i4 = this.f4069i[p];
                String str3 = Constants.CP_NONE;
                if (i4 != -1) {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(sb6);
                    sb7.append(this.f4074n.f3997d[this.f4067g[this.f4069i[p]]]);
                    str = sb7.toString();
                } else {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(sb6);
                    sb8.append(str3);
                    str = sb8.toString();
                }
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                sb9.append(", n: ");
                String sb10 = sb9.toString();
                if (this.f4070j[p] != -1) {
                    StringBuilder sb11 = new StringBuilder();
                    sb11.append(sb10);
                    sb11.append(this.f4074n.f3997d[this.f4067g[this.f4070j[p]]]);
                    str2 = sb11.toString();
                } else {
                    StringBuilder sb12 = new StringBuilder();
                    sb12.append(sb10);
                    sb12.append(str3);
                    str2 = sb12.toString();
                }
                StringBuilder sb13 = new StringBuilder();
                sb13.append(str2);
                sb13.append("]");
                sb2 = sb13.toString();
            }
        }
        StringBuilder sb14 = new StringBuilder();
        sb14.append(sb2);
        sb14.append(" }");
        return sb14.toString();
    }
}
