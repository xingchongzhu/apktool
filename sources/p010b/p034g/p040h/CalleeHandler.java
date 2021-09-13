package p010b.p034g.p040h;

import android.os.Handler;
import android.os.Looper;

/* renamed from: b.g.h.b */
class CalleeHandler {
    /* renamed from: a */
    static Handler m5081a() {
        if (Looper.myLooper() == null) {
            return new Handler(Looper.getMainLooper());
        }
        return new Handler();
    }
}
