package com.efs.sdk.base.p176a.p187h.p188a;

import com.efs.sdk.base.p176a.p187h.C1728d;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;
import java.util.concurrent.TimeUnit;

/* renamed from: com.efs.sdk.base.a.h.a.d */
public final class C1717d {

    /* renamed from: a */
    private static ThreadPoolExecutor f11395a;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 10, TimeUnit.MINUTES, new LinkedBlockingQueue(Integer.MAX_VALUE), new DiscardOldestPolicy());
        f11395a = threadPoolExecutor;
    }

    /* renamed from: a */
    public static Future<?> m14271a(Runnable runnable) {
        try {
            return f11395a.submit(runnable);
        } catch (Throwable th) {
            C1728d.m14309b("efs.util.concurrent", "submit task error!", th);
            return null;
        }
    }
}
