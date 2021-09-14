package com.tv91.features.authentication.p201o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.tv91.p252x.KeyedFragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.UnsafeCasts;

/* renamed from: com.tv91.features.authentication.o.m */
abstract class Hilt_RegisterFragment extends KeyedFragment implements GeneratedComponentManager {

    /* renamed from: d0 */
    private ContextWrapper contextWrapper;

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
    private void init() {
        if (this.contextWrapper == null) {
            this.contextWrapper = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            mo16620p2();
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
        if (this.f13727e0 == null) {
            synchronized (this.f13728f0) {
                if (this.f13727e0 == null) {
                    this.f13727e0 = createFragmentComponentManager();
                }
            }
        }
        return this.f13727e0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n2 */
    public FragmentComponentManager createFragmentComponentManager() {
        return new FragmentComponentManager(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p2 */
    public void mo16620p2() {
        if (!this.f13729g0) {
            this.f13729g0 = true;
            ((RegisterFragment_GeneratedInjector) generatedComponent()).mo16634k((RegisterFragment) UnsafeCasts.unsafeCast(this));
        }
    }
}
