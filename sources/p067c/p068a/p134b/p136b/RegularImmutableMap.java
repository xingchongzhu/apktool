package p067c.p068a.p134b.p136b;

import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Map.Entry;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p067c.p068a.p134b.p135a.C1320g;

/* renamed from: c.a.b.b.m0 */
final class RegularImmutableMap<K, V> extends ImmutableMap<K, V> {

    /* renamed from: e */
    static final ImmutableMap<Object, Object> f9853e = new RegularImmutableMap(null, new Object[0], 0);

    /* renamed from: f */
    private final transient int[] f9854f;

    /* renamed from: g */
    final transient Object[] f9855g;

    /* renamed from: h */
    private final transient int f9856h;

    /* renamed from: c.a.b.b.m0$a */
    /* compiled from: RegularImmutableMap */
    static class C1372a<K, V> extends ImmutableSet<Entry<K, V>> {

        /* renamed from: c */
        private final transient ImmutableMap<K, V> f9857c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final transient Object[] f9858d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final transient int f9859e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final transient int f9860f;

        /* renamed from: c.a.b.b.m0$a$a */
        /* compiled from: RegularImmutableMap */
        class C1373a extends ImmutableList<Entry<K, V>> {
            C1373a() {
            }

            /* renamed from: g */
            public boolean mo8379g() {
                return true;
            }

            public int size() {
                return C1372a.this.f9860f;
            }

            /* renamed from: w */
            public Entry<K, V> get(int i) {
                C1320g.m11648g(i, C1372a.this.f9860f);
                int i2 = i * 2;
                return new SimpleImmutableEntry(C1372a.this.f9858d[C1372a.this.f9859e + i2], C1372a.this.f9858d[i2 + (C1372a.this.f9859e ^ 1)]);
            }
        }

        C1372a(ImmutableMap<K, V> tVar, Object[] objArr, int i, int i2) {
            this.f9857c = tVar;
            this.f9858d = objArr;
            this.f9859e = i;
            this.f9860f = i2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public int mo8375c(Object[] objArr, int i) {
            return mo8403b().mo8375c(objArr, i);
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f9857c.get(key))) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public boolean mo8379g() {
            return true;
        }

        /* renamed from: h */
        public UnmodifiableIterator<Entry<K, V>> iterator() {
            return mo8403b().iterator();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: m */
        public ImmutableList<Entry<K, V>> mo8398m() {
            return new C1373a();
        }

        public int size() {
            return this.f9860f;
        }
    }

    /* renamed from: c.a.b.b.m0$b */
    /* compiled from: RegularImmutableMap */
    static final class C1374b<K> extends ImmutableSet<K> {

        /* renamed from: c */
        private final transient ImmutableMap<K, ?> f9862c;

        /* renamed from: d */
        private final transient ImmutableList<K> f9863d;

        C1374b(ImmutableMap<K, ?> tVar, ImmutableList<K> rVar) {
            this.f9862c = tVar;
            this.f9863d = rVar;
        }

