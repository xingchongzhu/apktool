package p271e.p272f0.p275g;

import com.efs.sdk.base.Constants;
import java.io.IOException;
import java.util.List;
import p271e.C3378z;
import p271e.C3378z.C3379a;
import p271e.Cookie;
import p271e.CookieJar;
import p271e.Interceptor;
import p271e.Interceptor.C3373a;
import p271e.MediaType;
import p271e.RequestBody;
import p271e.Response;
import p271e.Response.C3306a;
import p271e.p272f0.C3310c;
import p271e.p272f0.C3313d;
import p281f.GzipSource;
import p281f.Okio;

/* renamed from: e.f0.g.a */
public final class BridgeInterceptor implements Interceptor {

    /* renamed from: a */
    private final CookieJar f18174a;

    public BridgeInterceptor(CookieJar mVar) {
        this.f18174a = mVar;
    }

    /* renamed from: b */
    private String m23156b(List<Cookie> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append("; ");
            }
            Cookie lVar = (Cookie) list.get(i);
            sb.append(lVar.mo20004c());
            sb.append('=');
            sb.append(lVar.mo20008k());
        }
        return sb.toString();
    }

    /* renamed from: a */
    public Response mo18702a(C3373a aVar) throws IOException {
        C3378z S = aVar.mo19799S();
        C3379a g = S.mo20145g();
        RequestBody a = S.mo20139a();
        String str = "Content-Type";
        String str2 = "Content-Length";
        if (a != null) {
            MediaType b = a.mo19656b();
            if (b != null) {
                g.mo20152d(str, b.toString());
            }
            long a2 = a.mo19655a();
            String str3 = "Transfer-Encoding";
            if (a2 != -1) {
                g.mo20152d(str2, Long.toString(a2));
                g.mo20156h(str3);
            } else {
                g.mo20152d(str3, "chunked");
                g.mo20156h(str2);
            }
        }
        String str4 = "Host";
        boolean z = false;
        if (S.mo20141c(str4) == null) {
            g.mo20152d(str4, C3310c.m23064r(S.mo20147i(), false));
        }
        String str5 = "Connection";
        if (S.mo20141c(str5) == null) {
            g.mo20152d(str5, "Keep-Alive");
        }
        String str6 = "Accept-Encoding";
        String c = S.mo20141c(str6);
        String str7 = Constants.CP_GZIP;
        if (c == null && S.mo20141c("Range") == null) {
            z = true;
            g.mo20152d(str6, str7);
        }
        List a3 = this.f18174a.mo20010a(S.mo20147i());
        if (!a3.isEmpty()) {
            g.mo20152d("Cookie", m23156b(a3));
        }
        String str8 = "User-Agent";
        if (S.mo20141c(str8) == null) {
            g.mo20152d(str8, C3313d.m23074a());
        }
        Response d = aVar.mo19803d(g.mo20150b());
        HttpHeaders.m23173e(this.f18174a, S.mo20147i(), d.mo19665H());
        C3306a p = d.mo19668K().mo19688p(S);
        if (z) {
            String str9 = "Content-Encoding";
            if (str7.equalsIgnoreCase(d.mo19663F(str9)) && HttpHeaders.m23171c(d)) {
                GzipSource jVar = new GzipSource(d.mo19659B().mo19692H());
                p.mo19682j(d.mo19665H().mo20051f().mo20061e(str9).mo20061e(str2).mo20060d());
                p.mo19676b(new RealResponseBody(d.mo19663F(str), -1, Okio.m23920c(jVar)));
            }
        }
        return p.mo19677c();
    }
}
