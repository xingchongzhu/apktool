package p010b.p034g.p039g;

import android.os.Build.VERSION;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

@Deprecated
/* renamed from: b.g.g.c */
public final class TraceCompat {

    /* renamed from: a */
    private static long f4490a;

    /* renamed from: b */
    private static Method f4491b;

    /* renamed from: c */
    private static Method f4492c;

    /* renamed from: d */
    private static Method f4493d;

    /* renamed from: e */
    private static Method f4494e;

    static {
        Class<String> cls = String.class;
        int i = VERSION.SDK_INT;
        if (i >= 18 && i < 29) {
            try {
                f4490a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls2 = Long.TYPE;
                f4491b = Trace.class.getMethod("isTagEnabled", new Class[]{cls2});
                Class cls3 = Integer.TYPE;
                f4492c = Trace.class.getMethod("asyncTraceBegin", new Class[]{cls2, cls, cls3});
                f4493d = Trace.class.getMethod("asyncTraceEnd", new Class[]{cls2, cls, cls3});
                f4494e = Trace.class.getMethod("traceCounter", new Class[]{cls2, cls, cls3});
            } catch (Exception e) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e);
            }
        }
    }

    /* renamed from: a */
    public static void m5076a(String str) {
        if (VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    /* renamed from: b */
    public static void m5077b() {
        if (VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}
