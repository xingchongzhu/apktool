package p067c.p068a.p134b.p136b;

import c.a.b.b.d$j.a;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p067c.p068a.p134b.p135a.C1320g;

/* renamed from: c.a.b.b.d */
abstract class AbstractMapBasedMultimap<K, V> extends AbstractMultimap<K, V> implements Serializable {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public transient Map<K, Collection<V>> f9775d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public transient int f9776e;

    /* renamed from: c.a.b.b.d$a */
    /* compiled from: AbstractMapBasedMultimap */
    class C1338a extends C1342c<V> {
        C1338a() {
            super();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public V mo8168a(K k, V v) {
            return v;
        }
    }

    /* renamed from: c.a.b.b.d$b */
    /* compiled from: AbstractMapBasedMultimap */
    private class C1339b extends C1337f<K, Collection<V>> {

        /* renamed from: c */
        final transient Map<K, Collection<V>> f9778c;

        /* renamed from: c.a.b.b.d$b$a */
        /* compiled from: AbstractMapBasedMultimap */
        class C1340a extends C1334c<K, Collection<V>> {
            C1340a() {
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public Map<K, Collection<V>> mo8129b() {
                return C1339b.this;
            }

            public boolean contains(Object obj) {
                return Collections2.m11793b(C1339b.this.f9778c.entrySet(), obj);
            }

            public Iterator<Entry<K, Collection<V>>> iterator() {
                return new C1341b();
            }

            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                AbstractMapBasedMultimap.this.m11712t(((Entry) obj).getKey());
                return true;
            }
        }

        /* renamed from: c.a.b.b.d$b$b */
        /* compiled from: AbstractMapBasedMultimap */
        class C1341b implements Iterator<Entry<K, Collection<V>>> {

            /* renamed from: a */
            final Iterator<Entry<K, Collection<V>>> f9781a;
            @NullableDecl

            /* renamed from: b */
            Collection<V> f9782b;

            C1341b() {
                this.f9781a = C1339b.this.f9778c.entrySet().iterator();
            }

            /* renamed from: a */
            public Entry<K, Collection<V>> next() {
                Entry entry = (Entry) this.f9781a.next();
                this.f9782b = (Collection) entry.getValue();
                return C1339b.this.mo8173e(entry);
            }

            public boolean hasNext() {
                return this.f9781a.hasNext();
            }

            public void remove() {
                CollectPreconditions.m11787c(this.f9782b != null);
                this.f9781a.remove();
                AbstractMapBasedMultimap dVar = AbstractMapBasedMultimap.this;
                dVar.f9776e = dVar.f9776e - this.f9782b.size();
                this.f9782b.clear();
                this.f9782b = null;
            }
        }

