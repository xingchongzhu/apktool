package com.umeng.analytics.pro;

import com.umeng.analytics.pro.TFieldIdEnum;
import com.umeng.analytics.pro.TUnion;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.umeng.analytics.pro.ba */
public abstract class TUnion<T extends TUnion<?, ?>, F extends TFieldIdEnum> implements TBase<T, F> {

    /* renamed from: c */
    private static final Map<Class<? extends IScheme>, SchemeFactory> f16759c;

    /* renamed from: a */
    protected Object f16760a;

    /* renamed from: b */
    protected F f16761b;

    /* renamed from: com.umeng.analytics.pro.ba$a */
    /* compiled from: TUnion */
    private static class C3117a extends StandardScheme<TUnion> {
        private C3117a() {
        }

        /* renamed from: a */
        public void mo18932b(TProtocol bpVar, TUnion baVar) throws TException {
            baVar.f16761b = null;
            baVar.f16760a = null;
            bpVar.mo19036j();
            TField l = bpVar.mo19038l();
            Object a = baVar.mo18984a(bpVar, l);
            baVar.f16760a = a;
            if (a != null) {
                baVar.f16761b = baVar.mo18981a(l.f16826c);
            }
            bpVar.mo19039m();
            bpVar.mo19038l();
            bpVar.mo19037k();
        }

        /* renamed from: b */
        public void mo18930a(TProtocol bpVar, TUnion baVar) throws TException {
            if (baVar.mo18980a() == null || baVar.mo18989b() == null) {
                throw new TProtocolException("Cannot write a TUnion with no set value!");
            }
            bpVar.mo19020a(baVar.mo18996d());
            bpVar.mo19015a(baVar.mo18994c(baVar.f16761b));
            baVar.mo18988a(bpVar);
            bpVar.mo19027c();
            bpVar.mo19029d();
            bpVar.mo19026b();
        }
    }

    /* renamed from: com.umeng.analytics.pro.ba$b */
    /* compiled from: TUnion */
    private static class C3118b implements SchemeFactory {
        private C3118b() {
        }

        /* renamed from: a */
        public C3117a mo18934b() {
            return new C3117a();
        }
    }

    /* renamed from: com.umeng.analytics.pro.ba$c */
    /* compiled from: TUnion */
    private static class C3119c extends TupleScheme<TUnion> {
        private C3119c() {
        }

        /* renamed from: a */
        public void mo18932b(TProtocol bpVar, TUnion baVar) throws TException {
            baVar.f16761b = null;
            baVar.f16760a = null;
            short v = bpVar.mo19048v();
            Object a = baVar.mo18985a(bpVar, v);
            baVar.f16760a = a;
            if (a != null) {
                baVar.f16761b = baVar.mo18981a(v);
            }
        }

        /* renamed from: b */
        public void mo18930a(TProtocol bpVar, TUnion baVar) throws TException {
            if (baVar.mo18980a() == null || baVar.mo18989b() == null) {
                throw new TProtocolException("Cannot write a TUnion with no set value!");
            }
            bpVar.mo19023a(baVar.f16761b.mo18938a());
            baVar.mo18991b(bpVar);
        }
    }

    /* renamed from: com.umeng.analytics.pro.ba$d */
    /* compiled from: TUnion */
    private static class C3120d implements SchemeFactory {
        private C3120d() {
        }

        /* renamed from: a */
        public C3119c mo18934b() {
            return new C3119c();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f16759c = hashMap;
        hashMap.put(StandardScheme.class, new C3118b());
        hashMap.put(TupleScheme.class, new C3120d());
    }

    protected TUnion() {
        this.f16761b = null;
        this.f16760a = null;
    }

