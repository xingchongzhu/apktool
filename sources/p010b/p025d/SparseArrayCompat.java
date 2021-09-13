package p010b.p025d;

/* renamed from: b.d.h */
public class SparseArrayCompat<E> implements Cloneable {

    /* renamed from: a */
    private static final Object f3968a = new Object();

    /* renamed from: b */
    private boolean f3969b;

    /* renamed from: c */
    private int[] f3970c;

    /* renamed from: d */
    private Object[] f3971d;

    /* renamed from: e */
    private int f3972e;

    public SparseArrayCompat() {
        this(10);
    }

    /* renamed from: d */
    private void m4516d() {
        int i = this.f3972e;
        int[] iArr = this.f3970c;
        Object[] objArr = this.f3971d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f3968a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f3969b = false;
        this.f3972e = i2;
    }

    /* renamed from: a */
    public void mo4522a(int i, E e) {
        int i2 = this.f3972e;
        if (i2 == 0 || i > this.f3970c[i2 - 1]) {
            if (this.f3969b && i2 >= this.f3970c.length) {
                m4516d();
            }
            int i3 = this.f3972e;
            if (i3 >= this.f3970c.length) {
                int e2 = ContainerHelpers.m4461e(i3 + 1);
                int[] iArr = new int[e2];
                Object[] objArr = new Object[e2];
                int[] iArr2 = this.f3970c;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f3971d;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f3970c = iArr;
                this.f3971d = objArr;
            }
            this.f3970c[i3] = i;
            this.f3971d[i3] = e;
            this.f3972e = i3 + 1;
            return;
        }
        mo4530i(i, e);
    }

    /* renamed from: b */
    public void mo4523b() {
        int i = this.f3972e;
        Object[] objArr = this.f3971d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f3972e = 0;
        this.f3969b = false;
    }

    /* renamed from: c */
    public SparseArrayCompat<E> clone() {
        try {
            SparseArrayCompat<E> hVar = (SparseArrayCompat) super.clone();
            hVar.f3970c = (int[]) this.f3970c.clone();
            hVar.f3971d = (Object[]) this.f3971d.clone();
            return hVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: e */
    public E mo4526e(int i) {
        return mo4527f(i, null);
    }

    /* renamed from: f */
    public E mo4527f(int i, E e) {
        int a = ContainerHelpers.m4457a(this.f3970c, this.f3972e, i);
        if (a >= 0) {
            E[] eArr = this.f3971d;
            if (eArr[a] != f3968a) {
                return eArr[a];
            }
        }
        return e;
    }

    /* renamed from: g */
    public int mo4528g(E e) {
        if (this.f3969b) {
            m4516d();
        }
        for (int i = 0; i < this.f3972e; i++) {
            if (this.f3971d[i] == e) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: h */
    public int mo4529h(int i) {
        if (this.f3969b) {
            m4516d();
        }
        return this.f3970c[i];
    }

    /* renamed from: i */
    public void mo4530i(int i, E e) {
        int a = ContainerHelpers.m4457a(this.f3970c, this.f3972e, i);
        if (a >= 0) {
            this.f3971d[a] = e;
        } else {
            int i2 = a ^ -1;
            int i3 = this.f3972e;
            if (i2 < i3) {
                Object[] objArr = this.f3971d;
                if (objArr[i2] == f3968a) {
                    this.f3970c[i2] = i;
                    objArr[i2] = e;
                    return;
                }
            }
            if (this.f3969b && i3 >= this.f3970c.length) {
                m4516d();
                i2 = ContainerHelpers.m4457a(this.f3970c, this.f3972e, i) ^ -1;
            }
            int i4 = this.f3972e;
            if (i4 >= this.f3970c.length) {
                int e2 = ContainerHelpers.m4461e(i4 + 1);
                int[] iArr = new int[e2];
                Object[] objArr2 = new Object[e2];
                int[] iArr2 = this.f3970c;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr3 = this.f3971d;
                System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
                this.f3970c = iArr;
                this.f3971d = objArr2;
            }
            int i5 = this.f3972e;
            if (i5 - i2 != 0) {
                int[] iArr3 = this.f3970c;
                int i6 = i2 + 1;
                System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
                Object[] objArr4 = this.f3971d;
                System.arraycopy(objArr4, i2, objArr4, i6, this.f3972e - i2);
            }
            this.f3970c[i2] = i;
            this.f3971d[i2] = e;
            this.f3972e++;
        }
    }

    /* renamed from: j */
    public int mo4531j() {
        if (this.f3969b) {
            m4516d();
        }
        return this.f3972e;
    }

    /* renamed from: k */
    public E mo4532k(int i) {
        if (this.f3969b) {
            m4516d();
        }
        return this.f3971d[i];
    }

    public String toString() {
        if (mo4531j() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3972e * 28);
        sb.append('{');
        for (int i = 0; i < this.f3972e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo4529h(i));
            sb.append('=');
            Object k = mo4532k(i);
            if (k != this) {
                sb.append(k);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public SparseArrayCompat(int i) {
        this.f3969b = false;
        if (i == 0) {
            this.f3970c = ContainerHelpers.f3930a;
            this.f3971d = ContainerHelpers.f3932c;
            return;
        }
        int e = ContainerHelpers.m4461e(i);
        this.f3970c = new int[e];
        this.f3971d = new Object[e];
    }
}
