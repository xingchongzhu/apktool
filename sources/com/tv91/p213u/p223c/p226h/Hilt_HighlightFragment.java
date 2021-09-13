package com.tv91.p213u.p223c.p226h;

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

/* renamed from: com.tv91.u.c.h.v */
abstract class Hilt_HighlightFragment extends KeyedFragment implements GeneratedComponentManager {

    /* renamed from: d0 */
    private ContextWrapper f15386d0;

    /* renamed from: e0 */
    private volatile FragmentComponentManager f15387e0;

    /* renamed from: f0 */
    private final Object f15388f0 = new Object();

    /* renamed from: g0 */
    private boolean f15389g0 = false;

    Hilt_HighlightFragment(int i) {
        super(i);
    }

    /* renamed from: o2 */
    private void m19270o2() {
        if (this.f15386d0 == null) {
            this.f15386d0 = FragmentComponentManager.m22929b(super.mo2367I(), this);
            mo17846p2();
        }
    }

    /* renamed from: F0 */
    public void mo2359F0(Activity activity) {
        super.mo2359F0(activity);
        ContextWrapper contextWrapper = this.f15386d0;
        C3294c.m22902c(contextWrapper == null || FragmentComponentManager.m22931d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m19270o2();
    }

    /* renamed from: G0 */
    public void mo2362G0(Context context) {
        super.mo2362G0(context);
        m19270o2();
    }

    /* renamed from: I */
    public Context mo2367I() {
        return this.f15386d0;
    }

    /* renamed from: S0 */
    public LayoutInflater mo2395S0(Bundle bundle) {
        return LayoutInflater.from(FragmentComponentManager.m22930c(super.mo2395S0(bundle), this));
    }

    /* renamed from: g */
    public final Object mo16498g() {
        return mo17844m2().mo16498g();
    }

    /* renamed from: m2 */
    public final FragmentComponentManager mo17844m2() {
        if (this.f15387e0 == null) {
            synchronized (this.f15388f0) {
                if (this.f15387e0 == null) {
                    this.f15387e0 = mo17845n2();
                }
            }
        }
        return this.f15387e0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n2 */
    public FragmentComponentManager mo17845n2() {
        return new FragmentComponentManager(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p2 */
    public void mo17846p2() {
        if (!this.f15389g0) {
            this.f15389g0 = true;
            ((HighlightFragment_GeneratedInjector) mo16498g()).mo16945q((HighlightFragment) UnsafeCasts.m22903a(this));
        }
    }
}
