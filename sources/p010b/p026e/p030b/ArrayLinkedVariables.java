package p010b.p026e.p030b;

import java.util.Arrays;
import p010b.p026e.p030b.ArrayRow.C0551a;

/* renamed from: b.e.b.a */
public class ArrayLinkedVariables implements C0551a {

    /* renamed from: a */
    private static float f3976a = 0.001f;

    /* renamed from: b */
    int f3977b = 0;

    /* renamed from: c */
    private final ArrayRow f3978c;

    /* renamed from: d */
    protected final Cache f3979d;

    /* renamed from: e */
    private int f3980e = 8;

    /* renamed from: f */
    private SolverVariable f3981f = null;

    /* renamed from: g */
    private int[] f3982g = new int[8];

    /* renamed from: h */
    private int[] f3983h = new int[8];

    /* renamed from: i */
    private float[] f3984i = new float[8];

    /* renamed from: j */
    private int f3985j = -1;

    /* renamed from: k */
    private int f3986k = -1;

    /* renamed from: l */
    private boolean f3987l = false;

    ArrayLinkedVariables(ArrayRow bVar, Cache cVar) {
        this.f3978c = bVar;
        this.f3979d = cVar;
    }

    /* renamed from: a */
    public float mo4535a(int i) {
        int i2 = this.f3985j;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f3977b) {
            if (i3 == i) {
                return this.f3984i[i2];
            }
            i2 = this.f3983h[i2];
            i3++;
        }
        return 0.0f;
    }

    /* renamed from: b */
    public void mo4536b(SolverVariable iVar, float f, boolean z) {
        float f2 = f3976a;
        if (f <= (-f2) || f >= f2) {
            int i = this.f3985j;
            if (i == -1) {
                this.f3985j = 0;
                this.f3984i[0] = f;
                this.f3982g[0] = iVar.f4040d;
                this.f3983h[0] = -1;
                iVar.f4050n++;
                iVar.mo4613a(this.f3978c);
                this.f3977b++;
                if (!this.f3987l) {
                    int i2 = this.f3986k + 1;
                    this.f3986k = i2;
                    int[] iArr = this.f3982g;
                    if (i2 >= iArr.length) {
                        this.f3987l = true;
                        this.f3986k = iArr.length - 1;
                    }
                }
                return;
            }
            int i3 = 0;
            int i4 = -1;
            while (i != -1 && i3 < this.f3977b) {
                int[] iArr2 = this.f3982g;
                int i5 = iArr2[i];
                int i6 = iVar.f4040d;
                if (i5 == i6) {
                    float[] fArr = this.f3984i;
                    float f3 = fArr[i] + f;
                    float f4 = f3976a;
                    if (f3 > (-f4) && f3 < f4) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == 0.0f) {
                        if (i == this.f3985j) {
                            this.f3985j = this.f3983h[i];
                        } else {
                            int[] iArr3 = this.f3983h;
                            iArr3[i4] = iArr3[i];
                        }
                        if (z) {
                            iVar.mo4614c(this.f3978c);
                        }
                        if (this.f3987l) {
                            this.f3986k = i;
                        }
                        iVar.f4050n--;
                        this.f3977b--;
                    }
                    return;
                }
                if (iArr2[i] < i6) {
                    i4 = i;
                }
                i = this.f3983h[i];
                i3++;
            }
            int i7 = this.f3986k;
            int i8 = i7 + 1;
            if (this.f3987l) {
                int[] iArr4 = this.f3982g;
                if (iArr4[i7] != -1) {
                    i7 = iArr4.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr5 = this.f3982g;
            if (i7 >= iArr5.length && this.f3977b < iArr5.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr6 = this.f3982g;
                    if (i9 >= iArr6.length) {
                        break;
                    } else if (iArr6[i9] == -1) {
                        i7 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            int[] iArr7 = this.f3982g;
            if (i7 >= iArr7.length) {
                i7 = iArr7.length;
                int i10 = this.f3980e * 2;
                this.f3980e = i10;
                this.f3987l = false;
                this.f3986k = i7 - 1;
                this.f3984i = Arrays.copyOf(this.f3984i, i10);
                this.f3982g = Arrays.copyOf(this.f3982g, this.f3980e);
                this.f3983h = Arrays.copyOf(this.f3983h, this.f3980e);
            }
            this.f3982g[i7] = iVar.f4040d;
            this.f3984i[i7] = f;
            if (i4 != -1) {
                int[] iArr8 = this.f3983h;
                iArr8[i7] = iArr8[i4];
                iArr8[i4] = i7;
            } else {
                this.f3983h[i7] = this.f3985j;
                this.f3985j = i7;
            }
            iVar.f4050n++;
            iVar.mo4613a(this.f3978c);
            this.f3977b++;
            if (!this.f3987l) {
                this.f3986k++;
            }
            int i11 = this.f3986k;
            int[] iArr9 = this.f3982g;
            if (i11 >= iArr9.length) {
                this.f3987l = true;
                this.f3986k = iArr9.length - 1;
            }
        }
    }

    /* renamed from: c */
    public final float mo4537c(SolverVariable iVar) {
        int i = this.f3985j;
        int i2 = 0;
        while (i != -1 && i2 < this.f3977b) {
            if (this.f3982g[i] == iVar.f4040d) {
                return this.f3984i[i];
            }
            i = this.f3983h[i];
            i2++;
        }
        return 0.0f;
    }

    public final void clear() {
        int i = this.f3985j;
        int i2 = 0;
        while (i != -1 && i2 < this.f3977b) {
            SolverVariable iVar = this.f3979d.f3997d[this.f3982g[i]];
            if (iVar != null) {
                iVar.mo4614c(this.f3978c);
            }
            i = this.f3983h[i];
            i2++;
        }
        this.f3985j = -1;
        this.f3986k = -1;
        this.f3987l = false;
        this.f3977b = 0;
    }

    /* renamed from: d */
    public boolean mo4539d(SolverVariable iVar) {
        int i = this.f3985j;
        if (i == -1) {
            return false;
        }
        int i2 = 0;
        while (i != -1 && i2 < this.f3977b) {
            if (this.f3982g[i] == iVar.f4040d) {
                return true;
            }
            i = this.f3983h[i];
            i2++;
        }
        return false;
    }

    /* renamed from: e */
    public int mo4540e() {
        return this.f3977b;
    }

    /* renamed from: f */
    public float mo4541f(ArrayRow bVar, boolean z) {
        float c = mo4537c(bVar.f3988a);
        mo4543h(bVar.f3988a, z);
        C0551a aVar = bVar.f3992e;
        int e = aVar.mo4540e();
        for (int i = 0; i < e; i++) {
            SolverVariable i2 = aVar.mo4544i(i);
            mo4536b(i2, aVar.mo4537c(i2) * c, z);
        }
        return c;
    }

    /* renamed from: g */
    public final void mo4542g(SolverVariable iVar, float f) {
        if (f == 0.0f) {
            mo4543h(iVar, true);
            return;
        }
        int i = this.f3985j;
        if (i == -1) {
            this.f3985j = 0;
            this.f3984i[0] = f;
            this.f3982g[0] = iVar.f4040d;
            this.f3983h[0] = -1;
            iVar.f4050n++;
            iVar.mo4613a(this.f3978c);
            this.f3977b++;
            if (!this.f3987l) {
                int i2 = this.f3986k + 1;
                this.f3986k = i2;
                int[] iArr = this.f3982g;
                if (i2 >= iArr.length) {
                    this.f3987l = true;
                    this.f3986k = iArr.length - 1;
                }
            }
            return;
        }
        int i3 = 0;
        int i4 = -1;
        while (i != -1 && i3 < this.f3977b) {
            int[] iArr2 = this.f3982g;
            int i5 = iArr2[i];
            int i6 = iVar.f4040d;
            if (i5 == i6) {
                this.f3984i[i] = f;
                return;
            }
            if (iArr2[i] < i6) {
                i4 = i;
            }
            i = this.f3983h[i];
            i3++;
        }
        int i7 = this.f3986k;
        int i8 = i7 + 1;
        if (this.f3987l) {
            int[] iArr3 = this.f3982g;
            if (iArr3[i7] != -1) {
                i7 = iArr3.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr4 = this.f3982g;
        if (i7 >= iArr4.length && this.f3977b < iArr4.length) {
            int i9 = 0;
            while (true) {
                int[] iArr5 = this.f3982g;
                if (i9 >= iArr5.length) {
                    break;
                } else if (iArr5[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr6 = this.f3982g;
        if (i7 >= iArr6.length) {
            i7 = iArr6.length;
            int i10 = this.f3980e * 2;
            this.f3980e = i10;
            this.f3987l = false;
            this.f3986k = i7 - 1;
            this.f3984i = Arrays.copyOf(this.f3984i, i10);
            this.f3982g = Arrays.copyOf(this.f3982g, this.f3980e);
            this.f3983h = Arrays.copyOf(this.f3983h, this.f3980e);
        }
        this.f3982g[i7] = iVar.f4040d;
        this.f3984i[i7] = f;
        if (i4 != -1) {
            int[] iArr7 = this.f3983h;
            iArr7[i7] = iArr7[i4];
            iArr7[i4] = i7;
        } else {
            this.f3983h[i7] = this.f3985j;
            this.f3985j = i7;
        }
        iVar.f4050n++;
        iVar.mo4613a(this.f3978c);
        int i11 = this.f3977b + 1;
        this.f3977b = i11;
        if (!this.f3987l) {
            this.f3986k++;
        }
        int[] iArr8 = this.f3982g;
        if (i11 >= iArr8.length) {
            this.f3987l = true;
        }
        if (this.f3986k >= iArr8.length) {
            this.f3987l = true;
            this.f3986k = iArr8.length - 1;
        }
    }

    /* renamed from: h */
    public final float mo4543h(SolverVariable iVar, boolean z) {
        if (this.f3981f == iVar) {
            this.f3981f = null;
        }
        int i = this.f3985j;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f3977b) {
            if (this.f3982g[i] == iVar.f4040d) {
                if (i == this.f3985j) {
                    this.f3985j = this.f3983h[i];
                } else {
                    int[] iArr = this.f3983h;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    iVar.mo4614c(this.f3978c);
                }
                iVar.f4050n--;
                this.f3977b--;
                this.f3982g[i] = -1;
                if (this.f3987l) {
                    this.f3986k = i;
                }
                return this.f3984i[i];
            }
            i2++;
            i3 = i;
            i = this.f3983h[i];
        }
        return 0.0f;
    }

    /* renamed from: i */
    public SolverVariable mo4544i(int i) {
        int i2 = this.f3985j;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f3977b) {
            if (i3 == i) {
                return this.f3979d.f3997d[this.f3982g[i2]];
            }
            i2 = this.f3983h[i2];
            i3++;
        }
        return null;
    }

    /* renamed from: j */
    public void mo4545j(float f) {
        int i = this.f3985j;
        int i2 = 0;
        while (i != -1 && i2 < this.f3977b) {
            float[] fArr = this.f3984i;
            fArr[i] = fArr[i] / f;
            i = this.f3983h[i];
            i2++;
        }
    }

    /* renamed from: k */
    public void mo4546k() {
        int i = this.f3985j;
        int i2 = 0;
        while (i != -1 && i2 < this.f3977b) {
            float[] fArr = this.f3984i;
            fArr[i] = fArr[i] * -1.0f;
            i = this.f3983h[i];
            i2++;
        }
    }

    public String toString() {
        int i = this.f3985j;
        String str = "";
        int i2 = 0;
        while (i != -1 && i2 < this.f3977b) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" -> ");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append(this.f3984i[i]);
            sb3.append(" : ");
            String sb4 = sb3.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb4);
            sb5.append(this.f3979d.f3997d[this.f3982g[i]]);
            str = sb5.toString();
            i = this.f3983h[i];
            i2++;
        }
        return str;
    }
}
