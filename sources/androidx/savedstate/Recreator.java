package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle.C0377b;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistry.C0483a;
import androidx.savedstate.SavedStateRegistry.C0484b;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@SuppressLint({"RestrictedApi"})
final class Recreator implements LifecycleEventObserver {

    /* renamed from: a */
    private final SavedStateRegistryOwner f3160a;

    /* renamed from: androidx.savedstate.Recreator$a */
    static final class C0481a implements C0484b {

        /* renamed from: a */
        final Set<String> f3161a = new HashSet();

        C0481a(SavedStateRegistry savedStateRegistry) {
            savedStateRegistry.mo3934d("androidx.savedstate.Restarter", this);
        }

        /* renamed from: a */
        public Bundle mo323a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList(this.f3161a));
            return bundle;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo3930b(String str) {
            this.f3161a.add(str);
        }
    }

    Recreator(SavedStateRegistryOwner cVar) {
        this.f3160a = cVar;
    }

    /* renamed from: f */
    private void m3984f(String str) {
        try {
            Class asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(C0483a.class);
            try {
                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    ((C0483a) declaredConstructor.newInstance(new Object[0])).mo2985a(this.f3160a);
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to instantiate ");
                    sb.append(str);
                    throw new RuntimeException(sb.toString(), e);
                }
            } catch (NoSuchMethodException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Class");
                sb2.append(asSubclass.getSimpleName());
                sb2.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalStateException(sb2.toString(), e2);
            }
        } catch (ClassNotFoundException e3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Class ");
            sb3.append(str);
            sb3.append(" wasn't found");
            throw new RuntimeException(sb3.toString(), e3);
        }
    }

    /* renamed from: c */
    public void mo154c(LifecycleOwner iVar, C0377b bVar) {
        if (bVar == C0377b.ON_CREATE) {
            iVar.mo132b().mo3001c(this);
            Bundle a = this.f3160a.mo134d().mo3931a("androidx.savedstate.Restarter");
            if (a != null) {
                ArrayList stringArrayList = a.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    Iterator it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        m3984f((String) it.next());
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
