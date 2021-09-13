package com.bumptech.glide.p170r;

import com.bumptech.glide.p170r.RequestCoordinator.C1625a;

/* renamed from: com.bumptech.glide.r.i */
public class ThumbnailRequestCoordinator implements RequestCoordinator, Request {

    /* renamed from: a */
    private final RequestCoordinator f11205a;

    /* renamed from: b */
    private final Object f11206b;

    /* renamed from: c */
    private volatile Request f11207c;

    /* renamed from: d */
    private volatile Request f11208d;

    /* renamed from: e */
    private C1625a f11209e;

    /* renamed from: f */
    private C1625a f11210f;

    /* renamed from: g */
    private boolean f11211g;

    public ThumbnailRequestCoordinator(Object obj, RequestCoordinator dVar) {
        C1625a aVar = C1625a.CLEARED;
        this.f11209e = aVar;
        this.f11210f = aVar;
        this.f11206b = obj;
        this.f11205a = dVar;
    }

    /* renamed from: m */
    private boolean m13963m() {
        RequestCoordinator dVar = this.f11205a;
        return dVar == null || dVar.mo9512l(this);
    }

    /* renamed from: n */
    private boolean m13964n() {
        RequestCoordinator dVar = this.f11205a;
        return dVar == null || dVar.mo9506g(this);
    }

    /* renamed from: o */
    private boolean m13965o() {
        RequestCoordinator dVar = this.f11205a;
        return dVar == null || dVar.mo9507h(this);
    }

    /* renamed from: a */
    public RequestCoordinator mo9499a() {
        RequestCoordinator a;
        synchronized (this.f11206b) {
            RequestCoordinator dVar = this.f11205a;
            a = dVar != null ? dVar.mo9499a() : this;
        }
        return a;
    }

