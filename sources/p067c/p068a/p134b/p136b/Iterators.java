package p067c.p068a.p134b.p136b;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p067c.p068a.p134b.p135a.C1320g;
import p067c.p068a.p134b.p135a.Objects;

/* renamed from: c.a.b.b.x */
public final class Iterators {

    /* renamed from: c.a.b.b.x$a */
    /* compiled from: Iterators */
    static class C1391a extends UnmodifiableIterator<T> {

        /* renamed from: a */
        boolean f9912a;

        /* renamed from: b */
        final /* synthetic */ Object f9913b;

        C1391a(Object obj) {
            this.f9913b = obj;
        }

        public boolean hasNext() {
            return !this.f9912a;
        }

        public T next() {
            if (!this.f9912a) {
                this.f9912a = true;
                return this.f9913b;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: c.a.b.b.x$b */
    /* compiled from: Iterators */
    private static final class C1392b<T> extends AbstractIndexedListIterator<T> {

        /* renamed from: c */
        static final UnmodifiableListIterator<Object> f9914c = new C1392b(new Object[0], 0, 0, 0);

        /* renamed from: d */
        private final T[] f9915d;

        /* renamed from: e */
        private final int f9916e;

        C1392b(T[] tArr, int i, int i2, int i3) {
            super(i2, i3);
            this.f9915d = tArr;
            this.f9916e = i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public T mo8114a(int i) {
            return this.f9915d[this.f9916e + i];
        }
    }

    /* renamed from: c.a.b.b.x$c */
    /* compiled from: Iterators */
    private enum C1393c implements Iterator<Object> {
        INSTANCE;

        public boolean hasNext() {
            return false;
        }

        public Object next() {
            throw new NoSuchElementException();
        }

        public void remove() {
            CollectPreconditions.m11787c(false);
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: a */
    public static <T> boolean m12012a(Collection<T> collection, Iterator<? extends T> it) {
        C1320g.m11650i(collection);
        C1320g.m11650i(it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    /* renamed from: b */
    static void m12013b(Iterator<?> it) {
        C1320g.m11650i(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    /* renamed from: c */
    public static boolean m12014c(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext()) {
                return false;
            }
            if (!Objects.m11640a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    /* renamed from: d */
    static <T> UnmodifiableIterator<T> m12015d() {
        return m12016e();
    }

    /* renamed from: e */
    static <T> UnmodifiableListIterator<T> m12016e() {
        return C1392b.f9914c;
    }

    /* renamed from: f */
    static <T> Iterator<T> m12017f() {
        return C1393c.INSTANCE;
    }

    /* renamed from: g */
    public static <T> T m12018g(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    @NullableDecl
    /* renamed from: h */
    public static <T> T m12019h(Iterator<? extends T> it, @NullableDecl T t) {
        return it.hasNext() ? it.next() : t;
    }

    @NullableDecl
    /* renamed from: i */
    static <T> T m12020i(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    @CanIgnoreReturnValue
    /* renamed from: j */
    public static boolean m12021j(Iterator<?> it, Collection<?> collection) {
        C1320g.m11650i(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: k */
    public static <T> UnmodifiableIterator<T> m12022k(@NullableDecl T t) {
        return new C1391a(t);
    }

    /* renamed from: l */
    public static String m12023l(Iterator<?> it) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            z = false;
            sb.append(it.next());
        }
        sb.append(']');
        return sb.toString();
    }
}
