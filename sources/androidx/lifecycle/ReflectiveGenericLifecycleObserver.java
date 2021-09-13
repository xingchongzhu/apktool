package androidx.lifecycle;

import androidx.lifecycle.Lifecycle.C0377b;

class ReflectiveGenericLifecycleObserver implements LifecycleEventObserver {

    /* renamed from: a */
    private final Object f2618a;

    /* renamed from: b */
    private final C0373a f2619b;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f2618a = obj;
        this.f2619b = ClassesInfoCache.f2624a.mo2986c(obj.getClass());
    }

    /* renamed from: c */
    public void mo154c(LifecycleOwner iVar, C0377b bVar) {
        this.f2619b.mo2988a(iVar, bVar, this.f2618a);
    }
}
