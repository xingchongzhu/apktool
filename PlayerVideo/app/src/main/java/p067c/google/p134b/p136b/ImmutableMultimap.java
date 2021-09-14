package p067c.google.p134b.p136b;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.Weak;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: c.a.b.b.u */
public abstract class ImmutableMultimap<K, V> extends BaseImmutableMultimap<K, V> implements Serializable {

    /* renamed from: d */
    final transient ImmutableMap<K, ? extends ImmutableCollection<V>> f9902d;

    /* renamed from: e */
    final transient int f9903e;

    /* renamed from: c.a.b.b.u$a */
    /* compiled from: ImmutableMultimap */
    class C1388a extends UnmodifiableIterator<V> {

        /* renamed from: a */
        Iterator<? extends ImmutableCollection<V>> f9904a;

        /* renamed from: b */
        Iterator<V> f9905b = Iterators.m12015d();

        C1388a() {
            this.f9904a = ImmutableMultimap.this.f9902d.values().iterator();
        }

        public boolean hasNext() {
            return this.f9905b.hasNext() || this.f9904a.hasNext();
        }

        public V next() {
            if (!this.f9905b.hasNext()) {
                this.f9905b = ((ImmutableCollection) this.f9904a.next()).iterator();
            }
            return this.f9905b.next();
        }
    }

    /* renamed from: c.a.b.b.u$b */
    /* compiled from: ImmutableMultimap */
    public static class C1389b<K, V> {

        /* renamed from: a */
        Map<K, Collection<V>> f9907a = Platform.m11838c();
        @MonotonicNonNullDecl

        /* renamed from: b */
        Comparator<? super K> f9908b;
        @MonotonicNonNullDecl

        /* renamed from: c */
        Comparator<? super V> f9909c;

        /* renamed from: a */
        public ImmutableMultimap<K, V> mo8494a() {
            Collection entrySet = this.f9907a.entrySet();
            Comparator<? super K> comparator = this.f9908b;
            if (comparator != null) {
                entrySet = Ordering.m11794a(comparator).mo8326d().mo8325b(entrySet);
            }
            return ImmutableListMultimap.m11948m(entrySet, this.f9909c);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public Collection<V> mo8495b() {
            return new ArrayList();
        }

        @CanIgnoreReturnValue
        /* renamed from: c */
        public C1389b<K, V> mo8457c(K k, Iterable<? extends V> iterable) {
            if (k != null) {
                Collection collection = (Collection) this.f9907a.get(k);
                if (collection != null) {
                    for (Object next : iterable) {
                        CollectPreconditions.m11785a(k, next);
                        collection.add(next);
                    }
                    return this;
                }
                Iterator it = iterable.iterator();
                if (!it.hasNext()) {
                    return this;
                }
                Collection b = mo8495b();
                while (it.hasNext()) {
                    Object next2 = it.next();
                    CollectPreconditions.m11785a(k, next2);
                    b.add(next2);
                }
                this.f9907a.put(k, b);
                return this;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("null key in entry: null=");
            sb.append(Iterables.m12011f(iterable));
            throw new NullPointerException(sb.toString());
        }

        @CanIgnoreReturnValue
        /* renamed from: d */
        public C1389b<K, V> mo8496d(K k, V... vArr) {
            return mo8457c(k, Arrays.asList(vArr));
        }
    }

    /* renamed from: c.a.b.b.u$c */
    /* compiled from: ImmutableMultimap */
    private static final class C1390c<K, V> extends ImmutableCollection<V> {
        @Weak

        /* renamed from: b */
        private final transient ImmutableMultimap<K, V> f9910b;

        C1390c(ImmutableMultimap<K, V> uVar) {
            this.f9910b = uVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public int mo8375c(Object[] objArr, int i) {
            UnmodifiableIterator h = this.f9910b.f9902d.values().iterator();
            while (h.hasNext()) {
                i = ((ImmutableCollection) h.next()).mo8375c(objArr, i);
            }
            return i;
        }

        public boolean contains(@NullableDecl Object obj) {
            return this.f9910b.mo8306b(obj);
        }

        /* renamed from: h */
        public UnmodifiableIterator<V> iterator() {
            return this.f9910b.mo8162g();
        }

        public int size() {
            return this.f9910b.size();
        }
    }

    ImmutableMultimap(ImmutableMap<K, ? extends ImmutableCollection<V>> tVar, int i) {
        this.f9902d = tVar;
        this.f9903e = i;
    }

    /* renamed from: b */
    public boolean mo8306b(@NullableDecl Object obj) {
        return obj != null && super.mo8306b(obj);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Map<K, Collection<V>> mo8307c() {
        throw new AssertionError("should never be called");
    }

    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public Set<K> mo8308d() {
        throw new AssertionError("unreachable");
    }

    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    /* renamed from: h */
    public ImmutableMap<K, Collection<V>> mo8153a() {
        return this.f9902d;
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public ImmutableCollection<V> mo8161e() {
        return new C1390c(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public UnmodifiableIterator<V> mo8162g() {
        return new C1388a();
    }

    /* renamed from: k */
    public ImmutableCollection<V> values() {
        return (ImmutableCollection) super.values();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public boolean put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    public int size() {
        return this.f9903e;
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
