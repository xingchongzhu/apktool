package p010b.p025d;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: b.d.b */
public final class ArraySet<E> implements Collection<E>, Set<E> {

    /* renamed from: a */
    private static final int[] f3919a = new int[0];

    /* renamed from: b */
    private static final Object[] f3920b = new Object[0];

    /* renamed from: c */
    private static Object[] f3921c;

    /* renamed from: d */
    private static int f3922d;

    /* renamed from: e */
    private static Object[] f3923e;

    /* renamed from: f */
    private static int f3924f;

    /* renamed from: g */
    private int[] f3925g;

    /* renamed from: h */
    Object[] f3926h;

    /* renamed from: i */
    int f3927i;

    /* renamed from: j */
    private MapCollections<E, E> f3928j;

    /* renamed from: b.d.b$a */
    /* compiled from: ArraySet */
    class C0545a extends MapCollections<E, E> {
        C0545a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo4384a() {
            ArraySet.this.clear();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Object mo4385b(int i, int i2) {
            return ArraySet.this.f3926h[i];
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Map<E, E> mo4386c() {
            throw new UnsupportedOperationException("not a map");
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public int mo4387d() {
            return ArraySet.this.f3927i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public int mo4388e(Object obj) {
            return ArraySet.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public int mo4389f(Object obj) {
            return ArraySet.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo4390g(E e, E e2) {
            ArraySet.this.add(e);
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo4391h(int i) {
            ArraySet.this.mo4400h(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public E mo4392i(int i, E e) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public ArraySet() {
        this(0);
    }

    /* renamed from: b */
    private void m4440b(int i) {
        if (i == 8) {
            synchronized (ArraySet.class) {
                Object[] objArr = f3923e;
                if (objArr != null) {
                    this.f3926h = objArr;
                    f3923e = (Object[]) objArr[0];
                    this.f3925g = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f3924f--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (ArraySet.class) {
                Object[] objArr2 = f3921c;
                if (objArr2 != null) {
                    this.f3926h = objArr2;
                    f3921c = (Object[]) objArr2[0];
                    this.f3925g = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f3922d--;
                    return;
                }
            }
        }
        this.f3925g = new int[i];
        this.f3926h = new Object[i];
    }

    /* renamed from: d */
    private static void m4441d(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (ArraySet.class) {
                if (f3924f < 10) {
                    objArr[0] = f3923e;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f3923e = objArr;
                    f3924f++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (ArraySet.class) {
                if (f3922d < 10) {
                    objArr[0] = f3921c;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f3921c = objArr;
                    f3922d++;
                }
            }
        }
    }

    /* renamed from: e */
    private MapCollections<E, E> m4442e() {
        if (this.f3928j == null) {
            this.f3928j = new C0545a();
        }
        return this.f3928j;
    }

    /* renamed from: f */
    private int m4443f(Object obj, int i) {
        int i2 = this.f3927i;
        if (i2 == 0) {
            return -1;
        }
        int a = ContainerHelpers.m4457a(this.f3925g, i2, i);
        if (a < 0 || obj.equals(this.f3926h[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f3925g[i3] == i) {
            if (obj.equals(this.f3926h[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f3925g[i4] == i) {
            if (obj.equals(this.f3926h[i4])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    /* renamed from: g */
    private int m4444g() {
        int i = this.f3927i;
        if (i == 0) {
            return -1;
        }
        int a = ContainerHelpers.m4457a(this.f3925g, i, 0);
        if (a < 0 || this.f3926h[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f3925g[i2] == 0) {
            if (this.f3926h[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f3925g[i3] == 0) {
            if (this.f3926h[i3] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    public boolean add(E e) {
        int i;
        int i2;
        if (e == null) {
            i2 = m4444g();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            i2 = m4443f(e, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i3 = i2 ^ -1;
        int i4 = this.f3927i;
        int[] iArr = this.f3925g;
        if (i4 >= iArr.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            Object[] objArr = this.f3926h;
            m4440b(i5);
            int[] iArr2 = this.f3925g;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f3926h, 0, objArr.length);
            }
            m4441d(iArr, objArr, this.f3927i);
        }
        int i6 = this.f3927i;
        if (i3 < i6) {
            int[] iArr3 = this.f3925g;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f3926h;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f3927i - i3);
        }
        this.f3925g[i3] = i;
        this.f3926h[i3] = e;
        this.f3927i++;
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo4395c(this.f3927i + collection.size());
        boolean z = false;
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    /* renamed from: c */
    public void mo4395c(int i) {
        int[] iArr = this.f3925g;
        if (iArr.length < i) {
            Object[] objArr = this.f3926h;
            m4440b(i);
            int i2 = this.f3927i;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f3925g, 0, i2);
                System.arraycopy(objArr, 0, this.f3926h, 0, this.f3927i);
            }
            m4441d(iArr, objArr, this.f3927i);
        }
    }

    public void clear() {
        int i = this.f3927i;
        if (i != 0) {
            m4441d(this.f3925g, this.f3926h, i);
            this.f3925g = f3919a;
            this.f3926h = f3920b;
            this.f3927i = 0;
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f3927i) {
                try {
                    if (!set.contains(mo4402i(i))) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public E mo4400h(int i) {
        E[] eArr = this.f3926h;
        E e = eArr[i];
        int i2 = this.f3927i;
        if (i2 <= 1) {
            m4441d(this.f3925g, eArr, i2);
            this.f3925g = f3919a;
            this.f3926h = f3920b;
            this.f3927i = 0;
        } else {
            int[] iArr = this.f3925g;
            int i3 = 8;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                int i4 = i2 - 1;
                this.f3927i = i4;
                if (i < i4) {
                    int i5 = i + 1;
                    System.arraycopy(iArr, i5, iArr, i, i4 - i);
                    Object[] objArr = this.f3926h;
                    System.arraycopy(objArr, i5, objArr, i, this.f3927i - i);
                }
                this.f3926h[this.f3927i] = null;
            } else {
                if (i2 > 8) {
                    i3 = i2 + (i2 >> 1);
                }
                m4440b(i3);
                this.f3927i--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f3925g, 0, i);
                    System.arraycopy(eArr, 0, this.f3926h, 0, i);
                }
                int i6 = this.f3927i;
                if (i < i6) {
                    int i7 = i + 1;
                    System.arraycopy(iArr, i7, this.f3925g, i, i6 - i);
                    System.arraycopy(eArr, i7, this.f3926h, i, this.f3927i - i);
                }
            }
        }
        return e;
    }

    public int hashCode() {
        int[] iArr = this.f3925g;
        int i = 0;
        for (int i2 = 0; i2 < this.f3927i; i2++) {
            i += iArr[i2];
        }
        return i;
    }

    /* renamed from: i */
    public E mo4402i(int i) {
        return this.f3926h[i];
    }

    public int indexOf(Object obj) {
        return obj == null ? m4444g() : m4443f(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.f3927i <= 0;
    }

    public Iterator<E> iterator() {
        return m4442e().mo4435m().iterator();
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        mo4400h(indexOf);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f3927i - 1; i >= 0; i--) {
            if (!collection.contains(this.f3926h[i])) {
                mo4400h(i);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.f3927i;
    }

    public Object[] toArray() {
        int i = this.f3927i;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f3926h, 0, objArr, 0, i);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3927i * 14);
        sb.append('{');
        for (int i = 0; i < this.f3927i; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object i2 = mo4402i(i);
            if (i2 != this) {
                sb.append(i2);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public ArraySet(int i) {
        if (i == 0) {
            this.f3925g = f3919a;
            this.f3926h = f3920b;
        } else {
            m4440b(i);
        }
        this.f3927i = 0;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f3927i) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f3927i);
        }
        System.arraycopy(this.f3926h, 0, tArr, 0, this.f3927i);
        int length = tArr.length;
        int i = this.f3927i;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }
}
