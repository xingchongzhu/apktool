package com.efs.sdk.base.p176a.p191i;

import android.text.TextUtils;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.p176a.p183e.C1690c;
import com.efs.sdk.base.p176a.p184f.C1698b;
import com.efs.sdk.base.p176a.p187h.C1719b;
import com.efs.sdk.base.p176a.p187h.C1728d;
import com.efs.sdk.base.p176a.p187h.p189b.C1724d;
import com.efs.sdk.base.p176a.p187h.p190c.C1727b;
import com.efs.sdk.base.p176a.p191i.C1738f.C1739a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.efs.sdk.base.a.i.e */
public final class C1737e implements C1690c {
    /* renamed from: a */
    private static void m14329a(HttpResponse httpResponse) {
        if (httpResponse != null && !TextUtils.isEmpty(httpResponse.data)) {
            for (String split : httpResponse.data.split("`")) {
                String[] split2 = split.split("=");
                if (split2.length >= 2) {
                    if (split2[0].equalsIgnoreCase("retcode")) {
                        httpResponse.setBizCode(split2[1]);
                    } else {
                        ((Map) httpResponse.extra).put(split2[0], split2[1]);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final HttpResponse mo9659a(C1698b bVar, boolean z) {
        HttpResponse httpResponse = null;
        try {
            C1735c cVar = C1739a.f11432a.f11428a;
            String valueOf = String.valueOf(System.currentTimeMillis());
            StringBuilder sb = new StringBuilder();
            sb.append(cVar.f11421b);
            sb.append(cVar.f11422c);
            sb.append(valueOf);
            sb.append("AppChk#2014");
            String a = C1727b.m14303a(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            String str = cVar.f11420a;
            String str2 = "?chk=";
            if (str.startsWith("http")) {
                sb2.append(str);
                sb2.append(str2);
            } else {
                sb2.append(str);
                sb2.append(str2);
            }
            sb2.append(a.substring(a.length() - 8));
            sb2.append("&vno=");
            sb2.append(valueOf);
            sb2.append("&uuid=");
            sb2.append(cVar.f11422c);
            sb2.append("&app=");
            sb2.append(cVar.f11421b);
            sb2.append("&zip=gzip");
            String sb3 = sb2.toString();
            int i = 0;
            byte[] bArr = new byte[0];
            int i2 = bVar.f11378a.f11373c;
            if (i2 == 0) {
                bArr = bVar.f11380c;
                i = bArr.length;
            } else if (1 == i2) {
                bArr = C1719b.m14280a(bVar.f11381d.getPath());
                i = bArr.length;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("Content-Type", "application/x-www-form-urlencoded");
            hashMap.put("Content-Length", String.valueOf(i));
            C1724d a2 = new C1724d(sb3).mo9696a((Map<String, String>) hashMap);
            a2.f11408a.f11402c = bArr;
            httpResponse = a2.mo9693a().mo9692b();
            m14329a(httpResponse);
            String str3 = "efs.base";
            if (httpResponse.succ) {
                StringBuilder sb4 = new StringBuilder("wa upload succ, ");
                sb4.append(httpResponse.toString());
                C1728d.m14307a(str3, sb4.toString());
                C1719b.m14282b(bVar.f11381d);
                return httpResponse;
            }
            StringBuilder sb5 = new StringBuilder("wa upload fail, resp is ");
            sb5.append(httpResponse.toString());
            C1728d.m14307a(str3, sb5.toString());
            return httpResponse;
        } catch (Throwable th) {
            if (httpResponse == null) {
                httpResponse = new HttpResponse();
            }
            C1728d.m14309b("efs.wa.send", "get file size error", th);
        }
    }
}
