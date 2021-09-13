package p010b.p026e.p030b;

import java.util.ArrayList;
import p010b.p026e.p030b.SolverVariable.C0557a;

/* renamed from: b.e.b.b */
public class ArrayRow implements C0552a {

    /* renamed from: a */
    SolverVariable f3988a = null;

    /* renamed from: b */
    float f3989b = 0.0f;

    /* renamed from: c */
    boolean f3990c = false;

    /* renamed from: d */
    ArrayList<SolverVariable> f3991d = new ArrayList<>();

    /* renamed from: e */
    public C0551a f3992e;

    /* renamed from: f */
    boolean f3993f = false;

    /* renamed from: b.e.b.b$a */
    /* compiled from: ArrayRow */
    public interface C0551a {
        /* renamed from: a */
        float mo4535a(int i);

        /* renamed from: b */
        void mo4536b(SolverVariable iVar, float f, boolean z);

        /* renamed from: c */
        float mo4537c(SolverVariable iVar);

        void clear();

        /* renamed from: d */
        boolean mo4539d(SolverVariable iVar);

        /* renamed from: e */
        int mo4540e();

        /* renamed from: f */
        float mo4541f(ArrayRow bVar, boolean z);

        /* renamed from: g */
        void mo4542g(SolverVariable iVar, float f);

        /* renamed from: h */
        float mo4543h(SolverVariable iVar, boolean z);

        /* renamed from: i */
        SolverVariable mo4544i(int i);

        /* renamed from: j */
        void mo4545j(float f);

        /* renamed from: k */
        void mo4546k();
    }

    public ArrayRow() {
    }

    /* renamed from: u */
    private boolean m4539u(SolverVariable iVar, LinearSystem dVar) {
        return iVar.f4050n <= 1;
    }

    /* renamed from: w */
    private SolverVariable m4540w(boolean[] zArr, SolverVariable iVar) {
        int e = this.f3992e.mo4540e();
        SolverVariable iVar2 = null;
        float f = 0.0f;
        for (int i = 0; i < e; i++) {
            float a = this.f3992e.mo4535a(i);
            if (a < 0.0f) {
                SolverVariable i2 = this.f3992e.mo4544i(i);
                if ((zArr == null || !zArr[i2.f4040d]) && i2 != iVar) {
                    C0557a aVar = i2.f4047k;
                    if ((aVar == C0557a.SLACK || aVar == C0557a.ERROR) && a < f) {
                        f = a;
                        iVar2 = i2;
                    }
                }
            }
        }
        return iVar2;
    }

    /* renamed from: A */
    public void mo4548A(LinearSystem dVar, SolverVariable iVar, boolean z) {
        if (iVar.f4044h) {
            this.f3989b += iVar.f4043g * this.f3992e.mo4537c(iVar);
            this.f3992e.mo4543h(iVar, z);
            if (z) {
                iVar.mo4614c(this);
            }
            if (LinearSystem.f4000c && this.f3992e.mo4540e() == 0) {
                this.f3993f = true;
                dVar.f4007j = true;
            }
        }
    }

    /* renamed from: B */
    public void mo4549B(LinearSystem dVar, ArrayRow bVar, boolean z) {
        this.f3989b += bVar.f3989b * this.f3992e.mo4541f(bVar, z);
        if (z) {
            bVar.f3988a.mo4614c(this);
        }
        if (LinearSystem.f4000c && this.f3988a != null && this.f3992e.mo4540e() == 0) {
            this.f3993f = true;
            dVar.f4007j = true;
        }
    }

    /* renamed from: C */
    public void mo4550C(LinearSystem dVar, SolverVariable iVar, boolean z) {
        if (iVar.f4051o) {
            float c = this.f3992e.mo4537c(iVar);
            this.f3989b += iVar.f4053q * c;
            this.f3992e.mo4543h(iVar, z);
            if (z) {
                iVar.mo4614c(this);
            }
            this.f3992e.mo4536b(dVar.f4020w.f3997d[iVar.f4052p], c, z);
            if (LinearSystem.f4000c && this.f3992e.mo4540e() == 0) {
                this.f3993f = true;
                dVar.f4007j = true;
            }
        }
    }

