package com.bumptech.glide.p170r;

/* renamed from: com.bumptech.glide.r.d */
public interface RequestCoordinator {

    /* renamed from: com.bumptech.glide.r.d$a */
    /* compiled from: RequestCoordinator */
    public enum C1625a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);
        

        /* renamed from: g */
        private final boolean f11167g;

        private C1625a(boolean z) {
            this.f11167g = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo9514a() {
            return this.f11167g;
        }
    }

    /* renamed from: a */
    RequestCoordinator mo9499a();

    /* renamed from: b */
    boolean mo9500b();

    /* renamed from: c */
    void mo9501c(Request cVar);

    /* renamed from: g */
    boolean mo9506g(Request cVar);

    /* renamed from: h */
    boolean mo9507h(Request cVar);

    /* renamed from: j */
    void mo9510j(Request cVar);

    /* renamed from: l */
    boolean mo9512l(Request cVar);
}
