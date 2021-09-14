package com.efs.sdk.base.p176a.p187h.p189b;

import com.efs.sdk.base.http.AbsHttpListener;
import com.efs.sdk.base.http.HttpEnv;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.p176a.p187h.p188a.C1715b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.efs.sdk.base.a.h.b.d */
public final class C1724d {

    /* renamed from: a */
    public C1722b f11408a;

    /* renamed from: b */
    private List<C1715b<HttpResponse>> f11409b;

    public C1724d(String str) {
        C1722b bVar = new C1722b();
        this.f11408a = bVar;
        bVar.f11400a = str;
    }

    /* renamed from: a */
    public final C1724d mo9696a(Map<String, String> map) {
        this.f11408a.f11401b = map;
        return this;
    }

    /* renamed from: a */
    public final C1724d mo9695a(String str, String str2) {
        C1722b bVar = this.f11408a;
        if (bVar.f11405f == null) {
            bVar.f11405f = new HashMap(5);
        }
        this.f11408a.f11405f.put(str, str2);
        return this;
    }

    /* renamed from: a */
    public final C1724d mo9694a(AbsHttpListener absHttpListener) {
        if (this.f11409b == null) {
            this.f11409b = new ArrayList(5);
        }
        this.f11409b.add(absHttpListener);
        return this;
    }

    /* renamed from: a */
    public final C1723c mo9693a() {
        C1723c cVar = new C1723c(this.f11408a);
        List<C1715b<HttpResponse>> list = this.f11409b;
        if (list != null && list.size() > 0) {
            cVar.mo9686a(this.f11409b);
        }
        List httpListenerList = HttpEnv.getInstance().getHttpListenerList();
        if (httpListenerList != null && httpListenerList.size() > 0) {
            cVar.mo9686a(httpListenerList);
        }
        return cVar;
    }
}
