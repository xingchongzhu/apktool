package p067c.p068a.p134b.p136b;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Comparator;
import java.util.Map.Entry;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p067c.p068a.p134b.p135a.C1319e;

/* renamed from: c.a.b.b.j0 */
public abstract class Ordering<T> implements Comparator<T> {
    protected Ordering() {
    }

    /* renamed from: a */
    public static <T> Ordering<T> m11794a(Comparator<T> comparator) {
        return comparator instanceof Ordering ? (Ordering) comparator : new ComparatorOrdering(comparator);
    }

    /* renamed from: c */
    public static <C extends Comparable> Ordering<C> m11795c() {
        return NaturalOrdering.f9820a;
    }

    /* renamed from: b */
    public <E extends T> ImmutableList<E> mo8325b(Iterable<E> iterable) {
        return ImmutableList.m11921t(this, iterable);
    }

    @CanIgnoreReturnValue
    public abstract int compare(@NullableDecl T t, @NullableDecl T t2);

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public <T2 extends T> Ordering<Entry<T2, ?>> mo8326d() {
        return mo8327e(C1329b0.m11683d());
    }

    /* renamed from: e */
    public <F> Ordering<F> mo8327e(C1319e<F, ? extends T> eVar) {
        return new ByFunctionOrdering(eVar, this);
    }

    /* renamed from: f */
    public <S extends T> Ordering<S> mo8322f() {
        return new ReverseOrdering(this);
    }
}
