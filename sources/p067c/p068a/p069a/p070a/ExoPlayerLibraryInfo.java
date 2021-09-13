package p067c.p068a.p069a.p070a;

import android.os.Build.VERSION;
import java.util.HashSet;

/* renamed from: c.a.a.a.s0 */
public final class ExoPlayerLibraryInfo {
    @Deprecated

    /* renamed from: a */
    public static final String f8788a;

    /* renamed from: b */
    private static final HashSet<String> f8789b = new HashSet<>();

    /* renamed from: c */
    private static String f8790c = "goog.exo.core";

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("ExoPlayerLib/2.13.3 (Linux; Android ");
        sb.append(VERSION.RELEASE);
        sb.append(") ");
        sb.append("ExoPlayerLib/2.13.3");
        f8788a = sb.toString();
    }

    /* renamed from: a */
    public static synchronized void m10920a(String str) {
        synchronized (ExoPlayerLibraryInfo.class) {
            if (f8789b.add(str)) {
                StringBuilder sb = new StringBuilder();
                sb.append(f8790c);
                sb.append(", ");
                sb.append(str);
                f8790c = sb.toString();
            }
        }
    }

    /* renamed from: b */
    public static synchronized String m10921b() {
        String str;
        synchronized (ExoPlayerLibraryInfo.class) {
            str = f8790c;
        }
        return str;
    }
}
