package com.bumptech.glide.load.p152n;

import android.util.Log;
import com.bumptech.glide.load.C1420d;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataFetcher.C1422a;
import com.bumptech.glide.load.p152n.DataFetcherGenerator.C1475a;
import com.bumptech.glide.load.p156o.ModelLoader.C1535a;
import com.bumptech.glide.p174t.LogTime;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bumptech.glide.load.n.z */
class SourceGenerator implements DataFetcherGenerator, C1475a {

    /* renamed from: a */
    private final DecodeHelper<?> f10676a;

    /* renamed from: b */
    private final C1475a f10677b;

    /* renamed from: c */
    private int f10678c;

    /* renamed from: d */
    private DataCacheGenerator f10679d;

    /* renamed from: e */
    private Object f10680e;

    /* renamed from: f */
    private volatile C1535a<?> f10681f;

    /* renamed from: g */
    private DataCacheKey f10682g;

    /* renamed from: com.bumptech.glide.load.n.z$a */
    /* compiled from: SourceGenerator */
    class C1505a implements C1422a<Object> {

        /* renamed from: a */
        final /* synthetic */ C1535a f10683a;

        C1505a(C1535a aVar) {
            this.f10683a = aVar;
        }

        /* renamed from: c */
        public void mo8796c(Exception exc) {
            if (SourceGenerator.this.mo9090g(this.f10683a)) {
                SourceGenerator.this.mo9092i(this.f10683a, exc);
            }
        }

        /* renamed from: d */
        public void mo8797d(Object obj) {
            if (SourceGenerator.this.mo9090g(this.f10683a)) {
                SourceGenerator.this.mo9091h(this.f10683a, obj);
            }
        }
    }

    SourceGenerator(DecodeHelper<?> gVar, C1475a aVar) {
        this.f10676a = gVar;
        this.f10677b = aVar;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    private void m13016d(Object obj) {
        String str = "SourceGenerator";
        long b = LogTime.m14065b();
        try {
            C1420d p = this.f10676a.mo8983p(obj);
            DataCacheWriter eVar = new DataCacheWriter(p, obj, this.f10676a.mo8978k());
            this.f10682g = new DataCacheKey(this.f10681f.f10735a, this.f10676a.mo8982o());
            this.f10676a.mo8971d().mo8912a(this.f10682g, eVar);
            if (Log.isLoggable(str, 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Finished encoding source to cache, key: ");
                sb.append(this.f10682g);
                sb.append(", data: ");
                sb.append(obj);
                sb.append(", encoder: ");
                sb.append(p);
                sb.append(", duration: ");
                sb.append(LogTime.m14064a(b));
                Log.v(str, sb.toString());
            }
            this.f10681f.f10737c.mo8785b();
            this.f10679d = new DataCacheGenerator(Collections.singletonList(this.f10681f.f10735a), this.f10676a, this);
        } catch (Throwable th) {
            this.f10681f.f10737c.mo8785b();
            throw th;
        }
    }

    /* renamed from: f */
    private boolean m13017f() {
        return this.f10678c < this.f10676a.mo8974g().size();
    }

    /* renamed from: j */
    private void m13018j(C1535a<?> aVar) {
        this.f10681f.f10737c.mo8790f(this.f10676a.mo8979l(), new C1505a(aVar));
    }

    /* renamed from: a */
    public void mo8965a() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public void mo8966b(Key gVar, Exception exc, DataFetcher<?> dVar, DataSource aVar) {
        this.f10677b.mo8966b(gVar, exc, dVar, this.f10681f.f10737c.mo8789e());
    }

    /* renamed from: c */
    public void mo8967c(Key gVar, Object obj, DataFetcher<?> dVar, DataSource aVar, Key gVar2) {
        this.f10677b.mo8967c(gVar, obj, dVar, this.f10681f.f10737c.mo8789e(), gVar);
    }

    public void cancel() {
        C1535a<?> aVar = this.f10681f;
        if (aVar != null) {
            aVar.f10737c.cancel();
        }
    }

    /* renamed from: e */
    public boolean mo8942e() {
        Object obj = this.f10680e;
        if (obj != null) {
            this.f10680e = null;
            m13016d(obj);
        }
        DataCacheGenerator cVar = this.f10679d;
        if (cVar != null && cVar.mo8942e()) {
            return true;
        }
        this.f10679d = null;
        this.f10681f = null;
        boolean z = false;
        while (!z && m13017f()) {
            List g = this.f10676a.mo8974g();
            int i = this.f10678c;
            this.f10678c = i + 1;
            this.f10681f = (C1535a) g.get(i);
            if (this.f10681f != null && (this.f10676a.mo8972e().mo9017c(this.f10681f.f10737c.mo8789e()) || this.f10676a.mo8987t(this.f10681f.f10737c.mo8780a()))) {
                m13018j(this.f10681f);
                z = true;
            }
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public boolean mo9090g(C1535a<?> aVar) {
        C1535a<?> aVar2 = this.f10681f;
        return aVar2 != null && aVar2 == aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo9091h(C1535a<?> aVar, Object obj) {
        DiskCacheStrategy e = this.f10676a.mo8972e();
        if (obj == null || !e.mo9017c(aVar.f10737c.mo8789e())) {
            C1475a aVar2 = this.f10677b;
            Key gVar = aVar.f10735a;
            DataFetcher<Data> dVar = aVar.f10737c;
            aVar2.mo8967c(gVar, obj, dVar, dVar.mo8789e(), this.f10682g);
            return;
        }
        this.f10680e = obj;
        this.f10677b.mo8965a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo9092i(C1535a<?> aVar, Exception exc) {
        C1475a aVar2 = this.f10677b;
        DataCacheKey dVar = this.f10682g;
        DataFetcher<Data> dVar2 = aVar.f10737c;
        aVar2.mo8966b(dVar, exc, dVar2, dVar2.mo8789e());
    }
}
