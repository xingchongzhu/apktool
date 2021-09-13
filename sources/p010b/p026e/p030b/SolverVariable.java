package p010b.p026e.p030b;

import java.util.Arrays;
import java.util.HashSet;

/* renamed from: b.e.b.i */
public class SolverVariable {

    /* renamed from: a */
    private static int f4037a = 1;

    /* renamed from: b */
    public boolean f4038b;

    /* renamed from: c */
    private String f4039c;

    /* renamed from: d */
    public int f4040d = -1;

    /* renamed from: e */
    int f4041e = -1;

    /* renamed from: f */
    public int f4042f = 0;

    /* renamed from: g */
    public float f4043g;

    /* renamed from: h */
    public boolean f4044h = false;

    /* renamed from: i */
    float[] f4045i = new float[9];

    /* renamed from: j */
    float[] f4046j = new float[9];

    /* renamed from: k */
    C0557a f4047k;

    /* renamed from: l */
    ArrayRow[] f4048l = new ArrayRow[16];

    /* renamed from: m */
    int f4049m = 0;

    /* renamed from: n */
    public int f4050n = 0;

    /* renamed from: o */
    boolean f4051o = false;

    /* renamed from: p */
    int f4052p = -1;

    /* renamed from: q */
    float f4053q = 0.0f;

    /* renamed from: r */
    HashSet<ArrayRow> f4054r = null;

    /* renamed from: b.e.b.i$a */
    /* compiled from: SolverVariable */
    public enum C0557a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public SolverVariable(C0557a aVar, String str) {
        this.f4047k = aVar;
    }

    /* renamed from: b */
    static void m4631b() {
        f4037a++;
    }

    /* renamed from: a */
    public final void mo4613a(ArrayRow bVar) {
        int i = 0;
        while (true) {
            int i2 = this.f4049m;
            if (i >= i2) {
                ArrayRow[] bVarArr = this.f4048l;
                if (i2 >= bVarArr.length) {
                    this.f4048l = (ArrayRow[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                ArrayRow[] bVarArr2 = this.f4048l;
                int i3 = this.f4049m;
                bVarArr2[i3] = bVar;
                this.f4049m = i3 + 1;
                return;
            } else if (this.f4048l[i] != bVar) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo4614c(ArrayRow bVar) {
        int i = this.f4049m;
        int i2 = 0;
        while (i2 < i) {
            if (this.f4048l[i2] == bVar) {
                while (i2 < i - 1) {
                    ArrayRow[] bVarArr = this.f4048l;
                    int i3 = i2 + 1;
                    bVarArr[i2] = bVarArr[i3];
                    i2 = i3;
                }
                this.f4049m--;
                return;
            }
            i2++;
        }
    }

    /* renamed from: d */
    public void mo4615d() {
        this.f4039c = null;
        this.f4047k = C0557a.UNKNOWN;
        this.f4042f = 0;
        this.f4040d = -1;
        this.f4041e = -1;
        this.f4043g = 0.0f;
        this.f4044h = false;
        this.f4051o = false;
        this.f4052p = -1;
        this.f4053q = 0.0f;
        int i = this.f4049m;
        for (int i2 = 0; i2 < i; i2++) {
            this.f4048l[i2] = null;
        }
        this.f4049m = 0;
        this.f4050n = 0;
        this.f4038b = false;
        Arrays.fill(this.f4046j, 0.0f);
    }

    /* renamed from: e */
    public void mo4616e(LinearSystem dVar, float f) {
        this.f4043g = f;
        this.f4044h = true;
        this.f4051o = false;
        this.f4052p = -1;
        this.f4053q = 0.0f;
        int i = this.f4049m;
        this.f4041e = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f4048l[i2].mo4548A(dVar, this, false);
        }
        this.f4049m = 0;
    }

    /* renamed from: f */
    public void mo4617f(C0557a aVar, String str) {
        this.f4047k = aVar;
    }

    /* renamed from: g */
    public final void mo4618g(LinearSystem dVar, ArrayRow bVar) {
        int i = this.f4049m;
        for (int i2 = 0; i2 < i; i2++) {
            this.f4048l[i2].mo4549B(dVar, bVar, false);
        }
        this.f4049m = 0;
    }

    public String toString() {
        String str = "";
        if (this.f4039c != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(this.f4039c);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(this.f4040d);
        return sb2.toString();
    }
}
