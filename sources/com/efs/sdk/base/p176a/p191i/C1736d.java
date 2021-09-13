package com.efs.sdk.base.p176a.p191i;

import com.efs.sdk.base.p176a.p181d.C1682a;
import com.efs.sdk.base.p176a.p191i.C1738f.C1739a;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.efs.sdk.base.a.i.d */
public final class C1736d extends C1733a {

    /* renamed from: b */
    public AtomicInteger f11423b = new AtomicInteger(0);

    /* renamed from: c */
    private AtomicInteger f11424c = new AtomicInteger(0);

    /* renamed from: d */
    private AtomicInteger f11425d = new AtomicInteger(0);

    /* renamed from: e */
    private AtomicInteger f11426e = new AtomicInteger(0);

    /* renamed from: f */
    private AtomicInteger f11427f = new AtomicInteger(0);

    /* renamed from: a */
    public final void mo9697a() {
        if (!((this.f11424c.get() == 0 && this.f11425d.get() == 0 && this.f11423b.get() == 0 && this.f11427f.get() == 0 && this.f11426e.get() == 0) || this.f11415a == null || !C1682a.m14214a().f11300d)) {
            C1682a aVar = this.f11415a;
            int i = this.f11424c.get();
            int i2 = this.f11425d.get();
            int i3 = this.f11423b.get();
            int i4 = this.f11427f.get();
            int i5 = this.f11426e.get();
            C1734b bVar = new C1734b("efs_core", "lf_st", C1739a.f11432a.f11428a.f11422c);
            bVar.put("create_cnt", Integer.valueOf(i));
            bVar.put("cache_cnt", Integer.valueOf(i2));
            bVar.put("req_cnt", Integer.valueOf(i3));
            bVar.put("err_cnt", Integer.valueOf(i4));
            bVar.put("expire_cnt", Integer.valueOf(i5));
            this.f11424c.addAndGet(i * -1);
            this.f11425d.addAndGet(i2 * -1);
            this.f11423b.addAndGet(i3 * -1);
            this.f11427f.addAndGet(i4 * -1);
            this.f11426e.addAndGet(i5 * -1);
            aVar.mo9654a(bVar);
        }
    }

    /* renamed from: b */
    public final void mo9704b() {
        this.f11424c.incrementAndGet();
    }

    /* renamed from: c */
    public final void mo9705c() {
        this.f11425d.incrementAndGet();
    }

    /* renamed from: d */
    public final void mo9706d() {
        this.f11426e.incrementAndGet();
    }

    /* renamed from: e */
    public final void mo9707e() {
        this.f11427f.incrementAndGet();
    }
}
