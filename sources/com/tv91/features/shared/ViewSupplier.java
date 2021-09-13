package com.tv91.features.shared;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0375c;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle.C0378c;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.tv91.p207q.p208a.C2341f;
import p010b.p018b.p019a.p022c.Function;
import p010b.p034g.p042j.Supplier;

public final class ViewSupplier<V extends C2341f> implements Supplier<V> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Fragment f13960a;

    /* renamed from: b */
    private final Function<View, V> f13961b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public V f13962c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Bundle f13963d = new Bundle();

    private class ViewObserver implements C0375c {
        private ViewObserver() {
        }

        /* renamed from: a */
        public /* synthetic */ void mo2992a(LifecycleOwner iVar) {
            DefaultLifecycleObserver.m2738a(this, iVar);
        }

        /* renamed from: b */
        public void mo2993b(LifecycleOwner iVar) {
            Bundle a = ViewSupplier.this.f13960a.mo134d().mo3931a("key-view-state");
            if (a != null) {
                ViewSupplier.this.f13963d = a;
            }
        }

        /* renamed from: d */
        public void mo2994d(LifecycleOwner iVar) {
            (ViewSupplier.this.f13962c == null ? ViewSupplier.this.mo4947a() : ViewSupplier.this.f13962c).mo16635J(ViewSupplier.this.f13963d);
        }

        /* renamed from: e */
        public void mo2995e(LifecycleOwner iVar) {
            if (ViewSupplier.this.f13962c != null) {
                ViewSupplier.this.f13962c.mo16553h2(ViewSupplier.this.f13963d);
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
        this.f13960a = fragment;
        this.f13961b = aVar;
        m17311h(fragment);
    }

    /* renamed from: h */
    private void m17311h(final Fragment fragment) {
        fragment.mo134d().mo3934d("key-view-state", new C2298e(this));
        fragment.mo132b().mo2999a(new C0375c() {

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
        return this.f13963d;
    }

    /* renamed from: g */
    public V mo4947a() {
        if (this.f13962c == null) {
            if (this.f13960a.mo2454m0().mo132b().mo3000b().mo3003a(C0378c.INITIALIZED)) {
                this.f13962c = (C2341f) this.f13961b.apply(this.f13960a.mo2388P1());
            } else {
                throw new IllegalStateException("Cannot get view when Fragment view are destroyed.");
            }
        }
        return this.f13962c;
    }
}
