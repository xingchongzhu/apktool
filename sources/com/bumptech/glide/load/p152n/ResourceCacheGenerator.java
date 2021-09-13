package com.bumptech.glide.load.p152n;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher.C1422a;
import com.bumptech.glide.load.p152n.DataFetcherGenerator.C1475a;
import com.bumptech.glide.load.p156o.ModelLoader;
import com.bumptech.glide.load.p156o.ModelLoader.C1535a;
import java.io.File;
import java.util.List;

/* renamed from: com.bumptech.glide.load.n.w */
class ResourceCacheGenerator implements DataFetcherGenerator, C1422a<Object> {

    /* renamed from: a */
    private final C1475a f10655a;

    /* renamed from: b */
    private final DecodeHelper<?> f10656b;

    /* renamed from: c */
    private int f10657c;

    /* renamed from: d */
    private int f10658d = -1;

    /* renamed from: e */
    private Key f10659e;

    /* renamed from: f */
    private List<ModelLoader<File, ?>> f10660f;

    /* renamed from: g */
    private int f10661g;

    /* renamed from: h */
    private volatile C1535a<?> f10662h;

    /* renamed from: i */
    private File f10663i;

    /* renamed from: j */
    private ResourceCacheKey f10664j;

    ResourceCacheGenerator(DecodeHelper<?> gVar, C1475a aVar) {
        this.f10656b = gVar;
        this.f10655a = aVar;
    }

    /* renamed from: a */
    private boolean m13009a() {
        return this.f10661g < this.f10660f.size();
    }

    /* renamed from: c */
    public void mo8796c(Exception exc) {
        this.f10655a.mo8966b(this.f10664j, exc, this.f10662h.f10737c, DataSource.RESOURCE_DISK_CACHE);
    }

    public void cancel() {
        C1535a<?> aVar = this.f10662h;
        if (aVar != null) {
            aVar.f10737c.cancel();
        }
    }

    /* renamed from: d */
    public void mo8797d(Object obj) {
        this.f10655a.mo8967c(this.f10659e, obj, this.f10662h.f10737c, DataSource.RESOURCE_DISK_CACHE, this.f10664j);
    }

    /* renamed from: e */
    public boolean mo8942e() {
        List c = this.f10656b.mo8970c();
        boolean z = false;
        if (c.isEmpty()) {
            return false;
        }
        List m = this.f10656b.mo8980m();
        if (!m.isEmpty()) {
            while (true) {
                if (this.f10660f == null || !m13009a()) {
                    int i = this.f10658d + 1;
                    this.f10658d = i;
                    if (i >= m.size()) {
                        int i2 = this.f10657c + 1;
                        this.f10657c = i2;
                        if (i2 >= c.size()) {
                            return false;
                        }
                        this.f10658d = 0;
                    }
                    Key gVar = (Key) c.get(this.f10657c);
                    Class cls = (Class) m.get(this.f10658d);
                    Key gVar2 = gVar;
                    ResourceCacheKey xVar = new ResourceCacheKey(this.f10656b.mo8969b(), gVar2, this.f10656b.mo8982o(), this.f10656b.mo8986s(), this.f10656b.mo8973f(), this.f10656b.mo8985r(cls), cls, this.f10656b.mo8978k());
                    this.f10664j = xVar;
                    File b = this.f10656b.mo8971d().mo8913b(this.f10664j);
                    this.f10663i = b;
                    if (b != null) {
                        this.f10659e = gVar;
                        this.f10660f = this.f10656b.mo8977j(b);
                        this.f10661g = 0;
                    }
                } else {
                    this.f10662h = null;
                    while (!z && m13009a()) {
                        List<ModelLoader<File, ?>> list = this.f10660f;
                        int i3 = this.f10661g;
                        this.f10661g = i3 + 1;
                        this.f10662h = ((ModelLoader) list.get(i3)).mo9093a(this.f10663i, this.f10656b.mo8986s(), this.f10656b.mo8973f(), this.f10656b.mo8978k());
                        if (this.f10662h != null && this.f10656b.mo8987t(this.f10662h.f10737c.mo8780a())) {
                            this.f10662h.f10737c.mo8790f(this.f10656b.mo8979l(), this);
                            z = true;
                        }
                    }
                    return z;
                }
            }
        } else if (File.class.equals(this.f10656b.mo8984q())) {
            return false;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to find any load path from ");
            sb.append(this.f10656b.mo8976i());
            sb.append(" to ");
            sb.append(this.f10656b.mo8984q());
            throw new IllegalStateException(sb.toString());
        }
    }
}
