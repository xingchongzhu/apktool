package p067c.p068a.p134b.p136b;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p067c.p068a.p134b.p135a.C1319e;
import p067c.p068a.p134b.p135a.C1320g;
import p067c.p068a.p134b.p135a.Objects;

/* renamed from: c.a.b.b.h */
final class ByFunctionOrdering<F, T> extends Ordering<F> implements Serializable {

    /* renamed from: a */
    final C1319e<F, ? extends T> f9818a;

    /* renamed from: b */
    final Ordering<T> f9819b;

    ByFunctionOrdering(C1319e<F, ? extends T> eVar, Ordering<T> j0Var) {
        this.f9818a = (C1319e) C1320g.m11650i(eVar);
        this.f9819b = (Ordering) C1320g.m11650i(j0Var);
    }

    public int compare(F f, F f2) {
        return this.f9819b.compare(this.f9818a.apply(f), this.f9818a.apply(f2));
    }

    public boolean equals(@NullableDecl Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByFunctionOrdering)) {
            return false;
        }
        ByFunctionOrdering hVar = (ByFunctionOrdering) obj;
        if (!this.f9818a.equals(hVar.f9818a) || !this.f9819b.equals(hVar.f9819b)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Objects.m11641b(this.f9818a, this.f9819b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9819b);
        sb.append(".onResultOf(");
        sb.append(this.f9818a);
        sb.append(")");
        return sb.toString();
    }
}
