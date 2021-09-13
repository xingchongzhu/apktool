package p067c.p068a.p069a.p070a.p111m2;

import android.os.Trace;

/* renamed from: c.a.a.a.m2.k0 */
public final class TraceUtil {
    /* renamed from: a */
    public static void m10216a(String str) {
        if (Util.f8398a >= 18) {
            m10217b(str);
        }
    }

    /* renamed from: b */
    private static void m10217b(String str) {
        Trace.beginSection(str);
    }

    /* renamed from: c */
    public static void m10218c() {
        if (Util.f8398a >= 18) {
            m10219d();
        }
    }

    /* renamed from: d */
    private static void m10219d() {
        Trace.endSection();
    }
}
