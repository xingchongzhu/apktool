package p010b.p018b.p019a.p021b;

import java.util.HashMap;
import java.util.Map.Entry;

/* renamed from: b.b.a.b.a */
public class FastSafeIterableMap<K, V> extends SafeIterableMap<K, V> {

    /* renamed from: e */
    private HashMap<K, C0537c<K, V>> f3863e = new HashMap<>();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C0537c<K, V> mo4269c(K k) {
        return (C0537c) this.f3863e.get(k);
    }

    public boolean contains(K k) {
        return this.f3863e.containsKey(k);
    }

    /* renamed from: g */
    public V mo4271g(K k, V v) {
        C0537c c = mo4269c(k);
        if (c != null) {
            return c.f3869b;
        }
        this.f3863e.put(k, mo4279f(k, v));
        return null;
    }

    /* renamed from: h */
    public V mo4272h(K k) {
        V h = super.mo4272h(k);
        this.f3863e.remove(k);
        return h;
    }

    /* renamed from: i */
    public Entry<K, V> mo4273i(K k) {
        if (contains(k)) {
            return ((C0537c) this.f3863e.get(k)).f3871d;
        }
        return null;
    }
}
