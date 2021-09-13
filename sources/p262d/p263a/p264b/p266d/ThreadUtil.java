package p262d.p263a.p264b.p266d;

import android.os.Looper;

/* renamed from: d.a.b.d.a */
public final class ThreadUtil {

    /* renamed from: a */
    private static Thread f17981a;

    /* renamed from: a */
    public static void m22890a() {
        if (!m22891b()) {
            throw new IllegalStateException("Must be called on the Main thread.");
        }
    }

    /* renamed from: b */
    public static boolean m22891b() {
        if (f17981a == null) {
            f17981a = Looper.getMainLooper().getThread();
        }
        return Thread.currentThread() == f17981a;
    }
}
