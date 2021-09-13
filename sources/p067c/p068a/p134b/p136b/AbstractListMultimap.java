package p067c.p068a.p134b.p136b;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: c.a.b.b.c */
abstract class AbstractListMultimap<K, V> extends AbstractMapBasedMultimap<K, V> implements ListMultimap<K, V> {
    protected AbstractListMultimap(Map<K, Collection<V>> map) {
        super(map);
    }

    /* renamed from: a */
    public Map<K, Collection<V>> mo8153a() {
        return super.mo8153a();
    }

    public boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    @CanIgnoreReturnValue
    public boolean put(@NullableDecl K k, @NullableDecl V v) {
        return super.put(k, v);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public <E> Collection<E> mo8156u(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public Collection<V> mo8157v(K k, Collection<V> collection) {
        return mo8167w(k, (List) collection, null);
    }
}
