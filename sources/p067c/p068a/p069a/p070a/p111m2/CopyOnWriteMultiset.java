package p067c.p068a.p069a.p070a.p111m2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: c.a.a.a.m2.l */
public final class CopyOnWriteMultiset<E> implements Iterable<E> {

    /* renamed from: a */
    private final Object f8386a = new Object();

    /* renamed from: b */
    private final Map<E, Integer> f8387b = new HashMap();

    /* renamed from: c */
    private Set<E> f8388c = Collections.emptySet();

    /* renamed from: d */
    private List<E> f8389d = Collections.emptyList();

    /* renamed from: a */
    public Set<E> mo7453a() {
        Set<E> set;
        synchronized (this.f8386a) {
            set = this.f8388c;
        }
        return set;
    }

    /* renamed from: b */
    public void mo7454b(E e) {
        synchronized (this.f8386a) {
            ArrayList arrayList = new ArrayList(this.f8389d);
            arrayList.add(e);
            this.f8389d = Collections.unmodifiableList(arrayList);
            Integer num = (Integer) this.f8387b.get(e);
            if (num == null) {
                HashSet hashSet = new HashSet(this.f8388c);
                hashSet.add(e);
                this.f8388c = Collections.unmodifiableSet(hashSet);
            }
            Map<E, Integer> map = this.f8387b;
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            map.put(e, Integer.valueOf(i));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004b, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7455c(E r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f8386a
            monitor-enter(r0)
            java.util.Map<E, java.lang.Integer> r1 = r4.f8387b     // Catch:{ all -> 0x004c }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x004c }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x004c }
            if (r1 != 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            return
        L_0x000f:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x004c }
            java.util.List<E> r3 = r4.f8389d     // Catch:{ all -> 0x004c }
            r2.<init>(r3)     // Catch:{ all -> 0x004c }
            r2.remove(r5)     // Catch:{ all -> 0x004c }
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)     // Catch:{ all -> 0x004c }
            r4.f8389d = r2     // Catch:{ all -> 0x004c }
            int r2 = r1.intValue()     // Catch:{ all -> 0x004c }
            r3 = 1
            if (r2 != r3) goto L_0x003c
            java.util.Map<E, java.lang.Integer> r1 = r4.f8387b     // Catch:{ all -> 0x004c }
            r1.remove(r5)     // Catch:{ all -> 0x004c }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x004c }
            java.util.Set<E> r2 = r4.f8388c     // Catch:{ all -> 0x004c }
            r1.<init>(r2)     // Catch:{ all -> 0x004c }
            r1.remove(r5)     // Catch:{ all -> 0x004c }
            java.util.Set r5 = java.util.Collections.unmodifiableSet(r1)     // Catch:{ all -> 0x004c }
            r4.f8388c = r5     // Catch:{ all -> 0x004c }
            goto L_0x004a
        L_0x003c:
            java.util.Map<E, java.lang.Integer> r2 = r4.f8387b     // Catch:{ all -> 0x004c }
            int r1 = r1.intValue()     // Catch:{ all -> 0x004c }
            int r1 = r1 - r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x004c }
            r2.put(r5, r1)     // Catch:{ all -> 0x004c }
        L_0x004a:
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            return
        L_0x004c:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p111m2.CopyOnWriteMultiset.mo7455c(java.lang.Object):void");
    }

    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f8386a) {
            it = this.f8389d.iterator();
        }
        return it;
    }
}
