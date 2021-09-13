package com.tv91.p213u.p230d;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.DialogFragment;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import p262d.p263a.p269c.C3294c;
import p262d.p263a.p269c.GeneratedComponentManager;
import p262d.p263a.p269c.UnsafeCasts;

/* renamed from: com.tv91.u.d.c */
abstract class Hilt_NewsFragment extends DialogFragment implements GeneratedComponentManager {

    /* renamed from: t0 */
    private ContextWrapper f15548t0;

    /* renamed from: u0 */
    private volatile FragmentComponentManager f15549u0;

    /* renamed from: v0 */
    private final Object f15550v0 = new Object();

    /* renamed from: w0 */
    private boolean f15551w0 = false;

    Hilt_NewsFragment() {
    }

    /* renamed from: C2 */
    private void m19545C2() {
        if (this.f15548t0 == null) {
            this.f15548t0 = FragmentComponentManager.m22929b(super.mo2367I(), this);
            mo18004D2();
        }
    }

    /* renamed from: A2 */
    public final FragmentComponentManager mo18002A2() {
        if (this.f15549u0 == null) {
            synchronized (this.f15550v0) {
                if (this.f15549u0 == null) {
                    this.f15549u0 = mo18003B2();
                }
            }
        }
        return this.f15549u0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B2 */
    public FragmentComponentManager mo18003B2() {
        return new FragmentComponentManager(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D2 */
    public void mo18004D2() {
        if (!this.f15551w0) {
            this.f15551w0 = true;
            ((NewsFragment_GeneratedInjector) mo16498g()).mo16940i((NewsFragment) UnsafeCasts.m22903a(this));
        }
    }

    /* renamed from: F0 */
    public void mo2359F0(Activity activity) {
        super.mo2359F0(activity);
        ContextWrapper contextWrapper = this.f15548t0;
        C3294c.m22902c(contextWrapper == null || FragmentComponentManager.m22931d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m19545C2();
    }

    /* renamed from: G0 */
    public void mo2362G0(Context context) {
        super.mo2362G0(context);
        m19545C2();
    }

    /* renamed from: I */
    public Context mo2367I() {
        return this.f15548t0;
    }

    /* renamed from: S0 */
    public LayoutInflater mo2395S0(Bundle bundle) {
        return LayoutInflater.from(FragmentComponentManager.m22930c(super.mo2395S0(bundle), this));
    }

    /* renamed from: g */
    public final Object mo16498g() {
        return mo18002A2().mo16498g();
    }
}
