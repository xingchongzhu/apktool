package p067c.p068a.p134b.p136b;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p067c.p068a.p134b.p135a.C1320g;

/* renamed from: c.a.b.b.r */
public abstract class ImmutableList<E> extends ImmutableCollection<E> implements List<E>, RandomAccess {

    /* renamed from: b */
    private static final UnmodifiableListIterator<Object> f9882b = new C1379b(RegularImmutableList.f9846c, 0);

    /* renamed from: c.a.b.b.r$a */
    /* compiled from: ImmutableList */
    public static final class C1378a<E> extends C1376a<E> {
        public C1378a() {
            this(4);
        }

        @CanIgnoreReturnValue
        /* renamed from: d */
        public C1378a<E> mo8440d(E e) {
            super.mo8420b(e);
            return this;
        }

        /* renamed from: e */
        public ImmutableList<E> mo8441e() {
            this.f9878c = true;
            return ImmutableList.m11913j(this.f9876a, this.f9877b);
        }

        C1378a(int i) {
            super(i);
        }
    }

    /* renamed from: c.a.b.b.r$b */
    /* compiled from: ImmutableList */
    static class C1379b<E> extends AbstractIndexedListIterator<E> {

        /* renamed from: c */
        private final ImmutableList<E> f9883c;

        C1379b(ImmutableList<E> rVar, int i) {
            super(rVar.size(), i);
            this.f9883c = rVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public E mo8114a(int i) {
            return this.f9883c.get(i);
        }
    }

    /* renamed from: c.a.b.b.r$c */
    /* compiled from: ImmutableList */
    class C1380c extends ImmutableList<E> {

        /* renamed from: c */
        final transient int f9884c;

        /* renamed from: d */
        final transient int f9885d;

        C1380c(int i, int i2) {
            this.f9884c = i;
            this.f9885d = i2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public Object[] mo8376d() {
            return ImmutableList.this.mo8376d();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public int mo8377e() {
            return ImmutableList.this.mo8378f() + this.f9884c + this.f9885d;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public int mo8378f() {
            return ImmutableList.this.mo8378f() + this.f9884c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public boolean mo8379g() {
            return true;
        }

        public E get(int i) {
            C1320g.m11648g(i, this.f9885d);
            return ImmutableList.this.get(i + this.f9884c);
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return ImmutableList.super.iterator();
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return ImmutableList.super.listIterator();
        }

        public int size() {
            return this.f9885d;
        }

        /* renamed from: u */
        public ImmutableList<E> subList(int i, int i2) {
            C1320g.m11654m(i, i2, this.f9885d);
            ImmutableList rVar = ImmutableList.this;
            int i3 = this.f9884c;
            return rVar.subList(i + i3, i2 + i3);
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return ImmutableList.super.listIterator(i);
        }
    }

    ImmutableList() {
    }

    /* renamed from: i */
    static <E> ImmutableList<E> m11912i(Object[] objArr) {
        return m11913j(objArr, objArr.length);
    }

    /* renamed from: j */
    static <E> ImmutableList<E> m11913j(Object[] objArr, int i) {
        if (i == 0) {
            return m11917p();
        }
        return new RegularImmutableList(objArr, i);
    }

    /* renamed from: k */
    public static <E> C1378a<E> m11914k() {
        return new C1378a<>();
    }

    /* renamed from: l */
    private static <E> ImmutableList<E> m11915l(Object... objArr) {
        return m11912i(ObjectArrays.m11789b(objArr));
    }

    /* renamed from: m */
    public static <E> ImmutableList<E> m11916m(Collection<? extends E> collection) {
        if (!(collection instanceof ImmutableCollection)) {
            return m11915l(collection.toArray());
        }
        ImmutableList<E> b = ((ImmutableCollection) collection).mo8403b();
        if (b.mo8379g()) {
            b = m11912i(b.toArray());
        }
        return b;
    }

    /* renamed from: p */
    public static <E> ImmutableList<E> m11917p() {
        return RegularImmutableList.f9846c;
    }

    /* renamed from: q */
    public static <E> ImmutableList<E> m11918q(E e) {
        return m11915l(e);
    }

    /* renamed from: r */
    public static <E> ImmutableList<E> m11919r(E e, E e2) {
        return m11915l(e, e2);
    }

    /* renamed from: s */
    public static <E> ImmutableList<E> m11920s(E e, E e2, E e3, E e4, E e5) {
        return m11915l(e, e2, e3, e4, e5);
    }

    /* renamed from: t */
    public static <E> ImmutableList<E> m11921t(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        C1320g.m11650i(comparator);
        Object[] e = Iterables.m12010e(iterable);
        ObjectArrays.m11789b(e);
        Arrays.sort(e, comparator);
        return m11912i(e);
    }

    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final ImmutableList<E> mo8403b() {
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo8375c(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public boolean contains(@NullableDecl Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean equals(@NullableDecl Object obj) {
        return Lists.m12025a(this, obj);
    }

    /* renamed from: h */
    public UnmodifiableIterator<E> iterator() {
        return listIterator();
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < size(); i2++) {
            i = (((i * 31) + get(i2).hashCode()) ^ -1) ^ -1;
        }
        return i;
    }

    public int indexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        return Lists.m12026b(this, obj);
    }

    public int lastIndexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        return Lists.m12028d(this, obj);
    }

    /* renamed from: n */
    public UnmodifiableListIterator<E> listIterator() {
        return listIterator(0);
    }

    /* renamed from: o */
    public UnmodifiableListIterator<E> listIterator(int i) {
        C1320g.m11652k(i, size());
        if (isEmpty()) {
            return f9882b;
        }
        return new C1379b(this, i);
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: u */
    public ImmutableList<E> subList(int i, int i2) {
        C1320g.m11654m(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return m11917p();
        }
        return mo8439v(i, i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public ImmutableList<E> mo8439v(int i, int i2) {
        return new C1380c(i, i2 - i);
    }
}
