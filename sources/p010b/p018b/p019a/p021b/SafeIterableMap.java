package p010b.p018b.p019a.p021b;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;

/* renamed from: b.b.a.b.b */
public class SafeIterableMap<K, V> implements Iterable<Entry<K, V>> {

    /* renamed from: a */
    C0537c<K, V> f3864a;

    /* renamed from: b */
    private C0537c<K, V> f3865b;

    /* renamed from: c */
    private WeakHashMap<C0540f<K, V>, Boolean> f3866c = new WeakHashMap<>();

    /* renamed from: d */
    private int f3867d = 0;

    /* renamed from: b.b.a.b.b$a */
    /* compiled from: SafeIterableMap */
    static class C0535a<K, V> extends C0539e<K, V> {
        C0535a(C0537c<K, V> cVar, C0537c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C0537c<K, V> mo4284b(C0537c<K, V> cVar) {
            return cVar.f3871d;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public C0537c<K, V> mo4285c(C0537c<K, V> cVar) {
            return cVar.f3870c;
        }
    }

    /* renamed from: b.b.a.b.b$b */
    /* compiled from: SafeIterableMap */
    private static class C0536b<K, V> extends C0539e<K, V> {
        C0536b(C0537c<K, V> cVar, C0537c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C0537c<K, V> mo4284b(C0537c<K, V> cVar) {
            return cVar.f3870c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public C0537c<K, V> mo4285c(C0537c<K, V> cVar) {
            return cVar.f3871d;
        }
    }

    /* renamed from: b.b.a.b.b$c */
    /* compiled from: SafeIterableMap */
    static class C0537c<K, V> implements Entry<K, V> {

        /* renamed from: a */
        final K f3868a;

        /* renamed from: b */
        final V f3869b;

        /* renamed from: c */
        C0537c<K, V> f3870c;

        /* renamed from: d */
        C0537c<K, V> f3871d;

        C0537c(K k, V v) {
            this.f3868a = k;
            this.f3869b = v;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0537c)) {
                return false;
            }
            C0537c cVar = (C0537c) obj;
            if (!this.f3868a.equals(cVar.f3868a) || !this.f3869b.equals(cVar.f3869b)) {
                z = false;
            }
            return z;
        }

        public K getKey() {
            return this.f3868a;
        }

        public V getValue() {
            return this.f3869b;
        }

        public int hashCode() {
            return this.f3868a.hashCode() ^ this.f3869b.hashCode();
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f3868a);
            sb.append("=");
            sb.append(this.f3869b);
            return sb.toString();
        }
    }

    /* renamed from: b.b.a.b.b$d */
    /* compiled from: SafeIterableMap */
    private class C0538d implements Iterator<Entry<K, V>>, C0540f<K, V> {

        /* renamed from: a */
        private C0537c<K, V> f3872a;

        /* renamed from: b */
        private boolean f3873b = true;

        C0538d() {
        }

        /* renamed from: a */
        public void mo4292a(C0537c<K, V> cVar) {
            C0537c<K, V> cVar2 = this.f3872a;
            if (cVar == cVar2) {
                C0537c<K, V> cVar3 = cVar2.f3871d;
                this.f3872a = cVar3;
                this.f3873b = cVar3 == null;
            }
        }

        /* renamed from: b */
        public Entry<K, V> next() {
            if (this.f3873b) {
                this.f3873b = false;
                this.f3872a = SafeIterableMap.this.f3864a;
            } else {
                C0537c<K, V> cVar = this.f3872a;
                this.f3872a = cVar != null ? cVar.f3870c : null;
            }
            return this.f3872a;
        }

        public boolean hasNext() {
            boolean z = true;
            if (this.f3873b) {
                if (SafeIterableMap.this.f3864a == null) {
                    z = false;
                }
                return z;
            }
            C0537c<K, V> cVar = this.f3872a;
            if (cVar == null || cVar.f3870c == null) {
                z = false;
            }
            return z;
        }
    }

    /* renamed from: b.b.a.b.b$e */
    /* compiled from: SafeIterableMap */
    private static abstract class C0539e<K, V> implements Iterator<Entry<K, V>>, C0540f<K, V> {

