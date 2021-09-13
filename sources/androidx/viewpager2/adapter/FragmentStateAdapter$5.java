package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.Lifecycle.C0377b;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

class FragmentStateAdapter$5 implements LifecycleEventObserver {

    /* renamed from: a */
    final /* synthetic */ Handler f3263a;

    /* renamed from: b */
    final /* synthetic */ Runnable f3264b;

    /* renamed from: c */
    public void mo154c(LifecycleOwner iVar, C0377b bVar) {
        if (bVar == C0377b.ON_DESTROY) {
            this.f3263a.removeCallbacks(this.f3264b);
            iVar.mo132b().mo3001c(this);
        }
    }
}
