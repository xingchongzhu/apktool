package p067c.p068a.p134b.p136b;

import java.util.Iterator;

/* renamed from: c.a.b.b.u0 */
public abstract class UnmodifiableIterator<E> implements Iterator<E> {
    protected UnmodifiableIterator() {
    }

    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
