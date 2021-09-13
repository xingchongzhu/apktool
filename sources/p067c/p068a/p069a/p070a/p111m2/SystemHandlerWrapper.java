package p067c.p068a.p069a.p070a.p111m2;

import android.os.Handler;
import android.os.Message;

/* renamed from: c.a.a.a.m2.h0 */
final class SystemHandlerWrapper implements HandlerWrapper {

    /* renamed from: a */
    private final Handler f8371a;

    public SystemHandlerWrapper(Handler handler) {
        this.f8371a = handler;
    }

    /* renamed from: a */
    public boolean mo7426a(int i) {
        return this.f8371a.hasMessages(i);
    }

    /* renamed from: b */
    public Message mo7427b(int i, int i2, int i3) {
        return this.f8371a.obtainMessage(i, i2, i3);
    }

    /* renamed from: c */
    public boolean mo7428c(int i) {
        return this.f8371a.sendEmptyMessage(i);
    }

    /* renamed from: d */
    public Message mo7429d(int i, int i2, int i3, Object obj) {
        return this.f8371a.obtainMessage(i, i2, i3, obj);
    }

    /* renamed from: e */
    public boolean mo7430e(int i, long j) {
        return this.f8371a.sendEmptyMessageAtTime(i, j);
    }

    /* renamed from: f */
    public void mo7431f(int i) {
        this.f8371a.removeMessages(i);
    }

    /* renamed from: g */
    public Message mo7432g(int i, Object obj) {
        return this.f8371a.obtainMessage(i, obj);
    }

    /* renamed from: h */
    public void mo7433h(Object obj) {
        this.f8371a.removeCallbacksAndMessages(obj);
    }

    /* renamed from: i */
    public boolean mo7434i(Runnable runnable) {
        return this.f8371a.post(runnable);
    }

    /* renamed from: j */
    public Message mo7435j(int i) {
        return this.f8371a.obtainMessage(i);
    }
}
