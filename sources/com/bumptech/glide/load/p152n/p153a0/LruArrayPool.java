package com.bumptech.glide.load.p152n.p153a0;

import android.util.Log;
import com.bumptech.glide.p174t.C1638j;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: com.bumptech.glide.load.n.a0.j */
public final class LruArrayPool implements ArrayPool {

    /* renamed from: a */
    private final GroupedLinkedMap<C1448a, Object> f10379a = new GroupedLinkedMap<>();

    /* renamed from: b */
    private final C1449b f10380b = new C1449b();

    /* renamed from: c */
    private final Map<Class<?>, NavigableMap<Integer, Integer>> f10381c = new HashMap();

    /* renamed from: d */
    private final Map<Class<?>, ArrayAdapterInterface<?>> f10382d = new HashMap();

    /* renamed from: e */
    private final int f10383e;

    /* renamed from: f */
    private int f10384f;

    /* renamed from: com.bumptech.glide.load.n.a0.j$a */
    /* compiled from: LruArrayPool */
    private static final class C1448a implements Poolable {

        /* renamed from: a */
        private final C1449b f10385a;

        /* renamed from: b */
        int f10386b;

        /* renamed from: c */
        private Class<?> f10387c;

        C1448a(C1449b bVar) {
            this.f10385a = bVar;
        }

        /* renamed from: a */
        public void mo8870a() {
            this.f10385a.mo8879c(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo8896b(int i, Class<?> cls) {
            this.f10386b = i;
            this.f10387c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1448a)) {
                return false;
            }
            C1448a aVar = (C1448a) obj;
            if (this.f10386b == aVar.f10386b && this.f10387c == aVar.f10387c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i = this.f10386b * 31;
            Class<?> cls = this.f10387c;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Key{size=");
            sb.append(this.f10386b);
            sb.append("array=");
            sb.append(this.f10387c);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: com.bumptech.glide.load.n.a0.j$b */
    /* compiled from: LruArrayPool */
    private static final class C1449b extends BaseKeyPool<C1448a> {
        C1449b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public C1448a mo8875a() {
            return new C1448a(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public C1448a mo8901e(int i, Class<?> cls) {
            C1448a aVar = (C1448a) mo8878b();
            aVar.mo8896b(i, cls);
            return aVar;
        }
    }

    public LruArrayPool(int i) {
        this.f10383e = i;
    }

    /* renamed from: f */
    private void m12683f(int i, Class<?> cls) {
        NavigableMap m = m12690m(cls);
        Integer num = (Integer) m.get(Integer.valueOf(i));
        if (num == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Tried to decrement empty size, size: ");
            sb.append(i);
            sb.append(", this: ");
            sb.append(this);
            throw new NullPointerException(sb.toString());
        } else if (num.intValue() == 1) {
            m.remove(Integer.valueOf(i));
        } else {
            m.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
        }
    }

    /* renamed from: g */
    private void m12684g() {
        m12685h(this.f10383e);
    }

    /* renamed from: h */
    private void m12685h(int i) {
        while (this.f10384f > i) {
            Object f = this.f10379a.mo8889f();
            C1638j.m14081d(f);
            ArrayAdapterInterface i2 = m12686i(f);
            this.f10384f -= i2.mo8855b(f) * i2.mo8856c();
            m12683f(i2.mo8855b(f), f.getClass());
            if (Log.isLoggable(i2.mo8854a(), 2)) {
                String a = i2.mo8854a();
                StringBuilder sb = new StringBuilder();
                sb.append("evicted: ");
                sb.append(i2.mo8855b(f));
                Log.v(a, sb.toString());
            }
        }
    }

    /* renamed from: i */
    private <T> ArrayAdapterInterface<T> m12686i(T t) {
        return m12687j(t.getClass());
    }

    /* renamed from: j */
    private <T> ArrayAdapterInterface<T> m12687j(Class<T> cls) {
        ArrayAdapterInterface<T> aVar = (ArrayAdapterInterface) this.f10382d.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new IntegerArrayAdapter<>();
            } else if (cls.equals(byte[].class)) {
                aVar = new ByteArrayAdapter<>();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("No array pool found for: ");
                sb.append(cls.getSimpleName());
                throw new IllegalArgumentException(sb.toString());
            }
            this.f10382d.put(cls, aVar);
        }
        return aVar;
    }

    /* renamed from: k */
    private <T> T m12688k(C1448a aVar) {
        return this.f10379a.mo8887a(aVar);
    }

    /* renamed from: l */
    private <T> T m12689l(C1448a aVar, Class<T> cls) {
        ArrayAdapterInterface j = m12687j(cls);
        T k = m12688k(aVar);
        if (k != null) {
            this.f10384f -= j.mo8855b(k) * j.mo8856c();
            m12683f(j.mo8855b(k), cls);
        }
        if (k != null) {
            return k;
        }
        if (Log.isLoggable(j.mo8854a(), 2)) {
            String a = j.mo8854a();
            StringBuilder sb = new StringBuilder();
            sb.append("Allocated ");
            sb.append(aVar.f10386b);
            sb.append(" bytes");
            Log.v(a, sb.toString());
        }
        return j.newArray(aVar.f10386b);
    }

    /* renamed from: m */
    private NavigableMap<Integer, Integer> m12690m(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) this.f10381c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f10381c.put(cls, treeMap);
        return treeMap;
    }

    /* renamed from: n */
    private boolean m12691n() {
        int i = this.f10384f;
        return i == 0 || this.f10383e / i >= 2;
    }

    /* renamed from: o */
    private boolean m12692o(int i) {
        return i <= this.f10383e / 2;
    }

    /* renamed from: p */
    private boolean m12693p(int i, Integer num) {
        return num != null && (m12691n() || num.intValue() <= i * 8);
    }

    /* renamed from: a */
    public synchronized void mo8858a(int i) {
        if (i >= 40) {
            try {
                mo8859b();
            } catch (Throwable th) {
                throw th;
            }
        } else if (i >= 20 || i == 15) {
            m12685h(this.f10383e / 2);
        }
    }

    /* renamed from: b */
    public synchronized void mo8859b() {
        m12685h(0);
    }

    /* renamed from: c */
    public synchronized <T> T mo8860c(int i, Class<T> cls) {
        return m12689l(this.f10380b.mo8901e(i, cls), cls);
    }

    /* renamed from: d */
    public synchronized <T> void mo8861d(T t) {
        Class cls = t.getClass();
        ArrayAdapterInterface j = m12687j(cls);
        int b = j.mo8855b(t);
        int c = j.mo8856c() * b;
        if (m12692o(c)) {
            C1448a e = this.f10380b.mo8901e(b, cls);
            this.f10379a.mo8888d(e, t);
            NavigableMap m = m12690m(cls);
            Integer num = (Integer) m.get(Integer.valueOf(e.f10386b));
            Integer valueOf = Integer.valueOf(e.f10386b);
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            m.put(valueOf, Integer.valueOf(i));
            this.f10384f += c;
            m12684g();
        }
    }

    /* renamed from: e */
    public synchronized <T> T mo8862e(int i, Class<T> cls) {
        C1448a aVar;
        Integer num = (Integer) m12690m(cls).ceilingKey(Integer.valueOf(i));
        if (m12693p(i, num)) {
            aVar = this.f10380b.mo8901e(num.intValue(), cls);
        } else {
            aVar = this.f10380b.mo8901e(i, cls);
        }
        return m12689l(aVar, cls);
    }
}
