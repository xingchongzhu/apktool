package com.efs.sdk.base.p176a.p185g.p186a;

import com.efs.sdk.base.p176a.p181d.C1682a;
import com.efs.sdk.base.p176a.p184f.C1697a;
import com.efs.sdk.base.p176a.p184f.C1698b;
import com.efs.sdk.base.p176a.p185g.C1708b;
import com.efs.sdk.base.processor.action.ILogEncryptAction;

/* renamed from: com.efs.sdk.base.a.g.a.d */
public final class C1705d extends C1702a {

    /* renamed from: b */
    private ILogEncryptAction f11387b;

    public C1705d() {
        if (C1682a.m14214a().f11309m == null) {
            this.f11387b = new C1708b();
        } else {
            this.f11387b = C1682a.m14214a().f11309m;
        }
    }

    /* renamed from: c */
    private static boolean m14254c(C1698b bVar) {
        if (!bVar.mo9673c()) {
            if (!"wa".equals(bVar.f11378a.f11371a)) {
                C1697a aVar = bVar.f11378a;
                if ((1 != aVar.f11372b || bVar.f11379b.f11382a) && 1 != aVar.f11373c) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo9677a(C1698b bVar) {
        if (m14254c(bVar)) {
            mo9678b(bVar);
            return;
        }
        byte[] encrypt = this.f11387b.encrypt(C1682a.m14214a().f11298b, bVar.f11380c);
        if (encrypt != null) {
            bVar.mo9670a(encrypt);
            bVar.mo9668a(this.f11387b.getDeVal());
        }
        mo9678b(bVar);
    }
}
