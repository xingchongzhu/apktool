package p067c.google.p134b.p136b;

import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p067c.google.p134b.p135a.C1320g;

/* renamed from: c.a.b.b.j */
public final class Collections2 {
    /* renamed from: a */
    static StringBuilder m11792a(int i) {
        CollectPreconditions.m11786b(i, "size");
        return new StringBuilder((int) Math.min(((long) i) * 8, 1073741824));
    }

    /* renamed from: b */
    static boolean m11793b(Collection<?> collection, @NullableDecl Object obj) {
        C1320g.m11650i(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
