package p271e.p272f0.p274f;

import java.util.LinkedHashSet;
import java.util.Set;
import p271e.Route;

/* renamed from: e.f0.f.d */
public final class RouteDatabase {

    /* renamed from: a */
    private final Set<Route> f18146a = new LinkedHashSet();

    /* renamed from: a */
    public synchronized void mo19764a(Route d0Var) {
        this.f18146a.remove(d0Var);
    }

    /* renamed from: b */
    public synchronized void mo19765b(Route d0Var) {
        this.f18146a.add(d0Var);
    }

    /* renamed from: c */
    public synchronized boolean mo19766c(Route d0Var) {
        return this.f18146a.contains(d0Var);
    }
}
