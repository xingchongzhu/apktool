package p010b.p026e.p030b.p031k.p032m;

import java.util.ArrayList;
import java.util.Iterator;
import p010b.p026e.p030b.p031k.ConstraintAnchor;
import p010b.p026e.p030b.p031k.ConstraintWidget;
import p010b.p026e.p030b.p031k.ConstraintWidgetContainer;

/* renamed from: b.e.b.k.m.c */
public class ChainRun extends WidgetRun {

    /* renamed from: k */
    ArrayList<WidgetRun> f4279k = new ArrayList<>();

    /* renamed from: l */
    private int f4280l;

    public ChainRun(ConstraintWidget eVar, int i) {
        super(eVar);
        this.f4346f = i;
        m4870q();
    }

    /* renamed from: q */
    private void m4870q() {
        ConstraintWidget eVar;
        ConstraintWidget eVar2 = this.f4342b;
        ConstraintWidget J = eVar2.mo4675J(this.f4346f);
        while (true) {
            ConstraintWidget eVar3 = J;
            eVar = eVar2;
            eVar2 = eVar3;
            if (eVar2 == null) {
                break;
            }
            J = eVar2.mo4675J(this.f4346f);
        }
        this.f4342b = eVar;
        this.f4279k.add(eVar.mo4679L(this.f4346f));
        ConstraintWidget H = eVar.mo4671H(this.f4346f);
        while (H != null) {
            this.f4279k.add(H.mo4679L(this.f4346f));
            H = H.mo4671H(this.f4346f);
        }
        Iterator it = this.f4279k.iterator();
        while (it.hasNext()) {
            WidgetRun pVar = (WidgetRun) it.next();
            int i = this.f4346f;
            if (i == 0) {
                pVar.f4342b.f4156d = this;
            } else if (i == 1) {
                pVar.f4342b.f4158e = this;
            }
        }
        if ((this.f4346f == 0 && ((ConstraintWidgetContainer) this.f4342b.mo4673I()).mo4773x1()) && this.f4279k.size() > 1) {
            ArrayList<WidgetRun> arrayList = this.f4279k;
            this.f4342b = ((WidgetRun) arrayList.get(arrayList.size() - 1)).f4342b;
        }
        this.f4280l = this.f4346f == 0 ? this.f4342b.mo4745x() : this.f4342b.mo4683N();
    }

    /* renamed from: r */
    private ConstraintWidget m4871r() {
        for (int i = 0; i < this.f4279k.size(); i++) {
            WidgetRun pVar = (WidgetRun) this.f4279k.get(i);
            if (pVar.f4342b.mo4689Q() != 8) {
                return pVar.f4342b;
            }
        }
        return null;
    }

