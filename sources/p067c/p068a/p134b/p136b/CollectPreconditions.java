package p067c.p068a.p134b.p136b;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import p067c.p068a.p134b.p135a.C1320g;

/* renamed from: c.a.b.b.i */
final class CollectPreconditions {
    /* renamed from: a */
    static void m11785a(Object obj, Object obj2) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("null key in entry: null=");
            sb.append(obj2);
            throw new NullPointerException(sb.toString());
        } else if (obj2 == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("null value in entry: ");
            sb2.append(obj);
            sb2.append("=null");
            throw new NullPointerException(sb2.toString());
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: b */
    static int m11786b(int i, String str) {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: c */
    static void m11787c(boolean z) {
        C1320g.m11656o(z, "no calls to next() since the last call to remove()");
    }
}
