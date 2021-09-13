package p271e.p272f0;

/* renamed from: e.f0.b */
public abstract class NamedRunnable implements Runnable {

    /* renamed from: a */
    protected final String f18085a;

    public NamedRunnable(String str, Object... objArr) {
        this.f18085a = C3310c.m23063q(str, objArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract void mo19732k();

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f18085a);
        try {
            mo19732k();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
