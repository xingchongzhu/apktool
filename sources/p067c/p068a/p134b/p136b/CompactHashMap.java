package p067c.p068a.p134b.p136b;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p067c.p068a.p134b.p135a.C1320g;
import p067c.p068a.p134b.p135a.Objects;

/* renamed from: c.a.b.b.k */
class CompactHashMap<K, V> extends AbstractMap<K, V> implements Serializable {
    @MonotonicNonNullDecl

    /* renamed from: a */
    private transient int[] f9821a;
    @MonotonicNonNullDecl

    /* renamed from: b */
    transient long[] f9822b;
    @MonotonicNonNullDecl

    /* renamed from: c */
    transient Object[] f9823c;
    @MonotonicNonNullDecl

    /* renamed from: d */
    transient Object[] f9824d;

    /* renamed from: e */
    transient float f9825e;

    /* renamed from: f */
    transient int f9826f;

    /* renamed from: g */
    private transient int f9827g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public transient int f9828h;
    @MonotonicNonNullDecl

    /* renamed from: i */
    private transient Set<K> f9829i;
    @MonotonicNonNullDecl

    /* renamed from: j */
    private transient Set<Entry<K, V>> f9830j;
    @MonotonicNonNullDecl

    /* renamed from: k */
    private transient Collection<V> f9831k;

    /* renamed from: c.a.b.b.k$a */
    /* compiled from: CompactHashMap */
    class C1362a extends C1366e<K> {
        C1362a() {
            super(CompactHashMap.this, null);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public K mo8353b(int i) {
            return CompactHashMap.this.f9823c[i];
        }
    }

    /* renamed from: c.a.b.b.k$b */
    /* compiled from: CompactHashMap */
    class C1363b extends C1366e<Entry<K, V>> {
        C1363b() {
            super(CompactHashMap.this, null);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public Entry<K, V> mo8353b(int i) {
            return new C1368g(i);
        }
    }

    /* renamed from: c.a.b.b.k$c */
    /* compiled from: CompactHashMap */
    class C1364c extends C1366e<V> {
        C1364c() {
            super(CompactHashMap.this, null);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public V mo8353b(int i) {
            return CompactHashMap.this.f9824d[i];
        }
    }

    /* renamed from: c.a.b.b.k$d */
    /* compiled from: CompactHashMap */
    class C1365d extends AbstractSet<Entry<K, V>> {
        C1365d() {
        }

        public void clear() {
            CompactHashMap.this.clear();
        }

        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            int c = CompactHashMap.this.m11809p(entry.getKey());
            if (c == -1 || !Objects.m11640a(CompactHashMap.this.f9824d[c], entry.getValue())) {
                return false;
            }
            return true;
        }

        public Iterator<Entry<K, V>> iterator() {
            return CompactHashMap.this.mo8340j();
        }

        public boolean remove(@NullableDecl Object obj) {
            if (obj instanceof Entry) {
                Entry entry = (Entry) obj;
                int c = CompactHashMap.this.m11809p(entry.getKey());
                if (c != -1 && Objects.m11640a(CompactHashMap.this.f9824d[c], entry.getValue())) {
                    CompactHashMap.this.m11813x(c);
                    return true;
                }
            }
            return false;
        }

        public int size() {
            return CompactHashMap.this.f9828h;
        }
    }

    /* renamed from: c.a.b.b.k$e */
    /* compiled from: CompactHashMap */
    private abstract class C1366e<T> implements Iterator<T> {

        /* renamed from: a */
        int f9836a;

        /* renamed from: b */
        int f9837b;

        /* renamed from: c */
        int f9838c;

        private C1366e() {
            this.f9836a = CompactHashMap.this.f9826f;
            this.f9837b = CompactHashMap.this.mo8341k();
            this.f9838c = -1;
        }

