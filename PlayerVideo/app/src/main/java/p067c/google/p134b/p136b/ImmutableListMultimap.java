package p067c.google.p134b.p136b;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map.Entry;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p067c.google.p134b.p136b.ImmutableMap.C1387a;

/* renamed from: c.a.b.b.s */
public class ImmutableListMultimap<K, V> extends ImmutableMultimap<K, V> implements ListMultimap<K, V> {

    /* renamed from: c.a.b.b.s$a */
    /* compiled from: ImmutableListMultimap */
    public static final class C1386a<K, V> extends C1389b<K, V> {
        /* renamed from: e */
        public ImmutableListMultimap<K, V> mo8458e() {
            return (ImmutableListMultimap) super.mo8494a();
        }

        @CanIgnoreReturnValue
        /* renamed from: f */
        public C1386a<K, V> mo8457c(K k, Iterable<? extends V> iterable) {
            super.mo8457c(k, iterable);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: g */
        public C1386a<K, V> mo8460g(K k, V... vArr) {
            super.mo8496d(k, vArr);
            return this;
        }
    }

    ImmutableListMultimap(ImmutableMap<K, ImmutableList<V>> tVar, int i) {
        super(tVar, i);
    }

    /* renamed from: l */
    public static <K, V> C1386a<K, V> m11947l() {
        return new C1386a<>();
    }

    /* renamed from: m */
    static <K, V> ImmutableListMultimap<K, V> m11948m(Collection<? extends Entry<? extends K, ? extends Collection<? extends V>>> collection, @NullableDecl Comparator<? super V> comparator) {
        ImmutableList rVar;
        if (collection.isEmpty()) {
            return m11949o();
        }
        C1387a aVar = new C1387a(collection.size());
        int i = 0;
        for (Entry entry : collection) {
            Object key = entry.getKey();
            Collection collection2 = (Collection) entry.getValue();
            if (comparator == null) {
                rVar = ImmutableList.m11916m(collection2);
            } else {
                rVar = ImmutableList.m11921t(comparator, collection2);
            }
            if (!rVar.isEmpty()) {
                aVar.mo8481c(key, rVar);
                i += rVar.size();
            }
        }
        return new ImmutableListMultimap<>(aVar.mo8480a(), i);
    }

    /* renamed from: o */
    public static <K, V> ImmutableListMultimap<K, V> m11949o() {
        return EmptyImmutableListMultimap.f9867f;
    }

    /* renamed from: n */
    public ImmutableList<V> mo8456n(@NullableDecl K k) {
        ImmutableList<V> rVar = (ImmutableList) this.f9902d.get(k);
        return rVar == null ? ImmutableList.m11917p() : rVar;
    }
}
