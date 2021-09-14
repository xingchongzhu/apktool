package com.tv91.p213u.p237f.p240e;

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
import dagger.internal.Preconditions;

/* renamed from: com.tv91.u.f.e.n */
abstract class Hilt_SendFeedbackFragment extends KeyedFragment implements GeneratedComponentManager {

    /* renamed from: d0 */
    private ContextWrapper contextWrapper;

    /* renamed from: e0 */
    private volatile FragmentComponentManager fragmentComponentManager;

    /* renamed from: f0 */
    private final Object object = new Object();

    /* renamed from: g0 */
    private boolean f15770g0 = false;

    Hilt_SendFeedbackFragment(int i) {
        super(i);
    }

    /* renamed from: o2 */
    private void init() {
        if (this.contextWrapper == null) {
            this.contextWrapper = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            updateState();
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
    /* renamed from: p2 */
    public void updateState() {
        if (!this.f15770g0) {
            this.f15770g0 = true;
            ((SendFeedbackFragment_GeneratedInjector) generatedComponent()).mo16949v((SendFeedbackFragment) UnsafeCasts.unsafeCast(this));
        }
    }
}
