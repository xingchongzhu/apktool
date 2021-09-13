package p271e.p272f0.p275g;

import java.util.List;
import p271e.C3370s;
import p271e.Cookie;
import p271e.CookieJar;
import p271e.HttpUrl;
import p271e.Response;
import p281f.ByteString;

/* renamed from: e.f0.g.e */
public final class HttpHeaders {

    /* renamed from: a */
    private static final ByteString f18180a = ByteString.m23878g("\"\\");

    /* renamed from: b */
    private static final ByteString f18181b = ByteString.m23878g("\t ,=");

    /* renamed from: a */
    public static long m23169a(C3370s sVar) {
        return m23176h(sVar.mo20048c("Content-Length"));
    }

    /* renamed from: b */
    public static long m23170b(Response b0Var) {
        return m23169a(b0Var.mo19665H());
    }

    /* renamed from: c */
    public static boolean m23171c(Response b0Var) {
        if (b0Var.mo19671N().mo20144f().equals("HEAD")) {
            return false;
        }
        int D = b0Var.mo19661D();
        if (((D >= 100 && D < 200) || D == 204 || D == 304) && m23170b(b0Var) == -1) {
            if ("chunked".equalsIgnoreCase(b0Var.mo19663F("Transfer-Encoding"))) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static int m23172d(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            i = (int) parseLong;
            return i;
        } catch (NumberFormatException unused) {
        }
    }

    /* renamed from: e */
    public static void m23173e(CookieJar mVar, HttpUrl tVar, C3370s sVar) {
        if (mVar != CookieJar.f18604a) {
            List f = Cookie.m23557f(tVar, sVar);
            if (!f.isEmpty()) {
                mVar.mo20011b(tVar, f);
            }
        }
    }

    /* renamed from: f */
    public static int m23174f(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    /* renamed from: g */
    public static int m23175g(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != 9) {
                break;
            }
            i++;
        }
        return i;
    }

    /* renamed from: h */
    private static long m23176h(String str) {
        long j = -1;
        if (str == null) {
            return -1;
        }
        try {
            j = Long.parseLong(str);
        } catch (NumberFormatException unused) {
        }
        return j;
    }
}
