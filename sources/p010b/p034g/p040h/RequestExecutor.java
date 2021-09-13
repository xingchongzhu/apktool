package p010b.p034g.p040h;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p010b.p034g.p042j.Consumer;

/* renamed from: b.g.h.g */
class RequestExecutor {

    /* renamed from: b.g.h.g$a */
    /* compiled from: RequestExecutor */
    private static class C0596a implements ThreadFactory {

        /* renamed from: a */
        private String f4533a;

        /* renamed from: b */
        private int f4534b;

        /* renamed from: b.g.h.g$a$a */
        /* compiled from: RequestExecutor */
        private static class C0597a extends Thread {

            /* renamed from: a */
            private final int f4535a;

            C0597a(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.f4535a = i;
            }

            public void run() {
                Process.setThreadPriority(this.f4535a);
                super.run();
            }
        }

        C0596a(String str, int i) {
            this.f4533a = str;
            this.f4534b = i;
        }

        public Thread newThread(Runnable runnable) {
            return new C0597a(runnable, this.f4533a, this.f4534b);
        }
    }

    /* renamed from: b.g.h.g$b */
    /* compiled from: RequestExecutor */
    private static class C0598b<T> implements Runnable {

        /* renamed from: a */
        private Callable<T> f4536a;

        /* renamed from: b */
        private Consumer<T> f4537b;

        /* renamed from: c */
        private Handler f4538c;

        /* renamed from: b.g.h.g$b$a */
        /* compiled from: RequestExecutor */
        class C0599a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Consumer f4539a;

            /* renamed from: b */
            final /* synthetic */ Object f4540b;

            C0599a(Consumer aVar, Object obj) {
                this.f4539a = aVar;
                this.f4540b = obj;
            }

            public void run() {
                this.f4539a.mo4887a(this.f4540b);
            }
        }

        C0598b(Handler handler, Callable<T> callable, Consumer<T> aVar) {
            this.f4536a = callable;
            this.f4537b = aVar;
            this.f4538c = handler;
        }

        public void run() {
            Object obj;
            try {
                obj = this.f4536a.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f4538c.post(new C0599a(this.f4537b, obj));
        }
    }

    /* renamed from: a */
    static ThreadPoolExecutor m5120a(String str, int i, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new C0596a(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* renamed from: b */
    static <T> void m5121b(Executor executor, Callable<T> callable, Consumer<T> aVar) {
        executor.execute(new C0598b(CalleeHandler.m5081a(), callable, aVar));
    }

    /* renamed from: c */
    static <T> T m5122c(ExecutorService executorService, Callable<T> callable, int i) throws InterruptedException {
        try {
            return executorService.submit(callable).get((long) i, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e2) {
            throw e2;
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
