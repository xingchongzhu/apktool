package com.bumptech.glide.p169q;

import com.bumptech.glide.load.ResourceEncoder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.q.f */
public class ResourceEncoderRegistry {

    /* renamed from: a */
    private final List<C1624a<?>> f11126a = new ArrayList();

    /* renamed from: com.bumptech.glide.q.f$a */
    /* compiled from: ResourceEncoderRegistry */
    private static final class C1624a<T> {

        /* renamed from: a */
        private final Class<T> f11127a;

        /* renamed from: b */
        final ResourceEncoder<T> f11128b;

        C1624a(Class<T> cls, ResourceEncoder<T> lVar) {
            this.f11127a = cls;
            this.f11128b = lVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo9445a(Class<?> cls) {
            return this.f11127a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized <Z> void mo9443a(Class<Z> cls, ResourceEncoder<Z> lVar) {
        this.f11126a.add(new C1624a(cls, lVar));
    }

    /* renamed from: b */
    public synchronized <Z> ResourceEncoder<Z> mo9444b(Class<Z> cls) {
        int size = this.f11126a.size();
        for (int i = 0; i < size; i++) {
            C1624a aVar = (C1624a) this.f11126a.get(i);
            if (aVar.mo9445a(cls)) {
                return aVar.f11128b;
            }
        }
        return null;
    }
}
