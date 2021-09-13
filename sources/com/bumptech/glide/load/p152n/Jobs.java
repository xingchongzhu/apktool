package com.bumptech.glide.load.p152n;

import com.bumptech.glide.load.Key;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.n.s */
final class Jobs {

    /* renamed from: a */
    private final Map<Key, EngineJob<?>> f10644a = new HashMap();

    /* renamed from: b */
    private final Map<Key, EngineJob<?>> f10645b = new HashMap();

    Jobs() {
    }

    /* renamed from: b */
    private Map<Key, EngineJob<?>> m12988b(boolean z) {
        return z ? this.f10645b : this.f10644a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public EngineJob<?> mo9080a(Key gVar, boolean z) {
        return (EngineJob) m12988b(z).get(gVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo9081c(Key gVar, EngineJob<?> lVar) {
        m12988b(lVar.mo9038p()).put(gVar, lVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo9082d(Key gVar, EngineJob<?> lVar) {
        Map b = m12988b(lVar.mo9038p());
        if (lVar.equals(b.get(gVar))) {
            b.remove(gVar);
        }
    }
}
