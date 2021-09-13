package p067c.p068a.p134b.p136b;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: c.a.b.b.c0 */
public interface Multimap<K, V> {
    /* renamed from: a */
    Map<K, Collection<V>> mo8153a();

    void clear();

    @CanIgnoreReturnValue
    boolean put(@NullableDecl K k, @NullableDecl V v);

    int size();

    Collection<V> values();
}