        /* renamed from: a */
        private void m11833a() {
            if (CompactHashMap.this.f9826f != this.f9836a) {
                throw new ConcurrentModificationException();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract T mo8353b(int i);

        public boolean hasNext() {
            return this.f9837b >= 0;
        }

        public T next() {
            m11833a();
            if (hasNext()) {
                int i = this.f9837b;
                this.f9838c = i;
                T b = mo8353b(i);
                this.f9837b = CompactHashMap.this.mo8343n(this.f9837b);
                return b;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            m11833a();
            CollectPreconditions.m11787c(this.f9838c >= 0);
            this.f9836a++;
            CompactHashMap.this.m11813x(this.f9838c);
            this.f9837b = CompactHashMap.this.mo8333e(this.f9837b, this.f9838c);
            this.f9838c = -1;
        }

        /* synthetic */ C1366e(CompactHashMap kVar, C1362a aVar) {
            this();
        }
    }

    /* renamed from: c.a.b.b.k$f */
    /* compiled from: CompactHashMap */
    class C1367f extends AbstractSet<K> {
        C1367f() {
        }

        public void clear() {
            CompactHashMap.this.clear();
        }

        public boolean contains(Object obj) {
            return CompactHashMap.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return CompactHashMap.this.mo8348s();
        }

        public boolean remove(@NullableDecl Object obj) {
            int c = CompactHashMap.this.m11809p(obj);
            if (c == -1) {
                return false;
            }
            CompactHashMap.this.m11813x(c);
            return true;
        }

        public int size() {
            return CompactHashMap.this.f9828h;
        }
    }

    /* renamed from: c.a.b.b.k$g */
    /* compiled from: CompactHashMap */
    final class C1368g extends AbstractMapEntry<K, V> {
        @NullableDecl

        /* renamed from: a */
        private final K f9841a;

        /* renamed from: b */
        private int f9842b;

        C1368g(int i) {
            this.f9841a = CompactHashMap.this.f9823c[i];
            this.f9842b = i;
        }

        /* renamed from: a */
        private void m11835a() {
            int i = this.f9842b;
            if (i == -1 || i >= CompactHashMap.this.size() || !Objects.m11640a(this.f9841a, CompactHashMap.this.f9823c[this.f9842b])) {
                this.f9842b = CompactHashMap.this.m11809p(this.f9841a);
            }
        }

        public K getKey() {
            return this.f9841a;
        }

        public V getValue() {
            m11835a();
            int i = this.f9842b;
            if (i == -1) {
                return null;
            }
            return CompactHashMap.this.f9824d[i];
        }

        public V setValue(V v) {
            m11835a();
            int i = this.f9842b;
            if (i == -1) {
                CompactHashMap.this.put(this.f9841a, v);
                return null;
            }
            V[] vArr = CompactHashMap.this.f9824d;
            V v2 = vArr[i];
            vArr[i] = v;
            return v2;
        }
    }

    /* renamed from: c.a.b.b.k$h */
    /* compiled from: CompactHashMap */
    class C1369h extends AbstractCollection<V> {
        C1369h() {
        }

        public void clear() {
            CompactHashMap.this.clear();
        }

        public Iterator<V> iterator() {
            return CompactHashMap.this.mo8328C();
        }

        public int size() {
            return CompactHashMap.this.f9828h;
        }
    }

    CompactHashMap() {
        mo8345q(3, 1.0f);
    }

    /* renamed from: A */
    private void m11800A(int i) {
        if (this.f9821a.length >= 1073741824) {
            this.f9827g = Integer.MAX_VALUE;
            return;
        }
        int i2 = ((int) (((float) i) * this.f9825e)) + 1;
        int[] v = m11811v(i);
        long[] jArr = this.f9822b;
        int length = v.length - 1;
        for (int i3 = 0; i3 < this.f9828h; i3++) {
            int l = m11806l(jArr[i3]);
            int i4 = l & length;
            int i5 = v[i4];
            v[i4] = i3;
            jArr[i3] = (((long) l) << 32) | (4294967295L & ((long) i5));
        }
        this.f9827g = i2;
        this.f9821a = v;
    }

    /* renamed from: B */
    private static long m11801B(long j, int i) {
        return (j & -4294967296L) | (((long) i) & 4294967295L);
    }

    /* renamed from: f */
    public static <K, V> CompactHashMap<K, V> m11805f() {
        return new CompactHashMap<>();
    }

    /* renamed from: l */
    private static int m11806l(long j) {
        return (int) (j >>> 32);
    }

    /* renamed from: m */
    private static int m11807m(long j) {
        return (int) j;
    }

    /* renamed from: o */
    private int m11808o() {
        return this.f9821a.length - 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public int m11809p(@NullableDecl Object obj) {
        int c = Hashing.m11898c(obj);
        int i = this.f9821a[m11808o() & c];
        while (i != -1) {
            long j = this.f9822b[i];
            if (m11806l(j) == c && Objects.m11640a(obj, this.f9823c[i])) {
                return i;
            }
            i = m11807m(j);
        }
        return -1;
    }

    /* renamed from: u */
    private static long[] m11810u(int i) {
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1);
        return jArr;
    }

    /* renamed from: v */
    private static int[] m11811v(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    @NullableDecl
    /* renamed from: w */
    private V m11812w(@NullableDecl Object obj, int i) {
        int o = m11808o() & i;
        int i2 = this.f9821a[o];
        if (i2 == -1) {
            return null;
        }
        int i3 = -1;
        while (true) {
            if (m11806l(this.f9822b[i2]) != i || !Objects.m11640a(obj, this.f9823c[i2])) {
                int m = m11807m(this.f9822b[i2]);
                if (m == -1) {
                    return null;
                }
                int i4 = m;
                i3 = i2;
                i2 = i4;
            } else {
                V v = this.f9824d[i2];
                if (i3 == -1) {
                    this.f9821a[o] = m11807m(this.f9822b[i2]);
                } else {
                    long[] jArr = this.f9822b;
                    jArr[i3] = m11801B(jArr[i3], m11807m(jArr[i2]));
                }
                mo8350t(i2);
                this.f9828h--;
                this.f9826f++;
                return v;
            }
        }
    }

    /* access modifiers changed from: private */
    @CanIgnoreReturnValue
    /* renamed from: x */
    public V m11813x(int i) {
        return m11812w(this.f9823c[i], m11806l(this.f9822b[i]));
    }

    /* renamed from: z */
    private void m11814z(int i) {
        int length = this.f9822b.length;
        if (i > length) {
            int max = Math.max(1, length >>> 1) + length;
            if (max < 0) {
                max = Integer.MAX_VALUE;
            }
            if (max != length) {
                mo8352y(max);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: C */
    public Iterator<V> mo8328C() {
        return new C1364c();
    }

    public void clear() {
        this.f9826f++;
        Arrays.fill(this.f9823c, 0, this.f9828h, null);
        Arrays.fill(this.f9824d, 0, this.f9828h, null);
        Arrays.fill(this.f9821a, -1);
        Arrays.fill(this.f9822b, -1);
        this.f9828h = 0;
    }

    public boolean containsKey(@NullableDecl Object obj) {
        return m11809p(obj) != -1;
    }

    public boolean containsValue(@NullableDecl Object obj) {
        for (int i = 0; i < this.f9828h; i++) {
            if (Objects.m11640a(obj, this.f9824d[i])) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo8332d(int i) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo8333e(int i, int i2) {
        return i - 1;
    }

    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> set = this.f9830j;
        if (set != null) {
            return set;
        }
        Set<Entry<K, V>> g = mo8335g();
        this.f9830j = g;
        return g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public Set<Entry<K, V>> mo8335g() {
        return new C1365d();
    }

    public V get(@NullableDecl Object obj) {
        int p = m11809p(obj);
        mo8332d(p);
        if (p == -1) {
            return null;
        }
        return this.f9824d[p];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public Set<K> mo8337h() {
        return new C1367f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public Collection<V> mo8338i() {
        return new C1369h();
    }

    public boolean isEmpty() {
        return this.f9828h == 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public Iterator<Entry<K, V>> mo8340j() {
        return new C1363b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public int mo8341k() {
        return isEmpty() ? -1 : 0;
    }

    public Set<K> keySet() {
        Set<K> set = this.f9829i;
        if (set != null) {
            return set;
        }
        Set<K> h = mo8337h();
        this.f9829i = h;
        return h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public int mo8343n(int i) {
        int i2 = i + 1;
        if (i2 < this.f9828h) {
            return i2;
        }
        return -1;
    }

    @NullableDecl
    @CanIgnoreReturnValue
    public V put(@NullableDecl K k, @NullableDecl V v) {
        long[] jArr = this.f9822b;
        Object[] objArr = this.f9823c;
        V[] vArr = this.f9824d;
        int c = Hashing.m11898c(k);
        int o = m11808o() & c;
        int i = this.f9828h;
        int[] iArr = this.f9821a;
        int i2 = iArr[o];
        if (i2 == -1) {
            iArr[o] = i;
        } else {
            while (true) {
                long j = jArr[i2];
                if (m11806l(j) != c || !Objects.m11640a(k, objArr[i2])) {
                    int m = m11807m(j);
                    if (m == -1) {
                        jArr[i2] = m11801B(j, i);
                        break;
                    }
                    i2 = m;
                } else {
                    V v2 = vArr[i2];
                    vArr[i2] = v;
                    mo8332d(i2);
                    return v2;
                }
            }
        }
        if (i != Integer.MAX_VALUE) {
            int i3 = i + 1;
            m11814z(i3);
            mo8346r(i, k, v, c);
            this.f9828h = i3;
            if (i >= this.f9827g) {
                m11800A(this.f9821a.length * 2);
            }
            this.f9826f++;
            return null;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public void mo8345q(int i, float f) {
        boolean z = false;
        C1320g.m11646e(i >= 0, "Initial capacity must be non-negative");
        if (f > 0.0f) {
            z = true;
        }
        C1320g.m11646e(z, "Illegal load factor");
        int a = Hashing.m11896a(i, (double) f);
        this.f9821a = m11811v(a);
        this.f9825e = f;
        this.f9823c = new Object[i];
        this.f9824d = new Object[i];
        this.f9822b = m11810u(i);
        this.f9827g = Math.max(1, (int) (((float) a) * f));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public void mo8346r(int i, @NullableDecl K k, @NullableDecl V v, int i2) {
        this.f9822b[i] = (((long) i2) << 32) | 4294967295L;
        this.f9823c[i] = k;
        this.f9824d[i] = v;
    }

    @NullableDecl
    @CanIgnoreReturnValue
    public V remove(@NullableDecl Object obj) {
        return m11812w(obj, Hashing.m11898c(obj));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public Iterator<K> mo8348s() {
        return new C1362a();
    }

    public int size() {
        return this.f9828h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public void mo8350t(int i) {
        int size = size() - 1;
        if (i < size) {
            Object[] objArr = this.f9823c;
            objArr[i] = objArr[size];
            Object[] objArr2 = this.f9824d;
            objArr2[i] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            long[] jArr = this.f9822b;
            long j = jArr[size];
            jArr[i] = j;
            jArr[size] = -1;
            int l = m11806l(j) & m11808o();
            int[] iArr = this.f9821a;
            int i2 = iArr[l];
            if (i2 == size) {
                iArr[l] = i;
                return;
            }
            while (true) {
                long j2 = this.f9822b[i2];
                int m = m11807m(j2);
                if (m == size) {
                    this.f9822b[i2] = m11801B(j2, i);
                    return;
                }
                i2 = m;
            }
        } else {
            this.f9823c[i] = null;
            this.f9824d[i] = null;
            this.f9822b[i] = -1;
        }
    }

    public Collection<V> values() {
        Collection<V> collection = this.f9831k;
        if (collection != null) {
            return collection;
        }
        Collection<V> i = mo8338i();
        this.f9831k = i;
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y */
    public void mo8352y(int i) {
        this.f9823c = Arrays.copyOf(this.f9823c, i);
        this.f9824d = Arrays.copyOf(this.f9824d, i);
        long[] jArr = this.f9822b;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(copyOf, length, i, -1);
        }
        this.f9822b = copyOf;
    }
}
