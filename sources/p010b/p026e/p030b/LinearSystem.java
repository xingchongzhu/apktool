package p010b.p026e.p030b;

import java.util.Arrays;
import java.util.HashMap;
import p010b.p026e.p030b.SolverVariable.C0557a;
import p010b.p026e.p030b.p031k.ConstraintAnchor;
import p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b;
import p010b.p026e.p030b.p031k.ConstraintWidget;

/* renamed from: b.e.b.d */
public class LinearSystem {

    /* renamed from: a */
    public static boolean f3998a = false;

    /* renamed from: b */
    public static boolean f3999b = true;

    /* renamed from: c */
    public static boolean f4000c = true;

    /* renamed from: d */
    public static boolean f4001d = true;

    /* renamed from: e */
    public static boolean f4002e = false;

    /* renamed from: f */
    private static int f4003f = 1000;

    /* renamed from: g */
    public static Metrics f4004g;

    /* renamed from: h */
    public static long f4005h;

    /* renamed from: i */
    public static long f4006i;

    /* renamed from: j */
    public boolean f4007j;

    /* renamed from: k */
    int f4008k;

    /* renamed from: l */
    private HashMap<String, SolverVariable> f4009l;

    /* renamed from: m */
    private C0552a f4010m;

    /* renamed from: n */
    private int f4011n;

    /* renamed from: o */
    private int f4012o;

    /* renamed from: p */
    ArrayRow[] f4013p;

    /* renamed from: q */
    public boolean f4014q;

    /* renamed from: r */
    public boolean f4015r;

    /* renamed from: s */
    private boolean[] f4016s;

    /* renamed from: t */
    int f4017t;

    /* renamed from: u */
    int f4018u;

    /* renamed from: v */
    private int f4019v;

    /* renamed from: w */
    final Cache f4020w;

    /* renamed from: x */
    private SolverVariable[] f4021x;

    /* renamed from: y */
    private int f4022y;

    /* renamed from: z */
    private C0552a f4023z;

    /* renamed from: b.e.b.d$a */
    /* compiled from: LinearSystem */
    interface C0552a {
        /* renamed from: a */
        void mo4552a(C0552a aVar);

        /* renamed from: b */
        void mo4553b(SolverVariable iVar);

        /* renamed from: c */
        SolverVariable mo4554c(LinearSystem dVar, boolean[] zArr);

        void clear();

        SolverVariable getKey();

        boolean isEmpty();
    }

    /* renamed from: b.e.b.d$b */
    /* compiled from: LinearSystem */
    class C0553b extends ArrayRow {
        public C0553b(Cache cVar) {
            this.f3992e = new SolverVariableValues(this, cVar);
        }
    }

    public LinearSystem() {
        this.f4007j = false;
        this.f4008k = 0;
        this.f4009l = null;
        this.f4011n = 32;
        this.f4012o = 32;
        this.f4013p = null;
        this.f4014q = false;
        this.f4015r = false;
        this.f4016s = new boolean[32];
        this.f4017t = 1;
        this.f4018u = 0;
        this.f4019v = 32;
        this.f4021x = new SolverVariable[f4003f];
        this.f4022y = 0;
        this.f4013p = new ArrayRow[32];
        m4581C();
        Cache cVar = new Cache();
        this.f4020w = cVar;
        this.f4010m = new PriorityGoalRow(cVar);
        if (f4002e) {
            this.f4023z = new C0553b(cVar);
        } else {
            this.f4023z = new ArrayRow(cVar);
        }
    }

