package p067c.google.p134b.p136b;

import java.util.Iterator;
import p067c.google.p134b.p135a.C1320g;

/* renamed from: c.a.b.b.t0 */
abstract class TransformedIterator<F, T> implements Iterator<T> {

    /* renamed from: a */
    final Iterator<? extends F> f9901a;

    TransformedIterator(Iterator<? extends F> it) {
        this.f9901a = (Iterator) C1320g.m11650i(it);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract T mo8125a(F f);

    public final boolean hasNext() {
        return this.f9901a.hasNext();
    }

    public final T next() {
        return mo8125a(this.f9901a.next());
    }

    public final void remove() {
        this.f9901a.remove();
    }
}
