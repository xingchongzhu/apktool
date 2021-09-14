package p067c.google.p134b.p136b;

import java.util.NoSuchElementException;
import p067c.google.p134b.p135a.C1320g;

/* renamed from: c.a.b.b.a */
abstract class AbstractIndexedListIterator<E> extends UnmodifiableListIterator<E> {

    /* renamed from: a */
    private final int f9758a;

    /* renamed from: b */
    private int f9759b;

    protected AbstractIndexedListIterator(int i, int i2) {
        C1320g.m11652k(i2, i);
        this.f9758a = i;
        this.f9759b = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract E mo8114a(int i);

    public final boolean hasNext() {
        return this.f9759b < this.f9758a;
    }

    public final boolean hasPrevious() {
        return this.f9759b > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.f9759b;
            this.f9759b = i + 1;
            return mo8114a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f9759b;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.f9759b - 1;
            this.f9759b = i;
            return mo8114a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f9759b - 1;
    }
}
