package androidx.activity.p005d;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: androidx.activity.d.a */
public final class ContextAwareHelper {

    /* renamed from: a */
    private final Set<OnContextAvailableListener> f120a = new CopyOnWriteArraySet();

    /* renamed from: b */
    private volatile Context f121b;

    /* renamed from: a */
    public void mo169a(OnContextAvailableListener bVar) {
        if (this.f121b != null) {
            bVar.mo172a(this.f121b);
        }
        this.f120a.add(bVar);
    }

    /* renamed from: b */
    public void mo170b() {
        this.f121b = null;
    }

    /* renamed from: c */
    public void mo171c(Context context) {
        this.f121b = context;
        for (OnContextAvailableListener a : this.f120a) {
            a.mo172a(context);
        }
    }
}
