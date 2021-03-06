package com.tv91.p213u.p214a.p219q;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.tv91.p213u.p214a.BottomBarFragment;
import com.tv91.p213u.p214a.DashboardView;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.internal.Preconditions;
import dagger.internal.GeneratedComponentManager;
import dagger.internal.UnsafeCasts;

/* renamed from: com.tv91.u.a.q.g */
abstract class Hilt_PromotionFragment<V extends DashboardView> extends BottomBarFragment<V> implements GeneratedComponentManager {

    /* renamed from: g0 */
    private ContextWrapper f14888g0;

    /* renamed from: h0 */
    private volatile FragmentComponentManager f14889h0;

    /* renamed from: i0 */
    private final Object f14890i0 = new Object();

    /* renamed from: j0 */
    private boolean f14891j0 = false;

    Hilt_PromotionFragment(int i) {
        super(i);
    }

    /* renamed from: s2 */
    private void m18167s2() {
        if (this.f14888g0 == null) {
            this.f14888g0 = FragmentComponentManager.m22929b(super.mo2367I(), this);
            mo17285t2();
        }
    }

    /* renamed from: F0 */
    public void mo2359F0(Activity activity) {
        super.mo2359F0(activity);
        ContextWrapper contextWrapper = this.f14888g0;
        Preconditions.checkArgument(contextWrapper == null || FragmentComponentManager.m22931d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m18167s2();
    }

    /* renamed from: G0 */
    public void mo2362G0(Context context) {
        super.mo2362G0(context);
        m18167s2();
    }

    /* renamed from: I */
    public Context mo2367I() {
        return this.f14888g0;
    }

    /* renamed from: S0 */
    public LayoutInflater mo2395S0(Bundle bundle) {
        return LayoutInflater.from(FragmentComponentManager.m22930c(super.mo2395S0(bundle), this));
    }

    /* renamed from: g */
    public final Object mo16498g() {
        return mo17283q2().mo16498g();
    }

    /* renamed from: q2 */
    public final FragmentComponentManager mo17283q2() {
        if (this.f14889h0 == null) {
            synchronized (this.f14890i0) {
                if (this.f14889h0 == null) {
                    this.f14889h0 = mo17284r2();
                }
            }
        }
        return this.f14889h0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r2 */
    public FragmentComponentManager mo17284r2() {
        return new FragmentComponentManager(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t2 */
    public void mo17285t2() {
        if (!this.f14891j0) {
            this.f14891j0 = true;
            ((PromotionFragment_GeneratedInjector) mo16498g()).mo16934c((PromotionFragment) UnsafeCasts.m22903a(this));
        }
    }
}
