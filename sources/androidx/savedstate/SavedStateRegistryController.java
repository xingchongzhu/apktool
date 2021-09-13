package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.C0378c;

/* renamed from: androidx.savedstate.b */
public final class SavedStateRegistryController {

    /* renamed from: a */
    private final SavedStateRegistryOwner f3168a;

    /* renamed from: b */
    private final SavedStateRegistry f3169b = new SavedStateRegistry();

    private SavedStateRegistryController(SavedStateRegistryOwner cVar) {
        this.f3168a = cVar;
    }

    /* renamed from: a */
    public static SavedStateRegistryController m3996a(SavedStateRegistryOwner cVar) {
        return new SavedStateRegistryController(cVar);
    }

    /* renamed from: b */
    public SavedStateRegistry mo3936b() {
        return this.f3169b;
    }

    /* renamed from: c */
    public void mo3937c(Bundle bundle) {
        Lifecycle b = this.f3168a.mo132b();
        if (b.mo3000b() == C0378c.INITIALIZED) {
            b.mo2999a(new Recreator(this.f3168a));
            this.f3169b.mo3932b(b, bundle);
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    /* renamed from: d */
    public void mo3938d(Bundle bundle) {
        this.f3169b.mo3933c(bundle);
    }
}
