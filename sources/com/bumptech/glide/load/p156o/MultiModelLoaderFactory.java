package com.bumptech.glide.load.p156o;

import com.bumptech.glide.Registry.C1414c;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.p156o.ModelLoader.C1535a;
import com.bumptech.glide.p174t.C1638j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p010b.p034g.p042j.C0610e;

/* renamed from: com.bumptech.glide.load.o.r */
public class MultiModelLoaderFactory {

    /* renamed from: a */
    private static final C1541c f10751a = new C1541c();

    /* renamed from: b */
    private static final ModelLoader<Object, Object> f10752b = new C1539a();

    /* renamed from: c */
    private final List<C1540b<?, ?>> f10753c;

    /* renamed from: d */
    private final C1541c f10754d;

    /* renamed from: e */
    private final Set<C1540b<?, ?>> f10755e;

    /* renamed from: f */
    private final C0610e<List<Throwable>> f10756f;

    /* renamed from: com.bumptech.glide.load.o.r$a */
    /* compiled from: MultiModelLoaderFactory */
    private static class C1539a implements ModelLoader<Object, Object> {
        C1539a() {
        }

        /* renamed from: a */
        public C1535a<Object> mo9093a(Object obj, int i, int i2, Options iVar) {
            return null;
        }

        /* renamed from: b */
        public boolean mo9094b(Object obj) {
            return false;
        }
    }

    /* renamed from: com.bumptech.glide.load.o.r$b */
    /* compiled from: MultiModelLoaderFactory */
    private static class C1540b<Model, Data> {

        /* renamed from: a */
        private final Class<Model> f10757a;

        /* renamed from: b */
        final Class<Data> f10758b;

        /* renamed from: c */
        final ModelLoaderFactory<? extends Model, ? extends Data> f10759c;

        public C1540b(Class<Model> cls, Class<Data> cls2, ModelLoaderFactory<? extends Model, ? extends Data> oVar) {
            this.f10757a = cls;
            this.f10758b = cls2;
            this.f10759c = oVar;
        }

        /* renamed from: a */
        public boolean mo9155a(Class<?> cls) {
            return this.f10757a.isAssignableFrom(cls);
        }

        /* renamed from: b */
        public boolean mo9156b(Class<?> cls, Class<?> cls2) {
            return mo9155a(cls) && this.f10758b.isAssignableFrom(cls2);
        }
    }

    /* renamed from: com.bumptech.glide.load.o.r$c */
    /* compiled from: MultiModelLoaderFactory */
    static class C1541c {
        C1541c() {
        }

        /* renamed from: a */
        public <Model, Data> MultiModelLoader<Model, Data> mo9157a(List<ModelLoader<Model, Data>> list, C0610e<List<Throwable>> eVar) {
            return new MultiModelLoader<>(list, eVar);
        }
    }

    public MultiModelLoaderFactory(C0610e<List<Throwable>> eVar) {
        this(eVar, f10751a);
    }

    /* renamed from: a */
    private <Model, Data> void m13156a(Class<Model> cls, Class<Data> cls2, ModelLoaderFactory<? extends Model, ? extends Data> oVar, boolean z) {
        C1540b bVar = new C1540b(cls, cls2, oVar);
        List<C1540b<?, ?>> list = this.f10753c;
        list.add(z ? list.size() : 0, bVar);
    }

    /* renamed from: c */
    private <Model, Data> ModelLoader<Model, Data> m13157c(C1540b<?, ?> bVar) {
        return (ModelLoader) C1638j.m14081d(bVar.f10759c.mo9098b(this));
    }

    /* renamed from: f */
    private static <Model, Data> ModelLoader<Model, Data> m13158f() {
        return f10752b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized <Model, Data> void mo9151b(Class<Model> cls, Class<Data> cls2, ModelLoaderFactory<? extends Model, ? extends Data> oVar) {
        m13156a(cls, cls2, oVar, true);
    }

    /* renamed from: d */
    public synchronized <Model, Data> ModelLoader<Model, Data> mo9152d(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C1540b bVar : this.f10753c) {
                if (this.f10755e.contains(bVar)) {
                    z = true;
                } else if (bVar.mo9156b(cls, cls2)) {
                    this.f10755e.add(bVar);
                    arrayList.add(m13157c(bVar));
                    this.f10755e.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f10754d.mo9157a(arrayList, this.f10756f);
            } else if (arrayList.size() == 1) {
                return (ModelLoader) arrayList.get(0);
            } else if (z) {
                return m13158f();
            } else {
                throw new C1414c(cls, cls2);
            }
        } catch (Throwable th) {
            this.f10755e.clear();
            throw th;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public synchronized <Model> List<ModelLoader<Model, ?>> mo9153e(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (C1540b bVar : this.f10753c) {
                if (!this.f10755e.contains(bVar)) {
                    if (bVar.mo9155a(cls)) {
                        this.f10755e.add(bVar);
                        arrayList.add(m13157c(bVar));
                        this.f10755e.remove(bVar);
                    }
                }
            }
        } catch (Throwable th) {
            this.f10755e.clear();
            throw th;
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public synchronized List<Class<?>> mo9154g(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C1540b bVar : this.f10753c) {
            if (!arrayList.contains(bVar.f10758b) && bVar.mo9155a(cls)) {
                arrayList.add(bVar.f10758b);
            }
        }
        return arrayList;
    }

    MultiModelLoaderFactory(C0610e<List<Throwable>> eVar, C1541c cVar) {
        this.f10753c = new ArrayList();
        this.f10755e = new HashSet();
        this.f10756f = eVar;
        this.f10754d = cVar;
    }
}
