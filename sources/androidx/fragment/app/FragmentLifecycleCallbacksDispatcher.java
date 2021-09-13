package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager.C0341l;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.fragment.app.m */
class FragmentLifecycleCallbacksDispatcher {

    /* renamed from: a */
    private final CopyOnWriteArrayList<C0329a> f2392a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    private final FragmentManager f2393b;

    /* renamed from: androidx.fragment.app.m$a */
    /* compiled from: FragmentLifecycleCallbacksDispatcher */
    private static final class C0329a {

        /* renamed from: a */
        final C0341l f2394a;

        /* renamed from: b */
        final boolean f2395b;
    }

    FragmentLifecycleCallbacksDispatcher(FragmentManager nVar) {
        this.f2393b = nVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2729a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment x0 = this.f2393b.mo2826x0();
        if (x0 != null) {
            x0.mo2405W().mo2825w0().mo2729a(fragment, bundle, true);
        }
        Iterator it = this.f2392a.iterator();
        while (it.hasNext()) {
            C0329a aVar = (C0329a) it.next();
            if (z) {
                if (aVar.f2395b) {
                }
            }
            C0341l lVar = aVar.f2394a;
            throw null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2730b(Fragment fragment, boolean z) {
        this.f2393b.mo2822u0().mo2721i();
        Fragment x0 = this.f2393b.mo2826x0();
        if (x0 != null) {
            x0.mo2405W().mo2825w0().mo2730b(fragment, true);
        }
        Iterator it = this.f2392a.iterator();
        while (it.hasNext()) {
            C0329a aVar = (C0329a) it.next();
            if (z) {
                if (aVar.f2395b) {
                }
            }
            C0341l lVar = aVar.f2394a;
            throw null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo2731c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment x0 = this.f2393b.mo2826x0();
        if (x0 != null) {
            x0.mo2405W().mo2825w0().mo2731c(fragment, bundle, true);
        }
        Iterator it = this.f2392a.iterator();
        while (it.hasNext()) {
            C0329a aVar = (C0329a) it.next();
            if (z) {
                if (aVar.f2395b) {
                }
            }
            C0341l lVar = aVar.f2394a;
            throw null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo2732d(Fragment fragment, boolean z) {
        Fragment x0 = this.f2393b.mo2826x0();
        if (x0 != null) {
            x0.mo2405W().mo2825w0().mo2732d(fragment, true);
        }
        Iterator it = this.f2392a.iterator();
        while (it.hasNext()) {
            C0329a aVar = (C0329a) it.next();
            if (z) {
                if (aVar.f2395b) {
                }
            }
            C0341l lVar = aVar.f2394a;
            throw null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo2733e(Fragment fragment, boolean z) {
        Fragment x0 = this.f2393b.mo2826x0();
        if (x0 != null) {
            x0.mo2405W().mo2825w0().mo2733e(fragment, true);
        }
        Iterator it = this.f2392a.iterator();
        while (it.hasNext()) {
            C0329a aVar = (C0329a) it.next();
            if (z) {
                if (aVar.f2395b) {
                }
            }
            C0341l lVar = aVar.f2394a;
            throw null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo2734f(Fragment fragment, boolean z) {
        Fragment x0 = this.f2393b.mo2826x0();
        if (x0 != null) {
            x0.mo2405W().mo2825w0().mo2734f(fragment, true);
        }
        Iterator it = this.f2392a.iterator();
        while (it.hasNext()) {
            C0329a aVar = (C0329a) it.next();
            if (z) {
                if (aVar.f2395b) {
                }
            }
            C0341l lVar = aVar.f2394a;
            throw null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo2735g(Fragment fragment, boolean z) {
        this.f2393b.mo2822u0().mo2721i();
        Fragment x0 = this.f2393b.mo2826x0();
        if (x0 != null) {
            x0.mo2405W().mo2825w0().mo2735g(fragment, true);
        }
        Iterator it = this.f2392a.iterator();
        while (it.hasNext()) {
            C0329a aVar = (C0329a) it.next();
            if (z) {
                if (aVar.f2395b) {
                }
            }
            C0341l lVar = aVar.f2394a;
            throw null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo2736h(Fragment fragment, Bundle bundle, boolean z) {
        Fragment x0 = this.f2393b.mo2826x0();
        if (x0 != null) {
            x0.mo2405W().mo2825w0().mo2736h(fragment, bundle, true);
        }
        Iterator it = this.f2392a.iterator();
        while (it.hasNext()) {
            C0329a aVar = (C0329a) it.next();
            if (z) {
                if (aVar.f2395b) {
                }
            }
            C0341l lVar = aVar.f2394a;
            throw null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo2737i(Fragment fragment, boolean z) {
        Fragment x0 = this.f2393b.mo2826x0();
        if (x0 != null) {
            x0.mo2405W().mo2825w0().mo2737i(fragment, true);
        }
        Iterator it = this.f2392a.iterator();
        while (it.hasNext()) {
            C0329a aVar = (C0329a) it.next();
            if (z) {
                if (aVar.f2395b) {
                }
            }
            C0341l lVar = aVar.f2394a;
            throw null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo2738j(Fragment fragment, Bundle bundle, boolean z) {
        Fragment x0 = this.f2393b.mo2826x0();
        if (x0 != null) {
            x0.mo2405W().mo2825w0().mo2738j(fragment, bundle, true);
        }
        Iterator it = this.f2392a.iterator();
        while (it.hasNext()) {
            C0329a aVar = (C0329a) it.next();
            if (z) {
                if (aVar.f2395b) {
                }
            }
            C0341l lVar = aVar.f2394a;
            throw null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo2739k(Fragment fragment, boolean z) {
        Fragment x0 = this.f2393b.mo2826x0();
        if (x0 != null) {
            x0.mo2405W().mo2825w0().mo2739k(fragment, true);
        }
        Iterator it = this.f2392a.iterator();
        while (it.hasNext()) {
            C0329a aVar = (C0329a) it.next();
            if (z) {
                if (aVar.f2395b) {
                }
            }
            C0341l lVar = aVar.f2394a;
            throw null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo2740l(Fragment fragment, boolean z) {
        Fragment x0 = this.f2393b.mo2826x0();
        if (x0 != null) {
            x0.mo2405W().mo2825w0().mo2740l(fragment, true);
        }
        Iterator it = this.f2392a.iterator();
        while (it.hasNext()) {
            C0329a aVar = (C0329a) it.next();
            if (z) {
                if (aVar.f2395b) {
                }
            }
            C0341l lVar = aVar.f2394a;
            throw null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public void mo2741m(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment x0 = this.f2393b.mo2826x0();
        if (x0 != null) {
            x0.mo2405W().mo2825w0().mo2741m(fragment, view, bundle, true);
        }
        Iterator it = this.f2392a.iterator();
        while (it.hasNext()) {
            C0329a aVar = (C0329a) it.next();
            if (z) {
                if (aVar.f2395b) {
                }
            }
            C0341l lVar = aVar.f2394a;
            throw null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public void mo2742n(Fragment fragment, boolean z) {
        Fragment x0 = this.f2393b.mo2826x0();
        if (x0 != null) {
            x0.mo2405W().mo2825w0().mo2742n(fragment, true);
        }
        Iterator it = this.f2392a.iterator();
        while (it.hasNext()) {
            C0329a aVar = (C0329a) it.next();
            if (z) {
                if (aVar.f2395b) {
                }
            }
            C0341l lVar = aVar.f2394a;
            throw null;
        }
    }
}