    /* renamed from: D */
    public void mo4551D(LinearSystem dVar) {
        if (dVar.f4013p.length != 0) {
            boolean z = false;
            while (!z) {
                int e = this.f3992e.mo4540e();
                for (int i = 0; i < e; i++) {
                    SolverVariable i2 = this.f3992e.mo4544i(i);
                    if (i2.f4041e != -1 || i2.f4044h || i2.f4051o) {
                        this.f3991d.add(i2);
                    }
                }
                int size = this.f3991d.size();
                if (size > 0) {
                    for (int i3 = 0; i3 < size; i3++) {
                        SolverVariable iVar = (SolverVariable) this.f3991d.get(i3);
                        if (iVar.f4044h) {
                            mo4548A(dVar, iVar, true);
                        } else if (iVar.f4051o) {
                            mo4550C(dVar, iVar, true);
                        } else {
                            mo4549B(dVar, dVar.f4013p[iVar.f4041e], true);
                        }
                    }
                    this.f3991d.clear();
                } else {
                    z = true;
                }
            }
            if (LinearSystem.f4000c && this.f3988a != null && this.f3992e.mo4540e() == 0) {
                this.f3993f = true;
                dVar.f4007j = true;
            }
        }
    }

    /* renamed from: a */
    public void mo4552a(C0552a aVar) {
        if (aVar instanceof ArrayRow) {
            ArrayRow bVar = (ArrayRow) aVar;
            this.f3988a = null;
            this.f3992e.clear();
            for (int i = 0; i < bVar.f3992e.mo4540e(); i++) {
                this.f3992e.mo4536b(bVar.f3992e.mo4544i(i), bVar.f3992e.mo4535a(i), true);
            }
        }
    }

    /* renamed from: b */
    public void mo4553b(SolverVariable iVar) {
        int i = iVar.f4042f;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.f3992e.mo4542g(iVar, f);
    }

    /* renamed from: c */
    public SolverVariable mo4554c(LinearSystem dVar, boolean[] zArr) {
        return m4540w(zArr, null);
    }

    public void clear() {
        this.f3992e.clear();
        this.f3988a = null;
        this.f3989b = 0.0f;
    }

