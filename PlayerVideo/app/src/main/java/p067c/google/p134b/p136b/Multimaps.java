package p067c.google.p134b.p136b;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p067c.google.p134b.p135a.C1320g;
import p067c.google.p134b.p135a.C1325k;

/* renamed from: c.a.b.b.f0 */
public final class Multimaps {

    /* renamed from: c.a.b.b.f0$a */
    /* compiled from: Multimaps */
    private static class C1361a<K, V> extends AbstractListMultimap<K, V> {

        /* renamed from: f */
        transient C1325k<? extends List<V>> f9817f;

        C1361a(Map<K, Collection<V>> map, C1325k<? extends List<V>> kVar) {
            super(map);
            this.f9817f = (C1325k) C1320g.m11650i(kVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public Map<K, Collection<V>> mo8307c() {
            return mo8165q();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public Set<K> mo8308d() {
            return mo8166r();
        }

        /* access modifiers changed from: protected */
        /* renamed from: x */
        public List<V> mo8163o() {
            return (List) this.f9817f.mo5610a();
        }
    }

    /* renamed from: a */
    static boolean m11776a(Multimap<?, ?> c0Var, @NullableDecl Object obj) {
        if (obj == c0Var) {
            return true;
        }
        if (!(obj instanceof Multimap)) {
            return false;
        }
        return c0Var.mo8153a().equals(((Multimap) obj).mo8153a());
    }

    /* renamed from: b */
    public static <K, V> ListMultimap<K, V> m11777b(Map<K, Collection<V>> map, C1325k<? extends List<V>> kVar) {
        return new C1361a(map, kVar);
    }
}
