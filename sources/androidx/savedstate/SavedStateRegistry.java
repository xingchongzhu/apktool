package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.C0377b;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Map.Entry;
import p010b.p018b.p019a.p021b.SafeIterableMap;

@SuppressLint({"RestrictedApi"})
public final class SavedStateRegistry {

    /* renamed from: a */
    private SafeIterableMap<String, C0484b> f3162a = new SafeIterableMap<>();

    /* renamed from: b */
    private Bundle f3163b;

    /* renamed from: c */
    private boolean f3164c;

    /* renamed from: d */
    private C0481a f3165d;

    /* renamed from: e */
    boolean f3166e = true;

    /* renamed from: androidx.savedstate.SavedStateRegistry$a */
    public interface C0483a {
        /* renamed from: a */
        void mo2985a(SavedStateRegistryOwner cVar);
    }

    /* renamed from: androidx.savedstate.SavedStateRegistry$b */
    public interface C0484b {
        /* renamed from: a */
        Bundle mo323a();
    }

    SavedStateRegistry() {
    }

    /* renamed from: a */
    public Bundle mo3931a(String str) {
        if (this.f3164c) {
            Bundle bundle = this.f3163b;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            this.f3163b.remove(str);
            if (this.f3163b.isEmpty()) {
                this.f3163b = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo3932b(Lifecycle fVar, Bundle bundle) {
        if (!this.f3164c) {
            if (bundle != null) {
                this.f3163b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            fVar.mo2999a(new LifecycleEventObserver() {
                /* renamed from: c */
                public void mo154c(LifecycleOwner iVar, C0377b bVar) {
                    if (bVar == C0377b.ON_START) {
                        SavedStateRegistry.this.f3166e = true;
                    } else if (bVar == C0377b.ON_STOP) {
                        SavedStateRegistry.this.f3166e = false;
                    }
                }
            });
            this.f3164c = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo3933c(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f3163b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C0538d d = this.f3162a.mo4275d();
        while (d.hasNext()) {
            Entry entry = (Entry) d.next();
            bundle2.putBundle((String) entry.getKey(), ((C0484b) entry.getValue()).mo323a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    /* renamed from: d */
    public void mo3934d(String str, C0484b bVar) {
        if (((C0484b) this.f3162a.mo4271g(str, bVar)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    /* renamed from: e */
    public void mo3935e(Class<? extends C0483a> cls) {
        if (this.f3166e) {
            if (this.f3165d == null) {
                this.f3165d = new C0481a(this);
            }
            try {
                cls.getDeclaredConstructor(new Class[0]);
                this.f3165d.mo3930b(cls.getName());
            } catch (NoSuchMethodException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Class");
                sb.append(cls.getSimpleName());
                sb.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalArgumentException(sb.toString(), e);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }
}
