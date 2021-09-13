package p010b.p026e.p030b.p031k.p032m;

import java.util.ArrayList;
import p010b.p026e.p030b.p031k.Barrier;
import p010b.p026e.p030b.p031k.ConstraintWidget;
import p010b.p026e.p030b.p031k.ConstraintWidget.C0561b;
import p010b.p026e.p030b.p031k.ConstraintWidgetContainer;
import p010b.p026e.p030b.p031k.Guideline;
import p010b.p026e.p030b.p031k.p032m.BasicMeasure.C0564a;
import p010b.p026e.p030b.p031k.p032m.BasicMeasure.C0565b;

/* renamed from: b.e.b.k.m.h */
public class Direct {

    /* renamed from: a */
    private static C0564a f4312a = new C0564a();

    /* renamed from: a */
    private static boolean m4899a(ConstraintWidget eVar) {
        C0561b y = eVar.mo4747y();
        C0561b O = eVar.mo4685O();
        ConstraintWidgetContainer fVar = eVar.mo4673I() != null ? (ConstraintWidgetContainer) eVar.mo4673I() : null;
        if (fVar != null) {
            C0561b y2 = fVar.mo4747y();
            C0561b bVar = C0561b.FIXED;
        }
        if (fVar != null) {
            C0561b O2 = fVar.mo4685O();
            C0561b bVar2 = C0561b.FIXED;
        }
        C0561b bVar3 = C0561b.FIXED;
        boolean z = false;
        boolean z2 = y == bVar3 || y == C0561b.WRAP_CONTENT || (y == C0561b.MATCH_CONSTRAINT && eVar.f4182q == 0 && eVar.f4148X == 0.0f && eVar.mo4699V(0)) || eVar.mo4624e0();
        boolean z3 = O == bVar3 || O == C0561b.WRAP_CONTENT || (O == C0561b.MATCH_CONSTRAINT && eVar.f4184r == 0 && eVar.f4148X == 0.0f && eVar.mo4699V(1)) || eVar.mo4626f0();
        if (eVar.f4148X > 0.0f && (z2 || z3)) {
            return true;
        }
        if (z2 && z3) {
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0184, code lost:
        if (r9.mo4649m() != false) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0186, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b0, code lost:
        if (r10.mo4649m() != false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c0, code lost:
        if (r4.mo4649m() != false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c2, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0174, code lost:
        if (r9.mo4649m() != false) goto L_0x0186;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m4900b(p010b.p026e.p030b.p031k.ConstraintWidget r13, p010b.p026e.p030b.p031k.p032m.BasicMeasure.C0565b r14, boolean r15) {
        /*
            boolean r0 = r13 instanceof p010b.p026e.p030b.p031k.ConstraintWidgetContainer
            if (r0 != 0) goto L_0x001a
            boolean r0 = r13.mo4711d0()
            if (r0 == 0) goto L_0x001a
            boolean r0 = m4899a(r13)
            if (r0 == 0) goto L_0x001a
            b.e.b.k.m.b$a r0 = new b.e.b.k.m.b$a
            r0.<init>()
            int r1 = p010b.p026e.p030b.p031k.p032m.BasicMeasure.C0564a.f4266a
            p010b.p026e.p030b.p031k.ConstraintWidgetContainer.m4794A1(r13, r14, r0, r1)
        L_0x001a:
            b.e.b.k.d$b r0 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.LEFT
            b.e.b.k.d r0 = r13.mo4723m(r0)
            b.e.b.k.d$b r1 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.RIGHT
            b.e.b.k.d r1 = r13.mo4723m(r1)
            int r2 = r0.mo4640d()
            int r3 = r1.mo4640d()
            java.util.HashSet r4 = r0.mo4639c()
            r5 = 0
            r6 = 8
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L_0x0129
            boolean r4 = r0.mo4649m()
            if (r4 == 0) goto L_0x0129
            java.util.HashSet r0 = r0.mo4639c()
            java.util.Iterator r0 = r0.iterator()
        L_0x0047:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0129
            java.lang.Object r4 = r0.next()
            b.e.b.k.d r4 = (p010b.p026e.p030b.p031k.ConstraintAnchor) r4
            b.e.b.k.e r9 = r4.f4104d
            boolean r10 = m4899a(r9)
            boolean r11 = r9.mo4711d0()
            if (r11 == 0) goto L_0x006b
            if (r10 == 0) goto L_0x006b
            b.e.b.k.m.b$a r11 = new b.e.b.k.m.b$a
            r11.<init>()
            int r12 = p010b.p026e.p030b.p031k.p032m.BasicMeasure.C0564a.f4266a
            p010b.p026e.p030b.p031k.ConstraintWidgetContainer.m4794A1(r9, r14, r11, r12)
        L_0x006b:
            b.e.b.k.e$b r11 = r9.mo4747y()
            b.e.b.k.e$b r12 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x00d2
            if (r10 == 0) goto L_0x0076
            goto L_0x00d2
        L_0x0076:
            b.e.b.k.e$b r10 = r9.mo4747y()
            if (r10 != r12) goto L_0x0047
            int r10 = r9.f4190u
            if (r10 < 0) goto L_0x0047
            int r10 = r9.f4188t
            if (r10 < 0) goto L_0x0047
            int r10 = r9.mo4689Q()
            if (r10 == r6) goto L_0x0096
            int r10 = r9.f4182q
            if (r10 != 0) goto L_0x0047
            float r10 = r9.mo4737t()
            int r10 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r10 != 0) goto L_0x0047
        L_0x0096:
            boolean r10 = r9.mo4706Z()
            if (r10 != 0) goto L_0x0047
            boolean r10 = r9.mo4710c0()
            if (r10 != 0) goto L_0x0047
            b.e.b.k.d r10 = r9.f4133I
            if (r4 != r10) goto L_0x00b2
            b.e.b.k.d r10 = r9.f4135K
            b.e.b.k.d r10 = r10.f4106f
            if (r10 == 0) goto L_0x00b2
            boolean r10 = r10.mo4649m()
            if (r10 != 0) goto L_0x00c2
        L_0x00b2:
            b.e.b.k.d r10 = r9.f4135K
            if (r4 != r10) goto L_0x00c4
            b.e.b.k.d r4 = r9.f4133I
            b.e.b.k.d r4 = r4.f4106f
            if (r4 == 0) goto L_0x00c4
            boolean r4 = r4.mo4649m()
            if (r4 == 0) goto L_0x00c4
        L_0x00c2:
            r4 = 1
            goto L_0x00c5
        L_0x00c4:
            r4 = 0
        L_0x00c5:
            if (r4 == 0) goto L_0x0047
            boolean r4 = r9.mo4706Z()
            if (r4 != 0) goto L_0x0047
            m4903e(r13, r14, r9, r15)
            goto L_0x0047
        L_0x00d2:
            boolean r10 = r9.mo4711d0()
            if (r10 == 0) goto L_0x00da
            goto L_0x0047
        L_0x00da:
            b.e.b.k.d r10 = r9.f4133I
            if (r4 != r10) goto L_0x00f6
            b.e.b.k.d r11 = r9.f4135K
            b.e.b.k.d r11 = r11.f4106f
            if (r11 != 0) goto L_0x00f6
            int r4 = r10.mo4641e()
            int r4 = r4 + r2
            int r10 = r9.mo4691R()
            int r10 = r10 + r4
            r9.mo4730p0(r4, r10)
            m4900b(r9, r14, r15)
            goto L_0x0047
        L_0x00f6:
            b.e.b.k.d r11 = r9.f4135K
            if (r4 != r11) goto L_0x0112
            b.e.b.k.d r12 = r10.f4106f
            if (r12 != 0) goto L_0x0112
            int r4 = r11.mo4641e()
            int r4 = r2 - r4
            int r10 = r9.mo4691R()
            int r10 = r4 - r10
            r9.mo4730p0(r10, r4)
            m4900b(r9, r14, r15)
            goto L_0x0047
        L_0x0112:
            if (r4 != r10) goto L_0x0047
            b.e.b.k.d r4 = r11.f4106f
            if (r4 == 0) goto L_0x0047
            boolean r4 = r4.mo4649m()
            if (r4 == 0) goto L_0x0047
            boolean r4 = r9.mo4706Z()
            if (r4 != 0) goto L_0x0047
            m4902d(r14, r9, r15)
            goto L_0x0047
        L_0x0129:
            boolean r0 = r13 instanceof p010b.p026e.p030b.p031k.Guideline
            if (r0 == 0) goto L_0x012e
            return
        L_0x012e:
            java.util.HashSet r0 = r1.mo4639c()
            if (r0 == 0) goto L_0x021a
            boolean r0 = r1.mo4649m()
            if (r0 == 0) goto L_0x021a
            java.util.HashSet r0 = r1.mo4639c()
            java.util.Iterator r0 = r0.iterator()
        L_0x0142:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x021a
            java.lang.Object r1 = r0.next()
            b.e.b.k.d r1 = (p010b.p026e.p030b.p031k.ConstraintAnchor) r1
            b.e.b.k.e r2 = r1.f4104d
            boolean r4 = m4899a(r2)
            boolean r9 = r2.mo4711d0()
            if (r9 == 0) goto L_0x0166
            if (r4 == 0) goto L_0x0166
            b.e.b.k.m.b$a r9 = new b.e.b.k.m.b$a
            r9.<init>()
            int r10 = p010b.p026e.p030b.p031k.p032m.BasicMeasure.C0564a.f4266a
            p010b.p026e.p030b.p031k.ConstraintWidgetContainer.m4794A1(r2, r14, r9, r10)
        L_0x0166:
            b.e.b.k.d r9 = r2.f4133I
            if (r1 != r9) goto L_0x0176
            b.e.b.k.d r9 = r2.f4135K
            b.e.b.k.d r9 = r9.f4106f
            if (r9 == 0) goto L_0x0176
            boolean r9 = r9.mo4649m()
            if (r9 != 0) goto L_0x0186
        L_0x0176:
            b.e.b.k.d r9 = r2.f4135K
            if (r1 != r9) goto L_0x0188
            b.e.b.k.d r9 = r2.f4133I
            b.e.b.k.d r9 = r9.f4106f
            if (r9 == 0) goto L_0x0188
            boolean r9 = r9.mo4649m()
            if (r9 == 0) goto L_0x0188
        L_0x0186:
            r9 = 1
            goto L_0x0189
        L_0x0188:
            r9 = 0
        L_0x0189:
            b.e.b.k.e$b r10 = r2.mo4747y()
            b.e.b.k.e$b r11 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.MATCH_CONSTRAINT
            if (r10 != r11) goto L_0x01cd
            if (r4 == 0) goto L_0x0194
            goto L_0x01cd
        L_0x0194:
            b.e.b.k.e$b r1 = r2.mo4747y()
            if (r1 != r11) goto L_0x0142
            int r1 = r2.f4190u
            if (r1 < 0) goto L_0x0142
            int r1 = r2.f4188t
            if (r1 < 0) goto L_0x0142
            int r1 = r2.mo4689Q()
            if (r1 == r6) goto L_0x01b4
            int r1 = r2.f4182q
            if (r1 != 0) goto L_0x0142
            float r1 = r2.mo4737t()
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0142
        L_0x01b4:
            boolean r1 = r2.mo4706Z()
            if (r1 != 0) goto L_0x0142
            boolean r1 = r2.mo4710c0()
            if (r1 != 0) goto L_0x0142
            if (r9 == 0) goto L_0x0142
            boolean r1 = r2.mo4706Z()
            if (r1 != 0) goto L_0x0142
            m4903e(r13, r14, r2, r15)
            goto L_0x0142
        L_0x01cd:
            boolean r4 = r2.mo4711d0()
            if (r4 == 0) goto L_0x01d5
            goto L_0x0142
        L_0x01d5:
            b.e.b.k.d r4 = r2.f4133I
            if (r1 != r4) goto L_0x01f1
            b.e.b.k.d r10 = r2.f4135K
            b.e.b.k.d r10 = r10.f4106f
            if (r10 != 0) goto L_0x01f1
            int r1 = r4.mo4641e()
            int r1 = r1 + r3
            int r4 = r2.mo4691R()
            int r4 = r4 + r1
            r2.mo4730p0(r1, r4)
            m4900b(r2, r14, r15)
            goto L_0x0142
        L_0x01f1:
            b.e.b.k.d r10 = r2.f4135K
            if (r1 != r10) goto L_0x020d
            b.e.b.k.d r1 = r4.f4106f
            if (r1 != 0) goto L_0x020d
            int r1 = r10.mo4641e()
            int r1 = r3 - r1
            int r4 = r2.mo4691R()
            int r4 = r1 - r4
            r2.mo4730p0(r4, r1)
            m4900b(r2, r14, r15)
            goto L_0x0142
        L_0x020d:
            if (r9 == 0) goto L_0x0142
            boolean r1 = r2.mo4706Z()
            if (r1 != 0) goto L_0x0142
            m4902d(r14, r2, r15)
            goto L_0x0142
        L_0x021a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p010b.p026e.p030b.p031k.p032m.Direct.m4900b(b.e.b.k.e, b.e.b.k.m.b$b, boolean):void");
    }

    /* renamed from: c */
    private static void m4901c(Barrier aVar, C0565b bVar, int i, boolean z) {
        if (!aVar.mo4622c1()) {
            return;
        }
        if (i == 0) {
            m4900b(aVar, bVar, z);
        } else {
            m4907i(aVar, bVar);
        }
    }

    /* renamed from: d */
    private static void m4902d(C0565b bVar, ConstraintWidget eVar, boolean z) {
        float w = eVar.mo4743w();
        int d = eVar.f4133I.f4106f.mo4640d();
        int d2 = eVar.f4135K.f4106f.mo4640d();
        int e = eVar.f4133I.mo4641e() + d;
        int e2 = d2 - eVar.f4135K.mo4641e();
        if (d == d2) {
            w = 0.5f;
        } else {
            d = e;
            d2 = e2;
        }
        int R = eVar.mo4691R();
        int i = (d2 - d) - R;
        if (d > d2) {
            i = (d - d2) - R;
        }
        int i2 = ((int) ((w * ((float) i)) + 0.5f)) + d;
        int i3 = i2 + R;
        if (d > d2) {
            i3 = i2 - R;
        }
        eVar.mo4730p0(i2, i3);
        m4900b(eVar, bVar, z);
    }

    /* renamed from: e */
    private static void m4903e(ConstraintWidget eVar, C0565b bVar, ConstraintWidget eVar2, boolean z) {
        int i;
        float w = eVar2.mo4743w();
        int d = eVar2.f4133I.f4106f.mo4640d() + eVar2.f4133I.mo4641e();
        int d2 = eVar2.f4135K.f4106f.mo4640d() - eVar2.f4135K.mo4641e();
        if (d2 >= d) {
            int R = eVar2.mo4691R();
            if (eVar2.mo4689Q() != 8) {
                int i2 = eVar2.f4182q;
                if (i2 == 2) {
                    if (eVar instanceof ConstraintWidgetContainer) {
                        i = eVar.mo4691R();
                    } else {
                        i = eVar.mo4673I().mo4691R();
                    }
                    R = (int) (eVar2.mo4743w() * 0.5f * ((float) i));
                } else if (i2 == 0) {
                    R = d2 - d;
                }
                R = Math.max(eVar2.f4188t, R);
                int i3 = eVar2.f4190u;
                if (i3 > 0) {
                    R = Math.min(i3, R);
                }
            }
            int i4 = d + ((int) ((w * ((float) ((d2 - d) - R))) + 0.5f));
            eVar2.mo4730p0(i4, R + i4);
            m4900b(eVar2, bVar, z);
        }
    }

    /* renamed from: f */
    private static void m4904f(C0565b bVar, ConstraintWidget eVar) {
        float M = eVar.mo4681M();
        int d = eVar.f4134J.f4106f.mo4640d();
        int d2 = eVar.f4136L.f4106f.mo4640d();
        int e = eVar.f4134J.mo4641e() + d;
        int e2 = d2 - eVar.f4136L.mo4641e();
        if (d == d2) {
            M = 0.5f;
        } else {
            d = e;
            d2 = e2;
        }
        int v = eVar.mo4741v();
        int i = (d2 - d) - v;
        if (d > d2) {
            i = (d - d2) - v;
        }
        int i2 = (int) ((M * ((float) i)) + 0.5f);
        int i3 = d + i2;
        int i4 = i3 + v;
        if (d > d2) {
            i3 = d - i2;
            i4 = i3 - v;
        }
        eVar.mo4736s0(i3, i4);
        m4907i(eVar, bVar);
    }

    /* renamed from: g */
    private static void m4905g(ConstraintWidget eVar, C0565b bVar, ConstraintWidget eVar2) {
        int i;
        float M = eVar2.mo4681M();
        int d = eVar2.f4134J.f4106f.mo4640d() + eVar2.f4134J.mo4641e();
        int d2 = eVar2.f4136L.f4106f.mo4640d() - eVar2.f4136L.mo4641e();
        if (d2 >= d) {
            int v = eVar2.mo4741v();
            if (eVar2.mo4689Q() != 8) {
                int i2 = eVar2.f4184r;
                if (i2 == 2) {
                    if (eVar instanceof ConstraintWidgetContainer) {
                        i = eVar.mo4741v();
                    } else {
                        i = eVar.mo4673I().mo4741v();
                    }
                    v = (int) (M * 0.5f * ((float) i));
                } else if (i2 == 0) {
                    v = d2 - d;
                }
                v = Math.max(eVar2.f4194w, v);
                int i3 = eVar2.f4196x;
                if (i3 > 0) {
                    v = Math.min(i3, v);
                }
            }
            int i4 = d + ((int) ((M * ((float) ((d2 - d) - v))) + 0.5f));
            eVar2.mo4736s0(i4, v + i4);
            m4907i(eVar2, bVar);
        }
    }

    /* renamed from: h */
    public static void m4906h(ConstraintWidgetContainer fVar, C0565b bVar) {
        C0561b y = fVar.mo4747y();
        C0561b O = fVar.mo4685O();
        fVar.mo4716i0();
        ArrayList a1 = fVar.mo4794a1();
        int size = a1.size();
        for (int i = 0; i < size; i++) {
            ((ConstraintWidget) a1.get(i)).mo4716i0();
        }
        boolean x1 = fVar.mo4773x1();
        if (y == C0561b.FIXED) {
            fVar.mo4730p0(0, fVar.mo4691R());
        } else {
            fVar.mo4732q0(0);
        }
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintWidget eVar = (ConstraintWidget) a1.get(i2);
            if (eVar instanceof Guideline) {
                Guideline gVar = (Guideline) eVar;
                if (gVar.mo4777b1() == 1) {
                    if (gVar.mo4778c1() != -1) {
                        gVar.mo4781f1(gVar.mo4778c1());
                    } else if (gVar.mo4779d1() != -1 && fVar.mo4624e0()) {
                        gVar.mo4781f1(fVar.mo4691R() - gVar.mo4779d1());
                    } else if (fVar.mo4624e0()) {
                        gVar.mo4781f1((int) ((gVar.mo4780e1() * ((float) fVar.mo4691R())) + 0.5f));
                    }
                    z = true;
                }
            } else if ((eVar instanceof Barrier) && ((Barrier) eVar).mo4629g1() == 0) {
                z2 = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                ConstraintWidget eVar2 = (ConstraintWidget) a1.get(i3);
                if (eVar2 instanceof Guideline) {
                    Guideline gVar2 = (Guideline) eVar2;
                    if (gVar2.mo4777b1() == 1) {
                        m4900b(gVar2, bVar, x1);
                    }
                }
            }
        }
        m4900b(fVar, bVar, x1);
        if (z2) {
            for (int i4 = 0; i4 < size; i4++) {
                ConstraintWidget eVar3 = (ConstraintWidget) a1.get(i4);
                if (eVar3 instanceof Barrier) {
                    Barrier aVar = (Barrier) eVar3;
                    if (aVar.mo4629g1() == 0) {
                        m4901c(aVar, bVar, 0, x1);
                    }
                }
            }
        }
        if (O == C0561b.FIXED) {
            fVar.mo4736s0(0, fVar.mo4741v());
        } else {
            fVar.mo4734r0(0);
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            ConstraintWidget eVar4 = (ConstraintWidget) a1.get(i5);
            if (eVar4 instanceof Guideline) {
                Guideline gVar3 = (Guideline) eVar4;
                if (gVar3.mo4777b1() == 0) {
                    if (gVar3.mo4778c1() != -1) {
                        gVar3.mo4781f1(gVar3.mo4778c1());
                    } else if (gVar3.mo4779d1() != -1 && fVar.mo4626f0()) {
                        gVar3.mo4781f1(fVar.mo4741v() - gVar3.mo4779d1());
                    } else if (fVar.mo4626f0()) {
                        gVar3.mo4781f1((int) ((gVar3.mo4780e1() * ((float) fVar.mo4741v())) + 0.5f));
                    }
                    z3 = true;
                }
            } else if ((eVar4 instanceof Barrier) && ((Barrier) eVar4).mo4629g1() == 1) {
                z4 = true;
            }
        }
        if (z3) {
            for (int i6 = 0; i6 < size; i6++) {
                ConstraintWidget eVar5 = (ConstraintWidget) a1.get(i6);
                if (eVar5 instanceof Guideline) {
                    Guideline gVar4 = (Guideline) eVar5;
                    if (gVar4.mo4777b1() == 0) {
                        m4907i(gVar4, bVar);
                    }
                }
            }
        }
        m4907i(fVar, bVar);
        if (z4) {
            for (int i7 = 0; i7 < size; i7++) {
                ConstraintWidget eVar6 = (ConstraintWidget) a1.get(i7);
                if (eVar6 instanceof Barrier) {
                    Barrier aVar2 = (Barrier) eVar6;
                    if (aVar2.mo4629g1() == 1) {
                        m4901c(aVar2, bVar, 1, x1);
                    }
                }
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            ConstraintWidget eVar7 = (ConstraintWidget) a1.get(i8);
            if (eVar7.mo4711d0() && m4899a(eVar7)) {
                ConstraintWidgetContainer.m4794A1(eVar7, bVar, f4312a, C0564a.f4266a);
                m4900b(eVar7, bVar, x1);
                m4907i(eVar7, bVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b0, code lost:
        if (r10.mo4649m() != false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c0, code lost:
        if (r4.mo4649m() != false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c2, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x016e, code lost:
        if (r9.mo4649m() != false) goto L_0x0180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x017e, code lost:
        if (r9.mo4649m() != false) goto L_0x0180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0180, code lost:
        r9 = true;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m4907i(p010b.p026e.p030b.p031k.ConstraintWidget r13, p010b.p026e.p030b.p031k.p032m.BasicMeasure.C0565b r14) {
        /*
            boolean r0 = r13 instanceof p010b.p026e.p030b.p031k.ConstraintWidgetContainer
            if (r0 != 0) goto L_0x001a
            boolean r0 = r13.mo4711d0()
            if (r0 == 0) goto L_0x001a
            boolean r0 = m4899a(r13)
            if (r0 == 0) goto L_0x001a
            b.e.b.k.m.b$a r0 = new b.e.b.k.m.b$a
            r0.<init>()
            int r1 = p010b.p026e.p030b.p031k.p032m.BasicMeasure.C0564a.f4266a
            p010b.p026e.p030b.p031k.ConstraintWidgetContainer.m4794A1(r13, r14, r0, r1)
        L_0x001a:
            b.e.b.k.d$b r0 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.TOP
            b.e.b.k.d r0 = r13.mo4723m(r0)
            b.e.b.k.d$b r1 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.BOTTOM
            b.e.b.k.d r1 = r13.mo4723m(r1)
            int r2 = r0.mo4640d()
            int r3 = r1.mo4640d()
            java.util.HashSet r4 = r0.mo4639c()
            r5 = 0
            r6 = 8
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L_0x0123
            boolean r4 = r0.mo4649m()
            if (r4 == 0) goto L_0x0123
            java.util.HashSet r0 = r0.mo4639c()
            java.util.Iterator r0 = r0.iterator()
        L_0x0047:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0123
            java.lang.Object r4 = r0.next()
            b.e.b.k.d r4 = (p010b.p026e.p030b.p031k.ConstraintAnchor) r4
            b.e.b.k.e r9 = r4.f4104d
            boolean r10 = m4899a(r9)
            boolean r11 = r9.mo4711d0()
            if (r11 == 0) goto L_0x006b
            if (r10 == 0) goto L_0x006b
            b.e.b.k.m.b$a r11 = new b.e.b.k.m.b$a
            r11.<init>()
            int r12 = p010b.p026e.p030b.p031k.p032m.BasicMeasure.C0564a.f4266a
            p010b.p026e.p030b.p031k.ConstraintWidgetContainer.m4794A1(r9, r14, r11, r12)
        L_0x006b:
            b.e.b.k.e$b r11 = r9.mo4685O()
            b.e.b.k.e$b r12 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x00d2
            if (r10 == 0) goto L_0x0076
            goto L_0x00d2
        L_0x0076:
            b.e.b.k.e$b r10 = r9.mo4685O()
            if (r10 != r12) goto L_0x0047
            int r10 = r9.f4196x
            if (r10 < 0) goto L_0x0047
            int r10 = r9.f4194w
            if (r10 < 0) goto L_0x0047
            int r10 = r9.mo4689Q()
            if (r10 == r6) goto L_0x0096
            int r10 = r9.f4184r
            if (r10 != 0) goto L_0x0047
            float r10 = r9.mo4737t()
            int r10 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r10 != 0) goto L_0x0047
        L_0x0096:
            boolean r10 = r9.mo4709b0()
            if (r10 != 0) goto L_0x0047
            boolean r10 = r9.mo4710c0()
            if (r10 != 0) goto L_0x0047
            b.e.b.k.d r10 = r9.f4134J
            if (r4 != r10) goto L_0x00b2
            b.e.b.k.d r10 = r9.f4136L
            b.e.b.k.d r10 = r10.f4106f
            if (r10 == 0) goto L_0x00b2
            boolean r10 = r10.mo4649m()
            if (r10 != 0) goto L_0x00c2
        L_0x00b2:
            b.e.b.k.d r10 = r9.f4136L
            if (r4 != r10) goto L_0x00c4
            b.e.b.k.d r4 = r9.f4134J
            b.e.b.k.d r4 = r4.f4106f
            if (r4 == 0) goto L_0x00c4
            boolean r4 = r4.mo4649m()
            if (r4 == 0) goto L_0x00c4
        L_0x00c2:
            r4 = 1
            goto L_0x00c5
        L_0x00c4:
            r4 = 0
        L_0x00c5:
            if (r4 == 0) goto L_0x0047
            boolean r4 = r9.mo4709b0()
            if (r4 != 0) goto L_0x0047
            m4905g(r13, r14, r9)
            goto L_0x0047
        L_0x00d2:
            boolean r10 = r9.mo4711d0()
            if (r10 == 0) goto L_0x00da
            goto L_0x0047
        L_0x00da:
            b.e.b.k.d r10 = r9.f4134J
            if (r4 != r10) goto L_0x00f6
            b.e.b.k.d r11 = r9.f4136L
            b.e.b.k.d r11 = r11.f4106f
            if (r11 != 0) goto L_0x00f6
            int r4 = r10.mo4641e()
            int r4 = r4 + r2
            int r10 = r9.mo4741v()
            int r10 = r10 + r4
            r9.mo4736s0(r4, r10)
            m4907i(r9, r14)
            goto L_0x0047
        L_0x00f6:
            b.e.b.k.d r11 = r9.f4136L
            if (r4 != r11) goto L_0x0112
            b.e.b.k.d r12 = r11.f4106f
            if (r12 != 0) goto L_0x0112
            int r4 = r11.mo4641e()
            int r4 = r2 - r4
            int r10 = r9.mo4741v()
            int r10 = r4 - r10
            r9.mo4736s0(r10, r4)
            m4907i(r9, r14)
            goto L_0x0047
        L_0x0112:
            if (r4 != r10) goto L_0x0047
            b.e.b.k.d r4 = r11.f4106f
            if (r4 == 0) goto L_0x0047
            boolean r4 = r4.mo4649m()
            if (r4 == 0) goto L_0x0047
            m4904f(r14, r9)
            goto L_0x0047
        L_0x0123:
            boolean r0 = r13 instanceof p010b.p026e.p030b.p031k.Guideline
            if (r0 == 0) goto L_0x0128
            return
        L_0x0128:
            java.util.HashSet r0 = r1.mo4639c()
            if (r0 == 0) goto L_0x0214
            boolean r0 = r1.mo4649m()
            if (r0 == 0) goto L_0x0214
            java.util.HashSet r0 = r1.mo4639c()
            java.util.Iterator r0 = r0.iterator()
        L_0x013c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0214
            java.lang.Object r1 = r0.next()
            b.e.b.k.d r1 = (p010b.p026e.p030b.p031k.ConstraintAnchor) r1
            b.e.b.k.e r2 = r1.f4104d
            boolean r4 = m4899a(r2)
            boolean r9 = r2.mo4711d0()
            if (r9 == 0) goto L_0x0160
            if (r4 == 0) goto L_0x0160
            b.e.b.k.m.b$a r9 = new b.e.b.k.m.b$a
            r9.<init>()
            int r10 = p010b.p026e.p030b.p031k.p032m.BasicMeasure.C0564a.f4266a
            p010b.p026e.p030b.p031k.ConstraintWidgetContainer.m4794A1(r2, r14, r9, r10)
        L_0x0160:
            b.e.b.k.d r9 = r2.f4134J
            if (r1 != r9) goto L_0x0170
            b.e.b.k.d r9 = r2.f4136L
            b.e.b.k.d r9 = r9.f4106f
            if (r9 == 0) goto L_0x0170
            boolean r9 = r9.mo4649m()
            if (r9 != 0) goto L_0x0180
        L_0x0170:
            b.e.b.k.d r9 = r2.f4136L
            if (r1 != r9) goto L_0x0182
            b.e.b.k.d r9 = r2.f4134J
            b.e.b.k.d r9 = r9.f4106f
            if (r9 == 0) goto L_0x0182
            boolean r9 = r9.mo4649m()
            if (r9 == 0) goto L_0x0182
        L_0x0180:
            r9 = 1
            goto L_0x0183
        L_0x0182:
            r9 = 0
        L_0x0183:
            b.e.b.k.e$b r10 = r2.mo4685O()
            b.e.b.k.e$b r11 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.MATCH_CONSTRAINT
            if (r10 != r11) goto L_0x01c7
            if (r4 == 0) goto L_0x018e
            goto L_0x01c7
        L_0x018e:
            b.e.b.k.e$b r1 = r2.mo4685O()
            if (r1 != r11) goto L_0x013c
            int r1 = r2.f4196x
            if (r1 < 0) goto L_0x013c
            int r1 = r2.f4194w
            if (r1 < 0) goto L_0x013c
            int r1 = r2.mo4689Q()
            if (r1 == r6) goto L_0x01ae
            int r1 = r2.f4184r
            if (r1 != 0) goto L_0x013c
            float r1 = r2.mo4737t()
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x013c
        L_0x01ae:
            boolean r1 = r2.mo4709b0()
            if (r1 != 0) goto L_0x013c
            boolean r1 = r2.mo4710c0()
            if (r1 != 0) goto L_0x013c
            if (r9 == 0) goto L_0x013c
            boolean r1 = r2.mo4709b0()
            if (r1 != 0) goto L_0x013c
            m4905g(r13, r14, r2)
            goto L_0x013c
        L_0x01c7:
            boolean r4 = r2.mo4711d0()
            if (r4 == 0) goto L_0x01cf
            goto L_0x013c
        L_0x01cf:
            b.e.b.k.d r4 = r2.f4134J
            if (r1 != r4) goto L_0x01eb
            b.e.b.k.d r10 = r2.f4136L
            b.e.b.k.d r10 = r10.f4106f
            if (r10 != 0) goto L_0x01eb
            int r1 = r4.mo4641e()
            int r1 = r1 + r3
            int r4 = r2.mo4741v()
            int r4 = r4 + r1
            r2.mo4736s0(r1, r4)
            m4907i(r2, r14)
            goto L_0x013c
        L_0x01eb:
            b.e.b.k.d r10 = r2.f4136L
            if (r1 != r10) goto L_0x0207
            b.e.b.k.d r1 = r4.f4106f
            if (r1 != 0) goto L_0x0207
            int r1 = r10.mo4641e()
            int r1 = r3 - r1
            int r4 = r2.mo4741v()
            int r4 = r1 - r4
            r2.mo4736s0(r4, r1)
            m4907i(r2, r14)
            goto L_0x013c
        L_0x0207:
            if (r9 == 0) goto L_0x013c
            boolean r1 = r2.mo4709b0()
            if (r1 != 0) goto L_0x013c
            m4904f(r14, r2)
            goto L_0x013c
        L_0x0214:
            b.e.b.k.d$b r0 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.BASELINE
            b.e.b.k.d r13 = r13.mo4723m(r0)
            java.util.HashSet r0 = r13.mo4639c()
            if (r0 == 0) goto L_0x0272
            boolean r0 = r13.mo4649m()
            if (r0 == 0) goto L_0x0272
            int r0 = r13.mo4640d()
            java.util.HashSet r13 = r13.mo4639c()
            java.util.Iterator r13 = r13.iterator()
        L_0x0232:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x0272
            java.lang.Object r1 = r13.next()
            b.e.b.k.d r1 = (p010b.p026e.p030b.p031k.ConstraintAnchor) r1
            b.e.b.k.e r2 = r1.f4104d
            boolean r3 = m4899a(r2)
            boolean r4 = r2.mo4711d0()
            if (r4 == 0) goto L_0x0256
            if (r3 == 0) goto L_0x0256
            b.e.b.k.m.b$a r4 = new b.e.b.k.m.b$a
            r4.<init>()
            int r5 = p010b.p026e.p030b.p031k.p032m.BasicMeasure.C0564a.f4266a
            p010b.p026e.p030b.p031k.ConstraintWidgetContainer.m4794A1(r2, r14, r4, r5)
        L_0x0256:
            b.e.b.k.e$b r4 = r2.mo4685O()
            b.e.b.k.e$b r5 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.MATCH_CONSTRAINT
            if (r4 != r5) goto L_0x0260
            if (r3 == 0) goto L_0x0232
        L_0x0260:
            boolean r3 = r2.mo4711d0()
            if (r3 == 0) goto L_0x0267
            goto L_0x0232
        L_0x0267:
            b.e.b.k.d r3 = r2.f4137M
            if (r1 != r3) goto L_0x0232
            r2.mo4728o0(r0)
            m4907i(r2, r14)     // Catch:{ all -> 0x0273 }
            goto L_0x0232
        L_0x0272:
            return
        L_0x0273:
            r13 = move-exception
            goto L_0x0276
        L_0x0275:
            throw r13
        L_0x0276:
            goto L_0x0275
        */
        throw new UnsupportedOperationException("Method not decompiled: p010b.p026e.p030b.p031k.p032m.Direct.m4907i(b.e.b.k.e, b.e.b.k.m.b$b):void");
    }
}
