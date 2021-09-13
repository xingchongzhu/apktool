package com.bumptech.glide.p169q;

import com.bumptech.glide.load.p152n.DecodePath;
import com.bumptech.glide.load.p152n.LoadPath;
import com.bumptech.glide.load.p158p.p164i.UnitTranscoder;
import com.bumptech.glide.p174t.MultiClassKey;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p010b.p025d.ArrayMap;

/* renamed from: com.bumptech.glide.q.c */
public class LoadPathCache {

    /* renamed from: a */
    private static final LoadPath<?, ?, ?> f11116a;

    /* renamed from: b */
    private final ArrayMap<MultiClassKey, LoadPath<?, ?, ?>> f11117b = new ArrayMap<>();

    /* renamed from: c */
    private final AtomicReference<MultiClassKey> f11118c = new AtomicReference<>();

    static {
        DecodePath iVar = new DecodePath(Object.class, Object.class, Object.class, Collections.emptyList(), new UnitTranscoder(), null);
        LoadPath tVar = new LoadPath(Object.class, Object.class, Object.class, Collections.singletonList(iVar), null);
        f11116a = tVar;
    }

    /* renamed from: b */
    private MultiClassKey m13823b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        MultiClassKey iVar = (MultiClassKey) this.f11118c.getAndSet(null);
        if (iVar == null) {
            iVar = new MultiClassKey();
        }
        iVar.mo9580a(cls, cls2, cls3);
        return iVar;
    }

    /* renamed from: a */
    public <Data, TResource, Transcode> LoadPath<Data, TResource, Transcode> mo9433a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        LoadPath<Data, TResource, Transcode> tVar;
        MultiClassKey b = m13823b(cls, cls2, cls3);
        synchronized (this.f11117b) {
            tVar = (LoadPath) this.f11117b.get(b);
        }
        this.f11118c.set(b);
        return tVar;
    }

    /* renamed from: c */
    public boolean mo9434c(LoadPath<?, ?, ?> tVar) {
        return f11116a.equals(tVar);
    }

    /* renamed from: d */
    public void mo9435d(Class<?> cls, Class<?> cls2, Class<?> cls3, LoadPath<?, ?, ?> tVar) {
        synchronized (this.f11117b) {
            ArrayMap<MultiClassKey, LoadPath<?, ?, ?>> aVar = this.f11117b;
            MultiClassKey iVar = new MultiClassKey(cls, cls2, cls3);
            if (tVar == null) {
                tVar = f11116a;
            }
            aVar.put(iVar, tVar);
        }
    }
}
