package com.tv91.p255z.p256g;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import okhttp3.C3378z;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p295h.p296a.Timber;

/* renamed from: com.tv91.z.g.a */
public final class LogInterceptor implements Interceptor {

    /* renamed from: a */
    private long f16186a = 0;

    /* renamed from: c */
    private String m20848c(String str) {
        try {
            if (str.startsWith("{")) {
                str = new JSONObject(str).toString(2);
            } else if (str.startsWith("[")) {
                str = new JSONArray(str).toString(2);
            }
        } catch (JSONException unused) {
        }
        if (str.length() <= 1500) {
            return str;
        }
        int indexOf = str.indexOf("Code");
        if (indexOf <= 0) {
            return str.substring(0, 1000);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, 1000));
        sb.append("...\n");
        sb.append(str.substring(indexOf - 5));
        return sb.toString();
    }

    /* renamed from: a */
    public Response mo18702a(C3373a aVar) throws IOException {
        C3378z S = aVar.mo19799S();
        RequestTag bVar = (RequestTag) S.mo20146h(RequestTag.class);
        if (bVar == null) {
            return aVar.mo19803d(S);
        }
        long nanoTime = System.nanoTime();
        Response d = aVar.mo19803d(S);
        this.f16186a = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
        ResponseBody B = d.mo19659B();
        if (B != null) {
            MediaType D = B.mo19691D();
            String I = B.mo19693I();
            Object[] objArr = new Object[3];
            objArr[0] = Long.valueOf(this.f16186a);
            objArr[1] = m20848c(bVar.f16187a);
            objArr[2] = d.mo19666I() ? m20848c(I) : I;
            Timber.m24039a("Http Report\nExecute time: %d ms\nRequest:\n%s\nResponse:\n%s", objArr);
            return d.mo19668K().mo19676b(ResponseBody.m22990F(D, I)).mo19677c();
        }
        Timber.m24039a("Http Report\nExecute time: %d ms\nRequest:\n%s", Long.valueOf(this.f16186a), m20848c(bVar.f16187a));
        return d;
    }

    /* renamed from: b */
    public long mo18703b() {
        return this.f16186a;
    }
}
