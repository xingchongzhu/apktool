package p010b.p025d;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: b.d.f */
abstract class MapCollections<K, V> {

    /* renamed from: a */
    C0547b f3946a;

    /* renamed from: b */
    C0548c f3947b;

    /* renamed from: c */
    C0550e f3948c;

    /* renamed from: b.d.f$a */
    /* compiled from: MapCollections */
    final class C0546a<T> implements Iterator<T> {

        /* renamed from: a */
        final int f3949a;

        /* renamed from: b */
        int f3950b;

        /* renamed from: c */
        int f3951c;

        /* renamed from: d */
        boolean f3952d = false;

        C0546a(int i) {
            this.f3949a = i;
            this.f3950b = MapCollections.this.mo4387d();
        }

        public boolean hasNext() {
            return this.f3951c < this.f3950b;
        }

        public T next() {
            if (hasNext()) {
                T b = MapCollections.this.mo4385b(this.f3951c, this.f3949a);
                this.f3951c++;
                this.f3952d = true;
                return b;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f3952d) {
                int i = this.f3951c - 1;
                this.f3951c = i;
                this.f3950b--;
                this.f3952d = false;
                MapCollections.this.mo4391h(i);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: b.d.f$b */
    /* compiled from: MapCollections */
    final class C0547b implements Set<Entry<K, V>> {
        C0547b() {
        }

        public boolean addAll(Collection<? extends Entry<K, V>> collection) {
            int d = MapCollections.this.mo4387d();
            for (Entry entry : collection) {
                MapCollections.this.mo4390g(entry.getKey(), entry.getValue());
            }
            return d != MapCollections.this.mo4387d();
        }

        /* renamed from: b */
        public boolean add(Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            MapCollections.this.mo4384a();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            int e = MapCollections.this.mo4388e(entry.getKey());
            if (e < 0) {
                return false;
            }
            return ContainerHelpers.m4459c(MapCollections.this.mo4385b(e, 1), entry.getValue());
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
            return MapCollections.m4484k(this, obj);
        }

        public int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            for (int d = MapCollections.this.mo4387d() - 1; d >= 0; d--) {
                Object b = MapCollections.this.mo4385b(d, 0);
                Object b2 = MapCollections.this.mo4385b(d, 1);
                if (b == null) {
                    i = 0;
                } else {
                    i = b.hashCode();
                }
                if (b2 == null) {
                    i2 = 0;
                } else {
                    i2 = b2.hashCode();
                }
                i3 += i ^ i2;
            }
            return i3;
        }

        public boolean isEmpty() {
            return MapCollections.this.mo4387d() == 0;
        }

        public Iterator<Entry<K, V>> iterator() {
            return new C0549d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return MapCollections.this.mo4387d();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b.d.f$c */
    /* compiled from: MapCollections */
    final class C0548c implements Set<K> {
        C0548c() {
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            MapCollections.this.mo4384a();
        }

        public boolean contains(Object obj) {
            return MapCollections.this.mo4388e(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            return MapCollections.m4483j(MapCollections.this.mo4386c(), collection);
        }

        public boolean equals(Object obj) {
            return MapCollections.m4484k(this, obj);
        }

        public int hashCode() {
            int i;
            int i2 = 0;
            for (int d = MapCollections.this.mo4387d() - 1; d >= 0; d--) {
                Object b = MapCollections.this.mo4385b(d, 0);
                if (b == null) {
                    i = 0;
                } else {
                    i = b.hashCode();
                }
                i2 += i;
            }
            return i2;
        }

        public boolean isEmpty() {
            return MapCollections.this.mo4387d() == 0;
        }

        public Iterator<K> iterator() {
            return new C0546a(0);
        }

        public boolean remove(Object obj) {
            int e = MapCollections.this.mo4388e(obj);
            if (e < 0) {
                return false;
            }
            MapCollections.this.mo4391h(e);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return MapCollections.m4485o(MapCollections.this.mo4386c(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return MapCollections.m4486p(MapCollections.this.mo4386c(), collection);
        }

        public int size() {
            return MapCollections.this.mo4387d();
        }

        public Object[] toArray() {
            return MapCollections.this.mo4437q(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return MapCollections.this.mo4438r(tArr, 0);
        }
    }

    /* renamed from: b.d.f$d */
    /* compiled from: MapCollections */
    final class C0549d implements Iterator<Entry<K, V>>, Entry<K, V> {

        /* renamed from: a */
        int f3956a;

        /* renamed from: b */
        int f3957b;

        /* renamed from: c */
        boolean f3958c = false;

        C0549d() {
            this.f3956a = MapCollections.this.mo4387d() - 1;
            this.f3957b = -1;
        }

        /* renamed from: a */
        public Entry<K, V> next() {
            if (hasNext()) {
                this.f3957b++;
                this.f3958c = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public boolean equals(Object obj) {
            if (this.f3958c) {
                boolean z = false;
                if (!(obj instanceof Entry)) {
                    return false;
                }
                Entry entry = (Entry) obj;
                if (ContainerHelpers.m4459c(entry.getKey(), MapCollections.this.mo4385b(this.f3957b, 0)) && ContainerHelpers.m4459c(entry.getValue(), MapCollections.this.mo4385b(this.f3957b, 1))) {
                    z = true;
                }
                return z;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public K getKey() {
            if (this.f3958c) {
                return MapCollections.this.mo4385b(this.f3957b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f3958c) {
                return MapCollections.this.mo4385b(this.f3957b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f3957b < this.f3956a;
        }

        public int hashCode() {
            int i;
            if (this.f3958c) {
                int i2 = 0;
                Object b = MapCollections.this.mo4385b(this.f3957b, 0);
                Object b2 = MapCollections.this.mo4385b(this.f3957b, 1);
                if (b == null) {
                    i = 0;
                } else {
                    i = b.hashCode();
                }
                if (b2 != null) {
                    i2 = b2.hashCode();
                }
                return i ^ i2;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public void remove() {
            if (this.f3958c) {
                MapCollections.this.mo4391h(this.f3957b);
                this.f3957b--;
                this.f3956a--;
                this.f3958c = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v) {
            if (this.f3958c) {
                return MapCollections.this.mo4392i(this.f3957b, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append("=");
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* renamed from: b.d.f$e */
    /* compiled from: MapCollections */
    final class C0550e implements Collection<V> {
        C0550e() {
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            MapCollections.this.mo4384a();
        }

        public boolean contains(Object obj) {
            return MapCollections.this.mo4389f(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return MapCollections.this.mo4387d() == 0;
        }

        public Iterator<V> iterator() {
            return new C0546a(1);
        }

        public boolean remove(Object obj) {
            int f = MapCollections.this.mo4389f(obj);
            if (f < 0) {
                return false;
            }
            MapCollections.this.mo4391h(f);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int d = MapCollections.this.mo4387d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (collection.contains(MapCollections.this.mo4385b(i, 1))) {
                    MapCollections.this.mo4391h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int d = MapCollections.this.mo4387d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (!collection.contains(MapCollections.this.mo4385b(i, 1))) {
                    MapCollections.this.mo4391h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return MapCollections.this.mo4387d();
        }

        public Object[] toArray() {
            return MapCollections.this.mo4437q(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return MapCollections.this.mo4438r(tArr, 1);
        }
    }

    MapCollections() {
    }

    /* renamed from: j */
    public static <K, V> boolean m4483j(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public static <T> boolean m4484k(Set<T> set, Object obj) {
        boolean z = true;
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    z = false;
                }
                return z;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: o */
    public static <K, V> boolean m4485o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size();
    }

    /* renamed from: p */
    public static <K, V> boolean m4486p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo4384a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Object mo4385b(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Map<K, V> mo4386c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract int mo4387d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract int mo4388e(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract int mo4389f(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo4390g(K k, V v);

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo4391h(int i);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract V mo4392i(int i, V v);

    /* renamed from: l */
    public Set<Entry<K, V>> mo4434l() {
        if (this.f3946a == null) {
            this.f3946a = new C0547b<>();
        }
        return this.f3946a;
    }

    /* renamed from: m */
    public Set<K> mo4435m() {
        if (this.f3947b == null) {
            this.f3947b = new C0548c<>();
        }
        return this.f3947b;
    }

    /* renamed from: n */
    public Collection<V> mo4436n() {
        if (this.f3948c == null) {
            this.f3948c = new C0550e<>();
        }
        return this.f3948c;
    }

    /* renamed from: q */
    public Object[] mo4437q(int i) {
        int d = mo4387d();
        Object[] objArr = new Object[d];
        for (int i2 = 0; i2 < d; i2++) {
            objArr[i2] = mo4385b(i2, i);
        }
        return objArr;
    }

    /* renamed from: r */
    public <T> T[] mo4438r(T[] tArr, int i) {
        int d = mo4387d();
        if (tArr.length < d) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), d);
        }
        for (int i2 = 0; i2 < d; i2++) {
            tArr[i2] = mo4385b(i2, i);
        }
        if (tArr.length > d) {
            tArr[d] = null;
        }
        return tArr;
    }
}
