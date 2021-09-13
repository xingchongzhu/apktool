package p010b.p026e.p030b.p031k.p032m;

import java.util.ArrayList;
import p010b.p026e.p030b.LinearSystem;
import p010b.p026e.p030b.p031k.C0563k;
import p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b;
import p010b.p026e.p030b.p031k.ConstraintWidget;
import p010b.p026e.p030b.p031k.ConstraintWidget.C0561b;
import p010b.p026e.p030b.p031k.ConstraintWidgetContainer;
import p010b.p026e.p030b.p031k.Guideline;
import p010b.p026e.p030b.p031k.Helper;
import p010b.p026e.p030b.p031k.Optimizer;

/* renamed from: b.e.b.k.m.b */
public class BasicMeasure {

    /* renamed from: a */
    private final ArrayList<ConstraintWidget> f4263a = new ArrayList<>();

    /* renamed from: b */
    private C0564a f4264b = new C0564a();

    /* renamed from: c */
    private ConstraintWidgetContainer f4265c;

    /* renamed from: b.e.b.k.m.b$a */
    /* compiled from: BasicMeasure */
    public static class C0564a {

        /* renamed from: a */
        public static int f4266a = 0;

        /* renamed from: b */
        public static int f4267b = 1;

        /* renamed from: c */
        public static int f4268c = 2;

        /* renamed from: d */
        public C0561b f4269d;

        /* renamed from: e */
        public C0561b f4270e;

        /* renamed from: f */
        public int f4271f;

        /* renamed from: g */
        public int f4272g;

        /* renamed from: h */
        public int f4273h;

        /* renamed from: i */
        public int f4274i;

        /* renamed from: j */
        public int f4275j;

        /* renamed from: k */
        public boolean f4276k;

        /* renamed from: l */
        public boolean f4277l;

        /* renamed from: m */
        public int f4278m;
    }

    /* renamed from: b.e.b.k.m.b$b */
    /* compiled from: BasicMeasure */
    public interface C0565b {
        /* renamed from: a */
        void mo1939a(ConstraintWidget eVar, C0564a aVar);

        /* renamed from: b */
        void mo1940b();
    }

    public BasicMeasure(ConstraintWidgetContainer fVar) {
        this.f4265c = fVar;
    }

