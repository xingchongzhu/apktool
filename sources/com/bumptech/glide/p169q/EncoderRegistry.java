package com.bumptech.glide.p169q;

import com.bumptech.glide.load.C1420d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.q.a */
public class EncoderRegistry {

    /* renamed from: a */
    private final List<C1622a<?>> f11112a = new ArrayList();

    /* renamed from: com.bumptech.glide.q.a$a */
    /* compiled from: EncoderRegistry */
    private static final class C1622a<T> {

        /* renamed from: a */
        private final Class<T> f11113a;

        /* renamed from: b */
        final C1420d<T> f11114b;

        C1622a(Class<T> cls, C1420d<T> dVar) {
            this.f11113a = cls;
            this.f11114b = dVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo9430a(Class<?> cls) {
            return this.f11113a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized <T> void mo9428a(Class<T> cls, C1420d<T> dVar) {
        this.f11112a.add(new C1622a(cls, dVar));
    }

    /* renamed from: b */
    public synchronized <T> C1420d<T> mo9429b(Class<T> cls) {
        for (C1622a aVar : this.f11112a) {
            if (aVar.mo9430a(cls)) {
                return aVar.f11114b;
            }
        }
        return null;
    }
}
