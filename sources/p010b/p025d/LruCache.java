package p010b.p025d;

import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: b.d.e */
public class LruCache<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, V> f3938a;

    /* renamed from: b */
    private int f3939b;

    /* renamed from: c */
    private int f3940c;

    /* renamed from: d */
    private int f3941d;

    /* renamed from: e */
    private int f3942e;

    /* renamed from: f */
    private int f3943f;

    /* renamed from: g */
    private int f3944g;

    /* renamed from: h */
    private int f3945h;

    public LruCache(int i) {
        if (i > 0) {
            this.f3940c = i;
            this.f3938a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: e */
    private int m4476e(K k, V v) {
        int f = mo4431f(k, v);
        if (f >= 0) {
            return f;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Negative size: ");
        sb.append(k);
        sb.append("=");
        sb.append(v);
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public V mo4427a(K k) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo4428b(boolean z, K k, V v, V v2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        r0 = mo4427a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        if (r0 != null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r4.f3942e++;
        r1 = r4.f3938a.put(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        if (r1 == null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        r4.f3938a.put(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        r4.f3939b += m4476e(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        if (r1 == null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0046, code lost:
        mo4428b(false, r5, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004a, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004b, code lost:
        mo4432g(r4.f3940c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0050, code lost:
        return r0;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V mo4429c(K r5) {
        /*
            r4 = this;
            java.lang.String r0 = "key == null"
            java.util.Objects.requireNonNull(r5, r0)
            monitor-enter(r4)
            java.util.LinkedHashMap<K, V> r0 = r4.f3938a     // Catch:{ all -> 0x0054 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0054 }
            if (r0 == 0) goto L_0x0016
            int r5 = r4.f3944g     // Catch:{ all -> 0x0054 }
            int r5 = r5 + 1
            r4.f3944g = r5     // Catch:{ all -> 0x0054 }
            monitor-exit(r4)     // Catch:{ all -> 0x0054 }
            return r0
        L_0x0016:
            int r0 = r4.f3945h     // Catch:{ all -> 0x0054 }
            int r0 = r0 + 1
            r4.f3945h = r0     // Catch:{ all -> 0x0054 }
            monitor-exit(r4)     // Catch:{ all -> 0x0054 }
            java.lang.Object r0 = r4.mo4427a(r5)
            if (r0 != 0) goto L_0x0025
            r5 = 0
            return r5
        L_0x0025:
            monitor-enter(r4)
            int r1 = r4.f3942e     // Catch:{ all -> 0x0051 }
            int r1 = r1 + 1
            r4.f3942e = r1     // Catch:{ all -> 0x0051 }
            java.util.LinkedHashMap<K, V> r1 = r4.f3938a     // Catch:{ all -> 0x0051 }
            java.lang.Object r1 = r1.put(r5, r0)     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x003a
            java.util.LinkedHashMap<K, V> r2 = r4.f3938a     // Catch:{ all -> 0x0051 }
            r2.put(r5, r1)     // Catch:{ all -> 0x0051 }
            goto L_0x0043
        L_0x003a:
            int r2 = r4.f3939b     // Catch:{ all -> 0x0051 }
            int r3 = r4.m4476e(r5, r0)     // Catch:{ all -> 0x0051 }
            int r2 = r2 + r3
            r4.f3939b = r2     // Catch:{ all -> 0x0051 }
        L_0x0043:
            monitor-exit(r4)     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x004b
            r2 = 0
            r4.mo4428b(r2, r5, r0, r1)
            return r1
        L_0x004b:
            int r5 = r4.f3940c
            r4.mo4432g(r5)
            return r0
        L_0x0051:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0051 }
            throw r5
        L_0x0054:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0054 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p010b.p025d.LruCache.mo4429c(java.lang.Object):java.lang.Object");
    }

    /* renamed from: d */
    public final V mo4430d(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f3941d++;
            this.f3939b += m4476e(k, v);
            put = this.f3938a.put(k, v);
            if (put != null) {
                this.f3939b -= m4476e(k, put);
            }
        }
        if (put != null) {
            mo4428b(false, k, put, v);
        }
        mo4432g(this.f3940c);
        return put;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo4431f(K k, V v) {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        throw new java.lang.IllegalStateException(r0.toString());
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4432g(int r5) {
        /*
            r4 = this;
        L_0x0000:
            monitor-enter(r4)
            int r0 = r4.f3939b     // Catch:{ all -> 0x0071 }
            if (r0 < 0) goto L_0x0052
            java.util.LinkedHashMap<K, V> r0 = r4.f3938a     // Catch:{ all -> 0x0071 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x0011
            int r0 = r4.f3939b     // Catch:{ all -> 0x0071 }
            if (r0 != 0) goto L_0x0052
        L_0x0011:
            int r0 = r4.f3939b     // Catch:{ all -> 0x0071 }
            if (r0 <= r5) goto L_0x0050
            java.util.LinkedHashMap<K, V> r0 = r4.f3938a     // Catch:{ all -> 0x0071 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x001e
            goto L_0x0050
        L_0x001e:
            java.util.LinkedHashMap<K, V> r0 = r4.f3938a     // Catch:{ all -> 0x0071 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0071 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x0071 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0071 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0071 }
            java.util.LinkedHashMap<K, V> r2 = r4.f3938a     // Catch:{ all -> 0x0071 }
            r2.remove(r1)     // Catch:{ all -> 0x0071 }
            int r2 = r4.f3939b     // Catch:{ all -> 0x0071 }
            int r3 = r4.m4476e(r1, r0)     // Catch:{ all -> 0x0071 }
            int r2 = r2 - r3
            r4.f3939b = r2     // Catch:{ all -> 0x0071 }
            int r2 = r4.f3943f     // Catch:{ all -> 0x0071 }
            r3 = 1
            int r2 = r2 + r3
            r4.f3943f = r2     // Catch:{ all -> 0x0071 }
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            r2 = 0
            r4.mo4428b(r3, r1, r0, r2)
            goto L_0x0000
        L_0x0050:
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            return
        L_0x0052:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0071 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
            r0.<init>()     // Catch:{ all -> 0x0071 }
            java.lang.Class r1 = r4.getClass()     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0071 }
            r0.append(r1)     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0071 }
            r5.<init>(r0)     // Catch:{ all -> 0x0071 }
            throw r5     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            goto L_0x0075
        L_0x0074:
            throw r5
        L_0x0075:
            goto L_0x0074
        */
        throw new UnsupportedOperationException("Method not decompiled: p010b.p025d.LruCache.mo4432g(int):void");
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.f3944g;
        i2 = this.f3945h + i;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f3940c), Integer.valueOf(this.f3944g), Integer.valueOf(this.f3945h), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0)});
    }
}
