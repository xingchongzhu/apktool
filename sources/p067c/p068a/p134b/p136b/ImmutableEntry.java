package p067c.p068a.p134b.p136b;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: c.a.b.b.q */
class ImmutableEntry<K, V> extends AbstractMapEntry<K, V> implements Serializable {
    @NullableDecl

    /* renamed from: a */
    final K f9880a;
    @NullableDecl

    /* renamed from: b */
    final V f9881b;

    ImmutableEntry(@NullableDecl K k, @NullableDecl V v) {
        this.f9880a = k;
        this.f9881b = v;
    }

    @NullableDecl
    public final K getKey() {
        return this.f9880a;
    }

    @NullableDecl
    public final V getValue() {
        return this.f9881b;
    }

    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
