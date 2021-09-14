package p067c.google.p134b.p136b;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p067c.google.p134b.p135a.C1320g;

/* renamed from: c.a.b.b.p */
public abstract class ImmutableCollection<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: a */
    private static final Object[] f9875a = new Object[0];

    /* renamed from: c.a.b.b.p$a */
    /* compiled from: ImmutableCollection */
    static abstract class C1376a<E> extends C1377b<E> {

        /* renamed from: a */
        Object[] f9876a;

        /* renamed from: b */
        int f9877b = 0;

        /* renamed from: c */
        boolean f9878c;

        C1376a(int i) {
            CollectPreconditions.m11786b(i, "initialCapacity");
            this.f9876a = new Object[i];
        }

        /* renamed from: c */
        private void m11908c(int i) {
            Object[] objArr = this.f9876a;
            if (objArr.length < i) {
                this.f9876a = Arrays.copyOf(objArr, C1377b.m11910a(objArr.length, i));
                this.f9878c = false;
            } else if (this.f9878c) {
                this.f9876a = (Object[]) objArr.clone();
                this.f9878c = false;
            }
        }

        @CanIgnoreReturnValue
        /* renamed from: b */
        public C1376a<E> mo8420b(E e) {
            C1320g.m11650i(e);
            m11908c(this.f9877b + 1);
            Object[] objArr = this.f9876a;
            int i = this.f9877b;
            this.f9877b = i + 1;
            objArr[i] = e;
            return this;
        }
    }

    /* renamed from: c.a.b.b.p$b */
    /* compiled from: ImmutableCollection */
    public static abstract class C1377b<E> {
        C1377b() {
        }

        /* renamed from: a */
        static int m11910a(int i, int i2) {
            if (i2 >= 0) {
                int i3 = i + (i >> 1) + 1;
                if (i3 < i2) {
                    i3 = Integer.highestOneBit(i2 - 1) << 1;
                }
                if (i3 < 0) {
                    return Integer.MAX_VALUE;
                }
                return i3;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
    }

    ImmutableCollection() {
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public ImmutableList<E> mo8403b() {
        return isEmpty() ? ImmutableList.m11917p() : ImmutableList.m11912i(toArray());
    }

    /* access modifiers changed from: 0000 */
    @CanIgnoreReturnValue
    /* renamed from: c */
    public int mo8375c(Object[] objArr, int i) {
        UnmodifiableIterator h = iterator();
        while (h.hasNext()) {
            int i2 = i + 1;
            objArr[i] = h.next();
            i = i2;
        }
        return i;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(@NullableDecl Object obj);

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public Object[] mo8376d() {
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo8377e() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int mo8378f() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public abstract boolean mo8379g();

    /* renamed from: h */
    public abstract UnmodifiableIterator<E> iterator();

    @CanIgnoreReturnValue
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f9875a);
    }

    @CanIgnoreReturnValue
    public final <T> T[] toArray(T[] tArr) {
        C1320g.m11650i(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] d = mo8376d();
            if (d != null) {
                return Platform.m11836a(d, mo8378f(), mo8377e(), tArr);
            }
            tArr = ObjectArrays.m11791d(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        mo8375c(tArr, 0);
        return tArr;
    }
}
