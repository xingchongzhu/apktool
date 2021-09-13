package com.bumptech.glide.p174t;

import p010b.p025d.ArrayMap;
import p010b.p025d.SimpleArrayMap;

/* renamed from: com.bumptech.glide.t.b */
public final class CachedHashCodeArrayMap<K, V> extends ArrayMap<K, V> {

    /* renamed from: i */
    private int f11239i;

    public void clear() {
        this.f11239i = 0;
        super.clear();
    }

    public int hashCode() {
        if (this.f11239i == 0) {
            this.f11239i = super.hashCode();
        }
        return this.f11239i;
    }

    /* renamed from: j */
    public void mo4510j(SimpleArrayMap<? extends K, ? extends V> gVar) {
        this.f11239i = 0;
        super.mo4510j(gVar);
    }

    /* renamed from: k */
    public V mo4511k(int i) {
        this.f11239i = 0;
        return super.mo4511k(i);
    }

    /* renamed from: l */
    public V mo4512l(int i, V v) {
        this.f11239i = 0;
        return super.mo4512l(i, v);
    }

    public V put(K k, V v) {
        this.f11239i = 0;
        return super.put(k, v);
    }
}
