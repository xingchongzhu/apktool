package com.efs.sdk.base.p176a.p185g;

import com.efs.sdk.base.p176a.p187h.C1728d;
import com.efs.sdk.base.p176a.p187h.p190c.C1726a;
import com.efs.sdk.base.processor.action.ILogEncryptAction;

/* renamed from: com.efs.sdk.base.a.g.b */
public final class C1708b implements ILogEncryptAction {
    public final byte[] decrypt(String str, byte[] bArr) {
        try {
            return C1726a.m14301a(bArr, str);
        } catch (Exception e) {
            C1728d.m14309b("efs.base", "aes decrypt error", e);
            return null;
        }
    }

    public final byte[] encrypt(String str, byte[] bArr) {
        try {
            return C1726a.m14302b(bArr, str);
        } catch (Exception e) {
            C1728d.m14309b("efs.base", "aes encrypt error", e);
            return null;
        }
    }

    public final int getDeVal() {
        return 2;
    }
}
