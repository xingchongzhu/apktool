package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.C0377b;
import androidx.lifecycle.Lifecycle.C0378c;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {

    /* renamed from: a */
    private final Runnable f110a;

    /* renamed from: b */
    final ArrayDeque<OnBackPressedCallback> f111b = new ArrayDeque<>();

    private class LifecycleOnBackPressedCancellable implements LifecycleEventObserver, Cancellable {

        /* renamed from: a */
        private final Lifecycle f112a;

        /* renamed from: b */
        private final OnBackPressedCallback f113b;

        /* renamed from: c */
        private Cancellable f114c;

        LifecycleOnBackPressedCancellable(Lifecycle fVar, OnBackPressedCallback bVar) {
            this.f112a = fVar;
            this.f113b = bVar;
            fVar.mo2999a(this);
        }

        /* renamed from: c */
        public void mo154c(LifecycleOwner iVar, C0377b bVar) {
            if (bVar == C0377b.ON_START) {
                this.f114c = OnBackPressedDispatcher.this.mo160b(this.f113b);
            } else if (bVar == C0377b.ON_STOP) {
                Cancellable aVar = this.f114c;
                if (aVar != null) {
                    aVar.cancel();
                }
            } else if (bVar == C0377b.ON_DESTROY) {
                cancel();
            }
        }

        public void cancel() {
            this.f112a.mo3001c(this);
            this.f113b.mo167e(this);
            Cancellable aVar = this.f114c;
            if (aVar != null) {
                aVar.cancel();
                this.f114c = null;
            }
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    private class C0032a implements Cancellable {

        /* renamed from: a */
        private final OnBackPressedCallback f116a;

        C0032a(OnBackPressedCallback bVar) {
            this.f116a = bVar;
        }

        public void cancel() {
            OnBackPressedDispatcher.this.f111b.remove(this.f116a);
            this.f116a.mo167e(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f110a = runnable;
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: a */
    public void mo159a(LifecycleOwner iVar, OnBackPressedCallback bVar) {
        Lifecycle b = iVar.mo132b();
        if (b.mo3000b() != C0378c.DESTROYED) {
            bVar.mo163a(new LifecycleOnBackPressedCancellable(b, bVar));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Cancellable mo160b(OnBackPressedCallback bVar) {
        this.f111b.add(bVar);
        C0032a aVar = new C0032a(bVar);
        bVar.mo163a(aVar);
        return aVar;
    }

    /* renamed from: c */
    public void mo161c() {
        Iterator descendingIterator = this.f111b.descendingIterator();
        while (descendingIterator.hasNext()) {
            OnBackPressedCallback bVar = (OnBackPressedCallback) descendingIterator.next();
            if (bVar.mo165c()) {
                bVar.mo164b();
                return;
            }
        }
        Runnable runnable = this.f110a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
