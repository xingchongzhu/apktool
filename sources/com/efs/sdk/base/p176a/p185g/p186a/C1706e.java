package com.efs.sdk.base.p176a.p185g.p186a;

import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.p176a.p183e.C1686b;
import com.efs.sdk.base.p176a.p183e.C1691d;
import com.efs.sdk.base.p176a.p184f.C1698b;
import com.efs.sdk.base.p176a.p191i.C1738f.C1739a;

/* renamed from: com.efs.sdk.base.a.g.a.e */
public final class C1706e extends C1702a {
    /* renamed from: a */
    public final void mo9677a(C1698b bVar) {
        HttpResponse httpResponse;
        if (!bVar.f11379b.f11382a) {
            mo9678b(bVar);
            return;
        }
        C1691d a = C1691d.m14231a();
        if (!bVar.f11379b.f11383b || C1686b.m14222a().mo9660a(bVar.f11378a.f11371a, bVar.mo9667a())) {
            C1739a.f11432a.f11430c.mo9704b();
            C1739a.f11432a.f11430c.mo9705c();
            httpResponse = a.f11357b.mo9659a(bVar, false);
        } else {
            httpResponse = new HttpResponse();
            httpResponse.data = "flow_limit";
        }
        bVar.f11379b.f11384c = httpResponse;
        mo9678b(bVar);
    }
}
