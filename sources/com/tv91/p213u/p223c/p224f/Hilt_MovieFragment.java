package com.tv91.p213u.p223c.p224f;

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

/* renamed from: com.tv91.u.c.f.x1 */
abstract class Hilt_MovieFragment extends KeyedFragment implements GeneratedComponentManager {

    /* renamed from: d0 */
    private ContextWrapper f15273d0;

    /* renamed from: e0 */
    private volatile FragmentComponentManager f15274e0;

    /* renamed from: f0 */
    private final Object f15275f0 = new Object();

    /* renamed from: g0 */
    private boolean f15276g0 = false;

    Hilt_MovieFragment(int i) {
        super(i);
    }

    /* renamed from: o2 */
    private void m18950o2() {
        if (this.f15273d0 == null) {
            this.f15273d0 = FragmentComponentManager.m22929b(super.mo2367I(), this);
            mo17709p2();
        }
    }

    /* renamed from: F0 */
    public void mo2359F0(Activity activity) {
        super.mo2359F0(activity);
        ContextWrapper contextWrapper = this.f15273d0;
        C3294c.m22902c(contextWrapper == null || FragmentComponentManager.m22931d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m18950o2();
    }

    /* renamed from: G0 */
    public void mo2362G0(Context context) {
        super.mo2362G0(context);
        m18950o2();
    }

    /* renamed from: I */
    public Context mo2367I() {
        return this.f15273d0;
    }

    /* renamed from: S0 */
    public LayoutInflater mo2395S0(Bundle bundle) {
        return LayoutInflater.from(FragmentComponentManager.m22930c(super.mo2395S0(bundle), this));
    }

    /* renamed from: g */
    public final Object mo16498g() {
        return mo17707m2().mo16498g();
    }

    /* renamed from: m2 */
    public final FragmentComponentManager mo17707m2() {
        if (this.f15274e0 == null) {
            synchronized (this.f15275f0) {
                if (this.f15274e0 == null) {
                    this.f15274e0 = mo17708n2();
                }
            }
        }
        return this.f15274e0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n2 */
    public FragmentComponentManager mo17708n2() {
        return new FragmentComponentManager(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p2 */
    public void mo17709p2() {
        if (!this.f15276g0) {
            this.f15276g0 = true;
            ((MovieFragment_GeneratedInjector) mo16498g()).mo16944p((MovieFragment) UnsafeCasts.m22903a(this));
        }
    }
}
