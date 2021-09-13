package com.bumptech.glide.load.p152n;

import android.util.Log;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.p152n.p154b0.DiskCache;
import com.bumptech.glide.load.p152n.p154b0.DiskCache.C1455a;
import com.bumptech.glide.load.p152n.p154b0.DiskCacheAdapter;
import com.bumptech.glide.load.p152n.p154b0.MemoryCache;
import com.bumptech.glide.load.p152n.p154b0.MemoryCache.C1461a;
import com.bumptech.glide.load.p152n.p155c0.GlideExecutor;
import com.bumptech.glide.p170r.ResourceCallback;
import com.bumptech.glide.p174t.C1638j;
import com.bumptech.glide.p174t.LogTime;
import com.bumptech.glide.p174t.p175l.FactoryPools;
import com.bumptech.glide.p174t.p175l.FactoryPools.C1644d;
import java.util.Map;
import java.util.concurrent.Executor;
import p010b.p034g.p042j.C0610e;

/* renamed from: com.bumptech.glide.load.n.k */
public class Engine implements EngineJobListener, C1461a, C1501a {

    /* renamed from: a */
    private static final boolean f10560a = Log.isLoggable("Engine", 2);

    /* renamed from: b */
    private final Jobs f10561b;

    /* renamed from: c */
    private final EngineKeyFactory f10562c;

    /* renamed from: d */
    private final MemoryCache f10563d;

    /* renamed from: e */
    private final C1492b f10564e;

    /* renamed from: f */
    private final ResourceRecycler f10565f;

    /* renamed from: g */
    private final C1494c f10566g;

    /* renamed from: h */
    private final C1490a f10567h;

    /* renamed from: i */
    private final ActiveResources f10568i;

    /* renamed from: com.bumptech.glide.load.n.k$a */
    /* compiled from: Engine */
    static class C1490a {

        /* renamed from: a */
        final C1480e f10569a;

        /* renamed from: b */
        final C0610e<DecodeJob<?>> f10570b = FactoryPools.m14109d(150, new C1491a());

        /* renamed from: c */
        private int f10571c;

        /* renamed from: com.bumptech.glide.load.n.k$a$a */
        /* compiled from: Engine */
        class C1491a implements C1644d<DecodeJob<?>> {
            C1491a() {
            }

            /* renamed from: b */
            public DecodeJob<?> mo8938a() {
                C1490a aVar = C1490a.this;
                return new DecodeJob<>(aVar.f10569a, aVar.f10570b);
            }
        }

        C1490a(C1480e eVar) {
            this.f10569a = eVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public <R> DecodeJob<R> mo9024a(GlideContext dVar, Object obj, EngineKey nVar, Key gVar, int i, int i2, Class<?> cls, Class<R> cls2, Priority gVar2, DiskCacheStrategy jVar, Map<Class<?>, Transformation<?>> map, boolean z, boolean z2, boolean z3, Options iVar, C1477b<R> bVar) {
            GlideContext dVar2 = dVar;
            Object obj2 = obj;
            EngineKey nVar2 = nVar;
            Key gVar3 = gVar;
            int i3 = i;
            int i4 = i2;
            Class<?> cls3 = cls;
            Class<R> cls4 = cls2;
            Priority gVar4 = gVar2;
            DiskCacheStrategy jVar2 = jVar;
            Map<Class<?>, Transformation<?>> map2 = map;
            boolean z4 = z;
            boolean z5 = z2;
            boolean z6 = z3;
            Options iVar2 = iVar;
            C1477b<R> bVar2 = bVar;
            DecodeJob hVar = (DecodeJob) C1638j.m14081d((DecodeJob) this.f10570b.mo4946b());
            int i5 = this.f10571c;
            int i6 = i5;
            this.f10571c = i5 + 1;
            return hVar.mo8996n(dVar2, obj2, nVar2, gVar3, i3, i4, cls3, cls4, gVar4, jVar2, map2, z4, z5, z6, iVar2, bVar2, i6);
        }
    }

    /* renamed from: com.bumptech.glide.load.n.k$b */
    /* compiled from: Engine */
    static class C1492b {

        /* renamed from: a */
        final GlideExecutor f10573a;

        /* renamed from: b */
        final GlideExecutor f10574b;

        /* renamed from: c */
        final GlideExecutor f10575c;

        /* renamed from: d */
        final GlideExecutor f10576d;

        /* renamed from: e */
        final EngineJobListener f10577e;

        /* renamed from: f */
        final C1501a f10578f;

        /* renamed from: g */
        final C0610e<EngineJob<?>> f10579g = FactoryPools.m14109d(150, new C1493a());

        /* renamed from: com.bumptech.glide.load.n.k$b$a */
        /* compiled from: Engine */
        class C1493a implements C1644d<EngineJob<?>> {
            C1493a() {
            }

