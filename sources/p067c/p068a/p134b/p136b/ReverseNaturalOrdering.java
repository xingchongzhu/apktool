package p067c.p068a.p134b.p136b;

import java.io.Serializable;
import p067c.p068a.p134b.p135a.C1320g;

/* renamed from: c.a.b.b.o0 */
final class ReverseNaturalOrdering extends Ordering<Comparable> implements Serializable {

    /* renamed from: a */
    static final ReverseNaturalOrdering f9874a = new ReverseNaturalOrdering();

    private ReverseNaturalOrdering() {
    }

    /* renamed from: f */
    public <S extends Comparable> Ordering<S> mo8322f() {
        return Ordering.m11795c();
    }

    /* renamed from: g */
    public int compare(Comparable comparable, Comparable comparable2) {
        C1320g.m11650i(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
