package p067c.google.p134b.p136b;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: c.a.b.b.w */
public final class Iterables {
    /* renamed from: a */
    private static <E> Collection<E> m12006a(Iterable<E> iterable) {
        if (iterable instanceof Collection) {
            return (Collection) iterable;
        }
        return Lists.m12031g(iterable.iterator());
    }

    @NullableDecl
    /* renamed from: b */
    public static <T> T m12007b(Iterable<? extends T> iterable, @NullableDecl T t) {
        return Iterators.m12019h(iterable.iterator(), t);
    }

    /* renamed from: c */
    public static <T> T m12008c(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return Iterators.m12018g(iterable.iterator());
        }
        List list = (List) iterable;
        if (!list.isEmpty()) {
            return m12009d(list);
        }
        throw new NoSuchElementException();
    }

    /* renamed from: d */
    private static <T> T m12009d(List<T> list) {
        return list.get(list.size() - 1);
    }

    /* renamed from: e */
    static Object[] m12010e(Iterable<?> iterable) {
        return m12006a(iterable).toArray();
    }

    /* renamed from: f */
    public static String m12011f(Iterable<?> iterable) {
        return Iterators.m12023l(iterable.iterator());
    }
}
