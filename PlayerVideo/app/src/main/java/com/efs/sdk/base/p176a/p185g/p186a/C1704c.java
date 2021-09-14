package com.efs.sdk.base.p176a.p185g.p186a;

import com.efs.sdk.base.Constants;
import com.efs.sdk.base.p176a.p184f.C1697a;
import com.efs.sdk.base.p176a.p184f.C1698b;
import com.efs.sdk.base.p176a.p187h.C1725c;
import com.efs.sdk.base.p176a.p187h.C1728d;

/* renamed from: com.efs.sdk.base.a.g.a.c */
public final class C1704c extends C1702a {
    /* renamed from: c */
    private static boolean m14252c(C1698b bVar) {
        if (!bVar.mo9672b()) {
            C1697a aVar = bVar.f11378a;
            if ((1 != aVar.f11372b || bVar.f11379b.f11382a) && 1 != aVar.f11373c) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo9677a(C1698b bVar) {
        if (m14252c(bVar)) {
            mo9678b(bVar);
            return;
        }
        byte[] a = C1725c.m14298a(bVar.f11380c);
        if (a == null) {
            C1728d.m14308a("efs.base", "gzip error", null);
            mo9678b(bVar);
            return;
        }
        bVar.mo9670a(a);
        bVar.mo9669a(Constants.CP_GZIP);
        mo9678b(bVar);
    }
}
