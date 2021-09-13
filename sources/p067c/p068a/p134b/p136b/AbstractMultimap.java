package p067c.p068a.p134b.p136b;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: c.a.b.b.f */
abstract class AbstractMultimap<K, V> implements Multimap<K, V> {
    @MonotonicNonNullDecl

    /* renamed from: a */
    private transient Set<K> f9813a;
    @MonotonicNonNullDecl

    /* renamed from: b */
    private transient Collection<V> f9814b;
    @MonotonicNonNullDecl

    /* renamed from: c */
    private transient Map<K, Collection<V>> f9815c;

    /* renamed from: c.a.b.b.f$a */
    /* compiled from: AbstractMultimap */
    class C1360a extends AbstractCollection<V> {
        C1360a() {
        }

        public void clear() {
            AbstractMultimap.this.clear();
        }

        public boolean contains(@NullableDecl Object obj) {
            return AbstractMultimap.this.mo8306b(obj);
        }

        public Iterator<V> iterator() {
            return AbstractMultimap.this.mo8162g();
        }

        public int size() {
            return AbstractMultimap.this.size();
        }
    }

    AbstractMultimap() {
    }

    /* renamed from: a */
    public Map<K, Collection<V>> mo8153a() {
        Map<K, Collection<V>> map = this.f9815c;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> c = mo8307c();
        this.f9815c = c;
        return c;
    }

    /* renamed from: b */
    public boolean mo8306b(@NullableDecl Object obj) {
        for (Collection contains : mo8153a().values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract Map<K, Collection<V>> mo8307c();

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public abstract Set<K> mo8308d();

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public abstract Collection<V> mo8161e();

    public boolean equals(@NullableDecl Object obj) {
        return Multimaps.m11776a(this, obj);
    }

    /* renamed from: f */
    public Set<K> mo8309f() {
        Set<K> set = this.f9813a;
        if (set != null) {
            return set;
        }
        Set<K> d = mo8308d();
        this.f9813a = d;
        return d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public abstract Iterator<V> mo8162g();

    public int hashCode() {
        return mo8153a().hashCode();
    }

    public String toString() {
        return mo8153a().toString();
    }

    public Collection<V> values() {
        Collection<V> collection = this.f9814b;
        if (collection != null) {
            return collection;
        }
        Collection<V> e = mo8161e();
        this.f9814b = e;
        return e;
    }
}
