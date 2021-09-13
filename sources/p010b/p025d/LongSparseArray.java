package p010b.p025d;

/* renamed from: b.d.d */
public class LongSparseArray<E> implements Cloneable {

    /* renamed from: a */
    private static final Object f3933a = new Object();

    /* renamed from: b */
    private boolean f3934b;

    /* renamed from: c */
    private long[] f3935c;

    /* renamed from: d */
    private Object[] f3936d;

    /* renamed from: e */
    private int f3937e;

    public LongSparseArray() {
        this(10);
    }

    /* renamed from: d */
    private void m4463d() {
        int i = this.f3937e;
        long[] jArr = this.f3935c;
        Object[] objArr = this.f3936d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f3933a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f3934b = false;
        this.f3937e = i2;
    }

    /* renamed from: a */
    public void mo4413a(long j, E e) {
        int i = this.f3937e;
        if (i == 0 || j > this.f3935c[i - 1]) {
            if (this.f3934b && i >= this.f3935c.length) {
                m4463d();
            }
            int i2 = this.f3937e;
            if (i2 >= this.f3935c.length) {
                int f = ContainerHelpers.m4462f(i2 + 1);
                long[] jArr = new long[f];
                Object[] objArr = new Object[f];
                long[] jArr2 = this.f3935c;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f3936d;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f3935c = jArr;
                this.f3936d = objArr;
            }
            this.f3935c[i2] = j;
            this.f3936d[i2] = e;
            this.f3937e = i2 + 1;
            return;
        }
        mo4421i(j, e);
    }

    /* renamed from: b */
    public void mo4414b() {
        int i = this.f3937e;
        Object[] objArr = this.f3936d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f3937e = 0;
        this.f3934b = false;
    }

    /* renamed from: c */
    public LongSparseArray<E> clone() {
        try {
            LongSparseArray<E> dVar = (LongSparseArray) super.clone();
            dVar.f3935c = (long[]) this.f3935c.clone();
            dVar.f3936d = (Object[]) this.f3936d.clone();
            return dVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: e */
    public E mo4417e(long j) {
        return mo4418f(j, null);
    }

    /* renamed from: f */
    public E mo4418f(long j, E e) {
        int b = ContainerHelpers.m4458b(this.f3935c, this.f3937e, j);
        if (b >= 0) {
            E[] eArr = this.f3936d;
            if (eArr[b] != f3933a) {
                return eArr[b];
            }
        }
        return e;
    }

    /* renamed from: g */
    public int mo4419g(long j) {
        if (this.f3934b) {
            m4463d();
        }
        return ContainerHelpers.m4458b(this.f3935c, this.f3937e, j);
    }

    /* renamed from: h */
    public long mo4420h(int i) {
        if (this.f3934b) {
            m4463d();
        }
        return this.f3935c[i];
    }

    /* renamed from: i */
    public void mo4421i(long j, E e) {
        int b = ContainerHelpers.m4458b(this.f3935c, this.f3937e, j);
        if (b >= 0) {
            this.f3936d[b] = e;
        } else {
            int i = b ^ -1;
            int i2 = this.f3937e;
            if (i < i2) {
                Object[] objArr = this.f3936d;
                if (objArr[i] == f3933a) {
                    this.f3935c[i] = j;
                    objArr[i] = e;
                    return;
                }
            }
            if (this.f3934b && i2 >= this.f3935c.length) {
                m4463d();
                i = ContainerHelpers.m4458b(this.f3935c, this.f3937e, j) ^ -1;
            }
            int i3 = this.f3937e;
            if (i3 >= this.f3935c.length) {
                int f = ContainerHelpers.m4462f(i3 + 1);
                long[] jArr = new long[f];
                Object[] objArr2 = new Object[f];
                long[] jArr2 = this.f3935c;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr3 = this.f3936d;
                System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
                this.f3935c = jArr;
                this.f3936d = objArr2;
            }
            int i4 = this.f3937e;
            if (i4 - i != 0) {
                long[] jArr3 = this.f3935c;
                int i5 = i + 1;
                System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
                Object[] objArr4 = this.f3936d;
                System.arraycopy(objArr4, i, objArr4, i5, this.f3937e - i);
            }
            this.f3935c[i] = j;
            this.f3936d[i] = e;
            this.f3937e++;
        }
    }

    /* renamed from: j */
    public void mo4422j(long j) {
        int b = ContainerHelpers.m4458b(this.f3935c, this.f3937e, j);
        if (b >= 0) {
            Object[] objArr = this.f3936d;
            Object obj = objArr[b];
            Object obj2 = f3933a;
            if (obj != obj2) {
                objArr[b] = obj2;
                this.f3934b = true;
            }
        }
    }

    /* renamed from: k */
    public void mo4423k(int i) {
        Object[] objArr = this.f3936d;
        Object obj = objArr[i];
        Object obj2 = f3933a;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f3934b = true;
        }
    }

    /* renamed from: l */
    public int mo4424l() {
        if (this.f3934b) {
            m4463d();
        }
        return this.f3937e;
    }

    /* renamed from: m */
    public E mo4425m(int i) {
        if (this.f3934b) {
            m4463d();
        }
        return this.f3936d[i];
    }

    public String toString() {
        if (mo4424l() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3937e * 28);
        sb.append('{');
        for (int i = 0; i < this.f3937e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo4420h(i));
            sb.append('=');
            Object m = mo4425m(i);
            if (m != this) {
                sb.append(m);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public LongSparseArray(int i) {
        this.f3934b = false;
        if (i == 0) {
            this.f3935c = ContainerHelpers.f3931b;
            this.f3936d = ContainerHelpers.f3932c;
            return;
        }
        int f = ContainerHelpers.m4462f(i);
        this.f3935c = new long[f];
        this.f3936d = new Object[f];
    }
}
