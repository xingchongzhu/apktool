package p010b.p026e.p030b.p031k;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p010b.p026e.p030b.Cache;
import p010b.p026e.p030b.SolverVariable;
import p010b.p026e.p030b.SolverVariable.C0557a;
import p010b.p026e.p030b.p031k.p032m.Grouping;
import p010b.p026e.p030b.p031k.p032m.WidgetGroup;

/* renamed from: b.e.b.k.d */
public class ConstraintAnchor {

    /* renamed from: a */
    private HashSet<ConstraintAnchor> f4101a = null;

    /* renamed from: b */
    private int f4102b;

    /* renamed from: c */
    private boolean f4103c;

    /* renamed from: d */
    public final ConstraintWidget f4104d;

    /* renamed from: e */
    public final C0559b f4105e;

    /* renamed from: f */
    public ConstraintAnchor f4106f;

    /* renamed from: g */
    public int f4107g = 0;

    /* renamed from: h */
    int f4108h = -1;

    /* renamed from: i */
    SolverVariable f4109i;

    /* renamed from: b.e.b.k.d$a */
    /* compiled from: ConstraintAnchor */
    static /* synthetic */ class C0558a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4110a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                b.e.b.k.d$b[] r0 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4110a = r0
                b.e.b.k.d$b r1 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4110a     // Catch:{ NoSuchFieldError -> 0x001d }
                b.e.b.k.d$b r1 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.LEFT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f4110a     // Catch:{ NoSuchFieldError -> 0x0028 }
                b.e.b.k.d$b r1 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f4110a     // Catch:{ NoSuchFieldError -> 0x0033 }
                b.e.b.k.d$b r1 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.TOP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f4110a     // Catch:{ NoSuchFieldError -> 0x003e }
                b.e.b.k.d$b r1 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f4110a     // Catch:{ NoSuchFieldError -> 0x0049 }
                b.e.b.k.d$b r1 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.BASELINE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f4110a     // Catch:{ NoSuchFieldError -> 0x0054 }
                b.e.b.k.d$b r1 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f4110a     // Catch:{ NoSuchFieldError -> 0x0060 }
                b.e.b.k.d$b r1 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f4110a     // Catch:{ NoSuchFieldError -> 0x006c }
                b.e.b.k.d$b r1 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p010b.p026e.p030b.p031k.ConstraintAnchor.C0558a.<clinit>():void");
        }
    }

    /* renamed from: b.e.b.k.d$b */
    /* compiled from: ConstraintAnchor */
    public enum C0559b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public ConstraintAnchor(ConstraintWidget eVar, C0559b bVar) {
        this.f4104d = eVar;
        this.f4105e = bVar;
    }

    /* renamed from: a */
    public boolean mo4637a(ConstraintAnchor dVar, int i, int i2, boolean z) {
        if (dVar == null) {
            mo4652p();
            return true;
        } else if (!z && !mo4651o(dVar)) {
            return false;
        } else {
            this.f4106f = dVar;
            if (dVar.f4101a == null) {
                dVar.f4101a = new HashSet<>();
            }
            HashSet<ConstraintAnchor> hashSet = this.f4106f.f4101a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            if (i > 0) {
                this.f4107g = i;
            } else {
                this.f4107g = 0;
            }
            this.f4108h = i2;
            return true;
        }
    }

    /* renamed from: b */
    public void mo4638b(int i, ArrayList<WidgetGroup> arrayList, WidgetGroup oVar) {
        HashSet<ConstraintAnchor> hashSet = this.f4101a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Grouping.m4908a(((ConstraintAnchor) it.next()).f4104d, i, arrayList, oVar);
            }
        }
    }

    /* renamed from: c */
    public HashSet<ConstraintAnchor> mo4639c() {
        return this.f4101a;
    }

    /* renamed from: d */
    public int mo4640d() {
        if (!this.f4103c) {
            return 0;
        }
        return this.f4102b;
    }

    /* renamed from: e */
    public int mo4641e() {
        if (this.f4104d.mo4689Q() == 8) {
            return 0;
        }
        if (this.f4108h > -1) {
            ConstraintAnchor dVar = this.f4106f;
            if (dVar != null && dVar.f4104d.mo4689Q() == 8) {
                return this.f4108h;
            }
        }
        return this.f4107g;
    }

    /* renamed from: f */
    public final ConstraintAnchor mo4642f() {
        switch (C0558a.f4110a[this.f4105e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f4104d.f4135K;
            case 3:
                return this.f4104d.f4133I;
            case 4:
                return this.f4104d.f4136L;
            case 5:
                return this.f4104d.f4134J;
            default:
                throw new AssertionError(this.f4105e.name());
        }
    }

    /* renamed from: g */
    public ConstraintWidget mo4643g() {
        return this.f4104d;
    }

    /* renamed from: h */
    public SolverVariable mo4644h() {
        return this.f4109i;
    }

    /* renamed from: i */
    public ConstraintAnchor mo4645i() {
        return this.f4106f;
    }

    /* renamed from: j */
    public C0559b mo4646j() {
        return this.f4105e;
    }

    /* renamed from: k */
    public boolean mo4647k() {
        HashSet<ConstraintAnchor> hashSet = this.f4101a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((ConstraintAnchor) it.next()).mo4642f().mo4650n()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public boolean mo4648l() {
        HashSet<ConstraintAnchor> hashSet = this.f4101a;
        boolean z = false;
        if (hashSet == null) {
            return false;
        }
        if (hashSet.size() > 0) {
            z = true;
        }
        return z;
    }

    /* renamed from: m */
    public boolean mo4649m() {
        return this.f4103c;
    }

    /* renamed from: n */
    public boolean mo4650n() {
        return this.f4106f != null;
    }

    /* renamed from: o */
    public boolean mo4651o(ConstraintAnchor dVar) {
        boolean z = false;
        if (dVar == null) {
            return false;
        }
        C0559b j = dVar.mo4646j();
        C0559b bVar = this.f4105e;
        if (j != bVar) {
            switch (C0558a.f4110a[bVar.ordinal()]) {
                case 1:
                    if (!(j == C0559b.BASELINE || j == C0559b.CENTER_X || j == C0559b.CENTER_Y)) {
                        z = true;
                    }
                    return z;
                case 2:
                case 3:
                    boolean z2 = j == C0559b.LEFT || j == C0559b.RIGHT;
                    if (dVar.mo4643g() instanceof Guideline) {
                        if (z2 || j == C0559b.CENTER_X) {
                            z = true;
                        }
                        z2 = z;
                    }
                    return z2;
                case 4:
                case 5:
                    boolean z3 = j == C0559b.TOP || j == C0559b.BOTTOM;
                    if (dVar.mo4643g() instanceof Guideline) {
                        if (z3 || j == C0559b.CENTER_Y) {
                            z = true;
                        }
                        z3 = z;
                    }
                    return z3;
                case 6:
                case 7:
                case 8:
                case 9:
                    return false;
                default:
                    throw new AssertionError(this.f4105e.name());
            }
        } else if (bVar != C0559b.BASELINE || (dVar.mo4643g().mo4697U() && mo4643g().mo4697U())) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: p */
    public void mo4652p() {
        ConstraintAnchor dVar = this.f4106f;
        if (dVar != null) {
            HashSet<ConstraintAnchor> hashSet = dVar.f4101a;
            if (hashSet != null) {
                hashSet.remove(this);
                if (this.f4106f.f4101a.size() == 0) {
                    this.f4106f.f4101a = null;
                }
            }
        }
        this.f4101a = null;
        this.f4106f = null;
        this.f4107g = 0;
        this.f4108h = -1;
        this.f4103c = false;
        this.f4102b = 0;
    }

    /* renamed from: q */
    public void mo4653q() {
        this.f4103c = false;
        this.f4102b = 0;
    }

    /* renamed from: r */
    public void mo4654r(Cache cVar) {
        SolverVariable iVar = this.f4109i;
        if (iVar == null) {
            this.f4109i = new SolverVariable(C0557a.UNRESTRICTED, null);
        } else {
            iVar.mo4615d();
        }
    }

    /* renamed from: s */
    public void mo4655s(int i) {
        this.f4102b = i;
        this.f4103c = true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4104d.mo4733r());
        sb.append(":");
        sb.append(this.f4105e.toString());
        return sb.toString();
    }
}
