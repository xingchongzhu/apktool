package com.bumptech.glide.load.p152n.p155c0;

import android.os.Process;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.bumptech.glide.load.n.c0.a */
public final class GlideExecutor implements ExecutorService {

    /* renamed from: a */
    private static final long f10454a = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: b */
    private static volatile int f10455b;

    /* renamed from: c */
    private final ExecutorService f10456c;

    /* renamed from: com.bumptech.glide.load.n.c0.a$a */
    /* compiled from: GlideExecutor */
    public static final class C1467a {

        /* renamed from: a */
        private final boolean f10457a;

        /* renamed from: b */
        private int f10458b;

        /* renamed from: c */
        private int f10459c;

        /* renamed from: d */
        private C1470c f10460d = C1470c.f10471d;

        /* renamed from: e */
        private String f10461e;

        /* renamed from: f */
        private long f10462f;

        C1467a(boolean z) {
            this.f10457a = z;
        }

        /* renamed from: a */
        public GlideExecutor mo8957a() {
            if (!TextUtils.isEmpty(this.f10461e)) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f10458b, this.f10459c, this.f10462f, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C1468b(this.f10461e, this.f10460d, this.f10457a));
                if (this.f10462f != 0) {
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
                return new GlideExecutor(threadPoolExecutor);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Name must be non-null and non-empty, but given: ");
            sb.append(this.f10461e);
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: b */
        public C1467a mo8958b(String str) {
            this.f10461e = str;
            return this;
        }

        /* renamed from: c */
        public C1467a mo8959c(int i) {
            this.f10458b = i;
            this.f10459c = i;
            return this;
        }
    }

    /* renamed from: com.bumptech.glide.load.n.c0.a$b */
    /* compiled from: GlideExecutor */
    private static final class C1468b implements ThreadFactory {

        /* renamed from: a */
        private final String f10463a;

        /* renamed from: b */
        final C1470c f10464b;

        /* renamed from: c */
        final boolean f10465c;

        /* renamed from: d */
        private int f10466d;

        /* renamed from: com.bumptech.glide.load.n.c0.a$b$a */
        /* compiled from: GlideExecutor */
        class C1469a extends Thread {
            C1469a(Runnable runnable, String str) {
                super(runnable, str);
            }

            public void run() {
                Process.setThreadPriority(9);
                if (C1468b.this.f10465c) {
                    StrictMode.setThreadPolicy(new Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    C1468b.this.f10464b.mo8962a(th);
                }
            }
        }

        C1468b(String str, C1470c cVar, boolean z) {
            this.f10463a = str;
            this.f10464b = cVar;
            this.f10465c = z;
        }

        public synchronized Thread newThread(Runnable runnable) {
            C1469a aVar;
            StringBuilder sb = new StringBuilder();
            sb.append("glide-");
            sb.append(this.f10463a);
            sb.append("-thread-");
            sb.append(this.f10466d);
            aVar = new C1469a(runnable, sb.toString());
            this.f10466d++;
            return aVar;
        }
    }

    /* renamed from: com.bumptech.glide.load.n.c0.a$c */
    /* compiled from: GlideExecutor */
    public interface C1470c {

        /* renamed from: a */
        public static final C1470c f10468a = new C1471a();

        /* renamed from: b */
        public static final C1470c f10469b;

        /* renamed from: c */
        public static final C1470c f10470c = new C1473c();

        /* renamed from: d */
        public static final C1470c f10471d;

        /* renamed from: com.bumptech.glide.load.n.c0.a$c$a */
        /* compiled from: GlideExecutor */
        class C1471a implements C1470c {
            C1471a() {
            }

            /* renamed from: a */
            public void mo8962a(Throwable th) {
            }
        }

        /* renamed from: com.bumptech.glide.load.n.c0.a$c$b */
        /* compiled from: GlideExecutor */
        class C1472b implements C1470c {
            C1472b() {
            }

            /* renamed from: a */
            public void mo8962a(Throwable th) {
                if (th != null) {
                    String str = "GlideExecutor";
                    if (Log.isLoggable(str, 6)) {
                        Log.e(str, "Request threw uncaught throwable", th);
                    }
                }
            }
        }

        /* renamed from: com.bumptech.glide.load.n.c0.a$c$c */
        /* compiled from: GlideExecutor */
        class C1473c implements C1470c {
            C1473c() {
            }

            /* renamed from: a */
            public void mo8962a(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            C1472b bVar = new C1472b();
            f10469b = bVar;
            f10471d = bVar;
        }

        /* renamed from: a */
        void mo8962a(Throwable th);
    }

    GlideExecutor(ExecutorService executorService) {
        this.f10456c = executorService;
    }

    /* renamed from: a */
    public static int m12799a() {
        if (f10455b == 0) {
            f10455b = Math.min(4, RuntimeCompat.m12814a());
        }
        return f10455b;
    }

    /* renamed from: b */
    public static C1467a m12800b() {
        return new C1467a(true).mo8959c(m12799a() >= 4 ? 2 : 1).mo8958b("animation");
    }

    /* renamed from: c */
    public static GlideExecutor m12801c() {
        return m12800b().mo8957a();
    }

    /* renamed from: d */
    public static C1467a m12802d() {
        return new C1467a(true).mo8959c(1).mo8958b("disk-cache");
    }

    /* renamed from: e */
    public static GlideExecutor m12803e() {
        return m12802d().mo8957a();
    }

    /* renamed from: f */
    public static C1467a m12804f() {
        return new C1467a(false).mo8959c(m12799a()).mo8958b("source");
    }

    /* renamed from: g */
    public static GlideExecutor m12805g() {
        return m12804f().mo8957a();
    }

    /* renamed from: h */
    public static GlideExecutor m12806h() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, f10454a, TimeUnit.MILLISECONDS, new SynchronousQueue(), new C1468b("source-unlimited", C1470c.f10471d, false));
        return new GlideExecutor(threadPoolExecutor);
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f10456c.awaitTermination(j, timeUnit);
    }

    public void execute(Runnable runnable) {
        this.f10456c.execute(runnable);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f10456c.invokeAll(collection);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return this.f10456c.invokeAny(collection);
    }

    public boolean isShutdown() {
        return this.f10456c.isShutdown();
    }

    public boolean isTerminated() {
        return this.f10456c.isTerminated();
    }

    public void shutdown() {
        this.f10456c.shutdown();
    }

    public List<Runnable> shutdownNow() {
        return this.f10456c.shutdownNow();
    }

    public Future<?> submit(Runnable runnable) {
        return this.f10456c.submit(runnable);
    }

    public String toString() {
        return this.f10456c.toString();
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f10456c.invokeAll(collection, j, timeUnit);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f10456c.invokeAny(collection, j, timeUnit);
    }

    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.f10456c.submit(runnable, t);
    }

    public <T> Future<T> submit(Callable<T> callable) {
        return this.f10456c.submit(callable);
    }
}