    /* renamed from: b */
    public boolean mo9500b() {
        boolean z;
        synchronized (this.f11206b) {
            if (!this.f11208d.mo9500b()) {
                if (!this.f11207c.mo9500b()) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9501c(com.bumptech.glide.p170r.Request r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f11206b
            monitor-enter(r0)
            com.bumptech.glide.r.c r1 = r2.f11207c     // Catch:{ all -> 0x001e }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x001e }
            if (r3 != 0) goto L_0x0011
            com.bumptech.glide.r.d$a r3 = com.bumptech.glide.p170r.RequestCoordinator.C1625a.FAILED     // Catch:{ all -> 0x001e }
            r2.f11210f = r3     // Catch:{ all -> 0x001e }
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x0011:
            com.bumptech.glide.r.d$a r3 = com.bumptech.glide.p170r.RequestCoordinator.C1625a.FAILED     // Catch:{ all -> 0x001e }
            r2.f11209e = r3     // Catch:{ all -> 0x001e }
            com.bumptech.glide.r.d r3 = r2.f11205a     // Catch:{ all -> 0x001e }
            if (r3 == 0) goto L_0x001c
            r3.mo9501c(r2)     // Catch:{ all -> 0x001e }
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x001e:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p170r.ThumbnailRequestCoordinator.mo9501c(com.bumptech.glide.r.c):void");
    }

    public void clear() {
        synchronized (this.f11206b) {
            this.f11211g = false;
            C1625a aVar = C1625a.CLEARED;
            this.f11209e = aVar;
            this.f11210f = aVar;
            this.f11208d.clear();
            this.f11207c.clear();
        }
    }

    /* renamed from: d */
    public void mo9503d() {
        synchronized (this.f11206b) {
            if (!this.f11210f.mo9514a()) {
                this.f11210f = C1625a.PAUSED;
                this.f11208d.mo9503d();
            }
            if (!this.f11209e.mo9514a()) {
                this.f11209e = C1625a.PAUSED;
                this.f11207c.mo9503d();
            }
        }
    }

    /* renamed from: e */
    public boolean mo9504e(Request cVar) {
        if (!(cVar instanceof ThumbnailRequestCoordinator)) {
            return false;
        }
        ThumbnailRequestCoordinator iVar = (ThumbnailRequestCoordinator) cVar;
        if (this.f11207c == null) {
            if (iVar.f11207c != null) {
                return false;
            }
        } else if (!this.f11207c.mo9504e(iVar.f11207c)) {
            return false;
        }
        if (this.f11208d == null) {
            if (iVar.f11208d != null) {
                return false;
            }
        } else if (!this.f11208d.mo9504e(iVar.f11208d)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public boolean mo9505f() {
        boolean z;
        synchronized (this.f11206b) {
            z = this.f11209e == C1625a.CLEARED;
        }
        return z;
    }

    /* renamed from: g */
    public boolean mo9506g(Request cVar) {
        boolean z;
        synchronized (this.f11206b) {
            z = m13964n() && cVar.equals(this.f11207c) && !mo9500b();
        }
        return z;
    }

    /* renamed from: h */
    public boolean mo9507h(Request cVar) {
        boolean z;
        synchronized (this.f11206b) {
            z = m13965o() && (cVar.equals(this.f11207c) || this.f11209e != C1625a.SUCCESS);
        }
        return z;
    }

    /* renamed from: i */
    public void mo9508i() {
        synchronized (this.f11206b) {
            this.f11211g = true;
            try {
                if (this.f11209e != C1625a.SUCCESS) {
                    C1625a aVar = this.f11210f;
                    C1625a aVar2 = C1625a.RUNNING;
                    if (aVar != aVar2) {
                        this.f11210f = aVar2;
                        this.f11208d.mo9508i();
                    }
                }
                if (this.f11211g) {
                    C1625a aVar3 = this.f11209e;
                    C1625a aVar4 = C1625a.RUNNING;
                    if (aVar3 != aVar4) {
                        this.f11209e = aVar4;
                        this.f11207c.mo9508i();
                    }
                }
            } finally {
                this.f11211g = false;
            }
        }
    }

    public boolean isRunning() {
        boolean z;
        synchronized (this.f11206b) {
            z = this.f11209e == C1625a.RUNNING;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        return;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9510j(com.bumptech.glide.p170r.Request r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f11206b
            monitor-enter(r0)
            com.bumptech.glide.r.c r1 = r2.f11208d     // Catch:{ all -> 0x002b }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x0011
            com.bumptech.glide.r.d$a r3 = com.bumptech.glide.p170r.RequestCoordinator.C1625a.SUCCESS     // Catch:{ all -> 0x002b }
            r2.f11210f = r3     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x0011:
            com.bumptech.glide.r.d$a r3 = com.bumptech.glide.p170r.RequestCoordinator.C1625a.SUCCESS     // Catch:{ all -> 0x002b }
            r2.f11209e = r3     // Catch:{ all -> 0x002b }
            com.bumptech.glide.r.d r3 = r2.f11205a     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x001c
            r3.mo9510j(r2)     // Catch:{ all -> 0x002b }
        L_0x001c:
            com.bumptech.glide.r.d$a r3 = r2.f11210f     // Catch:{ all -> 0x002b }
            boolean r3 = r3.mo9514a()     // Catch:{ all -> 0x002b }
            if (r3 != 0) goto L_0x0029
            com.bumptech.glide.r.c r3 = r2.f11208d     // Catch:{ all -> 0x002b }
            r3.clear()     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p170r.ThumbnailRequestCoordinator.mo9510j(com.bumptech.glide.r.c):void");
    }

    /* renamed from: k */
    public boolean mo9511k() {
        boolean z;
        synchronized (this.f11206b) {
            z = this.f11209e == C1625a.SUCCESS;
        }
        return z;
    }

    /* renamed from: l */
    public boolean mo9512l(Request cVar) {
        boolean z;
        synchronized (this.f11206b) {
            z = m13963m() && cVar.equals(this.f11207c) && this.f11209e != C1625a.PAUSED;
        }
        return z;
    }

    /* renamed from: p */
    public void mo9521p(Request cVar, Request cVar2) {
        this.f11207c = cVar;
        this.f11208d = cVar2;
    }
}
