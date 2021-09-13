package p010b.p026e.p030b.p031k;

import p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b;

/* renamed from: b.e.b.k.a */
public class Barrier extends HelperWidget {

    /* renamed from: F0 */
    private int f4075F0 = 0;

    /* renamed from: G0 */
    private boolean f4076G0 = true;

    /* renamed from: H0 */
    private int f4077H0 = 0;

    /* renamed from: I0 */
    boolean f4078I0 = false;

    /* renamed from: c1 */
    public boolean mo4622c1() {
        int i;
        int i2 = 0;
        boolean z = true;
        while (true) {
            i = this.f4247E0;
            if (i2 >= i) {
                break;
            }
            ConstraintWidget eVar = this.f4246D0[i2];
            if (this.f4076G0 || eVar.mo4630h()) {
                int i3 = this.f4075F0;
                if (!(i3 == 0 || i3 == 1) || eVar.mo4624e0()) {
                    int i4 = this.f4075F0;
                    if (i4 != 2) {
                        if (i4 != 3) {
                        }
                    }
                    if (eVar.mo4626f0()) {
                    }
                }
                z = false;
            }
            i2++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.f4247E0; i6++) {
            ConstraintWidget eVar2 = this.f4246D0[i6];
            if (this.f4076G0 || eVar2.mo4630h()) {
                if (!z2) {
                    int i7 = this.f4075F0;
                    if (i7 == 0) {
                        i5 = eVar2.mo4723m(C0559b.LEFT).mo4640d();
                    } else if (i7 == 1) {
                        i5 = eVar2.mo4723m(C0559b.RIGHT).mo4640d();
                    } else if (i7 == 2) {
                        i5 = eVar2.mo4723m(C0559b.TOP).mo4640d();
                    } else if (i7 == 3) {
                        i5 = eVar2.mo4723m(C0559b.BOTTOM).mo4640d();
                    }
                    z2 = true;
                }
                int i8 = this.f4075F0;
                if (i8 == 0) {
                    i5 = Math.min(i5, eVar2.mo4723m(C0559b.LEFT).mo4640d());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, eVar2.mo4723m(C0559b.RIGHT).mo4640d());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, eVar2.mo4723m(C0559b.TOP).mo4640d());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, eVar2.mo4723m(C0559b.BOTTOM).mo4640d());
                }
            }
        }
        int i9 = i5 + this.f4077H0;
        int i10 = this.f4075F0;
        if (i10 == 0 || i10 == 1) {
            mo4730p0(i9, i9);
        } else {
            mo4736s0(i9, i9);
        }
        this.f4078I0 = true;
        return true;
    }

    /* renamed from: d1 */
    public boolean mo4623d1() {
        return this.f4076G0;
    }

    /* renamed from: e0 */
    public boolean mo4624e0() {
        return this.f4078I0;
    }

    /* renamed from: e1 */
    public int mo4625e1() {
        return this.f4075F0;
    }

    /* renamed from: f0 */
    public boolean mo4626f0() {
        return this.f4078I0;
    }

    /* renamed from: f1 */
    public int mo4627f1() {
        return this.f4077H0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:75:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x018b  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4628g(p010b.p026e.p030b.LinearSystem r13, boolean r14) {
        /*
            r12 = this;
            b.e.b.k.d[] r14 = r12.f4141Q
            b.e.b.k.d r0 = r12.f4133I
            r1 = 0
            r14[r1] = r0
            b.e.b.k.d r0 = r12.f4134J
            r2 = 2
            r14[r2] = r0
            b.e.b.k.d r0 = r12.f4135K
            r3 = 1
            r14[r3] = r0
            b.e.b.k.d r0 = r12.f4136L
            r4 = 3
            r14[r4] = r0
            r14 = 0
        L_0x0017:
            b.e.b.k.d[] r0 = r12.f4141Q
            int r5 = r0.length
            if (r14 >= r5) goto L_0x0029
            r5 = r0[r14]
            r0 = r0[r14]
            b.e.b.i r0 = r13.mo4595q(r0)
            r5.f4109i = r0
            int r14 = r14 + 1
            goto L_0x0017
        L_0x0029:
            int r14 = r12.f4075F0
            if (r14 < 0) goto L_0x0202
            r5 = 4
            if (r14 >= r5) goto L_0x0202
            r14 = r0[r14]
            boolean r0 = r12.f4078I0
            if (r0 != 0) goto L_0x0039
            r12.mo4622c1()
        L_0x0039:
            boolean r0 = r12.f4078I0
            if (r0 == 0) goto L_0x0070
            r12.f4078I0 = r1
            int r14 = r12.f4075F0
            if (r14 == 0) goto L_0x005d
            if (r14 != r3) goto L_0x0046
            goto L_0x005d
        L_0x0046:
            if (r14 == r2) goto L_0x004a
            if (r14 != r4) goto L_0x006f
        L_0x004a:
            b.e.b.k.d r14 = r12.f4134J
            b.e.b.i r14 = r14.f4109i
            int r0 = r12.f4151a0
            r13.mo4586f(r14, r0)
            b.e.b.k.d r14 = r12.f4136L
            b.e.b.i r14 = r14.f4109i
            int r0 = r12.f4151a0
            r13.mo4586f(r14, r0)
            goto L_0x006f
        L_0x005d:
            b.e.b.k.d r14 = r12.f4133I
            b.e.b.i r14 = r14.f4109i
            int r0 = r12.f4150Z
            r13.mo4586f(r14, r0)
            b.e.b.k.d r14 = r12.f4135K
            b.e.b.i r14 = r14.f4109i
            int r0 = r12.f4150Z
            r13.mo4586f(r14, r0)
        L_0x006f:
            return
        L_0x0070:
            r0 = 0
        L_0x0071:
            int r6 = r12.f4247E0
            if (r0 >= r6) goto L_0x00be
            b.e.b.k.e[] r6 = r12.f4246D0
            r6 = r6[r0]
            boolean r7 = r12.f4076G0
            if (r7 != 0) goto L_0x0084
            boolean r7 = r6.mo4630h()
            if (r7 != 0) goto L_0x0084
            goto L_0x00bb
        L_0x0084:
            int r7 = r12.f4075F0
            if (r7 == 0) goto L_0x008a
            if (r7 != r3) goto L_0x00a0
        L_0x008a:
            b.e.b.k.e$b r7 = r6.mo4747y()
            b.e.b.k.e$b r8 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.MATCH_CONSTRAINT
            if (r7 != r8) goto L_0x00a0
            b.e.b.k.d r7 = r6.f4133I
            b.e.b.k.d r7 = r7.f4106f
            if (r7 == 0) goto L_0x00a0
            b.e.b.k.d r7 = r6.f4135K
            b.e.b.k.d r7 = r7.f4106f
            if (r7 == 0) goto L_0x00a0
        L_0x009e:
            r0 = 1
            goto L_0x00bf
        L_0x00a0:
            int r7 = r12.f4075F0
            if (r7 == r2) goto L_0x00a6
            if (r7 != r4) goto L_0x00bb
        L_0x00a6:
            b.e.b.k.e$b r7 = r6.mo4685O()
            b.e.b.k.e$b r8 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.MATCH_CONSTRAINT
            if (r7 != r8) goto L_0x00bb
            b.e.b.k.d r7 = r6.f4134J
            b.e.b.k.d r7 = r7.f4106f
            if (r7 == 0) goto L_0x00bb
            b.e.b.k.d r6 = r6.f4136L
            b.e.b.k.d r6 = r6.f4106f
            if (r6 == 0) goto L_0x00bb
            goto L_0x009e
        L_0x00bb:
            int r0 = r0 + 1
            goto L_0x0071
        L_0x00be:
            r0 = 0
        L_0x00bf:
            b.e.b.k.d r6 = r12.f4133I
            boolean r6 = r6.mo4647k()
            if (r6 != 0) goto L_0x00d2
            b.e.b.k.d r6 = r12.f4135K
            boolean r6 = r6.mo4647k()
            if (r6 == 0) goto L_0x00d0
            goto L_0x00d2
        L_0x00d0:
            r6 = 0
            goto L_0x00d3
        L_0x00d2:
            r6 = 1
        L_0x00d3:
            b.e.b.k.d r7 = r12.f4134J
            boolean r7 = r7.mo4647k()
            if (r7 != 0) goto L_0x00e6
            b.e.b.k.d r7 = r12.f4136L
            boolean r7 = r7.mo4647k()
            if (r7 == 0) goto L_0x00e4
            goto L_0x00e6
        L_0x00e4:
            r7 = 0
            goto L_0x00e7
        L_0x00e6:
            r7 = 1
        L_0x00e7:
            if (r0 != 0) goto L_0x00fd
            int r8 = r12.f4075F0
            if (r8 != 0) goto L_0x00ef
            if (r6 != 0) goto L_0x00fb
        L_0x00ef:
            if (r8 != r2) goto L_0x00f3
            if (r7 != 0) goto L_0x00fb
        L_0x00f3:
            if (r8 != r3) goto L_0x00f7
            if (r6 != 0) goto L_0x00fb
        L_0x00f7:
            if (r8 != r4) goto L_0x00fd
            if (r7 == 0) goto L_0x00fd
        L_0x00fb:
            r6 = 1
            goto L_0x00fe
        L_0x00fd:
            r6 = 0
        L_0x00fe:
            r7 = 5
            if (r6 != 0) goto L_0x0102
            r7 = 4
        L_0x0102:
            r6 = 0
        L_0x0103:
            int r8 = r12.f4247E0
            if (r6 >= r8) goto L_0x015e
            b.e.b.k.e[] r8 = r12.f4246D0
            r8 = r8[r6]
            boolean r9 = r12.f4076G0
            if (r9 != 0) goto L_0x0116
            boolean r9 = r8.mo4630h()
            if (r9 != 0) goto L_0x0116
            goto L_0x015b
        L_0x0116:
            b.e.b.k.d[] r9 = r8.f4141Q
            int r10 = r12.f4075F0
            r9 = r9[r10]
            b.e.b.i r9 = r13.mo4595q(r9)
            b.e.b.k.d[] r8 = r8.f4141Q
            int r10 = r12.f4075F0
            r11 = r8[r10]
            r11.f4109i = r9
            r11 = r8[r10]
            b.e.b.k.d r11 = r11.f4106f
            if (r11 == 0) goto L_0x013c
            r11 = r8[r10]
            b.e.b.k.d r11 = r11.f4106f
            b.e.b.k.e r11 = r11.f4104d
            if (r11 != r12) goto L_0x013c
            r8 = r8[r10]
            int r8 = r8.f4107g
            int r8 = r8 + r1
            goto L_0x013d
        L_0x013c:
            r8 = 0
        L_0x013d:
            if (r10 == 0) goto L_0x014b
            if (r10 != r2) goto L_0x0142
            goto L_0x014b
        L_0x0142:
            b.e.b.i r10 = r14.f4109i
            int r11 = r12.f4077H0
            int r11 = r11 + r8
            r13.mo4587g(r10, r9, r11, r0)
            goto L_0x0153
        L_0x014b:
            b.e.b.i r10 = r14.f4109i
            int r11 = r12.f4077H0
            int r11 = r11 - r8
            r13.mo4589i(r10, r9, r11, r0)
        L_0x0153:
            b.e.b.i r10 = r14.f4109i
            int r11 = r12.f4077H0
            int r11 = r11 + r8
            r13.mo4585e(r10, r9, r11, r7)
        L_0x015b:
            int r6 = r6 + 1
            goto L_0x0103
        L_0x015e:
            int r14 = r12.f4075F0
            r0 = 8
            if (r14 != 0) goto L_0x018b
            b.e.b.k.d r14 = r12.f4135K
            b.e.b.i r14 = r14.f4109i
            b.e.b.k.d r2 = r12.f4133I
            b.e.b.i r2 = r2.f4109i
            r13.mo4585e(r14, r2, r1, r0)
            b.e.b.k.d r14 = r12.f4133I
            b.e.b.i r14 = r14.f4109i
            b.e.b.k.e r0 = r12.f4145U
            b.e.b.k.d r0 = r0.f4135K
            b.e.b.i r0 = r0.f4109i
            r13.mo4585e(r14, r0, r1, r5)
            b.e.b.k.d r14 = r12.f4133I
            b.e.b.i r14 = r14.f4109i
            b.e.b.k.e r0 = r12.f4145U
            b.e.b.k.d r0 = r0.f4133I
            b.e.b.i r0 = r0.f4109i
            r13.mo4585e(r14, r0, r1, r1)
            goto L_0x0202
        L_0x018b:
            if (r14 != r3) goto L_0x01b3
            b.e.b.k.d r14 = r12.f4133I
            b.e.b.i r14 = r14.f4109i
            b.e.b.k.d r2 = r12.f4135K
            b.e.b.i r2 = r2.f4109i
            r13.mo4585e(r14, r2, r1, r0)
            b.e.b.k.d r14 = r12.f4133I
            b.e.b.i r14 = r14.f4109i
            b.e.b.k.e r0 = r12.f4145U
            b.e.b.k.d r0 = r0.f4133I
            b.e.b.i r0 = r0.f4109i
            r13.mo4585e(r14, r0, r1, r5)
            b.e.b.k.d r14 = r12.f4133I
            b.e.b.i r14 = r14.f4109i
            b.e.b.k.e r0 = r12.f4145U
            b.e.b.k.d r0 = r0.f4135K
            b.e.b.i r0 = r0.f4109i
            r13.mo4585e(r14, r0, r1, r1)
            goto L_0x0202
        L_0x01b3:
            if (r14 != r2) goto L_0x01db
            b.e.b.k.d r14 = r12.f4136L
            b.e.b.i r14 = r14.f4109i
            b.e.b.k.d r2 = r12.f4134J
            b.e.b.i r2 = r2.f4109i
            r13.mo4585e(r14, r2, r1, r0)
            b.e.b.k.d r14 = r12.f4134J
            b.e.b.i r14 = r14.f4109i
            b.e.b.k.e r0 = r12.f4145U
            b.e.b.k.d r0 = r0.f4136L
            b.e.b.i r0 = r0.f4109i
            r13.mo4585e(r14, r0, r1, r5)
            b.e.b.k.d r14 = r12.f4134J
            b.e.b.i r14 = r14.f4109i
            b.e.b.k.e r0 = r12.f4145U
            b.e.b.k.d r0 = r0.f4134J
            b.e.b.i r0 = r0.f4109i
            r13.mo4585e(r14, r0, r1, r1)
            goto L_0x0202
        L_0x01db:
            if (r14 != r4) goto L_0x0202
            b.e.b.k.d r14 = r12.f4134J
            b.e.b.i r14 = r14.f4109i
            b.e.b.k.d r2 = r12.f4136L
            b.e.b.i r2 = r2.f4109i
            r13.mo4585e(r14, r2, r1, r0)
            b.e.b.k.d r14 = r12.f4134J
            b.e.b.i r14 = r14.f4109i
            b.e.b.k.e r0 = r12.f4145U
            b.e.b.k.d r0 = r0.f4134J
            b.e.b.i r0 = r0.f4109i
            r13.mo4585e(r14, r0, r1, r5)
            b.e.b.k.d r14 = r12.f4134J
            b.e.b.i r14 = r14.f4109i
            b.e.b.k.e r0 = r12.f4145U
            b.e.b.k.d r0 = r0.f4136L
            b.e.b.i r0 = r0.f4109i
            r13.mo4585e(r14, r0, r1, r1)
        L_0x0202:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p010b.p026e.p030b.p031k.Barrier.mo4628g(b.e.b.d, boolean):void");
    }

    /* renamed from: g1 */
    public int mo4629g1() {
        int i = this.f4075F0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    /* renamed from: h */
    public boolean mo4630h() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public void mo4631h1() {
        for (int i = 0; i < this.f4247E0; i++) {
            ConstraintWidget eVar = this.f4246D0[i];
            int i2 = this.f4075F0;
            if (i2 == 0 || i2 == 1) {
                eVar.mo4662C0(0, true);
            } else if (i2 == 2 || i2 == 3) {
                eVar.mo4662C0(1, true);
            }
        }
    }

    /* renamed from: i1 */
    public void mo4632i1(boolean z) {
        this.f4076G0 = z;
    }

    /* renamed from: j1 */
    public void mo4633j1(int i) {
        this.f4075F0 = i;
    }

    /* renamed from: k1 */
    public void mo4634k1(int i) {
        this.f4077H0 = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[Barrier] ");
        sb.append(mo4733r());
        sb.append(" {");
        String sb2 = sb.toString();
        for (int i = 0; i < this.f4247E0; i++) {
            ConstraintWidget eVar = this.f4246D0[i];
            if (i > 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append(", ");
                sb2 = sb3.toString();
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb2);
            sb4.append(eVar.mo4733r());
            sb2 = sb4.toString();
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb2);
        sb5.append("}");
        return sb5.toString();
    }
}
