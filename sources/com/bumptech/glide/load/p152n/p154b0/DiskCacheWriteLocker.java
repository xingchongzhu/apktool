package com.bumptech.glide.load.p152n.p154b0;

import com.bumptech.glide.p174t.C1638j;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.bumptech.glide.load.n.b0.c */
final class DiskCacheWriteLocker {

    /* renamed from: a */
    private final Map<String, C1457a> f10411a = new HashMap();

    /* renamed from: b */
    private final C1458b f10412b = new C1458b();

    /* renamed from: com.bumptech.glide.load.n.b0.c$a */
    /* compiled from: DiskCacheWriteLocker */
    private static class C1457a {

        /* renamed from: a */
        final Lock f10413a = new ReentrantLock();

        /* renamed from: b */
        int f10414b;

        C1457a() {
        }
    }

    /* renamed from: com.bumptech.glide.load.n.b0.c$b */
    /* compiled from: DiskCacheWriteLocker */
    private static class C1458b {

        /* renamed from: a */
        private final Queue<C1457a> f10415a = new ArrayDeque();

        C1458b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C1457a mo8918a() {
            C1457a aVar;
            synchronized (this.f10415a) {
                aVar = (C1457a) this.f10415a.poll();
            }
            return aVar == null ? new C1457a() : aVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo8919b(C1457a aVar) {
            synchronized (this.f10415a) {
                if (this.f10415a.size() < 10) {
                    this.f10415a.offer(aVar);
                }
            }
        }
    }

    DiskCacheWriteLocker() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8916a(String str) {
        C1457a aVar;
        synchronized (this) {
            aVar = (C1457a) this.f10411a.get(str);
            if (aVar == null) {
                aVar = this.f10412b.mo8918a();
                this.f10411a.put(str, aVar);
            }
            aVar.f10414b++;
        }
        aVar.f10413a.lock();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo8917b(String str) {
        C1457a aVar;
        synchronized (this) {
            aVar = (C1457a) C1638j.m14081d(this.f10411a.get(str));
            int i = aVar.f10414b;
            if (i >= 1) {
                int i2 = i - 1;
                aVar.f10414b = i2;
                if (i2 == 0) {
                    C1457a aVar2 = (C1457a) this.f10411a.remove(str);
                    if (aVar2.equals(aVar)) {
                        this.f10412b.mo8919b(aVar2);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Removed the wrong lock, expected to remove: ");
                        sb.append(aVar);
                        sb.append(", but actually removed: ");
                        sb.append(aVar2);
                        sb.append(", safeKey: ");
                        sb.append(str);
                        throw new IllegalStateException(sb.toString());
                    }
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Cannot release a lock that is not held, safeKey: ");
                sb2.append(str);
                sb2.append(", interestedThreads: ");
                sb2.append(aVar.f10414b);
                throw new IllegalStateException(sb2.toString());
            }
        }
        aVar.f10413a.unlock();
    }
}