        /* renamed from: a */
        C0537c<K, V> f3875a;

        /* renamed from: b */
        C0537c<K, V> f3876b;

        C0539e(C0537c<K, V> cVar, C0537c<K, V> cVar2) {
            this.f3875a = cVar2;
            this.f3876b = cVar;
        }

        /* renamed from: e */
        private C0537c<K, V> m4341e() {
            C0537c<K, V> cVar = this.f3876b;
            C0537c<K, V> cVar2 = this.f3875a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return mo4285c(cVar);
        }

        /* renamed from: a */
        public void mo4292a(C0537c<K, V> cVar) {
            if (this.f3875a == cVar && cVar == this.f3876b) {
                this.f3876b = null;
                this.f3875a = null;
            }
            C0537c<K, V> cVar2 = this.f3875a;
            if (cVar2 == cVar) {
                this.f3875a = mo4284b(cVar2);
            }
            if (this.f3876b == cVar) {
                this.f3876b = m4341e();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract C0537c<K, V> mo4284b(C0537c<K, V> cVar);

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public abstract C0537c<K, V> mo4285c(C0537c<K, V> cVar);

        /* renamed from: d */
        public Entry<K, V> next() {
            C0537c<K, V> cVar = this.f3876b;
            this.f3876b = m4341e();
            return cVar;
        }

        public boolean hasNext() {
            return this.f3876b != null;
        }
    }

    /* renamed from: b.b.a.b.b$f */
    /* compiled from: SafeIterableMap */
    interface C0540f<K, V> {
        /* renamed from: a */
        void mo4292a(C0537c<K, V> cVar);
    }

    /* renamed from: b */
    public Entry<K, V> mo4274b() {
        return this.f3864a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C0537c<K, V> mo4269c(K k) {
        C0537c<K, V> cVar = this.f3864a;
        while (cVar != null && !cVar.f3868a.equals(k)) {
            cVar = cVar.f3870c;
        }
        return cVar;
    }

    /* renamed from: d */
    public C0538d mo4275d() {
        C0538d dVar = new C0538d<>();
        this.f3866c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Iterator<Entry<K, V>> descendingIterator() {
        C0536b bVar = new C0536b(this.f3865b, this.f3864a);
        this.f3866c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    /* renamed from: e */
    public Entry<K, V> mo4277e() {
        return this.f3865b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SafeIterableMap)) {
            return false;
        }
        SafeIterableMap bVar = (SafeIterableMap) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Entry entry = (Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C0537c<K, V> mo4279f(K k, V v) {
        C0537c<K, V> cVar = new C0537c<>(k, v);
        this.f3867d++;
        C0537c<K, V> cVar2 = this.f3865b;
        if (cVar2 == null) {
            this.f3864a = cVar;
            this.f3865b = cVar;
            return cVar;
        }
        cVar2.f3870c = cVar;
        cVar.f3871d = cVar2;
        this.f3865b = cVar;
        return cVar;
    }

    /* renamed from: g */
    public V mo4271g(K k, V v) {
        C0537c c = mo4269c(k);
        if (c != null) {
            return c.f3869b;
        }
        mo4279f(k, v);
        return null;
    }

    /* renamed from: h */
    public V mo4272h(K k) {
        C0537c c = mo4269c(k);
        if (c == null) {
            return null;
        }
        this.f3867d--;
        if (!this.f3866c.isEmpty()) {
            for (C0540f a : this.f3866c.keySet()) {
                a.mo4292a(c);
            }
        }
        C0537c<K, V> cVar = c.f3871d;
        if (cVar != null) {
            cVar.f3870c = c.f3870c;
        } else {
            this.f3864a = c.f3870c;
        }
        C0537c<K, V> cVar2 = c.f3870c;
        if (cVar2 != null) {
            cVar2.f3871d = cVar;
        } else {
            this.f3865b = cVar;
        }
        c.f3870c = null;
        c.f3871d = null;
        return c.f3869b;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Entry) it.next()).hashCode();
        }
        return i;
    }

    public Iterator<Entry<K, V>> iterator() {
        C0535a aVar = new C0535a(this.f3864a, this.f3865b);
        this.f3866c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public int size() {
        return this.f3867d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
