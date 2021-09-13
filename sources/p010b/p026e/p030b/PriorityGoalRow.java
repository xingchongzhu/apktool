package p010b.p026e.p030b;

import java.util.Arrays;
import java.util.Comparator;
import p010b.p026e.p030b.ArrayRow.C0551a;

/* renamed from: b.e.b.h */
public class PriorityGoalRow extends ArrayRow {

    /* renamed from: g */
    private int f4027g = 128;

    /* renamed from: h */
    private SolverVariable[] f4028h = new SolverVariable[128];

    /* renamed from: i */
    private SolverVariable[] f4029i = new SolverVariable[128];

    /* renamed from: j */
    private int f4030j = 0;

    /* renamed from: k */
    C0556b f4031k = new C0556b(this);

    /* renamed from: l */
    Cache f4032l;

    /* renamed from: b.e.b.h$a */
    /* compiled from: PriorityGoalRow */
    class C0555a implements Comparator<SolverVariable> {
        C0555a() {
        }

        /* renamed from: a */
        public int compare(SolverVariable iVar, SolverVariable iVar2) {
            return iVar.f4040d - iVar2.f4040d;
        }
    }

    /* renamed from: b.e.b.h$b */
    /* compiled from: PriorityGoalRow */
    class C0556b implements Comparable {

        /* renamed from: a */
        SolverVariable f4034a;

        /* renamed from: b */
        PriorityGoalRow f4035b;

        public C0556b(PriorityGoalRow hVar) {
            this.f4035b = hVar;
        }

        /* renamed from: a */
        public boolean mo4606a(SolverVariable iVar, float f) {
            boolean z = true;
            if (this.f4034a.f4038b) {
                for (int i = 0; i < 9; i++) {
                    float[] fArr = this.f4034a.f4046j;
                    fArr[i] = fArr[i] + (iVar.f4046j[i] * f);
                    if (Math.abs(fArr[i]) < 1.0E-4f) {
                        this.f4034a.f4046j[i] = 0.0f;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    PriorityGoalRow.this.m4621G(this.f4034a);
                }
                return false;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float f2 = iVar.f4046j[i2];
                if (f2 != 0.0f) {
                    float f3 = f2 * f;
                    if (Math.abs(f3) < 1.0E-4f) {
                        f3 = 0.0f;
                    }
                    this.f4034a.f4046j[i2] = f3;
                } else {
                    this.f4034a.f4046j[i2] = 0.0f;
                }
            }
            return true;
        }

        /* renamed from: b */
        public void mo4607b(SolverVariable iVar) {
            this.f4034a = iVar;
        }

        /* renamed from: c */
        public final boolean mo4608c() {
            for (int i = 8; i >= 0; i--) {
                float f = this.f4034a.f4046j[i];
                if (f > 0.0f) {
                    return false;
                }
                if (f < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public int compareTo(Object obj) {
            return this.f4034a.f4040d - ((SolverVariable) obj).f4040d;
        }

        /* renamed from: d */
        public final boolean mo4610d(SolverVariable iVar) {
            int i = 8;
            while (true) {
                if (i < 0) {
                    break;
                }
                float f = iVar.f4046j[i];
                float f2 = this.f4034a.f4046j[i];
                if (f2 == f) {
                    i--;
                } else if (f2 < f) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: e */
        public void mo4611e() {
            Arrays.fill(this.f4034a.f4046j, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f4034a != null) {
                for (int i = 0; i < 9; i++) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(this.f4034a.f4046j[i]);
                    sb.append(" ");
                    str = sb.toString();
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("] ");
            sb2.append(this.f4034a);
            return sb2.toString();
        }
    }

    public PriorityGoalRow(Cache cVar) {
        super(cVar);
        this.f4032l = cVar;
    }

    /* renamed from: F */
    private final void m4620F(SolverVariable iVar) {
        int i;
        int i2 = this.f4030j + 1;
        SolverVariable[] iVarArr = this.f4028h;
        if (i2 > iVarArr.length) {
            SolverVariable[] iVarArr2 = (SolverVariable[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f4028h = iVarArr2;
            this.f4029i = (SolverVariable[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        SolverVariable[] iVarArr3 = this.f4028h;
        int i3 = this.f4030j;
        iVarArr3[i3] = iVar;
        int i4 = i3 + 1;
        this.f4030j = i4;
        if (i4 > 1 && iVarArr3[i4 - 1].f4040d > iVar.f4040d) {
            int i5 = 0;
            while (true) {
                i = this.f4030j;
                if (i5 >= i) {
                    break;
                }
                this.f4029i[i5] = this.f4028h[i5];
                i5++;
            }
            Arrays.sort(this.f4029i, 0, i, new C0555a());
            for (int i6 = 0; i6 < this.f4030j; i6++) {
                this.f4028h[i6] = this.f4029i[i6];
            }
        }
        iVar.f4038b = true;
        iVar.mo4613a(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public final void m4621G(SolverVariable iVar) {
        int i = 0;
        while (i < this.f4030j) {
            if (this.f4028h[i] == iVar) {
                while (true) {
                    int i2 = this.f4030j;
                    if (i < i2 - 1) {
                        SolverVariable[] iVarArr = this.f4028h;
                        int i3 = i + 1;
                        iVarArr[i] = iVarArr[i3];
                        i = i3;
                    } else {
                        this.f4030j = i2 - 1;
                        iVar.f4038b = false;
                        return;
                    }
                }
            } else {
                i++;
            }
        }
    }

    /* renamed from: B */
    public void mo4549B(LinearSystem dVar, ArrayRow bVar, boolean z) {
        SolverVariable iVar = bVar.f3988a;
        if (iVar != null) {
            C0551a aVar = bVar.f3992e;
            int e = aVar.mo4540e();
            for (int i = 0; i < e; i++) {
                SolverVariable i2 = aVar.mo4544i(i);
                float a = aVar.mo4535a(i);
                this.f4031k.mo4607b(i2);
                if (this.f4031k.mo4606a(iVar, a)) {
                    m4620F(i2);
                }
                this.f3989b += bVar.f3989b * a;
            }
            m4621G(iVar);
        }
    }

    /* renamed from: b */
    public void mo4553b(SolverVariable iVar) {
        this.f4031k.mo4607b(iVar);
        this.f4031k.mo4611e();
        iVar.f4046j[iVar.f4042f] = 1.0f;
        m4620F(iVar);
    }

    /* renamed from: c */
    public SolverVariable mo4554c(LinearSystem dVar, boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f4030j; i2++) {
            SolverVariable iVar = this.f4028h[i2];
            if (!zArr[iVar.f4040d]) {
                this.f4031k.mo4607b(iVar);
                if (i == -1) {
                    if (!this.f4031k.mo4608c()) {
                    }
                } else if (!this.f4031k.mo4610d(this.f4028h[i])) {
                }
                i = i2;
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f4028h[i];
    }

    public void clear() {
        this.f4030j = 0;
        this.f3989b = 0.0f;
    }

    public boolean isEmpty() {
        return this.f4030j == 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(" goal -> (");
        sb.append(this.f3989b);
        sb.append(") : ");
        String sb2 = sb.toString();
        for (int i = 0; i < this.f4030j; i++) {
            this.f4031k.mo4607b(this.f4028h[i]);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append(this.f4031k);
            sb3.append(" ");
            sb2 = sb3.toString();
        }
        return sb2;
    }
}
