package com.bumptech.glide.p174t;

import java.util.concurrent.Executor;

/* renamed from: com.bumptech.glide.t.e */
public final class Executors {

    /* renamed from: a */
    private static final Executor f11245a = new C1634a();

    /* renamed from: b */
    private static final Executor f11246b = new C1635b();

    /* renamed from: com.bumptech.glide.t.e$a */
    /* compiled from: Executors */
    class C1634a implements Executor {
        C1634a() {
        }

        public void execute(Runnable runnable) {
            C1639k.m14103u(runnable);
        }
    }

    /* renamed from: com.bumptech.glide.t.e$b */
    /* compiled from: Executors */
    class C1635b implements Executor {
        C1635b() {
        }

        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static Executor m14062a() {
        return f11246b;
    }

    /* renamed from: b */
    public static Executor m14063b() {
        return f11245a;
    }
}
