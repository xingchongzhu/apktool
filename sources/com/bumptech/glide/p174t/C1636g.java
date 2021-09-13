package com.bumptech.glide.p174t;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bumptech.glide.t.g */
/* compiled from: LruCache */
public class C1636g<T, Y> {

    /* renamed from: a */
    private final Map<T, C1637a<Y>> f11248a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b */
    private final long f11249b;

    /* renamed from: c */
    private long f11250c;

    /* renamed from: d */
    private long f11251d;

    /* renamed from: com.bumptech.glide.t.g$a */
    /* compiled from: LruCache */
    static final class C1637a<Y> {

        /* renamed from: a */
        final Y f11252a;

        /* renamed from: b */
        final int f11253b;

        C1637a(Y y, int i) {
            this.f11252a = y;
            this.f11253b = i;
        }
    }

    public C1636g(long j) {
        this.f11249b = j;
        this.f11250c = j;
    }

    /* renamed from: f */
    private void m14066f() {
        mo9573m(this.f11250c);
    }

    /* renamed from: b */
    public void mo9568b() {
        mo9573m(0);
    }

    /* renamed from: g */
    public synchronized Y mo9569g(T t) {
        C1637a aVar;
        aVar = (C1637a) this.f11248a.get(t);
        return aVar != null ? aVar.f11252a : null;
    }

    /* renamed from: h */
    public synchronized long mo9570h() {
        return this.f11250c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public int mo8925i(Y y) {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo8926j(T t, Y y) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0049, code lost:
        return r5;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized Y mo9571k(T r8, Y r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            int r0 = r7.mo8925i(r9)     // Catch:{ all -> 0x004a }
            long r1 = (long) r0     // Catch:{ all -> 0x004a }
            long r3 = r7.f11250c     // Catch:{ all -> 0x004a }
            r5 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 < 0) goto L_0x0012
            r7.mo8926j(r8, r9)     // Catch:{ all -> 0x004a }
            monitor-exit(r7)
            return r5
        L_0x0012:
            if (r9 == 0) goto L_0x0019
            long r3 = r7.f11251d     // Catch:{ all -> 0x004a }
            long r3 = r3 + r1
            r7.f11251d = r3     // Catch:{ all -> 0x004a }
        L_0x0019:
            java.util.Map<T, com.bumptech.glide.t.g$a<Y>> r1 = r7.f11248a     // Catch:{ all -> 0x004a }
            if (r9 != 0) goto L_0x001f
            r2 = r5
            goto L_0x0024
        L_0x001f:
            com.bumptech.glide.t.g$a r2 = new com.bumptech.glide.t.g$a     // Catch:{ all -> 0x004a }
            r2.<init>(r9, r0)     // Catch:{ all -> 0x004a }
        L_0x0024:
            java.lang.Object r0 = r1.put(r8, r2)     // Catch:{ all -> 0x004a }
            com.bumptech.glide.t.g$a r0 = (com.bumptech.glide.p174t.C1636g.C1637a) r0     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0041
            long r1 = r7.f11251d     // Catch:{ all -> 0x004a }
            int r3 = r0.f11253b     // Catch:{ all -> 0x004a }
            long r3 = (long) r3     // Catch:{ all -> 0x004a }
            long r1 = r1 - r3
            r7.f11251d = r1     // Catch:{ all -> 0x004a }
            Y r1 = r0.f11252a     // Catch:{ all -> 0x004a }
            boolean r9 = r1.equals(r9)     // Catch:{ all -> 0x004a }
            if (r9 != 0) goto L_0x0041
            Y r9 = r0.f11252a     // Catch:{ all -> 0x004a }
            r7.mo8926j(r8, r9)     // Catch:{ all -> 0x004a }
        L_0x0041:
            r7.m14066f()     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0048
            Y r5 = r0.f11252a     // Catch:{ all -> 0x004a }
        L_0x0048:
            monitor-exit(r7)
            return r5
        L_0x004a:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p174t.C1636g.mo9571k(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* renamed from: l */
    public synchronized Y mo9572l(T t) {
        C1637a aVar = (C1637a) this.f11248a.remove(t);
        if (aVar == null) {
            return null;
        }
        this.f11251d -= (long) aVar.f11253b;
        return aVar.f11252a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public synchronized void mo9573m(long j) {
        while (this.f11251d > j) {
            Iterator it = this.f11248a.entrySet().iterator();
            Entry entry = (Entry) it.next();
            C1637a aVar = (C1637a) entry.getValue();
            this.f11251d -= (long) aVar.f11253b;
            Object key = entry.getKey();
            it.remove();
            mo8926j(key, aVar.f11252a);
        }
    }
}
