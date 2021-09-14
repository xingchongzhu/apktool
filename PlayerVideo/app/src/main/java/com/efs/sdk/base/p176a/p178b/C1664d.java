package com.efs.sdk.base.p176a.p178b;

import com.efs.sdk.base.p176a.p181d.C1682a;
import com.efs.sdk.base.p176a.p184f.C1698b;
import com.efs.sdk.base.p176a.p187h.C1713a;
import com.efs.sdk.base.p176a.p187h.C1719b;
import com.efs.sdk.base.p176a.p191i.C1738f.C1739a;
import java.io.File;

/* renamed from: com.efs.sdk.base.a.b.d */
public final class C1664d implements C1665e {
    /* renamed from: a */
    public final void mo9630a(File file) {
        C1719b.m14277a(file, C1713a.m14267f(C1682a.m14214a().f11299c, C1682a.m14214a().f11297a));
    }

    /* renamed from: a */
    public final void mo9631a(String str) {
    }

    /* renamed from: a */
    public final boolean mo9632a(File file, C1698b bVar) {
        if (!file.exists()) {
            return false;
        }
        bVar.f11381d = file;
        bVar.mo9674d();
        bVar.mo9671b(1);
        return true;
    }

    /* renamed from: a */
    public final void mo9629a(C1698b bVar) {
        if (bVar.f11380c != null) {
            C1719b.m14279a(new File(C1713a.m14267f(C1682a.m14214a().f11299c, C1682a.m14214a().f11297a), C1719b.m14274a(bVar)), bVar.f11380c);
            C1739a.f11432a.f11430c.mo9704b();
            C1739a.f11432a.f11430c.mo9705c();
        }
    }
}
