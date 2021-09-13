package com.bumptech.glide.load.p152n;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.p174t.C1638j;

/* renamed from: com.bumptech.glide.load.n.p */
class EngineResource<Z> implements Resource<Z> {

    /* renamed from: a */
    private final boolean f10628a;

    /* renamed from: b */
    private final boolean f10629b;

    /* renamed from: c */
    private final Resource<Z> f10630c;

    /* renamed from: d */
    private final C1501a f10631d;

    /* renamed from: e */
    private final Key f10632e;

    /* renamed from: f */
    private int f10633f;

    /* renamed from: g */
    private boolean f10634g;

    /* renamed from: com.bumptech.glide.load.n.p$a */
    /* compiled from: EngineResource */
    interface C1501a {
        /* renamed from: d */
        void mo9021d(Key gVar, EngineResource<?> pVar);
    }

    EngineResource(Resource<Z> vVar, boolean z, boolean z2, Key gVar, C1501a aVar) {
        this.f10630c = (Resource) C1638j.m14081d(vVar);
        this.f10628a = z;
        this.f10629b = z2;
        this.f10632e = gVar;
        this.f10631d = (C1501a) C1638j.m14081d(aVar);
    }

    /* renamed from: a */
    public Z mo9056a() {
        return this.f10630c.mo9056a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized void mo9057b() {
        if (!this.f10634g) {
            this.f10633f++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    /* renamed from: c */
    public int mo9058c() {
        return this.f10630c.mo9058c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public Resource<Z> mo9059d() {
        return this.f10630c;
    }

    /* renamed from: e */
    public Class<Z> mo9060e() {
        return this.f10630c.mo9060e();
    }

    /* renamed from: f */
    public synchronized void mo9061f() {
        if (this.f10633f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.f10634g) {
            this.f10634g = true;
            if (this.f10629b) {
                this.f10630c.mo9061f();
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public boolean mo9062g() {
        return this.f10628a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo9063h() {
        boolean z;
        synchronized (this) {
            int i = this.f10633f;
            if (i > 0) {
                z = true;
                int i2 = i - 1;
                this.f10633f = i2;
                if (i2 != 0) {
                    z = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z) {
            this.f10631d.mo9021d(this.f10632e, this);
        }
    }

    public synchronized String toString() {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append("EngineResource{isMemoryCacheable=");
        sb.append(this.f10628a);
        sb.append(", listener=");
        sb.append(this.f10631d);
        sb.append(", key=");
        sb.append(this.f10632e);
        sb.append(", acquired=");
        sb.append(this.f10633f);
        sb.append(", isRecycled=");
        sb.append(this.f10634g);
        sb.append(", resource=");
        sb.append(this.f10630c);
        sb.append('}');
        return sb.toString();
    }
}
