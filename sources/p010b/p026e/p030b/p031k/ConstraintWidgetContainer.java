package p010b.p026e.p030b.p031k;

import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import p010b.p026e.p030b.LinearSystem;
import p010b.p026e.p030b.Metrics;
import p010b.p026e.p030b.SolverVariable;
import p010b.p026e.p030b.p031k.ConstraintWidget.C0561b;
import p010b.p026e.p030b.p031k.p032m.BasicMeasure;
import p010b.p026e.p030b.p031k.p032m.BasicMeasure.C0564a;
import p010b.p026e.p030b.p031k.p032m.BasicMeasure.C0565b;
import p010b.p026e.p030b.p031k.p032m.DependencyGraph;

/* renamed from: b.e.b.k.f */
public class ConstraintWidgetContainer extends WidgetContainer {

    /* renamed from: E0 */
    BasicMeasure f4209E0 = new BasicMeasure(this);

    /* renamed from: F0 */
    public DependencyGraph f4210F0 = new DependencyGraph(this);

    /* renamed from: G0 */
    protected C0565b f4211G0 = null;

    /* renamed from: H0 */
    private boolean f4212H0 = false;

    /* renamed from: I0 */
    public Metrics f4213I0;

    /* renamed from: J0 */
    protected LinearSystem f4214J0 = new LinearSystem();

    /* renamed from: K0 */
    int f4215K0;

    /* renamed from: L0 */
    int f4216L0;

    /* renamed from: M0 */
    int f4217M0;

    /* renamed from: N0 */
    int f4218N0;

    /* renamed from: O0 */
    public int f4219O0 = 0;

    /* renamed from: P0 */
    public int f4220P0 = 0;

    /* renamed from: Q0 */
    ChainHead[] f4221Q0 = new ChainHead[4];

    /* renamed from: R0 */
    ChainHead[] f4222R0 = new ChainHead[4];

    /* renamed from: S0 */
    public boolean f4223S0 = false;

    /* renamed from: T0 */
    public boolean f4224T0 = false;

    /* renamed from: U0 */
    public boolean f4225U0 = false;

    /* renamed from: V0 */
    public int f4226V0 = 0;

    /* renamed from: W0 */
    public int f4227W0 = 0;

    /* renamed from: X0 */
    private int f4228X0 = 257;

    /* renamed from: Y0 */
    public boolean f4229Y0 = false;

    /* renamed from: Z0 */
    private boolean f4230Z0 = false;

    /* renamed from: a1 */
    private boolean f4231a1 = false;

    /* renamed from: b1 */
    int f4232b1 = 0;

    /* renamed from: c1 */
    private WeakReference<ConstraintAnchor> f4233c1 = null;

    /* renamed from: d1 */
    private WeakReference<ConstraintAnchor> f4234d1 = null;

    /* renamed from: e1 */
    private WeakReference<ConstraintAnchor> f4235e1 = null;

    /* renamed from: f1 */
    private WeakReference<ConstraintAnchor> f4236f1 = null;

    /* renamed from: g1 */
    public C0564a f4237g1 = new C0564a();

