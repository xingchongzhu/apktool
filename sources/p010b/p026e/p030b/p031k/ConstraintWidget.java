package p010b.p026e.p030b.p031k;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p010b.p026e.p030b.Cache;
import p010b.p026e.p030b.LinearSystem;
import p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b;
import p010b.p026e.p030b.p031k.p032m.ChainRun;
import p010b.p026e.p030b.p031k.p032m.DependencyNode;
import p010b.p026e.p030b.p031k.p032m.HorizontalWidgetRun;
import p010b.p026e.p030b.p031k.p032m.VerticalWidgetRun;
import p010b.p026e.p030b.p031k.p032m.WidgetRun;

/* renamed from: b.e.b.k.e */
public class ConstraintWidget {

    /* renamed from: a */
    public static float f4121a = 0.5f;

    /* renamed from: A */
    float f4122A = 1.0f;

    /* renamed from: A0 */
    ConstraintWidget f4123A0;

    /* renamed from: B */
    private int[] f4124B = {Integer.MAX_VALUE, Integer.MAX_VALUE};

    /* renamed from: B0 */
    public int f4125B0;

    /* renamed from: C */
    private float f4126C = 0.0f;

    /* renamed from: C0 */
    public int f4127C0;

    /* renamed from: D */
    private boolean f4128D = false;

    /* renamed from: E */
    private boolean f4129E;

    /* renamed from: F */
    private boolean f4130F = false;

    /* renamed from: G */
    private int f4131G = 0;

    /* renamed from: H */
    private int f4132H = 0;

    /* renamed from: I */
    public ConstraintAnchor f4133I = new ConstraintAnchor(this, C0559b.LEFT);

    /* renamed from: J */
    public ConstraintAnchor f4134J = new ConstraintAnchor(this, C0559b.TOP);

    /* renamed from: K */
    public ConstraintAnchor f4135K = new ConstraintAnchor(this, C0559b.RIGHT);

    /* renamed from: L */
    public ConstraintAnchor f4136L = new ConstraintAnchor(this, C0559b.BOTTOM);

    /* renamed from: M */
    public ConstraintAnchor f4137M = new ConstraintAnchor(this, C0559b.BASELINE);

    /* renamed from: N */
    ConstraintAnchor f4138N = new ConstraintAnchor(this, C0559b.CENTER_X);

    /* renamed from: O */
    ConstraintAnchor f4139O = new ConstraintAnchor(this, C0559b.CENTER_Y);

    /* renamed from: P */
    public ConstraintAnchor f4140P;

    /* renamed from: Q */
    public ConstraintAnchor[] f4141Q;

    /* renamed from: R */
    protected ArrayList<ConstraintAnchor> f4142R;

    /* renamed from: S */
    private boolean[] f4143S;

    /* renamed from: T */
    public C0561b[] f4144T;

    /* renamed from: U */
    public ConstraintWidget f4145U;

    /* renamed from: V */
    int f4146V;

    /* renamed from: W */
    int f4147W;

    /* renamed from: X */
    public float f4148X;

    /* renamed from: Y */
    protected int f4149Y;

    /* renamed from: Z */
    protected int f4150Z;

    /* renamed from: a0 */
    protected int f4151a0;

    /* renamed from: b */
    public boolean f4152b = false;

    /* renamed from: b0 */
    int f4153b0;

    /* renamed from: c */
    public WidgetRun[] f4154c = new WidgetRun[2];

    /* renamed from: c0 */
    int f4155c0;

    /* renamed from: d */
    public ChainRun f4156d;

    /* renamed from: d0 */
    protected int f4157d0;

    /* renamed from: e */
    public ChainRun f4158e;

    /* renamed from: e0 */
    protected int f4159e0;

    /* renamed from: f */
    public HorizontalWidgetRun f4160f = null;

    /* renamed from: f0 */
    int f4161f0;

    /* renamed from: g */
    public VerticalWidgetRun f4162g = null;

    /* renamed from: g0 */
    protected int f4163g0;

    /* renamed from: h */
    public boolean[] f4164h = {true, true};

    /* renamed from: h0 */
    protected int f4165h0;

    /* renamed from: i */
    boolean f4166i = false;

    /* renamed from: i0 */
    float f4167i0;

    /* renamed from: j */
    private boolean f4168j = true;

    /* renamed from: j0 */
    float f4169j0;

    /* renamed from: k */
    private boolean f4170k = false;

    /* renamed from: k0 */
    private Object f4171k0;

    /* renamed from: l */
    private boolean f4172l = true;

    /* renamed from: l0 */
    private int f4173l0;

    /* renamed from: m */
    private boolean f4174m = false;

    /* renamed from: m0 */
    private int f4175m0;

    /* renamed from: n */
    private boolean f4176n = false;

    /* renamed from: n0 */
    private String f4177n0;

    /* renamed from: o */
    public int f4178o = -1;

    /* renamed from: o0 */
    private String f4179o0;

    /* renamed from: p */
    public int f4180p = -1;

    /* renamed from: p0 */
    boolean f4181p0;

    /* renamed from: q */
    public int f4182q = 0;

    /* renamed from: q0 */
    boolean f4183q0;

    /* renamed from: r */
    public int f4184r = 0;

    /* renamed from: r0 */
    boolean f4185r0;

    /* renamed from: s */
    public int[] f4186s = new int[2];

    /* renamed from: s0 */
    int f4187s0;

    /* renamed from: t */
    public int f4188t = 0;

    /* renamed from: t0 */
    int f4189t0;

    /* renamed from: u */
    public int f4190u = 0;

    /* renamed from: u0 */
    boolean f4191u0;

    /* renamed from: v */
    public float f4192v = 1.0f;

    /* renamed from: v0 */
    boolean f4193v0;

    /* renamed from: w */
    public int f4194w = 0;

    /* renamed from: w0 */
    public float[] f4195w0;

    /* renamed from: x */
    public int f4196x = 0;

    /* renamed from: x0 */
    protected ConstraintWidget[] f4197x0;

    /* renamed from: y */
    public float f4198y = 1.0f;

    /* renamed from: y0 */
    protected ConstraintWidget[] f4199y0;

    /* renamed from: z */
    int f4200z = -1;

    /* renamed from: z0 */
    ConstraintWidget f4201z0;

    /* renamed from: b.e.b.k.e$a */
    /* compiled from: ConstraintWidget */
    static /* synthetic */ class C0560a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4202a;

