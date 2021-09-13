package com.efs.sdk.base.p176a.p191i;

import com.efs.sdk.base.p176a.p181d.C1682a;

/* renamed from: com.efs.sdk.base.a.i.f */
public final class C1738f {

    /* renamed from: a */
    public C1735c f11428a;

    /* renamed from: b */
    public C1682a f11429b;

    /* renamed from: c */
    public C1736d f11430c;

    /* renamed from: d */
    public C1740g f11431d;

    /* renamed from: com.efs.sdk.base.a.i.f$a */
    public static class C1739a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C1738f f11432a = new C1738f(0);
    }

    /* synthetic */ C1738f(byte b) {
        this();
    }

    /* renamed from: a */
    public final void mo9711a(String str, String str2, String str3) {
        this.f11431d.mo9712a(str, str2, str3);
    }

    private C1738f() {
        this.f11428a = new C1735c();
        this.f11430c = new C1736d();
        this.f11431d = new C1740g();
    }

    /* renamed from: a */
    public final void mo9709a(int i) {
        C1682a aVar = this.f11429b;
        if (aVar != null) {
            aVar.mo9654a(mo9708a("flow_limit", i));
        }
    }

    /* renamed from: a */
    public final void mo9710a(int i, String str) {
        if (this.f11429b != null || C1682a.m14214a().f11300d) {
            C1734b a = mo9708a("flow_limit_type", i);
            a.put("code", str);
            this.f11429b.mo9654a(a);
        }
    }

    /* renamed from: a */
    public final C1734b mo9708a(String str, int i) {
        C1734b bVar = new C1734b("efs_core", str, this.f11428a.f11422c);
        bVar.put("cver", Integer.valueOf(i));
        return bVar;
    }
}