    /* renamed from: s */
    private ConstraintWidget m4872s() {
        for (int size = this.f4279k.size() - 1; size >= 0; size--) {
            WidgetRun pVar = (WidgetRun) this.f4279k.get(size);
            if (pVar.f4342b.mo4689Q() != 8) {
                return pVar.f4342b;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01a6, code lost:
        if (r1 != r7) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01cc, code lost:
        if (r1 != r7) goto L_0x01ce;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00eb  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4799a(p010b.p026e.p030b.p031k.p032m.Dependency r26) {
        /*
            r25 = this;
            r0 = r25
            b.e.b.k.m.f r1 = r0.f4348h
            boolean r1 = r1.f4299j
            if (r1 == 0) goto L_0x0441
            b.e.b.k.m.f r1 = r0.f4349i
            boolean r1 = r1.f4299j
            if (r1 != 0) goto L_0x0010
            goto L_0x0441
        L_0x0010:
            b.e.b.k.e r1 = r0.f4342b
            b.e.b.k.e r1 = r1.mo4673I()
            if (r1 == 0) goto L_0x0023
            boolean r3 = r1 instanceof p010b.p026e.p030b.p031k.ConstraintWidgetContainer
            if (r3 == 0) goto L_0x0023
            b.e.b.k.f r1 = (p010b.p026e.p030b.p031k.ConstraintWidgetContainer) r1
            boolean r1 = r1.mo4773x1()
            goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            b.e.b.k.m.f r3 = r0.f4349i
            int r3 = r3.f4296g
            b.e.b.k.m.f r4 = r0.f4348h
            int r4 = r4.f4296g
            int r3 = r3 - r4
            java.util.ArrayList<b.e.b.k.m.p> r4 = r0.f4279k
            int r4 = r4.size()
            r5 = 0
        L_0x0034:
            r6 = -1
            r7 = 8
            if (r5 >= r4) goto L_0x004c
            java.util.ArrayList<b.e.b.k.m.p> r8 = r0.f4279k
            java.lang.Object r8 = r8.get(r5)
            b.e.b.k.m.p r8 = (p010b.p026e.p030b.p031k.p032m.WidgetRun) r8
            b.e.b.k.e r8 = r8.f4342b
            int r8 = r8.mo4689Q()
            if (r8 != r7) goto L_0x004d
            int r5 = r5 + 1
            goto L_0x0034
        L_0x004c:
            r5 = -1
        L_0x004d:
            int r8 = r4 + -1
            r9 = r8
        L_0x0050:
            if (r9 < 0) goto L_0x0066
            java.util.ArrayList<b.e.b.k.m.p> r10 = r0.f4279k
            java.lang.Object r10 = r10.get(r9)
            b.e.b.k.m.p r10 = (p010b.p026e.p030b.p031k.p032m.WidgetRun) r10
            b.e.b.k.e r10 = r10.f4342b
            int r10 = r10.mo4689Q()
            if (r10 != r7) goto L_0x0065
            int r9 = r9 + -1
            goto L_0x0050
        L_0x0065:
            r6 = r9
        L_0x0066:
            r9 = 0
        L_0x0067:
            r11 = 2
            if (r9 >= r11) goto L_0x010b
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x0071:
            if (r13 >= r4) goto L_0x00fd
            java.util.ArrayList<b.e.b.k.m.p> r2 = r0.f4279k
            java.lang.Object r2 = r2.get(r13)
            b.e.b.k.m.p r2 = (p010b.p026e.p030b.p031k.p032m.WidgetRun) r2
            b.e.b.k.e r11 = r2.f4342b
            int r11 = r11.mo4689Q()
            if (r11 != r7) goto L_0x0085
            goto L_0x00f6
        L_0x0085:
            int r16 = r16 + 1
            if (r13 <= 0) goto L_0x0090
            if (r13 < r5) goto L_0x0090
            b.e.b.k.m.f r11 = r2.f4348h
            int r11 = r11.f4295f
            int r14 = r14 + r11
        L_0x0090:
            b.e.b.k.m.g r11 = r2.f4345e
            int r7 = r11.f4296g
            b.e.b.k.e$b r10 = r2.f4344d
            b.e.b.k.e$b r12 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.MATCH_CONSTRAINT
            if (r10 == r12) goto L_0x009c
            r10 = 1
            goto L_0x009d
        L_0x009c:
            r10 = 0
        L_0x009d:
            if (r10 == 0) goto L_0x00bf
            int r11 = r0.f4346f
            if (r11 != 0) goto L_0x00ae
            b.e.b.k.e r12 = r2.f4342b
            b.e.b.k.m.l r12 = r12.f4160f
            b.e.b.k.m.g r12 = r12.f4345e
            boolean r12 = r12.f4299j
            if (r12 != 0) goto L_0x00ae
            return
        L_0x00ae:
            r12 = 1
            if (r11 != r12) goto L_0x00bc
            b.e.b.k.e r11 = r2.f4342b
            b.e.b.k.m.n r11 = r11.f4162g
            b.e.b.k.m.g r11 = r11.f4345e
            boolean r11 = r11.f4299j
            if (r11 != 0) goto L_0x00bc
            return
        L_0x00bc:
            r19 = r7
            goto L_0x00d5
        L_0x00bf:
            r19 = r7
            r12 = 1
            int r7 = r2.f4341a
            if (r7 != r12) goto L_0x00cd
            if (r9 != 0) goto L_0x00cd
            int r7 = r11.f4311m
            int r15 = r15 + 1
            goto L_0x00d3
        L_0x00cd:
            boolean r7 = r11.f4299j
            if (r7 == 0) goto L_0x00d5
            r7 = r19
        L_0x00d3:
            r10 = 1
            goto L_0x00d7
        L_0x00d5:
            r7 = r19
        L_0x00d7:
            if (r10 != 0) goto L_0x00eb
            int r15 = r15 + 1
            b.e.b.k.e r7 = r2.f4342b
            float[] r7 = r7.f4195w0
            int r10 = r0.f4346f
            r7 = r7[r10]
            r10 = 0
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 < 0) goto L_0x00ec
            float r17 = r17 + r7
            goto L_0x00ec
        L_0x00eb:
            int r14 = r14 + r7
        L_0x00ec:
            if (r13 >= r8) goto L_0x00f6
            if (r13 >= r6) goto L_0x00f6
            b.e.b.k.m.f r2 = r2.f4349i
            int r2 = r2.f4295f
            int r2 = -r2
            int r14 = r14 + r2
        L_0x00f6:
            int r13 = r13 + 1
            r7 = 8
            r11 = 2
            goto L_0x0071
        L_0x00fd:
            if (r14 < r3) goto L_0x0108
            if (r15 != 0) goto L_0x0102
            goto L_0x0108
        L_0x0102:
            int r9 = r9 + 1
            r7 = 8
            goto L_0x0067
        L_0x0108:
            r2 = r16
            goto L_0x0110
        L_0x010b:
            r2 = 0
            r14 = 0
            r15 = 0
            r17 = 0
        L_0x0110:
            b.e.b.k.m.f r7 = r0.f4348h
            int r7 = r7.f4296g
            if (r1 == 0) goto L_0x011a
            b.e.b.k.m.f r7 = r0.f4349i
            int r7 = r7.f4296g
        L_0x011a:
            r9 = 1056964608(0x3f000000, float:0.5)
            if (r14 <= r3) goto L_0x0131
            r10 = 1073741824(0x40000000, float:2.0)
            if (r1 == 0) goto L_0x012a
            int r11 = r14 - r3
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            int r7 = r7 + r10
            goto L_0x0131
        L_0x012a:
            int r11 = r14 - r3
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            int r7 = r7 - r10
        L_0x0131:
            if (r15 <= 0) goto L_0x023f
            int r10 = r3 - r14
            float r10 = (float) r10
            float r11 = (float) r15
            float r11 = r10 / r11
            float r11 = r11 + r9
            int r11 = (int) r11
            r12 = 0
            r13 = 0
        L_0x013d:
            if (r12 >= r4) goto L_0x01f1
            java.util.ArrayList<b.e.b.k.m.p> r9 = r0.f4279k
            java.lang.Object r9 = r9.get(r12)
            b.e.b.k.m.p r9 = (p010b.p026e.p030b.p031k.p032m.WidgetRun) r9
            r19 = r11
            b.e.b.k.e r11 = r9.f4342b
            int r11 = r11.mo4689Q()
            r20 = r14
            r14 = 8
            if (r11 != r14) goto L_0x0157
            goto L_0x01d7
        L_0x0157:
            b.e.b.k.e$b r11 = r9.f4344d
            b.e.b.k.e$b r14 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.MATCH_CONSTRAINT
            if (r11 != r14) goto L_0x01d7
            b.e.b.k.m.g r11 = r9.f4345e
            boolean r14 = r11.f4299j
            if (r14 != 0) goto L_0x01d7
            r14 = 0
            int r18 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r18 <= 0) goto L_0x017b
            b.e.b.k.e r14 = r9.f4342b
            float[] r14 = r14.f4195w0
            r21 = r7
            int r7 = r0.f4346f
            r7 = r14[r7]
            float r7 = r7 * r10
            float r7 = r7 / r17
            r14 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r14
            int r7 = (int) r7
            goto L_0x017f
        L_0x017b:
            r21 = r7
            r7 = r19
        L_0x017f:
            int r14 = r0.f4346f
            if (r14 != 0) goto L_0x01a9
            b.e.b.k.e r14 = r9.f4342b
            r22 = r10
            int r10 = r14.f4190u
            int r14 = r14.f4188t
            r23 = r1
            int r1 = r9.f4341a
            r24 = r2
            r2 = 1
            if (r1 != r2) goto L_0x019b
            int r1 = r11.f4311m
            int r1 = java.lang.Math.min(r7, r1)
            goto L_0x019c
        L_0x019b:
            r1 = r7
        L_0x019c:
            int r1 = java.lang.Math.max(r14, r1)
            if (r10 <= 0) goto L_0x01a6
            int r1 = java.lang.Math.min(r10, r1)
        L_0x01a6:
            if (r1 == r7) goto L_0x01d1
            goto L_0x01ce
        L_0x01a9:
            r23 = r1
            r24 = r2
            r22 = r10
            b.e.b.k.e r1 = r9.f4342b
            int r2 = r1.f4196x
            int r1 = r1.f4194w
            int r10 = r9.f4341a
            r14 = 1
            if (r10 != r14) goto L_0x01c1
            int r10 = r11.f4311m
            int r10 = java.lang.Math.min(r7, r10)
            goto L_0x01c2
        L_0x01c1:
            r10 = r7
        L_0x01c2:
            int r1 = java.lang.Math.max(r1, r10)
            if (r2 <= 0) goto L_0x01cc
            int r1 = java.lang.Math.min(r2, r1)
        L_0x01cc:
            if (r1 == r7) goto L_0x01d1
        L_0x01ce:
            int r13 = r13 + 1
            r7 = r1
        L_0x01d1:
            b.e.b.k.m.g r1 = r9.f4345e
            r1.mo4817d(r7)
            goto L_0x01df
        L_0x01d7:
            r23 = r1
            r24 = r2
            r21 = r7
            r22 = r10
        L_0x01df:
            int r12 = r12 + 1
            r11 = r19
            r14 = r20
            r7 = r21
            r10 = r22
            r1 = r23
            r2 = r24
            r9 = 1056964608(0x3f000000, float:0.5)
            goto L_0x013d
        L_0x01f1:
            r23 = r1
            r24 = r2
            r21 = r7
            r20 = r14
            if (r13 <= 0) goto L_0x0230
            int r15 = r15 - r13
            r1 = 0
            r2 = 0
        L_0x01fe:
            if (r1 >= r4) goto L_0x022e
            java.util.ArrayList<b.e.b.k.m.p> r7 = r0.f4279k
            java.lang.Object r7 = r7.get(r1)
            b.e.b.k.m.p r7 = (p010b.p026e.p030b.p031k.p032m.WidgetRun) r7
            b.e.b.k.e r9 = r7.f4342b
            int r9 = r9.mo4689Q()
            r10 = 8
            if (r9 != r10) goto L_0x0213
            goto L_0x022b
        L_0x0213:
            if (r1 <= 0) goto L_0x021c
            if (r1 < r5) goto L_0x021c
            b.e.b.k.m.f r9 = r7.f4348h
            int r9 = r9.f4295f
            int r2 = r2 + r9
        L_0x021c:
            b.e.b.k.m.g r9 = r7.f4345e
            int r9 = r9.f4296g
            int r2 = r2 + r9
            if (r1 >= r8) goto L_0x022b
            if (r1 >= r6) goto L_0x022b
            b.e.b.k.m.f r7 = r7.f4349i
            int r7 = r7.f4295f
            int r7 = -r7
            int r2 = r2 + r7
        L_0x022b:
            int r1 = r1 + 1
            goto L_0x01fe
        L_0x022e:
            r14 = r2
            goto L_0x0232
        L_0x0230:
            r14 = r20
        L_0x0232:
            int r1 = r0.f4280l
            r2 = 2
            if (r1 != r2) goto L_0x023d
            if (r13 != 0) goto L_0x023d
            r1 = 0
            r0.f4280l = r1
            goto L_0x0249
        L_0x023d:
            r1 = 0
            goto L_0x0249
        L_0x023f:
            r23 = r1
            r24 = r2
            r21 = r7
            r20 = r14
            r1 = 0
            r2 = 2
        L_0x0249:
            if (r14 <= r3) goto L_0x024d
            r0.f4280l = r2
        L_0x024d:
            if (r24 <= 0) goto L_0x0255
            if (r15 != 0) goto L_0x0255
            if (r5 != r6) goto L_0x0255
            r0.f4280l = r2
        L_0x0255:
            int r2 = r0.f4280l
            r7 = 1
            if (r2 != r7) goto L_0x02f9
            r9 = r24
            if (r9 <= r7) goto L_0x0263
            int r3 = r3 - r14
            int r2 = r9 + -1
            int r3 = r3 / r2
            goto L_0x026a
        L_0x0263:
            if (r9 != r7) goto L_0x0269
            int r3 = r3 - r14
            r2 = 2
            int r3 = r3 / r2
            goto L_0x026a
        L_0x0269:
            r3 = 0
        L_0x026a:
            if (r15 <= 0) goto L_0x026d
            r3 = 0
        L_0x026d:
            r7 = r21
            r2 = 0
        L_0x0270:
            if (r2 >= r4) goto L_0x0441
            if (r23 == 0) goto L_0x0279
            int r1 = r2 + 1
            int r1 = r4 - r1
            goto L_0x027a
        L_0x0279:
            r1 = r2
        L_0x027a:
            java.util.ArrayList<b.e.b.k.m.p> r9 = r0.f4279k
            java.lang.Object r1 = r9.get(r1)
            b.e.b.k.m.p r1 = (p010b.p026e.p030b.p031k.p032m.WidgetRun) r1
            b.e.b.k.e r9 = r1.f4342b
            int r9 = r9.mo4689Q()
            r10 = 8
            if (r9 != r10) goto L_0x0297
            b.e.b.k.m.f r9 = r1.f4348h
            r9.mo4817d(r7)
            b.e.b.k.m.f r1 = r1.f4349i
            r1.mo4817d(r7)
            goto L_0x02f5
        L_0x0297:
            if (r2 <= 0) goto L_0x029e
            if (r23 == 0) goto L_0x029d
            int r7 = r7 - r3
            goto L_0x029e
        L_0x029d:
            int r7 = r7 + r3
        L_0x029e:
            if (r2 <= 0) goto L_0x02af
            if (r2 < r5) goto L_0x02af
            if (r23 == 0) goto L_0x02aa
            b.e.b.k.m.f r9 = r1.f4348h
            int r9 = r9.f4295f
            int r7 = r7 - r9
            goto L_0x02af
        L_0x02aa:
            b.e.b.k.m.f r9 = r1.f4348h
            int r9 = r9.f4295f
            int r7 = r7 + r9
        L_0x02af:
            if (r23 == 0) goto L_0x02b7
            b.e.b.k.m.f r9 = r1.f4349i
            r9.mo4817d(r7)
            goto L_0x02bc
        L_0x02b7:
            b.e.b.k.m.f r9 = r1.f4348h
            r9.mo4817d(r7)
        L_0x02bc:
            b.e.b.k.m.g r9 = r1.f4345e
            int r10 = r9.f4296g
            b.e.b.k.e$b r11 = r1.f4344d
            b.e.b.k.e$b r12 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x02cd
            int r11 = r1.f4341a
            r12 = 1
            if (r11 != r12) goto L_0x02cd
            int r10 = r9.f4311m
        L_0x02cd:
            if (r23 == 0) goto L_0x02d1
            int r7 = r7 - r10
            goto L_0x02d2
        L_0x02d1:
            int r7 = r7 + r10
        L_0x02d2:
            if (r23 == 0) goto L_0x02da
            b.e.b.k.m.f r9 = r1.f4348h
            r9.mo4817d(r7)
            goto L_0x02df
        L_0x02da:
            b.e.b.k.m.f r9 = r1.f4349i
            r9.mo4817d(r7)
        L_0x02df:
            r9 = 1
            r1.f4347g = r9
            if (r2 >= r8) goto L_0x02f5
            if (r2 >= r6) goto L_0x02f5
            if (r23 == 0) goto L_0x02ef
            b.e.b.k.m.f r1 = r1.f4349i
            int r1 = r1.f4295f
            int r1 = -r1
            int r7 = r7 - r1
            goto L_0x02f5
        L_0x02ef:
            b.e.b.k.m.f r1 = r1.f4349i
            int r1 = r1.f4295f
            int r1 = -r1
            int r7 = r7 + r1
        L_0x02f5:
            int r2 = r2 + 1
            goto L_0x0270
        L_0x02f9:
            r9 = r24
            if (r2 != 0) goto L_0x0390
            int r3 = r3 - r14
            r2 = 1
            int r7 = r9 + 1
            int r3 = r3 / r7
            if (r15 <= 0) goto L_0x0305
            r3 = 0
        L_0x0305:
            r7 = r21
            r2 = 0
        L_0x0308:
            if (r2 >= r4) goto L_0x0441
            if (r23 == 0) goto L_0x0311
            int r1 = r2 + 1
            int r1 = r4 - r1
            goto L_0x0312
        L_0x0311:
            r1 = r2
        L_0x0312:
            java.util.ArrayList<b.e.b.k.m.p> r9 = r0.f4279k
            java.lang.Object r1 = r9.get(r1)
            b.e.b.k.m.p r1 = (p010b.p026e.p030b.p031k.p032m.WidgetRun) r1
            b.e.b.k.e r9 = r1.f4342b
            int r9 = r9.mo4689Q()
            r10 = 8
            if (r9 != r10) goto L_0x032f
            b.e.b.k.m.f r9 = r1.f4348h
            r9.mo4817d(r7)
            b.e.b.k.m.f r1 = r1.f4349i
            r1.mo4817d(r7)
            goto L_0x038c
        L_0x032f:
            if (r23 == 0) goto L_0x0333
            int r7 = r7 - r3
            goto L_0x0334
        L_0x0333:
            int r7 = r7 + r3
        L_0x0334:
            if (r2 <= 0) goto L_0x0345
            if (r2 < r5) goto L_0x0345
            if (r23 == 0) goto L_0x0340
            b.e.b.k.m.f r9 = r1.f4348h
            int r9 = r9.f4295f
            int r7 = r7 - r9
            goto L_0x0345
        L_0x0340:
            b.e.b.k.m.f r9 = r1.f4348h
            int r9 = r9.f4295f
            int r7 = r7 + r9
        L_0x0345:
            if (r23 == 0) goto L_0x034d
            b.e.b.k.m.f r9 = r1.f4349i
            r9.mo4817d(r7)
            goto L_0x0352
        L_0x034d:
            b.e.b.k.m.f r9 = r1.f4348h
            r9.mo4817d(r7)
        L_0x0352:
            b.e.b.k.m.g r9 = r1.f4345e
            int r10 = r9.f4296g
            b.e.b.k.e$b r11 = r1.f4344d
            b.e.b.k.e$b r12 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x0367
            int r11 = r1.f4341a
            r12 = 1
            if (r11 != r12) goto L_0x0367
            int r9 = r9.f4311m
            int r10 = java.lang.Math.min(r10, r9)
        L_0x0367:
            if (r23 == 0) goto L_0x036b
            int r7 = r7 - r10
            goto L_0x036c
        L_0x036b:
            int r7 = r7 + r10
        L_0x036c:
            if (r23 == 0) goto L_0x0374
            b.e.b.k.m.f r9 = r1.f4348h
            r9.mo4817d(r7)
            goto L_0x0379
        L_0x0374:
            b.e.b.k.m.f r9 = r1.f4349i
            r9.mo4817d(r7)
        L_0x0379:
            if (r2 >= r8) goto L_0x038c
            if (r2 >= r6) goto L_0x038c
            if (r23 == 0) goto L_0x0386
            b.e.b.k.m.f r1 = r1.f4349i
            int r1 = r1.f4295f
            int r1 = -r1
            int r7 = r7 - r1
            goto L_0x038c
        L_0x0386:
            b.e.b.k.m.f r1 = r1.f4349i
            int r1 = r1.f4295f
            int r1 = -r1
            int r7 = r7 + r1
        L_0x038c:
            int r2 = r2 + 1
            goto L_0x0308
        L_0x0390:
            r7 = 2
            if (r2 != r7) goto L_0x0441
            int r2 = r0.f4346f
            if (r2 != 0) goto L_0x039e
            b.e.b.k.e r2 = r0.f4342b
            float r2 = r2.mo4743w()
            goto L_0x03a4
        L_0x039e:
            b.e.b.k.e r2 = r0.f4342b
            float r2 = r2.mo4681M()
        L_0x03a4:
            if (r23 == 0) goto L_0x03aa
            r7 = 1065353216(0x3f800000, float:1.0)
            float r2 = r7 - r2
        L_0x03aa:
            int r3 = r3 - r14
            float r3 = (float) r3
            float r3 = r3 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r2
            int r2 = (int) r3
            if (r2 < 0) goto L_0x03b6
            if (r15 <= 0) goto L_0x03b7
        L_0x03b6:
            r2 = 0
        L_0x03b7:
            if (r23 == 0) goto L_0x03bc
            int r7 = r21 - r2
            goto L_0x03be
        L_0x03bc:
            int r7 = r21 + r2
        L_0x03be:
            r2 = 0
        L_0x03bf:
            if (r2 >= r4) goto L_0x0441
            if (r23 == 0) goto L_0x03c8
            int r1 = r2 + 1
            int r1 = r4 - r1
            goto L_0x03c9
        L_0x03c8:
            r1 = r2
        L_0x03c9:
            java.util.ArrayList<b.e.b.k.m.p> r3 = r0.f4279k
            java.lang.Object r1 = r3.get(r1)
            b.e.b.k.m.p r1 = (p010b.p026e.p030b.p031k.p032m.WidgetRun) r1
            b.e.b.k.e r3 = r1.f4342b
            int r3 = r3.mo4689Q()
            r9 = 8
            if (r3 != r9) goto L_0x03e7
            b.e.b.k.m.f r3 = r1.f4348h
            r3.mo4817d(r7)
            b.e.b.k.m.f r1 = r1.f4349i
            r1.mo4817d(r7)
            r12 = 1
            goto L_0x043d
        L_0x03e7:
            if (r2 <= 0) goto L_0x03f8
            if (r2 < r5) goto L_0x03f8
            if (r23 == 0) goto L_0x03f3
            b.e.b.k.m.f r3 = r1.f4348h
            int r3 = r3.f4295f
            int r7 = r7 - r3
            goto L_0x03f8
        L_0x03f3:
            b.e.b.k.m.f r3 = r1.f4348h
            int r3 = r3.f4295f
            int r7 = r7 + r3
        L_0x03f8:
            if (r23 == 0) goto L_0x0400
            b.e.b.k.m.f r3 = r1.f4349i
            r3.mo4817d(r7)
            goto L_0x0405
        L_0x0400:
            b.e.b.k.m.f r3 = r1.f4348h
            r3.mo4817d(r7)
        L_0x0405:
            b.e.b.k.m.g r3 = r1.f4345e
            int r10 = r3.f4296g
            b.e.b.k.e$b r11 = r1.f4344d
            b.e.b.k.e$b r12 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x0417
            int r11 = r1.f4341a
            r12 = 1
            if (r11 != r12) goto L_0x0418
            int r10 = r3.f4311m
            goto L_0x0418
        L_0x0417:
            r12 = 1
        L_0x0418:
            if (r23 == 0) goto L_0x041c
            int r7 = r7 - r10
            goto L_0x041d
        L_0x041c:
            int r7 = r7 + r10
        L_0x041d:
            if (r23 == 0) goto L_0x0425
            b.e.b.k.m.f r3 = r1.f4348h
            r3.mo4817d(r7)
            goto L_0x042a
        L_0x0425:
            b.e.b.k.m.f r3 = r1.f4349i
            r3.mo4817d(r7)
        L_0x042a:
            if (r2 >= r8) goto L_0x043d
            if (r2 >= r6) goto L_0x043d
            if (r23 == 0) goto L_0x0437
            b.e.b.k.m.f r1 = r1.f4349i
            int r1 = r1.f4295f
            int r1 = -r1
            int r7 = r7 - r1
            goto L_0x043d
        L_0x0437:
            b.e.b.k.m.f r1 = r1.f4349i
            int r1 = r1.f4295f
            int r1 = -r1
            int r7 = r7 + r1
        L_0x043d:
            int r2 = r2 + 1
            goto L_0x03bf
        L_0x0441:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p010b.p026e.p030b.p031k.p032m.ChainRun.mo4799a(b.e.b.k.m.d):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo4800d() {
        Iterator it = this.f4279k.iterator();
        while (it.hasNext()) {
            ((WidgetRun) it.next()).mo4800d();
        }
        int size = this.f4279k.size();
        if (size >= 1) {
            ConstraintWidget eVar = ((WidgetRun) this.f4279k.get(0)).f4342b;
            ConstraintWidget eVar2 = ((WidgetRun) this.f4279k.get(size - 1)).f4342b;
            if (this.f4346f == 0) {
                ConstraintAnchor dVar = eVar.f4133I;
                ConstraintAnchor dVar2 = eVar2.f4135K;
                DependencyNode i = mo4838i(dVar, 0);
                int e = dVar.mo4641e();
                ConstraintWidget r = m4871r();
                if (r != null) {
                    e = r.f4133I.mo4641e();
                }
                if (i != null) {
                    mo4834b(this.f4348h, i, e);
                }
                DependencyNode i2 = mo4838i(dVar2, 0);
                int e2 = dVar2.mo4641e();
                ConstraintWidget s = m4872s();
                if (s != null) {
                    e2 = s.f4135K.mo4641e();
                }
                if (i2 != null) {
                    mo4834b(this.f4349i, i2, -e2);
                }
            } else {
                ConstraintAnchor dVar3 = eVar.f4134J;
                ConstraintAnchor dVar4 = eVar2.f4136L;
                DependencyNode i3 = mo4838i(dVar3, 1);
                int e3 = dVar3.mo4641e();
                ConstraintWidget r2 = m4871r();
                if (r2 != null) {
                    e3 = r2.f4134J.mo4641e();
                }
                if (i3 != null) {
                    mo4834b(this.f4348h, i3, e3);
                }
                DependencyNode i4 = mo4838i(dVar4, 1);
                int e4 = dVar4.mo4641e();
                ConstraintWidget s2 = m4872s();
                if (s2 != null) {
                    e4 = s2.f4136L.mo4641e();
                }
                if (i4 != null) {
                    mo4834b(this.f4349i, i4, -e4);
                }
            }
            this.f4348h.f4290a = this;
            this.f4349i.f4290a = this;
        }
    }

    /* renamed from: e */
    public void mo4801e() {
        for (int i = 0; i < this.f4279k.size(); i++) {
            ((WidgetRun) this.f4279k.get(i)).mo4801e();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo4802f() {
        this.f4343c = null;
        Iterator it = this.f4279k.iterator();
        while (it.hasNext()) {
            ((WidgetRun) it.next()).mo4802f();
        }
    }

    /* renamed from: j */
    public long mo4803j() {
        long j = 0;
        for (int i = 0; i < this.f4279k.size(); i++) {
            WidgetRun pVar = (WidgetRun) this.f4279k.get(i);
            j = j + ((long) pVar.f4348h.f4295f) + pVar.mo4803j() + ((long) pVar.f4349i.f4295f);
        }
        return j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public boolean mo4804m() {
        int size = this.f4279k.size();
        for (int i = 0; i < size; i++) {
            if (!((WidgetRun) this.f4279k.get(i)).mo4804m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChainRun ");
        sb.append(this.f4346f == 0 ? "horizontal : " : "vertical : ");
        String sb2 = sb.toString();
        Iterator it = this.f4279k.iterator();
        while (it.hasNext()) {
            WidgetRun pVar = (WidgetRun) it.next();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append("<");
            String sb4 = sb3.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb4);
            sb5.append(pVar);
            String sb6 = sb5.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append(sb6);
            sb7.append("> ");
            sb2 = sb7.toString();
        }
        return sb2;
    }
}
