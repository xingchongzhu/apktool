package com.efs.sdk.base.p176a.p177a;

import android.os.Message;
import android.text.TextUtils;
import com.efs.sdk.base.http.AbsHttpListener;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.p176a.p179c.p180a.C1674c;
import com.efs.sdk.base.p176a.p181d.C1682a;
import com.efs.sdk.base.p176a.p183e.C1686b;
import com.efs.sdk.base.p176a.p187h.C1728d;
import com.efs.sdk.base.p176a.p187h.p188a.C1716c;
import com.efs.sdk.base.p176a.p187h.p189b.C1722b;
import com.efs.sdk.base.p176a.p191i.C1738f.C1739a;
import java.util.Map;

/* renamed from: com.efs.sdk.base.a.a.d */
public final class C1656d extends AbsHttpListener {

    /* renamed from: com.efs.sdk.base.a.a.d$a */
    static class C1657a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C1656d f11283a = new C1656d(0);
    }

    /* synthetic */ C1656d(byte b) {
        this();
    }

    /* renamed from: b */
    private static void m14145b(HttpResponse httpResponse) {
        C1739a.f11432a.mo9711a(String.valueOf(httpResponse.getHttpCode()), httpResponse.getBizCode(), httpResponse.getReqUrl());
    }

    /* renamed from: c */
    private static void m14146c(HttpResponse httpResponse) {
        String str = "cver";
        if (((Map) httpResponse.extra).containsKey(str)) {
            String str2 = (String) ((Map) httpResponse.extra).get(str);
            if (!TextUtils.isEmpty(str2)) {
                int parseInt = Integer.parseInt(str2);
                if (parseInt > C1674c.m14183a().f11324d.f11315a) {
                    C1674c.m14183a().mo9640a(parseInt);
                }
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo9619a(C1716c cVar, Object obj) {
        HttpResponse httpResponse = (HttpResponse) obj;
        if (httpResponse != null) {
            C1722b bVar = (C1722b) cVar;
            ((Map) httpResponse.extra).putAll(bVar.f11405f);
            bVar.f11405f.clear();
            C1651a.m14131a();
            C1651a.m14133a(httpResponse);
        }
    }

    public final void onError(HttpResponse httpResponse) {
        m14144a(httpResponse);
        if (httpResponse != null) {
            m14145b(httpResponse);
            m14146c(httpResponse);
        }
    }

    public final void onSuccess(HttpResponse httpResponse) {
        int i;
        String str = "flow_limit";
        if (!((Map) httpResponse.extra).containsKey(str) || !Boolean.FALSE.toString().equals(((Map) httpResponse.extra).get(str))) {
            String str2 = "type";
            String str3 = ((Map) httpResponse.extra).containsKey(str2) ? (String) ((Map) httpResponse.extra).get(str2) : "";
            String str4 = "size";
            if (((Map) httpResponse.extra).containsKey(str4)) {
                String str5 = (String) ((Map) httpResponse.extra).get(str4);
                if (!TextUtils.isEmpty(str5)) {
                    i = Integer.parseInt(str5);
                    C1686b a = C1686b.m14222a();
                    Message obtain = Message.obtain();
                    obtain.what = 0;
                    obtain.obj = str3;
                    obtain.arg1 = i;
                    a.sendMessage(obtain);
                }
            }
            i = 0;
            C1686b a2 = C1686b.m14222a();
            Message obtain2 = Message.obtain();
            obtain2.what = 0;
            obtain2.obj = str3;
            obtain2.arg1 = i;
            a2.sendMessage(obtain2);
        }
        m14145b(httpResponse);
        C1739a.f11432a.f11430c.f11423b.incrementAndGet();
        m14146c(httpResponse);
        m14144a(httpResponse);
    }

    private C1656d() {
    }

    /* renamed from: a */
    public static C1656d m14143a() {
        return C1657a.f11283a;
    }

    /* renamed from: a */
    private static void m14144a(HttpResponse httpResponse) {
        String str;
        if (C1682a.m14214a().f11302f) {
            String str2 = "upload result : ";
            if (httpResponse == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append("false");
                str = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(httpResponse.succ);
                sb2.append(", resp is ");
                sb2.append(httpResponse.toString());
                str = sb2.toString();
            }
            C1728d.m14307a("efs.px.api", str);
        }
    }
}
