package com.tv91.p213u.p214a;

import android.os.Bundle;
import com.tv91.features.shared.ViewSupplier;
import com.tv91.p213u.p214a.DashboardView;
import com.tv91.p213u.p214a.p215m.ActorFragment.C2367a;
import com.tv91.p213u.p214a.p216n.CategoryFragment.C2386a;
import com.tv91.p213u.p214a.p217o.ChannelFragment.C2402a;
import com.tv91.p213u.p214a.p218p.ProfileFragment.C2429b;
import com.tv91.p213u.p214a.p219q.PromotionFragment.C2437a;
import com.tv91.p252x.FragmentKey;
import com.tv91.p252x.KeyedFragment;
import com.tv91.p252x.NavKey;
import com.tv91.p252x.Navigator;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: com.tv91.u.a.d */
public abstract class BottomBarFragment<V extends DashboardView> extends KeyedFragment {

    /* renamed from: d0 */
    private final Map<Dashboard, FragmentKey> f14728d0 = new EnumMap(Dashboard.class);

    /* renamed from: e0 */
    private Navigator f14729e0;

    /* renamed from: f0 */
    private Dashboard f14730f0;

    public BottomBarFragment() {
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public void m17859m2(Dashboard hVar) {
        Dashboard hVar2 = this.f14730f0;
        if (hVar2 != hVar) {
            Dashboard hVar3 = Dashboard.HOME;
            if (hVar == hVar3) {
                this.f14729e0.mo18587d();
            } else if (hVar2 == hVar3) {
                this.f14729e0.mo18588e((NavKey) this.f14728d0.get(hVar));
            } else {
                this.f14729e0.mo18589h((NavKey) this.f14728d0.get(hVar));
            }
        }
    }

    /* renamed from: J0 */
    public void mo2370J0(Bundle bundle) {
        super.mo2370J0(bundle);
        this.f14729e0 = Navigator.m20631b(this);
        this.f14730f0 = mo17132n2();
        this.f14728d0.put(Dashboard.HOME, new C2402a());
        this.f14728d0.put(Dashboard.CATEGORY, new C2386a());
        this.f14728d0.put(Dashboard.ACTOR, new C2367a());
        this.f14728d0.put(Dashboard.PROMOTION, new C2437a());
        this.f14728d0.put(Dashboard.PROFILE, new C2429b());
    }

    /* renamed from: g1 */
    public void mo2437g1() {
        super.mo2437g1();
        ((DashboardView) mo17133o2().mo4947a()).mo17135t(new C2355a(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: n2 */
    public abstract Dashboard mo17132n2();

    /* access modifiers changed from: protected */
    /* renamed from: o2 */
    public abstract ViewSupplier<V> mo17133o2();

    public BottomBarFragment(int i) {
        super(i);
    }
}
