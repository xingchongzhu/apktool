package p010b.p034g.p042j;

/* renamed from: b.g.j.g */
/* compiled from: Pools */
public class C0612g<T> extends C0611f<T> {

    /* renamed from: c */
    private final Object f4591c = new Object();

    public C0612g(int i) {
        super(i);
    }

    /* renamed from: a */
    public boolean mo4945a(T t) {
        boolean a;
        synchronized (this.f4591c) {
            a = super.mo4945a(t);
        }
        return a;
    }

    /* renamed from: b */
    public T mo4946b() {
        T b;
        synchronized (this.f4591c) {
            b = super.mo4946b();
        }
        return b;
    }
}