    /* renamed from: a */
    private boolean m4863a(C0565b bVar, ConstraintWidget eVar, int i) {
        this.f4264b.f4269d = eVar.mo4747y();
        this.f4264b.f4270e = eVar.mo4685O();
        this.f4264b.f4271f = eVar.mo4691R();
        this.f4264b.f4272g = eVar.mo4741v();
        C0564a aVar = this.f4264b;
        aVar.f4277l = false;
        aVar.f4278m = i;
        C0561b bVar2 = aVar.f4269d;
        C0561b bVar3 = C0561b.MATCH_CONSTRAINT;
        boolean z = bVar2 == bVar3;
        boolean z2 = aVar.f4270e == bVar3;
        boolean z3 = z && eVar.f4148X > 0.0f;
        boolean z4 = z2 && eVar.f4148X > 0.0f;
        if (z3 && eVar.f4186s[0] == 4) {
            aVar.f4269d = C0561b.FIXED;
        }
        if (z4 && eVar.f4186s[1] == 4) {
            aVar.f4270e = C0561b.FIXED;
        }
        bVar.mo1939a(eVar, aVar);
        eVar.mo4698U0(this.f4264b.f4273h);
        eVar.mo4742v0(this.f4264b.f4274i);
        eVar.mo4740u0(this.f4264b.f4276k);
        eVar.mo4720k0(this.f4264b.f4275j);
        C0564a aVar2 = this.f4264b;
        aVar2.f4278m = C0564a.f4266a;
        return aVar2.f4277l;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008d, code lost:
        if (r8 != r9) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0094, code lost:
        if (r5.f4148X <= 0.0f) goto L_0x0097;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4864b(p010b.p026e.p030b.p031k.ConstraintWidgetContainer r13) {
        /*
            r12 = this;
            java.util.ArrayList<b.e.b.k.e> r0 = r13.f4262D0
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.mo4751B1(r1)
            b.e.b.k.m.b$b r2 = r13.mo4767r1()
            r3 = 0
            r4 = 0
        L_0x0012:
            if (r4 >= r0) goto L_0x00aa
            java.util.ArrayList<b.e.b.k.e> r5 = r13.f4262D0
            java.lang.Object r5 = r5.get(r4)
            b.e.b.k.e r5 = (p010b.p026e.p030b.p031k.ConstraintWidget) r5
            boolean r6 = r5 instanceof p010b.p026e.p030b.p031k.Guideline
            if (r6 == 0) goto L_0x0022
            goto L_0x00a4
        L_0x0022:
            boolean r6 = r5 instanceof p010b.p026e.p030b.p031k.Barrier
            if (r6 == 0) goto L_0x0028
            goto L_0x00a4
        L_0x0028:
            boolean r6 = r5.mo4710c0()
            if (r6 == 0) goto L_0x0030
            goto L_0x00a4
        L_0x0030:
            if (r1 == 0) goto L_0x0047
            b.e.b.k.m.l r6 = r5.f4160f
            if (r6 == 0) goto L_0x0047
            b.e.b.k.m.n r7 = r5.f4162g
            if (r7 == 0) goto L_0x0047
            b.e.b.k.m.g r6 = r6.f4345e
            boolean r6 = r6.f4299j
            if (r6 == 0) goto L_0x0047
            b.e.b.k.m.g r6 = r7.f4345e
            boolean r6 = r6.f4299j
            if (r6 == 0) goto L_0x0047
            goto L_0x00a4
        L_0x0047:
            b.e.b.k.e$b r6 = r5.mo4735s(r3)
            r7 = 1
            b.e.b.k.e$b r8 = r5.mo4735s(r7)
            b.e.b.k.e$b r9 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.MATCH_CONSTRAINT
            if (r6 != r9) goto L_0x0060
            int r10 = r5.f4182q
            if (r10 == r7) goto L_0x0060
            if (r8 != r9) goto L_0x0060
            int r10 = r5.f4184r
            if (r10 == r7) goto L_0x0060
            r10 = 1
            goto L_0x0061
        L_0x0060:
            r10 = 0
        L_0x0061:
            if (r10 != 0) goto L_0x0097
            boolean r11 = r13.mo4751B1(r7)
            if (r11 == 0) goto L_0x0097
            boolean r11 = r5 instanceof p010b.p026e.p030b.p031k.C0563k
            if (r11 != 0) goto L_0x0097
            if (r6 != r9) goto L_0x007c
            int r11 = r5.f4182q
            if (r11 != 0) goto L_0x007c
            if (r8 == r9) goto L_0x007c
            boolean r11 = r5.mo4706Z()
            if (r11 != 0) goto L_0x007c
            r10 = 1
        L_0x007c:
            if (r8 != r9) goto L_0x008b
            int r11 = r5.f4184r
            if (r11 != 0) goto L_0x008b
            if (r6 == r9) goto L_0x008b
            boolean r11 = r5.mo4706Z()
            if (r11 != 0) goto L_0x008b
            r10 = 1
        L_0x008b:
            if (r6 == r9) goto L_0x008f
            if (r8 != r9) goto L_0x0097
        L_0x008f:
            float r6 = r5.f4148X
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r7 = r10
        L_0x0098:
            if (r7 == 0) goto L_0x009b
            goto L_0x00a4
        L_0x009b:
            int r6 = p010b.p026e.p030b.p031k.p032m.BasicMeasure.C0564a.f4266a
            r12.m4863a(r2, r5, r6)
            b.e.b.e r5 = r13.f4213I0
            if (r5 != 0) goto L_0x00a8
        L_0x00a4:
            int r4 = r4 + 1
            goto L_0x0012
        L_0x00a8:
            r13 = 0
            throw r13
        L_0x00aa:
            r2.mo1940b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p010b.p026e.p030b.p031k.p032m.BasicMeasure.m4864b(b.e.b.k.f):void");
    }

    /* renamed from: c */
    private void m4865c(ConstraintWidgetContainer fVar, String str, int i, int i2) {
        int G = fVar.mo4669G();
        int F = fVar.mo4667F();
        fVar.mo4678K0(0);
        fVar.mo4676J0(0);
        fVar.mo4698U0(i);
        fVar.mo4742v0(i2);
        fVar.mo4678K0(G);
        fVar.mo4676J0(F);
        this.f4265c.mo4757b1();
    }

    /* renamed from: d */
    public long mo4797d(ConstraintWidgetContainer fVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10;
        boolean z;
        int i11;
        boolean z2;
        boolean z3;
        int i12;
        boolean z4;
        boolean z5;
        int i13;
        int i14;
        boolean z6;
        ConstraintWidgetContainer fVar2 = fVar;
        int i15 = i;
        int i16 = i4;
        int i17 = i6;
        C0565b r1 = fVar.mo4767r1();
        int size = fVar2.f4262D0.size();
        int R = fVar.mo4691R();
        int v = fVar.mo4741v();
        boolean b = Optimizer.m4852b(i15, 128);
        boolean z7 = b || Optimizer.m4852b(i15, 64);
        if (z7) {
            int i18 = 0;
            while (true) {
                if (i18 >= size) {
                    break;
                }
                ConstraintWidget eVar = (ConstraintWidget) fVar2.f4262D0.get(i18);
                C0561b y = eVar.mo4747y();
                C0561b bVar = C0561b.MATCH_CONSTRAINT;
                boolean z8 = (y == bVar) && (eVar.mo4685O() == bVar) && eVar.mo4737t() > 0.0f;
                if ((!eVar.mo4706Z() || !z8) && ((!eVar.mo4709b0() || !z8) && !(eVar instanceof C0563k) && !eVar.mo4706Z() && !eVar.mo4709b0())) {
                    i18++;
                }
            }
            z7 = false;
        }
        if (!z7 || LinearSystem.f4004g == null) {
            boolean z9 = z7 & ((i16 == 1073741824 && i17 == 1073741824) || b);
            if (z9) {
                int min = Math.min(fVar.mo4665E(), i5);
                int min2 = Math.min(fVar.mo4663D(), i7);
                if (i16 == 1073741824 && fVar.mo4691R() != min) {
                    fVar2.mo4698U0(min);
                    fVar.mo4770u1();
                }
                if (i17 == 1073741824 && fVar.mo4741v() != min2) {
                    fVar2.mo4742v0(min2);
                    fVar.mo4770u1();
                }
                if (i16 == 1073741824 && i17 == 1073741824) {
                    z = fVar2.mo4764o1(b);
                    i10 = 2;
                } else {
                    boolean p1 = fVar2.mo4765p1(b);
                    if (i16 == 1073741824) {
                        p1 &= fVar2.mo4766q1(b, 0);
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    if (i17 == 1073741824) {
                        z = fVar2.mo4766q1(b, 1) & p1;
                        i10++;
                    } else {
                        z = p1;
                    }
                }
                if (z) {
                    fVar2.mo4705Y0(i16 == 1073741824, i17 == 1073741824);
                }
            } else {
                z = false;
                i10 = 0;
            }
            if (!z || i10 != 2) {
                int s1 = fVar.mo4768s1();
                if (size > 0) {
                    m4864b(fVar);
                }
                mo4798e(fVar);
                int size2 = this.f4263a.size();
                if (size > 0) {
                    m4865c(fVar2, "First pass", R, v);
                }
                if (size2 > 0) {
                    C0561b y2 = fVar.mo4747y();
                    C0561b bVar2 = C0561b.WRAP_CONTENT;
                    boolean z10 = y2 == bVar2;
                    boolean z11 = fVar.mo4685O() == bVar2;
                    int max = Math.max(fVar.mo4691R(), this.f4265c.mo4669G());
                    int max2 = Math.max(fVar.mo4741v(), this.f4265c.mo4667F());
                    int i19 = 0;
                    boolean z12 = false;
                    while (i19 < size2) {
                        ConstraintWidget eVar2 = (ConstraintWidget) this.f4263a.get(i19);
                        if (!(eVar2 instanceof C0563k)) {
                            i14 = s1;
                            i13 = R;
                        } else {
                            int R2 = eVar2.mo4691R();
                            i14 = s1;
                            int v2 = eVar2.mo4741v();
                            i13 = R;
                            boolean a = m4863a(r1, eVar2, C0564a.f4267b) | z12;
                            if (fVar2.f4213I0 == null) {
                                int R3 = eVar2.mo4691R();
                                boolean z13 = a;
                                int v3 = eVar2.mo4741v();
                                if (R3 != R2) {
                                    eVar2.mo4698U0(R3);
                                    if (z10 && eVar2.mo4677K() > max) {
                                        max = Math.max(max, eVar2.mo4677K() + eVar2.mo4723m(C0559b.RIGHT).mo4641e());
                                    }
                                    z6 = true;
                                } else {
                                    z6 = z13;
                                }
                                if (v3 != v2) {
                                    eVar2.mo4742v0(v3);
                                    if (z11 && eVar2.mo4729p() > max2) {
                                        max2 = Math.max(max2, eVar2.mo4729p() + eVar2.mo4723m(C0559b.BOTTOM).mo4641e());
                                    }
                                    z6 = true;
                                }
                                z12 = z6 | ((C0563k) eVar2).mo4792d1();
                            } else {
                                throw null;
                            }
                        }
                        i19++;
                        s1 = i14;
                        R = i13;
                    }
                    int i20 = s1;
                    int i21 = R;
                    int i22 = 0;
                    int i23 = 2;
                    while (i22 < i23) {
                        int i24 = 0;
                        while (i24 < size2) {
                            ConstraintWidget eVar3 = (ConstraintWidget) this.f4263a.get(i24);
                            if ((!(eVar3 instanceof Helper) || (eVar3 instanceof C0563k)) && !(eVar3 instanceof Guideline) && eVar3.mo4689Q() != 8 && ((!z9 || !eVar3.f4160f.f4345e.f4299j || !eVar3.f4162g.f4345e.f4299j) && !(eVar3 instanceof C0563k))) {
                                int R4 = eVar3.mo4691R();
                                int v4 = eVar3.mo4741v();
                                z4 = z9;
                                int n = eVar3.mo4725n();
                                int i25 = C0564a.f4267b;
                                i12 = size2;
                                if (i22 == 1) {
                                    i25 = C0564a.f4268c;
                                }
                                boolean a2 = m4863a(r1, eVar3, i25) | z12;
                                if (fVar2.f4213I0 == null) {
                                    int R5 = eVar3.mo4691R();
                                    boolean z14 = a2;
                                    int v5 = eVar3.mo4741v();
                                    if (R5 != R4) {
                                        eVar3.mo4698U0(R5);
                                        if (z10 && eVar3.mo4677K() > max) {
                                            max = Math.max(max, eVar3.mo4677K() + eVar3.mo4723m(C0559b.RIGHT).mo4641e());
                                        }
                                        z5 = true;
                                    } else {
                                        z5 = z14;
                                    }
                                    if (v5 != v4) {
                                        eVar3.mo4742v0(v5);
                                        if (z11 && eVar3.mo4729p() > max2) {
                                            max2 = Math.max(max2, eVar3.mo4729p() + eVar3.mo4723m(C0559b.BOTTOM).mo4641e());
                                        }
                                        z5 = true;
                                    }
                                    z12 = (!eVar3.mo4697U() || n == eVar3.mo4725n()) ? z5 : true;
                                } else {
                                    throw null;
                                }
                            } else {
                                z4 = z9;
                                i12 = size2;
                            }
                            i24++;
                            size2 = i12;
                            z9 = z4;
                        }
                        boolean z15 = z9;
                        int i26 = size2;
                        if (!z12) {
                            break;
                        }
                        m4865c(fVar2, "intermediate pass", i21, v);
                        i22++;
                        size2 = i26;
                        z9 = z15;
                        i23 = 2;
                        z12 = false;
                    }
                    int i27 = i21;
                    if (z12) {
                        m4865c(fVar2, "2nd pass", i27, v);
                        if (fVar.mo4691R() < max) {
                            fVar2.mo4698U0(max);
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (fVar.mo4741v() < max2) {
                            fVar2.mo4742v0(max2);
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (z3) {
                            m4865c(fVar2, "3rd pass", i27, v);
                        }
                    }
                    i11 = i20;
                } else {
                    i11 = s1;
                }
                fVar2.mo4753E1(i11);
            }
            return 0;
        }
        throw null;
    }

    /* renamed from: e */
    public void mo4798e(ConstraintWidgetContainer fVar) {
        this.f4263a.clear();
        int size = fVar.f4262D0.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget eVar = (ConstraintWidget) fVar.f4262D0.get(i);
            C0561b y = eVar.mo4747y();
            C0561b bVar = C0561b.MATCH_CONSTRAINT;
            if (y == bVar || eVar.mo4685O() == bVar) {
                this.f4263a.add(eVar);
            }
        }
        fVar.mo4770u1();
    }
}
