package com.efs.sdk.base.p176a.p177a;

import android.os.SystemClock;
import android.text.TextUtils;
import com.efs.sdk.base.http.AbsHttpListener;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.p176a.p187h.C1728d;
import com.efs.sdk.base.p176a.p187h.p189b.C1724d;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.efs.sdk.base.a.a.a */
public final class C1651a {

    /* renamed from: b */
    private static volatile long f11267b = -1;

    /* renamed from: a */
    public boolean f11268a;

    /* renamed from: com.efs.sdk.base.a.a.a$a */
    static class C1652a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C1651a f11269a = new C1651a(0);
    }

    /* synthetic */ C1651a(byte b) {
        this();
    }

    /* renamed from: a */
    public static C1651a m14131a() {
        return C1652a.f11269a;
    }

    /* renamed from: b */
    public static long m14134b() {
        if (f11267b == -1) {
            return System.currentTimeMillis();
        }
        return SystemClock.elapsedRealtime() + f11267b;
    }

    private C1651a() {
        this.f11268a = true;
    }

    /* renamed from: a */
    public final HttpResponse mo9618a(String str, C1655c cVar, File file, boolean z) {
        String b = cVar.mo9622b();
        String a = m14132a(str, cVar);
        if (this.f11268a) {
            C1728d.m14307a("efs.px.api", "Upload file, url is ".concat(String.valueOf(a)));
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("wpk-header", b);
        C1724d a2 = new C1724d(a).mo9696a((Map<String, String>) hashMap);
        a2.f11408a.f11403d = file;
        C1724d a3 = a2.mo9695a("type", cVar.f11278h);
        StringBuilder sb = new StringBuilder();
        sb.append(cVar.f11282l);
        String sb2 = sb.toString();
        return a3.mo9695a("size", sb2).mo9695a("flow_limit", Boolean.toString(z)).mo9694a((AbsHttpListener) C1656d.m14143a()).mo9693a().mo9692b();
    }

    /* renamed from: a */
    public static String m14132a(String str, C1655c cVar) {
        byte b = cVar.f11277g;
        String str2 = "/api/v1/raw/upload";
        if (b != 1) {
            if (b == 2) {
                str2 = "/perf_upload";
            } else if (b == 3) {
                str2 = "/api/v1/mix/upload";
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    static void m14133a(HttpResponse httpResponse) {
        String str = "cver";
        if (httpResponse != null && httpResponse.succ && !TextUtils.isEmpty(httpResponse.data)) {
            try {
                JSONObject jSONObject = new JSONObject(httpResponse.data);
                String optString = jSONObject.optString("code", "-1");
                httpResponse.setBizCode(optString);
                if (!"0".equals(optString)) {
                    httpResponse.succ = false;
                }
                if (jSONObject.has(str)) {
                    ((Map) httpResponse.extra).put(str, jSONObject.getString(str));
                }
                long j = jSONObject.getLong("stm") * 1000;
                if (Math.abs(j - m14134b()) > 1500000) {
                    f11267b = j - SystemClock.elapsedRealtime();
                }
            } catch (Throwable th) {
                C1728d.m14309b("efs.px.api", "checkPxReturn error", th);
            }
        }
    }
}
