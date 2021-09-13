package com.umeng.umzid;

import android.util.Log;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.umeng.umzid.b */
public class C3288b {

    /* renamed from: a */
    public static volatile ScheduledThreadPoolExecutor f17978a;

    /* renamed from: b */
    public static ThreadFactory f17979b = new C3289a();

    /* renamed from: com.umeng.umzid.b$a */
    public static class C3289a implements ThreadFactory {

        /* renamed from: a */
        public AtomicInteger f17980a = new AtomicInteger(0);

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            StringBuilder sb = new StringBuilder();
            sb.append("ZIDThreadPoolExecutor");
            sb.append(this.f17980a.addAndGet(1));
            thread.setName(sb.toString());
            return thread;
        }
    }

    /* renamed from: a */
    public static ScheduledThreadPoolExecutor m22875a() {
        if (f17978a == null) {
            synchronized (C3288b.class) {
                if (f17978a == null) {
                    f17978a = new ScheduledThreadPoolExecutor(Runtime.getRuntime().availableProcessors() * 4, f17979b);
                }
            }
        }
        return f17978a;
    }

    /* renamed from: a */
    public static void m22876a(Runnable runnable) {
        try {
            m22875a().execute(runnable);
        } catch (Throwable unused) {
            Log.e("com.umeng.umzid.b", "UmengThreadPoolExecutorFactory execute exception");
        }
    }
}
