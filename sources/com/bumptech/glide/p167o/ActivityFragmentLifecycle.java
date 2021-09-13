package com.bumptech.glide.p167o;

import com.bumptech.glide.p174t.C1639k;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.bumptech.glide.o.a */
class ActivityFragmentLifecycle implements C1617l {

    /* renamed from: a */
    private final Set<LifecycleListener> f11074a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private boolean f11075b;

    /* renamed from: c */
    private boolean f11076c;

    ActivityFragmentLifecycle() {
    }

    /* renamed from: a */
    public void mo9367a(LifecycleListener mVar) {
        this.f11074a.add(mVar);
        if (this.f11076c) {
            mVar.mo8743k();
        } else if (this.f11075b) {
            mVar.mo8741b();
        } else {
            mVar.mo8742f();
        }
    }

    /* renamed from: b */
    public void mo9368b(LifecycleListener mVar) {
        this.f11074a.remove(mVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo9369c() {
        this.f11076c = true;
        for (LifecycleListener k : C1639k.m14091i(this.f11074a)) {
            k.mo8743k();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo9370d() {
        this.f11075b = true;
        for (LifecycleListener b : C1639k.m14091i(this.f11074a)) {
            b.mo8741b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo9371e() {
        this.f11075b = false;
        for (LifecycleListener f : C1639k.m14091i(this.f11074a)) {
            f.mo8742f();
        }
    }
}
