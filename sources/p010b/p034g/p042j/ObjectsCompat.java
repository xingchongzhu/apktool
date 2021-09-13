package p010b.p034g.p042j;

import android.os.Build.VERSION;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: b.g.j.c */
public class ObjectsCompat {
    /* renamed from: a */
    public static boolean m5175a(Object obj, Object obj2) {
        if (VERSION.SDK_INT >= 19) {
            return Objects.equals(obj, obj2);
        }
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static int m5176b(Object... objArr) {
        if (VERSION.SDK_INT >= 19) {
            return Objects.hash(objArr);
        }
        return Arrays.hashCode(objArr);
    }
}
