package com.bumptech.glide.load.p156o;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataFetcher.C1422a;
import com.bumptech.glide.load.p156o.ModelLoader.C1535a;
import com.bumptech.glide.p173s.ObjectKey;

/* renamed from: com.bumptech.glide.load.o.v */
public class UnitModelLoader<Model> implements ModelLoader<Model, Model> {

    /* renamed from: a */
    private static final UnitModelLoader<?> f10768a = new UnitModelLoader<>();

    /* renamed from: com.bumptech.glide.load.o.v$a */
    /* compiled from: UnitModelLoader */
    public static class C1549a<Model> implements ModelLoaderFactory<Model, Model> {

        /* renamed from: a */
        private static final C1549a<?> f10769a = new C1549a<>();

        /* renamed from: a */
        public static <T> C1549a<T> m13191a() {
            return f10769a;
        }

        /* renamed from: b */
        public ModelLoader<Model, Model> mo9098b(MultiModelLoaderFactory rVar) {
            return UnitModelLoader.m13188c();
        }
    }

    /* renamed from: com.bumptech.glide.load.o.v$b */
    /* compiled from: UnitModelLoader */
    private static class C1550b<Model> implements DataFetcher<Model> {

        /* renamed from: a */
        private final Model f10770a;

        C1550b(Model model) {
            this.f10770a = model;
        }

        /* renamed from: a */
        public Class<Model> mo8780a() {
            return this.f10770a.getClass();
        }

        /* renamed from: b */
        public void mo8785b() {
        }

        public void cancel() {
        }

        /* renamed from: e */
        public DataSource mo8789e() {
            return DataSource.LOCAL;
        }

        /* renamed from: f */
        public void mo8790f(Priority gVar, C1422a<? super Model> aVar) {
            aVar.mo8797d(this.f10770a);
        }
    }

    /* renamed from: c */
    public static <T> UnitModelLoader<T> m13188c() {
        return f10768a;
    }

    /* renamed from: a */
    public C1535a<Model> mo9093a(Model model, int i, int i2, Options iVar) {
        return new C1535a<>(new ObjectKey(model), new C1550b(model));
    }

    /* renamed from: b */
    public boolean mo9094b(Model model) {
        return true;
    }
}