    /* renamed from: B */
    private final int m4580B(C0552a aVar, boolean z) {
        if (f4004g == null) {
            for (int i = 0; i < this.f4017t; i++) {
                this.f4016s[i] = false;
            }
            boolean z2 = false;
            int i2 = 0;
            while (!z2) {
                if (f4004g == null) {
                    i2++;
                    if (i2 >= this.f4017t * 2) {
                        return i2;
                    }
                    if (aVar.getKey() != null) {
                        this.f4016s[aVar.getKey().f4040d] = true;
                    }
                    SolverVariable c = aVar.mo4554c(this, this.f4016s);
                    if (c != null) {
                        boolean[] zArr = this.f4016s;
                        int i3 = c.f4040d;
                        if (zArr[i3]) {
                            return i2;
                        }
                        zArr[i3] = true;
                    }
                    if (c != null) {
                        float f = Float.MAX_VALUE;
                        int i4 = -1;
                        for (int i5 = 0; i5 < this.f4018u; i5++) {
                            ArrayRow bVar = this.f4013p[i5];
                            if (bVar.f3988a.f4047k != C0557a.UNRESTRICTED && !bVar.f3993f && bVar.mo4574t(c)) {
                                float c2 = bVar.f3992e.mo4537c(c);
                                if (c2 < 0.0f) {
                                    float f2 = (-bVar.f3989b) / c2;
                                    if (f2 < f) {
                                        i4 = i5;
                                        f = f2;
                                    }
                                }
                            }
                        }
                        if (i4 > -1) {
                            ArrayRow bVar2 = this.f4013p[i4];
                            bVar2.f3988a.f4041e = -1;
                            if (f4004g == null) {
                                bVar2.mo4577x(c);
                                SolverVariable iVar = bVar2.f3988a;
                                iVar.f4041e = i4;
                                iVar.mo4618g(this, bVar2);
                            } else {
                                throw null;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        z2 = true;
                    }
                } else {
                    throw null;
                }
            }
            return i2;
        }
        throw null;
    }

    /* renamed from: C */
    private void m4581C() {
        int i = 0;
        if (f4002e) {
            while (i < this.f4018u) {
                ArrayRow bVar = this.f4013p[i];
                if (bVar != null) {
                    this.f4020w.f3994a.mo4601a(bVar);
                }
                this.f4013p[i] = null;
                i++;
            }
            return;
        }
        while (i < this.f4018u) {
            ArrayRow bVar2 = this.f4013p[i];
            if (bVar2 != null) {
                this.f4020w.f3995b.mo4601a(bVar2);
            }
            this.f4013p[i] = null;
            i++;
        }
    }

    /* renamed from: a */
    private SolverVariable m4582a(C0557a aVar, String str) {
        SolverVariable iVar = (SolverVariable) this.f4020w.f3996c.mo4602b();
        if (iVar == null) {
            iVar = new SolverVariable(aVar, str);
            iVar.mo4617f(aVar, str);
        } else {
            iVar.mo4615d();
            iVar.mo4617f(aVar, str);
        }
        int i = this.f4022y;
        int i2 = f4003f;
        if (i >= i2) {
            int i3 = i2 * 2;
            f4003f = i3;
            this.f4021x = (SolverVariable[]) Arrays.copyOf(this.f4021x, i3);
        }
        SolverVariable[] iVarArr = this.f4021x;
        int i4 = this.f4022y;
        this.f4022y = i4 + 1;
        iVarArr[i4] = iVar;
        return iVar;
    }

    /* renamed from: l */
    private final void m4583l(ArrayRow bVar) {
        int i;
        if (!f4000c || !bVar.f3993f) {
            ArrayRow[] bVarArr = this.f4013p;
            int i2 = this.f4018u;
            bVarArr[i2] = bVar;
            SolverVariable iVar = bVar.f3988a;
            iVar.f4041e = i2;
            this.f4018u = i2 + 1;
            iVar.mo4618g(this, bVar);
        } else {
            bVar.f3988a.mo4616e(this, bVar.f3989b);
        }
        if (f4000c && this.f4007j) {
            int i3 = 0;
            while (i3 < this.f4018u) {
                if (this.f4013p[i3] == null) {
                    System.out.println("WTF");
                }
                ArrayRow[] bVarArr2 = this.f4013p;
                if (bVarArr2[i3] != null && bVarArr2[i3].f3993f) {
                    ArrayRow bVar2 = bVarArr2[i3];
                    bVar2.f3988a.mo4616e(this, bVar2.f3989b);
                    if (f4002e) {
                        this.f4020w.f3994a.mo4601a(bVar2);
                    } else {
                        this.f4020w.f3995b.mo4601a(bVar2);
                    }
                    this.f4013p[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f4018u;
                        if (i4 >= i) {
                            break;
                        }
                        ArrayRow[] bVarArr3 = this.f4013p;
                        int i6 = i4 - 1;
                        bVarArr3[i6] = bVarArr3[i4];
                        if (bVarArr3[i6].f3988a.f4041e == i4) {
                            bVarArr3[i6].f3988a.f4041e = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f4013p[i5] = null;
                    }
                    this.f4018u = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f4007j = false;
        }
    }

    /* renamed from: n */
    private void m4584n() {
        for (int i = 0; i < this.f4018u; i++) {
            ArrayRow bVar = this.f4013p[i];
            bVar.f3988a.f4043g = bVar.f3989b;
        }
    }

    /* renamed from: s */
    public static ArrayRow m4585s(LinearSystem dVar, SolverVariable iVar, SolverVariable iVar2, float f) {
        return dVar.mo4596r().mo4564j(iVar, iVar2, f);
    }

    /* renamed from: u */
    private int m4586u(C0552a aVar) throws Exception {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= this.f4018u) {
                z = false;
                break;
            }
            ArrayRow[] bVarArr = this.f4013p;
            if (bVarArr[i].f3988a.f4047k != C0557a.UNRESTRICTED && bVarArr[i].f3989b < 0.0f) {
                z = true;
                break;
            }
            i++;
        }
        if (!z) {
            return 0;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            if (f4004g == null) {
                i2++;
                float f = Float.MAX_VALUE;
                int i3 = -1;
                int i4 = -1;
                int i5 = 0;
                for (int i6 = 0; i6 < this.f4018u; i6++) {
                    ArrayRow bVar = this.f4013p[i6];
                    if (bVar.f3988a.f4047k != C0557a.UNRESTRICTED && !bVar.f3993f && bVar.f3989b < 0.0f) {
                        int i7 = 9;
                        if (f4001d) {
                            int e = bVar.f3992e.mo4540e();
                            int i8 = 0;
                            while (i8 < e) {
                                SolverVariable i9 = bVar.f3992e.mo4544i(i8);
                                float c = bVar.f3992e.mo4537c(i9);
                                if (c > 0.0f) {
                                    int i10 = 0;
                                    while (i10 < i7) {
                                        float f2 = i9.f4045i[i10] / c;
                                        if ((f2 < f && i10 == i5) || i10 > i5) {
                                            i4 = i9.f4040d;
                                            i5 = i10;
                                            i3 = i6;
                                            f = f2;
                                        }
                                        i10++;
                                        i7 = 9;
                                    }
                                }
                                i8++;
                                i7 = 9;
                            }
                        } else {
                            for (int i11 = 1; i11 < this.f4017t; i11++) {
                                SolverVariable iVar = this.f4020w.f3997d[i11];
                                float c2 = bVar.f3992e.mo4537c(iVar);
                                if (c2 > 0.0f) {
                                    for (int i12 = 0; i12 < 9; i12++) {
                                        float f3 = iVar.f4045i[i12] / c2;
                                        if ((f3 < f && i12 == i5) || i12 > i5) {
                                            i4 = i11;
                                            i5 = i12;
                                            i3 = i6;
                                            f = f3;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (i3 != -1) {
                    ArrayRow bVar2 = this.f4013p[i3];
                    bVar2.f3988a.f4041e = -1;
                    if (f4004g == null) {
                        bVar2.mo4577x(this.f4020w.f3997d[i4]);
                        SolverVariable iVar2 = bVar2.f3988a;
                        iVar2.f4041e = i3;
                        iVar2.mo4618g(this, bVar2);
                    } else {
                        throw null;
                    }
                } else {
                    z2 = true;
                }
                if (i2 > this.f4017t / 2) {
                    z2 = true;
                }
            } else {
                throw null;
            }
        }
        return i2;
    }

    /* renamed from: w */
    public static Metrics m4587w() {
        return f4004g;
    }

    /* renamed from: y */
    private void m4588y() {
        int i = this.f4011n * 2;
        this.f4011n = i;
        this.f4013p = (ArrayRow[]) Arrays.copyOf(this.f4013p, i);
        Cache cVar = this.f4020w;
        cVar.f3997d = (SolverVariable[]) Arrays.copyOf(cVar.f3997d, this.f4011n);
        int i2 = this.f4011n;
        this.f4016s = new boolean[i2];
        this.f4012o = i2;
        this.f4019v = i2;
        if (f4004g != null) {
            throw null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: A */
    public void mo4580A(C0552a aVar) throws Exception {
        if (f4004g == null) {
            m4586u(aVar);
            m4580B(aVar, false);
            m4584n();
            return;
        }
        throw null;
    }

    /* renamed from: D */
    public void mo4581D() {
        Cache cVar;
        int i = 0;
        while (true) {
            cVar = this.f4020w;
            SolverVariable[] iVarArr = cVar.f3997d;
            if (i >= iVarArr.length) {
                break;
            }
            SolverVariable iVar = iVarArr[i];
            if (iVar != null) {
                iVar.mo4615d();
            }
            i++;
        }
        cVar.f3996c.mo4603c(this.f4021x, this.f4022y);
        this.f4022y = 0;
        Arrays.fill(this.f4020w.f3997d, null);
        HashMap<String, SolverVariable> hashMap = this.f4009l;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f4008k = 0;
        this.f4010m.clear();
        this.f4017t = 1;
        for (int i2 = 0; i2 < this.f4018u; i2++) {
            ArrayRow[] bVarArr = this.f4013p;
            if (bVarArr[i2] != null) {
                bVarArr[i2].f3990c = false;
            }
        }
        m4581C();
        this.f4018u = 0;
        if (f4002e) {
            this.f4023z = new C0553b(this.f4020w);
        } else {
            this.f4023z = new ArrayRow(this.f4020w);
        }
    }

    /* renamed from: b */
    public void mo4582b(ConstraintWidget eVar, ConstraintWidget eVar2, float f, int i) {
        ConstraintWidget eVar3 = eVar;
        ConstraintWidget eVar4 = eVar2;
        C0559b bVar = C0559b.LEFT;
        SolverVariable q = mo4595q(eVar3.mo4723m(bVar));
        C0559b bVar2 = C0559b.TOP;
        SolverVariable q2 = mo4595q(eVar3.mo4723m(bVar2));
        C0559b bVar3 = C0559b.RIGHT;
        SolverVariable q3 = mo4595q(eVar3.mo4723m(bVar3));
        C0559b bVar4 = C0559b.BOTTOM;
        SolverVariable q4 = mo4595q(eVar3.mo4723m(bVar4));
        SolverVariable q5 = mo4595q(eVar4.mo4723m(bVar));
        SolverVariable q6 = mo4595q(eVar4.mo4723m(bVar2));
        SolverVariable q7 = mo4595q(eVar4.mo4723m(bVar3));
        SolverVariable q8 = mo4595q(eVar4.mo4723m(bVar4));
        ArrayRow r = mo4596r();
        double d = (double) f;
        double sin = Math.sin(d);
        SolverVariable iVar = q7;
        double d2 = d;
        double d3 = (double) i;
        Double.isNaN(d3);
        r.mo4571q(q2, q4, q6, q8, (float) (sin * d3));
        mo4584d(r);
        ArrayRow r2 = mo4596r();
        double cos = Math.cos(d2);
        Double.isNaN(d3);
        r2.mo4571q(q, q3, q5, iVar, (float) (cos * d3));
        mo4584d(r2);
    }

    /* renamed from: c */
    public void mo4583c(SolverVariable iVar, SolverVariable iVar2, int i, float f, SolverVariable iVar3, SolverVariable iVar4, int i2, int i3) {
        int i4 = i3;
        ArrayRow r = mo4596r();
        r.mo4561h(iVar, iVar2, i, f, iVar3, iVar4, i2);
        if (i4 != 8) {
            r.mo4556d(this, i4);
        }
        mo4584d(r);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x008d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008e  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4584d(p010b.p026e.p030b.ArrayRow r7) {
        /*
            r6 = this;
            if (r7 != 0) goto L_0x0003
            return
        L_0x0003:
            b.e.b.e r0 = f4004g
            r1 = 0
            if (r0 != 0) goto L_0x0095
            int r0 = r6.f4018u
            r2 = 1
            int r0 = r0 + r2
            int r3 = r6.f4019v
            if (r0 >= r3) goto L_0x0017
            int r0 = r6.f4017t
            int r0 = r0 + r2
            int r3 = r6.f4012o
            if (r0 < r3) goto L_0x001a
        L_0x0017:
            r6.m4588y()
        L_0x001a:
            r0 = 0
            boolean r3 = r7.f3993f
            if (r3 != 0) goto L_0x008f
            r7.mo4551D(r6)
            boolean r3 = r7.isEmpty()
            if (r3 == 0) goto L_0x0029
            return
        L_0x0029:
            r7.mo4572r()
            boolean r3 = r7.mo4558f(r6)
            if (r3 == 0) goto L_0x0086
            b.e.b.i r3 = r6.mo4594p()
            r7.f3988a = r3
            int r4 = r6.f4018u
            r6.m4583l(r7)
            int r5 = r6.f4018u
            int r4 = r4 + r2
            if (r5 != r4) goto L_0x0086
            b.e.b.d$a r0 = r6.f4023z
            r0.mo4552a(r7)
            b.e.b.d$a r0 = r6.f4023z
            r6.m4580B(r0, r2)
            int r0 = r3.f4041e
            r4 = -1
            if (r0 != r4) goto L_0x0087
            b.e.b.i r0 = r7.f3988a
            if (r0 != r3) goto L_0x0064
            b.e.b.i r0 = r7.mo4576v(r3)
            if (r0 == 0) goto L_0x0064
            b.e.b.e r3 = f4004g
            if (r3 != 0) goto L_0x0063
            r7.mo4577x(r0)
            goto L_0x0064
        L_0x0063:
            throw r1
        L_0x0064:
            boolean r0 = r7.f3993f
            if (r0 != 0) goto L_0x006d
            b.e.b.i r0 = r7.f3988a
            r0.mo4618g(r6, r7)
        L_0x006d:
            boolean r0 = f4002e
            if (r0 == 0) goto L_0x0079
            b.e.b.c r0 = r6.f4020w
            b.e.b.f<b.e.b.b> r0 = r0.f3994a
            r0.mo4601a(r7)
            goto L_0x0080
        L_0x0079:
            b.e.b.c r0 = r6.f4020w
            b.e.b.f<b.e.b.b> r0 = r0.f3995b
            r0.mo4601a(r7)
        L_0x0080:
            int r0 = r6.f4018u
            int r0 = r0 - r2
            r6.f4018u = r0
            goto L_0x0087
        L_0x0086:
            r2 = 0
        L_0x0087:
            boolean r0 = r7.mo4573s()
            if (r0 != 0) goto L_0x008e
            return
        L_0x008e:
            r0 = r2
        L_0x008f:
            if (r0 != 0) goto L_0x0094
            r6.m4583l(r7)
        L_0x0094:
            return
        L_0x0095:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p010b.p026e.p030b.LinearSystem.mo4584d(b.e.b.b):void");
    }

    /* renamed from: e */
    public ArrayRow mo4585e(SolverVariable iVar, SolverVariable iVar2, int i, int i2) {
        if (!f3999b || i2 != 8 || !iVar2.f4044h || iVar.f4041e != -1) {
            ArrayRow r = mo4596r();
            r.mo4568n(iVar, iVar2, i);
            if (i2 != 8) {
                r.mo4556d(this, i2);
            }
            mo4584d(r);
            return r;
        }
        iVar.mo4616e(this, iVar2.f4043g + ((float) i));
        return null;
    }

    /* renamed from: f */
    public void mo4586f(SolverVariable iVar, int i) {
        if (!f3999b || iVar.f4041e != -1) {
            int i2 = iVar.f4041e;
            if (i2 != -1) {
                ArrayRow bVar = this.f4013p[i2];
                if (bVar.f3993f) {
                    bVar.f3989b = (float) i;
                } else if (bVar.f3992e.mo4540e() == 0) {
                    bVar.f3993f = true;
                    bVar.f3989b = (float) i;
                } else {
                    ArrayRow r = mo4596r();
                    r.mo4567m(iVar, i);
                    mo4584d(r);
                }
            } else {
                ArrayRow r2 = mo4596r();
                r2.mo4562i(iVar, i);
                mo4584d(r2);
            }
            return;
        }
        float f = (float) i;
        iVar.mo4616e(this, f);
        for (int i3 = 0; i3 < this.f4008k + 1; i3++) {
            SolverVariable iVar2 = this.f4020w.f3997d[i3];
            if (iVar2 != null && iVar2.f4051o && iVar2.f4052p == iVar.f4040d) {
                iVar2.mo4616e(this, iVar2.f4053q + f);
            }
        }
    }

    /* renamed from: g */
    public void mo4587g(SolverVariable iVar, SolverVariable iVar2, int i, boolean z) {
        ArrayRow r = mo4596r();
        SolverVariable t = mo4597t();
        t.f4042f = 0;
        r.mo4569o(iVar, iVar2, t, i);
        mo4584d(r);
    }

    /* renamed from: h */
    public void mo4588h(SolverVariable iVar, SolverVariable iVar2, int i, int i2) {
        ArrayRow r = mo4596r();
        SolverVariable t = mo4597t();
        t.f4042f = 0;
        r.mo4569o(iVar, iVar2, t, i);
        if (i2 != 8) {
            mo4592m(r, (int) (r.f3992e.mo4537c(t) * -1.0f), i2);
        }
        mo4584d(r);
    }

    /* renamed from: i */
    public void mo4589i(SolverVariable iVar, SolverVariable iVar2, int i, boolean z) {
        ArrayRow r = mo4596r();
        SolverVariable t = mo4597t();
        t.f4042f = 0;
        r.mo4570p(iVar, iVar2, t, i);
        mo4584d(r);
    }

    /* renamed from: j */
    public void mo4590j(SolverVariable iVar, SolverVariable iVar2, int i, int i2) {
        ArrayRow r = mo4596r();
        SolverVariable t = mo4597t();
        t.f4042f = 0;
        r.mo4570p(iVar, iVar2, t, i);
        if (i2 != 8) {
            mo4592m(r, (int) (r.f3992e.mo4537c(t) * -1.0f), i2);
        }
        mo4584d(r);
    }

    /* renamed from: k */
    public void mo4591k(SolverVariable iVar, SolverVariable iVar2, SolverVariable iVar3, SolverVariable iVar4, float f, int i) {
        ArrayRow r = mo4596r();
        r.mo4565k(iVar, iVar2, iVar3, iVar4, f);
        if (i != 8) {
            r.mo4556d(this, i);
        }
        mo4584d(r);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public void mo4592m(ArrayRow bVar, int i, int i2) {
        bVar.mo4557e(mo4593o(i2, null), i);
    }

    /* renamed from: o */
    public SolverVariable mo4593o(int i, String str) {
        if (f4004g == null) {
            if (this.f4017t + 1 >= this.f4012o) {
                m4588y();
            }
            SolverVariable a = m4582a(C0557a.ERROR, str);
            int i2 = this.f4008k + 1;
            this.f4008k = i2;
            this.f4017t++;
            a.f4040d = i2;
            a.f4042f = i;
            this.f4020w.f3997d[i2] = a;
            this.f4010m.mo4553b(a);
            return a;
        }
        throw null;
    }

    /* renamed from: p */
    public SolverVariable mo4594p() {
        if (f4004g == null) {
            if (this.f4017t + 1 >= this.f4012o) {
                m4588y();
            }
            SolverVariable a = m4582a(C0557a.SLACK, null);
            int i = this.f4008k + 1;
            this.f4008k = i;
            this.f4017t++;
            a.f4040d = i;
            this.f4020w.f3997d[i] = a;
            return a;
        }
        throw null;
    }

    /* renamed from: q */
    public SolverVariable mo4595q(Object obj) {
        SolverVariable iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f4017t + 1 >= this.f4012o) {
            m4588y();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor dVar = (ConstraintAnchor) obj;
            iVar = dVar.mo4644h();
            if (iVar == null) {
                dVar.mo4654r(this.f4020w);
                iVar = dVar.mo4644h();
            }
            int i = iVar.f4040d;
            if (i == -1 || i > this.f4008k || this.f4020w.f3997d[i] == null) {
                if (i != -1) {
                    iVar.mo4615d();
                }
                int i2 = this.f4008k + 1;
                this.f4008k = i2;
                this.f4017t++;
                iVar.f4040d = i2;
                iVar.f4047k = C0557a.UNRESTRICTED;
                this.f4020w.f3997d[i2] = iVar;
            }
        }
        return iVar;
    }

    /* renamed from: r */
    public ArrayRow mo4596r() {
        ArrayRow bVar;
        if (f4002e) {
            bVar = (ArrayRow) this.f4020w.f3994a.mo4602b();
            if (bVar == null) {
                bVar = new C0553b(this.f4020w);
                f4006i++;
            } else {
                bVar.mo4578y();
            }
        } else {
            bVar = (ArrayRow) this.f4020w.f3995b.mo4602b();
            if (bVar == null) {
                bVar = new ArrayRow(this.f4020w);
                f4005h++;
            } else {
                bVar.mo4578y();
            }
        }
        SolverVariable.m4631b();
        return bVar;
    }

    /* renamed from: t */
    public SolverVariable mo4597t() {
        if (f4004g == null) {
            if (this.f4017t + 1 >= this.f4012o) {
                m4588y();
            }
            SolverVariable a = m4582a(C0557a.SLACK, null);
            int i = this.f4008k + 1;
            this.f4008k = i;
            this.f4017t++;
            a.f4040d = i;
            this.f4020w.f3997d[i] = a;
            return a;
        }
        throw null;
    }

    /* renamed from: v */
    public Cache mo4598v() {
        return this.f4020w;
    }

    /* renamed from: x */
    public int mo4599x(Object obj) {
        SolverVariable h = ((ConstraintAnchor) obj).mo4644h();
        if (h != null) {
            return (int) (h.f4043g + 0.5f);
        }
        return 0;
    }

    /* renamed from: z */
    public void mo4600z() throws Exception {
        if (f4004g != null) {
            throw null;
        } else if (this.f4010m.isEmpty()) {
            m4584n();
        } else {
            if (!this.f4014q && !this.f4015r) {
                mo4580A(this.f4010m);
            } else if (f4004g == null) {
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i >= this.f4018u) {
                        z = true;
                        break;
                    } else if (!this.f4013p[i].f3993f) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (!z) {
                    mo4580A(this.f4010m);
                } else if (f4004g == null) {
                    m4584n();
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
    }
}
