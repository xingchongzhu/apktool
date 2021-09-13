package com.bumptech.glide.p169q;

import com.bumptech.glide.load.ResourceDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.q.e */
public class ResourceDecoderRegistry {

    /* renamed from: a */
    private final List<String> f11121a = new ArrayList();

    /* renamed from: b */
    private final Map<String, List<C1623a<?, ?>>> f11122b = new HashMap();

    /* renamed from: com.bumptech.glide.q.e$a */
    /* compiled from: ResourceDecoderRegistry */
    private static class C1623a<T, R> {

        /* renamed from: a */
        private final Class<T> f11123a;

        /* renamed from: b */
        final Class<R> f11124b;

        /* renamed from: c */
        final ResourceDecoder<T, R> f11125c;

        public C1623a(Class<T> cls, Class<R> cls2, ResourceDecoder<T, R> kVar) {
            this.f11123a = cls;
            this.f11124b = cls2;
            this.f11125c = kVar;
        }

        /* renamed from: a */
        public boolean mo9442a(Class<?> cls, Class<?> cls2) {
            return this.f11123a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f11124b);
        }
    }

    /* renamed from: c */
    private synchronized List<C1623a<?, ?>> m13829c(String str) {
        List<C1623a<?, ?>> list;
        if (!this.f11121a.contains(str)) {
            this.f11121a.add(str);
        }
        list = (List) this.f11122b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f11122b.put(str, list);
        }
        return list;
    }

    /* renamed from: a */
    public synchronized <T, R> void mo9438a(String str, ResourceDecoder<T, R> kVar, Class<T> cls, Class<R> cls2) {
        m13829c(str).add(new C1623a(cls, cls2, kVar));
    }

    /* renamed from: b */
    public synchronized <T, R> List<ResourceDecoder<T, R>> mo9439b(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f11121a) {
            List<C1623a> list = (List) this.f11122b.get(str);
            if (list != null) {
                for (C1623a aVar : list) {
                    if (aVar.mo9442a(cls, cls2)) {
                        arrayList.add(aVar.f11125c);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public synchronized <T, R> List<Class<R>> mo9440d(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f11121a) {
            List<C1623a> list = (List) this.f11122b.get(str);
            if (list != null) {
                for (C1623a aVar : list) {
                    if (aVar.mo9442a(cls, cls2) && !arrayList.contains(aVar.f11124b)) {
                        arrayList.add(aVar.f11124b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public synchronized void mo9441e(List<String> list) {
        ArrayList<String> arrayList = new ArrayList<>(this.f11121a);
        this.f11121a.clear();
        for (String add : list) {
            this.f11121a.add(add);
        }
        for (String str : arrayList) {
            if (!list.contains(str)) {
                this.f11121a.add(str);
            }
        }
    }
}
