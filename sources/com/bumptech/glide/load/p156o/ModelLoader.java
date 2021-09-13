package com.bumptech.glide.load.p156o;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.p174t.C1638j;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bumptech.glide.load.o.n */
public interface ModelLoader<Model, Data> {

    /* renamed from: com.bumptech.glide.load.o.n$a */
    /* compiled from: ModelLoader */
    public static class C1535a<Data> {

        /* renamed from: a */
        public final Key f10735a;

        /* renamed from: b */
        public final List<Key> f10736b;

        /* renamed from: c */
        public final DataFetcher<Data> f10737c;

        public C1535a(Key gVar, DataFetcher<Data> dVar) {
            this(gVar, Collections.emptyList(), dVar);
        }

        public C1535a(Key gVar, List<Key> list, DataFetcher<Data> dVar) {
            this.f10735a = (Key) C1638j.m14081d(gVar);
            this.f10736b = (List) C1638j.m14081d(list);
            this.f10737c = (DataFetcher) C1638j.m14081d(dVar);
        }
    }

    /* renamed from: a */
    C1535a<Data> mo9093a(Model model, int i, int i2, Options iVar);

    /* renamed from: b */
    boolean mo9094b(Model model);
}