    /* renamed from: d */
    public ArrayRow mo4556d(LinearSystem dVar, int i) {
        this.f3992e.mo4542g(dVar.mo4593o(i, "ep"), 1.0f);
        this.f3992e.mo4542g(dVar.mo4593o(i, "em"), -1.0f);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public ArrayRow mo4557e(SolverVariable iVar, int i) {
        this.f3992e.mo4542g(iVar, (float) i);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo4558f(LinearSystem dVar) {
        boolean z;
        SolverVariable g = mo4559g(dVar);
        if (g == null) {
            z = true;
        } else {
            mo4577x(g);
            z = false;
        }
        if (this.f3992e.mo4540e() == 0) {
            this.f3993f = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public SolverVariable mo4559g(LinearSystem dVar) {
        boolean u;
        boolean u2;
        int e = this.f3992e.mo4540e();
        SolverVariable iVar = null;
        SolverVariable iVar2 = null;
        boolean z = false;
        boolean z2 = false;
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i = 0; i < e; i++) {
            float a = this.f3992e.mo4535a(i);
            SolverVariable i2 = this.f3992e.mo4544i(i);
            if (i2.f4047k == C0557a.UNRESTRICTED) {
                if (iVar == null) {
                    u2 = m4539u(i2, dVar);
                } else if (f > a) {
                    u2 = m4539u(i2, dVar);
                } else if (!z && m4539u(i2, dVar)) {
                    f = a;
                    iVar = i2;
                    z = true;
                }
                z = u2;
                f = a;
                iVar = i2;
            } else if (iVar == null && a < 0.0f) {
                if (iVar2 == null) {
                    u = m4539u(i2, dVar);
                } else if (f2 > a) {
                    u = m4539u(i2, dVar);
                } else if (!z2 && m4539u(i2, dVar)) {
                    f2 = a;
                    iVar2 = i2;
                    z2 = true;
                }
                z2 = u;
                f2 = a;
                iVar2 = i2;
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    public SolverVariable getKey() {
        return this.f3988a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public ArrayRow mo4561h(SolverVariable iVar, SolverVariable iVar2, int i, float f, SolverVariable iVar3, SolverVariable iVar4, int i2) {
        if (iVar2 == iVar3) {
            this.f3992e.mo4542g(iVar, 1.0f);
            this.f3992e.mo4542g(iVar4, 1.0f);
            this.f3992e.mo4542g(iVar2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.f3992e.mo4542g(iVar, 1.0f);
            this.f3992e.mo4542g(iVar2, -1.0f);
            this.f3992e.mo4542g(iVar3, -1.0f);
            this.f3992e.mo4542g(iVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.f3989b = (float) ((-i) + i2);
            }
        } else if (f <= 0.0f) {
            this.f3992e.mo4542g(iVar, -1.0f);
            this.f3992e.mo4542g(iVar2, 1.0f);
            this.f3989b = (float) i;
        } else if (f >= 1.0f) {
            this.f3992e.mo4542g(iVar4, -1.0f);
            this.f3992e.mo4542g(iVar3, 1.0f);
            this.f3989b = (float) (-i2);
        } else {
            float f2 = 1.0f - f;
            this.f3992e.mo4542g(iVar, f2 * 1.0f);
            this.f3992e.mo4542g(iVar2, f2 * -1.0f);
            this.f3992e.mo4542g(iVar3, -1.0f * f);
            this.f3992e.mo4542g(iVar4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.f3989b = (((float) (-i)) * f2) + (((float) i2) * f);
            }
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public ArrayRow mo4562i(SolverVariable iVar, int i) {
        this.f3988a = iVar;
        float f = (float) i;
        iVar.f4043g = f;
        this.f3989b = f;
        this.f3993f = true;
        return this;
    }

    public boolean isEmpty() {
        return this.f3988a == null && this.f3989b == 0.0f && this.f3992e.mo4540e() == 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public ArrayRow mo4564j(SolverVariable iVar, SolverVariable iVar2, float f) {
        this.f3992e.mo4542g(iVar, -1.0f);
        this.f3992e.mo4542g(iVar2, f);
        return this;
    }

    /* renamed from: k */
    public ArrayRow mo4565k(SolverVariable iVar, SolverVariable iVar2, SolverVariable iVar3, SolverVariable iVar4, float f) {
        this.f3992e.mo4542g(iVar, -1.0f);
        this.f3992e.mo4542g(iVar2, 1.0f);
        this.f3992e.mo4542g(iVar3, f);
        this.f3992e.mo4542g(iVar4, -f);
        return this;
    }

    /* renamed from: l */
    public ArrayRow mo4566l(float f, float f2, float f3, SolverVariable iVar, SolverVariable iVar2, SolverVariable iVar3, SolverVariable iVar4) {
        this.f3989b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.f3992e.mo4542g(iVar, 1.0f);
            this.f3992e.mo4542g(iVar2, -1.0f);
            this.f3992e.mo4542g(iVar4, 1.0f);
            this.f3992e.mo4542g(iVar3, -1.0f);
        } else if (f == 0.0f) {
            this.f3992e.mo4542g(iVar, 1.0f);
            this.f3992e.mo4542g(iVar2, -1.0f);
        } else if (f3 == 0.0f) {
            this.f3992e.mo4542g(iVar3, 1.0f);
            this.f3992e.mo4542g(iVar4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f3992e.mo4542g(iVar, 1.0f);
            this.f3992e.mo4542g(iVar2, -1.0f);
            this.f3992e.mo4542g(iVar4, f4);
            this.f3992e.mo4542g(iVar3, -f4);
        }
        return this;
    }

    /* renamed from: m */
    public ArrayRow mo4567m(SolverVariable iVar, int i) {
        if (i < 0) {
            this.f3989b = (float) (i * -1);
            this.f3992e.mo4542g(iVar, 1.0f);
        } else {
            this.f3989b = (float) i;
            this.f3992e.mo4542g(iVar, -1.0f);
        }
        return this;
    }

    /* renamed from: n */
    public ArrayRow mo4568n(SolverVariable iVar, SolverVariable iVar2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f3989b = (float) i;
        }
        if (!z) {
            this.f3992e.mo4542g(iVar, -1.0f);
            this.f3992e.mo4542g(iVar2, 1.0f);
        } else {
            this.f3992e.mo4542g(iVar, 1.0f);
            this.f3992e.mo4542g(iVar2, -1.0f);
        }
        return this;
    }

    /* renamed from: o */
    public ArrayRow mo4569o(SolverVariable iVar, SolverVariable iVar2, SolverVariable iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f3989b = (float) i;
        }
        if (!z) {
            this.f3992e.mo4542g(iVar, -1.0f);
            this.f3992e.mo4542g(iVar2, 1.0f);
            this.f3992e.mo4542g(iVar3, 1.0f);
        } else {
            this.f3992e.mo4542g(iVar, 1.0f);
            this.f3992e.mo4542g(iVar2, -1.0f);
            this.f3992e.mo4542g(iVar3, -1.0f);
        }
        return this;
    }

    /* renamed from: p */
    public ArrayRow mo4570p(SolverVariable iVar, SolverVariable iVar2, SolverVariable iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f3989b = (float) i;
        }
        if (!z) {
            this.f3992e.mo4542g(iVar, -1.0f);
            this.f3992e.mo4542g(iVar2, 1.0f);
            this.f3992e.mo4542g(iVar3, -1.0f);
        } else {
            this.f3992e.mo4542g(iVar, 1.0f);
            this.f3992e.mo4542g(iVar2, -1.0f);
            this.f3992e.mo4542g(iVar3, 1.0f);
        }
        return this;
    }

    /* renamed from: q */
    public ArrayRow mo4571q(SolverVariable iVar, SolverVariable iVar2, SolverVariable iVar3, SolverVariable iVar4, float f) {
        this.f3992e.mo4542g(iVar3, 0.5f);
        this.f3992e.mo4542g(iVar4, 0.5f);
        this.f3992e.mo4542g(iVar, -0.5f);
        this.f3992e.mo4542g(iVar2, -0.5f);
        this.f3989b = -f;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public void mo4572r() {
        float f = this.f3989b;
        if (f < 0.0f) {
            this.f3989b = f * -1.0f;
            this.f3992e.mo4546k();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public boolean mo4573s() {
        SolverVariable iVar = this.f3988a;
        return iVar != null && (iVar.f4047k == C0557a.UNRESTRICTED || this.f3989b >= 0.0f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public boolean mo4574t(SolverVariable iVar) {
        return this.f3992e.mo4539d(iVar);
    }

    public String toString() {
        return mo4579z();
    }

    /* renamed from: v */
    public SolverVariable mo4576v(SolverVariable iVar) {
        return m4540w(null, iVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public void mo4577x(SolverVariable iVar) {
        SolverVariable iVar2 = this.f3988a;
        if (iVar2 != null) {
            this.f3992e.mo4542g(iVar2, -1.0f);
            this.f3988a.f4041e = -1;
            this.f3988a = null;
        }
        float h = this.f3992e.mo4543h(iVar, true) * -1.0f;
        this.f3988a = iVar;
        if (h != 1.0f) {
            this.f3989b /= h;
            this.f3992e.mo4545j(h);
        }
    }

    /* renamed from: y */
    public void mo4578y() {
        this.f3988a = null;
        this.f3992e.clear();
        this.f3989b = 0.0f;
        this.f3993f = false;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d2  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo4579z() {
        /*
            r9 = this;
            b.e.b.i r0 = r9.f3988a
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0018
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x0029
        L_0x0018:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            b.e.b.i r1 = r9.f3988a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0029:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r9.f3989b
            r2 = 0
            r3 = 1
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0056
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r9.f3989b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            goto L_0x0057
        L_0x0056:
            r1 = 0
        L_0x0057:
            b.e.b.b$a r5 = r9.f3992e
            int r5 = r5.mo4540e()
        L_0x005d:
            if (r2 >= r5) goto L_0x00ee
            b.e.b.b$a r6 = r9.f3992e
            b.e.b.i r6 = r6.mo4544i(r2)
            if (r6 != 0) goto L_0x0069
            goto L_0x00ea
        L_0x0069:
            b.e.b.b$a r7 = r9.f3992e
            float r7 = r7.mo4535a(r2)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x0075
            goto L_0x00ea
        L_0x0075:
            java.lang.String r6 = r6.toString()
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0093
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x00bc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00ba
        L_0x0093:
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x00a9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00bc
        L_0x00a9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00ba:
            float r7 = r7 * r8
        L_0x00bc:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00d2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            goto L_0x00e9
        L_0x00d2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L_0x00e9:
            r1 = 1
        L_0x00ea:
            int r2 = r2 + 1
            goto L_0x005d
        L_0x00ee:
            if (r1 != 0) goto L_0x0101
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x0101:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p010b.p026e.p030b.ArrayRow.mo4579z():java.lang.String");
    }

    public ArrayRow(Cache cVar) {
        this.f3992e = new ArrayLinkedVariables(this, cVar);
    }
}
