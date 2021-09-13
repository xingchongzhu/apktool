package com.bumptech.glide.load.p152n.p153a0;

import com.bumptech.glide.load.p152n.p153a0.Poolable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.n.a0.h */
class GroupedLinkedMap<K extends Poolable, V> {

    /* renamed from: a */
    private final C1447a<K, V> f10373a = new C1447a<>();

    /* renamed from: b */
    private final Map<K, C1447a<K, V>> f10374b = new HashMap();

    /* renamed from: com.bumptech.glide.load.n.a0.h$a */
    /* compiled from: GroupedLinkedMap */
    private static class C1447a<K, V> {

        /* renamed from: a */
        final K f10375a;

        /* renamed from: b */
        private List<V> f10376b;

        /* renamed from: c */
        C1447a<K, V> f10377c;

        /* renamed from: d */
        C1447a<K, V> f10378d;

        C1447a() {
            this(null);
        }

        /* renamed from: a */
        public void mo8891a(V v) {
            if (this.f10376b == null) {
                this.f10376b = new ArrayList();
            }
            this.f10376b.add(v);
        }

        /* renamed from: b */
        public V mo8892b() {
            int c = mo8893c();
            if (c > 0) {
                return this.f10376b.remove(c - 1);
            }
            return null;
        }

        /* renamed from: c */
        public int mo8893c() {
            List<V> list = this.f10376b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        C1447a(K k) {
            this.f10378d = this;
            this.f10377c = this;
            this.f10375a = k;
        }
    }

    GroupedLinkedMap() {
    }

    /* renamed from: b */
    private void m12668b(C1447a<K, V> aVar) {
        m12670e(aVar);
        C1447a<K, V> aVar2 = this.f10373a;
        aVar.f10378d = aVar2;
        aVar.f10377c = aVar2.f10377c;
        m12671g(aVar);
    }

    /* renamed from: c */
    private void m12669c(C1447a<K, V> aVar) {
        m12670e(aVar);
        C1447a<K, V> aVar2 = this.f10373a;
        aVar.f10378d = aVar2.f10378d;
        aVar.f10377c = aVar2;
        m12671g(aVar);
    }

    /* renamed from: e */
    private static <K, V> void m12670e(C1447a<K, V> aVar) {
        C1447a<K, V> aVar2 = aVar.f10378d;
        aVar2.f10377c = aVar.f10377c;
        aVar.f10377c.f10378d = aVar2;
    }

    /* renamed from: g */
    private static <K, V> void m12671g(C1447a<K, V> aVar) {
        aVar.f10377c.f10378d = aVar;
        aVar.f10378d.f10377c = aVar;
    }

    /* renamed from: a */
    public V mo8887a(K k) {
        C1447a aVar = (C1447a) this.f10374b.get(k);
        if (aVar == null) {
            aVar = new C1447a(k);
            this.f10374b.put(k, aVar);
        } else {
            k.mo8870a();
        }
        m12668b(aVar);
        return aVar.mo8892b();
    }

    /* renamed from: d */
    public void mo8888d(K k, V v) {
        C1447a aVar = (C1447a) this.f10374b.get(k);
        if (aVar == null) {
            aVar = new C1447a(k);
            m12669c(aVar);
            this.f10374b.put(k, aVar);
        } else {
            k.mo8870a();
        }
        aVar.mo8891a(v);
    }

    /* renamed from: f */
    public V mo8889f() {
        for (C1447a<K, V> aVar = this.f10373a.f10378d; !aVar.equals(this.f10373a); aVar = aVar.f10378d) {
            V b = aVar.mo8892b();
            if (b != null) {
                return b;
            }
            m12670e(aVar);
            this.f10374b.remove(aVar.f10375a);
            ((Poolable) aVar.f10375a).mo8870a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (C1447a<K, V> aVar = this.f10373a.f10377c; !aVar.equals(this.f10373a); aVar = aVar.f10377c) {
            z = true;
            sb.append('{');
            sb.append(aVar.f10375a);
            sb.append(':');
            sb.append(aVar.mo8893c());
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
