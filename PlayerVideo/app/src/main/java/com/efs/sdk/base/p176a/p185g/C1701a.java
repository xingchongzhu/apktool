package com.efs.sdk.base.p176a.p185g;

import com.efs.sdk.base.p176a.p184f.C1698b;
import com.efs.sdk.base.p176a.p185g.p186a.C1702a;
import com.efs.sdk.base.p176a.p187h.C1728d;

/* renamed from: com.efs.sdk.base.a.g.a */
public abstract class C1701a {

    /* renamed from: a */
    private C1702a f11385a;

    /* renamed from: a */
    public abstract C1702a mo9675a();

    /* renamed from: a */
    public final void mo9676a(C1698b bVar) {
        try {
            if (this.f11385a == null) {
                synchronized (this) {
                    if (this.f11385a == null) {
                        C1702a a = mo9675a();
                        this.f11385a = a;
                        if (a == null) {
                            return;
                        }
                    }
                }
            }
            this.f11385a.mo9677a(bVar);
        } catch (Throwable th) {
            C1728d.m14309b("efs.processor", "log handle error", th);
        }
    }
}
