package com.bumptech.glide.load.p152n.p153a0;

import com.bumptech.glide.load.p152n.p153a0.Poolable;
import com.bumptech.glide.p174t.C1639k;
import java.util.Queue;

/* renamed from: com.bumptech.glide.load.n.a0.d */
abstract class BaseKeyPool<T extends Poolable> {

    /* renamed from: a */
    private final Queue<T> f10372a = C1639k.m14087e(20);

    BaseKeyPool() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract T mo8875a();

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public T mo8878b() {
        T t = (Poolable) this.f10372a.poll();
        return t == null ? mo8875a() : t;
    }

    /* renamed from: c */
    public void mo8879c(T t) {
        if (this.f10372a.size() < 20) {
            this.f10372a.offer(t);
        }
    }
}
