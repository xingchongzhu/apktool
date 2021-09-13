package com.bumptech.glide.load.p158p.p164i;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.load.p.i.f */
public class TranscoderRegistry {

    /* renamed from: a */
    private final List<C1606a<?, ?>> f10980a = new ArrayList();

    /* renamed from: com.bumptech.glide.load.p.i.f$a */
    /* compiled from: TranscoderRegistry */
    private static final class C1606a<Z, R> {

        /* renamed from: a */
        private final Class<Z> f10981a;

        /* renamed from: b */
        private final Class<R> f10982b;

        /* renamed from: c */
        final ResourceTranscoder<Z, R> f10983c;

        C1606a(Class<Z> cls, Class<R> cls2, ResourceTranscoder<Z, R> eVar) {
            this.f10981a = cls;
            this.f10982b = cls2;
            this.f10983c = eVar;
        }

        /* renamed from: a */
        public boolean mo9327a(Class<?> cls, Class<?> cls2) {
            return this.f10981a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f10982b);
        }
    }

    /* renamed from: a */
    public synchronized <Z, R> ResourceTranscoder<Z, R> mo9324a(Class<Z> cls, Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return UnitTranscoder.m13598b();
        }
        for (C1606a aVar : this.f10980a) {
            if (aVar.mo9327a(cls, cls2)) {
                return aVar.f10983c;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No transcoder registered to transcode from ");
        sb.append(cls);
        sb.append(" to ");
        sb.append(cls2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public synchronized <Z, R> List<Class<R>> mo9325b(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (C1606a a : this.f10980a) {
            if (a.mo9327a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public synchronized <Z, R> void mo9326c(Class<Z> cls, Class<R> cls2, ResourceTranscoder<Z, R> eVar) {
        this.f10980a.add(new C1606a(cls, cls2, eVar));
    }
}
