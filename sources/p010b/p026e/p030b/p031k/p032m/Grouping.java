package p010b.p026e.p030b.p031k.p032m;

import java.util.ArrayList;
import p010b.p026e.p030b.p031k.ConstraintAnchor;
import p010b.p026e.p030b.p031k.ConstraintWidget;
import p010b.p026e.p030b.p031k.Guideline;
import p010b.p026e.p030b.p031k.HelperWidget;

/* renamed from: b.e.b.k.m.i */
public class Grouping {
    /* renamed from: a */
    public static WidgetGroup m4908a(ConstraintWidget eVar, int i, ArrayList<WidgetGroup> arrayList, WidgetGroup oVar) {
        int i2;
        if (i == 0) {
            i2 = eVar.f4125B0;
        } else {
            i2 = eVar.f4127C0;
        }
        int i3 = 0;
        if (i2 != -1 && (oVar == null || i2 != oVar.f4328c)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                WidgetGroup oVar2 = (WidgetGroup) arrayList.get(i4);
                if (oVar2.mo4827c() == i2) {
                    if (oVar != null) {
                        oVar.mo4830g(i, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i4++;
                }
            }
        } else if (i2 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if (eVar instanceof HelperWidget) {
                int b1 = ((HelperWidget) eVar).mo4790b1(i);
                if (b1 != -1) {
                    int i5 = 0;
                    while (true) {
                        if (i5 >= arrayList.size()) {
                            break;
                        }
                        WidgetGroup oVar3 = (WidgetGroup) arrayList.get(i5);
                        if (oVar3.mo4827c() == b1) {
                            oVar = oVar3;
                            break;
                        }
                        i5++;
                    }
                }
            }
            if (oVar == null) {
                oVar = new WidgetGroup(i);
            }
            arrayList.add(oVar);
        }
        if (oVar.mo4825a(eVar)) {
            if (eVar instanceof Guideline) {
                Guideline gVar = (Guideline) eVar;
                ConstraintAnchor a1 = gVar.mo4776a1();
                if (gVar.mo4777b1() == 0) {
                    i3 = 1;
                }
                a1.mo4638b(i3, arrayList, oVar);
            }
            if (i == 0) {
                eVar.f4125B0 = oVar.mo4827c();
                eVar.f4133I.mo4638b(i, arrayList, oVar);
                eVar.f4135K.mo4638b(i, arrayList, oVar);
            } else {
                eVar.f4127C0 = oVar.mo4827c();
                eVar.f4134J.mo4638b(i, arrayList, oVar);
                eVar.f4137M.mo4638b(i, arrayList, oVar);
                eVar.f4136L.mo4638b(i, arrayList, oVar);
            }
            eVar.f4140P.mo4638b(i, arrayList, oVar);
        }
        return oVar;
    }

    /* renamed from: b */
    private static WidgetGroup m4909b(ArrayList<WidgetGroup> arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            WidgetGroup oVar = (WidgetGroup) arrayList.get(i2);
            if (i == oVar.f4328c) {
                return oVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:175:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0380  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0384 A[ADDED_TO_REGION] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m4910c(p010b.p026e.p030b.p031k.ConstraintWidgetContainer r16, p010b.p026e.p030b.p031k.p032m.BasicMeasure.C0565b r17) {
        /*
            r0 = r16
            java.util.ArrayList r1 = r16.mo4794a1()
            int r2 = r1.size()
            r3 = 0
            r4 = 0
        L_0x000c:
            if (r4 >= r2) goto L_0x002e
            java.lang.Object r5 = r1.get(r4)
            b.e.b.k.e r5 = (p010b.p026e.p030b.p031k.ConstraintWidget) r5
            b.e.b.k.e$b r6 = r16.mo4747y()
            b.e.b.k.e$b r7 = r16.mo4685O()
            b.e.b.k.e$b r8 = r5.mo4747y()
            b.e.b.k.e$b r5 = r5.mo4685O()
            boolean r5 = m4911d(r6, r7, r8, r5)
            if (r5 != 0) goto L_0x002b
            return r3
        L_0x002b:
            int r4 = r4 + 1
            goto L_0x000c
        L_0x002e:
            b.e.b.e r4 = r0.f4213I0
            if (r4 != 0) goto L_0x038b
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x0039:
            r12 = 1
            if (r4 >= r2) goto L_0x0113
            java.lang.Object r13 = r1.get(r4)
            b.e.b.k.e r13 = (p010b.p026e.p030b.p031k.ConstraintWidget) r13
            b.e.b.k.e$b r14 = r16.mo4747y()
            b.e.b.k.e$b r15 = r16.mo4685O()
            b.e.b.k.e$b r3 = r13.mo4747y()
            b.e.b.k.e$b r5 = r13.mo4685O()
            boolean r3 = m4911d(r14, r15, r3, r5)
            if (r3 != 0) goto L_0x0062
            b.e.b.k.m.b$a r3 = r0.f4237g1
            int r5 = p010b.p026e.p030b.p031k.p032m.BasicMeasure.C0564a.f4266a
            r14 = r17
            p010b.p026e.p030b.p031k.ConstraintWidgetContainer.m4794A1(r13, r14, r3, r5)
            goto L_0x0064
        L_0x0062:
            r14 = r17
        L_0x0064:
            boolean r3 = r13 instanceof p010b.p026e.p030b.p031k.Guideline
            if (r3 == 0) goto L_0x008b
            r5 = r13
            b.e.b.k.g r5 = (p010b.p026e.p030b.p031k.Guideline) r5
            int r15 = r5.mo4777b1()
            if (r15 != 0) goto L_0x007b
            if (r8 != 0) goto L_0x0078
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x0078:
            r8.add(r5)
        L_0x007b:
            int r15 = r5.mo4777b1()
            if (r15 != r12) goto L_0x008b
            if (r6 != 0) goto L_0x0088
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x0088:
            r6.add(r5)
        L_0x008b:
            boolean r5 = r13 instanceof p010b.p026e.p030b.p031k.HelperWidget
            if (r5 == 0) goto L_0x00ce
            boolean r5 = r13 instanceof p010b.p026e.p030b.p031k.Barrier
            if (r5 == 0) goto L_0x00b7
            r5 = r13
            b.e.b.k.a r5 = (p010b.p026e.p030b.p031k.Barrier) r5
            int r15 = r5.mo4629g1()
            if (r15 != 0) goto L_0x00a6
            if (r7 != 0) goto L_0x00a3
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x00a3:
            r7.add(r5)
        L_0x00a6:
            int r15 = r5.mo4629g1()
            if (r15 != r12) goto L_0x00ce
            if (r9 != 0) goto L_0x00b3
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x00b3:
            r9.add(r5)
            goto L_0x00ce
        L_0x00b7:
            r5 = r13
            b.e.b.k.i r5 = (p010b.p026e.p030b.p031k.HelperWidget) r5
            if (r7 != 0) goto L_0x00c1
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x00c1:
            r7.add(r5)
            if (r9 != 0) goto L_0x00cb
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x00cb:
            r9.add(r5)
        L_0x00ce:
            b.e.b.k.d r5 = r13.f4133I
            b.e.b.k.d r5 = r5.f4106f
            if (r5 != 0) goto L_0x00eb
            b.e.b.k.d r5 = r13.f4135K
            b.e.b.k.d r5 = r5.f4106f
            if (r5 != 0) goto L_0x00eb
            if (r3 != 0) goto L_0x00eb
            boolean r5 = r13 instanceof p010b.p026e.p030b.p031k.Barrier
            if (r5 != 0) goto L_0x00eb
            if (r10 != 0) goto L_0x00e8
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r10 = r5
        L_0x00e8:
            r10.add(r13)
        L_0x00eb:
            b.e.b.k.d r5 = r13.f4134J
            b.e.b.k.d r5 = r5.f4106f
            if (r5 != 0) goto L_0x010e
            b.e.b.k.d r5 = r13.f4136L
            b.e.b.k.d r5 = r5.f4106f
            if (r5 != 0) goto L_0x010e
            b.e.b.k.d r5 = r13.f4137M
            b.e.b.k.d r5 = r5.f4106f
            if (r5 != 0) goto L_0x010e
            if (r3 != 0) goto L_0x010e
            boolean r3 = r13 instanceof p010b.p026e.p030b.p031k.Barrier
            if (r3 != 0) goto L_0x010e
            if (r11 != 0) goto L_0x010b
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r11 = r3
        L_0x010b:
            r11.add(r13)
        L_0x010e:
            int r4 = r4 + 1
            r3 = 0
            goto L_0x0039
        L_0x0113:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r6 == 0) goto L_0x0130
            java.util.Iterator r4 = r6.iterator()
        L_0x011e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0130
            java.lang.Object r5 = r4.next()
            b.e.b.k.g r5 = (p010b.p026e.p030b.p031k.Guideline) r5
            r6 = 0
            r13 = 0
            m4908a(r5, r6, r3, r13)
            goto L_0x011e
        L_0x0130:
            r6 = 0
            r13 = 0
            if (r7 == 0) goto L_0x0151
            java.util.Iterator r4 = r7.iterator()
        L_0x0138:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0151
            java.lang.Object r5 = r4.next()
            b.e.b.k.i r5 = (p010b.p026e.p030b.p031k.HelperWidget) r5
            b.e.b.k.m.o r7 = m4908a(r5, r6, r3, r13)
            r5.mo4789a1(r3, r6, r7)
            r7.mo4826b(r3)
            r6 = 0
            r13 = 0
            goto L_0x0138
        L_0x0151:
            b.e.b.k.d$b r4 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.LEFT
            b.e.b.k.d r4 = r0.mo4723m(r4)
            java.util.HashSet r5 = r4.mo4639c()
            if (r5 == 0) goto L_0x0179
            java.util.HashSet r4 = r4.mo4639c()
            java.util.Iterator r4 = r4.iterator()
        L_0x0165:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0179
            java.lang.Object r5 = r4.next()
            b.e.b.k.d r5 = (p010b.p026e.p030b.p031k.ConstraintAnchor) r5
            b.e.b.k.e r5 = r5.f4104d
            r6 = 0
            r7 = 0
            m4908a(r5, r6, r3, r7)
            goto L_0x0165
        L_0x0179:
            b.e.b.k.d$b r4 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.RIGHT
            b.e.b.k.d r4 = r0.mo4723m(r4)
            java.util.HashSet r5 = r4.mo4639c()
            if (r5 == 0) goto L_0x01a1
            java.util.HashSet r4 = r4.mo4639c()
            java.util.Iterator r4 = r4.iterator()
        L_0x018d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01a1
            java.lang.Object r5 = r4.next()
            b.e.b.k.d r5 = (p010b.p026e.p030b.p031k.ConstraintAnchor) r5
            b.e.b.k.e r5 = r5.f4104d
            r6 = 0
            r7 = 0
            m4908a(r5, r6, r3, r7)
            goto L_0x018d
        L_0x01a1:
            b.e.b.k.d$b r4 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.CENTER
            b.e.b.k.d r4 = r0.mo4723m(r4)
            java.util.HashSet r5 = r4.mo4639c()
            if (r5 == 0) goto L_0x01c9
            java.util.HashSet r4 = r4.mo4639c()
            java.util.Iterator r4 = r4.iterator()
        L_0x01b5:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01c9
            java.lang.Object r5 = r4.next()
            b.e.b.k.d r5 = (p010b.p026e.p030b.p031k.ConstraintAnchor) r5
            b.e.b.k.e r5 = r5.f4104d
            r6 = 0
            r7 = 0
            m4908a(r5, r6, r3, r7)
            goto L_0x01b5
        L_0x01c9:
            r6 = 0
            r7 = 0
            if (r10 == 0) goto L_0x01e1
            java.util.Iterator r4 = r10.iterator()
        L_0x01d1:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01e1
            java.lang.Object r5 = r4.next()
            b.e.b.k.e r5 = (p010b.p026e.p030b.p031k.ConstraintWidget) r5
            m4908a(r5, r6, r3, r7)
            goto L_0x01d1
        L_0x01e1:
            if (r8 == 0) goto L_0x01f7
            java.util.Iterator r4 = r8.iterator()
        L_0x01e7:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01f7
            java.lang.Object r5 = r4.next()
            b.e.b.k.g r5 = (p010b.p026e.p030b.p031k.Guideline) r5
            m4908a(r5, r12, r3, r7)
            goto L_0x01e7
        L_0x01f7:
            if (r9 == 0) goto L_0x0215
            java.util.Iterator r4 = r9.iterator()
        L_0x01fd:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0215
            java.lang.Object r5 = r4.next()
            b.e.b.k.i r5 = (p010b.p026e.p030b.p031k.HelperWidget) r5
            b.e.b.k.m.o r6 = m4908a(r5, r12, r3, r7)
            r5.mo4789a1(r3, r12, r6)
            r6.mo4826b(r3)
            r7 = 0
            goto L_0x01fd
        L_0x0215:
            b.e.b.k.d$b r4 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.TOP
            b.e.b.k.d r4 = r0.mo4723m(r4)
            java.util.HashSet r5 = r4.mo4639c()
            if (r5 == 0) goto L_0x023c
            java.util.HashSet r4 = r4.mo4639c()
            java.util.Iterator r4 = r4.iterator()
        L_0x0229:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x023c
            java.lang.Object r5 = r4.next()
            b.e.b.k.d r5 = (p010b.p026e.p030b.p031k.ConstraintAnchor) r5
            b.e.b.k.e r5 = r5.f4104d
            r6 = 0
            m4908a(r5, r12, r3, r6)
            goto L_0x0229
        L_0x023c:
            b.e.b.k.d$b r4 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.BASELINE
            b.e.b.k.d r4 = r0.mo4723m(r4)
            java.util.HashSet r5 = r4.mo4639c()
            if (r5 == 0) goto L_0x0263
            java.util.HashSet r4 = r4.mo4639c()
            java.util.Iterator r4 = r4.iterator()
        L_0x0250:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0263
            java.lang.Object r5 = r4.next()
            b.e.b.k.d r5 = (p010b.p026e.p030b.p031k.ConstraintAnchor) r5
            b.e.b.k.e r5 = r5.f4104d
            r6 = 0
            m4908a(r5, r12, r3, r6)
            goto L_0x0250
        L_0x0263:
            b.e.b.k.d$b r4 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.BOTTOM
            b.e.b.k.d r4 = r0.mo4723m(r4)
            java.util.HashSet r5 = r4.mo4639c()
            if (r5 == 0) goto L_0x028a
            java.util.HashSet r4 = r4.mo4639c()
            java.util.Iterator r4 = r4.iterator()
        L_0x0277:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x028a
            java.lang.Object r5 = r4.next()
            b.e.b.k.d r5 = (p010b.p026e.p030b.p031k.ConstraintAnchor) r5
            b.e.b.k.e r5 = r5.f4104d
            r6 = 0
            m4908a(r5, r12, r3, r6)
            goto L_0x0277
        L_0x028a:
            b.e.b.k.d$b r4 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.CENTER
            b.e.b.k.d r4 = r0.mo4723m(r4)
            java.util.HashSet r5 = r4.mo4639c()
            if (r5 == 0) goto L_0x02b1
            java.util.HashSet r4 = r4.mo4639c()
            java.util.Iterator r4 = r4.iterator()
        L_0x029e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02b1
            java.lang.Object r5 = r4.next()
            b.e.b.k.d r5 = (p010b.p026e.p030b.p031k.ConstraintAnchor) r5
            b.e.b.k.e r5 = r5.f4104d
            r6 = 0
            m4908a(r5, r12, r3, r6)
            goto L_0x029e
        L_0x02b1:
            r6 = 0
            if (r11 == 0) goto L_0x02c8
            java.util.Iterator r4 = r11.iterator()
        L_0x02b8:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02c8
            java.lang.Object r5 = r4.next()
            b.e.b.k.e r5 = (p010b.p026e.p030b.p031k.ConstraintWidget) r5
            m4908a(r5, r12, r3, r6)
            goto L_0x02b8
        L_0x02c8:
            r4 = 0
        L_0x02c9:
            if (r4 >= r2) goto L_0x02f5
            java.lang.Object r5 = r1.get(r4)
            b.e.b.k.e r5 = (p010b.p026e.p030b.p031k.ConstraintWidget) r5
            boolean r6 = r5.mo4714g0()
            if (r6 == 0) goto L_0x02f2
            int r6 = r5.f4125B0
            b.e.b.k.m.o r6 = m4909b(r3, r6)
            int r5 = r5.f4127C0
            b.e.b.k.m.o r5 = m4909b(r3, r5)
            if (r6 == 0) goto L_0x02f2
            if (r5 == 0) goto L_0x02f2
            r7 = 0
            r6.mo4830g(r7, r5)
            r7 = 2
            r5.mo4832i(r7)
            r3.remove(r6)
        L_0x02f2:
            int r4 = r4 + 1
            goto L_0x02c9
        L_0x02f5:
            int r1 = r3.size()
            if (r1 > r12) goto L_0x02fd
            r1 = 0
            return r1
        L_0x02fd:
            b.e.b.k.e$b r1 = r16.mo4747y()
            b.e.b.k.e$b r2 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.WRAP_CONTENT
            if (r1 != r2) goto L_0x033d
            java.util.Iterator r1 = r3.iterator()
            r6 = 0
            r13 = 0
        L_0x030b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x032f
            java.lang.Object r2 = r1.next()
            b.e.b.k.m.o r2 = (p010b.p026e.p030b.p031k.p032m.WidgetGroup) r2
            int r4 = r2.mo4828d()
            if (r4 != r12) goto L_0x031e
            goto L_0x030b
        L_0x031e:
            r4 = 0
            r2.mo4831h(r4)
            b.e.b.d r5 = r16.mo4769t1()
            int r5 = r2.mo4829f(r5, r4)
            if (r5 <= r6) goto L_0x030b
            r13 = r2
            r6 = r5
            goto L_0x030b
        L_0x032f:
            if (r13 == 0) goto L_0x033d
            b.e.b.k.e$b r1 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.FIXED
            r0.mo4750z0(r1)
            r0.mo4698U0(r6)
            r13.mo4831h(r12)
            goto L_0x033e
        L_0x033d:
            r13 = 0
        L_0x033e:
            b.e.b.k.e$b r1 = r16.mo4685O()
            b.e.b.k.e$b r2 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.WRAP_CONTENT
            if (r1 != r2) goto L_0x0380
            java.util.Iterator r1 = r3.iterator()
            r2 = 0
            r6 = 0
        L_0x034c:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0370
            java.lang.Object r3 = r1.next()
            b.e.b.k.m.o r3 = (p010b.p026e.p030b.p031k.p032m.WidgetGroup) r3
            int r4 = r3.mo4828d()
            if (r4 != 0) goto L_0x035f
            goto L_0x034c
        L_0x035f:
            r4 = 0
            r3.mo4831h(r4)
            b.e.b.d r5 = r16.mo4769t1()
            int r5 = r3.mo4829f(r5, r12)
            if (r5 <= r6) goto L_0x034c
            r2 = r3
            r6 = r5
            goto L_0x034c
        L_0x0370:
            r4 = 0
            if (r2 == 0) goto L_0x0381
            b.e.b.k.e$b r1 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.FIXED
            r0.mo4690Q0(r1)
            r0.mo4742v0(r6)
            r2.mo4831h(r12)
            r5 = r2
            goto L_0x0382
        L_0x0380:
            r4 = 0
        L_0x0381:
            r5 = 0
        L_0x0382:
            if (r13 != 0) goto L_0x0389
            if (r5 == 0) goto L_0x0387
            goto L_0x0389
        L_0x0387:
            r3 = 0
            goto L_0x038a
        L_0x0389:
            r3 = 1
        L_0x038a:
            return r3
        L_0x038b:
            r0 = 0
            goto L_0x038e
        L_0x038d:
            throw r0
        L_0x038e:
            goto L_0x038d
        */
        throw new UnsupportedOperationException("Method not decompiled: p010b.p026e.p030b.p031k.p032m.Grouping.m4910c(b.e.b.k.f, b.e.b.k.m.b$b):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0016  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0026 A[ADDED_TO_REGION] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m4911d(p010b.p026e.p030b.p031k.ConstraintWidget.C0561b r5, p010b.p026e.p030b.p031k.ConstraintWidget.C0561b r6, p010b.p026e.p030b.p031k.ConstraintWidget.C0561b r7, p010b.p026e.p030b.p031k.ConstraintWidget.C0561b r8) {
        /*
            b.e.b.k.e$b r0 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.FIXED
            r1 = 0
            r2 = 1
            if (r7 == r0) goto L_0x0013
            b.e.b.k.e$b r3 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.WRAP_CONTENT
            if (r7 == r3) goto L_0x0013
            b.e.b.k.e$b r4 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.MATCH_PARENT
            if (r7 != r4) goto L_0x0011
            if (r5 == r3) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r5 = 0
            goto L_0x0014
        L_0x0013:
            r5 = 1
        L_0x0014:
            if (r8 == r0) goto L_0x0023
            b.e.b.k.e$b r7 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.WRAP_CONTENT
            if (r8 == r7) goto L_0x0023
            b.e.b.k.e$b r0 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.MATCH_PARENT
            if (r8 != r0) goto L_0x0021
            if (r6 == r7) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r6 = 0
            goto L_0x0024
        L_0x0023:
            r6 = 1
        L_0x0024:
            if (r5 != 0) goto L_0x002a
            if (r6 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            return r1
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p010b.p026e.p030b.p031k.p032m.Grouping.m4911d(b.e.b.k.e$b, b.e.b.k.e$b, b.e.b.k.e$b, b.e.b.k.e$b):boolean");
    }
}
