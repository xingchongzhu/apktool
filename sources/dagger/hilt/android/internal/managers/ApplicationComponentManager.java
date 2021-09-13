package dagger.hilt.android.internal.managers;

import p262d.p263a.p269c.GeneratedComponentManager;

/* renamed from: dagger.hilt.android.internal.managers.d */
public final class ApplicationComponentManager implements GeneratedComponentManager<Object> {

    /* renamed from: a */
    private volatile Object f18001a;

    /* renamed from: b */
    private final Object f18002b = new Object();

    /* renamed from: c */
    private final ComponentSupplier f18003c;

    public ApplicationComponentManager(ComponentSupplier eVar) {
        this.f18003c = eVar;
    }

    /* renamed from: g */
    public Object mo16498g() {
        if (this.f18001a == null) {
            synchronized (this.f18002b) {
                if (this.f18001a == null) {
                    this.f18001a = this.f18003c.mo16956a();
                }
            }
        }
        return this.f18001a;
    }
}
