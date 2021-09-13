package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.activity.b */
public abstract class OnBackPressedCallback {

    /* renamed from: a */
    private boolean f118a;

    /* renamed from: b */
    private CopyOnWriteArrayList<Cancellable> f119b = new CopyOnWriteArrayList<>();

    public OnBackPressedCallback(boolean z) {
        this.f118a = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo163a(Cancellable aVar) {
        this.f119b.add(aVar);
    }

    /* renamed from: b */
    public abstract void mo164b();

    /* renamed from: c */
    public final boolean mo165c() {
        return this.f118a;
    }

    /* renamed from: d */
    public final void mo166d() {
        Iterator it = this.f119b.iterator();
        while (it.hasNext()) {
            ((Cancellable) it.next()).cancel();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo167e(Cancellable aVar) {
        this.f119b.remove(aVar);
    }

    /* renamed from: f */
    public final void mo168f(boolean z) {
        this.f118a = z;
    }
}
