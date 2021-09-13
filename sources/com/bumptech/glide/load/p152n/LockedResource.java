package com.bumptech.glide.load.p152n;

import com.bumptech.glide.p174t.C1638j;
import com.bumptech.glide.p174t.p175l.FactoryPools;
import com.bumptech.glide.p174t.p175l.FactoryPools.C1644d;
import com.bumptech.glide.p174t.p175l.FactoryPools.C1646f;
import com.bumptech.glide.p174t.p175l.StateVerifier;
import p010b.p034g.p042j.C0610e;

/* renamed from: com.bumptech.glide.load.n.u */
final class LockedResource<Z> implements Resource<Z>, C1646f {

    /* renamed from: a */
    private static final C0610e<LockedResource<?>> f10650a = FactoryPools.m14109d(20, new C1503a());

    /* renamed from: b */
    private final StateVerifier f10651b = StateVerifier.m14126a();

    /* renamed from: c */
    private Resource<Z> f10652c;

    /* renamed from: d */
    private boolean f10653d;

    /* renamed from: e */
    private boolean f10654e;

    /* renamed from: com.bumptech.glide.load.n.u$a */
    /* compiled from: LockedResource */
    class C1503a implements C1644d<LockedResource<?>> {
        C1503a() {
        }

        /* renamed from: b */
        public LockedResource<?> mo8938a() {
            return new LockedResource<>();
        }
    }

    LockedResource() {
    }

    /* renamed from: b */
    private void m12994b(Resource<Z> vVar) {
        this.f10654e = false;
        this.f10653d = true;
        this.f10652c = vVar;
    }

    /* renamed from: g */
    static <Z> LockedResource<Z> m12995g(Resource<Z> vVar) {
        LockedResource<Z> uVar = (LockedResource) C1638j.m14081d((LockedResource) f10650a.mo4946b());
        uVar.m12994b(vVar);
        return uVar;
    }

    /* renamed from: h */
    private void m12996h() {
        this.f10652c = null;
        f10650a.mo4945a(this);
    }

    /* renamed from: a */
    public Z mo9056a() {
        return this.f10652c.mo9056a();
    }

    /* renamed from: c */
    public int mo9058c() {
        return this.f10652c.mo9058c();
    }

    /* renamed from: d */
    public StateVerifier mo8940d() {
        return this.f10651b;
    }

    /* renamed from: e */
    public Class<Z> mo9060e() {
        return this.f10652c.mo9060e();
    }

    /* renamed from: f */
    public synchronized void mo9061f() {
        this.f10651b.mo9588c();
        this.f10654e = true;
        if (!this.f10653d) {
            this.f10652c.mo9061f();
            m12996h();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public synchronized void mo9085i() {
        this.f10651b.mo9588c();
        if (this.f10653d) {
            this.f10653d = false;
            if (this.f10654e) {
                mo9061f();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }
}
