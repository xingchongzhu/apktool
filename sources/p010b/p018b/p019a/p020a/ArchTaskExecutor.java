package p010b.p018b.p019a.p020a;

import java.util.concurrent.Executor;

/* renamed from: b.b.a.a.a */
public class ArchTaskExecutor extends TaskExecutor {

    /* renamed from: a */
    private static volatile ArchTaskExecutor f3853a;

    /* renamed from: b */
    private static final Executor f3854b = new C0532a();

    /* renamed from: c */
    private static final Executor f3855c = new C0533b();

    /* renamed from: d */
    private TaskExecutor f3856d;

    /* renamed from: e */
    private TaskExecutor f3857e;

    /* renamed from: b.b.a.a.a$a */
    /* compiled from: ArchTaskExecutor */
    static class C0532a implements Executor {
        C0532a() {
        }

        public void execute(Runnable runnable) {
            ArchTaskExecutor.m4313d().mo4265c(runnable);
        }
    }

    /* renamed from: b.b.a.a.a$b */
    /* compiled from: ArchTaskExecutor */
    static class C0533b implements Executor {
        C0533b() {
        }

        public void execute(Runnable runnable) {
            ArchTaskExecutor.m4313d().mo4263a(runnable);
        }
    }

    private ArchTaskExecutor() {
        DefaultTaskExecutor bVar = new DefaultTaskExecutor();
        this.f3857e = bVar;
        this.f3856d = bVar;
    }

    /* renamed from: d */
    public static ArchTaskExecutor m4313d() {
        if (f3853a != null) {
            return f3853a;
        }
        synchronized (ArchTaskExecutor.class) {
            if (f3853a == null) {
                f3853a = new ArchTaskExecutor();
            }
        }
        return f3853a;
    }

    /* renamed from: a */
    public void mo4263a(Runnable runnable) {
        this.f3856d.mo4263a(runnable);
    }

    /* renamed from: b */
    public boolean mo4264b() {
        return this.f3856d.mo4264b();
    }

    /* renamed from: c */
    public void mo4265c(Runnable runnable) {
        this.f3856d.mo4265c(runnable);
    }
}
