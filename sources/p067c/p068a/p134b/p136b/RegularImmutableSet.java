package p067c.p068a.p134b.p136b;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: c.a.b.b.n0 */
final class RegularImmutableSet<E> extends ImmutableSet<E> {

    /* renamed from: c */
    static final RegularImmutableSet<Object> f9868c;

    /* renamed from: d */
    final transient Object[] f9869d;

    /* renamed from: e */
    final transient Object[] f9870e;

    /* renamed from: f */
    private final transient int f9871f;

    /* renamed from: g */
    private final transient int f9872g;

    /* renamed from: h */
    private final transient int f9873h;

    static {
        RegularImmutableSet n0Var = new RegularImmutableSet(new Object[0], 0, null, 0, 0);
        f9868c = n0Var;
    }

    RegularImmutableSet(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f9869d = objArr;
        this.f9870e = objArr2;
        this.f9871f = i2;
        this.f9872g = i;
        this.f9873h = i3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo8375c(Object[] objArr, int i) {
        System.arraycopy(this.f9869d, 0, objArr, i, this.f9873h);
        return i + this.f9873h;
    }

    public boolean contains(@NullableDecl Object obj) {
        Object[] objArr = this.f9870e;
        if (obj == null || objArr == null) {
            return false;
        }
        int c = Hashing.m11898c(obj);
        while (true) {
            int i = c & this.f9871f;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            c = i + 1;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public Object[] mo8376d() {
        return this.f9869d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo8377e() {
        return this.f9873h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int mo8378f() {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public boolean mo8379g() {
        return false;
    }

    /* renamed from: h */
    public UnmodifiableIterator<E> iterator() {
        return mo8403b().iterator();
    }

    public int hashCode() {
        return this.f9872g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public ImmutableList<E> mo8398m() {
        return ImmutableList.m11913j(this.f9869d, this.f9873h);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public boolean mo8408n() {
        return true;
    }

    public int size() {
        return this.f9873h;
    }
}
