package p067c.p068a.p069a.p070a.p111m2;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;

/* renamed from: c.a.a.a.m2.g0 */
public class SystemClock implements Clock {
    protected SystemClock() {
    }

    /* renamed from: a */
    public long mo7423a() {
        return android.os.SystemClock.uptimeMillis();
    }

    /* renamed from: b */
    public HandlerWrapper mo7424b(Looper looper, Callback callback) {
        return new SystemHandlerWrapper(new Handler(looper, callback));
    }

    /* renamed from: c */
    public long mo7425c() {
        return android.os.SystemClock.elapsedRealtime();
    }
}
