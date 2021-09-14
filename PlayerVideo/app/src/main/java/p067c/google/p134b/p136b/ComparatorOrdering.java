package p067c.google.p134b.p136b;

import java.io.Serializable;
import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p067c.google.p134b.p135a.C1320g;

/* renamed from: c.a.b.b.l */
final class ComparatorOrdering<T> extends Ordering<T> implements Serializable {

    /* renamed from: a */
    final Comparator<T> f9845a;

    ComparatorOrdering(Comparator<T> comparator) {
        this.f9845a = (Comparator) C1320g.m11650i(comparator);
    }

    public int compare(T t, T t2) {
        return this.f9845a.compare(t, t2);
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ComparatorOrdering)) {
            return false;
        }
        return this.f9845a.equals(((ComparatorOrdering) obj).f9845a);
    }

    public int hashCode() {
        return this.f9845a.hashCode();
    }

    public String toString() {
        return this.f9845a.toString();
    }
}