    /* renamed from: A1 */
    public static boolean m4794A1(ConstraintWidget eVar, C0565b bVar, C0564a aVar, int i) {
        int i2;
        int i3;
        if (bVar == null) {
            return false;
        }
        aVar.f4269d = eVar.mo4747y();
        aVar.f4270e = eVar.mo4685O();
        aVar.f4271f = eVar.mo4691R();
        aVar.f4272g = eVar.mo4741v();
        aVar.f4277l = false;
        aVar.f4278m = i;
        C0561b bVar2 = aVar.f4269d;
        C0561b bVar3 = C0561b.MATCH_CONSTRAINT;
        boolean z = bVar2 == bVar3;
        boolean z2 = aVar.f4270e == bVar3;
        boolean z3 = z && eVar.f4148X > 0.0f;
        boolean z4 = z2 && eVar.f4148X > 0.0f;
        if (z && eVar.mo4699V(0) && eVar.f4182q == 0 && !z3) {
            aVar.f4269d = C0561b.WRAP_CONTENT;
            if (z2 && eVar.f4184r == 0) {
                aVar.f4269d = C0561b.FIXED;
            }
            z = false;
        }
        if (z2 && eVar.mo4699V(1) && eVar.f4184r == 0 && !z4) {
            aVar.f4270e = C0561b.WRAP_CONTENT;
            if (z && eVar.f4182q == 0) {
                aVar.f4270e = C0561b.FIXED;
            }
            z2 = false;
        }
        if (eVar.mo4624e0()) {
            aVar.f4269d = C0561b.FIXED;
            z = false;
        }
        if (eVar.mo4626f0()) {
            aVar.f4270e = C0561b.FIXED;
            z2 = false;
        }
        if (z3) {
            if (eVar.f4186s[0] == 4) {
                aVar.f4269d = C0561b.FIXED;
            } else if (!z2) {
                C0561b bVar4 = aVar.f4270e;
                C0561b bVar5 = C0561b.FIXED;
                if (bVar4 == bVar5) {
                    i3 = aVar.f4272g;
                } else {
                    aVar.f4269d = C0561b.WRAP_CONTENT;
                    bVar.mo1939a(eVar, aVar);
                    i3 = aVar.f4274i;
                }
                aVar.f4269d = bVar5;
                int i4 = eVar.f4149Y;
                if (i4 == 0 || i4 == -1) {
                    aVar.f4271f = (int) (eVar.mo4737t() * ((float) i3));
                } else {
                    aVar.f4271f = (int) (eVar.mo4737t() / ((float) i3));
                }
            }
        }
        if (z4) {
            if (eVar.f4186s[1] == 4) {
                aVar.f4270e = C0561b.FIXED;
            } else if (!z) {
                C0561b bVar6 = aVar.f4269d;
                C0561b bVar7 = C0561b.FIXED;
                if (bVar6 == bVar7) {
                    i2 = aVar.f4271f;
                } else {
                    aVar.f4270e = C0561b.WRAP_CONTENT;
                    bVar.mo1939a(eVar, aVar);
                    i2 = aVar.f4273h;
                }
                aVar.f4270e = bVar7;
                int i5 = eVar.f4149Y;
                if (i5 == 0 || i5 == -1) {
                    aVar.f4272g = (int) (((float) i2) / eVar.mo4737t());
                } else {
                    aVar.f4272g = (int) (((float) i2) * eVar.mo4737t());
                }
            }
        }
        bVar.mo1939a(eVar, aVar);
        eVar.mo4698U0(aVar.f4273h);
        eVar.mo4742v0(aVar.f4274i);
        eVar.mo4740u0(aVar.f4276k);
        eVar.mo4720k0(aVar.f4275j);
        aVar.f4278m = C0564a.f4266a;
        return aVar.f4277l;
    }

    /* renamed from: C1 */
    private void m4795C1() {
        this.f4219O0 = 0;
        this.f4220P0 = 0;
    }

