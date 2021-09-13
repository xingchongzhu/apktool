package p067c.p068a.p069a.p070a.p111m2;

import java.util.Collections;
import java.util.PriorityQueue;

/* renamed from: c.a.a.a.m2.c0 */
public final class PriorityTaskManager {

    /* renamed from: a */
    private final Object f8346a = new Object();

    /* renamed from: b */
    private final PriorityQueue<Integer> f8347b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* renamed from: c */
    private int f8348c = Integer.MIN_VALUE;

    /* renamed from: a */
    public void mo7413a(int i) {
        synchronized (this.f8346a) {
            this.f8347b.add(Integer.valueOf(i));
            this.f8348c = Math.max(this.f8348c, i);
        }
    }

    /* renamed from: b */
    public void mo7414b(int i) {
        synchronized (this.f8346a) {
            this.f8347b.remove(Integer.valueOf(i));
            this.f8348c = this.f8347b.isEmpty() ? Integer.MIN_VALUE : ((Integer) Util.m10293i((Integer) this.f8347b.peek())).intValue();
            this.f8346a.notifyAll();
        }
    }
}
