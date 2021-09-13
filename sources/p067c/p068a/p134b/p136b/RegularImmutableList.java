package p067c.p068a.p134b.p136b;

import p067c.p068a.p134b.p135a.C1320g;

/* renamed from: c.a.b.b.l0 */
class RegularImmutableList<E> extends ImmutableList<E> {

    /* renamed from: c */
    static final ImmutableList<Object> f9846c = new RegularImmutableList(new Object[0], 0);

    /* renamed from: d */
    final transient Object[] f9847d;

    /* renamed from: e */
    private final transient int f9848e;

    RegularImmutableList(Object[] objArr, int i) {
        this.f9847d = objArr;
        this.f9848e = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo8375c(Object[] objArr, int i) {
        System.arraycopy(this.f9847d, 0, objArr, i, this.f9848e);
        return i + this.f9848e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public Object[] mo8376d() {
        return this.f9847d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo8377e() {
        return this.f9848e;
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

    public E get(int i) {
        C1320g.m11648g(i, this.f9848e);
        return this.f9847d[i];
    }

    public int size() {
        return this.f9848e;
    }
}
