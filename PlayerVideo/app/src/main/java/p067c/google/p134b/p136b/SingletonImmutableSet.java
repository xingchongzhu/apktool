package p067c.google.p134b.p136b;

import com.google.errorprone.annotations.concurrent.LazyInit;
import p067c.google.p134b.p135a.C1320g;

/* renamed from: c.a.b.b.s0 */
final class SingletonImmutableSet<E> extends ImmutableSet<E> {

    /* renamed from: c */
    final transient E f9891c;
    @LazyInit

    /* renamed from: d */
    private transient int f9892d;

    SingletonImmutableSet(E e) {
        this.f9891c = C1320g.m11650i(e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo8375c(Object[] objArr, int i) {
        objArr[i] = this.f9891c;
        return i + 1;
    }

    public boolean contains(Object obj) {
        return this.f9891c.equals(obj);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public boolean mo8379g() {
        return false;
    }

    /* renamed from: h */
    public UnmodifiableIterator<E> iterator() {
        return Iterators.m12022k(this.f9891c);
    }

    public final int hashCode() {
        int i = this.f9892d;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f9891c.hashCode();
        this.f9892d = hashCode;
        return hashCode;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public ImmutableList<E> mo8398m() {
        return ImmutableList.m11918q(this.f9891c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public boolean mo8408n() {
        return this.f9892d != 0;
    }

    public int size() {
        return 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(this.f9891c.toString());
        sb.append(']');
        return sb.toString();
    }

    SingletonImmutableSet(E e, int i) {
        this.f9891c = e;
        this.f9892d = i;
    }
}
