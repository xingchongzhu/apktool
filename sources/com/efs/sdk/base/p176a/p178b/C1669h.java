package com.efs.sdk.base.p176a.p178b;

import com.efs.sdk.base.p176a.p178b.C1658a.C1660b;
import com.efs.sdk.base.p176a.p183e.C1686b;
import com.efs.sdk.base.p176a.p184f.C1698b;
import com.efs.sdk.base.p176a.p187h.C1719b;
import java.io.File;

/* renamed from: com.efs.sdk.base.a.b.h */
public final class C1669h implements C1666f {
    /* renamed from: a */
    public final boolean mo9633a(File file) {
        C1698b b = C1719b.m14281b(file.getName());
        if (b == null) {
            C1660b.f11288a;
            C1658a.m14150b(file);
            return true;
        }
        if ("wa".equals(b.f11378a.f11371a) || C1686b.m14222a().mo9660a(b.f11378a.f11371a, file.length())) {
            return false;
        }
        return true;
    }
}
