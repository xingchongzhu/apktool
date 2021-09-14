package com.efs.sdk.base.p176a.p183e;

import com.efs.sdk.base.http.AbsHttpListener;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.p176a.p177a.C1651a;
import com.efs.sdk.base.p176a.p177a.C1655c;
import com.efs.sdk.base.p176a.p177a.C1656d;
import com.efs.sdk.base.p176a.p179c.p180a.C1674c;
import com.efs.sdk.base.p176a.p184f.C1697a;
import com.efs.sdk.base.p176a.p184f.C1698b;
import com.efs.sdk.base.p176a.p187h.C1719b;
import com.efs.sdk.base.p176a.p187h.C1728d;
import com.efs.sdk.base.p176a.p187h.p189b.C1722b;
import com.efs.sdk.base.p176a.p187h.p189b.C1724d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.efs.sdk.base.a.e.a */
public final class C1685a implements C1690c {
    /* renamed from: a */
    public final HttpResponse mo9659a(C1698b bVar, boolean z) {
        HttpResponse httpResponse;
        C1655c a = C1655c.m14141a();
        C1697a aVar = bVar.f11378a;
        a.f11274d = aVar.f11374d;
        a.f11275e = aVar.f11375e;
        a.f11277g = aVar.f11372b;
        a.f11278h = aVar.f11371a;
        a.f11282l = bVar.mo9667a();
        String a2 = C1674c.m14183a().mo9639a(false);
        int i = bVar.f11378a.f11373c;
        if (i == 0) {
            C1651a a3 = C1651a.m14131a();
            byte[] bArr = bVar.f11380c;
            boolean z2 = bVar.f11379b.f11383b;
            String b = a.mo9622b();
            String a4 = C1651a.m14132a(a2, a);
            if (a3.f11268a) {
                C1728d.m14307a("efs.px.api", "upload buffer file, url is ".concat(String.valueOf(a4)));
            }
            HashMap hashMap = new HashMap(1);
            hashMap.put("wpk-header", b);
            C1724d a5 = new C1724d(a4).mo9696a((Map<String, String>) hashMap);
            C1722b bVar2 = a5.f11408a;
            bVar2.f11402c = bArr;
            bVar2.f11406g = true;
            C1724d a6 = a5.mo9695a("type", a.f11278h);
            StringBuilder sb = new StringBuilder();
            sb.append(a.f11282l);
            String sb2 = sb.toString();
            httpResponse = a6.mo9695a("size", sb2).mo9695a("flow_limit", Boolean.toString(z2)).mo9694a((AbsHttpListener) C1656d.m14143a()).mo9693a().mo9692b();
        } else if (1 == i) {
            httpResponse = C1651a.m14131a().mo9618a(a2, a, bVar.f11381d, bVar.f11379b.f11383b);
        } else {
            httpResponse = new HttpResponse();
        }
        if (httpResponse.succ && z) {
            C1719b.m14282b(bVar.f11381d);
        }
        return httpResponse;
    }
}
