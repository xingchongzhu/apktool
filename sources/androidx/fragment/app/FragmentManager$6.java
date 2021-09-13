package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.C0377b;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

class FragmentManager$6 implements LifecycleEventObserver {

    /* renamed from: a */
    final /* synthetic */ String f2220a;

    /* renamed from: b */
    final /* synthetic */ FragmentResultListener f2221b;

    /* renamed from: c */
    final /* synthetic */ Lifecycle f2222c;

    /* renamed from: d */
    final /* synthetic */ FragmentManager f2223d;

    /* renamed from: c */
    public void mo154c(LifecycleOwner iVar, C0377b bVar) {
        if (bVar == C0377b.ON_START) {
            Bundle bundle = (Bundle) this.f2223d.f2423l.get(this.f2220a);
            if (bundle != null) {
                this.f2221b.mo2871a(this.f2220a, bundle);
                this.f2223d.mo2816r(this.f2220a);
            }
        }
        if (bVar == C0377b.ON_DESTROY) {
            this.f2222c.mo3001c(this);
            this.f2223d.f2424m.remove(this.f2220a);
        }
    }
}
