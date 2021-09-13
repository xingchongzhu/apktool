package p067c.p068a.p134b.p136b;

import java.util.Map.Entry;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p067c.p068a.p134b.p135a.Objects;

/* renamed from: c.a.b.b.e */
abstract class AbstractMapEntry<K, V> implements Entry<K, V> {
    AbstractMapEntry() {
    }

    public boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        if (!Objects.m11640a(getKey(), entry.getKey()) || !Objects.m11640a(getValue(), entry.getValue())) {
            return false;
        }
        return true;
    }

    public abstract K getKey();

    public abstract V getValue();

    public int hashCode() {
        int i;
        Object key = getKey();
        Object value = getValue();
        int i2 = 0;
        if (key == null) {
            i = 0;
        } else {
            i = key.hashCode();
        }
        if (value != null) {
            i2 = value.hashCode();
        }
        return i ^ i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append("=");
        sb.append(getValue());
        return sb.toString();
    }
}
