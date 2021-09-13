package p271e.p272f0.p275g;

/* renamed from: e.f0.g.f */
public final class HttpMethod {
    /* renamed from: a */
    public static boolean m23177a(String str) {
        return str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE");
    }

    /* renamed from: b */
    public static boolean m23178b(String str) {
        return !str.equals("GET") && !str.equals("HEAD");
    }

    /* renamed from: c */
    public static boolean m23179c(String str) {
        return !str.equals("PROPFIND");
    }

    /* renamed from: d */
    public static boolean m23180d(String str) {
        return str.equals("PROPFIND");
    }

    /* renamed from: e */
    public static boolean m23181e(String str) {
        return str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT");
    }
}
