package p067c.p068a.p069a.p070a.p111m2;

/* renamed from: c.a.a.a.m2.j */
public class ConditionVariable {

    /* renamed from: a */
    private final Clock f8380a;

    /* renamed from: b */
    private boolean f8381b;

    public ConditionVariable() {
        this(Clock.f8368a);
    }

    /* renamed from: a */
    public synchronized void mo7442a() throws InterruptedException {
        while (!this.f8381b) {
            wait();
        }
    }

    /* renamed from: b */
    public synchronized boolean mo7443b() {
        boolean z;
        z = this.f8381b;
        this.f8381b = false;
        return z;
    }

    /* renamed from: c */
    public synchronized boolean mo7444c() {
        return this.f8381b;
    }

    /* renamed from: d */
    public synchronized boolean mo7445d() {
        if (this.f8381b) {
            return false;
        }
        this.f8381b = true;
        notifyAll();
        return true;
    }

    public ConditionVariable(Clock gVar) {
        this.f8380a = gVar;
    }
}
