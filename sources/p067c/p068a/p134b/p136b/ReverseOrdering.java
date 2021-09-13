package p067c.p068a.p134b.p136b;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p067c.p068a.p134b.p135a.C1320g;

/* renamed from: c.a.b.b.p0 */
final class ReverseOrdering<T> extends Ordering<T> implements Serializable {

    /* renamed from: a */
    final Ordering<? super T> f9879a;

    ReverseOrdering(Ordering<? super T> j0Var) {
        this.f9879a = (Ordering) C1320g.m11650i(j0Var);
    }

    public int compare(T t, T t2) {
        return this.f9879a.compare(t2, t);
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReverseOrdering)) {
            return false;
        }
        return this.f9879a.equals(((ReverseOrdering) obj).f9879a);
    }

    /* renamed from: f */
    public <S extends T> Ordering<S> mo8322f() {
        return this.f9879a;
    }

    public int hashCode() {
        return -this.f9879a.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9879a);
        sb.append(".reverse()");
        return sb.toString();
    }
}
