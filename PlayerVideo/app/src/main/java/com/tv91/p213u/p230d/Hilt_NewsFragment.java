package com.tv91.p213u.p230d;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.UnsafeCasts;
import dagger.internal.Preconditions;

/* renamed from: com.tv91.u.d.c */
abstract class Hilt_NewsFragment extends DialogFragment implements GeneratedComponentManager {

    /* renamed from: t0 */
    private ContextWrapper contextWrapper;

    /* renamed from: u0 */
    private volatile FragmentComponentManager fragmentComponentManager;

    /* renamed from: v0 */
    private final Object object = new Object();

    /* renamed from: w0 */
    private boolean f15551w0 = false;

    Hilt_NewsFragment() {
    }
    /* renamed from: o2 */
    private void init() {
        if (this.contextWrapper == null) {
            this.contextWrapper = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            mo18004D2();
        }
    }

    @Override
    public void onAttach(@NonNull Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.contextWrapper;
        //Preconditions.checkArgument(contextWrapper == null || FragmentComponentManager.m22931d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        init();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        init();
    }

    /* renamed from: I */
    public Context getContextWrapper() {
        return this.contextWrapper;
    }

    @Override
    public LayoutInflater onGetLayoutInflater(@Nullable Bundle savedInstanceState) {
        return LayoutInflater.from(FragmentComponentManager.createContextWrapper(super.onGetLayoutInflater(savedInstanceState), this));
    }

    /* renamed from: g */
    public final Object generatedComponent() {
        return getFragmentComponentManager().generatedComponent();
    }

    /* renamed from: m2 */
    public final FragmentComponentManager getFragmentComponentManager() {
        if (this.fragmentComponentManager == null) {
            synchronized (this.object) {
                if (this.fragmentComponentManager == null) {
                    this.fragmentComponentManager = createFragmentComponentManager();
                }
            }
        }
        return this.fragmentComponentManager;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n2 */
    public FragmentComponentManager createFragmentComponentManager() {
        return new FragmentComponentManager(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D2 */
    public void mo18004D2() {
        if (!this.f15551w0) {
            this.f15551w0 = true;
            ((NewsFragment_GeneratedInjector) generatedComponent()).mo16940i((NewsFragment) UnsafeCasts.unsafeCast(this));
        }
    }
}
