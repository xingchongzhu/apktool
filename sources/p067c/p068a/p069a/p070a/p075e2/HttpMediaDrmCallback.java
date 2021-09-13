package p067c.p068a.p069a.p070a.p075e2;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.upstream.C1926y.C1928b;
import com.google.android.exoplayer2.upstream.C1926y.C1931e;
import com.google.android.exoplayer2.upstream.DataSourceInputStream;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.DataSpec.C1919b;
import com.google.android.exoplayer2.upstream.StatsDataSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p067c.p068a.p069a.p070a.C;
import p067c.p068a.p069a.p070a.p075e2.ExoMediaDrm.C0865a;
import p067c.p068a.p069a.p070a.p075e2.ExoMediaDrm.C0868d;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Util;
import p067c.p068a.p134b.p136b.ImmutableMap;

/* renamed from: c.a.a.a.e2.g0 */
public final class HttpMediaDrmCallback implements MediaDrmCallback {

    /* renamed from: a */
    private final C1928b f5825a;

    /* renamed from: b */
    private final String f5826b;

    /* renamed from: c */
    private final boolean f5827c;

    /* renamed from: d */
    private final Map<String, String> f5828d;

    public HttpMediaDrmCallback(String str, boolean z, C1928b bVar) {
        Assertions.m10149a(!z || !TextUtils.isEmpty(str));
        this.f5825a = bVar;
        this.f5826b = str;
        this.f5827c = z;
        this.f5828d = new HashMap();
    }

    /* renamed from: c */
    private static byte[] m7066c(C1928b bVar, String str, byte[] bArr, Map<String, String> map) throws MediaDrmCallbackException {
        DataSourceInputStream oVar;
        StatsDataSource d0Var = new StatsDataSource(bVar.mo14939a());
        DataSpec a = new C1919b().mo14960j(str).mo14955e(map).mo14954d(2).mo14953c(bArr).mo14952b(1).mo14951a();
        int i = 0;
        DataSpec pVar = a;
        while (true) {
            try {
                oVar = new DataSourceInputStream(d0Var, pVar);
                byte[] H0 = Util.m10252H0(oVar);
                Util.m10301m(oVar);
                return H0;
            } catch (C1931e e) {
                String d = m7067d(e, i);
                if (d != null) {
                    i++;
                    pVar = pVar.mo14945a().mo14960j(d).mo14951a();
                    Util.m10301m(oVar);
                } else {
                    throw e;
                }
            } catch (Exception e2) {
                MediaDrmCallbackException j0Var = new MediaDrmCallbackException(a, (Uri) Assertions.m10153e(d0Var.mo14915s()), d0Var.mo7016g(), d0Var.mo14914r(), e2);
                throw j0Var;
            } catch (Throwable th) {
                Util.m10301m(oVar);
                throw th;
            }
        }
    }

    /* renamed from: d */
    private static String m7067d(C1931e eVar, int i) {
        int i2 = eVar.f12452c;
        if (!((i2 == 307 || i2 == 308) && i < 5)) {
            return null;
        }
        Map<String, List<String>> map = eVar.f12454e;
        if (map != null) {
            List list = (List) map.get("Location");
            if (list != null && !list.isEmpty()) {
                return (String) list.get(0);
            }
        }
        return null;
    }

    /* renamed from: a */
    public byte[] mo6062a(UUID uuid, C0865a aVar) throws MediaDrmCallbackException {
        String b = aVar.mo6051b();
        if (this.f5827c || TextUtils.isEmpty(b)) {
            b = this.f5826b;
        }
        if (!TextUtils.isEmpty(b)) {
            HashMap hashMap = new HashMap();
            UUID uuid2 = C.f7374e;
            String str = uuid2.equals(uuid) ? "text/xml" : C.f7372c.equals(uuid) ? "application/json" : "application/octet-stream";
            hashMap.put("Content-Type", str);
            if (uuid2.equals(uuid)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (this.f5828d) {
                hashMap.putAll(this.f5828d);
            }
            return m7066c(this.f5825a, b, aVar.mo6050a(), hashMap);
        }
        MediaDrmCallbackException j0Var = new MediaDrmCallbackException(new C1919b().mo14959i(Uri.EMPTY).mo14951a(), Uri.EMPTY, ImmutableMap.m11963j(), 0, new IllegalStateException("No license URL"));
        throw j0Var;
    }

    /* renamed from: b */
    public byte[] mo6063b(UUID uuid, C0868d dVar) throws MediaDrmCallbackException {
        StringBuilder sb = new StringBuilder();
        sb.append(dVar.mo6055b());
        sb.append("&signedRequest=");
        sb.append(Util.m10239B(dVar.mo6054a()));
        return m7066c(this.f5825a, sb.toString(), null, Collections.emptyMap());
    }

    /* renamed from: e */
    public void mo6064e(String str, String str2) {
        Assertions.m10153e(str);
        Assertions.m10153e(str2);
        synchronized (this.f5828d) {
            this.f5828d.put(str, str2);
        }
    }
}
