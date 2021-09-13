package com.bumptech.glide.p169q;

import com.bumptech.glide.p174t.MultiClassKey;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p010b.p025d.ArrayMap;

/* renamed from: com.bumptech.glide.q.d */
public class ModelToResourceClassCache {

    /* renamed from: a */
    private final AtomicReference<MultiClassKey> f11119a = new AtomicReference<>();

    /* renamed from: b */
    private final ArrayMap<MultiClassKey, List<Class<?>>> f11120b = new ArrayMap<>();

    /* renamed from: a */
    public List<Class<?>> mo9436a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        List<Class<?>> list;
        MultiClassKey iVar = (MultiClassKey) this.f11119a.getAndSet(null);
        if (iVar == null) {
            iVar = new MultiClassKey(cls, cls2, cls3);
        } else {
            iVar.mo9580a(cls, cls2, cls3);
        }
        synchronized (this.f11120b) {
            list = (List) this.f11120b.get(iVar);
        }
        this.f11119a.set(iVar);
        return list;
    }

    /* renamed from: b */
    public void mo9437b(Class<?> cls, Class<?> cls2, Class<?> cls3, List<Class<?>> list) {
        synchronized (this.f11120b) {
            this.f11120b.put(new MultiClassKey(cls, cls2, cls3), list);
        }
    }
}
