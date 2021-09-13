package p271e;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p271e.p272f0.C3310c;

/* renamed from: e.n */
public final class Dispatcher {

    /* renamed from: a */
    private int f18605a = 64;

    /* renamed from: b */
    private int f18606b = 5;

    /* renamed from: c */
    private Runnable f18607c;

    /* renamed from: d */
    private ExecutorService f18608d;

    /* renamed from: e */
    private final Deque<C3377b> f18609e = new ArrayDeque();

    /* renamed from: f */
    private final Deque<C3377b> f18610f = new ArrayDeque();

    /* renamed from: g */
    private final Deque<RealCall> f18611g = new ArrayDeque();

    /* renamed from: d */
    private <T> void m23568d(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t)) {
                runnable = this.f18607c;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (!m23569g() && runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: g */
    private boolean m23569g() {
        int i;
        boolean z;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.f18609e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C3377b bVar = (C3377b) it.next();
                if (this.f18610f.size() >= this.f18605a) {
                    break;
                } else if (m23570k(bVar) < this.f18606b) {
                    it.remove();
                    arrayList.add(bVar);
                    this.f18610f.add(bVar);
                }
            }
            z = mo20019j() > 0;
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((C3377b) arrayList.get(i)).mo20136l(mo20014c());
        }
        return z;
    }

    /* renamed from: k */
    private int m23570k(C3377b bVar) {
        int i = 0;
        for (C3377b bVar2 : this.f18610f) {
            if (!bVar2.mo20137m().f18721f && bVar2.mo20138n().equals(bVar.mo20138n())) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo20012a(C3377b bVar) {
        synchronized (this) {
            this.f18609e.add(bVar);
        }
        m23569g();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized void mo20013b(RealCall yVar) {
        this.f18611g.add(yVar);
    }

    /* renamed from: c */
    public synchronized ExecutorService mo20014c() {
        if (this.f18608d == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C3310c.m23043F("OkHttp Dispatcher", false));
            this.f18608d = threadPoolExecutor;
        }
        return this.f18608d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo20015e(C3377b bVar) {
        m23568d(this.f18610f, bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo20016f(RealCall yVar) {
        m23568d(this.f18611g, yVar);
    }

    /* renamed from: h */
    public synchronized List<Call> mo20017h() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C3377b m : this.f18609e) {
            arrayList.add(m.mo20137m());
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: i */
    public synchronized List<Call> mo20018i() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        arrayList.addAll(this.f18611g);
        for (C3377b m : this.f18610f) {
            arrayList.add(m.mo20137m());
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: j */
    public synchronized int mo20019j() {
        return this.f18610f.size() + this.f18611g.size();
    }
}
