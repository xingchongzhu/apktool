package com.bumptech.glide.load.p156o;

import com.bumptech.glide.Registry.C1414c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p010b.p034g.p042j.C0610e;

/* renamed from: com.bumptech.glide.load.o.p */
public class ModelLoaderRegistry {

    /* renamed from: a */
    private final MultiModelLoaderFactory f10738a;

    /* renamed from: b */
    private final C1536a f10739b;

    /* renamed from: com.bumptech.glide.load.o.p$a */
    /* compiled from: ModelLoaderRegistry */
    private static class C1536a {

        /* renamed from: a */
        private final Map<Class<?>, C1537a<?>> f10740a = new HashMap();

        /* renamed from: com.bumptech.glide.load.o.p$a$a */
        /* compiled from: ModelLoaderRegistry */
        private static class C1537a<Model> {

            /* renamed from: a */
            final List<ModelLoader<Model, ?>> f10741a;

            public C1537a(List<ModelLoader<Model, ?>> list) {
                this.f10741a = list;
            }
        }

        C1536a() {
        }

        /* renamed from: a */
        public void mo9147a() {
            this.f10740a.clear();
        }

        /* renamed from: b */
        public <Model> List<ModelLoader<Model, ?>> mo9148b(Class<Model> cls) {
            C1537a aVar = (C1537a) this.f10740a.get(cls);
            if (aVar == null) {
                return null;
            }
            return aVar.f10741a;
        }

        /* renamed from: c */
        public <Model> void mo9149c(Class<Model> cls, List<ModelLoader<Model, ?>> list) {
            if (((C1537a) this.f10740a.put(cls, new C1537a(list))) != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Already cached loaders for model: ");
                sb.append(cls);
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    public ModelLoaderRegistry(C0610e<List<Throwable>> eVar) {
        this(new MultiModelLoaderFactory(eVar));
    }

    /* renamed from: b */
    private static <A> Class<A> m13139b(A a) {
        return a.getClass();
    }

    /* renamed from: e */
    private synchronized <A> List<ModelLoader<A, ?>> m13140e(Class<A> cls) {
        List<ModelLoader<A, ?>> b;
        b = this.f10739b.mo9148b(cls);
        if (b == null) {
            b = Collections.unmodifiableList(this.f10738a.mo9153e(cls));
            this.f10739b.mo9149c(cls, b);
        }
        return b;
    }

    /* renamed from: a */
    public synchronized <Model, Data> void mo9144a(Class<Model> cls, Class<Data> cls2, ModelLoaderFactory<? extends Model, ? extends Data> oVar) {
        this.f10738a.mo9151b(cls, cls2, oVar);
        this.f10739b.mo9147a();
    }

    /* renamed from: c */
    public synchronized List<Class<?>> mo9145c(Class<?> cls) {
        return this.f10738a.mo9154g(cls);
    }

    /* renamed from: d */
    public <A> List<ModelLoader<A, ?>> mo9146d(A a) {
        List e = m13140e(m13139b(a));
        if (!e.isEmpty()) {
            int size = e.size();
            List<ModelLoader<A, ?>> emptyList = Collections.emptyList();
            boolean z = true;
            for (int i = 0; i < size; i++) {
                ModelLoader nVar = (ModelLoader) e.get(i);
                if (nVar.mo9094b(a)) {
                    if (z) {
                        emptyList = new ArrayList<>(size - i);
                        z = false;
                    }
                    emptyList.add(nVar);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new C1414c(a, e);
        }
        throw new C1414c(a);
    }

    private ModelLoaderRegistry(MultiModelLoaderFactory rVar) {
        this.f10739b = new C1536a();
        this.f10738a = rVar;
    }
}
