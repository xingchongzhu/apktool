package com.tv91.p213u.p244h.p245h;

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

/* renamed from: com.tv91.u.h.h.q */
abstract class Hilt_HistoryFragment extends KeyedFragment implements GeneratedComponentManager {

    /* renamed from: d0 */
    private ContextWrapper f15907d0;

    /* renamed from: e0 */
    private volatile FragmentComponentManager f15908e0;

    /* renamed from: f0 */
    private final Object f15909f0 = new Object();

    /* renamed from: g0 */
    private boolean f15910g0 = false;

    Hilt_HistoryFragment() {
    }

    /* renamed from: o2 */
    private void m20222o2() {
        if (this.f15907d0 == null) {
            this.f15907d0 = FragmentComponentManager.m22929b(super.mo2367I(), this);
            mo18407p2();
        }
    }

    /* renamed from: F0 */
    public void mo2359F0(Activity activity) {
        super.mo2359F0(activity);
        ContextWrapper contextWrapper = this.f15907d0;
        C3294c.m22902c(contextWrapper == null || FragmentComponentManager.m22931d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m20222o2();
    }

    /* renamed from: G0 */
    public void mo2362G0(Context context) {
        super.mo2362G0(context);
        m20222o2();
    }

    /* renamed from: I */
    public Context mo2367I() {
        return this.f15907d0;
    }

    /* renamed from: S0 */
    public LayoutInflater mo2395S0(Bundle bundle) {
        return LayoutInflater.from(FragmentComponentManager.m22930c(super.mo2395S0(bundle), this));
    }

    /* renamed from: g */
    public final Object mo16498g() {
        return mo18405m2().mo16498g();
    }

    /* renamed from: m2 */
    public final FragmentComponentManager mo18405m2() {
        if (this.f15908e0 == null) {
            synchronized (this.f15909f0) {
                if (this.f15908e0 == null) {
                    this.f15908e0 = mo18406n2();
                }
            }
        }
        return this.f15908e0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n2 */
    public FragmentComponentManager mo18406n2() {
        return new FragmentComponentManager(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p2 */
    public void mo18407p2() {
        if (!this.f15910g0) {
            this.f15910g0 = true;
            ((HistoryFragment_GeneratedInjector) mo16498g()).mo16947t((HistoryFragment) UnsafeCasts.m22903a(this));
        }
    }
}
