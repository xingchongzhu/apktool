package com.bumptech.glide.p170r;

import com.bumptech.glide.p170r.RequestCoordinator.C1625a;

/* renamed from: com.bumptech.glide.r.b */
public final class ErrorRequestCoordinator implements RequestCoordinator, Request {

    /* renamed from: a */
    private final Object f11155a;

    /* renamed from: b */
    private final RequestCoordinator f11156b;

    /* renamed from: c */
    private volatile Request f11157c;

    /* renamed from: d */
    private volatile Request f11158d;

    /* renamed from: e */
    private C1625a f11159e;

    /* renamed from: f */
    private C1625a f11160f;

    public ErrorRequestCoordinator(Object obj, RequestCoordinator dVar) {
        C1625a aVar = C1625a.CLEARED;
        this.f11159e = aVar;
        this.f11160f = aVar;
        this.f11155a = obj;
        this.f11156b = dVar;
    }

    /* renamed from: m */
    private boolean m13896m(Request cVar) {
        return cVar.equals(this.f11157c) || (this.f11159e == C1625a.FAILED && cVar.equals(this.f11158d));
    }

    /* renamed from: n */
    private boolean m13897n() {
        RequestCoordinator dVar = this.f11156b;
        return dVar == null || dVar.mo9512l(this);
    }

    /* renamed from: o */
    private boolean m13898o() {
        RequestCoordinator dVar = this.f11156b;
        return dVar == null || dVar.mo9506g(this);
    }

    /* renamed from: p */
    private boolean m13899p() {
        RequestCoordinator dVar = this.f11156b;
        return dVar == null || dVar.mo9507h(this);
    }

    /* renamed from: a */
    public RequestCoordinator mo9499a() {
        RequestCoordinator a;
        synchronized (this.f11155a) {
            RequestCoordinator dVar = this.f11156b;
            a = dVar != null ? dVar.mo9499a() : this;
        }
        return a;
    }

    /* renamed from: b */
    public boolean mo9500b() {
        boolean z;
        synchronized (this.f11155a) {
            if (!this.f11157c.mo9500b()) {
                if (!this.f11158d.mo9500b()) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9501c(com.bumptech.glide.p170r.Request r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f11155a
            monitor-enter(r0)
            com.bumptech.glide.r.c r1 = r2.f11158d     // Catch:{ all -> 0x002b }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x002b }
            if (r3 != 0) goto L_0x001e
            com.bumptech.glide.r.d$a r3 = com.bumptech.glide.p170r.RequestCoordinator.C1625a.FAILED     // Catch:{ all -> 0x002b }
            r2.f11159e = r3     // Catch:{ all -> 0x002b }
            com.bumptech.glide.r.d$a r3 = r2.f11160f     // Catch:{ all -> 0x002b }
            com.bumptech.glide.r.d$a r1 = com.bumptech.glide.p170r.RequestCoordinator.C1625a.RUNNING     // Catch:{ all -> 0x002b }
            if (r3 == r1) goto L_0x001c
            r2.f11160f = r1     // Catch:{ all -> 0x002b }
            com.bumptech.glide.r.c r3 = r2.f11158d     // Catch:{ all -> 0x002b }
            r3.mo9508i()     // Catch:{ all -> 0x002b }
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x001e:
            com.bumptech.glide.r.d$a r3 = com.bumptech.glide.p170r.RequestCoordinator.C1625a.FAILED     // Catch:{ all -> 0x002b }
            r2.f11160f = r3     // Catch:{ all -> 0x002b }
            com.bumptech.glide.r.d r3 = r2.f11156b     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x0029
            r3.mo9501c(r2)     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p170r.ErrorRequestCoordinator.mo9501c(com.bumptech.glide.r.c):void");
    }

    public void clear() {
        synchronized (this.f11155a) {
            C1625a aVar = C1625a.CLEARED;
            this.f11159e = aVar;
            this.f11157c.clear();
            if (this.f11160f != aVar) {
                this.f11160f = aVar;
                this.f11158d.clear();
            }
        }
    }

    /* renamed from: d */
    public void mo9503d() {
        synchronized (this.f11155a) {
            C1625a aVar = this.f11159e;
            C1625a aVar2 = C1625a.RUNNING;
            if (aVar == aVar2) {
                this.f11159e = C1625a.PAUSED;
                this.f11157c.mo9503d();
            }
            if (this.f11160f == aVar2) {
                this.f11160f = C1625a.PAUSED;
                this.f11158d.mo9503d();
            }
        }
    }

    /* renamed from: e */
    public boolean mo9504e(Request cVar) {
        if (!(cVar instanceof ErrorRequestCoordinator)) {
            return false;
        }
        ErrorRequestCoordinator bVar = (ErrorRequestCoordinator) cVar;
        if (!this.f11157c.mo9504e(bVar.f11157c) || !this.f11158d.mo9504e(bVar.f11158d)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public boolean mo9505f() {
        boolean z;
        synchronized (this.f11155a) {
            C1625a aVar = this.f11159e;
            C1625a aVar2 = C1625a.CLEARED;
            z = aVar == aVar2 && this.f11160f == aVar2;
        }
        return z;
    }

    /* renamed from: g */
    public boolean mo9506g(Request cVar) {
        boolean z;
        synchronized (this.f11155a) {
            z = m13898o() && m13896m(cVar);
        }
        return z;
    }

    /* renamed from: h */
    public boolean mo9507h(Request cVar) {
        boolean z;
        synchronized (this.f11155a) {
            z = m13899p() && m13896m(cVar);
        }
        return z;
    }

    /* renamed from: i */
    public void mo9508i() {
        synchronized (this.f11155a) {
            C1625a aVar = this.f11159e;
            C1625a aVar2 = C1625a.RUNNING;
            if (aVar != aVar2) {
                this.f11159e = aVar2;
                this.f11157c.mo9508i();
            }
        }
    }

    public boolean isRunning() {
        boolean z;
        synchronized (this.f11155a) {
            C1625a aVar = this.f11159e;
            C1625a aVar2 = C1625a.RUNNING;
            if (aVar != aVar2) {
                if (this.f11160f != aVar2) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: j */
    public void mo9510j(Request cVar) {
        synchronized (this.f11155a) {
            if (cVar.equals(this.f11157c)) {
                this.f11159e = C1625a.SUCCESS;
            } else if (cVar.equals(this.f11158d)) {
                this.f11160f = C1625a.SUCCESS;
            }
            RequestCoordinator dVar = this.f11156b;
            if (dVar != null) {
                dVar.mo9510j(this);
            }
        }
    }

    /* renamed from: k */
    public boolean mo9511k() {
        boolean z;
        synchronized (this.f11155a) {
            C1625a aVar = this.f11159e;
            C1625a aVar2 = C1625a.SUCCESS;
            if (aVar != aVar2) {
                if (this.f11160f != aVar2) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: l */
    public boolean mo9512l(Request cVar) {
        boolean z;
        synchronized (this.f11155a) {
            z = m13897n() && m13896m(cVar);
        }
        return z;
    }

    /* renamed from: q */
    public void mo9513q(Request cVar, Request cVar2) {
        this.f11157c = cVar;
        this.f11158d = cVar2;
    }
}
