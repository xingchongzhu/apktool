package p010b.p018b.p019a.p020a;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: b.b.a.a.b */
public class DefaultTaskExecutor extends TaskExecutor {

    /* renamed from: a */
    private final Object f3858a = new Object();

    /* renamed from: b */
    private final ExecutorService f3859b = Executors.newFixedThreadPool(4, new C0534a());

    /* renamed from: c */
    private volatile Handler f3860c;

    /* renamed from: b.b.a.a.b$a */
    /* compiled from: DefaultTaskExecutor */
    class C0534a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f3861a = new AtomicInteger(0);

        C0534a() {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", new Object[]{Integer.valueOf(this.f3861a.getAndIncrement())}));
            return thread;
        }
    }

    /* renamed from: d */
    private static Handler m4317d(Looper looper) {
        int i = VERSION.SDK_INT;
        if (i >= 28) {
            return Handler.createAsync(looper);
        }
        if (i >= 16) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(new Class[]{Looper.class, Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            } catch (InvocationTargetException unused2) {
                return new Handler(looper);
            }
        }
        return new Handler(looper);
    }

    /* renamed from: a */
    public void mo4263a(Runnable runnable) {
        this.f3859b.execute(runnable);
    }

    /* renamed from: b */
    public boolean mo4264b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: c */
    public void mo4265c(Runnable runnable) {
        if (this.f3860c == null) {
            synchronized (this.f3858a) {
                if (this.f3860c == null) {
                    this.f3860c = m4317d(Looper.getMainLooper());
                }
            }
        }
        this.f3860c.post(runnable);
    }
}
