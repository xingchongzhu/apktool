package com.bumptech.glide.p170r.p172k;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.p170r.p172k.C1630b.C1631a;

/* renamed from: com.bumptech.glide.r.k.a */
public class NoTransition<R> implements C1630b<R> {

    /* renamed from: a */
    static final NoTransition<?> f11229a = new NoTransition<>();

    /* renamed from: b */
    private static final TransitionFactory<?> f11230b = new C1629a();

    /* renamed from: com.bumptech.glide.r.k.a$a */
    /* compiled from: NoTransition */
    public static class C1629a<R> implements TransitionFactory<R> {
        /* renamed from: a */
        public C1630b<R> mo9540a(DataSource aVar, boolean z) {
            return NoTransition.f11229a;
        }
    }

    /* renamed from: b */
    public static <R> TransitionFactory<R> m14039b() {
        return f11230b;
    }

    /* renamed from: a */
    public boolean mo9539a(Object obj, C1631a aVar) {
        return false;
    }
}
