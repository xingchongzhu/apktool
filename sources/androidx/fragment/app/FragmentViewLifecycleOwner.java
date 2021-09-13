package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.C0377b;
import androidx.lifecycle.Lifecycle.C0378c;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;

/* renamed from: androidx.fragment.app.b0 */
class FragmentViewLifecycleOwner implements SavedStateRegistryOwner, ViewModelStoreOwner {

    /* renamed from: a */
    private final Fragment f2253a;

    /* renamed from: b */
    private final ViewModelStore f2254b;

    /* renamed from: c */
    private LifecycleRegistry f2255c = null;

    /* renamed from: d */
    private SavedStateRegistryController f2256d = null;

    FragmentViewLifecycleOwner(Fragment fragment, ViewModelStore tVar) {
        this.f2253a = fragment;
        this.f2254b = tVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2564a(C0377b bVar) {
        this.f2255c.mo3004h(bVar);
    }

    /* renamed from: b */
    public Lifecycle mo132b() {
        mo2565e();
        return this.f2255c;
    }

    /* renamed from: d */
    public SavedStateRegistry mo134d() {
        mo2565e();
        return this.f2256d.mo3936b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo2565e() {
        if (this.f2255c == null) {
            this.f2255c = new LifecycleRegistry(this);
            this.f2256d = SavedStateRegistryController.m3996a(this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo2566f() {
        return this.f2255c != null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo2567g(Bundle bundle) {
        this.f2256d.mo3937c(bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo2568h(Bundle bundle) {
        this.f2256d.mo3938d(bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo2569i(C0378c cVar) {
        this.f2255c.mo3006o(cVar);
    }

    /* renamed from: p */
    public ViewModelStore mo144p() {
        mo2565e();
        return this.f2254b;
    }
}
