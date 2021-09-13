package p067c.p068a.p134b.p136b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p067c.p068a.p134b.p135a.C1320g;
import p067c.p068a.p134b.p135a.Objects;

/* renamed from: c.a.b.b.z */
public final class Lists {
    /* renamed from: a */
    static boolean m12025a(List<?> list, @NullableDecl Object obj) {
        if (obj == C1320g.m11650i(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return Iterators.m12014c(list.iterator(), list2.iterator());
        }
        for (int i = 0; i < size; i++) {
            if (!Objects.m11640a(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    static int m12026b(List<?> list, @NullableDecl Object obj) {
        if (list instanceof RandomAccess) {
            return m12027c(list, obj);
        }
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (Objects.m11640a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    /* renamed from: c */
    private static int m12027c(List<?> list, @NullableDecl Object obj) {
        int size = list.size();
        int i = 0;
        if (obj == null) {
            while (i < size) {
                if (list.get(i) == null) {
                    return i;
                }
                i++;
            }
        } else {
            while (i < size) {
                if (obj.equals(list.get(i))) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    /* renamed from: d */
    static int m12028d(List<?> list, @NullableDecl Object obj) {
        if (list instanceof RandomAccess) {
            return m12029e(list, obj);
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (Objects.m11640a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    /* renamed from: e */
    private static int m12029e(List<?> list, @NullableDecl Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
        } else {
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                if (obj.equals(list.get(size2))) {
                    return size2;
                }
            }
        }
        return -1;
    }

    /* renamed from: f */
    public static <E> ArrayList<E> m12030f() {
        return new ArrayList<>();
    }

    /* renamed from: g */
    public static <E> ArrayList<E> m12031g(Iterator<? extends E> it) {
        ArrayList<E> f = m12030f();
        Iterators.m12012a(f, it);
        return f;
    }
}
