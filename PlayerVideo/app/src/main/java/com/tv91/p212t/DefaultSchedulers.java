package com.tv91.p212t;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.tv91.t.a */
public final class DefaultSchedulers implements Schedulers {

    /* renamed from: a */
    private final Executor f14718a = new C2354d();

    /* renamed from: b */
    private final Executor f14719b = new C2352b();

    /* renamed from: c */
    private final Executor f14720c = new C2353c();

    /* renamed from: com.tv91.t.a$b */
    /* compiled from: DefaultSchedulers */
    private static class C2352b implements Executor {

        /* renamed from: a */
        private final ThreadPoolExecutor f14721a;

        private C2352b() {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue());
            this.f14721a = threadPoolExecutor;
        }

        public void execute(Runnable runnable) {
            this.f14721a.execute(runnable);
        }
    }

    /* renamed from: com.tv91.t.a$c */
    /* compiled from: DefaultSchedulers */
    private static class C2353c implements Executor {

        /* renamed from: a */
        private final ExecutorService f14722a;

        private C2353c() {
            this.f14722a = Executors.newFixedThreadPool(5);
        }

        public void execute(Runnable runnable) {
            this.f14722a.execute(runnable);
        }
    }

    /* renamed from: com.tv91.t.a$d */
    /* compiled from: DefaultSchedulers */
    private static class C2354d implements Executor {

        /* renamed from: a */
        private final Handler f14723a;

        private C2354d() {
            this.f14723a = new Handler(Looper.getMainLooper());
        }

        public void execute(Runnable runnable) {
            this.f14723a.post(runnable);
        }
    }

    /* renamed from: a */
    public Executor mo17120a() {
        return this.f14718a;
    }

    /* renamed from: b */
    public Executor mo17121b() {
        return this.f14720c;
    }

    /* renamed from: c */
    public Executor mo17122c() {
        return this.f14719b;
    }
}
