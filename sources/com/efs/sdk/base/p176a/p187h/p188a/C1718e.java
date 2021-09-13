package com.efs.sdk.base.p176a.p187h.p188a;

import com.efs.sdk.base.p176a.p187h.C1728d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.efs.sdk.base.a.h.a.e */
public class C1718e<T> implements Runnable {

    /* renamed from: a */
    private List<C1715b<T>> f11396a = new ArrayList(5);

    /* renamed from: b */
    private C1716c<T> f11397b;

    public C1718e(C1716c<T> cVar) {
        this.f11397b = cVar;
    }

    /* renamed from: a */
    public final void mo9686a(List<C1715b<T>> list) {
        this.f11396a.addAll(list);
    }

    public void run() {
        mo9685a();
    }

    /* renamed from: a */
    public final T mo9685a() {
        T t = null;
        try {
            Iterator it = this.f11396a.iterator();
            while (it.hasNext()) {
                it.next();
            }
            t = this.f11397b.mo9684a();
            for (C1715b a : this.f11396a) {
                a.mo9619a(this.f11397b, t);
            }
            for (C1715b result : this.f11396a) {
                result.result(t);
            }
        } catch (Throwable th) {
            C1728d.m14308a("efs.base", "efs.util.concurrent", th);
            Iterator it2 = this.f11396a.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        return t;
    }
}
