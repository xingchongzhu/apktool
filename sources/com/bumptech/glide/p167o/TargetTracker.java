package com.bumptech.glide.p167o;

import com.bumptech.glide.p170r.p171j.Target;
import com.bumptech.glide.p174t.C1639k;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.bumptech.glide.o.t */
public final class TargetTracker implements LifecycleListener {

    /* renamed from: a */
    private final Set<Target<?>> f11110a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public void mo8741b() {
        for (Target b : C1639k.m14091i(this.f11110a)) {
            b.mo8741b();
        }
    }

    /* renamed from: f */
    public void mo8742f() {
        for (Target f : C1639k.m14091i(this.f11110a)) {
            f.mo8742f();
        }
    }

    /* renamed from: k */
    public void mo8743k() {
        for (Target k : C1639k.m14091i(this.f11110a)) {
            k.mo8743k();
        }
    }

    /* renamed from: l */
    public void mo9418l() {
        this.f11110a.clear();
    }

    /* renamed from: m */
    public List<Target<?>> mo9419m() {
        return C1639k.m14091i(this.f11110a);
    }

    /* renamed from: n */
    public void mo9420n(Target<?> hVar) {
        this.f11110a.add(hVar);
    }

    /* renamed from: o */
    public void mo9421o(Target<?> hVar) {
        this.f11110a.remove(hVar);
    }
}