            /* renamed from: b */
            public EngineJob<?> mo8938a() {
                C1492b bVar = C1492b.this;
                EngineJob lVar = new EngineJob(bVar.f10573a, bVar.f10574b, bVar.f10575c, bVar.f10576d, bVar.f10577e, bVar.f10578f, bVar.f10579g);
                return lVar;
            }
        }

        C1492b(GlideExecutor aVar, GlideExecutor aVar2, GlideExecutor aVar3, GlideExecutor aVar4, EngineJobListener mVar, C1501a aVar5) {
            this.f10573a = aVar;
            this.f10574b = aVar2;
            this.f10575c = aVar3;
            this.f10576d = aVar4;
            this.f10577e = mVar;
            this.f10578f = aVar5;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public <R> EngineJob<R> mo9026a(Key gVar, boolean z, boolean z2, boolean z3, boolean z4) {
            return ((EngineJob) C1638j.m14081d((EngineJob) this.f10579g.mo4946b())).mo9035l(gVar, z, z2, z3, z4);
        }
    }

    /* renamed from: com.bumptech.glide.load.n.k$c */
    /* compiled from: Engine */
    private static class C1494c implements C1480e {

        /* renamed from: a */
        private final C1455a f10581a;

        /* renamed from: b */
        private volatile DiskCache f10582b;

        C1494c(C1455a aVar) {
            this.f10581a = aVar;
        }

        /* renamed from: a */
        public DiskCache mo9008a() {
            if (this.f10582b == null) {
                synchronized (this) {
                    if (this.f10582b == null) {
                        this.f10582b = this.f10581a.mo8914a();
                    }
                    if (this.f10582b == null) {
                        this.f10582b = new DiskCacheAdapter();
                    }
                }
            }
            return this.f10582b;
        }
    }

    /* renamed from: com.bumptech.glide.load.n.k$d */
    /* compiled from: Engine */
    public class C1495d {

        /* renamed from: a */
        private final EngineJob<?> f10583a;

        /* renamed from: b */
        private final ResourceCallback f10584b;

        C1495d(ResourceCallback gVar, EngineJob<?> lVar) {
            this.f10584b = gVar;
            this.f10583a = lVar;
        }

        /* renamed from: a */
        public void mo9028a() {
            synchronized (Engine.this) {
                this.f10583a.mo9039r(this.f10584b);
            }
        }
    }

    public Engine(MemoryCache hVar, C1455a aVar, GlideExecutor aVar2, GlideExecutor aVar3, GlideExecutor aVar4, GlideExecutor aVar5, boolean z) {
        this(hVar, aVar, aVar2, aVar3, aVar4, aVar5, null, null, null, null, null, null, z);
    }

    /* renamed from: e */
    private EngineResource<?> m12917e(Key gVar) {
        Resource e = this.f10563d.mo8924e(gVar);
        if (e == null) {
            return null;
        }
        if (e instanceof EngineResource) {
            return (EngineResource) e;
        }
        EngineResource pVar = new EngineResource(e, true, true, gVar, this);
        return pVar;
    }

    /* renamed from: g */
    private EngineResource<?> m12918g(Key gVar) {
        EngineResource<?> e = this.f10568i.mo8847e(gVar);
        if (e != null) {
            e.mo9057b();
        }
        return e;
    }

    /* renamed from: h */
    private EngineResource<?> m12919h(Key gVar) {
        EngineResource<?> e = m12917e(gVar);
        if (e != null) {
            e.mo9057b();
            this.f10568i.mo8843a(gVar, e);
        }
        return e;
    }

    /* renamed from: i */
    private EngineResource<?> m12920i(EngineKey nVar, boolean z, long j) {
        if (!z) {
            return null;
        }
        EngineResource<?> g = m12918g(nVar);
        if (g != null) {
            if (f10560a) {
                m12921j("Loaded resource from active resources", j, nVar);
            }
            return g;
        }
        EngineResource<?> h = m12919h(nVar);
        if (h == null) {
            return null;
        }
        if (f10560a) {
            m12921j("Loaded resource from cache", j, nVar);
        }
        return h;
    }

    /* renamed from: j */
    private static void m12921j(String str, long j, Key gVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(LogTime.m14064a(j));
        sb.append("ms, key: ");
        sb.append(gVar);
        Log.v("Engine", sb.toString());
    }

