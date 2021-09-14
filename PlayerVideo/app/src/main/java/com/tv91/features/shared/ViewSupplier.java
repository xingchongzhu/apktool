package com.tv91.features.shared;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.tv91.p207q.p208a.C2341f;

import java.util.function.Function;
import java.util.function.Supplier;

public final class ViewSupplier<V extends C2341f> implements Supplier<V> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Fragment fragment;

    /* renamed from: b */
    private final Function<View, V> function;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public V f13962c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Bundle bundle = new Bundle();


    private class ViewObserver implements FullLifecycleObserver {
        private ViewObserver() {
        }

        /* renamed from: a */
        public /* synthetic */ void mo2992a(LifecycleOwner iVar) {
            DefaultLifecycleObserver.m2738a(this, iVar);
        }

        /* renamed from: b */
        public void mo2993b(LifecycleOwner iVar) {
            Bundle a = ViewSupplier.this.fragment.getArguments().getBundle("key-view-state");
            if (a != null) {
                ViewSupplier.this.bundle = a;
            }
        }

        /* renamed from: d */
        public void mo2994d(LifecycleOwner iVar) {
            (ViewSupplier.this.f13962c == null ? ViewSupplier.this.mo4947a() : ViewSupplier.this.f13962c).mo16635J(ViewSupplier.this.bundle);
        }

        /* renamed from: e */
        public void mo2995e(LifecycleOwner iVar) {
            if (ViewSupplier.this.f13962c != null) {
                ViewSupplier.this.f13962c.mo16553h2(ViewSupplier.this.bundle);
                ViewSupplier.this.f13962c = null;
            }
        }

        public /* synthetic */ void onPause(LifecycleOwner iVar) {
            DefaultLifecycleObserver.m2739b(this, iVar);
        }

        public /* synthetic */ void onResume(LifecycleOwner iVar) {
            DefaultLifecycleObserver.m2740c(this, iVar);
        }
    }

    public ViewSupplier(Fragment fragment, Function<View, V> aVar) {
        this.fragment = fragment;
        this.function = aVar;
        m17311h(fragment);
    }

    /* renamed from: h */
    private void m17311h(final Fragment fragment) {
        fragment.getSavedStateRegistry().registerSavedStateProvider("key-view-state", new ViewSupplierSavadStateProvider(this));
        fragment.getLifecycle().addObserver(new FullLifecycleObserver() {

            /* renamed from: a */
            private final Observer<LifecycleOwner> f13964a = new C2297d(this);

            /* access modifiers changed from: private */
            /* renamed from: f */
            public /* synthetic */ void mo16809g(LifecycleOwner iVar) {
                if (iVar != null) {
                    iVar.mo132b().mo2999a(new ViewObserver());
                }
            }

            /* renamed from: a */
            public void mo2992a(LifecycleOwner iVar) {
                fragment.mo2456n0().mo2976i(this.f13964a);
            }

            /* renamed from: b */
            public void mo2993b(LifecycleOwner iVar) {
                fragment.mo2456n0().mo2973f(this.f13964a);
            }

            /* renamed from: d */
            public /* synthetic */ void mo2994d(LifecycleOwner iVar) {
                DefaultLifecycleObserver.m2741d(this, iVar);
            }

            /* renamed from: e */
            public /* synthetic */ void mo2995e(LifecycleOwner iVar) {
                DefaultLifecycleObserver.m2742e(this, iVar);
            }

            public /* synthetic */ void onPause(LifecycleOwner iVar) {
                DefaultLifecycleObserver.m2739b(this, iVar);
            }

            public /* synthetic */ void onResume(LifecycleOwner iVar) {
                DefaultLifecycleObserver.m2740c(this, iVar);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ Bundle mo16808j() {
        return this.bundle;
    }

    /* renamed from: g */
    @Override
    public V get() {
        if (this.f13962c == null) {
            if (this.fragment.mo2454m0().mo132b().mo3000b().mo3003a(C0378c.INITIALIZED)) {
                this.f13962c = (C2341f) this.function.apply(this.fragment.mo2388P1());
            } else {
                throw new IllegalStateException("Cannot get view when Fragment view are destroyed.");
            }
        }
        return this.f13962c;
    }
}
