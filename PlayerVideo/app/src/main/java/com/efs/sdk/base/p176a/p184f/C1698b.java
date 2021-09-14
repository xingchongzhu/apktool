package com.efs.sdk.base.p176a.p184f;

import com.efs.sdk.base.Constants;
import com.efs.sdk.base.p176a.p187h.C1728d;
import com.efs.sdk.base.protocol.ILogProtocol;
import java.io.File;

/* renamed from: com.efs.sdk.base.a.f.b */
public final class C1698b {

    /* renamed from: a */
    public C1697a f11378a;

    /* renamed from: b */
    public com.efs.sdk.base.p176a.p184f.C1699c f11379b = new com.efs.sdk.base.p176a.p184f.C1699c();

    /* renamed from: c */
    public byte[] f11380c;

    /* renamed from: d */
    public File f11381d;

    public C1698b(String str, int b) {
        this.f11378a = new C1697a(str, b);
    }

    /* renamed from: e */
    private void m14238e() {
        C1697a aVar = this.f11378a;
        int i = aVar.f11373c;
        if (i == 0) {
            byte[] bArr = this.f11380c;
            if (bArr != null) {
                aVar.f11376f = (long) bArr.length;
                return;
            }
        }
        if (i == 1 && this.f11381d.exists()) {
            this.f11378a.f11376f = this.f11381d.length();
        }
    }

    /* renamed from: a */
    public final long mo9667a() {
        m14238e();
        return this.f11378a.f11376f;
    }

    /* renamed from: b */
    public final boolean mo9672b() {
        return !Constants.CP_NONE.equals(this.f11378a.f11374d);
    }

    /* renamed from: c */
    public final boolean mo9673c() {
        return 1 != this.f11378a.f11375e;
    }

    /* renamed from: d */
    public final void mo9674d() {
        this.f11379b.f11382a = true;
    }

    /* renamed from: b */
    public final void mo9671b(int i) {
        this.f11378a.f11373c = i;
    }

    /* renamed from: a */
    public final void mo9669a(String str) {
        this.f11378a.f11374d = str;
    }

    /* renamed from: a */
    public final void mo9668a(int i) {
        this.f11378a.f11375e = i;
        m14238e();
    }

    /* renamed from: a */
    public final void mo9670a(byte[] bArr) {
        this.f11380c = bArr;
        m14238e();
    }

    /* renamed from: a */
    public static C1698b m14237a(ILogProtocol iLogProtocol) {
        String str = "efs.base";
        C1698b bVar = null;
        try {
            C1698b bVar2 = new C1698b(iLogProtocol.getLogType(), iLogProtocol.getLogProtocol());
            try {
                int bodyType = iLogProtocol.getBodyType();
                if (bodyType == 0) {
                    bVar2.mo9671b(0);
                    bVar2.mo9670a(iLogProtocol.generate());
                    return bVar2;
                } else if (bodyType != 1) {
                    StringBuilder sb = new StringBuilder("Can not support body type: ");
                    sb.append(iLogProtocol.getBodyType());
                    C1728d.m14308a(str, sb.toString(), null);
                    return bVar2;
                } else {
                    bVar2.mo9671b(1);
                    bVar2.f11381d = new File(iLogProtocol.getFilePath());
                    return bVar2;
                }
            } catch (Exception e) {
                e = e;
                bVar = bVar2;
                C1728d.m14309b(str, "log send error", e);
                return bVar;
            }
        } catch (Exception e) {
            C1728d.m14309b(str, "log send error", e);
            return bVar;
        }
    }
}
