package androidx.coordinatorlayout.widget;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p010b.p025d.SimpleArrayMap;
import p010b.p034g.p042j.C0610e;
import p010b.p034g.p042j.C0611f;

/* renamed from: androidx.coordinatorlayout.widget.a */
public final class DirectedAcyclicGraph<T> {

    /* renamed from: a */
    private final C0610e<ArrayList<T>> f1940a = new C0611f(10);

    /* renamed from: b */
    private final SimpleArrayMap<T, ArrayList<T>> f1941b = new SimpleArrayMap<>();

    /* renamed from: c */
    private final ArrayList<T> f1942c = new ArrayList<>();

    /* renamed from: d */
    private final HashSet<T> f1943d = new HashSet<>();

    /* renamed from: e */
    private void m1692e(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList arrayList2 = (ArrayList) this.f1941b.get(t);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        m1692e(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    /* renamed from: f */
    private ArrayList<T> m1693f() {
        ArrayList<T> arrayList = (ArrayList) this.f1940a.mo4946b();
        return arrayList == null ? new ArrayList<>() : arrayList;
    }

    /* renamed from: k */
    private void m1694k(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f1940a.mo4945a(arrayList);
    }

    /* renamed from: a */
    public void mo2114a(T t, T t2) {
        if (!this.f1941b.containsKey(t) || !this.f1941b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = (ArrayList) this.f1941b.get(t);
        if (arrayList == null) {
            arrayList = m1693f();
            this.f1941b.put(t, arrayList);
        }
        arrayList.add(t2);
    }

    /* renamed from: b */
    public void mo2115b(T t) {
        if (!this.f1941b.containsKey(t)) {
            this.f1941b.put(t, null);
        }
    }

    /* renamed from: c */
    public void mo2116c() {
        int size = this.f1941b.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.f1941b.mo4513m(i);
            if (arrayList != null) {
                m1694k(arrayList);
            }
        }
        this.f1941b.clear();
    }

    /* renamed from: d */
    public boolean mo2117d(T t) {
        return this.f1941b.containsKey(t);
    }

    /* renamed from: g */
    public List mo2118g(T t) {
        return (List) this.f1941b.get(t);
    }

    /* renamed from: h */
    public List<T> mo2119h(T t) {
        int size = this.f1941b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList arrayList2 = (ArrayList) this.f1941b.mo4513m(i);
            if (arrayList2 != null && arrayList2.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f1941b.mo4508i(i));
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public ArrayList<T> mo2120i() {
        this.f1942c.clear();
        this.f1943d.clear();
        int size = this.f1941b.size();
        for (int i = 0; i < size; i++) {
            m1692e(this.f1941b.mo4508i(i), this.f1942c, this.f1943d);
        }
        return this.f1942c;
    }

    /* renamed from: j */
    public boolean mo2121j(T t) {
        int size = this.f1941b.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.f1941b.mo4513m(i);
            if (arrayList != null && arrayList.contains(t)) {
                return true;
            }
        }
        return false;
    }
}