        /* renamed from: b */
        public ImmutableList<K> mo8403b() {
            return this.f9863d;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public int mo8375c(Object[] objArr, int i) {
            return mo8403b().mo8375c(objArr, i);
        }

        public boolean contains(@NullableDecl Object obj) {
            return this.f9862c.get(obj) != null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public boolean mo8379g() {
            return true;
        }

        /* renamed from: h */
        public UnmodifiableIterator<K> iterator() {
            return mo8403b().iterator();
        }

        public int size() {
            return this.f9862c.size();
        }
    }

    /* renamed from: c.a.b.b.m0$c */
    /* compiled from: RegularImmutableMap */
    static final class C1375c extends ImmutableList<Object> {

        /* renamed from: c */
        private final transient Object[] f9864c;

        /* renamed from: d */
        private final transient int f9865d;

        /* renamed from: e */
        private final transient int f9866e;

        C1375c(Object[] objArr, int i, int i2) {
            this.f9864c = objArr;
            this.f9865d = i;
            this.f9866e = i2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public boolean mo8379g() {
            return true;
        }

        public Object get(int i) {
            C1320g.m11648g(i, this.f9866e);
            return this.f9864c[(i * 2) + this.f9865d];
        }

        public int size() {
            return this.f9866e;
        }
    }

    private RegularImmutableMap(int[] iArr, Object[] objArr, int i) {
        this.f9854f = iArr;
        this.f9855g = objArr;
        this.f9856h = i;
    }

    /* renamed from: l */
    static <K, V> RegularImmutableMap<K, V> m11867l(int i, Object[] objArr) {
        if (i == 0) {
            return (RegularImmutableMap) f9853e;
        }
        if (i == 1) {
            CollectPreconditions.m11785a(objArr[0], objArr[1]);
            return new RegularImmutableMap<>(null, objArr, 1);
        }
        C1320g.m11652k(i, objArr.length >> 1);
        return new RegularImmutableMap<>(m11868m(objArr, i, ImmutableSet.m11994i(i), 0), objArr, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        r12[r7] = r5;
        r3 = r3 + 1;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int[] m11868m(java.lang.Object[] r10, int r11, int r12, int r13) {
        /*
            r0 = 1
            if (r11 != r0) goto L_0x000e
            r11 = r10[r13]
            r12 = r13 ^ 1
            r10 = r10[r12]
            p067c.p068a.p134b.p136b.CollectPreconditions.m11785a(r11, r10)
            r10 = 0
            return r10
        L_0x000e:
            int r1 = r12 + -1
            int[] r12 = new int[r12]
            r2 = -1
            java.util.Arrays.fill(r12, r2)
            r3 = 0
        L_0x0017:
            if (r3 >= r11) goto L_0x0077
            int r4 = r3 * 2
            int r5 = r4 + r13
            r6 = r10[r5]
            r7 = r13 ^ 1
            int r4 = r4 + r7
            r4 = r10[r4]
            p067c.p068a.p134b.p136b.CollectPreconditions.m11785a(r6, r4)
            int r7 = r6.hashCode()
            int r7 = p067c.p068a.p134b.p136b.Hashing.m11897b(r7)
        L_0x002f:
            r7 = r7 & r1
            r8 = r12[r7]
            if (r8 != r2) goto L_0x0039
            r12[r7] = r5
            int r3 = r3 + 1
            goto L_0x0017
        L_0x0039:
            r9 = r10[r8]
            boolean r9 = r9.equals(r6)
            if (r9 != 0) goto L_0x0044
            int r7 = r7 + 1
            goto L_0x002f
        L_0x0044:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Multiple entries with same key: "
            r12.append(r13)
            r12.append(r6)
            java.lang.String r13 = "="
            r12.append(r13)
            r12.append(r4)
            java.lang.String r1 = " and "
            r12.append(r1)
            r1 = r10[r8]
            r12.append(r1)
            r12.append(r13)
            r13 = r8 ^ 1
            r10 = r10[r13]
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.<init>(r10)
            throw r11
        L_0x0077:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p134b.p136b.RegularImmutableMap.m11868m(java.lang.Object[], int, int, int):int[]");
    }

    /* renamed from: n */
    static Object m11869n(@NullableDecl int[] iArr, @NullableDecl Object[] objArr, int i, int i2, @NullableDecl Object obj) {
        Object obj2 = null;
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            if (objArr[i2].equals(obj)) {
                obj2 = objArr[i2 ^ 1];
            }
            return obj2;
        } else if (iArr == null) {
            return null;
        } else {
            int length = iArr.length - 1;
            int b = Hashing.m11897b(obj.hashCode());
            while (true) {
                int i3 = b & length;
                int i4 = iArr[i3];
                if (i4 == -1) {
                    return null;
                }
                if (objArr[i4].equals(obj)) {
                    return objArr[i4 ^ 1];
                }
                b = i3 + 1;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public ImmutableSet<Entry<K, V>> mo8389d() {
        return new C1372a(this, this.f9855g, 0, this.f9856h);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public ImmutableSet<K> mo8390e() {
        return new C1374b(this, new C1375c(this.f9855g, 0, this.f9856h));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public ImmutableCollection<V> mo8391f() {
        return new C1375c(this.f9855g, 1, this.f9856h);
    }

    @NullableDecl
    public V get(@NullableDecl Object obj) {
        return m11869n(this.f9854f, this.f9855g, this.f9856h, 0, obj);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public boolean mo8393h() {
        return false;
    }

    public int size() {
        return this.f9856h;
    }
}
