package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.Glide.C1405a;
import com.bumptech.glide.load.p152n.Engine;
import com.bumptech.glide.load.p152n.p153a0.ArrayPool;
import com.bumptech.glide.load.p152n.p153a0.BitmapPool;
import com.bumptech.glide.load.p152n.p153a0.BitmapPoolAdapter;
import com.bumptech.glide.load.p152n.p153a0.LruArrayPool;
import com.bumptech.glide.load.p152n.p153a0.LruBitmapPool;
import com.bumptech.glide.load.p152n.p154b0.DiskCache.C1455a;
import com.bumptech.glide.load.p152n.p154b0.InternalCacheDiskCacheFactory;
import com.bumptech.glide.load.p152n.p154b0.LruResourceCache;
import com.bumptech.glide.load.p152n.p154b0.MemoryCache;
import com.bumptech.glide.load.p152n.p154b0.MemorySizeCalculator;
import com.bumptech.glide.load.p152n.p154b0.MemorySizeCalculator.C1462a;
import com.bumptech.glide.load.p152n.p155c0.GlideExecutor;
import com.bumptech.glide.p167o.ConnectivityMonitorFactory;
import com.bumptech.glide.p167o.DefaultConnectivityMonitorFactory;
import com.bumptech.glide.p167o.RequestManagerRetriever;
import com.bumptech.glide.p167o.RequestManagerRetriever.C1620b;
import com.bumptech.glide.p170r.RequestListener;
import com.bumptech.glide.p170r.RequestOptions;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p010b.p025d.ArrayMap;

/* renamed from: com.bumptech.glide.c */
public final class GlideBuilder {

    /* renamed from: a */
    private final Map<Class<?>, TransitionOptions<?, ?>> f10190a = new ArrayMap();

    /* renamed from: b */
    private final C1410a f10191b = new C1410a();

    /* renamed from: c */
    private Engine f10192c;

    /* renamed from: d */
    private BitmapPool f10193d;

    /* renamed from: e */
    private ArrayPool f10194e;

    /* renamed from: f */
    private MemoryCache f10195f;

    /* renamed from: g */
    private GlideExecutor f10196g;

    /* renamed from: h */
    private GlideExecutor f10197h;

    /* renamed from: i */
    private C1455a f10198i;

    /* renamed from: j */
    private MemorySizeCalculator f10199j;

    /* renamed from: k */
    private ConnectivityMonitorFactory f10200k;

    /* renamed from: l */
    private int f10201l = 4;

    /* renamed from: m */
    private C1405a f10202m = new C1406a();

    /* renamed from: n */
    private C1620b f10203n;

    /* renamed from: o */
    private GlideExecutor f10204o;

    /* renamed from: p */
    private boolean f10205p;

    /* renamed from: q */
    private List<RequestListener<Object>> f10206q;

    /* renamed from: com.bumptech.glide.c$a */
    /* compiled from: GlideBuilder */
    class C1406a implements C1405a {
        C1406a() {
        }

        /* renamed from: a */
        public RequestOptions mo8699a() {
            return new RequestOptions();
        }
    }

    /* renamed from: com.bumptech.glide.c$b */
    /* compiled from: GlideBuilder */
    static final class C1407b {
        C1407b() {
        }
    }

    /* renamed from: com.bumptech.glide.c$c */
    /* compiled from: GlideBuilder */
    public static final class C1408c {
    }

    /* renamed from: com.bumptech.glide.c$d */
    /* compiled from: GlideBuilder */
    public static final class C1409d {
        private C1409d() {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Glide mo8700a(Context context) {
        if (this.f10196g == null) {
            this.f10196g = GlideExecutor.m12805g();
        }
        if (this.f10197h == null) {
            this.f10197h = GlideExecutor.m12803e();
        }
        if (this.f10204o == null) {
            this.f10204o = GlideExecutor.m12801c();
        }
        if (this.f10199j == null) {
            this.f10199j = new C1462a(context).mo8934a();
        }
        if (this.f10200k == null) {
            this.f10200k = new DefaultConnectivityMonitorFactory();
        }
        if (this.f10193d == null) {
            int b = this.f10199j.mo8932b();
            if (b > 0) {
                this.f10193d = new LruBitmapPool((long) b);
            } else {
                this.f10193d = new BitmapPoolAdapter();
            }
        }
        if (this.f10194e == null) {
            this.f10194e = new LruArrayPool(this.f10199j.mo8931a());
        }
        if (this.f10195f == null) {
            this.f10195f = new LruResourceCache((long) this.f10199j.mo8933d());
        }
        if (this.f10198i == null) {
            this.f10198i = new InternalCacheDiskCacheFactory(context);
        }
        if (this.f10192c == null) {
            Engine kVar = new Engine(this.f10195f, this.f10198i, this.f10197h, this.f10196g, GlideExecutor.m12806h(), this.f10204o, this.f10205p);
            this.f10192c = kVar;
        }
        List<RequestListener<Object>> list = this.f10206q;
        if (list == null) {
            this.f10206q = Collections.emptyList();
        } else {
            this.f10206q = Collections.unmodifiableList(list);
        }
        GlideExperiments b2 = this.f10191b.mo8712b();
        Context context2 = context;
        Glide bVar = new Glide(context2, this.f10192c, this.f10195f, this.f10193d, this.f10194e, new RequestManagerRetriever(this.f10203n, b2), this.f10200k, this.f10201l, this.f10202m, this.f10190a, this.f10206q, b2);
        return bVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo8701b(C1620b bVar) {
        this.f10203n = bVar;
    }
}
