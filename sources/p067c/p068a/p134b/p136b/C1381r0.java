package p067c.p068a.p134b.p136b;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p067c.p068a.p134b.p135a.C1320g;

/* renamed from: c.a.b.b.r0 */
/* compiled from: Sets */
public final class C1381r0 {

    /* renamed from: c.a.b.b.r0$a */
    /* compiled from: Sets */
    static class C1382a extends C1385c<E> {

        /* renamed from: a */
        final /* synthetic */ Set f9887a;

        /* renamed from: b */
        final /* synthetic */ Set f9888b;

        /* renamed from: c.a.b.b.r0$a$a */
        /* compiled from: Sets */
        class C1383a extends C1326b<E> {

            /* renamed from: c */
            final Iterator<E> f9889c;

            C1383a() {
                this.f9889c = C1382a.this.f9887a.iterator();
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public E mo8121a() {
                while (this.f9889c.hasNext()) {
                    E next = this.f9889c.next();
                    if (C1382a.this.f9888b.contains(next)) {
                        return next;
                    }
                }
                return mo8122b();
            }
        }

        C1382a(Set set, Set set2) {
            this.f9887a = set;
            this.f9888b = set2;
            super(null);
        }

        /* renamed from: b */
        public UnmodifiableIterator<E> iterator() {
            return new C1383a();
        }

        public boolean contains(Object obj) {
            return this.f9887a.contains(obj) && this.f9888b.contains(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            return this.f9887a.containsAll(collection) && this.f9888b.containsAll(collection);
        }

        public boolean isEmpty() {
            return Collections.disjoint(this.f9888b, this.f9887a);
        }

        public int size() {
            int i = 0;
            for (Object contains : this.f9887a) {
                if (this.f9888b.contains(contains)) {
                    i++;
                }
            }
            return i;
        }
    }

    /* renamed from: c.a.b.b.r0$b */
    /* compiled from: Sets */
    static abstract class C1384b<E> extends AbstractSet<E> {
        C1384b() {
        }

        public boolean removeAll(Collection<?> collection) {
            return C1381r0.m11943g(this, collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) C1320g.m11650i(collection));
        }
    }

    /* renamed from: c.a.b.b.r0$c */
    /* compiled from: Sets */
    public static abstract class C1385c<E> extends AbstractSet<E> {
        /* synthetic */ C1385c(Sets q0Var) {
            this();
        }

        @CanIgnoreReturnValue
        @Deprecated
        public final boolean add(E e) {
            throw new UnsupportedOperationException();
        }

        @CanIgnoreReturnValue
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @CanIgnoreReturnValue
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @CanIgnoreReturnValue
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @CanIgnoreReturnValue
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        private C1385c() {
        }
    }

    /* renamed from: a */
    static boolean m11937a(Set<?> set, @NullableDecl Object obj) {
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

    /* renamed from: b */
    static int m11938b(Set<?> set) {
        int i = 0;
        for (Object next : set) {
            i = ((i + (next != null ? next.hashCode() : 0)) ^ -1) ^ -1;
        }
        return i;
    }

    /* renamed from: c */
    public static <E> C1385c<E> m11939c(Set<E> set, Set<?> set2) {
        C1320g.m11651j(set, "set1");
        C1320g.m11651j(set2, "set2");
        return new C1382a(set, set2);
    }

    /* renamed from: d */
    public static <E> HashSet<E> m11940d() {
        return new HashSet<>();
    }

    /* renamed from: e */
    public static <E> HashSet<E> m11941e(int i) {
        return new HashSet<>(C1329b0.m11680a(i));
    }

    /* renamed from: f */
    public static <E> Set<E> m11942f() {
        return Collections.newSetFromMap(C1329b0.m11684e());
    }

    /* renamed from: g */
    static boolean m11943g(Set<?> set, Collection<?> collection) {
        C1320g.m11650i(collection);
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).mo8317a();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return m11944h(set, collection.iterator());
        }
        return Iterators.m12021j(set.iterator(), collection);
    }

    /* renamed from: h */
    static boolean m11944h(Set<?> set, Iterator<?> it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }
}