        C1339b(Map<K, Collection<V>> map) {
            this.f9778c = map;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Set<Entry<K, Collection<V>>> mo8149a() {
            return new C1340a();
        }

        /* renamed from: c */
        public Collection<V> get(Object obj) {
            Collection collection = (Collection) C1329b0.m11686g(this.f9778c, obj);
            if (collection == null) {
                return null;
            }
            return AbstractMapBasedMultimap.this.mo8157v(obj, collection);
        }

        public void clear() {
            if (this.f9778c == AbstractMapBasedMultimap.this.f9775d) {
                AbstractMapBasedMultimap.this.clear();
            } else {
                Iterators.m12013b(new C1341b());
            }
        }

        public boolean containsKey(Object obj) {
            return C1329b0.m11685f(this.f9778c, obj);
        }

        /* renamed from: d */
        public Collection<V> remove(Object obj) {
            Collection collection = (Collection) this.f9778c.remove(obj);
            if (collection == null) {
                return null;
            }
            Collection<V> o = AbstractMapBasedMultimap.this.mo8163o();
            o.addAll(collection);
            AbstractMapBasedMultimap dVar = AbstractMapBasedMultimap.this;
            dVar.f9776e = dVar.f9776e - collection.size();
            collection.clear();
            return o;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public Entry<K, Collection<V>> mo8173e(Entry<K, Collection<V>> entry) {
            Object key = entry.getKey();
            return C1329b0.m11682c(key, AbstractMapBasedMultimap.this.mo8157v(key, (Collection) entry.getValue()));
        }

        public boolean equals(@NullableDecl Object obj) {
            return this == obj || this.f9778c.equals(obj);
        }

        public int hashCode() {
            return this.f9778c.hashCode();
        }

        public Set<K> keySet() {
            return AbstractMapBasedMultimap.this.mo8309f();
        }

        public int size() {
            return this.f9778c.size();
        }

        public String toString() {
            return this.f9778c.toString();
        }
    }

    /* renamed from: c.a.b.b.d$c */
    /* compiled from: AbstractMapBasedMultimap */
    private abstract class C1342c<T> implements Iterator<T> {

        /* renamed from: a */
        final Iterator<Entry<K, Collection<V>>> f9784a;
        @NullableDecl

        /* renamed from: b */
        K f9785b = null;
        @MonotonicNonNullDecl

        /* renamed from: c */
        Collection<V> f9786c = null;

        /* renamed from: d */
        Iterator<V> f9787d = Iterators.m12017f();

        C1342c() {
            this.f9784a = AbstractMapBasedMultimap.this.f9775d.entrySet().iterator();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract T mo8168a(K k, V v);

        public boolean hasNext() {
            return this.f9784a.hasNext() || this.f9787d.hasNext();
        }

        public T next() {
            if (!this.f9787d.hasNext()) {
                Entry entry = (Entry) this.f9784a.next();
                this.f9785b = entry.getKey();
                Collection<V> collection = (Collection) entry.getValue();
                this.f9786c = collection;
                this.f9787d = collection.iterator();
            }
            return mo8168a(this.f9785b, this.f9787d.next());
        }

        public void remove() {
            this.f9787d.remove();
            if (this.f9786c.isEmpty()) {
                this.f9784a.remove();
            }
            AbstractMapBasedMultimap.this.f9776e = AbstractMapBasedMultimap.this.f9776e - 1;
        }
    }

    /* renamed from: c.a.b.b.d$d */
    /* compiled from: AbstractMapBasedMultimap */
    private class C1343d extends C1335d<K, Collection<V>> {

        /* renamed from: c.a.b.b.d$d$a */
        /* compiled from: AbstractMapBasedMultimap */
        class C1344a implements Iterator<K> {
            @NullableDecl

            /* renamed from: a */
            Entry<K, Collection<V>> f9790a;

            /* renamed from: b */
            final /* synthetic */ Iterator f9791b;

            C1344a(Iterator it) {
                this.f9791b = it;
            }

            public boolean hasNext() {
                return this.f9791b.hasNext();
            }

            public K next() {
                Entry<K, Collection<V>> entry = (Entry) this.f9791b.next();
                this.f9790a = entry;
                return entry.getKey();
            }

            public void remove() {
                CollectPreconditions.m11787c(this.f9790a != null);
                Collection collection = (Collection) this.f9790a.getValue();
                this.f9791b.remove();
                AbstractMapBasedMultimap dVar = AbstractMapBasedMultimap.this;
                dVar.f9776e = dVar.f9776e - collection.size();
                collection.clear();
                this.f9790a = null;
            }
        }

        C1343d(Map<K, Collection<V>> map) {
            super(map);
        }

        public void clear() {
            Iterators.m12013b(iterator());
        }

        public boolean containsAll(Collection<?> collection) {
            return mo8136b().keySet().containsAll(collection);
        }

        public boolean equals(@NullableDecl Object obj) {
            return this == obj || mo8136b().keySet().equals(obj);
        }

        public int hashCode() {
            return mo8136b().keySet().hashCode();
        }

        public Iterator<K> iterator() {
            return new C1344a(mo8136b().entrySet().iterator());
        }

        public boolean remove(Object obj) {
            int i;
            Collection collection = (Collection) mo8136b().remove(obj);
            if (collection != null) {
                i = collection.size();
                collection.clear();
                AbstractMapBasedMultimap dVar = AbstractMapBasedMultimap.this;
                dVar.f9776e = dVar.f9776e - i;
            } else {
                i = 0;
            }
            if (i > 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: c.a.b.b.d$e */
    /* compiled from: AbstractMapBasedMultimap */
    class C1345e extends C1348h implements NavigableMap<K, Collection<V>> {
        C1345e(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        public Entry<K, Collection<V>> ceilingEntry(K k) {
            Entry ceilingEntry = mo8208h().ceilingEntry(k);
            if (ceilingEntry == null) {
                return null;
            }
            return mo8173e(ceilingEntry);
        }

        public K ceilingKey(K k) {
            return mo8208h().ceilingKey(k);
        }

        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        public NavigableMap<K, Collection<V>> descendingMap() {
            return new C1345e(mo8208h().descendingMap());
        }

        public Entry<K, Collection<V>> firstEntry() {
            Entry firstEntry = mo8208h().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return mo8173e(firstEntry);
        }

        public Entry<K, Collection<V>> floorEntry(K k) {
            Entry floorEntry = mo8208h().floorEntry(k);
            if (floorEntry == null) {
                return null;
            }
            return mo8173e(floorEntry);
        }

        public K floorKey(K k) {
            return mo8208h().floorKey(k);
        }

        public Entry<K, Collection<V>> higherEntry(K k) {
            Entry higherEntry = mo8208h().higherEntry(k);
            if (higherEntry == null) {
                return null;
            }
            return mo8173e(higherEntry);
        }

        public K higherKey(K k) {
            return mo8208h().higherKey(k);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public NavigableSet<K> mo8203f() {
            return new C1346f(mo8208h());
        }

        /* renamed from: j */
        public NavigableMap<K, Collection<V>> headMap(K k) {
            return headMap(k, false);
        }

        /* renamed from: k */
        public NavigableSet<K> keySet() {
            return (NavigableSet) super.keySet();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: l */
        public Entry<K, Collection<V>> mo8216l(Iterator<Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Entry entry = (Entry) it.next();
            Collection o = AbstractMapBasedMultimap.this.mo8163o();
            o.addAll((Collection) entry.getValue());
            it.remove();
            return C1329b0.m11682c(entry.getKey(), AbstractMapBasedMultimap.this.mo8156u(o));
        }

        public Entry<K, Collection<V>> lastEntry() {
            Entry lastEntry = mo8208h().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return mo8173e(lastEntry);
        }

        public Entry<K, Collection<V>> lowerEntry(K k) {
            Entry lowerEntry = mo8208h().lowerEntry(k);
            if (lowerEntry == null) {
                return null;
            }
            return mo8173e(lowerEntry);
        }

        public K lowerKey(K k) {
            return mo8208h().lowerKey(k);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: m */
        public NavigableMap<K, Collection<V>> mo8208h() {
            return (NavigableMap) super.mo8208h();
        }

        /* renamed from: n */
        public NavigableMap<K, Collection<V>> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        public NavigableSet<K> navigableKeySet() {
            return keySet();
        }

        /* renamed from: o */
        public NavigableMap<K, Collection<V>> tailMap(K k) {
            return tailMap(k, true);
        }

        public Entry<K, Collection<V>> pollFirstEntry() {
            return mo8216l(entrySet().iterator());
        }

        public Entry<K, Collection<V>> pollLastEntry() {
            return mo8216l(descendingMap().entrySet().iterator());
        }

        public NavigableMap<K, Collection<V>> headMap(K k, boolean z) {
            return new C1345e(mo8208h().headMap(k, z));
        }

        public NavigableMap<K, Collection<V>> subMap(K k, boolean z, K k2, boolean z2) {
            return new C1345e(mo8208h().subMap(k, z, k2, z2));
        }

        public NavigableMap<K, Collection<V>> tailMap(K k, boolean z) {
            return new C1345e(mo8208h().tailMap(k, z));
        }
    }

    /* renamed from: c.a.b.b.d$f */
    /* compiled from: AbstractMapBasedMultimap */
    class C1346f extends C1349i implements NavigableSet<K> {
        C1346f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        public K ceiling(K k) {
            return mo8230c().ceilingKey(k);
        }

        /* renamed from: d */
        public NavigableSet<K> headSet(K k) {
            return headSet(k, false);
        }

        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        public NavigableSet<K> descendingSet() {
            return new C1346f(mo8230c().descendingMap());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public NavigableMap<K, Collection<V>> mo8230c() {
            return (NavigableMap) super.mo8230c();
        }

        /* renamed from: f */
        public NavigableSet<K> subSet(K k, K k2) {
            return subSet(k, true, k2, false);
        }

        public K floor(K k) {
            return mo8230c().floorKey(k);
        }

        /* renamed from: g */
        public NavigableSet<K> tailSet(K k) {
            return tailSet(k, true);
        }

        public K higher(K k) {
            return mo8230c().higherKey(k);
        }

        public K lower(K k) {
            return mo8230c().lowerKey(k);
        }

        public K pollFirst() {
            return Iterators.m12020i(iterator());
        }

        public K pollLast() {
            return Iterators.m12020i(descendingIterator());
        }

        public NavigableSet<K> headSet(K k, boolean z) {
            return new C1346f(mo8230c().headMap(k, z));
        }

        public NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
            return new C1346f(mo8230c().subMap(k, z, k2, z2));
        }

        public NavigableSet<K> tailSet(K k, boolean z) {
            return new C1346f(mo8230c().tailMap(k, z));
        }
    }

    /* renamed from: c.a.b.b.d$g */
    /* compiled from: AbstractMapBasedMultimap */
    private class C1347g extends C1352k implements RandomAccess {
        C1347g(@NullableDecl K k, List<V> list, @NullableDecl C1350j jVar) {
            super(k, list, jVar);
        }
    }

    /* renamed from: c.a.b.b.d$h */
    /* compiled from: AbstractMapBasedMultimap */
    private class C1348h extends C1339b implements SortedMap<K, Collection<V>> {
        @MonotonicNonNullDecl

        /* renamed from: e */
        SortedSet<K> f9796e;

        C1348h(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public Comparator<? super K> comparator() {
            return mo8208h().comparator();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public SortedSet<K> mo8203f() {
            return new C1349i(mo8208h());
        }

        public K firstKey() {
            return mo8208h().firstKey();
        }

        /* renamed from: g */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f9796e;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> f = mo8203f();
            this.f9796e = f;
            return f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public SortedMap<K, Collection<V>> mo8208h() {
            return (SortedMap) this.f9778c;
        }

        public SortedMap<K, Collection<V>> headMap(K k) {
            return new C1348h(mo8208h().headMap(k));
        }

        public K lastKey() {
            return mo8208h().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k, K k2) {
            return new C1348h(mo8208h().subMap(k, k2));
        }

        public SortedMap<K, Collection<V>> tailMap(K k) {
            return new C1348h(mo8208h().tailMap(k));
        }
    }

    /* renamed from: c.a.b.b.d$i */
    /* compiled from: AbstractMapBasedMultimap */
    private class C1349i extends C1343d implements SortedSet<K> {
        C1349i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public SortedMap<K, Collection<V>> mo8230c() {
            return (SortedMap) super.mo8136b();
        }

        public Comparator<? super K> comparator() {
            return mo8230c().comparator();
        }

        public K first() {
            return mo8230c().firstKey();
        }

        public SortedSet<K> headSet(K k) {
            return new C1349i(mo8230c().headMap(k));
        }

        public K last() {
            return mo8230c().lastKey();
        }

        public SortedSet<K> subSet(K k, K k2) {
            return new C1349i(mo8230c().subMap(k, k2));
        }

        public SortedSet<K> tailSet(K k) {
            return new C1349i(mo8230c().tailMap(k));
        }
    }

    /* renamed from: c.a.b.b.d$j */
    /* compiled from: AbstractMapBasedMultimap */
    class C1350j extends AbstractCollection<V> {
        @NullableDecl

        /* renamed from: a */
        final K f9799a;

        /* renamed from: b */
        Collection<V> f9800b;
        @NullableDecl

        /* renamed from: c */
        final C1350j f9801c;
        @NullableDecl

        /* renamed from: d */
        final Collection<V> f9802d;

        /* renamed from: c.a.b.b.d$j$a */
        /* compiled from: AbstractMapBasedMultimap */
        class C1351a implements Iterator<V> {

            /* renamed from: a */
            final Iterator<V> f9804a;

            /* renamed from: b */
            final Collection<V> f9805b;

            C1351a() {
                Collection<V> collection = C1350j.this.f9800b;
                this.f9805b = collection;
                this.f9804a = AbstractMapBasedMultimap.m11711s(collection);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public Iterator<V> mo8274a() {
                mo8275b();
                return this.f9804a;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public void mo8275b() {
                C1350j.this.mo8265f();
                if (C1350j.this.f9800b != this.f9805b) {
                    throw new ConcurrentModificationException();
                }
            }

            public boolean hasNext() {
                mo8275b();
                return this.f9804a.hasNext();
            }

            public V next() {
                mo8275b();
                return this.f9804a.next();
            }

            public void remove() {
                this.f9804a.remove();
                AbstractMapBasedMultimap.this.f9776e = AbstractMapBasedMultimap.this.f9776e - 1;
                C1350j.this.mo8266g();
            }

            C1351a(Iterator<V> it) {
                this.f9805b = C1350j.this.f9800b;
                this.f9804a = it;
            }
        }

        C1350j(@NullableDecl K k, Collection<V> collection, @NullableDecl C1350j jVar) {
            Collection<V> collection2;
            this.f9799a = k;
            this.f9800b = collection;
            this.f9801c = jVar;
            if (jVar == null) {
                collection2 = null;
            } else {
                collection2 = jVar.mo8262d();
            }
            this.f9802d = collection2;
        }

        public boolean add(V v) {
            mo8265f();
            boolean isEmpty = this.f9800b.isEmpty();
            boolean add = this.f9800b.add(v);
            if (add) {
                AbstractMapBasedMultimap.this.f9776e = AbstractMapBasedMultimap.this.f9776e + 1;
                if (isEmpty) {
                    mo8257b();
                }
            }
            return add;
        }

        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f9800b.addAll(collection);
            if (addAll) {
                int size2 = this.f9800b.size();
                AbstractMapBasedMultimap dVar = AbstractMapBasedMultimap.this;
                dVar.f9776e = dVar.f9776e + (size2 - size);
                if (size == 0) {
                    mo8257b();
                }
            }
            return addAll;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo8257b() {
            C1350j jVar = this.f9801c;
            if (jVar != null) {
                jVar.mo8257b();
            } else {
                AbstractMapBasedMultimap.this.f9775d.put(this.f9799a, this.f9800b);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public C1350j mo8258c() {
            return this.f9801c;
        }

        public void clear() {
            int size = size();
            if (size != 0) {
                this.f9800b.clear();
                AbstractMapBasedMultimap dVar = AbstractMapBasedMultimap.this;
                dVar.f9776e = dVar.f9776e - size;
                mo8266g();
            }
        }

        public boolean contains(Object obj) {
            mo8265f();
            return this.f9800b.contains(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            mo8265f();
            return this.f9800b.containsAll(collection);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public Collection<V> mo8262d() {
            return this.f9800b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public K mo8263e() {
            return this.f9799a;
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            mo8265f();
            return this.f9800b.equals(obj);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo8265f() {
            C1350j jVar = this.f9801c;
            if (jVar != null) {
                jVar.mo8265f();
                if (this.f9801c.mo8262d() != this.f9802d) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.f9800b.isEmpty()) {
                Collection<V> collection = (Collection) AbstractMapBasedMultimap.this.f9775d.get(this.f9799a);
                if (collection != null) {
                    this.f9800b = collection;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo8266g() {
            C1350j jVar = this.f9801c;
            if (jVar != null) {
                jVar.mo8266g();
            } else if (this.f9800b.isEmpty()) {
                AbstractMapBasedMultimap.this.f9775d.remove(this.f9799a);
            }
        }

        public int hashCode() {
            mo8265f();
            return this.f9800b.hashCode();
        }

        public Iterator<V> iterator() {
            mo8265f();
            return new C1351a();
        }

        public boolean remove(Object obj) {
            mo8265f();
            boolean remove = this.f9800b.remove(obj);
            if (remove) {
                AbstractMapBasedMultimap.this.f9776e = AbstractMapBasedMultimap.this.f9776e - 1;
                mo8266g();
            }
            return remove;
        }

        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f9800b.removeAll(collection);
            if (removeAll) {
                int size2 = this.f9800b.size();
                AbstractMapBasedMultimap dVar = AbstractMapBasedMultimap.this;
                dVar.f9776e = dVar.f9776e + (size2 - size);
                mo8266g();
            }
            return removeAll;
        }

        public boolean retainAll(Collection<?> collection) {
            C1320g.m11650i(collection);
            int size = size();
            boolean retainAll = this.f9800b.retainAll(collection);
            if (retainAll) {
                int size2 = this.f9800b.size();
                AbstractMapBasedMultimap dVar = AbstractMapBasedMultimap.this;
                dVar.f9776e = dVar.f9776e + (size2 - size);
                mo8266g();
            }
            return retainAll;
        }

        public int size() {
            mo8265f();
            return this.f9800b.size();
        }

        public String toString() {
            mo8265f();
            return this.f9800b.toString();
        }
    }

    /* renamed from: c.a.b.b.d$k */
    /* compiled from: AbstractMapBasedMultimap */
    class C1352k extends C1350j implements List<V> {

        /* renamed from: c.a.b.b.d$k$a */
        /* compiled from: AbstractMapBasedMultimap */
        private class C1353a extends a implements ListIterator<V> {
            C1353a() {
                super();
            }

            /* JADX WARNING: type inference failed for: r1v0, types: [c.a.b.b.d$k$a, c.a.b.b.d$j$a] */
            /* renamed from: c */
            private ListIterator<V> m11758c() {
                return (ListIterator) mo8274a();
            }

            public void add(V v) {
                boolean isEmpty = C1352k.this.isEmpty();
                m11758c().add(v);
                AbstractMapBasedMultimap.this.f9776e = AbstractMapBasedMultimap.this.f9776e + 1;
                if (isEmpty) {
                    C1352k.this.mo8257b();
                }
            }

            public boolean hasPrevious() {
                return m11758c().hasPrevious();
            }

            public int nextIndex() {
                return m11758c().nextIndex();
            }

            public V previous() {
                return m11758c().previous();
            }

            public int previousIndex() {
                return m11758c().previousIndex();
            }

            public void set(V v) {
                m11758c().set(v);
            }

            public C1353a(int i) {
                super(C1352k.this.mo8282h().listIterator(i));
            }
        }

        C1352k(@NullableDecl K k, List<V> list, @NullableDecl C1350j jVar) {
            super(k, list, jVar);
        }

        public void add(int i, V v) {
            mo8265f();
            boolean isEmpty = mo8262d().isEmpty();
            mo8282h().add(i, v);
            AbstractMapBasedMultimap.this.f9776e = AbstractMapBasedMultimap.this.f9776e + 1;
            if (isEmpty) {
                mo8257b();
            }
        }

        public boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = mo8282h().addAll(i, collection);
            if (addAll) {
                int size2 = mo8262d().size();
                AbstractMapBasedMultimap dVar = AbstractMapBasedMultimap.this;
                dVar.f9776e = dVar.f9776e + (size2 - size);
                if (size == 0) {
                    mo8257b();
                }
            }
            return addAll;
        }

        public V get(int i) {
            mo8265f();
            return mo8282h().get(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public List<V> mo8282h() {
            return (List) mo8262d();
        }

        public int indexOf(Object obj) {
            mo8265f();
            return mo8282h().indexOf(obj);
        }

        public int lastIndexOf(Object obj) {
            mo8265f();
            return mo8282h().lastIndexOf(obj);
        }

        public ListIterator<V> listIterator() {
            mo8265f();
            return new C1353a();
        }

        public V remove(int i) {
            mo8265f();
            V remove = mo8282h().remove(i);
            AbstractMapBasedMultimap.this.f9776e = AbstractMapBasedMultimap.this.f9776e - 1;
            mo8266g();
            return remove;
        }

        public V set(int i, V v) {
            mo8265f();
            return mo8282h().set(i, v);
        }

        public List<V> subList(int i, int i2) {
            mo8265f();
            return AbstractMapBasedMultimap.this.mo8167w(mo8263e(), mo8282h().subList(i, i2), mo8258c() == null ? this : mo8258c());
        }

        public ListIterator<V> listIterator(int i) {
            mo8265f();
            return new C1353a(i);
        }
    }

    protected AbstractMapBasedMultimap(Map<K, Collection<V>> map) {
        C1320g.m11645d(map.isEmpty());
        this.f9775d = map;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static <E> Iterator<E> m11711s(Collection<E> collection) {
        if (collection instanceof List) {
            return ((List) collection).listIterator();
        }
        return collection.iterator();
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m11712t(Object obj) {
        Collection collection = (Collection) C1329b0.m11687h(this.f9775d, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f9776e -= size;
        }
    }

    public void clear() {
        for (Collection clear : this.f9775d.values()) {
            clear.clear();
        }
        this.f9775d.clear();
        this.f9776e = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public Collection<V> mo8161e() {
        return new C1360a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public Iterator<V> mo8162g() {
        return new C1338a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public abstract Collection<V> mo8163o();

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public Collection<V> mo8164p(@NullableDecl K k) {
        return mo8163o();
    }

    public boolean put(@NullableDecl K k, @NullableDecl V v) {
        Collection collection = (Collection) this.f9775d.get(k);
        if (collection == null) {
            Collection p = mo8164p(k);
            if (p.add(v)) {
                this.f9776e++;
                this.f9775d.put(k, p);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(v)) {
            return false;
        } else {
            this.f9776e++;
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public final Map<K, Collection<V>> mo8165q() {
        Map<K, Collection<V>> map = this.f9775d;
        if (map instanceof NavigableMap) {
            return new C1345e((NavigableMap) this.f9775d);
        }
        if (map instanceof SortedMap) {
            return new C1348h((SortedMap) this.f9775d);
        }
        return new C1339b(this.f9775d);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public final Set<K> mo8166r() {
        Map<K, Collection<V>> map = this.f9775d;
        if (map instanceof NavigableMap) {
            return new C1346f((NavigableMap) this.f9775d);
        }
        if (map instanceof SortedMap) {
            return new C1349i((SortedMap) this.f9775d);
        }
        return new C1343d(this.f9775d);
    }

    public int size() {
        return this.f9776e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public abstract <E> Collection<E> mo8156u(Collection<E> collection);

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public abstract Collection<V> mo8157v(@NullableDecl K k, Collection<V> collection);

    public Collection<V> values() {
        return super.values();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public final List<V> mo8167w(@NullableDecl K k, List<V> list, @NullableDecl C1350j jVar) {
        return list instanceof RandomAccess ? new C1347g(k, list, jVar) : new C1352k(k, list, jVar);
    }
}
