package com.efs.sdk.base.p176a.p185g.p186a;

import com.efs.sdk.base.p176a.p178b.C1658a;
import com.efs.sdk.base.p176a.p178b.C1658a.C1660b;
import com.efs.sdk.base.p176a.p178b.C1662c;
import com.efs.sdk.base.p176a.p178b.C1665e;
import com.efs.sdk.base.p176a.p179c.p180a.C1674c;
import com.efs.sdk.base.p176a.p181d.C1682a;
import com.efs.sdk.base.p176a.p184f.C1697a;
import com.efs.sdk.base.p176a.p184f.C1698b;
import com.efs.sdk.base.p176a.p191i.C1738f;
import com.efs.sdk.base.p176a.p191i.C1738f.C1739a;

/* renamed from: com.efs.sdk.base.a.g.a.b */
public final class C1703b extends C1702a {
    /* renamed from: a */
    public final void mo9677a(C1698b bVar) {
        if (bVar.f11379b.f11382a) {
            mo9678b(bVar);
            return;
        }
        C1658a a = C1660b.f11288a;
        if ("wa".equals(bVar.f11378a.f11371a) || C1662c.m14156a().f11290a) {
            C1697a aVar = bVar.f11378a;
            if (aVar.f11373c == 0) {
                byte[] bArr = bVar.f11380c;
                if (bArr == null || bArr.length == 0) {
                    return;
                }
            }
            C1665e a2 = a.f11286c.mo9626a(aVar.f11372b);
            if (a2 != null) {
                a2.mo9629a(bVar);
            }
            return;
        }
        if (!a.f11284a) {
            C1738f a3 = C1739a.f11432a;
            int i = C1674c.m14183a().f11324d.f11315a;
            if (a3.f11429b != null || C1682a.m14214a().f11300d) {
                a3.f11429b.mo9654a(a3.mo9708a("disk_limit", i));
            }
        }
        a.f11284a = true;
    }
}
