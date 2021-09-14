package p067c.google.p134b.p136b;

import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p067c.google.p134b.p135a.C1320g;

/* renamed from: c.a.b.b.v */
public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {
    @NullableDecl
    @RetainedWith
    @LazyInit

    /* renamed from: b */
    private transient ImmutableList<E> f9911b;

    ImmutableSet() {
    }

    /* renamed from: i */
    static int m11994i(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (true) {
                double d = (double) highestOneBit;
                Double.isNaN(d);
                if (d * 0.7d >= ((double) max)) {
                    return highestOneBit;
                }
                highestOneBit <<= 1;
            }
        } else {
            if (max >= 1073741824) {
                z = false;
            }
            C1320g.m11646e(z, "collection too large");
            return 1073741824;
        }
    }

    /* renamed from: j */
    private static <E> ImmutableSet<E> m11995j(int i, Object... objArr) {
        if (i == 0) {
            return m11998o();
        }
        if (i == 1) {
            return m11999p(objArr[0]);
        }
        int i2 = m11994i(i);
        Object[] objArr2 = new Object[i2];
        int i3 = i2 - 1;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            Object a = ObjectArrays.m11788a(objArr[i6], i6);
            int hashCode = a.hashCode();
            int b = Hashing.m11897b(hashCode);
            while (true) {
                int i7 = b & i3;
                Object obj = objArr2[i7];
                if (obj == null) {
                    int i8 = i5 + 1;
                    objArr[i5] = a;
                    objArr2[i7] = a;
                    i4 += hashCode;
                    i5 = i8;
                    break;
                } else if (obj.equals(a)) {
                    break;
                } else {
                    b++;
                }
            }
        }
        Arrays.fill(objArr, i5, i, null);
        if (i5 == 1) {
            return new SingletonImmutableSet(objArr[0], i4);
        }
        if (m11994i(i5) < i2 / 2) {
            return m11995j(i5, objArr);
        }
        if (m12002s(i5, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i5);
        }
        RegularImmutableSet n0Var = new RegularImmutableSet(objArr, i4, objArr2, i3, i5);
        return n0Var;
    }

    /* renamed from: k */
    public static <E> ImmutableSet<E> m11996k(Collection<? extends E> collection) {
        if ((collection instanceof ImmutableSet) && !(collection instanceof SortedSet)) {
            ImmutableSet<E> vVar = (ImmutableSet) collection;
            if (!vVar.mo8379g()) {
                return vVar;
            }
        }
        Object[] array = collection.toArray();
        return m11995j(array.length, array);
    }

    /* renamed from: l */
    public static <E> ImmutableSet<E> m11997l(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return m11998o();
        }
        if (length != 1) {
            return m11995j(eArr.length, (Object[]) eArr.clone());
        }
        return m11999p(eArr[0]);
    }

    /* renamed from: o */
    public static <E> ImmutableSet<E> m11998o() {
        return RegularImmutableSet.f9868c;
    }

    /* renamed from: p */
    public static <E> ImmutableSet<E> m11999p(E e) {
        return new SingletonImmutableSet(e);
    }

    /* renamed from: q */
    public static <E> ImmutableSet<E> m12000q(E e, E e2) {
        return m11995j(2, e, e2);
    }

    /* renamed from: r */
    public static <E> ImmutableSet<E> m12001r(E e, E e2, E e3) {
        return m11995j(3, e, e2, e3);
    }

    /* renamed from: s */
    private static boolean m12002s(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    /* renamed from: b */
    public ImmutableList<E> mo8403b() {
        ImmutableList<E> rVar = this.f9911b;
        if (rVar != null) {
            return rVar;
        }
        ImmutableList<E> m = mo8398m();
        this.f9911b = m;
        return m;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableSet) || !mo8408n() || !((ImmutableSet) obj).mo8408n() || hashCode() == obj.hashCode()) {
            return C1381r0.m11937a(this, obj);
        }
        return false;
    }

    public int hashCode() {
        return C1381r0.m11938b(this);
    }

    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public ImmutableList<E> mo8398m() {
        return ImmutableList.m11912i(toArray());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public boolean mo8408n() {
        return false;
    }
}
