package p010b.p034g.p042j;

/* renamed from: b.g.j.f */
/* compiled from: Pools */
public class C0611f<T> implements C0610e<T> {

    /* renamed from: a */
    private final Object[] f4589a;

    /* renamed from: b */
    private int f4590b;

    public C0611f(int i) {
        if (i > 0) {
            this.f4589a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: c */
    private boolean m5179c(T t) {
        for (int i = 0; i < this.f4590b; i++) {
            if (this.f4589a[i] == t) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo4945a(T t) {
        if (!m5179c(t)) {
            int i = this.f4590b;
            Object[] objArr = this.f4589a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.f4590b = i + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    /* renamed from: b */
    public T mo4946b() {
        int i = this.f4590b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T[] tArr = this.f4589a;
        T t = tArr[i2];
        tArr[i2] = null;
        this.f4590b = i - 1;
        return t;
    }
}