    /* renamed from: g1 */
    private void m4796g1(ConstraintWidget eVar) {
        int i = this.f4219O0 + 1;
        ChainHead[] cVarArr = this.f4222R0;
        if (i >= cVarArr.length) {
            this.f4222R0 = (ChainHead[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f4222R0[this.f4219O0] = new ChainHead(eVar, 0, mo4773x1());
        this.f4219O0++;
    }

    /* renamed from: j1 */
    private void m4797j1(ConstraintAnchor dVar, SolverVariable iVar) {
        this.f4214J0.mo4588h(iVar, this.f4214J0.mo4595q(dVar), 0, 5);
    }

    /* renamed from: k1 */
    private void m4798k1(ConstraintAnchor dVar, SolverVariable iVar) {
        this.f4214J0.mo4588h(this.f4214J0.mo4595q(dVar), iVar, 0, 5);
    }

    /* renamed from: l1 */
    private void m4799l1(ConstraintWidget eVar) {
        int i = this.f4220P0 + 1;
        ChainHead[] cVarArr = this.f4221Q0;
        if (i >= cVarArr.length) {
            this.f4221Q0 = (ChainHead[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f4221Q0[this.f4220P0] = new ChainHead(eVar, 1, mo4773x1());
        this.f4220P0++;
    }

    /* renamed from: B1 */
    public boolean mo4751B1(int i) {
        return (this.f4228X0 & i) == i;
    }

    /* renamed from: D1 */
    public void mo4752D1(C0565b bVar) {
        this.f4211G0 = bVar;
        this.f4210F0.mo4814n(bVar);
    }

    /* renamed from: E1 */
    public void mo4753E1(int i) {
        this.f4228X0 = i;
        LinearSystem.f3998a = mo4751B1(512);
    }

    /* renamed from: F1 */
    public void mo4754F1(boolean z) {
        this.f4212H0 = z;
    }

    /* renamed from: G1 */
    public void mo4755G1(LinearSystem dVar, boolean[] zArr) {
        zArr[2] = false;
        boolean B1 = mo4751B1(64);
        mo4707Z0(dVar, B1);
        int size = this.f4262D0.size();
        for (int i = 0; i < size; i++) {
            ((ConstraintWidget) this.f4262D0.get(i)).mo4707Z0(dVar, B1);
        }
    }

    /* renamed from: H1 */
    public void mo4756H1() {
        this.f4209E0.mo4798e(this);
    }

    /* renamed from: Y0 */
    public void mo4705Y0(boolean z, boolean z2) {
        super.mo4705Y0(z, z2);
        int size = this.f4262D0.size();
        for (int i = 0; i < size; i++) {
            ((ConstraintWidget) this.f4262D0.get(i)).mo4705Y0(z, z2);
        }
    }

    /* JADX WARNING: type inference failed for: r8v8, types: [boolean] */
    /* JADX WARNING: type inference failed for: r8v10 */
    /* JADX WARNING: type inference failed for: r8v11 */
    /* JADX WARNING: type inference failed for: r8v29 */
    /* JADX WARNING: type inference failed for: r8v30 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r8v8, types: [boolean]
  assigns: []
  uses: [?[int, short, byte, char], boolean]
  mth insns count: 325
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
     */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0307  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x012f  */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: b1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4757b1() {
        /*
            r17 = this;
            r1 = r17
            r2 = 0
            r1.f4150Z = r2
            r1.f4151a0 = r2
            r1.f4230Z0 = r2
            r1.f4231a1 = r2
            java.util.ArrayList<b.e.b.k.e> r0 = r1.f4262D0
            int r3 = r0.size()
            int r0 = r17.mo4691R()
            int r0 = java.lang.Math.max(r2, r0)
            int r4 = r17.mo4741v()
            int r4 = java.lang.Math.max(r2, r4)
            b.e.b.k.e$b[] r5 = r1.f4144T
            r6 = 1
            r7 = r5[r6]
            r5 = r5[r2]
            b.e.b.e r8 = r1.f4213I0
            r9 = 0
            if (r8 != 0) goto L_0x0319
            int r8 = r1.f4228X0
            boolean r8 = p010b.p026e.p030b.p031k.Optimizer.m4852b(r8, r6)
            if (r8 == 0) goto L_0x0089
            b.e.b.k.m.b$b r8 = r17.mo4767r1()
            p010b.p026e.p030b.p031k.p032m.Direct.m4906h(r1, r8)
            r8 = 0
        L_0x003d:
            if (r8 >= r3) goto L_0x0089
            java.util.ArrayList<b.e.b.k.e> r10 = r1.f4262D0
            java.lang.Object r10 = r10.get(r8)
            b.e.b.k.e r10 = (p010b.p026e.p030b.p031k.ConstraintWidget) r10
            boolean r11 = r10.mo4711d0()
            if (r11 == 0) goto L_0x0086
            boolean r11 = r10 instanceof p010b.p026e.p030b.p031k.Guideline
            if (r11 != 0) goto L_0x0086
            boolean r11 = r10 instanceof p010b.p026e.p030b.p031k.Barrier
            if (r11 != 0) goto L_0x0086
            boolean r11 = r10 instanceof p010b.p026e.p030b.p031k.C0563k
            if (r11 != 0) goto L_0x0086
            boolean r11 = r10.mo4710c0()
            if (r11 != 0) goto L_0x0086
            b.e.b.k.e$b r11 = r10.mo4735s(r2)
            b.e.b.k.e$b r12 = r10.mo4735s(r6)
            b.e.b.k.e$b r13 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.MATCH_CONSTRAINT
            if (r11 != r13) goto L_0x0077
            int r11 = r10.f4182q
            if (r11 == r6) goto L_0x0077
            if (r12 != r13) goto L_0x0077
            int r11 = r10.f4184r
            if (r11 == r6) goto L_0x0077
            r11 = 1
            goto L_0x0078
        L_0x0077:
            r11 = 0
        L_0x0078:
            if (r11 != 0) goto L_0x0086
            b.e.b.k.m.b$a r11 = new b.e.b.k.m.b$a
            r11.<init>()
            b.e.b.k.m.b$b r12 = r1.f4211G0
            int r13 = p010b.p026e.p030b.p031k.p032m.BasicMeasure.C0564a.f4266a
            m4794A1(r10, r12, r11, r13)
        L_0x0086:
            int r8 = r8 + 1
            goto L_0x003d
        L_0x0089:
            r8 = 2
            if (r3 <= r8) goto L_0x00d2
            b.e.b.k.e$b r10 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.WRAP_CONTENT
            if (r5 == r10) goto L_0x0092
            if (r7 != r10) goto L_0x00d2
        L_0x0092:
            int r11 = r1.f4228X0
            r12 = 1024(0x400, float:1.435E-42)
            boolean r11 = p010b.p026e.p030b.p031k.Optimizer.m4852b(r11, r12)
            if (r11 == 0) goto L_0x00d2
            b.e.b.k.m.b$b r11 = r17.mo4767r1()
            boolean r11 = p010b.p026e.p030b.p031k.p032m.Grouping.m4910c(r1, r11)
            if (r11 == 0) goto L_0x00d2
            if (r5 != r10) goto L_0x00ba
            int r11 = r17.mo4691R()
            if (r0 >= r11) goto L_0x00b6
            if (r0 <= 0) goto L_0x00b6
            r1.mo4698U0(r0)
            r1.f4230Z0 = r6
            goto L_0x00ba
        L_0x00b6:
            int r0 = r17.mo4691R()
        L_0x00ba:
            if (r7 != r10) goto L_0x00ce
            int r10 = r17.mo4741v()
            if (r4 >= r10) goto L_0x00ca
            if (r4 <= 0) goto L_0x00ca
            r1.mo4742v0(r4)
            r1.f4231a1 = r6
            goto L_0x00ce
        L_0x00ca:
            int r4 = r17.mo4741v()
        L_0x00ce:
            r10 = r4
            r4 = r0
            r0 = 1
            goto L_0x00d5
        L_0x00d2:
            r10 = r4
            r4 = r0
            r0 = 0
        L_0x00d5:
            r11 = 64
            boolean r12 = r1.mo4751B1(r11)
            if (r12 != 0) goto L_0x00e8
            r12 = 128(0x80, float:1.794E-43)
            boolean r12 = r1.mo4751B1(r12)
            if (r12 == 0) goto L_0x00e6
            goto L_0x00e8
        L_0x00e6:
            r12 = 0
            goto L_0x00e9
        L_0x00e8:
            r12 = 1
        L_0x00e9:
            b.e.b.d r13 = r1.f4214J0
            r13.f4014q = r2
            r13.f4015r = r2
            int r14 = r1.f4228X0
            if (r14 == 0) goto L_0x00f7
            if (r12 == 0) goto L_0x00f7
            r13.f4015r = r6
        L_0x00f7:
            java.util.ArrayList<b.e.b.k.e> r12 = r1.f4262D0
            b.e.b.k.e$b r13 = r17.mo4747y()
            b.e.b.k.e$b r14 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.WRAP_CONTENT
            if (r13 == r14) goto L_0x010a
            b.e.b.k.e$b r13 = r17.mo4685O()
            if (r13 != r14) goto L_0x0108
            goto L_0x010a
        L_0x0108:
            r13 = 0
            goto L_0x010b
        L_0x010a:
            r13 = 1
        L_0x010b:
            r17.m4795C1()
            r14 = 0
        L_0x010f:
            if (r14 >= r3) goto L_0x0126
            java.util.ArrayList<b.e.b.k.e> r15 = r1.f4262D0
            java.lang.Object r15 = r15.get(r14)
            b.e.b.k.e r15 = (p010b.p026e.p030b.p031k.ConstraintWidget) r15
            boolean r2 = r15 instanceof p010b.p026e.p030b.p031k.WidgetContainer
            if (r2 == 0) goto L_0x0122
            b.e.b.k.l r15 = (p010b.p026e.p030b.p031k.WidgetContainer) r15
            r15.mo4757b1()
        L_0x0122:
            int r14 = r14 + 1
            r2 = 0
            goto L_0x010f
        L_0x0126:
            boolean r2 = r1.mo4751B1(r11)
            r11 = r0
            r0 = 0
            r14 = 1
        L_0x012d:
            if (r14 == 0) goto L_0x0303
            int r15 = r0 + 1
            b.e.b.d r0 = r1.f4214J0     // Catch:{ Exception -> 0x01dd }
            r0.mo4581D()     // Catch:{ Exception -> 0x01dd }
            r17.m4795C1()     // Catch:{ Exception -> 0x01dd }
            b.e.b.d r0 = r1.f4214J0     // Catch:{ Exception -> 0x01dd }
            r1.mo4719k(r0)     // Catch:{ Exception -> 0x01dd }
            r0 = 0
        L_0x013f:
            if (r0 >= r3) goto L_0x0153
            java.util.ArrayList<b.e.b.k.e> r6 = r1.f4262D0     // Catch:{ Exception -> 0x01dd }
            java.lang.Object r6 = r6.get(r0)     // Catch:{ Exception -> 0x01dd }
            b.e.b.k.e r6 = (p010b.p026e.p030b.p031k.ConstraintWidget) r6     // Catch:{ Exception -> 0x01dd }
            b.e.b.d r8 = r1.f4214J0     // Catch:{ Exception -> 0x01dd }
            r6.mo4719k(r8)     // Catch:{ Exception -> 0x01dd }
            int r0 = r0 + 1
            r6 = 1
            r8 = 2
            goto L_0x013f
        L_0x0153:
            b.e.b.d r0 = r1.f4214J0     // Catch:{ Exception -> 0x01dd }
            boolean r14 = r1.mo4759f1(r0)     // Catch:{ Exception -> 0x01dd }
            java.lang.ref.WeakReference<b.e.b.k.d> r0 = r1.f4233c1     // Catch:{ Exception -> 0x01dd }
            if (r0 == 0) goto L_0x0178
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01dd }
            if (r0 == 0) goto L_0x0178
            java.lang.ref.WeakReference<b.e.b.k.d> r0 = r1.f4233c1     // Catch:{ Exception -> 0x01dd }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01dd }
            b.e.b.k.d r0 = (p010b.p026e.p030b.p031k.ConstraintAnchor) r0     // Catch:{ Exception -> 0x01dd }
            b.e.b.d r6 = r1.f4214J0     // Catch:{ Exception -> 0x01dd }
            b.e.b.k.d r8 = r1.f4134J     // Catch:{ Exception -> 0x01dd }
            b.e.b.i r6 = r6.mo4595q(r8)     // Catch:{ Exception -> 0x01dd }
            r1.m4798k1(r0, r6)     // Catch:{ Exception -> 0x01dd }
            r1.f4233c1 = r9     // Catch:{ Exception -> 0x01dd }
        L_0x0178:
            java.lang.ref.WeakReference<b.e.b.k.d> r0 = r1.f4235e1     // Catch:{ Exception -> 0x01dd }
            if (r0 == 0) goto L_0x0197
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01dd }
            if (r0 == 0) goto L_0x0197
            java.lang.ref.WeakReference<b.e.b.k.d> r0 = r1.f4235e1     // Catch:{ Exception -> 0x01dd }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01dd }
            b.e.b.k.d r0 = (p010b.p026e.p030b.p031k.ConstraintAnchor) r0     // Catch:{ Exception -> 0x01dd }
            b.e.b.d r6 = r1.f4214J0     // Catch:{ Exception -> 0x01dd }
            b.e.b.k.d r8 = r1.f4136L     // Catch:{ Exception -> 0x01dd }
            b.e.b.i r6 = r6.mo4595q(r8)     // Catch:{ Exception -> 0x01dd }
            r1.m4797j1(r0, r6)     // Catch:{ Exception -> 0x01dd }
            r1.f4235e1 = r9     // Catch:{ Exception -> 0x01dd }
        L_0x0197:
            java.lang.ref.WeakReference<b.e.b.k.d> r0 = r1.f4234d1     // Catch:{ Exception -> 0x01dd }
            if (r0 == 0) goto L_0x01b6
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01dd }
            if (r0 == 0) goto L_0x01b6
            java.lang.ref.WeakReference<b.e.b.k.d> r0 = r1.f4234d1     // Catch:{ Exception -> 0x01dd }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01dd }
            b.e.b.k.d r0 = (p010b.p026e.p030b.p031k.ConstraintAnchor) r0     // Catch:{ Exception -> 0x01dd }
            b.e.b.d r6 = r1.f4214J0     // Catch:{ Exception -> 0x01dd }
            b.e.b.k.d r8 = r1.f4133I     // Catch:{ Exception -> 0x01dd }
            b.e.b.i r6 = r6.mo4595q(r8)     // Catch:{ Exception -> 0x01dd }
            r1.m4798k1(r0, r6)     // Catch:{ Exception -> 0x01dd }
            r1.f4234d1 = r9     // Catch:{ Exception -> 0x01dd }
        L_0x01b6:
            java.lang.ref.WeakReference<b.e.b.k.d> r0 = r1.f4236f1     // Catch:{ Exception -> 0x01dd }
            if (r0 == 0) goto L_0x01d5
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01dd }
            if (r0 == 0) goto L_0x01d5
            java.lang.ref.WeakReference<b.e.b.k.d> r0 = r1.f4236f1     // Catch:{ Exception -> 0x01dd }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01dd }
            b.e.b.k.d r0 = (p010b.p026e.p030b.p031k.ConstraintAnchor) r0     // Catch:{ Exception -> 0x01dd }
            b.e.b.d r6 = r1.f4214J0     // Catch:{ Exception -> 0x01dd }
            b.e.b.k.d r8 = r1.f4135K     // Catch:{ Exception -> 0x01dd }
            b.e.b.i r6 = r6.mo4595q(r8)     // Catch:{ Exception -> 0x01dd }
            r1.m4797j1(r0, r6)     // Catch:{ Exception -> 0x01dd }
            r1.f4236f1 = r9     // Catch:{ Exception -> 0x01dd }
        L_0x01d5:
            if (r14 == 0) goto L_0x01f7
            b.e.b.d r0 = r1.f4214J0     // Catch:{ Exception -> 0x01dd }
            r0.mo4600z()     // Catch:{ Exception -> 0x01dd }
            goto L_0x01f7
        L_0x01dd:
            r0 = move-exception
            r0.printStackTrace()
            java.io.PrintStream r6 = java.lang.System.out
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "EXCEPTION : "
            r8.append(r9)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            r6.println(r0)
        L_0x01f7:
            if (r14 == 0) goto L_0x0201
            b.e.b.d r0 = r1.f4214J0
            boolean[] r6 = p010b.p026e.p030b.p031k.Optimizer.f4248a
            r1.mo4755G1(r0, r6)
            goto L_0x0219
        L_0x0201:
            b.e.b.d r0 = r1.f4214J0
            r1.mo4707Z0(r0, r2)
            r0 = 0
        L_0x0207:
            if (r0 >= r3) goto L_0x0219
            java.util.ArrayList<b.e.b.k.e> r6 = r1.f4262D0
            java.lang.Object r6 = r6.get(r0)
            b.e.b.k.e r6 = (p010b.p026e.p030b.p031k.ConstraintWidget) r6
            b.e.b.d r8 = r1.f4214J0
            r6.mo4707Z0(r8, r2)
            int r0 = r0 + 1
            goto L_0x0207
        L_0x0219:
            if (r13 == 0) goto L_0x0283
            r0 = 8
            if (r15 >= r0) goto L_0x0283
            boolean[] r0 = p010b.p026e.p030b.p031k.Optimizer.f4248a
            r6 = 2
            boolean r0 = r0[r6]
            if (r0 == 0) goto L_0x0283
            r0 = 0
            r8 = 0
            r9 = 0
        L_0x0229:
            if (r0 >= r3) goto L_0x024e
            java.util.ArrayList<b.e.b.k.e> r14 = r1.f4262D0
            java.lang.Object r14 = r14.get(r0)
            b.e.b.k.e r14 = (p010b.p026e.p030b.p031k.ConstraintWidget) r14
            int r6 = r14.f4150Z
            int r16 = r14.mo4691R()
            int r6 = r6 + r16
            int r8 = java.lang.Math.max(r8, r6)
            int r6 = r14.f4151a0
            int r14 = r14.mo4741v()
            int r6 = r6 + r14
            int r9 = java.lang.Math.max(r9, r6)
            int r0 = r0 + 1
            r6 = 2
            goto L_0x0229
        L_0x024e:
            int r0 = r1.f4163g0
            int r0 = java.lang.Math.max(r0, r8)
            int r6 = r1.f4165h0
            int r6 = java.lang.Math.max(r6, r9)
            b.e.b.k.e$b r8 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.WRAP_CONTENT
            if (r5 != r8) goto L_0x026f
            int r9 = r17.mo4691R()
            if (r9 >= r0) goto L_0x026f
            r1.mo4698U0(r0)
            b.e.b.k.e$b[] r0 = r1.f4144T
            r9 = 0
            r0[r9] = r8
            r0 = 1
            r11 = 1
            goto L_0x0270
        L_0x026f:
            r0 = 0
        L_0x0270:
            if (r7 != r8) goto L_0x0284
            int r9 = r17.mo4741v()
            if (r9 >= r6) goto L_0x0284
            r1.mo4742v0(r6)
            b.e.b.k.e$b[] r0 = r1.f4144T
            r6 = 1
            r0[r6] = r8
            r0 = 1
            r11 = 1
            goto L_0x0284
        L_0x0283:
            r0 = 0
        L_0x0284:
            int r6 = r1.f4163g0
            int r8 = r17.mo4691R()
            int r6 = java.lang.Math.max(r6, r8)
            int r8 = r17.mo4691R()
            if (r6 <= r8) goto L_0x02a0
            r1.mo4698U0(r6)
            b.e.b.k.e$b[] r0 = r1.f4144T
            b.e.b.k.e$b r6 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.FIXED
            r8 = 0
            r0[r8] = r6
            r0 = 1
            r11 = 1
        L_0x02a0:
            int r6 = r1.f4165h0
            int r8 = r17.mo4741v()
            int r6 = java.lang.Math.max(r6, r8)
            int r8 = r17.mo4741v()
            if (r6 <= r8) goto L_0x02bd
            r1.mo4742v0(r6)
            b.e.b.k.e$b[] r0 = r1.f4144T
            b.e.b.k.e$b r6 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.FIXED
            r8 = 1
            r0[r8] = r6
            r0 = 1
            r6 = 1
            goto L_0x02bf
        L_0x02bd:
            r8 = 1
            r6 = r11
        L_0x02bf:
            if (r6 != 0) goto L_0x02fb
            b.e.b.k.e$b[] r9 = r1.f4144T
            r11 = 0
            r9 = r9[r11]
            b.e.b.k.e$b r14 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.WRAP_CONTENT
            if (r9 != r14) goto L_0x02df
            if (r4 <= 0) goto L_0x02df
            int r9 = r17.mo4691R()
            if (r9 <= r4) goto L_0x02df
            r1.f4230Z0 = r8
            b.e.b.k.e$b[] r0 = r1.f4144T
            b.e.b.k.e$b r6 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.FIXED
            r0[r11] = r6
            r1.mo4698U0(r4)
            r0 = 1
            r6 = 1
        L_0x02df:
            b.e.b.k.e$b[] r9 = r1.f4144T
            r9 = r9[r8]
            if (r9 != r14) goto L_0x02fb
            if (r10 <= 0) goto L_0x02fb
            int r9 = r17.mo4741v()
            if (r9 <= r10) goto L_0x02fb
            r1.f4231a1 = r8
            b.e.b.k.e$b[] r0 = r1.f4144T
            b.e.b.k.e$b r6 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.FIXED
            r0[r8] = r6
            r1.mo4742v0(r10)
            r11 = 1
            r14 = 1
            goto L_0x02fd
        L_0x02fb:
            r14 = r0
            r11 = r6
        L_0x02fd:
            r0 = r15
            r6 = 1
            r8 = 2
            r9 = 0
            goto L_0x012d
        L_0x0303:
            r1.f4262D0 = r12
            if (r11 == 0) goto L_0x030f
            b.e.b.k.e$b[] r0 = r1.f4144T
            r2 = 0
            r0[r2] = r5
            r2 = 1
            r0[r2] = r7
        L_0x030f:
            b.e.b.d r0 = r1.f4214J0
            b.e.b.c r0 = r0.mo4598v()
            r1.mo4718j0(r0)
            return
        L_0x0319:
            r2 = r9
            goto L_0x031c
        L_0x031b:
            throw r2
        L_0x031c:
            goto L_0x031b
        */
        throw new UnsupportedOperationException("Method not decompiled: p010b.p026e.p030b.p031k.ConstraintWidgetContainer.mo4757b1():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e1 */
    public void mo4758e1(ConstraintWidget eVar, int i) {
        if (i == 0) {
            m4796g1(eVar);
        } else if (i == 1) {
            m4799l1(eVar);
        }
    }

    /* renamed from: f1 */
    public boolean mo4759f1(LinearSystem dVar) {
        boolean B1 = mo4751B1(64);
        mo4628g(dVar, B1);
        int size = this.f4262D0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            ConstraintWidget eVar = (ConstraintWidget) this.f4262D0.get(i);
            eVar.mo4662C0(0, false);
            eVar.mo4662C0(1, false);
            if (eVar instanceof Barrier) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                ConstraintWidget eVar2 = (ConstraintWidget) this.f4262D0.get(i2);
                if (eVar2 instanceof Barrier) {
                    ((Barrier) eVar2).mo4631h1();
                }
            }
        }
        for (int i3 = 0; i3 < size; i3++) {
            ConstraintWidget eVar3 = (ConstraintWidget) this.f4262D0.get(i3);
            if (eVar3.mo4713f()) {
                eVar3.mo4628g(dVar, B1);
            }
        }
        if (LinearSystem.f3998a) {
            HashSet hashSet = new HashSet();
            for (int i4 = 0; i4 < size; i4++) {
                ConstraintWidget eVar4 = (ConstraintWidget) this.f4262D0.get(i4);
                if (!eVar4.mo4713f()) {
                    hashSet.add(eVar4);
                }
            }
            mo4712e(this, dVar, hashSet, mo4747y() == C0561b.WRAP_CONTENT ? 0 : 1, false);
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ConstraintWidget eVar5 = (ConstraintWidget) it.next();
                Optimizer.m4851a(this, dVar, eVar5);
                eVar5.mo4628g(dVar, B1);
            }
        } else {
            for (int i5 = 0; i5 < size; i5++) {
                ConstraintWidget eVar6 = (ConstraintWidget) this.f4262D0.get(i5);
                if (eVar6 instanceof ConstraintWidgetContainer) {
                    C0561b[] bVarArr = eVar6.f4144T;
                    C0561b bVar = bVarArr[0];
                    C0561b bVar2 = bVarArr[1];
                    C0561b bVar3 = C0561b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar6.mo4750z0(C0561b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.mo4690Q0(C0561b.FIXED);
                    }
                    eVar6.mo4628g(dVar, B1);
                    if (bVar == bVar3) {
                        eVar6.mo4750z0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.mo4690Q0(bVar2);
                    }
                } else {
                    Optimizer.m4851a(this, dVar, eVar6);
                    if (!eVar6.mo4713f()) {
                        eVar6.mo4628g(dVar, B1);
                    }
                }
            }
        }
        if (this.f4219O0 > 0) {
            Chain.m4670b(this, dVar, null, 0);
        }
        if (this.f4220P0 > 0) {
            Chain.m4670b(this, dVar, null, 1);
        }
        return true;
    }

    /* renamed from: h0 */
    public void mo4715h0() {
        this.f4214J0.mo4581D();
        this.f4215K0 = 0;
        this.f4217M0 = 0;
        this.f4216L0 = 0;
        this.f4218N0 = 0;
        this.f4229Y0 = false;
        super.mo4715h0();
    }

    /* renamed from: h1 */
    public void mo4760h1(ConstraintAnchor dVar) {
        WeakReference<ConstraintAnchor> weakReference = this.f4236f1;
        if (weakReference == null || weakReference.get() == null || dVar.mo4640d() > ((ConstraintAnchor) this.f4236f1.get()).mo4640d()) {
            this.f4236f1 = new WeakReference<>(dVar);
        }
    }

    /* renamed from: i1 */
    public void mo4761i1(ConstraintAnchor dVar) {
        WeakReference<ConstraintAnchor> weakReference = this.f4234d1;
        if (weakReference == null || weakReference.get() == null || dVar.mo4640d() > ((ConstraintAnchor) this.f4234d1.get()).mo4640d()) {
            this.f4234d1 = new WeakReference<>(dVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m1 */
    public void mo4762m1(ConstraintAnchor dVar) {
        WeakReference<ConstraintAnchor> weakReference = this.f4235e1;
        if (weakReference == null || weakReference.get() == null || dVar.mo4640d() > ((ConstraintAnchor) this.f4235e1.get()).mo4640d()) {
            this.f4235e1 = new WeakReference<>(dVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n1 */
    public void mo4763n1(ConstraintAnchor dVar) {
        WeakReference<ConstraintAnchor> weakReference = this.f4233c1;
        if (weakReference == null || weakReference.get() == null || dVar.mo4640d() > ((ConstraintAnchor) this.f4233c1.get()).mo4640d()) {
            this.f4233c1 = new WeakReference<>(dVar);
        }
    }

    /* renamed from: o1 */
    public boolean mo4764o1(boolean z) {
        return this.f4210F0.mo4808f(z);
    }

    /* renamed from: p1 */
    public boolean mo4765p1(boolean z) {
        return this.f4210F0.mo4809g(z);
    }

    /* renamed from: q1 */
    public boolean mo4766q1(boolean z, int i) {
        return this.f4210F0.mo4810h(z, i);
    }

    /* renamed from: r1 */
    public C0565b mo4767r1() {
        return this.f4211G0;
    }

    /* renamed from: s1 */
    public int mo4768s1() {
        return this.f4228X0;
    }

    /* renamed from: t1 */
    public LinearSystem mo4769t1() {
        return this.f4214J0;
    }

    /* renamed from: u1 */
    public void mo4770u1() {
        this.f4210F0.mo4811j();
    }

    /* renamed from: v1 */
    public void mo4771v1() {
        this.f4210F0.mo4812k();
    }

    /* renamed from: w1 */
    public boolean mo4772w1() {
        return this.f4231a1;
    }

    /* renamed from: x1 */
    public boolean mo4773x1() {
        return this.f4212H0;
    }

    /* renamed from: y1 */
    public boolean mo4774y1() {
        return this.f4230Z0;
    }

    /* renamed from: z1 */
    public long mo4775z1(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = i8;
        this.f4215K0 = i10;
        int i11 = i9;
        this.f4216L0 = i11;
        return this.f4209E0.mo4797d(this, i, i10, i11, i2, i3, i4, i5, i6, i7);
    }
}
