package com.bumptech.glide.p167o;

import android.util.Log;
import com.bumptech.glide.p170r.Request;
import com.bumptech.glide.p174t.C1639k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.bumptech.glide.o.r */
public class RequestTracker {

    /* renamed from: a */
    private final Set<Request> f11100a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private final List<Request> f11101b = new ArrayList();

    /* renamed from: c */
    private boolean f11102c;

    /* renamed from: a */
    public boolean mo9403a(Request cVar) {
        boolean z = true;
        if (cVar == null) {
            return true;
        }
        boolean remove = this.f11100a.remove(cVar);
        if (!this.f11101b.remove(cVar) && !remove) {
            z = false;
        }
        if (z) {
            cVar.clear();
        }
        return z;
    }

    /* renamed from: b */
    public void mo9404b() {
        for (Request a : C1639k.m14091i(this.f11100a)) {
            mo9403a(a);
        }
        this.f11101b.clear();
    }

    /* renamed from: c */
    public void mo9405c() {
        this.f11102c = true;
        for (Request cVar : C1639k.m14091i(this.f11100a)) {
            if (cVar.isRunning() || cVar.mo9511k()) {
                cVar.clear();
                this.f11101b.add(cVar);
            }
        }
    }

    /* renamed from: d */
    public void mo9406d() {
        this.f11102c = true;
        for (Request cVar : C1639k.m14091i(this.f11100a)) {
            if (cVar.isRunning()) {
                cVar.mo9503d();
                this.f11101b.add(cVar);
            }
        }
    }

    /* renamed from: e */
    public void mo9407e() {
        for (Request cVar : C1639k.m14091i(this.f11100a)) {
            if (!cVar.mo9511k() && !cVar.mo9505f()) {
                cVar.clear();
                if (!this.f11102c) {
                    cVar.mo9508i();
                } else {
                    this.f11101b.add(cVar);
                }
            }
        }
    }

    /* renamed from: f */
    public void mo9408f() {
        this.f11102c = false;
        for (Request cVar : C1639k.m14091i(this.f11100a)) {
            if (!cVar.mo9511k() && !cVar.isRunning()) {
                cVar.mo9508i();
            }
        }
        this.f11101b.clear();
    }

    /* renamed from: g */
    public void mo9409g(Request cVar) {
        this.f11100a.add(cVar);
        if (!this.f11102c) {
            cVar.mo9508i();
            return;
        }
        cVar.clear();
        String str = "RequestTracker";
        if (Log.isLoggable(str, 2)) {
            Log.v(str, "Paused, delaying request");
        }
        this.f11101b.add(cVar);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{numRequests=");
        sb.append(this.f11100a.size());
        sb.append(", isPaused=");
        sb.append(this.f11102c);
        sb.append("}");
        return sb.toString();
    }
}
