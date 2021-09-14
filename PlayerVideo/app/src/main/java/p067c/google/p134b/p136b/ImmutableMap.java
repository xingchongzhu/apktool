package p067c.google.p134b.p136b;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p067c.google.p134b.p136b.ImmutableCollection.C1377b;

/* renamed from: c.a.b.b.t */
public abstract class ImmutableMap<K, V> implements Map<K, V>, Serializable {

    /* renamed from: a */
    static final Entry<?, ?>[] f9893a = new Entry[0];
    @LazyInit

    /* renamed from: b */
    private transient ImmutableSet<Entry<K, V>> f9894b;
    @RetainedWith
    @LazyInit

    /* renamed from: c */
    private transient ImmutableSet<K> f9895c;
    @RetainedWith
    @LazyInit

    /* renamed from: d */
    private transient ImmutableCollection<V> f9896d;

    /* renamed from: c.a.b.b.t$a */
    /* compiled from: ImmutableMap */
    public static class C1387a<K, V> {
        @MonotonicNonNullDecl

        /* renamed from: a */
        Comparator<? super V> f9897a;

        /* renamed from: b */
        Object[] f9898b;

        /* renamed from: c */
        int f9899c;

        /* renamed from: d */
        boolean f9900d;

        public C1387a() {
            this(4);
        }

        /* renamed from: b */
        private void m11971b(int i) {
            int i2 = i * 2;
            Object[] objArr = this.f9898b;
            if (i2 > objArr.length) {
                this.f9898b = Arrays.copyOf(objArr, C1377b.m11910a(objArr.length, i2));
                this.f9900d = false;
            }
        }

        /* renamed from: a */
        public ImmutableMap<K, V> mo8480a() {
            mo8484f();
            this.f9900d = true;
            return RegularImmutableMap.m11867l(this.f9899c, this.f9898b);
        }

        @CanIgnoreReturnValue
        /* renamed from: c */
        public C1387a<K, V> mo8481c(K k, V v) {
            m11971b(this.f9899c + 1);
            CollectPreconditions.m11785a(k, v);
            Object[] objArr = this.f9898b;
            int i = this.f9899c;
            objArr[i * 2] = k;
            objArr[(i * 2) + 1] = v;
            this.f9899c = i + 1;
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: d */
        public C1387a<K, V> mo8482d(Entry<? extends K, ? extends V> entry) {
            return mo8481c(entry.getKey(), entry.getValue());
        }

        @CanIgnoreReturnValue
        /* renamed from: e */
        public C1387a<K, V> mo8483e(Iterable<? extends Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                m11971b(this.f9899c + ((Collection) iterable).size());
            }
            for (Entry d : iterable) {
                mo8482d(d);
            }
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo8484f() {
            int i;
            if (this.f9897a != null) {
                if (this.f9900d) {
                    this.f9898b = Arrays.copyOf(this.f9898b, this.f9899c * 2);
                }
                Entry[] entryArr = new Entry[this.f9899c];
                int i2 = 0;
                while (true) {
                    i = this.f9899c;
                    if (i2 >= i) {
                        break;
                    }
                    Object[] objArr = this.f9898b;
                    int i3 = i2 * 2;
                    entryArr[i2] = new SimpleImmutableEntry(objArr[i3], objArr[i3 + 1]);
                    i2++;
                }
                Arrays.sort(entryArr, 0, i, Ordering.m11794a(this.f9897a).mo8327e(C1329b0.m11689j()));
                for (int i4 = 0; i4 < this.f9899c; i4++) {
                    int i5 = i4 * 2;
                    this.f9898b[i5] = entryArr[i4].getKey();
                    this.f9898b[i5 + 1] = entryArr[i4].getValue();
                }
            }
        }

        C1387a(int i) {
            this.f9898b = new Object[(i * 2)];
            this.f9899c = 0;
            this.f9900d = false;
        }
    }

    ImmutableMap() {
    }

    /* renamed from: a */
    public static <K, V> C1387a<K, V> m11960a() {
        return new C1387a<>();
    }

    /* renamed from: b */
    public static <K, V> ImmutableMap<K, V> m11961b(Iterable<? extends Entry<? extends K, ? extends V>> iterable) {
        C1387a aVar = new C1387a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.mo8483e(iterable);
        return aVar.mo8480a();
    }

    /* renamed from: c */
    public static <K, V> ImmutableMap<K, V> m11962c(Map<? extends K, ? extends V> map) {
        if ((map instanceof ImmutableMap) && !(map instanceof SortedMap)) {
            ImmutableMap<K, V> tVar = (ImmutableMap) map;
            if (!tVar.mo8393h()) {
                return tVar;
            }
        }
        return m11961b(map.entrySet());
    }

    /* renamed from: j */
    public static <K, V> ImmutableMap<K, V> m11963j() {
        return RegularImmutableMap.f9853e;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(@NullableDecl Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(@NullableDecl Object obj) {
        return values().contains(obj);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public abstract ImmutableSet<Entry<K, V>> mo8389d();

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public abstract ImmutableSet<K> mo8390e();

    public boolean equals(@NullableDecl Object obj) {
        return C1329b0.m11681b(this, obj);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public abstract ImmutableCollection<V> mo8391f();

    /* renamed from: g */
    public ImmutableSet<Entry<K, V>> entrySet() {
        ImmutableSet<Entry<K, V>> vVar = this.f9894b;
        if (vVar != null) {
            return vVar;
        }
        ImmutableSet<Entry<K, V>> d = mo8389d();
        this.f9894b = d;
        return d;
    }

    public abstract V get(@NullableDecl Object obj);

    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v) {
        Object obj2 = get(obj);
        return obj2 != null ? obj2 : v;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public abstract boolean mo8393h();

    public int hashCode() {
        return C1381r0.m11938b(entrySet());
    }

    /* renamed from: i */
    public ImmutableSet<K> keySet() {
        ImmutableSet<K> vVar = this.f9895c;
        if (vVar != null) {
            return vVar;
        }
        ImmutableSet<K> e = mo8390e();
        this.f9895c = e;
        return e;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: k */
    public ImmutableCollection<V> values() {
        ImmutableCollection<V> pVar = this.f9896d;
        if (pVar != null) {
            return pVar;
        }
        ImmutableCollection<V> f = mo8391f();
        this.f9896d = f;
        return f;
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return C1329b0.m11688i(this);
    }
}