    /* renamed from: a */
    private static Object m21672a(Object obj) {
        if (obj instanceof TBase) {
            return ((TBase) obj).deepCopy();
        }
        if (obj instanceof ByteBuffer) {
            return TBaseHelper.m21648d((ByteBuffer) obj);
        }
        if (obj instanceof List) {
            return m21673a((List) obj);
        }
        if (obj instanceof Set) {
            return m21675a((Set) obj);
        }
        if (obj instanceof Map) {
            obj = m21674a((Map) obj);
        }
        return obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract F mo18981a(short s);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo18984a(TProtocol bpVar, TField bkVar) throws TException;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo18985a(TProtocol bpVar, short s) throws TException;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo18988a(TProtocol bpVar) throws TException;

    /* renamed from: b */
    public Object mo18989b() {
        return this.f16760a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo18990b(F f, Object obj) throws ClassCastException;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo18991b(TProtocol bpVar) throws TException;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract TField mo18994c(F f);

    /* renamed from: c */
    public boolean mo18995c() {
        return this.f16761b != null;
    }

    public final void clear() {
        this.f16761b = null;
        this.f16760a = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract TStruct mo18996d();

    public void read(TProtocol bpVar) throws TException {
        ((SchemeFactory) f16759c.get(bpVar.mo19062D())).mo18934b().mo18932b(bpVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(getClass().getSimpleName());
        sb.append(" ");
        if (mo18980a() != null) {
            Object b = mo18989b();
            sb.append(mo18994c(mo18980a()).f16824a);
            sb.append(":");
            if (b instanceof ByteBuffer) {
                TBaseHelper.m21643a((ByteBuffer) b, sb);
            } else {
                sb.append(b.toString());
            }
        }
        sb.append(">");
        return sb.toString();
    }

    public void write(TProtocol bpVar) throws TException {
        ((SchemeFactory) f16759c.get(bpVar.mo19062D())).mo18934b().mo18930a(bpVar, this);
    }

    /* renamed from: b */
    public boolean mo18993b(F f) {
        return this.f16761b == f;
    }

    /* renamed from: b */
    public boolean mo18992b(int i) {
        return mo18993b((F) mo18981a((short) i));
    }

    protected TUnion(F f, Object obj) {
        mo18987a(f, obj);
    }

    protected TUnion(TUnion<T, F> baVar) {
        if (baVar.getClass().equals(getClass())) {
            this.f16761b = baVar.f16761b;
            this.f16760a = m21672a(baVar.f16760a);
            return;
        }
        throw new ClassCastException();
    }

    /* renamed from: a */
    private static Map m21674a(Map<Object, Object> map) {
        HashMap hashMap = new HashMap();
        for (Entry entry : map.entrySet()) {
            hashMap.put(m21672a(entry.getKey()), m21672a(entry.getValue()));
        }
        return hashMap;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Set, code=java.util.Set<java.lang.Object>, for r2v0, types: [java.util.Set<java.lang.Object>, java.util.Set] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.Set m21675a(java.util.Set<java.lang.Object> r2) {
        /*
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0009:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x001b
            java.lang.Object r1 = r2.next()
            java.lang.Object r1 = m21672a(r1)
            r0.add(r1)
            goto L_0x0009
        L_0x001b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.TUnion.m21675a(java.util.Set):java.util.Set");
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.Object>, for r2v0, types: [java.util.List, java.util.List<java.lang.Object>] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List m21673a(java.util.List<java.lang.Object> r2) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r2.size()
            r0.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        L_0x000d:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x001f
            java.lang.Object r1 = r2.next()
            java.lang.Object r1 = m21672a(r1)
            r0.add(r1)
            goto L_0x000d
        L_0x001f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.TUnion.m21673a(java.util.List):java.util.List");
    }

    /* renamed from: a */
    public F mo18980a() {
        return this.f16761b;
    }

    /* renamed from: a */
    public Object mo18983a(F f) {
        if (f == this.f16761b) {
            return mo18989b();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot get the value of field ");
        sb.append(f);
        sb.append(" because union's set field is ");
        sb.append(this.f16761b);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public Object mo18982a(int i) {
        return mo18983a((F) mo18981a((short) i));
    }

    /* renamed from: a */
    public void mo18987a(F f, Object obj) {
        mo18990b(f, obj);
        this.f16761b = f;
        this.f16760a = obj;
    }

    /* renamed from: a */
    public void mo18986a(int i, Object obj) {
        mo18987a((F) mo18981a((short) i), obj);
    }
}