    /* renamed from: l */
    private <R> C1495d m12922l(GlideContext dVar, Object obj, Key gVar, int i, int i2, Class<?> cls, Class<R> cls2, Priority gVar2, DiskCacheStrategy jVar, Map<Class<?>, Transformation<?>> map, boolean z, boolean z2, Options iVar, boolean z3, boolean z4, boolean z5, boolean z6, ResourceCallback gVar3, Executor executor, EngineKey nVar, long j) {
        ResourceCallback gVar4 = gVar3;
        Executor executor2 = executor;
        EngineKey nVar2 = nVar;
        long j2 = j;
        EngineJob a = this.f10561b.mo9080a(nVar2, z6);
        if (a != null) {
            a.mo9029b(gVar4, executor2);
            if (f10560a) {
                m12921j("Added to existing load", j2, nVar2);
            }
            return new C1495d(gVar4, a);
        }
        EngineJob a2 = this.f10564e.mo9026a(nVar, z3, z4, z5, z6);
        EngineJob lVar = a2;
        EngineKey nVar3 = nVar2;
        DecodeJob a3 = this.f10567h.mo9024a(dVar, obj, nVar, gVar, i, i2, cls, cls2, gVar2, jVar, map, z, z2, z6, iVar, a2);
        this.f10561b.mo9081c(nVar3, lVar);
        EngineJob lVar2 = lVar;
        EngineKey nVar4 = nVar3;
        ResourceCallback gVar5 = gVar3;
        lVar2.mo9029b(gVar5, executor);
        lVar2.mo9040s(a3);
        if (f10560a) {
            m12921j("Started new load", j, nVar4);
        }
        return new C1495d(gVar5, lVar2);
    }

    /* renamed from: a */
    public void mo8930a(Resource<?> vVar) {
        this.f10565f.mo9088a(vVar, true);
    }

    /* renamed from: b */
    public synchronized void mo9019b(EngineJob<?> lVar, Key gVar, EngineResource<?> pVar) {
        if (pVar != null) {
            if (pVar.mo9062g()) {
                this.f10568i.mo8843a(gVar, pVar);
            }
        }
        this.f10561b.mo9082d(gVar, lVar);
    }

    /* renamed from: c */
    public synchronized void mo9020c(EngineJob<?> lVar, Key gVar) {
        this.f10561b.mo9082d(gVar, lVar);
    }

    /* renamed from: d */
    public void mo9021d(Key gVar, EngineResource<?> pVar) {
        this.f10568i.mo8846d(gVar);
        if (pVar.mo9062g()) {
            this.f10563d.mo8923d(gVar, pVar);
        } else {
            this.f10565f.mo9088a(pVar, false);
        }
    }

    /* renamed from: f */
    public <R> C1495d mo9022f(GlideContext dVar, Object obj, Key gVar, int i, int i2, Class<?> cls, Class<R> cls2, Priority gVar2, DiskCacheStrategy jVar, Map<Class<?>, Transformation<?>> map, boolean z, boolean z2, Options iVar, boolean z3, boolean z4, boolean z5, boolean z6, ResourceCallback gVar3, Executor executor) {
        long b = f10560a ? LogTime.m14065b() : 0;
        EngineKey a = this.f10562c.mo9055a(obj, gVar, i, i2, map, cls, cls2, iVar);
        synchronized (this) {
            EngineResource i3 = m12920i(a, z3, b);
            if (i3 == null) {
                C1495d l = m12922l(dVar, obj, gVar, i, i2, cls, cls2, gVar2, jVar, map, z, z2, iVar, z3, z4, z5, z6, gVar3, executor, a, b);
                return l;
            }
            gVar3.mo9518c(i3, DataSource.MEMORY_CACHE, false);
            return null;
        }
    }

    /* renamed from: k */
    public void mo9023k(Resource<?> vVar) {
        if (vVar instanceof EngineResource) {
            ((EngineResource) vVar).mo9063h();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    Engine(MemoryCache hVar, C1455a aVar, GlideExecutor aVar2, GlideExecutor aVar3, GlideExecutor aVar4, GlideExecutor aVar5, Jobs sVar, EngineKeyFactory oVar, ActiveResources aVar6, C1492b bVar, C1490a aVar7, ResourceRecycler yVar, boolean z) {
        this.f10563d = hVar;
        C1455a aVar8 = aVar;
        C1494c cVar = new C1494c(aVar);
        this.f10566g = cVar;
        ActiveResources aVar9 = aVar6 == null ? new ActiveResources(z) : aVar6;
        this.f10568i = aVar9;
        aVar9.mo8848f(this);
        this.f10562c = oVar == null ? new EngineKeyFactory() : oVar;
        this.f10561b = sVar == null ? new Jobs() : sVar;
        this.f10564e = bVar == null ? new C1492b(aVar2, aVar3, aVar4, aVar5, this, this) : bVar;
        this.f10567h = aVar7 == null ? new C1490a(cVar) : aVar7;
        this.f10565f = yVar == null ? new ResourceRecycler() : yVar;
        hVar.mo8922c(this);
    }
}
