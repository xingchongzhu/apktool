package p010b.p026e.p030b.p031k.p032m;

import p010b.p026e.p030b.p031k.ConstraintAnchor;
import p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b;
import p010b.p026e.p030b.p031k.ConstraintWidget;
import p010b.p026e.p030b.p031k.ConstraintWidget.C0561b;
import p010b.p026e.p030b.p031k.Helper;

/* renamed from: b.e.b.k.m.l */
public class HorizontalWidgetRun extends WidgetRun {

    /* renamed from: k */
    private static int[] f4313k = new int[2];

    /* renamed from: b.e.b.k.m.l$a */
    /* compiled from: HorizontalWidgetRun */
    static /* synthetic */ class C0567a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4314a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                b.e.b.k.m.p$b[] r0 = p010b.p026e.p030b.p031k.p032m.WidgetRun.C0571b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4314a = r0
                b.e.b.k.m.p$b r1 = p010b.p026e.p030b.p031k.p032m.WidgetRun.C0571b.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4314a     // Catch:{ NoSuchFieldError -> 0x001d }
                b.e.b.k.m.p$b r1 = p010b.p026e.p030b.p031k.p032m.WidgetRun.C0571b.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f4314a     // Catch:{ NoSuchFieldError -> 0x0028 }
                b.e.b.k.m.p$b r1 = p010b.p026e.p030b.p031k.p032m.WidgetRun.C0571b.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p010b.p026e.p030b.p031k.p032m.HorizontalWidgetRun.C0567a.<clinit>():void");
        }
    }

    public HorizontalWidgetRun(ConstraintWidget eVar) {
        super(eVar);
        this.f4348h.f4294e = C0566a.LEFT;
        this.f4349i.f4294e = C0566a.RIGHT;
        this.f4346f = 0;
    }

    /* renamed from: q */
    private void m4924q(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 == -1) {
            int i8 = (int) ((((float) i7) * f) + 0.5f);
            int i9 = (int) ((((float) i6) / f) + 0.5f);
            if (i8 <= i6 && i7 <= i7) {
                iArr[0] = i8;
                iArr[1] = i7;
            } else if (i6 <= i6 && i9 <= i7) {
                iArr[0] = i6;
                iArr[1] = i9;
            }
        } else if (i5 == 0) {
            iArr[0] = (int) ((((float) i7) * f) + 0.5f);
            iArr[1] = i7;
        } else if (i5 == 1) {
            int i10 = (int) ((((float) i6) * f) + 0.5f);
            iArr[0] = i6;
            iArr[1] = i10;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02bc, code lost:
        if (r14 != 1) goto L_0x0324;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4799a(p010b.p026e.p030b.p031k.p032m.Dependency r17) {
        /*
            r16 = this;
            r8 = r16
            int[] r0 = p010b.p026e.p030b.p031k.p032m.HorizontalWidgetRun.C0567a.f4314a
            b.e.b.k.m.p$b r1 = r8.f4350j
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 3
            r9 = 1
            r10 = 0
            if (r0 == r9) goto L_0x0029
            if (r0 == r1) goto L_0x0023
            if (r0 == r2) goto L_0x0017
            goto L_0x002e
        L_0x0017:
            b.e.b.k.e r0 = r8.f4342b
            b.e.b.k.d r1 = r0.f4133I
            b.e.b.k.d r0 = r0.f4135K
            r3 = r17
            r8.mo4840n(r3, r1, r0, r10)
            return
        L_0x0023:
            r3 = r17
            r16.mo4841o(r17)
            goto L_0x002e
        L_0x0029:
            r3 = r17
            r16.mo4842p(r17)
        L_0x002e:
            b.e.b.k.m.g r0 = r8.f4345e
            boolean r0 = r0.f4299j
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r0 != 0) goto L_0x0324
            b.e.b.k.e$b r0 = r8.f4344d
            b.e.b.k.e$b r3 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.MATCH_CONSTRAINT
            if (r0 != r3) goto L_0x0324
            b.e.b.k.e r0 = r8.f4342b
            int r3 = r0.f4182q
            if (r3 == r1) goto L_0x0306
            if (r3 == r2) goto L_0x0046
            goto L_0x0324
        L_0x0046:
            int r1 = r0.f4184r
            r3 = -1
            if (r1 == 0) goto L_0x008f
            if (r1 != r2) goto L_0x004e
            goto L_0x008f
        L_0x004e:
            int r0 = r0.mo4739u()
            if (r0 == r3) goto L_0x0077
            if (r0 == 0) goto L_0x0068
            if (r0 == r9) goto L_0x005a
            r0 = 0
            goto L_0x0088
        L_0x005a:
            b.e.b.k.e r0 = r8.f4342b
            b.e.b.k.m.n r1 = r0.f4162g
            b.e.b.k.m.g r1 = r1.f4345e
            int r1 = r1.f4296g
            float r1 = (float) r1
            float r0 = r0.mo4737t()
            goto L_0x0084
        L_0x0068:
            b.e.b.k.e r0 = r8.f4342b
            b.e.b.k.m.n r1 = r0.f4162g
            b.e.b.k.m.g r1 = r1.f4345e
            int r1 = r1.f4296g
            float r1 = (float) r1
            float r0 = r0.mo4737t()
            float r1 = r1 / r0
            goto L_0x0086
        L_0x0077:
            b.e.b.k.e r0 = r8.f4342b
            b.e.b.k.m.n r1 = r0.f4162g
            b.e.b.k.m.g r1 = r1.f4345e
            int r1 = r1.f4296g
            float r1 = (float) r1
            float r0 = r0.mo4737t()
        L_0x0084:
            float r1 = r1 * r0
        L_0x0086:
            float r1 = r1 + r11
            int r0 = (int) r1
        L_0x0088:
            b.e.b.k.m.g r1 = r8.f4345e
            r1.mo4817d(r0)
            goto L_0x0324
        L_0x008f:
            b.e.b.k.m.n r1 = r0.f4162g
            b.e.b.k.m.f r12 = r1.f4348h
            b.e.b.k.m.f r13 = r1.f4349i
            b.e.b.k.d r1 = r0.f4133I
            b.e.b.k.d r1 = r1.f4106f
            if (r1 == 0) goto L_0x009d
            r1 = 1
            goto L_0x009e
        L_0x009d:
            r1 = 0
        L_0x009e:
            b.e.b.k.d r2 = r0.f4134J
            b.e.b.k.d r2 = r2.f4106f
            if (r2 == 0) goto L_0x00a6
            r2 = 1
            goto L_0x00a7
        L_0x00a6:
            r2 = 0
        L_0x00a7:
            b.e.b.k.d r4 = r0.f4135K
            b.e.b.k.d r4 = r4.f4106f
            if (r4 == 0) goto L_0x00af
            r4 = 1
            goto L_0x00b0
        L_0x00af:
            r4 = 0
        L_0x00b0:
            b.e.b.k.d r5 = r0.f4136L
            b.e.b.k.d r5 = r5.f4106f
            if (r5 == 0) goto L_0x00b8
            r5 = 1
            goto L_0x00b9
        L_0x00b8:
            r5 = 0
        L_0x00b9:
            int r14 = r0.mo4739u()
            if (r1 == 0) goto L_0x0200
            if (r2 == 0) goto L_0x0200
            if (r4 == 0) goto L_0x0200
            if (r5 == 0) goto L_0x0200
            b.e.b.k.e r0 = r8.f4342b
            float r15 = r0.mo4737t()
            boolean r0 = r12.f4299j
            if (r0 == 0) goto L_0x012e
            boolean r0 = r13.f4299j
            if (r0 == 0) goto L_0x012e
            b.e.b.k.m.f r0 = r8.f4348h
            boolean r1 = r0.f4292c
            if (r1 == 0) goto L_0x012d
            b.e.b.k.m.f r1 = r8.f4349i
            boolean r1 = r1.f4292c
            if (r1 != 0) goto L_0x00e0
            goto L_0x012d
        L_0x00e0:
            java.util.List<b.e.b.k.m.f> r0 = r0.f4301l
            java.lang.Object r0 = r0.get(r10)
            b.e.b.k.m.f r0 = (p010b.p026e.p030b.p031k.p032m.DependencyNode) r0
            int r0 = r0.f4296g
            b.e.b.k.m.f r1 = r8.f4348h
            int r1 = r1.f4295f
            int r2 = r0 + r1
            b.e.b.k.m.f r0 = r8.f4349i
            java.util.List<b.e.b.k.m.f> r0 = r0.f4301l
            java.lang.Object r0 = r0.get(r10)
            b.e.b.k.m.f r0 = (p010b.p026e.p030b.p031k.p032m.DependencyNode) r0
            int r0 = r0.f4296g
            b.e.b.k.m.f r1 = r8.f4349i
            int r1 = r1.f4295f
            int r3 = r0 - r1
            int r0 = r12.f4296g
            int r1 = r12.f4295f
            int r4 = r0 + r1
            int r0 = r13.f4296g
            int r1 = r13.f4295f
            int r5 = r0 - r1
            int[] r1 = f4313k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.m4924q(r1, r2, r3, r4, r5, r6, r7)
            b.e.b.k.m.g r0 = r8.f4345e
            int[] r1 = f4313k
            r1 = r1[r10]
            r0.mo4817d(r1)
            b.e.b.k.e r0 = r8.f4342b
            b.e.b.k.m.n r0 = r0.f4162g
            b.e.b.k.m.g r0 = r0.f4345e
            int[] r1 = f4313k
            r1 = r1[r9]
            r0.mo4817d(r1)
        L_0x012d:
            return
        L_0x012e:
            b.e.b.k.m.f r0 = r8.f4348h
            boolean r1 = r0.f4299j
            if (r1 == 0) goto L_0x018b
            b.e.b.k.m.f r1 = r8.f4349i
            boolean r2 = r1.f4299j
            if (r2 == 0) goto L_0x018b
            boolean r2 = r12.f4292c
            if (r2 == 0) goto L_0x018a
            boolean r2 = r13.f4292c
            if (r2 != 0) goto L_0x0143
            goto L_0x018a
        L_0x0143:
            int r2 = r0.f4296g
            int r0 = r0.f4295f
            int r2 = r2 + r0
            int r0 = r1.f4296g
            int r1 = r1.f4295f
            int r3 = r0 - r1
            java.util.List<b.e.b.k.m.f> r0 = r12.f4301l
            java.lang.Object r0 = r0.get(r10)
            b.e.b.k.m.f r0 = (p010b.p026e.p030b.p031k.p032m.DependencyNode) r0
            int r0 = r0.f4296g
            int r1 = r12.f4295f
            int r4 = r0 + r1
            java.util.List<b.e.b.k.m.f> r0 = r13.f4301l
            java.lang.Object r0 = r0.get(r10)
            b.e.b.k.m.f r0 = (p010b.p026e.p030b.p031k.p032m.DependencyNode) r0
            int r0 = r0.f4296g
            int r1 = r13.f4295f
            int r5 = r0 - r1
            int[] r1 = f4313k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.m4924q(r1, r2, r3, r4, r5, r6, r7)
            b.e.b.k.m.g r0 = r8.f4345e
            int[] r1 = f4313k
            r1 = r1[r10]
            r0.mo4817d(r1)
            b.e.b.k.e r0 = r8.f4342b
            b.e.b.k.m.n r0 = r0.f4162g
            b.e.b.k.m.g r0 = r0.f4345e
            int[] r1 = f4313k
            r1 = r1[r9]
            r0.mo4817d(r1)
            goto L_0x018b
        L_0x018a:
            return
        L_0x018b:
            b.e.b.k.m.f r0 = r8.f4348h
            boolean r1 = r0.f4292c
            if (r1 == 0) goto L_0x01ff
            b.e.b.k.m.f r1 = r8.f4349i
            boolean r1 = r1.f4292c
            if (r1 == 0) goto L_0x01ff
            boolean r1 = r12.f4292c
            if (r1 == 0) goto L_0x01ff
            boolean r1 = r13.f4292c
            if (r1 != 0) goto L_0x01a0
            goto L_0x01ff
        L_0x01a0:
            java.util.List<b.e.b.k.m.f> r0 = r0.f4301l
            java.lang.Object r0 = r0.get(r10)
            b.e.b.k.m.f r0 = (p010b.p026e.p030b.p031k.p032m.DependencyNode) r0
            int r0 = r0.f4296g
            b.e.b.k.m.f r1 = r8.f4348h
            int r1 = r1.f4295f
            int r2 = r0 + r1
            b.e.b.k.m.f r0 = r8.f4349i
            java.util.List<b.e.b.k.m.f> r0 = r0.f4301l
            java.lang.Object r0 = r0.get(r10)
            b.e.b.k.m.f r0 = (p010b.p026e.p030b.p031k.p032m.DependencyNode) r0
            int r0 = r0.f4296g
            b.e.b.k.m.f r1 = r8.f4349i
            int r1 = r1.f4295f
            int r3 = r0 - r1
            java.util.List<b.e.b.k.m.f> r0 = r12.f4301l
            java.lang.Object r0 = r0.get(r10)
            b.e.b.k.m.f r0 = (p010b.p026e.p030b.p031k.p032m.DependencyNode) r0
            int r0 = r0.f4296g
            int r1 = r12.f4295f
            int r4 = r0 + r1
            java.util.List<b.e.b.k.m.f> r0 = r13.f4301l
            java.lang.Object r0 = r0.get(r10)
            b.e.b.k.m.f r0 = (p010b.p026e.p030b.p031k.p032m.DependencyNode) r0
            int r0 = r0.f4296g
            int r1 = r13.f4295f
            int r5 = r0 - r1
            int[] r1 = f4313k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.m4924q(r1, r2, r3, r4, r5, r6, r7)
            b.e.b.k.m.g r0 = r8.f4345e
            int[] r1 = f4313k
            r1 = r1[r10]
            r0.mo4817d(r1)
            b.e.b.k.e r0 = r8.f4342b
            b.e.b.k.m.n r0 = r0.f4162g
            b.e.b.k.m.g r0 = r0.f4345e
            int[] r1 = f4313k
            r1 = r1[r9]
            r0.mo4817d(r1)
            goto L_0x0324
        L_0x01ff:
            return
        L_0x0200:
            if (r1 == 0) goto L_0x028b
            if (r4 == 0) goto L_0x028b
            b.e.b.k.m.f r0 = r8.f4348h
            boolean r0 = r0.f4292c
            if (r0 == 0) goto L_0x028a
            b.e.b.k.m.f r0 = r8.f4349i
            boolean r0 = r0.f4292c
            if (r0 != 0) goto L_0x0212
            goto L_0x028a
        L_0x0212:
            b.e.b.k.e r0 = r8.f4342b
            float r0 = r0.mo4737t()
            b.e.b.k.m.f r1 = r8.f4348h
            java.util.List<b.e.b.k.m.f> r1 = r1.f4301l
            java.lang.Object r1 = r1.get(r10)
            b.e.b.k.m.f r1 = (p010b.p026e.p030b.p031k.p032m.DependencyNode) r1
            int r1 = r1.f4296g
            b.e.b.k.m.f r2 = r8.f4348h
            int r2 = r2.f4295f
            int r1 = r1 + r2
            b.e.b.k.m.f r2 = r8.f4349i
            java.util.List<b.e.b.k.m.f> r2 = r2.f4301l
            java.lang.Object r2 = r2.get(r10)
            b.e.b.k.m.f r2 = (p010b.p026e.p030b.p031k.p032m.DependencyNode) r2
            int r2 = r2.f4296g
            b.e.b.k.m.f r4 = r8.f4349i
            int r4 = r4.f4295f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x0266
            if (r14 == 0) goto L_0x0266
            if (r14 == r9) goto L_0x0242
            goto L_0x0324
        L_0x0242:
            int r2 = r2 - r1
            int r1 = r8.mo4836g(r2, r10)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo4836g(r2, r9)
            if (r2 == r3) goto L_0x0256
            float r1 = (float) r3
            float r1 = r1 * r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x0256:
            b.e.b.k.m.g r0 = r8.f4345e
            r0.mo4817d(r1)
            b.e.b.k.e r0 = r8.f4342b
            b.e.b.k.m.n r0 = r0.f4162g
            b.e.b.k.m.g r0 = r0.f4345e
            r0.mo4817d(r3)
            goto L_0x0324
        L_0x0266:
            int r2 = r2 - r1
            int r1 = r8.mo4836g(r2, r10)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo4836g(r2, r9)
            if (r2 == r3) goto L_0x027a
            float r1 = (float) r3
            float r1 = r1 / r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x027a:
            b.e.b.k.m.g r0 = r8.f4345e
            r0.mo4817d(r1)
            b.e.b.k.e r0 = r8.f4342b
            b.e.b.k.m.n r0 = r0.f4162g
            b.e.b.k.m.g r0 = r0.f4345e
            r0.mo4817d(r3)
            goto L_0x0324
        L_0x028a:
            return
        L_0x028b:
            if (r2 == 0) goto L_0x0324
            if (r5 == 0) goto L_0x0324
            boolean r0 = r12.f4292c
            if (r0 == 0) goto L_0x0305
            boolean r0 = r13.f4292c
            if (r0 != 0) goto L_0x0298
            goto L_0x0305
        L_0x0298:
            b.e.b.k.e r0 = r8.f4342b
            float r0 = r0.mo4737t()
            java.util.List<b.e.b.k.m.f> r1 = r12.f4301l
            java.lang.Object r1 = r1.get(r10)
            b.e.b.k.m.f r1 = (p010b.p026e.p030b.p031k.p032m.DependencyNode) r1
            int r1 = r1.f4296g
            int r2 = r12.f4295f
            int r1 = r1 + r2
            java.util.List<b.e.b.k.m.f> r2 = r13.f4301l
            java.lang.Object r2 = r2.get(r10)
            b.e.b.k.m.f r2 = (p010b.p026e.p030b.p031k.p032m.DependencyNode) r2
            int r2 = r2.f4296g
            int r4 = r13.f4295f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x02e2
            if (r14 == 0) goto L_0x02bf
            if (r14 == r9) goto L_0x02e2
            goto L_0x0324
        L_0x02bf:
            int r2 = r2 - r1
            int r1 = r8.mo4836g(r2, r9)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo4836g(r2, r10)
            if (r2 == r3) goto L_0x02d3
            float r1 = (float) r3
            float r1 = r1 / r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x02d3:
            b.e.b.k.m.g r0 = r8.f4345e
            r0.mo4817d(r3)
            b.e.b.k.e r0 = r8.f4342b
            b.e.b.k.m.n r0 = r0.f4162g
            b.e.b.k.m.g r0 = r0.f4345e
            r0.mo4817d(r1)
            goto L_0x0324
        L_0x02e2:
            int r2 = r2 - r1
            int r1 = r8.mo4836g(r2, r9)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo4836g(r2, r10)
            if (r2 == r3) goto L_0x02f6
            float r1 = (float) r3
            float r1 = r1 * r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x02f6:
            b.e.b.k.m.g r0 = r8.f4345e
            r0.mo4817d(r3)
            b.e.b.k.e r0 = r8.f4342b
            b.e.b.k.m.n r0 = r0.f4162g
            b.e.b.k.m.g r0 = r0.f4345e
            r0.mo4817d(r1)
            goto L_0x0324
        L_0x0305:
            return
        L_0x0306:
            b.e.b.k.e r0 = r0.mo4673I()
            if (r0 == 0) goto L_0x0324
            b.e.b.k.m.l r0 = r0.f4160f
            b.e.b.k.m.g r0 = r0.f4345e
            boolean r1 = r0.f4299j
            if (r1 == 0) goto L_0x0324
            b.e.b.k.e r1 = r8.f4342b
            float r1 = r1.f4192v
            int r0 = r0.f4296g
            float r0 = (float) r0
            float r0 = r0 * r1
            float r0 = r0 + r11
            int r0 = (int) r0
            b.e.b.k.m.g r1 = r8.f4345e
            r1.mo4817d(r0)
        L_0x0324:
            b.e.b.k.m.f r0 = r8.f4348h
            boolean r1 = r0.f4292c
            if (r1 == 0) goto L_0x0446
            b.e.b.k.m.f r1 = r8.f4349i
            boolean r2 = r1.f4292c
            if (r2 != 0) goto L_0x0332
            goto L_0x0446
        L_0x0332:
            boolean r0 = r0.f4299j
            if (r0 == 0) goto L_0x0341
            boolean r0 = r1.f4299j
            if (r0 == 0) goto L_0x0341
            b.e.b.k.m.g r0 = r8.f4345e
            boolean r0 = r0.f4299j
            if (r0 == 0) goto L_0x0341
            return
        L_0x0341:
            b.e.b.k.m.g r0 = r8.f4345e
            boolean r0 = r0.f4299j
            if (r0 != 0) goto L_0x038b
            b.e.b.k.e$b r0 = r8.f4344d
            b.e.b.k.e$b r1 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x038b
            b.e.b.k.e r0 = r8.f4342b
            int r1 = r0.f4182q
            if (r1 != 0) goto L_0x038b
            boolean r0 = r0.mo4706Z()
            if (r0 != 0) goto L_0x038b
            b.e.b.k.m.f r0 = r8.f4348h
            java.util.List<b.e.b.k.m.f> r0 = r0.f4301l
            java.lang.Object r0 = r0.get(r10)
            b.e.b.k.m.f r0 = (p010b.p026e.p030b.p031k.p032m.DependencyNode) r0
            b.e.b.k.m.f r1 = r8.f4349i
            java.util.List<b.e.b.k.m.f> r1 = r1.f4301l
            java.lang.Object r1 = r1.get(r10)
            b.e.b.k.m.f r1 = (p010b.p026e.p030b.p031k.p032m.DependencyNode) r1
            int r0 = r0.f4296g
            b.e.b.k.m.f r2 = r8.f4348h
            int r3 = r2.f4295f
            int r0 = r0 + r3
            int r1 = r1.f4296g
            b.e.b.k.m.f r3 = r8.f4349i
            int r3 = r3.f4295f
            int r1 = r1 + r3
            int r3 = r1 - r0
            r2.mo4817d(r0)
            b.e.b.k.m.f r0 = r8.f4349i
            r0.mo4817d(r1)
            b.e.b.k.m.g r0 = r8.f4345e
            r0.mo4817d(r3)
            return
        L_0x038b:
            b.e.b.k.m.g r0 = r8.f4345e
            boolean r0 = r0.f4299j
            if (r0 != 0) goto L_0x03ef
            b.e.b.k.e$b r0 = r8.f4344d
            b.e.b.k.e$b r1 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x03ef
            int r0 = r8.f4341a
            if (r0 != r9) goto L_0x03ef
            b.e.b.k.m.f r0 = r8.f4348h
            java.util.List<b.e.b.k.m.f> r0 = r0.f4301l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03ef
            b.e.b.k.m.f r0 = r8.f4349i
            java.util.List<b.e.b.k.m.f> r0 = r0.f4301l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03ef
            b.e.b.k.m.f r0 = r8.f4348h
            java.util.List<b.e.b.k.m.f> r0 = r0.f4301l
            java.lang.Object r0 = r0.get(r10)
            b.e.b.k.m.f r0 = (p010b.p026e.p030b.p031k.p032m.DependencyNode) r0
            b.e.b.k.m.f r1 = r8.f4349i
            java.util.List<b.e.b.k.m.f> r1 = r1.f4301l
            java.lang.Object r1 = r1.get(r10)
            b.e.b.k.m.f r1 = (p010b.p026e.p030b.p031k.p032m.DependencyNode) r1
            int r0 = r0.f4296g
            b.e.b.k.m.f r2 = r8.f4348h
            int r2 = r2.f4295f
            int r0 = r0 + r2
            int r1 = r1.f4296g
            b.e.b.k.m.f r2 = r8.f4349i
            int r2 = r2.f4295f
            int r1 = r1 + r2
            int r1 = r1 - r0
            b.e.b.k.m.g r0 = r8.f4345e
            int r0 = r0.f4311m
            int r0 = java.lang.Math.min(r1, r0)
            b.e.b.k.e r1 = r8.f4342b
            int r2 = r1.f4190u
            int r1 = r1.f4188t
            int r0 = java.lang.Math.max(r1, r0)
            if (r2 <= 0) goto L_0x03ea
            int r0 = java.lang.Math.min(r2, r0)
        L_0x03ea:
            b.e.b.k.m.g r1 = r8.f4345e
            r1.mo4817d(r0)
        L_0x03ef:
            b.e.b.k.m.g r0 = r8.f4345e
            boolean r0 = r0.f4299j
            if (r0 != 0) goto L_0x03f6
            return
        L_0x03f6:
            b.e.b.k.m.f r0 = r8.f4348h
            java.util.List<b.e.b.k.m.f> r0 = r0.f4301l
            java.lang.Object r0 = r0.get(r10)
            b.e.b.k.m.f r0 = (p010b.p026e.p030b.p031k.p032m.DependencyNode) r0
            b.e.b.k.m.f r1 = r8.f4349i
            java.util.List<b.e.b.k.m.f> r1 = r1.f4301l
            java.lang.Object r1 = r1.get(r10)
            b.e.b.k.m.f r1 = (p010b.p026e.p030b.p031k.p032m.DependencyNode) r1
            int r2 = r0.f4296g
            b.e.b.k.m.f r3 = r8.f4348h
            int r3 = r3.f4295f
            int r2 = r2 + r3
            int r3 = r1.f4296g
            b.e.b.k.m.f r4 = r8.f4349i
            int r4 = r4.f4295f
            int r3 = r3 + r4
            b.e.b.k.e r4 = r8.f4342b
            float r4 = r4.mo4743w()
            if (r0 != r1) goto L_0x0426
            int r2 = r0.f4296g
            int r3 = r1.f4296g
            r4 = 1056964608(0x3f000000, float:0.5)
        L_0x0426:
            int r3 = r3 - r2
            b.e.b.k.m.g r0 = r8.f4345e
            int r0 = r0.f4296g
            int r3 = r3 - r0
            b.e.b.k.m.f r0 = r8.f4348h
            float r1 = (float) r2
            float r1 = r1 + r11
            float r2 = (float) r3
            float r2 = r2 * r4
            float r1 = r1 + r2
            int r1 = (int) r1
            r0.mo4817d(r1)
            b.e.b.k.m.f r0 = r8.f4349i
            b.e.b.k.m.f r1 = r8.f4348h
            int r1 = r1.f4296g
            b.e.b.k.m.g r2 = r8.f4345e
            int r2 = r2.f4296g
            int r1 = r1 + r2
            r0.mo4817d(r1)
        L_0x0446:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p010b.p026e.p030b.p031k.p032m.HorizontalWidgetRun.mo4799a(b.e.b.k.m.d):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo4800d() {
        ConstraintWidget eVar = this.f4342b;
        if (eVar.f4152b) {
            this.f4345e.mo4817d(eVar.mo4691R());
        }
        if (!this.f4345e.f4299j) {
            C0561b y = this.f4342b.mo4747y();
            this.f4344d = y;
            if (y != C0561b.MATCH_CONSTRAINT) {
                C0561b bVar = C0561b.MATCH_PARENT;
                if (y == bVar) {
                    ConstraintWidget I = this.f4342b.mo4673I();
                    if ((I != null && I.mo4747y() == C0561b.FIXED) || I.mo4747y() == bVar) {
                        int R = (I.mo4691R() - this.f4342b.f4133I.mo4641e()) - this.f4342b.f4135K.mo4641e();
                        mo4834b(this.f4348h, I.f4160f.f4348h, this.f4342b.f4133I.mo4641e());
                        mo4834b(this.f4349i, I.f4160f.f4349i, -this.f4342b.f4135K.mo4641e());
                        this.f4345e.mo4817d(R);
                        return;
                    }
                }
                if (this.f4344d == C0561b.FIXED) {
                    this.f4345e.mo4817d(this.f4342b.mo4691R());
                }
            }
        } else {
            C0561b bVar2 = this.f4344d;
            C0561b bVar3 = C0561b.MATCH_PARENT;
            if (bVar2 == bVar3) {
                ConstraintWidget I2 = this.f4342b.mo4673I();
                if ((I2 != null && I2.mo4747y() == C0561b.FIXED) || I2.mo4747y() == bVar3) {
                    mo4834b(this.f4348h, I2.f4160f.f4348h, this.f4342b.f4133I.mo4641e());
                    mo4834b(this.f4349i, I2.f4160f.f4349i, -this.f4342b.f4135K.mo4641e());
                    return;
                }
            }
        }
        DimensionDependency gVar = this.f4345e;
        if (gVar.f4299j) {
            ConstraintWidget eVar2 = this.f4342b;
            if (eVar2.f4152b) {
                ConstraintAnchor[] dVarArr = eVar2.f4141Q;
                if (dVarArr[0].f4106f == null || dVarArr[1].f4106f == null) {
                    if (dVarArr[0].f4106f != null) {
                        DependencyNode h = mo4837h(dVarArr[0]);
                        if (h != null) {
                            mo4834b(this.f4348h, h, this.f4342b.f4141Q[0].mo4641e());
                            mo4834b(this.f4349i, this.f4348h, this.f4345e.f4296g);
                        }
                    } else if (dVarArr[1].f4106f != null) {
                        DependencyNode h2 = mo4837h(dVarArr[1]);
                        if (h2 != null) {
                            mo4834b(this.f4349i, h2, -this.f4342b.f4141Q[1].mo4641e());
                            mo4834b(this.f4348h, this.f4349i, -this.f4345e.f4296g);
                        }
                    } else if (!(eVar2 instanceof Helper) && eVar2.mo4673I() != null && this.f4342b.mo4723m(C0559b.CENTER).f4106f == null) {
                        mo4834b(this.f4348h, this.f4342b.mo4673I().f4160f.f4348h, this.f4342b.mo4693S());
                        mo4834b(this.f4349i, this.f4348h, this.f4345e.f4296g);
                    }
                }
                if (eVar2.mo4706Z()) {
                    this.f4348h.f4295f = this.f4342b.f4141Q[0].mo4641e();
                    this.f4349i.f4295f = -this.f4342b.f4141Q[1].mo4641e();
                } else {
                    DependencyNode h3 = mo4837h(this.f4342b.f4141Q[0]);
                    if (h3 != null) {
                        mo4834b(this.f4348h, h3, this.f4342b.f4141Q[0].mo4641e());
                    }
                    DependencyNode h4 = mo4837h(this.f4342b.f4141Q[1]);
                    if (h4 != null) {
                        mo4834b(this.f4349i, h4, -this.f4342b.f4141Q[1].mo4641e());
                    }
                    this.f4348h.f4291b = true;
                    this.f4349i.f4291b = true;
                }
            }
        }
        if (this.f4344d == C0561b.MATCH_CONSTRAINT) {
            ConstraintWidget eVar3 = this.f4342b;
            int i = eVar3.f4182q;
            if (i == 2) {
                ConstraintWidget I3 = eVar3.mo4673I();
                if (I3 != null) {
                    DimensionDependency gVar2 = I3.f4162g.f4345e;
                    this.f4345e.f4301l.add(gVar2);
                    gVar2.f4300k.add(this.f4345e);
                    DimensionDependency gVar3 = this.f4345e;
                    gVar3.f4291b = true;
                    gVar3.f4300k.add(this.f4348h);
                    this.f4345e.f4300k.add(this.f4349i);
                }
            } else if (i == 3) {
                if (eVar3.f4184r == 3) {
                    this.f4348h.f4290a = this;
                    this.f4349i.f4290a = this;
                    VerticalWidgetRun nVar = eVar3.f4162g;
                    nVar.f4348h.f4290a = this;
                    nVar.f4349i.f4290a = this;
                    gVar.f4290a = this;
                    if (eVar3.mo4709b0()) {
                        this.f4345e.f4301l.add(this.f4342b.f4162g.f4345e);
                        this.f4342b.f4162g.f4345e.f4300k.add(this.f4345e);
                        VerticalWidgetRun nVar2 = this.f4342b.f4162g;
                        nVar2.f4345e.f4290a = this;
                        this.f4345e.f4301l.add(nVar2.f4348h);
                        this.f4345e.f4301l.add(this.f4342b.f4162g.f4349i);
                        this.f4342b.f4162g.f4348h.f4300k.add(this.f4345e);
                        this.f4342b.f4162g.f4349i.f4300k.add(this.f4345e);
                    } else if (this.f4342b.mo4706Z()) {
                        this.f4342b.f4162g.f4345e.f4301l.add(this.f4345e);
                        this.f4345e.f4300k.add(this.f4342b.f4162g.f4345e);
                    } else {
                        this.f4342b.f4162g.f4345e.f4301l.add(this.f4345e);
                    }
                } else {
                    DimensionDependency gVar4 = eVar3.f4162g.f4345e;
                    gVar.f4301l.add(gVar4);
                    gVar4.f4300k.add(this.f4345e);
                    this.f4342b.f4162g.f4348h.f4300k.add(this.f4345e);
                    this.f4342b.f4162g.f4349i.f4300k.add(this.f4345e);
                    DimensionDependency gVar5 = this.f4345e;
                    gVar5.f4291b = true;
                    gVar5.f4300k.add(this.f4348h);
                    this.f4345e.f4300k.add(this.f4349i);
                    this.f4348h.f4301l.add(this.f4345e);
                    this.f4349i.f4301l.add(this.f4345e);
                }
            }
        }
        ConstraintWidget eVar4 = this.f4342b;
        ConstraintAnchor[] dVarArr2 = eVar4.f4141Q;
        if (dVarArr2[0].f4106f == null || dVarArr2[1].f4106f == null) {
            if (dVarArr2[0].f4106f != null) {
                DependencyNode h5 = mo4837h(dVarArr2[0]);
                if (h5 != null) {
                    mo4834b(this.f4348h, h5, this.f4342b.f4141Q[0].mo4641e());
                    mo4835c(this.f4349i, this.f4348h, 1, this.f4345e);
                }
            } else if (dVarArr2[1].f4106f != null) {
                DependencyNode h6 = mo4837h(dVarArr2[1]);
                if (h6 != null) {
                    mo4834b(this.f4349i, h6, -this.f4342b.f4141Q[1].mo4641e());
                    mo4835c(this.f4348h, this.f4349i, -1, this.f4345e);
                }
            } else if (!(eVar4 instanceof Helper) && eVar4.mo4673I() != null) {
                mo4834b(this.f4348h, this.f4342b.mo4673I().f4160f.f4348h, this.f4342b.mo4693S());
                mo4835c(this.f4349i, this.f4348h, 1, this.f4345e);
            }
        }
        if (eVar4.mo4706Z()) {
            this.f4348h.f4295f = this.f4342b.f4141Q[0].mo4641e();
            this.f4349i.f4295f = -this.f4342b.f4141Q[1].mo4641e();
        } else {
            DependencyNode h7 = mo4837h(this.f4342b.f4141Q[0]);
            DependencyNode h8 = mo4837h(this.f4342b.f4141Q[1]);
            h7.mo4815b(this);
            h8.mo4815b(this);
            this.f4350j = C0571b.CENTER;
        }
    }

    /* renamed from: e */
    public void mo4801e() {
        DependencyNode fVar = this.f4348h;
        if (fVar.f4299j) {
            this.f4342b.mo4700V0(fVar.f4296g);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo4802f() {
        this.f4343c = null;
        this.f4348h.mo4816c();
        this.f4349i.mo4816c();
        this.f4345e.mo4816c();
        this.f4347g = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public boolean mo4804m() {
        if (this.f4344d != C0561b.MATCH_CONSTRAINT || this.f4342b.f4182q == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public void mo4819r() {
        this.f4347g = false;
        this.f4348h.mo4816c();
        this.f4348h.f4299j = false;
        this.f4349i.mo4816c();
        this.f4349i.f4299j = false;
        this.f4345e.f4299j = false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HorizontalRun ");
        sb.append(this.f4342b.mo4733r());
        return sb.toString();
    }
}
