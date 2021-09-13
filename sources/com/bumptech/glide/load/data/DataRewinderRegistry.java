package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.DataRewinder.C1423a;
import com.bumptech.glide.p174t.C1638j;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.data.f */
public class DataRewinderRegistry {

    /* renamed from: a */
    private static final C1423a<?> f10300a = new C1424a();

    /* renamed from: b */
    private final Map<Class<?>, C1423a<?>> f10301b = new HashMap();

    /* renamed from: com.bumptech.glide.load.data.f$a */
    /* compiled from: DataRewinderRegistry */
    class C1424a implements C1423a<Object> {
        C1424a() {
        }

        /* renamed from: a */
        public Class<Object> mo8777a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        /* renamed from: b */
        public DataRewinder<Object> mo8778b(Object obj) {
            return new C1425b(obj);
        }
    }

    /* renamed from: com.bumptech.glide.load.data.f$b */
    /* compiled from: DataRewinderRegistry */
    private static final class C1425b implements DataRewinder<Object> {

        /* renamed from: a */
        private final Object f10302a;

        C1425b(Object obj) {
            this.f10302a = obj;
        }

        /* renamed from: a */
        public Object mo8773a() {
            return this.f10302a;
        }

        /* renamed from: b */
        public void mo8774b() {
        }
    }

    /* renamed from: a */
    public synchronized <T> DataRewinder<T> mo8798a(T t) {
        C1423a aVar;
        C1638j.m14081d(t);
        aVar = (C1423a) this.f10301b.get(t.getClass());
        if (aVar == null) {
            Iterator it = this.f10301b.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C1423a aVar2 = (C1423a) it.next();
                if (aVar2.mo8777a().isAssignableFrom(t.getClass())) {
                    aVar = aVar2;
                    break;
                }
            }
        }
        if (aVar == null) {
            aVar = f10300a;
        }
        return aVar.mo8778b(t);
    }

    /* renamed from: b */
    public synchronized void mo8799b(C1423a<?> aVar) {
        this.f10301b.put(aVar.mo8777a(), aVar);
    }
}
