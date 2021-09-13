package p010b.p026e.p030b;

/* renamed from: b.e.b.g */
/* compiled from: Pools */
class C0554g<T> implements Pools<T> {

    /* renamed from: a */
    private final Object[] f4025a;

    /* renamed from: b */
    private int f4026b;

    C0554g(int i) {
        if (i > 0) {
            this.f4025a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: a */
    public boolean mo4601a(T t) {
        int i = this.f4026b;
        Object[] objArr = this.f4025a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f4026b = i + 1;
        return true;
    }

    /* renamed from: b */
    public T mo4602b() {
        int i = this.f4026b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T[] tArr = this.f4025a;
        T t = tArr[i2];
        tArr[i2] = null;
        this.f4026b = i - 1;
        return t;
    }

    /* renamed from: c */
    public void mo4603c(T[] tArr, int i) {
        if (i > tArr.length) {
            i = tArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            T t = tArr[i2];
            int i3 = this.f4026b;
            Object[] objArr = this.f4025a;
            if (i3 < objArr.length) {
                objArr[i3] = t;
                this.f4026b = i3 + 1;
            }
        }
    }
}
