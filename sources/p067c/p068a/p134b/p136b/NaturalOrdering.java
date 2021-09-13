package p067c.p068a.p134b.p136b;

import java.io.Serializable;
import p067c.p068a.p134b.p135a.C1320g;

/* renamed from: c.a.b.b.h0 */
final class NaturalOrdering extends Ordering<Comparable> implements Serializable {

    /* renamed from: a */
    static final NaturalOrdering f9820a = new NaturalOrdering();

    private NaturalOrdering() {
    }

    /* renamed from: f */
    public <S extends Comparable> Ordering<S> mo8322f() {
        return ReverseNaturalOrdering.f9874a;
    }

    /* renamed from: g */
    public int compare(Comparable comparable, Comparable comparable2) {
        C1320g.m11650i(comparable);
        C1320g.m11650i(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
