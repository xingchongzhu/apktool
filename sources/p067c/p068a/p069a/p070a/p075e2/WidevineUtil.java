package p067c.p068a.p069a.p070a.p075e2;

import android.util.Pair;
import java.util.Map;

/* renamed from: c.a.a.a.e2.m0 */
public final class WidevineUtil {
    /* renamed from: a */
    private static long m7075a(Map<String, String> map, String str) {
        if (map != null) {
            try {
                String str2 = (String) map.get(str);
                if (str2 != null) {
                    return Long.parseLong(str2);
                }
            } catch (NumberFormatException unused) {
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: b */
    public static Pair<Long, Long> m7076b(C0896v vVar) {
        Map c = vVar.mo6043c();
        if (c == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(m7075a(c, "LicenseDurationRemaining")), Long.valueOf(m7075a(c, "PlaybackDurationRemaining")));
    }
}