        /* renamed from: b */
        static final /* synthetic */ int[] f4203b;

        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x008f */
        static {
            /*
                b.e.b.k.e$b[] r0 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4203b = r0
                r1 = 1
                b.e.b.k.e$b r2 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f4203b     // Catch:{ NoSuchFieldError -> 0x001d }
                b.e.b.k.e$b r3 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f4203b     // Catch:{ NoSuchFieldError -> 0x0028 }
                b.e.b.k.e$b r4 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f4203b     // Catch:{ NoSuchFieldError -> 0x0033 }
                b.e.b.k.e$b r5 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                b.e.b.k.d$b[] r4 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f4202a = r4
                b.e.b.k.d$b r5 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.LEFT     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f4202a     // Catch:{ NoSuchFieldError -> 0x004e }
                b.e.b.k.d$b r4 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.TOP     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f4202a     // Catch:{ NoSuchFieldError -> 0x0058 }
                b.e.b.k.d$b r1 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.RIGHT     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f4202a     // Catch:{ NoSuchFieldError -> 0x0062 }
                b.e.b.k.d$b r1 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f4202a     // Catch:{ NoSuchFieldError -> 0x006d }
                b.e.b.k.d$b r1 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.BASELINE     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f4202a     // Catch:{ NoSuchFieldError -> 0x0078 }
                b.e.b.k.d$b r1 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.CENTER     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f4202a     // Catch:{ NoSuchFieldError -> 0x0083 }
                b.e.b.k.d$b r1 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f4202a     // Catch:{ NoSuchFieldError -> 0x008f }
                b.e.b.k.d$b r1 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                int[] r0 = f4202a     // Catch:{ NoSuchFieldError -> 0x009b }
                b.e.b.k.d$b r1 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.NONE     // Catch:{ NoSuchFieldError -> 0x009b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009b }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009b }
            L_0x009b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p010b.p026e.p030b.p031k.ConstraintWidget.C0560a.<clinit>():void");
        }
    }

    /* renamed from: b.e.b.k.e$b */
    /* compiled from: ConstraintWidget */
    public enum C0561b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public ConstraintWidget() {
        ConstraintAnchor dVar = new ConstraintAnchor(this, C0559b.CENTER);
        this.f4140P = dVar;
        this.f4141Q = new ConstraintAnchor[]{this.f4133I, this.f4135K, this.f4134J, this.f4136L, this.f4137M, dVar};
        this.f4142R = new ArrayList<>();
        this.f4143S = new boolean[2];
        C0561b bVar = C0561b.FIXED;
        this.f4144T = new C0561b[]{bVar, bVar};
        this.f4145U = null;
        this.f4146V = 0;
        this.f4147W = 0;
        this.f4148X = 0.0f;
        this.f4149Y = -1;
        this.f4150Z = 0;
        this.f4151a0 = 0;
        this.f4153b0 = 0;
        this.f4155c0 = 0;
        this.f4157d0 = 0;
        this.f4159e0 = 0;
        this.f4161f0 = 0;
        float f = f4121a;
        this.f4167i0 = f;
        this.f4169j0 = f;
        this.f4173l0 = 0;
        this.f4175m0 = 0;
        this.f4177n0 = null;
        this.f4179o0 = null;
        this.f4185r0 = false;
        this.f4187s0 = 0;
        this.f4189t0 = 0;
        this.f4195w0 = new float[]{-1.0f, -1.0f};
        this.f4197x0 = new ConstraintWidget[]{null, null};
        this.f4199y0 = new ConstraintWidget[]{null, null};
        this.f4201z0 = null;
        this.f4123A0 = null;
        this.f4125B0 = -1;
        this.f4127C0 = -1;
        m4694d();
    }

    /* renamed from: Y */
    private boolean m4693Y(int i) {
        int i2 = i * 2;
        ConstraintAnchor[] dVarArr = this.f4141Q;
        if (!(dVarArr[i2].f4106f == null || dVarArr[i2].f4106f.f4106f == dVarArr[i2])) {
            int i3 = i2 + 1;
            if (dVarArr[i3].f4106f != null && dVarArr[i3].f4106f.f4106f == dVarArr[i3]) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private void m4694d() {
        this.f4142R.add(this.f4133I);
        this.f4142R.add(this.f4134J);
        this.f4142R.add(this.f4135K);
        this.f4142R.add(this.f4136L);
        this.f4142R.add(this.f4138N);
        this.f4142R.add(this.f4139O);
        this.f4142R.add(this.f4140P);
        this.f4142R.add(this.f4137M);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:335:0x051d, code lost:
        if (r1[r30] == r6) goto L_0x0525;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0384 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0391  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x03cf  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x03ef  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0415  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0419 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x042d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x047f  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x0491 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x04bb  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x04c3  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x04e0  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x04f8  */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x0504  */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x0527  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00cc  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4695i(p010b.p026e.p030b.LinearSystem r32, boolean r33, boolean r34, boolean r35, boolean r36, p010b.p026e.p030b.SolverVariable r37, p010b.p026e.p030b.SolverVariable r38, p010b.p026e.p030b.p031k.ConstraintWidget.C0561b r39, boolean r40, p010b.p026e.p030b.p031k.ConstraintAnchor r41, p010b.p026e.p030b.p031k.ConstraintAnchor r42, int r43, int r44, int r45, int r46, float r47, boolean r48, boolean r49, boolean r50, boolean r51, boolean r52, int r53, int r54, int r55, int r56, float r57, boolean r58) {
        /*
            r31 = this;
            r0 = r31
            r10 = r32
            r11 = r37
            r12 = r38
            r13 = r41
            r14 = r42
            r15 = r45
            r1 = r46
            r2 = r54
            r3 = r55
            r4 = r56
            b.e.b.i r9 = r10.mo4595q(r13)
            b.e.b.i r8 = r10.mo4595q(r14)
            b.e.b.k.d r5 = r41.mo4645i()
            b.e.b.i r7 = r10.mo4595q(r5)
            b.e.b.k.d r5 = r42.mo4645i()
            b.e.b.i r6 = r10.mo4595q(r5)
            b.e.b.e r5 = p010b.p026e.p030b.LinearSystem.m4587w()
            if (r5 != 0) goto L_0x052d
            boolean r16 = r41.mo4650n()
            boolean r17 = r42.mo4650n()
            b.e.b.k.d r5 = r0.f4140P
            boolean r18 = r5.mo4650n()
            if (r17 == 0) goto L_0x0047
            int r5 = r16 + 1
            goto L_0x0049
        L_0x0047:
            r5 = r16
        L_0x0049:
            if (r18 == 0) goto L_0x004d
            int r5 = r5 + 1
        L_0x004d:
            if (r48 == 0) goto L_0x0052
            r19 = 3
            goto L_0x0054
        L_0x0052:
            r19 = r53
        L_0x0054:
            int[] r20 = p010b.p026e.p030b.p031k.ConstraintWidget.C0560a.f4203b
            int r21 = r39.ordinal()
            r12 = r20[r21]
            r2 = 1
            if (r12 == r2) goto L_0x0068
            r2 = 2
            if (r12 == r2) goto L_0x0068
            r2 = 3
            if (r12 == r2) goto L_0x0068
            r2 = 4
            if (r12 == r2) goto L_0x006d
        L_0x0068:
            r12 = r19
        L_0x006a:
            r19 = 0
            goto L_0x0073
        L_0x006d:
            r12 = r19
            if (r12 == r2) goto L_0x006a
            r19 = 1
        L_0x0073:
            int r2 = r0.f4175m0
            r14 = 8
            if (r2 != r14) goto L_0x007d
            r2 = 0
            r19 = 0
            goto L_0x007f
        L_0x007d:
            r2 = r44
        L_0x007f:
            if (r58 == 0) goto L_0x009d
            if (r16 != 0) goto L_0x008d
            if (r17 != 0) goto L_0x008d
            if (r18 != 0) goto L_0x008d
            r14 = r43
            r10.mo4586f(r9, r14)
            goto L_0x009d
        L_0x008d:
            if (r16 == 0) goto L_0x009d
            if (r17 != 0) goto L_0x009d
            int r14 = r41.mo4641e()
            r23 = r6
            r6 = 8
            r10.mo4585e(r9, r7, r14, r6)
            goto L_0x00a1
        L_0x009d:
            r23 = r6
            r6 = 8
        L_0x00a1:
            if (r19 != 0) goto L_0x00cc
            if (r40 == 0) goto L_0x00ba
            r6 = 0
            r14 = 3
            r10.mo4585e(r8, r9, r6, r14)
            r6 = 8
            if (r15 <= 0) goto L_0x00b1
            r10.mo4588h(r8, r9, r15, r6)
        L_0x00b1:
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 >= r2) goto L_0x00bd
            r10.mo4590j(r8, r9, r1, r6)
            goto L_0x00bd
        L_0x00ba:
            r10.mo4585e(r8, r9, r2, r6)
        L_0x00bd:
            r24 = r3
            r1 = r4
            r15 = r7
            r2 = r8
        L_0x00c2:
            r25 = r19
            r14 = r23
            r19 = r36
        L_0x00c8:
            r23 = r5
            goto L_0x01bd
        L_0x00cc:
            r1 = 2
            if (r5 == r1) goto L_0x00f1
            if (r48 != 0) goto L_0x00f1
            r1 = 1
            if (r12 == r1) goto L_0x00d6
            if (r12 != 0) goto L_0x00f1
        L_0x00d6:
            int r1 = java.lang.Math.max(r3, r2)
            if (r4 <= 0) goto L_0x00e0
            int r1 = java.lang.Math.min(r4, r1)
        L_0x00e0:
            r2 = 8
            r10.mo4585e(r8, r9, r1, r2)
            r19 = r36
            r24 = r3
            r1 = r4
            r15 = r7
            r2 = r8
            r14 = r23
            r25 = 0
            goto L_0x00c8
        L_0x00f1:
            r1 = -2
            if (r3 != r1) goto L_0x00f6
            r14 = r2
            goto L_0x00f7
        L_0x00f6:
            r14 = r3
        L_0x00f7:
            if (r4 != r1) goto L_0x00fb
            r1 = r2
            goto L_0x00fc
        L_0x00fb:
            r1 = r4
        L_0x00fc:
            if (r2 <= 0) goto L_0x0102
            r3 = 1
            if (r12 == r3) goto L_0x0102
            r2 = 0
        L_0x0102:
            if (r14 <= 0) goto L_0x010d
            r3 = 8
            r10.mo4588h(r8, r9, r14, r3)
            int r2 = java.lang.Math.max(r2, r14)
        L_0x010d:
            if (r1 <= 0) goto L_0x0126
            if (r34 == 0) goto L_0x0116
            r3 = 1
            if (r12 != r3) goto L_0x0116
            r3 = 0
            goto L_0x0117
        L_0x0116:
            r3 = 1
        L_0x0117:
            if (r3 == 0) goto L_0x011f
            r3 = 8
            r10.mo4590j(r8, r9, r1, r3)
            goto L_0x0121
        L_0x011f:
            r3 = 8
        L_0x0121:
            int r2 = java.lang.Math.min(r2, r1)
            goto L_0x0128
        L_0x0126:
            r3 = 8
        L_0x0128:
            r4 = 1
            if (r12 != r4) goto L_0x0148
            if (r34 == 0) goto L_0x0131
            r10.mo4585e(r8, r9, r2, r3)
            goto L_0x0142
        L_0x0131:
            if (r50 == 0) goto L_0x013b
            r4 = 5
            r10.mo4585e(r8, r9, r2, r4)
            r10.mo4590j(r8, r9, r2, r3)
            goto L_0x0142
        L_0x013b:
            r4 = 5
            r10.mo4585e(r8, r9, r2, r4)
            r10.mo4590j(r8, r9, r2, r3)
        L_0x0142:
            r15 = r7
            r2 = r8
            r24 = r14
            goto L_0x00c2
        L_0x0148:
            r2 = 2
            if (r12 != r2) goto L_0x01af
            b.e.b.k.d$b r3 = r41.mo4646j()
            b.e.b.k.d$b r4 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.TOP
            if (r3 == r4) goto L_0x0175
            b.e.b.k.d$b r3 = r41.mo4646j()
            b.e.b.k.d$b r6 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.BOTTOM
            if (r3 != r6) goto L_0x015c
            goto L_0x0175
        L_0x015c:
            b.e.b.k.e r3 = r0.f4145U
            b.e.b.k.d$b r4 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.LEFT
            b.e.b.k.d r3 = r3.mo4723m(r4)
            b.e.b.i r3 = r10.mo4595q(r3)
            b.e.b.k.e r4 = r0.f4145U
            b.e.b.k.d$b r6 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.RIGHT
            b.e.b.k.d r4 = r4.mo4723m(r6)
            b.e.b.i r4 = r10.mo4595q(r4)
            goto L_0x018b
        L_0x0175:
            b.e.b.k.e r3 = r0.f4145U
            b.e.b.k.d r3 = r3.mo4723m(r4)
            b.e.b.i r3 = r10.mo4595q(r3)
            b.e.b.k.e r4 = r0.f4145U
            b.e.b.k.d$b r6 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.BOTTOM
            b.e.b.k.d r4 = r4.mo4723m(r6)
            b.e.b.i r4 = r10.mo4595q(r4)
        L_0x018b:
            r19 = r3
            r6 = r4
            b.e.b.b r3 = r32.mo4596r()
            r4 = r8
            r2 = r5
            r5 = r9
            r40 = r14
            r14 = r23
            r15 = r7
            r7 = r19
            r23 = r2
            r2 = r8
            r8 = r57
            b.e.b.b r3 = r3.mo4565k(r4, r5, r6, r7, r8)
            r10.mo4584d(r3)
            r19 = r36
            r24 = r40
            r25 = 0
            goto L_0x01bd
        L_0x01af:
            r15 = r7
            r2 = r8
            r40 = r14
            r14 = r23
            r23 = r5
            r24 = r40
            r25 = r19
            r19 = 1
        L_0x01bd:
            if (r58 == 0) goto L_0x04e0
            if (r50 == 0) goto L_0x01ce
            r3 = r38
            r4 = r2
            r13 = r9
            r1 = r11
            r5 = r23
            r2 = 0
            r7 = 2
            r30 = 1
            goto L_0x04eb
        L_0x01ce:
            if (r16 != 0) goto L_0x01d6
            if (r17 != 0) goto L_0x01d6
            if (r18 != 0) goto L_0x01d6
            goto L_0x04ad
        L_0x01d6:
            if (r16 == 0) goto L_0x01dc
            if (r17 != 0) goto L_0x01dc
            goto L_0x04ad
        L_0x01dc:
            if (r16 != 0) goto L_0x020d
            if (r17 == 0) goto L_0x020d
            int r1 = r42.mo4641e()
            int r1 = -r1
            r3 = 8
            r10.mo4585e(r2, r14, r1, r3)
            if (r34 == 0) goto L_0x04ad
            boolean r1 = r0.f4170k
            if (r1 == 0) goto L_0x0206
            boolean r1 = r9.f4044h
            if (r1 == 0) goto L_0x0206
            b.e.b.k.e r1 = r0.f4145U
            if (r1 == 0) goto L_0x0206
            b.e.b.k.f r1 = (p010b.p026e.p030b.p031k.ConstraintWidgetContainer) r1
            if (r33 == 0) goto L_0x0201
            r1.mo4761i1(r13)
            goto L_0x04ad
        L_0x0201:
            r1.mo4763n1(r13)
            goto L_0x04ad
        L_0x0206:
            r1 = 5
            r3 = 0
            r10.mo4588h(r9, r11, r3, r1)
            goto L_0x04ad
        L_0x020d:
            r3 = 0
            if (r16 == 0) goto L_0x04ad
            if (r17 == 0) goto L_0x04ad
            b.e.b.k.d r4 = r13.f4106f
            b.e.b.k.e r8 = r4.f4104d
            r6 = r42
            r7 = 0
            b.e.b.k.d r3 = r6.f4106f
            b.e.b.k.e r5 = r3.f4104d
            b.e.b.k.e r4 = r31.mo4673I()
            r16 = 6
            if (r25 == 0) goto L_0x0332
            if (r12 != 0) goto L_0x027b
            if (r1 != 0) goto L_0x024e
            if (r24 != 0) goto L_0x024e
            boolean r1 = r15.f4044h
            if (r1 == 0) goto L_0x0245
            boolean r1 = r14.f4044h
            if (r1 == 0) goto L_0x0245
            int r1 = r41.mo4641e()
            r3 = 8
            r10.mo4585e(r9, r15, r1, r3)
            int r1 = r42.mo4641e()
            int r1 = -r1
            r10.mo4585e(r2, r14, r1, r3)
            return
        L_0x0245:
            r1 = 0
            r3 = 1
            r17 = 0
            r18 = 8
            r21 = 8
            goto L_0x0256
        L_0x024e:
            r1 = 1
            r3 = 0
            r17 = 1
            r18 = 5
            r21 = 5
        L_0x0256:
            boolean r7 = r8 instanceof p010b.p026e.p030b.p031k.Barrier
            if (r7 != 0) goto L_0x0269
            boolean r7 = r5 instanceof p010b.p026e.p030b.p031k.Barrier
            if (r7 == 0) goto L_0x025f
            goto L_0x0269
        L_0x025f:
            r20 = r17
            r23 = r18
            r22 = r21
            r7 = 1
            r21 = 6
            goto L_0x0272
        L_0x0269:
            r20 = r17
            r23 = r18
            r7 = 1
            r21 = 6
            r22 = 4
        L_0x0272:
            r17 = r1
            r18 = r3
            r1 = 3
        L_0x0277:
            r3 = r38
            goto L_0x0382
        L_0x027b:
            r3 = 1
            if (r12 != r3) goto L_0x0290
            r3 = r38
            r1 = 3
            r7 = 1
            r17 = 1
            r18 = 0
            r20 = 1
            r21 = 6
            r22 = 4
        L_0x028c:
            r23 = 8
            goto L_0x0382
        L_0x0290:
            r3 = 3
            if (r12 != r3) goto L_0x0327
            int r7 = r0.f4200z
            r3 = -1
            if (r7 != r3) goto L_0x02bb
            if (r51 == 0) goto L_0x02ac
            r3 = r38
            r1 = 3
            r7 = 1
            r17 = 1
            r18 = 1
            r20 = 1
            if (r34 == 0) goto L_0x02a9
            r21 = 5
            goto L_0x02b8
        L_0x02a9:
            r21 = 4
            goto L_0x02b8
        L_0x02ac:
            r3 = r38
            r1 = 3
            r7 = 1
            r17 = 1
            r18 = 1
            r20 = 1
            r21 = 8
        L_0x02b8:
            r22 = 5
            goto L_0x028c
        L_0x02bb:
            if (r48 == 0) goto L_0x02e0
            r3 = r54
            r7 = 2
            if (r3 == r7) goto L_0x02c8
            r7 = 1
            if (r3 != r7) goto L_0x02c6
            goto L_0x02c9
        L_0x02c6:
            r1 = 0
            goto L_0x02ca
        L_0x02c8:
            r7 = 1
        L_0x02c9:
            r1 = 1
        L_0x02ca:
            if (r1 != 0) goto L_0x02d0
            r1 = 8
            r3 = 5
            goto L_0x02d2
        L_0x02d0:
            r1 = 5
            r3 = 4
        L_0x02d2:
            r23 = r1
            r22 = r3
            r1 = 3
            r17 = 1
            r18 = 1
            r20 = 1
            r21 = 6
            goto L_0x0277
        L_0x02e0:
            r7 = 1
            if (r1 <= 0) goto L_0x02f2
            r3 = r38
            r1 = 3
            r17 = 1
            r18 = 1
            r20 = 1
            r21 = 6
            r22 = 5
            goto L_0x0380
        L_0x02f2:
            if (r1 != 0) goto L_0x031f
            if (r24 != 0) goto L_0x031f
            if (r51 != 0) goto L_0x0307
            r3 = r38
            r1 = 3
            r17 = 1
            r18 = 1
            r20 = 1
            r21 = 6
            r22 = 8
            goto L_0x0380
        L_0x0307:
            if (r8 == r4) goto L_0x030d
            if (r5 == r4) goto L_0x030d
            r1 = 4
            goto L_0x030e
        L_0x030d:
            r1 = 5
        L_0x030e:
            r3 = r38
            r23 = r1
            r1 = 3
            r17 = 1
            r18 = 1
            r20 = 1
            r21 = 6
            r22 = 4
            goto L_0x0382
        L_0x031f:
            r3 = r38
            r1 = 3
            r17 = 1
            r18 = 1
            goto L_0x037a
        L_0x0327:
            r7 = 1
            r3 = r38
            r1 = 3
            r17 = 0
            r18 = 0
            r20 = 0
            goto L_0x037c
        L_0x0332:
            r7 = 1
            boolean r1 = r15.f4044h
            if (r1 == 0) goto L_0x0373
            boolean r1 = r14.f4044h
            if (r1 == 0) goto L_0x0373
            int r1 = r41.mo4641e()
            int r3 = r42.mo4641e()
            r4 = 8
            r48 = r32
            r49 = r9
            r50 = r15
            r51 = r1
            r52 = r47
            r53 = r14
            r54 = r2
            r55 = r3
            r56 = r4
            r48.mo4583c(r49, r50, r51, r52, r53, r54, r55, r56)
            if (r34 == 0) goto L_0x0372
            if (r19 == 0) goto L_0x0372
            b.e.b.k.d r1 = r6.f4106f
            if (r1 == 0) goto L_0x0369
            int r1 = r42.mo4641e()
            r3 = r38
            goto L_0x036c
        L_0x0369:
            r3 = r38
            r1 = 0
        L_0x036c:
            if (r14 == r3) goto L_0x0372
            r4 = 5
            r10.mo4588h(r3, r2, r1, r4)
        L_0x0372:
            return
        L_0x0373:
            r3 = r38
            r1 = 3
            r17 = 1
            r18 = 0
        L_0x037a:
            r20 = 1
        L_0x037c:
            r21 = 6
            r22 = 4
        L_0x0380:
            r23 = 5
        L_0x0382:
            if (r20 == 0) goto L_0x038d
            if (r15 != r14) goto L_0x038d
            if (r8 == r4) goto L_0x038d
            r20 = 0
            r26 = 0
            goto L_0x038f
        L_0x038d:
            r26 = 1
        L_0x038f:
            if (r17 == 0) goto L_0x03cf
            if (r25 != 0) goto L_0x03a4
            if (r49 != 0) goto L_0x03a4
            if (r51 != 0) goto L_0x03a4
            if (r15 != r11) goto L_0x03a4
            if (r14 != r3) goto L_0x03a4
            r17 = 0
            r21 = 8
            r23 = 8
            r26 = 0
            goto L_0x03a6
        L_0x03a4:
            r17 = r34
        L_0x03a6:
            int r27 = r41.mo4641e()
            int r28 = r42.mo4641e()
            r13 = 3
            r1 = r32
            r7 = r2
            r29 = 4
            r30 = 1
            r2 = r9
            r3 = r15
            r13 = r4
            r4 = r27
            r27 = r12
            r12 = r5
            r5 = r47
            r6 = r14
            r40 = r7
            r11 = r8
            r8 = r28
            r28 = r13
            r13 = r9
            r9 = r21
            r1.mo4583c(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x03de
        L_0x03cf:
            r40 = r2
            r28 = r4
            r11 = r8
            r13 = r9
            r27 = r12
            r29 = 4
            r30 = 1
            r12 = r5
            r17 = r34
        L_0x03de:
            r2 = r26
            int r1 = r0.f4175m0
            r3 = 8
            if (r1 != r3) goto L_0x03ed
            boolean r1 = r42.mo4648l()
            if (r1 != 0) goto L_0x03ed
            return
        L_0x03ed:
            if (r20 == 0) goto L_0x0415
            if (r17 == 0) goto L_0x03ff
            if (r15 == r14) goto L_0x03ff
            if (r25 != 0) goto L_0x03ff
            boolean r1 = r11 instanceof p010b.p026e.p030b.p031k.Barrier
            if (r1 != 0) goto L_0x03fd
            boolean r1 = r12 instanceof p010b.p026e.p030b.p031k.Barrier
            if (r1 == 0) goto L_0x03ff
        L_0x03fd:
            r1 = 6
            goto L_0x0401
        L_0x03ff:
            r1 = r23
        L_0x0401:
            int r3 = r41.mo4641e()
            r10.mo4588h(r13, r15, r3, r1)
            int r3 = r42.mo4641e()
            int r3 = -r3
            r4 = r40
            r10.mo4590j(r4, r14, r3, r1)
            r23 = r1
            goto L_0x0417
        L_0x0415:
            r4 = r40
        L_0x0417:
            if (r17 == 0) goto L_0x0427
            if (r52 == 0) goto L_0x0427
            boolean r1 = r11 instanceof p010b.p026e.p030b.p031k.Barrier
            if (r1 != 0) goto L_0x0427
            boolean r1 = r12 instanceof p010b.p026e.p030b.p031k.Barrier
            if (r1 != 0) goto L_0x0427
            r1 = 6
            r2 = 1
            r3 = 6
            goto L_0x042b
        L_0x0427:
            r1 = r22
            r3 = r23
        L_0x042b:
            if (r2 == 0) goto L_0x047d
            if (r18 == 0) goto L_0x045b
            if (r51 == 0) goto L_0x0433
            if (r35 == 0) goto L_0x045b
        L_0x0433:
            r2 = r28
            if (r11 == r2) goto L_0x043c
            if (r12 != r2) goto L_0x043a
            goto L_0x043c
        L_0x043a:
            r16 = r1
        L_0x043c:
            boolean r5 = r11 instanceof p010b.p026e.p030b.p031k.Guideline
            if (r5 != 0) goto L_0x0444
            boolean r5 = r12 instanceof p010b.p026e.p030b.p031k.Guideline
            if (r5 == 0) goto L_0x0446
        L_0x0444:
            r16 = 5
        L_0x0446:
            boolean r5 = r11 instanceof p010b.p026e.p030b.p031k.Barrier
            if (r5 != 0) goto L_0x044e
            boolean r5 = r12 instanceof p010b.p026e.p030b.p031k.Barrier
            if (r5 == 0) goto L_0x0450
        L_0x044e:
            r16 = 5
        L_0x0450:
            if (r51 == 0) goto L_0x0454
            r5 = 5
            goto L_0x0456
        L_0x0454:
            r5 = r16
        L_0x0456:
            int r1 = java.lang.Math.max(r5, r1)
            goto L_0x045d
        L_0x045b:
            r2 = r28
        L_0x045d:
            if (r17 == 0) goto L_0x046d
            int r1 = java.lang.Math.min(r3, r1)
            if (r48 == 0) goto L_0x046d
            if (r51 != 0) goto L_0x046d
            if (r11 == r2) goto L_0x046b
            if (r12 != r2) goto L_0x046d
        L_0x046b:
            r2 = 4
            goto L_0x046e
        L_0x046d:
            r2 = r1
        L_0x046e:
            int r1 = r41.mo4641e()
            r10.mo4585e(r13, r15, r1, r2)
            int r1 = r42.mo4641e()
            int r1 = -r1
            r10.mo4585e(r4, r14, r1, r2)
        L_0x047d:
            if (r17 == 0) goto L_0x048f
            r1 = r37
            if (r1 != r15) goto L_0x0488
            int r2 = r41.mo4641e()
            goto L_0x0489
        L_0x0488:
            r2 = 0
        L_0x0489:
            if (r15 == r1) goto L_0x048f
            r3 = 5
            r10.mo4588h(r13, r1, r2, r3)
        L_0x048f:
            if (r17 == 0) goto L_0x04ab
            if (r25 == 0) goto L_0x04ab
            if (r45 != 0) goto L_0x04ab
            if (r24 != 0) goto L_0x04ab
            if (r25 == 0) goto L_0x04a5
            r12 = r27
            r1 = 3
            if (r12 != r1) goto L_0x04a5
            r1 = 8
            r2 = 0
            r10.mo4588h(r4, r13, r2, r1)
            goto L_0x04b1
        L_0x04a5:
            r2 = 0
            r1 = 5
            r10.mo4588h(r4, r13, r2, r1)
            goto L_0x04b1
        L_0x04ab:
            r2 = 0
            goto L_0x04b1
        L_0x04ad:
            r4 = r2
            r2 = 0
            r17 = r34
        L_0x04b1:
            if (r17 == 0) goto L_0x04df
            if (r19 == 0) goto L_0x04df
            r1 = r42
            b.e.b.k.d r3 = r1.f4106f
            if (r3 == 0) goto L_0x04bf
            int r2 = r42.mo4641e()
        L_0x04bf:
            r3 = r38
            if (r14 == r3) goto L_0x04df
            boolean r5 = r0.f4170k
            if (r5 == 0) goto L_0x04db
            boolean r5 = r4.f4044h
            if (r5 == 0) goto L_0x04db
            b.e.b.k.e r5 = r0.f4145U
            if (r5 == 0) goto L_0x04db
            b.e.b.k.f r5 = (p010b.p026e.p030b.p031k.ConstraintWidgetContainer) r5
            if (r33 == 0) goto L_0x04d7
            r5.mo4760h1(r1)
            goto L_0x04da
        L_0x04d7:
            r5.mo4762m1(r1)
        L_0x04da:
            return
        L_0x04db:
            r1 = 5
            r10.mo4588h(r3, r4, r2, r1)
        L_0x04df:
            return
        L_0x04e0:
            r3 = r38
            r4 = r2
            r13 = r9
            r1 = r11
            r2 = 0
            r7 = 2
            r30 = 1
            r5 = r23
        L_0x04eb:
            if (r5 >= r7) goto L_0x052c
            if (r34 == 0) goto L_0x052c
            if (r19 == 0) goto L_0x052c
            r5 = 8
            r10.mo4588h(r13, r1, r2, r5)
            if (r33 != 0) goto L_0x0501
            b.e.b.k.d r1 = r0.f4137M
            b.e.b.k.d r1 = r1.f4106f
            if (r1 != 0) goto L_0x04ff
            goto L_0x0501
        L_0x04ff:
            r1 = 0
            goto L_0x0502
        L_0x0501:
            r1 = 1
        L_0x0502:
            if (r33 != 0) goto L_0x0523
            b.e.b.k.d r5 = r0.f4137M
            b.e.b.k.d r5 = r5.f4106f
            if (r5 == 0) goto L_0x0523
            b.e.b.k.e r1 = r5.f4104d
            float r5 = r1.f4148X
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x0520
            b.e.b.k.e$b[] r1 = r1.f4144T
            r5 = r1[r2]
            b.e.b.k.e$b r6 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x0520
            r1 = r1[r30]
            if (r1 != r6) goto L_0x0520
            goto L_0x0525
        L_0x0520:
            r30 = 0
            goto L_0x0525
        L_0x0523:
            r30 = r1
        L_0x0525:
            if (r30 == 0) goto L_0x052c
            r1 = 8
            r10.mo4588h(r3, r4, r2, r1)
        L_0x052c:
            return
        L_0x052d:
            p010b.p026e.p030b.LinearSystem.m4587w()
            r1 = 0
            goto L_0x0533
        L_0x0532:
            throw r1
        L_0x0533:
            goto L_0x0532
        */
        throw new UnsupportedOperationException("Method not decompiled: p010b.p026e.p030b.p031k.ConstraintWidget.m4695i(b.e.b.d, boolean, boolean, boolean, boolean, b.e.b.i, b.e.b.i, b.e.b.k.e$b, boolean, b.e.b.k.d, b.e.b.k.d, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    /* renamed from: A */
    public int mo4657A() {
        return this.f4131G;
    }

    /* renamed from: A0 */
    public void mo4658A0(int i, int i2, int i3, float f) {
        this.f4182q = i;
        this.f4188t = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.f4190u = i3;
        this.f4192v = f;
        if (f > 0.0f && f < 1.0f && i == 0) {
            this.f4182q = 2;
        }
    }

    /* renamed from: B */
    public int mo4659B() {
        return this.f4132H;
    }

    /* renamed from: B0 */
    public void mo4660B0(float f) {
        this.f4195w0[0] = f;
    }

    /* renamed from: C */
    public int mo4661C(int i) {
        if (i == 0) {
            return mo4691R();
        }
        if (i == 1) {
            return mo4741v();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C0 */
    public void mo4662C0(int i, boolean z) {
        this.f4143S[i] = z;
    }

    /* renamed from: D */
    public int mo4663D() {
        return this.f4124B[1];
    }

    /* renamed from: D0 */
    public void mo4664D0(boolean z) {
        this.f4129E = z;
    }

    /* renamed from: E */
    public int mo4665E() {
        return this.f4124B[0];
    }

    /* renamed from: E0 */
    public void mo4666E0(boolean z) {
        this.f4130F = z;
    }

    /* renamed from: F */
    public int mo4667F() {
        return this.f4165h0;
    }

    /* renamed from: F0 */
    public void mo4668F0(int i, int i2) {
        this.f4131G = i;
        this.f4132H = i2;
        mo4674I0(false);
    }

    /* renamed from: G */
    public int mo4669G() {
        return this.f4163g0;
    }

    /* renamed from: G0 */
    public void mo4670G0(int i) {
        this.f4124B[1] = i;
    }

    /* renamed from: H */
    public ConstraintWidget mo4671H(int i) {
        if (i == 0) {
            ConstraintAnchor dVar = this.f4135K;
            ConstraintAnchor dVar2 = dVar.f4106f;
            if (dVar2 != null && dVar2.f4106f == dVar) {
                return dVar2.f4104d;
            }
        } else if (i == 1) {
            ConstraintAnchor dVar3 = this.f4136L;
            ConstraintAnchor dVar4 = dVar3.f4106f;
            if (dVar4 != null && dVar4.f4106f == dVar3) {
                return dVar4.f4104d;
            }
        }
        return null;
    }

    /* renamed from: H0 */
    public void mo4672H0(int i) {
        this.f4124B[0] = i;
    }

    /* renamed from: I */
    public ConstraintWidget mo4673I() {
        return this.f4145U;
    }

    /* renamed from: I0 */
    public void mo4674I0(boolean z) {
        this.f4168j = z;
    }

    /* renamed from: J */
    public ConstraintWidget mo4675J(int i) {
        if (i == 0) {
            ConstraintAnchor dVar = this.f4133I;
            ConstraintAnchor dVar2 = dVar.f4106f;
            if (dVar2 != null && dVar2.f4106f == dVar) {
                return dVar2.f4104d;
            }
        } else if (i == 1) {
            ConstraintAnchor dVar3 = this.f4134J;
            ConstraintAnchor dVar4 = dVar3.f4106f;
            if (dVar4 != null && dVar4.f4106f == dVar3) {
                return dVar4.f4104d;
            }
        }
        return null;
    }

    /* renamed from: J0 */
    public void mo4676J0(int i) {
        if (i < 0) {
            this.f4165h0 = 0;
        } else {
            this.f4165h0 = i;
        }
    }

    /* renamed from: K */
    public int mo4677K() {
        return mo4693S() + this.f4146V;
    }

    /* renamed from: K0 */
    public void mo4678K0(int i) {
        if (i < 0) {
            this.f4163g0 = 0;
        } else {
            this.f4163g0 = i;
        }
    }

    /* renamed from: L */
    public WidgetRun mo4679L(int i) {
        if (i == 0) {
            return this.f4160f;
        }
        if (i == 1) {
            return this.f4162g;
        }
        return null;
    }

    /* renamed from: L0 */
    public void mo4680L0(int i, int i2) {
        this.f4150Z = i;
        this.f4151a0 = i2;
    }

    /* renamed from: M */
    public float mo4681M() {
        return this.f4169j0;
    }

    /* renamed from: M0 */
    public void mo4682M0(ConstraintWidget eVar) {
        this.f4145U = eVar;
    }

    /* renamed from: N */
    public int mo4683N() {
        return this.f4189t0;
    }

    /* renamed from: N0 */
    public void mo4684N0(float f) {
        this.f4169j0 = f;
    }

    /* renamed from: O */
    public C0561b mo4685O() {
        return this.f4144T[1];
    }

    /* renamed from: O0 */
    public void mo4686O0(int i) {
        this.f4189t0 = i;
    }

    /* renamed from: P */
    public int mo4687P() {
        int i = 0;
        if (this.f4133I != null) {
            i = 0 + this.f4134J.f4107g;
        }
        return this.f4135K != null ? i + this.f4136L.f4107g : i;
    }

    /* renamed from: P0 */
    public void mo4688P0(int i, int i2) {
        this.f4151a0 = i;
        int i3 = i2 - i;
        this.f4147W = i3;
        int i4 = this.f4165h0;
        if (i3 < i4) {
            this.f4147W = i4;
        }
    }

    /* renamed from: Q */
    public int mo4689Q() {
        return this.f4175m0;
    }

    /* renamed from: Q0 */
    public void mo4690Q0(C0561b bVar) {
        this.f4144T[1] = bVar;
    }

    /* renamed from: R */
    public int mo4691R() {
        if (this.f4175m0 == 8) {
            return 0;
        }
        return this.f4146V;
    }

    /* renamed from: R0 */
    public void mo4692R0(int i, int i2, int i3, float f) {
        this.f4184r = i;
        this.f4194w = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.f4196x = i3;
        this.f4198y = f;
        if (f > 0.0f && f < 1.0f && i == 0) {
            this.f4184r = 2;
        }
    }

    /* renamed from: S */
    public int mo4693S() {
        ConstraintWidget eVar = this.f4145U;
        if (eVar == null || !(eVar instanceof ConstraintWidgetContainer)) {
            return this.f4150Z;
        }
        return ((ConstraintWidgetContainer) eVar).f4215K0 + this.f4150Z;
    }

    /* renamed from: S0 */
    public void mo4694S0(float f) {
        this.f4195w0[1] = f;
    }

    /* renamed from: T */
    public int mo4695T() {
        ConstraintWidget eVar = this.f4145U;
        if (eVar == null || !(eVar instanceof ConstraintWidgetContainer)) {
            return this.f4151a0;
        }
        return ((ConstraintWidgetContainer) eVar).f4216L0 + this.f4151a0;
    }

    /* renamed from: T0 */
    public void mo4696T0(int i) {
        this.f4175m0 = i;
    }

    /* renamed from: U */
    public boolean mo4697U() {
        return this.f4128D;
    }

    /* renamed from: U0 */
    public void mo4698U0(int i) {
        this.f4146V = i;
        int i2 = this.f4163g0;
        if (i < i2) {
            this.f4146V = i2;
        }
    }

    /* renamed from: V */
    public boolean mo4699V(int i) {
        boolean z = true;
        if (i == 0) {
            if ((this.f4133I.f4106f != null ? 1 : 0) + (this.f4135K.f4106f != null ? 1 : 0) >= 2) {
                z = false;
            }
            return z;
        }
        if ((this.f4134J.f4106f != null ? 1 : 0) + (this.f4136L.f4106f != null ? 1 : 0) + (this.f4137M.f4106f != null ? 1 : 0) >= 2) {
            z = false;
        }
        return z;
    }

    /* renamed from: V0 */
    public void mo4700V0(int i) {
        this.f4150Z = i;
    }

    /* renamed from: W */
    public boolean mo4701W() {
        int size = this.f4142R.size();
        for (int i = 0; i < size; i++) {
            if (((ConstraintAnchor) this.f4142R.get(i)).mo4648l()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: W0 */
    public void mo4702W0(int i) {
        this.f4151a0 = i;
    }

    /* renamed from: X */
    public void mo4703X(C0559b bVar, ConstraintWidget eVar, C0559b bVar2, int i, int i2) {
        mo4723m(bVar).mo4637a(eVar.mo4723m(bVar2), i, i2, true);
    }

    /* renamed from: X0 */
    public void mo4704X0(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.f4200z == -1) {
            if (z3 && !z4) {
                this.f4200z = 0;
            } else if (!z3 && z4) {
                this.f4200z = 1;
                if (this.f4149Y == -1) {
                    this.f4122A = 1.0f / this.f4122A;
                }
            }
        }
        if (this.f4200z == 0 && (!this.f4134J.mo4650n() || !this.f4136L.mo4650n())) {
            this.f4200z = 1;
        } else if (this.f4200z == 1 && (!this.f4133I.mo4650n() || !this.f4135K.mo4650n())) {
            this.f4200z = 0;
        }
        if (this.f4200z == -1 && (!this.f4134J.mo4650n() || !this.f4136L.mo4650n() || !this.f4133I.mo4650n() || !this.f4135K.mo4650n())) {
            if (this.f4134J.mo4650n() && this.f4136L.mo4650n()) {
                this.f4200z = 0;
            } else if (this.f4133I.mo4650n() && this.f4135K.mo4650n()) {
                this.f4122A = 1.0f / this.f4122A;
                this.f4200z = 1;
            }
        }
        if (this.f4200z == -1) {
            int i = this.f4188t;
            if (i > 0 && this.f4194w == 0) {
                this.f4200z = 0;
            } else if (i == 0 && this.f4194w > 0) {
                this.f4122A = 1.0f / this.f4122A;
                this.f4200z = 1;
            }
        }
    }

    /* renamed from: Y0 */
    public void mo4705Y0(boolean z, boolean z2) {
        boolean k = z & this.f4160f.mo4839k();
        boolean k2 = z2 & this.f4162g.mo4839k();
        HorizontalWidgetRun lVar = this.f4160f;
        int i = lVar.f4348h.f4296g;
        VerticalWidgetRun nVar = this.f4162g;
        int i2 = nVar.f4348h.f4296g;
        int i3 = lVar.f4349i.f4296g;
        int i4 = nVar.f4349i.f4296g;
        int i5 = i4 - i2;
        if (i3 - i < 0 || i5 < 0 || i == Integer.MIN_VALUE || i == Integer.MAX_VALUE || i2 == Integer.MIN_VALUE || i2 == Integer.MAX_VALUE || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE) {
            i3 = 0;
            i = 0;
            i4 = 0;
            i2 = 0;
        }
        int i6 = i3 - i;
        int i7 = i4 - i2;
        if (k) {
            this.f4150Z = i;
        }
        if (k2) {
            this.f4151a0 = i2;
        }
        if (this.f4175m0 == 8) {
            this.f4146V = 0;
            this.f4147W = 0;
            return;
        }
        if (k) {
            if (this.f4144T[0] == C0561b.FIXED) {
                int i8 = this.f4146V;
                if (i6 < i8) {
                    i6 = i8;
                }
            }
            this.f4146V = i6;
            int i9 = this.f4163g0;
            if (i6 < i9) {
                this.f4146V = i9;
            }
        }
        if (k2) {
            if (this.f4144T[1] == C0561b.FIXED) {
                int i10 = this.f4147W;
                if (i7 < i10) {
                    i7 = i10;
                }
            }
            this.f4147W = i7;
            int i11 = this.f4165h0;
            if (i7 < i11) {
                this.f4147W = i11;
            }
        }
    }

    /* renamed from: Z */
    public boolean mo4706Z() {
        ConstraintAnchor dVar = this.f4133I;
        ConstraintAnchor dVar2 = dVar.f4106f;
        if (dVar2 == null || dVar2.f4106f != dVar) {
            ConstraintAnchor dVar3 = this.f4135K;
            ConstraintAnchor dVar4 = dVar3.f4106f;
            if (dVar4 == null || dVar4.f4106f != dVar3) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: Z0 */
    public void mo4707Z0(LinearSystem dVar, boolean z) {
        int x = dVar.mo4599x(this.f4133I);
        int x2 = dVar.mo4599x(this.f4134J);
        int x3 = dVar.mo4599x(this.f4135K);
        int x4 = dVar.mo4599x(this.f4136L);
        if (z) {
            HorizontalWidgetRun lVar = this.f4160f;
            if (lVar != null) {
                DependencyNode fVar = lVar.f4348h;
                if (fVar.f4299j) {
                    DependencyNode fVar2 = lVar.f4349i;
                    if (fVar2.f4299j) {
                        x = fVar.f4296g;
                        x3 = fVar2.f4296g;
                    }
                }
            }
        }
        if (z) {
            VerticalWidgetRun nVar = this.f4162g;
            if (nVar != null) {
                DependencyNode fVar3 = nVar.f4348h;
                if (fVar3.f4299j) {
                    DependencyNode fVar4 = nVar.f4349i;
                    if (fVar4.f4299j) {
                        x2 = fVar3.f4296g;
                        x4 = fVar4.f4296g;
                    }
                }
            }
        }
        int i = x4 - x2;
        if (x3 - x < 0 || i < 0 || x == Integer.MIN_VALUE || x == Integer.MAX_VALUE || x2 == Integer.MIN_VALUE || x2 == Integer.MAX_VALUE || x3 == Integer.MIN_VALUE || x3 == Integer.MAX_VALUE || x4 == Integer.MIN_VALUE || x4 == Integer.MAX_VALUE) {
            x4 = 0;
            x = 0;
            x2 = 0;
            x3 = 0;
        }
        mo4738t0(x, x2, x3, x4);
    }

    /* renamed from: a0 */
    public boolean mo4708a0() {
        return this.f4129E;
    }

    /* renamed from: b0 */
    public boolean mo4709b0() {
        ConstraintAnchor dVar = this.f4134J;
        ConstraintAnchor dVar2 = dVar.f4106f;
        if (dVar2 == null || dVar2.f4106f != dVar) {
            ConstraintAnchor dVar3 = this.f4136L;
            ConstraintAnchor dVar4 = dVar3.f4106f;
            if (dVar4 == null || dVar4.f4106f != dVar3) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c0 */
    public boolean mo4710c0() {
        return this.f4130F;
    }

    /* renamed from: d0 */
    public boolean mo4711d0() {
        return this.f4168j && this.f4175m0 != 8;
    }

    /* renamed from: e */
    public void mo4712e(ConstraintWidgetContainer fVar, LinearSystem dVar, HashSet<ConstraintWidget> hashSet, int i, boolean z) {
        if (z) {
            if (hashSet.contains(this)) {
                Optimizer.m4851a(fVar, dVar, this);
                hashSet.remove(this);
                mo4628g(dVar, fVar.mo4751B1(64));
            } else {
                return;
            }
        }
        if (i == 0) {
            HashSet c = this.f4133I.mo4639c();
            if (c != null) {
                Iterator it = c.iterator();
                while (it.hasNext()) {
                    ((ConstraintAnchor) it.next()).f4104d.mo4712e(fVar, dVar, hashSet, i, true);
                }
            }
            HashSet c2 = this.f4135K.mo4639c();
            if (c2 != null) {
                Iterator it2 = c2.iterator();
                while (it2.hasNext()) {
                    ((ConstraintAnchor) it2.next()).f4104d.mo4712e(fVar, dVar, hashSet, i, true);
                }
            }
        } else {
            HashSet c3 = this.f4134J.mo4639c();
            if (c3 != null) {
                Iterator it3 = c3.iterator();
                while (it3.hasNext()) {
                    ((ConstraintAnchor) it3.next()).f4104d.mo4712e(fVar, dVar, hashSet, i, true);
                }
            }
            HashSet c4 = this.f4136L.mo4639c();
            if (c4 != null) {
                Iterator it4 = c4.iterator();
                while (it4.hasNext()) {
                    ((ConstraintAnchor) it4.next()).f4104d.mo4712e(fVar, dVar, hashSet, i, true);
                }
            }
            HashSet c5 = this.f4137M.mo4639c();
            if (c5 != null) {
                Iterator it5 = c5.iterator();
                while (it5.hasNext()) {
                    ((ConstraintAnchor) it5.next()).f4104d.mo4712e(fVar, dVar, hashSet, i, true);
                }
            }
        }
    }

    /* renamed from: e0 */
    public boolean mo4624e0() {
        return this.f4174m || (this.f4133I.mo4649m() && this.f4135K.mo4649m());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo4713f() {
        return (this instanceof C0563k) || (this instanceof Guideline);
    }

    /* renamed from: f0 */
    public boolean mo4626f0() {
        return this.f4176n || (this.f4134J.mo4649m() && this.f4136L.mo4649m());
    }

    /* JADX WARNING: Removed duplicated region for block: B:179:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x02f2  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0388  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0391  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0397  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x03a0  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x03c0  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x03c3  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0434  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x0498  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x04ac  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x04ae  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x04b1  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0542  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0545  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x058b  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x05b6  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x05c0  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4628g(p010b.p026e.p030b.LinearSystem r54, boolean r55) {
        /*
            r53 = this;
            r15 = r53
            r14 = r54
            b.e.b.k.d r0 = r15.f4133I
            b.e.b.i r13 = r14.mo4595q(r0)
            b.e.b.k.d r0 = r15.f4135K
            b.e.b.i r12 = r14.mo4595q(r0)
            b.e.b.k.d r0 = r15.f4134J
            b.e.b.i r11 = r14.mo4595q(r0)
            b.e.b.k.d r0 = r15.f4136L
            b.e.b.i r10 = r14.mo4595q(r0)
            b.e.b.k.d r0 = r15.f4137M
            b.e.b.i r9 = r14.mo4595q(r0)
            b.e.b.k.e r0 = r15.f4145U
            r8 = 1
            r7 = 0
            if (r0 == 0) goto L_0x0045
            if (r0 == 0) goto L_0x0034
            b.e.b.k.e$b[] r1 = r0.f4144T
            r1 = r1[r7]
            b.e.b.k.e$b r2 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.WRAP_CONTENT
            if (r1 != r2) goto L_0x0034
            r1 = 1
            goto L_0x0035
        L_0x0034:
            r1 = 0
        L_0x0035:
            if (r0 == 0) goto L_0x0041
            b.e.b.k.e$b[] r0 = r0.f4144T
            r0 = r0[r8]
            b.e.b.k.e$b r2 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.WRAP_CONTENT
            if (r0 != r2) goto L_0x0041
            r0 = 1
            goto L_0x0042
        L_0x0041:
            r0 = 0
        L_0x0042:
            r6 = r0
            r5 = r1
            goto L_0x0047
        L_0x0045:
            r5 = 0
            r6 = 0
        L_0x0047:
            int r0 = r15.f4175m0
            r4 = 8
            if (r0 != r4) goto L_0x005e
            boolean r0 = r53.mo4701W()
            if (r0 != 0) goto L_0x005e
            boolean[] r0 = r15.f4143S
            boolean r1 = r0[r7]
            if (r1 != 0) goto L_0x005e
            boolean r0 = r0[r8]
            if (r0 != 0) goto L_0x005e
            return
        L_0x005e:
            boolean r0 = r15.f4174m
            r3 = 5
            if (r0 != 0) goto L_0x0067
            boolean r1 = r15.f4176n
            if (r1 == 0) goto L_0x00e4
        L_0x0067:
            if (r0 == 0) goto L_0x0096
            int r0 = r15.f4150Z
            r14.mo4586f(r13, r0)
            int r0 = r15.f4150Z
            int r1 = r15.f4146V
            int r0 = r0 + r1
            r14.mo4586f(r12, r0)
            if (r5 == 0) goto L_0x0096
            b.e.b.k.e r0 = r15.f4145U
            if (r0 == 0) goto L_0x0096
            boolean r1 = r15.f4172l
            if (r1 == 0) goto L_0x008d
            b.e.b.k.f r0 = (p010b.p026e.p030b.p031k.ConstraintWidgetContainer) r0
            b.e.b.k.d r1 = r15.f4133I
            r0.mo4763n1(r1)
            b.e.b.k.d r1 = r15.f4135K
            r0.mo4760h1(r1)
            goto L_0x0096
        L_0x008d:
            b.e.b.k.d r0 = r0.f4135K
            b.e.b.i r0 = r14.mo4595q(r0)
            r14.mo4588h(r0, r12, r7, r3)
        L_0x0096:
            boolean r0 = r15.f4176n
            if (r0 == 0) goto L_0x00d7
            int r0 = r15.f4151a0
            r14.mo4586f(r11, r0)
            int r0 = r15.f4151a0
            int r1 = r15.f4147W
            int r0 = r0 + r1
            r14.mo4586f(r10, r0)
            b.e.b.k.d r0 = r15.f4137M
            boolean r0 = r0.mo4648l()
            if (r0 == 0) goto L_0x00b7
            int r0 = r15.f4151a0
            int r1 = r15.f4161f0
            int r0 = r0 + r1
            r14.mo4586f(r9, r0)
        L_0x00b7:
            if (r6 == 0) goto L_0x00d7
            b.e.b.k.e r0 = r15.f4145U
            if (r0 == 0) goto L_0x00d7
            boolean r1 = r15.f4172l
            if (r1 == 0) goto L_0x00ce
            b.e.b.k.f r0 = (p010b.p026e.p030b.p031k.ConstraintWidgetContainer) r0
            b.e.b.k.d r1 = r15.f4134J
            r0.mo4763n1(r1)
            b.e.b.k.d r1 = r15.f4136L
            r0.mo4762m1(r1)
            goto L_0x00d7
        L_0x00ce:
            b.e.b.k.d r0 = r0.f4136L
            b.e.b.i r0 = r14.mo4595q(r0)
            r14.mo4588h(r0, r10, r7, r3)
        L_0x00d7:
            boolean r0 = r15.f4174m
            if (r0 == 0) goto L_0x00e4
            boolean r0 = r15.f4176n
            if (r0 == 0) goto L_0x00e4
            r15.f4174m = r7
            r15.f4176n = r7
            return
        L_0x00e4:
            b.e.b.e r0 = p010b.p026e.p030b.LinearSystem.f4004g
            r28 = 0
            if (r0 != 0) goto L_0x05e8
            if (r55 == 0) goto L_0x0174
            b.e.b.k.m.l r1 = r15.f4160f
            if (r1 == 0) goto L_0x0174
            b.e.b.k.m.n r2 = r15.f4162g
            if (r2 == 0) goto L_0x0174
            b.e.b.k.m.f r3 = r1.f4348h
            boolean r8 = r3.f4299j
            if (r8 == 0) goto L_0x0174
            b.e.b.k.m.f r1 = r1.f4349i
            boolean r1 = r1.f4299j
            if (r1 == 0) goto L_0x0174
            b.e.b.k.m.f r1 = r2.f4348h
            boolean r1 = r1.f4299j
            if (r1 == 0) goto L_0x0174
            b.e.b.k.m.f r1 = r2.f4349i
            boolean r1 = r1.f4299j
            if (r1 == 0) goto L_0x0174
            if (r0 != 0) goto L_0x0173
            int r0 = r3.f4296g
            r14.mo4586f(r13, r0)
            b.e.b.k.m.l r0 = r15.f4160f
            b.e.b.k.m.f r0 = r0.f4349i
            int r0 = r0.f4296g
            r14.mo4586f(r12, r0)
            b.e.b.k.m.n r0 = r15.f4162g
            b.e.b.k.m.f r0 = r0.f4348h
            int r0 = r0.f4296g
            r14.mo4586f(r11, r0)
            b.e.b.k.m.n r0 = r15.f4162g
            b.e.b.k.m.f r0 = r0.f4349i
            int r0 = r0.f4296g
            r14.mo4586f(r10, r0)
            b.e.b.k.m.n r0 = r15.f4162g
            b.e.b.k.m.f r0 = r0.f4323k
            int r0 = r0.f4296g
            r14.mo4586f(r9, r0)
            b.e.b.k.e r0 = r15.f4145U
            if (r0 == 0) goto L_0x016e
            if (r5 == 0) goto L_0x0154
            boolean[] r0 = r15.f4164h
            boolean r0 = r0[r7]
            if (r0 == 0) goto L_0x0154
            boolean r0 = r53.mo4706Z()
            if (r0 != 0) goto L_0x0154
            b.e.b.k.e r0 = r15.f4145U
            b.e.b.k.d r0 = r0.f4135K
            b.e.b.i r0 = r14.mo4595q(r0)
            r14.mo4588h(r0, r12, r7, r4)
        L_0x0154:
            if (r6 == 0) goto L_0x016e
            boolean[] r0 = r15.f4164h
            r1 = 1
            boolean r0 = r0[r1]
            if (r0 == 0) goto L_0x016e
            boolean r0 = r53.mo4709b0()
            if (r0 != 0) goto L_0x016e
            b.e.b.k.e r0 = r15.f4145U
            b.e.b.k.d r0 = r0.f4136L
            b.e.b.i r0 = r14.mo4595q(r0)
            r14.mo4588h(r0, r10, r7, r4)
        L_0x016e:
            r15.f4174m = r7
            r15.f4176n = r7
            return
        L_0x0173:
            throw r28
        L_0x0174:
            if (r0 != 0) goto L_0x05e6
            b.e.b.k.e r0 = r15.f4145U
            if (r0 == 0) goto L_0x01ea
            boolean r0 = r15.m4693Y(r7)
            if (r0 == 0) goto L_0x0189
            b.e.b.k.e r0 = r15.f4145U
            b.e.b.k.f r0 = (p010b.p026e.p030b.p031k.ConstraintWidgetContainer) r0
            r0.mo4758e1(r15, r7)
            r0 = 1
            goto L_0x018d
        L_0x0189:
            boolean r0 = r53.mo4706Z()
        L_0x018d:
            r1 = 1
            boolean r2 = r15.m4693Y(r1)
            if (r2 == 0) goto L_0x019d
            b.e.b.k.e r2 = r15.f4145U
            b.e.b.k.f r2 = (p010b.p026e.p030b.p031k.ConstraintWidgetContainer) r2
            r2.mo4758e1(r15, r1)
            r1 = 1
            goto L_0x01a1
        L_0x019d:
            boolean r1 = r53.mo4709b0()
        L_0x01a1:
            if (r0 != 0) goto L_0x01c1
            if (r5 == 0) goto L_0x01c1
            int r2 = r15.f4175m0
            if (r2 == r4) goto L_0x01c1
            b.e.b.k.d r2 = r15.f4133I
            b.e.b.k.d r2 = r2.f4106f
            if (r2 != 0) goto L_0x01c1
            b.e.b.k.d r2 = r15.f4135K
            b.e.b.k.d r2 = r2.f4106f
            if (r2 != 0) goto L_0x01c1
            b.e.b.k.e r2 = r15.f4145U
            b.e.b.k.d r2 = r2.f4135K
            b.e.b.i r2 = r14.mo4595q(r2)
            r3 = 1
            r14.mo4588h(r2, r12, r7, r3)
        L_0x01c1:
            if (r1 != 0) goto L_0x01e5
            if (r6 == 0) goto L_0x01e5
            int r2 = r15.f4175m0
            if (r2 == r4) goto L_0x01e5
            b.e.b.k.d r2 = r15.f4134J
            b.e.b.k.d r2 = r2.f4106f
            if (r2 != 0) goto L_0x01e5
            b.e.b.k.d r2 = r15.f4136L
            b.e.b.k.d r2 = r2.f4106f
            if (r2 != 0) goto L_0x01e5
            b.e.b.k.d r2 = r15.f4137M
            if (r2 != 0) goto L_0x01e5
            b.e.b.k.e r2 = r15.f4145U
            b.e.b.k.d r2 = r2.f4136L
            b.e.b.i r2 = r14.mo4595q(r2)
            r3 = 1
            r14.mo4588h(r2, r10, r7, r3)
        L_0x01e5:
            r30 = r0
            r29 = r1
            goto L_0x01ee
        L_0x01ea:
            r29 = 0
            r30 = 0
        L_0x01ee:
            int r0 = r15.f4146V
            int r1 = r15.f4163g0
            if (r0 >= r1) goto L_0x01f5
            goto L_0x01f6
        L_0x01f5:
            r1 = r0
        L_0x01f6:
            int r2 = r15.f4147W
            int r3 = r15.f4165h0
            if (r2 >= r3) goto L_0x01fd
            goto L_0x01fe
        L_0x01fd:
            r3 = r2
        L_0x01fe:
            b.e.b.k.e$b[] r8 = r15.f4144T
            r4 = r8[r7]
            b.e.b.k.e$b r7 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.MATCH_CONSTRAINT
            r20 = r1
            if (r4 == r7) goto L_0x020a
            r4 = 1
            goto L_0x020b
        L_0x020a:
            r4 = 0
        L_0x020b:
            r17 = 1
            r1 = r8[r17]
            r21 = r3
            if (r1 == r7) goto L_0x0215
            r1 = 1
            goto L_0x0216
        L_0x0215:
            r1 = 0
        L_0x0216:
            int r3 = r15.f4149Y
            r15.f4200z = r3
            r22 = r9
            float r9 = r15.f4148X
            r15.f4122A = r9
            r23 = r10
            int r10 = r15.f4182q
            r27 = r11
            int r11 = r15.f4184r
            r24 = 0
            r25 = 4
            r31 = r12
            int r24 = (r9 > r24 ? 1 : (r9 == r24 ? 0 : -1))
            if (r24 <= 0) goto L_0x02b7
            int r12 = r15.f4175m0
            r32 = r13
            r13 = 8
            if (r12 == r13) goto L_0x02b9
            r12 = 0
            r13 = r8[r12]
            if (r13 != r7) goto L_0x0242
            if (r10 != 0) goto L_0x0242
            r10 = 3
        L_0x0242:
            r13 = 1
            r12 = r8[r13]
            if (r12 != r7) goto L_0x024a
            if (r11 != 0) goto L_0x024a
            r11 = 3
        L_0x024a:
            r12 = 0
            r14 = r8[r12]
            if (r14 != r7) goto L_0x025c
            r12 = r8[r13]
            if (r12 != r7) goto L_0x025c
            r12 = 3
            if (r10 != r12) goto L_0x025d
            if (r11 != r12) goto L_0x025d
            r15.mo4704X0(r5, r6, r4, r1)
            goto L_0x02ac
        L_0x025c:
            r12 = 3
        L_0x025d:
            r1 = 0
            r4 = r8[r1]
            if (r4 != r7) goto L_0x0280
            if (r10 != r12) goto L_0x0280
            r15.f4200z = r1
            float r0 = (float) r2
            float r9 = r9 * r0
            int r1 = (int) r9
            r2 = 1
            r0 = r8[r2]
            if (r0 == r7) goto L_0x0278
            r34 = r11
            r33 = r21
            r0 = 0
            r14 = 0
            r35 = 4
            goto L_0x02c3
        L_0x0278:
            r35 = r10
            r34 = r11
            r33 = r21
            r0 = 0
            goto L_0x02b5
        L_0x0280:
            r2 = 1
            r1 = r8[r2]
            if (r1 != r7) goto L_0x02ac
            r1 = 3
            if (r11 != r1) goto L_0x02ac
            r15.f4200z = r2
            r1 = -1
            if (r3 != r1) goto L_0x0292
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 / r9
            r15.f4122A = r1
        L_0x0292:
            float r1 = r15.f4122A
            float r0 = (float) r0
            float r1 = r1 * r0
            int r3 = (int) r1
            r0 = 0
            r1 = r8[r0]
            r33 = r3
            r35 = r10
            if (r1 == r7) goto L_0x02a7
            r1 = r20
            r14 = 0
            r34 = 4
            goto L_0x02c3
        L_0x02a7:
            r34 = r11
            r1 = r20
            goto L_0x02b5
        L_0x02ac:
            r0 = 0
            r35 = r10
            r34 = r11
            r1 = r20
            r33 = r21
        L_0x02b5:
            r14 = 1
            goto L_0x02c3
        L_0x02b7:
            r32 = r13
        L_0x02b9:
            r0 = 0
            r35 = r10
            r34 = r11
            r1 = r20
            r33 = r21
            r14 = 0
        L_0x02c3:
            int[] r2 = r15.f4186s
            r2[r0] = r35
            r0 = 1
            r2[r0] = r34
            r15.f4166i = r14
            if (r14 == 0) goto L_0x02d8
            int r0 = r15.f4200z
            r2 = -1
            if (r0 == 0) goto L_0x02d5
            if (r0 != r2) goto L_0x02d9
        L_0x02d5:
            r20 = 1
            goto L_0x02db
        L_0x02d8:
            r2 = -1
        L_0x02d9:
            r20 = 0
        L_0x02db:
            if (r14 == 0) goto L_0x02e7
            int r0 = r15.f4200z
            r3 = 1
            if (r0 == r3) goto L_0x02e4
            if (r0 != r2) goto L_0x02e7
        L_0x02e4:
            r36 = 1
            goto L_0x02e9
        L_0x02e7:
            r36 = 0
        L_0x02e9:
            b.e.b.k.e$b[] r0 = r15.f4144T
            r2 = 0
            r0 = r0[r2]
            b.e.b.k.e$b r13 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.WRAP_CONTENT
            if (r0 != r13) goto L_0x02f8
            boolean r0 = r15 instanceof p010b.p026e.p030b.p031k.ConstraintWidgetContainer
            if (r0 == 0) goto L_0x02f8
            r9 = 1
            goto L_0x02f9
        L_0x02f8:
            r9 = 0
        L_0x02f9:
            if (r9 == 0) goto L_0x02fe
            r21 = 0
            goto L_0x0300
        L_0x02fe:
            r21 = r1
        L_0x0300:
            b.e.b.k.d r0 = r15.f4140P
            boolean r0 = r0.mo4650n()
            r1 = 1
            r37 = r0 ^ 1
            boolean[] r0 = r15.f4143S
            r2 = 0
            boolean r38 = r0[r2]
            boolean r39 = r0[r1]
            int r0 = r15.f4178o
            r12 = 2
            if (r0 == r12) goto L_0x0420
            boolean r0 = r15.f4174m
            if (r0 != 0) goto L_0x0420
            if (r55 == 0) goto L_0x037c
            b.e.b.k.m.l r0 = r15.f4160f
            if (r0 == 0) goto L_0x037c
            b.e.b.k.m.f r1 = r0.f4348h
            boolean r2 = r1.f4299j
            if (r2 == 0) goto L_0x037c
            b.e.b.k.m.f r0 = r0.f4349i
            boolean r0 = r0.f4299j
            if (r0 != 0) goto L_0x032c
            goto L_0x037c
        L_0x032c:
            if (r55 == 0) goto L_0x0378
            int r0 = r1.f4296g
            r11 = r54
            r10 = r32
            r11.mo4586f(r10, r0)
            b.e.b.k.m.l r0 = r15.f4160f
            b.e.b.k.m.f r0 = r0.f4349i
            int r0 = r0.f4296g
            r8 = r31
            r11.mo4586f(r8, r0)
            b.e.b.k.e r0 = r15.f4145U
            if (r0 == 0) goto L_0x0362
            if (r5 == 0) goto L_0x0362
            boolean[] r0 = r15.f4164h
            r1 = 0
            boolean r0 = r0[r1]
            if (r0 == 0) goto L_0x0362
            boolean r0 = r53.mo4706Z()
            if (r0 != 0) goto L_0x0362
            b.e.b.k.e r0 = r15.f4145U
            b.e.b.k.d r0 = r0.f4135K
            b.e.b.i r0 = r11.mo4595q(r0)
            r4 = 8
            r11.mo4588h(r0, r8, r1, r4)
        L_0x0362:
            r47 = r5
            r32 = r6
            r48 = r7
            r31 = r8
            r40 = r10
            r52 = r13
            r41 = r14
            r49 = r22
            r50 = r23
            r51 = r27
            goto L_0x0432
        L_0x0378:
            r11 = r54
            goto L_0x0420
        L_0x037c:
            r11 = r54
            r8 = r31
            r10 = r32
            r4 = 8
            b.e.b.k.e r0 = r15.f4145U
            if (r0 == 0) goto L_0x0391
            b.e.b.k.d r0 = r0.f4135K
            b.e.b.i r0 = r11.mo4595q(r0)
            r18 = r0
            goto L_0x0393
        L_0x0391:
            r18 = r28
        L_0x0393:
            b.e.b.k.e r0 = r15.f4145U
            if (r0 == 0) goto L_0x03a0
            b.e.b.k.d r0 = r0.f4133I
            b.e.b.i r0 = r11.mo4595q(r0)
            r31 = r0
            goto L_0x03a2
        L_0x03a0:
            r31 = r28
        L_0x03a2:
            boolean[] r0 = r15.f4164h
            r19 = 0
            boolean r32 = r0[r19]
            b.e.b.k.e$b[] r0 = r15.f4144T
            r40 = r0[r19]
            b.e.b.k.d r3 = r15.f4133I
            b.e.b.k.d r1 = r15.f4135K
            int r12 = r15.f4150Z
            int r2 = r15.f4163g0
            int[] r4 = r15.f4124B
            r44 = r4[r19]
            float r4 = r15.f4167i0
            r17 = 1
            r0 = r0[r17]
            if (r0 != r7) goto L_0x03c3
            r45 = 1
            goto L_0x03c5
        L_0x03c3:
            r45 = 0
        L_0x03c5:
            int r0 = r15.f4188t
            r24 = r0
            int r0 = r15.f4190u
            r25 = r0
            float r0 = r15.f4192v
            r26 = r0
            r0 = r53
            r46 = r1
            r1 = r54
            r42 = r2
            r2 = 1
            r16 = r3
            r3 = r5
            r43 = r4
            r4 = r6
            r47 = r5
            r5 = r32
            r32 = r6
            r6 = r31
            r48 = r7
            r7 = r18
            r17 = r8
            r8 = r40
            r49 = r22
            r18 = r10
            r50 = r23
            r10 = r16
            r51 = r27
            r11 = r46
            r31 = r17
            r52 = r13
            r40 = r18
            r13 = r21
            r41 = r14
            r14 = r42
            r15 = r44
            r16 = r43
            r17 = r20
            r18 = r45
            r19 = r30
            r20 = r29
            r21 = r38
            r22 = r35
            r23 = r34
            r27 = r37
            r0.m4695i(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0432
        L_0x0420:
            r47 = r5
            r48 = r7
            r52 = r13
            r41 = r14
            r49 = r22
            r50 = r23
            r51 = r27
            r40 = r32
            r32 = r6
        L_0x0432:
            if (r55 == 0) goto L_0x0498
            r15 = r53
            b.e.b.k.m.n r0 = r15.f4162g
            if (r0 == 0) goto L_0x048b
            b.e.b.k.m.f r1 = r0.f4348h
            boolean r2 = r1.f4299j
            if (r2 == 0) goto L_0x048b
            b.e.b.k.m.f r0 = r0.f4349i
            boolean r0 = r0.f4299j
            if (r0 == 0) goto L_0x048b
            int r0 = r1.f4296g
            r14 = r54
            r13 = r51
            r14.mo4586f(r13, r0)
            b.e.b.k.m.n r0 = r15.f4162g
            b.e.b.k.m.f r0 = r0.f4349i
            int r0 = r0.f4296g
            r12 = r50
            r14.mo4586f(r12, r0)
            b.e.b.k.m.n r0 = r15.f4162g
            b.e.b.k.m.f r0 = r0.f4323k
            int r0 = r0.f4296g
            r1 = r49
            r14.mo4586f(r1, r0)
            b.e.b.k.e r0 = r15.f4145U
            if (r0 == 0) goto L_0x0485
            if (r29 != 0) goto L_0x0485
            if (r32 == 0) goto L_0x0485
            boolean[] r2 = r15.f4164h
            r11 = 1
            boolean r2 = r2[r11]
            if (r2 == 0) goto L_0x0481
            b.e.b.k.d r0 = r0.f4136L
            b.e.b.i r0 = r14.mo4595q(r0)
            r2 = 8
            r10 = 0
            r14.mo4588h(r0, r12, r10, r2)
            goto L_0x0489
        L_0x0481:
            r2 = 8
            r10 = 0
            goto L_0x0489
        L_0x0485:
            r2 = 8
            r10 = 0
            r11 = 1
        L_0x0489:
            r8 = 0
            goto L_0x04a7
        L_0x048b:
            r14 = r54
            r1 = r49
            r12 = r50
            r13 = r51
            r2 = 8
            r10 = 0
            r11 = 1
            goto L_0x04a6
        L_0x0498:
            r2 = 8
            r10 = 0
            r11 = 1
            r15 = r53
            r14 = r54
            r1 = r49
            r12 = r50
            r13 = r51
        L_0x04a6:
            r8 = 1
        L_0x04a7:
            int r0 = r15.f4180p
            r3 = 2
            if (r0 != r3) goto L_0x04ae
            r7 = 0
            goto L_0x04af
        L_0x04ae:
            r7 = r8
        L_0x04af:
            if (r7 == 0) goto L_0x0585
            boolean r0 = r15.f4176n
            if (r0 != 0) goto L_0x0585
            b.e.b.k.e$b[] r0 = r15.f4144T
            r0 = r0[r11]
            r3 = r52
            if (r0 != r3) goto L_0x04c3
            boolean r0 = r15 instanceof p010b.p026e.p030b.p031k.ConstraintWidgetContainer
            if (r0 == 0) goto L_0x04c3
            r9 = 1
            goto L_0x04c4
        L_0x04c3:
            r9 = 0
        L_0x04c4:
            if (r9 == 0) goto L_0x04c8
            r33 = 0
        L_0x04c8:
            b.e.b.k.e r0 = r15.f4145U
            if (r0 == 0) goto L_0x04d4
            b.e.b.k.d r0 = r0.f4136L
            b.e.b.i r0 = r14.mo4595q(r0)
            r7 = r0
            goto L_0x04d6
        L_0x04d4:
            r7 = r28
        L_0x04d6:
            b.e.b.k.e r0 = r15.f4145U
            if (r0 == 0) goto L_0x04e2
            b.e.b.k.d r0 = r0.f4134J
            b.e.b.i r0 = r14.mo4595q(r0)
            r6 = r0
            goto L_0x04e4
        L_0x04e2:
            r6 = r28
        L_0x04e4:
            int r0 = r15.f4161f0
            if (r0 > 0) goto L_0x04ec
            int r0 = r15.f4175m0
            if (r0 != r2) goto L_0x0522
        L_0x04ec:
            b.e.b.k.d r0 = r15.f4137M
            b.e.b.k.d r0 = r0.f4106f
            if (r0 == 0) goto L_0x0513
            int r0 = r53.mo4725n()
            r14.mo4585e(r1, r13, r0, r2)
            b.e.b.k.d r0 = r15.f4137M
            b.e.b.k.d r0 = r0.f4106f
            b.e.b.i r0 = r14.mo4595q(r0)
            r14.mo4585e(r1, r0, r10, r2)
            if (r32 == 0) goto L_0x0510
            b.e.b.k.d r0 = r15.f4136L
            b.e.b.i r0 = r14.mo4595q(r0)
            r1 = 5
            r14.mo4588h(r7, r0, r10, r1)
        L_0x0510:
            r27 = 0
            goto L_0x0524
        L_0x0513:
            int r0 = r15.f4175m0
            if (r0 != r2) goto L_0x051b
            r14.mo4585e(r1, r13, r10, r2)
            goto L_0x0522
        L_0x051b:
            int r0 = r53.mo4725n()
            r14.mo4585e(r1, r13, r0, r2)
        L_0x0522:
            r27 = r37
        L_0x0524:
            boolean[] r0 = r15.f4164h
            boolean r5 = r0[r11]
            b.e.b.k.e$b[] r0 = r15.f4144T
            r8 = r0[r11]
            b.e.b.k.d r4 = r15.f4134J
            b.e.b.k.d r3 = r15.f4136L
            int r1 = r15.f4151a0
            int r2 = r15.f4165h0
            int[] r10 = r15.f4124B
            r16 = r10[r11]
            float r10 = r15.f4169j0
            r17 = 0
            r0 = r0[r17]
            r11 = r48
            if (r0 != r11) goto L_0x0545
            r18 = 1
            goto L_0x0547
        L_0x0545:
            r18 = 0
        L_0x0547:
            int r0 = r15.f4194w
            r24 = r0
            int r0 = r15.f4196x
            r25 = r0
            float r0 = r15.f4198y
            r26 = r0
            r0 = r53
            r19 = r1
            r1 = r54
            r20 = r2
            r2 = 0
            r11 = r3
            r3 = r32
            r21 = r4
            r4 = r47
            r17 = r10
            r10 = r21
            r28 = r12
            r12 = r19
            r32 = r13
            r13 = r33
            r14 = r20
            r15 = r16
            r16 = r17
            r17 = r36
            r19 = r29
            r20 = r30
            r21 = r39
            r22 = r34
            r23 = r35
            r0.m4695i(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0589
        L_0x0585:
            r28 = r12
            r32 = r13
        L_0x0589:
            if (r41 == 0) goto L_0x05b6
            r6 = 8
            r7 = r53
            int r0 = r7.f4200z
            r1 = 1
            if (r0 != r1) goto L_0x05a4
            float r5 = r7.f4122A
            r0 = r54
            r1 = r28
            r2 = r32
            r3 = r31
            r4 = r40
            r0.mo4591k(r1, r2, r3, r4, r5, r6)
            goto L_0x05b8
        L_0x05a4:
            float r5 = r7.f4122A
            r6 = 8
            r0 = r54
            r1 = r31
            r2 = r40
            r3 = r28
            r4 = r32
            r0.mo4591k(r1, r2, r3, r4, r5, r6)
            goto L_0x05b8
        L_0x05b6:
            r7 = r53
        L_0x05b8:
            b.e.b.k.d r0 = r7.f4140P
            boolean r0 = r0.mo4650n()
            if (r0 == 0) goto L_0x05e0
            b.e.b.k.d r0 = r7.f4140P
            b.e.b.k.d r0 = r0.mo4645i()
            b.e.b.k.e r0 = r0.mo4643g()
            float r1 = r7.f4126C
            r2 = 1119092736(0x42b40000, float:90.0)
            float r1 = r1 + r2
            double r1 = (double) r1
            double r1 = java.lang.Math.toRadians(r1)
            float r1 = (float) r1
            b.e.b.k.d r2 = r7.f4140P
            int r2 = r2.mo4641e()
            r3 = r54
            r3.mo4582b(r7, r0, r1, r2)
        L_0x05e0:
            r0 = 0
            r7.f4174m = r0
            r7.f4176n = r0
            return
        L_0x05e6:
            r7 = r15
            throw r28
        L_0x05e8:
            r7 = r15
            throw r28
        */
        throw new UnsupportedOperationException("Method not decompiled: p010b.p026e.p030b.p031k.ConstraintWidget.mo4628g(b.e.b.d, boolean):void");
    }

    /* renamed from: g0 */
    public boolean mo4714g0() {
        C0561b[] bVarArr = this.f4144T;
        C0561b bVar = bVarArr[0];
        C0561b bVar2 = C0561b.MATCH_CONSTRAINT;
        return bVar == bVar2 && bVarArr[1] == bVar2;
    }

    /* renamed from: h */
    public boolean mo4630h() {
        return this.f4175m0 != 8;
    }

    /* renamed from: h0 */
    public void mo4715h0() {
        this.f4133I.mo4652p();
        this.f4134J.mo4652p();
        this.f4135K.mo4652p();
        this.f4136L.mo4652p();
        this.f4137M.mo4652p();
        this.f4138N.mo4652p();
        this.f4139O.mo4652p();
        this.f4140P.mo4652p();
        this.f4145U = null;
        this.f4126C = 0.0f;
        this.f4146V = 0;
        this.f4147W = 0;
        this.f4148X = 0.0f;
        this.f4149Y = -1;
        this.f4150Z = 0;
        this.f4151a0 = 0;
        this.f4157d0 = 0;
        this.f4159e0 = 0;
        this.f4161f0 = 0;
        this.f4163g0 = 0;
        this.f4165h0 = 0;
        float f = f4121a;
        this.f4167i0 = f;
        this.f4169j0 = f;
        C0561b[] bVarArr = this.f4144T;
        C0561b bVar = C0561b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f4171k0 = null;
        this.f4173l0 = 0;
        this.f4175m0 = 0;
        this.f4179o0 = null;
        this.f4181p0 = false;
        this.f4183q0 = false;
        this.f4187s0 = 0;
        this.f4189t0 = 0;
        this.f4191u0 = false;
        this.f4193v0 = false;
        float[] fArr = this.f4195w0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f4178o = -1;
        this.f4180p = -1;
        int[] iArr = this.f4124B;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f4182q = 0;
        this.f4184r = 0;
        this.f4192v = 1.0f;
        this.f4198y = 1.0f;
        this.f4190u = Integer.MAX_VALUE;
        this.f4196x = Integer.MAX_VALUE;
        this.f4188t = 0;
        this.f4194w = 0;
        this.f4166i = false;
        this.f4200z = -1;
        this.f4122A = 1.0f;
        this.f4185r0 = false;
        boolean[] zArr = this.f4164h;
        zArr[0] = true;
        zArr[1] = true;
        this.f4130F = false;
        boolean[] zArr2 = this.f4143S;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f4168j = true;
    }

    /* renamed from: i0 */
    public void mo4716i0() {
        this.f4174m = false;
        this.f4176n = false;
        int size = this.f4142R.size();
        for (int i = 0; i < size; i++) {
            ((ConstraintAnchor) this.f4142R.get(i)).mo4653q();
        }
    }

    /* renamed from: j */
    public void mo4717j(ConstraintWidget eVar, float f, int i) {
        C0559b bVar = C0559b.CENTER;
        mo4703X(bVar, eVar, bVar, i, 0);
        this.f4126C = f;
    }

    /* renamed from: j0 */
    public void mo4718j0(Cache cVar) {
        this.f4133I.mo4654r(cVar);
        this.f4134J.mo4654r(cVar);
        this.f4135K.mo4654r(cVar);
        this.f4136L.mo4654r(cVar);
        this.f4137M.mo4654r(cVar);
        this.f4140P.mo4654r(cVar);
        this.f4138N.mo4654r(cVar);
        this.f4139O.mo4654r(cVar);
    }

    /* renamed from: k */
    public void mo4719k(LinearSystem dVar) {
        dVar.mo4595q(this.f4133I);
        dVar.mo4595q(this.f4134J);
        dVar.mo4595q(this.f4135K);
        dVar.mo4595q(this.f4136L);
        if (this.f4161f0 > 0) {
            dVar.mo4595q(this.f4137M);
        }
    }

    /* renamed from: k0 */
    public void mo4720k0(int i) {
        this.f4161f0 = i;
        this.f4128D = i > 0;
    }

    /* renamed from: l */
    public void mo4721l() {
        if (this.f4160f == null) {
            this.f4160f = new HorizontalWidgetRun(this);
        }
        if (this.f4162g == null) {
            this.f4162g = new VerticalWidgetRun(this);
        }
    }

    /* renamed from: l0 */
    public void mo4722l0(Object obj) {
        this.f4171k0 = obj;
    }

    /* renamed from: m */
    public ConstraintAnchor mo4723m(C0559b bVar) {
        switch (C0560a.f4202a[bVar.ordinal()]) {
            case 1:
                return this.f4133I;
            case 2:
                return this.f4134J;
            case 3:
                return this.f4135K;
            case 4:
                return this.f4136L;
            case 5:
                return this.f4137M;
            case 6:
                return this.f4140P;
            case 7:
                return this.f4138N;
            case 8:
                return this.f4139O;
            case 9:
                return null;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    /* renamed from: m0 */
    public void mo4724m0(String str) {
        this.f4177n0 = str;
    }

    /* renamed from: n */
    public int mo4725n() {
        return this.f4161f0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0089  */
    /* renamed from: n0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4726n0(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x008e
            int r1 = r9.length()
            if (r1 != 0) goto L_0x000b
            goto L_0x008e
        L_0x000b:
            r1 = -1
            int r2 = r9.length()
            r3 = 44
            int r3 = r9.indexOf(r3)
            r4 = 0
            r5 = 1
            if (r3 <= 0) goto L_0x0037
            int r6 = r2 + -1
            if (r3 >= r6) goto L_0x0037
            java.lang.String r6 = r9.substring(r4, r3)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x002c
            r1 = 0
            goto L_0x0035
        L_0x002c:
            java.lang.String r4 = "H"
            boolean r4 = r6.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0035
            r1 = 1
        L_0x0035:
            int r4 = r3 + 1
        L_0x0037:
            r3 = 58
            int r3 = r9.indexOf(r3)
            if (r3 < 0) goto L_0x0075
            int r2 = r2 - r5
            if (r3 >= r2) goto L_0x0075
            java.lang.String r2 = r9.substring(r4, r3)
            int r3 = r3 + r5
            java.lang.String r9 = r9.substring(r3)
            int r3 = r2.length()
            if (r3 <= 0) goto L_0x0084
            int r3 = r9.length()
            if (r3 <= 0) goto L_0x0084
            float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x0084 }
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0084
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0084
            if (r1 != r5) goto L_0x006f
            float r9 = r9 / r2
            float r9 = java.lang.Math.abs(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x006f:
            float r2 = r2 / r9
            float r9 = java.lang.Math.abs(r2)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x0075:
            java.lang.String r9 = r9.substring(r4)
            int r2 = r9.length()
            if (r2 <= 0) goto L_0x0084
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x0084:
            r9 = 0
        L_0x0085:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x008d
            r8.f4148X = r9
            r8.f4149Y = r1
        L_0x008d:
            return
        L_0x008e:
            r8.f4148X = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p010b.p026e.p030b.p031k.ConstraintWidget.mo4726n0(java.lang.String):void");
    }

    /* renamed from: o */
    public float mo4727o(int i) {
        if (i == 0) {
            return this.f4167i0;
        }
        if (i == 1) {
            return this.f4169j0;
        }
        return -1.0f;
    }

    /* renamed from: o0 */
    public void mo4728o0(int i) {
        if (this.f4128D) {
            int i2 = i - this.f4161f0;
            int i3 = this.f4147W + i2;
            this.f4151a0 = i2;
            this.f4134J.mo4655s(i2);
            this.f4136L.mo4655s(i3);
            this.f4137M.mo4655s(i);
            this.f4176n = true;
        }
    }

    /* renamed from: p */
    public int mo4729p() {
        return mo4695T() + this.f4147W;
    }

    /* renamed from: p0 */
    public void mo4730p0(int i, int i2) {
        this.f4133I.mo4655s(i);
        this.f4135K.mo4655s(i2);
        this.f4150Z = i;
        this.f4146V = i2 - i;
        this.f4174m = true;
    }

    /* renamed from: q */
    public Object mo4731q() {
        return this.f4171k0;
    }

    /* renamed from: q0 */
    public void mo4732q0(int i) {
        this.f4133I.mo4655s(i);
        this.f4150Z = i;
    }

    /* renamed from: r */
    public String mo4733r() {
        return this.f4177n0;
    }

    /* renamed from: r0 */
    public void mo4734r0(int i) {
        this.f4134J.mo4655s(i);
        this.f4151a0 = i;
    }

    /* renamed from: s */
    public C0561b mo4735s(int i) {
        if (i == 0) {
            return mo4747y();
        }
        if (i == 1) {
            return mo4685O();
        }
        return null;
    }

    /* renamed from: s0 */
    public void mo4736s0(int i, int i2) {
        this.f4134J.mo4655s(i);
        this.f4136L.mo4655s(i2);
        this.f4151a0 = i;
        this.f4147W = i2 - i;
        if (this.f4128D) {
            this.f4137M.mo4655s(i + this.f4161f0);
        }
        this.f4176n = true;
    }

    /* renamed from: t */
    public float mo4737t() {
        return this.f4148X;
    }

    /* renamed from: t0 */
    public void mo4738t0(int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        this.f4150Z = i;
        this.f4151a0 = i2;
        if (this.f4175m0 == 8) {
            this.f4146V = 0;
            this.f4147W = 0;
            return;
        }
        C0561b[] bVarArr = this.f4144T;
        C0561b bVar = bVarArr[0];
        C0561b bVar2 = C0561b.FIXED;
        if (bVar == bVar2) {
            int i7 = this.f4146V;
            if (i5 < i7) {
                i5 = i7;
            }
        }
        if (bVarArr[1] == bVar2) {
            int i8 = this.f4147W;
            if (i6 < i8) {
                i6 = i8;
            }
        }
        this.f4146V = i5;
        this.f4147W = i6;
        int i9 = this.f4165h0;
        if (i6 < i9) {
            this.f4147W = i9;
        }
        int i10 = this.f4163g0;
        if (i5 < i10) {
            this.f4146V = i10;
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = " ";
        String str3 = "";
        if (this.f4179o0 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("type: ");
            sb2.append(this.f4179o0);
            sb2.append(str2);
            str = sb2.toString();
        } else {
            str = str3;
        }
        sb.append(str);
        if (this.f4177n0 != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("id: ");
            sb3.append(this.f4177n0);
            sb3.append(str2);
            str3 = sb3.toString();
        }
        sb.append(str3);
        sb.append("(");
        sb.append(this.f4150Z);
        sb.append(", ");
        sb.append(this.f4151a0);
        sb.append(") - (");
        sb.append(this.f4146V);
        sb.append(" x ");
        sb.append(this.f4147W);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public int mo4739u() {
        return this.f4149Y;
    }

    /* renamed from: u0 */
    public void mo4740u0(boolean z) {
        this.f4128D = z;
    }

    /* renamed from: v */
    public int mo4741v() {
        if (this.f4175m0 == 8) {
            return 0;
        }
        return this.f4147W;
    }

    /* renamed from: v0 */
    public void mo4742v0(int i) {
        this.f4147W = i;
        int i2 = this.f4165h0;
        if (i < i2) {
            this.f4147W = i2;
        }
    }

    /* renamed from: w */
    public float mo4743w() {
        return this.f4167i0;
    }

    /* renamed from: w0 */
    public void mo4744w0(float f) {
        this.f4167i0 = f;
    }

    /* renamed from: x */
    public int mo4745x() {
        return this.f4187s0;
    }

    /* renamed from: x0 */
    public void mo4746x0(int i) {
        this.f4187s0 = i;
    }

    /* renamed from: y */
    public C0561b mo4747y() {
        return this.f4144T[0];
    }

    /* renamed from: y0 */
    public void mo4748y0(int i, int i2) {
        this.f4150Z = i;
        int i3 = i2 - i;
        this.f4146V = i3;
        int i4 = this.f4163g0;
        if (i3 < i4) {
            this.f4146V = i4;
        }
    }

    /* renamed from: z */
    public int mo4749z() {
        ConstraintAnchor dVar = this.f4133I;
        int i = 0;
        if (dVar != null) {
            i = 0 + dVar.f4107g;
        }
        ConstraintAnchor dVar2 = this.f4135K;
        return dVar2 != null ? i + dVar2.f4107g : i;
    }

    /* renamed from: z0 */
    public void mo4750z0(C0561b bVar) {
        this.f4144T[0] = bVar;
    }
}
