package com.bumptech.glide.load.p152n;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher.C1422a;
import com.bumptech.glide.load.p152n.DataFetcherGenerator.C1475a;
import com.bumptech.glide.load.p156o.ModelLoader;
import com.bumptech.glide.load.p156o.ModelLoader.C1535a;
import java.io.File;
import java.util.List;

/* renamed from: com.bumptech.glide.load.n.c */
class DataCacheGenerator implements DataFetcherGenerator, C1422a<Object> {

    /* renamed from: a */
    private final List<Key> f10445a;

    /* renamed from: b */
    private final DecodeHelper<?> f10446b;

    /* renamed from: c */
    private final C1475a f10447c;

    /* renamed from: d */
    private int f10448d;

    /* renamed from: e */
    private Key f10449e;

    /* renamed from: f */
    private List<ModelLoader<File, ?>> f10450f;

    /* renamed from: g */
    private int f10451g;

    /* renamed from: h */
    private volatile C1535a<?> f10452h;

    /* renamed from: i */
    private File f10453i;

    DataCacheGenerator(DecodeHelper<?> gVar, C1475a aVar) {
        this(gVar.mo8970c(), gVar, aVar);
    }

    /* renamed from: a */
    private boolean m12795a() {
        return this.f10451g < this.f10450f.size();
    }

    /* renamed from: c */
    public void mo8796c(Exception exc) {
        this.f10447c.mo8966b(this.f10449e, exc, this.f10452h.f10737c, DataSource.DATA_DISK_CACHE);
    }

    public void cancel() {
        C1535a<?> aVar = this.f10452h;
        if (aVar != null) {
            aVar.f10737c.cancel();
        }
    }

    /* renamed from: d */
    public void mo8797d(Object obj) {
        this.f10447c.mo8967c(this.f10449e, obj, this.f10452h.f10737c, DataSource.DATA_DISK_CACHE, this.f10449e);
    }

    /* renamed from: e */
    public boolean mo8942e() {
        while (true) {
            boolean z = false;
            if (this.f10450f == null || !m12795a()) {
                int i = this.f10448d + 1;
                this.f10448d = i;
                if (i >= this.f10445a.size()) {
                    return false;
                }
                Key gVar = (Key) this.f10445a.get(this.f10448d);
                File b = this.f10446b.mo8971d().mo8913b(new DataCacheKey(gVar, this.f10446b.mo8982o()));
                this.f10453i = b;
                if (b != null) {
                    this.f10449e = gVar;
                    this.f10450f = this.f10446b.mo8977j(b);
                    this.f10451g = 0;
                }
            } else {
                this.f10452h = null;
                while (!z && m12795a()) {
                    List<ModelLoader<File, ?>> list = this.f10450f;
                    int i2 = this.f10451g;
                    this.f10451g = i2 + 1;
                    this.f10452h = ((ModelLoader) list.get(i2)).mo9093a(this.f10453i, this.f10446b.mo8986s(), this.f10446b.mo8973f(), this.f10446b.mo8978k());
                    if (this.f10452h != null && this.f10446b.mo8987t(this.f10452h.f10737c.mo8780a())) {
                        this.f10452h.f10737c.mo8790f(this.f10446b.mo8979l(), this);
                        z = true;
                    }
                }
                return z;
            }
        }
    }

    DataCacheGenerator(List<Key> list, DecodeHelper<?> gVar, C1475a aVar) {
        this.f10448d = -1;
        this.f10445a = list;
        this.f10446b = gVar;
        this.f10447c = aVar;
    }
}
