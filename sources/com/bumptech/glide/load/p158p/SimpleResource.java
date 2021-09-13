package com.bumptech.glide.load.p158p;

import com.bumptech.glide.load.p152n.Resource;
import com.bumptech.glide.p174t.C1638j;

/* renamed from: com.bumptech.glide.load.p.b */
public class SimpleResource<T> implements Resource<T> {

    /* renamed from: a */
    protected final T f10812a;

    public SimpleResource(T t) {
        this.f10812a = C1638j.m14081d(t);
    }

    /* renamed from: a */
    public final T mo9056a() {
        return this.f10812a;
    }

    /* renamed from: c */
    public final int mo9058c() {
        return 1;
    }

    /* renamed from: e */
    public Class<T> mo9060e() {
        return this.f10812a.getClass();
    }

    /* renamed from: f */
    public void mo9061f() {
    }
}
