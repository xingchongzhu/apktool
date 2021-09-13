package p010b.p061o;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: b.o.a */
public final class Trace {

    /* renamed from: a */
    private static long f4961a;

    /* renamed from: b */
    private static Method f4962b;

    /* renamed from: a */
    public static void m5867a(String str) {
        if (VERSION.SDK_INT >= 18) {
            TraceApi18Impl.m5872a(str);
        }
    }

    /* renamed from: b */
    public static void m5868b() {
        if (VERSION.SDK_INT >= 18) {
            TraceApi18Impl.m5873b();
        }
    }

    /* renamed from: c */
    private static void m5869c(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to call ");
        sb.append(str);
        sb.append(" via reflection");
        Log.v("Trace", sb.toString(), exc);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public static boolean m5870d() {
        try {
            if (f4962b == null) {
                return android.os.Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return m5871e();
    }

    /* renamed from: e */
    private static boolean m5871e() {
        String str = "isTagEnabled";
        if (VERSION.SDK_INT >= 18) {
            try {
                if (f4962b == null) {
                    f4961a = android.os.Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    f4962b = android.os.Trace.class.getMethod(str, new Class[]{Long.TYPE});
                }
                return ((Boolean) f4962b.invoke(null, new Object[]{Long.valueOf(f4961a)})).booleanValue();
            } catch (Exception e) {
                m5869c(str, e);
            }
        }
        return false;
    }
}
