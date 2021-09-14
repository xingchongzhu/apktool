package p067c.google.p134b.p135a;

import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: c.a.b.a.f */
public final class Objects extends ExtraObjectsMethodsForWeb {
    /* renamed from: a */
    public static boolean m11640a(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static int m11641b(@NullableDecl Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
