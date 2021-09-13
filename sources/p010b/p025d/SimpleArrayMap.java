package p010b.p025d;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: b.d.g */
public class SimpleArrayMap<K, V> {

    /* renamed from: a */
    static Object[] f3961a;

    /* renamed from: b */
    static int f3962b;

    /* renamed from: c */
    static Object[] f3963c;

    /* renamed from: d */
    static int f3964d;

    /* renamed from: e */
    int[] f3965e;

    /* renamed from: f */
    Object[] f3966f;

    /* renamed from: g */
    int f3967g;

    public SimpleArrayMap() {
        this.f3965e = ContainerHelpers.f3930a;
        this.f3966f = ContainerHelpers.f3932c;
        this.f3967g = 0;
    }

    /* renamed from: a */
    private void m4503a(int i) {
        Class<SimpleArrayMap> cls = SimpleArrayMap.class;
        if (i == 8) {
            synchronized (cls) {
                Object[] objArr = f3963c;
                if (objArr != null) {
                    this.f3966f = objArr;
                    f3963c = (Object[]) objArr[0];
                    this.f3965e = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f3964d--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (cls) {
                Object[] objArr2 = f3961a;
                if (objArr2 != null) {
                    this.f3966f = objArr2;
                    f3961a = (Object[]) objArr2[0];
                    this.f3965e = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f3962b--;
                    return;
                }
            }
        }
        this.f3965e = new int[i];
        this.f3966f = new Object[(i << 1)];
    }

    /* renamed from: b */
    private static int m4504b(int[] iArr, int i, int i2) {
        try {
            return ContainerHelpers.m4457a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: d */
    private static void m4505d(int[] iArr, Object[] objArr, int i) {
        Class<SimpleArrayMap> cls = SimpleArrayMap.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (f3964d < 10) {
                    objArr[0] = f3963c;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f3963c = objArr;
                    f3964d++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (f3962b < 10) {
                    objArr[0] = f3961a;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f3961a = objArr;
                    f3962b++;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo4496c(int i) {
        int i2 = this.f3967g;
        int[] iArr = this.f3965e;
        if (iArr.length < i) {
            Object[] objArr = this.f3966f;
            m4503a(i);
            if (this.f3967g > 0) {
                System.arraycopy(iArr, 0, this.f3965e, 0, i2);
                System.arraycopy(objArr, 0, this.f3966f, 0, i2 << 1);
            }
            m4505d(iArr, objArr, i2);
        }
        if (this.f3967g != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.f3967g;
        if (i > 0) {
            int[] iArr = this.f3965e;
            Object[] objArr = this.f3966f;
            this.f3965e = ContainerHelpers.f3930a;
            this.f3966f = ContainerHelpers.f3932c;
            this.f3967g = 0;
            m4505d(iArr, objArr, i);
        }
        if (this.f3967g > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return mo4502f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return mo4506h(obj) >= 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo4500e(Object obj, int i) {
        int i2 = this.f3967g;
        if (i2 == 0) {
            return -1;
        }
        int b = m4504b(this.f3965e, i2, i);
        if (b < 0 || obj.equals(this.f3966f[b << 1])) {
            return b;
        }
        int i3 = b + 1;
        while (i3 < i2 && this.f3965e[i3] == i) {
            if (obj.equals(this.f3966f[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = b - 1;
        while (i4 >= 0 && this.f3965e[i4] == i) {
            if (obj.equals(this.f3966f[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SimpleArrayMap) {
            SimpleArrayMap gVar = (SimpleArrayMap) obj;
            if (size() != gVar.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f3967g) {
                try {
                    Object i2 = mo4508i(i);
                    Object m = mo4513m(i);
                    Object obj2 = gVar.get(i2);
                    if (m == null) {
                        if (obj2 != null || !gVar.containsKey(i2)) {
                            return false;
                        }
                    } else if (!m.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int i3 = 0;
            while (i3 < this.f3967g) {
                try {
                    Object i4 = mo4508i(i3);
                    Object m2 = mo4513m(i3);
                    Object obj3 = map.get(i4);
                    if (m2 == null) {
                        if (obj3 != null || !map.containsKey(i4)) {
                            return false;
                        }
                    } else if (!m2.equals(obj3)) {
                        return false;
                    }
                    i3++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int mo4502f(Object obj) {
        return obj == null ? mo4503g() : mo4500e(obj, obj.hashCode());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public int mo4503g() {
        int i = this.f3967g;
        if (i == 0) {
            return -1;
        }
        int b = m4504b(this.f3965e, i, 0);
        if (b < 0 || this.f3966f[b << 1] == null) {
            return b;
        }
        int i2 = b + 1;
        while (i2 < i && this.f3965e[i2] == 0) {
            if (this.f3966f[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = b - 1;
        while (i3 >= 0 && this.f3965e[i3] == 0) {
            if (this.f3966f[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int f = mo4502f(obj);
        return f >= 0 ? this.f3966f[(f << 1) + 1] : v;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public int mo4506h(Object obj) {
        int i = this.f3967g * 2;
        Object[] objArr = this.f3966f;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
        } else {
            for (int i3 = 1; i3 < i; i3 += 2) {
                if (obj.equals(objArr[i3])) {
                    return i3 >> 1;
                }
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.f3965e;
        Object[] objArr = this.f3966f;
        int i = this.f3967g;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    /* renamed from: i */
    public K mo4508i(int i) {
        return this.f3966f[i << 1];
    }

    public boolean isEmpty() {
        return this.f3967g <= 0;
    }

    /* renamed from: j */
    public void mo4510j(SimpleArrayMap<? extends K, ? extends V> gVar) {
        int i = gVar.f3967g;
        mo4496c(this.f3967g + i);
        if (this.f3967g != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(gVar.mo4508i(i2), gVar.mo4513m(i2));
            }
        } else if (i > 0) {
            System.arraycopy(gVar.f3965e, 0, this.f3965e, 0, i);
            System.arraycopy(gVar.f3966f, 0, this.f3966f, 0, i << 1);
            this.f3967g = i;
        }
    }

    /* renamed from: k */
    public V mo4511k(int i) {
        V[] vArr = this.f3966f;
        int i2 = i << 1;
        V v = vArr[i2 + 1];
        int i3 = this.f3967g;
        int i4 = 0;
        if (i3 <= 1) {
            m4505d(this.f3965e, vArr, i3);
            this.f3965e = ContainerHelpers.f3930a;
            this.f3966f = ContainerHelpers.f3932c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f3965e;
            int i6 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr, i7, iArr, i, i8);
                    Object[] objArr = this.f3966f;
                    System.arraycopy(objArr, i7 << 1, objArr, i2, i8 << 1);
                }
                Object[] objArr2 = this.f3966f;
                int i9 = i5 << 1;
                objArr2[i9] = null;
                objArr2[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                m4503a(i6);
                if (i3 == this.f3967g) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.f3965e, 0, i);
                        System.arraycopy(vArr, 0, this.f3966f, 0, i2);
                    }
                    if (i < i5) {
                        int i10 = i + 1;
                        int i11 = i5 - i;
                        System.arraycopy(iArr, i10, this.f3965e, i, i11);
                        System.arraycopy(vArr, i10 << 1, this.f3966f, i2, i11 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i4 = i5;
        }
        if (i3 == this.f3967g) {
            this.f3967g = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: l */
    public V mo4512l(int i, V v) {
        int i2 = (i << 1) + 1;
        V[] vArr = this.f3966f;
        V v2 = vArr[i2];
        vArr[i2] = v;
        return v2;
    }

    /* renamed from: m */
    public V mo4513m(int i) {
        return this.f3966f[(i << 1) + 1];
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.f3967g;
        if (k == null) {
            i2 = mo4503g();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = mo4500e(k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            V[] vArr = this.f3966f;
            V v2 = vArr[i4];
            vArr[i4] = v;
            return v2;
        }
        int i5 = i2 ^ -1;
        int[] iArr = this.f3965e;
        if (i3 >= iArr.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            Object[] objArr = this.f3966f;
            m4503a(i6);
            if (i3 == this.f3967g) {
                int[] iArr2 = this.f3965e;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f3966f, 0, objArr.length);
                }
                m4505d(iArr, objArr, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.f3965e;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr2 = this.f3966f;
            System.arraycopy(objArr2, i5 << 1, objArr2, i7 << 1, (this.f3967g - i5) << 1);
        }
        int i8 = this.f3967g;
        if (i3 == i8) {
            int[] iArr4 = this.f3965e;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr3 = this.f3966f;
                int i9 = i5 << 1;
                objArr3[i9] = k;
                objArr3[i9 + 1] = v;
                this.f3967g = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    public V remove(Object obj) {
        int f = mo4502f(obj);
        if (f >= 0) {
            return mo4511k(f);
        }
        return null;
    }

    public V replace(K k, V v) {
        int f = mo4502f(k);
        if (f >= 0) {
            return mo4512l(f, v);
        }
        return null;
    }

    public int size() {
        return this.f3967g;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3967g * 28);
        sb.append('{');
        for (int i = 0; i < this.f3967g; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object i2 = mo4508i(i);
            String str = "(this Map)";
            if (i2 != this) {
                sb.append(i2);
            } else {
                sb.append(str);
            }
            sb.append('=');
            Object m = mo4513m(i);
            if (m != this) {
                sb.append(m);
            } else {
                sb.append(str);
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int f = mo4502f(obj);
        if (f >= 0) {
            Object m = mo4513m(f);
            if (obj2 == m || (obj2 != null && obj2.equals(m))) {
                mo4511k(f);
                return true;
            }
        }
        return false;
    }

    public boolean replace(K k, V v, V v2) {
        int f = mo4502f(k);
        if (f >= 0) {
            V m = mo4513m(f);
            if (m == v || (v != null && v.equals(m))) {
                mo4512l(f, v2);
                return true;
            }
        }
        return false;
    }

    public SimpleArrayMap(int i) {
        if (i == 0) {
            this.f3965e = ContainerHelpers.f3930a;
            this.f3966f = ContainerHelpers.f3932c;
        } else {
            m4503a(i);
        }
        this.f3967g = 0;
    }

    public SimpleArrayMap(SimpleArrayMap<K, V> gVar) {
        this();
        if (gVar != null) {
            mo4510j(gVar);
        }
    }
}
