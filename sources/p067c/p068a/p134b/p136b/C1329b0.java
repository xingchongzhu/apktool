package p067c.p068a.p134b.p136b;

import com.google.j2objc.annotations.Weak;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p067c.p068a.p134b.p135a.C1319e;
import p067c.p068a.p134b.p135a.C1320g;
import p067c.p068a.p134b.p135a.Objects;

/* renamed from: c.a.b.b.b0 */
/* compiled from: Maps */
public final class C1329b0 {

    /* renamed from: c.a.b.b.b0$a */
    /* compiled from: Maps */
    static class C1330a extends TransformedIterator<Entry<K, V>, V> {
        C1330a(Iterator it) {
            super(it);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public V mo8125a(Entry<K, V> entry) {
            return entry.getValue();
        }
    }

    /* renamed from: c.a.b.b.b0$b */
    /* compiled from: Maps */
    private enum C1331b implements C1319e<Entry<?, ?>, Object> {
        KEY {
            @NullableDecl
            /* renamed from: a */
            public Object apply(Entry<?, ?> entry) {
                return entry.getKey();
            }
        },
        VALUE {
            @NullableDecl
            /* renamed from: a */
            public Object apply(Entry<?, ?> entry) {
                return entry.getValue();
            }
        };
    }

    /* renamed from: c.a.b.b.b0$c */
    /* compiled from: Maps */
    static abstract class C1334c<K, V> extends C1384b<Entry<K, V>> {
        C1334c() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract Map<K, V> mo8129b();

        public void clear() {
            mo8129b().clear();
        }

        public abstract boolean contains(Object obj);

        public boolean isEmpty() {
            return mo8129b().isEmpty();
        }

        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) C1320g.m11650i(collection));
            } catch (UnsupportedOperationException unused) {
                return C1381r0.m11944h(this, collection.iterator());
            }
        }

        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) C1320g.m11650i(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet e = C1381r0.m11941e(collection.size());
                for (Object next : collection) {
                    if (contains(next)) {
                        e.add(((Entry) next).getKey());
                    }
                }
                return mo8129b().keySet().retainAll(e);
            }
        }

        public int size() {
            return mo8129b().size();
        }
    }

    /* renamed from: c.a.b.b.b0$d */
    /* compiled from: Maps */
    static class C1335d<K, V> extends C1384b<K> {
        @Weak

        /* renamed from: a */
        final Map<K, V> f9771a;

        C1335d(Map<K, V> map) {
            this.f9771a = (Map) C1320g.m11650i(map);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public Map<K, V> mo8136b() {
            return this.f9771a;
        }

        public boolean contains(Object obj) {
            return mo8136b().containsKey(obj);
        }

        public boolean isEmpty() {
            return mo8136b().isEmpty();
        }

        public int size() {
            return mo8136b().size();
        }
    }

    /* renamed from: c.a.b.b.b0$e */
    /* compiled from: Maps */
    static class C1336e<K, V> extends AbstractCollection<V> {
        @Weak

        /* renamed from: a */
        final Map<K, V> f9772a;

        C1336e(Map<K, V> map) {
            this.f9772a = (Map) C1320g.m11650i(map);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final Map<K, V> mo8140b() {
            return this.f9772a;
        }

        public void clear() {
            mo8140b().clear();
        }

        public boolean contains(@NullableDecl Object obj) {
            return mo8140b().containsValue(obj);
        }

        public boolean isEmpty() {
            return mo8140b().isEmpty();
        }

        public Iterator<V> iterator() {
            return C1329b0.m11690k(mo8140b().entrySet().iterator());
        }

        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Entry entry : mo8140b().entrySet()) {
                    if (Objects.m11640a(obj, entry.getValue())) {
                        mo8140b().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) C1320g.m11650i(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet d = C1381r0.m11940d();
                for (Entry entry : mo8140b().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        d.add(entry.getKey());
                    }
                }
                return mo8140b().keySet().removeAll(d);
            }
        }

        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) C1320g.m11650i(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet d = C1381r0.m11940d();
                for (Entry entry : mo8140b().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        d.add(entry.getKey());
                    }
                }
                return mo8140b().keySet().retainAll(d);
            }
        }

        public int size() {
            return mo8140b().size();
        }
    }

    /* renamed from: c.a.b.b.b0$f */
    /* compiled from: Maps */
    static abstract class C1337f<K, V> extends AbstractMap<K, V> {
        @MonotonicNonNullDecl

        /* renamed from: a */
        private transient Set<Entry<K, V>> f9773a;
        @MonotonicNonNullDecl

        /* renamed from: b */
        private transient Collection<V> f9774b;

        C1337f() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract Set<Entry<K, V>> mo8149a();

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public Collection<V> mo8150b() {
            return new C1336e(this);
        }

        public Set<Entry<K, V>> entrySet() {
            Set<Entry<K, V>> set = this.f9773a;
            if (set != null) {
                return set;
            }
            Set<Entry<K, V>> a = mo8149a();
            this.f9773a = a;
            return a;
        }

        public Collection<V> values() {
            Collection<V> collection = this.f9774b;
            if (collection != null) {
                return collection;
            }
            Collection<V> b = mo8150b();
            this.f9774b = b;
            return b;
        }
    }

    /* renamed from: a */
    static int m11680a(int i) {
        if (i < 3) {
            CollectPreconditions.m11786b(i, "expectedSize");
            return i + 1;
        } else if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    /* renamed from: b */
    static boolean m11681b(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return map.entrySet().equals(((Map) obj).entrySet());
    }

    /* renamed from: c */
    public static <K, V> Entry<K, V> m11682c(@NullableDecl K k, @NullableDecl V v) {
        return new ImmutableEntry(k, v);
    }

    /* renamed from: d */
    static <K> C1319e<Entry<K, ?>, K> m11683d() {
        return C1331b.KEY;
    }

    /* renamed from: e */
    public static <K, V> IdentityHashMap<K, V> m11684e() {
        return new IdentityHashMap<>();
    }

    /* renamed from: f */
    static boolean m11685f(Map<?, ?> map, Object obj) {
        C1320g.m11650i(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: g */
    static <V> V m11686g(Map<?, V> map, @NullableDecl Object obj) {
        C1320g.m11650i(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: h */
    static <V> V m11687h(Map<?, V> map, Object obj) {
        C1320g.m11650i(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: i */
    static String m11688i(Map<?, ?> map) {
        StringBuilder a = Collections2.m11792a(map.size());
        a.append('{');
        boolean z = true;
        for (Entry entry : map.entrySet()) {
            if (!z) {
                a.append(", ");
            }
            z = false;
            a.append(entry.getKey());
            a.append('=');
            a.append(entry.getValue());
        }
        a.append('}');
        return a.toString();
    }

    /* renamed from: j */
    static <V> C1319e<Entry<?, V>, V> m11689j() {
        return C1331b.VALUE;
    }

    /* renamed from: k */
    static <K, V> Iterator<V> m11690k(Iterator<Entry<K, V>> it) {
        return new C1330a(it);
    }
}
