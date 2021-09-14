package com.tv91.features.authentication.p202p;

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


/* renamed from: com.tv91.features.authentication.p.z */
abstract class Hilt_ForgetPasswordFragment extends KeyedFragment implements GeneratedComponentManager {

    /* renamed from: d0 */
    private ContextWrapper contextWrapper;

    /* renamed from: e0 */
    private volatile FragmentComponentManager fragmentComponentManager;

    /* renamed from: f0 */
    private final Object object = new Object();

    /* renamed from: g0 */
    private boolean forgetPassword = false;

    Hilt_ForgetPasswordFragment(int i) {
        super(i);
    }

    /* renamed from: o2 */
    private void init() {
        if (this.contextWrapper == null) {
            this.contextWrapper = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            getPasswordState();
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

    @NonNull
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
                    this.fragmentComponentManager = mo16671n2();
                }
            }
        }
        return this.fragmentComponentManager;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n2 */
    public FragmentComponentManager mo16671n2() {
        return new FragmentComponentManager(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p2 */
    public void getPasswordState() {
        if (!this.forgetPassword) {
            this.forgetPassword = true;
            ((ForgetPasswordFragment_GeneratedInjector) generatedComponent()).forgetPassword((ForgetPasswordFragment) UnsafeCasts.unsafeCast(this));
        }
    }
}
