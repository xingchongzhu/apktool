package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: androidx.lifecycle.t */
public class ViewModelStore {

    /* renamed from: a */
    private final HashMap<String, ViewModel> f2658a = new HashMap<>();

    /* renamed from: a */
    public final void mo3037a() {
        for (ViewModel a : this.f2658a.values()) {
            a.mo3031a();
        }
        this.f2658a.clear();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final ViewModel mo3038b(String str) {
        return (ViewModel) this.f2658a.get(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Set<String> mo3039c() {
        return new HashSet(this.f2658a.keySet());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo3040d(String str, ViewModel rVar) {
        ViewModel rVar2 = (ViewModel) this.f2658a.put(str, rVar);
        if (rVar2 != null) {
            rVar2.mo2856d();
        }
    }
}
