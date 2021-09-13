package com.bumptech.glide.load.p152n;

import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry.C1414c;
import com.bumptech.glide.Registry.C1416e;
import com.bumptech.glide.load.C1420d;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.p152n.p153a0.ArrayPool;
import com.bumptech.glide.load.p152n.p154b0.DiskCache;
import com.bumptech.glide.load.p156o.ModelLoader;
import com.bumptech.glide.load.p156o.ModelLoader.C1535a;
import com.bumptech.glide.load.p158p.UnitTransformation;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bumptech.glide.load.n.g */
final class DecodeHelper<Transcode> {

    /* renamed from: a */
    private final List<C1535a<?>> f10478a = new ArrayList();

    /* renamed from: b */
    private final List<Key> f10479b = new ArrayList();

    /* renamed from: c */
    private GlideContext f10480c;

    /* renamed from: d */
    private Object f10481d;

    /* renamed from: e */
    private int f10482e;

    /* renamed from: f */
    private int f10483f;

    /* renamed from: g */
    private Class<?> f10484g;

    /* renamed from: h */
    private C1480e f10485h;

    /* renamed from: i */
    private Options f10486i;

    /* renamed from: j */
    private Map<Class<?>, Transformation<?>> f10487j;

    /* renamed from: k */
    private Class<Transcode> f10488k;

    /* renamed from: l */
    private boolean f10489l;

    /* renamed from: m */
    private boolean f10490m;

    /* renamed from: n */
    private Key f10491n;

    /* renamed from: o */
    private Priority f10492o;

    /* renamed from: p */
    private DiskCacheStrategy f10493p;

    /* renamed from: q */
    private boolean f10494q;

    /* renamed from: r */
    private boolean f10495r;

    DecodeHelper() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8968a() {
        this.f10480c = null;
        this.f10481d = null;
        this.f10491n = null;
        this.f10484g = null;
        this.f10488k = null;
        this.f10486i = null;
        this.f10492o = null;
        this.f10487j = null;
        this.f10493p = null;
        this.f10478a.clear();
        this.f10489l = false;
        this.f10479b.clear();
        this.f10490m = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public ArrayPool mo8969b() {
        return this.f10480c.mo8703b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public List<Key> mo8970c() {
        if (!this.f10490m) {
            this.f10490m = true;
            this.f10479b.clear();
            List g = mo8974g();
            int size = g.size();
            for (int i = 0; i < size; i++) {
                C1535a aVar = (C1535a) g.get(i);
                if (!this.f10479b.contains(aVar.f10735a)) {
                    this.f10479b.add(aVar.f10735a);
                }
                for (int i2 = 0; i2 < aVar.f10736b.size(); i2++) {
                    if (!this.f10479b.contains(aVar.f10736b.get(i2))) {
                        this.f10479b.add(aVar.f10736b.get(i2));
                    }
                }
            }
        }
        return this.f10479b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public DiskCache mo8971d() {
        return this.f10485h.mo9008a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public DiskCacheStrategy mo8972e() {
        return this.f10493p;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int mo8973f() {
        return this.f10483f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public List<C1535a<?>> mo8974g() {
        if (!this.f10489l) {
            this.f10489l = true;
            this.f10478a.clear();
            List i = this.f10480c.mo8710i().mo8720i(this.f10481d);
            int size = i.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1535a a = ((ModelLoader) i.get(i2)).mo9093a(this.f10481d, this.f10482e, this.f10483f, this.f10486i);
                if (a != null) {
                    this.f10478a.add(a);
                }
            }
        }
        return this.f10478a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public <Data> LoadPath<Data, ?, Transcode> mo8975h(Class<Data> cls) {
        return this.f10480c.mo8710i().mo8719h(cls, this.f10484g, this.f10488k);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public Class<?> mo8976i() {
        return this.f10481d.getClass();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public List<ModelLoader<File, ?>> mo8977j(File file) throws C1414c {
        return this.f10480c.mo8710i().mo8720i(file);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public Options mo8978k() {
        return this.f10486i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public Priority mo8979l() {
        return this.f10492o;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public List<Class<?>> mo8980m() {
        return this.f10480c.mo8710i().mo8721j(this.f10481d.getClass(), this.f10484g, this.f10488k);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public <Z> ResourceEncoder<Z> mo8981n(Resource<Z> vVar) {
        return this.f10480c.mo8710i().mo8722k(vVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public Key mo8982o() {
        return this.f10491n;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public <X> C1420d<X> mo8983p(X x) throws C1416e {
        return this.f10480c.mo8710i().mo8724m(x);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public Class<?> mo8984q() {
        return this.f10488k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public <Z> Transformation<Z> mo8985r(Class<Z> cls) {
        Transformation<Z> mVar = (Transformation) this.f10487j.get(cls);
        if (mVar == null) {
            Iterator it = this.f10487j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Entry entry = (Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    mVar = (Transformation) entry.getValue();
                    break;
                }
            }
        }
        if (mVar != null) {
            return mVar;
        }
        if (!this.f10487j.isEmpty() || !this.f10494q) {
            return UnitTransformation.m13256c();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Missing transformation for ");
        sb.append(cls);
        sb.append(". If you wish to ignore unknown resource types, use the optional transformation methods.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public int mo8986s() {
        return this.f10482e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public boolean mo8987t(Class<?> cls) {
        return mo8975h(cls) != null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public <R> void mo8988u(GlideContext dVar, Object obj, Key gVar, int i, int i2, DiskCacheStrategy jVar, Class<?> cls, Class<R> cls2, Priority gVar2, Options iVar, Map<Class<?>, Transformation<?>> map, boolean z, boolean z2, C1480e eVar) {
        this.f10480c = dVar;
        this.f10481d = obj;
        this.f10491n = gVar;
        this.f10482e = i;
        this.f10483f = i2;
        this.f10493p = jVar;
        this.f10484g = cls;
        this.f10485h = eVar;
        this.f10488k = cls2;
        this.f10492o = gVar2;
        this.f10486i = iVar;
        this.f10487j = map;
        this.f10494q = z;
        this.f10495r = z2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public boolean mo8989v(Resource<?> vVar) {
        return this.f10480c.mo8710i().mo8725n(vVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public boolean mo8990w() {
        return this.f10495r;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public boolean mo8991x(Key gVar) {
        List g = mo8974g();
        int size = g.size();
        for (int i = 0; i < size; i++) {
            if (((C1535a) g.get(i)).f10735a.equals(gVar)) {
                return true;
            }
        }
        return false;
    }
}
