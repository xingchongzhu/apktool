package p271e.p272f0.p275g;

import java.net.Proxy.Type;
import p271e.C3378z;
import p271e.HttpUrl;

/* renamed from: e.f0.g.i */
public final class RequestLine {
    /* renamed from: a */
    public static String m23196a(C3378z zVar, Type type) {
        StringBuilder sb = new StringBuilder();
        sb.append(zVar.mo20144f());
        sb.append(' ');
        if (m23197b(zVar, type)) {
            sb.append(zVar.mo20147i());
        } else {
            sb.append(m23198c(zVar.mo20147i()));
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }

    /* renamed from: b */
    private static boolean m23197b(C3378z zVar, Type type) {
        return !zVar.mo20143e() && type == Type.HTTP;
    }

    /* renamed from: c */
    public static String m23198c(HttpUrl tVar) {
        String h = tVar.mo20070h();
        String j = tVar.mo20073j();
        if (j == null) {
            return h;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(h);
        sb.append('?');
        sb.append(j);
        return sb.toString();
    }
}
