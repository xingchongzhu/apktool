package com.bumptech.glide.load.p156o;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataFetcher.C1422a;
import com.bumptech.glide.load.p152n.GlideException;
import com.bumptech.glide.load.p156o.ModelLoader.C1535a;
import com.bumptech.glide.p174t.C1638j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p010b.p034g.p042j.C0610e;

/* renamed from: com.bumptech.glide.load.o.q */
class MultiModelLoader<Model, Data> implements ModelLoader<Model, Data> {

    /* renamed from: a */
    private final List<ModelLoader<Model, Data>> f10742a;

    /* renamed from: b */
    private final C0610e<List<Throwable>> f10743b;

    /* renamed from: com.bumptech.glide.load.o.q$a */
    /* compiled from: MultiModelLoader */
    static class C1538a<Data> implements DataFetcher<Data>, C1422a<Data> {

        /* renamed from: a */
        private final List<DataFetcher<Data>> f10744a;

        /* renamed from: b */
        private final C0610e<List<Throwable>> f10745b;

        /* renamed from: c */
        private int f10746c = 0;

        /* renamed from: d */
        private Priority f10747d;

        /* renamed from: e */
        private C1422a<? super Data> f10748e;

        /* renamed from: f */
        private List<Throwable> f10749f;

        /* renamed from: g */
        private boolean f10750g;

        C1538a(List<DataFetcher<Data>> list, C0610e<List<Throwable>> eVar) {
            this.f10745b = eVar;
            C1638j.m14080c(list);
            this.f10744a = list;
        }

        /* renamed from: g */
        private void m13149g() {
            if (!this.f10750g) {
                if (this.f10746c < this.f10744a.size() - 1) {
                    this.f10746c++;
                    mo8790f(this.f10747d, this.f10748e);
                } else {
                    C1638j.m14081d(this.f10749f);
                    this.f10748e.mo8796c(new GlideException("Fetch failed", (List<Throwable>) new ArrayList<Throwable>(this.f10749f)));
                }
            }
        }

        /* renamed from: a */
        public Class<Data> mo8780a() {
            return ((DataFetcher) this.f10744a.get(0)).mo8780a();
        }

        /* renamed from: b */
        public void mo8785b() {
            List<Throwable> list = this.f10749f;
            if (list != null) {
                this.f10745b.mo4945a(list);
            }
            this.f10749f = null;
            for (DataFetcher b : this.f10744a) {
                b.mo8785b();
            }
        }

        /* renamed from: c */
        public void mo8796c(Exception exc) {
            ((List) C1638j.m14081d(this.f10749f)).add(exc);
            m13149g();
        }

        public void cancel() {
            this.f10750g = true;
            for (DataFetcher cancel : this.f10744a) {
                cancel.cancel();
            }
        }

        /* renamed from: d */
        public void mo8797d(Data data) {
            if (data != null) {
                this.f10748e.mo8797d(data);
            } else {
                m13149g();
            }
        }

        /* renamed from: e */
        public DataSource mo8789e() {
            return ((DataFetcher) this.f10744a.get(0)).mo8789e();
        }

        /* renamed from: f */
        public void mo8790f(Priority gVar, C1422a<? super Data> aVar) {
            this.f10747d = gVar;
            this.f10748e = aVar;
            this.f10749f = (List) this.f10745b.mo4946b();
            ((DataFetcher) this.f10744a.get(this.f10746c)).mo8790f(gVar, this);
            if (this.f10750g) {
                cancel();
            }
        }
    }

    MultiModelLoader(List<ModelLoader<Model, Data>> list, C0610e<List<Throwable>> eVar) {
        this.f10742a = list;
        this.f10743b = eVar;
    }

    /* renamed from: a */
    public C1535a<Data> mo9093a(Model model, int i, int i2, Options iVar) {
        int size = this.f10742a.size();
        ArrayList arrayList = new ArrayList(size);
        Key gVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            ModelLoader nVar = (ModelLoader) this.f10742a.get(i3);
            if (nVar.mo9094b(model)) {
                C1535a a = nVar.mo9093a(model, i, i2, iVar);
                if (a != null) {
                    gVar = a.f10735a;
                    arrayList.add(a.f10737c);
                }
            }
        }
        if (arrayList.isEmpty() || gVar == null) {
            return null;
        }
        return new C1535a<>(gVar, new C1538a(arrayList, this.f10743b));
    }

    /* renamed from: b */
    public boolean mo9094b(Model model) {
        for (ModelLoader b : this.f10742a) {
            if (b.mo9094b(model)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MultiModelLoader{modelLoaders=");
        sb.append(Arrays.toString(this.f10742a.toArray()));
        sb.append('}');
        return sb.toString();
    }
}
