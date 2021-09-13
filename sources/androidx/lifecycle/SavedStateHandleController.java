package androidx.lifecycle;

import androidx.lifecycle.Lifecycle.C0377b;
import androidx.lifecycle.Lifecycle.C0378c;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistry.C0483a;
import androidx.savedstate.SavedStateRegistryOwner;

final class SavedStateHandleController implements LifecycleEventObserver {

    /* renamed from: a */
    private boolean f2620a;

    /* renamed from: androidx.lifecycle.SavedStateHandleController$a */
    static final class C0372a implements C0483a {
        C0372a() {
        }

        /* renamed from: a */
        public void mo2985a(SavedStateRegistryOwner cVar) {
            if (cVar instanceof ViewModelStoreOwner) {
                ViewModelStore p = ((ViewModelStoreOwner) cVar).mo144p();
                SavedStateRegistry d = cVar.mo134d();
                for (String b : p.mo3039c()) {
                    SavedStateHandleController.m2722f(p.mo3038b(b), d, cVar.mo132b());
                }
                if (!p.mo3039c().isEmpty()) {
                    d.mo3935e(C0372a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

    /* renamed from: f */
    static void m2722f(ViewModel rVar, SavedStateRegistry savedStateRegistry, Lifecycle fVar) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) rVar.mo3032c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.mo2984h()) {
            savedStateHandleController.mo2983g(savedStateRegistry, fVar);
            m2723i(savedStateRegistry, fVar);
        }
    }

    /* renamed from: i */
    private static void m2723i(final SavedStateRegistry savedStateRegistry, final Lifecycle fVar) {
        C0378c b = fVar.mo3000b();
        if (b == C0378c.INITIALIZED || b.mo3003a(C0378c.STARTED)) {
            savedStateRegistry.mo3935e(C0372a.class);
        } else {
            fVar.mo2999a(new LifecycleEventObserver() {
                /* renamed from: c */
                public void mo154c(LifecycleOwner iVar, C0377b bVar) {
                    if (bVar == C0377b.ON_START) {
                        Lifecycle.this.mo3001c(this);
                        savedStateRegistry.mo3935e(C0372a.class);
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public void mo154c(LifecycleOwner iVar, C0377b bVar) {
        if (bVar == C0377b.ON_DESTROY) {
            this.f2620a = false;
            iVar.mo132b().mo3001c(this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo2983g(SavedStateRegistry savedStateRegistry, Lifecycle fVar) {
        if (this.f2620a) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f2620a = true;
        fVar.mo2999a(this);
        throw null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public boolean mo2984h() {
        return this.f2620a;
    }
}
