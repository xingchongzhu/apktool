package com.tv91.features.authentication.p201o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.tv91.p252x.KeyedFragment;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import p262d.p263a.p269c.C3294c;
import p262d.p263a.p269c.GeneratedComponentManager;
import p262d.p263a.p269c.UnsafeCasts;

/* renamed from: com.tv91.features.authentication.o.m */
abstract class Hilt_RegisterFragment extends KeyedFragment implements GeneratedComponentManager {

    /* renamed from: d0 */
    private ContextWrapper f13726d0;

    /* renamed from: e0 */
    private volatile FragmentComponentManager f13727e0;

    /* renamed from: f0 */
    private final Object f13728f0 = new Object();

    /* renamed from: g0 */
    private boolean f13729g0 = false;

    Hilt_RegisterFragment(int i) {
        super(i);
    }

    /* renamed from: o2 */
    private void m16916o2() {
        if (this.f13726d0 == null) {
            this.f13726d0 = FragmentComponentManager.m22929b(super.mo2367I(), this);
            mo16620p2();
        }
    }

    /* renamed from: F0 */
    public void mo2359F0(Activity activity) {
        super.mo2359F0(activity);
        ContextWrapper contextWrapper = this.f13726d0;
        C3294c.m22902c(contextWrapper == null || FragmentComponentManager.m22931d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m16916o2();
    }

    /* renamed from: G0 */
    public void mo2362G0(Context context) {
        super.mo2362G0(context);
        m16916o2();
    }

    /* renamed from: I */
    public Context mo2367I() {
        return this.f13726d0;
    }

    /* renamed from: S0 */
    public LayoutInflater mo2395S0(Bundle bundle) {
        return LayoutInflater.from(FragmentComponentManager.m22930c(super.mo2395S0(bundle), this));
    }

    /* renamed from: g */
    public final Object mo16498g() {
        return mo16618m2().mo16498g();
    }

    /* renamed from: m2 */
    public final FragmentComponentManager mo16618m2() {
        if (this.f13727e0 == null) {
            synchronized (this.f13728f0) {
                if (this.f13727e0 == null) {
                    this.f13727e0 = mo16619n2();
                }
            }
        }
        return this.f13727e0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n2 */
    public FragmentComponentManager mo16619n2() {
        return new FragmentComponentManager(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p2 */
    public void mo16620p2() {
        if (!this.f13729g0) {
            this.f13729g0 = true;
            ((RegisterFragment_GeneratedInjector) mo16498g()).mo16634k((RegisterFragment) UnsafeCasts.m22903a(this));
        }
    }
}
