package p067c.google.p134b.p136b;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import p067c.google.p134b.p135a.C1320g;
import p067c.google.p134b.p135a.C1325k;

/* renamed from: c.a.b.b.e0 */
/* compiled from: MultimapBuilder */
public abstract class C1354e0<K0, V0> {

    /* renamed from: c.a.b.b.e0$a */
    /* compiled from: MultimapBuilder */
    static class C1355a extends C1358d<K0> {

        /* renamed from: a */
        final /* synthetic */ Comparator f9809a;

        C1355a(Comparator comparator) {
            this.f9809a = comparator;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public <K extends K0, V> Map<K, Collection<V>> mo8301c() {
            return new TreeMap(this.f9809a);
        }
    }

    /* renamed from: c.a.b.b.e0$b */
    /* compiled from: MultimapBuilder */
    private static final class C1356b<V> implements C1325k<List<V>>, Serializable {

        /* renamed from: a */
        private final int f9810a;

        C1356b(int i) {
            this.f9810a = CollectPreconditions.m11786b(i, "expectedValuesPerKey");
        }

        /* renamed from: b */
        public List<V> mo5610a() {
            return new ArrayList(this.f9810a);
        }
    }

    /* renamed from: c.a.b.b.e0$c */
    /* compiled from: MultimapBuilder */
    public static abstract class C1357c<K0, V0> extends C1354e0<K0, V0> {
        C1357c() {
            super(null);
        }

        /* renamed from: c */
        public abstract <K extends K0, V extends V0> ListMultimap<K, V> mo8303c();
    }

    /* renamed from: c.a.b.b.e0$d */
    /* compiled from: MultimapBuilder */
    public static abstract class C1358d<K0> {

        /* renamed from: c.a.b.b.e0$d$a */
        /* compiled from: MultimapBuilder */
        class C1359a extends C1357c<K0, Object> {

            /* renamed from: a */
            final /* synthetic */ int f9811a;

            C1359a(int i) {
                this.f9811a = i;
            }

            /* renamed from: c */
            public <K extends K0, V> ListMultimap<K, V> mo8303c() {
                return Multimaps.m11777b(C1358d.this.mo8301c(), new C1356b(this.f9811a));
            }
        }

        C1358d() {
        }

        /* renamed from: a */
        public C1357c<K0, Object> mo8304a() {
            return mo8305b(2);
        }

        /* renamed from: b */
        public C1357c<K0, Object> mo8305b(int i) {
            CollectPreconditions.m11786b(i, "expectedValuesPerKey");
            return new C1359a(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public abstract <K extends K0, V> Map<K, Collection<V>> mo8301c();
    }

    /* synthetic */ C1354e0(MultimapBuilder d0Var) {
        this();
    }

    /* renamed from: a */
    public static C1358d<Comparable> m11759a() {
        return m11760b(Ordering.m11795c());
    }

    /* renamed from: b */
    public static <K0> C1358d<K0> m11760b(Comparator<K0> comparator) {
        C1320g.m11650i(comparator);
        return new C1355a(comparator);
    }

    private C1354e0() {
    }
}
