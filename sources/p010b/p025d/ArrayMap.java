package p010b.p025d;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: b.d.a */
public class ArrayMap<K, V> extends SimpleArrayMap<K, V> implements Map<K, V> {

    /* renamed from: h */
    MapCollections<K, V> f3917h;

    /* renamed from: b.d.a$a */
    /* compiled from: ArrayMap */
    class C0544a extends MapCollections<K, V> {
        C0544a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo4384a() {
            ArrayMap.this.clear();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Object mo4385b(int i, int i2) {
            return ArrayMap.this.f3966f[(i << 1) + i2];
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Map<K, V> mo4386c() {
            return ArrayMap.this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public int mo4387d() {
            return ArrayMap.this.f3967g;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public int mo4388e(Object obj) {
            return ArrayMap.this.mo4502f(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public int mo4389f(Object obj) {
            return ArrayMap.this.mo4506h(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo4390g(K k, V v) {
            ArrayMap.this.put(k, v);
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo4391h(int i) {
            ArrayMap.this.mo4511k(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public V mo4392i(int i, V v) {
            return ArrayMap.this.mo4512l(i, v);
        }
    }

    public ArrayMap() {
    }

    /* renamed from: n */
    private MapCollections<K, V> m4429n() {
        if (this.f3917h == null) {
            this.f3917h = new C0544a();
        }
        return this.f3917h;
    }

    public Set<Entry<K, V>> entrySet() {
        return m4429n().mo4434l();
    }

    public Set<K> keySet() {
        return m4429n().mo4435m();
    }

    /* renamed from: o */
    public boolean mo4381o(Collection<?> collection) {
        return MapCollections.m4486p(this, collection);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo4496c(this.f3967g + map.size());
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public Collection<V> values() {
        return m4429n().mo4436n();
    }

    public ArrayMap(int i) {
        super(i);
    }

    public ArrayMap(SimpleArrayMap gVar) {
        super(gVar);
    }
}
