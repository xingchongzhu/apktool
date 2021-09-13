package com.efs.sdk.base.p176a.p177a;

import android.text.TextUtils;
import com.efs.sdk.base.http.AbsHttpListener;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.p176a.p181d.C1682a;
import com.efs.sdk.base.p176a.p187h.p188a.C1716c;
import com.efs.sdk.base.p176a.p191i.C1734b;
import com.efs.sdk.base.p176a.p191i.C1738f;
import com.efs.sdk.base.p176a.p191i.C1738f.C1739a;
import java.util.Map;

/* renamed from: com.efs.sdk.base.a.a.b */
public final class C1653b extends AbsHttpListener {

    /* renamed from: com.efs.sdk.base.a.a.b$a */
    static class C1654a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C1653b f11270a = new C1653b(0);
    }

    /* synthetic */ C1653b(byte b) {
        this();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9619a(C1716c cVar, Object obj) {
        HttpResponse httpResponse = (HttpResponse) obj;
        if (httpResponse != null) {
            C1651a.m14131a();
            C1651a.m14133a(httpResponse);
        }
    }

    public final void onError(HttpResponse httpResponse) {
        if (httpResponse != null) {
            m14138a(httpResponse);
        }
    }

    public final void onSuccess(HttpResponse httpResponse) {
        m14138a(httpResponse);
        String str = "cver";
        if (((Map) httpResponse.extra).containsKey(str)) {
            String str2 = (String) ((Map) httpResponse.extra).get(str);
            if (!TextUtils.isEmpty(str2)) {
                int parseInt = Integer.parseInt(str2);
                C1738f a = C1739a.f11432a;
                if (a.f11429b != null && C1682a.m14214a().f11300d) {
                    C1734b bVar = new C1734b("efs_core", "config_coverage", a.f11428a.f11422c);
                    bVar.put(str, Integer.valueOf(parseInt));
                    a.f11429b.mo9654a(bVar);
                }
            }
        }
    }

    private C1653b() {
    }

    /* renamed from: a */
    public static C1653b m14137a() {
        return C1654a.f11270a;
    }

    /* renamed from: a */
    private static void m14138a(HttpResponse httpResponse) {
        C1739a.f11432a.mo9711a(String.valueOf(httpResponse.getHttpCode()), httpResponse.getBizCode(), httpResponse.getReqUrl());
    }
}
