package p067c.p068a.p069a.p070a.p111m2;

import android.text.TextUtils;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;

/* renamed from: c.a.a.a.m2.t */
public final class Log {

    /* renamed from: a */
    private static int f8430a = 0;

    /* renamed from: b */
    private static boolean f8431b = true;

    @Pure
    /* renamed from: a */
    private static String m10379a(String str, Throwable th) {
        String e = m10383e(th);
        if (TextUtils.isEmpty(e)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str2 = "\n  ";
        sb.append(str2);
        sb.append(e.replace("\n", str2));
        sb.append(10);
        return sb.toString();
    }

    @Pure
    /* renamed from: b */
    public static void m10380b(String str, String str2) {
        if (f8430a == 0) {
            android.util.Log.d(str, str2);
        }
    }

    @Pure
    /* renamed from: c */
    public static void m10381c(String str, String str2) {
        if (f8430a <= 3) {
            android.util.Log.e(str, str2);
        }
    }

    @Pure
    /* renamed from: d */
    public static void m10382d(String str, String str2, Throwable th) {
        m10381c(str, m10379a(str2, th));
    }

    @Pure
    /* renamed from: e */
    public static String m10383e(Throwable th) {
        if (th == null) {
            return null;
        }
        if (m10385g(th)) {
            return "UnknownHostException (no network)";
        }
        if (!f8431b) {
            return th.getMessage();
        }
        return android.util.Log.getStackTraceString(th).trim().replace("\t", "    ");
    }

    @Pure
    /* renamed from: f */
    public static void m10384f(String str, String str2) {
        if (f8430a <= 1) {
            android.util.Log.i(str, str2);
        }
    }

    @Pure
    /* renamed from: g */
    private static boolean m10385g(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    @Pure
    /* renamed from: h */
    public static void m10386h(String str, String str2) {
        if (f8430a <= 2) {
            android.util.Log.w(str, str2);
        }
    }

    @Pure
    /* renamed from: i */
    public static void m10387i(String str, String str2, Throwable th) {
        m10386h(str, m10379a(str2, th));
    }
}
